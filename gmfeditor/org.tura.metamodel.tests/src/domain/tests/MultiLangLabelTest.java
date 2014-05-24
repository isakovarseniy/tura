/**
 */
package domain.tests;

import domain.DomainFactory;
import domain.MultiLangLabel;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Multi Lang Label</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MultiLangLabelTest extends TestCase
{

  /**
   * The fixture for this Multi Lang Label test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MultiLangLabel fixture = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(MultiLangLabelTest.class);
  }

  /**
   * Constructs a new Multi Lang Label test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MultiLangLabelTest(String name)
  {
    super(name);
  }

  /**
   * Sets the fixture for this Multi Lang Label test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void setFixture(MultiLangLabel fixture)
  {
    this.fixture = fixture;
  }

  /**
   * Returns the fixture for this Multi Lang Label test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MultiLangLabel getFixture()
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
    setFixture(DomainFactory.eINSTANCE.createMultiLangLabel());
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

} //MultiLangLabelTest
