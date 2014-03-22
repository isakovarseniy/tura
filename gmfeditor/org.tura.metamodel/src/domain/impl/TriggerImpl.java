/**
 */
package domain.impl;

import domain.DomainPackage;
import domain.Operation;
import domain.Trigger;
import domain.TriggerParameter;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link domain.impl.TriggerImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.impl.TriggerImpl#getName <em>Name</em>}</li>
 *   <li>{@link domain.impl.TriggerImpl#getMethodRef <em>Method Ref</em>}</li>
 *   <li>{@link domain.impl.TriggerImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link domain.impl.TriggerImpl#getFakeMethod <em>Fake Method</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TriggerImpl extends TypePointerImpl implements Trigger
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
   * The cached value of the '{@link #getMethodRef() <em>Method Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethodRef()
   * @generated
   * @ordered
   */
  protected Operation methodRef;

  /**
   * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameters()
   * @generated
   * @ordered
   */
  protected EList<TriggerParameter> parameters;

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
  protected TriggerImpl()
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
    return DomainPackage.Literals.TRIGGER;
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
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.TRIGGER__UID, oldUid, uid));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.TRIGGER__NAME, oldName, name));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.TRIGGER__METHOD_REF, oldMethodRef, methodRef));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.TRIGGER__METHOD_REF, oldMethodRef, methodRef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TriggerParameter> getParameters()
  {
    if (parameters == null)
    {
      parameters = new EObjectContainmentEList<TriggerParameter>(TriggerParameter.class, this, DomainPackage.TRIGGER__PARAMETERS);
    }
    return parameters;
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
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.TRIGGER__FAKE_METHOD, oldFakeMethod, fakeMethod));
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
      case DomainPackage.TRIGGER__PARAMETERS:
        return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
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
      case DomainPackage.TRIGGER__UID:
        return getUid();
      case DomainPackage.TRIGGER__NAME:
        return getName();
      case DomainPackage.TRIGGER__METHOD_REF:
        if (resolve) return getMethodRef();
        return basicGetMethodRef();
      case DomainPackage.TRIGGER__PARAMETERS:
        return getParameters();
      case DomainPackage.TRIGGER__FAKE_METHOD:
        return getFakeMethod();
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
      case DomainPackage.TRIGGER__UID:
        setUid((String)newValue);
        return;
      case DomainPackage.TRIGGER__NAME:
        setName((String)newValue);
        return;
      case DomainPackage.TRIGGER__METHOD_REF:
        setMethodRef((Operation)newValue);
        return;
      case DomainPackage.TRIGGER__PARAMETERS:
        getParameters().clear();
        getParameters().addAll((Collection<? extends TriggerParameter>)newValue);
        return;
      case DomainPackage.TRIGGER__FAKE_METHOD:
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
      case DomainPackage.TRIGGER__UID:
        setUid(UID_EDEFAULT);
        return;
      case DomainPackage.TRIGGER__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DomainPackage.TRIGGER__METHOD_REF:
        setMethodRef((Operation)null);
        return;
      case DomainPackage.TRIGGER__PARAMETERS:
        getParameters().clear();
        return;
      case DomainPackage.TRIGGER__FAKE_METHOD:
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
      case DomainPackage.TRIGGER__UID:
        return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
      case DomainPackage.TRIGGER__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DomainPackage.TRIGGER__METHOD_REF:
        return methodRef != null;
      case DomainPackage.TRIGGER__PARAMETERS:
        return parameters != null && !parameters.isEmpty();
      case DomainPackage.TRIGGER__FAKE_METHOD:
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
    result.append(", name: ");
    result.append(name);
    result.append(", fakeMethod: ");
    result.append(fakeMethod);
    result.append(')');
    return result.toString();
  }

} //TriggerImpl
