/**
 */
package tura.form.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import tura.form.CanvasView;
import tura.form.FormFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Canvas View</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CanvasViewTest extends TestCase {

	/**
	 * The fixture for this Canvas View test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CanvasView fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CanvasViewTest.class);
	}

	/**
	 * Constructs a new Canvas View test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CanvasViewTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Canvas View test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(CanvasView fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Canvas View test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CanvasView getFixture() {
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
		setFixture(FormFactory.eINSTANCE.createCanvasView());
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

} //CanvasViewTest
