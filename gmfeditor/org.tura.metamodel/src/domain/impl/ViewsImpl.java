/**
 */
package domain.impl;

import domain.CanvasFrame;
import domain.Canvas;
import domain.DomainPackage;
import domain.FormView;
import domain.TabPagesInheritance;
import domain.ViewInheritance;
import domain.Views;
import domain.Window;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Views</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link domain.impl.ViewsImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.impl.ViewsImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link domain.impl.ViewsImpl#getCanvases <em>Canvases</em>}</li>
 *   <li>{@link domain.impl.ViewsImpl#getViewInheritances <em>View Inheritances</em>}</li>
 *   <li>{@link domain.impl.ViewsImpl#getTabPagesInheritances <em>Tab Pages Inheritances</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ViewsImpl extends EObjectImpl implements Views
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
  protected FormView parent;

  /**
   * The cached value of the '{@link #getCanvases() <em>Canvases</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCanvases()
   * @generated
   * @ordered
   */
  protected EList<CanvasFrame> canvases;

  /**
   * The cached value of the '{@link #getViewInheritances() <em>View Inheritances</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getViewInheritances()
   * @generated
   * @ordered
   */
  protected EList<ViewInheritance> viewInheritances;

  /**
   * The cached value of the '{@link #getTabPagesInheritances() <em>Tab Pages Inheritances</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTabPagesInheritances()
   * @generated
   * @ordered
   */
  protected EList<TabPagesInheritance> tabPagesInheritances;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ViewsImpl()
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
    return DomainPackage.Literals.VIEWS;
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
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.VIEWS__UID, oldUid, uid));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FormView getParent()
  {
    if (parent != null && parent.eIsProxy())
    {
      InternalEObject oldParent = (InternalEObject)parent;
      parent = (FormView)eResolveProxy(oldParent);
      if (parent != oldParent)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.VIEWS__PARENT, oldParent, parent));
      }
    }
    return parent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FormView basicGetParent()
  {
    return parent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParent(FormView newParent, NotificationChain msgs)
  {
    FormView oldParent = parent;
    parent = newParent;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.VIEWS__PARENT, oldParent, newParent);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParent(FormView newParent)
  {
    if (newParent != parent)
    {
      NotificationChain msgs = null;
      if (parent != null)
        msgs = ((InternalEObject)parent).eInverseRemove(this, DomainPackage.FORM_VIEW__VIEW, FormView.class, msgs);
      if (newParent != null)
        msgs = ((InternalEObject)newParent).eInverseAdd(this, DomainPackage.FORM_VIEW__VIEW, FormView.class, msgs);
      msgs = basicSetParent(newParent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.VIEWS__PARENT, newParent, newParent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<CanvasFrame> getCanvases()
  {
    if (canvases == null)
    {
      canvases = new EObjectContainmentEList<CanvasFrame>(CanvasFrame.class, this, DomainPackage.VIEWS__CANVASES);
    }
    return canvases;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ViewInheritance> getViewInheritances()
  {
    if (viewInheritances == null)
    {
      viewInheritances = new EObjectContainmentEList<ViewInheritance>(ViewInheritance.class, this, DomainPackage.VIEWS__VIEW_INHERITANCES);
    }
    return viewInheritances;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TabPagesInheritance> getTabPagesInheritances()
  {
    if (tabPagesInheritances == null)
    {
      tabPagesInheritances = new EObjectContainmentEList<TabPagesInheritance>(TabPagesInheritance.class, this, DomainPackage.VIEWS__TAB_PAGES_INHERITANCES);
    }
    return tabPagesInheritances;
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
      case DomainPackage.VIEWS__PARENT:
        if (parent != null)
          msgs = ((InternalEObject)parent).eInverseRemove(this, DomainPackage.FORM_VIEW__VIEW, FormView.class, msgs);
        return basicSetParent((FormView)otherEnd, msgs);
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
      case DomainPackage.VIEWS__PARENT:
        return basicSetParent(null, msgs);
      case DomainPackage.VIEWS__CANVASES:
        return ((InternalEList<?>)getCanvases()).basicRemove(otherEnd, msgs);
      case DomainPackage.VIEWS__VIEW_INHERITANCES:
        return ((InternalEList<?>)getViewInheritances()).basicRemove(otherEnd, msgs);
      case DomainPackage.VIEWS__TAB_PAGES_INHERITANCES:
        return ((InternalEList<?>)getTabPagesInheritances()).basicRemove(otherEnd, msgs);
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
      case DomainPackage.VIEWS__UID:
        return getUid();
      case DomainPackage.VIEWS__PARENT:
        if (resolve) return getParent();
        return basicGetParent();
      case DomainPackage.VIEWS__CANVASES:
        return getCanvases();
      case DomainPackage.VIEWS__VIEW_INHERITANCES:
        return getViewInheritances();
      case DomainPackage.VIEWS__TAB_PAGES_INHERITANCES:
        return getTabPagesInheritances();
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
      case DomainPackage.VIEWS__UID:
        setUid((String)newValue);
        return;
      case DomainPackage.VIEWS__PARENT:
        setParent((FormView)newValue);
        return;
      case DomainPackage.VIEWS__CANVASES:
        getCanvases().clear();
        getCanvases().addAll((Collection<? extends CanvasFrame>)newValue);
        return;
      case DomainPackage.VIEWS__VIEW_INHERITANCES:
        getViewInheritances().clear();
        getViewInheritances().addAll((Collection<? extends ViewInheritance>)newValue);
        return;
      case DomainPackage.VIEWS__TAB_PAGES_INHERITANCES:
        getTabPagesInheritances().clear();
        getTabPagesInheritances().addAll((Collection<? extends TabPagesInheritance>)newValue);
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
      case DomainPackage.VIEWS__UID:
        setUid(UID_EDEFAULT);
        return;
      case DomainPackage.VIEWS__PARENT:
        setParent((FormView)null);
        return;
      case DomainPackage.VIEWS__CANVASES:
        getCanvases().clear();
        return;
      case DomainPackage.VIEWS__VIEW_INHERITANCES:
        getViewInheritances().clear();
        return;
      case DomainPackage.VIEWS__TAB_PAGES_INHERITANCES:
        getTabPagesInheritances().clear();
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
      case DomainPackage.VIEWS__UID:
        return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
      case DomainPackage.VIEWS__PARENT:
        return parent != null;
      case DomainPackage.VIEWS__CANVASES:
        return canvases != null && !canvases.isEmpty();
      case DomainPackage.VIEWS__VIEW_INHERITANCES:
        return viewInheritances != null && !viewInheritances.isEmpty();
      case DomainPackage.VIEWS__TAB_PAGES_INHERITANCES:
        return tabPagesInheritances != null && !tabPagesInheritances.isEmpty();
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

} //ViewsImpl
