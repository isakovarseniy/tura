/**
 */
package recipe;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recipes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link recipe.Recipes#getRecipe <em>Recipe</em>}</li>
 * </ul>
 * </p>
 *
 * @see recipe.RecipePackage#getRecipes()
 * @model
 * @generated
 */
public interface Recipes extends EObject
{
  /**
   * Returns the value of the '<em><b>Recipe</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Recipe</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Recipe</em>' containment reference.
   * @see #setRecipe(Recipe)
   * @see recipe.RecipePackage#getRecipes_Recipe()
   * @model containment="true"
   * @generated
   */
  Recipe getRecipe();

  /**
   * Sets the value of the '{@link recipe.Recipes#getRecipe <em>Recipe</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Recipe</em>' containment reference.
   * @see #getRecipe()
   * @generated
   */
  void setRecipe(Recipe value);

} // Recipes
