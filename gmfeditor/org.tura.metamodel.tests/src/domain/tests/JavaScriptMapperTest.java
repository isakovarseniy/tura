/**
 */
package domain.tests;

import domain.DomainFactory;
import domain.JavaScriptMapper;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Java Script Mapper</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class JavaScriptMapperTest extends TypeMapperTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(JavaScriptMapperTest.class);
  }

  /**
   * Constructs a new Java Script Mapper test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JavaScriptMapperTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Java Script Mapper test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected JavaScriptMapper getFixture()
  {
    return (JavaScriptMapper)fixture;
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
    setFixture(DomainFactory.eINSTANCE.createJavaScriptMapper());
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

} //JavaScriptMapperTest
