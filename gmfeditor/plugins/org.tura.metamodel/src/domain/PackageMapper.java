/**
 */
package domain;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package Mapper</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.PackageMapper#getPackageRef <em>Package Ref</em>}</li>
 *   <li>{@link domain.PackageMapper#getFakePackageName <em>Fake Package Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getPackageMapper()
 * @model
 * @generated
 */
public interface PackageMapper extends Mapper {
	/**
	 * Returns the value of the '<em><b>Package Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Ref</em>' reference.
	 * @see #setPackageRef(domain.Package)
	 * @see domain.DomainPackage#getPackageMapper_PackageRef()
	 * @model
	 * @generated
	 */
	domain.Package getPackageRef();

	/**
	 * Sets the value of the '{@link domain.PackageMapper#getPackageRef <em>Package Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Ref</em>' reference.
	 * @see #getPackageRef()
	 * @generated
	 */
	void setPackageRef(domain.Package value);

	/**
	 * Returns the value of the '<em><b>Fake Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fake Package Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fake Package Name</em>' attribute.
	 * @see #setFakePackageName(String)
	 * @see domain.DomainPackage#getPackageMapper_FakePackageName()
	 * @model
	 * @generated
	 */
	String getFakePackageName();

	/**
	 * Sets the value of the '{@link domain.PackageMapper#getFakePackageName <em>Fake Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fake Package Name</em>' attribute.
	 * @see #getFakePackageName()
	 * @generated
	 */
	void setFakePackageName(String value);

} // PackageMapper
