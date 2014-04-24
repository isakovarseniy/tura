/**
 */
package domain.tests;

import domain.DomainFactory;
import domain.PREQueryTrigger;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>PRE Query Trigger</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PREQueryTriggerTest extends TestCase
{

  /**
   * The fixture for this PRE Query Trigger test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PREQueryTrigger fixture = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(PREQueryTriggerTest.class);
  }

  /**
   * Constructs a new PRE Query Trigger test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PREQueryTriggerTest(String name)
  {
    super(name);
  }

  /**
   * Sets the fixture for this PRE Query Trigger test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void setFixture(PREQueryTrigger fixture)
  {
    this.fixture = fixture;
  }

  /**
   * Returns the fixture for this PRE Query Trigger test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PREQueryTrigger getFixture()
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
    setFixture(DomainFactory.eINSTANCE.createPREQueryTrigger());
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

} //PREQueryTriggerTest
