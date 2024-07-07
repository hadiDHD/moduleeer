/**
 */
package org.module.eer.mm.moduleeer.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.module.eer.mm.moduleeer.CompletenessType;
import org.module.eer.mm.moduleeer.DisjointnessType;
import org.module.eer.mm.moduleeer.EntityType;
import org.module.eer.mm.moduleeer.Generalization;
import org.module.eer.mm.moduleeer.ModuleeerPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generalization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.module.eer.mm.moduleeer.impl.GeneralizationImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link org.module.eer.mm.moduleeer.impl.GeneralizationImpl#getCompleteness <em>Completeness</em>}</li>
 *   <li>{@link org.module.eer.mm.moduleeer.impl.GeneralizationImpl#getDisjointness <em>Disjointness</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeneralizationImpl extends NameElementImpl implements Generalization {
	/**
	 * The cached value of the '{@link #getEntity() <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntity()
	 * @generated
	 * @ordered
	 */
	protected EntityType entity;

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
	 * The default value of the '{@link #getDisjointness() <em>Disjointness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisjointness()
	 * @generated
	 * @ordered
	 */
	protected static final DisjointnessType DISJOINTNESS_EDEFAULT = DisjointnessType.OVERLAPPING;

	/**
	 * The cached value of the '{@link #getDisjointness() <em>Disjointness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisjointness()
	 * @generated
	 * @ordered
	 */
	protected DisjointnessType disjointness = DISJOINTNESS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneralizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModuleeerPackage.Literals.GENERALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EntityType getEntity() {
		if (entity != null && entity.eIsProxy()) {
			InternalEObject oldEntity = (InternalEObject) entity;
			entity = (EntityType) eResolveProxy(oldEntity);
			if (entity != oldEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModuleeerPackage.GENERALIZATION__ENTITY,
							oldEntity, entity));
			}
		}
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityType basicGetEntity() {
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntity(EntityType newEntity, NotificationChain msgs) {
		EntityType oldEntity = entity;
		entity = newEntity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ModuleeerPackage.GENERALIZATION__ENTITY, oldEntity, newEntity);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntity(EntityType newEntity) {
		if (newEntity != entity) {
			NotificationChain msgs = null;
			if (entity != null)
				msgs = ((InternalEObject) entity).eInverseRemove(this, ModuleeerPackage.ENTITY_TYPE__SPECIALIZATIONS,
						EntityType.class, msgs);
			if (newEntity != null)
				msgs = ((InternalEObject) newEntity).eInverseAdd(this, ModuleeerPackage.ENTITY_TYPE__SPECIALIZATIONS,
						EntityType.class, msgs);
			msgs = basicSetEntity(newEntity, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModuleeerPackage.GENERALIZATION__ENTITY, newEntity,
					newEntity));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModuleeerPackage.GENERALIZATION__COMPLETENESS,
					oldCompleteness, completeness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DisjointnessType getDisjointness() {
		return disjointness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDisjointness(DisjointnessType newDisjointness) {
		DisjointnessType oldDisjointness = disjointness;
		disjointness = newDisjointness == null ? DISJOINTNESS_EDEFAULT : newDisjointness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModuleeerPackage.GENERALIZATION__DISJOINTNESS,
					oldDisjointness, disjointness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ModuleeerPackage.GENERALIZATION__ENTITY:
			if (entity != null)
				msgs = ((InternalEObject) entity).eInverseRemove(this, ModuleeerPackage.ENTITY_TYPE__SPECIALIZATIONS,
						EntityType.class, msgs);
			return basicSetEntity((EntityType) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ModuleeerPackage.GENERALIZATION__ENTITY:
			return basicSetEntity(null, msgs);
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
		case ModuleeerPackage.GENERALIZATION__ENTITY:
			if (resolve)
				return getEntity();
			return basicGetEntity();
		case ModuleeerPackage.GENERALIZATION__COMPLETENESS:
			return getCompleteness();
		case ModuleeerPackage.GENERALIZATION__DISJOINTNESS:
			return getDisjointness();
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
		case ModuleeerPackage.GENERALIZATION__ENTITY:
			setEntity((EntityType) newValue);
			return;
		case ModuleeerPackage.GENERALIZATION__COMPLETENESS:
			setCompleteness((CompletenessType) newValue);
			return;
		case ModuleeerPackage.GENERALIZATION__DISJOINTNESS:
			setDisjointness((DisjointnessType) newValue);
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
		case ModuleeerPackage.GENERALIZATION__ENTITY:
			setEntity((EntityType) null);
			return;
		case ModuleeerPackage.GENERALIZATION__COMPLETENESS:
			setCompleteness(COMPLETENESS_EDEFAULT);
			return;
		case ModuleeerPackage.GENERALIZATION__DISJOINTNESS:
			setDisjointness(DISJOINTNESS_EDEFAULT);
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
		case ModuleeerPackage.GENERALIZATION__ENTITY:
			return entity != null;
		case ModuleeerPackage.GENERALIZATION__COMPLETENESS:
			return completeness != COMPLETENESS_EDEFAULT;
		case ModuleeerPackage.GENERALIZATION__DISJOINTNESS:
			return disjointness != DISJOINTNESS_EDEFAULT;
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
		result.append(" (completeness: ");
		result.append(completeness);
		result.append(", disjointness: ");
		result.append(disjointness);
		result.append(')');
		return result.toString();
	}

} //GeneralizationImpl
