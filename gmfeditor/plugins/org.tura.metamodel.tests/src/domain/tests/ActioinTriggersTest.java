/**
 */
package domain.tests;

import domain.ActioinTriggers;
import domain.DomainFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Actioin Triggers</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ActioinTriggersTest extends TestCase {

	/**
	 * The fixture for this Actioin Triggers test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActioinTriggers fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ActioinTriggersTest.class);
	}

	/**
	 * Constructs a new Actioin Triggers test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActioinTriggersTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Actioin Triggers test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ActioinTriggers fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Actioin Triggers test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActioinTriggers getFixture() {
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
		setFixture(DomainFactory.eINSTANCE.createActioinTriggers());
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

} //ActioinTriggersTest
