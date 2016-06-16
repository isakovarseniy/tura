/**
 */
package tura.mapper.tests;

import junit.textui.TestRunner;

import tura.mapper.MapperFactory;
import tura.mapper.PackageMapper;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Package Mapper</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PackageMapperTest extends MapperTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PackageMapperTest.class);
	}

	/**
	 * Constructs a new Package Mapper test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageMapperTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Package Mapper test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PackageMapper getFixture() {
		return (PackageMapper)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MapperFactory.eINSTANCE.createPackageMapper());
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

} //PackageMapperTest
