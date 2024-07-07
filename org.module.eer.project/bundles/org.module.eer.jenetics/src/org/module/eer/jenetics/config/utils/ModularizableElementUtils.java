package org.module.eer.jenetics.config.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.module.eer.jenetics.split.constraint.BasicConstraint;
import org.module.eer.mm.moduleeer.EntityType;
import org.module.eer.mm.moduleeer.MEERModel;
import org.module.eer.mm.moduleeer.Module;
import org.module.eer.mm.moduleeer.ModularizableElement;
import org.module.eer.mm.moduleeer.RelationshipType;
import org.module.eer.mm.moduleeer.procedure.AccessElement;
import org.module.eer.mm.moduleeer.procedure.Procedure;

import io.jenetics.BitChromosome;
import io.jenetics.BitGene;
import io.jenetics.EnumGene;
import io.jenetics.PermutationChromosome;
import io.jenetics.util.MSeq;

public class ModularizableElementUtils {
	
	public static boolean belongsToTheSameModule(int modularizableId, Integer startPosition, PermutationChromosome<Integer> pc, BitChromosome bc) {
		return belongsSameModuleForward(modularizableId, startPosition, pc, bc) || 
				belongsSameModuleBackward(modularizableId, startPosition, pc, bc);		
	}
	
	public static boolean belongsToTheSameModule(int modularizableId, int chromosomePosition, MSeq<EnumGene<Integer>> repairPc, String stringBitChromosome) {
		return belongsSameModuleForward(modularizableId, chromosomePosition, repairPc, stringBitChromosome) || 
				belongsSameModuleBackward(modularizableId, chromosomePosition, repairPc, stringBitChromosome);
	}		
	
	public static boolean belongsSameModuleForward(int entityTypeId, Integer startPosition, PermutationChromosome<Integer> pc, BitChromosome bc) {
		for (int i = startPosition; i < bc.length(); i++) {
			BitGene bitGene = bc.get(i);
			if (bitGene.bit() == false) {
				if (pc.get(i + 1).allele().equals(entityTypeId) == true) {
					return true;
				}
			} else
				break;
		}		
		return false;		
	}
	
	public static boolean belongsSameModuleBackward(int entityTypeId, int startPosition, PermutationChromosome<Integer> pc, BitChromosome bc) {
		for (int i = startPosition; i > 0; i--) {
			BitGene bitGene = bc.get(i-1);
			if (bitGene.bit() == false) {
				if (pc.get(i - 1).allele().equals(entityTypeId) == true) {
					return true;
				}
			} else
				break;
		}		
		return false;
	}
	
	private static boolean belongsSameModuleForward(int modularizableId, int startPosition, MSeq<EnumGene<Integer>> repairPc, String stringBitChromosome) {
		int nextSetPosition = stringBitChromosome.indexOf("1",startPosition) == -1?stringBitChromosome.length()-1:stringBitChromosome.indexOf("1",startPosition);
		for (int i = startPosition + 1; i <= nextSetPosition; i++) {
			if (repairPc.get(i).allele() == modularizableId)
				return true;
		}			
		return false;
	}
	
	private static boolean belongsSameModuleBackward(int modularizableId, int startPosition, MSeq<EnumGene<Integer>> repairPc, String stringBitChromosome) {
		int previousSetPosition = stringBitChromosome.lastIndexOf("1",startPosition) == -1?0:stringBitChromosome.lastIndexOf("1",startPosition);
		if (previousSetPosition != -1) {
			for (int i = startPosition-1; i > previousSetPosition; i--) {
				if (repairPc.get(i).allele() == modularizableId)
					return true;
			}
		}
		return false;
	}
	
	/*
	 * Map with all constraints of EntityType, RelationshipType, Procedure
	 */	
	public static List<BasicConstraint> dependenciesOfAllModularizableElements(EList<ModularizableElement> listOfElements) {
		ListIterator<ModularizableElement> itModularizableElement = listOfElements.listIterator();
		List<BasicConstraint> listOfConstraints = new LinkedList<BasicConstraint>();
		while (itModularizableElement.hasNext()) {
			int elementIndex = itModularizableElement.nextIndex();
			ModularizableElement modularizableElement = itModularizableElement.next();
			if (modularizableElement instanceof RelationshipType) 
				relationshipTypeDependency(elementIndex, listOfElements, (RelationshipType) modularizableElement, listOfConstraints);			
			else if (modularizableElement instanceof Procedure)
				procedureDependency(elementIndex, listOfElements, (Procedure) modularizableElement, listOfConstraints);
		}
		
		return listOfConstraints;
	}
	
	private static void relationshipTypeDependency(int elementIndex, EList<ModularizableElement> listOfElements, 
			RelationshipType relationshipType, List<BasicConstraint> listOfConstraints) {
		List<Integer> listOfDependencies = new LinkedList<Integer>();		
		int sourceIndexElement = listOfElements.indexOf(relationshipType.getLinksToEntities().get(0).getEntity());
		int targetIndexElement = listOfElements.indexOf(relationshipType.getLinksToEntities().get(1).getEntity());
		if (relationshipType.getLinksToEntities().get(0).getEntity().getLinks().size() > 1 &&
				relationshipType.getLinksToEntities().get(1).getEntity().getLinks().size() > 1) {
			listOfDependencies.add(sourceIndexElement);
			listOfDependencies.add(targetIndexElement);
		} else if (relationshipType.getLinksToEntities().get(0).getEntity().getLinks().size() == 1) {
			listOfDependencies.add(sourceIndexElement);
		} else if (relationshipType.getLinksToEntities().get(1).getEntity().getLinks().size() == 1) {
			listOfDependencies.add(targetIndexElement);
		}		
		//Add to the list of constraints
		listOfConstraints.add(new BasicConstraint(elementIndex, Collections.unmodifiableList(listOfDependencies)));					
	}	
	
	private static void procedureDependency(int elementIndex, EList<ModularizableElement> listOfElements,
			Procedure procedure, List<BasicConstraint> listOfConstraints) {
		Iterator<AccessElement> itAccessElements = procedure.getAccessElements().iterator();
		List<Integer> dependenciesList = new ArrayList<Integer>(procedure.getAccessElements().size());
		while (itAccessElements.hasNext()) {
			AccessElement accessElement = (AccessElement) itAccessElements.next();
			int indexElement = listOfElements.indexOf(accessElement.getEntity());
			if (indexElement != -1)
				dependenciesList.add(indexElement);
		}
		listOfConstraints.add(new BasicConstraint(elementIndex, Collections.unmodifiableList(dependenciesList)));				
	}
	
	public static int numberOfElementsInModule(int position, StringBuilder strBuilder) {
		int nextSetPosition = strBuilder.indexOf("1", position) == -1?strBuilder.length()-1:strBuilder.indexOf("1", position);
		int previousSetPosition = strBuilder.lastIndexOf("1", position-1) == -1?0:strBuilder.lastIndexOf("1", position-1);
		int numberOfElements = Math.abs(nextSetPosition-previousSetPosition);
		return numberOfElements;
	}	
	
	/*
	 * Useful queries for ModulEER Models
	 * */	
	public static EList<Module> getAllModules(MEERModel meerModel) {
		EList<Module> allModules = new BasicEList<Module>();
		allModules.addAll(meerModel.getModules());
		ListIterator<Module> itAllModules = allModules.listIterator();
		while (itAllModules.hasNext()) {
			Module module = (Module) itAllModules.next();
			module.getModularizableElements().stream()
				.forEach(element -> { 
					if (element instanceof Module) {
						allModules.add((Module) element);
						itAllModules.add((Module) element);
					}
				});			
		}		
		return allModules;
	}	
	
	//TODO All modularizable elements belongs to the same module remove?
	//TODO Need a new implementation that compares eContainer of the elements remove?
	public static int maxNumberofReferences(EList<ModularizableElement> listOfModElements) {
		int maxOfReferences = 0;
		for (ModularizableElement element : listOfModElements) {
			if (element instanceof EntityType) 
				maxOfReferences += ((EntityType) element).getGeneralizations().size();
			else if (element instanceof RelationshipType) {
				maxOfReferences += ((RelationshipType) element).getLinksToEntities().size();
				maxOfReferences += ((RelationshipType) element).getAssociations().size();
				maxOfReferences += ((RelationshipType) element).getAggregations().size();
				maxOfReferences += ((RelationshipType) element).getGeneralizes().size();
			} else if (element instanceof Procedure) {
				maxOfReferences += ((Procedure) element).getAccessElements().size();
			}				
		}
		return maxOfReferences;
	}	
}
