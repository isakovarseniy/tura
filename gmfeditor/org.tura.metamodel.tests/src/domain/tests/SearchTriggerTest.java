/**
 */
package domain.tests;

import domain.DomainFactory;
import domain.SearchTrigger;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Search Trigger</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SearchTriggerTest extends TriggerTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(SearchTriggerTest.class);
  }

  /**
   * Constructs a new Search Trigger test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SearchTriggerTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Search Trigger test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected SearchTrigger getFixture()
  {
    return (SearchTrigger)fixture;
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
    setFixture(DomainFactory.eINSTANCE.createSearchTrigger());
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

} //SearchTriggerTest
