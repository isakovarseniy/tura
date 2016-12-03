/**
 */
package repository.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import repository.RepositoryFactory;
import repository.UnitMapper;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Unit Mapper</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UnitMapperTest extends TestCase {

	/**
	 * The fixture for this Unit Mapper test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnitMapper fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UnitMapperTest.class);
	}

	/**
	 * Constructs a new Unit Mapper test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitMapperTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Unit Mapper test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(UnitMapper fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Unit Mapper test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnitMapper getFixture() {
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
		setFixture(RepositoryFactory.eINSTANCE.createUnitMapper());
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

} //UnitMapperTest
