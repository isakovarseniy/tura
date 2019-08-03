/**
 */
package form.tests;

import form.FormFactory;
import form.OverlayCanvas;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Overlay Canvas</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OverlayCanvasTest extends CanvasFrameTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OverlayCanvasTest.class);
	}

	/**
	 * Constructs a new Overlay Canvas test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OverlayCanvasTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Overlay Canvas test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected OverlayCanvas getFixture() {
		return (OverlayCanvas)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FormFactory.eINSTANCE.createOverlayCanvas());
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

} //OverlayCanvasTest
