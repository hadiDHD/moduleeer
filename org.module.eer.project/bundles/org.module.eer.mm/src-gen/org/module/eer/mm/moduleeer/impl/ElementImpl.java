/**
 */
package org.module.eer.mm.moduleeer.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.module.eer.mm.moduleeer.Attribute;
import org.module.eer.mm.moduleeer.Element;
import org.module.eer.mm.moduleeer.ModuleeerPackage;

import org.module.eer.mm.moduleeer.procedure.AccessElement;
import org.module.eer.mm.moduleeer.procedure.ProcedurePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.module.eer.mm.moduleeer.impl.ElementImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.module.eer.mm.moduleeer.impl.ElementImpl#getAccessElement <em>Access Element</em>}</li>
 *   <li>{@link org.module.eer.mm.moduleeer.impl.ElementImpl#isIsWeak <em>Is Weak</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ElementImpl extends ModularizableElementImpl implements Element {
	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attributes;

	/**
	 * The cached value of the '{@link #getAccessElement() <em>Access Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessElement()
	 * @generated
	 * @ordered
	 */
	protected EList<AccessElement> accessElement;

	/**
	 * The default value of the '{@link #isIsWeak() <em>Is Weak</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsWeak()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_WEAK_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsWeak() <em>Is Weak</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsWeak()
	 * @generated
	 * @ordered
	 */
	protected boolean isWeak = IS_WEAK_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModuleeerPackage.Literals.ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Attribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this,
					ModuleeerPackage.ELEMENT__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AccessElement> getAccessElement() {
		if (accessElement == null) {
			accessElement = new EObjectWithInverseResolvingEList<AccessElement>(AccessElement.class, this,
					ModuleeerPackage.ELEMENT__ACCESS_ELEMENT, ProcedurePackage.ACCESS_ELEMENT__ENTITY);
		}
		return accessElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsWeak() {
		return isWeak;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsWeak(boolean newIsWeak) {
		boolean oldIsWeak = isWeak;
		isWeak = newIsWeak;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModuleeerPackage.ELEMENT__IS_WEAK, oldIsWeak,
					isWeak));
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
		case ModuleeerPackage.ELEMENT__ACCESS_ELEMENT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getAccessElement()).basicAdd(otherEnd, msgs);
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
		case ModuleeerPackage.ELEMENT__ATTRIBUTES:
			return ((InternalEList<?>) getAttributes()).basicRemove(otherEnd, msgs);
		case ModuleeerPackage.ELEMENT__ACCESS_ELEMENT:
			return ((InternalEList<?>) getAccessElement()).basicRemove(otherEnd, msgs);
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
		case ModuleeerPackage.ELEMENT__ATTRIBUTES:
			return getAttributes();
		case ModuleeerPackage.ELEMENT__ACCESS_ELEMENT:
			return getAccessElement();
		case ModuleeerPackage.ELEMENT__IS_WEAK:
			return isIsWeak();
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
		case ModuleeerPackage.ELEMENT__ATTRIBUTES:
			getAttributes().clear();
			getAttributes().addAll((Collection<? extends Attribute>) newValue);
			return;
		case ModuleeerPackage.ELEMENT__ACCESS_ELEMENT:
			getAccessElement().clear();
			getAccessElement().addAll((Collection<? extends AccessElement>) newValue);
			return;
		case ModuleeerPackage.ELEMENT__IS_WEAK:
			setIsWeak((Boolean) newValue);
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
		case ModuleeerPackage.ELEMENT__ATTRIBUTES:
			getAttributes().clear();
			return;
		case ModuleeerPackage.ELEMENT__ACCESS_ELEMENT:
			getAccessElement().clear();
			return;
		case ModuleeerPackage.ELEMENT__IS_WEAK:
			setIsWeak(IS_WEAK_EDEFAULT);
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
		case ModuleeerPackage.ELEMENT__ATTRIBUTES:
			return attributes != null && !attributes.isEmpty();
		case ModuleeerPackage.ELEMENT__ACCESS_ELEMENT:
			return accessElement != null && !accessElement.isEmpty();
		case ModuleeerPackage.ELEMENT__IS_WEAK:
			return isWeak != IS_WEAK_EDEFAULT;
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
		result.append(" (isWeak: ");
		result.append(isWeak);
		result.append(')');
		return result.toString();
	}

} //ElementImpl
