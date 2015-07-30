/**
 */
package domain.tests;

import domain.ContinuousIintegration;
import domain.DomainFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Continuous Iintegration</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ContinuousIintegrationTest extends DomainArtifactTest
{

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static void main(String[] args)
  {
		TestRunner.run(ContinuousIintegrationTest.class);
	}

  /**
	 * Constructs a new Continuous Iintegration test case with the given name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ContinuousIintegrationTest(String name)
  {
		super(name);
	}

  /**
	 * Returns the fixture for this Continuous Iintegration test case.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected ContinuousIintegration getFixture()
  {
		return (ContinuousIintegration)fixture;
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
		setFixture(DomainFactory.eINSTANCE.createContinuousIintegration());
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

} //ContinuousIintegrationTest
