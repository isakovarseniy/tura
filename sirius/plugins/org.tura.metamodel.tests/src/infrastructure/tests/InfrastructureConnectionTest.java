/**
 */
package infrastructure.tests;

import infrastructure.InfrastructureConnection;
import infrastructure.InfrastructureFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InfrastructureConnectionTest extends TestCase {

	/**
	 * The fixture for this Connection test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfrastructureConnection fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InfrastructureConnectionTest.class);
	}

	/**
	 * Constructs a new Connection test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfrastructureConnectionTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Connection test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(InfrastructureConnection fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Connection test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfrastructureConnection getFixture() {
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
		setFixture(InfrastructureFactory.eINSTANCE.createInfrastructureConnection());
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

} //InfrastructureConnectionTest
