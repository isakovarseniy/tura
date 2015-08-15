/**
 */
package domain.tests;

import domain.DefaultCavas;
import domain.DomainFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Default Cavas</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DefaultCavasTest extends TestCase
{

  /**
	 * The fixture for this Default Cavas test case.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected DefaultCavas fixture = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static void main(String[] args)
  {
		TestRunner.run(DefaultCavasTest.class);
	}

  /**
	 * Constructs a new Default Cavas test case with the given name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public DefaultCavasTest(String name)
  {
		super(name);
	}

  /**
	 * Sets the fixture for this Default Cavas test case.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void setFixture(DefaultCavas fixture)
  {
		this.fixture = fixture;
	}

  /**
	 * Returns the fixture for this Default Cavas test case.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected DefaultCavas getFixture()
  {
		return fixture;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
  @Override
  protected void setUp() throws Exception
  {
		setFixture(DomainFactory.eINSTANCE.createDefaultCavas());
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
  @Override
  protected void tearDown() throws Exception
  {
		setFixture(null);
	}

} //DefaultCavasTest
