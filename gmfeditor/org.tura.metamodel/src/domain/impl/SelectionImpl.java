/**
 */
package domain.impl;

import domain.DomainPackage;
import domain.Selection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
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
   * The cached value of the '{@link #getDisplayOptionPointer() <em>Display Option Pointer</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDisplayOptionPointer()
   * @generated
   * @ordered
   */
  protected EObject displayOptionPointer;

  /**
   * The cached value of the '{@link #getValueOptionPointer() <em>Value Option Pointer</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValueOptionPointer()
   * @generated
   * @ordered
   */
  protected EObject valueOptionPointer;

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
  public EObject getDisplayOptionPointer()
  {
    if (displayOptionPointer != null && displayOptionPointer.eIsProxy())
    {
      InternalEObject oldDisplayOptionPointer = (InternalEObject)displayOptionPointer;
      displayOptionPointer = eResolveProxy(oldDisplayOptionPointer);
      if (displayOptionPointer != oldDisplayOptionPointer)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.SELECTION__DISPLAY_OPTION_POINTER, oldDisplayOptionPointer, displayOptionPointer));
      }
    }
    return displayOptionPointer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject basicGetDisplayOptionPointer()
  {
    return displayOptionPointer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDisplayOptionPointer(EObject newDisplayOptionPointer)
  {
    EObject oldDisplayOptionPointer = displayOptionPointer;
    displayOptionPointer = newDisplayOptionPointer;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.SELECTION__DISPLAY_OPTION_POINTER, oldDisplayOptionPointer, displayOptionPointer));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getValueOptionPointer()
  {
    if (valueOptionPointer != null && valueOptionPointer.eIsProxy())
    {
      InternalEObject oldValueOptionPointer = (InternalEObject)valueOptionPointer;
      valueOptionPointer = eResolveProxy(oldValueOptionPointer);
      if (valueOptionPointer != oldValueOptionPointer)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.SELECTION__VALUE_OPTION_POINTER, oldValueOptionPointer, valueOptionPointer));
      }
    }
    return valueOptionPointer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject basicGetValueOptionPointer()
  {
    return valueOptionPointer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValueOptionPointer(EObject newValueOptionPointer)
  {
    EObject oldValueOptionPointer = valueOptionPointer;
    valueOptionPointer = newValueOptionPointer;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.SELECTION__VALUE_OPTION_POINTER, oldValueOptionPointer, valueOptionPointer));
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
        if (resolve) return getDisplayOptionPointer();
        return basicGetDisplayOptionPointer();
      case DomainPackage.SELECTION__VALUE_OPTION_POINTER:
        if (resolve) return getValueOptionPointer();
        return basicGetValueOptionPointer();
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
        setDisplayOptionPointer((EObject)newValue);
        return;
      case DomainPackage.SELECTION__VALUE_OPTION_POINTER:
        setValueOptionPointer((EObject)newValue);
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
        setDisplayOptionPointer((EObject)null);
        return;
      case DomainPackage.SELECTION__VALUE_OPTION_POINTER:
        setValueOptionPointer((EObject)null);
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
