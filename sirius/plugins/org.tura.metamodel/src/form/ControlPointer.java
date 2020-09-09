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
package form;

import org.eclipse.emf.ecore.EObject;

import type.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Pointer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link form.ControlPointer#getSourcePointer <em>Source Pointer</em>}</li>
 *   <li>{@link form.ControlPointer#getValuePointer <em>Value Pointer</em>}</li>
 *   <li>{@link form.ControlPointer#getSourceCast <em>Source Cast</em>}</li>
 *   <li>{@link form.ControlPointer#getSourceCastDataControl <em>Source Cast Data Control</em>}</li>
 * </ul>
 *
 * @see form.FormPackage#getControlPointer()
 * @model
 * @generated
 */
public interface ControlPointer extends EObject {
	/**
	 * Returns the value of the '<em><b>Source Pointer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Pointer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Pointer</em>' reference.
	 * @see #setSourcePointer(DataControl)
	 * @see form.FormPackage#getControlPointer_SourcePointer()
	 * @model
	 * @generated
	 */
	DataControl getSourcePointer();

	/**
	 * Sets the value of the '{@link form.ControlPointer#getSourcePointer <em>Source Pointer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Pointer</em>' reference.
	 * @see #getSourcePointer()
	 * @generated
	 */
	void setSourcePointer(DataControl value);

	/**
	 * Returns the value of the '<em><b>Value Pointer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Pointer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Pointer</em>' reference.
	 * @see #setValuePointer(EObject)
	 * @see form.FormPackage#getControlPointer_ValuePointer()
	 * @model
	 * @generated
	 */
	EObject getValuePointer();

	/**
	 * Sets the value of the '{@link form.ControlPointer#getValuePointer <em>Value Pointer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Pointer</em>' reference.
	 * @see #getValuePointer()
	 * @generated
	 */
	void setValuePointer(EObject value);

	/**
	 * Returns the value of the '<em><b>Source Cast</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Cast</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Cast</em>' reference.
	 * @see #setSourceCast(Type)
	 * @see form.FormPackage#getControlPointer_SourceCast()
	 * @model
	 * @generated
	 */
	Type getSourceCast();

	/**
	 * Sets the value of the '{@link form.ControlPointer#getSourceCast <em>Source Cast</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Cast</em>' reference.
	 * @see #getSourceCast()
	 * @generated
	 */
	void setSourceCast(Type value);

	/**
	 * Returns the value of the '<em><b>Source Cast Data Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Cast Data Control</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Cast Data Control</em>' reference.
	 * @see #setSourceCastDataControl(DataControl)
	 * @see form.FormPackage#getControlPointer_SourceCastDataControl()
	 * @model
	 * @generated
	 */
	DataControl getSourceCastDataControl();

	/**
	 * Sets the value of the '{@link form.ControlPointer#getSourceCastDataControl <em>Source Cast Data Control</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Cast Data Control</em>' reference.
	 * @see #getSourceCastDataControl()
	 * @generated
	 */
	void setSourceCastDataControl(DataControl value);

} // ControlPointer
