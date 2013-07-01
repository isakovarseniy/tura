/**
 */
package businessobjects;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see businessobjects.BusinessobjectsFactory
 * @model kind="package"
 * @generated
 */
public interface BusinessobjectsPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "businessobjects";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://tura.org/2013/v1/businessobjects";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "tura.businessobjects";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  BusinessobjectsPackage eINSTANCE = businessobjects.impl.BusinessobjectsPackageImpl.init();

  /**
   * The meta object id for the '{@link businessobjects.impl.BusinessObjectsImpl <em>Business Objects</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see businessobjects.impl.BusinessObjectsImpl
   * @see businessobjects.impl.BusinessobjectsPackageImpl#getBusinessObjects()
   * @generated
   */
  int BUSINESS_OBJECTS = 0;

  /**
   * The feature id for the '<em><b>Business Object</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUSINESS_OBJECTS__BUSINESS_OBJECT = 0;

  /**
   * The number of structural features of the '<em>Business Objects</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUSINESS_OBJECTS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link businessobjects.impl.BusinessObjectImpl <em>Business Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see businessobjects.impl.BusinessObjectImpl
   * @see businessobjects.impl.BusinessobjectsPackageImpl#getBusinessObject()
   * @generated
   */
  int BUSINESS_OBJECT = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUSINESS_OBJECT__TYPE = TypedefinitionPackage.TYPE_POINTER__TYPE;

  /**
   * The feature id for the '<em><b>Create Methods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUSINESS_OBJECT__CREATE_METHODS = TypedefinitionPackage.TYPE_POINTER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Insert Methods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUSINESS_OBJECT__INSERT_METHODS = TypedefinitionPackage.TYPE_POINTER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Updaete Methods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUSINESS_OBJECT__UPDAETE_METHODS = TypedefinitionPackage.TYPE_POINTER_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Removet Methods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUSINESS_OBJECT__REMOVET_METHODS = TypedefinitionPackage.TYPE_POINTER_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Searcht Methods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUSINESS_OBJECT__SEARCHT_METHODS = TypedefinitionPackage.TYPE_POINTER_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Business Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUSINESS_OBJECT_FEATURE_COUNT = TypedefinitionPackage.TYPE_POINTER_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link businessobjects.impl.BusinessMethodImpl <em>Business Method</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see businessobjects.impl.BusinessMethodImpl
   * @see businessobjects.impl.BusinessobjectsPackageImpl#getBusinessMethod()
   * @generated
   */
  int BUSINESS_METHOD = 2;

  /**
   * The feature id for the '<em><b>Method</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUSINESS_METHOD__METHOD = 0;

  /**
   * The number of structural features of the '<em>Business Method</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUSINESS_METHOD_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '<em>refmethod</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.tura.metamodel.commons.types.impl.RefMethodImpl
   * @see businessobjects.impl.BusinessobjectsPackageImpl#getrefmethod()
   * @generated
   */
  int REFMETHOD = 3;


  /**
   * Returns the meta object for class '{@link businessobjects.BusinessObjects <em>Business Objects</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Business Objects</em>'.
   * @see businessobjects.BusinessObjects
   * @generated
   */
  EClass getBusinessObjects();

  /**
   * Returns the meta object for the containment reference list '{@link businessobjects.BusinessObjects#getBusinessObject <em>Business Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Business Object</em>'.
   * @see businessobjects.BusinessObjects#getBusinessObject()
   * @see #getBusinessObjects()
   * @generated
   */
  EReference getBusinessObjects_BusinessObject();

  /**
   * Returns the meta object for class '{@link businessobjects.BusinessObject <em>Business Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Business Object</em>'.
   * @see businessobjects.BusinessObject
   * @generated
   */
  EClass getBusinessObject();

  /**
   * Returns the meta object for the containment reference list '{@link businessobjects.BusinessObject#getCreateMethods <em>Create Methods</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Create Methods</em>'.
   * @see businessobjects.BusinessObject#getCreateMethods()
   * @see #getBusinessObject()
   * @generated
   */
  EReference getBusinessObject_CreateMethods();

  /**
   * Returns the meta object for the containment reference list '{@link businessobjects.BusinessObject#getInsertMethods <em>Insert Methods</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Insert Methods</em>'.
   * @see businessobjects.BusinessObject#getInsertMethods()
   * @see #getBusinessObject()
   * @generated
   */
  EReference getBusinessObject_InsertMethods();

  /**
   * Returns the meta object for the containment reference list '{@link businessobjects.BusinessObject#getUpdaeteMethods <em>Updaete Methods</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Updaete Methods</em>'.
   * @see businessobjects.BusinessObject#getUpdaeteMethods()
   * @see #getBusinessObject()
   * @generated
   */
  EReference getBusinessObject_UpdaeteMethods();

  /**
   * Returns the meta object for the containment reference list '{@link businessobjects.BusinessObject#getRemovetMethods <em>Removet Methods</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Removet Methods</em>'.
   * @see businessobjects.BusinessObject#getRemovetMethods()
   * @see #getBusinessObject()
   * @generated
   */
  EReference getBusinessObject_RemovetMethods();

  /**
   * Returns the meta object for the containment reference list '{@link businessobjects.BusinessObject#getSearchtMethods <em>Searcht Methods</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Searcht Methods</em>'.
   * @see businessobjects.BusinessObject#getSearchtMethods()
   * @see #getBusinessObject()
   * @generated
   */
  EReference getBusinessObject_SearchtMethods();

  /**
   * Returns the meta object for class '{@link businessobjects.BusinessMethod <em>Business Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Business Method</em>'.
   * @see businessobjects.BusinessMethod
   * @generated
   */
  EClass getBusinessMethod();

  /**
   * Returns the meta object for the attribute '{@link businessobjects.BusinessMethod#getMethod <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Method</em>'.
   * @see businessobjects.BusinessMethod#getMethod()
   * @see #getBusinessMethod()
   * @generated
   */
  EAttribute getBusinessMethod_Method();

  /**
   * Returns the meta object for data type '{@link org.tura.metamodel.commons.types.impl.RefMethodImpl <em>refmethod</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>refmethod</em>'.
   * @see org.tura.metamodel.commons.types.impl.RefMethodImpl
   * @model instanceClass="org.tura.metamodel.commons.types.impl.RefMethodImpl"
   * @generated
   */
  EDataType getrefmethod();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  BusinessobjectsFactory getBusinessobjectsFactory();

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
     * The meta object literal for the '{@link businessobjects.impl.BusinessObjectsImpl <em>Business Objects</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see businessobjects.impl.BusinessObjectsImpl
     * @see businessobjects.impl.BusinessobjectsPackageImpl#getBusinessObjects()
     * @generated
     */
    EClass BUSINESS_OBJECTS = eINSTANCE.getBusinessObjects();

    /**
     * The meta object literal for the '<em><b>Business Object</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUSINESS_OBJECTS__BUSINESS_OBJECT = eINSTANCE.getBusinessObjects_BusinessObject();

    /**
     * The meta object literal for the '{@link businessobjects.impl.BusinessObjectImpl <em>Business Object</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see businessobjects.impl.BusinessObjectImpl
     * @see businessobjects.impl.BusinessobjectsPackageImpl#getBusinessObject()
     * @generated
     */
    EClass BUSINESS_OBJECT = eINSTANCE.getBusinessObject();

    /**
     * The meta object literal for the '<em><b>Create Methods</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUSINESS_OBJECT__CREATE_METHODS = eINSTANCE.getBusinessObject_CreateMethods();

    /**
     * The meta object literal for the '<em><b>Insert Methods</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUSINESS_OBJECT__INSERT_METHODS = eINSTANCE.getBusinessObject_InsertMethods();

    /**
     * The meta object literal for the '<em><b>Updaete Methods</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUSINESS_OBJECT__UPDAETE_METHODS = eINSTANCE.getBusinessObject_UpdaeteMethods();

    /**
     * The meta object literal for the '<em><b>Removet Methods</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUSINESS_OBJECT__REMOVET_METHODS = eINSTANCE.getBusinessObject_RemovetMethods();

    /**
     * The meta object literal for the '<em><b>Searcht Methods</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUSINESS_OBJECT__SEARCHT_METHODS = eINSTANCE.getBusinessObject_SearchtMethods();

    /**
     * The meta object literal for the '{@link businessobjects.impl.BusinessMethodImpl <em>Business Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see businessobjects.impl.BusinessMethodImpl
     * @see businessobjects.impl.BusinessobjectsPackageImpl#getBusinessMethod()
     * @generated
     */
    EClass BUSINESS_METHOD = eINSTANCE.getBusinessMethod();

    /**
     * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUSINESS_METHOD__METHOD = eINSTANCE.getBusinessMethod_Method();

    /**
     * The meta object literal for the '<em>refmethod</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.tura.metamodel.commons.types.impl.RefMethodImpl
     * @see businessobjects.impl.BusinessobjectsPackageImpl#getrefmethod()
     * @generated
     */
    EDataType REFMETHOD = eINSTANCE.getrefmethod();

  }

} //BusinessobjectsPackage
