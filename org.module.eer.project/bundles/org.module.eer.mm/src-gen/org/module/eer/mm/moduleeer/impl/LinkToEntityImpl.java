/**
 */
package org.module.eer.mm.moduleeer.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.module.eer.mm.moduleeer.EntityType;
import org.module.eer.mm.moduleeer.LinkToEntity;
import org.module.eer.mm.moduleeer.ModuleeerPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link To Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.module.eer.mm.moduleeer.impl.LinkToEntityImpl#getEntity <em>Entity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LinkToEntityImpl extends LinkImpl implements LinkToEntity {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkToEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModuleeerPackage.Literals.LINK_TO_ENTITY;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModuleeerPackage.LINK_TO_ENTITY__ENTITY,
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
					ModuleeerPackage.LINK_TO_ENTITY__ENTITY, oldEntity, newEntity);
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
				msgs = ((InternalEObject) entity).eInverseRemove(this, ModuleeerPackage.ENTITY_TYPE__LINKS,
						EntityType.class, msgs);
			if (newEntity != null)
				msgs = ((InternalEObject) newEntity).eInverseAdd(this, ModuleeerPackage.ENTITY_TYPE__LINKS,
						EntityType.class, msgs);
			msgs = basicSetEntity(newEntity, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModuleeerPackage.LINK_TO_ENTITY__ENTITY, newEntity,
					newEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ModuleeerPackage.LINK_TO_ENTITY__ENTITY:
			if (entity != null)
				msgs = ((InternalEObject) entity).eInverseRemove(this, ModuleeerPackage.ENTITY_TYPE__LINKS,
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
		case ModuleeerPackage.LINK_TO_ENTITY__ENTITY:
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
		case ModuleeerPackage.LINK_TO_ENTITY__ENTITY:
			if (resolve)
				return getEntity();
			return basicGetEntity();
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
		case ModuleeerPackage.LINK_TO_ENTITY__ENTITY:
			setEntity((EntityType) newValue);
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
		case ModuleeerPackage.LINK_TO_ENTITY__ENTITY:
			setEntity((EntityType) null);
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
		case ModuleeerPackage.LINK_TO_ENTITY__ENTITY:
			return entity != null;
		}
		return super.eIsSet(featureID);
	}

} //LinkToEntityImpl
