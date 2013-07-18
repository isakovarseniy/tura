/**
 */
package domain.tests;

import domain.Dammy4;
import domain.DomainFactory;

import junit.textui.TestRunner;

import mapper.tests.MappersTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Dammy4</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class Dammy4Test extends MappersTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(Dammy4Test.class);
  }

  /**
   * Constructs a new Dammy4 test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Dammy4Test(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Dammy4 test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected Dammy4 getFixture()
  {
    return (Dammy4)fixture;
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
    setFixture(DomainFactory.eINSTANCE.createDammy4());
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

} //Dammy4Test
