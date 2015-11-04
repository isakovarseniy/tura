/**
 */
package domain.impl;

import domain.DomainApplication;
import domain.DomainPackage;
import domain.GrantAccess;
import domain.Role;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Grant Access</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link domain.impl.GrantAccessImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.impl.GrantAccessImpl#getApplicationRef <em>Application Ref</em>}</li>
 *   <li>{@link domain.impl.GrantAccessImpl#getRoleRef <em>Role Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GrantAccessImpl extends EObjectImpl implements GrantAccess {
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
	 * The cached value of the '{@link #getApplicationRef() <em>Application Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationRef()
	 * @generated
	 * @ordered
	 */
	protected DomainApplication applicationRef;

	/**
	 * The cached value of the '{@link #getRoleRef() <em>Role Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleRef()
	 * @generated
	 * @ordered
	 */
	protected Role roleRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GrantAccessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.GRANT_ACCESS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.GRANT_ACCESS__UID, oldUid, uid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainApplication getApplicationRef() {
		if (applicationRef != null && applicationRef.eIsProxy()) {
			InternalEObject oldApplicationRef = (InternalEObject)applicationRef;
			applicationRef = (DomainApplication)eResolveProxy(oldApplicationRef);
			if (applicationRef != oldApplicationRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.GRANT_ACCESS__APPLICATION_REF, oldApplicationRef, applicationRef));
			}
		}
		return applicationRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainApplication basicGetApplicationRef() {
		return applicationRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicationRef(DomainApplication newApplicationRef) {
		DomainApplication oldApplicationRef = applicationRef;
		applicationRef = newApplicationRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.GRANT_ACCESS__APPLICATION_REF, oldApplicationRef, applicationRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getRoleRef() {
		if (roleRef != null && roleRef.eIsProxy()) {
			InternalEObject oldRoleRef = (InternalEObject)roleRef;
			roleRef = (Role)eResolveProxy(oldRoleRef);
			if (roleRef != oldRoleRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.GRANT_ACCESS__ROLE_REF, oldRoleRef, roleRef));
			}
		}
		return roleRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role basicGetRoleRef() {
		return roleRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoleRef(Role newRoleRef) {
		Role oldRoleRef = roleRef;
		roleRef = newRoleRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.GRANT_ACCESS__ROLE_REF, oldRoleRef, roleRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DomainPackage.GRANT_ACCESS__UID:
				return getUid();
			case DomainPackage.GRANT_ACCESS__APPLICATION_REF:
				if (resolve) return getApplicationRef();
				return basicGetApplicationRef();
			case DomainPackage.GRANT_ACCESS__ROLE_REF:
				if (resolve) return getRoleRef();
				return basicGetRoleRef();
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
			case DomainPackage.GRANT_ACCESS__UID:
				setUid((String)newValue);
				return;
			case DomainPackage.GRANT_ACCESS__APPLICATION_REF:
				setApplicationRef((DomainApplication)newValue);
				return;
			case DomainPackage.GRANT_ACCESS__ROLE_REF:
				setRoleRef((Role)newValue);
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
			case DomainPackage.GRANT_ACCESS__UID:
				setUid(UID_EDEFAULT);
				return;
			case DomainPackage.GRANT_ACCESS__APPLICATION_REF:
				setApplicationRef((DomainApplication)null);
				return;
			case DomainPackage.GRANT_ACCESS__ROLE_REF:
				setRoleRef((Role)null);
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
			case DomainPackage.GRANT_ACCESS__UID:
				return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
			case DomainPackage.GRANT_ACCESS__APPLICATION_REF:
				return applicationRef != null;
			case DomainPackage.GRANT_ACCESS__ROLE_REF:
				return roleRef != null;
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
		result.append(')');
		return result.toString();
	}

} //GrantAccessImpl
