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
package application.impl;

import application.ApplicationMapper;
import application.ApplicationMappers;
import application.ApplicationPackage;

import java.util.Collection;

import mapper.MappingLayer;

import mapper.Version;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mappers</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link application.impl.ApplicationMappersImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link application.impl.ApplicationMappersImpl#getName <em>Name</em>}</li>
 *   <li>{@link application.impl.ApplicationMappersImpl#getMappers <em>Mappers</em>}</li>
 *   <li>{@link application.impl.ApplicationMappersImpl#getAppLayers <em>App Layers</em>}</li>
 *   <li>{@link application.impl.ApplicationMappersImpl#getVersions <em>Versions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApplicationMappersImpl extends EObjectImpl implements ApplicationMappers {
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
	 * The cached value of the '{@link #getMappers() <em>Mappers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappers()
	 * @generated
	 * @ordered
	 */
	protected EList<ApplicationMapper> mappers;

	/**
	 * The cached value of the '{@link #getAppLayers() <em>App Layers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppLayers()
	 * @generated
	 * @ordered
	 */
	protected EList<MappingLayer> appLayers;

	/**
	 * The cached value of the '{@link #getVersions() <em>Versions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersions()
	 * @generated
	 * @ordered
	 */
	protected EList<Version> versions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationMappersImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApplicationPackage.Literals.APPLICATION_MAPPERS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.APPLICATION_MAPPERS__UID, oldUid, uid));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.APPLICATION_MAPPERS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ApplicationMapper> getMappers() {
		if (mappers == null) {
			mappers = new EObjectContainmentEList<ApplicationMapper>(ApplicationMapper.class, this, ApplicationPackage.APPLICATION_MAPPERS__MAPPERS);
		}
		return mappers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MappingLayer> getAppLayers() {
		if (appLayers == null) {
			appLayers = new EObjectContainmentEList<MappingLayer>(MappingLayer.class, this, ApplicationPackage.APPLICATION_MAPPERS__APP_LAYERS);
		}
		return appLayers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Version> getVersions() {
		if (versions == null) {
			versions = new EObjectContainmentEList<Version>(Version.class, this, ApplicationPackage.APPLICATION_MAPPERS__VERSIONS);
		}
		return versions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApplicationPackage.APPLICATION_MAPPERS__MAPPERS:
				return ((InternalEList<?>)getMappers()).basicRemove(otherEnd, msgs);
			case ApplicationPackage.APPLICATION_MAPPERS__APP_LAYERS:
				return ((InternalEList<?>)getAppLayers()).basicRemove(otherEnd, msgs);
			case ApplicationPackage.APPLICATION_MAPPERS__VERSIONS:
				return ((InternalEList<?>)getVersions()).basicRemove(otherEnd, msgs);
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
			case ApplicationPackage.APPLICATION_MAPPERS__UID:
				return getUid();
			case ApplicationPackage.APPLICATION_MAPPERS__NAME:
				return getName();
			case ApplicationPackage.APPLICATION_MAPPERS__MAPPERS:
				return getMappers();
			case ApplicationPackage.APPLICATION_MAPPERS__APP_LAYERS:
				return getAppLayers();
			case ApplicationPackage.APPLICATION_MAPPERS__VERSIONS:
				return getVersions();
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
			case ApplicationPackage.APPLICATION_MAPPERS__UID:
				setUid((String)newValue);
				return;
			case ApplicationPackage.APPLICATION_MAPPERS__NAME:
				setName((String)newValue);
				return;
			case ApplicationPackage.APPLICATION_MAPPERS__MAPPERS:
				getMappers().clear();
				getMappers().addAll((Collection<? extends ApplicationMapper>)newValue);
				return;
			case ApplicationPackage.APPLICATION_MAPPERS__APP_LAYERS:
				getAppLayers().clear();
				getAppLayers().addAll((Collection<? extends MappingLayer>)newValue);
				return;
			case ApplicationPackage.APPLICATION_MAPPERS__VERSIONS:
				getVersions().clear();
				getVersions().addAll((Collection<? extends Version>)newValue);
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
			case ApplicationPackage.APPLICATION_MAPPERS__UID:
				setUid(UID_EDEFAULT);
				return;
			case ApplicationPackage.APPLICATION_MAPPERS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ApplicationPackage.APPLICATION_MAPPERS__MAPPERS:
				getMappers().clear();
				return;
			case ApplicationPackage.APPLICATION_MAPPERS__APP_LAYERS:
				getAppLayers().clear();
				return;
			case ApplicationPackage.APPLICATION_MAPPERS__VERSIONS:
				getVersions().clear();
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
			case ApplicationPackage.APPLICATION_MAPPERS__UID:
				return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
			case ApplicationPackage.APPLICATION_MAPPERS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ApplicationPackage.APPLICATION_MAPPERS__MAPPERS:
				return mappers != null && !mappers.isEmpty();
			case ApplicationPackage.APPLICATION_MAPPERS__APP_LAYERS:
				return appLayers != null && !appLayers.isEmpty();
			case ApplicationPackage.APPLICATION_MAPPERS__VERSIONS:
				return versions != null && !versions.isEmpty();
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
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ApplicationMappersImpl
