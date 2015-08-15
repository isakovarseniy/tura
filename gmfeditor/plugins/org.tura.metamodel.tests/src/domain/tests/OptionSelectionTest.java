/**
 */
package domain.tests;

import domain.DomainFactory;
import domain.OptionSelection;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Option Selection</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OptionSelectionTest extends InputElementTest
{

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static void main(String[] args)
  {
		TestRunner.run(OptionSelectionTest.class);
	}

  /**
	 * Constructs a new Option Selection test case with the given name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public OptionSelectionTest(String name)
  {
		super(name);
	}

  /**
	 * Returns the fixture for this Option Selection test case.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected OptionSelection getFixture()
  {
		return (OptionSelection)fixture;
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
		setFixture(DomainFactory.eINSTANCE.createOptionSelection());
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

} //OptionSelectionTest
