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
package application.impl;

import application.ApplicationLanguages;
import application.ApplicationMessageLibraries;
import application.ApplicationMessageLibrary;
import application.ApplicationPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Libraries</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link application.impl.ApplicationMessageLibrariesImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link application.impl.ApplicationMessageLibrariesImpl#getName <em>Name</em>}</li>
 *   <li>{@link application.impl.ApplicationMessageLibrariesImpl#getMessageLibraries <em>Message Libraries</em>}</li>
 *   <li>{@link application.impl.ApplicationMessageLibrariesImpl#getApplicationLanguages <em>Application Languages</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApplicationMessageLibrariesImpl extends EObjectImpl implements ApplicationMessageLibraries {
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
	 * The cached value of the '{@link #getMessageLibraries() <em>Message Libraries</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageLibraries()
	 * @generated
	 * @ordered
	 */
	protected ApplicationMessageLibrary messageLibraries;

	/**
	 * The cached value of the '{@link #getApplicationLanguages() <em>Application Languages</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationLanguages()
	 * @generated
	 * @ordered
	 */
	protected ApplicationLanguages applicationLanguages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationMessageLibrariesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApplicationPackage.Literals.APPLICATION_MESSAGE_LIBRARIES;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.APPLICATION_MESSAGE_LIBRARIES__UID, oldUid, uid));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.APPLICATION_MESSAGE_LIBRARIES__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ApplicationMessageLibrary getMessageLibraries() {
		return messageLibraries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMessageLibraries(ApplicationMessageLibrary newMessageLibraries, NotificationChain msgs) {
		ApplicationMessageLibrary oldMessageLibraries = messageLibraries;
		messageLibraries = newMessageLibraries;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApplicationPackage.APPLICATION_MESSAGE_LIBRARIES__MESSAGE_LIBRARIES, oldMessageLibraries, newMessageLibraries);
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
	public void setMessageLibraries(ApplicationMessageLibrary newMessageLibraries) {
		if (newMessageLibraries != messageLibraries) {
			NotificationChain msgs = null;
			if (messageLibraries != null)
				msgs = ((InternalEObject)messageLibraries).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApplicationPackage.APPLICATION_MESSAGE_LIBRARIES__MESSAGE_LIBRARIES, null, msgs);
			if (newMessageLibraries != null)
				msgs = ((InternalEObject)newMessageLibraries).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApplicationPackage.APPLICATION_MESSAGE_LIBRARIES__MESSAGE_LIBRARIES, null, msgs);
			msgs = basicSetMessageLibraries(newMessageLibraries, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.APPLICATION_MESSAGE_LIBRARIES__MESSAGE_LIBRARIES, newMessageLibraries, newMessageLibraries));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ApplicationLanguages getApplicationLanguages() {
		return applicationLanguages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApplicationLanguages(ApplicationLanguages newApplicationLanguages, NotificationChain msgs) {
		ApplicationLanguages oldApplicationLanguages = applicationLanguages;
		applicationLanguages = newApplicationLanguages;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApplicationPackage.APPLICATION_MESSAGE_LIBRARIES__APPLICATION_LANGUAGES, oldApplicationLanguages, newApplicationLanguages);
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
	public void setApplicationLanguages(ApplicationLanguages newApplicationLanguages) {
		if (newApplicationLanguages != applicationLanguages) {
			NotificationChain msgs = null;
			if (applicationLanguages != null)
				msgs = ((InternalEObject)applicationLanguages).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApplicationPackage.APPLICATION_MESSAGE_LIBRARIES__APPLICATION_LANGUAGES, null, msgs);
			if (newApplicationLanguages != null)
				msgs = ((InternalEObject)newApplicationLanguages).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApplicationPackage.APPLICATION_MESSAGE_LIBRARIES__APPLICATION_LANGUAGES, null, msgs);
			msgs = basicSetApplicationLanguages(newApplicationLanguages, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.APPLICATION_MESSAGE_LIBRARIES__APPLICATION_LANGUAGES, newApplicationLanguages, newApplicationLanguages));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApplicationPackage.APPLICATION_MESSAGE_LIBRARIES__MESSAGE_LIBRARIES:
				return basicSetMessageLibraries(null, msgs);
			case ApplicationPackage.APPLICATION_MESSAGE_LIBRARIES__APPLICATION_LANGUAGES:
				return basicSetApplicationLanguages(null, msgs);
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
			case ApplicationPackage.APPLICATION_MESSAGE_LIBRARIES__UID:
				return getUid();
			case ApplicationPackage.APPLICATION_MESSAGE_LIBRARIES__NAME:
				return getName();
			case ApplicationPackage.APPLICATION_MESSAGE_LIBRARIES__MESSAGE_LIBRARIES:
				return getMessageLibraries();
			case ApplicationPackage.APPLICATION_MESSAGE_LIBRARIES__APPLICATION_LANGUAGES:
				return getApplicationLanguages();
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
			case ApplicationPackage.APPLICATION_MESSAGE_LIBRARIES__UID:
				setUid((String)newValue);
				return;
			case ApplicationPackage.APPLICATION_MESSAGE_LIBRARIES__NAME:
				setName((String)newValue);
				return;
			case ApplicationPackage.APPLICATION_MESSAGE_LIBRARIES__MESSAGE_LIBRARIES:
				setMessageLibraries((ApplicationMessageLibrary)newValue);
				return;
			case ApplicationPackage.APPLICATION_MESSAGE_LIBRARIES__APPLICATION_LANGUAGES:
				setApplicationLanguages((ApplicationLanguages)newValue);
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
			case ApplicationPackage.APPLICATION_MESSAGE_LIBRARIES__UID:
				setUid(UID_EDEFAULT);
				return;
			case ApplicationPackage.APPLICATION_MESSAGE_LIBRARIES__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ApplicationPackage.APPLICATION_MESSAGE_LIBRARIES__MESSAGE_LIBRARIES:
				setMessageLibraries((ApplicationMessageLibrary)null);
				return;
			case ApplicationPackage.APPLICATION_MESSAGE_LIBRARIES__APPLICATION_LANGUAGES:
				setApplicationLanguages((ApplicationLanguages)null);
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
			case ApplicationPackage.APPLICATION_MESSAGE_LIBRARIES__UID:
				return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
			case ApplicationPackage.APPLICATION_MESSAGE_LIBRARIES__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ApplicationPackage.APPLICATION_MESSAGE_LIBRARIES__MESSAGE_LIBRARIES:
				return messageLibraries != null;
			case ApplicationPackage.APPLICATION_MESSAGE_LIBRARIES__APPLICATION_LANGUAGES:
				return applicationLanguages != null;
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

} //ApplicationMessageLibrariesImpl
