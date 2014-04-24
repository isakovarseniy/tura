/**
 */
package domain.tests;

import domain.DomainFactory;
import domain.PREDeleteTrigger;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>PRE Delete Trigger</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PREDeleteTriggerTest extends TestCase
{

  /**
   * The fixture for this PRE Delete Trigger test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PREDeleteTrigger fixture = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(PREDeleteTriggerTest.class);
  }

  /**
   * Constructs a new PRE Delete Trigger test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PREDeleteTriggerTest(String name)
  {
    super(name);
  }

  /**
   * Sets the fixture for this PRE Delete Trigger test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void setFixture(PREDeleteTrigger fixture)
  {
    this.fixture = fixture;
  }

  /**
   * Returns the fixture for this PRE Delete Trigger test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PREDeleteTrigger getFixture()
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
    setFixture(DomainFactory.eINSTANCE.createPREDeleteTrigger());
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

} //PREDeleteTriggerTest
