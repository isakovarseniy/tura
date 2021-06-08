/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
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

import form.ContextParameters;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link objectmapper.OperationConnector#getUid <em>Uid</em>}</li>
 *   <li>{@link objectmapper.OperationConnector#getName <em>Name</em>}</li>
 *   <li>{@link objectmapper.OperationConnector#getSource <em>Source</em>}</li>
 *   <li>{@link objectmapper.OperationConnector#getTarget <em>Target</em>}</li>
 *   <li>{@link objectmapper.OperationConnector#getOperationType <em>Operation Type</em>}</li>
 *   <li>{@link objectmapper.OperationConnector#getDefaultSearch <em>Default Search</em>}</li>
 * </ul>
 *
 * @see objectmapper.ObjectmapperPackage#getOperationConnector()
 * @model
 * @generated
 */
public interface OperationConnector extends OperationConnectorRef {
	/**
	 * Returns the value of the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uid</em>' attribute.
	 * @see #setUid(String)
	 * @see objectmapper.ObjectmapperPackage#getOperationConnector_Uid()
	 * @model id="true"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link objectmapper.OperationConnector#getUid <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' attribute.
	 * @see #getUid()
	 * @generated
	 */
	void setUid(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see objectmapper.ObjectmapperPackage#getOperationConnector_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link objectmapper.OperationConnector#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(ObjectMapper)
	 * @see objectmapper.ObjectmapperPackage#getOperationConnector_Source()
	 * @model
	 * @generated
	 */
	ObjectMapper getSource();

	/**
	 * Sets the value of the '{@link objectmapper.OperationConnector#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ObjectMapper value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(ObjectMapper)
	 * @see objectmapper.ObjectmapperPackage#getOperationConnector_Target()
	 * @model
	 * @generated
	 */
	ObjectMapper getTarget();

	/**
	 * Sets the value of the '{@link objectmapper.OperationConnector#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ObjectMapper value);

	/**
	 * Returns the value of the '<em><b>Operation Type</b></em>' attribute.
	 * The literals are from the enumeration {@link objectmapper.OperationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Type</em>' attribute.
	 * @see objectmapper.OperationType
	 * @see #setOperationType(OperationType)
	 * @see objectmapper.ObjectmapperPackage#getOperationConnector_OperationType()
	 * @model
	 * @generated
	 */
	OperationType getOperationType();

	/**
	 * Sets the value of the '{@link objectmapper.OperationConnector#getOperationType <em>Operation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Type</em>' attribute.
	 * @see objectmapper.OperationType
	 * @see #getOperationType()
	 * @generated
	 */
	void setOperationType(OperationType value);

	/**
	 * Returns the value of the '<em><b>Default Search</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Search</em>' containment reference.
	 * @see #setDefaultSearch(ContextParameters)
	 * @see objectmapper.ObjectmapperPackage#getOperationConnector_DefaultSearch()
	 * @model containment="true"
	 * @generated
	 */
	ContextParameters getDefaultSearch();

	/**
	 * Sets the value of the '{@link objectmapper.OperationConnector#getDefaultSearch <em>Default Search</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Search</em>' containment reference.
	 * @see #getDefaultSearch()
	 * @generated
	 */
	void setDefaultSearch(ContextParameters value);

} // OperationConnector
