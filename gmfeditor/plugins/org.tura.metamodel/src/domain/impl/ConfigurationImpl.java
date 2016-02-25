/*******************************************************************************
 * Tura - application generation platform
 *
 * Copyright (c) 2012, 2015, Arseniy Isakov
 *  
 * This project includes software developed by Arseniy Isakov
 * http://sourceforge.net/p/tura/wiki/Home/
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
/**
 */
package domain.impl;

import domain.Configuration;
import domain.DomainPackage;
import domain.HashProperty;
import domain.Infrastructure;
import domain.Property;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link domain.impl.ConfigurationImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.impl.ConfigurationImpl#getName <em>Name</em>}</li>
 *   <li>{@link domain.impl.ConfigurationImpl#getInfrastructure <em>Infrastructure</em>}</li>
 *   <li>{@link domain.impl.ConfigurationImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link domain.impl.ConfigurationImpl#getHashProperties <em>Hash Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConfigurationImpl extends EObjectImpl implements Configuration {
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
	 * The cached value of the '{@link #getInfrastructure() <em>Infrastructure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfrastructure()
	 * @generated
	 * @ordered
	 */
	protected Infrastructure infrastructure;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> properties;

	/**
	 * The cached value of the '{@link #getHashProperties() <em>Hash Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHashProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<HashProperty> hashProperties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUid() {
		return uid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUid(String newUid) {
		String oldUid = uid;
		uid = newUid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.CONFIGURATION__UID, oldUid, uid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.CONFIGURATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Infrastructure getInfrastructure() {
		if (infrastructure != null && infrastructure.eIsProxy()) {
			InternalEObject oldInfrastructure = (InternalEObject)infrastructure;
			infrastructure = (Infrastructure)eResolveProxy(oldInfrastructure);
			if (infrastructure != oldInfrastructure) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.CONFIGURATION__INFRASTRUCTURE, oldInfrastructure, infrastructure));
			}
		}
		return infrastructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Infrastructure basicGetInfrastructure() {
		return infrastructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInfrastructure(Infrastructure newInfrastructure, NotificationChain msgs) {
		Infrastructure oldInfrastructure = infrastructure;
		infrastructure = newInfrastructure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.CONFIGURATION__INFRASTRUCTURE, oldInfrastructure, newInfrastructure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInfrastructure(Infrastructure newInfrastructure) {
		if (newInfrastructure != infrastructure) {
			NotificationChain msgs = null;
			if (infrastructure != null)
				msgs = ((InternalEObject)infrastructure).eInverseRemove(this, DomainPackage.INFRASTRUCTURE__RECIPE_CONFIG, Infrastructure.class, msgs);
			if (newInfrastructure != null)
				msgs = ((InternalEObject)newInfrastructure).eInverseAdd(this, DomainPackage.INFRASTRUCTURE__RECIPE_CONFIG, Infrastructure.class, msgs);
			msgs = basicSetInfrastructure(newInfrastructure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.CONFIGURATION__INFRASTRUCTURE, newInfrastructure, newInfrastructure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<Property>(Property.class, this, DomainPackage.CONFIGURATION__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HashProperty> getHashProperties() {
		if (hashProperties == null) {
			hashProperties = new EObjectContainmentEList<HashProperty>(HashProperty.class, this, DomainPackage.CONFIGURATION__HASH_PROPERTIES);
		}
		return hashProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomainPackage.CONFIGURATION__INFRASTRUCTURE:
				if (infrastructure != null)
					msgs = ((InternalEObject)infrastructure).eInverseRemove(this, DomainPackage.INFRASTRUCTURE__RECIPE_CONFIG, Infrastructure.class, msgs);
				return basicSetInfrastructure((Infrastructure)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomainPackage.CONFIGURATION__INFRASTRUCTURE:
				return basicSetInfrastructure(null, msgs);
			case DomainPackage.CONFIGURATION__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
			case DomainPackage.CONFIGURATION__HASH_PROPERTIES:
				return ((InternalEList<?>)getHashProperties()).basicRemove(otherEnd, msgs);
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
			case DomainPackage.CONFIGURATION__UID:
				return getUid();
			case DomainPackage.CONFIGURATION__NAME:
				return getName();
			case DomainPackage.CONFIGURATION__INFRASTRUCTURE:
				if (resolve) return getInfrastructure();
				return basicGetInfrastructure();
			case DomainPackage.CONFIGURATION__PROPERTIES:
				return getProperties();
			case DomainPackage.CONFIGURATION__HASH_PROPERTIES:
				return getHashProperties();
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
			case DomainPackage.CONFIGURATION__UID:
				setUid((String)newValue);
				return;
			case DomainPackage.CONFIGURATION__NAME:
				setName((String)newValue);
				return;
			case DomainPackage.CONFIGURATION__INFRASTRUCTURE:
				setInfrastructure((Infrastructure)newValue);
				return;
			case DomainPackage.CONFIGURATION__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends Property>)newValue);
				return;
			case DomainPackage.CONFIGURATION__HASH_PROPERTIES:
				getHashProperties().clear();
				getHashProperties().addAll((Collection<? extends HashProperty>)newValue);
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
			case DomainPackage.CONFIGURATION__UID:
				setUid(UID_EDEFAULT);
				return;
			case DomainPackage.CONFIGURATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DomainPackage.CONFIGURATION__INFRASTRUCTURE:
				setInfrastructure((Infrastructure)null);
				return;
			case DomainPackage.CONFIGURATION__PROPERTIES:
				getProperties().clear();
				return;
			case DomainPackage.CONFIGURATION__HASH_PROPERTIES:
				getHashProperties().clear();
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
			case DomainPackage.CONFIGURATION__UID:
				return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
			case DomainPackage.CONFIGURATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DomainPackage.CONFIGURATION__INFRASTRUCTURE:
				return infrastructure != null;
			case DomainPackage.CONFIGURATION__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case DomainPackage.CONFIGURATION__HASH_PROPERTIES:
				return hashProperties != null && !hashProperties.isEmpty();
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (uid: ");
		result.append(uid);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ConfigurationImpl
