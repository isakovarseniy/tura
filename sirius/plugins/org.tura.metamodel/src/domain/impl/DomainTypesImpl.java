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
package domain.impl;

import domain.DomainPackage;
import domain.DomainTypes;
import domain.DomainTypesRepository;

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

import type.PrimitivesGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Types</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link domain.impl.DomainTypesImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.impl.DomainTypesImpl#getKeyId <em>Key Id</em>}</li>
 *   <li>{@link domain.impl.DomainTypesImpl#getName <em>Name</em>}</li>
 *   <li>{@link domain.impl.DomainTypesImpl#getTypesRepository <em>Types Repository</em>}</li>
 *   <li>{@link domain.impl.DomainTypesImpl#getPrimitives <em>Primitives</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DomainTypesImpl extends EObjectImpl implements DomainTypes {
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
	 * The cached value of the '{@link #getTypesRepository() <em>Types Repository</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypesRepository()
	 * @generated
	 * @ordered
	 */
	protected EList<DomainTypesRepository> typesRepository;

	/**
	 * The cached value of the '{@link #getPrimitives() <em>Primitives</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimitives()
	 * @generated
	 * @ordered
	 */
	protected PrimitivesGroup primitives;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainTypesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.DOMAIN_TYPES;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN_TYPES__UID, oldUid, uid));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN_TYPES__KEY_ID, oldKeyId, keyId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN_TYPES__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DomainTypesRepository> getTypesRepository() {
		if (typesRepository == null) {
			typesRepository = new EObjectContainmentEList<DomainTypesRepository>(DomainTypesRepository.class, this, DomainPackage.DOMAIN_TYPES__TYPES_REPOSITORY);
		}
		return typesRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimitivesGroup getPrimitives() {
		return primitives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrimitives(PrimitivesGroup newPrimitives, NotificationChain msgs) {
		PrimitivesGroup oldPrimitives = primitives;
		primitives = newPrimitives;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN_TYPES__PRIMITIVES, oldPrimitives, newPrimitives);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrimitives(PrimitivesGroup newPrimitives) {
		if (newPrimitives != primitives) {
			NotificationChain msgs = null;
			if (primitives != null)
				msgs = ((InternalEObject)primitives).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.DOMAIN_TYPES__PRIMITIVES, null, msgs);
			if (newPrimitives != null)
				msgs = ((InternalEObject)newPrimitives).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainPackage.DOMAIN_TYPES__PRIMITIVES, null, msgs);
			msgs = basicSetPrimitives(newPrimitives, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN_TYPES__PRIMITIVES, newPrimitives, newPrimitives));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomainPackage.DOMAIN_TYPES__TYPES_REPOSITORY:
				return ((InternalEList<?>)getTypesRepository()).basicRemove(otherEnd, msgs);
			case DomainPackage.DOMAIN_TYPES__PRIMITIVES:
				return basicSetPrimitives(null, msgs);
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
			case DomainPackage.DOMAIN_TYPES__UID:
				return getUid();
			case DomainPackage.DOMAIN_TYPES__KEY_ID:
				return getKeyId();
			case DomainPackage.DOMAIN_TYPES__NAME:
				return getName();
			case DomainPackage.DOMAIN_TYPES__TYPES_REPOSITORY:
				return getTypesRepository();
			case DomainPackage.DOMAIN_TYPES__PRIMITIVES:
				return getPrimitives();
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
			case DomainPackage.DOMAIN_TYPES__UID:
				setUid((String)newValue);
				return;
			case DomainPackage.DOMAIN_TYPES__KEY_ID:
				setKeyId((String)newValue);
				return;
			case DomainPackage.DOMAIN_TYPES__NAME:
				setName((String)newValue);
				return;
			case DomainPackage.DOMAIN_TYPES__TYPES_REPOSITORY:
				getTypesRepository().clear();
				getTypesRepository().addAll((Collection<? extends DomainTypesRepository>)newValue);
				return;
			case DomainPackage.DOMAIN_TYPES__PRIMITIVES:
				setPrimitives((PrimitivesGroup)newValue);
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
			case DomainPackage.DOMAIN_TYPES__UID:
				setUid(UID_EDEFAULT);
				return;
			case DomainPackage.DOMAIN_TYPES__KEY_ID:
				setKeyId(KEY_ID_EDEFAULT);
				return;
			case DomainPackage.DOMAIN_TYPES__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DomainPackage.DOMAIN_TYPES__TYPES_REPOSITORY:
				getTypesRepository().clear();
				return;
			case DomainPackage.DOMAIN_TYPES__PRIMITIVES:
				setPrimitives((PrimitivesGroup)null);
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
			case DomainPackage.DOMAIN_TYPES__UID:
				return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
			case DomainPackage.DOMAIN_TYPES__KEY_ID:
				return KEY_ID_EDEFAULT == null ? keyId != null : !KEY_ID_EDEFAULT.equals(keyId);
			case DomainPackage.DOMAIN_TYPES__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DomainPackage.DOMAIN_TYPES__TYPES_REPOSITORY:
				return typesRepository != null && !typesRepository.isEmpty();
			case DomainPackage.DOMAIN_TYPES__PRIMITIVES:
				return primitives != null;
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

} //DomainTypesImpl
