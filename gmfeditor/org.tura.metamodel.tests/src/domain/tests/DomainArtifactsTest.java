/**
 */
package domain.tests;

import domain.DomainArtifacts;
import domain.DomainFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Artifacts</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DomainArtifactsTest extends HTMLLayerHolderTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(DomainArtifactsTest.class);
  }

  /**
   * Constructs a new Artifacts test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomainArtifactsTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Artifacts test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected DomainArtifacts getFixture()
  {
    return (DomainArtifacts)fixture;
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
    setFixture(DomainFactory.eINSTANCE.createDomainArtifacts());
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

} //DomainArtifactsTest
