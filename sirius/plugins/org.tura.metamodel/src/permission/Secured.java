/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2022 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
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
package permission;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Secured</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link permission.Secured#getGrants <em>Grants</em>}</li>
 * </ul>
 *
 * @see permission.PermissionPackage#getSecured()
 * @model
 * @generated
 */
public interface Secured extends EObject {
	/**
	 * Returns the value of the '<em><b>Grants</b></em>' containment reference list.
	 * The list contents are of type {@link permission.GrantAccess}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grants</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grants</em>' containment reference list.
	 * @see permission.PermissionPackage#getSecured_Grants()
	 * @model containment="true"
	 * @generated
	 */
	EList<GrantAccess> getGrants();

} // Secured
