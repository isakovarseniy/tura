/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Scroller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link form.DataScroller#getRowNumber <em>Row Number</em>}</li>
 *   <li>{@link form.DataScroller#getColNumber <em>Col Number</em>}</li>
 * </ul>
 *
 * @see form.FormPackage#getDataScroller()
 * @model
 * @generated
 */
public interface DataScroller extends SourcesPointer, ChildrenHolder, MultiLangLabel, HTMLLayerHolder {
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
	 * @see form.FormPackage#getDataScroller_RowNumber()
	 * @model
	 * @generated
	 */
	int getRowNumber();

	/**
	 * Sets the value of the '{@link form.DataScroller#getRowNumber <em>Row Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Row Number</em>' attribute.
	 * @see #getRowNumber()
	 * @generated
	 */
	void setRowNumber(int value);

	/**
	 * Returns the value of the '<em><b>Col Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Col Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Col Number</em>' attribute.
	 * @see #setColNumber(int)
	 * @see form.FormPackage#getDataScroller_ColNumber()
	 * @model
	 * @generated
	 */
	int getColNumber();

	/**
	 * Sets the value of the '{@link form.DataScroller#getColNumber <em>Col Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Col Number</em>' attribute.
	 * @see #getColNumber()
	 * @generated
	 */
	void setColNumber(int value);

} // DataScroller
