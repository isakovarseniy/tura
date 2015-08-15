/**
 */
package domain.tests;

import domain.DomainFactory;
import domain.ServerClaster;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Server Claster</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ServerClasterTest extends InfrastructureComponentTest
{

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static void main(String[] args)
  {
		TestRunner.run(ServerClasterTest.class);
	}

  /**
	 * Constructs a new Server Claster test case with the given name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ServerClasterTest(String name)
  {
		super(name);
	}

  /**
	 * Returns the fixture for this Server Claster test case.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected ServerClaster getFixture()
  {
		return (ServerClaster)fixture;
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
		setFixture(DomainFactory.eINSTANCE.createServerClaster());
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

} //ServerClasterTest
