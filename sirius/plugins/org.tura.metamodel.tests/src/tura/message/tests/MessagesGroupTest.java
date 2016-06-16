/**
 */
package tura.message.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import tura.message.MessageFactory;
import tura.message.MessagesGroup;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Messages Group</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MessagesGroupTest extends TestCase {

	/**
	 * The fixture for this Messages Group test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessagesGroup fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MessagesGroupTest.class);
	}

	/**
	 * Constructs a new Messages Group test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessagesGroupTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Messages Group test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(MessagesGroup fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Messages Group test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessagesGroup getFixture() {
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
		setFixture(MessageFactory.eINSTANCE.createMessagesGroup());
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

} //MessagesGroupTest
