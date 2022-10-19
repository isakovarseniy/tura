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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Full Calendar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link form.FullCalendar#getViewType <em>View Type</em>}</li>
 * </ul>
 *
 * @see form.FormPackage#getFullCalendar()
 * @model
 * @generated
 */
public interface FullCalendar extends SourcesPointer {
	/**
	 * Returns the value of the '<em><b>View Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Type</em>' attribute.
	 * @see #setViewType(String)
	 * @see form.FormPackage#getFullCalendar_ViewType()
	 * @model
	 * @generated
	 */
	String getViewType();

	/**
	 * Sets the value of the '{@link form.FullCalendar#getViewType <em>View Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View Type</em>' attribute.
	 * @see #getViewType()
	 * @generated
	 */
	void setViewType(String value);

} // FullCalendar
