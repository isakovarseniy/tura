/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
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
package form.impl;

import form.FormPackage;
import form.Selection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Selection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link form.impl.SelectionImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link form.impl.SelectionImpl#getDisplayOptionPointer <em>Display Option Pointer</em>}</li>
 *   <li>{@link form.impl.SelectionImpl#getValueOptionPointer <em>Value Option Pointer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SelectionImpl extends StyleElementImpl implements Selection {
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
	 * The cached value of the '{@link #getDisplayOptionPointer() <em>Display Option Pointer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayOptionPointer()
	 * @generated
	 * @ordered
	 */
	protected EObject displayOptionPointer;

	/**
	 * The cached value of the '{@link #getValueOptionPointer() <em>Value Option Pointer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueOptionPointer()
	 * @generated
	 * @ordered
	 */
	protected EObject valueOptionPointer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FormPackage.Literals.SELECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUid() {
		return uid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUid(String newUid) {
		String oldUid = uid;
		uid = newUid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.SELECTION__UID, oldUid, uid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getDisplayOptionPointer() {
		if (displayOptionPointer != null && displayOptionPointer.eIsProxy()) {
			InternalEObject oldDisplayOptionPointer = (InternalEObject)displayOptionPointer;
			displayOptionPointer = eResolveProxy(oldDisplayOptionPointer);
			if (displayOptionPointer != oldDisplayOptionPointer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FormPackage.SELECTION__DISPLAY_OPTION_POINTER, oldDisplayOptionPointer, displayOptionPointer));
			}
		}
		return displayOptionPointer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetDisplayOptionPointer() {
		return displayOptionPointer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDisplayOptionPointer(EObject newDisplayOptionPointer) {
		EObject oldDisplayOptionPointer = displayOptionPointer;
		displayOptionPointer = newDisplayOptionPointer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.SELECTION__DISPLAY_OPTION_POINTER, oldDisplayOptionPointer, displayOptionPointer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getValueOptionPointer() {
		if (valueOptionPointer != null && valueOptionPointer.eIsProxy()) {
			InternalEObject oldValueOptionPointer = (InternalEObject)valueOptionPointer;
			valueOptionPointer = eResolveProxy(oldValueOptionPointer);
			if (valueOptionPointer != oldValueOptionPointer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FormPackage.SELECTION__VALUE_OPTION_POINTER, oldValueOptionPointer, valueOptionPointer));
			}
		}
		return valueOptionPointer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetValueOptionPointer() {
		return valueOptionPointer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValueOptionPointer(EObject newValueOptionPointer) {
		EObject oldValueOptionPointer = valueOptionPointer;
		valueOptionPointer = newValueOptionPointer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.SELECTION__VALUE_OPTION_POINTER, oldValueOptionPointer, valueOptionPointer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FormPackage.SELECTION__UID:
				return getUid();
			case FormPackage.SELECTION__DISPLAY_OPTION_POINTER:
				if (resolve) return getDisplayOptionPointer();
				return basicGetDisplayOptionPointer();
			case FormPackage.SELECTION__VALUE_OPTION_POINTER:
				if (resolve) return getValueOptionPointer();
				return basicGetValueOptionPointer();
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
			case FormPackage.SELECTION__UID:
				setUid((String)newValue);
				return;
			case FormPackage.SELECTION__DISPLAY_OPTION_POINTER:
				setDisplayOptionPointer((EObject)newValue);
				return;
			case FormPackage.SELECTION__VALUE_OPTION_POINTER:
				setValueOptionPointer((EObject)newValue);
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
			case FormPackage.SELECTION__UID:
				setUid(UID_EDEFAULT);
				return;
			case FormPackage.SELECTION__DISPLAY_OPTION_POINTER:
				setDisplayOptionPointer((EObject)null);
				return;
			case FormPackage.SELECTION__VALUE_OPTION_POINTER:
				setValueOptionPointer((EObject)null);
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
			case FormPackage.SELECTION__UID:
				return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
			case FormPackage.SELECTION__DISPLAY_OPTION_POINTER:
				return displayOptionPointer != null;
			case FormPackage.SELECTION__VALUE_OPTION_POINTER:
				return valueOptionPointer != null;
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (uid: ");
		result.append(uid);
		result.append(')');
		return result.toString();
	}

} //SelectionImpl
