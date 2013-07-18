/**
 */
package domain.tests;

import domain.Dammy3;
import domain.DomainFactory;

import junit.textui.TestRunner;

import recipe.tests.RecipesTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Dammy3</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class Dammy3Test extends RecipesTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(Dammy3Test.class);
  }

  /**
   * Constructs a new Dammy3 test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Dammy3Test(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Dammy3 test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected Dammy3 getFixture()
  {
    return (Dammy3)fixture;
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
    setFixture(DomainFactory.eINSTANCE.createDammy3());
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

} //Dammy3Test
