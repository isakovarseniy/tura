/**
 */
package businessobjects.impl;

import businessobjects.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.tura.metamodel.commons.types.impl.RefMethodImpl;

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
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case BusinessobjectsPackage.REFMETHOD:
        return createrefmethodFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case BusinessobjectsPackage.REFMETHOD:
        return convertrefmethodToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
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
  public RefMethodImpl createrefmethodFromString(EDataType eDataType, String initialValue)
  {
    return (RefMethodImpl)super.createFromString(eDataType, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertrefmethodToString(EDataType eDataType, Object instanceValue)
  {
    return super.convertToString(eDataType, instanceValue);
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
