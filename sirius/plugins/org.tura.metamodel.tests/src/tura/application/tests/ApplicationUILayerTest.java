/**
 */
package tura.application.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import tura.application.ApplicationFactory;
import tura.application.ApplicationUILayer;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>UI Layer</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApplicationUILayerTest extends TestCase {

	/**
	 * The fixture for this UI Layer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationUILayer fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ApplicationUILayerTest.class);
	}

	/**
	 * Constructs a new UI Layer test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationUILayerTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this UI Layer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ApplicationUILayer fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this UI Layer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationUILayer getFixture() {
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
		setFixture(ApplicationFactory.eINSTANCE.createApplicationUILayer());
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

} //ApplicationUILayerTest
