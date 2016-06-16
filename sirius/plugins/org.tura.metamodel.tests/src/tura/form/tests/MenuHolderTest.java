/**
 */
package tura.form.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import tura.form.FormFactory;
import tura.form.MenuHolder;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Menu Holder</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MenuHolderTest extends TestCase {

	/**
	 * The fixture for this Menu Holder test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MenuHolder fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MenuHolderTest.class);
	}

	/**
	 * Constructs a new Menu Holder test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MenuHolderTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Menu Holder test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(MenuHolder fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Menu Holder test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MenuHolder getFixture() {
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
		setFixture(FormFactory.eINSTANCE.createMenuHolder());
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

} //MenuHolderTest
