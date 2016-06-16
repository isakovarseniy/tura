/**
 */
package tura.permission;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security Entity Pointer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tura.permission.SecurityEntityPointer#getSecurityEntity <em>Security Entity</em>}</li>
 * </ul>
 *
 * @see tura.permission.PermissionPackage#getSecurityEntityPointer()
 * @model
 * @generated
 */
public interface SecurityEntityPointer extends EObject {
	/**
	 * Returns the value of the '<em><b>Security Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security Entity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Entity</em>' reference.
	 * @see #setSecurityEntity(SecurityEntity)
	 * @see tura.permission.PermissionPackage#getSecurityEntityPointer_SecurityEntity()
	 * @model
	 * @generated
	 */
	SecurityEntity getSecurityEntity();

	/**
	 * Sets the value of the '{@link tura.permission.SecurityEntityPointer#getSecurityEntity <em>Security Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Entity</em>' reference.
	 * @see #getSecurityEntity()
	 * @generated
	 */
	void setSecurityEntity(SecurityEntity value);

} // SecurityEntityPointer
