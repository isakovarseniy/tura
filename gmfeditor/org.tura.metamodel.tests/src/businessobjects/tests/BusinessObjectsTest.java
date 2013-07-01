/**
 */
package businessobjects.tests;

import businessobjects.BusinessObjects;
import businessobjects.BusinessobjectsFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Business Objects</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BusinessObjectsTest extends TestCase
{

  /**
   * The fixture for this Business Objects test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BusinessObjects fixture = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(BusinessObjectsTest.class);
  }

  /**
   * Constructs a new Business Objects test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BusinessObjectsTest(String name)
  {
    super(name);
  }

  /**
   * Sets the fixture for this Business Objects test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void setFixture(BusinessObjects fixture)
  {
    this.fixture = fixture;
  }

  /**
   * Returns the fixture for this Business Objects test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BusinessObjects getFixture()
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
    setFixture(BusinessobjectsFactory.eINSTANCE.createBusinessObjects());
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

} //BusinessObjectsTest
