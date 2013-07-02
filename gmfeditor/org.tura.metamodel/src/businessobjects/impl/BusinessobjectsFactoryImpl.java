/**
 */
package businessobjects.impl;

import businessobjects.*;

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
public class BusinessobjectsFactoryImpl extends EFactoryImpl implements BusinessobjectsFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static BusinessobjectsFactory init()
  {
    try
    {
      BusinessobjectsFactory theBusinessobjectsFactory = (BusinessobjectsFactory)EPackage.Registry.INSTANCE.getEFactory("http://tura.org/2013/v1/businessobjects"); 
      if (theBusinessobjectsFactory != null)
      {
        return theBusinessobjectsFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new BusinessobjectsFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BusinessobjectsFactoryImpl()
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
      case BusinessobjectsPackage.BUSINESS_OBJECTS: return createBusinessObjects();
      case BusinessobjectsPackage.BUSINESS_OBJECT: return createBusinessObject();
      case BusinessobjectsPackage.BUSINESS_METHOD: return createBusinessMethod();
      case BusinessobjectsPackage.CREATE_METHOD: return createCreateMethod();
      case BusinessobjectsPackage.INSERT_METHOD: return createInsertMethod();
      case BusinessobjectsPackage.UPDATE_METHOD: return createUpdateMethod();
      case BusinessobjectsPackage.REMOVE_METHOD: return createRemoveMethod();
      case BusinessobjectsPackage.SEARCH_METHOD: return createSearchMethod();
      case BusinessobjectsPackage.OTHER_METHOD: return createOtherMethod();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BusinessObjects createBusinessObjects()
  {
    BusinessObjectsImpl businessObjects = new BusinessObjectsImpl();
    return businessObjects;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BusinessObject createBusinessObject()
  {
    BusinessObjectImpl businessObject = new BusinessObjectImpl();
    return businessObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BusinessMethod createBusinessMethod()
  {
    BusinessMethodImpl businessMethod = new BusinessMethodImpl();
    return businessMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CreateMethod createCreateMethod()
  {
    CreateMethodImpl createMethod = new CreateMethodImpl();
    return createMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InsertMethod createInsertMethod()
  {
    InsertMethodImpl insertMethod = new InsertMethodImpl();
    return insertMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UpdateMethod createUpdateMethod()
  {
    UpdateMethodImpl updateMethod = new UpdateMethodImpl();
    return updateMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RemoveMethod createRemoveMethod()
  {
    RemoveMethodImpl removeMethod = new RemoveMethodImpl();
    return removeMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SearchMethod createSearchMethod()
  {
    SearchMethodImpl searchMethod = new SearchMethodImpl();
    return searchMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OtherMethod createOtherMethod()
  {
    OtherMethodImpl otherMethod = new OtherMethodImpl();
    return otherMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BusinessobjectsPackage getBusinessobjectsPackage()
  {
    return (BusinessobjectsPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static BusinessobjectsPackage getPackage()
  {
    return BusinessobjectsPackage.eINSTANCE;
  }

} //BusinessobjectsFactoryImpl
