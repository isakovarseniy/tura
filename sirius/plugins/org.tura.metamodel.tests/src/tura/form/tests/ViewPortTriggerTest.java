/**
 */
package tura.form.tests;

import junit.textui.TestRunner;

import tura.form.FormFactory;
import tura.form.ViewPortTrigger;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>View Port Trigger</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ViewPortTriggerTest extends TriggerTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ViewPortTriggerTest.class);
	}

	/**
	 * Constructs a new View Port Trigger test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewPortTriggerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this View Port Trigger test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ViewPortTrigger getFixture() {
		return (ViewPortTrigger)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FormFactory.eINSTANCE.createViewPortTrigger());
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

} //ViewPortTriggerTest
