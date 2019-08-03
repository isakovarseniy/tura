/**
 */
package form.tests;

import form.FormFactory;
import form.SelectOneFromListOfOptions;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Select One From List Of Options</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SelectOneFromListOfOptionsTest extends OptionSelectionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SelectOneFromListOfOptionsTest.class);
	}

	/**
	 * Constructs a new Select One From List Of Options test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectOneFromListOfOptionsTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Select One From List Of Options test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SelectOneFromListOfOptions getFixture() {
		return (SelectOneFromListOfOptions)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FormFactory.eINSTANCE.createSelectOneFromListOfOptions());
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

} //SelectOneFromListOfOptionsTest
