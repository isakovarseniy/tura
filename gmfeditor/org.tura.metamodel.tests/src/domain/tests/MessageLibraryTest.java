/**
 */
package domain.tests;

import domain.DomainFactory;
import domain.MessageLibrary;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Message Library</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MessageLibraryTest extends TestCase
{

  /**
   * The fixture for this Message Library test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MessageLibrary fixture = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(MessageLibraryTest.class);
  }

  /**
   * Constructs a new Message Library test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MessageLibraryTest(String name)
  {
    super(name);
  }

  /**
   * Sets the fixture for this Message Library test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void setFixture(MessageLibrary fixture)
  {
    this.fixture = fixture;
  }

  /**
   * Returns the fixture for this Message Library test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MessageLibrary getFixture()
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
    setFixture(DomainFactory.eINSTANCE.createMessageLibrary());
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

} //MessageLibraryTest
