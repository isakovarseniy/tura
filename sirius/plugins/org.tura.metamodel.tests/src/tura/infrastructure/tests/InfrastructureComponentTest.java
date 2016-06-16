/**
 */
package tura.infrastructure.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import tura.infrastructure.InfrastructureComponent;
import tura.infrastructure.InfrastructureFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InfrastructureComponentTest extends TestCase {

	/**
	 * The fixture for this Component test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfrastructureComponent fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InfrastructureComponentTest.class);
	}

	/**
	 * Constructs a new Component test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfrastructureComponentTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Component test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(InfrastructureComponent fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Component test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfrastructureComponent getFixture() {
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
		setFixture(InfrastructureFactory.eINSTANCE.createInfrastructureComponent());
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

} //InfrastructureComponentTest
