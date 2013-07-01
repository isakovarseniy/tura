/**
 */
package businessobjects.tests;

import businessobjects.BusinessMethod;
import businessobjects.BusinessobjectsFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Business Method</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BusinessMethodTest extends TestCase
{

  /**
   * The fixture for this Business Method test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BusinessMethod fixture = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(BusinessMethodTest.class);
  }

  /**
   * Constructs a new Business Method test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BusinessMethodTest(String name)
  {
    super(name);
  }

  /**
   * Sets the fixture for this Business Method test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void setFixture(BusinessMethod fixture)
  {
    this.fixture = fixture;
  }

  /**
   * Returns the fixture for this Business Method test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BusinessMethod getFixture()
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
    setFixture(BusinessobjectsFactory.eINSTANCE.createBusinessMethod());
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

} //BusinessMethodTest
