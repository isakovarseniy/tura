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
package objectmapper;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Connector Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link objectmapper.OperationConnectorRef#getOperationRef <em>Operation Ref</em>}</li>
 * </ul>
 *
 * @see objectmapper.ObjectmapperPackage#getOperationConnectorRef()
 * @model
 * @generated
 */
public interface OperationConnectorRef extends EObject {
	/**
	 * Returns the value of the '<em><b>Operation Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Ref</em>' reference.
	 * @see #setOperationRef(OperationConnector)
	 * @see objectmapper.ObjectmapperPackage#getOperationConnectorRef_OperationRef()
	 * @model
	 * @generated
	 */
	OperationConnector getOperationRef();

	/**
	 * Sets the value of the '{@link objectmapper.OperationConnectorRef#getOperationRef <em>Operation Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Ref</em>' reference.
	 * @see #getOperationRef()
	 * @generated
	 */
	void setOperationRef(OperationConnector value);

} // OperationConnectorRef
