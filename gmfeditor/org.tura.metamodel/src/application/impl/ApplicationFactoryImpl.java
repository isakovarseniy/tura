/**
 */
package application.impl;

import application.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApplicationFactoryImpl extends EFactoryImpl implements ApplicationFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ApplicationFactory init()
  {
    try
    {
      ApplicationFactory theApplicationFactory = (ApplicationFactory)EPackage.Registry.INSTANCE.getEFactory("http://tura.org/2013/v1/application"); 
      if (theApplicationFactory != null)
      {
        return theApplicationFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ApplicationFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ApplicationFactoryImpl()
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
      case ApplicationPackage.APPLICATION: return createApplication();
      case ApplicationPackage.DUMMY5: return createDummy5();
      case ApplicationPackage.APPLICATION_RECIPES: return createApplicationRecipes();
      case ApplicationPackage.APPLICATION_RECIPE: return createApplicationRecipe();
      case ApplicationPackage.APPLICATION_MAPPERS: return createApplicationMappers();
      case ApplicationPackage.APPLICATION_MAPPER: return createApplicationMapper();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Application createApplication()
  {
    ApplicationImpl application = new ApplicationImpl();
    return application;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Dummy5 createDummy5()
  {
    Dummy5Impl dummy5 = new Dummy5Impl();
    return dummy5;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ApplicationRecipes createApplicationRecipes()
  {
    ApplicationRecipesImpl applicationRecipes = new ApplicationRecipesImpl();
    return applicationRecipes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ApplicationRecipe createApplicationRecipe()
  {
    ApplicationRecipeImpl applicationRecipe = new ApplicationRecipeImpl();
    return applicationRecipe;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ApplicationMappers createApplicationMappers()
  {
    ApplicationMappersImpl applicationMappers = new ApplicationMappersImpl();
    return applicationMappers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ApplicationMapper createApplicationMapper()
  {
    ApplicationMapperImpl applicationMapper = new ApplicationMapperImpl();
    return applicationMapper;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ApplicationPackage getApplicationPackage()
  {
    return (ApplicationPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ApplicationPackage getPackage()
  {
    return ApplicationPackage.eINSTANCE;
  }

} //ApplicationFactoryImpl
