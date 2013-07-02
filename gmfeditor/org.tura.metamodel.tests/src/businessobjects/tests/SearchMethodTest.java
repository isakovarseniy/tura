/**
 */
package businessobjects.tests;

import businessobjects.BusinessobjectsFactory;
import businessobjects.SearchMethod;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Search Method</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SearchMethodTest extends BusinessMethodTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(SearchMethodTest.class);
  }

  /**
   * Constructs a new Search Method test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SearchMethodTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Search Method test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected SearchMethod getFixture()
  {
    return (SearchMethod)fixture;
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
    setFixture(BusinessobjectsFactory.eINSTANCE.createSearchMethod());
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

} //SearchMethodTest
