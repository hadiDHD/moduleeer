/**
 */
package org.module.eer.mm.moduleeer.subsystem;

import org.eclipse.emf.common.util.EList;

import org.module.eer.mm.moduleeer.NameElement;

import org.module.eer.mm.moduleeer.procedure.Procedure;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module Subsystem</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.module.eer.mm.moduleeer.subsystem.ModuleSubsystem#getProcedures <em>Procedures</em>}</li>
 * </ul>
 *
 * @see org.module.eer.mm.moduleeer.subsystem.SubsystemPackage#getModuleSubsystem()
 * @model
 * @generated
 */
public interface ModuleSubsystem extends NameElement {
	/**
	 * Returns the value of the '<em><b>Procedures</b></em>' reference list.
	 * The list contents are of type {@link org.module.eer.mm.moduleeer.procedure.Procedure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procedures</em>' reference list.
	 * @see org.module.eer.mm.moduleeer.subsystem.SubsystemPackage#getModuleSubsystem_Procedures()
	 * @model
	 * @generated
	 */
	EList<Procedure> getProcedures();

} // ModuleSubsystem
