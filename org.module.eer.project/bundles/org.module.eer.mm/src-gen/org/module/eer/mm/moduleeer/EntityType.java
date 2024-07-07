/**
 */
package org.module.eer.mm.moduleeer;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.module.eer.mm.moduleeer.EntityType#getGeneralizations <em>Generalizations</em>}</li>
 *   <li>{@link org.module.eer.mm.moduleeer.EntityType#getSpecializations <em>Specializations</em>}</li>
 *   <li>{@link org.module.eer.mm.moduleeer.EntityType#getLinks <em>Links</em>}</li>
 * </ul>
 *
 * @see org.module.eer.mm.moduleeer.ModuleeerPackage#getEntityType()
 * @model
 * @generated
 */
public interface EntityType extends Element {
	/**
	 * Returns the value of the '<em><b>Generalizations</b></em>' containment reference list.
	 * The list contents are of type {@link org.module.eer.mm.moduleeer.Generalization}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generalizations</em>' containment reference list.
	 * @see org.module.eer.mm.moduleeer.ModuleeerPackage#getEntityType_Generalizations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Generalization> getGeneralizations();

	/**
	 * Returns the value of the '<em><b>Specializations</b></em>' reference list.
	 * The list contents are of type {@link org.module.eer.mm.moduleeer.Generalization}.
	 * It is bidirectional and its opposite is '{@link org.module.eer.mm.moduleeer.Generalization#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specializations</em>' reference list.
	 * @see org.module.eer.mm.moduleeer.ModuleeerPackage#getEntityType_Specializations()
	 * @see org.module.eer.mm.moduleeer.Generalization#getEntity
	 * @model opposite="entity"
	 * @generated
	 */
	EList<Generalization> getSpecializations();

	/**
	 * Returns the value of the '<em><b>Links</b></em>' reference list.
	 * The list contents are of type {@link org.module.eer.mm.moduleeer.LinkToEntity}.
	 * It is bidirectional and its opposite is '{@link org.module.eer.mm.moduleeer.LinkToEntity#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' reference list.
	 * @see org.module.eer.mm.moduleeer.ModuleeerPackage#getEntityType_Links()
	 * @see org.module.eer.mm.moduleeer.LinkToEntity#getEntity
	 * @model opposite="entity"
	 * @generated
	 */
	EList<LinkToEntity> getLinks();

} // EntityType
