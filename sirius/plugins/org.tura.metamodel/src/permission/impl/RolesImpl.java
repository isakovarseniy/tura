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
package permission.impl;

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

import permission.Group;
import permission.Group2Group;
import permission.Group2Role;
import permission.PermissionPackage;
import permission.Role;
import permission.Roles;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Roles</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link permission.impl.RolesImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link permission.impl.RolesImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link permission.impl.RolesImpl#getGroups <em>Groups</em>}</li>
 *   <li>{@link permission.impl.RolesImpl#getGroup2Groups <em>Group2 Groups</em>}</li>
 *   <li>{@link permission.impl.RolesImpl#getGroup2Roles <em>Group2 Roles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RolesImpl extends EObjectImpl implements Roles {
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
	 * The cached value of the '{@link #getRoles() <em>Roles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> roles;

	/**
	 * The cached value of the '{@link #getGroups() <em>Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<Group> groups;

	/**
	 * The cached value of the '{@link #getGroup2Groups() <em>Group2 Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup2Groups()
	 * @generated
	 * @ordered
	 */
	protected EList<Group2Group> group2Groups;

	/**
	 * The cached value of the '{@link #getGroup2Roles() <em>Group2 Roles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup2Roles()
	 * @generated
	 * @ordered
	 */
	protected EList<Group2Role> group2Roles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RolesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PermissionPackage.Literals.ROLES;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PermissionPackage.ROLES__UID, oldUid, uid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role> getRoles() {
		if (roles == null) {
			roles = new EObjectContainmentEList<Role>(Role.class, this, PermissionPackage.ROLES__ROLES);
		}
		return roles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Group> getGroups() {
		if (groups == null) {
			groups = new EObjectContainmentEList<Group>(Group.class, this, PermissionPackage.ROLES__GROUPS);
		}
		return groups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Group2Group> getGroup2Groups() {
		if (group2Groups == null) {
			group2Groups = new EObjectContainmentEList<Group2Group>(Group2Group.class, this, PermissionPackage.ROLES__GROUP2_GROUPS);
		}
		return group2Groups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Group2Role> getGroup2Roles() {
		if (group2Roles == null) {
			group2Roles = new EObjectContainmentEList<Group2Role>(Group2Role.class, this, PermissionPackage.ROLES__GROUP2_ROLES);
		}
		return group2Roles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PermissionPackage.ROLES__ROLES:
				return ((InternalEList<?>)getRoles()).basicRemove(otherEnd, msgs);
			case PermissionPackage.ROLES__GROUPS:
				return ((InternalEList<?>)getGroups()).basicRemove(otherEnd, msgs);
			case PermissionPackage.ROLES__GROUP2_GROUPS:
				return ((InternalEList<?>)getGroup2Groups()).basicRemove(otherEnd, msgs);
			case PermissionPackage.ROLES__GROUP2_ROLES:
				return ((InternalEList<?>)getGroup2Roles()).basicRemove(otherEnd, msgs);
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
			case PermissionPackage.ROLES__UID:
				return getUid();
			case PermissionPackage.ROLES__ROLES:
				return getRoles();
			case PermissionPackage.ROLES__GROUPS:
				return getGroups();
			case PermissionPackage.ROLES__GROUP2_GROUPS:
				return getGroup2Groups();
			case PermissionPackage.ROLES__GROUP2_ROLES:
				return getGroup2Roles();
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
			case PermissionPackage.ROLES__UID:
				setUid((String)newValue);
				return;
			case PermissionPackage.ROLES__ROLES:
				getRoles().clear();
				getRoles().addAll((Collection<? extends Role>)newValue);
				return;
			case PermissionPackage.ROLES__GROUPS:
				getGroups().clear();
				getGroups().addAll((Collection<? extends Group>)newValue);
				return;
			case PermissionPackage.ROLES__GROUP2_GROUPS:
				getGroup2Groups().clear();
				getGroup2Groups().addAll((Collection<? extends Group2Group>)newValue);
				return;
			case PermissionPackage.ROLES__GROUP2_ROLES:
				getGroup2Roles().clear();
				getGroup2Roles().addAll((Collection<? extends Group2Role>)newValue);
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
			case PermissionPackage.ROLES__UID:
				setUid(UID_EDEFAULT);
				return;
			case PermissionPackage.ROLES__ROLES:
				getRoles().clear();
				return;
			case PermissionPackage.ROLES__GROUPS:
				getGroups().clear();
				return;
			case PermissionPackage.ROLES__GROUP2_GROUPS:
				getGroup2Groups().clear();
				return;
			case PermissionPackage.ROLES__GROUP2_ROLES:
				getGroup2Roles().clear();
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
			case PermissionPackage.ROLES__UID:
				return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
			case PermissionPackage.ROLES__ROLES:
				return roles != null && !roles.isEmpty();
			case PermissionPackage.ROLES__GROUPS:
				return groups != null && !groups.isEmpty();
			case PermissionPackage.ROLES__GROUP2_GROUPS:
				return group2Groups != null && !group2Groups.isEmpty();
			case PermissionPackage.ROLES__GROUP2_ROLES:
				return group2Roles != null && !group2Roles.isEmpty();
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

} //RolesImpl
