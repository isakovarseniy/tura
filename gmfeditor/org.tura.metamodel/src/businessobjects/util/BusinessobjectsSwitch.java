/**
 */
package businessobjects.util;

import businessobjects.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import typedefinition.TypePointer;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see businessobjects.BusinessobjectsPackage
 * @generated
 */
public class BusinessobjectsSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static BusinessobjectsPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BusinessobjectsSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = BusinessobjectsPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case BusinessobjectsPackage.BUSINESS_OBJECTS:
      {
        BusinessObjects businessObjects = (BusinessObjects)theEObject;
        T result = caseBusinessObjects(businessObjects);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BusinessobjectsPackage.BUSINESS_OBJECT:
      {
        BusinessObject businessObject = (BusinessObject)theEObject;
        T result = caseBusinessObject(businessObject);
        if (result == null) result = caseTypePointer(businessObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BusinessobjectsPackage.BUSINESS_METHOD:
      {
        BusinessMethod businessMethod = (BusinessMethod)theEObject;
        T result = caseBusinessMethod(businessMethod);
        if (result == null) result = caseTypePointer(businessMethod);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BusinessobjectsPackage.CREATE_METHOD:
      {
        CreateMethod createMethod = (CreateMethod)theEObject;
        T result = caseCreateMethod(createMethod);
        if (result == null) result = caseBusinessMethod(createMethod);
        if (result == null) result = caseTypePointer(createMethod);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BusinessobjectsPackage.INSERT_METHOD:
      {
        InsertMethod insertMethod = (InsertMethod)theEObject;
        T result = caseInsertMethod(insertMethod);
        if (result == null) result = caseBusinessMethod(insertMethod);
        if (result == null) result = caseTypePointer(insertMethod);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BusinessobjectsPackage.UPDATE_METHOD:
      {
        UpdateMethod updateMethod = (UpdateMethod)theEObject;
        T result = caseUpdateMethod(updateMethod);
        if (result == null) result = caseBusinessMethod(updateMethod);
        if (result == null) result = caseTypePointer(updateMethod);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BusinessobjectsPackage.REMOVE_METHOD:
      {
        RemoveMethod removeMethod = (RemoveMethod)theEObject;
        T result = caseRemoveMethod(removeMethod);
        if (result == null) result = caseBusinessMethod(removeMethod);
        if (result == null) result = caseTypePointer(removeMethod);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BusinessobjectsPackage.SEARCH_METHOD:
      {
        SearchMethod searchMethod = (SearchMethod)theEObject;
        T result = caseSearchMethod(searchMethod);
        if (result == null) result = caseBusinessMethod(searchMethod);
        if (result == null) result = caseTypePointer(searchMethod);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BusinessobjectsPackage.OTHER_METHOD:
      {
        OtherMethod otherMethod = (OtherMethod)theEObject;
        T result = caseOtherMethod(otherMethod);
        if (result == null) result = caseBusinessMethod(otherMethod);
        if (result == null) result = caseTypePointer(otherMethod);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Business Objects</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Business Objects</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBusinessObjects(BusinessObjects object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Business Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Business Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBusinessObject(BusinessObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Business Method</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Business Method</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBusinessMethod(BusinessMethod object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Create Method</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Create Method</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCreateMethod(CreateMethod object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Insert Method</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Insert Method</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInsertMethod(InsertMethod object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Update Method</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Update Method</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUpdateMethod(UpdateMethod object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Remove Method</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Remove Method</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRemoveMethod(RemoveMethod object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Search Method</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Search Method</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSearchMethod(SearchMethod object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Other Method</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Other Method</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOtherMethod(OtherMethod object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Pointer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Pointer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypePointer(TypePointer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //BusinessobjectsSwitch
