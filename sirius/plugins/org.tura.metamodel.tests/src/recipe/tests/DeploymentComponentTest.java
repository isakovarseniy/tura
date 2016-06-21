/**
 */
package recipe.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import recipe.DeploymentComponent;
import recipe.RecipeFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Deployment Component</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DeploymentComponentTest extends TestCase {

	/**
	 * The fixture for this Deployment Component test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeploymentComponent fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DeploymentComponentTest.class);
	}

	/**
	 * Constructs a new Deployment Component test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentComponentTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Deployment Component test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(DeploymentComponent fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Deployment Component test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeploymentComponent getFixture() {
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
		setFixture(RecipeFactory.eINSTANCE.createDeploymentComponent());
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

} //DeploymentComponentTest
