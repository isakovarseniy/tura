/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2022 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

/**
 */
package style.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import style.StyleLibrary;
import style.StylePackage;
import style.StylePointer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pointer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link style.impl.StylePointerImpl#getStyleLibrary <em>Style Library</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StylePointerImpl extends EObjectImpl implements StylePointer {
	/**
	 * The cached value of the '{@link #getStyleLibrary() <em>Style Library</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleLibrary()
	 * @generated
	 * @ordered
	 */
	protected StyleLibrary styleLibrary;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StylePointerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StylePackage.Literals.STYLE_POINTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StyleLibrary getStyleLibrary() {
		if (styleLibrary != null && styleLibrary.eIsProxy()) {
			InternalEObject oldStyleLibrary = (InternalEObject)styleLibrary;
			styleLibrary = (StyleLibrary)eResolveProxy(oldStyleLibrary);
			if (styleLibrary != oldStyleLibrary) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StylePackage.STYLE_POINTER__STYLE_LIBRARY, oldStyleLibrary, styleLibrary));
			}
		}
		return styleLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleLibrary basicGetStyleLibrary() {
		return styleLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStyleLibrary(StyleLibrary newStyleLibrary) {
		StyleLibrary oldStyleLibrary = styleLibrary;
		styleLibrary = newStyleLibrary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.STYLE_POINTER__STYLE_LIBRARY, oldStyleLibrary, styleLibrary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StylePackage.STYLE_POINTER__STYLE_LIBRARY:
				if (resolve) return getStyleLibrary();
				return basicGetStyleLibrary();
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
			case StylePackage.STYLE_POINTER__STYLE_LIBRARY:
				setStyleLibrary((StyleLibrary)newValue);
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
			case StylePackage.STYLE_POINTER__STYLE_LIBRARY:
				setStyleLibrary((StyleLibrary)null);
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
			case StylePackage.STYLE_POINTER__STYLE_LIBRARY:
				return styleLibrary != null;
		}
		return super.eIsSet(featureID);
	}

} //StylePointerImpl
