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

import common.Orderable;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View Area</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link form.ViewArea#getUid <em>Uid</em>}</li>
 *   <li>{@link form.ViewArea#getName <em>Name</em>}</li>
 *   <li>{@link form.ViewArea#getBaseCanvas <em>Base Canvas</em>}</li>
 *   <li>{@link form.ViewArea#getLinkToLabels <em>Link To Labels</em>}</li>
 *   <li>{@link form.ViewArea#getLinkToMessages <em>Link To Messages</em>}</li>
 * </ul>
 *
 * @see form.FormPackage#getViewArea()
 * @model
 * @generated
 */
public interface ViewArea extends ViewElement, Orderable, FlexFields {
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
	 * @see form.FormPackage#getViewArea_Uid()
	 * @model id="true"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link form.ViewArea#getUid <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' attribute.
	 * @see #getUid()
	 * @generated
	 */
	void setUid(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see form.FormPackage#getViewArea_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link form.ViewArea#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Base Canvas</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Canvas</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Canvas</em>' containment reference.
	 * @see #setBaseCanvas(LayerHolder)
	 * @see form.FormPackage#getViewArea_BaseCanvas()
	 * @model containment="true"
	 * @generated
	 */
	LayerHolder getBaseCanvas();

	/**
	 * Sets the value of the '{@link form.ViewArea#getBaseCanvas <em>Base Canvas</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Canvas</em>' containment reference.
	 * @see #getBaseCanvas()
	 * @generated
	 */
	void setBaseCanvas(LayerHolder value);

	/**
	 * Returns the value of the '<em><b>Link To Labels</b></em>' containment reference list.
	 * The list contents are of type {@link form.LinkToLabel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link To Labels</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link To Labels</em>' containment reference list.
	 * @see form.FormPackage#getViewArea_LinkToLabels()
	 * @model containment="true"
	 * @generated
	 */
	EList<LinkToLabel> getLinkToLabels();

	/**
	 * Returns the value of the '<em><b>Link To Messages</b></em>' containment reference list.
	 * The list contents are of type {@link form.LinkToMessage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link To Messages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link To Messages</em>' containment reference list.
	 * @see form.FormPackage#getViewArea_LinkToMessages()
	 * @model containment="true"
	 * @generated
	 */
	EList<LinkToMessage> getLinkToMessages();

} // ViewArea
