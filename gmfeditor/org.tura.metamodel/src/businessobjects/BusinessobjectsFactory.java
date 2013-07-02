/**
 */
package businessobjects;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see businessobjects.BusinessobjectsPackage
 * @generated
 */
public interface BusinessobjectsFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  BusinessobjectsFactory eINSTANCE = businessobjects.impl.BusinessobjectsFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Business Objects</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Business Objects</em>'.
   * @generated
   */
  BusinessObjects createBusinessObjects();

  /**
   * Returns a new object of class '<em>Business Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Business Object</em>'.
   * @generated
   */
  BusinessObject createBusinessObject();

  /**
   * Returns a new object of class '<em>Business Method</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Business Method</em>'.
   * @generated
   */
  BusinessMethod createBusinessMethod();

  /**
   * Returns a new object of class '<em>Create Method</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Create Method</em>'.
   * @generated
   */
  CreateMethod createCreateMethod();

  /**
   * Returns a new object of class '<em>Insert Method</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Insert Method</em>'.
   * @generated
   */
  InsertMethod createInsertMethod();

  /**
   * Returns a new object of class '<em>Update Method</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Update Method</em>'.
   * @generated
   */
  UpdateMethod createUpdateMethod();

  /**
   * Returns a new object of class '<em>Remove Method</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Remove Method</em>'.
   * @generated
   */
  RemoveMethod createRemoveMethod();

  /**
   * Returns a new object of class '<em>Search Method</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Search Method</em>'.
   * @generated
   */
  SearchMethod createSearchMethod();

  /**
   * Returns a new object of class '<em>Other Method</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Other Method</em>'.
   * @generated
   */
  OtherMethod createOtherMethod();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  BusinessobjectsPackage getBusinessobjectsPackage();

} //BusinessobjectsFactory
