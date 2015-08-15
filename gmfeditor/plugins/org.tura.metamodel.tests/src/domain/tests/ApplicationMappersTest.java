/**
 */
package domain.tests;

import domain.ApplicationMappers;
import domain.DomainFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Application Mappers</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApplicationMappersTest extends HTMLLayerHolderTest
{

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static void main(String[] args)
  {
		TestRunner.run(ApplicationMappersTest.class);
	}

  /**
	 * Constructs a new Application Mappers test case with the given name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ApplicationMappersTest(String name)
  {
		super(name);
	}

  /**
	 * Returns the fixture for this Application Mappers test case.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected ApplicationMappers getFixture()
  {
		return (ApplicationMappers)fixture;
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
		setFixture(DomainFactory.eINSTANCE.createApplicationMappers());
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

} //ApplicationMappersTest
