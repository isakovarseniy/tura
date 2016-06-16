/**
 */
package tura.application.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import tura.application.ApplicationFactory;
import tura.application.ApplicationRealm;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Realm</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApplicationRealmTest extends TestCase {

	/**
	 * The fixture for this Realm test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationRealm fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ApplicationRealmTest.class);
	}

	/**
	 * Constructs a new Realm test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationRealmTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Realm test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ApplicationRealm fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Realm test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationRealm getFixture() {
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
		setFixture(ApplicationFactory.eINSTANCE.createApplicationRealm());
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

} //ApplicationRealmTest
