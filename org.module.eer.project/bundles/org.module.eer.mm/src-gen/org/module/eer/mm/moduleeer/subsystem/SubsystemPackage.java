/**
 */
package org.module.eer.mm.moduleeer.subsystem;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.module.eer.mm.moduleeer.ModuleeerPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.module.eer.mm.moduleeer.subsystem.SubsystemFactory
 * @model kind="package"
 * @generated
 */
public interface SubsystemPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "subsystem";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://moduleeer/subsystem/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "subsystem";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SubsystemPackage eINSTANCE = org.module.eer.mm.moduleeer.subsystem.impl.SubsystemPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.module.eer.mm.moduleeer.subsystem.impl.ModuleSubsystemImpl <em>Module Subsystem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.module.eer.mm.moduleeer.subsystem.impl.ModuleSubsystemImpl
	 * @see org.module.eer.mm.moduleeer.subsystem.impl.SubsystemPackageImpl#getModuleSubsystem()
	 * @generated
	 */
	int MODULE_SUBSYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_SUBSYSTEM__NAME = ModuleeerPackage.NAME_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Procedures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_SUBSYSTEM__PROCEDURES = ModuleeerPackage.NAME_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Module Subsystem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_SUBSYSTEM_FEATURE_COUNT = ModuleeerPackage.NAME_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Module Subsystem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_SUBSYSTEM_OPERATION_COUNT = ModuleeerPackage.NAME_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.module.eer.mm.moduleeer.subsystem.ModuleSubsystem <em>Module Subsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Subsystem</em>'.
	 * @see org.module.eer.mm.moduleeer.subsystem.ModuleSubsystem
	 * @generated
	 */
	EClass getModuleSubsystem();

	/**
	 * Returns the meta object for the reference list '{@link org.module.eer.mm.moduleeer.subsystem.ModuleSubsystem#getProcedures <em>Procedures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Procedures</em>'.
	 * @see org.module.eer.mm.moduleeer.subsystem.ModuleSubsystem#getProcedures()
	 * @see #getModuleSubsystem()
	 * @generated
	 */
	EReference getModuleSubsystem_Procedures();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SubsystemFactory getSubsystemFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.module.eer.mm.moduleeer.subsystem.impl.ModuleSubsystemImpl <em>Module Subsystem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.module.eer.mm.moduleeer.subsystem.impl.ModuleSubsystemImpl
		 * @see org.module.eer.mm.moduleeer.subsystem.impl.SubsystemPackageImpl#getModuleSubsystem()
		 * @generated
		 */
		EClass MODULE_SUBSYSTEM = eINSTANCE.getModuleSubsystem();

		/**
		 * The meta object literal for the '<em><b>Procedures</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_SUBSYSTEM__PROCEDURES = eINSTANCE.getModuleSubsystem_Procedures();

	}

} //SubsystemPackage
