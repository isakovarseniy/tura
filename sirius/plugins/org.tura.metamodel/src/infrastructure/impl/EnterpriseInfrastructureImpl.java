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
package infrastructure.impl;

import infrastructure.Datacenter;
import infrastructure.EnterpriseInfrastructure;
import infrastructure.InfrastructureConnection;
import infrastructure.InfrastructurePackage;

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
 * An implementation of the model object '<em><b>Enterprise Infrastructure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link infrastructure.impl.EnterpriseInfrastructureImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link infrastructure.impl.EnterpriseInfrastructureImpl#getName <em>Name</em>}</li>
 *   <li>{@link infrastructure.impl.EnterpriseInfrastructureImpl#getDatacenters <em>Datacenters</em>}</li>
 *   <li>{@link infrastructure.impl.EnterpriseInfrastructureImpl#getInfrastructureConnections <em>Infrastructure Connections</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnterpriseInfrastructureImpl extends EObjectImpl implements EnterpriseInfrastructure {
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
	 * The cached value of the '{@link #getDatacenters() <em>Datacenters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatacenters()
	 * @generated
	 * @ordered
	 */
	protected EList<Datacenter> datacenters;

	/**
	 * The cached value of the '{@link #getInfrastructureConnections() <em>Infrastructure Connections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfrastructureConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<InfrastructureConnection> infrastructureConnections;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnterpriseInfrastructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfrastructurePackage.Literals.ENTERPRISE_INFRASTRUCTURE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.ENTERPRISE_INFRASTRUCTURE__UID, oldUid, uid));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.ENTERPRISE_INFRASTRUCTURE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Datacenter> getDatacenters() {
		if (datacenters == null) {
			datacenters = new EObjectContainmentEList<Datacenter>(Datacenter.class, this, InfrastructurePackage.ENTERPRISE_INFRASTRUCTURE__DATACENTERS);
		}
		return datacenters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InfrastructureConnection> getInfrastructureConnections() {
		if (infrastructureConnections == null) {
			infrastructureConnections = new EObjectContainmentEList<InfrastructureConnection>(InfrastructureConnection.class, this, InfrastructurePackage.ENTERPRISE_INFRASTRUCTURE__INFRASTRUCTURE_CONNECTIONS);
		}
		return infrastructureConnections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfrastructurePackage.ENTERPRISE_INFRASTRUCTURE__DATACENTERS:
				return ((InternalEList<?>)getDatacenters()).basicRemove(otherEnd, msgs);
			case InfrastructurePackage.ENTERPRISE_INFRASTRUCTURE__INFRASTRUCTURE_CONNECTIONS:
				return ((InternalEList<?>)getInfrastructureConnections()).basicRemove(otherEnd, msgs);
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
			case InfrastructurePackage.ENTERPRISE_INFRASTRUCTURE__UID:
				return getUid();
			case InfrastructurePackage.ENTERPRISE_INFRASTRUCTURE__NAME:
				return getName();
			case InfrastructurePackage.ENTERPRISE_INFRASTRUCTURE__DATACENTERS:
				return getDatacenters();
			case InfrastructurePackage.ENTERPRISE_INFRASTRUCTURE__INFRASTRUCTURE_CONNECTIONS:
				return getInfrastructureConnections();
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
			case InfrastructurePackage.ENTERPRISE_INFRASTRUCTURE__UID:
				setUid((String)newValue);
				return;
			case InfrastructurePackage.ENTERPRISE_INFRASTRUCTURE__NAME:
				setName((String)newValue);
				return;
			case InfrastructurePackage.ENTERPRISE_INFRASTRUCTURE__DATACENTERS:
				getDatacenters().clear();
				getDatacenters().addAll((Collection<? extends Datacenter>)newValue);
				return;
			case InfrastructurePackage.ENTERPRISE_INFRASTRUCTURE__INFRASTRUCTURE_CONNECTIONS:
				getInfrastructureConnections().clear();
				getInfrastructureConnections().addAll((Collection<? extends InfrastructureConnection>)newValue);
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
			case InfrastructurePackage.ENTERPRISE_INFRASTRUCTURE__UID:
				setUid(UID_EDEFAULT);
				return;
			case InfrastructurePackage.ENTERPRISE_INFRASTRUCTURE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case InfrastructurePackage.ENTERPRISE_INFRASTRUCTURE__DATACENTERS:
				getDatacenters().clear();
				return;
			case InfrastructurePackage.ENTERPRISE_INFRASTRUCTURE__INFRASTRUCTURE_CONNECTIONS:
				getInfrastructureConnections().clear();
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
			case InfrastructurePackage.ENTERPRISE_INFRASTRUCTURE__UID:
				return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
			case InfrastructurePackage.ENTERPRISE_INFRASTRUCTURE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case InfrastructurePackage.ENTERPRISE_INFRASTRUCTURE__DATACENTERS:
				return datacenters != null && !datacenters.isEmpty();
			case InfrastructurePackage.ENTERPRISE_INFRASTRUCTURE__INFRASTRUCTURE_CONNECTIONS:
				return infrastructureConnections != null && !infrastructureConnections.isEmpty();
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

} //EnterpriseInfrastructureImpl
