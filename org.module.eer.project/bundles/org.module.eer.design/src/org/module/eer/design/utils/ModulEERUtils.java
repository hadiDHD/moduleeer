package org.module.eer.design.utils;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.sirius.business.api.session.Session;
import org.module.eer.jenetics.action.CreateProjectMEERModule;
import org.module.eer.jenetics.split.ISplitModulEER;
import org.module.eer.mm.moduleeer.MEERModel;
import org.module.eer.mm.moduleeer.Module;

public final class ModulEERUtils {
	
	public static String PROJECT_PREFIX = "split";
		
	public static final void createProject(String projectName, Module module, ISplitModulEER splittedModules) {
		//Split Module
		EList<MEERModel> listOfSplittedModules = splittedModules.splitModules(module);								
		//Create Modeling Project with new MEERModel Split Diagram
		new CreateProjectMEERModule(listOfSplittedModules, projectName + "." + PROJECT_PREFIX, 
				module.eResource()).createProject();		
	}
	
	public static final String getProjectBySession(Session session) {
		Resource sessionResource = session.getSessionResource();		
		return sessionResource.getURI().segment(1);
	}
}
