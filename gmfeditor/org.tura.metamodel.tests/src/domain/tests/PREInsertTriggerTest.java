/**
 */
package domain.tests;

import domain.DomainFactory;
import domain.PREInsertTrigger;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>PRE Insert Trigger</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PREInsertTriggerTest extends TestCase
{

  /**
   * The fixture for this PRE Insert Trigger test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PREInsertTrigger fixture = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(PREInsertTriggerTest.class);
  }

  /**
   * Constructs a new PRE Insert Trigger test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PREInsertTriggerTest(String name)
  {
    super(name);
  }

  /**
   * Sets the fixture for this PRE Insert Trigger test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void setFixture(PREInsertTrigger fixture)
  {
    this.fixture = fixture;
  }

  /**
   * Returns the fixture for this PRE Insert Trigger test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PREInsertTrigger getFixture()
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
    setFixture(DomainFactory.eINSTANCE.createPREInsertTrigger());
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

} //PREInsertTriggerTest
