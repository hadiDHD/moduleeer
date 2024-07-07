/**
 */
package org.module.eer.mm.moduleeer;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.module.eer.mm.moduleeer.CompositeAttribute#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @see org.module.eer.mm.moduleeer.ModuleeerPackage#getCompositeAttribute()
 * @model
 * @generated
 */
public interface CompositeAttribute extends Attribute {
	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link org.module.eer.mm.moduleeer.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see org.module.eer.mm.moduleeer.ModuleeerPackage#getCompositeAttribute_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttributes();

} // CompositeAttribute
