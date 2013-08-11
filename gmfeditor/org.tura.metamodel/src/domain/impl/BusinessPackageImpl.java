/**
 */
package domain.impl;

import domain.BusinessObjects;
import domain.BusinessPackage;
import domain.DomainPackage;

import domain.Types;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Business Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link domain.impl.BusinessPackageImpl#getName <em>Name</em>}</li>
 *   <li>{@link domain.impl.BusinessPackageImpl#getBusinessobjects <em>Businessobjects</em>}</li>
 *   <li>{@link domain.impl.BusinessPackageImpl#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BusinessPackageImpl extends EObjectImpl implements BusinessPackage
{
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
   * The cached value of the '{@link #getBusinessobjects() <em>Businessobjects</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBusinessobjects()
   * @generated
   * @ordered
   */
  protected BusinessObjects businessobjects;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BusinessPackageImpl()
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
    return DomainPackage.Literals.BUSINESS_PACKAGE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.BUSINESS_PACKAGE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BusinessObjects getBusinessobjects()
  {
    if (businessobjects != null && businessobjects.eIsProxy())
    {
      InternalEObject oldBusinessobjects = (InternalEObject)businessobjects;
      businessobjects = (BusinessObjects)eResolveProxy(oldBusinessobjects);
      if (businessobjects != oldBusinessobjects)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.BUSINESS_PACKAGE__BUSINESSOBJECTS, oldBusinessobjects, businessobjects));
      }
    }
    return businessobjects;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BusinessObjects basicGetBusinessobjects()
  {
    return businessobjects;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBusinessobjects(BusinessObjects newBusinessobjects, NotificationChain msgs)
  {
    BusinessObjects oldBusinessobjects = businessobjects;
    businessobjects = newBusinessobjects;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.BUSINESS_PACKAGE__BUSINESSOBJECTS, oldBusinessobjects, newBusinessobjects);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBusinessobjects(BusinessObjects newBusinessobjects)
  {
    if (newBusinessobjects != businessobjects)
    {
      NotificationChain msgs = null;
      if (businessobjects != null)
        msgs = ((InternalEObject)businessobjects).eInverseRemove(this, DomainPackage.BUSINESS_OBJECTS__PARENT, BusinessObjects.class, msgs);
      if (newBusinessobjects != null)
        msgs = ((InternalEObject)newBusinessobjects).eInverseAdd(this, DomainPackage.BUSINESS_OBJECTS__PARENT, BusinessObjects.class, msgs);
      msgs = basicSetBusinessobjects(newBusinessobjects, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.BUSINESS_PACKAGE__BUSINESSOBJECTS, newBusinessobjects, newBusinessobjects));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Types getParent()
  {
    if (eContainerFeatureID() != DomainPackage.BUSINESS_PACKAGE__PARENT) return null;
    return (Types)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParent(Types newParent, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newParent, DomainPackage.BUSINESS_PACKAGE__PARENT, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParent(Types newParent)
  {
    if (newParent != eInternalContainer() || (eContainerFeatureID() != DomainPackage.BUSINESS_PACKAGE__PARENT && newParent != null))
    {
      if (EcoreUtil.isAncestor(this, newParent))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newParent != null)
        msgs = ((InternalEObject)newParent).eInverseAdd(this, DomainPackage.TYPES__BUSINESS_PACKAGES, Types.class, msgs);
      msgs = basicSetParent(newParent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.BUSINESS_PACKAGE__PARENT, newParent, newParent));
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
      case DomainPackage.BUSINESS_PACKAGE__BUSINESSOBJECTS:
        if (businessobjects != null)
          msgs = ((InternalEObject)businessobjects).eInverseRemove(this, DomainPackage.BUSINESS_OBJECTS__PARENT, BusinessObjects.class, msgs);
        return basicSetBusinessobjects((BusinessObjects)otherEnd, msgs);
      case DomainPackage.BUSINESS_PACKAGE__PARENT:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetParent((Types)otherEnd, msgs);
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
      case DomainPackage.BUSINESS_PACKAGE__BUSINESSOBJECTS:
        return basicSetBusinessobjects(null, msgs);
      case DomainPackage.BUSINESS_PACKAGE__PARENT:
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
      case DomainPackage.BUSINESS_PACKAGE__PARENT:
        return eInternalContainer().eInverseRemove(this, DomainPackage.TYPES__BUSINESS_PACKAGES, Types.class, msgs);
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
      case DomainPackage.BUSINESS_PACKAGE__NAME:
        return getName();
      case DomainPackage.BUSINESS_PACKAGE__BUSINESSOBJECTS:
        if (resolve) return getBusinessobjects();
        return basicGetBusinessobjects();
      case DomainPackage.BUSINESS_PACKAGE__PARENT:
        return getParent();
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
      case DomainPackage.BUSINESS_PACKAGE__NAME:
        setName((String)newValue);
        return;
      case DomainPackage.BUSINESS_PACKAGE__BUSINESSOBJECTS:
        setBusinessobjects((BusinessObjects)newValue);
        return;
      case DomainPackage.BUSINESS_PACKAGE__PARENT:
        setParent((Types)newValue);
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
      case DomainPackage.BUSINESS_PACKAGE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DomainPackage.BUSINESS_PACKAGE__BUSINESSOBJECTS:
        setBusinessobjects((BusinessObjects)null);
        return;
      case DomainPackage.BUSINESS_PACKAGE__PARENT:
        setParent((Types)null);
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
      case DomainPackage.BUSINESS_PACKAGE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DomainPackage.BUSINESS_PACKAGE__BUSINESSOBJECTS:
        return businessobjects != null;
      case DomainPackage.BUSINESS_PACKAGE__PARENT:
        return getParent() != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //BusinessPackageImpl
