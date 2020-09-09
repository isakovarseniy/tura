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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link form.InputText#getRows <em>Rows</em>}</li>
 *   <li>{@link form.InputText#getColumns <em>Columns</em>}</li>
 * </ul>
 *
 * @see form.FormPackage#getInputText()
 * @model
 * @generated
 */
public interface InputText extends InputElement, Formatable {
	/**
	 * Returns the value of the '<em><b>Rows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rows</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rows</em>' attribute.
	 * @see #setRows(int)
	 * @see form.FormPackage#getInputText_Rows()
	 * @model
	 * @generated
	 */
	int getRows();

	/**
	 * Sets the value of the '{@link form.InputText#getRows <em>Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rows</em>' attribute.
	 * @see #getRows()
	 * @generated
	 */
	void setRows(int value);

	/**
	 * Returns the value of the '<em><b>Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columns</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' attribute.
	 * @see #setColumns(int)
	 * @see form.FormPackage#getInputText_Columns()
	 * @model
	 * @generated
	 */
	int getColumns();

	/**
	 * Sets the value of the '{@link form.InputText#getColumns <em>Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Columns</em>' attribute.
	 * @see #getColumns()
	 * @generated
	 */
	void setColumns(int value);

} // InputText
