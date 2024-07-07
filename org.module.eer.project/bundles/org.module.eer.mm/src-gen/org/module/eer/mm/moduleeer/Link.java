/**
 */
package org.module.eer.mm.moduleeer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.module.eer.mm.moduleeer.Link#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link org.module.eer.mm.moduleeer.Link#getCompleteness <em>Completeness</em>}</li>
 * </ul>
 *
 * @see org.module.eer.mm.moduleeer.ModuleeerPackage#getLink()
 * @model abstract="true"
 * @generated
 */
public interface Link extends NameElement {
	/**
	 * Returns the value of the '<em><b>Cardinality</b></em>' attribute.
	 * The literals are from the enumeration {@link org.module.eer.mm.moduleeer.CardinalityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality</em>' attribute.
	 * @see org.module.eer.mm.moduleeer.CardinalityType
	 * @see #setCardinality(CardinalityType)
	 * @see org.module.eer.mm.moduleeer.ModuleeerPackage#getLink_Cardinality()
	 * @model
	 * @generated
	 */
	CardinalityType getCardinality();

	/**
	 * Sets the value of the '{@link org.module.eer.mm.moduleeer.Link#getCardinality <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality</em>' attribute.
	 * @see org.module.eer.mm.moduleeer.CardinalityType
	 * @see #getCardinality()
	 * @generated
	 */
	void setCardinality(CardinalityType value);

	/**
	 * Returns the value of the '<em><b>Completeness</b></em>' attribute.
	 * The literals are from the enumeration {@link org.module.eer.mm.moduleeer.CompletenessType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Completeness</em>' attribute.
	 * @see org.module.eer.mm.moduleeer.CompletenessType
	 * @see #setCompleteness(CompletenessType)
	 * @see org.module.eer.mm.moduleeer.ModuleeerPackage#getLink_Completeness()
	 * @model
	 * @generated
	 */
	CompletenessType getCompleteness();

	/**
	 * Sets the value of the '{@link org.module.eer.mm.moduleeer.Link#getCompleteness <em>Completeness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Completeness</em>' attribute.
	 * @see org.module.eer.mm.moduleeer.CompletenessType
	 * @see #getCompleteness()
	 * @generated
	 */
	void setCompleteness(CompletenessType value);

} // Link
