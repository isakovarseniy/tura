/**
 */
package recipe.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import recipe.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RecipeFactoryImpl extends EFactoryImpl implements RecipeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RecipeFactory init() {
		try {
			RecipeFactory theRecipeFactory = (RecipeFactory)EPackage.Registry.INSTANCE.getEFactory(RecipePackage.eNS_URI);
			if (theRecipeFactory != null) {
				return theRecipeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RecipeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecipeFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RecipePackage.RECIPES: return createRecipes();
			case RecipePackage.RECIPE: return createRecipe();
			case RecipePackage.CONFIG_EXTENSION: return createConfigExtension();
			case RecipePackage.RECIPE2_INFRASTRUCTURE: return createRecipe2Infrastructure();
			case RecipePackage.INFRASTRUCTURE2_CONFIGURATION: return createInfrastructure2Configuration();
			case RecipePackage.DEPLOYMENT_SEQUENCE: return createDeploymentSequence();
			case RecipePackage.DEPLOYMENT_COMPONENTS: return createDeploymentComponents();
			case RecipePackage.DEPLOYMENT_COMPONENT: return createDeploymentComponent();
			case RecipePackage.DEPLOYMENT_STAR_STEP: return createDeploymentStarStep();
			case RecipePackage.USING_MAPPERS: return createUsingMappers();
			case RecipePackage.INGREDIENT: return createIngredient();
			case RecipePackage.COMPONENT: return createComponent();
			case RecipePackage.JAVA_COMPONENT: return createJavaComponent();
			case RecipePackage.INFRASTRUCTURE: return createInfrastructure();
			case RecipePackage.CONFIGURATION: return createConfiguration();
			case RecipePackage.MODEL_MAPPER: return createModelMapper();
			case RecipePackage.PROPERTY: return createProperty();
			case RecipePackage.HASH_PROPERTY: return createHashProperty();
			case RecipePackage.KEY_VALUE_PAIR: return createKeyValuePair();
			case RecipePackage.MAPPING_TECNOLOGIY: return createMappingTecnologiy();
			case RecipePackage.QUERY: return createQuery();
			case RecipePackage.QUERY_VARIABLE: return createQueryVariable();
			case RecipePackage.ARTIFACT_REF: return createArtifactRef();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case RecipePackage.PLATFORM_LAYERS:
				return createPlatformLayersFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case RecipePackage.PLATFORM_LAYERS:
				return convertPlatformLayersToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Recipes createRecipes() {
		RecipesImpl recipes = new RecipesImpl();
		return recipes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Recipe createRecipe() {
		RecipeImpl recipe = new RecipeImpl();
		return recipe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigExtension createConfigExtension() {
		ConfigExtensionImpl configExtension = new ConfigExtensionImpl();
		return configExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Recipe2Infrastructure createRecipe2Infrastructure() {
		Recipe2InfrastructureImpl recipe2Infrastructure = new Recipe2InfrastructureImpl();
		return recipe2Infrastructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Infrastructure2Configuration createInfrastructure2Configuration() {
		Infrastructure2ConfigurationImpl infrastructure2Configuration = new Infrastructure2ConfigurationImpl();
		return infrastructure2Configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentSequence createDeploymentSequence() {
		DeploymentSequenceImpl deploymentSequence = new DeploymentSequenceImpl();
		return deploymentSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentComponents createDeploymentComponents() {
		DeploymentComponentsImpl deploymentComponents = new DeploymentComponentsImpl();
		return deploymentComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentComponent createDeploymentComponent() {
		DeploymentComponentImpl deploymentComponent = new DeploymentComponentImpl();
		return deploymentComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentStarStep createDeploymentStarStep() {
		DeploymentStarStepImpl deploymentStarStep = new DeploymentStarStepImpl();
		return deploymentStarStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsingMappers createUsingMappers() {
		UsingMappersImpl usingMappers = new UsingMappersImpl();
		return usingMappers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ingredient createIngredient() {
		IngredientImpl ingredient = new IngredientImpl();
		return ingredient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component createComponent() {
		ComponentImpl component = new ComponentImpl();
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaComponent createJavaComponent() {
		JavaComponentImpl javaComponent = new JavaComponentImpl();
		return javaComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Infrastructure createInfrastructure() {
		InfrastructureImpl infrastructure = new InfrastructureImpl();
		return infrastructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration createConfiguration() {
		ConfigurationImpl configuration = new ConfigurationImpl();
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelMapper createModelMapper() {
		ModelMapperImpl modelMapper = new ModelMapperImpl();
		return modelMapper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HashProperty createHashProperty() {
		HashPropertyImpl hashProperty = new HashPropertyImpl();
		return hashProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyValuePair createKeyValuePair() {
		KeyValuePairImpl keyValuePair = new KeyValuePairImpl();
		return keyValuePair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingTecnologiy createMappingTecnologiy() {
		MappingTecnologiyImpl mappingTecnologiy = new MappingTecnologiyImpl();
		return mappingTecnologiy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Query createQuery() {
		QueryImpl query = new QueryImpl();
		return query;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryVariable createQueryVariable() {
		QueryVariableImpl queryVariable = new QueryVariableImpl();
		return queryVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactRef createArtifactRef() {
		ArtifactRefImpl artifactRef = new ArtifactRefImpl();
		return artifactRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatformLayers createPlatformLayersFromString(EDataType eDataType, String initialValue) {
		PlatformLayers result = PlatformLayers.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPlatformLayersToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecipePackage getRecipePackage() {
		return (RecipePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RecipePackage getPackage() {
		return RecipePackage.eINSTANCE;
	}

} //RecipeFactoryImpl
