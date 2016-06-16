/**
 */
package tura.form.tests;

import junit.textui.TestRunner;

import tura.form.FormFactory;
import tura.form.PREInsertTrigger;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>PRE Insert Trigger</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PREInsertTriggerTest extends TriggerTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PREInsertTriggerTest.class);
	}

	/**
	 * Constructs a new PRE Insert Trigger test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PREInsertTriggerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this PRE Insert Trigger test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PREInsertTrigger getFixture() {
		return (PREInsertTrigger)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FormFactory.eINSTANCE.createPREInsertTrigger());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //PREInsertTriggerTest
