/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2022 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tree</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link form.Tree#getLabel <em>Label</em>}</li>
 *   <li>{@link form.Tree#getSelectionMode <em>Selection Mode</em>}</li>
 *   <li>{@link form.Tree#getImage <em>Image</em>}</li>
 *   <li>{@link form.Tree#getCols <em>Cols</em>}</li>
 * </ul>
 *
 * @see form.FormPackage#getTree()
 * @model
 * @generated
 */
public interface Tree extends SourcesPointer, MultiLangLabel {
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
	 * @see form.FormPackage#getTree_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link form.Tree#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

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
	 * @see form.FormPackage#getTree_SelectionMode()
	 * @model
	 * @generated
	 */
	SelectionMode getSelectionMode();

	/**
	 * Sets the value of the '{@link form.Tree#getSelectionMode <em>Selection Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selection Mode</em>' attribute.
	 * @see form.SelectionMode
	 * @see #getSelectionMode()
	 * @generated
	 */
	void setSelectionMode(SelectionMode value);

	/**
	 * Returns the value of the '<em><b>Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' containment reference.
	 * @see #setImage(Context)
	 * @see form.FormPackage#getTree_Image()
	 * @model containment="true"
	 * @generated
	 */
	Context getImage();

	/**
	 * Sets the value of the '{@link form.Tree#getImage <em>Image</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image</em>' containment reference.
	 * @see #getImage()
	 * @generated
	 */
	void setImage(Context value);

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
	 * @see form.FormPackage#getTree_Cols()
	 * @model containment="true"
	 * @generated
	 */
	EList<Column> getCols();

} // Tree
