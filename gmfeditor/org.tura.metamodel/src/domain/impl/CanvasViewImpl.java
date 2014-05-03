/**
 */
package domain.impl;

import domain.CanvasView;
import domain.DomainPackage;
import domain.LayerHolder;
import domain.ViewArea;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Canvas View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link domain.impl.CanvasViewImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.impl.CanvasViewImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link domain.impl.CanvasViewImpl#getBaseCanvas <em>Base Canvas</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CanvasViewImpl extends EObjectImpl implements CanvasView
{
  /**
   * The default value of the '{@link #getUid() <em>Uid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUid()
   * @generated
   * @ordered
   */
  protected static final String UID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUid() <em>Uid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUid()
   * @generated
   * @ordered
   */
  protected String uid = UID_EDEFAULT;

  /**
   * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParent()
   * @generated
   * @ordered
   */
  protected ViewArea parent;

  /**
   * The cached value of the '{@link #getBaseCanvas() <em>Base Canvas</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBaseCanvas()
   * @generated
   * @ordered
   */
  protected LayerHolder baseCanvas;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CanvasViewImpl()
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
    return DomainPackage.Literals.CANVAS_VIEW;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getUid()
  {
    return uid;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUid(String newUid)
  {
    String oldUid = uid;
    uid = newUid;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.CANVAS_VIEW__UID, oldUid, uid));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ViewArea getParent()
  {
    if (parent != null && parent.eIsProxy())
    {
      InternalEObject oldParent = (InternalEObject)parent;
      parent = (ViewArea)eResolveProxy(oldParent);
      if (parent != oldParent)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.CANVAS_VIEW__PARENT, oldParent, parent));
      }
    }
    return parent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ViewArea basicGetParent()
  {
    return parent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParent(ViewArea newParent, NotificationChain msgs)
  {
    ViewArea oldParent = parent;
    parent = newParent;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.CANVAS_VIEW__PARENT, oldParent, newParent);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParent(ViewArea newParent)
  {
    if (newParent != parent)
    {
      NotificationChain msgs = null;
      if (parent != null)
        msgs = ((InternalEObject)parent).eInverseRemove(this, DomainPackage.VIEW_AREA__CANVAS_VIEW, ViewArea.class, msgs);
      if (newParent != null)
        msgs = ((InternalEObject)newParent).eInverseAdd(this, DomainPackage.VIEW_AREA__CANVAS_VIEW, ViewArea.class, msgs);
      msgs = basicSetParent(newParent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.CANVAS_VIEW__PARENT, newParent, newParent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LayerHolder getBaseCanvas()
  {
    return baseCanvas;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBaseCanvas(LayerHolder newBaseCanvas, NotificationChain msgs)
  {
    LayerHolder oldBaseCanvas = baseCanvas;
    baseCanvas = newBaseCanvas;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.CANVAS_VIEW__BASE_CANVAS, oldBaseCanvas, newBaseCanvas);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBaseCanvas(LayerHolder newBaseCanvas)
  {
    if (newBaseCanvas != baseCanvas)
    {
      NotificationChain msgs = null;
      if (baseCanvas != null)
        msgs = ((InternalEObject)baseCanvas).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.CANVAS_VIEW__BASE_CANVAS, null, msgs);
      if (newBaseCanvas != null)
        msgs = ((InternalEObject)newBaseCanvas).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainPackage.CANVAS_VIEW__BASE_CANVAS, null, msgs);
      msgs = basicSetBaseCanvas(newBaseCanvas, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.CANVAS_VIEW__BASE_CANVAS, newBaseCanvas, newBaseCanvas));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DomainPackage.CANVAS_VIEW__PARENT:
        if (parent != null)
          msgs = ((InternalEObject)parent).eInverseRemove(this, DomainPackage.VIEW_AREA__CANVAS_VIEW, ViewArea.class, msgs);
        return basicSetParent((ViewArea)otherEnd, msgs);
    }
    return super.eInverseAdd(otherEnd, featureID, msgs);
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
      case DomainPackage.CANVAS_VIEW__PARENT:
        return basicSetParent(null, msgs);
      case DomainPackage.CANVAS_VIEW__BASE_CANVAS:
        return basicSetBaseCanvas(null, msgs);
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
      case DomainPackage.CANVAS_VIEW__UID:
        return getUid();
      case DomainPackage.CANVAS_VIEW__PARENT:
        if (resolve) return getParent();
        return basicGetParent();
      case DomainPackage.CANVAS_VIEW__BASE_CANVAS:
        return getBaseCanvas();
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
      case DomainPackage.CANVAS_VIEW__UID:
        setUid((String)newValue);
        return;
      case DomainPackage.CANVAS_VIEW__PARENT:
        setParent((ViewArea)newValue);
        return;
      case DomainPackage.CANVAS_VIEW__BASE_CANVAS:
        setBaseCanvas((LayerHolder)newValue);
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
      case DomainPackage.CANVAS_VIEW__UID:
        setUid(UID_EDEFAULT);
        return;
      case DomainPackage.CANVAS_VIEW__PARENT:
        setParent((ViewArea)null);
        return;
      case DomainPackage.CANVAS_VIEW__BASE_CANVAS:
        setBaseCanvas((LayerHolder)null);
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
      case DomainPackage.CANVAS_VIEW__UID:
        return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
      case DomainPackage.CANVAS_VIEW__PARENT:
        return parent != null;
      case DomainPackage.CANVAS_VIEW__BASE_CANVAS:
        return baseCanvas != null;
    }
    return super.eIsSet(featureID);
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
    result.append(" (uid: ");
    result.append(uid);
    result.append(')');
    return result.toString();
  }

} //CanvasViewImpl
