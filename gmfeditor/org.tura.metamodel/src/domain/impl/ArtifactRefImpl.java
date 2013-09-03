/**
 */
package domain.impl;

import domain.ArtifactRef;
import domain.DomainPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Artifact Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link domain.impl.ArtifactRefImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.impl.ArtifactRefImpl#getDomainArtifact <em>Domain Artifact</em>}</li>
 *   <li>{@link domain.impl.ArtifactRefImpl#getArtifactName <em>Artifact Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArtifactRefImpl extends EObjectImpl implements ArtifactRef
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
   * The default value of the '{@link #getDomainArtifact() <em>Domain Artifact</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDomainArtifact()
   * @generated
   * @ordered
   */
  protected static final String DOMAIN_ARTIFACT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDomainArtifact() <em>Domain Artifact</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDomainArtifact()
   * @generated
   * @ordered
   */
  protected String domainArtifact = DOMAIN_ARTIFACT_EDEFAULT;

  /**
   * The default value of the '{@link #getArtifactName() <em>Artifact Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArtifactName()
   * @generated
   * @ordered
   */
  protected static final String ARTIFACT_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getArtifactName() <em>Artifact Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArtifactName()
   * @generated
   * @ordered
   */
  protected String artifactName = ARTIFACT_NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ArtifactRefImpl()
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
    return DomainPackage.Literals.ARTIFACT_REF;
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
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.ARTIFACT_REF__UID, oldUid, uid));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDomainArtifact()
  {
    return domainArtifact;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDomainArtifact(String newDomainArtifact)
  {
    String oldDomainArtifact = domainArtifact;
    domainArtifact = newDomainArtifact;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.ARTIFACT_REF__DOMAIN_ARTIFACT, oldDomainArtifact, domainArtifact));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getArtifactName()
  {
    return artifactName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArtifactName(String newArtifactName)
  {
    String oldArtifactName = artifactName;
    artifactName = newArtifactName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.ARTIFACT_REF__ARTIFACT_NAME, oldArtifactName, artifactName));
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
      case DomainPackage.ARTIFACT_REF__UID:
        return getUid();
      case DomainPackage.ARTIFACT_REF__DOMAIN_ARTIFACT:
        return getDomainArtifact();
      case DomainPackage.ARTIFACT_REF__ARTIFACT_NAME:
        return getArtifactName();
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
      case DomainPackage.ARTIFACT_REF__UID:
        setUid((String)newValue);
        return;
      case DomainPackage.ARTIFACT_REF__DOMAIN_ARTIFACT:
        setDomainArtifact((String)newValue);
        return;
      case DomainPackage.ARTIFACT_REF__ARTIFACT_NAME:
        setArtifactName((String)newValue);
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
      case DomainPackage.ARTIFACT_REF__UID:
        setUid(UID_EDEFAULT);
        return;
      case DomainPackage.ARTIFACT_REF__DOMAIN_ARTIFACT:
        setDomainArtifact(DOMAIN_ARTIFACT_EDEFAULT);
        return;
      case DomainPackage.ARTIFACT_REF__ARTIFACT_NAME:
        setArtifactName(ARTIFACT_NAME_EDEFAULT);
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
      case DomainPackage.ARTIFACT_REF__UID:
        return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
      case DomainPackage.ARTIFACT_REF__DOMAIN_ARTIFACT:
        return DOMAIN_ARTIFACT_EDEFAULT == null ? domainArtifact != null : !DOMAIN_ARTIFACT_EDEFAULT.equals(domainArtifact);
      case DomainPackage.ARTIFACT_REF__ARTIFACT_NAME:
        return ARTIFACT_NAME_EDEFAULT == null ? artifactName != null : !ARTIFACT_NAME_EDEFAULT.equals(artifactName);
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
    result.append(", domainArtifact: ");
    result.append(domainArtifact);
    result.append(", artifactName: ");
    result.append(artifactName);
    result.append(')');
    return result.toString();
  }

} //ArtifactRefImpl
