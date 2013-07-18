/**
 */
package domain.tests;

import businessobjects.tests.BusinessObjectsTest;

import domain.Dammy2;
import domain.DomainFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Dammy2</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class Dammy2Test extends BusinessObjectsTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(Dammy2Test.class);
  }

  /**
   * Constructs a new Dammy2 test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Dammy2Test(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Dammy2 test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected Dammy2 getFixture()
  {
    return (Dammy2)fixture;
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
    setFixture(DomainFactory.eINSTANCE.createDammy2());
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

} //Dammy2Test
