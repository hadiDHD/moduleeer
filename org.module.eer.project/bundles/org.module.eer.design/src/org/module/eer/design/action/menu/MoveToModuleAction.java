package org.module.eer.design.action.menu;

import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.action.Action;
import org.module.eer.mm.moduleeer.ModularizableElement;
import org.module.eer.mm.moduleeer.Module;

public class MoveToModuleAction extends Action {
	
	private Module module;
	private ModularizableElement modularizableElement;
	
	public MoveToModuleAction(String name, Module module, ModularizableElement modularizableElement) {
		super(name);		
		this.module = module;		
		this.modularizableElement = modularizableElement;
	}
	
	@Override
	public void run() {
		TransactionalEditingDomain domain = 
				TransactionalEditingDomain.Factory.INSTANCE.getEditingDomain(modularizableElement.eResource().getResourceSet());		
		domain.getCommandStack().execute(new RecordingCommand(domain) {			
			@Override
			protected void doExecute() {				
				module.getModularizableElements().add(modularizableElement);
			}
		});
	}
	
	public Module getModule() {
		return module;
	}
	
	public ModularizableElement getModularizableElement() {
		return modularizableElement;
	}
}
