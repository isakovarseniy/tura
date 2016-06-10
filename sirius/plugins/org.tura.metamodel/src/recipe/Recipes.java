/**
 */
package recipe;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recipes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link recipe.Recipes#getUid <em>Uid</em>}</li>
 *   <li>{@link recipe.Recipes#getRecipe <em>Recipe</em>}</li>
 *   <li>{@link recipe.Recipes#getConfigurations <em>Configurations</em>}</li>
 *   <li>{@link recipe.Recipes#getInfrastructures <em>Infrastructures</em>}</li>
 *   <li>{@link recipe.Recipes#getDeployment <em>Deployment</em>}</li>
 *   <li>{@link recipe.Recipes#getConfigExtension <em>Config Extension</em>}</li>
 * </ul>
 *
 * @see recipe.RecipePackage#getRecipes()
 * @model
 * @generated
 */
public interface Recipes extends EObject {
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
	 * @see recipe.RecipePackage#getRecipes_Uid()
	 * @model id="true"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link recipe.Recipes#getUid <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' attribute.
	 * @see #getUid()
	 * @generated
	 */
	void setUid(String value);

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

	/**
	 * Returns the value of the '<em><b>Configurations</b></em>' containment reference list.
	 * The list contents are of type {@link recipe.Configuration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configurations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configurations</em>' containment reference list.
	 * @see recipe.RecipePackage#getRecipes_Configurations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Configuration> getConfigurations();

	/**
	 * Returns the value of the '<em><b>Infrastructures</b></em>' containment reference list.
	 * The list contents are of type {@link recipe.Infrastructure}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Infrastructures</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Infrastructures</em>' containment reference list.
	 * @see recipe.RecipePackage#getRecipes_Infrastructures()
	 * @model containment="true"
	 * @generated
	 */
	EList<Infrastructure> getInfrastructures();

	/**
	 * Returns the value of the '<em><b>Deployment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deployment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployment</em>' containment reference.
	 * @see #setDeployment(DeploymentSequence)
	 * @see recipe.RecipePackage#getRecipes_Deployment()
	 * @model containment="true"
	 * @generated
	 */
	DeploymentSequence getDeployment();

	/**
	 * Sets the value of the '{@link recipe.Recipes#getDeployment <em>Deployment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deployment</em>' containment reference.
	 * @see #getDeployment()
	 * @generated
	 */
	void setDeployment(DeploymentSequence value);

	/**
	 * Returns the value of the '<em><b>Config Extension</b></em>' containment reference list.
	 * The list contents are of type {@link recipe.ConfigExtension}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Config Extension</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config Extension</em>' containment reference list.
	 * @see recipe.RecipePackage#getRecipes_ConfigExtension()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConfigExtension> getConfigExtension();

} // Recipes
