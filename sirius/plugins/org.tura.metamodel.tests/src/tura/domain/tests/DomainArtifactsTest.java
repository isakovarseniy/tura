/**
 */
package tura.domain.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import tura.domain.DomainArtifacts;
import tura.domain.DomainFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Artifacts</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DomainArtifactsTest extends TestCase {

	/**
	 * The fixture for this Artifacts test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainArtifacts fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DomainArtifactsTest.class);
	}

	/**
	 * Constructs a new Artifacts test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainArtifactsTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Artifacts test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(DomainArtifacts fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Artifacts test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainArtifacts getFixture() {
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
		setFixture(DomainFactory.eINSTANCE.createDomainArtifacts());
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

} //DomainArtifactsTest
