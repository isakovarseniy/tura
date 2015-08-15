/**
 */
package domain.tests;

import domain.DomainFactory;
import domain.DropDownSelection;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Drop Down Selection</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DropDownSelectionTest extends OptionSelectionTest
{

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static void main(String[] args)
  {
		TestRunner.run(DropDownSelectionTest.class);
	}

  /**
	 * Constructs a new Drop Down Selection test case with the given name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public DropDownSelectionTest(String name)
  {
		super(name);
	}

  /**
	 * Returns the fixture for this Drop Down Selection test case.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected DropDownSelection getFixture()
  {
		return (DropDownSelection)fixture;
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
		setFixture(DomainFactory.eINSTANCE.createDropDownSelection());
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

} //DropDownSelectionTest
