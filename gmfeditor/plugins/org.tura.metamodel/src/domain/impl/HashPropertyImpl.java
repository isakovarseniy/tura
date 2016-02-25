/**
 */
package domain.impl;

import domain.ConfigHash;
import domain.DomainPackage;
import domain.HashProperty;
import domain.KeyValuePair;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hash Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link domain.impl.HashPropertyImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.impl.HashPropertyImpl#getConfHashRef <em>Conf Hash Ref</em>}</li>
 *   <li>{@link domain.impl.HashPropertyImpl#getHash <em>Hash</em>}</li>
 *   <li>{@link domain.impl.HashPropertyImpl#getFakeName <em>Fake Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HashPropertyImpl extends EObjectImpl implements HashProperty {
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
	 * The cached value of the '{@link #getConfHashRef() <em>Conf Hash Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfHashRef()
	 * @generated
	 * @ordered
	 */
	protected ConfigHash confHashRef;

	/**
	 * The cached value of the '{@link #getHash() <em>Hash</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHash()
	 * @generated
	 * @ordered
	 */
	protected EList<KeyValuePair> hash;

	/**
	 * The default value of the '{@link #getFakeName() <em>Fake Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFakeName()
	 * @generated
	 * @ordered
	 */
	protected static final String FAKE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFakeName() <em>Fake Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFakeName()
	 * @generated
	 * @ordered
	 */
	protected String fakeName = FAKE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HashPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.HASH_PROPERTY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.HASH_PROPERTY__UID, oldUid, uid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigHash getConfHashRef() {
		if (confHashRef != null && confHashRef.eIsProxy()) {
			InternalEObject oldConfHashRef = (InternalEObject)confHashRef;
			confHashRef = (ConfigHash)eResolveProxy(oldConfHashRef);
			if (confHashRef != oldConfHashRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.HASH_PROPERTY__CONF_HASH_REF, oldConfHashRef, confHashRef));
			}
		}
		return confHashRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigHash basicGetConfHashRef() {
		return confHashRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfHashRef(ConfigHash newConfHashRef) {
		ConfigHash oldConfHashRef = confHashRef;
		confHashRef = newConfHashRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.HASH_PROPERTY__CONF_HASH_REF, oldConfHashRef, confHashRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KeyValuePair> getHash() {
		if (hash == null) {
			hash = new EObjectContainmentEList<KeyValuePair>(KeyValuePair.class, this, DomainPackage.HASH_PROPERTY__HASH);
		}
		return hash;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFakeName() {
		return fakeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFakeName(String newFakeName) {
		String oldFakeName = fakeName;
		fakeName = newFakeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.HASH_PROPERTY__FAKE_NAME, oldFakeName, fakeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomainPackage.HASH_PROPERTY__HASH:
				return ((InternalEList<?>)getHash()).basicRemove(otherEnd, msgs);
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
			case DomainPackage.HASH_PROPERTY__UID:
				return getUid();
			case DomainPackage.HASH_PROPERTY__CONF_HASH_REF:
				if (resolve) return getConfHashRef();
				return basicGetConfHashRef();
			case DomainPackage.HASH_PROPERTY__HASH:
				return getHash();
			case DomainPackage.HASH_PROPERTY__FAKE_NAME:
				return getFakeName();
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
			case DomainPackage.HASH_PROPERTY__UID:
				setUid((String)newValue);
				return;
			case DomainPackage.HASH_PROPERTY__CONF_HASH_REF:
				setConfHashRef((ConfigHash)newValue);
				return;
			case DomainPackage.HASH_PROPERTY__HASH:
				getHash().clear();
				getHash().addAll((Collection<? extends KeyValuePair>)newValue);
				return;
			case DomainPackage.HASH_PROPERTY__FAKE_NAME:
				setFakeName((String)newValue);
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
			case DomainPackage.HASH_PROPERTY__UID:
				setUid(UID_EDEFAULT);
				return;
			case DomainPackage.HASH_PROPERTY__CONF_HASH_REF:
				setConfHashRef((ConfigHash)null);
				return;
			case DomainPackage.HASH_PROPERTY__HASH:
				getHash().clear();
				return;
			case DomainPackage.HASH_PROPERTY__FAKE_NAME:
				setFakeName(FAKE_NAME_EDEFAULT);
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
			case DomainPackage.HASH_PROPERTY__UID:
				return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
			case DomainPackage.HASH_PROPERTY__CONF_HASH_REF:
				return confHashRef != null;
			case DomainPackage.HASH_PROPERTY__HASH:
				return hash != null && !hash.isEmpty();
			case DomainPackage.HASH_PROPERTY__FAKE_NAME:
				return FAKE_NAME_EDEFAULT == null ? fakeName != null : !FAKE_NAME_EDEFAULT.equals(fakeName);
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
		result.append(", fakeName: ");
		result.append(fakeName);
		result.append(')');
		return result.toString();
	}

} //HashPropertyImpl
