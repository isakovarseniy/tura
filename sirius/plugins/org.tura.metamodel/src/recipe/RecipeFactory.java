/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see recipe.RecipePackage
 * @generated
 */
public interface RecipeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RecipeFactory eINSTANCE = recipe.impl.RecipeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Recipes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Recipes</em>'.
	 * @generated
	 */
	Recipes createRecipes();

	/**
	 * Returns a new object of class '<em>Recipe</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Recipe</em>'.
	 * @generated
	 */
	Recipe createRecipe();

	/**
	 * Returns a new object of class '<em>Config Extension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Config Extension</em>'.
	 * @generated
	 */
	ConfigExtension createConfigExtension();

	/**
	 * Returns a new object of class '<em>Recipe2 Infrastructure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Recipe2 Infrastructure</em>'.
	 * @generated
	 */
	Recipe2Infrastructure createRecipe2Infrastructure();

	/**
	 * Returns a new object of class '<em>Infrastructure2 Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Infrastructure2 Configuration</em>'.
	 * @generated
	 */
	Infrastructure2Configuration createInfrastructure2Configuration();

	/**
	 * Returns a new object of class '<em>Deployment Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deployment Component</em>'.
	 * @generated
	 */
	DeploymentComponent createDeploymentComponent();

	/**
	 * Returns a new object of class '<em>Deployment Star Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deployment Star Step</em>'.
	 * @generated
	 */
	DeploymentStarStep createDeploymentStarStep();

	/**
	 * Returns a new object of class '<em>Using Mappers</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Using Mappers</em>'.
	 * @generated
	 */
	UsingMappers createUsingMappers();

	/**
	 * Returns a new object of class '<em>Ingredient</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ingredient</em>'.
	 * @generated
	 */
	Ingredient createIngredient();

	/**
	 * Returns a new object of class '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component</em>'.
	 * @generated
	 */
	Component createComponent();

	/**
	 * Returns a new object of class '<em>Java Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Java Component</em>'.
	 * @generated
	 */
	JavaComponent createJavaComponent();

	/**
	 * Returns a new object of class '<em>Java Script Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Java Script Component</em>'.
	 * @generated
	 */
	JavaScriptComponent createJavaScriptComponent();

	/**
	 * Returns a new object of class '<em>Infrastructure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Infrastructure</em>'.
	 * @generated
	 */
	Infrastructure createInfrastructure();

	/**
	 * Returns a new object of class '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Configuration</em>'.
	 * @generated
	 */
	Configuration createConfiguration();

	/**
	 * Returns a new object of class '<em>Model Mapper</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Mapper</em>'.
	 * @generated
	 */
	ModelMapper createModelMapper();

	/**
	 * Returns a new object of class '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property</em>'.
	 * @generated
	 */
	Property createProperty();

	/**
	 * Returns a new object of class '<em>Hash Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hash Property</em>'.
	 * @generated
	 */
	HashProperty createHashProperty();

	/**
	 * Returns a new object of class '<em>Key Value Pair</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Key Value Pair</em>'.
	 * @generated
	 */
	KeyValuePair createKeyValuePair();

	/**
	 * Returns a new object of class '<em>Mapping Tecnologiy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mapping Tecnologiy</em>'.
	 * @generated
	 */
	MappingTecnologiy createMappingTecnologiy();

	/**
	 * Returns a new object of class '<em>Query</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Query</em>'.
	 * @generated
	 */
	Query createQuery();

	/**
	 * Returns a new object of class '<em>Query Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Query Variable</em>'.
	 * @generated
	 */
	QueryVariable createQueryVariable();

	/**
	 * Returns a new object of class '<em>Artifact Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Artifact Ref</em>'.
	 * @generated
	 */
	ArtifactRef createArtifactRef();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RecipePackage getRecipePackage();

} //RecipeFactory
