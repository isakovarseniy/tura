/**
 */
package domain.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import domain.Application;
import domain.ApplicationUILayer;
import domain.ApplicationUIPackage;
import domain.DomainPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application UI Layer</b></em>'.
 * <!-- end-user-doc -->
 * The following features are implemented:
 * <ul>
 *   <li>{@link domain.impl.ApplicationUILayerImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.impl.ApplicationUILayerImpl#getName <em>Name</em>}</li>
 *   <li>{@link domain.impl.ApplicationUILayerImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link domain.impl.ApplicationUILayerImpl#getApplicationUIPackages <em>Application UI Packages</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApplicationUILayerImpl extends HTMLLayerHolderImpl implements ApplicationUILayer
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
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getApplicationUIPackages() <em>Application UI Packages</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getApplicationUIPackages()
   * @generated
   * @ordered
   */
  protected EList<ApplicationUIPackage> applicationUIPackages;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ApplicationUILayerImpl()
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
    return DomainPackage.Literals.APPLICATION_UI_LAYER;
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
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.APPLICATION_UI_LAYER__UID, oldUid, uid));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.APPLICATION_UI_LAYER__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Application getParent()
  {
    if (eContainerFeatureID() != DomainPackage.APPLICATION_UI_LAYER__PARENT) return null;
    return (Application)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParent(Application newParent, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newParent, DomainPackage.APPLICATION_UI_LAYER__PARENT, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParent(Application newParent)
  {
    if (newParent != eInternalContainer() || (eContainerFeatureID() != DomainPackage.APPLICATION_UI_LAYER__PARENT && newParent != null))
    {
      if (EcoreUtil.isAncestor(this, newParent))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newParent != null)
        msgs = ((InternalEObject)newParent).eInverseAdd(this, DomainPackage.APPLICATION__APPLICATION_UI_LAYER, Application.class, msgs);
      msgs = basicSetParent(newParent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.APPLICATION_UI_LAYER__PARENT, newParent, newParent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ApplicationUIPackage> getApplicationUIPackages()
  {
    if (applicationUIPackages == null)
    {
      applicationUIPackages = new EObjectContainmentWithInverseEList<ApplicationUIPackage>(ApplicationUIPackage.class, this, DomainPackage.APPLICATION_UI_LAYER__APPLICATION_UI_PACKAGES, DomainPackage.APPLICATION_UI_PACKAGE__PARENT);
    }
    return applicationUIPackages;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DomainPackage.APPLICATION_UI_LAYER__PARENT:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetParent((Application)otherEnd, msgs);
      case DomainPackage.APPLICATION_UI_LAYER__APPLICATION_UI_PACKAGES:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getApplicationUIPackages()).basicAdd(otherEnd, msgs);
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
      case DomainPackage.APPLICATION_UI_LAYER__PARENT:
        return basicSetParent(null, msgs);
      case DomainPackage.APPLICATION_UI_LAYER__APPLICATION_UI_PACKAGES:
        return ((InternalEList<?>)getApplicationUIPackages()).basicRemove(otherEnd, msgs);
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
      case DomainPackage.APPLICATION_UI_LAYER__PARENT:
        return eInternalContainer().eInverseRemove(this, DomainPackage.APPLICATION__APPLICATION_UI_LAYER, Application.class, msgs);
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
      case DomainPackage.APPLICATION_UI_LAYER__UID:
        return getUid();
      case DomainPackage.APPLICATION_UI_LAYER__NAME:
        return getName();
      case DomainPackage.APPLICATION_UI_LAYER__PARENT:
        return getParent();
      case DomainPackage.APPLICATION_UI_LAYER__APPLICATION_UI_PACKAGES:
        return getApplicationUIPackages();
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
      case DomainPackage.APPLICATION_UI_LAYER__UID:
        setUid((String)newValue);
        return;
      case DomainPackage.APPLICATION_UI_LAYER__NAME:
        setName((String)newValue);
        return;
      case DomainPackage.APPLICATION_UI_LAYER__PARENT:
        setParent((Application)newValue);
        return;
      case DomainPackage.APPLICATION_UI_LAYER__APPLICATION_UI_PACKAGES:
        getApplicationUIPackages().clear();
        getApplicationUIPackages().addAll((Collection<? extends ApplicationUIPackage>)newValue);
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
      case DomainPackage.APPLICATION_UI_LAYER__UID:
        setUid(UID_EDEFAULT);
        return;
      case DomainPackage.APPLICATION_UI_LAYER__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DomainPackage.APPLICATION_UI_LAYER__PARENT:
        setParent((Application)null);
        return;
      case DomainPackage.APPLICATION_UI_LAYER__APPLICATION_UI_PACKAGES:
        getApplicationUIPackages().clear();
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
      case DomainPackage.APPLICATION_UI_LAYER__UID:
        return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
      case DomainPackage.APPLICATION_UI_LAYER__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DomainPackage.APPLICATION_UI_LAYER__PARENT:
        return getParent() != null;
      case DomainPackage.APPLICATION_UI_LAYER__APPLICATION_UI_PACKAGES:
        return applicationUIPackages != null && !applicationUIPackages.isEmpty();
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
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ApplicationUILayerImpl
