/**
 */
package domain.impl;

import domain.Context;
import domain.DomainPackage;
import domain.SourcesPointer;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sources Pointer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link domain.impl.SourcesPointerImpl#getSourcePointer <em>Source Pointer</em>}</li>
 *   <li>{@link domain.impl.SourcesPointerImpl#getValuePointer <em>Value Pointer</em>}</li>
 *   <li>{@link domain.impl.SourcesPointerImpl#getSourceCast <em>Source Cast</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SourcesPointerImpl extends UielementImpl implements SourcesPointer
{
  /**
   * The cached value of the '{@link #getSourcePointer() <em>Source Pointer</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourcePointer()
   * @generated
   * @ordered
   */
  protected Context sourcePointer;

  /**
   * The cached value of the '{@link #getValuePointer() <em>Value Pointer</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValuePointer()
   * @generated
   * @ordered
   */
  protected Context valuePointer;

  /**
   * The cached value of the '{@link #getSourceCast() <em>Source Cast</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourceCast()
   * @generated
   * @ordered
   */
  protected Context sourceCast;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SourcesPointerImpl()
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
    return DomainPackage.Literals.SOURCES_POINTER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Context getSourcePointer()
  {
    return sourcePointer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSourcePointer(Context newSourcePointer, NotificationChain msgs)
  {
    Context oldSourcePointer = sourcePointer;
    sourcePointer = newSourcePointer;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.SOURCES_POINTER__SOURCE_POINTER, oldSourcePointer, newSourcePointer);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSourcePointer(Context newSourcePointer)
  {
    if (newSourcePointer != sourcePointer)
    {
      NotificationChain msgs = null;
      if (sourcePointer != null)
        msgs = ((InternalEObject)sourcePointer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.SOURCES_POINTER__SOURCE_POINTER, null, msgs);
      if (newSourcePointer != null)
        msgs = ((InternalEObject)newSourcePointer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainPackage.SOURCES_POINTER__SOURCE_POINTER, null, msgs);
      msgs = basicSetSourcePointer(newSourcePointer, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.SOURCES_POINTER__SOURCE_POINTER, newSourcePointer, newSourcePointer));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Context getValuePointer()
  {
    return valuePointer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValuePointer(Context newValuePointer, NotificationChain msgs)
  {
    Context oldValuePointer = valuePointer;
    valuePointer = newValuePointer;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.SOURCES_POINTER__VALUE_POINTER, oldValuePointer, newValuePointer);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValuePointer(Context newValuePointer)
  {
    if (newValuePointer != valuePointer)
    {
      NotificationChain msgs = null;
      if (valuePointer != null)
        msgs = ((InternalEObject)valuePointer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.SOURCES_POINTER__VALUE_POINTER, null, msgs);
      if (newValuePointer != null)
        msgs = ((InternalEObject)newValuePointer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainPackage.SOURCES_POINTER__VALUE_POINTER, null, msgs);
      msgs = basicSetValuePointer(newValuePointer, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.SOURCES_POINTER__VALUE_POINTER, newValuePointer, newValuePointer));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Context getSourceCast()
  {
    return sourceCast;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSourceCast(Context newSourceCast, NotificationChain msgs)
  {
    Context oldSourceCast = sourceCast;
    sourceCast = newSourceCast;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.SOURCES_POINTER__SOURCE_CAST, oldSourceCast, newSourceCast);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSourceCast(Context newSourceCast)
  {
    if (newSourceCast != sourceCast)
    {
      NotificationChain msgs = null;
      if (sourceCast != null)
        msgs = ((InternalEObject)sourceCast).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.SOURCES_POINTER__SOURCE_CAST, null, msgs);
      if (newSourceCast != null)
        msgs = ((InternalEObject)newSourceCast).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainPackage.SOURCES_POINTER__SOURCE_CAST, null, msgs);
      msgs = basicSetSourceCast(newSourceCast, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.SOURCES_POINTER__SOURCE_CAST, newSourceCast, newSourceCast));
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
      case DomainPackage.SOURCES_POINTER__SOURCE_POINTER:
        return basicSetSourcePointer(null, msgs);
      case DomainPackage.SOURCES_POINTER__VALUE_POINTER:
        return basicSetValuePointer(null, msgs);
      case DomainPackage.SOURCES_POINTER__SOURCE_CAST:
        return basicSetSourceCast(null, msgs);
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
      case DomainPackage.SOURCES_POINTER__SOURCE_POINTER:
        return getSourcePointer();
      case DomainPackage.SOURCES_POINTER__VALUE_POINTER:
        return getValuePointer();
      case DomainPackage.SOURCES_POINTER__SOURCE_CAST:
        return getSourceCast();
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
      case DomainPackage.SOURCES_POINTER__SOURCE_POINTER:
        setSourcePointer((Context)newValue);
        return;
      case DomainPackage.SOURCES_POINTER__VALUE_POINTER:
        setValuePointer((Context)newValue);
        return;
      case DomainPackage.SOURCES_POINTER__SOURCE_CAST:
        setSourceCast((Context)newValue);
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
      case DomainPackage.SOURCES_POINTER__SOURCE_POINTER:
        setSourcePointer((Context)null);
        return;
      case DomainPackage.SOURCES_POINTER__VALUE_POINTER:
        setValuePointer((Context)null);
        return;
      case DomainPackage.SOURCES_POINTER__SOURCE_CAST:
        setSourceCast((Context)null);
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
      case DomainPackage.SOURCES_POINTER__SOURCE_POINTER:
        return sourcePointer != null;
      case DomainPackage.SOURCES_POINTER__VALUE_POINTER:
        return valuePointer != null;
      case DomainPackage.SOURCES_POINTER__SOURCE_CAST:
        return sourceCast != null;
    }
    return super.eIsSet(featureID);
  }

} //SourcesPointerImpl
