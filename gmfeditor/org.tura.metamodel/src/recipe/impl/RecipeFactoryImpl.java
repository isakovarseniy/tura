/**
 */
package recipe.impl;

import org.eclipse.emf.ecore.EClass;
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
public class RecipeFactoryImpl extends EFactoryImpl implements RecipeFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static RecipeFactory init()
  {
    try
    {
      RecipeFactory theRecipeFactory = (RecipeFactory)EPackage.Registry.INSTANCE.getEFactory("http://tura.org/2013/v1/recipe"); 
      if (theRecipeFactory != null)
      {
        return theRecipeFactory;
      }
    }
    catch (Exception exception)
    {
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
  public RecipeFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case RecipePackage.RECIPES: return createRecipes();
      case RecipePackage.RECIPE: return createRecipe();
      case RecipePackage.COMPONENT: return createComponent();
      case RecipePackage.MODEL_MAPPER: return createModelMapper();
      case RecipePackage.CONFIGURATION: return createConfiguration();
      case RecipePackage.PROPERTY: return createProperty();
      case RecipePackage.SPECIFIER: return createSpecifier();
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
  public Recipes createRecipes()
  {
    RecipesImpl recipes = new RecipesImpl();
    return recipes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Recipe createRecipe()
  {
    RecipeImpl recipe = new RecipeImpl();
    return recipe;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Component createComponent()
  {
    ComponentImpl component = new ComponentImpl();
    return component;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelMapper createModelMapper()
  {
    ModelMapperImpl modelMapper = new ModelMapperImpl();
    return modelMapper;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Configuration createConfiguration()
  {
    ConfigurationImpl configuration = new ConfigurationImpl();
    return configuration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Property createProperty()
  {
    PropertyImpl property = new PropertyImpl();
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Specifier createSpecifier()
  {
    SpecifierImpl specifier = new SpecifierImpl();
    return specifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArtifactRef createArtifactRef()
  {
    ArtifactRefImpl artifactRef = new ArtifactRefImpl();
    return artifactRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RecipePackage getRecipePackage()
  {
    return (RecipePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static RecipePackage getPackage()
  {
    return RecipePackage.eINSTANCE;
  }

} //RecipeFactoryImpl
