/**
 */
package domain.impl;

import domain.DataControl;
import domain.Context;
import domain.DomainPackage;
import domain.OptionSelection;

import domain.Type;
import domain.TypePointer;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Option Selection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link domain.impl.OptionSelectionImpl#getOptionPointer <em>Option Pointer</em>}</li>
 *   <li>{@link domain.impl.OptionSelectionImpl#getOptionCast <em>Option Cast</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OptionSelectionImpl extends InputElementImpl implements OptionSelection
{
  /**
   * The cached value of the '{@link #getOptionPointer() <em>Option Pointer</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOptionPointer()
   * @generated
   * @ordered
   */
  protected DataControl optionPointer;

  /**
   * The cached value of the '{@link #getOptionCast() <em>Option Cast</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOptionCast()
   * @generated
   * @ordered
   */
  protected Type optionCast;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OptionSelectionImpl()
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
    return DomainPackage.Literals.OPTION_SELECTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataControl getOptionPointer()
  {
    if (optionPointer != null && optionPointer.eIsProxy())
    {
      InternalEObject oldOptionPointer = (InternalEObject)optionPointer;
      optionPointer = (DataControl)eResolveProxy(oldOptionPointer);
      if (optionPointer != oldOptionPointer)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.OPTION_SELECTION__OPTION_POINTER, oldOptionPointer, optionPointer));
      }
    }
    return optionPointer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataControl basicGetOptionPointer()
  {
    return optionPointer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOptionPointer(DataControl newOptionPointer)
  {
    DataControl oldOptionPointer = optionPointer;
    optionPointer = newOptionPointer;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.OPTION_SELECTION__OPTION_POINTER, oldOptionPointer, optionPointer));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type getOptionCast()
  {
    if (optionCast != null && optionCast.eIsProxy())
    {
      InternalEObject oldOptionCast = (InternalEObject)optionCast;
      optionCast = (Type)eResolveProxy(oldOptionCast);
      if (optionCast != oldOptionCast)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.OPTION_SELECTION__OPTION_CAST, oldOptionCast, optionCast));
      }
    }
    return optionCast;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type basicGetOptionCast()
  {
    return optionCast;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOptionCast(Type newOptionCast)
  {
    Type oldOptionCast = optionCast;
    optionCast = newOptionCast;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.OPTION_SELECTION__OPTION_CAST, oldOptionCast, optionCast));
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
      case DomainPackage.OPTION_SELECTION__OPTION_POINTER:
        if (resolve) return getOptionPointer();
        return basicGetOptionPointer();
      case DomainPackage.OPTION_SELECTION__OPTION_CAST:
        if (resolve) return getOptionCast();
        return basicGetOptionCast();
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
      case DomainPackage.OPTION_SELECTION__OPTION_POINTER:
        setOptionPointer((DataControl)newValue);
        return;
      case DomainPackage.OPTION_SELECTION__OPTION_CAST:
        setOptionCast((Type)newValue);
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
      case DomainPackage.OPTION_SELECTION__OPTION_POINTER:
        setOptionPointer((DataControl)null);
        return;
      case DomainPackage.OPTION_SELECTION__OPTION_CAST:
        setOptionCast((Type)null);
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
      case DomainPackage.OPTION_SELECTION__OPTION_POINTER:
        return optionPointer != null;
      case DomainPackage.OPTION_SELECTION__OPTION_CAST:
        return optionCast != null;
    }
    return super.eIsSet(featureID);
  }

} //OptionSelectionImpl
