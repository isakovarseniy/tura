/**
 */
package tura.recipe.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import tura.recipe.ConfigExtension;
import tura.recipe.RecipeFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Config Extension</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConfigExtensionTest extends TestCase {

	/**
	 * The fixture for this Config Extension test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigExtension fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ConfigExtensionTest.class);
	}

	/**
	 * Constructs a new Config Extension test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigExtensionTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Config Extension test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ConfigExtension fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Config Extension test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigExtension getFixture() {
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
		setFixture(RecipeFactory.eINSTANCE.createConfigExtension());
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

} //ConfigExtensionTest
