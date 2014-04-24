/**
 */
package domain.tests;

import domain.DomainFactory;
import domain.SourcesPointer;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sources Pointer</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SourcesPointerTest extends UielementTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(SourcesPointerTest.class);
  }

  /**
   * Constructs a new Sources Pointer test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SourcesPointerTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Sources Pointer test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected SourcesPointer getFixture()
  {
    return (SourcesPointer)fixture;
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
    setFixture(DomainFactory.eINSTANCE.createSourcesPointer());
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

} //SourcesPointerTest
