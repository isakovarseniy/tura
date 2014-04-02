/**
 */
package domain.tests;

import domain.DomainFactory;
import domain.HTMLLayerHolder;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>HTML Layer Holder</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class HTMLLayerHolderTest extends TestCase
{

  /**
   * The fixture for this HTML Layer Holder test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HTMLLayerHolder fixture = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(HTMLLayerHolderTest.class);
  }

  /**
   * Constructs a new HTML Layer Holder test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HTMLLayerHolderTest(String name)
  {
    super(name);
  }

  /**
   * Sets the fixture for this HTML Layer Holder test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void setFixture(HTMLLayerHolder fixture)
  {
    this.fixture = fixture;
  }

  /**
   * Returns the fixture for this HTML Layer Holder test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HTMLLayerHolder getFixture()
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
    setFixture(DomainFactory.eINSTANCE.createHTMLLayerHolder());
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

} //HTMLLayerHolderTest
