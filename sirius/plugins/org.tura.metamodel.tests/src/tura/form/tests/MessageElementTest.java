/**
 */
package tura.form.tests;

import junit.textui.TestRunner;

import tura.form.FormFactory;
import tura.form.MessageElement;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Message Element</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MessageElementTest extends UielementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MessageElementTest.class);
	}

	/**
	 * Constructs a new Message Element test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageElementTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Message Element test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MessageElement getFixture() {
		return (MessageElement)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FormFactory.eINSTANCE.createMessageElement());
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

} //MessageElementTest
