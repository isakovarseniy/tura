/**
 */
package domain.tests;

import domain.ApplicationRecipes;
import domain.DomainFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Application Recipes</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApplicationRecipesTest extends HTMLLayerHolderTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(ApplicationRecipesTest.class);
  }

  /**
   * Constructs a new Application Recipes test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ApplicationRecipesTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Application Recipes test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected ApplicationRecipes getFixture()
  {
    return (ApplicationRecipes)fixture;
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
    setFixture(DomainFactory.eINSTANCE.createApplicationRecipes());
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

} //ApplicationRecipesTest
