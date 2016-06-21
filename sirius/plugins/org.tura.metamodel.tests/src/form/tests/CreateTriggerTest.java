/**
 */
package form.tests;

import form.CreateTrigger;
import form.FormFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Create Trigger</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CreateTriggerTest extends TriggerTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CreateTriggerTest.class);
	}

	/**
	 * Constructs a new Create Trigger test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateTriggerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Create Trigger test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CreateTrigger getFixture() {
		return (CreateTrigger)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FormFactory.eINSTANCE.createCreateTrigger());
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

} //CreateTriggerTest
