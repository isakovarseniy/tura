/**
 */
package application;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see application.ApplicationPackage
 * @generated
 */
public interface ApplicationFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ApplicationFactory eINSTANCE = application.impl.ApplicationFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Application</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Application</em>'.
   * @generated
   */
  Application createApplication();

  /**
   * Returns a new object of class '<em>Recipes</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Recipes</em>'.
   * @generated
   */
  ApplicationRecipes createApplicationRecipes();

  /**
   * Returns a new object of class '<em>Recipe</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Recipe</em>'.
   * @generated
   */
  ApplicationRecipe createApplicationRecipe();

  /**
   * Returns a new object of class '<em>Mappers</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mappers</em>'.
   * @generated
   */
  ApplicationMappers createApplicationMappers();

  /**
   * Returns a new object of class '<em>Mapper</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mapper</em>'.
   * @generated
   */
  ApplicationMapper createApplicationMapper();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  ApplicationPackage getApplicationPackage();

} //ApplicationFactory
