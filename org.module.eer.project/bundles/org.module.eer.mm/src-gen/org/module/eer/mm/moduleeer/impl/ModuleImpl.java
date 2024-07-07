/**
 */
package org.module.eer.mm.moduleeer.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.module.eer.mm.moduleeer.ModularizableElement;
import org.module.eer.mm.moduleeer.ModuleeerPackage;

import org.module.eer.mm.moduleeer.procedure.Event;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.module.eer.mm.moduleeer.impl.ModuleImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link org.module.eer.mm.moduleeer.impl.ModuleImpl#getModularizableElements <em>Modularizable Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModuleImpl extends ModularizableElementImpl implements org.module.eer.mm.moduleeer.Module {
	/**
	 * The cached value of the '{@link #getEvents() <em>Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> events;

	/**
	 * The cached value of the '{@link #getModularizableElements() <em>Modularizable Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModularizableElements()
	 * @generated
	 * @ordered
	 */
	protected EList<ModularizableElement> modularizableElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModuleeerPackage.Literals.MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Event> getEvents() {
		if (events == null) {
			events = new EObjectContainmentEList<Event>(Event.class, this, ModuleeerPackage.MODULE__EVENTS);
		}
		return events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ModularizableElement> getModularizableElements() {
		if (modularizableElements == null) {
			modularizableElements = new EObjectContainmentEList<ModularizableElement>(ModularizableElement.class, this,
					ModuleeerPackage.MODULE__MODULARIZABLE_ELEMENTS);
		}
		return modularizableElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ModuleeerPackage.MODULE__EVENTS:
			return ((InternalEList<?>) getEvents()).basicRemove(otherEnd, msgs);
		case ModuleeerPackage.MODULE__MODULARIZABLE_ELEMENTS:
			return ((InternalEList<?>) getModularizableElements()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModuleeerPackage.MODULE__EVENTS:
			return getEvents();
		case ModuleeerPackage.MODULE__MODULARIZABLE_ELEMENTS:
			return getModularizableElements();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ModuleeerPackage.MODULE__EVENTS:
			getEvents().clear();
			getEvents().addAll((Collection<? extends Event>) newValue);
			return;
		case ModuleeerPackage.MODULE__MODULARIZABLE_ELEMENTS:
			getModularizableElements().clear();
			getModularizableElements().addAll((Collection<? extends ModularizableElement>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ModuleeerPackage.MODULE__EVENTS:
			getEvents().clear();
			return;
		case ModuleeerPackage.MODULE__MODULARIZABLE_ELEMENTS:
			getModularizableElements().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ModuleeerPackage.MODULE__EVENTS:
			return events != null && !events.isEmpty();
		case ModuleeerPackage.MODULE__MODULARIZABLE_ELEMENTS:
			return modularizableElements != null && !modularizableElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModuleImpl
