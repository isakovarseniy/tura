/**
 */
package domain.impl;

import domain.BusinessObject;
import domain.BusinessObjects;
import domain.BusinessPackage;
import domain.DomainPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
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
 *   <li>{@link domain.impl.BusinessObjectsImpl#getParent <em>Parent</em>}</li>
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
   * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParent()
   * @generated
   * @ordered
   */
  protected BusinessPackage parent;

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
      businessObject = new EObjectContainmentWithInverseEList<BusinessObject>(BusinessObject.class, this, DomainPackage.BUSINESS_OBJECTS__BUSINESS_OBJECT, DomainPackage.BUSINESS_OBJECT__PARENT);
    }
    return businessObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BusinessPackage getParent()
  {
    if (parent != null && parent.eIsProxy())
    {
      InternalEObject oldParent = (InternalEObject)parent;
      parent = (BusinessPackage)eResolveProxy(oldParent);
      if (parent != oldParent)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.BUSINESS_OBJECTS__PARENT, oldParent, parent));
      }
    }
    return parent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BusinessPackage basicGetParent()
  {
    return parent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParent(BusinessPackage newParent, NotificationChain msgs)
  {
    BusinessPackage oldParent = parent;
    parent = newParent;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.BUSINESS_OBJECTS__PARENT, oldParent, newParent);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParent(BusinessPackage newParent)
  {
    if (newParent != parent)
    {
      NotificationChain msgs = null;
      if (parent != null)
        msgs = ((InternalEObject)parent).eInverseRemove(this, DomainPackage.BUSINESS_PACKAGE__BUSINESSOBJECTS, BusinessPackage.class, msgs);
      if (newParent != null)
        msgs = ((InternalEObject)newParent).eInverseAdd(this, DomainPackage.BUSINESS_PACKAGE__BUSINESSOBJECTS, BusinessPackage.class, msgs);
      msgs = basicSetParent(newParent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.BUSINESS_OBJECTS__PARENT, newParent, newParent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DomainPackage.BUSINESS_OBJECTS__BUSINESS_OBJECT:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getBusinessObject()).basicAdd(otherEnd, msgs);
      case DomainPackage.BUSINESS_OBJECTS__PARENT:
        if (parent != null)
          msgs = ((InternalEObject)parent).eInverseRemove(this, DomainPackage.BUSINESS_PACKAGE__BUSINESSOBJECTS, BusinessPackage.class, msgs);
        return basicSetParent((BusinessPackage)otherEnd, msgs);
    }
    return super.eInverseAdd(otherEnd, featureID, msgs);
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
      case DomainPackage.BUSINESS_OBJECTS__PARENT:
        return basicSetParent(null, msgs);
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
      case DomainPackage.BUSINESS_OBJECTS__PARENT:
        if (resolve) return getParent();
        return basicGetParent();
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
      case DomainPackage.BUSINESS_OBJECTS__PARENT:
        setParent((BusinessPackage)newValue);
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
      case DomainPackage.BUSINESS_OBJECTS__PARENT:
        setParent((BusinessPackage)null);
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
      case DomainPackage.BUSINESS_OBJECTS__PARENT:
        return parent != null;
    }
    return super.eIsSet(featureID);
  }

} //BusinessObjectsImpl
