package org.module.eer.design.action.menu;

import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.sirius.diagram.ui.edit.api.part.IDiagramElementEditPart;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.menus.ExtensionContributionFactory;
import org.eclipse.ui.menus.IContributionRoot;
import org.eclipse.ui.services.IServiceLocator;
import org.module.eer.jenetics.config.utils.ModularizableElementUtils;
import org.module.eer.mm.moduleeer.MEERModel;
import org.module.eer.mm.moduleeer.ModularizableElement;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.module.eer.mm.moduleeer.Module;

public class MoveToModuleMenuContribution extends ExtensionContributionFactory {

	public MoveToModuleMenuContribution() {
		// Do Nothing
	}
	/*
	 * Check if the selected object is a Modularizable Object 
	 * */
	@Override
	public void createContributionItems(IServiceLocator serviceLocator, IContributionRoot additions) {
		ISelectionService serv = (ISelectionService) serviceLocator.getService(ISelectionService.class);
		ISelection selection = serv.getSelection();
		if (selection instanceof StructuredSelection) {
			StructuredSelection structuredSelection = (StructuredSelection)selection;
			Object firstelement = structuredSelection.getFirstElement();
			if (firstelement instanceof IDiagramElementEditPart) {
				IDiagramElementEditPart nodeElement = (IDiagramElementEditPart) firstelement;
				EObject semanticElement = nodeElement.resolveTargetSemanticElement();
				if (semanticElement instanceof ModularizableElement) {
					addMenuModularizableElement((ModularizableElement) semanticElement, serviceLocator, additions);					
				}				
			}
		}		
	}
	
	/*
	 * Create dynamic menu for move modularizable elements
	 * between modules
	 * */
	private void addMenuModularizableElement(ModularizableElement modularizableElement, IServiceLocator serviceLocator, 
			IContributionRoot additions) {
		EObject rootEObject = modularizableElement.eResource().getContents().get(0);
		if (rootEObject instanceof MEERModel) {
			MEERModel meerModel = (MEERModel) rootEObject;
			EList<Module> allModules = ModularizableElementUtils.getAllModules(meerModel);
			allModules.remove(modularizableElement.eContainer());
			if (allModules.size() > 0) {
				MenuManager menu = new MenuManager();
				menu.setMenuText("Move To Module");
				for (int i = 0; i < allModules.size(); i++) {
					Module module = allModules.get(i);
					String tagName = "Module: ";
					if (module.getName() == null) 
						tagName += "Number " + i + " [No name detected]";
					else
						tagName += module.getName();
					menu.add(new MoveToModuleAction(tagName, module, modularizableElement));						
				}					
				additions.addContributionItem(menu, null);				
			}
		}		
	}
}
