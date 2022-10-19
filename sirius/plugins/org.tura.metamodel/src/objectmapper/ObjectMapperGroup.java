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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Mapper Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link objectmapper.ObjectMapperGroup#getUid <em>Uid</em>}</li>
 *   <li>{@link objectmapper.ObjectMapperGroup#getName <em>Name</em>}</li>
 *   <li>{@link objectmapper.ObjectMapperGroup#getObjectMappers <em>Object Mappers</em>}</li>
 *   <li>{@link objectmapper.ObjectMapperGroup#getStages <em>Stages</em>}</li>
 *   <li>{@link objectmapper.ObjectMapperGroup#getAttributesConnector <em>Attributes Connector</em>}</li>
 *   <li>{@link objectmapper.ObjectMapperGroup#getOperationsConnector <em>Operations Connector</em>}</li>
 *   <li>{@link objectmapper.ObjectMapperGroup#getVariables <em>Variables</em>}</li>
 * </ul>
 *
 * @see objectmapper.ObjectmapperPackage#getObjectMapperGroup()
 * @model
 * @generated
 */
public interface ObjectMapperGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uid</em>' attribute.
	 * @see #setUid(String)
	 * @see objectmapper.ObjectmapperPackage#getObjectMapperGroup_Uid()
	 * @model id="true"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link objectmapper.ObjectMapperGroup#getUid <em>Uid</em>}' attribute.
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
	 * @see objectmapper.ObjectmapperPackage#getObjectMapperGroup_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link objectmapper.ObjectMapperGroup#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Object Mappers</b></em>' containment reference list.
	 * The list contents are of type {@link objectmapper.ObjectMapper}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Mappers</em>' containment reference list.
	 * @see objectmapper.ObjectmapperPackage#getObjectMapperGroup_ObjectMappers()
	 * @model containment="true"
	 * @generated
	 */
	EList<ObjectMapper> getObjectMappers();

	/**
	 * Returns the value of the '<em><b>Stages</b></em>' containment reference list.
	 * The list contents are of type {@link objectmapper.ProcessingStage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stages</em>' containment reference list.
	 * @see objectmapper.ObjectmapperPackage#getObjectMapperGroup_Stages()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProcessingStage> getStages();

	/**
	 * Returns the value of the '<em><b>Attributes Connector</b></em>' containment reference list.
	 * The list contents are of type {@link objectmapper.AttributeConnector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes Connector</em>' containment reference list.
	 * @see objectmapper.ObjectmapperPackage#getObjectMapperGroup_AttributesConnector()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttributeConnector> getAttributesConnector();

	/**
	 * Returns the value of the '<em><b>Operations Connector</b></em>' containment reference list.
	 * The list contents are of type {@link objectmapper.OperationConnector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations Connector</em>' containment reference list.
	 * @see objectmapper.ObjectmapperPackage#getObjectMapperGroup_OperationsConnector()
	 * @model containment="true"
	 * @generated
	 */
	EList<OperationConnector> getOperationsConnector();

	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link objectmapper.Variable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see objectmapper.ObjectmapperPackage#getObjectMapperGroup_Variables()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getVariables();

} // ObjectMapperGroup
