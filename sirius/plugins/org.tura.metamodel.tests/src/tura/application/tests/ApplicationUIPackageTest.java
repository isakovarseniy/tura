/**
 */
package tura.application.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import tura.application.ApplicationFactory;
import tura.application.ApplicationUIPackage;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>UI Package</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApplicationUIPackageTest extends TestCase {

	/**
	 * The fixture for this UI Package test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationUIPackage fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ApplicationUIPackageTest.class);
	}

	/**
	 * Constructs a new UI Package test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationUIPackageTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this UI Package test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ApplicationUIPackage fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this UI Package test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationUIPackage getFixture() {
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
		setFixture(ApplicationFactory.eINSTANCE.createApplicationUIPackage());
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

} //ApplicationUIPackageTest
