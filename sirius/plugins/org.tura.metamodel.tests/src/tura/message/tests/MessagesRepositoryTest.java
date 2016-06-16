/**
 */
package tura.message.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import tura.message.MessageFactory;
import tura.message.MessagesRepository;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Messages Repository</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MessagesRepositoryTest extends TestCase {

	/**
	 * The fixture for this Messages Repository test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessagesRepository fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MessagesRepositoryTest.class);
	}

	/**
	 * Constructs a new Messages Repository test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessagesRepositoryTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Messages Repository test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(MessagesRepository fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Messages Repository test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessagesRepository getFixture() {
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
		setFixture(MessageFactory.eINSTANCE.createMessagesRepository());
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

} //MessagesRepositoryTest
