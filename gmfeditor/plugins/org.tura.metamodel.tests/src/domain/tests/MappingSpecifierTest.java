/**
 */
package domain.tests;

import domain.DomainFactory;
import domain.MappingSpecifier;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Mapping Specifier</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MappingSpecifierTest extends TestCase
{

  /**
	 * The fixture for this Mapping Specifier test case.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected MappingSpecifier fixture = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static void main(String[] args)
  {
		TestRunner.run(MappingSpecifierTest.class);
	}

  /**
	 * Constructs a new Mapping Specifier test case with the given name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public MappingSpecifierTest(String name)
  {
		super(name);
	}

  /**
	 * Sets the fixture for this Mapping Specifier test case.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void setFixture(MappingSpecifier fixture)
  {
		this.fixture = fixture;
	}

  /**
	 * Returns the fixture for this Mapping Specifier test case.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected MappingSpecifier getFixture()
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
		setFixture(DomainFactory.eINSTANCE.createMappingSpecifier());
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

} //MappingSpecifierTest
