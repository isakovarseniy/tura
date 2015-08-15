/**
 */
package domain.impl;

import domain.DomainPackage;
import domain.RoleMapper;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Mapper</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link domain.impl.RoleMapperImpl#getRole <em>Role</em>}</li>
 *   <li>{@link domain.impl.RoleMapperImpl#getLocalRoleName <em>Local Role Name</em>}</li>
 *   <li>{@link domain.impl.RoleMapperImpl#getGlobalRoleName <em>Global Role Name</em>}</li>
 *   <li>{@link domain.impl.RoleMapperImpl#getFakeRoleName <em>Fake Role Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoleMapperImpl extends MapperImpl implements RoleMapper {
	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected EObject role;

	/**
	 * The default value of the '{@link #getLocalRoleName() <em>Local Role Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalRoleName()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCAL_ROLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocalRoleName() <em>Local Role Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalRoleName()
	 * @generated
	 * @ordered
	 */
	protected String localRoleName = LOCAL_ROLE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getGlobalRoleName() <em>Global Role Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalRoleName()
	 * @generated
	 * @ordered
	 */
	protected static final String GLOBAL_ROLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGlobalRoleName() <em>Global Role Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalRoleName()
	 * @generated
	 * @ordered
	 */
	protected String globalRoleName = GLOBAL_ROLE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFakeRoleName() <em>Fake Role Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFakeRoleName()
	 * @generated
	 * @ordered
	 */
	protected static final String FAKE_ROLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFakeRoleName() <em>Fake Role Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFakeRoleName()
	 * @generated
	 * @ordered
	 */
	protected String fakeRoleName = FAKE_ROLE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleMapperImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.ROLE_MAPPER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getRole() {
		if (role != null && role.eIsProxy()) {
			InternalEObject oldRole = (InternalEObject)role;
			role = eResolveProxy(oldRole);
			if (role != oldRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.ROLE_MAPPER__ROLE, oldRole, role));
			}
		}
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(EObject newRole) {
		EObject oldRole = role;
		role = newRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.ROLE_MAPPER__ROLE, oldRole, role));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocalRoleName() {
		return localRoleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalRoleName(String newLocalRoleName) {
		String oldLocalRoleName = localRoleName;
		localRoleName = newLocalRoleName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.ROLE_MAPPER__LOCAL_ROLE_NAME, oldLocalRoleName, localRoleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGlobalRoleName() {
		return globalRoleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlobalRoleName(String newGlobalRoleName) {
		String oldGlobalRoleName = globalRoleName;
		globalRoleName = newGlobalRoleName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.ROLE_MAPPER__GLOBAL_ROLE_NAME, oldGlobalRoleName, globalRoleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFakeRoleName() {
		return fakeRoleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFakeRoleName(String newFakeRoleName) {
		String oldFakeRoleName = fakeRoleName;
		fakeRoleName = newFakeRoleName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.ROLE_MAPPER__FAKE_ROLE_NAME, oldFakeRoleName, fakeRoleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DomainPackage.ROLE_MAPPER__ROLE:
				if (resolve) return getRole();
				return basicGetRole();
			case DomainPackage.ROLE_MAPPER__LOCAL_ROLE_NAME:
				return getLocalRoleName();
			case DomainPackage.ROLE_MAPPER__GLOBAL_ROLE_NAME:
				return getGlobalRoleName();
			case DomainPackage.ROLE_MAPPER__FAKE_ROLE_NAME:
				return getFakeRoleName();
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
			case DomainPackage.ROLE_MAPPER__ROLE:
				setRole((EObject)newValue);
				return;
			case DomainPackage.ROLE_MAPPER__LOCAL_ROLE_NAME:
				setLocalRoleName((String)newValue);
				return;
			case DomainPackage.ROLE_MAPPER__GLOBAL_ROLE_NAME:
				setGlobalRoleName((String)newValue);
				return;
			case DomainPackage.ROLE_MAPPER__FAKE_ROLE_NAME:
				setFakeRoleName((String)newValue);
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
			case DomainPackage.ROLE_MAPPER__ROLE:
				setRole((EObject)null);
				return;
			case DomainPackage.ROLE_MAPPER__LOCAL_ROLE_NAME:
				setLocalRoleName(LOCAL_ROLE_NAME_EDEFAULT);
				return;
			case DomainPackage.ROLE_MAPPER__GLOBAL_ROLE_NAME:
				setGlobalRoleName(GLOBAL_ROLE_NAME_EDEFAULT);
				return;
			case DomainPackage.ROLE_MAPPER__FAKE_ROLE_NAME:
				setFakeRoleName(FAKE_ROLE_NAME_EDEFAULT);
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
			case DomainPackage.ROLE_MAPPER__ROLE:
				return role != null;
			case DomainPackage.ROLE_MAPPER__LOCAL_ROLE_NAME:
				return LOCAL_ROLE_NAME_EDEFAULT == null ? localRoleName != null : !LOCAL_ROLE_NAME_EDEFAULT.equals(localRoleName);
			case DomainPackage.ROLE_MAPPER__GLOBAL_ROLE_NAME:
				return GLOBAL_ROLE_NAME_EDEFAULT == null ? globalRoleName != null : !GLOBAL_ROLE_NAME_EDEFAULT.equals(globalRoleName);
			case DomainPackage.ROLE_MAPPER__FAKE_ROLE_NAME:
				return FAKE_ROLE_NAME_EDEFAULT == null ? fakeRoleName != null : !FAKE_ROLE_NAME_EDEFAULT.equals(fakeRoleName);
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
		result.append(" (localRoleName: ");
		result.append(localRoleName);
		result.append(", globalRoleName: ");
		result.append(globalRoleName);
		result.append(", fakeRoleName: ");
		result.append(fakeRoleName);
		result.append(')');
		return result.toString();
	}

} //RoleMapperImpl
