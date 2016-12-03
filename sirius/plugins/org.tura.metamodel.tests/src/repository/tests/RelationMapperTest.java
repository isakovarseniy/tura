/**
 */
package repository.tests;

import junit.textui.TestRunner;

import repository.RelationMapper;
import repository.RepositoryFactory;

import type.tests.TypePointerTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Relation Mapper</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RelationMapperTest extends TypePointerTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RelationMapperTest.class);
	}

	/**
	 * Constructs a new Relation Mapper test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationMapperTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Relation Mapper test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RelationMapper getFixture() {
		return (RelationMapper)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RepositoryFactory.eINSTANCE.createRelationMapper());
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

} //RelationMapperTest
