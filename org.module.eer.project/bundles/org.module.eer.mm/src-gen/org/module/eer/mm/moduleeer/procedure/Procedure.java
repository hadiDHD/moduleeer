/**
 */
package org.module.eer.mm.moduleeer.procedure;

import org.eclipse.emf.common.util.EList;

import org.module.eer.mm.moduleeer.ModularizableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Procedure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.module.eer.mm.moduleeer.procedure.Procedure#getProcedureType <em>Procedure Type</em>}</li>
 *   <li>{@link org.module.eer.mm.moduleeer.procedure.Procedure#getEvent <em>Event</em>}</li>
 *   <li>{@link org.module.eer.mm.moduleeer.procedure.Procedure#getAccessElements <em>Access Elements</em>}</li>
 * </ul>
 *
 * @see org.module.eer.mm.moduleeer.procedure.ProcedurePackage#getProcedure()
 * @model
 * @generated
 */
public interface Procedure extends ModularizableElement {
	/**
	 * Returns the value of the '<em><b>Procedure Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.module.eer.mm.moduleeer.procedure.ProcedureType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procedure Type</em>' attribute.
	 * @see org.module.eer.mm.moduleeer.procedure.ProcedureType
	 * @see #setProcedureType(ProcedureType)
	 * @see org.module.eer.mm.moduleeer.procedure.ProcedurePackage#getProcedure_ProcedureType()
	 * @model
	 * @generated
	 */
	ProcedureType getProcedureType();

	/**
	 * Sets the value of the '{@link org.module.eer.mm.moduleeer.procedure.Procedure#getProcedureType <em>Procedure Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Procedure Type</em>' attribute.
	 * @see org.module.eer.mm.moduleeer.procedure.ProcedureType
	 * @see #getProcedureType()
	 * @generated
	 */
	void setProcedureType(ProcedureType value);

	/**
	 * Returns the value of the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' reference.
	 * @see #setEvent(Event)
	 * @see org.module.eer.mm.moduleeer.procedure.ProcedurePackage#getProcedure_Event()
	 * @model
	 * @generated
	 */
	Event getEvent();

	/**
	 * Sets the value of the '{@link org.module.eer.mm.moduleeer.procedure.Procedure#getEvent <em>Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' reference.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(Event value);

	/**
	 * Returns the value of the '<em><b>Access Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.module.eer.mm.moduleeer.procedure.AccessElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Elements</em>' containment reference list.
	 * @see org.module.eer.mm.moduleeer.procedure.ProcedurePackage#getProcedure_AccessElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<AccessElement> getAccessElements();

} // Procedure
