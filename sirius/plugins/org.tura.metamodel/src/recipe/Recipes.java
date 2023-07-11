/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

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
 *   <li>{@link recipe.Recipes#getName <em>Name</em>}</li>
 *   <li>{@link recipe.Recipes#getRecipe <em>Recipe</em>}</li>
 *   <li>{@link recipe.Recipes#getConfigurations <em>Configurations</em>}</li>
 *   <li>{@link recipe.Recipes#getInfrastructures <em>Infrastructures</em>}</li>
 *   <li>{@link recipe.Recipes#getConfigExtensions <em>Config Extensions</em>}</li>
 *   <li>{@link recipe.Recipes#getRecipe2Infrastructures <em>Recipe2 Infrastructures</em>}</li>
 *   <li>{@link recipe.Recipes#getInfrastructure2Configurations <em>Infrastructure2 Configurations</em>}</li>
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
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see recipe.RecipePackage#getRecipes_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link recipe.Recipes#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * Returns the value of the '<em><b>Config Extensions</b></em>' containment reference list.
	 * The list contents are of type {@link recipe.ConfigExtension}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Config Extensions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config Extensions</em>' containment reference list.
	 * @see recipe.RecipePackage#getRecipes_ConfigExtensions()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConfigExtension> getConfigExtensions();

	/**
	 * Returns the value of the '<em><b>Recipe2 Infrastructures</b></em>' containment reference list.
	 * The list contents are of type {@link recipe.Recipe2Infrastructure}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recipe2 Infrastructures</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recipe2 Infrastructures</em>' containment reference list.
	 * @see recipe.RecipePackage#getRecipes_Recipe2Infrastructures()
	 * @model containment="true"
	 * @generated
	 */
	EList<Recipe2Infrastructure> getRecipe2Infrastructures();

	/**
	 * Returns the value of the '<em><b>Infrastructure2 Configurations</b></em>' containment reference list.
	 * The list contents are of type {@link recipe.Infrastructure2Configuration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Infrastructure2 Configurations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Infrastructure2 Configurations</em>' containment reference list.
	 * @see recipe.RecipePackage#getRecipes_Infrastructure2Configurations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Infrastructure2Configuration> getInfrastructure2Configurations();

} // Recipes
