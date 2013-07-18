/**
 */
package artifact.impl;

import application.ApplicationPackage;
import application.impl.ApplicationPackageImpl;
import artifact.Artifact;
import artifact.ArtifactFactory;
import artifact.ArtifactPackage;
import artifact.Artifacts;
import artifact.Option;
import artifact.Specifier;
import artifact.Variable;

import businessobjects.BusinessobjectsPackage;
import businessobjects.impl.BusinessobjectsPackageImpl;
import domain.DomainPackage;
import domain.impl.DomainPackageImpl;
import mapper.MapperPackage;
import mapper.impl.MapperPackageImpl;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import typedefinition.TypedefinitionPackage;
import typedefinition.impl.TypedefinitionPackageImpl;
import typesrepository.TypesrepositoryPackage;
import typesrepository.impl.TypesrepositoryPackageImpl;
import recipe.RecipePackage;

import recipe.impl.RecipePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArtifactPackageImpl extends EPackageImpl implements ArtifactPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass artifactsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass artifactEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass specifierEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass optionEClass = null;

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
   * @see artifact.ArtifactPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private ArtifactPackageImpl()
  {
    super(eNS_URI, ArtifactFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link ArtifactPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static ArtifactPackage init()
  {
    if (isInited) return (ArtifactPackage)EPackage.Registry.INSTANCE.getEPackage(ArtifactPackage.eNS_URI);

    // Obtain or create and register package
    ArtifactPackageImpl theArtifactPackage = (ArtifactPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ArtifactPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ArtifactPackageImpl());

    isInited = true;

    // Obtain or create and register interdependencies
    DomainPackageImpl theDomainPackage = (DomainPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) instanceof DomainPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) : DomainPackage.eINSTANCE);
    TypedefinitionPackageImpl theTypedefinitionPackage = (TypedefinitionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypedefinitionPackage.eNS_URI) instanceof TypedefinitionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypedefinitionPackage.eNS_URI) : TypedefinitionPackage.eINSTANCE);
    BusinessobjectsPackageImpl theBusinessobjectsPackage = (BusinessobjectsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BusinessobjectsPackage.eNS_URI) instanceof BusinessobjectsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BusinessobjectsPackage.eNS_URI) : BusinessobjectsPackage.eINSTANCE);
    RecipePackageImpl theRecipePackage = (RecipePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RecipePackage.eNS_URI) instanceof RecipePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RecipePackage.eNS_URI) : RecipePackage.eINSTANCE);
    MapperPackageImpl theMapperPackage = (MapperPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MapperPackage.eNS_URI) instanceof MapperPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MapperPackage.eNS_URI) : MapperPackage.eINSTANCE);
    TypesrepositoryPackageImpl theTypesrepositoryPackage = (TypesrepositoryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesrepositoryPackage.eNS_URI) instanceof TypesrepositoryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesrepositoryPackage.eNS_URI) : TypesrepositoryPackage.eINSTANCE);
    ApplicationPackageImpl theApplicationPackage = (ApplicationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ApplicationPackage.eNS_URI) instanceof ApplicationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ApplicationPackage.eNS_URI) : ApplicationPackage.eINSTANCE);

    // Create package meta-data objects
    theArtifactPackage.createPackageContents();
    theDomainPackage.createPackageContents();
    theTypedefinitionPackage.createPackageContents();
    theBusinessobjectsPackage.createPackageContents();
    theRecipePackage.createPackageContents();
    theMapperPackage.createPackageContents();
    theTypesrepositoryPackage.createPackageContents();
    theApplicationPackage.createPackageContents();

    // Initialize created meta-data
    theArtifactPackage.initializePackageContents();
    theDomainPackage.initializePackageContents();
    theTypedefinitionPackage.initializePackageContents();
    theBusinessobjectsPackage.initializePackageContents();
    theRecipePackage.initializePackageContents();
    theMapperPackage.initializePackageContents();
    theTypesrepositoryPackage.initializePackageContents();
    theApplicationPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theArtifactPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(ArtifactPackage.eNS_URI, theArtifactPackage);
    return theArtifactPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArtifacts()
  {
    return artifactsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArtifacts_Artifacts()
  {
    return (EReference)artifactsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArtifact()
  {
    return artifactEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArtifact_Name()
  {
    return (EAttribute)artifactEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArtifact_Description()
  {
    return (EAttribute)artifactEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArtifact_ConfigVariables()
  {
    return (EReference)artifactEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArtifact_ModelQuery()
  {
    return (EReference)artifactEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArtifact_Specifiers()
  {
    return (EReference)artifactEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArtifact_Template()
  {
    return (EAttribute)artifactEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariable()
  {
    return variableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariable_Name()
  {
    return (EAttribute)variableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSpecifier()
  {
    return specifierEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSpecifier_Name()
  {
    return (EAttribute)specifierEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSpecifier_Options()
  {
    return (EReference)specifierEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOption()
  {
    return optionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOption_Value()
  {
    return (EAttribute)optionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArtifactFactory getArtifactFactory()
  {
    return (ArtifactFactory)getEFactoryInstance();
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
    artifactsEClass = createEClass(ARTIFACTS);
    createEReference(artifactsEClass, ARTIFACTS__ARTIFACTS);

    artifactEClass = createEClass(ARTIFACT);
    createEAttribute(artifactEClass, ARTIFACT__NAME);
    createEAttribute(artifactEClass, ARTIFACT__DESCRIPTION);
    createEReference(artifactEClass, ARTIFACT__CONFIG_VARIABLES);
    createEReference(artifactEClass, ARTIFACT__MODEL_QUERY);
    createEReference(artifactEClass, ARTIFACT__SPECIFIERS);
    createEAttribute(artifactEClass, ARTIFACT__TEMPLATE);

    variableEClass = createEClass(VARIABLE);
    createEAttribute(variableEClass, VARIABLE__NAME);

    specifierEClass = createEClass(SPECIFIER);
    createEAttribute(specifierEClass, SPECIFIER__NAME);
    createEReference(specifierEClass, SPECIFIER__OPTIONS);

    optionEClass = createEClass(OPTION);
    createEAttribute(optionEClass, OPTION__VALUE);
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

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(artifactsEClass, Artifacts.class, "Artifacts", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getArtifacts_Artifacts(), this.getArtifact(), null, "artifacts", null, 0, -1, Artifacts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(artifactEClass, Artifact.class, "Artifact", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getArtifact_Name(), ecorePackage.getEString(), "name", null, 0, 1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getArtifact_Description(), ecorePackage.getEString(), "description", null, 0, 1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getArtifact_ConfigVariables(), this.getVariable(), null, "configVariables", null, 0, -1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getArtifact_ModelQuery(), this.getVariable(), null, "modelQuery", null, 0, -1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getArtifact_Specifiers(), this.getSpecifier(), null, "specifiers", null, 0, -1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getArtifact_Template(), ecorePackage.getEString(), "template", null, 0, 1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVariable_Name(), ecorePackage.getEString(), "name", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(specifierEClass, Specifier.class, "Specifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSpecifier_Name(), ecorePackage.getEString(), "name", null, 0, 1, Specifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSpecifier_Options(), this.getOption(), null, "options", null, 1, -1, Specifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(optionEClass, Option.class, "Option", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOption_Value(), ecorePackage.getEString(), "value", null, 0, 1, Option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
      (artifactsEClass, 
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
      (artifactEClass, 
       source, 
       new String[] 
       {
       "label", "name"
       });					
    addAnnotation
      (variableEClass, 
       source, 
       new String[] 
       {
       "label", "name"
       });		
    addAnnotation
      (specifierEClass, 
       source, 
       new String[] 
       {
       "label", "name"
       });		
    addAnnotation
      (optionEClass, 
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
      (getArtifact_ConfigVariables(), 
       source, 
       new String[] 
       {
       });		
    addAnnotation
      (getArtifact_ModelQuery(), 
       source, 
       new String[] 
       {
       });		
    addAnnotation
      (getArtifact_Specifiers(), 
       source, 
       new String[] 
       {
       });			
  }

} //ArtifactPackageImpl
