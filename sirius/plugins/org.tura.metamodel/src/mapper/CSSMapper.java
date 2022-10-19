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
package mapper;

import style.StylePointer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CSS Mapper</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mapper.CSSMapper#getUid <em>Uid</em>}</li>
 *   <li>{@link mapper.CSSMapper#getLibraryUrl <em>Library Url</em>}</li>
 * </ul>
 *
 * @see mapper.MapperPackage#getCSSMapper()
 * @model
 * @generated
 */
public interface CSSMapper extends Mapper, StylePointer {
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
	 * @see mapper.MapperPackage#getCSSMapper_Uid()
	 * @model id="true"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link mapper.CSSMapper#getUid <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' attribute.
	 * @see #getUid()
	 * @generated
	 */
	void setUid(String value);

	/**
	 * Returns the value of the '<em><b>Library Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Library Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Library Url</em>' attribute.
	 * @see #setLibraryUrl(String)
	 * @see mapper.MapperPackage#getCSSMapper_LibraryUrl()
	 * @model
	 * @generated
	 */
	String getLibraryUrl();

	/**
	 * Sets the value of the '{@link mapper.CSSMapper#getLibraryUrl <em>Library Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Library Url</em>' attribute.
	 * @see #getLibraryUrl()
	 * @generated
	 */
	void setLibraryUrl(String value);

} // CSSMapper
