/**
 */
package domain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application Messages</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link domain.ApplicationMessages#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.ApplicationMessages#getName <em>Name</em>}</li>
 *   <li>{@link domain.ApplicationMessages#getParent <em>Parent</em>}</li>
 *   <li>{@link domain.ApplicationMessages#getMessages <em>Messages</em>}</li>
 * </ul>
 *
 * @see domain.DomainPackage#getApplicationMessages()
 * @model annotation="gmf.node label='name' border.color='0,0,0' color='192,192,192'"
 * @generated
 */
public interface ApplicationMessages extends EObject {
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
	 * @see domain.DomainPackage#getApplicationMessages_Uid()
	 * @model id="true"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link domain.ApplicationMessages#getUid <em>Uid</em>}' attribute.
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
	 * @see domain.DomainPackage#getApplicationMessages_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link domain.ApplicationMessages#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link domain.Application#getApplicationMessages <em>Application Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(Application)
	 * @see domain.DomainPackage#getApplicationMessages_Parent()
	 * @see domain.Application#getApplicationMessages
	 * @model opposite="applicationMessages" transient="false"
	 * @generated
	 */
	Application getParent();

	/**
	 * Sets the value of the '{@link domain.ApplicationMessages#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Application value);

	/**
	 * Returns the value of the '<em><b>Messages</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link domain.Messages#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Messages</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Messages</em>' reference.
	 * @see #setMessages(Messages)
	 * @see domain.DomainPackage#getApplicationMessages_Messages()
	 * @see domain.Messages#getParent
	 * @model opposite="parent"
	 * @generated
	 */
	Messages getMessages();

	/**
	 * Sets the value of the '{@link domain.ApplicationMessages#getMessages <em>Messages</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Messages</em>' reference.
	 * @see #getMessages()
	 * @generated
	 */
	void setMessages(Messages value);

} // ApplicationMessages
