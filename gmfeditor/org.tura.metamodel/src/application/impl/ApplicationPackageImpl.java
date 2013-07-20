/**
 */
package application.impl;

import application.Application;
import application.ApplicationFactory;
import application.ApplicationMapper;
import application.ApplicationMappers;
import application.ApplicationPackage;
import application.ApplicationRecipe;
import application.ApplicationRecipes;
import application.Dummy5;

import mapper.MapperPackage;

import mapper.impl.MapperPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import recipe.RecipePackage;

import recipe.impl.RecipePackageImpl;

import typedefinition.TypedefinitionPackage;

import typedefinition.impl.TypedefinitionPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApplicationPackageImpl extends EPackageImpl implements ApplicationPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass applicationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dummy5EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass applicationRecipesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass applicationRecipeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass applicationMappersEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass applicationMapperEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see application.ApplicationPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private ApplicationPackageImpl()
  {
    super(eNS_URI, ApplicationFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link ApplicationPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static ApplicationPackage init()
  {
    if (isInited) return (ApplicationPackage)EPackage.Registry.INSTANCE.getEPackage(ApplicationPackage.eNS_URI);

    // Obtain or create and register package
    ApplicationPackageImpl theApplicationPackage = (ApplicationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ApplicationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ApplicationPackageImpl());

    isInited = true;

    // Obtain or create and register interdependencies
    TypedefinitionPackageImpl theTypedefinitionPackage = (TypedefinitionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypedefinitionPackage.eNS_URI) instanceof TypedefinitionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypedefinitionPackage.eNS_URI) : TypedefinitionPackage.eINSTANCE);
    RecipePackageImpl theRecipePackage = (RecipePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RecipePackage.eNS_URI) instanceof RecipePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RecipePackage.eNS_URI) : RecipePackage.eINSTANCE);
    MapperPackageImpl theMapperPackage = (MapperPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MapperPackage.eNS_URI) instanceof MapperPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MapperPackage.eNS_URI) : MapperPackage.eINSTANCE);

    // Create package meta-data objects
    theApplicationPackage.createPackageContents();
    theTypedefinitionPackage.createPackageContents();
    theRecipePackage.createPackageContents();
    theMapperPackage.createPackageContents();

    // Initialize created meta-data
    theApplicationPackage.initializePackageContents();
    theTypedefinitionPackage.initializePackageContents();
    theRecipePackage.initializePackageContents();
    theMapperPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theApplicationPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(ApplicationPackage.eNS_URI, theApplicationPackage);
    return theApplicationPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getApplication()
  {
    return applicationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getApplication_ApplicationRecipes()
  {
    return (EReference)applicationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getApplication_ApplicationMappers()
  {
    return (EReference)applicationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDummy5()
  {
    return dummy5EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getApplicationRecipes()
  {
    return applicationRecipesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getApplicationRecipes_Name()
  {
    return (EAttribute)applicationRecipesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getApplicationRecipes_Recipes()
  {
    return (EReference)applicationRecipesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getApplicationRecipe()
  {
    return applicationRecipeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getApplicationRecipe_Name()
  {
    return (EAttribute)applicationRecipeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getApplicationRecipe_Recipes()
  {
    return (EReference)applicationRecipeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getApplicationMappers()
  {
    return applicationMappersEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getApplicationMappers_Name()
  {
    return (EAttribute)applicationMappersEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getApplicationMappers_Mappers()
  {
    return (EReference)applicationMappersEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getApplicationMapper()
  {
    return applicationMapperEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getApplicationMapper_Name()
  {
    return (EAttribute)applicationMapperEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getApplicationMapper_Mapper()
  {
    return (EReference)applicationMapperEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ApplicationFactory getApplicationFactory()
  {
    return (ApplicationFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    applicationEClass = createEClass(APPLICATION);
    createEReference(applicationEClass, APPLICATION__APPLICATION_RECIPES);
    createEReference(applicationEClass, APPLICATION__APPLICATION_MAPPERS);

    dummy5EClass = createEClass(DUMMY5);

    applicationRecipesEClass = createEClass(APPLICATION_RECIPES);
    createEAttribute(applicationRecipesEClass, APPLICATION_RECIPES__NAME);
    createEReference(applicationRecipesEClass, APPLICATION_RECIPES__RECIPES);

    applicationRecipeEClass = createEClass(APPLICATION_RECIPE);
    createEAttribute(applicationRecipeEClass, APPLICATION_RECIPE__NAME);
    createEReference(applicationRecipeEClass, APPLICATION_RECIPE__RECIPES);

    applicationMappersEClass = createEClass(APPLICATION_MAPPERS);
    createEAttribute(applicationMappersEClass, APPLICATION_MAPPERS__NAME);
    createEReference(applicationMappersEClass, APPLICATION_MAPPERS__MAPPERS);

    applicationMapperEClass = createEClass(APPLICATION_MAPPER);
    createEAttribute(applicationMapperEClass, APPLICATION_MAPPER__NAME);
    createEReference(applicationMapperEClass, APPLICATION_MAPPER__MAPPER);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    TypedefinitionPackage theTypedefinitionPackage = (TypedefinitionPackage)EPackage.Registry.INSTANCE.getEPackage(TypedefinitionPackage.eNS_URI);
    RecipePackage theRecipePackage = (RecipePackage)EPackage.Registry.INSTANCE.getEPackage(RecipePackage.eNS_URI);
    MapperPackage theMapperPackage = (MapperPackage)EPackage.Registry.INSTANCE.getEPackage(MapperPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    dummy5EClass.getESuperTypes().add(theTypedefinitionPackage.getTypeDefinition());

    // Initialize classes and features; add operations and parameters
    initEClass(applicationEClass, Application.class, "Application", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getApplication_ApplicationRecipes(), this.getApplicationRecipes(), null, "applicationRecipes", null, 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getApplication_ApplicationMappers(), this.getApplicationMappers(), null, "applicationMappers", null, 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dummy5EClass, Dummy5.class, "Dummy5", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(applicationRecipesEClass, ApplicationRecipes.class, "ApplicationRecipes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getApplicationRecipes_Name(), ecorePackage.getEString(), "name", null, 0, 1, ApplicationRecipes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getApplicationRecipes_Recipes(), this.getApplicationRecipe(), null, "recipes", null, 0, -1, ApplicationRecipes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(applicationRecipeEClass, ApplicationRecipe.class, "ApplicationRecipe", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getApplicationRecipe_Name(), ecorePackage.getEString(), "name", null, 0, 1, ApplicationRecipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getApplicationRecipe_Recipes(), theRecipePackage.getRecipes(), null, "recipes", null, 0, 1, ApplicationRecipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(applicationMappersEClass, ApplicationMappers.class, "ApplicationMappers", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getApplicationMappers_Name(), ecorePackage.getEString(), "name", null, 0, 1, ApplicationMappers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getApplicationMappers_Mappers(), this.getApplicationMapper(), null, "mappers", null, 0, -1, ApplicationMappers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(applicationMapperEClass, ApplicationMapper.class, "ApplicationMapper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getApplicationMapper_Name(), ecorePackage.getEString(), "name", null, 0, 1, ApplicationMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getApplicationMapper_Mapper(), theMapperPackage.getMappers(), null, "mapper", null, 0, 1, ApplicationMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);

    // Create annotations
    // gmf
    createGmfAnnotations();
    // gmf.diagram
    createGmf_1Annotations();
    // gmf.node
    createGmf_2Annotations();
    // gmf.compartment
    createGmf_3Annotations();
  }

  /**
   * Initializes the annotations for <b>gmf</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmfAnnotations()
  {
    String source = "gmf";		
    addAnnotation
      (this, 
       source, 
       new String[] 
       {
       });							
  }

  /**
   * Initializes the annotations for <b>gmf.diagram</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmf_1Annotations()
  {
    String source = "gmf.diagram";			
    addAnnotation
      (applicationEClass, 
       source, 
       new String[] 
       {
       });						
  }

  /**
   * Initializes the annotations for <b>gmf.node</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmf_2Annotations()
  {
    String source = "gmf.node";				
    addAnnotation
      (applicationRecipesEClass, 
       source, 
       new String[] 
       {
       "label", "name"
       });			
    addAnnotation
      (applicationRecipeEClass, 
       source, 
       new String[] 
       {
       "label", "name"
       });		
    addAnnotation
      (applicationMappersEClass, 
       source, 
       new String[] 
       {
       "label", "name"
       });			
    addAnnotation
      (applicationMapperEClass, 
       source, 
       new String[] 
       {
       "label", "name"
       });
  }

  /**
   * Initializes the annotations for <b>gmf.compartment</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmf_3Annotations()
  {
    String source = "gmf.compartment";					
    addAnnotation
      (getApplicationRecipes_Recipes(), 
       source, 
       new String[] 
       {
       });				
    addAnnotation
      (getApplicationMappers_Mappers(), 
       source, 
       new String[] 
       {
       });	
  }

} //ApplicationPackageImpl
