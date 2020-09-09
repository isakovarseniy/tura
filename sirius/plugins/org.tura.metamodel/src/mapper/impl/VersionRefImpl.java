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
package mapper.impl;

import mapper.MapperPackage;
import mapper.Version;
import mapper.VersionRef;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Version Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mapper.impl.VersionRefImpl#getVersionRef <em>Version Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VersionRefImpl extends EObjectImpl implements VersionRef {
	/**
	 * The cached value of the '{@link #getVersionRef() <em>Version Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionRef()
	 * @generated
	 * @ordered
	 */
	protected Version versionRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VersionRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MapperPackage.Literals.VERSION_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Version getVersionRef() {
		if (versionRef != null && versionRef.eIsProxy()) {
			InternalEObject oldVersionRef = (InternalEObject)versionRef;
			versionRef = (Version)eResolveProxy(oldVersionRef);
			if (versionRef != oldVersionRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MapperPackage.VERSION_REF__VERSION_REF, oldVersionRef, versionRef));
			}
		}
		return versionRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Version basicGetVersionRef() {
		return versionRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersionRef(Version newVersionRef) {
		Version oldVersionRef = versionRef;
		versionRef = newVersionRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MapperPackage.VERSION_REF__VERSION_REF, oldVersionRef, versionRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MapperPackage.VERSION_REF__VERSION_REF:
				if (resolve) return getVersionRef();
				return basicGetVersionRef();
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
			case MapperPackage.VERSION_REF__VERSION_REF:
				setVersionRef((Version)newValue);
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
			case MapperPackage.VERSION_REF__VERSION_REF:
				setVersionRef((Version)null);
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
			case MapperPackage.VERSION_REF__VERSION_REF:
				return versionRef != null;
		}
		return super.eIsSet(featureID);
	}

} //VersionRefImpl
