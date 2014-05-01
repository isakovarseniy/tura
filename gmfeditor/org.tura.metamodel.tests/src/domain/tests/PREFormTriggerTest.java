/**
 */
package domain.tests;

import domain.DomainFactory;
import domain.PREFormTrigger;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>PRE Form Trigger</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PREFormTriggerTest extends TriggerTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(PREFormTriggerTest.class);
  }

  /**
   * Constructs a new PRE Form Trigger test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PREFormTriggerTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this PRE Form Trigger test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected PREFormTrigger getFixture()
  {
    return (PREFormTrigger)fixture;
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
    setFixture(DomainFactory.eINSTANCE.createPREFormTrigger());
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

} //PREFormTriggerTest
