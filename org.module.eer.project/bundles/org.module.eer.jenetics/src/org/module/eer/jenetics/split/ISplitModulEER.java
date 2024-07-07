package org.module.eer.jenetics.split;

import org.eclipse.emf.common.util.EList;
import org.module.eer.mm.moduleeer.MEERModel;
import org.module.eer.mm.moduleeer.Module;

public interface ISplitModulEER {
	
	public EList<MEERModel> splitModules(Module splittingModule);
}
