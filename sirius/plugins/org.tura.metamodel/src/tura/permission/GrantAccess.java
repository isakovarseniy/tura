/**
 */
package tura.permission;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grant Access</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tura.permission.GrantAccess#getUid <em>Uid</em>}</li>
 *   <li>{@link tura.permission.GrantAccess#getRoleRef <em>Role Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see tura.permission.PermissionPackage#getGrantAccess()
 * @model
 * @generated
 */
public interface GrantAccess extends EObject {
	/**
	 * Returns the value of the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uid</em>' attribute.
	 * @see #setUid(String)
	 * @see tura.permission.PermissionPackage#getGrantAccess_Uid()
	 * @model id="true"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link tura.permission.GrantAccess#getUid <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' attribute.
	 * @see #getUid()
	 * @generated
	 */
	void setUid(String value);

	/**
	 * Returns the value of the '<em><b>Role Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Ref</em>' reference.
	 * @see #setRoleRef(Role)
	 * @see tura.permission.PermissionPackage#getGrantAccess_RoleRef()
	 * @model
	 * @generated
	 */
	Role getRoleRef();

	/**
	 * Sets the value of the '{@link tura.permission.GrantAccess#getRoleRef <em>Role Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Ref</em>' reference.
	 * @see #getRoleRef()
	 * @generated
	 */
	void setRoleRef(Role value);

} // GrantAccess
