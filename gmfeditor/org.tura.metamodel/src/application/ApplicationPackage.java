/**
 */
package application;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import typedefinition.TypedefinitionPackage;

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
 * @see application.ApplicationFactory
 * @model kind="package"
 * @generated
 */
public interface ApplicationPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "application";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://tura.org/2013/v1/application";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "tura.application";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ApplicationPackage eINSTANCE = application.impl.ApplicationPackageImpl.init();

  /**
   * The meta object id for the '{@link application.impl.ApplicationImpl <em>Application</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see application.impl.ApplicationImpl
   * @see application.impl.ApplicationPackageImpl#getApplication()
   * @generated
   */
  int APPLICATION = 0;

  /**
   * The feature id for the '<em><b>Application Recipes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__APPLICATION_RECIPES = 0;

  /**
   * The feature id for the '<em><b>Application Mappers</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__APPLICATION_MAPPERS = 1;

  /**
   * The number of structural features of the '<em>Application</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link application.impl.Dummy5Impl <em>Dummy5</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see application.impl.Dummy5Impl
   * @see application.impl.ApplicationPackageImpl#getDummy5()
   * @generated
   */
  int DUMMY5 = 1;

  /**
   * The feature id for the '<em><b>D5</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUMMY5__D5 = 0;

  /**
   * The number of structural features of the '<em>Dummy5</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUMMY5_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link application.impl.ApplicationRecipesImpl <em>Recipes</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see application.impl.ApplicationRecipesImpl
   * @see application.impl.ApplicationPackageImpl#getApplicationRecipes()
   * @generated
   */
  int APPLICATION_RECIPES = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_RECIPES__NAME = 0;

  /**
   * The feature id for the '<em><b>Recipes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_RECIPES__RECIPES = 1;

  /**
   * The number of structural features of the '<em>Recipes</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_RECIPES_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link application.impl.ApplicationRecipeImpl <em>Recipe</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see application.impl.ApplicationRecipeImpl
   * @see application.impl.ApplicationPackageImpl#getApplicationRecipe()
   * @generated
   */
  int APPLICATION_RECIPE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_RECIPE__NAME = 0;

  /**
   * The feature id for the '<em><b>Recipes</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_RECIPE__RECIPES = 1;

  /**
   * The number of structural features of the '<em>Recipe</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_RECIPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link application.impl.ApplicationMappersImpl <em>Mappers</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see application.impl.ApplicationMappersImpl
   * @see application.impl.ApplicationPackageImpl#getApplicationMappers()
   * @generated
   */
  int APPLICATION_MAPPERS = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_MAPPERS__NAME = 0;

  /**
   * The feature id for the '<em><b>Mappers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_MAPPERS__MAPPERS = 1;

  /**
   * The number of structural features of the '<em>Mappers</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_MAPPERS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link application.impl.ApplicationMapperImpl <em>Mapper</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see application.impl.ApplicationMapperImpl
   * @see application.impl.ApplicationPackageImpl#getApplicationMapper()
   * @generated
   */
  int APPLICATION_MAPPER = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_MAPPER__NAME = 0;

  /**
   * The feature id for the '<em><b>Mapper</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_MAPPER__MAPPER = 1;

  /**
   * The number of structural features of the '<em>Mapper</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_MAPPER_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link application.Application <em>Application</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Application</em>'.
   * @see application.Application
   * @generated
   */
  EClass getApplication();

  /**
   * Returns the meta object for the containment reference '{@link application.Application#getApplicationRecipes <em>Application Recipes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Application Recipes</em>'.
   * @see application.Application#getApplicationRecipes()
   * @see #getApplication()
   * @generated
   */
  EReference getApplication_ApplicationRecipes();

  /**
   * Returns the meta object for the containment reference '{@link application.Application#getApplicationMappers <em>Application Mappers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Application Mappers</em>'.
   * @see application.Application#getApplicationMappers()
   * @see #getApplication()
   * @generated
   */
  EReference getApplication_ApplicationMappers();

  /**
   * Returns the meta object for class '{@link application.Dummy5 <em>Dummy5</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dummy5</em>'.
   * @see application.Dummy5
   * @generated
   */
  EClass getDummy5();

  /**
   * Returns the meta object for the reference '{@link application.Dummy5#getD5 <em>D5</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>D5</em>'.
   * @see application.Dummy5#getD5()
   * @see #getDummy5()
   * @generated
   */
  EReference getDummy5_D5();

  /**
   * Returns the meta object for class '{@link application.ApplicationRecipes <em>Recipes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Recipes</em>'.
   * @see application.ApplicationRecipes
   * @generated
   */
  EClass getApplicationRecipes();

  /**
   * Returns the meta object for the attribute '{@link application.ApplicationRecipes#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see application.ApplicationRecipes#getName()
   * @see #getApplicationRecipes()
   * @generated
   */
  EAttribute getApplicationRecipes_Name();

  /**
   * Returns the meta object for the containment reference list '{@link application.ApplicationRecipes#getRecipes <em>Recipes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Recipes</em>'.
   * @see application.ApplicationRecipes#getRecipes()
   * @see #getApplicationRecipes()
   * @generated
   */
  EReference getApplicationRecipes_Recipes();

  /**
   * Returns the meta object for class '{@link application.ApplicationRecipe <em>Recipe</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Recipe</em>'.
   * @see application.ApplicationRecipe
   * @generated
   */
  EClass getApplicationRecipe();

  /**
   * Returns the meta object for the attribute '{@link application.ApplicationRecipe#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see application.ApplicationRecipe#getName()
   * @see #getApplicationRecipe()
   * @generated
   */
  EAttribute getApplicationRecipe_Name();

  /**
   * Returns the meta object for the reference '{@link application.ApplicationRecipe#getRecipes <em>Recipes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Recipes</em>'.
   * @see application.ApplicationRecipe#getRecipes()
   * @see #getApplicationRecipe()
   * @generated
   */
  EReference getApplicationRecipe_Recipes();

  /**
   * Returns the meta object for class '{@link application.ApplicationMappers <em>Mappers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mappers</em>'.
   * @see application.ApplicationMappers
   * @generated
   */
  EClass getApplicationMappers();

  /**
   * Returns the meta object for the attribute '{@link application.ApplicationMappers#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see application.ApplicationMappers#getName()
   * @see #getApplicationMappers()
   * @generated
   */
  EAttribute getApplicationMappers_Name();

  /**
   * Returns the meta object for the containment reference list '{@link application.ApplicationMappers#getMappers <em>Mappers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Mappers</em>'.
   * @see application.ApplicationMappers#getMappers()
   * @see #getApplicationMappers()
   * @generated
   */
  EReference getApplicationMappers_Mappers();

  /**
   * Returns the meta object for class '{@link application.ApplicationMapper <em>Mapper</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mapper</em>'.
   * @see application.ApplicationMapper
   * @generated
   */
  EClass getApplicationMapper();

  /**
   * Returns the meta object for the attribute '{@link application.ApplicationMapper#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see application.ApplicationMapper#getName()
   * @see #getApplicationMapper()
   * @generated
   */
  EAttribute getApplicationMapper_Name();

  /**
   * Returns the meta object for the reference '{@link application.ApplicationMapper#getMapper <em>Mapper</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Mapper</em>'.
   * @see application.ApplicationMapper#getMapper()
   * @see #getApplicationMapper()
   * @generated
   */
  EReference getApplicationMapper_Mapper();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ApplicationFactory getApplicationFactory();

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
     * The meta object literal for the '{@link application.impl.ApplicationImpl <em>Application</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see application.impl.ApplicationImpl
     * @see application.impl.ApplicationPackageImpl#getApplication()
     * @generated
     */
    EClass APPLICATION = eINSTANCE.getApplication();

    /**
     * The meta object literal for the '<em><b>Application Recipes</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLICATION__APPLICATION_RECIPES = eINSTANCE.getApplication_ApplicationRecipes();

    /**
     * The meta object literal for the '<em><b>Application Mappers</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLICATION__APPLICATION_MAPPERS = eINSTANCE.getApplication_ApplicationMappers();

    /**
     * The meta object literal for the '{@link application.impl.Dummy5Impl <em>Dummy5</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see application.impl.Dummy5Impl
     * @see application.impl.ApplicationPackageImpl#getDummy5()
     * @generated
     */
    EClass DUMMY5 = eINSTANCE.getDummy5();

    /**
     * The meta object literal for the '<em><b>D5</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DUMMY5__D5 = eINSTANCE.getDummy5_D5();

    /**
     * The meta object literal for the '{@link application.impl.ApplicationRecipesImpl <em>Recipes</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see application.impl.ApplicationRecipesImpl
     * @see application.impl.ApplicationPackageImpl#getApplicationRecipes()
     * @generated
     */
    EClass APPLICATION_RECIPES = eINSTANCE.getApplicationRecipes();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute APPLICATION_RECIPES__NAME = eINSTANCE.getApplicationRecipes_Name();

    /**
     * The meta object literal for the '<em><b>Recipes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLICATION_RECIPES__RECIPES = eINSTANCE.getApplicationRecipes_Recipes();

    /**
     * The meta object literal for the '{@link application.impl.ApplicationRecipeImpl <em>Recipe</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see application.impl.ApplicationRecipeImpl
     * @see application.impl.ApplicationPackageImpl#getApplicationRecipe()
     * @generated
     */
    EClass APPLICATION_RECIPE = eINSTANCE.getApplicationRecipe();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute APPLICATION_RECIPE__NAME = eINSTANCE.getApplicationRecipe_Name();

    /**
     * The meta object literal for the '<em><b>Recipes</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLICATION_RECIPE__RECIPES = eINSTANCE.getApplicationRecipe_Recipes();

    /**
     * The meta object literal for the '{@link application.impl.ApplicationMappersImpl <em>Mappers</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see application.impl.ApplicationMappersImpl
     * @see application.impl.ApplicationPackageImpl#getApplicationMappers()
     * @generated
     */
    EClass APPLICATION_MAPPERS = eINSTANCE.getApplicationMappers();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute APPLICATION_MAPPERS__NAME = eINSTANCE.getApplicationMappers_Name();

    /**
     * The meta object literal for the '<em><b>Mappers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLICATION_MAPPERS__MAPPERS = eINSTANCE.getApplicationMappers_Mappers();

    /**
     * The meta object literal for the '{@link application.impl.ApplicationMapperImpl <em>Mapper</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see application.impl.ApplicationMapperImpl
     * @see application.impl.ApplicationPackageImpl#getApplicationMapper()
     * @generated
     */
    EClass APPLICATION_MAPPER = eINSTANCE.getApplicationMapper();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute APPLICATION_MAPPER__NAME = eINSTANCE.getApplicationMapper_Name();

    /**
     * The meta object literal for the '<em><b>Mapper</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLICATION_MAPPER__MAPPER = eINSTANCE.getApplicationMapper_Mapper();

  }

} //ApplicationPackage
