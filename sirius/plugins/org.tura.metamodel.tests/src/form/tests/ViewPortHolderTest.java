/**
 */
package form.tests;

import common.tests.HTMLLayerHolderTest;

import form.FormFactory;
import form.ViewPortHolder;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>View Port Holder</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ViewPortHolderTest extends HTMLLayerHolderTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ViewPortHolderTest.class);
	}

	/**
	 * Constructs a new View Port Holder test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewPortHolderTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this View Port Holder test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ViewPortHolder getFixture() {
		return (ViewPortHolder)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FormFactory.eINSTANCE.createViewPortHolder());
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

} //ViewPortHolderTest
