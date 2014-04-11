/**
 */
package domain.impl;

import domain.Canvas;
import domain.DefaultCavas;
import domain.DomainPackage;
import domain.HTMLLayerHolder;
import domain.ViewPort;
import domain.ViewPortHolder;

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
 * An implementation of the model object '<em><b>Canvas</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link domain.impl.CanvasImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link domain.impl.CanvasImpl#getViewPorts <em>View Ports</em>}</li>
 *   <li>{@link domain.impl.CanvasImpl#isDefaultCanvas <em>Default Canvas</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CanvasImpl extends CanvasFrameImpl implements Canvas
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
   * The default value of the '{@link #isDefaultCanvas() <em>Default Canvas</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDefaultCanvas()
   * @generated
   * @ordered
   */
  protected static final boolean DEFAULT_CANVAS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDefaultCanvas() <em>Default Canvas</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDefaultCanvas()
   * @generated
   * @ordered
   */
  protected boolean defaultCanvas = DEFAULT_CANVAS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CanvasImpl()
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
    return DomainPackage.Literals.CANVAS;
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
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.CANVAS__COLUMNS, oldColumns, columns));
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
      viewPorts = new EObjectContainmentEList<ViewPort>(ViewPort.class, this, DomainPackage.CANVAS__VIEW_PORTS);
    }
    return viewPorts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDefaultCanvas()
  {
    return defaultCanvas;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefaultCanvas(boolean newDefaultCanvas)
  {
    boolean oldDefaultCanvas = defaultCanvas;
    defaultCanvas = newDefaultCanvas;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.CANVAS__DEFAULT_CANVAS, oldDefaultCanvas, defaultCanvas));
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
      case DomainPackage.CANVAS__VIEW_PORTS:
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
      case DomainPackage.CANVAS__COLUMNS:
        return getColumns();
      case DomainPackage.CANVAS__VIEW_PORTS:
        return getViewPorts();
      case DomainPackage.CANVAS__DEFAULT_CANVAS:
        return isDefaultCanvas();
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
      case DomainPackage.CANVAS__COLUMNS:
        setColumns((Integer)newValue);
        return;
      case DomainPackage.CANVAS__VIEW_PORTS:
        getViewPorts().clear();
        getViewPorts().addAll((Collection<? extends ViewPort>)newValue);
        return;
      case DomainPackage.CANVAS__DEFAULT_CANVAS:
        setDefaultCanvas((Boolean)newValue);
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
      case DomainPackage.CANVAS__COLUMNS:
        setColumns(COLUMNS_EDEFAULT);
        return;
      case DomainPackage.CANVAS__VIEW_PORTS:
        getViewPorts().clear();
        return;
      case DomainPackage.CANVAS__DEFAULT_CANVAS:
        setDefaultCanvas(DEFAULT_CANVAS_EDEFAULT);
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
      case DomainPackage.CANVAS__COLUMNS:
        return columns != COLUMNS_EDEFAULT;
      case DomainPackage.CANVAS__VIEW_PORTS:
        return viewPorts != null && !viewPorts.isEmpty();
      case DomainPackage.CANVAS__DEFAULT_CANVAS:
        return defaultCanvas != DEFAULT_CANVAS_EDEFAULT;
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
        case DomainPackage.CANVAS__COLUMNS: return DomainPackage.HTML_LAYER_HOLDER__COLUMNS;
        default: return -1;
      }
    }
    if (baseClass == ViewPortHolder.class)
    {
      switch (derivedFeatureID)
      {
        case DomainPackage.CANVAS__VIEW_PORTS: return DomainPackage.VIEW_PORT_HOLDER__VIEW_PORTS;
        default: return -1;
      }
    }
    if (baseClass == DefaultCavas.class)
    {
      switch (derivedFeatureID)
      {
        case DomainPackage.CANVAS__DEFAULT_CANVAS: return DomainPackage.DEFAULT_CAVAS__DEFAULT_CANVAS;
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
        case DomainPackage.HTML_LAYER_HOLDER__COLUMNS: return DomainPackage.CANVAS__COLUMNS;
        default: return -1;
      }
    }
    if (baseClass == ViewPortHolder.class)
    {
      switch (baseFeatureID)
      {
        case DomainPackage.VIEW_PORT_HOLDER__VIEW_PORTS: return DomainPackage.CANVAS__VIEW_PORTS;
        default: return -1;
      }
    }
    if (baseClass == DefaultCavas.class)
    {
      switch (baseFeatureID)
      {
        case DomainPackage.DEFAULT_CAVAS__DEFAULT_CANVAS: return DomainPackage.CANVAS__DEFAULT_CANVAS;
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
    result.append(", defaultCanvas: ");
    result.append(defaultCanvas);
    result.append(')');
    return result.toString();
  }

} //CanvasImpl
