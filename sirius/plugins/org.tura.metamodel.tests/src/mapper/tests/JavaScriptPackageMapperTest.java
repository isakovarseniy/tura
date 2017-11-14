/**
 */
package mapper.tests;

import junit.textui.TestRunner;

import mapper.JavaScriptPackageMapper;
import mapper.MapperFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Java Script Package Mapper</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class JavaScriptPackageMapperTest extends PackageMapperTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(JavaScriptPackageMapperTest.class);
	}

	/**
	 * Constructs a new Java Script Package Mapper test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaScriptPackageMapperTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Java Script Package Mapper test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected JavaScriptPackageMapper getFixture() {
		return (JavaScriptPackageMapper)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MapperFactory.eINSTANCE.createJavaScriptPackageMapper());
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

} //JavaScriptPackageMapperTest
