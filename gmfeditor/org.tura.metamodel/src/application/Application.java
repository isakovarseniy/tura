/**
 */
package application;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link application.Application#getApplicationRecipes <em>Application Recipes</em>}</li>
 *   <li>{@link application.Application#getApplicationMappers <em>Application Mappers</em>}</li>
 * </ul>
 * </p>
 *
 * @see application.ApplicationPackage#getApplication()
 * @model
 * @generated
 */
public interface Application extends EObject
{

  /**
   * Returns the value of the '<em><b>Application Recipes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Application Recipes</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Application Recipes</em>' containment reference.
   * @see #setApplicationRecipes(ApplicationRecipes)
   * @see application.ApplicationPackage#getApplication_ApplicationRecipes()
   * @model containment="true"
   * @generated
   */
  ApplicationRecipes getApplicationRecipes();

  /**
   * Sets the value of the '{@link application.Application#getApplicationRecipes <em>Application Recipes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Application Recipes</em>' containment reference.
   * @see #getApplicationRecipes()
   * @generated
   */
  void setApplicationRecipes(ApplicationRecipes value);

  /**
   * Returns the value of the '<em><b>Application Mappers</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Application Mappers</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Application Mappers</em>' containment reference.
   * @see #setApplicationMappers(ApplicationMappers)
   * @see application.ApplicationPackage#getApplication_ApplicationMappers()
   * @model containment="true"
   * @generated
   */
  ApplicationMappers getApplicationMappers();

  /**
   * Sets the value of the '{@link application.Application#getApplicationMappers <em>Application Mappers</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Application Mappers</em>' containment reference.
   * @see #getApplicationMappers()
   * @generated
   */
  void setApplicationMappers(ApplicationMappers value);
} // Application
