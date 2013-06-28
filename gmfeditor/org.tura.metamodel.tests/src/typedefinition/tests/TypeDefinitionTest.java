/**
 */
package typedefinition.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import typedefinition.TypeDefinition;
import typedefinition.TypedefinitionFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Type Definition</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TypeDefinitionTest extends TestCase
{

  /**
   * The fixture for this Type Definition test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypeDefinition fixture = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(TypeDefinitionTest.class);
  }

  /**
   * Constructs a new Type Definition test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeDefinitionTest(String name)
  {
    super(name);
  }

  /**
   * Sets the fixture for this Type Definition test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void setFixture(TypeDefinition fixture)
  {
    this.fixture = fixture;
  }

  /**
   * Returns the fixture for this Type Definition test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypeDefinition getFixture()
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
    setFixture(TypedefinitionFactory.eINSTANCE.createTypeDefinition());
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

} //TypeDefinitionTest
