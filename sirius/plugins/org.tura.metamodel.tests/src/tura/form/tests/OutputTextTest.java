/**
 */
package tura.form.tests;

import junit.textui.TestRunner;

import tura.form.FormFactory;
import tura.form.OutputText;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Output Text</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OutputTextTest extends InputElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OutputTextTest.class);
	}

	/**
	 * Constructs a new Output Text test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputTextTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Output Text test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected OutputText getFixture() {
		return (OutputText)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FormFactory.eINSTANCE.createOutputText());
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

} //OutputTextTest
