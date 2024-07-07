/**
 */
package org.module.eer.mm.moduleeer;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.module.eer.mm.moduleeer.ModuleeerPackage
 * @generated
 */
public interface ModuleeerFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModuleeerFactory eINSTANCE = org.module.eer.mm.moduleeer.impl.ModuleeerFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>MEER Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MEER Model</em>'.
	 * @generated
	 */
	MEERModel createMEERModel();

	/**
	 * Returns a new object of class '<em>Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Module</em>'.
	 * @generated
	 */
	Module createModule();

	/**
	 * Returns a new object of class '<em>Entity Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity Type</em>'.
	 * @generated
	 */
	EntityType createEntityType();

	/**
	 * Returns a new object of class '<em>Relationship Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relationship Type</em>'.
	 * @generated
	 */
	RelationshipType createRelationshipType();

	/**
	 * Returns a new object of class '<em>Single Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Single Attribute</em>'.
	 * @generated
	 */
	SingleAttribute createSingleAttribute();

	/**
	 * Returns a new object of class '<em>Composite Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Attribute</em>'.
	 * @generated
	 */
	CompositeAttribute createCompositeAttribute();

	/**
	 * Returns a new object of class '<em>Aggregation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aggregation</em>'.
	 * @generated
	 */
	Aggregation createAggregation();

	/**
	 * Returns a new object of class '<em>Link To Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link To Entity</em>'.
	 * @generated
	 */
	LinkToEntity createLinkToEntity();

	/**
	 * Returns a new object of class '<em>Generalization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generalization</em>'.
	 * @generated
	 */
	Generalization createGeneralization();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ModuleeerPackage getModuleeerPackage();

} //ModuleeerFactory
