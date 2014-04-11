/**
 */
package domain.tests;

import domain.CanvasFrame;
import domain.DomainFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Canvas Frame</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CanvasFrameTest extends TestCase
{

  /**
   * The fixture for this Canvas Frame test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CanvasFrame fixture = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(CanvasFrameTest.class);
  }

  /**
   * Constructs a new Canvas Frame test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CanvasFrameTest(String name)
  {
    super(name);
  }

  /**
   * Sets the fixture for this Canvas Frame test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void setFixture(CanvasFrame fixture)
  {
    this.fixture = fixture;
  }

  /**
   * Returns the fixture for this Canvas Frame test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CanvasFrame getFixture()
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
    setFixture(DomainFactory.eINSTANCE.createCanvasFrame());
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

} //CanvasFrameTest
