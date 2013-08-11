/**
 */
package domain.impl;

import domain.Artifacts;
import domain.Domain;
import domain.DomainArtifacts;
import domain.DomainPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Artifacts</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link domain.impl.DomainArtifactsImpl#getName <em>Name</em>}</li>
 *   <li>{@link domain.impl.DomainArtifactsImpl#getArtifact <em>Artifact</em>}</li>
 *   <li>{@link domain.impl.DomainArtifactsImpl#getParent <em>Parent</em>}</li>
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
   * The cached value of the '{@link #getArtifact() <em>Artifact</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArtifact()
   * @generated
   * @ordered
   */
  protected Artifacts artifact;

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
  public Artifacts getArtifact()
  {
    if (artifact != null && artifact.eIsProxy())
    {
      InternalEObject oldArtifact = (InternalEObject)artifact;
      artifact = (Artifacts)eResolveProxy(oldArtifact);
      if (artifact != oldArtifact)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.DOMAIN_ARTIFACTS__ARTIFACT, oldArtifact, artifact));
      }
    }
    return artifact;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Artifacts basicGetArtifact()
  {
    return artifact;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArtifact(Artifacts newArtifact, NotificationChain msgs)
  {
    Artifacts oldArtifact = artifact;
    artifact = newArtifact;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN_ARTIFACTS__ARTIFACT, oldArtifact, newArtifact);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArtifact(Artifacts newArtifact)
  {
    if (newArtifact != artifact)
    {
      NotificationChain msgs = null;
      if (artifact != null)
        msgs = ((InternalEObject)artifact).eInverseRemove(this, DomainPackage.ARTIFACTS__PARENT, Artifacts.class, msgs);
      if (newArtifact != null)
        msgs = ((InternalEObject)newArtifact).eInverseAdd(this, DomainPackage.ARTIFACTS__PARENT, Artifacts.class, msgs);
      msgs = basicSetArtifact(newArtifact, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN_ARTIFACTS__ARTIFACT, newArtifact, newArtifact));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Domain getParent()
  {
    if (eContainerFeatureID() != DomainPackage.DOMAIN_ARTIFACTS__PARENT) return null;
    return (Domain)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParent(Domain newParent, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newParent, DomainPackage.DOMAIN_ARTIFACTS__PARENT, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParent(Domain newParent)
  {
    if (newParent != eInternalContainer() || (eContainerFeatureID() != DomainPackage.DOMAIN_ARTIFACTS__PARENT && newParent != null))
    {
      if (EcoreUtil.isAncestor(this, newParent))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newParent != null)
        msgs = ((InternalEObject)newParent).eInverseAdd(this, DomainPackage.DOMAIN__DOMAIN_ARTIFACTS, Domain.class, msgs);
      msgs = basicSetParent(newParent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN_ARTIFACTS__PARENT, newParent, newParent));
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
      case DomainPackage.DOMAIN_ARTIFACTS__ARTIFACT:
        if (artifact != null)
          msgs = ((InternalEObject)artifact).eInverseRemove(this, DomainPackage.ARTIFACTS__PARENT, Artifacts.class, msgs);
        return basicSetArtifact((Artifacts)otherEnd, msgs);
      case DomainPackage.DOMAIN_ARTIFACTS__PARENT:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetParent((Domain)otherEnd, msgs);
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
      case DomainPackage.DOMAIN_ARTIFACTS__ARTIFACT:
        return basicSetArtifact(null, msgs);
      case DomainPackage.DOMAIN_ARTIFACTS__PARENT:
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
      case DomainPackage.DOMAIN_ARTIFACTS__PARENT:
        return eInternalContainer().eInverseRemove(this, DomainPackage.DOMAIN__DOMAIN_ARTIFACTS, Domain.class, msgs);
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
      case DomainPackage.DOMAIN_ARTIFACTS__NAME:
        return getName();
      case DomainPackage.DOMAIN_ARTIFACTS__ARTIFACT:
        if (resolve) return getArtifact();
        return basicGetArtifact();
      case DomainPackage.DOMAIN_ARTIFACTS__PARENT:
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
      case DomainPackage.DOMAIN_ARTIFACTS__NAME:
        setName((String)newValue);
        return;
      case DomainPackage.DOMAIN_ARTIFACTS__ARTIFACT:
        setArtifact((Artifacts)newValue);
        return;
      case DomainPackage.DOMAIN_ARTIFACTS__PARENT:
        setParent((Domain)newValue);
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
      case DomainPackage.DOMAIN_ARTIFACTS__ARTIFACT:
        setArtifact((Artifacts)null);
        return;
      case DomainPackage.DOMAIN_ARTIFACTS__PARENT:
        setParent((Domain)null);
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
      case DomainPackage.DOMAIN_ARTIFACTS__ARTIFACT:
        return artifact != null;
      case DomainPackage.DOMAIN_ARTIFACTS__PARENT:
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

} //DomainArtifactsImpl
