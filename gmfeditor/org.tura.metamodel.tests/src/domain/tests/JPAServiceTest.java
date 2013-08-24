/**
 */
package domain.tests;

import domain.DomainFactory;
import domain.JPAService;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>JPA Service</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class JPAServiceTest extends DomainArtifactTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(JPAServiceTest.class);
  }

  /**
   * Constructs a new JPA Service test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JPAServiceTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this JPA Service test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected JPAService getFixture()
  {
    return (JPAService)fixture;
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
    setFixture(DomainFactory.eINSTANCE.createJPAService());
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

} //JPAServiceTest
