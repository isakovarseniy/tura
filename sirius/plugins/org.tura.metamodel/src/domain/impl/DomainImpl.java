/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2020 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
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
package domain.impl;

import domain.Domain;
import domain.DomainApplications;
import domain.DomainArtifacts;
import domain.DomainPackage;
import domain.DomainTypes;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link domain.impl.DomainImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.impl.DomainImpl#getDomainArtifacts <em>Domain Artifacts</em>}</li>
 *   <li>{@link domain.impl.DomainImpl#getDomainTypes <em>Domain Types</em>}</li>
 *   <li>{@link domain.impl.DomainImpl#getDomainApplications <em>Domain Applications</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DomainImpl extends EObjectImpl implements Domain {
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
	 * The cached value of the '{@link #getDomainArtifacts() <em>Domain Artifacts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainArtifacts()
	 * @generated
	 * @ordered
	 */
	protected DomainArtifacts domainArtifacts;

	/**
	 * The cached value of the '{@link #getDomainTypes() <em>Domain Types</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainTypes()
	 * @generated
	 * @ordered
	 */
	protected DomainTypes domainTypes;

	/**
	 * The cached value of the '{@link #getDomainApplications() <em>Domain Applications</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainApplications()
	 * @generated
	 * @ordered
	 */
	protected DomainApplications domainApplications;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.DOMAIN;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__UID, oldUid, uid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainArtifacts getDomainArtifacts() {
		return domainArtifacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomainArtifacts(DomainArtifacts newDomainArtifacts, NotificationChain msgs) {
		DomainArtifacts oldDomainArtifacts = domainArtifacts;
		domainArtifacts = newDomainArtifacts;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__DOMAIN_ARTIFACTS, oldDomainArtifacts, newDomainArtifacts);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainArtifacts(DomainArtifacts newDomainArtifacts) {
		if (newDomainArtifacts != domainArtifacts) {
			NotificationChain msgs = null;
			if (domainArtifacts != null)
				msgs = ((InternalEObject)domainArtifacts).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.DOMAIN__DOMAIN_ARTIFACTS, null, msgs);
			if (newDomainArtifacts != null)
				msgs = ((InternalEObject)newDomainArtifacts).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainPackage.DOMAIN__DOMAIN_ARTIFACTS, null, msgs);
			msgs = basicSetDomainArtifacts(newDomainArtifacts, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__DOMAIN_ARTIFACTS, newDomainArtifacts, newDomainArtifacts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainTypes getDomainTypes() {
		return domainTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomainTypes(DomainTypes newDomainTypes, NotificationChain msgs) {
		DomainTypes oldDomainTypes = domainTypes;
		domainTypes = newDomainTypes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__DOMAIN_TYPES, oldDomainTypes, newDomainTypes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainTypes(DomainTypes newDomainTypes) {
		if (newDomainTypes != domainTypes) {
			NotificationChain msgs = null;
			if (domainTypes != null)
				msgs = ((InternalEObject)domainTypes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.DOMAIN__DOMAIN_TYPES, null, msgs);
			if (newDomainTypes != null)
				msgs = ((InternalEObject)newDomainTypes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainPackage.DOMAIN__DOMAIN_TYPES, null, msgs);
			msgs = basicSetDomainTypes(newDomainTypes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__DOMAIN_TYPES, newDomainTypes, newDomainTypes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainApplications getDomainApplications() {
		return domainApplications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomainApplications(DomainApplications newDomainApplications, NotificationChain msgs) {
		DomainApplications oldDomainApplications = domainApplications;
		domainApplications = newDomainApplications;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__DOMAIN_APPLICATIONS, oldDomainApplications, newDomainApplications);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainApplications(DomainApplications newDomainApplications) {
		if (newDomainApplications != domainApplications) {
			NotificationChain msgs = null;
			if (domainApplications != null)
				msgs = ((InternalEObject)domainApplications).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.DOMAIN__DOMAIN_APPLICATIONS, null, msgs);
			if (newDomainApplications != null)
				msgs = ((InternalEObject)newDomainApplications).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainPackage.DOMAIN__DOMAIN_APPLICATIONS, null, msgs);
			msgs = basicSetDomainApplications(newDomainApplications, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__DOMAIN_APPLICATIONS, newDomainApplications, newDomainApplications));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomainPackage.DOMAIN__DOMAIN_ARTIFACTS:
				return basicSetDomainArtifacts(null, msgs);
			case DomainPackage.DOMAIN__DOMAIN_TYPES:
				return basicSetDomainTypes(null, msgs);
			case DomainPackage.DOMAIN__DOMAIN_APPLICATIONS:
				return basicSetDomainApplications(null, msgs);
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
			case DomainPackage.DOMAIN__UID:
				return getUid();
			case DomainPackage.DOMAIN__DOMAIN_ARTIFACTS:
				return getDomainArtifacts();
			case DomainPackage.DOMAIN__DOMAIN_TYPES:
				return getDomainTypes();
			case DomainPackage.DOMAIN__DOMAIN_APPLICATIONS:
				return getDomainApplications();
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
			case DomainPackage.DOMAIN__UID:
				setUid((String)newValue);
				return;
			case DomainPackage.DOMAIN__DOMAIN_ARTIFACTS:
				setDomainArtifacts((DomainArtifacts)newValue);
				return;
			case DomainPackage.DOMAIN__DOMAIN_TYPES:
				setDomainTypes((DomainTypes)newValue);
				return;
			case DomainPackage.DOMAIN__DOMAIN_APPLICATIONS:
				setDomainApplications((DomainApplications)newValue);
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
			case DomainPackage.DOMAIN__UID:
				setUid(UID_EDEFAULT);
				return;
			case DomainPackage.DOMAIN__DOMAIN_ARTIFACTS:
				setDomainArtifacts((DomainArtifacts)null);
				return;
			case DomainPackage.DOMAIN__DOMAIN_TYPES:
				setDomainTypes((DomainTypes)null);
				return;
			case DomainPackage.DOMAIN__DOMAIN_APPLICATIONS:
				setDomainApplications((DomainApplications)null);
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
			case DomainPackage.DOMAIN__UID:
				return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
			case DomainPackage.DOMAIN__DOMAIN_ARTIFACTS:
				return domainArtifacts != null;
			case DomainPackage.DOMAIN__DOMAIN_TYPES:
				return domainTypes != null;
			case DomainPackage.DOMAIN__DOMAIN_APPLICATIONS:
				return domainApplications != null;
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

} //DomainImpl
