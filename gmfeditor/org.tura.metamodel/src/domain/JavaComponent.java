/**
 */
package domain;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.JavaComponent#getArtifactId <em>Artifact Id</em>}</li>
 *   <li>{@link domain.JavaComponent#getGroupId <em>Group Id</em>}</li>
 *   <li>{@link domain.JavaComponent#getVersion <em>Version</em>}</li>
 *   <li>{@link domain.JavaComponent#getSourceCodeDirectory <em>Source Code Directory</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getJavaComponent()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface JavaComponent extends Component
{
  /**
   * Returns the value of the '<em><b>Artifact Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Artifact Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Artifact Id</em>' attribute.
   * @see #setArtifactId(String)
   * @see domain.DomainPackage#getJavaComponent_ArtifactId()
   * @model
   * @generated
   */
  String getArtifactId();

  /**
   * Sets the value of the '{@link domain.JavaComponent#getArtifactId <em>Artifact Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Artifact Id</em>' attribute.
   * @see #getArtifactId()
   * @generated
   */
  void setArtifactId(String value);

  /**
   * Returns the value of the '<em><b>Group Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Group Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Group Id</em>' attribute.
   * @see #setGroupId(String)
   * @see domain.DomainPackage#getJavaComponent_GroupId()
   * @model
   * @generated
   */
  String getGroupId();

  /**
   * Sets the value of the '{@link domain.JavaComponent#getGroupId <em>Group Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Group Id</em>' attribute.
   * @see #getGroupId()
   * @generated
   */
  void setGroupId(String value);

  /**
   * Returns the value of the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Version</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Version</em>' attribute.
   * @see #setVersion(String)
   * @see domain.DomainPackage#getJavaComponent_Version()
   * @model
   * @generated
   */
  String getVersion();

  /**
   * Sets the value of the '{@link domain.JavaComponent#getVersion <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Version</em>' attribute.
   * @see #getVersion()
   * @generated
   */
  void setVersion(String value);

  /**
   * Returns the value of the '<em><b>Source Code Directory</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source Code Directory</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source Code Directory</em>' attribute.
   * @see #setSourceCodeDirectory(String)
   * @see domain.DomainPackage#getJavaComponent_SourceCodeDirectory()
   * @model
   * @generated
   */
  String getSourceCodeDirectory();

  /**
   * Sets the value of the '{@link domain.JavaComponent#getSourceCodeDirectory <em>Source Code Directory</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source Code Directory</em>' attribute.
   * @see #getSourceCodeDirectory()
   * @generated
   */
  void setSourceCodeDirectory(String value);

} // JavaComponent
