/**
 */
package mapper.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import mapper.Mapper;
import mapper.MapperFactory;
import typedefinition.tests.TypePointerTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Mapper</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MapperTest extends TypePointerTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(MapperTest.class);
  }

  /**
   * Constructs a new Mapper test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MapperTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Mapper test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected Mapper getFixture()
  {
    return (Mapper)fixture;
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
    setFixture(MapperFactory.eINSTANCE.createMapper());
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

} //MapperTest
