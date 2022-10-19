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

import common.HTMLLayerHolder;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link form.TimeLine#getLayout <em>Layout</em>}</li>
 *   <li>{@link form.TimeLine#getAlign <em>Align</em>}</li>
 * </ul>
 *
 * @see form.FormPackage#getTimeLine()
 * @model
 * @generated
 */
public interface TimeLine extends SourcesPointer, ChildrenHolder, MultiLangLabel, HTMLLayerHolder {
	/**
	 * Returns the value of the '<em><b>Layout</b></em>' attribute.
	 * The literals are from the enumeration {@link form.TimeLineLayout}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layout</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layout</em>' attribute.
	 * @see form.TimeLineLayout
	 * @see #setLayout(TimeLineLayout)
	 * @see form.FormPackage#getTimeLine_Layout()
	 * @model
	 * @generated
	 */
	TimeLineLayout getLayout();

	/**
	 * Sets the value of the '{@link form.TimeLine#getLayout <em>Layout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout</em>' attribute.
	 * @see form.TimeLineLayout
	 * @see #getLayout()
	 * @generated
	 */
	void setLayout(TimeLineLayout value);

	/**
	 * Returns the value of the '<em><b>Align</b></em>' attribute.
	 * The literals are from the enumeration {@link form.TimeLineAlign}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Align</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Align</em>' attribute.
	 * @see form.TimeLineAlign
	 * @see #setAlign(TimeLineAlign)
	 * @see form.FormPackage#getTimeLine_Align()
	 * @model
	 * @generated
	 */
	TimeLineAlign getAlign();

	/**
	 * Sets the value of the '{@link form.TimeLine#getAlign <em>Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Align</em>' attribute.
	 * @see form.TimeLineAlign
	 * @see #getAlign()
	 * @generated
	 */
	void setAlign(TimeLineAlign value);

} // TimeLine
