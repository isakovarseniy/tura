/**
 */
package tura.mapper.tests;

import junit.textui.TestRunner;

import tura.mapper.MapperFactory;
import tura.mapper.TypeMapper;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Type Mapper</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TypeMapperTest extends MapperTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TypeMapperTest.class);
	}

	/**
	 * Constructs a new Type Mapper test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeMapperTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Type Mapper test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TypeMapper getFixture() {
		return (TypeMapper)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MapperFactory.eINSTANCE.createTypeMapper());
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

} //TypeMapperTest
