/**
 */
package domain.tests;

import domain.DomainFactory;
import domain.PREUpdateTrigger;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>PRE Update Trigger</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PREUpdateTriggerTest extends TriggerTest
{

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static void main(String[] args)
  {
		TestRunner.run(PREUpdateTriggerTest.class);
	}

  /**
	 * Constructs a new PRE Update Trigger test case with the given name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public PREUpdateTriggerTest(String name)
  {
		super(name);
	}

  /**
	 * Returns the fixture for this PRE Update Trigger test case.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected PREUpdateTrigger getFixture()
  {
		return (PREUpdateTrigger)fixture;
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
		setFixture(DomainFactory.eINSTANCE.createPREUpdateTrigger());
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

} //PREUpdateTriggerTest
