/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2020 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
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

import common.HTMLLayerHolder;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block UI</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link form.BlockUI#getSourceTarget <em>Source Target</em>}</li>
 * </ul>
 *
 * @see form.FormPackage#getBlockUI()
 * @model
 * @generated
 */
public interface BlockUI extends Uielement, ChildrenHolder, HTMLLayerHolder {
	/**
	 * Returns the value of the '<em><b>Source Target</b></em>' containment reference list.
	 * The list contents are of type {@link form.AreaRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Target</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Target</em>' containment reference list.
	 * @see form.FormPackage#getBlockUI_SourceTarget()
	 * @model containment="true"
	 * @generated
	 */
	EList<AreaRef> getSourceTarget();

} // BlockUI
