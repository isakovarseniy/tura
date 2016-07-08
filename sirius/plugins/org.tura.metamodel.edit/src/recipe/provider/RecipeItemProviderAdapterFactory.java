/**
 */
package recipe.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import recipe.util.RecipeAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RecipeItemProviderAdapterFactory extends RecipeAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecipeItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link recipe.Recipes} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecipesItemProvider recipesItemProvider;

	/**
	 * This creates an adapter for a {@link recipe.Recipes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRecipesAdapter() {
		if (recipesItemProvider == null) {
			recipesItemProvider = new RecipesItemProvider(this);
		}

		return recipesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link recipe.Recipe} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecipeItemProvider recipeItemProvider;

	/**
	 * This creates an adapter for a {@link recipe.Recipe}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRecipeAdapter() {
		if (recipeItemProvider == null) {
			recipeItemProvider = new RecipeItemProvider(this);
		}

		return recipeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link recipe.ConfigExtension} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigExtensionItemProvider configExtensionItemProvider;

	/**
	 * This creates an adapter for a {@link recipe.ConfigExtension}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConfigExtensionAdapter() {
		if (configExtensionItemProvider == null) {
			configExtensionItemProvider = new ConfigExtensionItemProvider(this);
		}

		return configExtensionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link recipe.Recipe2Infrastructure} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Recipe2InfrastructureItemProvider recipe2InfrastructureItemProvider;

	/**
	 * This creates an adapter for a {@link recipe.Recipe2Infrastructure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRecipe2InfrastructureAdapter() {
		if (recipe2InfrastructureItemProvider == null) {
			recipe2InfrastructureItemProvider = new Recipe2InfrastructureItemProvider(this);
		}

		return recipe2InfrastructureItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link recipe.Infrastructure2Configuration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Infrastructure2ConfigurationItemProvider infrastructure2ConfigurationItemProvider;

	/**
	 * This creates an adapter for a {@link recipe.Infrastructure2Configuration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInfrastructure2ConfigurationAdapter() {
		if (infrastructure2ConfigurationItemProvider == null) {
			infrastructure2ConfigurationItemProvider = new Infrastructure2ConfigurationItemProvider(this);
		}

		return infrastructure2ConfigurationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link recipe.DeploymentSequence} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeploymentSequenceItemProvider deploymentSequenceItemProvider;

	/**
	 * This creates an adapter for a {@link recipe.DeploymentSequence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDeploymentSequenceAdapter() {
		if (deploymentSequenceItemProvider == null) {
			deploymentSequenceItemProvider = new DeploymentSequenceItemProvider(this);
		}

		return deploymentSequenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link recipe.DeploymentComponents} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeploymentComponentsItemProvider deploymentComponentsItemProvider;

	/**
	 * This creates an adapter for a {@link recipe.DeploymentComponents}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDeploymentComponentsAdapter() {
		if (deploymentComponentsItemProvider == null) {
			deploymentComponentsItemProvider = new DeploymentComponentsItemProvider(this);
		}

		return deploymentComponentsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link recipe.DeploymentComponent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeploymentComponentItemProvider deploymentComponentItemProvider;

	/**
	 * This creates an adapter for a {@link recipe.DeploymentComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDeploymentComponentAdapter() {
		if (deploymentComponentItemProvider == null) {
			deploymentComponentItemProvider = new DeploymentComponentItemProvider(this);
		}

		return deploymentComponentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link recipe.DeploymentStarStep} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeploymentStarStepItemProvider deploymentStarStepItemProvider;

	/**
	 * This creates an adapter for a {@link recipe.DeploymentStarStep}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDeploymentStarStepAdapter() {
		if (deploymentStarStepItemProvider == null) {
			deploymentStarStepItemProvider = new DeploymentStarStepItemProvider(this);
		}

		return deploymentStarStepItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link recipe.UsingMappers} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsingMappersItemProvider usingMappersItemProvider;

	/**
	 * This creates an adapter for a {@link recipe.UsingMappers}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUsingMappersAdapter() {
		if (usingMappersItemProvider == null) {
			usingMappersItemProvider = new UsingMappersItemProvider(this);
		}

		return usingMappersItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link recipe.Ingredient} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IngredientItemProvider ingredientItemProvider;

	/**
	 * This creates an adapter for a {@link recipe.Ingredient}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIngredientAdapter() {
		if (ingredientItemProvider == null) {
			ingredientItemProvider = new IngredientItemProvider(this);
		}

		return ingredientItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link recipe.Component} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentItemProvider componentItemProvider;

	/**
	 * This creates an adapter for a {@link recipe.Component}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComponentAdapter() {
		if (componentItemProvider == null) {
			componentItemProvider = new ComponentItemProvider(this);
		}

		return componentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link recipe.JavaComponent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaComponentItemProvider javaComponentItemProvider;

	/**
	 * This creates an adapter for a {@link recipe.JavaComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createJavaComponentAdapter() {
		if (javaComponentItemProvider == null) {
			javaComponentItemProvider = new JavaComponentItemProvider(this);
		}

		return javaComponentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link recipe.Infrastructure} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfrastructureItemProvider infrastructureItemProvider;

	/**
	 * This creates an adapter for a {@link recipe.Infrastructure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInfrastructureAdapter() {
		if (infrastructureItemProvider == null) {
			infrastructureItemProvider = new InfrastructureItemProvider(this);
		}

		return infrastructureItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link recipe.Configuration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationItemProvider configurationItemProvider;

	/**
	 * This creates an adapter for a {@link recipe.Configuration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConfigurationAdapter() {
		if (configurationItemProvider == null) {
			configurationItemProvider = new ConfigurationItemProvider(this);
		}

		return configurationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link recipe.ModelMapper} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelMapperItemProvider modelMapperItemProvider;

	/**
	 * This creates an adapter for a {@link recipe.ModelMapper}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModelMapperAdapter() {
		if (modelMapperItemProvider == null) {
			modelMapperItemProvider = new ModelMapperItemProvider(this);
		}

		return modelMapperItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link recipe.Property} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyItemProvider propertyItemProvider;

	/**
	 * This creates an adapter for a {@link recipe.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPropertyAdapter() {
		if (propertyItemProvider == null) {
			propertyItemProvider = new PropertyItemProvider(this);
		}

		return propertyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link recipe.HashProperty} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HashPropertyItemProvider hashPropertyItemProvider;

	/**
	 * This creates an adapter for a {@link recipe.HashProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHashPropertyAdapter() {
		if (hashPropertyItemProvider == null) {
			hashPropertyItemProvider = new HashPropertyItemProvider(this);
		}

		return hashPropertyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link recipe.KeyValuePair} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KeyValuePairItemProvider keyValuePairItemProvider;

	/**
	 * This creates an adapter for a {@link recipe.KeyValuePair}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createKeyValuePairAdapter() {
		if (keyValuePairItemProvider == null) {
			keyValuePairItemProvider = new KeyValuePairItemProvider(this);
		}

		return keyValuePairItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link recipe.MappingSpecifier} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappingSpecifierItemProvider mappingSpecifierItemProvider;

	/**
	 * This creates an adapter for a {@link recipe.MappingSpecifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMappingSpecifierAdapter() {
		if (mappingSpecifierItemProvider == null) {
			mappingSpecifierItemProvider = new MappingSpecifierItemProvider(this);
		}

		return mappingSpecifierItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link recipe.Query} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueryItemProvider queryItemProvider;

	/**
	 * This creates an adapter for a {@link recipe.Query}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createQueryAdapter() {
		if (queryItemProvider == null) {
			queryItemProvider = new QueryItemProvider(this);
		}

		return queryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link recipe.QueryVariable} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueryVariableItemProvider queryVariableItemProvider;

	/**
	 * This creates an adapter for a {@link recipe.QueryVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createQueryVariableAdapter() {
		if (queryVariableItemProvider == null) {
			queryVariableItemProvider = new QueryVariableItemProvider(this);
		}

		return queryVariableItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link recipe.ArtifactRef} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArtifactRefItemProvider artifactRefItemProvider;

	/**
	 * This creates an adapter for a {@link recipe.ArtifactRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createArtifactRefAdapter() {
		if (artifactRefItemProvider == null) {
			artifactRefItemProvider = new ArtifactRefItemProvider(this);
		}

		return artifactRefItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

}
