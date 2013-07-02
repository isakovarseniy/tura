/**
 */
package businessobjects.tests;

import businessobjects.BusinessobjectsFactory;
import businessobjects.InsertMethod;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Insert Method</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InsertMethodTest extends BusinessMethodTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(InsertMethodTest.class);
  }

  /**
   * Constructs a new Insert Method test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InsertMethodTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Insert Method test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected InsertMethod getFixture()
  {
    return (InsertMethod)fixture;
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
    setFixture(BusinessobjectsFactory.eINSTANCE.createInsertMethod());
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

} //InsertMethodTest
