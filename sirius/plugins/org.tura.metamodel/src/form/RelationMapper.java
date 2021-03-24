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
package form;

import org.eclipse.emf.ecore.EObject;

import type.Assosiation;
import type.TypeElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation Mapper</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link form.RelationMapper#getUid <em>Uid</em>}</li>
 *   <li>{@link form.RelationMapper#getDataControlRef <em>Data Control Ref</em>}</li>
 *   <li>{@link form.RelationMapper#getTypeRef <em>Type Ref</em>}</li>
 *   <li>{@link form.RelationMapper#getAssosiationRef <em>Assosiation Ref</em>}</li>
 * </ul>
 *
 * @see form.FormPackage#getRelationMapper()
 * @model
 * @generated
 */
public interface RelationMapper extends EObject {
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
	 * @see form.FormPackage#getRelationMapper_Uid()
	 * @model id="true"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link form.RelationMapper#getUid <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' attribute.
	 * @see #getUid()
	 * @generated
	 */
	void setUid(String value);

	/**
	 * Returns the value of the '<em><b>Data Control Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Control Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Control Ref</em>' reference.
	 * @see #setDataControlRef(DataControl)
	 * @see form.FormPackage#getRelationMapper_DataControlRef()
	 * @model
	 * @generated
	 */
	DataControl getDataControlRef();

	/**
	 * Sets the value of the '{@link form.RelationMapper#getDataControlRef <em>Data Control Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Control Ref</em>' reference.
	 * @see #getDataControlRef()
	 * @generated
	 */
	void setDataControlRef(DataControl value);

	/**
	 * Returns the value of the '<em><b>Type Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Ref</em>' reference.
	 * @see #setTypeRef(TypeElement)
	 * @see form.FormPackage#getRelationMapper_TypeRef()
	 * @model
	 * @generated
	 */
	TypeElement getTypeRef();

	/**
	 * Sets the value of the '{@link form.RelationMapper#getTypeRef <em>Type Ref</em>}' reference.
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
	 * <p>
	 * If the meaning of the '<em>Assosiation Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assosiation Ref</em>' reference.
	 * @see #setAssosiationRef(Assosiation)
	 * @see form.FormPackage#getRelationMapper_AssosiationRef()
	 * @model
	 * @generated
	 */
	Assosiation getAssosiationRef();

	/**
	 * Sets the value of the '{@link form.RelationMapper#getAssosiationRef <em>Assosiation Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assosiation Ref</em>' reference.
	 * @see #getAssosiationRef()
	 * @generated
	 */
	void setAssosiationRef(Assosiation value);

} // RelationMapper
