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

import artifact.Categorized;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import type.AttributePointer;
import type.TypePointer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Mapper</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link objectmapper.ObjectMapper#getUid <em>Uid</em>}</li>
 *   <li>{@link objectmapper.ObjectMapper#getName <em>Name</em>}</li>
 *   <li>{@link objectmapper.ObjectMapper#getStage <em>Stage</em>}</li>
 *   <li>{@link objectmapper.ObjectMapper#getBaseType <em>Base Type</em>}</li>
 *   <li>{@link objectmapper.ObjectMapper#getRelations <em>Relations</em>}</li>
 *   <li>{@link objectmapper.ObjectMapper#getCalculations <em>Calculations</em>}</li>
 *   <li>{@link objectmapper.ObjectMapper#getAggrigations <em>Aggrigations</em>}</li>
 *   <li>{@link objectmapper.ObjectMapper#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @see objectmapper.ObjectmapperPackage#getObjectMapper()
 * @model
 * @generated
 */
public interface ObjectMapper extends Categorized {
	/**
	 * Returns the value of the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uid</em>' attribute.
	 * @see #setUid(String)
	 * @see objectmapper.ObjectmapperPackage#getObjectMapper_Uid()
	 * @model id="true"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link objectmapper.ObjectMapper#getUid <em>Uid</em>}' attribute.
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
	 * @see objectmapper.ObjectmapperPackage#getObjectMapper_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link objectmapper.ObjectMapper#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Stage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stage</em>' reference.
	 * @see #setStage(ProcessingStage)
	 * @see objectmapper.ObjectmapperPackage#getObjectMapper_Stage()
	 * @model
	 * @generated
	 */
	ProcessingStage getStage();

	/**
	 * Sets the value of the '{@link objectmapper.ObjectMapper#getStage <em>Stage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stage</em>' reference.
	 * @see #getStage()
	 * @generated
	 */
	void setStage(ProcessingStage value);

	/**
	 * Returns the value of the '<em><b>Base Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Type</em>' containment reference.
	 * @see #setBaseType(TypePointer)
	 * @see objectmapper.ObjectmapperPackage#getObjectMapper_BaseType()
	 * @model containment="true"
	 * @generated
	 */
	TypePointer getBaseType();

	/**
	 * Sets the value of the '{@link objectmapper.ObjectMapper#getBaseType <em>Base Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Type</em>' containment reference.
	 * @see #getBaseType()
	 * @generated
	 */
	void setBaseType(TypePointer value);

	/**
	 * Returns the value of the '<em><b>Relations</b></em>' containment reference list.
	 * The list contents are of type {@link objectmapper.OmRelation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relations</em>' containment reference list.
	 * @see objectmapper.ObjectmapperPackage#getObjectMapper_Relations()
	 * @model containment="true"
	 * @generated
	 */
	EList<OmRelation> getRelations();

	/**
	 * Returns the value of the '<em><b>Calculations</b></em>' containment reference list.
	 * The list contents are of type {@link objectmapper.CalculatedField}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calculations</em>' containment reference list.
	 * @see objectmapper.ObjectmapperPackage#getObjectMapper_Calculations()
	 * @model containment="true"
	 * @generated
	 */
	EList<CalculatedField> getCalculations();

	/**
	 * Returns the value of the '<em><b>Aggrigations</b></em>' containment reference list.
	 * The list contents are of type {@link objectmapper.Aggregation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggrigations</em>' containment reference list.
	 * @see objectmapper.ObjectmapperPackage#getObjectMapper_Aggrigations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Aggregation> getAggrigations();

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link type.AttributePointer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see objectmapper.ObjectmapperPackage#getObjectMapper_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttributePointer> getAttributes();

} // ObjectMapper
