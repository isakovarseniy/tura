/**
 */
package domain;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java Mapper</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.JavaMapper#getMappedToPackageName <em>Mapped To Package Name</em>}</li>
 *   <li>{@link domain.JavaMapper#getMappedToClassName <em>Mapped To Class Name</em>}</li>
 *   <li>{@link domain.JavaMapper#getArtifactId <em>Artifact Id</em>}</li>
 *   <li>{@link domain.JavaMapper#getGroupId <em>Group Id</em>}</li>
 *   <li>{@link domain.JavaMapper#getVersion <em>Version</em>}</li>
 *   <li>{@link domain.JavaMapper#getLibraryName <em>Library Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getJavaMapper()
 * @model annotation="gmf.node label='fakePackageName,fakeTypeName' border.color='0,0,0' color='255,237,85'"
 * @generated
 */
public interface JavaMapper extends Mapper
{
  /**
   * Returns the value of the '<em><b>Mapped To Package Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mapped To Package Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mapped To Package Name</em>' attribute.
   * @see #setMappedToPackageName(String)
   * @see domain.DomainPackage#getJavaMapper_MappedToPackageName()
   * @model
   * @generated
   */
  String getMappedToPackageName();

  /**
   * Sets the value of the '{@link domain.JavaMapper#getMappedToPackageName <em>Mapped To Package Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mapped To Package Name</em>' attribute.
   * @see #getMappedToPackageName()
   * @generated
   */
  void setMappedToPackageName(String value);

  /**
   * Returns the value of the '<em><b>Mapped To Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mapped To Class Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mapped To Class Name</em>' attribute.
   * @see #setMappedToClassName(String)
   * @see domain.DomainPackage#getJavaMapper_MappedToClassName()
   * @model
   * @generated
   */
  String getMappedToClassName();

  /**
   * Sets the value of the '{@link domain.JavaMapper#getMappedToClassName <em>Mapped To Class Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mapped To Class Name</em>' attribute.
   * @see #getMappedToClassName()
   * @generated
   */
  void setMappedToClassName(String value);

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
   * @see domain.DomainPackage#getJavaMapper_ArtifactId()
   * @model
   * @generated
   */
  String getArtifactId();

  /**
   * Sets the value of the '{@link domain.JavaMapper#getArtifactId <em>Artifact Id</em>}' attribute.
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
   * @see domain.DomainPackage#getJavaMapper_GroupId()
   * @model
   * @generated
   */
  String getGroupId();

  /**
   * Sets the value of the '{@link domain.JavaMapper#getGroupId <em>Group Id</em>}' attribute.
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
   * @see domain.DomainPackage#getJavaMapper_Version()
   * @model
   * @generated
   */
  String getVersion();

  /**
   * Sets the value of the '{@link domain.JavaMapper#getVersion <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Version</em>' attribute.
   * @see #getVersion()
   * @generated
   */
  void setVersion(String value);

  /**
   * Returns the value of the '<em><b>Library Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Library Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Library Name</em>' attribute.
   * @see #setLibraryName(String)
   * @see domain.DomainPackage#getJavaMapper_LibraryName()
   * @model
   * @generated
   */
  String getLibraryName();

  /**
   * Sets the value of the '{@link domain.JavaMapper#getLibraryName <em>Library Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Library Name</em>' attribute.
   * @see #getLibraryName()
   * @generated
   */
  void setLibraryName(String value);

} // JavaMapper
