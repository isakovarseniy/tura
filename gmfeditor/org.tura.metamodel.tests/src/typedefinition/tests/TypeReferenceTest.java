/**
 */
package typedefinition.tests;

import junit.textui.TestRunner;

import typedefinition.TypeReference;
import typedefinition.TypedefinitionFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Type Reference</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TypeReferenceTest extends TypeElementTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(TypeReferenceTest.class);
  }

  /**
   * Constructs a new Type Reference test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeReferenceTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Type Reference test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected TypeReference getFixture()
  {
    return (TypeReference)fixture;
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
    setFixture(TypedefinitionFactory.eINSTANCE.createTypeReference());
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

} //TypeReferenceTest
