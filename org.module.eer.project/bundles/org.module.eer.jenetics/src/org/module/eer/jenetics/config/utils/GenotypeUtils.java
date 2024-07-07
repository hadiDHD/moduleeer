package org.module.eer.jenetics.config.utils;

import java.util.HashMap;
import java.util.Map;

import io.jenetics.BitChromosome;
import io.jenetics.Chromosome;
import io.jenetics.EnumGene;
import io.jenetics.Genotype;
import io.jenetics.PermutationChromosome;
import io.jenetics.Phenotype;
import io.jenetics.engine.Constraint;
import io.jenetics.util.Factory;
import io.jenetics.util.MSeq;

public class GenotypeUtils {
	
	/*
	 * Get the Factory and Genotype encoding //TODO remove
	 * */	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static Factory getFactoryPhenotype(Constraint constraint, int size) {
		final Genotype genotype = Genotype.of(
                (Chromosome) PermutationChromosome.ofInteger(size),
                (Chromosome) BitChromosome.of(size - 1)
            );
		return getFactoryPhenotype(constraint, genotype);	
	}
	
	//TODO remove
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static Factory getFactoryPhenotype(Constraint constraint, Genotype genotype) {
		return () -> {
		    final Factory<Phenotype> ptf = () -> Phenotype.of(genotype, 0);
		        Phenotype pt = ptf.newInstance();
		        // Repair a genotype using the old one as a template.
		        constraint.repair(pt, pt.generation());		        
		        return pt.genotype();
		    };		
	}
	
	/*
	 * Return a Map<Integer, Integer> -> Map<IdModule, Number of Elements>
	 * */
	public static Map<Integer, Integer> genotypeElementsPerModule(@SuppressWarnings("rawtypes") Genotype genotype) {
		final BitChromosome bc = (BitChromosome) genotype.get(1);
		Map<Integer, Integer> elementsPerModule = new HashMap<Integer, Integer>();
		int currentModule = 0;
		elementsPerModule.put(currentModule, 0);
		for (int i = 0; i < bc.length(); i++) {
			elementsPerModule.replace(currentModule, elementsPerModule.get(currentModule) + 1);
			if (bc.get(i).bit() == true) {
				currentModule += 1;
				elementsPerModule.put(currentModule, 0);
			} 
		}
		// Add to the last module, the last element
		elementsPerModule.put(currentModule, elementsPerModule.get(currentModule) + 1);
		return elementsPerModule;
	}	
	
	/*
	 * Method to print the Genotype (Enumerable Genes and BitChromosome)
	 * */
	
	@SuppressWarnings("rawtypes")
	public static void printGenotypeEnumerableGenesBitChromosome(Genotype genotype) {
		@SuppressWarnings("unchecked")
		final PermutationChromosome<Integer> pc = (PermutationChromosome<Integer>) genotype.get(0);
		final BitChromosome bc = (BitChromosome) genotype.get(1);
		System.out.println();
		for (int i = 0; i < pc.length(); i++) {
			System.out.print(pc.get(i));
			if (i + 1 < pc.length()) {
				System.out.print("|");
				System.out.print((bc.get(i).bit()==true)?1:0);
				System.out.print("|");
			}
		}		
	}
	
	/*
	 * Method to print the Sequence of Integers (Enumerable Sequence) and String (Sequence))
	 * */
	
	public static void printGenotypeEnumerableGenesBitChromosome(MSeq<EnumGene<Integer>> repairPc,
			StringBuilder strBuilder) {
		System.out.println();
		for (int i = 0; i < repairPc.size(); i++) {
			System.out.print(repairPc.get(i));
			if (i + 1 < repairPc.size()) {
				System.out.print("|");
				System.out.print(strBuilder.charAt(i));
				System.out.print("|");
			}
		}
	}

}
