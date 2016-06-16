/**
 */
package tura.application.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tura.application.ApplicationInfrastructureLayer;
import tura.application.ApplicationInfrastructureLayers;
import tura.application.ApplicationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Infrastructure Layers</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tura.application.impl.ApplicationInfrastructureLayersImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link tura.application.impl.ApplicationInfrastructureLayersImpl#getName <em>Name</em>}</li>
 *   <li>{@link tura.application.impl.ApplicationInfrastructureLayersImpl#getInfarastructureLayers <em>Infarastructure Layers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApplicationInfrastructureLayersImpl extends MinimalEObjectImpl.Container implements ApplicationInfrastructureLayers {
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
	 * The cached value of the '{@link #getInfarastructureLayers() <em>Infarastructure Layers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfarastructureLayers()
	 * @generated
	 * @ordered
	 */
	protected EList<ApplicationInfrastructureLayer> infarastructureLayers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationInfrastructureLayersImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApplicationPackage.Literals.APPLICATION_INFRASTRUCTURE_LAYERS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.APPLICATION_INFRASTRUCTURE_LAYERS__UID, oldUid, uid));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.APPLICATION_INFRASTRUCTURE_LAYERS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ApplicationInfrastructureLayer> getInfarastructureLayers() {
		if (infarastructureLayers == null) {
			infarastructureLayers = new EObjectContainmentEList<ApplicationInfrastructureLayer>(ApplicationInfrastructureLayer.class, this, ApplicationPackage.APPLICATION_INFRASTRUCTURE_LAYERS__INFARASTRUCTURE_LAYERS);
		}
		return infarastructureLayers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApplicationPackage.APPLICATION_INFRASTRUCTURE_LAYERS__INFARASTRUCTURE_LAYERS:
				return ((InternalEList<?>)getInfarastructureLayers()).basicRemove(otherEnd, msgs);
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
			case ApplicationPackage.APPLICATION_INFRASTRUCTURE_LAYERS__UID:
				return getUid();
			case ApplicationPackage.APPLICATION_INFRASTRUCTURE_LAYERS__NAME:
				return getName();
			case ApplicationPackage.APPLICATION_INFRASTRUCTURE_LAYERS__INFARASTRUCTURE_LAYERS:
				return getInfarastructureLayers();
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
			case ApplicationPackage.APPLICATION_INFRASTRUCTURE_LAYERS__UID:
				setUid((String)newValue);
				return;
			case ApplicationPackage.APPLICATION_INFRASTRUCTURE_LAYERS__NAME:
				setName((String)newValue);
				return;
			case ApplicationPackage.APPLICATION_INFRASTRUCTURE_LAYERS__INFARASTRUCTURE_LAYERS:
				getInfarastructureLayers().clear();
				getInfarastructureLayers().addAll((Collection<? extends ApplicationInfrastructureLayer>)newValue);
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
			case ApplicationPackage.APPLICATION_INFRASTRUCTURE_LAYERS__UID:
				setUid(UID_EDEFAULT);
				return;
			case ApplicationPackage.APPLICATION_INFRASTRUCTURE_LAYERS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ApplicationPackage.APPLICATION_INFRASTRUCTURE_LAYERS__INFARASTRUCTURE_LAYERS:
				getInfarastructureLayers().clear();
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
			case ApplicationPackage.APPLICATION_INFRASTRUCTURE_LAYERS__UID:
				return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
			case ApplicationPackage.APPLICATION_INFRASTRUCTURE_LAYERS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ApplicationPackage.APPLICATION_INFRASTRUCTURE_LAYERS__INFARASTRUCTURE_LAYERS:
				return infarastructureLayers != null && !infarastructureLayers.isEmpty();
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

} //ApplicationInfrastructureLayersImpl
