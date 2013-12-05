/**
 */
package domain.tests;

import domain.DomainFactory;
import domain.QueryVariable;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Query Variable</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class QueryVariableTest extends TestCase
{

  /**
   * The fixture for this Query Variable test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected QueryVariable fixture = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(QueryVariableTest.class);
  }

  /**
   * Constructs a new Query Variable test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QueryVariableTest(String name)
  {
    super(name);
  }

  /**
   * Sets the fixture for this Query Variable test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void setFixture(QueryVariable fixture)
  {
    this.fixture = fixture;
  }

  /**
   * Returns the fixture for this Query Variable test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected QueryVariable getFixture()
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
    setFixture(DomainFactory.eINSTANCE.createQueryVariable());
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

} //QueryVariableTest
