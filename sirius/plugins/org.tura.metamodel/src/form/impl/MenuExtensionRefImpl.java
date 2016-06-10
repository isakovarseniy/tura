/**
 */
package form.impl;

import form.FormPackage;
import form.MenuExtensionRef;
import form.MenuFolder;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Menu Extension Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link form.impl.MenuExtensionRefImpl#getExtensionRef <em>Extension Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MenuExtensionRefImpl extends MinimalEObjectImpl.Container implements MenuExtensionRef {
	/**
	 * The cached value of the '{@link #getExtensionRef() <em>Extension Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensionRef()
	 * @generated
	 * @ordered
	 */
	protected MenuFolder extensionRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MenuExtensionRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FormPackage.Literals.MENU_EXTENSION_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MenuFolder getExtensionRef() {
		if (extensionRef != null && extensionRef.eIsProxy()) {
			InternalEObject oldExtensionRef = (InternalEObject)extensionRef;
			extensionRef = (MenuFolder)eResolveProxy(oldExtensionRef);
			if (extensionRef != oldExtensionRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FormPackage.MENU_EXTENSION_REF__EXTENSION_REF, oldExtensionRef, extensionRef));
			}
		}
		return extensionRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MenuFolder basicGetExtensionRef() {
		return extensionRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtensionRef(MenuFolder newExtensionRef) {
		MenuFolder oldExtensionRef = extensionRef;
		extensionRef = newExtensionRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.MENU_EXTENSION_REF__EXTENSION_REF, oldExtensionRef, extensionRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FormPackage.MENU_EXTENSION_REF__EXTENSION_REF:
				if (resolve) return getExtensionRef();
				return basicGetExtensionRef();
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
			case FormPackage.MENU_EXTENSION_REF__EXTENSION_REF:
				setExtensionRef((MenuFolder)newValue);
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
			case FormPackage.MENU_EXTENSION_REF__EXTENSION_REF:
				setExtensionRef((MenuFolder)null);
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
			case FormPackage.MENU_EXTENSION_REF__EXTENSION_REF:
				return extensionRef != null;
		}
		return super.eIsSet(featureID);
	}

} //MenuExtensionRefImpl
