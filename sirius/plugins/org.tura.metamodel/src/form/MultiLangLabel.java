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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Lang Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link form.MultiLangLabel#getMultiLangLabel <em>Multi Lang Label</em>}</li>
 * </ul>
 *
 * @see form.FormPackage#getMultiLangLabel()
 * @model
 * @generated
 */
public interface MultiLangLabel extends EObject {
	/**
	 * Returns the value of the '<em><b>Multi Lang Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multi Lang Label</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Lang Label</em>' containment reference.
	 * @see #setMultiLangLabel(Context)
	 * @see form.FormPackage#getMultiLangLabel_MultiLangLabel()
	 * @model containment="true"
	 * @generated
	 */
	Context getMultiLangLabel();

	/**
	 * Sets the value of the '{@link form.MultiLangLabel#getMultiLangLabel <em>Multi Lang Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multi Lang Label</em>' containment reference.
	 * @see #getMultiLangLabel()
	 * @generated
	 */
	void setMultiLangLabel(Context value);

} // MultiLangLabel
