/**
 */
package tura.artifact.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import tura.artifact.ArtifactFactory;
import tura.artifact.ModelQuery;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Model Query</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelQueryTest extends TestCase {

	/**
	 * The fixture for this Model Query test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelQuery fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ModelQueryTest.class);
	}

	/**
	 * Constructs a new Model Query test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelQueryTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Model Query test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ModelQuery fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Model Query test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelQuery getFixture() {
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
		setFixture(ArtifactFactory.eINSTANCE.createModelQuery());
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

} //ModelQueryTest
