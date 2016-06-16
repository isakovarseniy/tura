/**
 */
package tura.message;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see tura.message.MessagePackage
 * @generated
 */
public interface MessageFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MessageFactory eINSTANCE = tura.message.impl.MessageFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Messages Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Messages Repository</em>'.
	 * @generated
	 */
	MessagesRepository createMessagesRepository();

	/**
	 * Returns a new object of class '<em>Messages Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Messages Group</em>'.
	 * @generated
	 */
	MessagesGroup createMessagesGroup();

	/**
	 * Returns a new object of class '<em>Messages</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Messages</em>'.
	 * @generated
	 */
	Messages createMessages();

	/**
	 * Returns a new object of class '<em>Library</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Library</em>'.
	 * @generated
	 */
	MessageLibrary createMessageLibrary();

	/**
	 * Returns a new object of class '<em>Language Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Language Ref</em>'.
	 * @generated
	 */
	LanguageRef createLanguageRef();

	/**
	 * Returns a new object of class '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message</em>'.
	 * @generated
	 */
	Message createMessage();

	/**
	 * Returns a new object of class '<em>Translation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Translation</em>'.
	 * @generated
	 */
	Translation createTranslation();

	/**
	 * Returns a new object of class '<em>Language</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Language</em>'.
	 * @generated
	 */
	Language createLanguage();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MessagePackage getMessagePackage();

} //MessageFactory
