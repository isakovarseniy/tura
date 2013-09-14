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
 *   <li>{@link domain.Recipes#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.Recipes#getRecipe <em>Recipe</em>}</li>
 *   <li>{@link domain.Recipes#getConfigurations <em>Configurations</em>}</li>
 *   <li>{@link domain.Recipes#getInfrastructures <em>Infrastructures</em>}</li>
 *   <li>{@link domain.Recipes#getParent <em>Parent</em>}</li>
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
   * Returns the value of the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Uid</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Uid</em>' attribute.
   * @see #setUid(String)
   * @see domain.DomainPackage#getRecipes_Uid()
   * @model id="true"
   * @generated
   */
  String getUid();

  /**
   * Sets the value of the '{@link domain.Recipes#getUid <em>Uid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Uid</em>' attribute.
   * @see #getUid()
   * @generated
   */
  void setUid(String value);

  /**
   * Returns the value of the '<em><b>Recipe</b></em>' containment reference.
   * It is bidirectional and its opposite is '{@link domain.Recipe#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Recipe</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Recipe</em>' containment reference.
   * @see #setRecipe(Recipe)
   * @see domain.DomainPackage#getRecipes_Recipe()
   * @see domain.Recipe#getParent
   * @model opposite="parent" containment="true"
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

  /**
   * Returns the value of the '<em><b>Infrastructures</b></em>' containment reference list.
   * The list contents are of type {@link domain.Infrastructure}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Infrastructures</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Infrastructures</em>' containment reference list.
   * @see domain.DomainPackage#getRecipes_Infrastructures()
   * @model containment="true"
   * @generated
   */
  EList<Infrastructure> getInfrastructures();

  /**
   * Returns the value of the '<em><b>Parent</b></em>' reference.
   * It is bidirectional and its opposite is '{@link domain.ApplicationRecipe#getRecipes <em>Recipes</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parent</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parent</em>' reference.
   * @see #setParent(ApplicationRecipe)
   * @see domain.DomainPackage#getRecipes_Parent()
   * @see domain.ApplicationRecipe#getRecipes
   * @model opposite="recipes"
   * @generated
   */
  ApplicationRecipe getParent();

  /**
   * Sets the value of the '{@link domain.Recipes#getParent <em>Parent</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent</em>' reference.
   * @see #getParent()
   * @generated
   */
  void setParent(ApplicationRecipe value);

} // Recipes
