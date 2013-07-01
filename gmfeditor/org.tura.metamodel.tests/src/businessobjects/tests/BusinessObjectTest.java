/**
 */
package businessobjects.tests;

import businessobjects.BusinessObject;
import businessobjects.BusinessobjectsFactory;

import junit.textui.TestRunner;

import typedefinition.tests.TypePointerTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Business Object</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BusinessObjectTest extends TypePointerTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(BusinessObjectTest.class);
  }

  /**
   * Constructs a new Business Object test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BusinessObjectTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Business Object test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected BusinessObject getFixture()
  {
    return (BusinessObject)fixture;
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
    setFixture(BusinessobjectsFactory.eINSTANCE.createBusinessObject());
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

} //BusinessObjectTest
