/**
 */
package domain.tests;

import domain.DeploymentSequence;
import domain.DomainFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Deployment Sequence</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DeploymentSequenceTest extends TestCase
{

  /**
   * The fixture for this Deployment Sequence test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DeploymentSequence fixture = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(DeploymentSequenceTest.class);
  }

  /**
   * Constructs a new Deployment Sequence test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeploymentSequenceTest(String name)
  {
    super(name);
  }

  /**
   * Sets the fixture for this Deployment Sequence test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void setFixture(DeploymentSequence fixture)
  {
    this.fixture = fixture;
  }

  /**
   * Returns the fixture for this Deployment Sequence test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DeploymentSequence getFixture()
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
    setFixture(DomainFactory.eINSTANCE.createDeploymentSequence());
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

} //DeploymentSequenceTest
