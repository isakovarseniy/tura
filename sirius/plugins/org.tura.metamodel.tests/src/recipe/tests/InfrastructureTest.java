/**
 */
package recipe.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import recipe.Infrastructure;
import recipe.RecipeFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Infrastructure</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InfrastructureTest extends TestCase {

	/**
	 * The fixture for this Infrastructure test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Infrastructure fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InfrastructureTest.class);
	}

	/**
	 * Constructs a new Infrastructure test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfrastructureTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Infrastructure test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Infrastructure fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Infrastructure test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Infrastructure getFixture() {
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
		setFixture(RecipeFactory.eINSTANCE.createInfrastructure());
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

} //InfrastructureTest
