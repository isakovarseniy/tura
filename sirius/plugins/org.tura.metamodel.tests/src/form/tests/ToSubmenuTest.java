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
package form.tests;

import form.FormFactory;
import form.ToSubmenu;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>To Submenu</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ToSubmenuTest extends TestCase {

	/**
	 * The fixture for this To Submenu test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToSubmenu fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ToSubmenuTest.class);
	}

	/**
	 * Constructs a new To Submenu test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToSubmenuTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this To Submenu test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ToSubmenu fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this To Submenu test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToSubmenu getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FormFactory.eINSTANCE.createToSubmenu());
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

} //ToSubmenuTest
