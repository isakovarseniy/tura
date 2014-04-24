/**
 */
package domain.impl;

import domain.DomainPackage;
import domain.ViewPort;
import domain.ViewPortHolder;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View Port Holder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link domain.impl.ViewPortHolderImpl#getViewPorts <em>View Ports</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ViewPortHolderImpl extends HTMLLayerHolderImpl implements ViewPortHolder
{
  /**
   * The cached value of the '{@link #getViewPorts() <em>View Ports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getViewPorts()
   * @generated
   * @ordered
   */
  protected EList<ViewPort> viewPorts;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ViewPortHolderImpl()
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
    return DomainPackage.Literals.VIEW_PORT_HOLDER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ViewPort> getViewPorts()
  {
    if (viewPorts == null)
    {
      viewPorts = new EObjectContainmentEList<ViewPort>(ViewPort.class, this, DomainPackage.VIEW_PORT_HOLDER__VIEW_PORTS);
    }
    return viewPorts;
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
      case DomainPackage.VIEW_PORT_HOLDER__VIEW_PORTS:
        return ((InternalEList<?>)getViewPorts()).basicRemove(otherEnd, msgs);
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
      case DomainPackage.VIEW_PORT_HOLDER__VIEW_PORTS:
        return getViewPorts();
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
      case DomainPackage.VIEW_PORT_HOLDER__VIEW_PORTS:
        getViewPorts().clear();
        getViewPorts().addAll((Collection<? extends ViewPort>)newValue);
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
      case DomainPackage.VIEW_PORT_HOLDER__VIEW_PORTS:
        getViewPorts().clear();
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
      case DomainPackage.VIEW_PORT_HOLDER__VIEW_PORTS:
        return viewPorts != null && !viewPorts.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ViewPortHolderImpl
