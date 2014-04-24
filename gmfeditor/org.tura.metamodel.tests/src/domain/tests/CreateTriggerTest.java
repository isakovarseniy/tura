/**
 */
package domain.tests;

import domain.CreateTrigger;
import domain.DomainFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Create Trigger</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CreateTriggerTest extends TestCase
{

  /**
   * The fixture for this Create Trigger test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CreateTrigger fixture = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(CreateTriggerTest.class);
  }

  /**
   * Constructs a new Create Trigger test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CreateTriggerTest(String name)
  {
    super(name);
  }

  /**
   * Sets the fixture for this Create Trigger test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void setFixture(CreateTrigger fixture)
  {
    this.fixture = fixture;
  }

  /**
   * Returns the fixture for this Create Trigger test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CreateTrigger getFixture()
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
    setFixture(DomainFactory.eINSTANCE.createCreateTrigger());
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

} //CreateTriggerTest
