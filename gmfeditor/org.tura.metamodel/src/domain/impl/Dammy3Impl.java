/**
 */
package domain.impl;

import domain.Dammy3;
import domain.DomainPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import recipe.Recipes;
import recipe.impl.RecipesImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dammy3</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link domain.impl.Dammy3Impl#getD3 <em>D3</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Dammy3Impl extends EObjectImpl implements Dammy3
{
  /**
   * The cached value of the '{@link #getD3() <em>D3</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getD3()
   * @generated
   * @ordered
   */
  protected Recipes d3;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Dammy3Impl()
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
    return DomainPackage.Literals.DAMMY3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Recipes getD3()
  {
    if (d3 != null && d3.eIsProxy())
    {
      InternalEObject oldD3 = (InternalEObject)d3;
      d3 = (Recipes)eResolveProxy(oldD3);
      if (d3 != oldD3)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.DAMMY3__D3, oldD3, d3));
      }
    }
    return d3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Recipes basicGetD3()
  {
    return d3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setD3(Recipes newD3)
  {
    Recipes oldD3 = d3;
    d3 = newD3;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DAMMY3__D3, oldD3, d3));
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
      case DomainPackage.DAMMY3__D3:
        if (resolve) return getD3();
        return basicGetD3();
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
      case DomainPackage.DAMMY3__D3:
        setD3((Recipes)newValue);
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
      case DomainPackage.DAMMY3__D3:
        setD3((Recipes)null);
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
      case DomainPackage.DAMMY3__D3:
        return d3 != null;
    }
    return super.eIsSet(featureID);
  }

} //Dammy3Impl
