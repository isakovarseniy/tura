/**
 */
package tura.message;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import tura.common.CommonPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see tura.message.MessageFactory
 * @model kind="package"
 * @generated
 */
public interface MessagePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "message";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://tura.org/2016/v2/message";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tura.message";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MessagePackage eINSTANCE = tura.message.impl.MessagePackageImpl.init();

	/**
	 * The meta object id for the '{@link tura.message.impl.MessagesRepositoryImpl <em>Messages Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tura.message.impl.MessagesRepositoryImpl
	 * @see tura.message.impl.MessagePackageImpl#getMessagesRepository()
	 * @generated
	 */
	int MESSAGES_REPOSITORY = 0;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGES_REPOSITORY__UID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGES_REPOSITORY__NAME = 1;

	/**
	 * The feature id for the '<em><b>Messages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGES_REPOSITORY__MESSAGES = 2;

	/**
	 * The number of structural features of the '<em>Messages Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGES_REPOSITORY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Messages Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGES_REPOSITORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tura.message.impl.MessagesGroupImpl <em>Messages Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tura.message.impl.MessagesGroupImpl
	 * @see tura.message.impl.MessagePackageImpl#getMessagesGroup()
	 * @generated
	 */
	int MESSAGES_GROUP = 1;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGES_GROUP__UID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGES_GROUP__NAME = 1;

	/**
	 * The feature id for the '<em><b>Messages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGES_GROUP__MESSAGES = 2;

	/**
	 * The number of structural features of the '<em>Messages Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGES_GROUP_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Messages Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGES_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tura.message.impl.MessagesImpl <em>Messages</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tura.message.impl.MessagesImpl
	 * @see tura.message.impl.MessagePackageImpl#getMessages()
	 * @generated
	 */
	int MESSAGES = 2;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGES__UID = 0;

	/**
	 * The feature id for the '<em><b>Message Libraries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGES__MESSAGE_LIBRARIES = 1;

	/**
	 * The feature id for the '<em><b>Languages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGES__LANGUAGES = 2;

	/**
	 * The number of structural features of the '<em>Messages</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGES_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Messages</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tura.message.impl.MessageLibraryImpl <em>Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tura.message.impl.MessageLibraryImpl
	 * @see tura.message.impl.MessagePackageImpl#getMessageLibrary()
	 * @generated
	 */
	int MESSAGE_LIBRARY = 3;

	/**
	 * The feature id for the '<em><b>Classifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_LIBRARY__CLASSIFIERS = CommonPackage.CATEGORIZED__CLASSIFIERS;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_LIBRARY__UID = CommonPackage.CATEGORIZED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_LIBRARY__NAME = CommonPackage.CATEGORIZED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Lib Languages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_LIBRARY__LIB_LANGUAGES = CommonPackage.CATEGORIZED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Messages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_LIBRARY__MESSAGES = CommonPackage.CATEGORIZED_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_LIBRARY_FEATURE_COUNT = CommonPackage.CATEGORIZED_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_LIBRARY_OPERATION_COUNT = CommonPackage.CATEGORIZED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tura.message.impl.LanguageRefImpl <em>Language Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tura.message.impl.LanguageRefImpl
	 * @see tura.message.impl.MessagePackageImpl#getLanguageRef()
	 * @generated
	 */
	int LANGUAGE_REF = 4;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_REF__UID = 0;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_REF__LANG = 1;

	/**
	 * The number of structural features of the '<em>Language Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_REF_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Language Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_REF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tura.message.impl.MessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tura.message.impl.MessageImpl
	 * @see tura.message.impl.MessagePackageImpl#getMessage()
	 * @generated
	 */
	int MESSAGE = 5;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__UID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Translatioins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__TRANSLATIOINS = 2;

	/**
	 * The number of structural features of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tura.message.impl.TranslationImpl <em>Translation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tura.message.impl.TranslationImpl
	 * @see tura.message.impl.MessagePackageImpl#getTranslation()
	 * @generated
	 */
	int TRANSLATION = 6;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION__UID = 0;

	/**
	 * The feature id for the '<em><b>Translation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION__TRANSLATION = 1;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION__LANG = 2;

	/**
	 * The number of structural features of the '<em>Translation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Translation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tura.message.impl.LanguageImpl <em>Language</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tura.message.impl.LanguageImpl
	 * @see tura.message.impl.MessagePackageImpl#getLanguage()
	 * @generated
	 */
	int LANGUAGE = 7;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE__UID = 0;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE__LANG = 1;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE__CODE = 2;

	/**
	 * The feature id for the '<em><b>Default Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE__DEFAULT_LANG = 3;

	/**
	 * The number of structural features of the '<em>Language</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Language</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link tura.message.MessagesRepository <em>Messages Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Messages Repository</em>'.
	 * @see tura.message.MessagesRepository
	 * @generated
	 */
	EClass getMessagesRepository();

	/**
	 * Returns the meta object for the attribute '{@link tura.message.MessagesRepository#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see tura.message.MessagesRepository#getUid()
	 * @see #getMessagesRepository()
	 * @generated
	 */
	EAttribute getMessagesRepository_Uid();

	/**
	 * Returns the meta object for the attribute '{@link tura.message.MessagesRepository#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tura.message.MessagesRepository#getName()
	 * @see #getMessagesRepository()
	 * @generated
	 */
	EAttribute getMessagesRepository_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link tura.message.MessagesRepository#getMessages <em>Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Messages</em>'.
	 * @see tura.message.MessagesRepository#getMessages()
	 * @see #getMessagesRepository()
	 * @generated
	 */
	EReference getMessagesRepository_Messages();

	/**
	 * Returns the meta object for class '{@link tura.message.MessagesGroup <em>Messages Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Messages Group</em>'.
	 * @see tura.message.MessagesGroup
	 * @generated
	 */
	EClass getMessagesGroup();

	/**
	 * Returns the meta object for the attribute '{@link tura.message.MessagesGroup#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see tura.message.MessagesGroup#getUid()
	 * @see #getMessagesGroup()
	 * @generated
	 */
	EAttribute getMessagesGroup_Uid();

	/**
	 * Returns the meta object for the attribute '{@link tura.message.MessagesGroup#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tura.message.MessagesGroup#getName()
	 * @see #getMessagesGroup()
	 * @generated
	 */
	EAttribute getMessagesGroup_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link tura.message.MessagesGroup#getMessages <em>Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Messages</em>'.
	 * @see tura.message.MessagesGroup#getMessages()
	 * @see #getMessagesGroup()
	 * @generated
	 */
	EReference getMessagesGroup_Messages();

	/**
	 * Returns the meta object for class '{@link tura.message.Messages <em>Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Messages</em>'.
	 * @see tura.message.Messages
	 * @generated
	 */
	EClass getMessages();

	/**
	 * Returns the meta object for the attribute '{@link tura.message.Messages#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see tura.message.Messages#getUid()
	 * @see #getMessages()
	 * @generated
	 */
	EAttribute getMessages_Uid();

	/**
	 * Returns the meta object for the containment reference list '{@link tura.message.Messages#getMessageLibraries <em>Message Libraries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Message Libraries</em>'.
	 * @see tura.message.Messages#getMessageLibraries()
	 * @see #getMessages()
	 * @generated
	 */
	EReference getMessages_MessageLibraries();

	/**
	 * Returns the meta object for the containment reference list '{@link tura.message.Messages#getLanguages <em>Languages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Languages</em>'.
	 * @see tura.message.Messages#getLanguages()
	 * @see #getMessages()
	 * @generated
	 */
	EReference getMessages_Languages();

	/**
	 * Returns the meta object for class '{@link tura.message.MessageLibrary <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Library</em>'.
	 * @see tura.message.MessageLibrary
	 * @generated
	 */
	EClass getMessageLibrary();

	/**
	 * Returns the meta object for the attribute '{@link tura.message.MessageLibrary#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see tura.message.MessageLibrary#getUid()
	 * @see #getMessageLibrary()
	 * @generated
	 */
	EAttribute getMessageLibrary_Uid();

	/**
	 * Returns the meta object for the attribute '{@link tura.message.MessageLibrary#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tura.message.MessageLibrary#getName()
	 * @see #getMessageLibrary()
	 * @generated
	 */
	EAttribute getMessageLibrary_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link tura.message.MessageLibrary#getLibLanguages <em>Lib Languages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lib Languages</em>'.
	 * @see tura.message.MessageLibrary#getLibLanguages()
	 * @see #getMessageLibrary()
	 * @generated
	 */
	EReference getMessageLibrary_LibLanguages();

	/**
	 * Returns the meta object for the containment reference list '{@link tura.message.MessageLibrary#getMessages <em>Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Messages</em>'.
	 * @see tura.message.MessageLibrary#getMessages()
	 * @see #getMessageLibrary()
	 * @generated
	 */
	EReference getMessageLibrary_Messages();

	/**
	 * Returns the meta object for class '{@link tura.message.LanguageRef <em>Language Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Language Ref</em>'.
	 * @see tura.message.LanguageRef
	 * @generated
	 */
	EClass getLanguageRef();

	/**
	 * Returns the meta object for the attribute '{@link tura.message.LanguageRef#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see tura.message.LanguageRef#getUid()
	 * @see #getLanguageRef()
	 * @generated
	 */
	EAttribute getLanguageRef_Uid();

	/**
	 * Returns the meta object for the reference '{@link tura.message.LanguageRef#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lang</em>'.
	 * @see tura.message.LanguageRef#getLang()
	 * @see #getLanguageRef()
	 * @generated
	 */
	EReference getLanguageRef_Lang();

	/**
	 * Returns the meta object for class '{@link tura.message.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see tura.message.Message
	 * @generated
	 */
	EClass getMessage();

	/**
	 * Returns the meta object for the attribute '{@link tura.message.Message#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see tura.message.Message#getUid()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Uid();

	/**
	 * Returns the meta object for the attribute '{@link tura.message.Message#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tura.message.Message#getName()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link tura.message.Message#getTranslatioins <em>Translatioins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Translatioins</em>'.
	 * @see tura.message.Message#getTranslatioins()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_Translatioins();

	/**
	 * Returns the meta object for class '{@link tura.message.Translation <em>Translation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Translation</em>'.
	 * @see tura.message.Translation
	 * @generated
	 */
	EClass getTranslation();

	/**
	 * Returns the meta object for the attribute '{@link tura.message.Translation#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see tura.message.Translation#getUid()
	 * @see #getTranslation()
	 * @generated
	 */
	EAttribute getTranslation_Uid();

	/**
	 * Returns the meta object for the attribute '{@link tura.message.Translation#getTranslation <em>Translation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Translation</em>'.
	 * @see tura.message.Translation#getTranslation()
	 * @see #getTranslation()
	 * @generated
	 */
	EAttribute getTranslation_Translation();

	/**
	 * Returns the meta object for the reference '{@link tura.message.Translation#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lang</em>'.
	 * @see tura.message.Translation#getLang()
	 * @see #getTranslation()
	 * @generated
	 */
	EReference getTranslation_Lang();

	/**
	 * Returns the meta object for class '{@link tura.message.Language <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Language</em>'.
	 * @see tura.message.Language
	 * @generated
	 */
	EClass getLanguage();

	/**
	 * Returns the meta object for the attribute '{@link tura.message.Language#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see tura.message.Language#getUid()
	 * @see #getLanguage()
	 * @generated
	 */
	EAttribute getLanguage_Uid();

	/**
	 * Returns the meta object for the attribute '{@link tura.message.Language#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see tura.message.Language#getLang()
	 * @see #getLanguage()
	 * @generated
	 */
	EAttribute getLanguage_Lang();

	/**
	 * Returns the meta object for the attribute '{@link tura.message.Language#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see tura.message.Language#getCode()
	 * @see #getLanguage()
	 * @generated
	 */
	EAttribute getLanguage_Code();

	/**
	 * Returns the meta object for the attribute '{@link tura.message.Language#isDefaultLang <em>Default Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Lang</em>'.
	 * @see tura.message.Language#isDefaultLang()
	 * @see #getLanguage()
	 * @generated
	 */
	EAttribute getLanguage_DefaultLang();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MessageFactory getMessageFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link tura.message.impl.MessagesRepositoryImpl <em>Messages Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tura.message.impl.MessagesRepositoryImpl
		 * @see tura.message.impl.MessagePackageImpl#getMessagesRepository()
		 * @generated
		 */
		EClass MESSAGES_REPOSITORY = eINSTANCE.getMessagesRepository();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGES_REPOSITORY__UID = eINSTANCE.getMessagesRepository_Uid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGES_REPOSITORY__NAME = eINSTANCE.getMessagesRepository_Name();

		/**
		 * The meta object literal for the '<em><b>Messages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGES_REPOSITORY__MESSAGES = eINSTANCE.getMessagesRepository_Messages();

		/**
		 * The meta object literal for the '{@link tura.message.impl.MessagesGroupImpl <em>Messages Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tura.message.impl.MessagesGroupImpl
		 * @see tura.message.impl.MessagePackageImpl#getMessagesGroup()
		 * @generated
		 */
		EClass MESSAGES_GROUP = eINSTANCE.getMessagesGroup();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGES_GROUP__UID = eINSTANCE.getMessagesGroup_Uid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGES_GROUP__NAME = eINSTANCE.getMessagesGroup_Name();

		/**
		 * The meta object literal for the '<em><b>Messages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGES_GROUP__MESSAGES = eINSTANCE.getMessagesGroup_Messages();

		/**
		 * The meta object literal for the '{@link tura.message.impl.MessagesImpl <em>Messages</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tura.message.impl.MessagesImpl
		 * @see tura.message.impl.MessagePackageImpl#getMessages()
		 * @generated
		 */
		EClass MESSAGES = eINSTANCE.getMessages();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGES__UID = eINSTANCE.getMessages_Uid();

		/**
		 * The meta object literal for the '<em><b>Message Libraries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGES__MESSAGE_LIBRARIES = eINSTANCE.getMessages_MessageLibraries();

		/**
		 * The meta object literal for the '<em><b>Languages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGES__LANGUAGES = eINSTANCE.getMessages_Languages();

		/**
		 * The meta object literal for the '{@link tura.message.impl.MessageLibraryImpl <em>Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tura.message.impl.MessageLibraryImpl
		 * @see tura.message.impl.MessagePackageImpl#getMessageLibrary()
		 * @generated
		 */
		EClass MESSAGE_LIBRARY = eINSTANCE.getMessageLibrary();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_LIBRARY__UID = eINSTANCE.getMessageLibrary_Uid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_LIBRARY__NAME = eINSTANCE.getMessageLibrary_Name();

		/**
		 * The meta object literal for the '<em><b>Lib Languages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_LIBRARY__LIB_LANGUAGES = eINSTANCE.getMessageLibrary_LibLanguages();

		/**
		 * The meta object literal for the '<em><b>Messages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_LIBRARY__MESSAGES = eINSTANCE.getMessageLibrary_Messages();

		/**
		 * The meta object literal for the '{@link tura.message.impl.LanguageRefImpl <em>Language Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tura.message.impl.LanguageRefImpl
		 * @see tura.message.impl.MessagePackageImpl#getLanguageRef()
		 * @generated
		 */
		EClass LANGUAGE_REF = eINSTANCE.getLanguageRef();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANGUAGE_REF__UID = eINSTANCE.getLanguageRef_Uid();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANGUAGE_REF__LANG = eINSTANCE.getLanguageRef_Lang();

		/**
		 * The meta object literal for the '{@link tura.message.impl.MessageImpl <em>Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tura.message.impl.MessageImpl
		 * @see tura.message.impl.MessagePackageImpl#getMessage()
		 * @generated
		 */
		EClass MESSAGE = eINSTANCE.getMessage();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__UID = eINSTANCE.getMessage_Uid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__NAME = eINSTANCE.getMessage_Name();

		/**
		 * The meta object literal for the '<em><b>Translatioins</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__TRANSLATIOINS = eINSTANCE.getMessage_Translatioins();

		/**
		 * The meta object literal for the '{@link tura.message.impl.TranslationImpl <em>Translation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tura.message.impl.TranslationImpl
		 * @see tura.message.impl.MessagePackageImpl#getTranslation()
		 * @generated
		 */
		EClass TRANSLATION = eINSTANCE.getTranslation();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSLATION__UID = eINSTANCE.getTranslation_Uid();

		/**
		 * The meta object literal for the '<em><b>Translation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSLATION__TRANSLATION = eINSTANCE.getTranslation_Translation();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSLATION__LANG = eINSTANCE.getTranslation_Lang();

		/**
		 * The meta object literal for the '{@link tura.message.impl.LanguageImpl <em>Language</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tura.message.impl.LanguageImpl
		 * @see tura.message.impl.MessagePackageImpl#getLanguage()
		 * @generated
		 */
		EClass LANGUAGE = eINSTANCE.getLanguage();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANGUAGE__UID = eINSTANCE.getLanguage_Uid();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANGUAGE__LANG = eINSTANCE.getLanguage_Lang();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANGUAGE__CODE = eINSTANCE.getLanguage_Code();

		/**
		 * The meta object literal for the '<em><b>Default Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANGUAGE__DEFAULT_LANG = eINSTANCE.getLanguage_DefaultLang();

	}

} //MessagePackage
