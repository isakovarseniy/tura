/**
 */
package tura.permission.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import tura.permission.PermissionFactory;
import tura.permission.SecurityEntityPointer;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Security Entity Pointer</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SecurityEntityPointerTest extends TestCase {

	/**
	 * The fixture for this Security Entity Pointer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityEntityPointer fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SecurityEntityPointerTest.class);
	}

	/**
	 * Constructs a new Security Entity Pointer test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityEntityPointerTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Security Entity Pointer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SecurityEntityPointer fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Security Entity Pointer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityEntityPointer getFixture() {
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
		setFixture(PermissionFactory.eINSTANCE.createSecurityEntityPointer());
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

} //SecurityEntityPointerTest
