/**
 */
package recipe.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import recipe.Recipe2Infrastructure;
import recipe.RecipeFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Recipe2 Infrastructure</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class Recipe2InfrastructureTest extends TestCase {

	/**
	 * The fixture for this Recipe2 Infrastructure test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Recipe2Infrastructure fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(Recipe2InfrastructureTest.class);
	}

	/**
	 * Constructs a new Recipe2 Infrastructure test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Recipe2InfrastructureTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Recipe2 Infrastructure test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Recipe2Infrastructure fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Recipe2 Infrastructure test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Recipe2Infrastructure getFixture() {
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
		setFixture(RecipeFactory.eINSTANCE.createRecipe2Infrastructure());
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

} //Recipe2InfrastructureTest
