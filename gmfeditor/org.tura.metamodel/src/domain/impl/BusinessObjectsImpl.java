/**
 */
package domain.impl;

import domain.BusinessObject;
import domain.BusinessObjects;
import domain.DomainPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Business Objects</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link domain.impl.BusinessObjectsImpl#getBusinessObject <em>Business Object</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BusinessObjectsImpl extends EObjectImpl implements BusinessObjects
{
  /**
   * The cached value of the '{@link #getBusinessObject() <em>Business Object</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBusinessObject()
   * @generated
   * @ordered
   */
  protected EList<BusinessObject> businessObject;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BusinessObjectsImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return DomainPackage.Literals.BUSINESS_OBJECTS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BusinessObject> getBusinessObject()
  {
    if (businessObject == null)
    {
      businessObject = new EObjectContainmentEList<BusinessObject>(BusinessObject.class, this, DomainPackage.BUSINESS_OBJECTS__BUSINESS_OBJECT);
    }
    return businessObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DomainPackage.BUSINESS_OBJECTS__BUSINESS_OBJECT:
        return ((InternalEList<?>)getBusinessObject()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DomainPackage.BUSINESS_OBJECTS__BUSINESS_OBJECT:
        return getBusinessObject();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DomainPackage.BUSINESS_OBJECTS__BUSINESS_OBJECT:
        getBusinessObject().clear();
        getBusinessObject().addAll((Collection<? extends BusinessObject>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case DomainPackage.BUSINESS_OBJECTS__BUSINESS_OBJECT:
        getBusinessObject().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case DomainPackage.BUSINESS_OBJECTS__BUSINESS_OBJECT:
        return businessObject != null && !businessObject.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //BusinessObjectsImpl
