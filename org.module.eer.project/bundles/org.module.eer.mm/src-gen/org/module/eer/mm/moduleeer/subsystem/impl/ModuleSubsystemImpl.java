/**
 */
package org.module.eer.mm.moduleeer.subsystem.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.module.eer.mm.moduleeer.impl.NameElementImpl;

import org.module.eer.mm.moduleeer.procedure.Procedure;

import org.module.eer.mm.moduleeer.subsystem.ModuleSubsystem;
import org.module.eer.mm.moduleeer.subsystem.SubsystemPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module Subsystem</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.module.eer.mm.moduleeer.subsystem.impl.ModuleSubsystemImpl#getProcedures <em>Procedures</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModuleSubsystemImpl extends NameElementImpl implements ModuleSubsystem {
	/**
	 * The cached value of the '{@link #getProcedures() <em>Procedures</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedures()
	 * @generated
	 * @ordered
	 */
	protected EList<Procedure> procedures;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleSubsystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SubsystemPackage.Literals.MODULE_SUBSYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Procedure> getProcedures() {
		if (procedures == null) {
			procedures = new EObjectResolvingEList<Procedure>(Procedure.class, this,
					SubsystemPackage.MODULE_SUBSYSTEM__PROCEDURES);
		}
		return procedures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SubsystemPackage.MODULE_SUBSYSTEM__PROCEDURES:
			return getProcedures();
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
		case SubsystemPackage.MODULE_SUBSYSTEM__PROCEDURES:
			getProcedures().clear();
			getProcedures().addAll((Collection<? extends Procedure>) newValue);
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
		case SubsystemPackage.MODULE_SUBSYSTEM__PROCEDURES:
			getProcedures().clear();
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
		case SubsystemPackage.MODULE_SUBSYSTEM__PROCEDURES:
			return procedures != null && !procedures.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModuleSubsystemImpl
