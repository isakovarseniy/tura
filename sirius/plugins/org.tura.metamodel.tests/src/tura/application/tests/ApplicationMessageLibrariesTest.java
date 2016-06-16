/**
 */
package tura.application.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import tura.application.ApplicationFactory;
import tura.application.ApplicationMessageLibraries;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Message Libraries</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApplicationMessageLibrariesTest extends TestCase {

	/**
	 * The fixture for this Message Libraries test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationMessageLibraries fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ApplicationMessageLibrariesTest.class);
	}

	/**
	 * Constructs a new Message Libraries test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationMessageLibrariesTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Message Libraries test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ApplicationMessageLibraries fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Message Libraries test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationMessageLibraries getFixture() {
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
		setFixture(ApplicationFactory.eINSTANCE.createApplicationMessageLibraries());
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

} //ApplicationMessageLibrariesTest
