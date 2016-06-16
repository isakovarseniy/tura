/**
 */
package tura.type.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tura.type.PackagePointer;
import tura.type.TypeGroup;
import tura.type.TypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package Pointer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tura.type.impl.PackagePointerImpl#getPackageRef <em>Package Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackagePointerImpl extends MinimalEObjectImpl.Container implements PackagePointer {
	/**
	 * The cached value of the '{@link #getPackageRef() <em>Package Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageRef()
	 * @generated
	 * @ordered
	 */
	protected TypeGroup packageRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackagePointerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypePackage.Literals.PACKAGE_POINTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeGroup getPackageRef() {
		if (packageRef != null && packageRef.eIsProxy()) {
			InternalEObject oldPackageRef = (InternalEObject)packageRef;
			packageRef = (TypeGroup)eResolveProxy(oldPackageRef);
			if (packageRef != oldPackageRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypePackage.PACKAGE_POINTER__PACKAGE_REF, oldPackageRef, packageRef));
			}
		}
		return packageRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeGroup basicGetPackageRef() {
		return packageRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackageRef(TypeGroup newPackageRef) {
		TypeGroup oldPackageRef = packageRef;
		packageRef = newPackageRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.PACKAGE_POINTER__PACKAGE_REF, oldPackageRef, packageRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TypePackage.PACKAGE_POINTER__PACKAGE_REF:
				if (resolve) return getPackageRef();
				return basicGetPackageRef();
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
			case TypePackage.PACKAGE_POINTER__PACKAGE_REF:
				setPackageRef((TypeGroup)newValue);
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
			case TypePackage.PACKAGE_POINTER__PACKAGE_REF:
				setPackageRef((TypeGroup)null);
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
			case TypePackage.PACKAGE_POINTER__PACKAGE_REF:
				return packageRef != null;
		}
		return super.eIsSet(featureID);
	}

} //PackagePointerImpl
