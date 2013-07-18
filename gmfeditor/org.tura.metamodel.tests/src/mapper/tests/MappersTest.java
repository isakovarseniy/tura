/**
 */
package mapper.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import mapper.MapperFactory;
import mapper.Mappers;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Mappers</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MappersTest extends TestCase
{

  /**
   * The fixture for this Mappers test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Mappers fixture = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(MappersTest.class);
  }

  /**
   * Constructs a new Mappers test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MappersTest(String name)
  {
    super(name);
  }

  /**
   * Sets the fixture for this Mappers test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void setFixture(Mappers fixture)
  {
    this.fixture = fixture;
  }

  /**
   * Returns the fixture for this Mappers test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Mappers getFixture()
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
    setFixture(MapperFactory.eINSTANCE.createMappers());
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

} //MappersTest
