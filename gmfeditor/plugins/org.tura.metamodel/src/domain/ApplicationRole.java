/**
 */
package domain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link domain.ApplicationRole#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.ApplicationRole#getName <em>Name</em>}</li>
 *   <li>{@link domain.ApplicationRole#getParent <em>Parent</em>}</li>
 *   <li>{@link domain.ApplicationRole#getRoles <em>Roles</em>}</li>
 * </ul>
 *
 * @see domain.DomainPackage#getApplicationRole()
 * @model annotation="gmf.node label='name' border.color='0,0,0' color='192,192,192'"
 * @generated
 */
public interface ApplicationRole extends EObject {
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
	 * @see domain.DomainPackage#getApplicationRole_Uid()
	 * @model id="true"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link domain.ApplicationRole#getUid <em>Uid</em>}' attribute.
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
	 * @see domain.DomainPackage#getApplicationRole_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link domain.ApplicationRole#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link domain.Application#getApplicationRole <em>Application Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(Application)
	 * @see domain.DomainPackage#getApplicationRole_Parent()
	 * @see domain.Application#getApplicationRole
	 * @model opposite="applicationRole" transient="false"
	 * @generated
	 */
	Application getParent();

	/**
	 * Sets the value of the '{@link domain.ApplicationRole#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Application value);

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link domain.Roles#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roles</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' reference.
	 * @see #setRoles(Roles)
	 * @see domain.DomainPackage#getApplicationRole_Roles()
	 * @see domain.Roles#getParent
	 * @model opposite="parent"
	 * @generated
	 */
	Roles getRoles();

	/**
	 * Sets the value of the '{@link domain.ApplicationRole#getRoles <em>Roles</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Roles</em>' reference.
	 * @see #getRoles()
	 * @generated
	 */
	void setRoles(Roles value);

} // ApplicationRole
