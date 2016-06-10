/**
 */
package recipe;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Infrastructure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link recipe.Infrastructure#getUid <em>Uid</em>}</li>
 *   <li>{@link recipe.Infrastructure#getRecipe <em>Recipe</em>}</li>
 *   <li>{@link recipe.Infrastructure#getName <em>Name</em>}</li>
 *   <li>{@link recipe.Infrastructure#getRecipeConfig <em>Recipe Config</em>}</li>
 * </ul>
 *
 * @see recipe.RecipePackage#getInfrastructure()
 * @model
 * @generated
 */
public interface Infrastructure extends EObject {
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
	 * @see recipe.RecipePackage#getInfrastructure_Uid()
	 * @model id="true"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link recipe.Infrastructure#getUid <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' attribute.
	 * @see #getUid()
	 * @generated
	 */
	void setUid(String value);

	/**
	 * Returns the value of the '<em><b>Recipe</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recipe</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recipe</em>' reference.
	 * @see #setRecipe(Recipe)
	 * @see recipe.RecipePackage#getInfrastructure_Recipe()
	 * @model
	 * @generated
	 */
	Recipe getRecipe();

	/**
	 * Sets the value of the '{@link recipe.Infrastructure#getRecipe <em>Recipe</em>}' reference.
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
	 * @see recipe.RecipePackage#getInfrastructure_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link recipe.Infrastructure#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see recipe.RecipePackage#getInfrastructure_RecipeConfig()
	 * @model
	 * @generated
	 */
	Configuration getRecipeConfig();

	/**
	 * Sets the value of the '{@link recipe.Infrastructure#getRecipeConfig <em>Recipe Config</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recipe Config</em>' reference.
	 * @see #getRecipeConfig()
	 * @generated
	 */
	void setRecipeConfig(Configuration value);

} // Infrastructure
