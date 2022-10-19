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
package artifact.impl;

import artifact.ArtifactPackage;
import artifact.ConfigVariable;
import artifact.ConfigVariableWithNickName;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Config Variable With Nick Name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link artifact.impl.ConfigVariableWithNickNameImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link artifact.impl.ConfigVariableWithNickNameImpl#getKeyId <em>Key Id</em>}</li>
 *   <li>{@link artifact.impl.ConfigVariableWithNickNameImpl#getName <em>Name</em>}</li>
 *   <li>{@link artifact.impl.ConfigVariableWithNickNameImpl#getVarRef <em>Var Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigVariableWithNickNameImpl extends EObjectImpl implements ConfigVariableWithNickName {
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
	 * The default value of the '{@link #getKeyId() <em>Key Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyId()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKeyId() <em>Key Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyId()
	 * @generated
	 * @ordered
	 */
	protected String keyId = KEY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVarRef() <em>Var Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarRef()
	 * @generated
	 * @ordered
	 */
	protected ConfigVariable varRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigVariableWithNickNameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArtifactPackage.Literals.CONFIG_VARIABLE_WITH_NICK_NAME;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArtifactPackage.CONFIG_VARIABLE_WITH_NICK_NAME__UID, oldUid, uid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getKeyId() {
		return keyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKeyId(String newKeyId) {
		String oldKeyId = keyId;
		keyId = newKeyId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArtifactPackage.CONFIG_VARIABLE_WITH_NICK_NAME__KEY_ID, oldKeyId, keyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArtifactPackage.CONFIG_VARIABLE_WITH_NICK_NAME__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfigVariable getVarRef() {
		if (varRef != null && varRef.eIsProxy()) {
			InternalEObject oldVarRef = (InternalEObject)varRef;
			varRef = (ConfigVariable)eResolveProxy(oldVarRef);
			if (varRef != oldVarRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArtifactPackage.CONFIG_VARIABLE_WITH_NICK_NAME__VAR_REF, oldVarRef, varRef));
			}
		}
		return varRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigVariable basicGetVarRef() {
		return varRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVarRef(ConfigVariable newVarRef) {
		ConfigVariable oldVarRef = varRef;
		varRef = newVarRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArtifactPackage.CONFIG_VARIABLE_WITH_NICK_NAME__VAR_REF, oldVarRef, varRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArtifactPackage.CONFIG_VARIABLE_WITH_NICK_NAME__UID:
				return getUid();
			case ArtifactPackage.CONFIG_VARIABLE_WITH_NICK_NAME__KEY_ID:
				return getKeyId();
			case ArtifactPackage.CONFIG_VARIABLE_WITH_NICK_NAME__NAME:
				return getName();
			case ArtifactPackage.CONFIG_VARIABLE_WITH_NICK_NAME__VAR_REF:
				if (resolve) return getVarRef();
				return basicGetVarRef();
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
			case ArtifactPackage.CONFIG_VARIABLE_WITH_NICK_NAME__UID:
				setUid((String)newValue);
				return;
			case ArtifactPackage.CONFIG_VARIABLE_WITH_NICK_NAME__KEY_ID:
				setKeyId((String)newValue);
				return;
			case ArtifactPackage.CONFIG_VARIABLE_WITH_NICK_NAME__NAME:
				setName((String)newValue);
				return;
			case ArtifactPackage.CONFIG_VARIABLE_WITH_NICK_NAME__VAR_REF:
				setVarRef((ConfigVariable)newValue);
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
			case ArtifactPackage.CONFIG_VARIABLE_WITH_NICK_NAME__UID:
				setUid(UID_EDEFAULT);
				return;
			case ArtifactPackage.CONFIG_VARIABLE_WITH_NICK_NAME__KEY_ID:
				setKeyId(KEY_ID_EDEFAULT);
				return;
			case ArtifactPackage.CONFIG_VARIABLE_WITH_NICK_NAME__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ArtifactPackage.CONFIG_VARIABLE_WITH_NICK_NAME__VAR_REF:
				setVarRef((ConfigVariable)null);
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
			case ArtifactPackage.CONFIG_VARIABLE_WITH_NICK_NAME__UID:
				return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
			case ArtifactPackage.CONFIG_VARIABLE_WITH_NICK_NAME__KEY_ID:
				return KEY_ID_EDEFAULT == null ? keyId != null : !KEY_ID_EDEFAULT.equals(keyId);
			case ArtifactPackage.CONFIG_VARIABLE_WITH_NICK_NAME__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ArtifactPackage.CONFIG_VARIABLE_WITH_NICK_NAME__VAR_REF:
				return varRef != null;
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
		result.append(", keyId: ");
		result.append(keyId);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ConfigVariableWithNickNameImpl
