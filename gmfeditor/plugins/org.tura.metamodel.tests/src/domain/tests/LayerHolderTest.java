/**
 */
package domain.tests;

import domain.DomainFactory;
import domain.LayerHolder;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Layer Holder</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LayerHolderTest extends UielementTest
{

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static void main(String[] args)
  {
		TestRunner.run(LayerHolderTest.class);
	}

  /**
	 * Constructs a new Layer Holder test case with the given name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public LayerHolderTest(String name)
  {
		super(name);
	}

  /**
	 * Returns the fixture for this Layer Holder test case.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected LayerHolder getFixture()
  {
		return (LayerHolder)fixture;
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
		setFixture(DomainFactory.eINSTANCE.createLayerHolder());
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

} //LayerHolderTest
