/**
 */
package org.module.eer.mm.moduleeer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generalization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.module.eer.mm.moduleeer.Generalization#getEntity <em>Entity</em>}</li>
 *   <li>{@link org.module.eer.mm.moduleeer.Generalization#getCompleteness <em>Completeness</em>}</li>
 *   <li>{@link org.module.eer.mm.moduleeer.Generalization#getDisjointness <em>Disjointness</em>}</li>
 * </ul>
 *
 * @see org.module.eer.mm.moduleeer.ModuleeerPackage#getGeneralization()
 * @model
 * @generated
 */
public interface Generalization extends NameElement {
	/**
	 * Returns the value of the '<em><b>Entity</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.module.eer.mm.moduleeer.EntityType#getSpecializations <em>Specializations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' reference.
	 * @see #setEntity(EntityType)
	 * @see org.module.eer.mm.moduleeer.ModuleeerPackage#getGeneralization_Entity()
	 * @see org.module.eer.mm.moduleeer.EntityType#getSpecializations
	 * @model opposite="specializations"
	 * @generated
	 */
	EntityType getEntity();

	/**
	 * Sets the value of the '{@link org.module.eer.mm.moduleeer.Generalization#getEntity <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(EntityType value);

	/**
	 * Returns the value of the '<em><b>Completeness</b></em>' attribute.
	 * The literals are from the enumeration {@link org.module.eer.mm.moduleeer.CompletenessType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Completeness</em>' attribute.
	 * @see org.module.eer.mm.moduleeer.CompletenessType
	 * @see #setCompleteness(CompletenessType)
	 * @see org.module.eer.mm.moduleeer.ModuleeerPackage#getGeneralization_Completeness()
	 * @model
	 * @generated
	 */
	CompletenessType getCompleteness();

	/**
	 * Sets the value of the '{@link org.module.eer.mm.moduleeer.Generalization#getCompleteness <em>Completeness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Completeness</em>' attribute.
	 * @see org.module.eer.mm.moduleeer.CompletenessType
	 * @see #getCompleteness()
	 * @generated
	 */
	void setCompleteness(CompletenessType value);

	/**
	 * Returns the value of the '<em><b>Disjointness</b></em>' attribute.
	 * The literals are from the enumeration {@link org.module.eer.mm.moduleeer.DisjointnessType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disjointness</em>' attribute.
	 * @see org.module.eer.mm.moduleeer.DisjointnessType
	 * @see #setDisjointness(DisjointnessType)
	 * @see org.module.eer.mm.moduleeer.ModuleeerPackage#getGeneralization_Disjointness()
	 * @model
	 * @generated
	 */
	DisjointnessType getDisjointness();

	/**
	 * Sets the value of the '{@link org.module.eer.mm.moduleeer.Generalization#getDisjointness <em>Disjointness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disjointness</em>' attribute.
	 * @see org.module.eer.mm.moduleeer.DisjointnessType
	 * @see #getDisjointness()
	 * @generated
	 */
	void setDisjointness(DisjointnessType value);

} // Generalization
