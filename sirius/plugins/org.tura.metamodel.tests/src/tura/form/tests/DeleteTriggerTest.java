/**
 */
package tura.form.tests;

import junit.textui.TestRunner;

import tura.form.DeleteTrigger;
import tura.form.FormFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Delete Trigger</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DeleteTriggerTest extends TriggerTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DeleteTriggerTest.class);
	}

	/**
	 * Constructs a new Delete Trigger test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeleteTriggerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Delete Trigger test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DeleteTrigger getFixture() {
		return (DeleteTrigger)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FormFactory.eINSTANCE.createDeleteTrigger());
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

} //DeleteTriggerTest
