/**
 */
package recipe;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recipe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link recipe.Recipe#getName <em>Name</em>}</li>
 *   <li>{@link recipe.Recipe#getComponents <em>Components</em>}</li>
 *   <li>{@link recipe.Recipe#getRecipeConfig <em>Recipe Config</em>}</li>
 * </ul>
 * </p>
 *
 * @see recipe.RecipePackage#getRecipe()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface Recipe extends EObject
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
   * @see recipe.RecipePackage#getRecipe_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link recipe.Recipe#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Components</b></em>' containment reference list.
   * The list contents are of type {@link recipe.Component}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Components</em>' containment reference list.
   * @see recipe.RecipePackage#getRecipe_Components()
   * @model containment="true"
   * @generated
   */
  EList<Component> getComponents();

  /**
   * Returns the value of the '<em><b>Recipe Config</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Recipe Config</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Recipe Config</em>' reference.
   * @see #setRecipeConfig(Configuration)
   * @see recipe.RecipePackage#getRecipe_RecipeConfig()
   * @model annotation="gmf.link target.decoration='arrow' style='dash'"
   * @generated
   */
  Configuration getRecipeConfig();

  /**
   * Sets the value of the '{@link recipe.Recipe#getRecipeConfig <em>Recipe Config</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Recipe Config</em>' reference.
   * @see #getRecipeConfig()
   * @generated
   */
  void setRecipeConfig(Configuration value);

} // Recipe
