/**
 */
package domain.tests;

import domain.DomainFactory;
import domain.Enumarator;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Enumarator</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EnumaratorTest extends TypeElementTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(EnumaratorTest.class);
  }

  /**
   * Constructs a new Enumarator test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumaratorTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Enumarator test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected Enumarator getFixture()
  {
    return (Enumarator)fixture;
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
    setFixture(DomainFactory.eINSTANCE.createEnumarator());
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

} //EnumaratorTest
