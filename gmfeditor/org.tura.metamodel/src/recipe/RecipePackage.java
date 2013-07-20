/**
 */
package recipe;

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
public interface RecipePackage extends EPackage
{
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
  String eNS_URI = "http://tura.org/2013/v1/recipe";

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
   * The feature id for the '<em><b>Recipe</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECIPES__RECIPE = 0;

  /**
   * The feature id for the '<em><b>Configurations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECIPES__CONFIGURATIONS = 1;

  /**
   * The number of structural features of the '<em>Recipes</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECIPES_FEATURE_COUNT = 2;

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
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECIPE__NAME = 0;

  /**
   * The feature id for the '<em><b>Components</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECIPE__COMPONENTS = 1;

  /**
   * The feature id for the '<em><b>Recipe Config</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECIPE__RECIPE_CONFIG = 2;

  /**
   * The number of structural features of the '<em>Recipe</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECIPE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link recipe.impl.ComponentImpl <em>Component</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see recipe.impl.ComponentImpl
   * @see recipe.impl.RecipePackageImpl#getComponent()
   * @generated
   */
  int COMPONENT = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Components</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__COMPONENTS = 1;

  /**
   * The feature id for the '<em><b>Mappers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__MAPPERS = 2;

  /**
   * The number of structural features of the '<em>Component</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link recipe.impl.ModelMapperImpl <em>Model Mapper</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see recipe.impl.ModelMapperImpl
   * @see recipe.impl.RecipePackageImpl#getModelMapper()
   * @generated
   */
  int MODEL_MAPPER = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_MAPPER__NAME = 0;

  /**
   * The feature id for the '<em><b>Artifact Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_MAPPER__ARTIFACT_REF = 1;

  /**
   * The feature id for the '<em><b>Specifiers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_MAPPER__SPECIFIERS = 2;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_MAPPER__VARIABLES = 3;

  /**
   * The number of structural features of the '<em>Model Mapper</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_MAPPER_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link recipe.impl.ConfigurationImpl <em>Configuration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see recipe.impl.ConfigurationImpl
   * @see recipe.impl.RecipePackageImpl#getConfiguration()
   * @generated
   */
  int CONFIGURATION = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIGURATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIGURATION__PROPERTIES = 1;

  /**
   * The feature id for the '<em><b>Config Extension</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIGURATION__CONFIG_EXTENSION = 2;

  /**
   * The number of structural features of the '<em>Configuration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIGURATION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link recipe.impl.PropertyImpl <em>Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see recipe.impl.PropertyImpl
   * @see recipe.impl.RecipePackageImpl#getProperty()
   * @generated
   */
  int PROPERTY = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__VALUE = 1;

  /**
   * The number of structural features of the '<em>Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link recipe.impl.SpecifierImpl <em>Specifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see recipe.impl.SpecifierImpl
   * @see recipe.impl.RecipePackageImpl#getSpecifier()
   * @generated
   */
  int SPECIFIER = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIFIER__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIFIER__VALUE = 1;

  /**
   * The number of structural features of the '<em>Specifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIFIER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link recipe.impl.VariableImpl <em>Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see recipe.impl.VariableImpl
   * @see recipe.impl.RecipePackageImpl#getVariable()
   * @generated
   */
  int VARIABLE = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__VALUE = 1;

  /**
   * The number of structural features of the '<em>Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link recipe.impl.ArtifactRefImpl <em>Artifact Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see recipe.impl.ArtifactRefImpl
   * @see recipe.impl.RecipePackageImpl#getArtifactRef()
   * @generated
   */
  int ARTIFACT_REF = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTIFACT_REF__NAME = 0;

  /**
   * The number of structural features of the '<em>Artifact Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTIFACT_REF_FEATURE_COUNT = 1;


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
   * Returns the meta object for class '{@link recipe.Recipe <em>Recipe</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Recipe</em>'.
   * @see recipe.Recipe
   * @generated
   */
  EClass getRecipe();

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
   * Returns the meta object for the containment reference list '{@link recipe.Recipe#getComponents <em>Components</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Components</em>'.
   * @see recipe.Recipe#getComponents()
   * @see #getRecipe()
   * @generated
   */
  EReference getRecipe_Components();

  /**
   * Returns the meta object for the reference '{@link recipe.Recipe#getRecipeConfig <em>Recipe Config</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Recipe Config</em>'.
   * @see recipe.Recipe#getRecipeConfig()
   * @see #getRecipe()
   * @generated
   */
  EReference getRecipe_RecipeConfig();

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
   * Returns the meta object for the containment reference list '{@link recipe.Component#getComponents <em>Components</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Components</em>'.
   * @see recipe.Component#getComponents()
   * @see #getComponent()
   * @generated
   */
  EReference getComponent_Components();

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
   * Returns the meta object for the containment reference '{@link recipe.ModelMapper#getArtifactRef <em>Artifact Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Artifact Ref</em>'.
   * @see recipe.ModelMapper#getArtifactRef()
   * @see #getModelMapper()
   * @generated
   */
  EReference getModelMapper_ArtifactRef();

  /**
   * Returns the meta object for the containment reference list '{@link recipe.ModelMapper#getSpecifiers <em>Specifiers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Specifiers</em>'.
   * @see recipe.ModelMapper#getSpecifiers()
   * @see #getModelMapper()
   * @generated
   */
  EReference getModelMapper_Specifiers();

  /**
   * Returns the meta object for the containment reference list '{@link recipe.ModelMapper#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variables</em>'.
   * @see recipe.ModelMapper#getVariables()
   * @see #getModelMapper()
   * @generated
   */
  EReference getModelMapper_Variables();

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
   * Returns the meta object for the reference '{@link recipe.Configuration#getConfigExtension <em>Config Extension</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Config Extension</em>'.
   * @see recipe.Configuration#getConfigExtension()
   * @see #getConfiguration()
   * @generated
   */
  EReference getConfiguration_ConfigExtension();

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
   * Returns the meta object for the attribute '{@link recipe.Property#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see recipe.Property#getName()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_Name();

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
   * Returns the meta object for class '{@link recipe.Specifier <em>Specifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Specifier</em>'.
   * @see recipe.Specifier
   * @generated
   */
  EClass getSpecifier();

  /**
   * Returns the meta object for the attribute '{@link recipe.Specifier#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see recipe.Specifier#getName()
   * @see #getSpecifier()
   * @generated
   */
  EAttribute getSpecifier_Name();

  /**
   * Returns the meta object for the attribute '{@link recipe.Specifier#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see recipe.Specifier#getValue()
   * @see #getSpecifier()
   * @generated
   */
  EAttribute getSpecifier_Value();

  /**
   * Returns the meta object for class '{@link recipe.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable</em>'.
   * @see recipe.Variable
   * @generated
   */
  EClass getVariable();

  /**
   * Returns the meta object for the attribute '{@link recipe.Variable#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see recipe.Variable#getName()
   * @see #getVariable()
   * @generated
   */
  EAttribute getVariable_Name();

  /**
   * Returns the meta object for the attribute '{@link recipe.Variable#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see recipe.Variable#getValue()
   * @see #getVariable()
   * @generated
   */
  EAttribute getVariable_Value();

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
   * Returns the meta object for the attribute '{@link recipe.ArtifactRef#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see recipe.ArtifactRef#getName()
   * @see #getArtifactRef()
   * @generated
   */
  EAttribute getArtifactRef_Name();

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
  interface Literals
  {
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
     * The meta object literal for the '{@link recipe.impl.RecipeImpl <em>Recipe</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see recipe.impl.RecipeImpl
     * @see recipe.impl.RecipePackageImpl#getRecipe()
     * @generated
     */
    EClass RECIPE = eINSTANCE.getRecipe();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RECIPE__NAME = eINSTANCE.getRecipe_Name();

    /**
     * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RECIPE__COMPONENTS = eINSTANCE.getRecipe_Components();

    /**
     * The meta object literal for the '<em><b>Recipe Config</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RECIPE__RECIPE_CONFIG = eINSTANCE.getRecipe_RecipeConfig();

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
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPONENT__NAME = eINSTANCE.getComponent_Name();

    /**
     * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT__COMPONENTS = eINSTANCE.getComponent_Components();

    /**
     * The meta object literal for the '<em><b>Mappers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT__MAPPERS = eINSTANCE.getComponent_Mappers();

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
     * The meta object literal for the '<em><b>Artifact Ref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_MAPPER__ARTIFACT_REF = eINSTANCE.getModelMapper_ArtifactRef();

    /**
     * The meta object literal for the '<em><b>Specifiers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_MAPPER__SPECIFIERS = eINSTANCE.getModelMapper_Specifiers();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_MAPPER__VARIABLES = eINSTANCE.getModelMapper_Variables();

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
     * The meta object literal for the '<em><b>Config Extension</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONFIGURATION__CONFIG_EXTENSION = eINSTANCE.getConfiguration_ConfigExtension();

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
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY__NAME = eINSTANCE.getProperty_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY__VALUE = eINSTANCE.getProperty_Value();

    /**
     * The meta object literal for the '{@link recipe.impl.SpecifierImpl <em>Specifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see recipe.impl.SpecifierImpl
     * @see recipe.impl.RecipePackageImpl#getSpecifier()
     * @generated
     */
    EClass SPECIFIER = eINSTANCE.getSpecifier();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SPECIFIER__NAME = eINSTANCE.getSpecifier_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SPECIFIER__VALUE = eINSTANCE.getSpecifier_Value();

    /**
     * The meta object literal for the '{@link recipe.impl.VariableImpl <em>Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see recipe.impl.VariableImpl
     * @see recipe.impl.RecipePackageImpl#getVariable()
     * @generated
     */
    EClass VARIABLE = eINSTANCE.getVariable();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE__VALUE = eINSTANCE.getVariable_Value();

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
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARTIFACT_REF__NAME = eINSTANCE.getArtifactRef_Name();

  }

} //RecipePackage
