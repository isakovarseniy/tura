/**
 */
package tura.form.tests;

import junit.textui.TestRunner;

import tura.form.FormFactory;
import tura.form.MenuSeparator;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Menu Separator</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MenuSeparatorTest extends MenuElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MenuSeparatorTest.class);
	}

	/**
	 * Constructs a new Menu Separator test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MenuSeparatorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Menu Separator test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MenuSeparator getFixture() {
		return (MenuSeparator)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FormFactory.eINSTANCE.createMenuSeparator());
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

} //MenuSeparatorTest
