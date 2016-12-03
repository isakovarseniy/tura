/**
 */
package repository.tests;

import junit.textui.TestRunner;

import repository.AttributeMapper;
import repository.RepositoryFactory;

import type.tests.AttributePointerTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Attribute Mapper</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AttributeMapperTest extends AttributePointerTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AttributeMapperTest.class);
	}

	/**
	 * Constructs a new Attribute Mapper test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeMapperTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Attribute Mapper test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AttributeMapper getFixture() {
		return (AttributeMapper)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RepositoryFactory.eINSTANCE.createAttributeMapper());
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

} //AttributeMapperTest
