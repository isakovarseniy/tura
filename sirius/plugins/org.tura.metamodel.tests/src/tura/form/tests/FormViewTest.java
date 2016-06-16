/**
 */
package tura.form.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import tura.form.FormFactory;
import tura.form.FormView;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>View</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FormViewTest extends TestCase {

	/**
	 * The fixture for this View test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormView fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FormViewTest.class);
	}

	/**
	 * Constructs a new View test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormViewTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this View test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(FormView fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this View test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormView getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FormFactory.eINSTANCE.createFormView());
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

} //FormViewTest
