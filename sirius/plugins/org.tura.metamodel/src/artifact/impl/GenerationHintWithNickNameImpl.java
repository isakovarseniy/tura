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
import artifact.GenerationHint;
import artifact.GenerationHintWithNickName;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generation Hint With Nick Name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link artifact.impl.GenerationHintWithNickNameImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link artifact.impl.GenerationHintWithNickNameImpl#getKeyId <em>Key Id</em>}</li>
 *   <li>{@link artifact.impl.GenerationHintWithNickNameImpl#getName <em>Name</em>}</li>
 *   <li>{@link artifact.impl.GenerationHintWithNickNameImpl#getHint <em>Hint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GenerationHintWithNickNameImpl extends EObjectImpl implements GenerationHintWithNickName {
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
	 * The cached value of the '{@link #getHint() <em>Hint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHint()
	 * @generated
	 * @ordered
	 */
	protected GenerationHint hint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenerationHintWithNickNameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArtifactPackage.Literals.GENERATION_HINT_WITH_NICK_NAME;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArtifactPackage.GENERATION_HINT_WITH_NICK_NAME__UID, oldUid, uid));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArtifactPackage.GENERATION_HINT_WITH_NICK_NAME__KEY_ID, oldKeyId, keyId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArtifactPackage.GENERATION_HINT_WITH_NICK_NAME__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenerationHint getHint() {
		if (hint != null && hint.eIsProxy()) {
			InternalEObject oldHint = (InternalEObject)hint;
			hint = (GenerationHint)eResolveProxy(oldHint);
			if (hint != oldHint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArtifactPackage.GENERATION_HINT_WITH_NICK_NAME__HINT, oldHint, hint));
			}
		}
		return hint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenerationHint basicGetHint() {
		return hint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHint(GenerationHint newHint) {
		GenerationHint oldHint = hint;
		hint = newHint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArtifactPackage.GENERATION_HINT_WITH_NICK_NAME__HINT, oldHint, hint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArtifactPackage.GENERATION_HINT_WITH_NICK_NAME__UID:
				return getUid();
			case ArtifactPackage.GENERATION_HINT_WITH_NICK_NAME__KEY_ID:
				return getKeyId();
			case ArtifactPackage.GENERATION_HINT_WITH_NICK_NAME__NAME:
				return getName();
			case ArtifactPackage.GENERATION_HINT_WITH_NICK_NAME__HINT:
				if (resolve) return getHint();
				return basicGetHint();
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
			case ArtifactPackage.GENERATION_HINT_WITH_NICK_NAME__UID:
				setUid((String)newValue);
				return;
			case ArtifactPackage.GENERATION_HINT_WITH_NICK_NAME__KEY_ID:
				setKeyId((String)newValue);
				return;
			case ArtifactPackage.GENERATION_HINT_WITH_NICK_NAME__NAME:
				setName((String)newValue);
				return;
			case ArtifactPackage.GENERATION_HINT_WITH_NICK_NAME__HINT:
				setHint((GenerationHint)newValue);
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
			case ArtifactPackage.GENERATION_HINT_WITH_NICK_NAME__UID:
				setUid(UID_EDEFAULT);
				return;
			case ArtifactPackage.GENERATION_HINT_WITH_NICK_NAME__KEY_ID:
				setKeyId(KEY_ID_EDEFAULT);
				return;
			case ArtifactPackage.GENERATION_HINT_WITH_NICK_NAME__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ArtifactPackage.GENERATION_HINT_WITH_NICK_NAME__HINT:
				setHint((GenerationHint)null);
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
			case ArtifactPackage.GENERATION_HINT_WITH_NICK_NAME__UID:
				return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
			case ArtifactPackage.GENERATION_HINT_WITH_NICK_NAME__KEY_ID:
				return KEY_ID_EDEFAULT == null ? keyId != null : !KEY_ID_EDEFAULT.equals(keyId);
			case ArtifactPackage.GENERATION_HINT_WITH_NICK_NAME__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ArtifactPackage.GENERATION_HINT_WITH_NICK_NAME__HINT:
				return hint != null;
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

} //GenerationHintWithNickNameImpl
