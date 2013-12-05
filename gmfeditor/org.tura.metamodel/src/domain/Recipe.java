/**
 */
package domain;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recipe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.Recipe#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.Recipe#getParent <em>Parent</em>}</li>
 *   <li>{@link domain.Recipe#getName <em>Name</em>}</li>
 *   <li>{@link domain.Recipe#getIngredients <em>Ingredients</em>}</li>
 *   <li>{@link domain.Recipe#getInfrastructures <em>Infrastructures</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getRecipe()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface Recipe extends UsingMappers
{
  /**
   * Returns the value of the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Uid</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Uid</em>' attribute.
   * @see #setUid(String)
   * @see domain.DomainPackage#getRecipe_Uid()
   * @model id="true"
   * @generated
   */
  String getUid();

  /**
   * Sets the value of the '{@link domain.Recipe#getUid <em>Uid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Uid</em>' attribute.
   * @see #getUid()
   * @generated
   */
  void setUid(String value);

  /**
   * Returns the value of the '<em><b>Parent</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link domain.Recipes#getRecipe <em>Recipe</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parent</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parent</em>' container reference.
   * @see #setParent(Recipes)
   * @see domain.DomainPackage#getRecipe_Parent()
   * @see domain.Recipes#getRecipe
   * @model opposite="recipe" transient="false"
   * @generated
   */
  Recipes getParent();

  /**
   * Sets the value of the '{@link domain.Recipe#getParent <em>Parent</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent</em>' container reference.
   * @see #getParent()
   * @generated
   */
  void setParent(Recipes value);

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
   * Returns the value of the '<em><b>Ingredients</b></em>' containment reference list.
   * The list contents are of type {@link domain.Ingredient}.
   * It is bidirectional and its opposite is '{@link domain.Ingredient#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ingredients</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ingredients</em>' containment reference list.
   * @see domain.DomainPackage#getRecipe_Ingredients()
   * @see domain.Ingredient#getParent
   * @model opposite="parent" containment="true"
   * @generated
   */
  EList<Ingredient> getIngredients();

  /**
   * Returns the value of the '<em><b>Infrastructures</b></em>' reference list.
   * The list contents are of type {@link domain.Infrastructure}.
   * It is bidirectional and its opposite is '{@link domain.Infrastructure#getRecipe <em>Recipe</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Infrastructures</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Infrastructures</em>' reference list.
   * @see domain.DomainPackage#getRecipe_Infrastructures()
   * @see domain.Infrastructure#getRecipe
   * @model opposite="recipe"
   *        annotation="gmf.link target.decoration='arrow' style='dash'"
   * @generated
   */
  EList<Infrastructure> getInfrastructures();

} // Recipe
