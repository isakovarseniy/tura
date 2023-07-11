/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
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
package form;

import common.HTMLLayerHolder;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link form.Table#getLabel <em>Label</em>}</li>
 *   <li>{@link form.Table#getRowNumber <em>Row Number</em>}</li>
 *   <li>{@link form.Table#getSelectionMode <em>Selection Mode</em>}</li>
 *   <li>{@link form.Table#getCols <em>Cols</em>}</li>
 *   <li>{@link form.Table#isScrollable <em>Scrollable</em>}</li>
 *   <li>{@link form.Table#getScrollHeight <em>Scroll Height</em>}</li>
 * </ul>
 *
 * @see form.FormPackage#getTable()
 * @model
 * @generated
 */
public interface Table extends SourcesPointer, MultiLangLabel, HTMLLayerHolder {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see form.FormPackage#getTable_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link form.Table#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Row Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Row Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Row Number</em>' attribute.
	 * @see #setRowNumber(int)
	 * @see form.FormPackage#getTable_RowNumber()
	 * @model
	 * @generated
	 */
	int getRowNumber();

	/**
	 * Sets the value of the '{@link form.Table#getRowNumber <em>Row Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Row Number</em>' attribute.
	 * @see #getRowNumber()
	 * @generated
	 */
	void setRowNumber(int value);

	/**
	 * Returns the value of the '<em><b>Selection Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link form.SelectionMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selection Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selection Mode</em>' attribute.
	 * @see form.SelectionMode
	 * @see #setSelectionMode(SelectionMode)
	 * @see form.FormPackage#getTable_SelectionMode()
	 * @model
	 * @generated
	 */
	SelectionMode getSelectionMode();

	/**
	 * Sets the value of the '{@link form.Table#getSelectionMode <em>Selection Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selection Mode</em>' attribute.
	 * @see form.SelectionMode
	 * @see #getSelectionMode()
	 * @generated
	 */
	void setSelectionMode(SelectionMode value);

	/**
	 * Returns the value of the '<em><b>Cols</b></em>' containment reference list.
	 * The list contents are of type {@link form.Column}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cols</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cols</em>' containment reference list.
	 * @see form.FormPackage#getTable_Cols()
	 * @model containment="true"
	 * @generated
	 */
	EList<Column> getCols();

	/**
	 * Returns the value of the '<em><b>Scrollable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scrollable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scrollable</em>' attribute.
	 * @see #setScrollable(boolean)
	 * @see form.FormPackage#getTable_Scrollable()
	 * @model
	 * @generated
	 */
	boolean isScrollable();

	/**
	 * Sets the value of the '{@link form.Table#isScrollable <em>Scrollable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scrollable</em>' attribute.
	 * @see #isScrollable()
	 * @generated
	 */
	void setScrollable(boolean value);

	/**
	 * Returns the value of the '<em><b>Scroll Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scroll Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scroll Height</em>' attribute.
	 * @see #setScrollHeight(int)
	 * @see form.FormPackage#getTable_ScrollHeight()
	 * @model
	 * @generated
	 */
	int getScrollHeight();

	/**
	 * Sets the value of the '{@link form.Table#getScrollHeight <em>Scroll Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scroll Height</em>' attribute.
	 * @see #getScrollHeight()
	 * @generated
	 */
	void setScrollHeight(int value);

} // Table
