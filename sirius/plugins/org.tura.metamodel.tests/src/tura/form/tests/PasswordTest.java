/**
 */
package tura.form.tests;

import junit.textui.TestRunner;

import tura.form.FormFactory;
import tura.form.Password;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Password</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PasswordTest extends InputElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PasswordTest.class);
	}

	/**
	 * Constructs a new Password test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PasswordTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Password test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Password getFixture() {
		return (Password)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FormFactory.eINSTANCE.createPassword());
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

} //PasswordTest
