/**
 */
package tura.application.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tura.application.ApplicationInfrastructureLayer;
import tura.application.ApplicationPackage;

import tura.infrastructure.EnterpriseInfrastructure;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Infrastructure Layer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tura.application.impl.ApplicationInfrastructureLayerImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link tura.application.impl.ApplicationInfrastructureLayerImpl#getName <em>Name</em>}</li>
 *   <li>{@link tura.application.impl.ApplicationInfrastructureLayerImpl#getInfarastructure <em>Infarastructure</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApplicationInfrastructureLayerImpl extends MinimalEObjectImpl.Container implements ApplicationInfrastructureLayer {
	/**
	 * The default value of the '{@link #getUid() <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUid()
	 * @generated
	 * @ordered
	 */
	protected static final String UID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUid() <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUid()
	 * @generated
	 * @ordered
	 */
	protected String uid = UID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInfarastructure() <em>Infarastructure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfarastructure()
	 * @generated
	 * @ordered
	 */
	protected EnterpriseInfrastructure infarastructure;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationInfrastructureLayerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApplicationPackage.Literals.APPLICATION_INFRASTRUCTURE_LAYER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUid() {
		return uid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUid(String newUid) {
		String oldUid = uid;
		uid = newUid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.APPLICATION_INFRASTRUCTURE_LAYER__UID, oldUid, uid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.APPLICATION_INFRASTRUCTURE_LAYER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnterpriseInfrastructure getInfarastructure() {
		return infarastructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInfarastructure(EnterpriseInfrastructure newInfarastructure, NotificationChain msgs) {
		EnterpriseInfrastructure oldInfarastructure = infarastructure;
		infarastructure = newInfarastructure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApplicationPackage.APPLICATION_INFRASTRUCTURE_LAYER__INFARASTRUCTURE, oldInfarastructure, newInfarastructure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInfarastructure(EnterpriseInfrastructure newInfarastructure) {
		if (newInfarastructure != infarastructure) {
			NotificationChain msgs = null;
			if (infarastructure != null)
				msgs = ((InternalEObject)infarastructure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApplicationPackage.APPLICATION_INFRASTRUCTURE_LAYER__INFARASTRUCTURE, null, msgs);
			if (newInfarastructure != null)
				msgs = ((InternalEObject)newInfarastructure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApplicationPackage.APPLICATION_INFRASTRUCTURE_LAYER__INFARASTRUCTURE, null, msgs);
			msgs = basicSetInfarastructure(newInfarastructure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.APPLICATION_INFRASTRUCTURE_LAYER__INFARASTRUCTURE, newInfarastructure, newInfarastructure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApplicationPackage.APPLICATION_INFRASTRUCTURE_LAYER__INFARASTRUCTURE:
				return basicSetInfarastructure(null, msgs);
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
			case ApplicationPackage.APPLICATION_INFRASTRUCTURE_LAYER__UID:
				return getUid();
			case ApplicationPackage.APPLICATION_INFRASTRUCTURE_LAYER__NAME:
				return getName();
			case ApplicationPackage.APPLICATION_INFRASTRUCTURE_LAYER__INFARASTRUCTURE:
				return getInfarastructure();
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
			case ApplicationPackage.APPLICATION_INFRASTRUCTURE_LAYER__UID:
				setUid((String)newValue);
				return;
			case ApplicationPackage.APPLICATION_INFRASTRUCTURE_LAYER__NAME:
				setName((String)newValue);
				return;
			case ApplicationPackage.APPLICATION_INFRASTRUCTURE_LAYER__INFARASTRUCTURE:
				setInfarastructure((EnterpriseInfrastructure)newValue);
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
			case ApplicationPackage.APPLICATION_INFRASTRUCTURE_LAYER__UID:
				setUid(UID_EDEFAULT);
				return;
			case ApplicationPackage.APPLICATION_INFRASTRUCTURE_LAYER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ApplicationPackage.APPLICATION_INFRASTRUCTURE_LAYER__INFARASTRUCTURE:
				setInfarastructure((EnterpriseInfrastructure)null);
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
			case ApplicationPackage.APPLICATION_INFRASTRUCTURE_LAYER__UID:
				return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
			case ApplicationPackage.APPLICATION_INFRASTRUCTURE_LAYER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ApplicationPackage.APPLICATION_INFRASTRUCTURE_LAYER__INFARASTRUCTURE:
				return infarastructure != null;
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (uid: ");
		result.append(uid);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ApplicationInfrastructureLayerImpl
