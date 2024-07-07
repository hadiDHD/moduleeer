/**
 */
package org.module.eer.mm.moduleeer.procedure.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.module.eer.mm.moduleeer.ModuleeerPackage;

import org.module.eer.mm.moduleeer.impl.ModuleeerPackageImpl;

import org.module.eer.mm.moduleeer.procedure.AccessElement;
import org.module.eer.mm.moduleeer.procedure.Event;
import org.module.eer.mm.moduleeer.procedure.OperationType;
import org.module.eer.mm.moduleeer.procedure.Procedure;
import org.module.eer.mm.moduleeer.procedure.ProcedureFactory;
import org.module.eer.mm.moduleeer.procedure.ProcedurePackage;
import org.module.eer.mm.moduleeer.procedure.ProcedureType;

import org.module.eer.mm.moduleeer.subsystem.SubsystemPackage;

import org.module.eer.mm.moduleeer.subsystem.impl.SubsystemPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProcedurePackageImpl extends EPackageImpl implements ProcedurePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procedureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum procedureTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum operationTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.module.eer.mm.moduleeer.procedure.ProcedurePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ProcedurePackageImpl() {
		super(eNS_URI, ProcedureFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ProcedurePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ProcedurePackage init() {
		if (isInited)
			return (ProcedurePackage) EPackage.Registry.INSTANCE.getEPackage(ProcedurePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredProcedurePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ProcedurePackageImpl theProcedurePackage = registeredProcedurePackage instanceof ProcedurePackageImpl
				? (ProcedurePackageImpl) registeredProcedurePackage
				: new ProcedurePackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ModuleeerPackage.eNS_URI);
		ModuleeerPackageImpl theModuleeerPackage = (ModuleeerPackageImpl) (registeredPackage instanceof ModuleeerPackageImpl
				? registeredPackage
				: ModuleeerPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SubsystemPackage.eNS_URI);
		SubsystemPackageImpl theSubsystemPackage = (SubsystemPackageImpl) (registeredPackage instanceof SubsystemPackageImpl
				? registeredPackage
				: SubsystemPackage.eINSTANCE);

		// Create package meta-data objects
		theProcedurePackage.createPackageContents();
		theModuleeerPackage.createPackageContents();
		theSubsystemPackage.createPackageContents();

		// Initialize created meta-data
		theProcedurePackage.initializePackageContents();
		theModuleeerPackage.initializePackageContents();
		theSubsystemPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theProcedurePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ProcedurePackage.eNS_URI, theProcedurePackage);
		return theProcedurePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcedure() {
		return procedureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProcedure_ProcedureType() {
		return (EAttribute) procedureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcedure_Event() {
		return (EReference) procedureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcedure_AccessElements() {
		return (EReference) procedureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEvent() {
		return eventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEvent_IntegrityProcedures() {
		return (EReference) eventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvent_Description() {
		return (EAttribute) eventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAccessElement() {
		return accessElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAccessElement_Entity() {
		return (EReference) accessElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccessElement_AccessType() {
		return (EAttribute) accessElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getProcedureType() {
		return procedureTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getOperationType() {
		return operationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcedureFactory getProcedureFactory() {
		return (ProcedureFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		procedureEClass = createEClass(PROCEDURE);
		createEAttribute(procedureEClass, PROCEDURE__PROCEDURE_TYPE);
		createEReference(procedureEClass, PROCEDURE__EVENT);
		createEReference(procedureEClass, PROCEDURE__ACCESS_ELEMENTS);

		eventEClass = createEClass(EVENT);
		createEReference(eventEClass, EVENT__INTEGRITY_PROCEDURES);
		createEAttribute(eventEClass, EVENT__DESCRIPTION);

		accessElementEClass = createEClass(ACCESS_ELEMENT);
		createEReference(accessElementEClass, ACCESS_ELEMENT__ENTITY);
		createEAttribute(accessElementEClass, ACCESS_ELEMENT__ACCESS_TYPE);

		// Create enums
		procedureTypeEEnum = createEEnum(PROCEDURE_TYPE);
		operationTypeEEnum = createEEnum(OPERATION_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ModuleeerPackage theModuleeerPackage = (ModuleeerPackage) EPackage.Registry.INSTANCE
				.getEPackage(ModuleeerPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		procedureEClass.getESuperTypes().add(theModuleeerPackage.getModularizableElement());
		eventEClass.getESuperTypes().add(theModuleeerPackage.getNameElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(procedureEClass, Procedure.class, "Procedure", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcedure_ProcedureType(), this.getProcedureType(), "procedureType", null, 0, 1,
				Procedure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getProcedure_Event(), this.getEvent(), null, "event", null, 0, 1, Procedure.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getProcedure_AccessElements(), this.getAccessElement(), null, "accessElements", null, 0, -1,
				Procedure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventEClass, Event.class, "Event", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEvent_IntegrityProcedures(), this.getProcedure(), null, "integrityProcedures", null, 0, -1,
				Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvent_Description(), ecorePackage.getEString(), "description", null, 0, 1, Event.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(accessElementEClass, AccessElement.class, "AccessElement", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAccessElement_Entity(), theModuleeerPackage.getElement(),
				theModuleeerPackage.getElement_AccessElement(), "entity", null, 1, 1, AccessElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAccessElement_AccessType(), this.getOperationType(), "accessType", null, 0, 1,
				AccessElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(procedureTypeEEnum, ProcedureType.class, "ProcedureType");
		addEEnumLiteral(procedureTypeEEnum, ProcedureType.PRIVATE);
		addEEnumLiteral(procedureTypeEEnum, ProcedureType.PUBLIC);
		addEEnumLiteral(procedureTypeEEnum, ProcedureType.REFERENCIAL_INTEGRITY);

		initEEnum(operationTypeEEnum, OperationType.class, "OperationType");
		addEEnumLiteral(operationTypeEEnum, OperationType.READ);
		addEEnumLiteral(operationTypeEEnum, OperationType.READ_WRITE);
	}

} //ProcedurePackageImpl
