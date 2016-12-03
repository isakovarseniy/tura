/**
 */
package repository.tests;

import junit.textui.TestRunner;

import repository.ObjectMapper;
import repository.RepositoryFactory;

import type.tests.TypePointerTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Object Mapper</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ObjectMapperTest extends TypePointerTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ObjectMapperTest.class);
	}

	/**
	 * Constructs a new Object Mapper test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectMapperTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Object Mapper test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ObjectMapper getFixture() {
		return (ObjectMapper)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RepositoryFactory.eINSTANCE.createObjectMapper());
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

} //ObjectMapperTest
