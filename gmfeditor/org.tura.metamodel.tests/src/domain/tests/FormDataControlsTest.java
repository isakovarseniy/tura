/**
 */
package domain.tests;

import domain.DomainFactory;
import domain.FormDataControls;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Form Data Controls</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FormDataControlsTest extends TestCase
{

  /**
	 * The fixture for this Form Data Controls test case.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected FormDataControls fixture = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static void main(String[] args)
  {
		TestRunner.run(FormDataControlsTest.class);
	}

  /**
	 * Constructs a new Form Data Controls test case with the given name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public FormDataControlsTest(String name)
  {
		super(name);
	}

  /**
	 * Sets the fixture for this Form Data Controls test case.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void setFixture(FormDataControls fixture)
  {
		this.fixture = fixture;
	}

  /**
	 * Returns the fixture for this Form Data Controls test case.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected FormDataControls getFixture()
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
		setFixture(DomainFactory.eINSTANCE.createFormDataControls());
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

} //FormDataControlsTest
