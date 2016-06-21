/**
 */
package form.tests;

import form.FormFactory;
import form.PopupCanvas;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Popup Canvas</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PopupCanvasTest extends CanvasFrameTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PopupCanvasTest.class);
	}

	/**
	 * Constructs a new Popup Canvas test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PopupCanvasTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Popup Canvas test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PopupCanvas getFixture() {
		return (PopupCanvas)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FormFactory.eINSTANCE.createPopupCanvas());
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

} //PopupCanvasTest
