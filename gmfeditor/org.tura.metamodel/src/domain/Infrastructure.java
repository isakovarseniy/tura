/**
 */
package domain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Infrastructure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.Infrastructure#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.Infrastructure#getRecipe <em>Recipe</em>}</li>
 *   <li>{@link domain.Infrastructure#getName <em>Name</em>}</li>
 *   <li>{@link domain.Infrastructure#getRecipeConfig <em>Recipe Config</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getInfrastructure()
 * @model annotation="gmf.node label='name' border.color='0,0,0' color='255,239,222'"
 * @generated
 */
public interface Infrastructure extends EObject
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
	 * @see domain.DomainPackage#getInfrastructure_Uid()
	 * @model id="true"
	 * @generated
	 */
  String getUid();

  /**
	 * Sets the value of the '{@link domain.Infrastructure#getUid <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' attribute.
	 * @see #getUid()
	 * @generated
	 */
  void setUid(String value);

  /**
	 * Returns the value of the '<em><b>Recipe</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link domain.Recipe#getInfrastructures <em>Infrastructures</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Recipe</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Recipe</em>' reference.
	 * @see #setRecipe(Recipe)
	 * @see domain.DomainPackage#getInfrastructure_Recipe()
	 * @see domain.Recipe#getInfrastructures
	 * @model opposite="infrastructures"
	 * @generated
	 */
  Recipe getRecipe();

  /**
	 * Sets the value of the '{@link domain.Infrastructure#getRecipe <em>Recipe</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recipe</em>' reference.
	 * @see #getRecipe()
	 * @generated
	 */
  void setRecipe(Recipe value);

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
	 * @see domain.DomainPackage#getInfrastructure_Name()
	 * @model
	 * @generated
	 */
  String getName();

  /**
	 * Sets the value of the '{@link domain.Infrastructure#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
  void setName(String value);

  /**
	 * Returns the value of the '<em><b>Recipe Config</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link domain.Configuration#getInfrastructure <em>Infrastructure</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Recipe Config</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Recipe Config</em>' reference.
	 * @see #setRecipeConfig(Configuration)
	 * @see domain.DomainPackage#getInfrastructure_RecipeConfig()
	 * @see domain.Configuration#getInfrastructure
	 * @model opposite="infrastructure"
	 *        annotation="gmf.link target.decoration='arrow' style='dash'"
	 * @generated
	 */
  Configuration getRecipeConfig();

  /**
	 * Sets the value of the '{@link domain.Infrastructure#getRecipeConfig <em>Recipe Config</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recipe Config</em>' reference.
	 * @see #getRecipeConfig()
	 * @generated
	 */
  void setRecipeConfig(Configuration value);

} // Infrastructure
