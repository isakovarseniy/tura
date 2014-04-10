/**
 */
package domain.tests;

import domain.DomainFactory;
import domain.ViewInheritance;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>View Inheritance</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ViewInheritanceTest extends TestCase
{

  /**
   * The fixture for this View Inheritance test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ViewInheritance fixture = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(ViewInheritanceTest.class);
  }

  /**
   * Constructs a new View Inheritance test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ViewInheritanceTest(String name)
  {
    super(name);
  }

  /**
   * Sets the fixture for this View Inheritance test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void setFixture(ViewInheritance fixture)
  {
    this.fixture = fixture;
  }

  /**
   * Returns the fixture for this View Inheritance test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ViewInheritance getFixture()
  {
    return fixture;
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
    setFixture(DomainFactory.eINSTANCE.createViewInheritance());
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

} //ViewInheritanceTest
