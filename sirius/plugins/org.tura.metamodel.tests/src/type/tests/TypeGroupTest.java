/**
 */
package type.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import type.TypeFactory;
import type.TypeGroup;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TypeGroupTest extends TestCase {

	/**
	 * The fixture for this Group test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeGroup fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TypeGroupTest.class);
	}

	/**
	 * Constructs a new Group test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeGroupTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Group test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(TypeGroup fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Group test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeGroup getFixture() {
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
		setFixture(TypeFactory.eINSTANCE.createTypeGroup());
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

} //TypeGroupTest
