/**
 */
package domain.tests;

import domain.DomainFactory;
import domain.ExpressionPart;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Expression Part</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExpressionPartTest extends TestCase
{

  /**
	 * The fixture for this Expression Part test case.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ExpressionPart fixture = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static void main(String[] args)
  {
		TestRunner.run(ExpressionPartTest.class);
	}

  /**
	 * Constructs a new Expression Part test case with the given name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ExpressionPartTest(String name)
  {
		super(name);
	}

  /**
	 * Sets the fixture for this Expression Part test case.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void setFixture(ExpressionPart fixture)
  {
		this.fixture = fixture;
	}

  /**
	 * Returns the fixture for this Expression Part test case.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ExpressionPart getFixture()
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
		setFixture(DomainFactory.eINSTANCE.createExpressionPart());
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

} //ExpressionPartTest
