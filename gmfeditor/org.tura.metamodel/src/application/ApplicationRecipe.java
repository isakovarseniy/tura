/**
 */
package application;

import org.eclipse.emf.ecore.EObject;

import recipe.Recipe;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recipe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link application.ApplicationRecipe#getName <em>Name</em>}</li>
 *   <li>{@link application.ApplicationRecipe#getRecipes <em>Recipes</em>}</li>
 * </ul>
 * </p>
 *
 * @see application.ApplicationPackage#getApplicationRecipe()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface ApplicationRecipe extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see application.ApplicationPackage#getApplicationRecipe_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link application.ApplicationRecipe#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Recipes</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Recipes</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Recipes</em>' reference.
   * @see #setRecipes(Recipe)
   * @see application.ApplicationPackage#getApplicationRecipe_Recipes()
   * @model
   * @generated
   */
  Recipe getRecipes();

  /**
   * Sets the value of the '{@link application.ApplicationRecipe#getRecipes <em>Recipes</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Recipes</em>' reference.
   * @see #getRecipes()
   * @generated
   */
  void setRecipes(Recipe value);

} // ApplicationRecipe
