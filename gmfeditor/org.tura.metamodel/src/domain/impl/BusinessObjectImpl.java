/**
 */
package domain.impl;

import domain.BusinessObject;
import domain.BusinessObjects;
import domain.CreateMethod;
import domain.DomainPackage;
import domain.InsertMethod;
import domain.OtherMethod;
import domain.RemoveMethod;
import domain.SearchMethod;
import domain.UpdateMethod;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Business Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link domain.impl.BusinessObjectImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.impl.BusinessObjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link domain.impl.BusinessObjectImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link domain.impl.BusinessObjectImpl#getCreateMethods <em>Create Methods</em>}</li>
 *   <li>{@link domain.impl.BusinessObjectImpl#getInsertMethods <em>Insert Methods</em>}</li>
 *   <li>{@link domain.impl.BusinessObjectImpl#getUpdateMethods <em>Update Methods</em>}</li>
 *   <li>{@link domain.impl.BusinessObjectImpl#getRemoveMethods <em>Remove Methods</em>}</li>
 *   <li>{@link domain.impl.BusinessObjectImpl#getSearchMethods <em>Search Methods</em>}</li>
 *   <li>{@link domain.impl.BusinessObjectImpl#getOthersMethods <em>Others Methods</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BusinessObjectImpl extends EObjectImpl implements BusinessObject
{
  /**
   * The default value of the '{@link #getUid() <em>Uid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUid()
   * @generated
   * @ordered
   */
  protected static final String UID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUid() <em>Uid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUid()
   * @generated
   * @ordered
   */
  protected String uid = UID_EDEFAULT;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getCreateMethods() <em>Create Methods</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCreateMethods()
   * @generated
   * @ordered
   */
  protected EList<CreateMethod> createMethods;

  /**
   * The cached value of the '{@link #getInsertMethods() <em>Insert Methods</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInsertMethods()
   * @generated
   * @ordered
   */
  protected EList<InsertMethod> insertMethods;

  /**
   * The cached value of the '{@link #getUpdateMethods() <em>Update Methods</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUpdateMethods()
   * @generated
   * @ordered
   */
  protected EList<UpdateMethod> updateMethods;

  /**
   * The cached value of the '{@link #getRemoveMethods() <em>Remove Methods</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRemoveMethods()
   * @generated
   * @ordered
   */
  protected EList<RemoveMethod> removeMethods;

  /**
   * The cached value of the '{@link #getSearchMethods() <em>Search Methods</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSearchMethods()
   * @generated
   * @ordered
   */
  protected EList<SearchMethod> searchMethods;

  /**
   * The cached value of the '{@link #getOthersMethods() <em>Others Methods</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOthersMethods()
   * @generated
   * @ordered
   */
  protected EList<OtherMethod> othersMethods;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BusinessObjectImpl()
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
    return DomainPackage.Literals.BUSINESS_OBJECT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getUid()
  {
    return uid;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUid(String newUid)
  {
    String oldUid = uid;
    uid = newUid;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.BUSINESS_OBJECT__UID, oldUid, uid));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.BUSINESS_OBJECT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BusinessObjects getParent()
  {
    if (eContainerFeatureID() != DomainPackage.BUSINESS_OBJECT__PARENT) return null;
    return (BusinessObjects)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParent(BusinessObjects newParent, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newParent, DomainPackage.BUSINESS_OBJECT__PARENT, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParent(BusinessObjects newParent)
  {
    if (newParent != eInternalContainer() || (eContainerFeatureID() != DomainPackage.BUSINESS_OBJECT__PARENT && newParent != null))
    {
      if (EcoreUtil.isAncestor(this, newParent))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newParent != null)
        msgs = ((InternalEObject)newParent).eInverseAdd(this, DomainPackage.BUSINESS_OBJECTS__BUSINESS_OBJECT, BusinessObjects.class, msgs);
      msgs = basicSetParent(newParent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.BUSINESS_OBJECT__PARENT, newParent, newParent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<CreateMethod> getCreateMethods()
  {
    if (createMethods == null)
    {
      createMethods = new EObjectContainmentWithInverseEList<CreateMethod>(CreateMethod.class, this, DomainPackage.BUSINESS_OBJECT__CREATE_METHODS, DomainPackage.CREATE_METHOD__PARENT);
    }
    return createMethods;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<InsertMethod> getInsertMethods()
  {
    if (insertMethods == null)
    {
      insertMethods = new EObjectContainmentWithInverseEList<InsertMethod>(InsertMethod.class, this, DomainPackage.BUSINESS_OBJECT__INSERT_METHODS, DomainPackage.INSERT_METHOD__PARENT);
    }
    return insertMethods;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<UpdateMethod> getUpdateMethods()
  {
    if (updateMethods == null)
    {
      updateMethods = new EObjectContainmentWithInverseEList<UpdateMethod>(UpdateMethod.class, this, DomainPackage.BUSINESS_OBJECT__UPDATE_METHODS, DomainPackage.UPDATE_METHOD__PARENT);
    }
    return updateMethods;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<RemoveMethod> getRemoveMethods()
  {
    if (removeMethods == null)
    {
      removeMethods = new EObjectContainmentWithInverseEList<RemoveMethod>(RemoveMethod.class, this, DomainPackage.BUSINESS_OBJECT__REMOVE_METHODS, DomainPackage.REMOVE_METHOD__PARENT);
    }
    return removeMethods;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SearchMethod> getSearchMethods()
  {
    if (searchMethods == null)
    {
      searchMethods = new EObjectContainmentWithInverseEList<SearchMethod>(SearchMethod.class, this, DomainPackage.BUSINESS_OBJECT__SEARCH_METHODS, DomainPackage.SEARCH_METHOD__PARENT);
    }
    return searchMethods;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<OtherMethod> getOthersMethods()
  {
    if (othersMethods == null)
    {
      othersMethods = new EObjectContainmentWithInverseEList<OtherMethod>(OtherMethod.class, this, DomainPackage.BUSINESS_OBJECT__OTHERS_METHODS, DomainPackage.OTHER_METHOD__PARENT);
    }
    return othersMethods;
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
      case DomainPackage.BUSINESS_OBJECT__PARENT:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetParent((BusinessObjects)otherEnd, msgs);
      case DomainPackage.BUSINESS_OBJECT__CREATE_METHODS:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getCreateMethods()).basicAdd(otherEnd, msgs);
      case DomainPackage.BUSINESS_OBJECT__INSERT_METHODS:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getInsertMethods()).basicAdd(otherEnd, msgs);
      case DomainPackage.BUSINESS_OBJECT__UPDATE_METHODS:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getUpdateMethods()).basicAdd(otherEnd, msgs);
      case DomainPackage.BUSINESS_OBJECT__REMOVE_METHODS:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getRemoveMethods()).basicAdd(otherEnd, msgs);
      case DomainPackage.BUSINESS_OBJECT__SEARCH_METHODS:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getSearchMethods()).basicAdd(otherEnd, msgs);
      case DomainPackage.BUSINESS_OBJECT__OTHERS_METHODS:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getOthersMethods()).basicAdd(otherEnd, msgs);
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
      case DomainPackage.BUSINESS_OBJECT__PARENT:
        return basicSetParent(null, msgs);
      case DomainPackage.BUSINESS_OBJECT__CREATE_METHODS:
        return ((InternalEList<?>)getCreateMethods()).basicRemove(otherEnd, msgs);
      case DomainPackage.BUSINESS_OBJECT__INSERT_METHODS:
        return ((InternalEList<?>)getInsertMethods()).basicRemove(otherEnd, msgs);
      case DomainPackage.BUSINESS_OBJECT__UPDATE_METHODS:
        return ((InternalEList<?>)getUpdateMethods()).basicRemove(otherEnd, msgs);
      case DomainPackage.BUSINESS_OBJECT__REMOVE_METHODS:
        return ((InternalEList<?>)getRemoveMethods()).basicRemove(otherEnd, msgs);
      case DomainPackage.BUSINESS_OBJECT__SEARCH_METHODS:
        return ((InternalEList<?>)getSearchMethods()).basicRemove(otherEnd, msgs);
      case DomainPackage.BUSINESS_OBJECT__OTHERS_METHODS:
        return ((InternalEList<?>)getOthersMethods()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
  {
    switch (eContainerFeatureID())
    {
      case DomainPackage.BUSINESS_OBJECT__PARENT:
        return eInternalContainer().eInverseRemove(this, DomainPackage.BUSINESS_OBJECTS__BUSINESS_OBJECT, BusinessObjects.class, msgs);
    }
    return super.eBasicRemoveFromContainerFeature(msgs);
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
      case DomainPackage.BUSINESS_OBJECT__UID:
        return getUid();
      case DomainPackage.BUSINESS_OBJECT__NAME:
        return getName();
      case DomainPackage.BUSINESS_OBJECT__PARENT:
        return getParent();
      case DomainPackage.BUSINESS_OBJECT__CREATE_METHODS:
        return getCreateMethods();
      case DomainPackage.BUSINESS_OBJECT__INSERT_METHODS:
        return getInsertMethods();
      case DomainPackage.BUSINESS_OBJECT__UPDATE_METHODS:
        return getUpdateMethods();
      case DomainPackage.BUSINESS_OBJECT__REMOVE_METHODS:
        return getRemoveMethods();
      case DomainPackage.BUSINESS_OBJECT__SEARCH_METHODS:
        return getSearchMethods();
      case DomainPackage.BUSINESS_OBJECT__OTHERS_METHODS:
        return getOthersMethods();
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
      case DomainPackage.BUSINESS_OBJECT__UID:
        setUid((String)newValue);
        return;
      case DomainPackage.BUSINESS_OBJECT__NAME:
        setName((String)newValue);
        return;
      case DomainPackage.BUSINESS_OBJECT__PARENT:
        setParent((BusinessObjects)newValue);
        return;
      case DomainPackage.BUSINESS_OBJECT__CREATE_METHODS:
        getCreateMethods().clear();
        getCreateMethods().addAll((Collection<? extends CreateMethod>)newValue);
        return;
      case DomainPackage.BUSINESS_OBJECT__INSERT_METHODS:
        getInsertMethods().clear();
        getInsertMethods().addAll((Collection<? extends InsertMethod>)newValue);
        return;
      case DomainPackage.BUSINESS_OBJECT__UPDATE_METHODS:
        getUpdateMethods().clear();
        getUpdateMethods().addAll((Collection<? extends UpdateMethod>)newValue);
        return;
      case DomainPackage.BUSINESS_OBJECT__REMOVE_METHODS:
        getRemoveMethods().clear();
        getRemoveMethods().addAll((Collection<? extends RemoveMethod>)newValue);
        return;
      case DomainPackage.BUSINESS_OBJECT__SEARCH_METHODS:
        getSearchMethods().clear();
        getSearchMethods().addAll((Collection<? extends SearchMethod>)newValue);
        return;
      case DomainPackage.BUSINESS_OBJECT__OTHERS_METHODS:
        getOthersMethods().clear();
        getOthersMethods().addAll((Collection<? extends OtherMethod>)newValue);
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
      case DomainPackage.BUSINESS_OBJECT__UID:
        setUid(UID_EDEFAULT);
        return;
      case DomainPackage.BUSINESS_OBJECT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DomainPackage.BUSINESS_OBJECT__PARENT:
        setParent((BusinessObjects)null);
        return;
      case DomainPackage.BUSINESS_OBJECT__CREATE_METHODS:
        getCreateMethods().clear();
        return;
      case DomainPackage.BUSINESS_OBJECT__INSERT_METHODS:
        getInsertMethods().clear();
        return;
      case DomainPackage.BUSINESS_OBJECT__UPDATE_METHODS:
        getUpdateMethods().clear();
        return;
      case DomainPackage.BUSINESS_OBJECT__REMOVE_METHODS:
        getRemoveMethods().clear();
        return;
      case DomainPackage.BUSINESS_OBJECT__SEARCH_METHODS:
        getSearchMethods().clear();
        return;
      case DomainPackage.BUSINESS_OBJECT__OTHERS_METHODS:
        getOthersMethods().clear();
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
      case DomainPackage.BUSINESS_OBJECT__UID:
        return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
      case DomainPackage.BUSINESS_OBJECT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DomainPackage.BUSINESS_OBJECT__PARENT:
        return getParent() != null;
      case DomainPackage.BUSINESS_OBJECT__CREATE_METHODS:
        return createMethods != null && !createMethods.isEmpty();
      case DomainPackage.BUSINESS_OBJECT__INSERT_METHODS:
        return insertMethods != null && !insertMethods.isEmpty();
      case DomainPackage.BUSINESS_OBJECT__UPDATE_METHODS:
        return updateMethods != null && !updateMethods.isEmpty();
      case DomainPackage.BUSINESS_OBJECT__REMOVE_METHODS:
        return removeMethods != null && !removeMethods.isEmpty();
      case DomainPackage.BUSINESS_OBJECT__SEARCH_METHODS:
        return searchMethods != null && !searchMethods.isEmpty();
      case DomainPackage.BUSINESS_OBJECT__OTHERS_METHODS:
        return othersMethods != null && !othersMethods.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (uid: ");
    result.append(uid);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //BusinessObjectImpl
