/**
 */
package org.module.eer.mm.moduleeer;

import org.eclipse.emf.common.util.EList;

import org.module.eer.mm.moduleeer.procedure.AccessElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.module.eer.mm.moduleeer.Element#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.module.eer.mm.moduleeer.Element#getAccessElement <em>Access Element</em>}</li>
 *   <li>{@link org.module.eer.mm.moduleeer.Element#isIsWeak <em>Is Weak</em>}</li>
 * </ul>
 *
 * @see org.module.eer.mm.moduleeer.ModuleeerPackage#getElement()
 * @model abstract="true"
 * @generated
 */
public interface Element extends ModularizableElement {
	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link org.module.eer.mm.moduleeer.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see org.module.eer.mm.moduleeer.ModuleeerPackage#getElement_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>Access Element</b></em>' reference list.
	 * The list contents are of type {@link org.module.eer.mm.moduleeer.procedure.AccessElement}.
	 * It is bidirectional and its opposite is '{@link org.module.eer.mm.moduleeer.procedure.AccessElement#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Element</em>' reference list.
	 * @see org.module.eer.mm.moduleeer.ModuleeerPackage#getElement_AccessElement()
	 * @see org.module.eer.mm.moduleeer.procedure.AccessElement#getEntity
	 * @model opposite="entity"
	 * @generated
	 */
	EList<AccessElement> getAccessElement();

	/**
	 * Returns the value of the '<em><b>Is Weak</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Weak</em>' attribute.
	 * @see #setIsWeak(boolean)
	 * @see org.module.eer.mm.moduleeer.ModuleeerPackage#getElement_IsWeak()
	 * @model
	 * @generated
	 */
	boolean isIsWeak();

	/**
	 * Sets the value of the '{@link org.module.eer.mm.moduleeer.Element#isIsWeak <em>Is Weak</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Weak</em>' attribute.
	 * @see #isIsWeak()
	 * @generated
	 */
	void setIsWeak(boolean value);

} // Element
