/**
 */
package org.module.eer.mm.moduleeer.procedure.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.module.eer.mm.moduleeer.impl.ModularizableElementImpl;

import org.module.eer.mm.moduleeer.procedure.AccessElement;
import org.module.eer.mm.moduleeer.procedure.Event;
import org.module.eer.mm.moduleeer.procedure.Procedure;
import org.module.eer.mm.moduleeer.procedure.ProcedurePackage;
import org.module.eer.mm.moduleeer.procedure.ProcedureType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Procedure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.module.eer.mm.moduleeer.procedure.impl.ProcedureImpl#getProcedureType <em>Procedure Type</em>}</li>
 *   <li>{@link org.module.eer.mm.moduleeer.procedure.impl.ProcedureImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link org.module.eer.mm.moduleeer.procedure.impl.ProcedureImpl#getAccessElements <em>Access Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcedureImpl extends ModularizableElementImpl implements Procedure {
	/**
	 * The default value of the '{@link #getProcedureType() <em>Procedure Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureType()
	 * @generated
	 * @ordered
	 */
	protected static final ProcedureType PROCEDURE_TYPE_EDEFAULT = ProcedureType.PRIVATE;

	/**
	 * The cached value of the '{@link #getProcedureType() <em>Procedure Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureType()
	 * @generated
	 * @ordered
	 */
	protected ProcedureType procedureType = PROCEDURE_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEvent() <em>Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected Event event;

	/**
	 * The cached value of the '{@link #getAccessElements() <em>Access Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessElements()
	 * @generated
	 * @ordered
	 */
	protected EList<AccessElement> accessElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcedureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProcedurePackage.Literals.PROCEDURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcedureType getProcedureType() {
		return procedureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProcedureType(ProcedureType newProcedureType) {
		ProcedureType oldProcedureType = procedureType;
		procedureType = newProcedureType == null ? PROCEDURE_TYPE_EDEFAULT : newProcedureType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcedurePackage.PROCEDURE__PROCEDURE_TYPE,
					oldProcedureType, procedureType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Event getEvent() {
		if (event != null && event.eIsProxy()) {
			InternalEObject oldEvent = (InternalEObject) event;
			event = (Event) eResolveProxy(oldEvent);
			if (event != oldEvent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcedurePackage.PROCEDURE__EVENT,
							oldEvent, event));
			}
		}
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event basicGetEvent() {
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEvent(Event newEvent) {
		Event oldEvent = event;
		event = newEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcedurePackage.PROCEDURE__EVENT, oldEvent, event));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AccessElement> getAccessElements() {
		if (accessElements == null) {
			accessElements = new EObjectContainmentEList<AccessElement>(AccessElement.class, this,
					ProcedurePackage.PROCEDURE__ACCESS_ELEMENTS);
		}
		return accessElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ProcedurePackage.PROCEDURE__ACCESS_ELEMENTS:
			return ((InternalEList<?>) getAccessElements()).basicRemove(otherEnd, msgs);
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
		case ProcedurePackage.PROCEDURE__PROCEDURE_TYPE:
			return getProcedureType();
		case ProcedurePackage.PROCEDURE__EVENT:
			if (resolve)
				return getEvent();
			return basicGetEvent();
		case ProcedurePackage.PROCEDURE__ACCESS_ELEMENTS:
			return getAccessElements();
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
		case ProcedurePackage.PROCEDURE__PROCEDURE_TYPE:
			setProcedureType((ProcedureType) newValue);
			return;
		case ProcedurePackage.PROCEDURE__EVENT:
			setEvent((Event) newValue);
			return;
		case ProcedurePackage.PROCEDURE__ACCESS_ELEMENTS:
			getAccessElements().clear();
			getAccessElements().addAll((Collection<? extends AccessElement>) newValue);
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
		case ProcedurePackage.PROCEDURE__PROCEDURE_TYPE:
			setProcedureType(PROCEDURE_TYPE_EDEFAULT);
			return;
		case ProcedurePackage.PROCEDURE__EVENT:
			setEvent((Event) null);
			return;
		case ProcedurePackage.PROCEDURE__ACCESS_ELEMENTS:
			getAccessElements().clear();
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
		case ProcedurePackage.PROCEDURE__PROCEDURE_TYPE:
			return procedureType != PROCEDURE_TYPE_EDEFAULT;
		case ProcedurePackage.PROCEDURE__EVENT:
			return event != null;
		case ProcedurePackage.PROCEDURE__ACCESS_ELEMENTS:
			return accessElements != null && !accessElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (procedureType: ");
		result.append(procedureType);
		result.append(')');
		return result.toString();
	}

} //ProcedureImpl
