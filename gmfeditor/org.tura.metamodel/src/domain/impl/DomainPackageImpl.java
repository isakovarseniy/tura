/**
 */
package domain.impl;

import application.ApplicationPackage;
import application.impl.ApplicationPackageImpl;
import artifact.ArtifactPackage;
import artifact.impl.ArtifactPackageImpl;
import businessobjects.BusinessobjectsPackage;
import businessobjects.impl.BusinessobjectsPackageImpl;
import domain.Dammy1;
import domain.Dammy2;
import domain.Dammy3;
import domain.Dammy4;
import domain.Domain;
import domain.DomainApplication;
import domain.DomainApplications;
import domain.DomainArtifact;
import domain.DomainArtifacts;
import domain.DomainFactory;
import domain.DomainPackage;

import domain.DomainTypes;
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
import typesrepository.TypesrepositoryPackage;
import typesrepository.impl.TypesrepositoryPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DomainPackageImpl extends EPackageImpl implements DomainPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dammy1EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dammy2EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dammy3EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dammy4EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass domainEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass domainArtifactsEClass = null;
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass domainArtifactEClass = null;
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass domainTypesEClass = null;
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass domainApplicationsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass domainApplicationEClass = null;

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
   * @see domain.DomainPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private DomainPackageImpl()
  {
    super(eNS_URI, DomainFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link DomainPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static DomainPackage init()
  {
    if (isInited) return (DomainPackage)EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI);

    // Obtain or create and register package
    DomainPackageImpl theDomainPackage = (DomainPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DomainPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DomainPackageImpl());

    isInited = true;

    // Obtain or create and register interdependencies
    TypedefinitionPackageImpl theTypedefinitionPackage = (TypedefinitionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypedefinitionPackage.eNS_URI) instanceof TypedefinitionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypedefinitionPackage.eNS_URI) : TypedefinitionPackage.eINSTANCE);
    BusinessobjectsPackageImpl theBusinessobjectsPackage = (BusinessobjectsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BusinessobjectsPackage.eNS_URI) instanceof BusinessobjectsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BusinessobjectsPackage.eNS_URI) : BusinessobjectsPackage.eINSTANCE);
    RecipePackageImpl theRecipePackage = (RecipePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RecipePackage.eNS_URI) instanceof RecipePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RecipePackage.eNS_URI) : RecipePackage.eINSTANCE);
    MapperPackageImpl theMapperPackage = (MapperPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MapperPackage.eNS_URI) instanceof MapperPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MapperPackage.eNS_URI) : MapperPackage.eINSTANCE);
    ArtifactPackageImpl theArtifactPackage = (ArtifactPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ArtifactPackage.eNS_URI) instanceof ArtifactPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ArtifactPackage.eNS_URI) : ArtifactPackage.eINSTANCE);
    TypesrepositoryPackageImpl theTypesrepositoryPackage = (TypesrepositoryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesrepositoryPackage.eNS_URI) instanceof TypesrepositoryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesrepositoryPackage.eNS_URI) : TypesrepositoryPackage.eINSTANCE);
    ApplicationPackageImpl theApplicationPackage = (ApplicationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ApplicationPackage.eNS_URI) instanceof ApplicationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ApplicationPackage.eNS_URI) : ApplicationPackage.eINSTANCE);

    // Create package meta-data objects
    theDomainPackage.createPackageContents();
    theTypedefinitionPackage.createPackageContents();
    theBusinessobjectsPackage.createPackageContents();
    theRecipePackage.createPackageContents();
    theMapperPackage.createPackageContents();
    theArtifactPackage.createPackageContents();
    theTypesrepositoryPackage.createPackageContents();
    theApplicationPackage.createPackageContents();

    // Initialize created meta-data
    theDomainPackage.initializePackageContents();
    theTypedefinitionPackage.initializePackageContents();
    theBusinessobjectsPackage.initializePackageContents();
    theRecipePackage.initializePackageContents();
    theMapperPackage.initializePackageContents();
    theArtifactPackage.initializePackageContents();
    theTypesrepositoryPackage.initializePackageContents();
    theApplicationPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theDomainPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(DomainPackage.eNS_URI, theDomainPackage);
    return theDomainPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDammy1()
  {
    return dammy1EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDammy2()
  {
    return dammy2EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDammy3()
  {
    return dammy3EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDammy4()
  {
    return dammy4EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDomain()
  {
    return domainEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDomain_DomainArtifacts()
  {
    return (EReference)domainEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDomain_DomainTypes()
  {
    return (EReference)domainEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDomain_DomainApplications()
  {
    return (EReference)domainEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDomainArtifacts()
  {
    return domainArtifactsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDomainArtifacts_Name()
  {
    return (EAttribute)domainArtifactsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDomainArtifacts_Artifacrs()
  {
    return (EReference)domainArtifactsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDomainArtifact()
  {
    return domainArtifactEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDomainArtifact_Name()
  {
    return (EAttribute)domainArtifactEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDomainArtifact_Artifact()
  {
    return (EReference)domainArtifactEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDomainTypes()
  {
    return domainTypesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDomainTypes_Name()
  {
    return (EAttribute)domainTypesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDomainTypes_Typesrepository()
  {
    return (EReference)domainTypesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDomainApplications()
  {
    return domainApplicationsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDomainApplications_Name()
  {
    return (EAttribute)domainApplicationsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDomainApplications_Applications()
  {
    return (EReference)domainApplicationsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDomainApplication()
  {
    return domainApplicationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDomainApplication_Name()
  {
    return (EAttribute)domainApplicationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDomainApplication_Application()
  {
    return (EReference)domainApplicationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomainFactory getDomainFactory()
  {
    return (DomainFactory)getEFactoryInstance();
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
    dammy1EClass = createEClass(DAMMY1);

    dammy2EClass = createEClass(DAMMY2);

    dammy3EClass = createEClass(DAMMY3);

    dammy4EClass = createEClass(DAMMY4);

    domainEClass = createEClass(DOMAIN);
    createEReference(domainEClass, DOMAIN__DOMAIN_ARTIFACTS);
    createEReference(domainEClass, DOMAIN__DOMAIN_TYPES);
    createEReference(domainEClass, DOMAIN__DOMAIN_APPLICATIONS);

    domainArtifactsEClass = createEClass(DOMAIN_ARTIFACTS);
    createEAttribute(domainArtifactsEClass, DOMAIN_ARTIFACTS__NAME);
    createEReference(domainArtifactsEClass, DOMAIN_ARTIFACTS__ARTIFACRS);

    domainArtifactEClass = createEClass(DOMAIN_ARTIFACT);
    createEAttribute(domainArtifactEClass, DOMAIN_ARTIFACT__NAME);
    createEReference(domainArtifactEClass, DOMAIN_ARTIFACT__ARTIFACT);

    domainTypesEClass = createEClass(DOMAIN_TYPES);
    createEAttribute(domainTypesEClass, DOMAIN_TYPES__NAME);
    createEReference(domainTypesEClass, DOMAIN_TYPES__TYPESREPOSITORY);

    domainApplicationsEClass = createEClass(DOMAIN_APPLICATIONS);
    createEAttribute(domainApplicationsEClass, DOMAIN_APPLICATIONS__NAME);
    createEReference(domainApplicationsEClass, DOMAIN_APPLICATIONS__APPLICATIONS);

    domainApplicationEClass = createEClass(DOMAIN_APPLICATION);
    createEAttribute(domainApplicationEClass, DOMAIN_APPLICATION__NAME);
    createEReference(domainApplicationEClass, DOMAIN_APPLICATION__APPLICATION);
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
    BusinessobjectsPackage theBusinessobjectsPackage = (BusinessobjectsPackage)EPackage.Registry.INSTANCE.getEPackage(BusinessobjectsPackage.eNS_URI);
    RecipePackage theRecipePackage = (RecipePackage)EPackage.Registry.INSTANCE.getEPackage(RecipePackage.eNS_URI);
    MapperPackage theMapperPackage = (MapperPackage)EPackage.Registry.INSTANCE.getEPackage(MapperPackage.eNS_URI);
    ArtifactPackage theArtifactPackage = (ArtifactPackage)EPackage.Registry.INSTANCE.getEPackage(ArtifactPackage.eNS_URI);
    TypesrepositoryPackage theTypesrepositoryPackage = (TypesrepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(TypesrepositoryPackage.eNS_URI);
    ApplicationPackage theApplicationPackage = (ApplicationPackage)EPackage.Registry.INSTANCE.getEPackage(ApplicationPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    dammy1EClass.getESuperTypes().add(theTypedefinitionPackage.getTypeDefinition());
    dammy2EClass.getESuperTypes().add(theBusinessobjectsPackage.getBusinessObjects());
    dammy3EClass.getESuperTypes().add(theRecipePackage.getRecipes());
    dammy4EClass.getESuperTypes().add(theMapperPackage.getMappers());

    // Initialize classes and features; add operations and parameters
    initEClass(dammy1EClass, Dammy1.class, "Dammy1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(dammy2EClass, Dammy2.class, "Dammy2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(dammy3EClass, Dammy3.class, "Dammy3", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(dammy4EClass, Dammy4.class, "Dammy4", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(domainEClass, Domain.class, "Domain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDomain_DomainArtifacts(), this.getDomainArtifacts(), null, "domainArtifacts", null, 1, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDomain_DomainTypes(), this.getDomainTypes(), null, "domainTypes", null, 1, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDomain_DomainApplications(), this.getDomainApplications(), null, "domainApplications", null, 1, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(domainArtifactsEClass, DomainArtifacts.class, "DomainArtifacts", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDomainArtifacts_Name(), ecorePackage.getEString(), "name", null, 0, 1, DomainArtifacts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDomainArtifacts_Artifacrs(), this.getDomainArtifact(), null, "artifacrs", null, 0, 1, DomainArtifacts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(domainArtifactEClass, DomainArtifact.class, "DomainArtifact", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDomainArtifact_Name(), ecorePackage.getEString(), "name", null, 0, 1, DomainArtifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDomainArtifact_Artifact(), theArtifactPackage.getArtifacts(), null, "artifact", null, 0, 1, DomainArtifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(domainTypesEClass, DomainTypes.class, "DomainTypes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDomainTypes_Name(), ecorePackage.getEString(), "name", null, 0, 1, DomainTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDomainTypes_Typesrepository(), theTypesrepositoryPackage.getTypesRepository(), null, "typesrepository", null, 0, 1, DomainTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(domainApplicationsEClass, DomainApplications.class, "DomainApplications", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDomainApplications_Name(), ecorePackage.getEString(), "name", null, 0, 1, DomainApplications.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDomainApplications_Applications(), this.getDomainApplication(), null, "applications", null, 0, -1, DomainApplications.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(domainApplicationEClass, DomainApplication.class, "DomainApplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDomainApplication_Name(), ecorePackage.getEString(), "name", null, 0, 1, DomainApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDomainApplication_Application(), theApplicationPackage.getApplication(), null, "application", null, 0, 1, DomainApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);

    // Create annotations
    // gmf
    createGmfAnnotations();
    // gmf.diagram
    createGmf_1Annotations();
    // gmf.node
    createGmf_2Annotations();
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
      (domainEClass, 
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
      (domainArtifactsEClass, 
       source, 
       new String[] 
       {
       "label", "name"
       });		
    addAnnotation
      (domainArtifactEClass, 
       source, 
       new String[] 
       {
       "label", "name"
       });		
    addAnnotation
      (domainTypesEClass, 
       source, 
       new String[] 
       {
       "label", "name"
       });		
    addAnnotation
      (domainApplicationsEClass, 
       source, 
       new String[] 
       {
       "label", "name"
       });		
    addAnnotation
      (domainApplicationEClass, 
       source, 
       new String[] 
       {
       "label", "name"
       });
  }

} //DomainPackageImpl
