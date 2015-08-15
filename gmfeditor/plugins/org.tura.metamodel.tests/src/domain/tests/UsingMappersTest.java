/**
 */
package domain.tests;

import domain.DomainFactory;
import domain.UsingMappers;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Using Mappers</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UsingMappersTest extends TestCase
{

  /**
	 * The fixture for this Using Mappers test case.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected UsingMappers fixture = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static void main(String[] args)
  {
		TestRunner.run(UsingMappersTest.class);
	}

  /**
	 * Constructs a new Using Mappers test case with the given name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public UsingMappersTest(String name)
  {
		super(name);
	}

  /**
	 * Sets the fixture for this Using Mappers test case.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void setFixture(UsingMappers fixture)
  {
		this.fixture = fixture;
	}

  /**
	 * Returns the fixture for this Using Mappers test case.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected UsingMappers getFixture()
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
		setFixture(DomainFactory.eINSTANCE.createUsingMappers());
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

} //UsingMappersTest
