/**
 */
package domain.impl;

import domain.DomainPackage;
import domain.JavaComponent;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Java Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link domain.impl.JavaComponentImpl#getArtifactId <em>Artifact Id</em>}</li>
 *   <li>{@link domain.impl.JavaComponentImpl#getGroupId <em>Group Id</em>}</li>
 *   <li>{@link domain.impl.JavaComponentImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link domain.impl.JavaComponentImpl#getSourceCodeDirectory <em>Source Code Directory</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JavaComponentImpl extends ComponentImpl implements JavaComponent
{
  /**
   * The default value of the '{@link #getArtifactId() <em>Artifact Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArtifactId()
   * @generated
   * @ordered
   */
  protected static final String ARTIFACT_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getArtifactId() <em>Artifact Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArtifactId()
   * @generated
   * @ordered
   */
  protected String artifactId = ARTIFACT_ID_EDEFAULT;

  /**
   * The default value of the '{@link #getGroupId() <em>Group Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroupId()
   * @generated
   * @ordered
   */
  protected static final String GROUP_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getGroupId() <em>Group Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroupId()
   * @generated
   * @ordered
   */
  protected String groupId = GROUP_ID_EDEFAULT;

  /**
   * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVersion()
   * @generated
   * @ordered
   */
  protected static final String VERSION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVersion()
   * @generated
   * @ordered
   */
  protected String version = VERSION_EDEFAULT;

  /**
   * The default value of the '{@link #getSourceCodeDirectory() <em>Source Code Directory</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourceCodeDirectory()
   * @generated
   * @ordered
   */
  protected static final String SOURCE_CODE_DIRECTORY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSourceCodeDirectory() <em>Source Code Directory</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourceCodeDirectory()
   * @generated
   * @ordered
   */
  protected String sourceCodeDirectory = SOURCE_CODE_DIRECTORY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected JavaComponentImpl()
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
    return DomainPackage.Literals.JAVA_COMPONENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getArtifactId()
  {
    return artifactId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArtifactId(String newArtifactId)
  {
    String oldArtifactId = artifactId;
    artifactId = newArtifactId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.JAVA_COMPONENT__ARTIFACT_ID, oldArtifactId, artifactId));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getGroupId()
  {
    return groupId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGroupId(String newGroupId)
  {
    String oldGroupId = groupId;
    groupId = newGroupId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.JAVA_COMPONENT__GROUP_ID, oldGroupId, groupId));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVersion()
  {
    return version;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVersion(String newVersion)
  {
    String oldVersion = version;
    version = newVersion;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.JAVA_COMPONENT__VERSION, oldVersion, version));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSourceCodeDirectory()
  {
    return sourceCodeDirectory;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSourceCodeDirectory(String newSourceCodeDirectory)
  {
    String oldSourceCodeDirectory = sourceCodeDirectory;
    sourceCodeDirectory = newSourceCodeDirectory;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.JAVA_COMPONENT__SOURCE_CODE_DIRECTORY, oldSourceCodeDirectory, sourceCodeDirectory));
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
      case DomainPackage.JAVA_COMPONENT__ARTIFACT_ID:
        return getArtifactId();
      case DomainPackage.JAVA_COMPONENT__GROUP_ID:
        return getGroupId();
      case DomainPackage.JAVA_COMPONENT__VERSION:
        return getVersion();
      case DomainPackage.JAVA_COMPONENT__SOURCE_CODE_DIRECTORY:
        return getSourceCodeDirectory();
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
      case DomainPackage.JAVA_COMPONENT__ARTIFACT_ID:
        setArtifactId((String)newValue);
        return;
      case DomainPackage.JAVA_COMPONENT__GROUP_ID:
        setGroupId((String)newValue);
        return;
      case DomainPackage.JAVA_COMPONENT__VERSION:
        setVersion((String)newValue);
        return;
      case DomainPackage.JAVA_COMPONENT__SOURCE_CODE_DIRECTORY:
        setSourceCodeDirectory((String)newValue);
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
      case DomainPackage.JAVA_COMPONENT__ARTIFACT_ID:
        setArtifactId(ARTIFACT_ID_EDEFAULT);
        return;
      case DomainPackage.JAVA_COMPONENT__GROUP_ID:
        setGroupId(GROUP_ID_EDEFAULT);
        return;
      case DomainPackage.JAVA_COMPONENT__VERSION:
        setVersion(VERSION_EDEFAULT);
        return;
      case DomainPackage.JAVA_COMPONENT__SOURCE_CODE_DIRECTORY:
        setSourceCodeDirectory(SOURCE_CODE_DIRECTORY_EDEFAULT);
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
      case DomainPackage.JAVA_COMPONENT__ARTIFACT_ID:
        return ARTIFACT_ID_EDEFAULT == null ? artifactId != null : !ARTIFACT_ID_EDEFAULT.equals(artifactId);
      case DomainPackage.JAVA_COMPONENT__GROUP_ID:
        return GROUP_ID_EDEFAULT == null ? groupId != null : !GROUP_ID_EDEFAULT.equals(groupId);
      case DomainPackage.JAVA_COMPONENT__VERSION:
        return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
      case DomainPackage.JAVA_COMPONENT__SOURCE_CODE_DIRECTORY:
        return SOURCE_CODE_DIRECTORY_EDEFAULT == null ? sourceCodeDirectory != null : !SOURCE_CODE_DIRECTORY_EDEFAULT.equals(sourceCodeDirectory);
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
    result.append(" (artifactId: ");
    result.append(artifactId);
    result.append(", groupId: ");
    result.append(groupId);
    result.append(", version: ");
    result.append(version);
    result.append(", sourceCodeDirectory: ");
    result.append(sourceCodeDirectory);
    result.append(')');
    return result.toString();
  }

} //JavaComponentImpl
