/**
 */
package domain.tests;

import domain.DomainFactory;
import domain.TriggerParameter;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Trigger Parameter</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TriggerParameterTest extends TestCase
{

  /**
   * The fixture for this Trigger Parameter test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TriggerParameter fixture = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(TriggerParameterTest.class);
  }

  /**
   * Constructs a new Trigger Parameter test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TriggerParameterTest(String name)
  {
    super(name);
  }

  /**
   * Sets the fixture for this Trigger Parameter test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void setFixture(TriggerParameter fixture)
  {
    this.fixture = fixture;
  }

  /**
   * Returns the fixture for this Trigger Parameter test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TriggerParameter getFixture()
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
    setFixture(DomainFactory.eINSTANCE.createTriggerParameter());
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

} //TriggerParameterTest
