/**
 */
package domain;

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
 *   <li>{@link domain.Recipe#getName <em>Name</em>}</li>
 *   <li>{@link domain.Recipe#getComponents <em>Components</em>}</li>
 *   <li>{@link domain.Recipe#getRecipeConfig <em>Recipe Config</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getRecipe()
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
   * @see domain.DomainPackage#getRecipe_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link domain.Recipe#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Components</b></em>' containment reference list.
   * The list contents are of type {@link domain.Component}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Components</em>' containment reference list.
   * @see domain.DomainPackage#getRecipe_Components()
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
   * @see domain.DomainPackage#getRecipe_RecipeConfig()
   * @model annotation="gmf.link target.decoration='arrow' style='dash'"
   * @generated
   */
  Configuration getRecipeConfig();

  /**
   * Sets the value of the '{@link domain.Recipe#getRecipeConfig <em>Recipe Config</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Recipe Config</em>' reference.
   * @see #getRecipeConfig()
   * @generated
   */
  void setRecipeConfig(Configuration value);

} // Recipe
