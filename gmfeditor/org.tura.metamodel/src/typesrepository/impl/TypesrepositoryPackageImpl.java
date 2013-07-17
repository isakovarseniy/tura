/**
 */
package typesrepository.impl;

import businessobjects.BusinessobjectsPackage;
import businessobjects.impl.BusinessobjectsPackageImpl;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import typedefinition.TypedefinitionPackage;

import typedefinition.impl.TypedefinitionPackageImpl;

import typesrepository.BusinessPackage;
import typesrepository.Primitive;
import typesrepository.Types;
import typesrepository.TypesRepository;
import typesrepository.TypesrepositoryFactory;
import typesrepository.TypesrepositoryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TypesrepositoryPackageImpl extends EPackageImpl implements TypesrepositoryPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typesRepositoryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass primitiveEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass packageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass businessPackageEClass = null;

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
   * @see typesrepository.TypesrepositoryPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private TypesrepositoryPackageImpl()
  {
    super(eNS_URI, TypesrepositoryFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link TypesrepositoryPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static TypesrepositoryPackage init()
  {
    if (isInited) return (TypesrepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(TypesrepositoryPackage.eNS_URI);

    // Obtain or create and register package
    TypesrepositoryPackageImpl theTypesrepositoryPackage = (TypesrepositoryPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TypesrepositoryPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TypesrepositoryPackageImpl());

    isInited = true;

    // Obtain or create and register interdependencies
    TypedefinitionPackageImpl theTypedefinitionPackage = (TypedefinitionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypedefinitionPackage.eNS_URI) instanceof TypedefinitionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypedefinitionPackage.eNS_URI) : TypedefinitionPackage.eINSTANCE);
    BusinessobjectsPackageImpl theBusinessobjectsPackage = (BusinessobjectsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BusinessobjectsPackage.eNS_URI) instanceof BusinessobjectsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BusinessobjectsPackage.eNS_URI) : BusinessobjectsPackage.eINSTANCE);

    // Create package meta-data objects
    theTypesrepositoryPackage.createPackageContents();
    theTypedefinitionPackage.createPackageContents();
    theBusinessobjectsPackage.createPackageContents();

    // Initialize created meta-data
    theTypesrepositoryPackage.initializePackageContents();
    theTypedefinitionPackage.initializePackageContents();
    theBusinessobjectsPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theTypesrepositoryPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(TypesrepositoryPackage.eNS_URI, theTypesrepositoryPackage);
    return theTypesrepositoryPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypesRepository()
  {
    return typesRepositoryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypesRepository_TypeDefinition()
  {
    return (EReference)typesRepositoryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypes()
  {
    return typesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypes_Name()
  {
    return (EAttribute)typesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypes_Primitives()
  {
    return (EReference)typesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypes_Packages()
  {
    return (EReference)typesEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypes_BusinessPackages()
  {
    return (EReference)typesEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPrimitive()
  {
    return primitiveEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPrimitive_Name()
  {
    return (EAttribute)primitiveEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPackage()
  {
    return packageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPackage_Name()
  {
    return (EAttribute)packageEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPackage_Typedefinition()
  {
    return (EReference)packageEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBusinessPackage()
  {
    return businessPackageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBusinessPackage_Name()
  {
    return (EAttribute)businessPackageEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBusinessPackage_Businessobjects()
  {
    return (EReference)businessPackageEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypesrepositoryFactory getTypesrepositoryFactory()
  {
    return (TypesrepositoryFactory)getEFactoryInstance();
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
    typesRepositoryEClass = createEClass(TYPES_REPOSITORY);
    createEReference(typesRepositoryEClass, TYPES_REPOSITORY__TYPE_DEFINITION);

    typesEClass = createEClass(TYPES);
    createEAttribute(typesEClass, TYPES__NAME);
    createEReference(typesEClass, TYPES__PRIMITIVES);
    createEReference(typesEClass, TYPES__PACKAGES);
    createEReference(typesEClass, TYPES__BUSINESS_PACKAGES);

    primitiveEClass = createEClass(PRIMITIVE);
    createEAttribute(primitiveEClass, PRIMITIVE__NAME);

    packageEClass = createEClass(PACKAGE);
    createEAttribute(packageEClass, PACKAGE__NAME);
    createEReference(packageEClass, PACKAGE__TYPEDEFINITION);

    businessPackageEClass = createEClass(BUSINESS_PACKAGE);
    createEAttribute(businessPackageEClass, BUSINESS_PACKAGE__NAME);
    createEReference(businessPackageEClass, BUSINESS_PACKAGE__BUSINESSOBJECTS);
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

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(typesRepositoryEClass, TypesRepository.class, "TypesRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTypesRepository_TypeDefinition(), this.getTypes(), null, "typeDefinition", null, 1, 1, TypesRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typesEClass, Types.class, "Types", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTypes_Name(), ecorePackage.getEString(), "name", null, 0, 1, Types.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypes_Primitives(), this.getPrimitive(), null, "primitives", null, 0, -1, Types.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypes_Packages(), this.getPackage(), null, "packages", null, 0, -1, Types.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypes_BusinessPackages(), this.getBusinessPackage(), null, "businessPackages", null, 0, -1, Types.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(primitiveEClass, Primitive.class, "Primitive", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPrimitive_Name(), ecorePackage.getEString(), "name", null, 0, 1, Primitive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(packageEClass, typesrepository.Package.class, "Package", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPackage_Name(), ecorePackage.getEString(), "name", null, 0, 1, typesrepository.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPackage_Typedefinition(), theTypedefinitionPackage.getTypeDefinition(), null, "typedefinition", null, 0, 1, typesrepository.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(businessPackageEClass, BusinessPackage.class, "BusinessPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBusinessPackage_Name(), ecorePackage.getEString(), "name", null, 0, 1, BusinessPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBusinessPackage_Businessobjects(), theBusinessobjectsPackage.getBusinessObjects(), null, "businessobjects", null, 0, 1, BusinessPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
      (typesRepositoryEClass, 
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
      (typesEClass, 
       source, 
       new String[] 
       {
       "label", "name"
       });					
    addAnnotation
      (primitiveEClass, 
       source, 
       new String[] 
       {
       "label", "name"
       });		
    addAnnotation
      (packageEClass, 
       source, 
       new String[] 
       {
       "label", "name"
       });		
    addAnnotation
      (businessPackageEClass, 
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
      (getTypes_Primitives(), 
       source, 
       new String[] 
       {
       });		
    addAnnotation
      (getTypes_Packages(), 
       source, 
       new String[] 
       {
       });		
    addAnnotation
      (getTypes_BusinessPackages(), 
       source, 
       new String[] 
       {
       });			
  }

} //TypesrepositoryPackageImpl
