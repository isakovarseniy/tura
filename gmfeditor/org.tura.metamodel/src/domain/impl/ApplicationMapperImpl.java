/**
 */
package domain.impl;

import domain.ApplicationMapper;
import domain.ApplicationMappers;
import domain.DomainPackage;
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
 * An implementation of the model object '<em><b>Application Mapper</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link domain.impl.ApplicationMapperImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.impl.ApplicationMapperImpl#getName <em>Name</em>}</li>
 *   <li>{@link domain.impl.ApplicationMapperImpl#getMapper <em>Mapper</em>}</li>
 *   <li>{@link domain.impl.ApplicationMapperImpl#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApplicationMapperImpl extends EObjectImpl implements ApplicationMapper
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
   * The cached value of the '{@link #getMapper() <em>Mapper</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMapper()
   * @generated
   * @ordered
   */
  protected Mappers mapper;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ApplicationMapperImpl()
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
    return DomainPackage.Literals.APPLICATION_MAPPER;
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
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.APPLICATION_MAPPER__UID, oldUid, uid));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.APPLICATION_MAPPER__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mappers getMapper()
  {
    if (mapper != null && mapper.eIsProxy())
    {
      InternalEObject oldMapper = (InternalEObject)mapper;
      mapper = (Mappers)eResolveProxy(oldMapper);
      if (mapper != oldMapper)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.APPLICATION_MAPPER__MAPPER, oldMapper, mapper));
      }
    }
    return mapper;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mappers basicGetMapper()
  {
    return mapper;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMapper(Mappers newMapper, NotificationChain msgs)
  {
    Mappers oldMapper = mapper;
    mapper = newMapper;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.APPLICATION_MAPPER__MAPPER, oldMapper, newMapper);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMapper(Mappers newMapper)
  {
    if (newMapper != mapper)
    {
      NotificationChain msgs = null;
      if (mapper != null)
        msgs = ((InternalEObject)mapper).eInverseRemove(this, DomainPackage.MAPPERS__PARENT, Mappers.class, msgs);
      if (newMapper != null)
        msgs = ((InternalEObject)newMapper).eInverseAdd(this, DomainPackage.MAPPERS__PARENT, Mappers.class, msgs);
      msgs = basicSetMapper(newMapper, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.APPLICATION_MAPPER__MAPPER, newMapper, newMapper));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ApplicationMappers getParent()
  {
    if (eContainerFeatureID() != DomainPackage.APPLICATION_MAPPER__PARENT) return null;
    return (ApplicationMappers)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParent(ApplicationMappers newParent, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newParent, DomainPackage.APPLICATION_MAPPER__PARENT, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParent(ApplicationMappers newParent)
  {
    if (newParent != eInternalContainer() || (eContainerFeatureID() != DomainPackage.APPLICATION_MAPPER__PARENT && newParent != null))
    {
      if (EcoreUtil.isAncestor(this, newParent))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newParent != null)
        msgs = ((InternalEObject)newParent).eInverseAdd(this, DomainPackage.APPLICATION_MAPPERS__MAPPERS, ApplicationMappers.class, msgs);
      msgs = basicSetParent(newParent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.APPLICATION_MAPPER__PARENT, newParent, newParent));
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
      case DomainPackage.APPLICATION_MAPPER__MAPPER:
        if (mapper != null)
          msgs = ((InternalEObject)mapper).eInverseRemove(this, DomainPackage.MAPPERS__PARENT, Mappers.class, msgs);
        return basicSetMapper((Mappers)otherEnd, msgs);
      case DomainPackage.APPLICATION_MAPPER__PARENT:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetParent((ApplicationMappers)otherEnd, msgs);
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
      case DomainPackage.APPLICATION_MAPPER__MAPPER:
        return basicSetMapper(null, msgs);
      case DomainPackage.APPLICATION_MAPPER__PARENT:
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
      case DomainPackage.APPLICATION_MAPPER__PARENT:
        return eInternalContainer().eInverseRemove(this, DomainPackage.APPLICATION_MAPPERS__MAPPERS, ApplicationMappers.class, msgs);
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
      case DomainPackage.APPLICATION_MAPPER__UID:
        return getUid();
      case DomainPackage.APPLICATION_MAPPER__NAME:
        return getName();
      case DomainPackage.APPLICATION_MAPPER__MAPPER:
        if (resolve) return getMapper();
        return basicGetMapper();
      case DomainPackage.APPLICATION_MAPPER__PARENT:
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
      case DomainPackage.APPLICATION_MAPPER__UID:
        setUid((String)newValue);
        return;
      case DomainPackage.APPLICATION_MAPPER__NAME:
        setName((String)newValue);
        return;
      case DomainPackage.APPLICATION_MAPPER__MAPPER:
        setMapper((Mappers)newValue);
        return;
      case DomainPackage.APPLICATION_MAPPER__PARENT:
        setParent((ApplicationMappers)newValue);
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
      case DomainPackage.APPLICATION_MAPPER__UID:
        setUid(UID_EDEFAULT);
        return;
      case DomainPackage.APPLICATION_MAPPER__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DomainPackage.APPLICATION_MAPPER__MAPPER:
        setMapper((Mappers)null);
        return;
      case DomainPackage.APPLICATION_MAPPER__PARENT:
        setParent((ApplicationMappers)null);
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
      case DomainPackage.APPLICATION_MAPPER__UID:
        return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
      case DomainPackage.APPLICATION_MAPPER__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DomainPackage.APPLICATION_MAPPER__MAPPER:
        return mapper != null;
      case DomainPackage.APPLICATION_MAPPER__PARENT:
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
    result.append(" (uid: ");
    result.append(uid);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ApplicationMapperImpl
