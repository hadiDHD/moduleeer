/**
 */
package org.module.eer.mm.moduleeer;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Name Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.module.eer.mm.moduleeer.NameElement#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.module.eer.mm.moduleeer.ModuleeerPackage#getNameElement()
 * @model abstract="true"
 * @generated
 */
public interface NameElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.module.eer.mm.moduleeer.ModuleeerPackage#getNameElement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.module.eer.mm.moduleeer.NameElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // NameElement
