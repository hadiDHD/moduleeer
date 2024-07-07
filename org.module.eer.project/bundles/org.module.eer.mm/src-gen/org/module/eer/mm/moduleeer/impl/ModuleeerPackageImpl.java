/**
 */
package org.module.eer.mm.moduleeer.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.module.eer.mm.moduleeer.Aggregation;
import org.module.eer.mm.moduleeer.Attribute;
import org.module.eer.mm.moduleeer.AttributeType;
import org.module.eer.mm.moduleeer.CardinalityType;
import org.module.eer.mm.moduleeer.CompletenessType;
import org.module.eer.mm.moduleeer.CompositeAttribute;
import org.module.eer.mm.moduleeer.DisjointnessType;
import org.module.eer.mm.moduleeer.Element;
import org.module.eer.mm.moduleeer.EntityType;
import org.module.eer.mm.moduleeer.Generalization;
import org.module.eer.mm.moduleeer.Link;
import org.module.eer.mm.moduleeer.LinkToEntity;
import org.module.eer.mm.moduleeer.MEERModel;
import org.module.eer.mm.moduleeer.ModularizableElement;
import org.module.eer.mm.moduleeer.ModuleeerFactory;
import org.module.eer.mm.moduleeer.ModuleeerPackage;
import org.module.eer.mm.moduleeer.NameElement;
import org.module.eer.mm.moduleeer.RelationshipType;
import org.module.eer.mm.moduleeer.SingleAttribute;

import org.module.eer.mm.moduleeer.procedure.ProcedurePackage;

import org.module.eer.mm.moduleeer.procedure.impl.ProcedurePackageImpl;

import org.module.eer.mm.moduleeer.subsystem.SubsystemPackage;

import org.module.eer.mm.moduleeer.subsystem.impl.SubsystemPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModuleeerPackageImpl extends EPackageImpl implements ModuleeerPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass meerModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modularizableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aggregationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkToEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum attributeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cardinalityTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum disjointnessTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum completenessTypeEEnum = null;

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
	 * @see org.module.eer.mm.moduleeer.ModuleeerPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModuleeerPackageImpl() {
		super(eNS_URI, ModuleeerFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ModuleeerPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModuleeerPackage init() {
		if (isInited)
			return (ModuleeerPackage) EPackage.Registry.INSTANCE.getEPackage(ModuleeerPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredModuleeerPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ModuleeerPackageImpl theModuleeerPackage = registeredModuleeerPackage instanceof ModuleeerPackageImpl
				? (ModuleeerPackageImpl) registeredModuleeerPackage
				: new ModuleeerPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SubsystemPackage.eNS_URI);
		SubsystemPackageImpl theSubsystemPackage = (SubsystemPackageImpl) (registeredPackage instanceof SubsystemPackageImpl
				? registeredPackage
				: SubsystemPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ProcedurePackage.eNS_URI);
		ProcedurePackageImpl theProcedurePackage = (ProcedurePackageImpl) (registeredPackage instanceof ProcedurePackageImpl
				? registeredPackage
				: ProcedurePackage.eINSTANCE);

		// Create package meta-data objects
		theModuleeerPackage.createPackageContents();
		theSubsystemPackage.createPackageContents();
		theProcedurePackage.createPackageContents();

		// Initialize created meta-data
		theModuleeerPackage.initializePackageContents();
		theSubsystemPackage.initializePackageContents();
		theProcedurePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theModuleeerPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModuleeerPackage.eNS_URI, theModuleeerPackage);
		return theModuleeerPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMEERModel() {
		return meerModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMEERModel_Subsystems() {
		return (EReference) meerModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMEERModel_Modules() {
		return (EReference) meerModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getElement() {
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElement_Attributes() {
		return (EReference) elementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElement_AccessElement() {
		return (EReference) elementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElement_IsWeak() {
		return (EAttribute) elementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModule() {
		return moduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModule_Events() {
		return (EReference) moduleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModule_ModularizableElements() {
		return (EReference) moduleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNameElement() {
		return nameElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNameElement_Name() {
		return (EAttribute) nameElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEntityType() {
		return entityTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEntityType_Generalizations() {
		return (EReference) entityTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEntityType_Specializations() {
		return (EReference) entityTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEntityType_Links() {
		return (EReference) entityTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRelationshipType() {
		return relationshipTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelationshipType_Generalizes() {
		return (EReference) relationshipTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelationshipType_LinksToEntities() {
		return (EReference) relationshipTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelationshipType_Aggregations() {
		return (EReference) relationshipTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelationshipType_Associations() {
		return (EReference) relationshipTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSingleAttribute() {
		return singleAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSingleAttribute_Type() {
		return (EAttribute) singleAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSingleAttribute_IsKey() {
		return (EAttribute) singleAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModularizableElement() {
		return modularizableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCompositeAttribute() {
		return compositeAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompositeAttribute_Attributes() {
		return (EReference) compositeAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLink() {
		return linkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLink_Cardinality() {
		return (EAttribute) linkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLink_Completeness() {
		return (EAttribute) linkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAggregation() {
		return aggregationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAggregation_To() {
		return (EReference) aggregationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLinkToEntity() {
		return linkToEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLinkToEntity_Entity() {
		return (EReference) linkToEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGeneralization() {
		return generalizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGeneralization_Entity() {
		return (EReference) generalizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGeneralization_Completeness() {
		return (EAttribute) generalizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGeneralization_Disjointness() {
		return (EAttribute) generalizationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAttributeType() {
		return attributeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCardinalityType() {
		return cardinalityTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDisjointnessType() {
		return disjointnessTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCompletenessType() {
		return completenessTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModuleeerFactory getModuleeerFactory() {
		return (ModuleeerFactory) getEFactoryInstance();
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
		meerModelEClass = createEClass(MEER_MODEL);
		createEReference(meerModelEClass, MEER_MODEL__SUBSYSTEMS);
		createEReference(meerModelEClass, MEER_MODEL__MODULES);

		elementEClass = createEClass(ELEMENT);
		createEReference(elementEClass, ELEMENT__ATTRIBUTES);
		createEReference(elementEClass, ELEMENT__ACCESS_ELEMENT);
		createEAttribute(elementEClass, ELEMENT__IS_WEAK);

		moduleEClass = createEClass(MODULE);
		createEReference(moduleEClass, MODULE__EVENTS);
		createEReference(moduleEClass, MODULE__MODULARIZABLE_ELEMENTS);

		nameElementEClass = createEClass(NAME_ELEMENT);
		createEAttribute(nameElementEClass, NAME_ELEMENT__NAME);

		entityTypeEClass = createEClass(ENTITY_TYPE);
		createEReference(entityTypeEClass, ENTITY_TYPE__GENERALIZATIONS);
		createEReference(entityTypeEClass, ENTITY_TYPE__SPECIALIZATIONS);
		createEReference(entityTypeEClass, ENTITY_TYPE__LINKS);

		relationshipTypeEClass = createEClass(RELATIONSHIP_TYPE);
		createEReference(relationshipTypeEClass, RELATIONSHIP_TYPE__GENERALIZES);
		createEReference(relationshipTypeEClass, RELATIONSHIP_TYPE__LINKS_TO_ENTITIES);
		createEReference(relationshipTypeEClass, RELATIONSHIP_TYPE__AGGREGATIONS);
		createEReference(relationshipTypeEClass, RELATIONSHIP_TYPE__ASSOCIATIONS);

		singleAttributeEClass = createEClass(SINGLE_ATTRIBUTE);
		createEAttribute(singleAttributeEClass, SINGLE_ATTRIBUTE__TYPE);
		createEAttribute(singleAttributeEClass, SINGLE_ATTRIBUTE__IS_KEY);

		modularizableElementEClass = createEClass(MODULARIZABLE_ELEMENT);

		attributeEClass = createEClass(ATTRIBUTE);

		compositeAttributeEClass = createEClass(COMPOSITE_ATTRIBUTE);
		createEReference(compositeAttributeEClass, COMPOSITE_ATTRIBUTE__ATTRIBUTES);

		linkEClass = createEClass(LINK);
		createEAttribute(linkEClass, LINK__CARDINALITY);
		createEAttribute(linkEClass, LINK__COMPLETENESS);

		generalizationEClass = createEClass(GENERALIZATION);
		createEReference(generalizationEClass, GENERALIZATION__ENTITY);
		createEAttribute(generalizationEClass, GENERALIZATION__COMPLETENESS);
		createEAttribute(generalizationEClass, GENERALIZATION__DISJOINTNESS);

		aggregationEClass = createEClass(AGGREGATION);
		createEReference(aggregationEClass, AGGREGATION__TO);

		linkToEntityEClass = createEClass(LINK_TO_ENTITY);
		createEReference(linkToEntityEClass, LINK_TO_ENTITY__ENTITY);

		// Create enums
		attributeTypeEEnum = createEEnum(ATTRIBUTE_TYPE);
		cardinalityTypeEEnum = createEEnum(CARDINALITY_TYPE);
		disjointnessTypeEEnum = createEEnum(DISJOINTNESS_TYPE);
		completenessTypeEEnum = createEEnum(COMPLETENESS_TYPE);
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
		SubsystemPackage theSubsystemPackage = (SubsystemPackage) EPackage.Registry.INSTANCE
				.getEPackage(SubsystemPackage.eNS_URI);
		ProcedurePackage theProcedurePackage = (ProcedurePackage) EPackage.Registry.INSTANCE
				.getEPackage(ProcedurePackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theSubsystemPackage);
		getESubpackages().add(theProcedurePackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		meerModelEClass.getESuperTypes().add(this.getNameElement());
		elementEClass.getESuperTypes().add(this.getModularizableElement());
		moduleEClass.getESuperTypes().add(this.getModularizableElement());
		entityTypeEClass.getESuperTypes().add(this.getElement());
		relationshipTypeEClass.getESuperTypes().add(this.getElement());
		singleAttributeEClass.getESuperTypes().add(this.getAttribute());
		modularizableElementEClass.getESuperTypes().add(this.getNameElement());
		attributeEClass.getESuperTypes().add(this.getNameElement());
		compositeAttributeEClass.getESuperTypes().add(this.getAttribute());
		linkEClass.getESuperTypes().add(this.getNameElement());
		generalizationEClass.getESuperTypes().add(this.getNameElement());
		aggregationEClass.getESuperTypes().add(this.getLink());
		linkToEntityEClass.getESuperTypes().add(this.getLink());

		// Initialize classes, features, and operations; add parameters
		initEClass(meerModelEClass, MEERModel.class, "MEERModel", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMEERModel_Subsystems(), theSubsystemPackage.getModuleSubsystem(), null, "subsystems", null, 0,
				-1, MEERModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMEERModel_Modules(), this.getModule(), null, "modules", null, 1, -1, MEERModel.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementEClass, Element.class, "Element", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElement_Attributes(), this.getAttribute(), null, "attributes", null, 0, -1, Element.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElement_AccessElement(), theProcedurePackage.getAccessElement(),
				theProcedurePackage.getAccessElement_Entity(), "accessElement", null, 0, -1, Element.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_IsWeak(), ecorePackage.getEBoolean(), "isWeak", null, 0, 1, Element.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moduleEClass, org.module.eer.mm.moduleeer.Module.class, "Module", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModule_Events(), theProcedurePackage.getEvent(), null, "events", null, 0, -1,
				org.module.eer.mm.moduleeer.Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModule_ModularizableElements(), this.getModularizableElement(), null, "modularizableElements",
				null, 1, -1, org.module.eer.mm.moduleeer.Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nameElementEClass, NameElement.class, "NameElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNameElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NameElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityTypeEClass, EntityType.class, "EntityType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntityType_Generalizations(), this.getGeneralization(), null, "generalizations", null, 0, -1,
				EntityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityType_Specializations(), this.getGeneralization(), this.getGeneralization_Entity(),
				"specializations", null, 0, -1, EntityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityType_Links(), this.getLinkToEntity(), this.getLinkToEntity_Entity(), "links", null, 0,
				-1, EntityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationshipTypeEClass, RelationshipType.class, "RelationshipType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationshipType_Generalizes(), this.getRelationshipType(), null, "generalizes", null, 0, -1,
				RelationshipType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationshipType_LinksToEntities(), this.getLinkToEntity(), null, "linksToEntities", null, 2,
				2, RelationshipType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationshipType_Aggregations(), this.getAggregation(), null, "aggregations", null, 0, -1,
				RelationshipType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationshipType_Associations(), this.getLinkToEntity(), null, "associations", null, 0, -1,
				RelationshipType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(singleAttributeEClass, SingleAttribute.class, "SingleAttribute", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSingleAttribute_Type(), this.getAttributeType(), "type", null, 0, 1, SingleAttribute.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSingleAttribute_IsKey(), ecorePackage.getEBoolean(), "isKey", null, 0, 1,
				SingleAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(modularizableElementEClass, ModularizableElement.class, "ModularizableElement", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(attributeEClass, Attribute.class, "Attribute", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(compositeAttributeEClass, CompositeAttribute.class, "CompositeAttribute", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositeAttribute_Attributes(), this.getAttribute(), null, "attributes", null, 0, -1,
				CompositeAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkEClass, Link.class, "Link", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLink_Cardinality(), this.getCardinalityType(), "cardinality", null, 0, 1, Link.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLink_Completeness(), this.getCompletenessType(), "completeness", null, 0, 1, Link.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(generalizationEClass, Generalization.class, "Generalization", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGeneralization_Entity(), this.getEntityType(), this.getEntityType_Specializations(), "entity",
				null, 0, 1, Generalization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneralization_Completeness(), this.getCompletenessType(), "completeness", null, 0, 1,
				Generalization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneralization_Disjointness(), this.getDisjointnessType(), "disjointness", null, 0, 1,
				Generalization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(aggregationEClass, Aggregation.class, "Aggregation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAggregation_To(), this.getRelationshipType(), null, "to", null, 1, 1, Aggregation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkToEntityEClass, LinkToEntity.class, "LinkToEntity", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLinkToEntity_Entity(), this.getEntityType(), this.getEntityType_Links(), "entity", null, 1, 1,
				LinkToEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(attributeTypeEEnum, AttributeType.class, "AttributeType");
		addEEnumLiteral(attributeTypeEEnum, AttributeType.STRING);
		addEEnumLiteral(attributeTypeEEnum, AttributeType.INTEGER);
		addEEnumLiteral(attributeTypeEEnum, AttributeType.BOOLEAN);
		addEEnumLiteral(attributeTypeEEnum, AttributeType.DATE);

		initEEnum(cardinalityTypeEEnum, CardinalityType.class, "CardinalityType");
		addEEnumLiteral(cardinalityTypeEEnum, CardinalityType.ZERO_TO_ONE);
		addEEnumLiteral(cardinalityTypeEEnum, CardinalityType.ZERO_TO_MANY);
		addEEnumLiteral(cardinalityTypeEEnum, CardinalityType.ONE_TO_ONE);
		addEEnumLiteral(cardinalityTypeEEnum, CardinalityType.ONE_TO_MANY);

		initEEnum(disjointnessTypeEEnum, DisjointnessType.class, "DisjointnessType");
		addEEnumLiteral(disjointnessTypeEEnum, DisjointnessType.OVERLAPPING);
		addEEnumLiteral(disjointnessTypeEEnum, DisjointnessType.DISJOINT);

		initEEnum(completenessTypeEEnum, CompletenessType.class, "CompletenessType");
		addEEnumLiteral(completenessTypeEEnum, CompletenessType.PARTIAL);
		addEEnumLiteral(completenessTypeEEnum, CompletenessType.TOTAL);

		// Create resource
		createResource(eNS_URI);
	}

} //ModuleeerPackageImpl
