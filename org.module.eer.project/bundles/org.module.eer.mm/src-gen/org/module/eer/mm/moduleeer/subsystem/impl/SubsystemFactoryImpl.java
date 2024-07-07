/**
 */
package org.module.eer.mm.moduleeer.subsystem.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.module.eer.mm.moduleeer.subsystem.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SubsystemFactoryImpl extends EFactoryImpl implements SubsystemFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SubsystemFactory init() {
		try {
			SubsystemFactory theSubsystemFactory = (SubsystemFactory) EPackage.Registry.INSTANCE
					.getEFactory(SubsystemPackage.eNS_URI);
			if (theSubsystemFactory != null) {
				return theSubsystemFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SubsystemFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubsystemFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case SubsystemPackage.MODULE_SUBSYSTEM:
			return createModuleSubsystem();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModuleSubsystem createModuleSubsystem() {
		ModuleSubsystemImpl moduleSubsystem = new ModuleSubsystemImpl();
		return moduleSubsystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubsystemPackage getSubsystemPackage() {
		return (SubsystemPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SubsystemPackage getPackage() {
		return SubsystemPackage.eINSTANCE;
	}

} //SubsystemFactoryImpl
