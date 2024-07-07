/**
 */
package org.module.eer.mm.moduleeer.subsystem.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.module.eer.mm.moduleeer.ModuleeerPackage;

import org.module.eer.mm.moduleeer.impl.ModuleeerPackageImpl;

import org.module.eer.mm.moduleeer.procedure.ProcedurePackage;

import org.module.eer.mm.moduleeer.procedure.impl.ProcedurePackageImpl;

import org.module.eer.mm.moduleeer.subsystem.ModuleSubsystem;
import org.module.eer.mm.moduleeer.subsystem.SubsystemFactory;
import org.module.eer.mm.moduleeer.subsystem.SubsystemPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SubsystemPackageImpl extends EPackageImpl implements SubsystemPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleSubsystemEClass = null;

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
	 * @see org.module.eer.mm.moduleeer.subsystem.SubsystemPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SubsystemPackageImpl() {
		super(eNS_URI, SubsystemFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SubsystemPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SubsystemPackage init() {
		if (isInited)
			return (SubsystemPackage) EPackage.Registry.INSTANCE.getEPackage(SubsystemPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSubsystemPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SubsystemPackageImpl theSubsystemPackage = registeredSubsystemPackage instanceof SubsystemPackageImpl
				? (SubsystemPackageImpl) registeredSubsystemPackage
				: new SubsystemPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ModuleeerPackage.eNS_URI);
		ModuleeerPackageImpl theModuleeerPackage = (ModuleeerPackageImpl) (registeredPackage instanceof ModuleeerPackageImpl
				? registeredPackage
				: ModuleeerPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ProcedurePackage.eNS_URI);
		ProcedurePackageImpl theProcedurePackage = (ProcedurePackageImpl) (registeredPackage instanceof ProcedurePackageImpl
				? registeredPackage
				: ProcedurePackage.eINSTANCE);

		// Create package meta-data objects
		theSubsystemPackage.createPackageContents();
		theModuleeerPackage.createPackageContents();
		theProcedurePackage.createPackageContents();

		// Initialize created meta-data
		theSubsystemPackage.initializePackageContents();
		theModuleeerPackage.initializePackageContents();
		theProcedurePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSubsystemPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SubsystemPackage.eNS_URI, theSubsystemPackage);
		return theSubsystemPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModuleSubsystem() {
		return moduleSubsystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModuleSubsystem_Procedures() {
		return (EReference) moduleSubsystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubsystemFactory getSubsystemFactory() {
		return (SubsystemFactory) getEFactoryInstance();
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
		moduleSubsystemEClass = createEClass(MODULE_SUBSYSTEM);
		createEReference(moduleSubsystemEClass, MODULE_SUBSYSTEM__PROCEDURES);
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
		ProcedurePackage theProcedurePackage = (ProcedurePackage) EPackage.Registry.INSTANCE
				.getEPackage(ProcedurePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		moduleSubsystemEClass.getESuperTypes().add(theModuleeerPackage.getNameElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(moduleSubsystemEClass, ModuleSubsystem.class, "ModuleSubsystem", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModuleSubsystem_Procedures(), theProcedurePackage.getProcedure(), null, "procedures", null, 0,
				-1, ModuleSubsystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //SubsystemPackageImpl
