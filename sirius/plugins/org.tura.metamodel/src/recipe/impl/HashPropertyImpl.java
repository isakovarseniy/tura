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
package recipe.impl;

import artifact.ConfigHash;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import recipe.HashProperty;
import recipe.KeyValuePair;
import recipe.RecipePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hash Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link recipe.impl.HashPropertyImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link recipe.impl.HashPropertyImpl#getConfHashRef <em>Conf Hash Ref</em>}</li>
 *   <li>{@link recipe.impl.HashPropertyImpl#getHash <em>Hash</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HashPropertyImpl extends EObjectImpl implements HashProperty {
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
	 * The cached value of the '{@link #getConfHashRef() <em>Conf Hash Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfHashRef()
	 * @generated
	 * @ordered
	 */
	protected ConfigHash confHashRef;

	/**
	 * The cached value of the '{@link #getHash() <em>Hash</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHash()
	 * @generated
	 * @ordered
	 */
	protected EList<KeyValuePair> hash;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HashPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RecipePackage.Literals.HASH_PROPERTY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RecipePackage.HASH_PROPERTY__UID, oldUid, uid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfigHash getConfHashRef() {
		if (confHashRef != null && confHashRef.eIsProxy()) {
			InternalEObject oldConfHashRef = (InternalEObject)confHashRef;
			confHashRef = (ConfigHash)eResolveProxy(oldConfHashRef);
			if (confHashRef != oldConfHashRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RecipePackage.HASH_PROPERTY__CONF_HASH_REF, oldConfHashRef, confHashRef));
			}
		}
		return confHashRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigHash basicGetConfHashRef() {
		return confHashRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfHashRef(ConfigHash newConfHashRef) {
		ConfigHash oldConfHashRef = confHashRef;
		confHashRef = newConfHashRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecipePackage.HASH_PROPERTY__CONF_HASH_REF, oldConfHashRef, confHashRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<KeyValuePair> getHash() {
		if (hash == null) {
			hash = new EObjectContainmentEList<KeyValuePair>(KeyValuePair.class, this, RecipePackage.HASH_PROPERTY__HASH);
		}
		return hash;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RecipePackage.HASH_PROPERTY__HASH:
				return ((InternalEList<?>)getHash()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RecipePackage.HASH_PROPERTY__UID:
				return getUid();
			case RecipePackage.HASH_PROPERTY__CONF_HASH_REF:
				if (resolve) return getConfHashRef();
				return basicGetConfHashRef();
			case RecipePackage.HASH_PROPERTY__HASH:
				return getHash();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RecipePackage.HASH_PROPERTY__UID:
				setUid((String)newValue);
				return;
			case RecipePackage.HASH_PROPERTY__CONF_HASH_REF:
				setConfHashRef((ConfigHash)newValue);
				return;
			case RecipePackage.HASH_PROPERTY__HASH:
				getHash().clear();
				getHash().addAll((Collection<? extends KeyValuePair>)newValue);
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
			case RecipePackage.HASH_PROPERTY__UID:
				setUid(UID_EDEFAULT);
				return;
			case RecipePackage.HASH_PROPERTY__CONF_HASH_REF:
				setConfHashRef((ConfigHash)null);
				return;
			case RecipePackage.HASH_PROPERTY__HASH:
				getHash().clear();
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
			case RecipePackage.HASH_PROPERTY__UID:
				return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
			case RecipePackage.HASH_PROPERTY__CONF_HASH_REF:
				return confHashRef != null;
			case RecipePackage.HASH_PROPERTY__HASH:
				return hash != null && !hash.isEmpty();
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

} //HashPropertyImpl
