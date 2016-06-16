/**
 */
package tura.application.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import tura.application.ApplicationFactory;
import tura.application.ApplicationMapper;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Mapper</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApplicationMapperTest extends TestCase {

	/**
	 * The fixture for this Mapper test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationMapper fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ApplicationMapperTest.class);
	}

	/**
	 * Constructs a new Mapper test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationMapperTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Mapper test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ApplicationMapper fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Mapper test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationMapper getFixture() {
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
		setFixture(ApplicationFactory.eINSTANCE.createApplicationMapper());
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

} //ApplicationMapperTest
