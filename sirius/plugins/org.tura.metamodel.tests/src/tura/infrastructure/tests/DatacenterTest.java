/**
 */
package tura.infrastructure.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import tura.infrastructure.Datacenter;
import tura.infrastructure.InfrastructureFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Datacenter</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DatacenterTest extends TestCase {

	/**
	 * The fixture for this Datacenter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Datacenter fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DatacenterTest.class);
	}

	/**
	 * Constructs a new Datacenter test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatacenterTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Datacenter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Datacenter fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Datacenter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Datacenter getFixture() {
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
		setFixture(InfrastructureFactory.eINSTANCE.createDatacenter());
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

} //DatacenterTest
