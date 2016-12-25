/**
 */
package recipe;

import common.CommonPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see recipe.RecipeFactory
 * @model kind="package"
 * @generated
 */
public interface RecipePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "recipe";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://tura.org/2016/v2/recipe";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tura.recipe";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RecipePackage eINSTANCE = recipe.impl.RecipePackageImpl.init();

	/**
	 * The meta object id for the '{@link recipe.impl.RecipesImpl <em>Recipes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see recipe.impl.RecipesImpl
	 * @see recipe.impl.RecipePackageImpl#getRecipes()
	 * @generated
	 */
	int RECIPES = 0;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPES__UID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPES__NAME = 1;

	/**
	 * The feature id for the '<em><b>Recipe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPES__RECIPE = 2;

	/**
	 * The feature id for the '<em><b>Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPES__CONFIGURATIONS = 3;

	/**
	 * The feature id for the '<em><b>Infrastructures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPES__INFRASTRUCTURES = 4;

	/**
	 * The feature id for the '<em><b>Config Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPES__CONFIG_EXTENSIONS = 5;

	/**
	 * The feature id for the '<em><b>Recipe2 Infrastructures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPES__RECIPE2_INFRASTRUCTURES = 6;

	/**
	 * The feature id for the '<em><b>Infrastructure2 Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPES__INFRASTRUCTURE2_CONFIGURATIONS = 7;

	/**
	 * The number of structural features of the '<em>Recipes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPES_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link recipe.impl.UsingMappersImpl <em>Using Mappers</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see recipe.impl.UsingMappersImpl
	 * @see recipe.impl.RecipePackageImpl#getUsingMappers()
	 * @generated
	 */
	int USING_MAPPERS = 7;

	/**
	 * The feature id for the '<em><b>Mappers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USING_MAPPERS__MAPPERS = 0;

	/**
	 * The number of structural features of the '<em>Using Mappers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USING_MAPPERS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link recipe.impl.RecipeImpl <em>Recipe</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see recipe.impl.RecipeImpl
	 * @see recipe.impl.RecipePackageImpl#getRecipe()
	 * @generated
	 */
	int RECIPE = 1;

	/**
	 * The feature id for the '<em><b>Mappers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPE__MAPPERS = USING_MAPPERS__MAPPERS;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPE__COLUMNS = USING_MAPPERS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPE__UID = USING_MAPPERS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPE__NAME = USING_MAPPERS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ingredients</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPE__INGREDIENTS = USING_MAPPERS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Deplyment Step</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPE__DEPLYMENT_STEP = USING_MAPPERS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Start Seq</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPE__START_SEQ = USING_MAPPERS_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Recipe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPE_FEATURE_COUNT = USING_MAPPERS_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link recipe.impl.ConfigExtensionImpl <em>Config Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see recipe.impl.ConfigExtensionImpl
	 * @see recipe.impl.RecipePackageImpl#getConfigExtension()
	 * @generated
	 */
	int CONFIG_EXTENSION = 2;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_EXTENSION__UID = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_EXTENSION__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_EXTENSION__TARGET = 2;

	/**
	 * The number of structural features of the '<em>Config Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_EXTENSION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link recipe.impl.Recipe2InfrastructureImpl <em>Recipe2 Infrastructure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see recipe.impl.Recipe2InfrastructureImpl
	 * @see recipe.impl.RecipePackageImpl#getRecipe2Infrastructure()
	 * @generated
	 */
	int RECIPE2_INFRASTRUCTURE = 3;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPE2_INFRASTRUCTURE__UID = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPE2_INFRASTRUCTURE__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPE2_INFRASTRUCTURE__TARGET = 2;

	/**
	 * The number of structural features of the '<em>Recipe2 Infrastructure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPE2_INFRASTRUCTURE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link recipe.impl.Infrastructure2ConfigurationImpl <em>Infrastructure2 Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see recipe.impl.Infrastructure2ConfigurationImpl
	 * @see recipe.impl.RecipePackageImpl#getInfrastructure2Configuration()
	 * @generated
	 */
	int INFRASTRUCTURE2_CONFIGURATION = 4;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE2_CONFIGURATION__UID = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE2_CONFIGURATION__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE2_CONFIGURATION__TARGET = 2;

	/**
	 * The number of structural features of the '<em>Infrastructure2 Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE2_CONFIGURATION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link recipe.impl.DeploymentComponentImpl <em>Deployment Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see recipe.impl.DeploymentComponentImpl
	 * @see recipe.impl.RecipePackageImpl#getDeploymentComponent()
	 * @generated
	 */
	int DEPLOYMENT_COMPONENT = 5;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_COMPONENT__UID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_COMPONENT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Mapper</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_COMPONENT__MAPPER = 2;

	/**
	 * The feature id for the '<em><b>Deployment Component Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_COMPONENT__DEPLOYMENT_COMPONENT_LINK = 3;

	/**
	 * The number of structural features of the '<em>Deployment Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_COMPONENT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link recipe.impl.DeploymentStarStepImpl <em>Deployment Star Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see recipe.impl.DeploymentStarStepImpl
	 * @see recipe.impl.RecipePackageImpl#getDeploymentStarStep()
	 * @generated
	 */
	int DEPLOYMENT_STAR_STEP = 6;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_STAR_STEP__UID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_STAR_STEP__NAME = 1;

	/**
	 * The feature id for the '<em><b>First Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_STAR_STEP__FIRST_STEP = 2;

	/**
	 * The number of structural features of the '<em>Deployment Star Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_STAR_STEP_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link recipe.impl.IngredientImpl <em>Ingredient</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see recipe.impl.IngredientImpl
	 * @see recipe.impl.RecipePackageImpl#getIngredient()
	 * @generated
	 */
	int INGREDIENT = 8;

	/**
	 * The feature id for the '<em><b>Mappers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGREDIENT__MAPPERS = USING_MAPPERS__MAPPERS;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGREDIENT__COLUMNS = USING_MAPPERS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGREDIENT__ORDER = USING_MAPPERS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGREDIENT__UID = USING_MAPPERS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGREDIENT__NAME = USING_MAPPERS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGREDIENT__COMPONENTS = USING_MAPPERS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Vew Layer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGREDIENT__VEW_LAYER = USING_MAPPERS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Model Layer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGREDIENT__MODEL_LAYER = USING_MAPPERS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Controller Layer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGREDIENT__CONTROLLER_LAYER = USING_MAPPERS_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Ingredient</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGREDIENT_FEATURE_COUNT = USING_MAPPERS_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link recipe.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see recipe.impl.ComponentImpl
	 * @see recipe.impl.RecipePackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 9;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__COLUMNS = CommonPackage.HTML_LAYER_HOLDER__COLUMNS;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ORDER = CommonPackage.HTML_LAYER_HOLDER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__UID = CommonPackage.HTML_LAYER_HOLDER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = CommonPackage.HTML_LAYER_HOLDER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Mappers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__MAPPERS = CommonPackage.HTML_LAYER_HOLDER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Component Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__COMPONENT_ROOT = CommonPackage.HTML_LAYER_HOLDER_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = CommonPackage.HTML_LAYER_HOLDER_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link recipe.impl.JavaComponentImpl <em>Java Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see recipe.impl.JavaComponentImpl
	 * @see recipe.impl.RecipePackageImpl#getJavaComponent()
	 * @generated
	 */
	int JAVA_COMPONENT = 10;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_COMPONENT__COLUMNS = COMPONENT__COLUMNS;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_COMPONENT__ORDER = COMPONENT__ORDER;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_COMPONENT__UID = COMPONENT__UID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_COMPONENT__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Mappers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_COMPONENT__MAPPERS = COMPONENT__MAPPERS;

	/**
	 * The feature id for the '<em><b>Component Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_COMPONENT__COMPONENT_ROOT = COMPONENT__COMPONENT_ROOT;

	/**
	 * The feature id for the '<em><b>Artifact Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_COMPONENT__ARTIFACT_ID = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_COMPONENT__GROUP_ID = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_COMPONENT__VERSION = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_COMPONENT__BASE_PACKAGE = COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Java Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_COMPONENT_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link recipe.impl.InfrastructureImpl <em>Infrastructure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see recipe.impl.InfrastructureImpl
	 * @see recipe.impl.RecipePackageImpl#getInfrastructure()
	 * @generated
	 */
	int INFRASTRUCTURE = 11;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE__UID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Infrastructure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link recipe.impl.ConfigurationImpl <em>Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see recipe.impl.ConfigurationImpl
	 * @see recipe.impl.RecipePackageImpl#getConfiguration()
	 * @generated
	 */
	int CONFIGURATION = 12;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__UID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__NAME = 1;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__PROPERTIES = 2;

	/**
	 * The feature id for the '<em><b>Hash Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__HASH_PROPERTIES = 3;

	/**
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link recipe.impl.ArtifactRefImpl <em>Artifact Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see recipe.impl.ArtifactRefImpl
	 * @see recipe.impl.RecipePackageImpl#getArtifactRef()
	 * @generated
	 */
	int ARTIFACT_REF = 20;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_REF__UID = 0;

	/**
	 * The feature id for the '<em><b>Artifact Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_REF__ARTIFACT_REF = 1;

	/**
	 * The number of structural features of the '<em>Artifact Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_REF_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link recipe.impl.ModelMapperImpl <em>Model Mapper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see recipe.impl.ModelMapperImpl
	 * @see recipe.impl.RecipePackageImpl#getModelMapper()
	 * @generated
	 */
	int MODEL_MAPPER = 13;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_MAPPER__UID = ARTIFACT_REF__UID;

	/**
	 * The feature id for the '<em><b>Artifact Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_MAPPER__ARTIFACT_REF = ARTIFACT_REF__ARTIFACT_REF;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_MAPPER__ORDER = ARTIFACT_REF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_MAPPER__NAME = ARTIFACT_REF_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Artifact Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_MAPPER__ARTIFACT_ROOT = ARTIFACT_REF_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Technologies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_MAPPER__TECHNOLOGIES = ARTIFACT_REF_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Queries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_MAPPER__QUERIES = ARTIFACT_REF_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Artifact Execution String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_MAPPER__ARTIFACT_EXECUTION_STRING = ARTIFACT_REF_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Model Mapper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_MAPPER_FEATURE_COUNT = ARTIFACT_REF_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link recipe.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see recipe.impl.PropertyImpl
	 * @see recipe.impl.RecipePackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 14;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__UID = 0;

	/**
	 * The feature id for the '<em><b>Conf Var Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__CONF_VAR_REF = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__VALUE = 2;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link recipe.impl.HashPropertyImpl <em>Hash Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see recipe.impl.HashPropertyImpl
	 * @see recipe.impl.RecipePackageImpl#getHashProperty()
	 * @generated
	 */
	int HASH_PROPERTY = 15;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASH_PROPERTY__UID = 0;

	/**
	 * The feature id for the '<em><b>Conf Hash Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASH_PROPERTY__CONF_HASH_REF = 1;

	/**
	 * The feature id for the '<em><b>Hash</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASH_PROPERTY__HASH = 2;

	/**
	 * The number of structural features of the '<em>Hash Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASH_PROPERTY_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link recipe.impl.KeyValuePairImpl <em>Key Value Pair</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see recipe.impl.KeyValuePairImpl
	 * @see recipe.impl.RecipePackageImpl#getKeyValuePair()
	 * @generated
	 */
	int KEY_VALUE_PAIR = 16;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_PAIR__UID = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_PAIR__KEY = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_PAIR__VALUE = 2;

	/**
	 * The number of structural features of the '<em>Key Value Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_PAIR_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link recipe.impl.MappingTecnologiyImpl <em>Mapping Tecnologiy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see recipe.impl.MappingTecnologiyImpl
	 * @see recipe.impl.RecipePackageImpl#getMappingTecnologiy()
	 * @generated
	 */
	int MAPPING_TECNOLOGIY = 17;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_TECNOLOGIY__UID = 0;

	/**
	 * The feature id for the '<em><b>Tech Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_TECNOLOGIY__TECH_REF = 1;

	/**
	 * The feature id for the '<em><b>Value Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_TECNOLOGIY__VALUE_REF = 2;

	/**
	 * The number of structural features of the '<em>Mapping Tecnologiy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_TECNOLOGIY_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link recipe.impl.QueryImpl <em>Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see recipe.impl.QueryImpl
	 * @see recipe.impl.RecipePackageImpl#getQuery()
	 * @generated
	 */
	int QUERY = 18;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__UID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__NAME = 1;

	/**
	 * The feature id for the '<em><b>Query Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__QUERY_REF = 2;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__VARIABLES = 3;

	/**
	 * The number of structural features of the '<em>Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link recipe.impl.QueryVariableImpl <em>Query Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see recipe.impl.QueryVariableImpl
	 * @see recipe.impl.RecipePackageImpl#getQueryVariable()
	 * @generated
	 */
	int QUERY_VARIABLE = 19;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_VARIABLE__UID = 0;

	/**
	 * The feature id for the '<em><b>Query Param Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_VARIABLE__QUERY_PARAM_REF = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_VARIABLE__VALUE = 2;

	/**
	 * The number of structural features of the '<em>Query Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_VARIABLE_FEATURE_COUNT = 3;


	/**
	 * Returns the meta object for class '{@link recipe.Recipes <em>Recipes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recipes</em>'.
	 * @see recipe.Recipes
	 * @generated
	 */
	EClass getRecipes();

	/**
	 * Returns the meta object for the attribute '{@link recipe.Recipes#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see recipe.Recipes#getUid()
	 * @see #getRecipes()
	 * @generated
	 */
	EAttribute getRecipes_Uid();

	/**
	 * Returns the meta object for the attribute '{@link recipe.Recipes#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see recipe.Recipes#getName()
	 * @see #getRecipes()
	 * @generated
	 */
	EAttribute getRecipes_Name();

	/**
	 * Returns the meta object for the containment reference '{@link recipe.Recipes#getRecipe <em>Recipe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Recipe</em>'.
	 * @see recipe.Recipes#getRecipe()
	 * @see #getRecipes()
	 * @generated
	 */
	EReference getRecipes_Recipe();

	/**
	 * Returns the meta object for the containment reference list '{@link recipe.Recipes#getConfigurations <em>Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Configurations</em>'.
	 * @see recipe.Recipes#getConfigurations()
	 * @see #getRecipes()
	 * @generated
	 */
	EReference getRecipes_Configurations();

	/**
	 * Returns the meta object for the containment reference list '{@link recipe.Recipes#getInfrastructures <em>Infrastructures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Infrastructures</em>'.
	 * @see recipe.Recipes#getInfrastructures()
	 * @see #getRecipes()
	 * @generated
	 */
	EReference getRecipes_Infrastructures();

	/**
	 * Returns the meta object for the containment reference list '{@link recipe.Recipes#getConfigExtensions <em>Config Extensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Config Extensions</em>'.
	 * @see recipe.Recipes#getConfigExtensions()
	 * @see #getRecipes()
	 * @generated
	 */
	EReference getRecipes_ConfigExtensions();

	/**
	 * Returns the meta object for the containment reference list '{@link recipe.Recipes#getRecipe2Infrastructures <em>Recipe2 Infrastructures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Recipe2 Infrastructures</em>'.
	 * @see recipe.Recipes#getRecipe2Infrastructures()
	 * @see #getRecipes()
	 * @generated
	 */
	EReference getRecipes_Recipe2Infrastructures();

	/**
	 * Returns the meta object for the containment reference list '{@link recipe.Recipes#getInfrastructure2Configurations <em>Infrastructure2 Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Infrastructure2 Configurations</em>'.
	 * @see recipe.Recipes#getInfrastructure2Configurations()
	 * @see #getRecipes()
	 * @generated
	 */
	EReference getRecipes_Infrastructure2Configurations();

	/**
	 * Returns the meta object for class '{@link recipe.Recipe <em>Recipe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recipe</em>'.
	 * @see recipe.Recipe
	 * @generated
	 */
	EClass getRecipe();

	/**
	 * Returns the meta object for the attribute '{@link recipe.Recipe#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see recipe.Recipe#getUid()
	 * @see #getRecipe()
	 * @generated
	 */
	EAttribute getRecipe_Uid();

	/**
	 * Returns the meta object for the attribute '{@link recipe.Recipe#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see recipe.Recipe#getName()
	 * @see #getRecipe()
	 * @generated
	 */
	EAttribute getRecipe_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link recipe.Recipe#getIngredients <em>Ingredients</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ingredients</em>'.
	 * @see recipe.Recipe#getIngredients()
	 * @see #getRecipe()
	 * @generated
	 */
	EReference getRecipe_Ingredients();

	/**
	 * Returns the meta object for the containment reference list '{@link recipe.Recipe#getDeplymentStep <em>Deplyment Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Deplyment Step</em>'.
	 * @see recipe.Recipe#getDeplymentStep()
	 * @see #getRecipe()
	 * @generated
	 */
	EReference getRecipe_DeplymentStep();

	/**
	 * Returns the meta object for the containment reference '{@link recipe.Recipe#getStartSeq <em>Start Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Start Seq</em>'.
	 * @see recipe.Recipe#getStartSeq()
	 * @see #getRecipe()
	 * @generated
	 */
	EReference getRecipe_StartSeq();

	/**
	 * Returns the meta object for class '{@link recipe.ConfigExtension <em>Config Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Config Extension</em>'.
	 * @see recipe.ConfigExtension
	 * @generated
	 */
	EClass getConfigExtension();

	/**
	 * Returns the meta object for the attribute '{@link recipe.ConfigExtension#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see recipe.ConfigExtension#getUid()
	 * @see #getConfigExtension()
	 * @generated
	 */
	EAttribute getConfigExtension_Uid();

	/**
	 * Returns the meta object for the reference '{@link recipe.ConfigExtension#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see recipe.ConfigExtension#getSource()
	 * @see #getConfigExtension()
	 * @generated
	 */
	EReference getConfigExtension_Source();

	/**
	 * Returns the meta object for the reference '{@link recipe.ConfigExtension#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see recipe.ConfigExtension#getTarget()
	 * @see #getConfigExtension()
	 * @generated
	 */
	EReference getConfigExtension_Target();

	/**
	 * Returns the meta object for class '{@link recipe.Recipe2Infrastructure <em>Recipe2 Infrastructure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recipe2 Infrastructure</em>'.
	 * @see recipe.Recipe2Infrastructure
	 * @generated
	 */
	EClass getRecipe2Infrastructure();

	/**
	 * Returns the meta object for the attribute '{@link recipe.Recipe2Infrastructure#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see recipe.Recipe2Infrastructure#getUid()
	 * @see #getRecipe2Infrastructure()
	 * @generated
	 */
	EAttribute getRecipe2Infrastructure_Uid();

	/**
	 * Returns the meta object for the reference '{@link recipe.Recipe2Infrastructure#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see recipe.Recipe2Infrastructure#getSource()
	 * @see #getRecipe2Infrastructure()
	 * @generated
	 */
	EReference getRecipe2Infrastructure_Source();

	/**
	 * Returns the meta object for the reference '{@link recipe.Recipe2Infrastructure#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see recipe.Recipe2Infrastructure#getTarget()
	 * @see #getRecipe2Infrastructure()
	 * @generated
	 */
	EReference getRecipe2Infrastructure_Target();

	/**
	 * Returns the meta object for class '{@link recipe.Infrastructure2Configuration <em>Infrastructure2 Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Infrastructure2 Configuration</em>'.
	 * @see recipe.Infrastructure2Configuration
	 * @generated
	 */
	EClass getInfrastructure2Configuration();

	/**
	 * Returns the meta object for the attribute '{@link recipe.Infrastructure2Configuration#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see recipe.Infrastructure2Configuration#getUid()
	 * @see #getInfrastructure2Configuration()
	 * @generated
	 */
	EAttribute getInfrastructure2Configuration_Uid();

	/**
	 * Returns the meta object for the reference '{@link recipe.Infrastructure2Configuration#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see recipe.Infrastructure2Configuration#getSource()
	 * @see #getInfrastructure2Configuration()
	 * @generated
	 */
	EReference getInfrastructure2Configuration_Source();

	/**
	 * Returns the meta object for the reference '{@link recipe.Infrastructure2Configuration#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see recipe.Infrastructure2Configuration#getTarget()
	 * @see #getInfrastructure2Configuration()
	 * @generated
	 */
	EReference getInfrastructure2Configuration_Target();

	/**
	 * Returns the meta object for class '{@link recipe.DeploymentComponent <em>Deployment Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deployment Component</em>'.
	 * @see recipe.DeploymentComponent
	 * @generated
	 */
	EClass getDeploymentComponent();

	/**
	 * Returns the meta object for the attribute '{@link recipe.DeploymentComponent#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see recipe.DeploymentComponent#getUid()
	 * @see #getDeploymentComponent()
	 * @generated
	 */
	EAttribute getDeploymentComponent_Uid();

	/**
	 * Returns the meta object for the attribute '{@link recipe.DeploymentComponent#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see recipe.DeploymentComponent#getName()
	 * @see #getDeploymentComponent()
	 * @generated
	 */
	EAttribute getDeploymentComponent_Name();

	/**
	 * Returns the meta object for the reference '{@link recipe.DeploymentComponent#getMapper <em>Mapper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mapper</em>'.
	 * @see recipe.DeploymentComponent#getMapper()
	 * @see #getDeploymentComponent()
	 * @generated
	 */
	EReference getDeploymentComponent_Mapper();

	/**
	 * Returns the meta object for the reference '{@link recipe.DeploymentComponent#getDeploymentComponentLink <em>Deployment Component Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Deployment Component Link</em>'.
	 * @see recipe.DeploymentComponent#getDeploymentComponentLink()
	 * @see #getDeploymentComponent()
	 * @generated
	 */
	EReference getDeploymentComponent_DeploymentComponentLink();

	/**
	 * Returns the meta object for class '{@link recipe.DeploymentStarStep <em>Deployment Star Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deployment Star Step</em>'.
	 * @see recipe.DeploymentStarStep
	 * @generated
	 */
	EClass getDeploymentStarStep();

	/**
	 * Returns the meta object for the attribute '{@link recipe.DeploymentStarStep#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see recipe.DeploymentStarStep#getUid()
	 * @see #getDeploymentStarStep()
	 * @generated
	 */
	EAttribute getDeploymentStarStep_Uid();

	/**
	 * Returns the meta object for the attribute '{@link recipe.DeploymentStarStep#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see recipe.DeploymentStarStep#getName()
	 * @see #getDeploymentStarStep()
	 * @generated
	 */
	EAttribute getDeploymentStarStep_Name();

	/**
	 * Returns the meta object for the reference '{@link recipe.DeploymentStarStep#getFirstStep <em>First Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>First Step</em>'.
	 * @see recipe.DeploymentStarStep#getFirstStep()
	 * @see #getDeploymentStarStep()
	 * @generated
	 */
	EReference getDeploymentStarStep_FirstStep();

	/**
	 * Returns the meta object for class '{@link recipe.UsingMappers <em>Using Mappers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Using Mappers</em>'.
	 * @see recipe.UsingMappers
	 * @generated
	 */
	EClass getUsingMappers();

	/**
	 * Returns the meta object for the reference list '{@link recipe.UsingMappers#getMappers <em>Mappers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mappers</em>'.
	 * @see recipe.UsingMappers#getMappers()
	 * @see #getUsingMappers()
	 * @generated
	 */
	EReference getUsingMappers_Mappers();

	/**
	 * Returns the meta object for class '{@link recipe.Ingredient <em>Ingredient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ingredient</em>'.
	 * @see recipe.Ingredient
	 * @generated
	 */
	EClass getIngredient();

	/**
	 * Returns the meta object for the attribute '{@link recipe.Ingredient#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see recipe.Ingredient#getUid()
	 * @see #getIngredient()
	 * @generated
	 */
	EAttribute getIngredient_Uid();

	/**
	 * Returns the meta object for the attribute '{@link recipe.Ingredient#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see recipe.Ingredient#getName()
	 * @see #getIngredient()
	 * @generated
	 */
	EAttribute getIngredient_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link recipe.Ingredient#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see recipe.Ingredient#getComponents()
	 * @see #getIngredient()
	 * @generated
	 */
	EReference getIngredient_Components();

	/**
	 * Returns the meta object for the reference list '{@link recipe.Ingredient#getVewLayer <em>Vew Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Vew Layer</em>'.
	 * @see recipe.Ingredient#getVewLayer()
	 * @see #getIngredient()
	 * @generated
	 */
	EReference getIngredient_VewLayer();

	/**
	 * Returns the meta object for the reference list '{@link recipe.Ingredient#getModelLayer <em>Model Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Model Layer</em>'.
	 * @see recipe.Ingredient#getModelLayer()
	 * @see #getIngredient()
	 * @generated
	 */
	EReference getIngredient_ModelLayer();

	/**
	 * Returns the meta object for the reference '{@link recipe.Ingredient#getControllerLayer <em>Controller Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Controller Layer</em>'.
	 * @see recipe.Ingredient#getControllerLayer()
	 * @see #getIngredient()
	 * @generated
	 */
	EReference getIngredient_ControllerLayer();

	/**
	 * Returns the meta object for class '{@link recipe.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see recipe.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the attribute '{@link recipe.Component#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see recipe.Component#getUid()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Uid();

	/**
	 * Returns the meta object for the attribute '{@link recipe.Component#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see recipe.Component#getName()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link recipe.Component#getMappers <em>Mappers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mappers</em>'.
	 * @see recipe.Component#getMappers()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Mappers();

	/**
	 * Returns the meta object for the attribute '{@link recipe.Component#getComponentRoot <em>Component Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Root</em>'.
	 * @see recipe.Component#getComponentRoot()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_ComponentRoot();

	/**
	 * Returns the meta object for class '{@link recipe.JavaComponent <em>Java Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Component</em>'.
	 * @see recipe.JavaComponent
	 * @generated
	 */
	EClass getJavaComponent();

	/**
	 * Returns the meta object for the attribute '{@link recipe.JavaComponent#getArtifactId <em>Artifact Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Artifact Id</em>'.
	 * @see recipe.JavaComponent#getArtifactId()
	 * @see #getJavaComponent()
	 * @generated
	 */
	EAttribute getJavaComponent_ArtifactId();

	/**
	 * Returns the meta object for the attribute '{@link recipe.JavaComponent#getGroupId <em>Group Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group Id</em>'.
	 * @see recipe.JavaComponent#getGroupId()
	 * @see #getJavaComponent()
	 * @generated
	 */
	EAttribute getJavaComponent_GroupId();

	/**
	 * Returns the meta object for the attribute '{@link recipe.JavaComponent#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see recipe.JavaComponent#getVersion()
	 * @see #getJavaComponent()
	 * @generated
	 */
	EAttribute getJavaComponent_Version();

	/**
	 * Returns the meta object for the attribute '{@link recipe.JavaComponent#getBasePackage <em>Base Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Package</em>'.
	 * @see recipe.JavaComponent#getBasePackage()
	 * @see #getJavaComponent()
	 * @generated
	 */
	EAttribute getJavaComponent_BasePackage();

	/**
	 * Returns the meta object for class '{@link recipe.Infrastructure <em>Infrastructure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Infrastructure</em>'.
	 * @see recipe.Infrastructure
	 * @generated
	 */
	EClass getInfrastructure();

	/**
	 * Returns the meta object for the attribute '{@link recipe.Infrastructure#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see recipe.Infrastructure#getUid()
	 * @see #getInfrastructure()
	 * @generated
	 */
	EAttribute getInfrastructure_Uid();

	/**
	 * Returns the meta object for the attribute '{@link recipe.Infrastructure#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see recipe.Infrastructure#getName()
	 * @see #getInfrastructure()
	 * @generated
	 */
	EAttribute getInfrastructure_Name();

	/**
	 * Returns the meta object for class '{@link recipe.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see recipe.Configuration
	 * @generated
	 */
	EClass getConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link recipe.Configuration#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see recipe.Configuration#getUid()
	 * @see #getConfiguration()
	 * @generated
	 */
	EAttribute getConfiguration_Uid();

	/**
	 * Returns the meta object for the attribute '{@link recipe.Configuration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see recipe.Configuration#getName()
	 * @see #getConfiguration()
	 * @generated
	 */
	EAttribute getConfiguration_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link recipe.Configuration#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see recipe.Configuration#getProperties()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Properties();

	/**
	 * Returns the meta object for the containment reference list '{@link recipe.Configuration#getHashProperties <em>Hash Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hash Properties</em>'.
	 * @see recipe.Configuration#getHashProperties()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_HashProperties();

	/**
	 * Returns the meta object for class '{@link recipe.ModelMapper <em>Model Mapper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Mapper</em>'.
	 * @see recipe.ModelMapper
	 * @generated
	 */
	EClass getModelMapper();

	/**
	 * Returns the meta object for the attribute '{@link recipe.ModelMapper#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see recipe.ModelMapper#getName()
	 * @see #getModelMapper()
	 * @generated
	 */
	EAttribute getModelMapper_Name();

	/**
	 * Returns the meta object for the attribute '{@link recipe.ModelMapper#getArtifactRoot <em>Artifact Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Artifact Root</em>'.
	 * @see recipe.ModelMapper#getArtifactRoot()
	 * @see #getModelMapper()
	 * @generated
	 */
	EAttribute getModelMapper_ArtifactRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link recipe.ModelMapper#getTechnologies <em>Technologies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Technologies</em>'.
	 * @see recipe.ModelMapper#getTechnologies()
	 * @see #getModelMapper()
	 * @generated
	 */
	EReference getModelMapper_Technologies();

	/**
	 * Returns the meta object for the containment reference list '{@link recipe.ModelMapper#getQueries <em>Queries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Queries</em>'.
	 * @see recipe.ModelMapper#getQueries()
	 * @see #getModelMapper()
	 * @generated
	 */
	EReference getModelMapper_Queries();

	/**
	 * Returns the meta object for the attribute '{@link recipe.ModelMapper#getArtifactExecutionString <em>Artifact Execution String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Artifact Execution String</em>'.
	 * @see recipe.ModelMapper#getArtifactExecutionString()
	 * @see #getModelMapper()
	 * @generated
	 */
	EAttribute getModelMapper_ArtifactExecutionString();

	/**
	 * Returns the meta object for class '{@link recipe.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see recipe.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link recipe.Property#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see recipe.Property#getUid()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Uid();

	/**
	 * Returns the meta object for the reference '{@link recipe.Property#getConfVarRef <em>Conf Var Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conf Var Ref</em>'.
	 * @see recipe.Property#getConfVarRef()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_ConfVarRef();

	/**
	 * Returns the meta object for the attribute '{@link recipe.Property#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see recipe.Property#getValue()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Value();

	/**
	 * Returns the meta object for class '{@link recipe.HashProperty <em>Hash Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hash Property</em>'.
	 * @see recipe.HashProperty
	 * @generated
	 */
	EClass getHashProperty();

	/**
	 * Returns the meta object for the attribute '{@link recipe.HashProperty#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see recipe.HashProperty#getUid()
	 * @see #getHashProperty()
	 * @generated
	 */
	EAttribute getHashProperty_Uid();

	/**
	 * Returns the meta object for the reference '{@link recipe.HashProperty#getConfHashRef <em>Conf Hash Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conf Hash Ref</em>'.
	 * @see recipe.HashProperty#getConfHashRef()
	 * @see #getHashProperty()
	 * @generated
	 */
	EReference getHashProperty_ConfHashRef();

	/**
	 * Returns the meta object for the containment reference list '{@link recipe.HashProperty#getHash <em>Hash</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hash</em>'.
	 * @see recipe.HashProperty#getHash()
	 * @see #getHashProperty()
	 * @generated
	 */
	EReference getHashProperty_Hash();

	/**
	 * Returns the meta object for class '{@link recipe.KeyValuePair <em>Key Value Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key Value Pair</em>'.
	 * @see recipe.KeyValuePair
	 * @generated
	 */
	EClass getKeyValuePair();

	/**
	 * Returns the meta object for the attribute '{@link recipe.KeyValuePair#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see recipe.KeyValuePair#getUid()
	 * @see #getKeyValuePair()
	 * @generated
	 */
	EAttribute getKeyValuePair_Uid();

	/**
	 * Returns the meta object for the attribute '{@link recipe.KeyValuePair#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see recipe.KeyValuePair#getKey()
	 * @see #getKeyValuePair()
	 * @generated
	 */
	EAttribute getKeyValuePair_Key();

	/**
	 * Returns the meta object for the attribute '{@link recipe.KeyValuePair#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see recipe.KeyValuePair#getValue()
	 * @see #getKeyValuePair()
	 * @generated
	 */
	EAttribute getKeyValuePair_Value();

	/**
	 * Returns the meta object for class '{@link recipe.MappingTecnologiy <em>Mapping Tecnologiy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping Tecnologiy</em>'.
	 * @see recipe.MappingTecnologiy
	 * @generated
	 */
	EClass getMappingTecnologiy();

	/**
	 * Returns the meta object for the attribute '{@link recipe.MappingTecnologiy#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see recipe.MappingTecnologiy#getUid()
	 * @see #getMappingTecnologiy()
	 * @generated
	 */
	EAttribute getMappingTecnologiy_Uid();

	/**
	 * Returns the meta object for the reference '{@link recipe.MappingTecnologiy#getTechRef <em>Tech Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tech Ref</em>'.
	 * @see recipe.MappingTecnologiy#getTechRef()
	 * @see #getMappingTecnologiy()
	 * @generated
	 */
	EReference getMappingTecnologiy_TechRef();

	/**
	 * Returns the meta object for the reference '{@link recipe.MappingTecnologiy#getValueRef <em>Value Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value Ref</em>'.
	 * @see recipe.MappingTecnologiy#getValueRef()
	 * @see #getMappingTecnologiy()
	 * @generated
	 */
	EReference getMappingTecnologiy_ValueRef();

	/**
	 * Returns the meta object for class '{@link recipe.Query <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query</em>'.
	 * @see recipe.Query
	 * @generated
	 */
	EClass getQuery();

	/**
	 * Returns the meta object for the attribute '{@link recipe.Query#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see recipe.Query#getUid()
	 * @see #getQuery()
	 * @generated
	 */
	EAttribute getQuery_Uid();

	/**
	 * Returns the meta object for the attribute '{@link recipe.Query#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see recipe.Query#getName()
	 * @see #getQuery()
	 * @generated
	 */
	EAttribute getQuery_Name();

	/**
	 * Returns the meta object for the reference '{@link recipe.Query#getQueryRef <em>Query Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Query Ref</em>'.
	 * @see recipe.Query#getQueryRef()
	 * @see #getQuery()
	 * @generated
	 */
	EReference getQuery_QueryRef();

	/**
	 * Returns the meta object for the containment reference list '{@link recipe.Query#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see recipe.Query#getVariables()
	 * @see #getQuery()
	 * @generated
	 */
	EReference getQuery_Variables();

	/**
	 * Returns the meta object for class '{@link recipe.QueryVariable <em>Query Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Variable</em>'.
	 * @see recipe.QueryVariable
	 * @generated
	 */
	EClass getQueryVariable();

	/**
	 * Returns the meta object for the attribute '{@link recipe.QueryVariable#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see recipe.QueryVariable#getUid()
	 * @see #getQueryVariable()
	 * @generated
	 */
	EAttribute getQueryVariable_Uid();

	/**
	 * Returns the meta object for the reference '{@link recipe.QueryVariable#getQueryParamRef <em>Query Param Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Query Param Ref</em>'.
	 * @see recipe.QueryVariable#getQueryParamRef()
	 * @see #getQueryVariable()
	 * @generated
	 */
	EReference getQueryVariable_QueryParamRef();

	/**
	 * Returns the meta object for the attribute '{@link recipe.QueryVariable#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see recipe.QueryVariable#getValue()
	 * @see #getQueryVariable()
	 * @generated
	 */
	EAttribute getQueryVariable_Value();

	/**
	 * Returns the meta object for class '{@link recipe.ArtifactRef <em>Artifact Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artifact Ref</em>'.
	 * @see recipe.ArtifactRef
	 * @generated
	 */
	EClass getArtifactRef();

	/**
	 * Returns the meta object for the attribute '{@link recipe.ArtifactRef#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see recipe.ArtifactRef#getUid()
	 * @see #getArtifactRef()
	 * @generated
	 */
	EAttribute getArtifactRef_Uid();

	/**
	 * Returns the meta object for the reference '{@link recipe.ArtifactRef#getArtifactRef <em>Artifact Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Artifact Ref</em>'.
	 * @see recipe.ArtifactRef#getArtifactRef()
	 * @see #getArtifactRef()
	 * @generated
	 */
	EReference getArtifactRef_ArtifactRef();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RecipeFactory getRecipeFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link recipe.impl.RecipesImpl <em>Recipes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see recipe.impl.RecipesImpl
		 * @see recipe.impl.RecipePackageImpl#getRecipes()
		 * @generated
		 */
		EClass RECIPES = eINSTANCE.getRecipes();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECIPES__UID = eINSTANCE.getRecipes_Uid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECIPES__NAME = eINSTANCE.getRecipes_Name();

		/**
		 * The meta object literal for the '<em><b>Recipe</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECIPES__RECIPE = eINSTANCE.getRecipes_Recipe();

		/**
		 * The meta object literal for the '<em><b>Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECIPES__CONFIGURATIONS = eINSTANCE.getRecipes_Configurations();

		/**
		 * The meta object literal for the '<em><b>Infrastructures</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECIPES__INFRASTRUCTURES = eINSTANCE.getRecipes_Infrastructures();

		/**
		 * The meta object literal for the '<em><b>Config Extensions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECIPES__CONFIG_EXTENSIONS = eINSTANCE.getRecipes_ConfigExtensions();

		/**
		 * The meta object literal for the '<em><b>Recipe2 Infrastructures</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECIPES__RECIPE2_INFRASTRUCTURES = eINSTANCE.getRecipes_Recipe2Infrastructures();

		/**
		 * The meta object literal for the '<em><b>Infrastructure2 Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECIPES__INFRASTRUCTURE2_CONFIGURATIONS = eINSTANCE.getRecipes_Infrastructure2Configurations();

		/**
		 * The meta object literal for the '{@link recipe.impl.RecipeImpl <em>Recipe</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see recipe.impl.RecipeImpl
		 * @see recipe.impl.RecipePackageImpl#getRecipe()
		 * @generated
		 */
		EClass RECIPE = eINSTANCE.getRecipe();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECIPE__UID = eINSTANCE.getRecipe_Uid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECIPE__NAME = eINSTANCE.getRecipe_Name();

		/**
		 * The meta object literal for the '<em><b>Ingredients</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECIPE__INGREDIENTS = eINSTANCE.getRecipe_Ingredients();

		/**
		 * The meta object literal for the '<em><b>Deplyment Step</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECIPE__DEPLYMENT_STEP = eINSTANCE.getRecipe_DeplymentStep();

		/**
		 * The meta object literal for the '<em><b>Start Seq</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECIPE__START_SEQ = eINSTANCE.getRecipe_StartSeq();

		/**
		 * The meta object literal for the '{@link recipe.impl.ConfigExtensionImpl <em>Config Extension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see recipe.impl.ConfigExtensionImpl
		 * @see recipe.impl.RecipePackageImpl#getConfigExtension()
		 * @generated
		 */
		EClass CONFIG_EXTENSION = eINSTANCE.getConfigExtension();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG_EXTENSION__UID = eINSTANCE.getConfigExtension_Uid();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIG_EXTENSION__SOURCE = eINSTANCE.getConfigExtension_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIG_EXTENSION__TARGET = eINSTANCE.getConfigExtension_Target();

		/**
		 * The meta object literal for the '{@link recipe.impl.Recipe2InfrastructureImpl <em>Recipe2 Infrastructure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see recipe.impl.Recipe2InfrastructureImpl
		 * @see recipe.impl.RecipePackageImpl#getRecipe2Infrastructure()
		 * @generated
		 */
		EClass RECIPE2_INFRASTRUCTURE = eINSTANCE.getRecipe2Infrastructure();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECIPE2_INFRASTRUCTURE__UID = eINSTANCE.getRecipe2Infrastructure_Uid();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECIPE2_INFRASTRUCTURE__SOURCE = eINSTANCE.getRecipe2Infrastructure_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECIPE2_INFRASTRUCTURE__TARGET = eINSTANCE.getRecipe2Infrastructure_Target();

		/**
		 * The meta object literal for the '{@link recipe.impl.Infrastructure2ConfigurationImpl <em>Infrastructure2 Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see recipe.impl.Infrastructure2ConfigurationImpl
		 * @see recipe.impl.RecipePackageImpl#getInfrastructure2Configuration()
		 * @generated
		 */
		EClass INFRASTRUCTURE2_CONFIGURATION = eINSTANCE.getInfrastructure2Configuration();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFRASTRUCTURE2_CONFIGURATION__UID = eINSTANCE.getInfrastructure2Configuration_Uid();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFRASTRUCTURE2_CONFIGURATION__SOURCE = eINSTANCE.getInfrastructure2Configuration_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFRASTRUCTURE2_CONFIGURATION__TARGET = eINSTANCE.getInfrastructure2Configuration_Target();

		/**
		 * The meta object literal for the '{@link recipe.impl.DeploymentComponentImpl <em>Deployment Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see recipe.impl.DeploymentComponentImpl
		 * @see recipe.impl.RecipePackageImpl#getDeploymentComponent()
		 * @generated
		 */
		EClass DEPLOYMENT_COMPONENT = eINSTANCE.getDeploymentComponent();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT_COMPONENT__UID = eINSTANCE.getDeploymentComponent_Uid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT_COMPONENT__NAME = eINSTANCE.getDeploymentComponent_Name();

		/**
		 * The meta object literal for the '<em><b>Mapper</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT_COMPONENT__MAPPER = eINSTANCE.getDeploymentComponent_Mapper();

		/**
		 * The meta object literal for the '<em><b>Deployment Component Link</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT_COMPONENT__DEPLOYMENT_COMPONENT_LINK = eINSTANCE.getDeploymentComponent_DeploymentComponentLink();

		/**
		 * The meta object literal for the '{@link recipe.impl.DeploymentStarStepImpl <em>Deployment Star Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see recipe.impl.DeploymentStarStepImpl
		 * @see recipe.impl.RecipePackageImpl#getDeploymentStarStep()
		 * @generated
		 */
		EClass DEPLOYMENT_STAR_STEP = eINSTANCE.getDeploymentStarStep();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT_STAR_STEP__UID = eINSTANCE.getDeploymentStarStep_Uid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT_STAR_STEP__NAME = eINSTANCE.getDeploymentStarStep_Name();

		/**
		 * The meta object literal for the '<em><b>First Step</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT_STAR_STEP__FIRST_STEP = eINSTANCE.getDeploymentStarStep_FirstStep();

		/**
		 * The meta object literal for the '{@link recipe.impl.UsingMappersImpl <em>Using Mappers</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see recipe.impl.UsingMappersImpl
		 * @see recipe.impl.RecipePackageImpl#getUsingMappers()
		 * @generated
		 */
		EClass USING_MAPPERS = eINSTANCE.getUsingMappers();

		/**
		 * The meta object literal for the '<em><b>Mappers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USING_MAPPERS__MAPPERS = eINSTANCE.getUsingMappers_Mappers();

		/**
		 * The meta object literal for the '{@link recipe.impl.IngredientImpl <em>Ingredient</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see recipe.impl.IngredientImpl
		 * @see recipe.impl.RecipePackageImpl#getIngredient()
		 * @generated
		 */
		EClass INGREDIENT = eINSTANCE.getIngredient();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INGREDIENT__UID = eINSTANCE.getIngredient_Uid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INGREDIENT__NAME = eINSTANCE.getIngredient_Name();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INGREDIENT__COMPONENTS = eINSTANCE.getIngredient_Components();

		/**
		 * The meta object literal for the '<em><b>Vew Layer</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INGREDIENT__VEW_LAYER = eINSTANCE.getIngredient_VewLayer();

		/**
		 * The meta object literal for the '<em><b>Model Layer</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INGREDIENT__MODEL_LAYER = eINSTANCE.getIngredient_ModelLayer();

		/**
		 * The meta object literal for the '<em><b>Controller Layer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INGREDIENT__CONTROLLER_LAYER = eINSTANCE.getIngredient_ControllerLayer();

		/**
		 * The meta object literal for the '{@link recipe.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see recipe.impl.ComponentImpl
		 * @see recipe.impl.RecipePackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__UID = eINSTANCE.getComponent_Uid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__NAME = eINSTANCE.getComponent_Name();

		/**
		 * The meta object literal for the '<em><b>Mappers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__MAPPERS = eINSTANCE.getComponent_Mappers();

		/**
		 * The meta object literal for the '<em><b>Component Root</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__COMPONENT_ROOT = eINSTANCE.getComponent_ComponentRoot();

		/**
		 * The meta object literal for the '{@link recipe.impl.JavaComponentImpl <em>Java Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see recipe.impl.JavaComponentImpl
		 * @see recipe.impl.RecipePackageImpl#getJavaComponent()
		 * @generated
		 */
		EClass JAVA_COMPONENT = eINSTANCE.getJavaComponent();

		/**
		 * The meta object literal for the '<em><b>Artifact Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_COMPONENT__ARTIFACT_ID = eINSTANCE.getJavaComponent_ArtifactId();

		/**
		 * The meta object literal for the '<em><b>Group Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_COMPONENT__GROUP_ID = eINSTANCE.getJavaComponent_GroupId();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_COMPONENT__VERSION = eINSTANCE.getJavaComponent_Version();

		/**
		 * The meta object literal for the '<em><b>Base Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_COMPONENT__BASE_PACKAGE = eINSTANCE.getJavaComponent_BasePackage();

		/**
		 * The meta object literal for the '{@link recipe.impl.InfrastructureImpl <em>Infrastructure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see recipe.impl.InfrastructureImpl
		 * @see recipe.impl.RecipePackageImpl#getInfrastructure()
		 * @generated
		 */
		EClass INFRASTRUCTURE = eINSTANCE.getInfrastructure();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFRASTRUCTURE__UID = eINSTANCE.getInfrastructure_Uid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFRASTRUCTURE__NAME = eINSTANCE.getInfrastructure_Name();

		/**
		 * The meta object literal for the '{@link recipe.impl.ConfigurationImpl <em>Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see recipe.impl.ConfigurationImpl
		 * @see recipe.impl.RecipePackageImpl#getConfiguration()
		 * @generated
		 */
		EClass CONFIGURATION = eINSTANCE.getConfiguration();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION__UID = eINSTANCE.getConfiguration_Uid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION__NAME = eINSTANCE.getConfiguration_Name();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__PROPERTIES = eINSTANCE.getConfiguration_Properties();

		/**
		 * The meta object literal for the '<em><b>Hash Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__HASH_PROPERTIES = eINSTANCE.getConfiguration_HashProperties();

		/**
		 * The meta object literal for the '{@link recipe.impl.ModelMapperImpl <em>Model Mapper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see recipe.impl.ModelMapperImpl
		 * @see recipe.impl.RecipePackageImpl#getModelMapper()
		 * @generated
		 */
		EClass MODEL_MAPPER = eINSTANCE.getModelMapper();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_MAPPER__NAME = eINSTANCE.getModelMapper_Name();

		/**
		 * The meta object literal for the '<em><b>Artifact Root</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_MAPPER__ARTIFACT_ROOT = eINSTANCE.getModelMapper_ArtifactRoot();

		/**
		 * The meta object literal for the '<em><b>Technologies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_MAPPER__TECHNOLOGIES = eINSTANCE.getModelMapper_Technologies();

		/**
		 * The meta object literal for the '<em><b>Queries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_MAPPER__QUERIES = eINSTANCE.getModelMapper_Queries();

		/**
		 * The meta object literal for the '<em><b>Artifact Execution String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_MAPPER__ARTIFACT_EXECUTION_STRING = eINSTANCE.getModelMapper_ArtifactExecutionString();

		/**
		 * The meta object literal for the '{@link recipe.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see recipe.impl.PropertyImpl
		 * @see recipe.impl.RecipePackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__UID = eINSTANCE.getProperty_Uid();

		/**
		 * The meta object literal for the '<em><b>Conf Var Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__CONF_VAR_REF = eINSTANCE.getProperty_ConfVarRef();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__VALUE = eINSTANCE.getProperty_Value();

		/**
		 * The meta object literal for the '{@link recipe.impl.HashPropertyImpl <em>Hash Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see recipe.impl.HashPropertyImpl
		 * @see recipe.impl.RecipePackageImpl#getHashProperty()
		 * @generated
		 */
		EClass HASH_PROPERTY = eINSTANCE.getHashProperty();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HASH_PROPERTY__UID = eINSTANCE.getHashProperty_Uid();

		/**
		 * The meta object literal for the '<em><b>Conf Hash Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HASH_PROPERTY__CONF_HASH_REF = eINSTANCE.getHashProperty_ConfHashRef();

		/**
		 * The meta object literal for the '<em><b>Hash</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HASH_PROPERTY__HASH = eINSTANCE.getHashProperty_Hash();

		/**
		 * The meta object literal for the '{@link recipe.impl.KeyValuePairImpl <em>Key Value Pair</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see recipe.impl.KeyValuePairImpl
		 * @see recipe.impl.RecipePackageImpl#getKeyValuePair()
		 * @generated
		 */
		EClass KEY_VALUE_PAIR = eINSTANCE.getKeyValuePair();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_VALUE_PAIR__UID = eINSTANCE.getKeyValuePair_Uid();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_VALUE_PAIR__KEY = eINSTANCE.getKeyValuePair_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_VALUE_PAIR__VALUE = eINSTANCE.getKeyValuePair_Value();

		/**
		 * The meta object literal for the '{@link recipe.impl.MappingTecnologiyImpl <em>Mapping Tecnologiy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see recipe.impl.MappingTecnologiyImpl
		 * @see recipe.impl.RecipePackageImpl#getMappingTecnologiy()
		 * @generated
		 */
		EClass MAPPING_TECNOLOGIY = eINSTANCE.getMappingTecnologiy();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPING_TECNOLOGIY__UID = eINSTANCE.getMappingTecnologiy_Uid();

		/**
		 * The meta object literal for the '<em><b>Tech Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_TECNOLOGIY__TECH_REF = eINSTANCE.getMappingTecnologiy_TechRef();

		/**
		 * The meta object literal for the '<em><b>Value Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_TECNOLOGIY__VALUE_REF = eINSTANCE.getMappingTecnologiy_ValueRef();

		/**
		 * The meta object literal for the '{@link recipe.impl.QueryImpl <em>Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see recipe.impl.QueryImpl
		 * @see recipe.impl.RecipePackageImpl#getQuery()
		 * @generated
		 */
		EClass QUERY = eINSTANCE.getQuery();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY__UID = eINSTANCE.getQuery_Uid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY__NAME = eINSTANCE.getQuery_Name();

		/**
		 * The meta object literal for the '<em><b>Query Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY__QUERY_REF = eINSTANCE.getQuery_QueryRef();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY__VARIABLES = eINSTANCE.getQuery_Variables();

		/**
		 * The meta object literal for the '{@link recipe.impl.QueryVariableImpl <em>Query Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see recipe.impl.QueryVariableImpl
		 * @see recipe.impl.RecipePackageImpl#getQueryVariable()
		 * @generated
		 */
		EClass QUERY_VARIABLE = eINSTANCE.getQueryVariable();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_VARIABLE__UID = eINSTANCE.getQueryVariable_Uid();

		/**
		 * The meta object literal for the '<em><b>Query Param Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY_VARIABLE__QUERY_PARAM_REF = eINSTANCE.getQueryVariable_QueryParamRef();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_VARIABLE__VALUE = eINSTANCE.getQueryVariable_Value();

		/**
		 * The meta object literal for the '{@link recipe.impl.ArtifactRefImpl <em>Artifact Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see recipe.impl.ArtifactRefImpl
		 * @see recipe.impl.RecipePackageImpl#getArtifactRef()
		 * @generated
		 */
		EClass ARTIFACT_REF = eINSTANCE.getArtifactRef();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACT_REF__UID = eINSTANCE.getArtifactRef_Uid();

		/**
		 * The meta object literal for the '<em><b>Artifact Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIFACT_REF__ARTIFACT_REF = eINSTANCE.getArtifactRef_ArtifactRef();

	}

} //RecipePackage
