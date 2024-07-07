/**
 */
package org.module.eer.mm.moduleeer.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.module.eer.mm.moduleeer.EntityType;
import org.module.eer.mm.moduleeer.Generalization;
import org.module.eer.mm.moduleeer.LinkToEntity;
import org.module.eer.mm.moduleeer.ModuleeerPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.module.eer.mm.moduleeer.impl.EntityTypeImpl#getGeneralizations <em>Generalizations</em>}</li>
 *   <li>{@link org.module.eer.mm.moduleeer.impl.EntityTypeImpl#getSpecializations <em>Specializations</em>}</li>
 *   <li>{@link org.module.eer.mm.moduleeer.impl.EntityTypeImpl#getLinks <em>Links</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityTypeImpl extends ElementImpl implements EntityType {
	/**
	 * The cached value of the '{@link #getGeneralizations() <em>Generalizations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralizations()
	 * @generated
	 * @ordered
	 */
	protected EList<Generalization> generalizations;

	/**
	 * The cached value of the '{@link #getSpecializations() <em>Specializations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecializations()
	 * @generated
	 * @ordered
	 */
	protected EList<Generalization> specializations;

	/**
	 * The cached value of the '{@link #getLinks() <em>Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<LinkToEntity> links;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModuleeerPackage.Literals.ENTITY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Generalization> getGeneralizations() {
		if (generalizations == null) {
			generalizations = new EObjectContainmentEList<Generalization>(Generalization.class, this,
					ModuleeerPackage.ENTITY_TYPE__GENERALIZATIONS);
		}
		return generalizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Generalization> getSpecializations() {
		if (specializations == null) {
			specializations = new EObjectWithInverseResolvingEList<Generalization>(Generalization.class, this,
					ModuleeerPackage.ENTITY_TYPE__SPECIALIZATIONS, ModuleeerPackage.GENERALIZATION__ENTITY);
		}
		return specializations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LinkToEntity> getLinks() {
		if (links == null) {
			links = new EObjectWithInverseResolvingEList<LinkToEntity>(LinkToEntity.class, this,
					ModuleeerPackage.ENTITY_TYPE__LINKS, ModuleeerPackage.LINK_TO_ENTITY__ENTITY);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ModuleeerPackage.ENTITY_TYPE__SPECIALIZATIONS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSpecializations()).basicAdd(otherEnd, msgs);
		case ModuleeerPackage.ENTITY_TYPE__LINKS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getLinks()).basicAdd(otherEnd, msgs);
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
		case ModuleeerPackage.ENTITY_TYPE__GENERALIZATIONS:
			return ((InternalEList<?>) getGeneralizations()).basicRemove(otherEnd, msgs);
		case ModuleeerPackage.ENTITY_TYPE__SPECIALIZATIONS:
			return ((InternalEList<?>) getSpecializations()).basicRemove(otherEnd, msgs);
		case ModuleeerPackage.ENTITY_TYPE__LINKS:
			return ((InternalEList<?>) getLinks()).basicRemove(otherEnd, msgs);
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
		case ModuleeerPackage.ENTITY_TYPE__GENERALIZATIONS:
			return getGeneralizations();
		case ModuleeerPackage.ENTITY_TYPE__SPECIALIZATIONS:
			return getSpecializations();
		case ModuleeerPackage.ENTITY_TYPE__LINKS:
			return getLinks();
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
		case ModuleeerPackage.ENTITY_TYPE__GENERALIZATIONS:
			getGeneralizations().clear();
			getGeneralizations().addAll((Collection<? extends Generalization>) newValue);
			return;
		case ModuleeerPackage.ENTITY_TYPE__SPECIALIZATIONS:
			getSpecializations().clear();
			getSpecializations().addAll((Collection<? extends Generalization>) newValue);
			return;
		case ModuleeerPackage.ENTITY_TYPE__LINKS:
			getLinks().clear();
			getLinks().addAll((Collection<? extends LinkToEntity>) newValue);
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
		case ModuleeerPackage.ENTITY_TYPE__GENERALIZATIONS:
			getGeneralizations().clear();
			return;
		case ModuleeerPackage.ENTITY_TYPE__SPECIALIZATIONS:
			getSpecializations().clear();
			return;
		case ModuleeerPackage.ENTITY_TYPE__LINKS:
			getLinks().clear();
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
		case ModuleeerPackage.ENTITY_TYPE__GENERALIZATIONS:
			return generalizations != null && !generalizations.isEmpty();
		case ModuleeerPackage.ENTITY_TYPE__SPECIALIZATIONS:
			return specializations != null && !specializations.isEmpty();
		case ModuleeerPackage.ENTITY_TYPE__LINKS:
			return links != null && !links.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EntityTypeImpl
