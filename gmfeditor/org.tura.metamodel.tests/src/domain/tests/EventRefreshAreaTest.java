/**
 */
package domain.tests;

import domain.DomainFactory;
import domain.EventRefreshArea;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Event Refresh Area</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EventRefreshAreaTest extends TestCase
{

  /**
   * The fixture for this Event Refresh Area test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EventRefreshArea fixture = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(EventRefreshAreaTest.class);
  }

  /**
   * Constructs a new Event Refresh Area test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EventRefreshAreaTest(String name)
  {
    super(name);
  }

  /**
   * Sets the fixture for this Event Refresh Area test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void setFixture(EventRefreshArea fixture)
  {
    this.fixture = fixture;
  }

  /**
   * Returns the fixture for this Event Refresh Area test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EventRefreshArea getFixture()
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
    setFixture(DomainFactory.eINSTANCE.createEventRefreshArea());
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

} //EventRefreshAreaTest
