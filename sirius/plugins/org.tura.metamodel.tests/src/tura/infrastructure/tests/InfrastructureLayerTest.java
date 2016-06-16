/**
 */
package tura.infrastructure.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import tura.infrastructure.InfrastructureFactory;
import tura.infrastructure.InfrastructureLayer;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Layer</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InfrastructureLayerTest extends TestCase {

	/**
	 * The fixture for this Layer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfrastructureLayer fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InfrastructureLayerTest.class);
	}

	/**
	 * Constructs a new Layer test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfrastructureLayerTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Layer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(InfrastructureLayer fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Layer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfrastructureLayer getFixture() {
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
		setFixture(InfrastructureFactory.eINSTANCE.createInfrastructureLayer());
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

} //InfrastructureLayerTest
