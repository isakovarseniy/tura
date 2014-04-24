/**
 */
package domain.tests;

import domain.DomainFactory;
import domain.POSTQueryTrigger;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>POST Query Trigger</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class POSTQueryTriggerTest extends TestCase
{

  /**
   * The fixture for this POST Query Trigger test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected POSTQueryTrigger fixture = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(POSTQueryTriggerTest.class);
  }

  /**
   * Constructs a new POST Query Trigger test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public POSTQueryTriggerTest(String name)
  {
    super(name);
  }

  /**
   * Sets the fixture for this POST Query Trigger test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void setFixture(POSTQueryTrigger fixture)
  {
    this.fixture = fixture;
  }

  /**
   * Returns the fixture for this POST Query Trigger test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected POSTQueryTrigger getFixture()
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
    setFixture(DomainFactory.eINSTANCE.createPOSTQueryTrigger());
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

} //POSTQueryTriggerTest
