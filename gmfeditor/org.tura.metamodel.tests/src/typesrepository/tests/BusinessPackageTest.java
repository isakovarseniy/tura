/**
 */
package typesrepository.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import typesrepository.BusinessPackage;
import typesrepository.TypesrepositoryFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Business Package</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BusinessPackageTest extends TestCase
{

  /**
   * The fixture for this Business Package test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BusinessPackage fixture = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(BusinessPackageTest.class);
  }

  /**
   * Constructs a new Business Package test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BusinessPackageTest(String name)
  {
    super(name);
  }

  /**
   * Sets the fixture for this Business Package test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void setFixture(BusinessPackage fixture)
  {
    this.fixture = fixture;
  }

  /**
   * Returns the fixture for this Business Package test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BusinessPackage getFixture()
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
    setFixture(TypesrepositoryFactory.eINSTANCE.createBusinessPackage());
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

} //BusinessPackageTest
