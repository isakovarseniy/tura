/**
 */
package tura.application;

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
 * @see tura.application.ApplicationFactory
 * @model kind="package"
 * @generated
 */
public interface ApplicationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "application";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://tura.org/2016/v2/application";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tura.application";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApplicationPackage eINSTANCE = tura.application.impl.ApplicationPackageImpl.init();

	/**
	 * The meta object id for the '{@link tura.application.impl.ApplicationGroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tura.application.impl.ApplicationGroupImpl
	 * @see tura.application.impl.ApplicationPackageImpl#getApplicationGroup()
	 * @generated
	 */
	int APPLICATION_GROUP = 0;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_GROUP__UID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_GROUP__NAME = 1;

	/**
	 * The feature id for the '<em><b>Applications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_GROUP__APPLICATIONS = 2;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_GROUP_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tura.application.impl.ApplicationImpl <em>Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tura.application.impl.ApplicationImpl
	 * @see tura.application.impl.ApplicationPackageImpl#getApplication()
	 * @generated
	 */
	int APPLICATION = 1;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__UID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__NAME = 1;

	/**
	 * The feature id for the '<em><b>Application Recipes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__APPLICATION_RECIPES = 2;

	/**
	 * The feature id for the '<em><b>Application Mappers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__APPLICATION_MAPPERS = 3;

	/**
	 * The feature id for the '<em><b>Application UI Layer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__APPLICATION_UI_LAYER = 4;

	/**
	 * The feature id for the '<em><b>Application Infrastructure Layer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__APPLICATION_INFRASTRUCTURE_LAYER = 5;

	/**
	 * The feature id for the '<em><b>Application Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__APPLICATION_STYLE = 6;

	/**
	 * The feature id for the '<em><b>Application Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__APPLICATION_ROLE = 7;

	/**
	 * The feature id for the '<em><b>Application Messages</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__APPLICATION_MESSAGES = 8;

	/**
	 * The number of structural features of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tura.application.impl.ApplicationInfrastructureLayersImpl <em>Infrastructure Layers</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tura.application.impl.ApplicationInfrastructureLayersImpl
	 * @see tura.application.impl.ApplicationPackageImpl#getApplicationInfrastructureLayers()
	 * @generated
	 */
	int APPLICATION_INFRASTRUCTURE_LAYERS = 2;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_INFRASTRUCTURE_LAYERS__UID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_INFRASTRUCTURE_LAYERS__NAME = 1;

	/**
	 * The feature id for the '<em><b>Infarastructure Layers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_INFRASTRUCTURE_LAYERS__INFARASTRUCTURE_LAYERS = 2;

	/**
	 * The number of structural features of the '<em>Infrastructure Layers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_INFRASTRUCTURE_LAYERS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Infrastructure Layers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_INFRASTRUCTURE_LAYERS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tura.application.impl.ApplicationInfrastructureLayerImpl <em>Infrastructure Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tura.application.impl.ApplicationInfrastructureLayerImpl
	 * @see tura.application.impl.ApplicationPackageImpl#getApplicationInfrastructureLayer()
	 * @generated
	 */
	int APPLICATION_INFRASTRUCTURE_LAYER = 3;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_INFRASTRUCTURE_LAYER__UID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_INFRASTRUCTURE_LAYER__NAME = 1;

	/**
	 * The feature id for the '<em><b>Infarastructure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_INFRASTRUCTURE_LAYER__INFARASTRUCTURE = 2;

	/**
	 * The number of structural features of the '<em>Infrastructure Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_INFRASTRUCTURE_LAYER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Infrastructure Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_INFRASTRUCTURE_LAYER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tura.application.impl.ApplicationMessageLibrariesImpl <em>Message Libraries</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tura.application.impl.ApplicationMessageLibrariesImpl
	 * @see tura.application.impl.ApplicationPackageImpl#getApplicationMessageLibraries()
	 * @generated
	 */
	int APPLICATION_MESSAGE_LIBRARIES = 4;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_MESSAGE_LIBRARIES__UID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_MESSAGE_LIBRARIES__NAME = 1;

	/**
	 * The feature id for the '<em><b>Message Libraries</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_MESSAGE_LIBRARIES__MESSAGE_LIBRARIES = 2;

	/**
	 * The feature id for the '<em><b>Application Languages</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_MESSAGE_LIBRARIES__APPLICATION_LANGUAGES = 3;

	/**
	 * The number of structural features of the '<em>Message Libraries</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_MESSAGE_LIBRARIES_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Message Libraries</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_MESSAGE_LIBRARIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tura.application.impl.ApplicationLanguagesImpl <em>Languages</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tura.application.impl.ApplicationLanguagesImpl
	 * @see tura.application.impl.ApplicationPackageImpl#getApplicationLanguages()
	 * @generated
	 */
	int APPLICATION_LANGUAGES = 5;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_LANGUAGES__UID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_LANGUAGES__NAME = 1;

	/**
	 * The feature id for the '<em><b>Languages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_LANGUAGES__LANGUAGES = 2;

	/**
	 * The number of structural features of the '<em>Languages</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_LANGUAGES_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Languages</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_LANGUAGES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tura.application.impl.ApplicationMessageLibraryImpl <em>Message Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tura.application.impl.ApplicationMessageLibraryImpl
	 * @see tura.application.impl.ApplicationPackageImpl#getApplicationMessageLibrary()
	 * @generated
	 */
	int APPLICATION_MESSAGE_LIBRARY = 6;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_MESSAGE_LIBRARY__UID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_MESSAGE_LIBRARY__NAME = 1;

	/**
	 * The feature id for the '<em><b>Libraries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_MESSAGE_LIBRARY__LIBRARIES = 2;

	/**
	 * The number of structural features of the '<em>Message Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_MESSAGE_LIBRARY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Message Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_MESSAGE_LIBRARY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tura.application.impl.ApplicationRealmsImpl <em>Realms</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tura.application.impl.ApplicationRealmsImpl
	 * @see tura.application.impl.ApplicationPackageImpl#getApplicationRealms()
	 * @generated
	 */
	int APPLICATION_REALMS = 7;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_REALMS__UID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_REALMS__NAME = 1;

	/**
	 * The feature id for the '<em><b>Realms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_REALMS__REALMS = 2;

	/**
	 * The number of structural features of the '<em>Realms</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_REALMS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Realms</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_REALMS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tura.application.impl.ApplicationRealmImpl <em>Realm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tura.application.impl.ApplicationRealmImpl
	 * @see tura.application.impl.ApplicationPackageImpl#getApplicationRealm()
	 * @generated
	 */
	int APPLICATION_REALM = 8;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_REALM__UID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_REALM__NAME = 1;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_REALM__ROLES = 2;

	/**
	 * The number of structural features of the '<em>Realm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_REALM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Realm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_REALM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tura.application.impl.ApplicationStyleLibrariesImpl <em>Style Libraries</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tura.application.impl.ApplicationStyleLibrariesImpl
	 * @see tura.application.impl.ApplicationPackageImpl#getApplicationStyleLibraries()
	 * @generated
	 */
	int APPLICATION_STYLE_LIBRARIES = 9;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_STYLE_LIBRARIES__UID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_STYLE_LIBRARIES__NAME = 1;

	/**
	 * The feature id for the '<em><b>Style Libraries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_STYLE_LIBRARIES__STYLE_LIBRARIES = 2;

	/**
	 * The number of structural features of the '<em>Style Libraries</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_STYLE_LIBRARIES_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Style Libraries</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_STYLE_LIBRARIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tura.application.impl.ApplicationStyleImpl <em>Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tura.application.impl.ApplicationStyleImpl
	 * @see tura.application.impl.ApplicationPackageImpl#getApplicationStyle()
	 * @generated
	 */
	int APPLICATION_STYLE = 10;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_STYLE__UID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_STYLE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Styles Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_STYLE__STYLES_PACKAGE = 2;

	/**
	 * The number of structural features of the '<em>Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_STYLE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_STYLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tura.application.impl.ApplicationUILayerImpl <em>UI Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tura.application.impl.ApplicationUILayerImpl
	 * @see tura.application.impl.ApplicationPackageImpl#getApplicationUILayer()
	 * @generated
	 */
	int APPLICATION_UI_LAYER = 11;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_UI_LAYER__UID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_UI_LAYER__NAME = 1;

	/**
	 * The feature id for the '<em><b>Application UI Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_UI_LAYER__APPLICATION_UI_PACKAGES = 2;

	/**
	 * The number of structural features of the '<em>UI Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_UI_LAYER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>UI Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_UI_LAYER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tura.application.impl.ApplicationUIPackageImpl <em>UI Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tura.application.impl.ApplicationUIPackageImpl
	 * @see tura.application.impl.ApplicationPackageImpl#getApplicationUIPackage()
	 * @generated
	 */
	int APPLICATION_UI_PACKAGE = 12;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_UI_PACKAGE__UID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_UI_PACKAGE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Uipackage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_UI_PACKAGE__UIPACKAGE = 2;

	/**
	 * The number of structural features of the '<em>UI Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_UI_PACKAGE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>UI Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_UI_PACKAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tura.application.impl.ApplicationRecipesImpl <em>Recipes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tura.application.impl.ApplicationRecipesImpl
	 * @see tura.application.impl.ApplicationPackageImpl#getApplicationRecipes()
	 * @generated
	 */
	int APPLICATION_RECIPES = 13;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_RECIPES__UID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_RECIPES__NAME = 1;

	/**
	 * The feature id for the '<em><b>Recipes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_RECIPES__RECIPES = 2;

	/**
	 * The number of structural features of the '<em>Recipes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_RECIPES_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Recipes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_RECIPES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tura.application.impl.ApplicationRecipeImpl <em>Recipe</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tura.application.impl.ApplicationRecipeImpl
	 * @see tura.application.impl.ApplicationPackageImpl#getApplicationRecipe()
	 * @generated
	 */
	int APPLICATION_RECIPE = 14;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_RECIPE__UID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_RECIPE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Recipes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_RECIPE__RECIPES = 2;

	/**
	 * The number of structural features of the '<em>Recipe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_RECIPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Recipe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_RECIPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tura.application.impl.ApplicationMappersImpl <em>Mappers</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tura.application.impl.ApplicationMappersImpl
	 * @see tura.application.impl.ApplicationPackageImpl#getApplicationMappers()
	 * @generated
	 */
	int APPLICATION_MAPPERS = 15;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_MAPPERS__UID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_MAPPERS__NAME = 1;

	/**
	 * The feature id for the '<em><b>Mappers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_MAPPERS__MAPPERS = 2;

	/**
	 * The number of structural features of the '<em>Mappers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_MAPPERS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Mappers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_MAPPERS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tura.application.impl.ApplicationMapperImpl <em>Mapper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tura.application.impl.ApplicationMapperImpl
	 * @see tura.application.impl.ApplicationPackageImpl#getApplicationMapper()
	 * @generated
	 */
	int APPLICATION_MAPPER = 16;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_MAPPER__UID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_MAPPER__NAME = 1;

	/**
	 * The feature id for the '<em><b>Mapper</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_MAPPER__MAPPER = 2;

	/**
	 * The number of structural features of the '<em>Mapper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_MAPPER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Mapper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_MAPPER_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link tura.application.ApplicationGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see tura.application.ApplicationGroup
	 * @generated
	 */
	EClass getApplicationGroup();

	/**
	 * Returns the meta object for the attribute '{@link tura.application.ApplicationGroup#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see tura.application.ApplicationGroup#getUid()
	 * @see #getApplicationGroup()
	 * @generated
	 */
	EAttribute getApplicationGroup_Uid();

	/**
	 * Returns the meta object for the attribute '{@link tura.application.ApplicationGroup#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tura.application.ApplicationGroup#getName()
	 * @see #getApplicationGroup()
	 * @generated
	 */
	EAttribute getApplicationGroup_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link tura.application.ApplicationGroup#getApplications <em>Applications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Applications</em>'.
	 * @see tura.application.ApplicationGroup#getApplications()
	 * @see #getApplicationGroup()
	 * @generated
	 */
	EReference getApplicationGroup_Applications();

	/**
	 * Returns the meta object for class '{@link tura.application.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application</em>'.
	 * @see tura.application.Application
	 * @generated
	 */
	EClass getApplication();

	/**
	 * Returns the meta object for the attribute '{@link tura.application.Application#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see tura.application.Application#getUid()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_Uid();

	/**
	 * Returns the meta object for the attribute '{@link tura.application.Application#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tura.application.Application#getName()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_Name();

	/**
	 * Returns the meta object for the containment reference '{@link tura.application.Application#getApplicationRecipes <em>Application Recipes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Application Recipes</em>'.
	 * @see tura.application.Application#getApplicationRecipes()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_ApplicationRecipes();

	/**
	 * Returns the meta object for the containment reference '{@link tura.application.Application#getApplicationMappers <em>Application Mappers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Application Mappers</em>'.
	 * @see tura.application.Application#getApplicationMappers()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_ApplicationMappers();

	/**
	 * Returns the meta object for the containment reference '{@link tura.application.Application#getApplicationUILayer <em>Application UI Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Application UI Layer</em>'.
	 * @see tura.application.Application#getApplicationUILayer()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_ApplicationUILayer();

	/**
	 * Returns the meta object for the containment reference '{@link tura.application.Application#getApplicationInfrastructureLayer <em>Application Infrastructure Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Application Infrastructure Layer</em>'.
	 * @see tura.application.Application#getApplicationInfrastructureLayer()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_ApplicationInfrastructureLayer();

	/**
	 * Returns the meta object for the containment reference '{@link tura.application.Application#getApplicationStyle <em>Application Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Application Style</em>'.
	 * @see tura.application.Application#getApplicationStyle()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_ApplicationStyle();

	/**
	 * Returns the meta object for the containment reference '{@link tura.application.Application#getApplicationRole <em>Application Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Application Role</em>'.
	 * @see tura.application.Application#getApplicationRole()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_ApplicationRole();

	/**
	 * Returns the meta object for the containment reference '{@link tura.application.Application#getApplicationMessages <em>Application Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Application Messages</em>'.
	 * @see tura.application.Application#getApplicationMessages()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_ApplicationMessages();

	/**
	 * Returns the meta object for class '{@link tura.application.ApplicationInfrastructureLayers <em>Infrastructure Layers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Infrastructure Layers</em>'.
	 * @see tura.application.ApplicationInfrastructureLayers
	 * @generated
	 */
	EClass getApplicationInfrastructureLayers();

	/**
	 * Returns the meta object for the attribute '{@link tura.application.ApplicationInfrastructureLayers#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see tura.application.ApplicationInfrastructureLayers#getUid()
	 * @see #getApplicationInfrastructureLayers()
	 * @generated
	 */
	EAttribute getApplicationInfrastructureLayers_Uid();

	/**
	 * Returns the meta object for the attribute '{@link tura.application.ApplicationInfrastructureLayers#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tura.application.ApplicationInfrastructureLayers#getName()
	 * @see #getApplicationInfrastructureLayers()
	 * @generated
	 */
	EAttribute getApplicationInfrastructureLayers_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link tura.application.ApplicationInfrastructureLayers#getInfarastructureLayers <em>Infarastructure Layers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Infarastructure Layers</em>'.
	 * @see tura.application.ApplicationInfrastructureLayers#getInfarastructureLayers()
	 * @see #getApplicationInfrastructureLayers()
	 * @generated
	 */
	EReference getApplicationInfrastructureLayers_InfarastructureLayers();

	/**
	 * Returns the meta object for class '{@link tura.application.ApplicationInfrastructureLayer <em>Infrastructure Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Infrastructure Layer</em>'.
	 * @see tura.application.ApplicationInfrastructureLayer
	 * @generated
	 */
	EClass getApplicationInfrastructureLayer();

	/**
	 * Returns the meta object for the attribute '{@link tura.application.ApplicationInfrastructureLayer#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see tura.application.ApplicationInfrastructureLayer#getUid()
	 * @see #getApplicationInfrastructureLayer()
	 * @generated
	 */
	EAttribute getApplicationInfrastructureLayer_Uid();

	/**
	 * Returns the meta object for the attribute '{@link tura.application.ApplicationInfrastructureLayer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tura.application.ApplicationInfrastructureLayer#getName()
	 * @see #getApplicationInfrastructureLayer()
	 * @generated
	 */
	EAttribute getApplicationInfrastructureLayer_Name();

	/**
	 * Returns the meta object for the containment reference '{@link tura.application.ApplicationInfrastructureLayer#getInfarastructure <em>Infarastructure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Infarastructure</em>'.
	 * @see tura.application.ApplicationInfrastructureLayer#getInfarastructure()
	 * @see #getApplicationInfrastructureLayer()
	 * @generated
	 */
	EReference getApplicationInfrastructureLayer_Infarastructure();

	/**
	 * Returns the meta object for class '{@link tura.application.ApplicationMessageLibraries <em>Message Libraries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Libraries</em>'.
	 * @see tura.application.ApplicationMessageLibraries
	 * @generated
	 */
	EClass getApplicationMessageLibraries();

	/**
	 * Returns the meta object for the attribute '{@link tura.application.ApplicationMessageLibraries#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see tura.application.ApplicationMessageLibraries#getUid()
	 * @see #getApplicationMessageLibraries()
	 * @generated
	 */
	EAttribute getApplicationMessageLibraries_Uid();

	/**
	 * Returns the meta object for the attribute '{@link tura.application.ApplicationMessageLibraries#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tura.application.ApplicationMessageLibraries#getName()
	 * @see #getApplicationMessageLibraries()
	 * @generated
	 */
	EAttribute getApplicationMessageLibraries_Name();

	/**
	 * Returns the meta object for the containment reference '{@link tura.application.ApplicationMessageLibraries#getMessageLibraries <em>Message Libraries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message Libraries</em>'.
	 * @see tura.application.ApplicationMessageLibraries#getMessageLibraries()
	 * @see #getApplicationMessageLibraries()
	 * @generated
	 */
	EReference getApplicationMessageLibraries_MessageLibraries();

	/**
	 * Returns the meta object for the containment reference '{@link tura.application.ApplicationMessageLibraries#getApplicationLanguages <em>Application Languages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Application Languages</em>'.
	 * @see tura.application.ApplicationMessageLibraries#getApplicationLanguages()
	 * @see #getApplicationMessageLibraries()
	 * @generated
	 */
	EReference getApplicationMessageLibraries_ApplicationLanguages();

	/**
	 * Returns the meta object for class '{@link tura.application.ApplicationLanguages <em>Languages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Languages</em>'.
	 * @see tura.application.ApplicationLanguages
	 * @generated
	 */
	EClass getApplicationLanguages();

	/**
	 * Returns the meta object for the attribute '{@link tura.application.ApplicationLanguages#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see tura.application.ApplicationLanguages#getUid()
	 * @see #getApplicationLanguages()
	 * @generated
	 */
	EAttribute getApplicationLanguages_Uid();

	/**
	 * Returns the meta object for the attribute '{@link tura.application.ApplicationLanguages#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tura.application.ApplicationLanguages#getName()
	 * @see #getApplicationLanguages()
	 * @generated
	 */
	EAttribute getApplicationLanguages_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link tura.application.ApplicationLanguages#getLanguages <em>Languages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Languages</em>'.
	 * @see tura.application.ApplicationLanguages#getLanguages()
	 * @see #getApplicationLanguages()
	 * @generated
	 */
	EReference getApplicationLanguages_Languages();

	/**
	 * Returns the meta object for class '{@link tura.application.ApplicationMessageLibrary <em>Message Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Library</em>'.
	 * @see tura.application.ApplicationMessageLibrary
	 * @generated
	 */
	EClass getApplicationMessageLibrary();

	/**
	 * Returns the meta object for the attribute '{@link tura.application.ApplicationMessageLibrary#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see tura.application.ApplicationMessageLibrary#getUid()
	 * @see #getApplicationMessageLibrary()
	 * @generated
	 */
	EAttribute getApplicationMessageLibrary_Uid();

	/**
	 * Returns the meta object for the attribute '{@link tura.application.ApplicationMessageLibrary#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tura.application.ApplicationMessageLibrary#getName()
	 * @see #getApplicationMessageLibrary()
	 * @generated
	 */
	EAttribute getApplicationMessageLibrary_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link tura.application.ApplicationMessageLibrary#getLibraries <em>Libraries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Libraries</em>'.
	 * @see tura.application.ApplicationMessageLibrary#getLibraries()
	 * @see #getApplicationMessageLibrary()
	 * @generated
	 */
	EReference getApplicationMessageLibrary_Libraries();

	/**
	 * Returns the meta object for class '{@link tura.application.ApplicationRealms <em>Realms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Realms</em>'.
	 * @see tura.application.ApplicationRealms
	 * @generated
	 */
	EClass getApplicationRealms();

	/**
	 * Returns the meta object for the attribute '{@link tura.application.ApplicationRealms#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see tura.application.ApplicationRealms#getUid()
	 * @see #getApplicationRealms()
	 * @generated
	 */
	EAttribute getApplicationRealms_Uid();

	/**
	 * Returns the meta object for the attribute '{@link tura.application.ApplicationRealms#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tura.application.ApplicationRealms#getName()
	 * @see #getApplicationRealms()
	 * @generated
	 */
	EAttribute getApplicationRealms_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link tura.application.ApplicationRealms#getRealms <em>Realms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realms</em>'.
	 * @see tura.application.ApplicationRealms#getRealms()
	 * @see #getApplicationRealms()
	 * @generated
	 */
	EReference getApplicationRealms_Realms();

	/**
	 * Returns the meta object for class '{@link tura.application.ApplicationRealm <em>Realm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Realm</em>'.
	 * @see tura.application.ApplicationRealm
	 * @generated
	 */
	EClass getApplicationRealm();

	/**
	 * Returns the meta object for the attribute '{@link tura.application.ApplicationRealm#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see tura.application.ApplicationRealm#getUid()
	 * @see #getApplicationRealm()
	 * @generated
	 */
	EAttribute getApplicationRealm_Uid();

	/**
	 * Returns the meta object for the attribute '{@link tura.application.ApplicationRealm#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tura.application.ApplicationRealm#getName()
	 * @see #getApplicationRealm()
	 * @generated
	 */
	EAttribute getApplicationRealm_Name();

	/**
	 * Returns the meta object for the containment reference '{@link tura.application.ApplicationRealm#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Roles</em>'.
	 * @see tura.application.ApplicationRealm#getRoles()
	 * @see #getApplicationRealm()
	 * @generated
	 */
	EReference getApplicationRealm_Roles();

	/**
	 * Returns the meta object for class '{@link tura.application.ApplicationStyleLibraries <em>Style Libraries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Style Libraries</em>'.
	 * @see tura.application.ApplicationStyleLibraries
	 * @generated
	 */
	EClass getApplicationStyleLibraries();

	/**
	 * Returns the meta object for the attribute '{@link tura.application.ApplicationStyleLibraries#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see tura.application.ApplicationStyleLibraries#getUid()
	 * @see #getApplicationStyleLibraries()
	 * @generated
	 */
	EAttribute getApplicationStyleLibraries_Uid();

	/**
	 * Returns the meta object for the attribute '{@link tura.application.ApplicationStyleLibraries#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tura.application.ApplicationStyleLibraries#getName()
	 * @see #getApplicationStyleLibraries()
	 * @generated
	 */
	EAttribute getApplicationStyleLibraries_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link tura.application.ApplicationStyleLibraries#getStyleLibraries <em>Style Libraries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Style Libraries</em>'.
	 * @see tura.application.ApplicationStyleLibraries#getStyleLibraries()
	 * @see #getApplicationStyleLibraries()
	 * @generated
	 */
	EReference getApplicationStyleLibraries_StyleLibraries();

	/**
	 * Returns the meta object for class '{@link tura.application.ApplicationStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Style</em>'.
	 * @see tura.application.ApplicationStyle
	 * @generated
	 */
	EClass getApplicationStyle();

	/**
	 * Returns the meta object for the attribute '{@link tura.application.ApplicationStyle#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see tura.application.ApplicationStyle#getUid()
	 * @see #getApplicationStyle()
	 * @generated
	 */
	EAttribute getApplicationStyle_Uid();

	/**
	 * Returns the meta object for the attribute '{@link tura.application.ApplicationStyle#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tura.application.ApplicationStyle#getName()
	 * @see #getApplicationStyle()
	 * @generated
	 */
	EAttribute getApplicationStyle_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link tura.application.ApplicationStyle#getStylesPackage <em>Styles Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Styles Package</em>'.
	 * @see tura.application.ApplicationStyle#getStylesPackage()
	 * @see #getApplicationStyle()
	 * @generated
	 */
	EReference getApplicationStyle_StylesPackage();

	/**
	 * Returns the meta object for class '{@link tura.application.ApplicationUILayer <em>UI Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI Layer</em>'.
	 * @see tura.application.ApplicationUILayer
	 * @generated
	 */
	EClass getApplicationUILayer();

	/**
	 * Returns the meta object for the attribute '{@link tura.application.ApplicationUILayer#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see tura.application.ApplicationUILayer#getUid()
	 * @see #getApplicationUILayer()
	 * @generated
	 */
	EAttribute getApplicationUILayer_Uid();

	/**
	 * Returns the meta object for the attribute '{@link tura.application.ApplicationUILayer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tura.application.ApplicationUILayer#getName()
	 * @see #getApplicationUILayer()
	 * @generated
	 */
	EAttribute getApplicationUILayer_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link tura.application.ApplicationUILayer#getApplicationUIPackages <em>Application UI Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Application UI Packages</em>'.
	 * @see tura.application.ApplicationUILayer#getApplicationUIPackages()
	 * @see #getApplicationUILayer()
	 * @generated
	 */
	EReference getApplicationUILayer_ApplicationUIPackages();

	/**
	 * Returns the meta object for class '{@link tura.application.ApplicationUIPackage <em>UI Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI Package</em>'.
	 * @see tura.application.ApplicationUIPackage
	 * @generated
	 */
	EClass getApplicationUIPackage();

	/**
	 * Returns the meta object for the attribute '{@link tura.application.ApplicationUIPackage#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see tura.application.ApplicationUIPackage#getUid()
	 * @see #getApplicationUIPackage()
	 * @generated
	 */
	EAttribute getApplicationUIPackage_Uid();

	/**
	 * Returns the meta object for the attribute '{@link tura.application.ApplicationUIPackage#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tura.application.ApplicationUIPackage#getName()
	 * @see #getApplicationUIPackage()
	 * @generated
	 */
	EAttribute getApplicationUIPackage_Name();

	/**
	 * Returns the meta object for the containment reference '{@link tura.application.ApplicationUIPackage#getUipackage <em>Uipackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Uipackage</em>'.
	 * @see tura.application.ApplicationUIPackage#getUipackage()
	 * @see #getApplicationUIPackage()
	 * @generated
	 */
	EReference getApplicationUIPackage_Uipackage();

	/**
	 * Returns the meta object for class '{@link tura.application.ApplicationRecipes <em>Recipes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recipes</em>'.
	 * @see tura.application.ApplicationRecipes
	 * @generated
	 */
	EClass getApplicationRecipes();

	/**
	 * Returns the meta object for the attribute '{@link tura.application.ApplicationRecipes#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see tura.application.ApplicationRecipes#getUid()
	 * @see #getApplicationRecipes()
	 * @generated
	 */
	EAttribute getApplicationRecipes_Uid();

	/**
	 * Returns the meta object for the attribute '{@link tura.application.ApplicationRecipes#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tura.application.ApplicationRecipes#getName()
	 * @see #getApplicationRecipes()
	 * @generated
	 */
	EAttribute getApplicationRecipes_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link tura.application.ApplicationRecipes#getRecipes <em>Recipes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Recipes</em>'.
	 * @see tura.application.ApplicationRecipes#getRecipes()
	 * @see #getApplicationRecipes()
	 * @generated
	 */
	EReference getApplicationRecipes_Recipes();

	/**
	 * Returns the meta object for class '{@link tura.application.ApplicationRecipe <em>Recipe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recipe</em>'.
	 * @see tura.application.ApplicationRecipe
	 * @generated
	 */
	EClass getApplicationRecipe();

	/**
	 * Returns the meta object for the attribute '{@link tura.application.ApplicationRecipe#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see tura.application.ApplicationRecipe#getUid()
	 * @see #getApplicationRecipe()
	 * @generated
	 */
	EAttribute getApplicationRecipe_Uid();

	/**
	 * Returns the meta object for the attribute '{@link tura.application.ApplicationRecipe#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tura.application.ApplicationRecipe#getName()
	 * @see #getApplicationRecipe()
	 * @generated
	 */
	EAttribute getApplicationRecipe_Name();

	/**
	 * Returns the meta object for the containment reference '{@link tura.application.ApplicationRecipe#getRecipes <em>Recipes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Recipes</em>'.
	 * @see tura.application.ApplicationRecipe#getRecipes()
	 * @see #getApplicationRecipe()
	 * @generated
	 */
	EReference getApplicationRecipe_Recipes();

	/**
	 * Returns the meta object for class '{@link tura.application.ApplicationMappers <em>Mappers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mappers</em>'.
	 * @see tura.application.ApplicationMappers
	 * @generated
	 */
	EClass getApplicationMappers();

	/**
	 * Returns the meta object for the attribute '{@link tura.application.ApplicationMappers#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see tura.application.ApplicationMappers#getUid()
	 * @see #getApplicationMappers()
	 * @generated
	 */
	EAttribute getApplicationMappers_Uid();

	/**
	 * Returns the meta object for the attribute '{@link tura.application.ApplicationMappers#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tura.application.ApplicationMappers#getName()
	 * @see #getApplicationMappers()
	 * @generated
	 */
	EAttribute getApplicationMappers_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link tura.application.ApplicationMappers#getMappers <em>Mappers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mappers</em>'.
	 * @see tura.application.ApplicationMappers#getMappers()
	 * @see #getApplicationMappers()
	 * @generated
	 */
	EReference getApplicationMappers_Mappers();

	/**
	 * Returns the meta object for class '{@link tura.application.ApplicationMapper <em>Mapper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapper</em>'.
	 * @see tura.application.ApplicationMapper
	 * @generated
	 */
	EClass getApplicationMapper();

	/**
	 * Returns the meta object for the attribute '{@link tura.application.ApplicationMapper#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see tura.application.ApplicationMapper#getUid()
	 * @see #getApplicationMapper()
	 * @generated
	 */
	EAttribute getApplicationMapper_Uid();

	/**
	 * Returns the meta object for the attribute '{@link tura.application.ApplicationMapper#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tura.application.ApplicationMapper#getName()
	 * @see #getApplicationMapper()
	 * @generated
	 */
	EAttribute getApplicationMapper_Name();

	/**
	 * Returns the meta object for the reference '{@link tura.application.ApplicationMapper#getMapper <em>Mapper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mapper</em>'.
	 * @see tura.application.ApplicationMapper#getMapper()
	 * @see #getApplicationMapper()
	 * @generated
	 */
	EReference getApplicationMapper_Mapper();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ApplicationFactory getApplicationFactory();

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
		 * The meta object literal for the '{@link tura.application.impl.ApplicationGroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tura.application.impl.ApplicationGroupImpl
		 * @see tura.application.impl.ApplicationPackageImpl#getApplicationGroup()
		 * @generated
		 */
		EClass APPLICATION_GROUP = eINSTANCE.getApplicationGroup();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_GROUP__UID = eINSTANCE.getApplicationGroup_Uid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_GROUP__NAME = eINSTANCE.getApplicationGroup_Name();

		/**
		 * The meta object literal for the '<em><b>Applications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_GROUP__APPLICATIONS = eINSTANCE.getApplicationGroup_Applications();

		/**
		 * The meta object literal for the '{@link tura.application.impl.ApplicationImpl <em>Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tura.application.impl.ApplicationImpl
		 * @see tura.application.impl.ApplicationPackageImpl#getApplication()
		 * @generated
		 */
		EClass APPLICATION = eINSTANCE.getApplication();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__UID = eINSTANCE.getApplication_Uid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__NAME = eINSTANCE.getApplication_Name();

		/**
		 * The meta object literal for the '<em><b>Application Recipes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__APPLICATION_RECIPES = eINSTANCE.getApplication_ApplicationRecipes();

		/**
		 * The meta object literal for the '<em><b>Application Mappers</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__APPLICATION_MAPPERS = eINSTANCE.getApplication_ApplicationMappers();

		/**
		 * The meta object literal for the '<em><b>Application UI Layer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__APPLICATION_UI_LAYER = eINSTANCE.getApplication_ApplicationUILayer();

		/**
		 * The meta object literal for the '<em><b>Application Infrastructure Layer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__APPLICATION_INFRASTRUCTURE_LAYER = eINSTANCE.getApplication_ApplicationInfrastructureLayer();

		/**
		 * The meta object literal for the '<em><b>Application Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__APPLICATION_STYLE = eINSTANCE.getApplication_ApplicationStyle();

		/**
		 * The meta object literal for the '<em><b>Application Role</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__APPLICATION_ROLE = eINSTANCE.getApplication_ApplicationRole();

		/**
		 * The meta object literal for the '<em><b>Application Messages</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__APPLICATION_MESSAGES = eINSTANCE.getApplication_ApplicationMessages();

		/**
		 * The meta object literal for the '{@link tura.application.impl.ApplicationInfrastructureLayersImpl <em>Infrastructure Layers</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tura.application.impl.ApplicationInfrastructureLayersImpl
		 * @see tura.application.impl.ApplicationPackageImpl#getApplicationInfrastructureLayers()
		 * @generated
		 */
		EClass APPLICATION_INFRASTRUCTURE_LAYERS = eINSTANCE.getApplicationInfrastructureLayers();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_INFRASTRUCTURE_LAYERS__UID = eINSTANCE.getApplicationInfrastructureLayers_Uid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_INFRASTRUCTURE_LAYERS__NAME = eINSTANCE.getApplicationInfrastructureLayers_Name();

		/**
		 * The meta object literal for the '<em><b>Infarastructure Layers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_INFRASTRUCTURE_LAYERS__INFARASTRUCTURE_LAYERS = eINSTANCE.getApplicationInfrastructureLayers_InfarastructureLayers();

		/**
		 * The meta object literal for the '{@link tura.application.impl.ApplicationInfrastructureLayerImpl <em>Infrastructure Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tura.application.impl.ApplicationInfrastructureLayerImpl
		 * @see tura.application.impl.ApplicationPackageImpl#getApplicationInfrastructureLayer()
		 * @generated
		 */
		EClass APPLICATION_INFRASTRUCTURE_LAYER = eINSTANCE.getApplicationInfrastructureLayer();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_INFRASTRUCTURE_LAYER__UID = eINSTANCE.getApplicationInfrastructureLayer_Uid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_INFRASTRUCTURE_LAYER__NAME = eINSTANCE.getApplicationInfrastructureLayer_Name();

		/**
		 * The meta object literal for the '<em><b>Infarastructure</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_INFRASTRUCTURE_LAYER__INFARASTRUCTURE = eINSTANCE.getApplicationInfrastructureLayer_Infarastructure();

		/**
		 * The meta object literal for the '{@link tura.application.impl.ApplicationMessageLibrariesImpl <em>Message Libraries</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tura.application.impl.ApplicationMessageLibrariesImpl
		 * @see tura.application.impl.ApplicationPackageImpl#getApplicationMessageLibraries()
		 * @generated
		 */
		EClass APPLICATION_MESSAGE_LIBRARIES = eINSTANCE.getApplicationMessageLibraries();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_MESSAGE_LIBRARIES__UID = eINSTANCE.getApplicationMessageLibraries_Uid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_MESSAGE_LIBRARIES__NAME = eINSTANCE.getApplicationMessageLibraries_Name();

		/**
		 * The meta object literal for the '<em><b>Message Libraries</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_MESSAGE_LIBRARIES__MESSAGE_LIBRARIES = eINSTANCE.getApplicationMessageLibraries_MessageLibraries();

		/**
		 * The meta object literal for the '<em><b>Application Languages</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_MESSAGE_LIBRARIES__APPLICATION_LANGUAGES = eINSTANCE.getApplicationMessageLibraries_ApplicationLanguages();

		/**
		 * The meta object literal for the '{@link tura.application.impl.ApplicationLanguagesImpl <em>Languages</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tura.application.impl.ApplicationLanguagesImpl
		 * @see tura.application.impl.ApplicationPackageImpl#getApplicationLanguages()
		 * @generated
		 */
		EClass APPLICATION_LANGUAGES = eINSTANCE.getApplicationLanguages();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_LANGUAGES__UID = eINSTANCE.getApplicationLanguages_Uid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_LANGUAGES__NAME = eINSTANCE.getApplicationLanguages_Name();

		/**
		 * The meta object literal for the '<em><b>Languages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_LANGUAGES__LANGUAGES = eINSTANCE.getApplicationLanguages_Languages();

		/**
		 * The meta object literal for the '{@link tura.application.impl.ApplicationMessageLibraryImpl <em>Message Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tura.application.impl.ApplicationMessageLibraryImpl
		 * @see tura.application.impl.ApplicationPackageImpl#getApplicationMessageLibrary()
		 * @generated
		 */
		EClass APPLICATION_MESSAGE_LIBRARY = eINSTANCE.getApplicationMessageLibrary();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_MESSAGE_LIBRARY__UID = eINSTANCE.getApplicationMessageLibrary_Uid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_MESSAGE_LIBRARY__NAME = eINSTANCE.getApplicationMessageLibrary_Name();

		/**
		 * The meta object literal for the '<em><b>Libraries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_MESSAGE_LIBRARY__LIBRARIES = eINSTANCE.getApplicationMessageLibrary_Libraries();

		/**
		 * The meta object literal for the '{@link tura.application.impl.ApplicationRealmsImpl <em>Realms</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tura.application.impl.ApplicationRealmsImpl
		 * @see tura.application.impl.ApplicationPackageImpl#getApplicationRealms()
		 * @generated
		 */
		EClass APPLICATION_REALMS = eINSTANCE.getApplicationRealms();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_REALMS__UID = eINSTANCE.getApplicationRealms_Uid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_REALMS__NAME = eINSTANCE.getApplicationRealms_Name();

		/**
		 * The meta object literal for the '<em><b>Realms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_REALMS__REALMS = eINSTANCE.getApplicationRealms_Realms();

		/**
		 * The meta object literal for the '{@link tura.application.impl.ApplicationRealmImpl <em>Realm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tura.application.impl.ApplicationRealmImpl
		 * @see tura.application.impl.ApplicationPackageImpl#getApplicationRealm()
		 * @generated
		 */
		EClass APPLICATION_REALM = eINSTANCE.getApplicationRealm();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_REALM__UID = eINSTANCE.getApplicationRealm_Uid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_REALM__NAME = eINSTANCE.getApplicationRealm_Name();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_REALM__ROLES = eINSTANCE.getApplicationRealm_Roles();

		/**
		 * The meta object literal for the '{@link tura.application.impl.ApplicationStyleLibrariesImpl <em>Style Libraries</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tura.application.impl.ApplicationStyleLibrariesImpl
		 * @see tura.application.impl.ApplicationPackageImpl#getApplicationStyleLibraries()
		 * @generated
		 */
		EClass APPLICATION_STYLE_LIBRARIES = eINSTANCE.getApplicationStyleLibraries();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_STYLE_LIBRARIES__UID = eINSTANCE.getApplicationStyleLibraries_Uid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_STYLE_LIBRARIES__NAME = eINSTANCE.getApplicationStyleLibraries_Name();

		/**
		 * The meta object literal for the '<em><b>Style Libraries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_STYLE_LIBRARIES__STYLE_LIBRARIES = eINSTANCE.getApplicationStyleLibraries_StyleLibraries();

		/**
		 * The meta object literal for the '{@link tura.application.impl.ApplicationStyleImpl <em>Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tura.application.impl.ApplicationStyleImpl
		 * @see tura.application.impl.ApplicationPackageImpl#getApplicationStyle()
		 * @generated
		 */
		EClass APPLICATION_STYLE = eINSTANCE.getApplicationStyle();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_STYLE__UID = eINSTANCE.getApplicationStyle_Uid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_STYLE__NAME = eINSTANCE.getApplicationStyle_Name();

		/**
		 * The meta object literal for the '<em><b>Styles Package</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_STYLE__STYLES_PACKAGE = eINSTANCE.getApplicationStyle_StylesPackage();

		/**
		 * The meta object literal for the '{@link tura.application.impl.ApplicationUILayerImpl <em>UI Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tura.application.impl.ApplicationUILayerImpl
		 * @see tura.application.impl.ApplicationPackageImpl#getApplicationUILayer()
		 * @generated
		 */
		EClass APPLICATION_UI_LAYER = eINSTANCE.getApplicationUILayer();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_UI_LAYER__UID = eINSTANCE.getApplicationUILayer_Uid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_UI_LAYER__NAME = eINSTANCE.getApplicationUILayer_Name();

		/**
		 * The meta object literal for the '<em><b>Application UI Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_UI_LAYER__APPLICATION_UI_PACKAGES = eINSTANCE.getApplicationUILayer_ApplicationUIPackages();

		/**
		 * The meta object literal for the '{@link tura.application.impl.ApplicationUIPackageImpl <em>UI Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tura.application.impl.ApplicationUIPackageImpl
		 * @see tura.application.impl.ApplicationPackageImpl#getApplicationUIPackage()
		 * @generated
		 */
		EClass APPLICATION_UI_PACKAGE = eINSTANCE.getApplicationUIPackage();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_UI_PACKAGE__UID = eINSTANCE.getApplicationUIPackage_Uid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_UI_PACKAGE__NAME = eINSTANCE.getApplicationUIPackage_Name();

		/**
		 * The meta object literal for the '<em><b>Uipackage</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_UI_PACKAGE__UIPACKAGE = eINSTANCE.getApplicationUIPackage_Uipackage();

		/**
		 * The meta object literal for the '{@link tura.application.impl.ApplicationRecipesImpl <em>Recipes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tura.application.impl.ApplicationRecipesImpl
		 * @see tura.application.impl.ApplicationPackageImpl#getApplicationRecipes()
		 * @generated
		 */
		EClass APPLICATION_RECIPES = eINSTANCE.getApplicationRecipes();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_RECIPES__UID = eINSTANCE.getApplicationRecipes_Uid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_RECIPES__NAME = eINSTANCE.getApplicationRecipes_Name();

		/**
		 * The meta object literal for the '<em><b>Recipes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_RECIPES__RECIPES = eINSTANCE.getApplicationRecipes_Recipes();

		/**
		 * The meta object literal for the '{@link tura.application.impl.ApplicationRecipeImpl <em>Recipe</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tura.application.impl.ApplicationRecipeImpl
		 * @see tura.application.impl.ApplicationPackageImpl#getApplicationRecipe()
		 * @generated
		 */
		EClass APPLICATION_RECIPE = eINSTANCE.getApplicationRecipe();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_RECIPE__UID = eINSTANCE.getApplicationRecipe_Uid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_RECIPE__NAME = eINSTANCE.getApplicationRecipe_Name();

		/**
		 * The meta object literal for the '<em><b>Recipes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_RECIPE__RECIPES = eINSTANCE.getApplicationRecipe_Recipes();

		/**
		 * The meta object literal for the '{@link tura.application.impl.ApplicationMappersImpl <em>Mappers</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tura.application.impl.ApplicationMappersImpl
		 * @see tura.application.impl.ApplicationPackageImpl#getApplicationMappers()
		 * @generated
		 */
		EClass APPLICATION_MAPPERS = eINSTANCE.getApplicationMappers();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_MAPPERS__UID = eINSTANCE.getApplicationMappers_Uid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_MAPPERS__NAME = eINSTANCE.getApplicationMappers_Name();

		/**
		 * The meta object literal for the '<em><b>Mappers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_MAPPERS__MAPPERS = eINSTANCE.getApplicationMappers_Mappers();

		/**
		 * The meta object literal for the '{@link tura.application.impl.ApplicationMapperImpl <em>Mapper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tura.application.impl.ApplicationMapperImpl
		 * @see tura.application.impl.ApplicationPackageImpl#getApplicationMapper()
		 * @generated
		 */
		EClass APPLICATION_MAPPER = eINSTANCE.getApplicationMapper();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_MAPPER__UID = eINSTANCE.getApplicationMapper_Uid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_MAPPER__NAME = eINSTANCE.getApplicationMapper_Name();

		/**
		 * The meta object literal for the '<em><b>Mapper</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_MAPPER__MAPPER = eINSTANCE.getApplicationMapper_Mapper();

	}

} //ApplicationPackage
