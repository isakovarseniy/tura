/**
 */
package domain.impl;

import domain.Context;
import domain.DomainPackage;
import domain.PREQueryTrigger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PRE Query Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link domain.impl.PREQueryTriggerImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.impl.PREQueryTriggerImpl#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link domain.impl.PREQueryTriggerImpl#getFakeMethod <em>Fake Method</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PREQueryTriggerImpl extends EObjectImpl implements PREQueryTrigger
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
   * The cached value of the '{@link #getTrigger() <em>Trigger</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTrigger()
   * @generated
   * @ordered
   */
  protected Context trigger;

  /**
   * The default value of the '{@link #getFakeMethod() <em>Fake Method</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFakeMethod()
   * @generated
   * @ordered
   */
  protected static final String FAKE_METHOD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFakeMethod() <em>Fake Method</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFakeMethod()
   * @generated
   * @ordered
   */
  protected String fakeMethod = FAKE_METHOD_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PREQueryTriggerImpl()
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
    return DomainPackage.Literals.PRE_QUERY_TRIGGER;
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
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.PRE_QUERY_TRIGGER__UID, oldUid, uid));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Context getTrigger()
  {
    return trigger;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTrigger(Context newTrigger, NotificationChain msgs)
  {
    Context oldTrigger = trigger;
    trigger = newTrigger;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.PRE_QUERY_TRIGGER__TRIGGER, oldTrigger, newTrigger);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTrigger(Context newTrigger)
  {
    if (newTrigger != trigger)
    {
      NotificationChain msgs = null;
      if (trigger != null)
        msgs = ((InternalEObject)trigger).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.PRE_QUERY_TRIGGER__TRIGGER, null, msgs);
      if (newTrigger != null)
        msgs = ((InternalEObject)newTrigger).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainPackage.PRE_QUERY_TRIGGER__TRIGGER, null, msgs);
      msgs = basicSetTrigger(newTrigger, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.PRE_QUERY_TRIGGER__TRIGGER, newTrigger, newTrigger));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFakeMethod()
  {
    return fakeMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFakeMethod(String newFakeMethod)
  {
    String oldFakeMethod = fakeMethod;
    fakeMethod = newFakeMethod;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.PRE_QUERY_TRIGGER__FAKE_METHOD, oldFakeMethod, fakeMethod));
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
      case DomainPackage.PRE_QUERY_TRIGGER__TRIGGER:
        return basicSetTrigger(null, msgs);
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
      case DomainPackage.PRE_QUERY_TRIGGER__UID:
        return getUid();
      case DomainPackage.PRE_QUERY_TRIGGER__TRIGGER:
        return getTrigger();
      case DomainPackage.PRE_QUERY_TRIGGER__FAKE_METHOD:
        return getFakeMethod();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DomainPackage.PRE_QUERY_TRIGGER__UID:
        setUid((String)newValue);
        return;
      case DomainPackage.PRE_QUERY_TRIGGER__TRIGGER:
        setTrigger((Context)newValue);
        return;
      case DomainPackage.PRE_QUERY_TRIGGER__FAKE_METHOD:
        setFakeMethod((String)newValue);
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
      case DomainPackage.PRE_QUERY_TRIGGER__UID:
        setUid(UID_EDEFAULT);
        return;
      case DomainPackage.PRE_QUERY_TRIGGER__TRIGGER:
        setTrigger((Context)null);
        return;
      case DomainPackage.PRE_QUERY_TRIGGER__FAKE_METHOD:
        setFakeMethod(FAKE_METHOD_EDEFAULT);
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
      case DomainPackage.PRE_QUERY_TRIGGER__UID:
        return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
      case DomainPackage.PRE_QUERY_TRIGGER__TRIGGER:
        return trigger != null;
      case DomainPackage.PRE_QUERY_TRIGGER__FAKE_METHOD:
        return FAKE_METHOD_EDEFAULT == null ? fakeMethod != null : !FAKE_METHOD_EDEFAULT.equals(fakeMethod);
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
    result.append(", fakeMethod: ");
    result.append(fakeMethod);
    result.append(')');
    return result.toString();
  }

} //PREQueryTriggerImpl
