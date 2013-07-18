/**
 */
package domain.impl;

import domain.DomainArtifact;
import domain.DomainArtifacts;
import domain.DomainPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Artifacts</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link domain.impl.DomainArtifactsImpl#getName <em>Name</em>}</li>
 *   <li>{@link domain.impl.DomainArtifactsImpl#getArtifacrs <em>Artifacrs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DomainArtifactsImpl extends EObjectImpl implements DomainArtifacts
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
   * The cached value of the '{@link #getArtifacrs() <em>Artifacrs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArtifacrs()
   * @generated
   * @ordered
   */
  protected DomainArtifact artifacrs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DomainArtifactsImpl()
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
    return DomainPackage.Literals.DOMAIN_ARTIFACTS;
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
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN_ARTIFACTS__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomainArtifact getArtifacrs()
  {
    return artifacrs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArtifacrs(DomainArtifact newArtifacrs, NotificationChain msgs)
  {
    DomainArtifact oldArtifacrs = artifacrs;
    artifacrs = newArtifacrs;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN_ARTIFACTS__ARTIFACRS, oldArtifacrs, newArtifacrs);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArtifacrs(DomainArtifact newArtifacrs)
  {
    if (newArtifacrs != artifacrs)
    {
      NotificationChain msgs = null;
      if (artifacrs != null)
        msgs = ((InternalEObject)artifacrs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.DOMAIN_ARTIFACTS__ARTIFACRS, null, msgs);
      if (newArtifacrs != null)
        msgs = ((InternalEObject)newArtifacrs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainPackage.DOMAIN_ARTIFACTS__ARTIFACRS, null, msgs);
      msgs = basicSetArtifacrs(newArtifacrs, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN_ARTIFACTS__ARTIFACRS, newArtifacrs, newArtifacrs));
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
      case DomainPackage.DOMAIN_ARTIFACTS__ARTIFACRS:
        return basicSetArtifacrs(null, msgs);
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
      case DomainPackage.DOMAIN_ARTIFACTS__NAME:
        return getName();
      case DomainPackage.DOMAIN_ARTIFACTS__ARTIFACRS:
        return getArtifacrs();
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
      case DomainPackage.DOMAIN_ARTIFACTS__NAME:
        setName((String)newValue);
        return;
      case DomainPackage.DOMAIN_ARTIFACTS__ARTIFACRS:
        setArtifacrs((DomainArtifact)newValue);
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
      case DomainPackage.DOMAIN_ARTIFACTS__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DomainPackage.DOMAIN_ARTIFACTS__ARTIFACRS:
        setArtifacrs((DomainArtifact)null);
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
      case DomainPackage.DOMAIN_ARTIFACTS__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DomainPackage.DOMAIN_ARTIFACTS__ARTIFACRS:
        return artifacrs != null;
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

} //DomainArtifactsImpl
