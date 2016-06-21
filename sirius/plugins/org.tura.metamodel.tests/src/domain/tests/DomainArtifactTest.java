/**
 */
package domain.tests;

import domain.DomainArtifact;
import domain.DomainFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Artifact</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DomainArtifactTest extends TestCase {

	/**
	 * The fixture for this Artifact test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainArtifact fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DomainArtifactTest.class);
	}

	/**
	 * Constructs a new Artifact test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainArtifactTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Artifact test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(DomainArtifact fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Artifact test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainArtifact getFixture() {
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
		setFixture(DomainFactory.eINSTANCE.createDomainArtifact());
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

} //DomainArtifactTest
