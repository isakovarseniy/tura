/**
 */
package domain.tests;

import domain.Dammy1;
import domain.DomainFactory;

import junit.textui.TestRunner;

import typedefinition.tests.TypeDefinitionTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Dammy1</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class Dammy1Test extends TypeDefinitionTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(Dammy1Test.class);
  }

  /**
   * Constructs a new Dammy1 test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Dammy1Test(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Dammy1 test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected Dammy1 getFixture()
  {
    return (Dammy1)fixture;
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
    setFixture(DomainFactory.eINSTANCE.createDammy1());
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

} //Dammy1Test
