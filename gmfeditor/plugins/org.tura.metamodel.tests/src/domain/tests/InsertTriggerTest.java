/**
 */
package domain.tests;

import domain.DomainFactory;
import domain.InsertTrigger;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Insert Trigger</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InsertTriggerTest extends TriggerTest
{

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static void main(String[] args)
  {
		TestRunner.run(InsertTriggerTest.class);
	}

  /**
	 * Constructs a new Insert Trigger test case with the given name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public InsertTriggerTest(String name)
  {
		super(name);
	}

  /**
	 * Returns the fixture for this Insert Trigger test case.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected InsertTrigger getFixture()
  {
		return (InsertTrigger)fixture;
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
		setFixture(DomainFactory.eINSTANCE.createInsertTrigger());
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

} //InsertTriggerTest
