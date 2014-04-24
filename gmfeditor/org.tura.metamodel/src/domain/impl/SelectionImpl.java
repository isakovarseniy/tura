/**
 */
package domain.impl;

import domain.Context;
import domain.DomainPackage;
import domain.Selection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Selection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link domain.impl.SelectionImpl#getDisplayOptionPointer <em>Display Option Pointer</em>}</li>
 *   <li>{@link domain.impl.SelectionImpl#getValueOptionPointer <em>Value Option Pointer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SelectionImpl extends StyleElementImpl implements Selection
{
  /**
   * The cached value of the '{@link #getDisplayOptionPointer() <em>Display Option Pointer</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDisplayOptionPointer()
   * @generated
   * @ordered
   */
  protected Context displayOptionPointer;

  /**
   * The cached value of the '{@link #getValueOptionPointer() <em>Value Option Pointer</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValueOptionPointer()
   * @generated
   * @ordered
   */
  protected Context valueOptionPointer;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SelectionImpl()
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
    return DomainPackage.Literals.SELECTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Context getDisplayOptionPointer()
  {
    return displayOptionPointer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDisplayOptionPointer(Context newDisplayOptionPointer, NotificationChain msgs)
  {
    Context oldDisplayOptionPointer = displayOptionPointer;
    displayOptionPointer = newDisplayOptionPointer;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.SELECTION__DISPLAY_OPTION_POINTER, oldDisplayOptionPointer, newDisplayOptionPointer);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDisplayOptionPointer(Context newDisplayOptionPointer)
  {
    if (newDisplayOptionPointer != displayOptionPointer)
    {
      NotificationChain msgs = null;
      if (displayOptionPointer != null)
        msgs = ((InternalEObject)displayOptionPointer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.SELECTION__DISPLAY_OPTION_POINTER, null, msgs);
      if (newDisplayOptionPointer != null)
        msgs = ((InternalEObject)newDisplayOptionPointer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainPackage.SELECTION__DISPLAY_OPTION_POINTER, null, msgs);
      msgs = basicSetDisplayOptionPointer(newDisplayOptionPointer, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.SELECTION__DISPLAY_OPTION_POINTER, newDisplayOptionPointer, newDisplayOptionPointer));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Context getValueOptionPointer()
  {
    return valueOptionPointer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValueOptionPointer(Context newValueOptionPointer, NotificationChain msgs)
  {
    Context oldValueOptionPointer = valueOptionPointer;
    valueOptionPointer = newValueOptionPointer;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.SELECTION__VALUE_OPTION_POINTER, oldValueOptionPointer, newValueOptionPointer);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValueOptionPointer(Context newValueOptionPointer)
  {
    if (newValueOptionPointer != valueOptionPointer)
    {
      NotificationChain msgs = null;
      if (valueOptionPointer != null)
        msgs = ((InternalEObject)valueOptionPointer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.SELECTION__VALUE_OPTION_POINTER, null, msgs);
      if (newValueOptionPointer != null)
        msgs = ((InternalEObject)newValueOptionPointer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainPackage.SELECTION__VALUE_OPTION_POINTER, null, msgs);
      msgs = basicSetValueOptionPointer(newValueOptionPointer, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.SELECTION__VALUE_OPTION_POINTER, newValueOptionPointer, newValueOptionPointer));
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
      case DomainPackage.SELECTION__DISPLAY_OPTION_POINTER:
        return basicSetDisplayOptionPointer(null, msgs);
      case DomainPackage.SELECTION__VALUE_OPTION_POINTER:
        return basicSetValueOptionPointer(null, msgs);
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
      case DomainPackage.SELECTION__DISPLAY_OPTION_POINTER:
        return getDisplayOptionPointer();
      case DomainPackage.SELECTION__VALUE_OPTION_POINTER:
        return getValueOptionPointer();
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
      case DomainPackage.SELECTION__DISPLAY_OPTION_POINTER:
        setDisplayOptionPointer((Context)newValue);
        return;
      case DomainPackage.SELECTION__VALUE_OPTION_POINTER:
        setValueOptionPointer((Context)newValue);
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
      case DomainPackage.SELECTION__DISPLAY_OPTION_POINTER:
        setDisplayOptionPointer((Context)null);
        return;
      case DomainPackage.SELECTION__VALUE_OPTION_POINTER:
        setValueOptionPointer((Context)null);
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
      case DomainPackage.SELECTION__DISPLAY_OPTION_POINTER:
        return displayOptionPointer != null;
      case DomainPackage.SELECTION__VALUE_OPTION_POINTER:
        return valueOptionPointer != null;
    }
    return super.eIsSet(featureID);
  }

} //SelectionImpl
