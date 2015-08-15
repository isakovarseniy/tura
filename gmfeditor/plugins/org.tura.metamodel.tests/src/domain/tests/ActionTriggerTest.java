/**
 */
package domain.tests;

import domain.ActionTrigger;
import domain.DomainFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Action Trigger</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ActionTriggerTest extends TriggerTest
{

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static void main(String[] args)
  {
		TestRunner.run(ActionTriggerTest.class);
	}

  /**
	 * Constructs a new Action Trigger test case with the given name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ActionTriggerTest(String name)
  {
		super(name);
	}

  /**
	 * Returns the fixture for this Action Trigger test case.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected ActionTrigger getFixture()
  {
		return (ActionTrigger)fixture;
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
		setFixture(DomainFactory.eINSTANCE.createActionTrigger());
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

} //ActionTriggerTest
