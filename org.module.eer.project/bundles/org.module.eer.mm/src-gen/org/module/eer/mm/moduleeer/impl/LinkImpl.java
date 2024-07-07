/**
 */
package org.module.eer.mm.moduleeer.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.module.eer.mm.moduleeer.CardinalityType;
import org.module.eer.mm.moduleeer.CompletenessType;
import org.module.eer.mm.moduleeer.Link;
import org.module.eer.mm.moduleeer.ModuleeerPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.module.eer.mm.moduleeer.impl.LinkImpl#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link org.module.eer.mm.moduleeer.impl.LinkImpl#getCompleteness <em>Completeness</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class LinkImpl extends NameElementImpl implements Link {
	/**
	 * The default value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected static final CardinalityType CARDINALITY_EDEFAULT = CardinalityType.ZERO_TO_ONE;

	/**
	 * The cached value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected CardinalityType cardinality = CARDINALITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompleteness() <em>Completeness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompleteness()
	 * @generated
	 * @ordered
	 */
	protected static final CompletenessType COMPLETENESS_EDEFAULT = CompletenessType.PARTIAL;

	/**
	 * The cached value of the '{@link #getCompleteness() <em>Completeness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompleteness()
	 * @generated
	 * @ordered
	 */
	protected CompletenessType completeness = COMPLETENESS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModuleeerPackage.Literals.LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CardinalityType getCardinality() {
		return cardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCardinality(CardinalityType newCardinality) {
		CardinalityType oldCardinality = cardinality;
		cardinality = newCardinality == null ? CARDINALITY_EDEFAULT : newCardinality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModuleeerPackage.LINK__CARDINALITY, oldCardinality,
					cardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompletenessType getCompleteness() {
		return completeness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCompleteness(CompletenessType newCompleteness) {
		CompletenessType oldCompleteness = completeness;
		completeness = newCompleteness == null ? COMPLETENESS_EDEFAULT : newCompleteness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModuleeerPackage.LINK__COMPLETENESS, oldCompleteness,
					completeness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModuleeerPackage.LINK__CARDINALITY:
			return getCardinality();
		case ModuleeerPackage.LINK__COMPLETENESS:
			return getCompleteness();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ModuleeerPackage.LINK__CARDINALITY:
			setCardinality((CardinalityType) newValue);
			return;
		case ModuleeerPackage.LINK__COMPLETENESS:
			setCompleteness((CompletenessType) newValue);
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
		case ModuleeerPackage.LINK__CARDINALITY:
			setCardinality(CARDINALITY_EDEFAULT);
			return;
		case ModuleeerPackage.LINK__COMPLETENESS:
			setCompleteness(COMPLETENESS_EDEFAULT);
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
		case ModuleeerPackage.LINK__CARDINALITY:
			return cardinality != CARDINALITY_EDEFAULT;
		case ModuleeerPackage.LINK__COMPLETENESS:
			return completeness != COMPLETENESS_EDEFAULT;
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
		result.append(" (cardinality: ");
		result.append(cardinality);
		result.append(", completeness: ");
		result.append(completeness);
		result.append(')');
		return result.toString();
	}

} //LinkImpl
