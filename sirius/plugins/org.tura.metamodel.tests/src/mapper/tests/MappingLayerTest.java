/**
 */
package mapper.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import mapper.MapperFactory;
import mapper.MappingLayer;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Mapping Layer</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MappingLayerTest extends TestCase {

	/**
	 * The fixture for this Mapping Layer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappingLayer fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MappingLayerTest.class);
	}

	/**
	 * Constructs a new Mapping Layer test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingLayerTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Mapping Layer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(MappingLayer fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Mapping Layer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappingLayer getFixture() {
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
		setFixture(MapperFactory.eINSTANCE.createMappingLayer());
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

} //MappingLayerTest
