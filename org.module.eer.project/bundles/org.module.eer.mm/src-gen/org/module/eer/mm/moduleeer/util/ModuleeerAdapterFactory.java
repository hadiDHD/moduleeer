/**
 */
package org.module.eer.mm.moduleeer.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.module.eer.mm.moduleeer.Aggregation;
import org.module.eer.mm.moduleeer.Attribute;
import org.module.eer.mm.moduleeer.CompositeAttribute;
import org.module.eer.mm.moduleeer.Element;
import org.module.eer.mm.moduleeer.EntityType;
import org.module.eer.mm.moduleeer.Generalization;
import org.module.eer.mm.moduleeer.Link;
import org.module.eer.mm.moduleeer.LinkToEntity;
import org.module.eer.mm.moduleeer.MEERModel;
import org.module.eer.mm.moduleeer.ModularizableElement;
import org.module.eer.mm.moduleeer.ModuleeerPackage;
import org.module.eer.mm.moduleeer.NameElement;
import org.module.eer.mm.moduleeer.RelationshipType;
import org.module.eer.mm.moduleeer.SingleAttribute;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.module.eer.mm.moduleeer.ModuleeerPackage
 * @generated
 */
public class ModuleeerAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModuleeerPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleeerAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ModuleeerPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleeerSwitch<Adapter> modelSwitch = new ModuleeerSwitch<Adapter>() {
		@Override
		public Adapter caseMEERModel(MEERModel object) {
			return createMEERModelAdapter();
		}

		@Override
		public Adapter caseElement(Element object) {
			return createElementAdapter();
		}

		@Override
		public Adapter caseModule(org.module.eer.mm.moduleeer.Module object) {
			return createModuleAdapter();
		}

		@Override
		public Adapter caseNameElement(NameElement object) {
			return createNameElementAdapter();
		}

		@Override
		public Adapter caseEntityType(EntityType object) {
			return createEntityTypeAdapter();
		}

		@Override
		public Adapter caseRelationshipType(RelationshipType object) {
			return createRelationshipTypeAdapter();
		}

		@Override
		public Adapter caseSingleAttribute(SingleAttribute object) {
			return createSingleAttributeAdapter();
		}

		@Override
		public Adapter caseModularizableElement(ModularizableElement object) {
			return createModularizableElementAdapter();
		}

		@Override
		public Adapter caseAttribute(Attribute object) {
			return createAttributeAdapter();
		}

		@Override
		public Adapter caseCompositeAttribute(CompositeAttribute object) {
			return createCompositeAttributeAdapter();
		}

		@Override
		public Adapter caseLink(Link object) {
			return createLinkAdapter();
		}

		@Override
		public Adapter caseGeneralization(Generalization object) {
			return createGeneralizationAdapter();
		}

		@Override
		public Adapter caseAggregation(Aggregation object) {
			return createAggregationAdapter();
		}

		@Override
		public Adapter caseLinkToEntity(LinkToEntity object) {
			return createLinkToEntityAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.module.eer.mm.moduleeer.MEERModel <em>MEER Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.module.eer.mm.moduleeer.MEERModel
	 * @generated
	 */
	public Adapter createMEERModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.module.eer.mm.moduleeer.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.module.eer.mm.moduleeer.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.module.eer.mm.moduleeer.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.module.eer.mm.moduleeer.Module
	 * @generated
	 */
	public Adapter createModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.module.eer.mm.moduleeer.NameElement <em>Name Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.module.eer.mm.moduleeer.NameElement
	 * @generated
	 */
	public Adapter createNameElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.module.eer.mm.moduleeer.EntityType <em>Entity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.module.eer.mm.moduleeer.EntityType
	 * @generated
	 */
	public Adapter createEntityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.module.eer.mm.moduleeer.RelationshipType <em>Relationship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.module.eer.mm.moduleeer.RelationshipType
	 * @generated
	 */
	public Adapter createRelationshipTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.module.eer.mm.moduleeer.SingleAttribute <em>Single Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.module.eer.mm.moduleeer.SingleAttribute
	 * @generated
	 */
	public Adapter createSingleAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.module.eer.mm.moduleeer.ModularizableElement <em>Modularizable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.module.eer.mm.moduleeer.ModularizableElement
	 * @generated
	 */
	public Adapter createModularizableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.module.eer.mm.moduleeer.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.module.eer.mm.moduleeer.Attribute
	 * @generated
	 */
	public Adapter createAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.module.eer.mm.moduleeer.CompositeAttribute <em>Composite Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.module.eer.mm.moduleeer.CompositeAttribute
	 * @generated
	 */
	public Adapter createCompositeAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.module.eer.mm.moduleeer.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.module.eer.mm.moduleeer.Link
	 * @generated
	 */
	public Adapter createLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.module.eer.mm.moduleeer.Aggregation <em>Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.module.eer.mm.moduleeer.Aggregation
	 * @generated
	 */
	public Adapter createAggregationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.module.eer.mm.moduleeer.LinkToEntity <em>Link To Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.module.eer.mm.moduleeer.LinkToEntity
	 * @generated
	 */
	public Adapter createLinkToEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.module.eer.mm.moduleeer.Generalization <em>Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.module.eer.mm.moduleeer.Generalization
	 * @generated
	 */
	public Adapter createGeneralizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ModuleeerAdapterFactory
