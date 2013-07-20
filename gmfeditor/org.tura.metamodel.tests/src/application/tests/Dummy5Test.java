/**
 */
package application.tests;

import application.ApplicationFactory;
import application.Dummy5;

import junit.textui.TestRunner;

import typedefinition.tests.TypeDefinitionTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Dummy5</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class Dummy5Test extends TypeDefinitionTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(Dummy5Test.class);
  }

  /**
   * Constructs a new Dummy5 test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Dummy5Test(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Dummy5 test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected Dummy5 getFixture()
  {
    return (Dummy5)fixture;
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
    setFixture(ApplicationFactory.eINSTANCE.createDummy5());
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

} //Dummy5Test
