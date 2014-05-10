/**
 */
package domain.impl;

import domain.DomainPackage;
import domain.Mapper;
import domain.Mappers;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapper</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link domain.impl.MapperImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.impl.MapperImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link domain.impl.MapperImpl#isServiceLayer <em>Service Layer</em>}</li>
 *   <li>{@link domain.impl.MapperImpl#isUiLayer <em>Ui Layer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MapperImpl extends EObjectImpl implements Mapper
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
   * The default value of the '{@link #isServiceLayer() <em>Service Layer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isServiceLayer()
   * @generated
   * @ordered
   */
  protected static final boolean SERVICE_LAYER_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isServiceLayer() <em>Service Layer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isServiceLayer()
   * @generated
   * @ordered
   */
  protected boolean serviceLayer = SERVICE_LAYER_EDEFAULT;

  /**
   * The default value of the '{@link #isUiLayer() <em>Ui Layer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isUiLayer()
   * @generated
   * @ordered
   */
  protected static final boolean UI_LAYER_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isUiLayer() <em>Ui Layer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isUiLayer()
   * @generated
   * @ordered
   */
  protected boolean uiLayer = UI_LAYER_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MapperImpl()
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
    return DomainPackage.Literals.MAPPER;
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
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.MAPPER__UID, oldUid, uid));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mappers getParent()
  {
    if (eContainerFeatureID() != DomainPackage.MAPPER__PARENT) return null;
    return (Mappers)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParent(Mappers newParent, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newParent, DomainPackage.MAPPER__PARENT, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParent(Mappers newParent)
  {
    if (newParent != eInternalContainer() || (eContainerFeatureID() != DomainPackage.MAPPER__PARENT && newParent != null))
    {
      if (EcoreUtil.isAncestor(this, newParent))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newParent != null)
        msgs = ((InternalEObject)newParent).eInverseAdd(this, DomainPackage.MAPPERS__MAPPERS, Mappers.class, msgs);
      msgs = basicSetParent(newParent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.MAPPER__PARENT, newParent, newParent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isServiceLayer()
  {
    return serviceLayer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setServiceLayer(boolean newServiceLayer)
  {
    boolean oldServiceLayer = serviceLayer;
    serviceLayer = newServiceLayer;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.MAPPER__SERVICE_LAYER, oldServiceLayer, serviceLayer));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isUiLayer()
  {
    return uiLayer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUiLayer(boolean newUiLayer)
  {
    boolean oldUiLayer = uiLayer;
    uiLayer = newUiLayer;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.MAPPER__UI_LAYER, oldUiLayer, uiLayer));
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
      case DomainPackage.MAPPER__PARENT:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetParent((Mappers)otherEnd, msgs);
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
      case DomainPackage.MAPPER__PARENT:
        return basicSetParent(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
  {
    switch (eContainerFeatureID())
    {
      case DomainPackage.MAPPER__PARENT:
        return eInternalContainer().eInverseRemove(this, DomainPackage.MAPPERS__MAPPERS, Mappers.class, msgs);
    }
    return super.eBasicRemoveFromContainerFeature(msgs);
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
      case DomainPackage.MAPPER__UID:
        return getUid();
      case DomainPackage.MAPPER__PARENT:
        return getParent();
      case DomainPackage.MAPPER__SERVICE_LAYER:
        return isServiceLayer();
      case DomainPackage.MAPPER__UI_LAYER:
        return isUiLayer();
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
      case DomainPackage.MAPPER__UID:
        setUid((String)newValue);
        return;
      case DomainPackage.MAPPER__PARENT:
        setParent((Mappers)newValue);
        return;
      case DomainPackage.MAPPER__SERVICE_LAYER:
        setServiceLayer((Boolean)newValue);
        return;
      case DomainPackage.MAPPER__UI_LAYER:
        setUiLayer((Boolean)newValue);
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
      case DomainPackage.MAPPER__UID:
        setUid(UID_EDEFAULT);
        return;
      case DomainPackage.MAPPER__PARENT:
        setParent((Mappers)null);
        return;
      case DomainPackage.MAPPER__SERVICE_LAYER:
        setServiceLayer(SERVICE_LAYER_EDEFAULT);
        return;
      case DomainPackage.MAPPER__UI_LAYER:
        setUiLayer(UI_LAYER_EDEFAULT);
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
      case DomainPackage.MAPPER__UID:
        return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
      case DomainPackage.MAPPER__PARENT:
        return getParent() != null;
      case DomainPackage.MAPPER__SERVICE_LAYER:
        return serviceLayer != SERVICE_LAYER_EDEFAULT;
      case DomainPackage.MAPPER__UI_LAYER:
        return uiLayer != UI_LAYER_EDEFAULT;
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
    result.append(", serviceLayer: ");
    result.append(serviceLayer);
    result.append(", uiLayer: ");
    result.append(uiLayer);
    result.append(')');
    return result.toString();
  }

} //MapperImpl
