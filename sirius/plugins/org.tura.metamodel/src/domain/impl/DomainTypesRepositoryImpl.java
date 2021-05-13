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
package domain.impl;

import domain.DomainPackage;
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

import type.TypeGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Types Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link domain.impl.DomainTypesRepositoryImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.impl.DomainTypesRepositoryImpl#getKeyId <em>Key Id</em>}</li>
 *   <li>{@link domain.impl.DomainTypesRepositoryImpl#getName <em>Name</em>}</li>
 *   <li>{@link domain.impl.DomainTypesRepositoryImpl#getRepositoryPackages <em>Repository Packages</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DomainTypesRepositoryImpl extends EObjectImpl implements DomainTypesRepository {
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
	 * The cached value of the '{@link #getRepositoryPackages() <em>Repository Packages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepositoryPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeGroup> repositoryPackages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainTypesRepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.DOMAIN_TYPES_REPOSITORY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN_TYPES_REPOSITORY__UID, oldUid, uid));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN_TYPES_REPOSITORY__KEY_ID, oldKeyId, keyId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN_TYPES_REPOSITORY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TypeGroup> getRepositoryPackages() {
		if (repositoryPackages == null) {
			repositoryPackages = new EObjectContainmentEList<TypeGroup>(TypeGroup.class, this, DomainPackage.DOMAIN_TYPES_REPOSITORY__REPOSITORY_PACKAGES);
		}
		return repositoryPackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomainPackage.DOMAIN_TYPES_REPOSITORY__REPOSITORY_PACKAGES:
				return ((InternalEList<?>)getRepositoryPackages()).basicRemove(otherEnd, msgs);
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
			case DomainPackage.DOMAIN_TYPES_REPOSITORY__UID:
				return getUid();
			case DomainPackage.DOMAIN_TYPES_REPOSITORY__KEY_ID:
				return getKeyId();
			case DomainPackage.DOMAIN_TYPES_REPOSITORY__NAME:
				return getName();
			case DomainPackage.DOMAIN_TYPES_REPOSITORY__REPOSITORY_PACKAGES:
				return getRepositoryPackages();
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
			case DomainPackage.DOMAIN_TYPES_REPOSITORY__UID:
				setUid((String)newValue);
				return;
			case DomainPackage.DOMAIN_TYPES_REPOSITORY__KEY_ID:
				setKeyId((String)newValue);
				return;
			case DomainPackage.DOMAIN_TYPES_REPOSITORY__NAME:
				setName((String)newValue);
				return;
			case DomainPackage.DOMAIN_TYPES_REPOSITORY__REPOSITORY_PACKAGES:
				getRepositoryPackages().clear();
				getRepositoryPackages().addAll((Collection<? extends TypeGroup>)newValue);
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
			case DomainPackage.DOMAIN_TYPES_REPOSITORY__UID:
				setUid(UID_EDEFAULT);
				return;
			case DomainPackage.DOMAIN_TYPES_REPOSITORY__KEY_ID:
				setKeyId(KEY_ID_EDEFAULT);
				return;
			case DomainPackage.DOMAIN_TYPES_REPOSITORY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DomainPackage.DOMAIN_TYPES_REPOSITORY__REPOSITORY_PACKAGES:
				getRepositoryPackages().clear();
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
			case DomainPackage.DOMAIN_TYPES_REPOSITORY__UID:
				return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
			case DomainPackage.DOMAIN_TYPES_REPOSITORY__KEY_ID:
				return KEY_ID_EDEFAULT == null ? keyId != null : !KEY_ID_EDEFAULT.equals(keyId);
			case DomainPackage.DOMAIN_TYPES_REPOSITORY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DomainPackage.DOMAIN_TYPES_REPOSITORY__REPOSITORY_PACKAGES:
				return repositoryPackages != null && !repositoryPackages.isEmpty();
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

} //DomainTypesRepositoryImpl
