/**
 */
package tura.recipe;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recipe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tura.recipe.Recipe#getUid <em>Uid</em>}</li>
 *   <li>{@link tura.recipe.Recipe#getName <em>Name</em>}</li>
 *   <li>{@link tura.recipe.Recipe#getIngredients <em>Ingredients</em>}</li>
 *   <li>{@link tura.recipe.Recipe#getInfrastructures <em>Infrastructures</em>}</li>
 *   <li>{@link tura.recipe.Recipe#getDeployment <em>Deployment</em>}</li>
 * </ul>
 *
 * @see tura.recipe.RecipePackage#getRecipe()
 * @model
 * @generated
 */
public interface Recipe extends UsingMappers {
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
	 * @see tura.recipe.RecipePackage#getRecipe_Uid()
	 * @model id="true"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link tura.recipe.Recipe#getUid <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' attribute.
	 * @see #getUid()
	 * @generated
	 */
	void setUid(String value);

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
	 * @see tura.recipe.RecipePackage#getRecipe_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tura.recipe.Recipe#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Ingredients</b></em>' containment reference list.
	 * The list contents are of type {@link tura.recipe.Ingredient}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ingredients</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ingredients</em>' containment reference list.
	 * @see tura.recipe.RecipePackage#getRecipe_Ingredients()
	 * @model containment="true"
	 * @generated
	 */
	EList<Ingredient> getIngredients();

	/**
	 * Returns the value of the '<em><b>Infrastructures</b></em>' reference list.
	 * The list contents are of type {@link tura.recipe.Infrastructure}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Infrastructures</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Infrastructures</em>' reference list.
	 * @see tura.recipe.RecipePackage#getRecipe_Infrastructures()
	 * @model
	 * @generated
	 */
	EList<Infrastructure> getInfrastructures();

	/**
	 * Returns the value of the '<em><b>Deployment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deployment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployment</em>' reference.
	 * @see #setDeployment(DeploymentSequence)
	 * @see tura.recipe.RecipePackage#getRecipe_Deployment()
	 * @model
	 * @generated
	 */
	DeploymentSequence getDeployment();

	/**
	 * Sets the value of the '{@link tura.recipe.Recipe#getDeployment <em>Deployment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deployment</em>' reference.
	 * @see #getDeployment()
	 * @generated
	 */
	void setDeployment(DeploymentSequence value);

} // Recipe
