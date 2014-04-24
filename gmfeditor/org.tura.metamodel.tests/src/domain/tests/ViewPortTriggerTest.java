/**
 */
package domain.tests;

import domain.DomainFactory;
import domain.ViewPortTrigger;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>View Port Trigger</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ViewPortTriggerTest extends TestCase
{

  /**
   * The fixture for this View Port Trigger test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ViewPortTrigger fixture = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(ViewPortTriggerTest.class);
  }

  /**
   * Constructs a new View Port Trigger test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ViewPortTriggerTest(String name)
  {
    super(name);
  }

  /**
   * Sets the fixture for this View Port Trigger test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void setFixture(ViewPortTrigger fixture)
  {
    this.fixture = fixture;
  }

  /**
   * Returns the fixture for this View Port Trigger test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ViewPortTrigger getFixture()
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
    setFixture(DomainFactory.eINSTANCE.createViewPortTrigger());
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

} //ViewPortTriggerTest
