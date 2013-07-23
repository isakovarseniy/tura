/**
 */
package domain.impl;

import businessobjects.BusinessObjects;
import businessobjects.impl.BusinessObjectsImpl;

import domain.Dammy2;
import domain.DomainPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dammy2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link domain.impl.Dammy2Impl#getD2 <em>D2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Dammy2Impl extends EObjectImpl implements Dammy2
{
  /**
   * The cached value of the '{@link #getD2() <em>D2</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getD2()
   * @generated
   * @ordered
   */
  protected BusinessObjects d2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Dammy2Impl()
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
    return DomainPackage.Literals.DAMMY2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BusinessObjects getD2()
  {
    if (d2 != null && d2.eIsProxy())
    {
      InternalEObject oldD2 = (InternalEObject)d2;
      d2 = (BusinessObjects)eResolveProxy(oldD2);
      if (d2 != oldD2)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.DAMMY2__D2, oldD2, d2));
      }
    }
    return d2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BusinessObjects basicGetD2()
  {
    return d2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setD2(BusinessObjects newD2)
  {
    BusinessObjects oldD2 = d2;
    d2 = newD2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DAMMY2__D2, oldD2, d2));
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
      case DomainPackage.DAMMY2__D2:
        if (resolve) return getD2();
        return basicGetD2();
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
      case DomainPackage.DAMMY2__D2:
        setD2((BusinessObjects)newValue);
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
      case DomainPackage.DAMMY2__D2:
        setD2((BusinessObjects)null);
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
      case DomainPackage.DAMMY2__D2:
        return d2 != null;
    }
    return super.eIsSet(featureID);
  }

} //Dammy2Impl
