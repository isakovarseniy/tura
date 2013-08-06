/**
 */
package domain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application Recipes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.ApplicationRecipes#getName <em>Name</em>}</li>
 *   <li>{@link domain.ApplicationRecipes#getRecipes <em>Recipes</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getApplicationRecipes()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface ApplicationRecipes extends EObject
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
   * @see domain.DomainPackage#getApplicationRecipes_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link domain.ApplicationRecipes#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Recipes</b></em>' containment reference list.
   * The list contents are of type {@link domain.ApplicationRecipe}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Recipes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Recipes</em>' containment reference list.
   * @see domain.DomainPackage#getApplicationRecipes_Recipes()
   * @model containment="true"
   * @generated
   */
  EList<ApplicationRecipe> getRecipes();

} // ApplicationRecipes