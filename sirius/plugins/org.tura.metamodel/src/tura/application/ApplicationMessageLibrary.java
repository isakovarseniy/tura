/**
 */
package tura.application;

import org.eclipse.emf.ecore.EObject;

import tura.message.Messages;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tura.application.ApplicationMessageLibrary#getUid <em>Uid</em>}</li>
 *   <li>{@link tura.application.ApplicationMessageLibrary#getName <em>Name</em>}</li>
 *   <li>{@link tura.application.ApplicationMessageLibrary#getMessages <em>Messages</em>}</li>
 * </ul>
 *
 * @see tura.application.ApplicationPackage#getApplicationMessageLibrary()
 * @model
 * @generated
 */
public interface ApplicationMessageLibrary extends EObject {
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
	 * @see tura.application.ApplicationPackage#getApplicationMessageLibrary_Uid()
	 * @model id="true"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link tura.application.ApplicationMessageLibrary#getUid <em>Uid</em>}' attribute.
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
	 * @see tura.application.ApplicationPackage#getApplicationMessageLibrary_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tura.application.ApplicationMessageLibrary#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Messages</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Messages</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Messages</em>' containment reference.
	 * @see #setMessages(Messages)
	 * @see tura.application.ApplicationPackage#getApplicationMessageLibrary_Messages()
	 * @model containment="true"
	 * @generated
	 */
	Messages getMessages();

	/**
	 * Sets the value of the '{@link tura.application.ApplicationMessageLibrary#getMessages <em>Messages</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Messages</em>' containment reference.
	 * @see #getMessages()
	 * @generated
	 */
	void setMessages(Messages value);

} // ApplicationMessageLibrary
