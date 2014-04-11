/**
 */
package domain.impl;

import domain.DomainPackage;
import domain.HTMLLayerHolder;
import domain.ViewPort;
import domain.ViewPortHolder;
import domain.Window;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Window</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link domain.impl.WindowImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link domain.impl.WindowImpl#getViewPorts <em>View Ports</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WindowImpl extends CanvasFrameImpl implements Window
{
  /**
   * The default value of the '{@link #getColumns() <em>Columns</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColumns()
   * @generated
   * @ordered
   */
  protected static final int COLUMNS_EDEFAULT = 1;
  /**
   * The cached value of the '{@link #getColumns() <em>Columns</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColumns()
   * @generated
   * @ordered
   */
  protected int columns = COLUMNS_EDEFAULT;
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
  protected WindowImpl()
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
    return DomainPackage.Literals.WINDOW;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getColumns()
  {
    return columns;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setColumns(int newColumns)
  {
    int oldColumns = columns;
    columns = newColumns;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.WINDOW__COLUMNS, oldColumns, columns));
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
      viewPorts = new EObjectContainmentEList<ViewPort>(ViewPort.class, this, DomainPackage.WINDOW__VIEW_PORTS);
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
      case DomainPackage.WINDOW__VIEW_PORTS:
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
      case DomainPackage.WINDOW__COLUMNS:
        return getColumns();
      case DomainPackage.WINDOW__VIEW_PORTS:
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
      case DomainPackage.WINDOW__COLUMNS:
        setColumns((Integer)newValue);
        return;
      case DomainPackage.WINDOW__VIEW_PORTS:
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
      case DomainPackage.WINDOW__COLUMNS:
        setColumns(COLUMNS_EDEFAULT);
        return;
      case DomainPackage.WINDOW__VIEW_PORTS:
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
      case DomainPackage.WINDOW__COLUMNS:
        return columns != COLUMNS_EDEFAULT;
      case DomainPackage.WINDOW__VIEW_PORTS:
        return viewPorts != null && !viewPorts.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == HTMLLayerHolder.class)
    {
      switch (derivedFeatureID)
      {
        case DomainPackage.WINDOW__COLUMNS: return DomainPackage.HTML_LAYER_HOLDER__COLUMNS;
        default: return -1;
      }
    }
    if (baseClass == ViewPortHolder.class)
    {
      switch (derivedFeatureID)
      {
        case DomainPackage.WINDOW__VIEW_PORTS: return DomainPackage.VIEW_PORT_HOLDER__VIEW_PORTS;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == HTMLLayerHolder.class)
    {
      switch (baseFeatureID)
      {
        case DomainPackage.HTML_LAYER_HOLDER__COLUMNS: return DomainPackage.WINDOW__COLUMNS;
        default: return -1;
      }
    }
    if (baseClass == ViewPortHolder.class)
    {
      switch (baseFeatureID)
      {
        case DomainPackage.VIEW_PORT_HOLDER__VIEW_PORTS: return DomainPackage.WINDOW__VIEW_PORTS;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
    result.append(" (columns: ");
    result.append(columns);
    result.append(')');
    return result.toString();
  }

} //WindowImpl
