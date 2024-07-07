/**
 */
package org.module.eer.mm.moduleeer.procedure;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see org.module.eer.mm.moduleeer.procedure.ProcedureFactory
 * @model kind="package"
 * @generated
 */
public interface ProcedurePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "procedure";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://moduleeer/procedure/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "procedure";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProcedurePackage eINSTANCE = org.module.eer.mm.moduleeer.procedure.impl.ProcedurePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.module.eer.mm.moduleeer.procedure.impl.ProcedureImpl <em>Procedure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.module.eer.mm.moduleeer.procedure.impl.ProcedureImpl
	 * @see org.module.eer.mm.moduleeer.procedure.impl.ProcedurePackageImpl#getProcedure()
	 * @generated
	 */
	int PROCEDURE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__NAME = ModuleeerPackage.MODULARIZABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Procedure Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__PROCEDURE_TYPE = ModuleeerPackage.MODULARIZABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__EVENT = ModuleeerPackage.MODULARIZABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Access Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__ACCESS_ELEMENTS = ModuleeerPackage.MODULARIZABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Procedure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_FEATURE_COUNT = ModuleeerPackage.MODULARIZABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Procedure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_OPERATION_COUNT = ModuleeerPackage.MODULARIZABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.module.eer.mm.moduleeer.procedure.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.module.eer.mm.moduleeer.procedure.impl.EventImpl
	 * @see org.module.eer.mm.moduleeer.procedure.impl.ProcedurePackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = ModuleeerPackage.NAME_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Integrity Procedures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__INTEGRITY_PROCEDURES = ModuleeerPackage.NAME_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__DESCRIPTION = ModuleeerPackage.NAME_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = ModuleeerPackage.NAME_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = ModuleeerPackage.NAME_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.module.eer.mm.moduleeer.procedure.impl.AccessElementImpl <em>Access Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.module.eer.mm.moduleeer.procedure.impl.AccessElementImpl
	 * @see org.module.eer.mm.moduleeer.procedure.impl.ProcedurePackageImpl#getAccessElement()
	 * @generated
	 */
	int ACCESS_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_ELEMENT__ENTITY = 0;

	/**
	 * The feature id for the '<em><b>Access Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_ELEMENT__ACCESS_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Access Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Access Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.module.eer.mm.moduleeer.procedure.ProcedureType <em>Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.module.eer.mm.moduleeer.procedure.ProcedureType
	 * @see org.module.eer.mm.moduleeer.procedure.impl.ProcedurePackageImpl#getProcedureType()
	 * @generated
	 */
	int PROCEDURE_TYPE = 3;

	/**
	 * The meta object id for the '{@link org.module.eer.mm.moduleeer.procedure.OperationType <em>Operation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.module.eer.mm.moduleeer.procedure.OperationType
	 * @see org.module.eer.mm.moduleeer.procedure.impl.ProcedurePackageImpl#getOperationType()
	 * @generated
	 */
	int OPERATION_TYPE = 4;

	/**
	 * Returns the meta object for class '{@link org.module.eer.mm.moduleeer.procedure.Procedure <em>Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Procedure</em>'.
	 * @see org.module.eer.mm.moduleeer.procedure.Procedure
	 * @generated
	 */
	EClass getProcedure();

	/**
	 * Returns the meta object for the attribute '{@link org.module.eer.mm.moduleeer.procedure.Procedure#getProcedureType <em>Procedure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Procedure Type</em>'.
	 * @see org.module.eer.mm.moduleeer.procedure.Procedure#getProcedureType()
	 * @see #getProcedure()
	 * @generated
	 */
	EAttribute getProcedure_ProcedureType();

	/**
	 * Returns the meta object for the reference '{@link org.module.eer.mm.moduleeer.procedure.Procedure#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Event</em>'.
	 * @see org.module.eer.mm.moduleeer.procedure.Procedure#getEvent()
	 * @see #getProcedure()
	 * @generated
	 */
	EReference getProcedure_Event();

	/**
	 * Returns the meta object for the containment reference list '{@link org.module.eer.mm.moduleeer.procedure.Procedure#getAccessElements <em>Access Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Access Elements</em>'.
	 * @see org.module.eer.mm.moduleeer.procedure.Procedure#getAccessElements()
	 * @see #getProcedure()
	 * @generated
	 */
	EReference getProcedure_AccessElements();

	/**
	 * Returns the meta object for class '{@link org.module.eer.mm.moduleeer.procedure.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see org.module.eer.mm.moduleeer.procedure.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the reference list '{@link org.module.eer.mm.moduleeer.procedure.Event#getIntegrityProcedures <em>Integrity Procedures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Integrity Procedures</em>'.
	 * @see org.module.eer.mm.moduleeer.procedure.Event#getIntegrityProcedures()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_IntegrityProcedures();

	/**
	 * Returns the meta object for the attribute '{@link org.module.eer.mm.moduleeer.procedure.Event#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.module.eer.mm.moduleeer.procedure.Event#getDescription()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Description();

	/**
	 * Returns the meta object for class '{@link org.module.eer.mm.moduleeer.procedure.AccessElement <em>Access Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Access Element</em>'.
	 * @see org.module.eer.mm.moduleeer.procedure.AccessElement
	 * @generated
	 */
	EClass getAccessElement();

	/**
	 * Returns the meta object for the reference '{@link org.module.eer.mm.moduleeer.procedure.AccessElement#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity</em>'.
	 * @see org.module.eer.mm.moduleeer.procedure.AccessElement#getEntity()
	 * @see #getAccessElement()
	 * @generated
	 */
	EReference getAccessElement_Entity();

	/**
	 * Returns the meta object for the attribute '{@link org.module.eer.mm.moduleeer.procedure.AccessElement#getAccessType <em>Access Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Type</em>'.
	 * @see org.module.eer.mm.moduleeer.procedure.AccessElement#getAccessType()
	 * @see #getAccessElement()
	 * @generated
	 */
	EAttribute getAccessElement_AccessType();

	/**
	 * Returns the meta object for enum '{@link org.module.eer.mm.moduleeer.procedure.ProcedureType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type</em>'.
	 * @see org.module.eer.mm.moduleeer.procedure.ProcedureType
	 * @generated
	 */
	EEnum getProcedureType();

	/**
	 * Returns the meta object for enum '{@link org.module.eer.mm.moduleeer.procedure.OperationType <em>Operation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operation Type</em>'.
	 * @see org.module.eer.mm.moduleeer.procedure.OperationType
	 * @generated
	 */
	EEnum getOperationType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProcedureFactory getProcedureFactory();

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
		 * The meta object literal for the '{@link org.module.eer.mm.moduleeer.procedure.impl.ProcedureImpl <em>Procedure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.module.eer.mm.moduleeer.procedure.impl.ProcedureImpl
		 * @see org.module.eer.mm.moduleeer.procedure.impl.ProcedurePackageImpl#getProcedure()
		 * @generated
		 */
		EClass PROCEDURE = eINSTANCE.getProcedure();

		/**
		 * The meta object literal for the '<em><b>Procedure Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCEDURE__PROCEDURE_TYPE = eINSTANCE.getProcedure_ProcedureType();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCEDURE__EVENT = eINSTANCE.getProcedure_Event();

		/**
		 * The meta object literal for the '<em><b>Access Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCEDURE__ACCESS_ELEMENTS = eINSTANCE.getProcedure_AccessElements();

		/**
		 * The meta object literal for the '{@link org.module.eer.mm.moduleeer.procedure.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.module.eer.mm.moduleeer.procedure.impl.EventImpl
		 * @see org.module.eer.mm.moduleeer.procedure.impl.ProcedurePackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Integrity Procedures</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__INTEGRITY_PROCEDURES = eINSTANCE.getEvent_IntegrityProcedures();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__DESCRIPTION = eINSTANCE.getEvent_Description();

		/**
		 * The meta object literal for the '{@link org.module.eer.mm.moduleeer.procedure.impl.AccessElementImpl <em>Access Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.module.eer.mm.moduleeer.procedure.impl.AccessElementImpl
		 * @see org.module.eer.mm.moduleeer.procedure.impl.ProcedurePackageImpl#getAccessElement()
		 * @generated
		 */
		EClass ACCESS_ELEMENT = eINSTANCE.getAccessElement();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESS_ELEMENT__ENTITY = eINSTANCE.getAccessElement_Entity();

		/**
		 * The meta object literal for the '<em><b>Access Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESS_ELEMENT__ACCESS_TYPE = eINSTANCE.getAccessElement_AccessType();

		/**
		 * The meta object literal for the '{@link org.module.eer.mm.moduleeer.procedure.ProcedureType <em>Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.module.eer.mm.moduleeer.procedure.ProcedureType
		 * @see org.module.eer.mm.moduleeer.procedure.impl.ProcedurePackageImpl#getProcedureType()
		 * @generated
		 */
		EEnum PROCEDURE_TYPE = eINSTANCE.getProcedureType();

		/**
		 * The meta object literal for the '{@link org.module.eer.mm.moduleeer.procedure.OperationType <em>Operation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.module.eer.mm.moduleeer.procedure.OperationType
		 * @see org.module.eer.mm.moduleeer.procedure.impl.ProcedurePackageImpl#getOperationType()
		 * @generated
		 */
		EEnum OPERATION_TYPE = eINSTANCE.getOperationType();

	}

} //ProcedurePackage
