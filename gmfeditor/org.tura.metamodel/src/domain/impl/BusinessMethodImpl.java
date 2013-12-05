/**
 */
package domain.impl;

import domain.BusinessMethod;
import domain.DomainPackage;
import domain.Operation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Business Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link domain.impl.BusinessMethodImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.impl.BusinessMethodImpl#getMethodRef <em>Method Ref</em>}</li>
 *   <li>{@link domain.impl.BusinessMethodImpl#getFakeMethod <em>Fake Method</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BusinessMethodImpl extends TypePointerImpl implements BusinessMethod
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
   * The cached value of the '{@link #getMethodRef() <em>Method Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethodRef()
   * @generated
   * @ordered
   */
  protected Operation methodRef;

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
  protected BusinessMethodImpl()
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
    return DomainPackage.Literals.BUSINESS_METHOD;
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
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.BUSINESS_METHOD__UID, oldUid, uid));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operation getMethodRef()
  {
    if (methodRef != null && methodRef.eIsProxy())
    {
      InternalEObject oldMethodRef = (InternalEObject)methodRef;
      methodRef = (Operation)eResolveProxy(oldMethodRef);
      if (methodRef != oldMethodRef)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.BUSINESS_METHOD__METHOD_REF, oldMethodRef, methodRef));
      }
    }
    return methodRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operation basicGetMethodRef()
  {
    return methodRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMethodRef(Operation newMethodRef)
  {
    Operation oldMethodRef = methodRef;
    methodRef = newMethodRef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.BUSINESS_METHOD__METHOD_REF, oldMethodRef, methodRef));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.BUSINESS_METHOD__FAKE_METHOD, oldFakeMethod, fakeMethod));
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
      case DomainPackage.BUSINESS_METHOD__UID:
        return getUid();
      case DomainPackage.BUSINESS_METHOD__METHOD_REF:
        if (resolve) return getMethodRef();
        return basicGetMethodRef();
      case DomainPackage.BUSINESS_METHOD__FAKE_METHOD:
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
      case DomainPackage.BUSINESS_METHOD__UID:
        setUid((String)newValue);
        return;
      case DomainPackage.BUSINESS_METHOD__METHOD_REF:
        setMethodRef((Operation)newValue);
        return;
      case DomainPackage.BUSINESS_METHOD__FAKE_METHOD:
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
      case DomainPackage.BUSINESS_METHOD__UID:
        setUid(UID_EDEFAULT);
        return;
      case DomainPackage.BUSINESS_METHOD__METHOD_REF:
        setMethodRef((Operation)null);
        return;
      case DomainPackage.BUSINESS_METHOD__FAKE_METHOD:
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
      case DomainPackage.BUSINESS_METHOD__UID:
        return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
      case DomainPackage.BUSINESS_METHOD__METHOD_REF:
        return methodRef != null;
      case DomainPackage.BUSINESS_METHOD__FAKE_METHOD:
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

} //BusinessMethodImpl
