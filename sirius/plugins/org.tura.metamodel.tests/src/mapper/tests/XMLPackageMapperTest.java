/**
 */
package mapper.tests;

import junit.textui.TestRunner;

import mapper.MapperFactory;
import mapper.XMLPackageMapper;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>XML Package Mapper</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class XMLPackageMapperTest extends PackageMapperTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(XMLPackageMapperTest.class);
	}

	/**
	 * Constructs a new XML Package Mapper test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLPackageMapperTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this XML Package Mapper test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected XMLPackageMapper getFixture() {
		return (XMLPackageMapper)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MapperFactory.eINSTANCE.createXMLPackageMapper());
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

} //XMLPackageMapperTest
