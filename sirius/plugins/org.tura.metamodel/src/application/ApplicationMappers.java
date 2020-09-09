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
package application;

import mapper.MappingLayer;

import mapper.Version;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mappers</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link application.ApplicationMappers#getUid <em>Uid</em>}</li>
 *   <li>{@link application.ApplicationMappers#getName <em>Name</em>}</li>
 *   <li>{@link application.ApplicationMappers#getMappers <em>Mappers</em>}</li>
 *   <li>{@link application.ApplicationMappers#getAppLayers <em>App Layers</em>}</li>
 *   <li>{@link application.ApplicationMappers#getVersions <em>Versions</em>}</li>
 * </ul>
 *
 * @see application.ApplicationPackage#getApplicationMappers()
 * @model
 * @generated
 */
public interface ApplicationMappers extends EObject {
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
	 * @see application.ApplicationPackage#getApplicationMappers_Uid()
	 * @model id="true"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link application.ApplicationMappers#getUid <em>Uid</em>}' attribute.
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
	 * @see application.ApplicationPackage#getApplicationMappers_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link application.ApplicationMappers#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Mappers</b></em>' containment reference list.
	 * The list contents are of type {@link application.ApplicationMapper}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mappers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mappers</em>' containment reference list.
	 * @see application.ApplicationPackage#getApplicationMappers_Mappers()
	 * @model containment="true"
	 * @generated
	 */
	EList<ApplicationMapper> getMappers();

	/**
	 * Returns the value of the '<em><b>App Layers</b></em>' containment reference list.
	 * The list contents are of type {@link mapper.MappingLayer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>App Layers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>App Layers</em>' containment reference list.
	 * @see application.ApplicationPackage#getApplicationMappers_AppLayers()
	 * @model containment="true"
	 * @generated
	 */
	EList<MappingLayer> getAppLayers();

	/**
	 * Returns the value of the '<em><b>Versions</b></em>' containment reference list.
	 * The list contents are of type {@link mapper.Version}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Versions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Versions</em>' containment reference list.
	 * @see application.ApplicationPackage#getApplicationMappers_Versions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Version> getVersions();

} // ApplicationMappers
