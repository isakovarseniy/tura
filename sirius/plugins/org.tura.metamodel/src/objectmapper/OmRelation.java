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

import type.Assosiation;
import type.TypeElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Om Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link objectmapper.OmRelation#getUid <em>Uid</em>}</li>
 *   <li>{@link objectmapper.OmRelation#getName <em>Name</em>}</li>
 *   <li>{@link objectmapper.OmRelation#getObjectMapperRef <em>Object Mapper Ref</em>}</li>
 *   <li>{@link objectmapper.OmRelation#getTypeRef <em>Type Ref</em>}</li>
 *   <li>{@link objectmapper.OmRelation#getAssosiationRef <em>Assosiation Ref</em>}</li>
 * </ul>
 *
 * @see objectmapper.ObjectmapperPackage#getOmRelation()
 * @model
 * @generated
 */
public interface OmRelation extends EObject {
	/**
	 * Returns the value of the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uid</em>' attribute.
	 * @see #setUid(String)
	 * @see objectmapper.ObjectmapperPackage#getOmRelation_Uid()
	 * @model id="true"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link objectmapper.OmRelation#getUid <em>Uid</em>}' attribute.
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
	 * @see objectmapper.ObjectmapperPackage#getOmRelation_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link objectmapper.OmRelation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Object Mapper Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Mapper Ref</em>' reference.
	 * @see #setObjectMapperRef(ObjectMapper)
	 * @see objectmapper.ObjectmapperPackage#getOmRelation_ObjectMapperRef()
	 * @model
	 * @generated
	 */
	ObjectMapper getObjectMapperRef();

	/**
	 * Sets the value of the '{@link objectmapper.OmRelation#getObjectMapperRef <em>Object Mapper Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Mapper Ref</em>' reference.
	 * @see #getObjectMapperRef()
	 * @generated
	 */
	void setObjectMapperRef(ObjectMapper value);

	/**
	 * Returns the value of the '<em><b>Type Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Ref</em>' reference.
	 * @see #setTypeRef(TypeElement)
	 * @see objectmapper.ObjectmapperPackage#getOmRelation_TypeRef()
	 * @model
	 * @generated
	 */
	TypeElement getTypeRef();

	/**
	 * Sets the value of the '{@link objectmapper.OmRelation#getTypeRef <em>Type Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Ref</em>' reference.
	 * @see #getTypeRef()
	 * @generated
	 */
	void setTypeRef(TypeElement value);

	/**
	 * Returns the value of the '<em><b>Assosiation Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assosiation Ref</em>' reference.
	 * @see #setAssosiationRef(Assosiation)
	 * @see objectmapper.ObjectmapperPackage#getOmRelation_AssosiationRef()
	 * @model
	 * @generated
	 */
	Assosiation getAssosiationRef();

	/**
	 * Sets the value of the '{@link objectmapper.OmRelation#getAssosiationRef <em>Assosiation Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assosiation Ref</em>' reference.
	 * @see #getAssosiationRef()
	 * @generated
	 */
	void setAssosiationRef(Assosiation value);

} // OmRelation
