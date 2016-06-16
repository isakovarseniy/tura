/**
 */
package tura.permission;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tura.permission.Group#getUid <em>Uid</em>}</li>
 *   <li>{@link tura.permission.Group#getName <em>Name</em>}</li>
 *   <li>{@link tura.permission.Group#getGroup2Group <em>Group2 Group</em>}</li>
 *   <li>{@link tura.permission.Group#getGroup2Role <em>Group2 Role</em>}</li>
 * </ul>
 *
 * @see tura.permission.PermissionPackage#getGroup()
 * @model
 * @generated
 */
public interface Group extends SecurityEntity {
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
	 * @see tura.permission.PermissionPackage#getGroup_Uid()
	 * @model id="true"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link tura.permission.Group#getUid <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' attribute.
	 * @see #getUid()
	 * @generated
	 */
	void setUid(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see tura.permission.PermissionPackage#getGroup_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tura.permission.Group#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Group2 Group</b></em>' reference list.
	 * The list contents are of type {@link tura.permission.Group}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group2 Group</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group2 Group</em>' reference list.
	 * @see tura.permission.PermissionPackage#getGroup_Group2Group()
	 * @model
	 * @generated
	 */
	EList<Group> getGroup2Group();

	/**
	 * Returns the value of the '<em><b>Group2 Role</b></em>' reference list.
	 * The list contents are of type {@link tura.permission.Role}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group2 Role</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group2 Role</em>' reference list.
	 * @see tura.permission.PermissionPackage#getGroup_Group2Role()
	 * @model
	 * @generated
	 */
	EList<Role> getGroup2Role();

} // Group
