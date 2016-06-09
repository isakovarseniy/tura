/**
 */
package tura.permission.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import tura.permission.PermissionFactory;
import tura.permission.Roles;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Roles</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RolesTest extends TestCase {

	/**
	 * The fixture for this Roles test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Roles fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RolesTest.class);
	}

	/**
	 * Constructs a new Roles test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RolesTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Roles test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Roles fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Roles test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Roles getFixture() {
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
		setFixture(PermissionFactory.eINSTANCE.createRoles());
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

} //RolesTest
