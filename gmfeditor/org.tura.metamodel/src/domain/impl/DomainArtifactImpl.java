/**
 */
package domain.impl;

import domain.Artifacts;
import domain.DomainArtifact;
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
 * An implementation of the model object '<em><b>Artifact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link domain.impl.DomainArtifactImpl#getName <em>Name</em>}</li>
 *   <li>{@link domain.impl.DomainArtifactImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link domain.impl.DomainArtifactImpl#getArtifact <em>Artifact</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DomainArtifactImpl extends EObjectImpl implements DomainArtifact
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
  protected DomainArtifactImpl()
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
    return DomainPackage.Literals.DOMAIN_ARTIFACT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN_ARTIFACT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomainArtifacts getParent()
  {
    if (eContainerFeatureID() != DomainPackage.DOMAIN_ARTIFACT__PARENT) return null;
    return (DomainArtifacts)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParent(DomainArtifacts newParent, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newParent, DomainPackage.DOMAIN_ARTIFACT__PARENT, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParent(DomainArtifacts newParent)
  {
    if (newParent != eInternalContainer() || (eContainerFeatureID() != DomainPackage.DOMAIN_ARTIFACT__PARENT && newParent != null))
    {
      if (EcoreUtil.isAncestor(this, newParent))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newParent != null)
        msgs = ((InternalEObject)newParent).eInverseAdd(this, DomainPackage.DOMAIN_ARTIFACTS__DOMAIN_ARTIFACT, DomainArtifacts.class, msgs);
      msgs = basicSetParent(newParent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN_ARTIFACT__PARENT, newParent, newParent));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.DOMAIN_ARTIFACT__ARTIFACT, oldArtifact, artifact));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN_ARTIFACT__ARTIFACT, oldArtifact, newArtifact);
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
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN_ARTIFACT__ARTIFACT, newArtifact, newArtifact));
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
      case DomainPackage.DOMAIN_ARTIFACT__PARENT:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetParent((DomainArtifacts)otherEnd, msgs);
      case DomainPackage.DOMAIN_ARTIFACT__ARTIFACT:
        if (artifact != null)
          msgs = ((InternalEObject)artifact).eInverseRemove(this, DomainPackage.ARTIFACTS__PARENT, Artifacts.class, msgs);
        return basicSetArtifact((Artifacts)otherEnd, msgs);
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
      case DomainPackage.DOMAIN_ARTIFACT__PARENT:
        return basicSetParent(null, msgs);
      case DomainPackage.DOMAIN_ARTIFACT__ARTIFACT:
        return basicSetArtifact(null, msgs);
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
      case DomainPackage.DOMAIN_ARTIFACT__PARENT:
        return eInternalContainer().eInverseRemove(this, DomainPackage.DOMAIN_ARTIFACTS__DOMAIN_ARTIFACT, DomainArtifacts.class, msgs);
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
      case DomainPackage.DOMAIN_ARTIFACT__NAME:
        return getName();
      case DomainPackage.DOMAIN_ARTIFACT__PARENT:
        return getParent();
      case DomainPackage.DOMAIN_ARTIFACT__ARTIFACT:
        if (resolve) return getArtifact();
        return basicGetArtifact();
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
      case DomainPackage.DOMAIN_ARTIFACT__NAME:
        setName((String)newValue);
        return;
      case DomainPackage.DOMAIN_ARTIFACT__PARENT:
        setParent((DomainArtifacts)newValue);
        return;
      case DomainPackage.DOMAIN_ARTIFACT__ARTIFACT:
        setArtifact((Artifacts)newValue);
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
      case DomainPackage.DOMAIN_ARTIFACT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DomainPackage.DOMAIN_ARTIFACT__PARENT:
        setParent((DomainArtifacts)null);
        return;
      case DomainPackage.DOMAIN_ARTIFACT__ARTIFACT:
        setArtifact((Artifacts)null);
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
      case DomainPackage.DOMAIN_ARTIFACT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DomainPackage.DOMAIN_ARTIFACT__PARENT:
        return getParent() != null;
      case DomainPackage.DOMAIN_ARTIFACT__ARTIFACT:
        return artifact != null;
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

} //DomainArtifactImpl
