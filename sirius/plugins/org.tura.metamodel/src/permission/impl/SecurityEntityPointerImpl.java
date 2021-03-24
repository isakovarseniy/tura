/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
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
package permission.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import permission.PermissionPackage;
import permission.SecurityEntity;
import permission.SecurityEntityPointer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Security Entity Pointer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link permission.impl.SecurityEntityPointerImpl#getSecurityEntity <em>Security Entity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecurityEntityPointerImpl extends EObjectImpl implements SecurityEntityPointer {
	/**
	 * The cached value of the '{@link #getSecurityEntity() <em>Security Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityEntity()
	 * @generated
	 * @ordered
	 */
	protected SecurityEntity securityEntity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityEntityPointerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PermissionPackage.Literals.SECURITY_ENTITY_POINTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityEntity getSecurityEntity() {
		if (securityEntity != null && securityEntity.eIsProxy()) {
			InternalEObject oldSecurityEntity = (InternalEObject)securityEntity;
			securityEntity = (SecurityEntity)eResolveProxy(oldSecurityEntity);
			if (securityEntity != oldSecurityEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PermissionPackage.SECURITY_ENTITY_POINTER__SECURITY_ENTITY, oldSecurityEntity, securityEntity));
			}
		}
		return securityEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityEntity basicGetSecurityEntity() {
		return securityEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityEntity(SecurityEntity newSecurityEntity) {
		SecurityEntity oldSecurityEntity = securityEntity;
		securityEntity = newSecurityEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PermissionPackage.SECURITY_ENTITY_POINTER__SECURITY_ENTITY, oldSecurityEntity, securityEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PermissionPackage.SECURITY_ENTITY_POINTER__SECURITY_ENTITY:
				if (resolve) return getSecurityEntity();
				return basicGetSecurityEntity();
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
			case PermissionPackage.SECURITY_ENTITY_POINTER__SECURITY_ENTITY:
				setSecurityEntity((SecurityEntity)newValue);
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
			case PermissionPackage.SECURITY_ENTITY_POINTER__SECURITY_ENTITY:
				setSecurityEntity((SecurityEntity)null);
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
			case PermissionPackage.SECURITY_ENTITY_POINTER__SECURITY_ENTITY:
				return securityEntity != null;
		}
		return super.eIsSet(featureID);
	}

} //SecurityEntityPointerImpl
