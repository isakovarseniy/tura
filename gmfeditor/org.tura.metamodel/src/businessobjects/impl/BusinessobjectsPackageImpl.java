/**
 */
package businessobjects.impl;

import businessobjects.BusinessMethod;
import businessobjects.BusinessObject;
import businessobjects.BusinessObjects;
import businessobjects.BusinessobjectsFactory;
import businessobjects.BusinessobjectsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.tura.metamodel.commons.types.impl.RefMethodImpl;

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
public class BusinessobjectsPackageImpl extends EPackageImpl implements BusinessobjectsPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass businessObjectsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass businessObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass businessMethodEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType refmethodEDataType = null;

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
   * @see businessobjects.BusinessobjectsPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private BusinessobjectsPackageImpl()
  {
    super(eNS_URI, BusinessobjectsFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link BusinessobjectsPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static BusinessobjectsPackage init()
  {
    if (isInited) return (BusinessobjectsPackage)EPackage.Registry.INSTANCE.getEPackage(BusinessobjectsPackage.eNS_URI);

    // Obtain or create and register package
    BusinessobjectsPackageImpl theBusinessobjectsPackage = (BusinessobjectsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BusinessobjectsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BusinessobjectsPackageImpl());

    isInited = true;

    // Obtain or create and register interdependencies
    TypedefinitionPackageImpl theTypedefinitionPackage = (TypedefinitionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypedefinitionPackage.eNS_URI) instanceof TypedefinitionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypedefinitionPackage.eNS_URI) : TypedefinitionPackage.eINSTANCE);

    // Create package meta-data objects
    theBusinessobjectsPackage.createPackageContents();
    theTypedefinitionPackage.createPackageContents();

    // Initialize created meta-data
    theBusinessobjectsPackage.initializePackageContents();
    theTypedefinitionPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theBusinessobjectsPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(BusinessobjectsPackage.eNS_URI, theBusinessobjectsPackage);
    return theBusinessobjectsPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBusinessObjects()
  {
    return businessObjectsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBusinessObjects_BusinessObject()
  {
    return (EReference)businessObjectsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBusinessObject()
  {
    return businessObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBusinessObject_CreateMethods()
  {
    return (EReference)businessObjectEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBusinessObject_InsertMethods()
  {
    return (EReference)businessObjectEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBusinessObject_UpdaeteMethods()
  {
    return (EReference)businessObjectEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBusinessObject_RemovetMethods()
  {
    return (EReference)businessObjectEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBusinessObject_SearchtMethods()
  {
    return (EReference)businessObjectEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBusinessMethod()
  {
    return businessMethodEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBusinessMethod_Method()
  {
    return (EAttribute)businessMethodEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getrefmethod()
  {
    return refmethodEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BusinessobjectsFactory getBusinessobjectsFactory()
  {
    return (BusinessobjectsFactory)getEFactoryInstance();
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
    businessObjectsEClass = createEClass(BUSINESS_OBJECTS);
    createEReference(businessObjectsEClass, BUSINESS_OBJECTS__BUSINESS_OBJECT);

    businessObjectEClass = createEClass(BUSINESS_OBJECT);
    createEReference(businessObjectEClass, BUSINESS_OBJECT__CREATE_METHODS);
    createEReference(businessObjectEClass, BUSINESS_OBJECT__INSERT_METHODS);
    createEReference(businessObjectEClass, BUSINESS_OBJECT__UPDAETE_METHODS);
    createEReference(businessObjectEClass, BUSINESS_OBJECT__REMOVET_METHODS);
    createEReference(businessObjectEClass, BUSINESS_OBJECT__SEARCHT_METHODS);

    businessMethodEClass = createEClass(BUSINESS_METHOD);
    createEAttribute(businessMethodEClass, BUSINESS_METHOD__METHOD);

    // Create data types
    refmethodEDataType = createEDataType(REFMETHOD);
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
    businessObjectEClass.getESuperTypes().add(theTypedefinitionPackage.getTypePointer());

    // Initialize classes and features; add operations and parameters
    initEClass(businessObjectsEClass, BusinessObjects.class, "BusinessObjects", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBusinessObjects_BusinessObject(), this.getBusinessObject(), null, "businessObject", null, 0, -1, BusinessObjects.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(businessObjectEClass, BusinessObject.class, "BusinessObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBusinessObject_CreateMethods(), this.getBusinessMethod(), null, "createMethods", null, 0, -1, BusinessObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBusinessObject_InsertMethods(), this.getBusinessMethod(), null, "insertMethods", null, 0, -1, BusinessObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBusinessObject_UpdaeteMethods(), this.getBusinessMethod(), null, "updaeteMethods", null, 0, -1, BusinessObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBusinessObject_RemovetMethods(), this.getBusinessMethod(), null, "removetMethods", null, 0, -1, BusinessObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBusinessObject_SearchtMethods(), this.getBusinessMethod(), null, "searchtMethods", null, 0, -1, BusinessObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(businessMethodEClass, BusinessMethod.class, "BusinessMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBusinessMethod_Method(), this.getrefmethod(), "method", null, 0, 1, BusinessMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize data types
    initEDataType(refmethodEDataType, RefMethodImpl.class, "refmethod", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

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
      (businessObjectsEClass, 
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
      (businessObjectEClass, 
       source, 
       new String[] 
       {
       "label", "type"
       });							
    addAnnotation
      (businessMethodEClass, 
       source, 
       new String[] 
       {
       "label", "method"
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
      (getBusinessObject_CreateMethods(), 
       source, 
       new String[] 
       {
       });		
    addAnnotation
      (getBusinessObject_InsertMethods(), 
       source, 
       new String[] 
       {
       });		
    addAnnotation
      (getBusinessObject_UpdaeteMethods(), 
       source, 
       new String[] 
       {
       });		
    addAnnotation
      (getBusinessObject_RemovetMethods(), 
       source, 
       new String[] 
       {
       });		
    addAnnotation
      (getBusinessObject_SearchtMethods(), 
       source, 
       new String[] 
       {
       });	
  }

} //BusinessobjectsPackageImpl
