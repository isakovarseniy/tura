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
package domain.tests;

import domain.ConfigVariable;
import domain.DomainFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Config Variable</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConfigVariableTest extends TestCase
{

  /**
	 * The fixture for this Config Variable test case.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ConfigVariable fixture = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static void main(String[] args)
  {
		TestRunner.run(ConfigVariableTest.class);
	}

  /**
	 * Constructs a new Config Variable test case with the given name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ConfigVariableTest(String name)
  {
		super(name);
	}

  /**
	 * Sets the fixture for this Config Variable test case.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void setFixture(ConfigVariable fixture)
  {
		this.fixture = fixture;
	}

  /**
	 * Returns the fixture for this Config Variable test case.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ConfigVariable getFixture()
  {
		return fixture;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
  @Override
  protected void setUp() throws Exception
  {
		setFixture(DomainFactory.eINSTANCE.createConfigVariable());
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
  @Override
  protected void tearDown() throws Exception
  {
		setFixture(null);
	}

} //ConfigVariableTest