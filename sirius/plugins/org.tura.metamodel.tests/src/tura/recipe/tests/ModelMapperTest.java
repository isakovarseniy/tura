/**
 */
package tura.recipe.tests;

import junit.textui.TestRunner;

import tura.recipe.ModelMapper;
import tura.recipe.RecipeFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Model Mapper</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelMapperTest extends ArtifactRefTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ModelMapperTest.class);
	}

	/**
	 * Constructs a new Model Mapper test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelMapperTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Model Mapper test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ModelMapper getFixture() {
		return (ModelMapper)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RecipeFactory.eINSTANCE.createModelMapper());
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

} //ModelMapperTest
