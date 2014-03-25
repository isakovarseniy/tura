/**
 */
package domain.tests;

import domain.DomainFactory;
import domain.UpdateTrigger;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Update Trigger</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UpdateTriggerTest extends TriggerTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(UpdateTriggerTest.class);
  }

  /**
   * Constructs a new Update Trigger test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UpdateTriggerTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Update Trigger test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected UpdateTrigger getFixture()
  {
    return (UpdateTrigger)fixture;
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
    setFixture(DomainFactory.eINSTANCE.createUpdateTrigger());
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

} //UpdateTriggerTest
