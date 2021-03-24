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
package permission;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Roles</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link permission.Roles#getUid <em>Uid</em>}</li>
 *   <li>{@link permission.Roles#getRoles <em>Roles</em>}</li>
 *   <li>{@link permission.Roles#getGroups <em>Groups</em>}</li>
 *   <li>{@link permission.Roles#getGroup2Groups <em>Group2 Groups</em>}</li>
 *   <li>{@link permission.Roles#getGroup2Roles <em>Group2 Roles</em>}</li>
 * </ul>
 *
 * @see permission.PermissionPackage#getRoles()
 * @model
 * @generated
 */
public interface Roles extends EObject {
	/**
	 * Returns the value of the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uid</em>' attribute.
	 * @see #setUid(String)
	 * @see permission.PermissionPackage#getRoles_Uid()
	 * @model id="true"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link permission.Roles#getUid <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' attribute.
	 * @see #getUid()
	 * @generated
	 */
	void setUid(String value);

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
	 * The list contents are of type {@link permission.Role}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' containment reference list.
	 * @see permission.PermissionPackage#getRoles_Roles()
	 * @model containment="true"
	 * @generated
	 */
	EList<Role> getRoles();

	/**
	 * Returns the value of the '<em><b>Groups</b></em>' containment reference list.
	 * The list contents are of type {@link permission.Group}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Groups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groups</em>' containment reference list.
	 * @see permission.PermissionPackage#getRoles_Groups()
	 * @model containment="true"
	 * @generated
	 */
	EList<Group> getGroups();

	/**
	 * Returns the value of the '<em><b>Group2 Groups</b></em>' containment reference list.
	 * The list contents are of type {@link permission.Group2Group}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group2 Groups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group2 Groups</em>' containment reference list.
	 * @see permission.PermissionPackage#getRoles_Group2Groups()
	 * @model containment="true"
	 * @generated
	 */
	EList<Group2Group> getGroup2Groups();

	/**
	 * Returns the value of the '<em><b>Group2 Roles</b></em>' containment reference list.
	 * The list contents are of type {@link permission.Group2Role}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group2 Roles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group2 Roles</em>' containment reference list.
	 * @see permission.PermissionPackage#getRoles_Group2Roles()
	 * @model containment="true"
	 * @generated
	 */
	EList<Group2Role> getGroup2Roles();

} // Roles
