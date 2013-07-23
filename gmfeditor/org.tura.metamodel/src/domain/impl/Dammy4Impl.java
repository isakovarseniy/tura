/**
 */
package domain.impl;

import domain.Dammy4;
import domain.DomainPackage;

import mapper.Mappers;
import org.eclipse.emf.common.notify.Notification;
import mapper.impl.MappersImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dammy4</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link domain.impl.Dammy4Impl#getD4 <em>D4</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Dammy4Impl extends EObjectImpl implements Dammy4
{
  /**
   * The cached value of the '{@link #getD4() <em>D4</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getD4()
   * @generated
   * @ordered
   */
  protected Mappers d4;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Dammy4Impl()
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
    return DomainPackage.Literals.DAMMY4;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mappers getD4()
  {
    if (d4 != null && d4.eIsProxy())
    {
      InternalEObject oldD4 = (InternalEObject)d4;
      d4 = (Mappers)eResolveProxy(oldD4);
      if (d4 != oldD4)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.DAMMY4__D4, oldD4, d4));
      }
    }
    return d4;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mappers basicGetD4()
  {
    return d4;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setD4(Mappers newD4)
  {
    Mappers oldD4 = d4;
    d4 = newD4;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DAMMY4__D4, oldD4, d4));
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
      case DomainPackage.DAMMY4__D4:
        if (resolve) return getD4();
        return basicGetD4();
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
      case DomainPackage.DAMMY4__D4:
        setD4((Mappers)newValue);
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
      case DomainPackage.DAMMY4__D4:
        setD4((Mappers)null);
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
      case DomainPackage.DAMMY4__D4:
        return d4 != null;
    }
    return super.eIsSet(featureID);
  }

} //Dammy4Impl
