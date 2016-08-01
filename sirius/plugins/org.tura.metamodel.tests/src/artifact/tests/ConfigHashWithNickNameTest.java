/**
 */
package artifact.tests;

import artifact.ArtifactFactory;
import artifact.ConfigHashWithNickName;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Config Hash With Nick Name</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConfigHashWithNickNameTest extends TestCase {

	/**
	 * The fixture for this Config Hash With Nick Name test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigHashWithNickName fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ConfigHashWithNickNameTest.class);
	}

	/**
	 * Constructs a new Config Hash With Nick Name test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigHashWithNickNameTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Config Hash With Nick Name test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ConfigHashWithNickName fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Config Hash With Nick Name test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigHashWithNickName getFixture() {
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
		setFixture(ArtifactFactory.eINSTANCE.createConfigHashWithNickName());
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

} //ConfigHashWithNickNameTest
