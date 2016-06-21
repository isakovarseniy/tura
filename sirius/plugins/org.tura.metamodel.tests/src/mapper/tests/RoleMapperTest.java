/**
 */
package mapper.tests;

import junit.textui.TestRunner;

import mapper.MapperFactory;
import mapper.RoleMapper;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Role Mapper</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RoleMapperTest extends MapperTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RoleMapperTest.class);
	}

	/**
	 * Constructs a new Role Mapper test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleMapperTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Role Mapper test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RoleMapper getFixture() {
		return (RoleMapper)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MapperFactory.eINSTANCE.createRoleMapper());
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

} //RoleMapperTest
