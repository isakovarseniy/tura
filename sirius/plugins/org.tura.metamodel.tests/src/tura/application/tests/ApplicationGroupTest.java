/**
 */
package tura.application.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import tura.application.ApplicationFactory;
import tura.application.ApplicationGroup;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApplicationGroupTest extends TestCase {

	/**
	 * The fixture for this Group test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationGroup fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ApplicationGroupTest.class);
	}

	/**
	 * Constructs a new Group test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationGroupTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Group test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ApplicationGroup fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Group test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationGroup getFixture() {
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
		setFixture(ApplicationFactory.eINSTANCE.createApplicationGroup());
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

} //ApplicationGroupTest
