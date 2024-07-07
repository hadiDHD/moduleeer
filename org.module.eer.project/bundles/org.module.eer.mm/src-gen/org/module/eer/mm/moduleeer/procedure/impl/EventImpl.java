/**
 */
package org.module.eer.mm.moduleeer.procedure.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.module.eer.mm.moduleeer.impl.NameElementImpl;

import org.module.eer.mm.moduleeer.procedure.Event;
import org.module.eer.mm.moduleeer.procedure.Procedure;
import org.module.eer.mm.moduleeer.procedure.ProcedurePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.module.eer.mm.moduleeer.procedure.impl.EventImpl#getIntegrityProcedures <em>Integrity Procedures</em>}</li>
 *   <li>{@link org.module.eer.mm.moduleeer.procedure.impl.EventImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventImpl extends NameElementImpl implements Event {
	/**
	 * The cached value of the '{@link #getIntegrityProcedures() <em>Integrity Procedures</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegrityProcedures()
	 * @generated
	 * @ordered
	 */
	protected EList<Procedure> integrityProcedures;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProcedurePackage.Literals.EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Procedure> getIntegrityProcedures() {
		if (integrityProcedures == null) {
			integrityProcedures = new EObjectResolvingEList<Procedure>(Procedure.class, this,
					ProcedurePackage.EVENT__INTEGRITY_PROCEDURES);
		}
		return integrityProcedures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcedurePackage.EVENT__DESCRIPTION, oldDescription,
					description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ProcedurePackage.EVENT__INTEGRITY_PROCEDURES:
			return getIntegrityProcedures();
		case ProcedurePackage.EVENT__DESCRIPTION:
			return getDescription();
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
		case ProcedurePackage.EVENT__INTEGRITY_PROCEDURES:
			getIntegrityProcedures().clear();
			getIntegrityProcedures().addAll((Collection<? extends Procedure>) newValue);
			return;
		case ProcedurePackage.EVENT__DESCRIPTION:
			setDescription((String) newValue);
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
		case ProcedurePackage.EVENT__INTEGRITY_PROCEDURES:
			getIntegrityProcedures().clear();
			return;
		case ProcedurePackage.EVENT__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
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
		case ProcedurePackage.EVENT__INTEGRITY_PROCEDURES:
			return integrityProcedures != null && !integrityProcedures.isEmpty();
		case ProcedurePackage.EVENT__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
		result.append(" (description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //EventImpl
