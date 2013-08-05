/**
 */
package domain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recipes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.Recipes#getRecipe <em>Recipe</em>}</li>
 *   <li>{@link domain.Recipes#getConfigurations <em>Configurations</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getRecipes()
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
   * @see domain.DomainPackage#getRecipes_Recipe()
   * @model containment="true"
   * @generated
   */
  Recipe getRecipe();

  /**
   * Sets the value of the '{@link domain.Recipes#getRecipe <em>Recipe</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Recipe</em>' containment reference.
   * @see #getRecipe()
   * @generated
   */
  void setRecipe(Recipe value);

  /**
   * Returns the value of the '<em><b>Configurations</b></em>' containment reference list.
   * The list contents are of type {@link domain.Configuration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Configurations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Configurations</em>' containment reference list.
   * @see domain.DomainPackage#getRecipes_Configurations()
   * @model containment="true"
   * @generated
   */
  EList<Configuration> getConfigurations();

} // Recipes
