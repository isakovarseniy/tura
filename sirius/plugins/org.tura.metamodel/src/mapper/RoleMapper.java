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
package mapper;

import permission.SecurityEntityPointer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Mapper</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mapper.RoleMapper#getUid <em>Uid</em>}</li>
 *   <li>{@link mapper.RoleMapper#getLocalRoleName <em>Local Role Name</em>}</li>
 *   <li>{@link mapper.RoleMapper#getGlobalRoleName <em>Global Role Name</em>}</li>
 * </ul>
 *
 * @see mapper.MapperPackage#getRoleMapper()
 * @model
 * @generated
 */
public interface RoleMapper extends Mapper, SecurityEntityPointer {
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
	 * @see mapper.MapperPackage#getRoleMapper_Uid()
	 * @model id="true"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link mapper.RoleMapper#getUid <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' attribute.
	 * @see #getUid()
	 * @generated
	 */
	void setUid(String value);

	/**
	 * Returns the value of the '<em><b>Local Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Role Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Role Name</em>' attribute.
	 * @see #setLocalRoleName(String)
	 * @see mapper.MapperPackage#getRoleMapper_LocalRoleName()
	 * @model
	 * @generated
	 */
	String getLocalRoleName();

	/**
	 * Sets the value of the '{@link mapper.RoleMapper#getLocalRoleName <em>Local Role Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Role Name</em>' attribute.
	 * @see #getLocalRoleName()
	 * @generated
	 */
	void setLocalRoleName(String value);

	/**
	 * Returns the value of the '<em><b>Global Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global Role Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Role Name</em>' attribute.
	 * @see #setGlobalRoleName(String)
	 * @see mapper.MapperPackage#getRoleMapper_GlobalRoleName()
	 * @model
	 * @generated
	 */
	String getGlobalRoleName();

	/**
	 * Sets the value of the '{@link mapper.RoleMapper#getGlobalRoleName <em>Global Role Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Global Role Name</em>' attribute.
	 * @see #getGlobalRoleName()
	 * @generated
	 */
	void setGlobalRoleName(String value);

} // RoleMapper
