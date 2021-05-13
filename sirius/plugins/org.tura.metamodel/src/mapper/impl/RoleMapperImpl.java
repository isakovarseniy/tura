/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
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
package mapper.impl;

import mapper.MapperPackage;
import mapper.RoleMapper;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import permission.PermissionPackage;
import permission.SecurityEntity;
import permission.SecurityEntityPointer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Mapper</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mapper.impl.RoleMapperImpl#getSecurityEntity <em>Security Entity</em>}</li>
 *   <li>{@link mapper.impl.RoleMapperImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link mapper.impl.RoleMapperImpl#getLocalRoleName <em>Local Role Name</em>}</li>
 *   <li>{@link mapper.impl.RoleMapperImpl#getGlobalRoleName <em>Global Role Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoleMapperImpl extends MapperImpl implements RoleMapper {
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
		return MapperPackage.Literals.ROLE_MAPPER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecurityEntity getSecurityEntity() {
		if (securityEntity != null && securityEntity.eIsProxy()) {
			InternalEObject oldSecurityEntity = (InternalEObject)securityEntity;
			securityEntity = (SecurityEntity)eResolveProxy(oldSecurityEntity);
			if (securityEntity != oldSecurityEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MapperPackage.ROLE_MAPPER__SECURITY_ENTITY, oldSecurityEntity, securityEntity));
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
	@Override
	public void setSecurityEntity(SecurityEntity newSecurityEntity) {
		SecurityEntity oldSecurityEntity = securityEntity;
		securityEntity = newSecurityEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MapperPackage.ROLE_MAPPER__SECURITY_ENTITY, oldSecurityEntity, securityEntity));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MapperPackage.ROLE_MAPPER__UID, oldUid, uid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocalRoleName() {
		return localRoleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocalRoleName(String newLocalRoleName) {
		String oldLocalRoleName = localRoleName;
		localRoleName = newLocalRoleName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MapperPackage.ROLE_MAPPER__LOCAL_ROLE_NAME, oldLocalRoleName, localRoleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGlobalRoleName() {
		return globalRoleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGlobalRoleName(String newGlobalRoleName) {
		String oldGlobalRoleName = globalRoleName;
		globalRoleName = newGlobalRoleName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MapperPackage.ROLE_MAPPER__GLOBAL_ROLE_NAME, oldGlobalRoleName, globalRoleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MapperPackage.ROLE_MAPPER__SECURITY_ENTITY:
				if (resolve) return getSecurityEntity();
				return basicGetSecurityEntity();
			case MapperPackage.ROLE_MAPPER__UID:
				return getUid();
			case MapperPackage.ROLE_MAPPER__LOCAL_ROLE_NAME:
				return getLocalRoleName();
			case MapperPackage.ROLE_MAPPER__GLOBAL_ROLE_NAME:
				return getGlobalRoleName();
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
			case MapperPackage.ROLE_MAPPER__SECURITY_ENTITY:
				setSecurityEntity((SecurityEntity)newValue);
				return;
			case MapperPackage.ROLE_MAPPER__UID:
				setUid((String)newValue);
				return;
			case MapperPackage.ROLE_MAPPER__LOCAL_ROLE_NAME:
				setLocalRoleName((String)newValue);
				return;
			case MapperPackage.ROLE_MAPPER__GLOBAL_ROLE_NAME:
				setGlobalRoleName((String)newValue);
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
			case MapperPackage.ROLE_MAPPER__SECURITY_ENTITY:
				setSecurityEntity((SecurityEntity)null);
				return;
			case MapperPackage.ROLE_MAPPER__UID:
				setUid(UID_EDEFAULT);
				return;
			case MapperPackage.ROLE_MAPPER__LOCAL_ROLE_NAME:
				setLocalRoleName(LOCAL_ROLE_NAME_EDEFAULT);
				return;
			case MapperPackage.ROLE_MAPPER__GLOBAL_ROLE_NAME:
				setGlobalRoleName(GLOBAL_ROLE_NAME_EDEFAULT);
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
			case MapperPackage.ROLE_MAPPER__SECURITY_ENTITY:
				return securityEntity != null;
			case MapperPackage.ROLE_MAPPER__UID:
				return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
			case MapperPackage.ROLE_MAPPER__LOCAL_ROLE_NAME:
				return LOCAL_ROLE_NAME_EDEFAULT == null ? localRoleName != null : !LOCAL_ROLE_NAME_EDEFAULT.equals(localRoleName);
			case MapperPackage.ROLE_MAPPER__GLOBAL_ROLE_NAME:
				return GLOBAL_ROLE_NAME_EDEFAULT == null ? globalRoleName != null : !GLOBAL_ROLE_NAME_EDEFAULT.equals(globalRoleName);
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
		if (baseClass == SecurityEntityPointer.class) {
			switch (derivedFeatureID) {
				case MapperPackage.ROLE_MAPPER__SECURITY_ENTITY: return PermissionPackage.SECURITY_ENTITY_POINTER__SECURITY_ENTITY;
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
		if (baseClass == SecurityEntityPointer.class) {
			switch (baseFeatureID) {
				case PermissionPackage.SECURITY_ENTITY_POINTER__SECURITY_ENTITY: return MapperPackage.ROLE_MAPPER__SECURITY_ENTITY;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(", localRoleName: ");
		result.append(localRoleName);
		result.append(", globalRoleName: ");
		result.append(globalRoleName);
		result.append(')');
		return result.toString();
	}

} //RoleMapperImpl
