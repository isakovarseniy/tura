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
package recipe;

import mapper.Mapper;
import mapper.VersionRef;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java Script Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link recipe.JavaScriptComponent#getPackageName <em>Package Name</em>}</li>
 *   <li>{@link recipe.JavaScriptComponent#getMapperRef <em>Mapper Ref</em>}</li>
 * </ul>
 *
 * @see recipe.RecipePackage#getJavaScriptComponent()
 * @model
 * @generated
 */
public interface JavaScriptComponent extends Component, VersionRef {
	/**
	 * Returns the value of the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Name</em>' attribute.
	 * @see #setPackageName(String)
	 * @see recipe.RecipePackage#getJavaScriptComponent_PackageName()
	 * @model
	 * @generated
	 */
	String getPackageName();

	/**
	 * Sets the value of the '{@link recipe.JavaScriptComponent#getPackageName <em>Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Name</em>' attribute.
	 * @see #getPackageName()
	 * @generated
	 */
	void setPackageName(String value);

	/**
	 * Returns the value of the '<em><b>Mapper Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapper Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapper Ref</em>' reference.
	 * @see #setMapperRef(Mapper)
	 * @see recipe.RecipePackage#getJavaScriptComponent_MapperRef()
	 * @model
	 * @generated
	 */
	Mapper getMapperRef();

	/**
	 * Sets the value of the '{@link recipe.JavaScriptComponent#getMapperRef <em>Mapper Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapper Ref</em>' reference.
	 * @see #getMapperRef()
	 * @generated
	 */
	void setMapperRef(Mapper value);

} // JavaScriptComponent
