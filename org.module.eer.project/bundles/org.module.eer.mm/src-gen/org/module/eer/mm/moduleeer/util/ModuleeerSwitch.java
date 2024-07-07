/**
 */
package org.module.eer.mm.moduleeer.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.module.eer.mm.moduleeer.ModuleeerPackage
 * @generated
 */
public class ModuleeerSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModuleeerPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleeerSwitch() {
		if (modelPackage == null) {
			modelPackage = ModuleeerPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case ModuleeerPackage.MEER_MODEL: {
			MEERModel meerModel = (MEERModel) theEObject;
			T result = caseMEERModel(meerModel);
			if (result == null)
				result = caseNameElement(meerModel);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModuleeerPackage.ELEMENT: {
			Element element = (Element) theEObject;
			T result = caseElement(element);
			if (result == null)
				result = caseModularizableElement(element);
			if (result == null)
				result = caseNameElement(element);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModuleeerPackage.MODULE: {
			org.module.eer.mm.moduleeer.Module module = (org.module.eer.mm.moduleeer.Module) theEObject;
			T result = caseModule(module);
			if (result == null)
				result = caseModularizableElement(module);
			if (result == null)
				result = caseNameElement(module);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModuleeerPackage.NAME_ELEMENT: {
			NameElement nameElement = (NameElement) theEObject;
			T result = caseNameElement(nameElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModuleeerPackage.ENTITY_TYPE: {
			EntityType entityType = (EntityType) theEObject;
			T result = caseEntityType(entityType);
			if (result == null)
				result = caseElement(entityType);
			if (result == null)
				result = caseModularizableElement(entityType);
			if (result == null)
				result = caseNameElement(entityType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModuleeerPackage.RELATIONSHIP_TYPE: {
			RelationshipType relationshipType = (RelationshipType) theEObject;
			T result = caseRelationshipType(relationshipType);
			if (result == null)
				result = caseElement(relationshipType);
			if (result == null)
				result = caseModularizableElement(relationshipType);
			if (result == null)
				result = caseNameElement(relationshipType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModuleeerPackage.SINGLE_ATTRIBUTE: {
			SingleAttribute singleAttribute = (SingleAttribute) theEObject;
			T result = caseSingleAttribute(singleAttribute);
			if (result == null)
				result = caseAttribute(singleAttribute);
			if (result == null)
				result = caseNameElement(singleAttribute);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModuleeerPackage.MODULARIZABLE_ELEMENT: {
			ModularizableElement modularizableElement = (ModularizableElement) theEObject;
			T result = caseModularizableElement(modularizableElement);
			if (result == null)
				result = caseNameElement(modularizableElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModuleeerPackage.ATTRIBUTE: {
			Attribute attribute = (Attribute) theEObject;
			T result = caseAttribute(attribute);
			if (result == null)
				result = caseNameElement(attribute);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModuleeerPackage.COMPOSITE_ATTRIBUTE: {
			CompositeAttribute compositeAttribute = (CompositeAttribute) theEObject;
			T result = caseCompositeAttribute(compositeAttribute);
			if (result == null)
				result = caseAttribute(compositeAttribute);
			if (result == null)
				result = caseNameElement(compositeAttribute);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModuleeerPackage.LINK: {
			Link link = (Link) theEObject;
			T result = caseLink(link);
			if (result == null)
				result = caseNameElement(link);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModuleeerPackage.GENERALIZATION: {
			Generalization generalization = (Generalization) theEObject;
			T result = caseGeneralization(generalization);
			if (result == null)
				result = caseNameElement(generalization);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModuleeerPackage.AGGREGATION: {
			Aggregation aggregation = (Aggregation) theEObject;
			T result = caseAggregation(aggregation);
			if (result == null)
				result = caseLink(aggregation);
			if (result == null)
				result = caseNameElement(aggregation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModuleeerPackage.LINK_TO_ENTITY: {
			LinkToEntity linkToEntity = (LinkToEntity) theEObject;
			T result = caseLinkToEntity(linkToEntity);
			if (result == null)
				result = caseLink(linkToEntity);
			if (result == null)
				result = caseNameElement(linkToEntity);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MEER Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MEER Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMEERModel(MEERModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModule(org.module.eer.mm.moduleeer.Module object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Name Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Name Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNameElement(NameElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityType(EntityType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relationship Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relationship Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationshipType(RelationshipType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleAttribute(SingleAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modularizable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modularizable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModularizableElement(ModularizableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttribute(Attribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeAttribute(CompositeAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLink(Link object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aggregation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aggregation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAggregation(Aggregation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link To Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link To Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkToEntity(LinkToEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generalization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generalization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralization(Generalization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ModuleeerSwitch
