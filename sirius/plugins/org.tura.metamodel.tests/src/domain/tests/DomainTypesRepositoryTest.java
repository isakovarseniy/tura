/**
 */
package domain.tests;

import domain.DomainFactory;
import domain.DomainTypesRepository;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Types Repository</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DomainTypesRepositoryTest extends TestCase {

	/**
	 * The fixture for this Types Repository test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainTypesRepository fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DomainTypesRepositoryTest.class);
	}

	/**
	 * Constructs a new Types Repository test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainTypesRepositoryTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Types Repository test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(DomainTypesRepository fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Types Repository test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainTypesRepository getFixture() {
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
		setFixture(DomainFactory.eINSTANCE.createDomainTypesRepository());
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

} //DomainTypesRepositoryTest
