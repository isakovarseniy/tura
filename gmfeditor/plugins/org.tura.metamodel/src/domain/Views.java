/*******************************************************************************
 * Tura - application generation platform
 *
 * Copyright (c) 2012, 2015, Arseniy Isakov
 *  
 * This project includes software developed by Arseniy Isakov
 * http://sourceforge.net/p/tura/wiki/Home/
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
/**
 */
package domain;

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
 *   <li>{@link domain.Views#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.Views#getParent <em>Parent</em>}</li>
 *   <li>{@link domain.Views#getCanvases <em>Canvases</em>}</li>
 *   <li>{@link domain.Views#getViewInheritances <em>View Inheritances</em>}</li>
 *   <li>{@link domain.Views#getTabPagesInheritances <em>Tab Pages Inheritances</em>}</li>
 *   <li>{@link domain.Views#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @see domain.DomainPackage#getViews()
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
	 * @see domain.DomainPackage#getViews_Uid()
	 * @model id="true"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link domain.Views#getUid <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' attribute.
	 * @see #getUid()
	 * @generated
	 */
	void setUid(String value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link domain.FormView#getView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(FormView)
	 * @see domain.DomainPackage#getViews_Parent()
	 * @see domain.FormView#getView
	 * @model opposite="view"
	 * @generated
	 */
	FormView getParent();

	/**
	 * Sets the value of the '{@link domain.Views#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(FormView value);

	/**
	 * Returns the value of the '<em><b>Canvases</b></em>' containment reference list.
	 * The list contents are of type {@link domain.CanvasFrame}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Canvases</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Canvases</em>' containment reference list.
	 * @see domain.DomainPackage#getViews_Canvases()
	 * @model containment="true"
	 * @generated
	 */
	EList<CanvasFrame> getCanvases();

	/**
	 * Returns the value of the '<em><b>View Inheritances</b></em>' containment reference list.
	 * The list contents are of type {@link domain.ViewInheritance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View Inheritances</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Inheritances</em>' containment reference list.
	 * @see domain.DomainPackage#getViews_ViewInheritances()
	 * @model containment="true"
	 * @generated
	 */
	EList<ViewInheritance> getViewInheritances();

	/**
	 * Returns the value of the '<em><b>Tab Pages Inheritances</b></em>' containment reference list.
	 * The list contents are of type {@link domain.TabPagesInheritance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tab Pages Inheritances</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tab Pages Inheritances</em>' containment reference list.
	 * @see domain.DomainPackage#getViews_TabPagesInheritances()
	 * @model containment="true"
	 * @generated
	 */
	EList<TabPagesInheritance> getTabPagesInheritances();

	/**
	 * Returns the value of the '<em><b>Any</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any</em>' containment reference.
	 * @see #setAny(EObject)
	 * @see domain.DomainPackage#getViews_Any()
	 * @model containment="true"
	 * @generated
	 */
	EObject getAny();

	/**
	 * Sets the value of the '{@link domain.Views#getAny <em>Any</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Any</em>' containment reference.
	 * @see #getAny()
	 * @generated
	 */
	void setAny(EObject value);

} // Views
