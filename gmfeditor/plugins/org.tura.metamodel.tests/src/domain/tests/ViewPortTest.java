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

import domain.DomainFactory;
import domain.ViewPort;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>View Port</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ViewPortTest extends ViewElementTest
{

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static void main(String[] args)
  {
		TestRunner.run(ViewPortTest.class);
	}

  /**
	 * Constructs a new View Port test case with the given name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ViewPortTest(String name)
  {
		super(name);
	}

  /**
	 * Returns the fixture for this View Port test case.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected ViewPort getFixture()
  {
		return (ViewPort)fixture;
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
		setFixture(DomainFactory.eINSTANCE.createViewPort());
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

} //ViewPortTest
