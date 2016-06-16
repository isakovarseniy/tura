/**
 */
package tura.permission;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Secured</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tura.permission.Secured#getGrants <em>Grants</em>}</li>
 * </ul>
 *
 * @see tura.permission.PermissionPackage#getSecured()
 * @model
 * @generated
 */
public interface Secured extends EObject {
	/**
	 * Returns the value of the '<em><b>Grants</b></em>' containment reference list.
	 * The list contents are of type {@link tura.permission.GrantAccess}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grants</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grants</em>' containment reference list.
	 * @see tura.permission.PermissionPackage#getSecured_Grants()
	 * @model containment="true"
	 * @generated
	 */
	EList<GrantAccess> getGrants();

} // Secured
