/**
 */
package tura.permission.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import tura.permission.PermissionFactory;
import tura.permission.Secured;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Secured</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SecuredTest extends TestCase {

	/**
	 * The fixture for this Secured test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Secured fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SecuredTest.class);
	}

	/**
	 * Constructs a new Secured test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecuredTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Secured test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Secured fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Secured test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Secured getFixture() {
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
		setFixture(PermissionFactory.eINSTANCE.createSecured());
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

} //SecuredTest
