/**
 */
package domain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application Recipe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.ApplicationRecipe#getName <em>Name</em>}</li>
 *   <li>{@link domain.ApplicationRecipe#getRecipes <em>Recipes</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getApplicationRecipe()
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
   * @see domain.DomainPackage#getApplicationRecipe_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link domain.ApplicationRecipe#getName <em>Name</em>}' attribute.
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
   * @see #setRecipes(Recipes)
   * @see domain.DomainPackage#getApplicationRecipe_Recipes()
   * @model
   * @generated
   */
  Recipes getRecipes();

  /**
   * Sets the value of the '{@link domain.ApplicationRecipe#getRecipes <em>Recipes</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Recipes</em>' reference.
   * @see #getRecipes()
   * @generated
   */
  void setRecipes(Recipes value);

} // ApplicationRecipe
