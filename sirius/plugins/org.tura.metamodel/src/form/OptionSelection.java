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

import type.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Option Selection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link form.OptionSelection#getOptionPointer <em>Option Pointer</em>}</li>
 *   <li>{@link form.OptionSelection#getOptionCast <em>Option Cast</em>}</li>
 *   <li>{@link form.OptionSelection#getOptionCastDataControl <em>Option Cast Data Control</em>}</li>
 *   <li>{@link form.OptionSelection#getSelection <em>Selection</em>}</li>
 *   <li>{@link form.OptionSelection#getInitialOptionMessage <em>Initial Option Message</em>}</li>
 *   <li>{@link form.OptionSelection#getInitialOptionValue <em>Initial Option Value</em>}</li>
 * </ul>
 *
 * @see form.FormPackage#getOptionSelection()
 * @model
 * @generated
 */
public interface OptionSelection extends EObject {
	/**
	 * Returns the value of the '<em><b>Option Pointer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Option Pointer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Option Pointer</em>' reference.
	 * @see #setOptionPointer(DataControl)
	 * @see form.FormPackage#getOptionSelection_OptionPointer()
	 * @model
	 * @generated
	 */
	DataControl getOptionPointer();

	/**
	 * Sets the value of the '{@link form.OptionSelection#getOptionPointer <em>Option Pointer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Option Pointer</em>' reference.
	 * @see #getOptionPointer()
	 * @generated
	 */
	void setOptionPointer(DataControl value);

	/**
	 * Returns the value of the '<em><b>Option Cast</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Option Cast</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Option Cast</em>' reference.
	 * @see #setOptionCast(Type)
	 * @see form.FormPackage#getOptionSelection_OptionCast()
	 * @model
	 * @generated
	 */
	Type getOptionCast();

	/**
	 * Sets the value of the '{@link form.OptionSelection#getOptionCast <em>Option Cast</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Option Cast</em>' reference.
	 * @see #getOptionCast()
	 * @generated
	 */
	void setOptionCast(Type value);

	/**
	 * Returns the value of the '<em><b>Option Cast Data Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Option Cast Data Control</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Option Cast Data Control</em>' reference.
	 * @see #setOptionCastDataControl(DataControl)
	 * @see form.FormPackage#getOptionSelection_OptionCastDataControl()
	 * @model
	 * @generated
	 */
	DataControl getOptionCastDataControl();

	/**
	 * Sets the value of the '{@link form.OptionSelection#getOptionCastDataControl <em>Option Cast Data Control</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Option Cast Data Control</em>' reference.
	 * @see #getOptionCastDataControl()
	 * @generated
	 */
	void setOptionCastDataControl(DataControl value);

	/**
	 * Returns the value of the '<em><b>Selection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selection</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selection</em>' containment reference.
	 * @see #setSelection(Selection)
	 * @see form.FormPackage#getOptionSelection_Selection()
	 * @model containment="true"
	 * @generated
	 */
	Selection getSelection();

	/**
	 * Sets the value of the '{@link form.OptionSelection#getSelection <em>Selection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selection</em>' containment reference.
	 * @see #getSelection()
	 * @generated
	 */
	void setSelection(Selection value);

	/**
	 * Returns the value of the '<em><b>Initial Option Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Option Message</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Option Message</em>' containment reference.
	 * @see #setInitialOptionMessage(Context)
	 * @see form.FormPackage#getOptionSelection_InitialOptionMessage()
	 * @model containment="true"
	 * @generated
	 */
	Context getInitialOptionMessage();

	/**
	 * Sets the value of the '{@link form.OptionSelection#getInitialOptionMessage <em>Initial Option Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Option Message</em>' containment reference.
	 * @see #getInitialOptionMessage()
	 * @generated
	 */
	void setInitialOptionMessage(Context value);

	/**
	 * Returns the value of the '<em><b>Initial Option Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Option Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Option Value</em>' attribute.
	 * @see #setInitialOptionValue(String)
	 * @see form.FormPackage#getOptionSelection_InitialOptionValue()
	 * @model
	 * @generated
	 */
	String getInitialOptionValue();

	/**
	 * Sets the value of the '{@link form.OptionSelection#getInitialOptionValue <em>Initial Option Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Option Value</em>' attribute.
	 * @see #getInitialOptionValue()
	 * @generated
	 */
	void setInitialOptionValue(String value);

} // OptionSelection
