/**
 */
package org.module.eer.mm.moduleeer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.module.eer.mm.moduleeer.SingleAttribute#getType <em>Type</em>}</li>
 *   <li>{@link org.module.eer.mm.moduleeer.SingleAttribute#isIsKey <em>Is Key</em>}</li>
 * </ul>
 *
 * @see org.module.eer.mm.moduleeer.ModuleeerPackage#getSingleAttribute()
 * @model
 * @generated
 */
public interface SingleAttribute extends Attribute {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.module.eer.mm.moduleeer.AttributeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.module.eer.mm.moduleeer.AttributeType
	 * @see #setType(AttributeType)
	 * @see org.module.eer.mm.moduleeer.ModuleeerPackage#getSingleAttribute_Type()
	 * @model
	 * @generated
	 */
	AttributeType getType();

	/**
	 * Sets the value of the '{@link org.module.eer.mm.moduleeer.SingleAttribute#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.module.eer.mm.moduleeer.AttributeType
	 * @see #getType()
	 * @generated
	 */
	void setType(AttributeType value);

	/**
	 * Returns the value of the '<em><b>Is Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Key</em>' attribute.
	 * @see #setIsKey(boolean)
	 * @see org.module.eer.mm.moduleeer.ModuleeerPackage#getSingleAttribute_IsKey()
	 * @model
	 * @generated
	 */
	boolean isIsKey();

	/**
	 * Sets the value of the '{@link org.module.eer.mm.moduleeer.SingleAttribute#isIsKey <em>Is Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Key</em>' attribute.
	 * @see #isIsKey()
	 * @generated
	 */
	void setIsKey(boolean value);

} // SingleAttribute
