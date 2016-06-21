/**
 */
package type.tests;

import junit.textui.TestRunner;

import type.MethodPointer;
import type.TypeFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Method Pointer</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MethodPointerTest extends TypePointerTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MethodPointerTest.class);
	}

	/**
	 * Constructs a new Method Pointer test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodPointerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Method Pointer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MethodPointer getFixture() {
		return (MethodPointer)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TypeFactory.eINSTANCE.createMethodPointer());
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

} //MethodPointerTest
