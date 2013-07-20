/**
 */
package mapper.impl;

import application.ApplicationPackage;
import application.impl.ApplicationPackageImpl;
import artifact.ArtifactPackage;
import artifact.impl.ArtifactPackageImpl;
import businessobjects.BusinessobjectsPackage;
import businessobjects.impl.BusinessobjectsPackageImpl;
import domain.DomainPackage;
import domain.impl.DomainPackageImpl;
import mapper.JavaMapper;
import mapper.Mapper;
import mapper.MapperFactory;
import mapper.MapperPackage;
import mapper.Mappers;

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
public class MapperPackageImpl extends EPackageImpl implements MapperPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mappersEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mapperEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass javaMapperEClass = null;

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
   * @see mapper.MapperPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private MapperPackageImpl()
  {
    super(eNS_URI, MapperFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link MapperPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static MapperPackage init()
  {
    if (isInited) return (MapperPackage)EPackage.Registry.INSTANCE.getEPackage(MapperPackage.eNS_URI);

    // Obtain or create and register package
    MapperPackageImpl theMapperPackage = (MapperPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MapperPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MapperPackageImpl());

    isInited = true;

    // Obtain or create and register interdependencies
    TypedefinitionPackageImpl theTypedefinitionPackage = (TypedefinitionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypedefinitionPackage.eNS_URI) instanceof TypedefinitionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypedefinitionPackage.eNS_URI) : TypedefinitionPackage.eINSTANCE);

    // Create package meta-data objects
    theMapperPackage.createPackageContents();
    theTypedefinitionPackage.createPackageContents();

    // Initialize created meta-data
    theMapperPackage.initializePackageContents();
    theTypedefinitionPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theMapperPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(MapperPackage.eNS_URI, theMapperPackage);
    return theMapperPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMappers()
  {
    return mappersEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMappers_Mappers()
  {
    return (EReference)mappersEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMapper()
  {
    return mapperEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getJavaMapper()
  {
    return javaMapperEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJavaMapper_MappedToPackageName()
  {
    return (EAttribute)javaMapperEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJavaMapper_MappedToClassName()
  {
    return (EAttribute)javaMapperEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJavaMapper_ArtifactId()
  {
    return (EAttribute)javaMapperEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJavaMapper_GroupId()
  {
    return (EAttribute)javaMapperEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJavaMapper_Version()
  {
    return (EAttribute)javaMapperEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJavaMapper_LibraryName()
  {
    return (EAttribute)javaMapperEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MapperFactory getMapperFactory()
  {
    return (MapperFactory)getEFactoryInstance();
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
    mappersEClass = createEClass(MAPPERS);
    createEReference(mappersEClass, MAPPERS__MAPPERS);

    mapperEClass = createEClass(MAPPER);

    javaMapperEClass = createEClass(JAVA_MAPPER);
    createEAttribute(javaMapperEClass, JAVA_MAPPER__MAPPED_TO_PACKAGE_NAME);
    createEAttribute(javaMapperEClass, JAVA_MAPPER__MAPPED_TO_CLASS_NAME);
    createEAttribute(javaMapperEClass, JAVA_MAPPER__ARTIFACT_ID);
    createEAttribute(javaMapperEClass, JAVA_MAPPER__GROUP_ID);
    createEAttribute(javaMapperEClass, JAVA_MAPPER__VERSION);
    createEAttribute(javaMapperEClass, JAVA_MAPPER__LIBRARY_NAME);
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

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    mapperEClass.getESuperTypes().add(theTypedefinitionPackage.getTypePointer());
    javaMapperEClass.getESuperTypes().add(this.getMapper());

    // Initialize classes and features; add operations and parameters
    initEClass(mappersEClass, Mappers.class, "Mappers", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMappers_Mappers(), this.getMapper(), null, "mappers", null, 0, -1, Mappers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mapperEClass, Mapper.class, "Mapper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(javaMapperEClass, JavaMapper.class, "JavaMapper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getJavaMapper_MappedToPackageName(), ecorePackage.getEString(), "mappedToPackageName", null, 0, 1, JavaMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getJavaMapper_MappedToClassName(), ecorePackage.getEString(), "mappedToClassName", null, 0, 1, JavaMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getJavaMapper_ArtifactId(), ecorePackage.getEString(), "artifactId", null, 0, 1, JavaMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getJavaMapper_GroupId(), ecorePackage.getEString(), "groupId", null, 0, 1, JavaMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getJavaMapper_Version(), ecorePackage.getEString(), "version", null, 0, 1, JavaMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getJavaMapper_LibraryName(), ecorePackage.getEString(), "libraryName", null, 0, 1, JavaMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
      (mappersEClass, 
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
      (javaMapperEClass, 
       source, 
       new String[] 
       {
       "label", "packageName"
       });
  }

} //MapperPackageImpl
