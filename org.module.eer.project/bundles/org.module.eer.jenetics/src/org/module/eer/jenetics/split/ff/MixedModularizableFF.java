package org.module.eer.jenetics.split.ff;

import io.jenetics.Genotype;
import io.jenetics.Optimize;
import io.jenetics.ext.moea.Vec;
import io.jenetics.ext.moea.VecFactory;

import java.util.function.Function;

import org.eclipse.emf.common.util.EList;
import org.module.eer.jenetics.utils.Cohesive;
import org.module.eer.mm.moduleeer.ModularizableElement;

@SuppressWarnings("rawtypes")
public class MixedModularizableFF implements Function<Genotype, Vec<double[]>>{
	
	private EList<ModularizableElement> modularizableElements;
		
	public MixedModularizableFF(EList<ModularizableElement> modularizableElements) {
		this.modularizableElements = modularizableElements;		
	}
	
	private static final VecFactory<double[]> VEC_FACTORY =
			VecFactory.ofDoubleVec(
				Optimize.MAXIMUM,//Cohesion	
				Optimize.MINIMUM,//Coupling
				Optimize.MINIMUM,//Number of Modules
				Optimize.MINIMUM, //Average Number of Modularizable Elements per Module
				Optimize.MINIMUM//Standard deviation
	);	
	
	@Override
	public Vec<double[]> apply(Genotype genotype) {	
		CohesiveFF cohesiveFF = new CohesiveFF(this.modularizableElements);
		Cohesive cohesiveData = cohesiveFF.apply(genotype);		
		return VEC_FACTORY.newVec(new double[] {
				cohesiveData.getCohesion(),
				cohesiveData.getCoupling(),				
				new NumberOfClustersFF().apply(genotype),
				new AverageClassesPerModule().apply(genotype),
				new BalancedFF().apply(genotype)
			});
	}
}
