/**
 */
package org.module.eer.mm.moduleeer.procedure;

import org.eclipse.emf.ecore.EObject;

import org.module.eer.mm.moduleeer.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Access Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.module.eer.mm.moduleeer.procedure.AccessElement#getEntity <em>Entity</em>}</li>
 *   <li>{@link org.module.eer.mm.moduleeer.procedure.AccessElement#getAccessType <em>Access Type</em>}</li>
 * </ul>
 *
 * @see org.module.eer.mm.moduleeer.procedure.ProcedurePackage#getAccessElement()
 * @model
 * @generated
 */
public interface AccessElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Entity</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.module.eer.mm.moduleeer.Element#getAccessElement <em>Access Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' reference.
	 * @see #setEntity(Element)
	 * @see org.module.eer.mm.moduleeer.procedure.ProcedurePackage#getAccessElement_Entity()
	 * @see org.module.eer.mm.moduleeer.Element#getAccessElement
	 * @model opposite="accessElement" required="true"
	 * @generated
	 */
	Element getEntity();

	/**
	 * Sets the value of the '{@link org.module.eer.mm.moduleeer.procedure.AccessElement#getEntity <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(Element value);

	/**
	 * Returns the value of the '<em><b>Access Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.module.eer.mm.moduleeer.procedure.OperationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Type</em>' attribute.
	 * @see org.module.eer.mm.moduleeer.procedure.OperationType
	 * @see #setAccessType(OperationType)
	 * @see org.module.eer.mm.moduleeer.procedure.ProcedurePackage#getAccessElement_AccessType()
	 * @model
	 * @generated
	 */
	OperationType getAccessType();

	/**
	 * Sets the value of the '{@link org.module.eer.mm.moduleeer.procedure.AccessElement#getAccessType <em>Access Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Type</em>' attribute.
	 * @see org.module.eer.mm.moduleeer.procedure.OperationType
	 * @see #getAccessType()
	 * @generated
	 */
	void setAccessType(OperationType value);

} // AccessElement
