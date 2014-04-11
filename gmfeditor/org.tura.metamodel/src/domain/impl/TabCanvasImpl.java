/**
 */
package domain.impl;

import domain.DefaultCavas;
import domain.DomainPackage;
import domain.TabCanvas;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tab Canvas</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link domain.impl.TabCanvasImpl#isDefaultCanvas <em>Default Canvas</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TabCanvasImpl extends CanvasFrameImpl implements TabCanvas
{
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
  protected TabCanvasImpl()
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
    return DomainPackage.Literals.TAB_CANVAS;
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
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.TAB_CANVAS__DEFAULT_CANVAS, oldDefaultCanvas, defaultCanvas));
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
      case DomainPackage.TAB_CANVAS__DEFAULT_CANVAS:
        return isDefaultCanvas();
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
      case DomainPackage.TAB_CANVAS__DEFAULT_CANVAS:
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
      case DomainPackage.TAB_CANVAS__DEFAULT_CANVAS:
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
      case DomainPackage.TAB_CANVAS__DEFAULT_CANVAS:
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
    if (baseClass == DefaultCavas.class)
    {
      switch (derivedFeatureID)
      {
        case DomainPackage.TAB_CANVAS__DEFAULT_CANVAS: return DomainPackage.DEFAULT_CAVAS__DEFAULT_CANVAS;
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
    if (baseClass == DefaultCavas.class)
    {
      switch (baseFeatureID)
      {
        case DomainPackage.DEFAULT_CAVAS__DEFAULT_CANVAS: return DomainPackage.TAB_CANVAS__DEFAULT_CANVAS;
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
    result.append(" (defaultCanvas: ");
    result.append(defaultCanvas);
    result.append(')');
    return result.toString();
  }

} //TabCanvasImpl
