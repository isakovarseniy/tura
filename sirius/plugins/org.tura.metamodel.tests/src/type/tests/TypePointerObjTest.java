/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
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
package type.tests;

import junit.textui.TestRunner;

import type.TypeFactory;
import type.TypePointerObj;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Pointer Obj</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TypePointerObjTest extends TypePointerTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TypePointerObjTest.class);
	}

	/**
	 * Constructs a new Pointer Obj test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypePointerObjTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Pointer Obj test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TypePointerObj getFixture() {
		return (TypePointerObj)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TypeFactory.eINSTANCE.createTypePointerObj());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //TypePointerObjTest