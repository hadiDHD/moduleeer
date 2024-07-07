package org.module.eer.jenetics.split.ff;

import java.util.Iterator;
import java.util.function.Function;

import org.eclipse.emf.common.util.EList;
import org.module.eer.jenetics.config.utils.ModularizableElementUtils;
import org.module.eer.jenetics.utils.Cohesive;
import org.module.eer.mm.moduleeer.Aggregation;
import org.module.eer.mm.moduleeer.EntityType;
import org.module.eer.mm.moduleeer.Generalization;
import org.module.eer.mm.moduleeer.LinkToEntity;
import org.module.eer.mm.moduleeer.ModularizableElement;
import org.module.eer.mm.moduleeer.RelationshipType;
import org.module.eer.mm.moduleeer.procedure.AccessElement;
import org.module.eer.mm.moduleeer.procedure.Procedure;

import io.jenetics.BitChromosome;
import io.jenetics.EnumGene;
import io.jenetics.Genotype;
import io.jenetics.PermutationChromosome;

@SuppressWarnings("rawtypes")
public class CouplingFF implements Function<Genotype, Double>{
		
	private EList<ModularizableElement> modularizableElements;
	
	public CouplingFF(EList<ModularizableElement> modularizableElements) {
		this.modularizableElements = modularizableElements;
	}
		
	@SuppressWarnings({ "unchecked" })
	@Override
	public Double apply(Genotype genotype) {
		final PermutationChromosome<Integer> pc = (PermutationChromosome<Integer>) genotype.get(0);
		final BitChromosome bc = (BitChromosome) genotype.get(1);
		Cohesive cohesive = new Cohesive();		
		for (int i = 0; i < pc.length(); i++) {
			EnumGene<Integer> enumGene = (EnumGene<Integer>) pc.get(i);
			ModularizableElement element = this.modularizableElements.get(enumGene.alleleIndex());
			craIndex(element, i, pc, bc, cohesive);
		}		
		return (double) cohesive.getCoupling();
	}

	private void craIndex(ModularizableElement element, int position, PermutationChromosome<Integer> pc, BitChromosome bc,
			Cohesive cohesive) {
		//Generalizes
		if (element instanceof EntityType) {
			generalizesCRAIndex((EntityType) element, position, pc, bc, cohesive);
		} 
		//RelationshipType
		else if (element instanceof RelationshipType){		
			relationshipTypeCRAIndex((RelationshipType) element, position, pc, bc, cohesive);	
		}
		//Procedure
		else if (element instanceof Procedure) {
			accessEntityTypeCRAIndex((Procedure) element, position, pc, bc, cohesive);
		}		
	}
	
	private void generalizesCRAIndex(EntityType currentEntityType, Integer position, PermutationChromosome<Integer> pc, BitChromosome bc,
			Cohesive cohesive) {
		Iterator<Generalization> itGeneralizations = currentEntityType.getGeneralizations().iterator();
		while (itGeneralizations.hasNext()) {
			EntityType relatedEntity = itGeneralizations.next().getEntity();
			int entityTypeId = this.modularizableElements.indexOf(relatedEntity);
			entityTypeCRAIndex(entityTypeId, position, pc, bc, cohesive);
		}		
	}
	
	private void relationshipTypeCRAIndex(RelationshipType relationshipType, Integer position, PermutationChromosome<Integer> pc, BitChromosome bc, 
			Cohesive cohesive) {
		//Links to Entities
		for (LinkToEntity linkToEntity : relationshipType.getLinksToEntities()) {
			int entityTypeId = this.modularizableElements.indexOf(linkToEntity.getEntity());
			entityTypeCRAIndex(entityTypeId, position, pc, bc, cohesive);			
		}
		//Associations
		for (LinkToEntity linkToEntity : relationshipType.getAssociations()) {
			int entityTypeId = this.modularizableElements.indexOf(linkToEntity.getEntity());
			entityTypeCRAIndex(entityTypeId, position, pc, bc, cohesive);
		}
		//Agreggations
		for (Aggregation aggregation : relationshipType.getAggregations()) {
			int relationshipTypeId = this.modularizableElements.indexOf(aggregation.getTo());
			entityTypeCRAIndex(relationshipTypeId, position, pc, bc, cohesive);
		}		
		//Generalizes
		for (RelationshipType generalizeType : relationshipType.getGeneralizes()) {
			int relationshipTypeId = this.modularizableElements.indexOf(generalizeType);
			entityTypeCRAIndex(relationshipTypeId, position, pc, bc, cohesive);
		}		
	}
	
	private void accessEntityTypeCRAIndex(Procedure element, Integer position, PermutationChromosome<Integer> pc, BitChromosome bc, 
			Cohesive cohesive) {
		for (AccessElement accessElement : element.getAccessElements()) {
			int elementId = this.modularizableElements.indexOf(accessElement.getEntity());
			entityTypeCRAIndex(elementId, position, pc, bc, cohesive);
		}		
	}
	
	private void entityTypeCRAIndex(int entityTypeId, int position, PermutationChromosome<Integer> pc, BitChromosome bc, 
			Cohesive cohesive) {
		//Forward Search
		boolean search = ModularizableElementUtils.belongsToTheSameModule(entityTypeId, position, pc, bc);
		if (search == true)
			cohesive.incrementCohesion(); //Cohesion
		else { 			
			cohesive.incrementCoupling(); //Cohesion
		}		
	}		
}
