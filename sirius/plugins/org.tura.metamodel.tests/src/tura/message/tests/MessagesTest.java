/**
 */
package tura.message.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import tura.message.MessageFactory;
import tura.message.Messages;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Messages</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MessagesTest extends TestCase {

	/**
	 * The fixture for this Messages test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Messages fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MessagesTest.class);
	}

	/**
	 * Constructs a new Messages test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessagesTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Messages test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Messages fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Messages test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Messages getFixture() {
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
		setFixture(MessageFactory.eINSTANCE.createMessages());
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

} //MessagesTest
