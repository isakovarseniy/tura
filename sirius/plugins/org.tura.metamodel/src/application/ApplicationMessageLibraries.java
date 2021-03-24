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
package application;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Libraries</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link application.ApplicationMessageLibraries#getUid <em>Uid</em>}</li>
 *   <li>{@link application.ApplicationMessageLibraries#getName <em>Name</em>}</li>
 *   <li>{@link application.ApplicationMessageLibraries#getMessageLibraries <em>Message Libraries</em>}</li>
 *   <li>{@link application.ApplicationMessageLibraries#getApplicationLanguages <em>Application Languages</em>}</li>
 * </ul>
 *
 * @see application.ApplicationPackage#getApplicationMessageLibraries()
 * @model
 * @generated
 */
public interface ApplicationMessageLibraries extends EObject {
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
	 * @see application.ApplicationPackage#getApplicationMessageLibraries_Uid()
	 * @model id="true"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link application.ApplicationMessageLibraries#getUid <em>Uid</em>}' attribute.
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
	 * @see application.ApplicationPackage#getApplicationMessageLibraries_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link application.ApplicationMessageLibraries#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Message Libraries</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Libraries</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Libraries</em>' containment reference.
	 * @see #setMessageLibraries(ApplicationMessageLibrary)
	 * @see application.ApplicationPackage#getApplicationMessageLibraries_MessageLibraries()
	 * @model containment="true"
	 * @generated
	 */
	ApplicationMessageLibrary getMessageLibraries();

	/**
	 * Sets the value of the '{@link application.ApplicationMessageLibraries#getMessageLibraries <em>Message Libraries</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Libraries</em>' containment reference.
	 * @see #getMessageLibraries()
	 * @generated
	 */
	void setMessageLibraries(ApplicationMessageLibrary value);

	/**
	 * Returns the value of the '<em><b>Application Languages</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application Languages</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application Languages</em>' containment reference.
	 * @see #setApplicationLanguages(ApplicationLanguages)
	 * @see application.ApplicationPackage#getApplicationMessageLibraries_ApplicationLanguages()
	 * @model containment="true"
	 * @generated
	 */
	ApplicationLanguages getApplicationLanguages();

	/**
	 * Sets the value of the '{@link application.ApplicationMessageLibraries#getApplicationLanguages <em>Application Languages</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application Languages</em>' containment reference.
	 * @see #getApplicationLanguages()
	 * @generated
	 */
	void setApplicationLanguages(ApplicationLanguages value);

} // ApplicationMessageLibraries
