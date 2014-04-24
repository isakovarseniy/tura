/**
 */
package domain.tests;

import domain.DomainFactory;
import domain.POSTCreateTrigger;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>POST Create Trigger</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class POSTCreateTriggerTest extends TestCase
{

  /**
   * The fixture for this POST Create Trigger test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected POSTCreateTrigger fixture = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(POSTCreateTriggerTest.class);
  }

  /**
   * Constructs a new POST Create Trigger test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public POSTCreateTriggerTest(String name)
  {
    super(name);
  }

  /**
   * Sets the fixture for this POST Create Trigger test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void setFixture(POSTCreateTrigger fixture)
  {
    this.fixture = fixture;
  }

  /**
   * Returns the fixture for this POST Create Trigger test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected POSTCreateTrigger getFixture()
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
    setFixture(DomainFactory.eINSTANCE.createPOSTCreateTrigger());
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

} //POSTCreateTriggerTest
