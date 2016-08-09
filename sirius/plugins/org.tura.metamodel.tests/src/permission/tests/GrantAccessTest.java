/**
 */
package permission.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import permission.GrantAccess;
import permission.PermissionFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Grant Access</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GrantAccessTest extends SecurityEntityPointerTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GrantAccessTest.class);
	}

	/**
	 * Constructs a new Grant Access test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GrantAccessTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Grant Access test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected GrantAccess getFixture() {
		return (GrantAccess)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PermissionFactory.eINSTANCE.createGrantAccess());
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

} //GrantAccessTest
