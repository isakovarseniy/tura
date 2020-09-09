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
package domain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import type.PrimitivesGroup;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Types</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link domain.DomainTypes#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.DomainTypes#getName <em>Name</em>}</li>
 *   <li>{@link domain.DomainTypes#getTypesRepository <em>Types Repository</em>}</li>
 *   <li>{@link domain.DomainTypes#getPrimitives <em>Primitives</em>}</li>
 * </ul>
 *
 * @see domain.DomainPackage#getDomainTypes()
 * @model
 * @generated
 */
public interface DomainTypes extends EObject {
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
	 * @see domain.DomainPackage#getDomainTypes_Uid()
	 * @model id="true"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link domain.DomainTypes#getUid <em>Uid</em>}' attribute.
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
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see domain.DomainPackage#getDomainTypes_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link domain.DomainTypes#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Types Repository</b></em>' containment reference list.
	 * The list contents are of type {@link domain.DomainTypesRepository}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types Repository</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types Repository</em>' containment reference list.
	 * @see domain.DomainPackage#getDomainTypes_TypesRepository()
	 * @model containment="true"
	 * @generated
	 */
	EList<DomainTypesRepository> getTypesRepository();

	/**
	 * Returns the value of the '<em><b>Primitives</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primitives</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primitives</em>' containment reference.
	 * @see #setPrimitives(PrimitivesGroup)
	 * @see domain.DomainPackage#getDomainTypes_Primitives()
	 * @model containment="true"
	 * @generated
	 */
	PrimitivesGroup getPrimitives();

	/**
	 * Sets the value of the '{@link domain.DomainTypes#getPrimitives <em>Primitives</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primitives</em>' containment reference.
	 * @see #getPrimitives()
	 * @generated
	 */
	void setPrimitives(PrimitivesGroup value);

} // DomainTypes
