/**
 */
package application.impl;

import application.ApplicationPackage;
import application.Dummy5;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import typedefinition.TypeDefinition;
import typedefinition.impl.TypeDefinitionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dummy5</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link application.impl.Dummy5Impl#getD5 <em>D5</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Dummy5Impl extends EObjectImpl implements Dummy5
{
  /**
   * The cached value of the '{@link #getD5() <em>D5</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getD5()
   * @generated
   * @ordered
   */
  protected TypeDefinition d5;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Dummy5Impl()
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
    return ApplicationPackage.Literals.DUMMY5;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeDefinition getD5()
  {
    if (d5 != null && d5.eIsProxy())
    {
      InternalEObject oldD5 = (InternalEObject)d5;
      d5 = (TypeDefinition)eResolveProxy(oldD5);
      if (d5 != oldD5)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApplicationPackage.DUMMY5__D5, oldD5, d5));
      }
    }
    return d5;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeDefinition basicGetD5()
  {
    return d5;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setD5(TypeDefinition newD5)
  {
    TypeDefinition oldD5 = d5;
    d5 = newD5;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.DUMMY5__D5, oldD5, d5));
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
      case ApplicationPackage.DUMMY5__D5:
        if (resolve) return getD5();
        return basicGetD5();
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
      case ApplicationPackage.DUMMY5__D5:
        setD5((TypeDefinition)newValue);
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
      case ApplicationPackage.DUMMY5__D5:
        setD5((TypeDefinition)null);
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
      case ApplicationPackage.DUMMY5__D5:
        return d5 != null;
    }
    return super.eIsSet(featureID);
  }

} //Dummy5Impl
