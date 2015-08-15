/**
 */
package domain.tests;

import domain.ApplicationRecipe;
import domain.DomainFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Application Recipe</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApplicationRecipeTest extends TestCase
{

  /**
	 * The fixture for this Application Recipe test case.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ApplicationRecipe fixture = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static void main(String[] args)
  {
		TestRunner.run(ApplicationRecipeTest.class);
	}

  /**
	 * Constructs a new Application Recipe test case with the given name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ApplicationRecipeTest(String name)
  {
		super(name);
	}

  /**
	 * Sets the fixture for this Application Recipe test case.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void setFixture(ApplicationRecipe fixture)
  {
		this.fixture = fixture;
	}

  /**
	 * Returns the fixture for this Application Recipe test case.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ApplicationRecipe getFixture()
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
		setFixture(DomainFactory.eINSTANCE.createApplicationRecipe());
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

} //ApplicationRecipeTest
