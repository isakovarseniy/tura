/**
 */
package tura.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import tura.TuraFactory;
import tura.TuraMetamodel;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Metamodel</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TuraMetamodelTest extends TestCase
{

  /**
   * The fixture for this Metamodel test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TuraMetamodel fixture = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(TuraMetamodelTest.class);
  }

  /**
   * Constructs a new Metamodel test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TuraMetamodelTest(String name)
  {
    super(name);
  }

  /**
   * Sets the fixture for this Metamodel test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void setFixture(TuraMetamodel fixture)
  {
    this.fixture = fixture;
  }

  /**
   * Returns the fixture for this Metamodel test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TuraMetamodel getFixture()
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
    setFixture(TuraFactory.eINSTANCE.createTuraMetamodel());
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

} //TuraMetamodelTest
