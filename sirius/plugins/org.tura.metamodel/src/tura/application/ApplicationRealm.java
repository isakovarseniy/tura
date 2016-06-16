/**
 */
package tura.application;

import org.eclipse.emf.ecore.EObject;

import tura.permission.Roles;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Realm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tura.application.ApplicationRealm#getUid <em>Uid</em>}</li>
 *   <li>{@link tura.application.ApplicationRealm#getName <em>Name</em>}</li>
 *   <li>{@link tura.application.ApplicationRealm#getRoles <em>Roles</em>}</li>
 * </ul>
 *
 * @see tura.application.ApplicationPackage#getApplicationRealm()
 * @model
 * @generated
 */
public interface ApplicationRealm extends EObject {
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
	 * @see tura.application.ApplicationPackage#getApplicationRealm_Uid()
	 * @model id="true"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link tura.application.ApplicationRealm#getUid <em>Uid</em>}' attribute.
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
	 * @see tura.application.ApplicationPackage#getApplicationRealm_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tura.application.ApplicationRealm#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roles</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' containment reference.
	 * @see #setRoles(Roles)
	 * @see tura.application.ApplicationPackage#getApplicationRealm_Roles()
	 * @model containment="true"
	 * @generated
	 */
	Roles getRoles();

	/**
	 * Sets the value of the '{@link tura.application.ApplicationRealm#getRoles <em>Roles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Roles</em>' containment reference.
	 * @see #getRoles()
	 * @generated
	 */
	void setRoles(Roles value);

} // ApplicationRealm
