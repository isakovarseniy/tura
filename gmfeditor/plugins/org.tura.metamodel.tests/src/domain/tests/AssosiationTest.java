/**
 */
package domain.tests;

import domain.Assosiation;
import domain.DomainFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Assosiation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AssosiationTest extends RelationShipTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AssosiationTest.class);
	}

	/**
	 * Constructs a new Assosiation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssosiationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Assosiation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Assosiation getFixture() {
		return (Assosiation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DomainFactory.eINSTANCE.createAssosiation());
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

} //AssosiationTest