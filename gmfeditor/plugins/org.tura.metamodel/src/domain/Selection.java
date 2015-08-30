/*******************************************************************************
 * Tura - application generation platform
 *
 * Copyright (c) 2012, 2015, Arseniy Isakov
 *  
 * This project includes software developed by Arseniy Isakov
 * http://sourceforge.net/p/tura/wiki/Home/
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
/**
 */
package domain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Selection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.Selection#getDisplayOptionPointer <em>Display Option Pointer</em>}</li>
 *   <li>{@link domain.Selection#getValueOptionPointer <em>Value Option Pointer</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getSelection()
 * @model
 * @generated
 */
public interface Selection extends StyleElement {
	/**
	 * Returns the value of the '<em><b>Display Option Pointer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Option Pointer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Option Pointer</em>' reference.
	 * @see #setDisplayOptionPointer(EObject)
	 * @see domain.DomainPackage#getSelection_DisplayOptionPointer()
	 * @model
	 * @generated
	 */
	EObject getDisplayOptionPointer();

	/**
	 * Sets the value of the '{@link domain.Selection#getDisplayOptionPointer <em>Display Option Pointer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Option Pointer</em>' reference.
	 * @see #getDisplayOptionPointer()
	 * @generated
	 */
	void setDisplayOptionPointer(EObject value);

	/**
	 * Returns the value of the '<em><b>Value Option Pointer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Option Pointer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Option Pointer</em>' reference.
	 * @see #setValueOptionPointer(EObject)
	 * @see domain.DomainPackage#getSelection_ValueOptionPointer()
	 * @model
	 * @generated
	 */
	EObject getValueOptionPointer();

	/**
	 * Sets the value of the '{@link domain.Selection#getValueOptionPointer <em>Value Option Pointer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Option Pointer</em>' reference.
	 * @see #getValueOptionPointer()
	 * @generated
	 */
	void setValueOptionPointer(EObject value);

} // Selection
