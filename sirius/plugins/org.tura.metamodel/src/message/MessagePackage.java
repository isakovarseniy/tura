/**
 */
package message;

import artifact.ArtifactPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see message.MessageFactory
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
	MessagePackage eINSTANCE = message.impl.MessagePackageImpl.init();

	/**
	 * The meta object id for the '{@link message.impl.MessageLibraryImpl <em>Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see message.impl.MessageLibraryImpl
	 * @see message.impl.MessagePackageImpl#getMessageLibrary()
	 * @generated
	 */
	int MESSAGE_LIBRARY = 0;

	/**
	 * The feature id for the '<em><b>Classifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_LIBRARY__CLASSIFIERS = ArtifactPackage.CATEGORIZED__CLASSIFIERS;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_LIBRARY__UID = ArtifactPackage.CATEGORIZED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_LIBRARY__NAME = ArtifactPackage.CATEGORIZED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Lib Languages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_LIBRARY__LIB_LANGUAGES = ArtifactPackage.CATEGORIZED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Messages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_LIBRARY__MESSAGES = ArtifactPackage.CATEGORIZED_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_LIBRARY_FEATURE_COUNT = ArtifactPackage.CATEGORIZED_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link message.impl.MessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see message.impl.MessageImpl
	 * @see message.impl.MessagePackageImpl#getMessage()
	 * @generated
	 */
	int MESSAGE = 1;

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
	 * The meta object id for the '{@link message.impl.TranslationImpl <em>Translation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see message.impl.TranslationImpl
	 * @see message.impl.MessagePackageImpl#getTranslation()
	 * @generated
	 */
	int TRANSLATION = 2;

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
	 * The meta object id for the '{@link message.impl.LanguageImpl <em>Language</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see message.impl.LanguageImpl
	 * @see message.impl.MessagePackageImpl#getLanguage()
	 * @generated
	 */
	int LANGUAGE = 3;

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
	 * Returns the meta object for class '{@link message.MessageLibrary <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Library</em>'.
	 * @see message.MessageLibrary
	 * @generated
	 */
	EClass getMessageLibrary();

	/**
	 * Returns the meta object for the attribute '{@link message.MessageLibrary#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see message.MessageLibrary#getUid()
	 * @see #getMessageLibrary()
	 * @generated
	 */
	EAttribute getMessageLibrary_Uid();

	/**
	 * Returns the meta object for the attribute '{@link message.MessageLibrary#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see message.MessageLibrary#getName()
	 * @see #getMessageLibrary()
	 * @generated
	 */
	EAttribute getMessageLibrary_Name();

	/**
	 * Returns the meta object for the reference list '{@link message.MessageLibrary#getLibLanguages <em>Lib Languages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lib Languages</em>'.
	 * @see message.MessageLibrary#getLibLanguages()
	 * @see #getMessageLibrary()
	 * @generated
	 */
	EReference getMessageLibrary_LibLanguages();

	/**
	 * Returns the meta object for the containment reference list '{@link message.MessageLibrary#getMessages <em>Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Messages</em>'.
	 * @see message.MessageLibrary#getMessages()
	 * @see #getMessageLibrary()
	 * @generated
	 */
	EReference getMessageLibrary_Messages();

	/**
	 * Returns the meta object for class '{@link message.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see message.Message
	 * @generated
	 */
	EClass getMessage();

	/**
	 * Returns the meta object for the attribute '{@link message.Message#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see message.Message#getUid()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Uid();

	/**
	 * Returns the meta object for the attribute '{@link message.Message#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see message.Message#getName()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link message.Message#getTranslatioins <em>Translatioins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Translatioins</em>'.
	 * @see message.Message#getTranslatioins()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_Translatioins();

	/**
	 * Returns the meta object for class '{@link message.Translation <em>Translation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Translation</em>'.
	 * @see message.Translation
	 * @generated
	 */
	EClass getTranslation();

	/**
	 * Returns the meta object for the attribute '{@link message.Translation#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see message.Translation#getUid()
	 * @see #getTranslation()
	 * @generated
	 */
	EAttribute getTranslation_Uid();

	/**
	 * Returns the meta object for the attribute '{@link message.Translation#getTranslation <em>Translation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Translation</em>'.
	 * @see message.Translation#getTranslation()
	 * @see #getTranslation()
	 * @generated
	 */
	EAttribute getTranslation_Translation();

	/**
	 * Returns the meta object for the reference '{@link message.Translation#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lang</em>'.
	 * @see message.Translation#getLang()
	 * @see #getTranslation()
	 * @generated
	 */
	EReference getTranslation_Lang();

	/**
	 * Returns the meta object for class '{@link message.Language <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Language</em>'.
	 * @see message.Language
	 * @generated
	 */
	EClass getLanguage();

	/**
	 * Returns the meta object for the attribute '{@link message.Language#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see message.Language#getUid()
	 * @see #getLanguage()
	 * @generated
	 */
	EAttribute getLanguage_Uid();

	/**
	 * Returns the meta object for the attribute '{@link message.Language#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see message.Language#getLang()
	 * @see #getLanguage()
	 * @generated
	 */
	EAttribute getLanguage_Lang();

	/**
	 * Returns the meta object for the attribute '{@link message.Language#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see message.Language#getCode()
	 * @see #getLanguage()
	 * @generated
	 */
	EAttribute getLanguage_Code();

	/**
	 * Returns the meta object for the attribute '{@link message.Language#isDefaultLang <em>Default Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Lang</em>'.
	 * @see message.Language#isDefaultLang()
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
		 * The meta object literal for the '{@link message.impl.MessageLibraryImpl <em>Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see message.impl.MessageLibraryImpl
		 * @see message.impl.MessagePackageImpl#getMessageLibrary()
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
		 * The meta object literal for the '<em><b>Lib Languages</b></em>' reference list feature.
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
		 * The meta object literal for the '{@link message.impl.MessageImpl <em>Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see message.impl.MessageImpl
		 * @see message.impl.MessagePackageImpl#getMessage()
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
		 * The meta object literal for the '{@link message.impl.TranslationImpl <em>Translation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see message.impl.TranslationImpl
		 * @see message.impl.MessagePackageImpl#getTranslation()
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
		 * The meta object literal for the '{@link message.impl.LanguageImpl <em>Language</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see message.impl.LanguageImpl
		 * @see message.impl.MessagePackageImpl#getLanguage()
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
