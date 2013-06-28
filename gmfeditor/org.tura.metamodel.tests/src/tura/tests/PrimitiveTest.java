/**
 */
package tura.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import tura.Primitive;
import tura.TuraFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Primitive</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PrimitiveTest extends TestCase
{

  /**
   * The fixture for this Primitive test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Primitive fixture = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(PrimitiveTest.class);
  }

  /**
   * Constructs a new Primitive test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimitiveTest(String name)
  {
    super(name);
  }

  /**
   * Sets the fixture for this Primitive test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void setFixture(Primitive fixture)
  {
    this.fixture = fixture;
  }

  /**
   * Returns the fixture for this Primitive test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Primitive getFixture()
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
    setFixture(TuraFactory.eINSTANCE.createPrimitive());
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

} //PrimitiveTest
