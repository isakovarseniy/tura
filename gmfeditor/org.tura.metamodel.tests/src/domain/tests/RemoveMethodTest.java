/**
 */
package domain.tests;

import domain.DomainFactory;
import domain.RemoveMethod;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Remove Method</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RemoveMethodTest extends BusinessMethodTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(RemoveMethodTest.class);
  }

  /**
   * Constructs a new Remove Method test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RemoveMethodTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Remove Method test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected RemoveMethod getFixture()
  {
    return (RemoveMethod)fixture;
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
    setFixture(DomainFactory.eINSTANCE.createRemoveMethod());
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

} //RemoveMethodTest
