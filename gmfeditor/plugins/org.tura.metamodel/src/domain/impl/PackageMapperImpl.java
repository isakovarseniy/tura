/**
 */
package domain.impl;

import domain.DomainPackage;
import domain.PackageMapper;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package Mapper</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link domain.impl.PackageMapperImpl#getPackageRef <em>Package Ref</em>}</li>
 *   <li>{@link domain.impl.PackageMapperImpl#getFakePackageName <em>Fake Package Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PackageMapperImpl extends MapperImpl implements PackageMapper {
	/**
	 * The cached value of the '{@link #getPackageRef() <em>Package Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageRef()
	 * @generated
	 * @ordered
	 */
	protected domain.Package packageRef;

	/**
	 * The default value of the '{@link #getFakePackageName() <em>Fake Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFakePackageName()
	 * @generated
	 * @ordered
	 */
	protected static final String FAKE_PACKAGE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFakePackageName() <em>Fake Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFakePackageName()
	 * @generated
	 * @ordered
	 */
	protected String fakePackageName = FAKE_PACKAGE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageMapperImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.PACKAGE_MAPPER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public domain.Package getPackageRef() {
		if (packageRef != null && packageRef.eIsProxy()) {
			InternalEObject oldPackageRef = (InternalEObject)packageRef;
			packageRef = (domain.Package)eResolveProxy(oldPackageRef);
			if (packageRef != oldPackageRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.PACKAGE_MAPPER__PACKAGE_REF, oldPackageRef, packageRef));
			}
		}
		return packageRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public domain.Package basicGetPackageRef() {
		return packageRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackageRef(domain.Package newPackageRef) {
		domain.Package oldPackageRef = packageRef;
		packageRef = newPackageRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.PACKAGE_MAPPER__PACKAGE_REF, oldPackageRef, packageRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFakePackageName() {
		return fakePackageName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFakePackageName(String newFakePackageName) {
		String oldFakePackageName = fakePackageName;
		fakePackageName = newFakePackageName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.PACKAGE_MAPPER__FAKE_PACKAGE_NAME, oldFakePackageName, fakePackageName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DomainPackage.PACKAGE_MAPPER__PACKAGE_REF:
				if (resolve) return getPackageRef();
				return basicGetPackageRef();
			case DomainPackage.PACKAGE_MAPPER__FAKE_PACKAGE_NAME:
				return getFakePackageName();
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
			case DomainPackage.PACKAGE_MAPPER__PACKAGE_REF:
				setPackageRef((domain.Package)newValue);
				return;
			case DomainPackage.PACKAGE_MAPPER__FAKE_PACKAGE_NAME:
				setFakePackageName((String)newValue);
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
			case DomainPackage.PACKAGE_MAPPER__PACKAGE_REF:
				setPackageRef((domain.Package)null);
				return;
			case DomainPackage.PACKAGE_MAPPER__FAKE_PACKAGE_NAME:
				setFakePackageName(FAKE_PACKAGE_NAME_EDEFAULT);
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
			case DomainPackage.PACKAGE_MAPPER__PACKAGE_REF:
				return packageRef != null;
			case DomainPackage.PACKAGE_MAPPER__FAKE_PACKAGE_NAME:
				return FAKE_PACKAGE_NAME_EDEFAULT == null ? fakePackageName != null : !FAKE_PACKAGE_NAME_EDEFAULT.equals(fakePackageName);
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
		result.append(" (fakePackageName: ");
		result.append(fakePackageName);
		result.append(')');
		return result.toString();
	}

} //PackageMapperImpl
