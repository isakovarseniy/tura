/**
 */
package domain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Mapper</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link domain.RoleMapper#getRole <em>Role</em>}</li>
 *   <li>{@link domain.RoleMapper#getLocalRoleName <em>Local Role Name</em>}</li>
 *   <li>{@link domain.RoleMapper#getGlobalRoleName <em>Global Role Name</em>}</li>
 *   <li>{@link domain.RoleMapper#getFakeRoleName <em>Fake Role Name</em>}</li>
 * </ul>
 *
 * @see domain.DomainPackage#getRoleMapper()
 * @model annotation="gmf.node label='fakeRoleName' border.color='0,0,0' color='246,148,52'"
 * @generated
 */
public interface RoleMapper extends Mapper {
	/**
	 * Returns the value of the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' reference.
	 * @see #setRole(EObject)
	 * @see domain.DomainPackage#getRoleMapper_Role()
	 * @model
	 * @generated
	 */
	EObject getRole();

	/**
	 * Sets the value of the '{@link domain.RoleMapper#getRole <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(EObject value);

	/**
	 * Returns the value of the '<em><b>Local Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Role Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Role Name</em>' attribute.
	 * @see #setLocalRoleName(String)
	 * @see domain.DomainPackage#getRoleMapper_LocalRoleName()
	 * @model
	 * @generated
	 */
	String getLocalRoleName();

	/**
	 * Sets the value of the '{@link domain.RoleMapper#getLocalRoleName <em>Local Role Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Role Name</em>' attribute.
	 * @see #getLocalRoleName()
	 * @generated
	 */
	void setLocalRoleName(String value);

	/**
	 * Returns the value of the '<em><b>Global Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global Role Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Role Name</em>' attribute.
	 * @see #setGlobalRoleName(String)
	 * @see domain.DomainPackage#getRoleMapper_GlobalRoleName()
	 * @model
	 * @generated
	 */
	String getGlobalRoleName();

	/**
	 * Sets the value of the '{@link domain.RoleMapper#getGlobalRoleName <em>Global Role Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Global Role Name</em>' attribute.
	 * @see #getGlobalRoleName()
	 * @generated
	 */
	void setGlobalRoleName(String value);

	/**
	 * Returns the value of the '<em><b>Fake Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fake Role Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fake Role Name</em>' attribute.
	 * @see #setFakeRoleName(String)
	 * @see domain.DomainPackage#getRoleMapper_FakeRoleName()
	 * @model
	 * @generated
	 */
	String getFakeRoleName();

	/**
	 * Sets the value of the '{@link domain.RoleMapper#getFakeRoleName <em>Fake Role Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fake Role Name</em>' attribute.
	 * @see #getFakeRoleName()
	 * @generated
	 */
	void setFakeRoleName(String value);

} // RoleMapper
