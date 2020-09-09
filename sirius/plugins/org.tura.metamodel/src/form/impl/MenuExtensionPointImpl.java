/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2020 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   http://sourceforge.net/p/tura/wiki/Home/
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

/**
 */
package form.impl;

import form.FormPackage;
import form.MenuExtensionPoint;
import form.MenuExtensionRef;
import form.MenuFolder;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Menu Extension Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link form.impl.MenuExtensionPointImpl#getExtensionRef <em>Extension Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MenuExtensionPointImpl extends MenuElementImpl implements MenuExtensionPoint {
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
	protected MenuExtensionPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FormPackage.Literals.MENU_EXTENSION_POINT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FormPackage.MENU_EXTENSION_POINT__EXTENSION_REF, oldExtensionRef, extensionRef));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.MENU_EXTENSION_POINT__EXTENSION_REF, oldExtensionRef, extensionRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FormPackage.MENU_EXTENSION_POINT__EXTENSION_REF:
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
			case FormPackage.MENU_EXTENSION_POINT__EXTENSION_REF:
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
			case FormPackage.MENU_EXTENSION_POINT__EXTENSION_REF:
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
			case FormPackage.MENU_EXTENSION_POINT__EXTENSION_REF:
				return extensionRef != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == MenuExtensionRef.class) {
			switch (derivedFeatureID) {
				case FormPackage.MENU_EXTENSION_POINT__EXTENSION_REF: return FormPackage.MENU_EXTENSION_REF__EXTENSION_REF;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == MenuExtensionRef.class) {
			switch (baseFeatureID) {
				case FormPackage.MENU_EXTENSION_REF__EXTENSION_REF: return FormPackage.MENU_EXTENSION_POINT__EXTENSION_REF;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //MenuExtensionPointImpl
