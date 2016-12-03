/**
 */
package repository.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import repository.RepositoryFactory;
import repository.Units;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Units</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UnitsTest extends TestCase {

	/**
	 * The fixture for this Units test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Units fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UnitsTest.class);
	}

	/**
	 * Constructs a new Units test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitsTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Units test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Units fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Units test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Units getFixture() {
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
		setFixture(RepositoryFactory.eINSTANCE.createUnits());
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

} //UnitsTest
