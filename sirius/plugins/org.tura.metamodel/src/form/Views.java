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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Views</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link form.Views#getUid <em>Uid</em>}</li>
 *   <li>{@link form.Views#getCanvases <em>Canvases</em>}</li>
 *   <li>{@link form.Views#getViewInheritances <em>View Inheritances</em>}</li>
 *   <li>{@link form.Views#getTabPagesInheritances <em>Tab Pages Inheritances</em>}</li>
 *   <li>{@link form.Views#getMenus <em>Menus</em>}</li>
 * </ul>
 *
 * @see form.FormPackage#getViews()
 * @model
 * @generated
 */
public interface Views extends EObject {
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
	 * @see form.FormPackage#getViews_Uid()
	 * @model id="true"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link form.Views#getUid <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' attribute.
	 * @see #getUid()
	 * @generated
	 */
	void setUid(String value);

	/**
	 * Returns the value of the '<em><b>Canvases</b></em>' containment reference list.
	 * The list contents are of type {@link form.CanvasFrame}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Canvases</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Canvases</em>' containment reference list.
	 * @see form.FormPackage#getViews_Canvases()
	 * @model containment="true"
	 * @generated
	 */
	EList<CanvasFrame> getCanvases();

	/**
	 * Returns the value of the '<em><b>View Inheritances</b></em>' containment reference list.
	 * The list contents are of type {@link form.ViewInheritance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View Inheritances</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Inheritances</em>' containment reference list.
	 * @see form.FormPackage#getViews_ViewInheritances()
	 * @model containment="true"
	 * @generated
	 */
	EList<ViewInheritance> getViewInheritances();

	/**
	 * Returns the value of the '<em><b>Tab Pages Inheritances</b></em>' containment reference list.
	 * The list contents are of type {@link form.TabPagesInheritance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tab Pages Inheritances</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tab Pages Inheritances</em>' containment reference list.
	 * @see form.FormPackage#getViews_TabPagesInheritances()
	 * @model containment="true"
	 * @generated
	 */
	EList<TabPagesInheritance> getTabPagesInheritances();

	/**
	 * Returns the value of the '<em><b>Menus</b></em>' containment reference list.
	 * The list contents are of type {@link form.MenuDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Menus</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Menus</em>' containment reference list.
	 * @see form.FormPackage#getViews_Menus()
	 * @model containment="true"
	 * @generated
	 */
	EList<MenuDefinition> getMenus();

} // Views
