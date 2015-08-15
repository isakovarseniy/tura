/**
 */
package domain.tests;

import domain.DomainFactory;
import domain.EnterpriseInfrastructure;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Enterprise Infrastructure</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EnterpriseInfrastructureTest extends TestCase
{

  /**
	 * The fixture for this Enterprise Infrastructure test case.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected EnterpriseInfrastructure fixture = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static void main(String[] args)
  {
		TestRunner.run(EnterpriseInfrastructureTest.class);
	}

  /**
	 * Constructs a new Enterprise Infrastructure test case with the given name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EnterpriseInfrastructureTest(String name)
  {
		super(name);
	}

  /**
	 * Sets the fixture for this Enterprise Infrastructure test case.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void setFixture(EnterpriseInfrastructure fixture)
  {
		this.fixture = fixture;
	}

  /**
	 * Returns the fixture for this Enterprise Infrastructure test case.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected EnterpriseInfrastructure getFixture()
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
		setFixture(DomainFactory.eINSTANCE.createEnterpriseInfrastructure());
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

} //EnterpriseInfrastructureTest
