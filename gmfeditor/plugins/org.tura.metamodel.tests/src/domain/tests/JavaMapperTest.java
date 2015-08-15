/**
 */
package domain.tests;

import domain.DomainFactory;
import domain.JavaMapper;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Java Mapper</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class JavaMapperTest extends TypeMapperTest
{

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static void main(String[] args)
  {
		TestRunner.run(JavaMapperTest.class);
	}

  /**
	 * Constructs a new Java Mapper test case with the given name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public JavaMapperTest(String name)
  {
		super(name);
	}

  /**
	 * Returns the fixture for this Java Mapper test case.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected JavaMapper getFixture()
  {
		return (JavaMapper)fixture;
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
		setFixture(DomainFactory.eINSTANCE.createJavaMapper());
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

} //JavaMapperTest
