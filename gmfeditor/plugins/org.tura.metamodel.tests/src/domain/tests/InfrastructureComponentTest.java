/**
 */
package domain.tests;

import domain.DomainFactory;
import domain.InfrastructureComponent;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Infrastructure Component</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InfrastructureComponentTest extends TestCase
{

  /**
	 * The fixture for this Infrastructure Component test case.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected InfrastructureComponent fixture = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static void main(String[] args)
  {
		TestRunner.run(InfrastructureComponentTest.class);
	}

  /**
	 * Constructs a new Infrastructure Component test case with the given name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public InfrastructureComponentTest(String name)
  {
		super(name);
	}

  /**
	 * Sets the fixture for this Infrastructure Component test case.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void setFixture(InfrastructureComponent fixture)
  {
		this.fixture = fixture;
	}

  /**
	 * Returns the fixture for this Infrastructure Component test case.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected InfrastructureComponent getFixture()
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
		setFixture(DomainFactory.eINSTANCE.createInfrastructureComponent());
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

} //InfrastructureComponentTest
