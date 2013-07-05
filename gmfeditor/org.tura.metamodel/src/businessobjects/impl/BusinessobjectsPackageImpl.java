/**
 */
package businessobjects.impl;

import businessobjects.BusinessMethod;
import businessobjects.BusinessObject;
import businessobjects.BusinessObjects;
import businessobjects.BusinessobjectsFactory;
import businessobjects.BusinessobjectsPackage;
import businessobjects.CreateMethod;
import businessobjects.InsertMethod;
import businessobjects.OtherMethod;
import businessobjects.RemoveMethod;
import businessobjects.SearchMethod;
import businessobjects.UpdateMethod;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import typedefinition.TypedefinitionPackage;

import typedefinition.impl.TypedefinitionPackageImpl;

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
  private EClass createMethodEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass insertMethodEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass updateMethodEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass removeMethodEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass searchMethodEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass otherMethodEClass = null;

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
  public EAttribute getBusinessObject_Name()
  {
    return (EAttribute)businessObjectEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBusinessObject_CreateMethods()
  {
    return (EReference)businessObjectEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBusinessObject_InsertMethods()
  {
    return (EReference)businessObjectEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBusinessObject_UpdaeteMethods()
  {
    return (EReference)businessObjectEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBusinessObject_RemovetMethods()
  {
    return (EReference)businessObjectEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBusinessObject_SearchtMethods()
  {
    return (EReference)businessObjectEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBusinessObject_OthersMethods()
  {
    return (EReference)businessObjectEClass.getEStructuralFeatures().get(6);
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
  public EClass getCreateMethod()
  {
    return createMethodEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInsertMethod()
  {
    return insertMethodEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUpdateMethod()
  {
    return updateMethodEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRemoveMethod()
  {
    return removeMethodEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSearchMethod()
  {
    return searchMethodEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOtherMethod()
  {
    return otherMethodEClass;
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
    createEAttribute(businessObjectEClass, BUSINESS_OBJECT__NAME);
    createEReference(businessObjectEClass, BUSINESS_OBJECT__CREATE_METHODS);
    createEReference(businessObjectEClass, BUSINESS_OBJECT__INSERT_METHODS);
    createEReference(businessObjectEClass, BUSINESS_OBJECT__UPDAETE_METHODS);
    createEReference(businessObjectEClass, BUSINESS_OBJECT__REMOVET_METHODS);
    createEReference(businessObjectEClass, BUSINESS_OBJECT__SEARCHT_METHODS);
    createEReference(businessObjectEClass, BUSINESS_OBJECT__OTHERS_METHODS);

    businessMethodEClass = createEClass(BUSINESS_METHOD);
    createEAttribute(businessMethodEClass, BUSINESS_METHOD__METHOD);

    createMethodEClass = createEClass(CREATE_METHOD);

    insertMethodEClass = createEClass(INSERT_METHOD);

    updateMethodEClass = createEClass(UPDATE_METHOD);

    removeMethodEClass = createEClass(REMOVE_METHOD);

    searchMethodEClass = createEClass(SEARCH_METHOD);

    otherMethodEClass = createEClass(OTHER_METHOD);
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
    businessMethodEClass.getESuperTypes().add(theTypedefinitionPackage.getTypePointer());
    createMethodEClass.getESuperTypes().add(this.getBusinessMethod());
    insertMethodEClass.getESuperTypes().add(this.getBusinessMethod());
    updateMethodEClass.getESuperTypes().add(this.getBusinessMethod());
    removeMethodEClass.getESuperTypes().add(this.getBusinessMethod());
    searchMethodEClass.getESuperTypes().add(this.getBusinessMethod());
    otherMethodEClass.getESuperTypes().add(this.getBusinessMethod());

    // Initialize classes and features; add operations and parameters
    initEClass(businessObjectsEClass, BusinessObjects.class, "BusinessObjects", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBusinessObjects_BusinessObject(), this.getBusinessObject(), null, "businessObject", null, 0, -1, BusinessObjects.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(businessObjectEClass, BusinessObject.class, "BusinessObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBusinessObject_Name(), ecorePackage.getEString(), "name", null, 0, 1, BusinessObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBusinessObject_CreateMethods(), this.getCreateMethod(), null, "createMethods", null, 0, -1, BusinessObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBusinessObject_InsertMethods(), this.getInsertMethod(), null, "insertMethods", null, 0, -1, BusinessObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBusinessObject_UpdaeteMethods(), this.getUpdateMethod(), null, "updaeteMethods", null, 0, -1, BusinessObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBusinessObject_RemovetMethods(), this.getRemoveMethod(), null, "removetMethods", null, 0, -1, BusinessObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBusinessObject_SearchtMethods(), this.getSearchMethod(), null, "searchtMethods", null, 0, -1, BusinessObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBusinessObject_OthersMethods(), this.getOtherMethod(), null, "othersMethods", null, 0, -1, BusinessObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(businessMethodEClass, BusinessMethod.class, "BusinessMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBusinessMethod_Method(), ecorePackage.getEString(), "method", null, 0, 1, BusinessMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(createMethodEClass, CreateMethod.class, "CreateMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(insertMethodEClass, InsertMethod.class, "InsertMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(updateMethodEClass, UpdateMethod.class, "UpdateMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(removeMethodEClass, RemoveMethod.class, "RemoveMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(searchMethodEClass, SearchMethod.class, "SearchMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(otherMethodEClass, OtherMethod.class, "OtherMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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
       "label", "name"
       });								
    addAnnotation
      (createMethodEClass, 
       source, 
       new String[] 
       {
       "label", "method"
       });		
    addAnnotation
      (insertMethodEClass, 
       source, 
       new String[] 
       {
       "label", "method"
       });		
    addAnnotation
      (updateMethodEClass, 
       source, 
       new String[] 
       {
       "label", "method"
       });		
    addAnnotation
      (removeMethodEClass, 
       source, 
       new String[] 
       {
       "label", "method"
       });		
    addAnnotation
      (searchMethodEClass, 
       source, 
       new String[] 
       {
       "label", "method"
       });		
    addAnnotation
      (otherMethodEClass, 
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
    addAnnotation
      (getBusinessObject_OthersMethods(), 
       source, 
       new String[] 
       {
       });						
  }

} //BusinessobjectsPackageImpl
