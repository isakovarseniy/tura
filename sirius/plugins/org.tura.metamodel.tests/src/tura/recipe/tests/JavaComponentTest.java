/**
 */
package tura.recipe.tests;

import junit.textui.TestRunner;

import tura.recipe.JavaComponent;
import tura.recipe.RecipeFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Java Component</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class JavaComponentTest extends ComponentTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(JavaComponentTest.class);
	}

	/**
	 * Constructs a new Java Component test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaComponentTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Java Component test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected JavaComponent getFixture() {
		return (JavaComponent)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RecipeFactory.eINSTANCE.createJavaComponent());
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

} //JavaComponentTest
