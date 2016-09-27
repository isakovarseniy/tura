/**
 */
package recipe.util;

import common.HTMLLayerHolder;
import common.Orderable;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import recipe.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see recipe.RecipePackage
 * @generated
 */
public class RecipeAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RecipePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecipeAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RecipePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecipeSwitch<Adapter> modelSwitch =
		new RecipeSwitch<Adapter>() {
			@Override
			public Adapter caseRecipes(Recipes object) {
				return createRecipesAdapter();
			}
			@Override
			public Adapter caseRecipe(Recipe object) {
				return createRecipeAdapter();
			}
			@Override
			public Adapter caseConfigExtension(ConfigExtension object) {
				return createConfigExtensionAdapter();
			}
			@Override
			public Adapter caseRecipe2Infrastructure(Recipe2Infrastructure object) {
				return createRecipe2InfrastructureAdapter();
			}
			@Override
			public Adapter caseInfrastructure2Configuration(Infrastructure2Configuration object) {
				return createInfrastructure2ConfigurationAdapter();
			}
			@Override
			public Adapter caseDeploymentComponent(DeploymentComponent object) {
				return createDeploymentComponentAdapter();
			}
			@Override
			public Adapter caseDeploymentStarStep(DeploymentStarStep object) {
				return createDeploymentStarStepAdapter();
			}
			@Override
			public Adapter caseUsingMappers(UsingMappers object) {
				return createUsingMappersAdapter();
			}
			@Override
			public Adapter caseIngredient(Ingredient object) {
				return createIngredientAdapter();
			}
			@Override
			public Adapter caseComponent(Component object) {
				return createComponentAdapter();
			}
			@Override
			public Adapter caseJavaComponent(JavaComponent object) {
				return createJavaComponentAdapter();
			}
			@Override
			public Adapter caseInfrastructure(Infrastructure object) {
				return createInfrastructureAdapter();
			}
			@Override
			public Adapter caseConfiguration(Configuration object) {
				return createConfigurationAdapter();
			}
			@Override
			public Adapter caseModelMapper(ModelMapper object) {
				return createModelMapperAdapter();
			}
			@Override
			public Adapter caseProperty(Property object) {
				return createPropertyAdapter();
			}
			@Override
			public Adapter caseHashProperty(HashProperty object) {
				return createHashPropertyAdapter();
			}
			@Override
			public Adapter caseKeyValuePair(KeyValuePair object) {
				return createKeyValuePairAdapter();
			}
			@Override
			public Adapter caseMappingTecnologiy(MappingTecnologiy object) {
				return createMappingTecnologiyAdapter();
			}
			@Override
			public Adapter caseQuery(Query object) {
				return createQueryAdapter();
			}
			@Override
			public Adapter caseQueryVariable(QueryVariable object) {
				return createQueryVariableAdapter();
			}
			@Override
			public Adapter caseArtifactRef(ArtifactRef object) {
				return createArtifactRefAdapter();
			}
			@Override
			public Adapter caseHTMLLayerHolder(HTMLLayerHolder object) {
				return createHTMLLayerHolderAdapter();
			}
			@Override
			public Adapter caseOrderable(Orderable object) {
				return createOrderableAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link recipe.Recipes <em>Recipes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see recipe.Recipes
	 * @generated
	 */
	public Adapter createRecipesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link recipe.Recipe <em>Recipe</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see recipe.Recipe
	 * @generated
	 */
	public Adapter createRecipeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link recipe.ConfigExtension <em>Config Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see recipe.ConfigExtension
	 * @generated
	 */
	public Adapter createConfigExtensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link recipe.Recipe2Infrastructure <em>Recipe2 Infrastructure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see recipe.Recipe2Infrastructure
	 * @generated
	 */
	public Adapter createRecipe2InfrastructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link recipe.Infrastructure2Configuration <em>Infrastructure2 Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see recipe.Infrastructure2Configuration
	 * @generated
	 */
	public Adapter createInfrastructure2ConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link recipe.DeploymentComponent <em>Deployment Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see recipe.DeploymentComponent
	 * @generated
	 */
	public Adapter createDeploymentComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link recipe.DeploymentStarStep <em>Deployment Star Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see recipe.DeploymentStarStep
	 * @generated
	 */
	public Adapter createDeploymentStarStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link recipe.UsingMappers <em>Using Mappers</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see recipe.UsingMappers
	 * @generated
	 */
	public Adapter createUsingMappersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link recipe.Ingredient <em>Ingredient</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see recipe.Ingredient
	 * @generated
	 */
	public Adapter createIngredientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link recipe.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see recipe.Component
	 * @generated
	 */
	public Adapter createComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link recipe.JavaComponent <em>Java Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see recipe.JavaComponent
	 * @generated
	 */
	public Adapter createJavaComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link recipe.Infrastructure <em>Infrastructure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see recipe.Infrastructure
	 * @generated
	 */
	public Adapter createInfrastructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link recipe.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see recipe.Configuration
	 * @generated
	 */
	public Adapter createConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link recipe.ModelMapper <em>Model Mapper</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see recipe.ModelMapper
	 * @generated
	 */
	public Adapter createModelMapperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link recipe.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see recipe.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link recipe.HashProperty <em>Hash Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see recipe.HashProperty
	 * @generated
	 */
	public Adapter createHashPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link recipe.KeyValuePair <em>Key Value Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see recipe.KeyValuePair
	 * @generated
	 */
	public Adapter createKeyValuePairAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link recipe.MappingTecnologiy <em>Mapping Tecnologiy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see recipe.MappingTecnologiy
	 * @generated
	 */
	public Adapter createMappingTecnologiyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link recipe.Query <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see recipe.Query
	 * @generated
	 */
	public Adapter createQueryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link recipe.QueryVariable <em>Query Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see recipe.QueryVariable
	 * @generated
	 */
	public Adapter createQueryVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link recipe.ArtifactRef <em>Artifact Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see recipe.ArtifactRef
	 * @generated
	 */
	public Adapter createArtifactRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link common.HTMLLayerHolder <em>HTML Layer Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see common.HTMLLayerHolder
	 * @generated
	 */
	public Adapter createHTMLLayerHolderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link common.Orderable <em>Orderable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see common.Orderable
	 * @generated
	 */
	public Adapter createOrderableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //RecipeAdapterFactory
