/**
 */
package domain.impl;

import domain.Application;
import domain.ApplicationStyle;
import domain.DomainPackage;
import domain.StylesPackage;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link domain.impl.ApplicationStyleImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.impl.ApplicationStyleImpl#getName <em>Name</em>}</li>
 *   <li>{@link domain.impl.ApplicationStyleImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link domain.impl.ApplicationStyleImpl#getStylesPackage <em>Styles Package</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApplicationStyleImpl extends HTMLLayerHolderImpl implements ApplicationStyle
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
   * The cached value of the '{@link #getStylesPackage() <em>Styles Package</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStylesPackage()
   * @generated
   * @ordered
   */
  protected EList<StylesPackage> stylesPackage;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ApplicationStyleImpl()
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
    return DomainPackage.Literals.APPLICATION_STYLE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.APPLICATION_STYLE__UID, oldUid, uid));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.APPLICATION_STYLE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Application getParent()
  {
    if (eContainerFeatureID() != DomainPackage.APPLICATION_STYLE__PARENT) return null;
    return (Application)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParent(Application newParent, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newParent, DomainPackage.APPLICATION_STYLE__PARENT, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParent(Application newParent)
  {
    if (newParent != eInternalContainer() || (eContainerFeatureID() != DomainPackage.APPLICATION_STYLE__PARENT && newParent != null))
    {
      if (EcoreUtil.isAncestor(this, newParent))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newParent != null)
        msgs = ((InternalEObject)newParent).eInverseAdd(this, DomainPackage.APPLICATION__APPLICATION_STYLE, Application.class, msgs);
      msgs = basicSetParent(newParent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.APPLICATION_STYLE__PARENT, newParent, newParent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<StylesPackage> getStylesPackage()
  {
    if (stylesPackage == null)
    {
      stylesPackage = new EObjectContainmentWithInverseEList<StylesPackage>(StylesPackage.class, this, DomainPackage.APPLICATION_STYLE__STYLES_PACKAGE, DomainPackage.STYLES_PACKAGE__PARENT);
    }
    return stylesPackage;
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
      case DomainPackage.APPLICATION_STYLE__PARENT:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetParent((Application)otherEnd, msgs);
      case DomainPackage.APPLICATION_STYLE__STYLES_PACKAGE:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getStylesPackage()).basicAdd(otherEnd, msgs);
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
      case DomainPackage.APPLICATION_STYLE__PARENT:
        return basicSetParent(null, msgs);
      case DomainPackage.APPLICATION_STYLE__STYLES_PACKAGE:
        return ((InternalEList<?>)getStylesPackage()).basicRemove(otherEnd, msgs);
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
      case DomainPackage.APPLICATION_STYLE__PARENT:
        return eInternalContainer().eInverseRemove(this, DomainPackage.APPLICATION__APPLICATION_STYLE, Application.class, msgs);
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
      case DomainPackage.APPLICATION_STYLE__UID:
        return getUid();
      case DomainPackage.APPLICATION_STYLE__NAME:
        return getName();
      case DomainPackage.APPLICATION_STYLE__PARENT:
        return getParent();
      case DomainPackage.APPLICATION_STYLE__STYLES_PACKAGE:
        return getStylesPackage();
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
      case DomainPackage.APPLICATION_STYLE__UID:
        setUid((String)newValue);
        return;
      case DomainPackage.APPLICATION_STYLE__NAME:
        setName((String)newValue);
        return;
      case DomainPackage.APPLICATION_STYLE__PARENT:
        setParent((Application)newValue);
        return;
      case DomainPackage.APPLICATION_STYLE__STYLES_PACKAGE:
        getStylesPackage().clear();
        getStylesPackage().addAll((Collection<? extends StylesPackage>)newValue);
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
      case DomainPackage.APPLICATION_STYLE__UID:
        setUid(UID_EDEFAULT);
        return;
      case DomainPackage.APPLICATION_STYLE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DomainPackage.APPLICATION_STYLE__PARENT:
        setParent((Application)null);
        return;
      case DomainPackage.APPLICATION_STYLE__STYLES_PACKAGE:
        getStylesPackage().clear();
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
      case DomainPackage.APPLICATION_STYLE__UID:
        return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
      case DomainPackage.APPLICATION_STYLE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DomainPackage.APPLICATION_STYLE__PARENT:
        return getParent() != null;
      case DomainPackage.APPLICATION_STYLE__STYLES_PACKAGE:
        return stylesPackage != null && !stylesPackage.isEmpty();
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

} //ApplicationStyleImpl
