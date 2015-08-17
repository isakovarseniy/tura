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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Pointer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link domain.MethodPointer#getMethodRef <em>Method Ref</em>}</li>
 *   <li>{@link domain.MethodPointer#getFakeMethod <em>Fake Method</em>}</li>
 * </ul>
 *
 * @see domain.DomainPackage#getMethodPointer()
 * @model
 * @generated
 */
public interface MethodPointer extends TypePointer {
	/**
	 * Returns the value of the '<em><b>Method Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Ref</em>' reference.
	 * @see #setMethodRef(Operation)
	 * @see domain.DomainPackage#getMethodPointer_MethodRef()
	 * @model
	 * @generated
	 */
	Operation getMethodRef();

	/**
	 * Sets the value of the '{@link domain.MethodPointer#getMethodRef <em>Method Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method Ref</em>' reference.
	 * @see #getMethodRef()
	 * @generated
	 */
	void setMethodRef(Operation value);

	/**
	 * Returns the value of the '<em><b>Fake Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fake Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fake Method</em>' attribute.
	 * @see #setFakeMethod(String)
	 * @see domain.DomainPackage#getMethodPointer_FakeMethod()
	 * @model
	 * @generated
	 */
	String getFakeMethod();

	/**
	 * Sets the value of the '{@link domain.MethodPointer#getFakeMethod <em>Fake Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fake Method</em>' attribute.
	 * @see #getFakeMethod()
	 * @generated
	 */
	void setFakeMethod(String value);

} // MethodPointer
