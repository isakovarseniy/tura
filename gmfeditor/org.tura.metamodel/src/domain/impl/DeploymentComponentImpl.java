/**
 */
package domain.impl;

import domain.DeploymentComponent;
import domain.DomainPackage;

import domain.ModelMapper;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deployment Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link domain.impl.DeploymentComponentImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.impl.DeploymentComponentImpl#getName <em>Name</em>}</li>
 *   <li>{@link domain.impl.DeploymentComponentImpl#getMapper <em>Mapper</em>}</li>
 *   <li>{@link domain.impl.DeploymentComponentImpl#getDeplymentComponent <em>Deplyment Component</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeploymentComponentImpl extends EObjectImpl implements DeploymentComponent
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
  protected ModelMapper mapper;

  /**
   * The cached value of the '{@link #getDeplymentComponent() <em>Deplyment Component</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeplymentComponent()
   * @generated
   * @ordered
   */
  protected DeploymentComponent deplymentComponent;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DeploymentComponentImpl()
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
    return DomainPackage.Literals.DEPLOYMENT_COMPONENT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DEPLOYMENT_COMPONENT__UID, oldUid, uid));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DEPLOYMENT_COMPONENT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelMapper getMapper()
  {
    if (mapper != null && mapper.eIsProxy())
    {
      InternalEObject oldMapper = (InternalEObject)mapper;
      mapper = (ModelMapper)eResolveProxy(oldMapper);
      if (mapper != oldMapper)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.DEPLOYMENT_COMPONENT__MAPPER, oldMapper, mapper));
      }
    }
    return mapper;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelMapper basicGetMapper()
  {
    return mapper;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMapper(ModelMapper newMapper)
  {
    ModelMapper oldMapper = mapper;
    mapper = newMapper;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DEPLOYMENT_COMPONENT__MAPPER, oldMapper, mapper));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeploymentComponent getDeplymentComponent()
  {
    if (deplymentComponent != null && deplymentComponent.eIsProxy())
    {
      InternalEObject oldDeplymentComponent = (InternalEObject)deplymentComponent;
      deplymentComponent = (DeploymentComponent)eResolveProxy(oldDeplymentComponent);
      if (deplymentComponent != oldDeplymentComponent)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.DEPLOYMENT_COMPONENT__DEPLYMENT_COMPONENT, oldDeplymentComponent, deplymentComponent));
      }
    }
    return deplymentComponent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeploymentComponent basicGetDeplymentComponent()
  {
    return deplymentComponent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDeplymentComponent(DeploymentComponent newDeplymentComponent)
  {
    DeploymentComponent oldDeplymentComponent = deplymentComponent;
    deplymentComponent = newDeplymentComponent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DEPLOYMENT_COMPONENT__DEPLYMENT_COMPONENT, oldDeplymentComponent, deplymentComponent));
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
      case DomainPackage.DEPLOYMENT_COMPONENT__UID:
        return getUid();
      case DomainPackage.DEPLOYMENT_COMPONENT__NAME:
        return getName();
      case DomainPackage.DEPLOYMENT_COMPONENT__MAPPER:
        if (resolve) return getMapper();
        return basicGetMapper();
      case DomainPackage.DEPLOYMENT_COMPONENT__DEPLYMENT_COMPONENT:
        if (resolve) return getDeplymentComponent();
        return basicGetDeplymentComponent();
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
      case DomainPackage.DEPLOYMENT_COMPONENT__UID:
        setUid((String)newValue);
        return;
      case DomainPackage.DEPLOYMENT_COMPONENT__NAME:
        setName((String)newValue);
        return;
      case DomainPackage.DEPLOYMENT_COMPONENT__MAPPER:
        setMapper((ModelMapper)newValue);
        return;
      case DomainPackage.DEPLOYMENT_COMPONENT__DEPLYMENT_COMPONENT:
        setDeplymentComponent((DeploymentComponent)newValue);
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
      case DomainPackage.DEPLOYMENT_COMPONENT__UID:
        setUid(UID_EDEFAULT);
        return;
      case DomainPackage.DEPLOYMENT_COMPONENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DomainPackage.DEPLOYMENT_COMPONENT__MAPPER:
        setMapper((ModelMapper)null);
        return;
      case DomainPackage.DEPLOYMENT_COMPONENT__DEPLYMENT_COMPONENT:
        setDeplymentComponent((DeploymentComponent)null);
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
      case DomainPackage.DEPLOYMENT_COMPONENT__UID:
        return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
      case DomainPackage.DEPLOYMENT_COMPONENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DomainPackage.DEPLOYMENT_COMPONENT__MAPPER:
        return mapper != null;
      case DomainPackage.DEPLOYMENT_COMPONENT__DEPLYMENT_COMPONENT:
        return deplymentComponent != null;
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

} //DeploymentComponentImpl
