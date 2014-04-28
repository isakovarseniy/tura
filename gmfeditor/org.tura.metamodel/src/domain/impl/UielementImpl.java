/**
 */
package domain.impl;

import domain.Context;
import domain.DomainPackage;
import domain.Uielement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Uielement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link domain.impl.UielementImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.impl.UielementImpl#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link domain.impl.UielementImpl#getEnabledContext <em>Enabled Context</em>}</li>
 *   <li>{@link domain.impl.UielementImpl#isRequired <em>Required</em>}</li>
 *   <li>{@link domain.impl.UielementImpl#getRequiredContext <em>Required Context</em>}</li>
 *   <li>{@link domain.impl.UielementImpl#isReadOnly <em>Read Only</em>}</li>
 *   <li>{@link domain.impl.UielementImpl#getReadOnlyContext <em>Read Only Context</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UielementImpl extends StyleElementImpl implements Uielement
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
   * The default value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEnabled()
   * @generated
   * @ordered
   */
  protected static final boolean ENABLED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEnabled()
   * @generated
   * @ordered
   */
  protected boolean enabled = ENABLED_EDEFAULT;

  /**
   * The cached value of the '{@link #getEnabledContext() <em>Enabled Context</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnabledContext()
   * @generated
   * @ordered
   */
  protected Context enabledContext;

  /**
   * The default value of the '{@link #isRequired() <em>Required</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRequired()
   * @generated
   * @ordered
   */
  protected static final boolean REQUIRED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isRequired() <em>Required</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRequired()
   * @generated
   * @ordered
   */
  protected boolean required = REQUIRED_EDEFAULT;

  /**
   * The cached value of the '{@link #getRequiredContext() <em>Required Context</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRequiredContext()
   * @generated
   * @ordered
   */
  protected Context requiredContext;

  /**
   * The default value of the '{@link #isReadOnly() <em>Read Only</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isReadOnly()
   * @generated
   * @ordered
   */
  protected static final boolean READ_ONLY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isReadOnly() <em>Read Only</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isReadOnly()
   * @generated
   * @ordered
   */
  protected boolean readOnly = READ_ONLY_EDEFAULT;

  /**
   * The cached value of the '{@link #getReadOnlyContext() <em>Read Only Context</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReadOnlyContext()
   * @generated
   * @ordered
   */
  protected Context readOnlyContext;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UielementImpl()
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
    return DomainPackage.Literals.UIELEMENT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.UIELEMENT__UID, oldUid, uid));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isEnabled()
  {
    return enabled;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEnabled(boolean newEnabled)
  {
    boolean oldEnabled = enabled;
    enabled = newEnabled;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.UIELEMENT__ENABLED, oldEnabled, enabled));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Context getEnabledContext()
  {
    return enabledContext;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEnabledContext(Context newEnabledContext, NotificationChain msgs)
  {
    Context oldEnabledContext = enabledContext;
    enabledContext = newEnabledContext;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.UIELEMENT__ENABLED_CONTEXT, oldEnabledContext, newEnabledContext);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEnabledContext(Context newEnabledContext)
  {
    if (newEnabledContext != enabledContext)
    {
      NotificationChain msgs = null;
      if (enabledContext != null)
        msgs = ((InternalEObject)enabledContext).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.UIELEMENT__ENABLED_CONTEXT, null, msgs);
      if (newEnabledContext != null)
        msgs = ((InternalEObject)newEnabledContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainPackage.UIELEMENT__ENABLED_CONTEXT, null, msgs);
      msgs = basicSetEnabledContext(newEnabledContext, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.UIELEMENT__ENABLED_CONTEXT, newEnabledContext, newEnabledContext));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isRequired()
  {
    return required;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRequired(boolean newRequired)
  {
    boolean oldRequired = required;
    required = newRequired;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.UIELEMENT__REQUIRED, oldRequired, required));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Context getRequiredContext()
  {
    return requiredContext;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRequiredContext(Context newRequiredContext, NotificationChain msgs)
  {
    Context oldRequiredContext = requiredContext;
    requiredContext = newRequiredContext;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.UIELEMENT__REQUIRED_CONTEXT, oldRequiredContext, newRequiredContext);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRequiredContext(Context newRequiredContext)
  {
    if (newRequiredContext != requiredContext)
    {
      NotificationChain msgs = null;
      if (requiredContext != null)
        msgs = ((InternalEObject)requiredContext).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.UIELEMENT__REQUIRED_CONTEXT, null, msgs);
      if (newRequiredContext != null)
        msgs = ((InternalEObject)newRequiredContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainPackage.UIELEMENT__REQUIRED_CONTEXT, null, msgs);
      msgs = basicSetRequiredContext(newRequiredContext, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.UIELEMENT__REQUIRED_CONTEXT, newRequiredContext, newRequiredContext));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isReadOnly()
  {
    return readOnly;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReadOnly(boolean newReadOnly)
  {
    boolean oldReadOnly = readOnly;
    readOnly = newReadOnly;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.UIELEMENT__READ_ONLY, oldReadOnly, readOnly));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Context getReadOnlyContext()
  {
    return readOnlyContext;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReadOnlyContext(Context newReadOnlyContext, NotificationChain msgs)
  {
    Context oldReadOnlyContext = readOnlyContext;
    readOnlyContext = newReadOnlyContext;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.UIELEMENT__READ_ONLY_CONTEXT, oldReadOnlyContext, newReadOnlyContext);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReadOnlyContext(Context newReadOnlyContext)
  {
    if (newReadOnlyContext != readOnlyContext)
    {
      NotificationChain msgs = null;
      if (readOnlyContext != null)
        msgs = ((InternalEObject)readOnlyContext).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.UIELEMENT__READ_ONLY_CONTEXT, null, msgs);
      if (newReadOnlyContext != null)
        msgs = ((InternalEObject)newReadOnlyContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainPackage.UIELEMENT__READ_ONLY_CONTEXT, null, msgs);
      msgs = basicSetReadOnlyContext(newReadOnlyContext, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.UIELEMENT__READ_ONLY_CONTEXT, newReadOnlyContext, newReadOnlyContext));
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
      case DomainPackage.UIELEMENT__ENABLED_CONTEXT:
        return basicSetEnabledContext(null, msgs);
      case DomainPackage.UIELEMENT__REQUIRED_CONTEXT:
        return basicSetRequiredContext(null, msgs);
      case DomainPackage.UIELEMENT__READ_ONLY_CONTEXT:
        return basicSetReadOnlyContext(null, msgs);
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
      case DomainPackage.UIELEMENT__UID:
        return getUid();
      case DomainPackage.UIELEMENT__ENABLED:
        return isEnabled();
      case DomainPackage.UIELEMENT__ENABLED_CONTEXT:
        return getEnabledContext();
      case DomainPackage.UIELEMENT__REQUIRED:
        return isRequired();
      case DomainPackage.UIELEMENT__REQUIRED_CONTEXT:
        return getRequiredContext();
      case DomainPackage.UIELEMENT__READ_ONLY:
        return isReadOnly();
      case DomainPackage.UIELEMENT__READ_ONLY_CONTEXT:
        return getReadOnlyContext();
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
      case DomainPackage.UIELEMENT__UID:
        setUid((String)newValue);
        return;
      case DomainPackage.UIELEMENT__ENABLED:
        setEnabled((Boolean)newValue);
        return;
      case DomainPackage.UIELEMENT__ENABLED_CONTEXT:
        setEnabledContext((Context)newValue);
        return;
      case DomainPackage.UIELEMENT__REQUIRED:
        setRequired((Boolean)newValue);
        return;
      case DomainPackage.UIELEMENT__REQUIRED_CONTEXT:
        setRequiredContext((Context)newValue);
        return;
      case DomainPackage.UIELEMENT__READ_ONLY:
        setReadOnly((Boolean)newValue);
        return;
      case DomainPackage.UIELEMENT__READ_ONLY_CONTEXT:
        setReadOnlyContext((Context)newValue);
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
      case DomainPackage.UIELEMENT__UID:
        setUid(UID_EDEFAULT);
        return;
      case DomainPackage.UIELEMENT__ENABLED:
        setEnabled(ENABLED_EDEFAULT);
        return;
      case DomainPackage.UIELEMENT__ENABLED_CONTEXT:
        setEnabledContext((Context)null);
        return;
      case DomainPackage.UIELEMENT__REQUIRED:
        setRequired(REQUIRED_EDEFAULT);
        return;
      case DomainPackage.UIELEMENT__REQUIRED_CONTEXT:
        setRequiredContext((Context)null);
        return;
      case DomainPackage.UIELEMENT__READ_ONLY:
        setReadOnly(READ_ONLY_EDEFAULT);
        return;
      case DomainPackage.UIELEMENT__READ_ONLY_CONTEXT:
        setReadOnlyContext((Context)null);
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
      case DomainPackage.UIELEMENT__UID:
        return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
      case DomainPackage.UIELEMENT__ENABLED:
        return enabled != ENABLED_EDEFAULT;
      case DomainPackage.UIELEMENT__ENABLED_CONTEXT:
        return enabledContext != null;
      case DomainPackage.UIELEMENT__REQUIRED:
        return required != REQUIRED_EDEFAULT;
      case DomainPackage.UIELEMENT__REQUIRED_CONTEXT:
        return requiredContext != null;
      case DomainPackage.UIELEMENT__READ_ONLY:
        return readOnly != READ_ONLY_EDEFAULT;
      case DomainPackage.UIELEMENT__READ_ONLY_CONTEXT:
        return readOnlyContext != null;
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
    result.append(", enabled: ");
    result.append(enabled);
    result.append(", required: ");
    result.append(required);
    result.append(", readOnly: ");
    result.append(readOnly);
    result.append(')');
    return result.toString();
  }

} //UielementImpl
