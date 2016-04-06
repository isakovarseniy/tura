/**
 */
package domain;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java Package Mapper</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.JavaPackageMapper#getMappedToPackageName <em>Mapped To Package Name</em>}</li>
 *   <li>{@link domain.JavaPackageMapper#getArtifactId <em>Artifact Id</em>}</li>
 *   <li>{@link domain.JavaPackageMapper#getGroupId <em>Group Id</em>}</li>
 *   <li>{@link domain.JavaPackageMapper#getVersion <em>Version</em>}</li>
 *   <li>{@link domain.JavaPackageMapper#getLibraryName <em>Library Name</em>}</li>
 *   <li>{@link domain.JavaPackageMapper#getArtifactType <em>Artifact Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getJavaPackageMapper()
 * @model annotation="gmf.node label='fakePackageName' border.color='0,0,0' color='77,255,228'"
 * @generated
 */
public interface JavaPackageMapper extends PackageMapper {
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
	 * @see domain.DomainPackage#getJavaPackageMapper_MappedToPackageName()
	 * @model
	 * @generated
	 */
	String getMappedToPackageName();

	/**
	 * Sets the value of the '{@link domain.JavaPackageMapper#getMappedToPackageName <em>Mapped To Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapped To Package Name</em>' attribute.
	 * @see #getMappedToPackageName()
	 * @generated
	 */
	void setMappedToPackageName(String value);

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
	 * @see domain.DomainPackage#getJavaPackageMapper_ArtifactId()
	 * @model
	 * @generated
	 */
	String getArtifactId();

	/**
	 * Sets the value of the '{@link domain.JavaPackageMapper#getArtifactId <em>Artifact Id</em>}' attribute.
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
	 * @see domain.DomainPackage#getJavaPackageMapper_GroupId()
	 * @model
	 * @generated
	 */
	String getGroupId();

	/**
	 * Sets the value of the '{@link domain.JavaPackageMapper#getGroupId <em>Group Id</em>}' attribute.
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
	 * @see domain.DomainPackage#getJavaPackageMapper_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link domain.JavaPackageMapper#getVersion <em>Version</em>}' attribute.
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
	 * @see domain.DomainPackage#getJavaPackageMapper_LibraryName()
	 * @model
	 * @generated
	 */
	String getLibraryName();

	/**
	 * Sets the value of the '{@link domain.JavaPackageMapper#getLibraryName <em>Library Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Library Name</em>' attribute.
	 * @see #getLibraryName()
	 * @generated
	 */
	void setLibraryName(String value);

	/**
	 * Returns the value of the '<em><b>Artifact Type</b></em>' attribute.
	 * The default value is <code>"jar"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artifact Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifact Type</em>' attribute.
	 * @see #setArtifactType(String)
	 * @see domain.DomainPackage#getJavaPackageMapper_ArtifactType()
	 * @model default="jar"
	 * @generated
	 */
	String getArtifactType();

	/**
	 * Sets the value of the '{@link domain.JavaPackageMapper#getArtifactType <em>Artifact Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Artifact Type</em>' attribute.
	 * @see #getArtifactType()
	 * @generated
	 */
	void setArtifactType(String value);

} // JavaPackageMapper
