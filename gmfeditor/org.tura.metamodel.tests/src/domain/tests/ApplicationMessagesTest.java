/**
 */
package domain.tests;

import domain.ApplicationMessages;
import domain.DomainFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Application Messages</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApplicationMessagesTest extends TestCase
{

  /**
   * The fixture for this Application Messages test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ApplicationMessages fixture = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(ApplicationMessagesTest.class);
  }

  /**
   * Constructs a new Application Messages test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ApplicationMessagesTest(String name)
  {
    super(name);
  }

  /**
   * Sets the fixture for this Application Messages test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void setFixture(ApplicationMessages fixture)
  {
    this.fixture = fixture;
  }

  /**
   * Returns the fixture for this Application Messages test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ApplicationMessages getFixture()
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
    setFixture(DomainFactory.eINSTANCE.createApplicationMessages());
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

} //ApplicationMessagesTest
