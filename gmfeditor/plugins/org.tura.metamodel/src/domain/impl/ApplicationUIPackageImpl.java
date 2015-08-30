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

import domain.ApplicationUILayer;
import domain.ApplicationUIPackage;
import domain.DomainPackage;
import domain.UIPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application UI Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link domain.impl.ApplicationUIPackageImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.impl.ApplicationUIPackageImpl#getName <em>Name</em>}</li>
 *   <li>{@link domain.impl.ApplicationUIPackageImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link domain.impl.ApplicationUIPackageImpl#getUipackage <em>Uipackage</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApplicationUIPackageImpl extends EObjectImpl implements ApplicationUIPackage {
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
	 * The cached value of the '{@link #getUipackage() <em>Uipackage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUipackage()
	 * @generated
	 * @ordered
	 */
	protected UIPackage uipackage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationUIPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.APPLICATION_UI_PACKAGE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.APPLICATION_UI_PACKAGE__UID, oldUid, uid));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.APPLICATION_UI_PACKAGE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationUILayer getParent() {
		if (eContainerFeatureID() != DomainPackage.APPLICATION_UI_PACKAGE__PARENT) return null;
		return (ApplicationUILayer)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(ApplicationUILayer newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, DomainPackage.APPLICATION_UI_PACKAGE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(ApplicationUILayer newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != DomainPackage.APPLICATION_UI_PACKAGE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, DomainPackage.APPLICATION_UI_LAYER__APPLICATION_UI_PACKAGES, ApplicationUILayer.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.APPLICATION_UI_PACKAGE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIPackage getUipackage() {
		if (uipackage != null && uipackage.eIsProxy()) {
			InternalEObject oldUipackage = (InternalEObject)uipackage;
			uipackage = (UIPackage)eResolveProxy(oldUipackage);
			if (uipackage != oldUipackage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.APPLICATION_UI_PACKAGE__UIPACKAGE, oldUipackage, uipackage));
			}
		}
		return uipackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIPackage basicGetUipackage() {
		return uipackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUipackage(UIPackage newUipackage, NotificationChain msgs) {
		UIPackage oldUipackage = uipackage;
		uipackage = newUipackage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.APPLICATION_UI_PACKAGE__UIPACKAGE, oldUipackage, newUipackage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUipackage(UIPackage newUipackage) {
		if (newUipackage != uipackage) {
			NotificationChain msgs = null;
			if (uipackage != null)
				msgs = ((InternalEObject)uipackage).eInverseRemove(this, DomainPackage.UI_PACKAGE__PARENT, UIPackage.class, msgs);
			if (newUipackage != null)
				msgs = ((InternalEObject)newUipackage).eInverseAdd(this, DomainPackage.UI_PACKAGE__PARENT, UIPackage.class, msgs);
			msgs = basicSetUipackage(newUipackage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.APPLICATION_UI_PACKAGE__UIPACKAGE, newUipackage, newUipackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomainPackage.APPLICATION_UI_PACKAGE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((ApplicationUILayer)otherEnd, msgs);
			case DomainPackage.APPLICATION_UI_PACKAGE__UIPACKAGE:
				if (uipackage != null)
					msgs = ((InternalEObject)uipackage).eInverseRemove(this, DomainPackage.UI_PACKAGE__PARENT, UIPackage.class, msgs);
				return basicSetUipackage((UIPackage)otherEnd, msgs);
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
			case DomainPackage.APPLICATION_UI_PACKAGE__PARENT:
				return basicSetParent(null, msgs);
			case DomainPackage.APPLICATION_UI_PACKAGE__UIPACKAGE:
				return basicSetUipackage(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case DomainPackage.APPLICATION_UI_PACKAGE__PARENT:
				return eInternalContainer().eInverseRemove(this, DomainPackage.APPLICATION_UI_LAYER__APPLICATION_UI_PACKAGES, ApplicationUILayer.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DomainPackage.APPLICATION_UI_PACKAGE__UID:
				return getUid();
			case DomainPackage.APPLICATION_UI_PACKAGE__NAME:
				return getName();
			case DomainPackage.APPLICATION_UI_PACKAGE__PARENT:
				return getParent();
			case DomainPackage.APPLICATION_UI_PACKAGE__UIPACKAGE:
				if (resolve) return getUipackage();
				return basicGetUipackage();
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
			case DomainPackage.APPLICATION_UI_PACKAGE__UID:
				setUid((String)newValue);
				return;
			case DomainPackage.APPLICATION_UI_PACKAGE__NAME:
				setName((String)newValue);
				return;
			case DomainPackage.APPLICATION_UI_PACKAGE__PARENT:
				setParent((ApplicationUILayer)newValue);
				return;
			case DomainPackage.APPLICATION_UI_PACKAGE__UIPACKAGE:
				setUipackage((UIPackage)newValue);
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
			case DomainPackage.APPLICATION_UI_PACKAGE__UID:
				setUid(UID_EDEFAULT);
				return;
			case DomainPackage.APPLICATION_UI_PACKAGE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DomainPackage.APPLICATION_UI_PACKAGE__PARENT:
				setParent((ApplicationUILayer)null);
				return;
			case DomainPackage.APPLICATION_UI_PACKAGE__UIPACKAGE:
				setUipackage((UIPackage)null);
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
			case DomainPackage.APPLICATION_UI_PACKAGE__UID:
				return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
			case DomainPackage.APPLICATION_UI_PACKAGE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DomainPackage.APPLICATION_UI_PACKAGE__PARENT:
				return getParent() != null;
			case DomainPackage.APPLICATION_UI_PACKAGE__UIPACKAGE:
				return uipackage != null;
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

} //ApplicationUIPackageImpl
