/**
 */
package typedefinition.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import typedefinition.ReturnValue;
import typedefinition.TypedefinitionFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Return Value</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReturnValueTest extends TypePointerTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(ReturnValueTest.class);
  }

  /**
   * Constructs a new Return Value test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReturnValueTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Return Value test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected ReturnValue getFixture()
  {
    return (ReturnValue)fixture;
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
    setFixture(TypedefinitionFactory.eINSTANCE.createReturnValue());
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

} //ReturnValueTest
