/**
 */
package domain.tests;

import domain.DeploymentStarStep;
import domain.DomainFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Deployment Star Step</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DeploymentStarStepTest extends TestCase
{

  /**
   * The fixture for this Deployment Star Step test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DeploymentStarStep fixture = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(DeploymentStarStepTest.class);
  }

  /**
   * Constructs a new Deployment Star Step test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeploymentStarStepTest(String name)
  {
    super(name);
  }

  /**
   * Sets the fixture for this Deployment Star Step test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void setFixture(DeploymentStarStep fixture)
  {
    this.fixture = fixture;
  }

  /**
   * Returns the fixture for this Deployment Star Step test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DeploymentStarStep getFixture()
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
    setFixture(DomainFactory.eINSTANCE.createDeploymentStarStep());
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

} //DeploymentStarStepTest
