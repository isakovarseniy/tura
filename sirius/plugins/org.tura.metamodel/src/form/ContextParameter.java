/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link form.ContextParameter#getUid <em>Uid</em>}</li>
 *   <li>{@link form.ContextParameter#getRefObj <em>Ref Obj</em>}</li>
 *   <li>{@link form.ContextParameter#getOperation <em>Operation</em>}</li>
 *   <li>{@link form.ContextParameter#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see form.FormPackage#getContextParameter()
 * @model
 * @generated
 */
public interface ContextParameter extends EObject {
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
	 * @see form.FormPackage#getContextParameter_Uid()
	 * @model id="true"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link form.ContextParameter#getUid <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' attribute.
	 * @see #getUid()
	 * @generated
	 */
	void setUid(String value);

	/**
	 * Returns the value of the '<em><b>Ref Obj</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Obj</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Obj</em>' reference.
	 * @see #setRefObj(EObject)
	 * @see form.FormPackage#getContextParameter_RefObj()
	 * @model
	 * @generated
	 */
	EObject getRefObj();

	/**
	 * Sets the value of the '{@link form.ContextParameter#getRefObj <em>Ref Obj</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Obj</em>' reference.
	 * @see #getRefObj()
	 * @generated
	 */
	void setRefObj(EObject value);

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' attribute.
	 * The literals are from the enumeration {@link form.Comparator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' attribute.
	 * @see form.Comparator
	 * @see #setOperation(Comparator)
	 * @see form.FormPackage#getContextParameter_Operation()
	 * @model
	 * @generated
	 */
	Comparator getOperation();

	/**
	 * Sets the value of the '{@link form.ContextParameter#getOperation <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' attribute.
	 * @see form.Comparator
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(Comparator value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(ContextValue)
	 * @see form.FormPackage#getContextParameter_Value()
	 * @model containment="true"
	 * @generated
	 */
	ContextValue getValue();

	/**
	 * Sets the value of the '{@link form.ContextParameter#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(ContextValue value);

} // ContextParameter
