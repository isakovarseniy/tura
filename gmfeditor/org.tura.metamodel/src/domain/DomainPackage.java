/**
 */
package domain;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see domain.DomainFactory
 * @model kind="package"
 * @generated
 */
public interface DomainPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "domain";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://tura.org/2013/v1/domain";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "tura.domain";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DomainPackage eINSTANCE = domain.impl.DomainPackageImpl.init();

  /**
   * The meta object id for the '{@link domain.impl.DomainImpl <em>Domain</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.DomainImpl
   * @see domain.impl.DomainPackageImpl#getDomain()
   * @generated
   */
  int DOMAIN = 0;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN__UID = 0;

  /**
   * The feature id for the '<em><b>Domain Artifacts</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN__DOMAIN_ARTIFACTS = 1;

  /**
   * The feature id for the '<em><b>Domain Types</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN__DOMAIN_TYPES = 2;

  /**
   * The feature id for the '<em><b>Domain Applications</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN__DOMAIN_APPLICATIONS = 3;

  /**
   * The number of structural features of the '<em>Domain</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link domain.impl.DomainArtifactsImpl <em>Artifacts</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.DomainArtifactsImpl
   * @see domain.impl.DomainPackageImpl#getDomainArtifacts()
   * @generated
   */
  int DOMAIN_ARTIFACTS = 1;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_ARTIFACTS__UID = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_ARTIFACTS__NAME = 1;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_ARTIFACTS__PARENT = 2;

  /**
   * The feature id for the '<em><b>Domain Artifact</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_ARTIFACTS__DOMAIN_ARTIFACT = 3;

  /**
   * The number of structural features of the '<em>Artifacts</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_ARTIFACTS_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link domain.impl.DomainTypesImpl <em>Types</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.DomainTypesImpl
   * @see domain.impl.DomainPackageImpl#getDomainTypes()
   * @generated
   */
  int DOMAIN_TYPES = 2;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_TYPES__UID = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_TYPES__NAME = 1;

  /**
   * The feature id for the '<em><b>Typesrepository</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_TYPES__TYPESREPOSITORY = 2;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_TYPES__PARENT = 3;

  /**
   * The number of structural features of the '<em>Types</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_TYPES_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link domain.impl.DomainApplicationsImpl <em>Applications</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.DomainApplicationsImpl
   * @see domain.impl.DomainPackageImpl#getDomainApplications()
   * @generated
   */
  int DOMAIN_APPLICATIONS = 3;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_APPLICATIONS__UID = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_APPLICATIONS__NAME = 1;

  /**
   * The feature id for the '<em><b>Applications</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_APPLICATIONS__APPLICATIONS = 2;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_APPLICATIONS__PARENT = 3;

  /**
   * The number of structural features of the '<em>Applications</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_APPLICATIONS_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link domain.impl.DomainApplicationImpl <em>Application</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.DomainApplicationImpl
   * @see domain.impl.DomainPackageImpl#getDomainApplication()
   * @generated
   */
  int DOMAIN_APPLICATION = 4;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_APPLICATION__UID = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_APPLICATION__NAME = 1;

  /**
   * The feature id for the '<em><b>Application</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_APPLICATION__APPLICATION = 2;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_APPLICATION__PARENT = 3;

  /**
   * The number of structural features of the '<em>Application</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_APPLICATION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link domain.impl.DomainArtifactImpl <em>Artifact</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.DomainArtifactImpl
   * @see domain.impl.DomainPackageImpl#getDomainArtifact()
   * @generated
   */
  int DOMAIN_ARTIFACT = 5;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_ARTIFACT__UID = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_ARTIFACT__NAME = 1;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_ARTIFACT__PARENT = 2;

  /**
   * The feature id for the '<em><b>Artifact</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_ARTIFACT__ARTIFACT = 3;

  /**
   * The number of structural features of the '<em>Artifact</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_ARTIFACT_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link domain.impl.ORMEntityImpl <em>ORM Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.ORMEntityImpl
   * @see domain.impl.DomainPackageImpl#getORMEntity()
   * @generated
   */
  int ORM_ENTITY = 6;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORM_ENTITY__UID = DOMAIN_ARTIFACT__UID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORM_ENTITY__NAME = DOMAIN_ARTIFACT__NAME;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORM_ENTITY__PARENT = DOMAIN_ARTIFACT__PARENT;

  /**
   * The feature id for the '<em><b>Artifact</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORM_ENTITY__ARTIFACT = DOMAIN_ARTIFACT__ARTIFACT;

  /**
   * The number of structural features of the '<em>ORM Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORM_ENTITY_FEATURE_COUNT = DOMAIN_ARTIFACT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link domain.impl.JPAServiceImpl <em>JPA Service</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.JPAServiceImpl
   * @see domain.impl.DomainPackageImpl#getJPAService()
   * @generated
   */
  int JPA_SERVICE = 7;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JPA_SERVICE__UID = DOMAIN_ARTIFACT__UID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JPA_SERVICE__NAME = DOMAIN_ARTIFACT__NAME;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JPA_SERVICE__PARENT = DOMAIN_ARTIFACT__PARENT;

  /**
   * The feature id for the '<em><b>Artifact</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JPA_SERVICE__ARTIFACT = DOMAIN_ARTIFACT__ARTIFACT;

  /**
   * The number of structural features of the '<em>JPA Service</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JPA_SERVICE_FEATURE_COUNT = DOMAIN_ARTIFACT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link domain.impl.EJBServiceImpl <em>EJB Service</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.EJBServiceImpl
   * @see domain.impl.DomainPackageImpl#getEJBService()
   * @generated
   */
  int EJB_SERVICE = 8;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EJB_SERVICE__UID = DOMAIN_ARTIFACT__UID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EJB_SERVICE__NAME = DOMAIN_ARTIFACT__NAME;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EJB_SERVICE__PARENT = DOMAIN_ARTIFACT__PARENT;

  /**
   * The feature id for the '<em><b>Artifact</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EJB_SERVICE__ARTIFACT = DOMAIN_ARTIFACT__ARTIFACT;

  /**
   * The number of structural features of the '<em>EJB Service</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EJB_SERVICE_FEATURE_COUNT = DOMAIN_ARTIFACT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link domain.impl.ArtifactsImpl <em>Artifacts</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.ArtifactsImpl
   * @see domain.impl.DomainPackageImpl#getArtifacts()
   * @generated
   */
  int ARTIFACTS = 9;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTIFACTS__UID = 0;

  /**
   * The feature id for the '<em><b>Artifacts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTIFACTS__ARTIFACTS = 1;

  /**
   * The feature id for the '<em><b>Parent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTIFACTS__PARENT = 2;

  /**
   * The number of structural features of the '<em>Artifacts</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTIFACTS_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link domain.impl.ArtifactImpl <em>Artifact</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.ArtifactImpl
   * @see domain.impl.DomainPackageImpl#getArtifact()
   * @generated
   */
  int ARTIFACT = 10;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTIFACT__UID = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTIFACT__NAME = 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTIFACT__DESCRIPTION = 2;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTIFACT__PARENT = 3;

  /**
   * The feature id for the '<em><b>Config Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTIFACT__CONFIG_VARIABLES = 4;

  /**
   * The feature id for the '<em><b>Model Query</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTIFACT__MODEL_QUERY = 5;

  /**
   * The feature id for the '<em><b>Specifiers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTIFACT__SPECIFIERS = 6;

  /**
   * The feature id for the '<em><b>Template</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTIFACT__TEMPLATE = 7;

  /**
   * The number of structural features of the '<em>Artifact</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTIFACT_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link domain.impl.ConfigVariableImpl <em>Config Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.ConfigVariableImpl
   * @see domain.impl.DomainPackageImpl#getConfigVariable()
   * @generated
   */
  int CONFIG_VARIABLE = 11;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIG_VARIABLE__UID = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIG_VARIABLE__NAME = 1;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIG_VARIABLE__PARENT = 2;

  /**
   * The number of structural features of the '<em>Config Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIG_VARIABLE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link domain.impl.VariableImpl <em>Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.VariableImpl
   * @see domain.impl.DomainPackageImpl#getVariable()
   * @generated
   */
  int VARIABLE = 12;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__UID = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__NAME = 1;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__PARENT = 2;

  /**
   * The number of structural features of the '<em>Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link domain.impl.SpecifierImpl <em>Specifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.SpecifierImpl
   * @see domain.impl.DomainPackageImpl#getSpecifier()
   * @generated
   */
  int SPECIFIER = 13;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIFIER__UID = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIFIER__NAME = 1;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIFIER__PARENT = 2;

  /**
   * The feature id for the '<em><b>Options</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIFIER__OPTIONS = 3;

  /**
   * The number of structural features of the '<em>Specifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIFIER_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link domain.impl.OptionImpl <em>Option</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.OptionImpl
   * @see domain.impl.DomainPackageImpl#getOption()
   * @generated
   */
  int OPTION = 14;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTION__UID = 0;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTION__PARENT = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTION__VALUE = 2;

  /**
   * The number of structural features of the '<em>Option</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link domain.impl.ApplicationImpl <em>Application</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.ApplicationImpl
   * @see domain.impl.DomainPackageImpl#getApplication()
   * @generated
   */
  int APPLICATION = 15;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__UID = 0;

  /**
   * The feature id for the '<em><b>Application Recipes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__APPLICATION_RECIPES = 1;

  /**
   * The feature id for the '<em><b>Application Mappers</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__APPLICATION_MAPPERS = 2;

  /**
   * The feature id for the '<em><b>Parent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__PARENT = 3;

  /**
   * The number of structural features of the '<em>Application</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link domain.impl.ApplicationRecipesImpl <em>Application Recipes</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.ApplicationRecipesImpl
   * @see domain.impl.DomainPackageImpl#getApplicationRecipes()
   * @generated
   */
  int APPLICATION_RECIPES = 16;

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
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_RECIPES__PARENT = 2;

  /**
   * The feature id for the '<em><b>Recipes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_RECIPES__RECIPES = 3;

  /**
   * The number of structural features of the '<em>Application Recipes</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_RECIPES_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link domain.impl.ApplicationRecipeImpl <em>Application Recipe</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.ApplicationRecipeImpl
   * @see domain.impl.DomainPackageImpl#getApplicationRecipe()
   * @generated
   */
  int APPLICATION_RECIPE = 17;

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
   * The feature id for the '<em><b>Recipes</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_RECIPE__RECIPES = 2;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_RECIPE__PARENT = 3;

  /**
   * The number of structural features of the '<em>Application Recipe</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_RECIPE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link domain.impl.ApplicationMappersImpl <em>Application Mappers</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.ApplicationMappersImpl
   * @see domain.impl.DomainPackageImpl#getApplicationMappers()
   * @generated
   */
  int APPLICATION_MAPPERS = 18;

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
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_MAPPERS__PARENT = 2;

  /**
   * The feature id for the '<em><b>Mappers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_MAPPERS__MAPPERS = 3;

  /**
   * The number of structural features of the '<em>Application Mappers</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_MAPPERS_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link domain.impl.ApplicationMapperImpl <em>Application Mapper</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.ApplicationMapperImpl
   * @see domain.impl.DomainPackageImpl#getApplicationMapper()
   * @generated
   */
  int APPLICATION_MAPPER = 19;

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
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_MAPPER__PARENT = 3;

  /**
   * The number of structural features of the '<em>Application Mapper</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_MAPPER_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link domain.impl.BusinessObjectsImpl <em>Business Objects</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.BusinessObjectsImpl
   * @see domain.impl.DomainPackageImpl#getBusinessObjects()
   * @generated
   */
  int BUSINESS_OBJECTS = 20;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUSINESS_OBJECTS__UID = 0;

  /**
   * The feature id for the '<em><b>Business Object</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUSINESS_OBJECTS__BUSINESS_OBJECT = 1;

  /**
   * The feature id for the '<em><b>Parent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUSINESS_OBJECTS__PARENT = 2;

  /**
   * The number of structural features of the '<em>Business Objects</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUSINESS_OBJECTS_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link domain.impl.BusinessObjectImpl <em>Business Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.BusinessObjectImpl
   * @see domain.impl.DomainPackageImpl#getBusinessObject()
   * @generated
   */
  int BUSINESS_OBJECT = 21;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUSINESS_OBJECT__UID = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUSINESS_OBJECT__NAME = 1;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUSINESS_OBJECT__PARENT = 2;

  /**
   * The feature id for the '<em><b>Create Methods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUSINESS_OBJECT__CREATE_METHODS = 3;

  /**
   * The feature id for the '<em><b>Insert Methods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUSINESS_OBJECT__INSERT_METHODS = 4;

  /**
   * The feature id for the '<em><b>Update Methods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUSINESS_OBJECT__UPDATE_METHODS = 5;

  /**
   * The feature id for the '<em><b>Remove Methods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUSINESS_OBJECT__REMOVE_METHODS = 6;

  /**
   * The feature id for the '<em><b>Search Methods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUSINESS_OBJECT__SEARCH_METHODS = 7;

  /**
   * The feature id for the '<em><b>Others Methods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUSINESS_OBJECT__OTHERS_METHODS = 8;

  /**
   * The number of structural features of the '<em>Business Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUSINESS_OBJECT_FEATURE_COUNT = 9;

  /**
   * The meta object id for the '{@link domain.impl.TypePointerImpl <em>Type Pointer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.TypePointerImpl
   * @see domain.impl.DomainPackageImpl#getTypePointer()
   * @generated
   */
  int TYPE_POINTER = 45;

  /**
   * The feature id for the '<em><b>Package Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_POINTER__PACKAGE_REF = 0;

  /**
   * The feature id for the '<em><b>Type Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_POINTER__TYPE_REF = 1;

  /**
   * The feature id for the '<em><b>Fake Package Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_POINTER__FAKE_PACKAGE_NAME = 2;

  /**
   * The feature id for the '<em><b>Fake Type Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_POINTER__FAKE_TYPE_NAME = 3;

  /**
   * The number of structural features of the '<em>Type Pointer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_POINTER_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link domain.impl.BusinessMethodImpl <em>Business Method</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.BusinessMethodImpl
   * @see domain.impl.DomainPackageImpl#getBusinessMethod()
   * @generated
   */
  int BUSINESS_METHOD = 22;

  /**
   * The feature id for the '<em><b>Package Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUSINESS_METHOD__PACKAGE_REF = TYPE_POINTER__PACKAGE_REF;

  /**
   * The feature id for the '<em><b>Type Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUSINESS_METHOD__TYPE_REF = TYPE_POINTER__TYPE_REF;

  /**
   * The feature id for the '<em><b>Fake Package Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUSINESS_METHOD__FAKE_PACKAGE_NAME = TYPE_POINTER__FAKE_PACKAGE_NAME;

  /**
   * The feature id for the '<em><b>Fake Type Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUSINESS_METHOD__FAKE_TYPE_NAME = TYPE_POINTER__FAKE_TYPE_NAME;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUSINESS_METHOD__UID = TYPE_POINTER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Method Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUSINESS_METHOD__METHOD_REF = TYPE_POINTER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Fake Method</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUSINESS_METHOD__FAKE_METHOD = TYPE_POINTER_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Business Method</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUSINESS_METHOD_FEATURE_COUNT = TYPE_POINTER_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link domain.impl.CreateMethodImpl <em>Create Method</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.CreateMethodImpl
   * @see domain.impl.DomainPackageImpl#getCreateMethod()
   * @generated
   */
  int CREATE_METHOD = 23;

  /**
   * The feature id for the '<em><b>Package Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_METHOD__PACKAGE_REF = BUSINESS_METHOD__PACKAGE_REF;

  /**
   * The feature id for the '<em><b>Type Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_METHOD__TYPE_REF = BUSINESS_METHOD__TYPE_REF;

  /**
   * The feature id for the '<em><b>Fake Package Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_METHOD__FAKE_PACKAGE_NAME = BUSINESS_METHOD__FAKE_PACKAGE_NAME;

  /**
   * The feature id for the '<em><b>Fake Type Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_METHOD__FAKE_TYPE_NAME = BUSINESS_METHOD__FAKE_TYPE_NAME;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_METHOD__UID = BUSINESS_METHOD__UID;

  /**
   * The feature id for the '<em><b>Method Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_METHOD__METHOD_REF = BUSINESS_METHOD__METHOD_REF;

  /**
   * The feature id for the '<em><b>Fake Method</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_METHOD__FAKE_METHOD = BUSINESS_METHOD__FAKE_METHOD;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_METHOD__PARENT = BUSINESS_METHOD_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Create Method</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_METHOD_FEATURE_COUNT = BUSINESS_METHOD_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link domain.impl.InsertMethodImpl <em>Insert Method</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.InsertMethodImpl
   * @see domain.impl.DomainPackageImpl#getInsertMethod()
   * @generated
   */
  int INSERT_METHOD = 24;

  /**
   * The feature id for the '<em><b>Package Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSERT_METHOD__PACKAGE_REF = BUSINESS_METHOD__PACKAGE_REF;

  /**
   * The feature id for the '<em><b>Type Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSERT_METHOD__TYPE_REF = BUSINESS_METHOD__TYPE_REF;

  /**
   * The feature id for the '<em><b>Fake Package Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSERT_METHOD__FAKE_PACKAGE_NAME = BUSINESS_METHOD__FAKE_PACKAGE_NAME;

  /**
   * The feature id for the '<em><b>Fake Type Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSERT_METHOD__FAKE_TYPE_NAME = BUSINESS_METHOD__FAKE_TYPE_NAME;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSERT_METHOD__UID = BUSINESS_METHOD__UID;

  /**
   * The feature id for the '<em><b>Method Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSERT_METHOD__METHOD_REF = BUSINESS_METHOD__METHOD_REF;

  /**
   * The feature id for the '<em><b>Fake Method</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSERT_METHOD__FAKE_METHOD = BUSINESS_METHOD__FAKE_METHOD;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSERT_METHOD__PARENT = BUSINESS_METHOD_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Insert Method</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSERT_METHOD_FEATURE_COUNT = BUSINESS_METHOD_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link domain.impl.UpdateMethodImpl <em>Update Method</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.UpdateMethodImpl
   * @see domain.impl.DomainPackageImpl#getUpdateMethod()
   * @generated
   */
  int UPDATE_METHOD = 25;

  /**
   * The feature id for the '<em><b>Package Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_METHOD__PACKAGE_REF = BUSINESS_METHOD__PACKAGE_REF;

  /**
   * The feature id for the '<em><b>Type Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_METHOD__TYPE_REF = BUSINESS_METHOD__TYPE_REF;

  /**
   * The feature id for the '<em><b>Fake Package Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_METHOD__FAKE_PACKAGE_NAME = BUSINESS_METHOD__FAKE_PACKAGE_NAME;

  /**
   * The feature id for the '<em><b>Fake Type Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_METHOD__FAKE_TYPE_NAME = BUSINESS_METHOD__FAKE_TYPE_NAME;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_METHOD__UID = BUSINESS_METHOD__UID;

  /**
   * The feature id for the '<em><b>Method Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_METHOD__METHOD_REF = BUSINESS_METHOD__METHOD_REF;

  /**
   * The feature id for the '<em><b>Fake Method</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_METHOD__FAKE_METHOD = BUSINESS_METHOD__FAKE_METHOD;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_METHOD__PARENT = BUSINESS_METHOD_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Update Method</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_METHOD_FEATURE_COUNT = BUSINESS_METHOD_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link domain.impl.RemoveMethodImpl <em>Remove Method</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.RemoveMethodImpl
   * @see domain.impl.DomainPackageImpl#getRemoveMethod()
   * @generated
   */
  int REMOVE_METHOD = 26;

  /**
   * The feature id for the '<em><b>Package Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOVE_METHOD__PACKAGE_REF = BUSINESS_METHOD__PACKAGE_REF;

  /**
   * The feature id for the '<em><b>Type Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOVE_METHOD__TYPE_REF = BUSINESS_METHOD__TYPE_REF;

  /**
   * The feature id for the '<em><b>Fake Package Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOVE_METHOD__FAKE_PACKAGE_NAME = BUSINESS_METHOD__FAKE_PACKAGE_NAME;

  /**
   * The feature id for the '<em><b>Fake Type Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOVE_METHOD__FAKE_TYPE_NAME = BUSINESS_METHOD__FAKE_TYPE_NAME;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOVE_METHOD__UID = BUSINESS_METHOD__UID;

  /**
   * The feature id for the '<em><b>Method Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOVE_METHOD__METHOD_REF = BUSINESS_METHOD__METHOD_REF;

  /**
   * The feature id for the '<em><b>Fake Method</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOVE_METHOD__FAKE_METHOD = BUSINESS_METHOD__FAKE_METHOD;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOVE_METHOD__PARENT = BUSINESS_METHOD_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Remove Method</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOVE_METHOD_FEATURE_COUNT = BUSINESS_METHOD_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link domain.impl.SearchMethodImpl <em>Search Method</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.SearchMethodImpl
   * @see domain.impl.DomainPackageImpl#getSearchMethod()
   * @generated
   */
  int SEARCH_METHOD = 27;

  /**
   * The feature id for the '<em><b>Package Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEARCH_METHOD__PACKAGE_REF = BUSINESS_METHOD__PACKAGE_REF;

  /**
   * The feature id for the '<em><b>Type Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEARCH_METHOD__TYPE_REF = BUSINESS_METHOD__TYPE_REF;

  /**
   * The feature id for the '<em><b>Fake Package Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEARCH_METHOD__FAKE_PACKAGE_NAME = BUSINESS_METHOD__FAKE_PACKAGE_NAME;

  /**
   * The feature id for the '<em><b>Fake Type Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEARCH_METHOD__FAKE_TYPE_NAME = BUSINESS_METHOD__FAKE_TYPE_NAME;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEARCH_METHOD__UID = BUSINESS_METHOD__UID;

  /**
   * The feature id for the '<em><b>Method Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEARCH_METHOD__METHOD_REF = BUSINESS_METHOD__METHOD_REF;

  /**
   * The feature id for the '<em><b>Fake Method</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEARCH_METHOD__FAKE_METHOD = BUSINESS_METHOD__FAKE_METHOD;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEARCH_METHOD__PARENT = BUSINESS_METHOD_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Search Method</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEARCH_METHOD_FEATURE_COUNT = BUSINESS_METHOD_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link domain.impl.OtherMethodImpl <em>Other Method</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.OtherMethodImpl
   * @see domain.impl.DomainPackageImpl#getOtherMethod()
   * @generated
   */
  int OTHER_METHOD = 28;

  /**
   * The feature id for the '<em><b>Package Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OTHER_METHOD__PACKAGE_REF = BUSINESS_METHOD__PACKAGE_REF;

  /**
   * The feature id for the '<em><b>Type Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OTHER_METHOD__TYPE_REF = BUSINESS_METHOD__TYPE_REF;

  /**
   * The feature id for the '<em><b>Fake Package Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OTHER_METHOD__FAKE_PACKAGE_NAME = BUSINESS_METHOD__FAKE_PACKAGE_NAME;

  /**
   * The feature id for the '<em><b>Fake Type Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OTHER_METHOD__FAKE_TYPE_NAME = BUSINESS_METHOD__FAKE_TYPE_NAME;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OTHER_METHOD__UID = BUSINESS_METHOD__UID;

  /**
   * The feature id for the '<em><b>Method Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OTHER_METHOD__METHOD_REF = BUSINESS_METHOD__METHOD_REF;

  /**
   * The feature id for the '<em><b>Fake Method</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OTHER_METHOD__FAKE_METHOD = BUSINESS_METHOD__FAKE_METHOD;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OTHER_METHOD__PARENT = BUSINESS_METHOD_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Other Method</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OTHER_METHOD_FEATURE_COUNT = BUSINESS_METHOD_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link domain.impl.MappersImpl <em>Mappers</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.MappersImpl
   * @see domain.impl.DomainPackageImpl#getMappers()
   * @generated
   */
  int MAPPERS = 29;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPERS__UID = 0;

  /**
   * The feature id for the '<em><b>Mappers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPERS__MAPPERS = 1;

  /**
   * The feature id for the '<em><b>Parent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPERS__PARENT = 2;

  /**
   * The number of structural features of the '<em>Mappers</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPERS_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link domain.impl.MapperImpl <em>Mapper</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.MapperImpl
   * @see domain.impl.DomainPackageImpl#getMapper()
   * @generated
   */
  int MAPPER = 30;

  /**
   * The feature id for the '<em><b>Package Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPER__PACKAGE_REF = TYPE_POINTER__PACKAGE_REF;

  /**
   * The feature id for the '<em><b>Type Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPER__TYPE_REF = TYPE_POINTER__TYPE_REF;

  /**
   * The feature id for the '<em><b>Fake Package Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPER__FAKE_PACKAGE_NAME = TYPE_POINTER__FAKE_PACKAGE_NAME;

  /**
   * The feature id for the '<em><b>Fake Type Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPER__FAKE_TYPE_NAME = TYPE_POINTER__FAKE_TYPE_NAME;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPER__UID = TYPE_POINTER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPER__PARENT = TYPE_POINTER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Service Layer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPER__SERVICE_LAYER = TYPE_POINTER_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Ui Layer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPER__UI_LAYER = TYPE_POINTER_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Mapper</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPER_FEATURE_COUNT = TYPE_POINTER_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link domain.impl.JavaMapperImpl <em>Java Mapper</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.JavaMapperImpl
   * @see domain.impl.DomainPackageImpl#getJavaMapper()
   * @generated
   */
  int JAVA_MAPPER = 31;

  /**
   * The feature id for the '<em><b>Package Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_MAPPER__PACKAGE_REF = MAPPER__PACKAGE_REF;

  /**
   * The feature id for the '<em><b>Type Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_MAPPER__TYPE_REF = MAPPER__TYPE_REF;

  /**
   * The feature id for the '<em><b>Fake Package Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_MAPPER__FAKE_PACKAGE_NAME = MAPPER__FAKE_PACKAGE_NAME;

  /**
   * The feature id for the '<em><b>Fake Type Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_MAPPER__FAKE_TYPE_NAME = MAPPER__FAKE_TYPE_NAME;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_MAPPER__UID = MAPPER__UID;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_MAPPER__PARENT = MAPPER__PARENT;

  /**
   * The feature id for the '<em><b>Service Layer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_MAPPER__SERVICE_LAYER = MAPPER__SERVICE_LAYER;

  /**
   * The feature id for the '<em><b>Ui Layer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_MAPPER__UI_LAYER = MAPPER__UI_LAYER;

  /**
   * The feature id for the '<em><b>Mapped To Package Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_MAPPER__MAPPED_TO_PACKAGE_NAME = MAPPER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Mapped To Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_MAPPER__MAPPED_TO_CLASS_NAME = MAPPER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Artifact Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_MAPPER__ARTIFACT_ID = MAPPER_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Group Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_MAPPER__GROUP_ID = MAPPER_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_MAPPER__VERSION = MAPPER_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Library Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_MAPPER__LIBRARY_NAME = MAPPER_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Java Mapper</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_MAPPER_FEATURE_COUNT = MAPPER_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link domain.impl.RecipesImpl <em>Recipes</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.RecipesImpl
   * @see domain.impl.DomainPackageImpl#getRecipes()
   * @generated
   */
  int RECIPES = 32;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECIPES__UID = 0;

  /**
   * The feature id for the '<em><b>Recipe</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECIPES__RECIPE = 1;

  /**
   * The feature id for the '<em><b>Configurations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECIPES__CONFIGURATIONS = 2;

  /**
   * The feature id for the '<em><b>Infrastructures</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECIPES__INFRASTRUCTURES = 3;

  /**
   * The feature id for the '<em><b>Parent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECIPES__PARENT = 4;

  /**
   * The number of structural features of the '<em>Recipes</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECIPES_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link domain.impl.UsingMappersImpl <em>Using Mappers</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.UsingMappersImpl
   * @see domain.impl.DomainPackageImpl#getUsingMappers()
   * @generated
   */
  int USING_MAPPERS = 33;

  /**
   * The feature id for the '<em><b>Mappers</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USING_MAPPERS__MAPPERS = 0;

  /**
   * The number of structural features of the '<em>Using Mappers</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USING_MAPPERS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link domain.impl.IngredientImpl <em>Ingredient</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.IngredientImpl
   * @see domain.impl.DomainPackageImpl#getIngredient()
   * @generated
   */
  int INGREDIENT = 35;

  /**
   * The meta object id for the '{@link domain.impl.InfrastructureImpl <em>Infrastructure</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.InfrastructureImpl
   * @see domain.impl.DomainPackageImpl#getInfrastructure()
   * @generated
   */
  int INFRASTRUCTURE = 38;

  /**
   * The meta object id for the '{@link domain.impl.RecipeImpl <em>Recipe</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.RecipeImpl
   * @see domain.impl.DomainPackageImpl#getRecipe()
   * @generated
   */
  int RECIPE = 34;

  /**
   * The feature id for the '<em><b>Mappers</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECIPE__MAPPERS = USING_MAPPERS__MAPPERS;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECIPE__UID = USING_MAPPERS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECIPE__PARENT = USING_MAPPERS_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECIPE__NAME = USING_MAPPERS_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Ingredients</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECIPE__INGREDIENTS = USING_MAPPERS_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Infrastructures</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECIPE__INFRASTRUCTURES = USING_MAPPERS_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Recipe</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECIPE_FEATURE_COUNT = USING_MAPPERS_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Mappers</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INGREDIENT__MAPPERS = USING_MAPPERS__MAPPERS;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INGREDIENT__UID = USING_MAPPERS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INGREDIENT__NAME = USING_MAPPERS_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INGREDIENT__PARENT = USING_MAPPERS_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Components</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INGREDIENT__COMPONENTS = USING_MAPPERS_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Layer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INGREDIENT__LAYER = USING_MAPPERS_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Ingredient</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INGREDIENT_FEATURE_COUNT = USING_MAPPERS_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link domain.impl.ComponentImpl <em>Component</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.ComponentImpl
   * @see domain.impl.DomainPackageImpl#getComponent()
   * @generated
   */
  int COMPONENT = 36;

  /**
   * The meta object id for the '{@link domain.impl.ArtifactRefImpl <em>Artifact Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.ArtifactRefImpl
   * @see domain.impl.DomainPackageImpl#getArtifactRef()
   * @generated
   */
  int ARTIFACT_REF = 44;

  /**
   * The meta object id for the '{@link domain.impl.ModelMapperImpl <em>Model Mapper</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.ModelMapperImpl
   * @see domain.impl.DomainPackageImpl#getModelMapper()
   * @generated
   */
  int MODEL_MAPPER = 40;

  /**
   * The meta object id for the '{@link domain.impl.ConfigurationImpl <em>Configuration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.ConfigurationImpl
   * @see domain.impl.DomainPackageImpl#getConfiguration()
   * @generated
   */
  int CONFIGURATION = 39;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__UID = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__NAME = 1;

  /**
   * The feature id for the '<em><b>Components</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__COMPONENTS = 2;

  /**
   * The feature id for the '<em><b>Mappers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__MAPPERS = 3;

  /**
   * The feature id for the '<em><b>Build Script</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__BUILD_SCRIPT = 4;

  /**
   * The feature id for the '<em><b>Deploy Script</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__DEPLOY_SCRIPT = 5;

  /**
   * The number of structural features of the '<em>Component</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link domain.impl.JavaComponentImpl <em>Java Component</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.JavaComponentImpl
   * @see domain.impl.DomainPackageImpl#getJavaComponent()
   * @generated
   */
  int JAVA_COMPONENT = 37;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_COMPONENT__UID = COMPONENT__UID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_COMPONENT__NAME = COMPONENT__NAME;

  /**
   * The feature id for the '<em><b>Components</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_COMPONENT__COMPONENTS = COMPONENT__COMPONENTS;

  /**
   * The feature id for the '<em><b>Mappers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_COMPONENT__MAPPERS = COMPONENT__MAPPERS;

  /**
   * The feature id for the '<em><b>Build Script</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_COMPONENT__BUILD_SCRIPT = COMPONENT__BUILD_SCRIPT;

  /**
   * The feature id for the '<em><b>Deploy Script</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_COMPONENT__DEPLOY_SCRIPT = COMPONENT__DEPLOY_SCRIPT;

  /**
   * The feature id for the '<em><b>Artifact Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_COMPONENT__ARTIFACT_ID = COMPONENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Group Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_COMPONENT__GROUP_ID = COMPONENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_COMPONENT__VERSION = COMPONENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Base Package</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_COMPONENT__BASE_PACKAGE = COMPONENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Java Component</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_COMPONENT_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFRASTRUCTURE__UID = 0;

  /**
   * The feature id for the '<em><b>Recipe</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFRASTRUCTURE__RECIPE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFRASTRUCTURE__NAME = 2;

  /**
   * The feature id for the '<em><b>Recipe Config</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFRASTRUCTURE__RECIPE_CONFIG = 3;

  /**
   * The number of structural features of the '<em>Infrastructure</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFRASTRUCTURE_FEATURE_COUNT = 4;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIGURATION__UID = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIGURATION__NAME = 1;

  /**
   * The feature id for the '<em><b>Infrastructure</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIGURATION__INFRASTRUCTURE = 2;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIGURATION__PROPERTIES = 3;

  /**
   * The feature id for the '<em><b>Config Extension</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIGURATION__CONFIG_EXTENSION = 4;

  /**
   * The feature id for the '<em><b>Parent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIGURATION__PARENT = 5;

  /**
   * The number of structural features of the '<em>Configuration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIGURATION_FEATURE_COUNT = 6;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTIFACT_REF__UID = 0;

  /**
   * The feature id for the '<em><b>Domain Artifact Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTIFACT_REF__DOMAIN_ARTIFACT_REF = 1;

  /**
   * The feature id for the '<em><b>Artifact Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTIFACT_REF__ARTIFACT_REF = 2;

  /**
   * The number of structural features of the '<em>Artifact Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTIFACT_REF_FEATURE_COUNT = 3;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_MAPPER__UID = ARTIFACT_REF__UID;

  /**
   * The feature id for the '<em><b>Domain Artifact Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_MAPPER__DOMAIN_ARTIFACT_REF = ARTIFACT_REF__DOMAIN_ARTIFACT_REF;

  /**
   * The feature id for the '<em><b>Artifact Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_MAPPER__ARTIFACT_REF = ARTIFACT_REF__ARTIFACT_REF;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_MAPPER__NAME = ARTIFACT_REF_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_MAPPER__PARENT = ARTIFACT_REF_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Specifiers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_MAPPER__SPECIFIERS = ARTIFACT_REF_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_MAPPER__VARIABLES = ARTIFACT_REF_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Model Mapper</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_MAPPER_FEATURE_COUNT = ARTIFACT_REF_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link domain.impl.PropertyImpl <em>Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.PropertyImpl
   * @see domain.impl.DomainPackageImpl#getProperty()
   * @generated
   */
  int PROPERTY = 41;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__UID = 0;

  /**
   * The feature id for the '<em><b>Conf Var Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__CONF_VAR_REF = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__VALUE = 2;

  /**
   * The feature id for the '<em><b>Fake Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__FAKE_NAME = 3;

  /**
   * The number of structural features of the '<em>Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link domain.impl.MappingSpecifierImpl <em>Mapping Specifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.MappingSpecifierImpl
   * @see domain.impl.DomainPackageImpl#getMappingSpecifier()
   * @generated
   */
  int MAPPING_SPECIFIER = 42;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_SPECIFIER__UID = 0;

  /**
   * The feature id for the '<em><b>Specifier Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_SPECIFIER__SPECIFIER_REF = 1;

  /**
   * The feature id for the '<em><b>Value Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_SPECIFIER__VALUE_REF = 2;

  /**
   * The number of structural features of the '<em>Mapping Specifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_SPECIFIER_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link domain.impl.MappingVariableImpl <em>Mapping Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.MappingVariableImpl
   * @see domain.impl.DomainPackageImpl#getMappingVariable()
   * @generated
   */
  int MAPPING_VARIABLE = 43;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_VARIABLE__UID = 0;

  /**
   * The feature id for the '<em><b>Variable Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_VARIABLE__VARIABLE_REF = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_VARIABLE__VALUE = 2;

  /**
   * The number of structural features of the '<em>Mapping Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_VARIABLE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link domain.impl.TypeDefinitionImpl <em>Type Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.TypeDefinitionImpl
   * @see domain.impl.DomainPackageImpl#getTypeDefinition()
   * @generated
   */
  int TYPE_DEFINITION = 46;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DEFINITION__UID = 0;

  /**
   * The feature id for the '<em><b>Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DEFINITION__TYPES = 1;

  /**
   * The feature id for the '<em><b>Parent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DEFINITION__PARENT = 2;

  /**
   * The number of structural features of the '<em>Type Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DEFINITION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link domain.impl.TypeElementImpl <em>Type Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.TypeElementImpl
   * @see domain.impl.DomainPackageImpl#getTypeElement()
   * @generated
   */
  int TYPE_ELEMENT = 47;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_ELEMENT__UID = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_ELEMENT__NAME = 1;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_ELEMENT__PARENT = 2;

  /**
   * The number of structural features of the '<em>Type Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_ELEMENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link domain.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.TypeImpl
   * @see domain.impl.DomainPackageImpl#getType()
   * @generated
   */
  int TYPE = 49;

  /**
   * The meta object id for the '{@link domain.impl.TypeReferenceImpl <em>Type Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.TypeReferenceImpl
   * @see domain.impl.DomainPackageImpl#getTypeReference()
   * @generated
   */
  int TYPE_REFERENCE = 50;

  /**
   * The meta object id for the '{@link domain.impl.TypeExtensionImpl <em>Type Extension</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.TypeExtensionImpl
   * @see domain.impl.DomainPackageImpl#getTypeExtension()
   * @generated
   */
  int TYPE_EXTENSION = 51;

  /**
   * The meta object id for the '{@link domain.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.AttributeImpl
   * @see domain.impl.DomainPackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 52;

  /**
   * The meta object id for the '{@link domain.impl.OperationImpl <em>Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.OperationImpl
   * @see domain.impl.DomainPackageImpl#getOperation()
   * @generated
   */
  int OPERATION = 53;

  /**
   * The meta object id for the '{@link domain.impl.ParameterImpl <em>Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.ParameterImpl
   * @see domain.impl.DomainPackageImpl#getParameter()
   * @generated
   */
  int PARAMETER = 54;

  /**
   * The meta object id for the '{@link domain.impl.ReturnValueImpl <em>Return Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.ReturnValueImpl
   * @see domain.impl.DomainPackageImpl#getReturnValue()
   * @generated
   */
  int RETURN_VALUE = 55;

  /**
   * The meta object id for the '{@link domain.impl.EnumaratorImpl <em>Enumarator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.EnumaratorImpl
   * @see domain.impl.DomainPackageImpl#getEnumarator()
   * @generated
   */
  int ENUMARATOR = 56;

  /**
   * The meta object id for the '{@link domain.impl.EnumAttributeImpl <em>Enum Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.EnumAttributeImpl
   * @see domain.impl.DomainPackageImpl#getEnumAttribute()
   * @generated
   */
  int ENUM_ATTRIBUTE = 57;

  /**
   * The meta object id for the '{@link domain.impl.TypesRepositoryImpl <em>Types Repository</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.TypesRepositoryImpl
   * @see domain.impl.DomainPackageImpl#getTypesRepository()
   * @generated
   */
  int TYPES_REPOSITORY = 58;

  /**
   * The meta object id for the '{@link domain.impl.TypesImpl <em>Types</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.TypesImpl
   * @see domain.impl.DomainPackageImpl#getTypes()
   * @generated
   */
  int TYPES = 59;

  /**
   * The meta object id for the '{@link domain.impl.PrimitiveImpl <em>Primitive</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.PrimitiveImpl
   * @see domain.impl.DomainPackageImpl#getPrimitive()
   * @generated
   */
  int PRIMITIVE = 48;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE__UID = TYPE_ELEMENT__UID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE__NAME = TYPE_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE__PARENT = TYPE_ELEMENT__PARENT;

  /**
   * The number of structural features of the '<em>Primitive</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_FEATURE_COUNT = TYPE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__UID = TYPE_ELEMENT__UID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__NAME = TYPE_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__PARENT = TYPE_ELEMENT__PARENT;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__ATTRIBUTES = TYPE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Operations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__OPERATIONS = TYPE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Extension</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__EXTENSION = TYPE_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = TYPE_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_REFERENCE__UID = TYPE_ELEMENT__UID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_REFERENCE__NAME = TYPE_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_REFERENCE__PARENT = TYPE_ELEMENT__PARENT;

  /**
   * The feature id for the '<em><b>Package Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_REFERENCE__PACKAGE_REF = TYPE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_REFERENCE__TYPE_REF = TYPE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Fake Package Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_REFERENCE__FAKE_PACKAGE_NAME = TYPE_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Fake Type Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_REFERENCE__FAKE_TYPE_NAME = TYPE_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Type Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_REFERENCE_FEATURE_COUNT = TYPE_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_EXTENSION__UID = 0;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_EXTENSION__SOURCE = 1;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_EXTENSION__TARGET = 2;

  /**
   * The number of structural features of the '<em>Type Extension</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_EXTENSION_FEATURE_COUNT = 3;

  /**
   * The feature id for the '<em><b>Package Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__PACKAGE_REF = TYPE_POINTER__PACKAGE_REF;

  /**
   * The feature id for the '<em><b>Type Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__TYPE_REF = TYPE_POINTER__TYPE_REF;

  /**
   * The feature id for the '<em><b>Fake Package Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__FAKE_PACKAGE_NAME = TYPE_POINTER__FAKE_PACKAGE_NAME;

  /**
   * The feature id for the '<em><b>Fake Type Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__FAKE_TYPE_NAME = TYPE_POINTER__FAKE_TYPE_NAME;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__UID = TYPE_POINTER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__NAME = TYPE_POINTER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Pk</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__PK = TYPE_POINTER_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__PARENT = TYPE_POINTER_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_FEATURE_COUNT = TYPE_POINTER_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__UID = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__NAME = 1;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__PARENT = 2;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__PARAMETERS = 3;

  /**
   * The feature id for the '<em><b>Return Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__RETURN_VALUE = 4;

  /**
   * The number of structural features of the '<em>Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_FEATURE_COUNT = 5;

  /**
   * The feature id for the '<em><b>Package Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__PACKAGE_REF = TYPE_POINTER__PACKAGE_REF;

  /**
   * The feature id for the '<em><b>Type Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__TYPE_REF = TYPE_POINTER__TYPE_REF;

  /**
   * The feature id for the '<em><b>Fake Package Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__FAKE_PACKAGE_NAME = TYPE_POINTER__FAKE_PACKAGE_NAME;

  /**
   * The feature id for the '<em><b>Fake Type Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__FAKE_TYPE_NAME = TYPE_POINTER__FAKE_TYPE_NAME;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__UID = TYPE_POINTER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__NAME = TYPE_POINTER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__PARENT = TYPE_POINTER_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_FEATURE_COUNT = TYPE_POINTER_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Package Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN_VALUE__PACKAGE_REF = TYPE_POINTER__PACKAGE_REF;

  /**
   * The feature id for the '<em><b>Type Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN_VALUE__TYPE_REF = TYPE_POINTER__TYPE_REF;

  /**
   * The feature id for the '<em><b>Fake Package Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN_VALUE__FAKE_PACKAGE_NAME = TYPE_POINTER__FAKE_PACKAGE_NAME;

  /**
   * The feature id for the '<em><b>Fake Type Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN_VALUE__FAKE_TYPE_NAME = TYPE_POINTER__FAKE_TYPE_NAME;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN_VALUE__UID = TYPE_POINTER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Return Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN_VALUE_FEATURE_COUNT = TYPE_POINTER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMARATOR__UID = TYPE_ELEMENT__UID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMARATOR__NAME = TYPE_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMARATOR__PARENT = TYPE_ELEMENT__PARENT;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMARATOR__VALUES = TYPE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Enumarator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMARATOR_FEATURE_COUNT = TYPE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_ATTRIBUTE__UID = 0;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_ATTRIBUTE__PARENT = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_ATTRIBUTE__NAME = 2;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_ATTRIBUTE__VALUE = 3;

  /**
   * The number of structural features of the '<em>Enum Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_ATTRIBUTE_FEATURE_COUNT = 4;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPES_REPOSITORY__UID = 0;

  /**
   * The feature id for the '<em><b>Type Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPES_REPOSITORY__TYPE_DEFINITION = 1;

  /**
   * The feature id for the '<em><b>Parent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPES_REPOSITORY__PARENT = 2;

  /**
   * The number of structural features of the '<em>Types Repository</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPES_REPOSITORY_FEATURE_COUNT = 3;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPES__UID = 0;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPES__PARENT = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPES__NAME = 2;

  /**
   * The feature id for the '<em><b>Packages</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPES__PACKAGES = 3;

  /**
   * The feature id for the '<em><b>Business Packages</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPES__BUSINESS_PACKAGES = 4;

  /**
   * The number of structural features of the '<em>Types</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPES_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link domain.impl.PackageImpl <em>Package</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.PackageImpl
   * @see domain.impl.DomainPackageImpl#getPackage()
   * @generated
   */
  int PACKAGE = 60;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__UID = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__NAME = 1;

  /**
   * The feature id for the '<em><b>Typedefinition</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__TYPEDEFINITION = 2;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__PARENT = 3;

  /**
   * The number of structural features of the '<em>Package</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link domain.impl.BusinessPackageImpl <em>Business Package</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.BusinessPackageImpl
   * @see domain.impl.DomainPackageImpl#getBusinessPackage()
   * @generated
   */
  int BUSINESS_PACKAGE = 61;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUSINESS_PACKAGE__UID = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUSINESS_PACKAGE__NAME = 1;

  /**
   * The feature id for the '<em><b>Businessobjects</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUSINESS_PACKAGE__BUSINESSOBJECTS = 2;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUSINESS_PACKAGE__PARENT = 3;

  /**
   * The number of structural features of the '<em>Business Package</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUSINESS_PACKAGE_FEATURE_COUNT = 4;


  /**
   * The meta object id for the '{@link domain.PlatformLayers <em>Platform Layers</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.PlatformLayers
   * @see domain.impl.DomainPackageImpl#getPlatformLayers()
   * @generated
   */
  int PLATFORM_LAYERS = 62;


  /**
   * Returns the meta object for class '{@link domain.Domain <em>Domain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Domain</em>'.
   * @see domain.Domain
   * @generated
   */
  EClass getDomain();

  /**
   * Returns the meta object for the attribute '{@link domain.Domain#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.Domain#getUid()
   * @see #getDomain()
   * @generated
   */
  EAttribute getDomain_Uid();

  /**
   * Returns the meta object for the containment reference '{@link domain.Domain#getDomainArtifacts <em>Domain Artifacts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Domain Artifacts</em>'.
   * @see domain.Domain#getDomainArtifacts()
   * @see #getDomain()
   * @generated
   */
  EReference getDomain_DomainArtifacts();

  /**
   * Returns the meta object for the containment reference '{@link domain.Domain#getDomainTypes <em>Domain Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Domain Types</em>'.
   * @see domain.Domain#getDomainTypes()
   * @see #getDomain()
   * @generated
   */
  EReference getDomain_DomainTypes();

  /**
   * Returns the meta object for the containment reference '{@link domain.Domain#getDomainApplications <em>Domain Applications</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Domain Applications</em>'.
   * @see domain.Domain#getDomainApplications()
   * @see #getDomain()
   * @generated
   */
  EReference getDomain_DomainApplications();

  /**
   * Returns the meta object for class '{@link domain.DomainArtifacts <em>Artifacts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Artifacts</em>'.
   * @see domain.DomainArtifacts
   * @generated
   */
  EClass getDomainArtifacts();

  /**
   * Returns the meta object for the attribute '{@link domain.DomainArtifacts#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.DomainArtifacts#getUid()
   * @see #getDomainArtifacts()
   * @generated
   */
  EAttribute getDomainArtifacts_Uid();

  /**
   * Returns the meta object for the attribute '{@link domain.DomainArtifacts#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see domain.DomainArtifacts#getName()
   * @see #getDomainArtifacts()
   * @generated
   */
  EAttribute getDomainArtifacts_Name();

  /**
   * Returns the meta object for the container reference '{@link domain.DomainArtifacts#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Parent</em>'.
   * @see domain.DomainArtifacts#getParent()
   * @see #getDomainArtifacts()
   * @generated
   */
  EReference getDomainArtifacts_Parent();

  /**
   * Returns the meta object for the containment reference list '{@link domain.DomainArtifacts#getDomainArtifact <em>Domain Artifact</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Domain Artifact</em>'.
   * @see domain.DomainArtifacts#getDomainArtifact()
   * @see #getDomainArtifacts()
   * @generated
   */
  EReference getDomainArtifacts_DomainArtifact();

  /**
   * Returns the meta object for class '{@link domain.DomainTypes <em>Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Types</em>'.
   * @see domain.DomainTypes
   * @generated
   */
  EClass getDomainTypes();

  /**
   * Returns the meta object for the attribute '{@link domain.DomainTypes#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.DomainTypes#getUid()
   * @see #getDomainTypes()
   * @generated
   */
  EAttribute getDomainTypes_Uid();

  /**
   * Returns the meta object for the attribute '{@link domain.DomainTypes#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see domain.DomainTypes#getName()
   * @see #getDomainTypes()
   * @generated
   */
  EAttribute getDomainTypes_Name();

  /**
   * Returns the meta object for the reference '{@link domain.DomainTypes#getTypesrepository <em>Typesrepository</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Typesrepository</em>'.
   * @see domain.DomainTypes#getTypesrepository()
   * @see #getDomainTypes()
   * @generated
   */
  EReference getDomainTypes_Typesrepository();

  /**
   * Returns the meta object for the container reference '{@link domain.DomainTypes#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Parent</em>'.
   * @see domain.DomainTypes#getParent()
   * @see #getDomainTypes()
   * @generated
   */
  EReference getDomainTypes_Parent();

  /**
   * Returns the meta object for class '{@link domain.DomainApplications <em>Applications</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Applications</em>'.
   * @see domain.DomainApplications
   * @generated
   */
  EClass getDomainApplications();

  /**
   * Returns the meta object for the attribute '{@link domain.DomainApplications#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.DomainApplications#getUid()
   * @see #getDomainApplications()
   * @generated
   */
  EAttribute getDomainApplications_Uid();

  /**
   * Returns the meta object for the attribute '{@link domain.DomainApplications#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see domain.DomainApplications#getName()
   * @see #getDomainApplications()
   * @generated
   */
  EAttribute getDomainApplications_Name();

  /**
   * Returns the meta object for the containment reference list '{@link domain.DomainApplications#getApplications <em>Applications</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Applications</em>'.
   * @see domain.DomainApplications#getApplications()
   * @see #getDomainApplications()
   * @generated
   */
  EReference getDomainApplications_Applications();

  /**
   * Returns the meta object for the container reference '{@link domain.DomainApplications#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Parent</em>'.
   * @see domain.DomainApplications#getParent()
   * @see #getDomainApplications()
   * @generated
   */
  EReference getDomainApplications_Parent();

  /**
   * Returns the meta object for class '{@link domain.DomainApplication <em>Application</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Application</em>'.
   * @see domain.DomainApplication
   * @generated
   */
  EClass getDomainApplication();

  /**
   * Returns the meta object for the attribute '{@link domain.DomainApplication#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.DomainApplication#getUid()
   * @see #getDomainApplication()
   * @generated
   */
  EAttribute getDomainApplication_Uid();

  /**
   * Returns the meta object for the attribute '{@link domain.DomainApplication#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see domain.DomainApplication#getName()
   * @see #getDomainApplication()
   * @generated
   */
  EAttribute getDomainApplication_Name();

  /**
   * Returns the meta object for the reference '{@link domain.DomainApplication#getApplication <em>Application</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Application</em>'.
   * @see domain.DomainApplication#getApplication()
   * @see #getDomainApplication()
   * @generated
   */
  EReference getDomainApplication_Application();

  /**
   * Returns the meta object for the container reference '{@link domain.DomainApplication#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Parent</em>'.
   * @see domain.DomainApplication#getParent()
   * @see #getDomainApplication()
   * @generated
   */
  EReference getDomainApplication_Parent();

  /**
   * Returns the meta object for class '{@link domain.DomainArtifact <em>Artifact</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Artifact</em>'.
   * @see domain.DomainArtifact
   * @generated
   */
  EClass getDomainArtifact();

  /**
   * Returns the meta object for the attribute '{@link domain.DomainArtifact#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.DomainArtifact#getUid()
   * @see #getDomainArtifact()
   * @generated
   */
  EAttribute getDomainArtifact_Uid();

  /**
   * Returns the meta object for the attribute '{@link domain.DomainArtifact#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see domain.DomainArtifact#getName()
   * @see #getDomainArtifact()
   * @generated
   */
  EAttribute getDomainArtifact_Name();

  /**
   * Returns the meta object for the container reference '{@link domain.DomainArtifact#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Parent</em>'.
   * @see domain.DomainArtifact#getParent()
   * @see #getDomainArtifact()
   * @generated
   */
  EReference getDomainArtifact_Parent();

  /**
   * Returns the meta object for the reference '{@link domain.DomainArtifact#getArtifact <em>Artifact</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Artifact</em>'.
   * @see domain.DomainArtifact#getArtifact()
   * @see #getDomainArtifact()
   * @generated
   */
  EReference getDomainArtifact_Artifact();

  /**
   * Returns the meta object for class '{@link domain.ORMEntity <em>ORM Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ORM Entity</em>'.
   * @see domain.ORMEntity
   * @generated
   */
  EClass getORMEntity();

  /**
   * Returns the meta object for class '{@link domain.JPAService <em>JPA Service</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>JPA Service</em>'.
   * @see domain.JPAService
   * @generated
   */
  EClass getJPAService();

  /**
   * Returns the meta object for class '{@link domain.EJBService <em>EJB Service</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EJB Service</em>'.
   * @see domain.EJBService
   * @generated
   */
  EClass getEJBService();

  /**
   * Returns the meta object for class '{@link domain.Artifacts <em>Artifacts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Artifacts</em>'.
   * @see domain.Artifacts
   * @generated
   */
  EClass getArtifacts();

  /**
   * Returns the meta object for the attribute '{@link domain.Artifacts#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.Artifacts#getUid()
   * @see #getArtifacts()
   * @generated
   */
  EAttribute getArtifacts_Uid();

  /**
   * Returns the meta object for the containment reference list '{@link domain.Artifacts#getArtifacts <em>Artifacts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Artifacts</em>'.
   * @see domain.Artifacts#getArtifacts()
   * @see #getArtifacts()
   * @generated
   */
  EReference getArtifacts_Artifacts();

  /**
   * Returns the meta object for the reference '{@link domain.Artifacts#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Parent</em>'.
   * @see domain.Artifacts#getParent()
   * @see #getArtifacts()
   * @generated
   */
  EReference getArtifacts_Parent();

  /**
   * Returns the meta object for class '{@link domain.Artifact <em>Artifact</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Artifact</em>'.
   * @see domain.Artifact
   * @generated
   */
  EClass getArtifact();

  /**
   * Returns the meta object for the attribute '{@link domain.Artifact#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.Artifact#getUid()
   * @see #getArtifact()
   * @generated
   */
  EAttribute getArtifact_Uid();

  /**
   * Returns the meta object for the attribute '{@link domain.Artifact#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see domain.Artifact#getName()
   * @see #getArtifact()
   * @generated
   */
  EAttribute getArtifact_Name();

  /**
   * Returns the meta object for the attribute '{@link domain.Artifact#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see domain.Artifact#getDescription()
   * @see #getArtifact()
   * @generated
   */
  EAttribute getArtifact_Description();

  /**
   * Returns the meta object for the container reference '{@link domain.Artifact#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Parent</em>'.
   * @see domain.Artifact#getParent()
   * @see #getArtifact()
   * @generated
   */
  EReference getArtifact_Parent();

  /**
   * Returns the meta object for the containment reference list '{@link domain.Artifact#getConfigVariables <em>Config Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Config Variables</em>'.
   * @see domain.Artifact#getConfigVariables()
   * @see #getArtifact()
   * @generated
   */
  EReference getArtifact_ConfigVariables();

  /**
   * Returns the meta object for the containment reference list '{@link domain.Artifact#getModelQuery <em>Model Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Model Query</em>'.
   * @see domain.Artifact#getModelQuery()
   * @see #getArtifact()
   * @generated
   */
  EReference getArtifact_ModelQuery();

  /**
   * Returns the meta object for the containment reference list '{@link domain.Artifact#getSpecifiers <em>Specifiers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Specifiers</em>'.
   * @see domain.Artifact#getSpecifiers()
   * @see #getArtifact()
   * @generated
   */
  EReference getArtifact_Specifiers();

  /**
   * Returns the meta object for the attribute '{@link domain.Artifact#getTemplate <em>Template</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Template</em>'.
   * @see domain.Artifact#getTemplate()
   * @see #getArtifact()
   * @generated
   */
  EAttribute getArtifact_Template();

  /**
   * Returns the meta object for class '{@link domain.ConfigVariable <em>Config Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Config Variable</em>'.
   * @see domain.ConfigVariable
   * @generated
   */
  EClass getConfigVariable();

  /**
   * Returns the meta object for the attribute '{@link domain.ConfigVariable#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.ConfigVariable#getUid()
   * @see #getConfigVariable()
   * @generated
   */
  EAttribute getConfigVariable_Uid();

  /**
   * Returns the meta object for the attribute '{@link domain.ConfigVariable#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see domain.ConfigVariable#getName()
   * @see #getConfigVariable()
   * @generated
   */
  EAttribute getConfigVariable_Name();

  /**
   * Returns the meta object for the container reference '{@link domain.ConfigVariable#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Parent</em>'.
   * @see domain.ConfigVariable#getParent()
   * @see #getConfigVariable()
   * @generated
   */
  EReference getConfigVariable_Parent();

  /**
   * Returns the meta object for class '{@link domain.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable</em>'.
   * @see domain.Variable
   * @generated
   */
  EClass getVariable();

  /**
   * Returns the meta object for the attribute '{@link domain.Variable#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.Variable#getUid()
   * @see #getVariable()
   * @generated
   */
  EAttribute getVariable_Uid();

  /**
   * Returns the meta object for the attribute '{@link domain.Variable#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see domain.Variable#getName()
   * @see #getVariable()
   * @generated
   */
  EAttribute getVariable_Name();

  /**
   * Returns the meta object for the container reference '{@link domain.Variable#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Parent</em>'.
   * @see domain.Variable#getParent()
   * @see #getVariable()
   * @generated
   */
  EReference getVariable_Parent();

  /**
   * Returns the meta object for class '{@link domain.Specifier <em>Specifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Specifier</em>'.
   * @see domain.Specifier
   * @generated
   */
  EClass getSpecifier();

  /**
   * Returns the meta object for the attribute '{@link domain.Specifier#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.Specifier#getUid()
   * @see #getSpecifier()
   * @generated
   */
  EAttribute getSpecifier_Uid();

  /**
   * Returns the meta object for the attribute '{@link domain.Specifier#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see domain.Specifier#getName()
   * @see #getSpecifier()
   * @generated
   */
  EAttribute getSpecifier_Name();

  /**
   * Returns the meta object for the container reference '{@link domain.Specifier#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Parent</em>'.
   * @see domain.Specifier#getParent()
   * @see #getSpecifier()
   * @generated
   */
  EReference getSpecifier_Parent();

  /**
   * Returns the meta object for the containment reference list '{@link domain.Specifier#getOptions <em>Options</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Options</em>'.
   * @see domain.Specifier#getOptions()
   * @see #getSpecifier()
   * @generated
   */
  EReference getSpecifier_Options();

  /**
   * Returns the meta object for class '{@link domain.Option <em>Option</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Option</em>'.
   * @see domain.Option
   * @generated
   */
  EClass getOption();

  /**
   * Returns the meta object for the attribute '{@link domain.Option#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.Option#getUid()
   * @see #getOption()
   * @generated
   */
  EAttribute getOption_Uid();

  /**
   * Returns the meta object for the container reference '{@link domain.Option#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Parent</em>'.
   * @see domain.Option#getParent()
   * @see #getOption()
   * @generated
   */
  EReference getOption_Parent();

  /**
   * Returns the meta object for the attribute '{@link domain.Option#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see domain.Option#getValue()
   * @see #getOption()
   * @generated
   */
  EAttribute getOption_Value();

  /**
   * Returns the meta object for class '{@link domain.Application <em>Application</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Application</em>'.
   * @see domain.Application
   * @generated
   */
  EClass getApplication();

  /**
   * Returns the meta object for the attribute '{@link domain.Application#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.Application#getUid()
   * @see #getApplication()
   * @generated
   */
  EAttribute getApplication_Uid();

  /**
   * Returns the meta object for the containment reference '{@link domain.Application#getApplicationRecipes <em>Application Recipes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Application Recipes</em>'.
   * @see domain.Application#getApplicationRecipes()
   * @see #getApplication()
   * @generated
   */
  EReference getApplication_ApplicationRecipes();

  /**
   * Returns the meta object for the containment reference '{@link domain.Application#getApplicationMappers <em>Application Mappers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Application Mappers</em>'.
   * @see domain.Application#getApplicationMappers()
   * @see #getApplication()
   * @generated
   */
  EReference getApplication_ApplicationMappers();

  /**
   * Returns the meta object for the reference '{@link domain.Application#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Parent</em>'.
   * @see domain.Application#getParent()
   * @see #getApplication()
   * @generated
   */
  EReference getApplication_Parent();

  /**
   * Returns the meta object for class '{@link domain.ApplicationRecipes <em>Application Recipes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Application Recipes</em>'.
   * @see domain.ApplicationRecipes
   * @generated
   */
  EClass getApplicationRecipes();

  /**
   * Returns the meta object for the attribute '{@link domain.ApplicationRecipes#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.ApplicationRecipes#getUid()
   * @see #getApplicationRecipes()
   * @generated
   */
  EAttribute getApplicationRecipes_Uid();

  /**
   * Returns the meta object for the attribute '{@link domain.ApplicationRecipes#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see domain.ApplicationRecipes#getName()
   * @see #getApplicationRecipes()
   * @generated
   */
  EAttribute getApplicationRecipes_Name();

  /**
   * Returns the meta object for the container reference '{@link domain.ApplicationRecipes#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Parent</em>'.
   * @see domain.ApplicationRecipes#getParent()
   * @see #getApplicationRecipes()
   * @generated
   */
  EReference getApplicationRecipes_Parent();

  /**
   * Returns the meta object for the containment reference list '{@link domain.ApplicationRecipes#getRecipes <em>Recipes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Recipes</em>'.
   * @see domain.ApplicationRecipes#getRecipes()
   * @see #getApplicationRecipes()
   * @generated
   */
  EReference getApplicationRecipes_Recipes();

  /**
   * Returns the meta object for class '{@link domain.ApplicationRecipe <em>Application Recipe</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Application Recipe</em>'.
   * @see domain.ApplicationRecipe
   * @generated
   */
  EClass getApplicationRecipe();

  /**
   * Returns the meta object for the attribute '{@link domain.ApplicationRecipe#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.ApplicationRecipe#getUid()
   * @see #getApplicationRecipe()
   * @generated
   */
  EAttribute getApplicationRecipe_Uid();

  /**
   * Returns the meta object for the attribute '{@link domain.ApplicationRecipe#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see domain.ApplicationRecipe#getName()
   * @see #getApplicationRecipe()
   * @generated
   */
  EAttribute getApplicationRecipe_Name();

  /**
   * Returns the meta object for the reference '{@link domain.ApplicationRecipe#getRecipes <em>Recipes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Recipes</em>'.
   * @see domain.ApplicationRecipe#getRecipes()
   * @see #getApplicationRecipe()
   * @generated
   */
  EReference getApplicationRecipe_Recipes();

  /**
   * Returns the meta object for the container reference '{@link domain.ApplicationRecipe#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Parent</em>'.
   * @see domain.ApplicationRecipe#getParent()
   * @see #getApplicationRecipe()
   * @generated
   */
  EReference getApplicationRecipe_Parent();

  /**
   * Returns the meta object for class '{@link domain.ApplicationMappers <em>Application Mappers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Application Mappers</em>'.
   * @see domain.ApplicationMappers
   * @generated
   */
  EClass getApplicationMappers();

  /**
   * Returns the meta object for the attribute '{@link domain.ApplicationMappers#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.ApplicationMappers#getUid()
   * @see #getApplicationMappers()
   * @generated
   */
  EAttribute getApplicationMappers_Uid();

  /**
   * Returns the meta object for the attribute '{@link domain.ApplicationMappers#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see domain.ApplicationMappers#getName()
   * @see #getApplicationMappers()
   * @generated
   */
  EAttribute getApplicationMappers_Name();

  /**
   * Returns the meta object for the container reference '{@link domain.ApplicationMappers#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Parent</em>'.
   * @see domain.ApplicationMappers#getParent()
   * @see #getApplicationMappers()
   * @generated
   */
  EReference getApplicationMappers_Parent();

  /**
   * Returns the meta object for the containment reference list '{@link domain.ApplicationMappers#getMappers <em>Mappers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Mappers</em>'.
   * @see domain.ApplicationMappers#getMappers()
   * @see #getApplicationMappers()
   * @generated
   */
  EReference getApplicationMappers_Mappers();

  /**
   * Returns the meta object for class '{@link domain.ApplicationMapper <em>Application Mapper</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Application Mapper</em>'.
   * @see domain.ApplicationMapper
   * @generated
   */
  EClass getApplicationMapper();

  /**
   * Returns the meta object for the attribute '{@link domain.ApplicationMapper#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.ApplicationMapper#getUid()
   * @see #getApplicationMapper()
   * @generated
   */
  EAttribute getApplicationMapper_Uid();

  /**
   * Returns the meta object for the attribute '{@link domain.ApplicationMapper#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see domain.ApplicationMapper#getName()
   * @see #getApplicationMapper()
   * @generated
   */
  EAttribute getApplicationMapper_Name();

  /**
   * Returns the meta object for the reference '{@link domain.ApplicationMapper#getMapper <em>Mapper</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Mapper</em>'.
   * @see domain.ApplicationMapper#getMapper()
   * @see #getApplicationMapper()
   * @generated
   */
  EReference getApplicationMapper_Mapper();

  /**
   * Returns the meta object for the container reference '{@link domain.ApplicationMapper#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Parent</em>'.
   * @see domain.ApplicationMapper#getParent()
   * @see #getApplicationMapper()
   * @generated
   */
  EReference getApplicationMapper_Parent();

  /**
   * Returns the meta object for class '{@link domain.BusinessObjects <em>Business Objects</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Business Objects</em>'.
   * @see domain.BusinessObjects
   * @generated
   */
  EClass getBusinessObjects();

  /**
   * Returns the meta object for the attribute '{@link domain.BusinessObjects#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.BusinessObjects#getUid()
   * @see #getBusinessObjects()
   * @generated
   */
  EAttribute getBusinessObjects_Uid();

  /**
   * Returns the meta object for the containment reference list '{@link domain.BusinessObjects#getBusinessObject <em>Business Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Business Object</em>'.
   * @see domain.BusinessObjects#getBusinessObject()
   * @see #getBusinessObjects()
   * @generated
   */
  EReference getBusinessObjects_BusinessObject();

  /**
   * Returns the meta object for the reference '{@link domain.BusinessObjects#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Parent</em>'.
   * @see domain.BusinessObjects#getParent()
   * @see #getBusinessObjects()
   * @generated
   */
  EReference getBusinessObjects_Parent();

  /**
   * Returns the meta object for class '{@link domain.BusinessObject <em>Business Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Business Object</em>'.
   * @see domain.BusinessObject
   * @generated
   */
  EClass getBusinessObject();

  /**
   * Returns the meta object for the attribute '{@link domain.BusinessObject#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.BusinessObject#getUid()
   * @see #getBusinessObject()
   * @generated
   */
  EAttribute getBusinessObject_Uid();

  /**
   * Returns the meta object for the attribute '{@link domain.BusinessObject#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see domain.BusinessObject#getName()
   * @see #getBusinessObject()
   * @generated
   */
  EAttribute getBusinessObject_Name();

  /**
   * Returns the meta object for the container reference '{@link domain.BusinessObject#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Parent</em>'.
   * @see domain.BusinessObject#getParent()
   * @see #getBusinessObject()
   * @generated
   */
  EReference getBusinessObject_Parent();

  /**
   * Returns the meta object for the containment reference list '{@link domain.BusinessObject#getCreateMethods <em>Create Methods</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Create Methods</em>'.
   * @see domain.BusinessObject#getCreateMethods()
   * @see #getBusinessObject()
   * @generated
   */
  EReference getBusinessObject_CreateMethods();

  /**
   * Returns the meta object for the containment reference list '{@link domain.BusinessObject#getInsertMethods <em>Insert Methods</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Insert Methods</em>'.
   * @see domain.BusinessObject#getInsertMethods()
   * @see #getBusinessObject()
   * @generated
   */
  EReference getBusinessObject_InsertMethods();

  /**
   * Returns the meta object for the containment reference list '{@link domain.BusinessObject#getUpdateMethods <em>Update Methods</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Update Methods</em>'.
   * @see domain.BusinessObject#getUpdateMethods()
   * @see #getBusinessObject()
   * @generated
   */
  EReference getBusinessObject_UpdateMethods();

  /**
   * Returns the meta object for the containment reference list '{@link domain.BusinessObject#getRemoveMethods <em>Remove Methods</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Remove Methods</em>'.
   * @see domain.BusinessObject#getRemoveMethods()
   * @see #getBusinessObject()
   * @generated
   */
  EReference getBusinessObject_RemoveMethods();

  /**
   * Returns the meta object for the containment reference list '{@link domain.BusinessObject#getSearchMethods <em>Search Methods</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Search Methods</em>'.
   * @see domain.BusinessObject#getSearchMethods()
   * @see #getBusinessObject()
   * @generated
   */
  EReference getBusinessObject_SearchMethods();

  /**
   * Returns the meta object for the containment reference list '{@link domain.BusinessObject#getOthersMethods <em>Others Methods</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Others Methods</em>'.
   * @see domain.BusinessObject#getOthersMethods()
   * @see #getBusinessObject()
   * @generated
   */
  EReference getBusinessObject_OthersMethods();

  /**
   * Returns the meta object for class '{@link domain.BusinessMethod <em>Business Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Business Method</em>'.
   * @see domain.BusinessMethod
   * @generated
   */
  EClass getBusinessMethod();

  /**
   * Returns the meta object for the attribute '{@link domain.BusinessMethod#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.BusinessMethod#getUid()
   * @see #getBusinessMethod()
   * @generated
   */
  EAttribute getBusinessMethod_Uid();

  /**
   * Returns the meta object for the reference '{@link domain.BusinessMethod#getMethodRef <em>Method Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Method Ref</em>'.
   * @see domain.BusinessMethod#getMethodRef()
   * @see #getBusinessMethod()
   * @generated
   */
  EReference getBusinessMethod_MethodRef();

  /**
   * Returns the meta object for the attribute '{@link domain.BusinessMethod#getFakeMethod <em>Fake Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fake Method</em>'.
   * @see domain.BusinessMethod#getFakeMethod()
   * @see #getBusinessMethod()
   * @generated
   */
  EAttribute getBusinessMethod_FakeMethod();

  /**
   * Returns the meta object for class '{@link domain.CreateMethod <em>Create Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Create Method</em>'.
   * @see domain.CreateMethod
   * @generated
   */
  EClass getCreateMethod();

  /**
   * Returns the meta object for the container reference '{@link domain.CreateMethod#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Parent</em>'.
   * @see domain.CreateMethod#getParent()
   * @see #getCreateMethod()
   * @generated
   */
  EReference getCreateMethod_Parent();

  /**
   * Returns the meta object for class '{@link domain.InsertMethod <em>Insert Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Insert Method</em>'.
   * @see domain.InsertMethod
   * @generated
   */
  EClass getInsertMethod();

  /**
   * Returns the meta object for the container reference '{@link domain.InsertMethod#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Parent</em>'.
   * @see domain.InsertMethod#getParent()
   * @see #getInsertMethod()
   * @generated
   */
  EReference getInsertMethod_Parent();

  /**
   * Returns the meta object for class '{@link domain.UpdateMethod <em>Update Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Update Method</em>'.
   * @see domain.UpdateMethod
   * @generated
   */
  EClass getUpdateMethod();

  /**
   * Returns the meta object for the container reference '{@link domain.UpdateMethod#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Parent</em>'.
   * @see domain.UpdateMethod#getParent()
   * @see #getUpdateMethod()
   * @generated
   */
  EReference getUpdateMethod_Parent();

  /**
   * Returns the meta object for class '{@link domain.RemoveMethod <em>Remove Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Remove Method</em>'.
   * @see domain.RemoveMethod
   * @generated
   */
  EClass getRemoveMethod();

  /**
   * Returns the meta object for the container reference '{@link domain.RemoveMethod#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Parent</em>'.
   * @see domain.RemoveMethod#getParent()
   * @see #getRemoveMethod()
   * @generated
   */
  EReference getRemoveMethod_Parent();

  /**
   * Returns the meta object for class '{@link domain.SearchMethod <em>Search Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Search Method</em>'.
   * @see domain.SearchMethod
   * @generated
   */
  EClass getSearchMethod();

  /**
   * Returns the meta object for the container reference '{@link domain.SearchMethod#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Parent</em>'.
   * @see domain.SearchMethod#getParent()
   * @see #getSearchMethod()
   * @generated
   */
  EReference getSearchMethod_Parent();

  /**
   * Returns the meta object for class '{@link domain.OtherMethod <em>Other Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Other Method</em>'.
   * @see domain.OtherMethod
   * @generated
   */
  EClass getOtherMethod();

  /**
   * Returns the meta object for the container reference '{@link domain.OtherMethod#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Parent</em>'.
   * @see domain.OtherMethod#getParent()
   * @see #getOtherMethod()
   * @generated
   */
  EReference getOtherMethod_Parent();

  /**
   * Returns the meta object for class '{@link domain.Mappers <em>Mappers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mappers</em>'.
   * @see domain.Mappers
   * @generated
   */
  EClass getMappers();

  /**
   * Returns the meta object for the attribute '{@link domain.Mappers#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.Mappers#getUid()
   * @see #getMappers()
   * @generated
   */
  EAttribute getMappers_Uid();

  /**
   * Returns the meta object for the containment reference list '{@link domain.Mappers#getMappers <em>Mappers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Mappers</em>'.
   * @see domain.Mappers#getMappers()
   * @see #getMappers()
   * @generated
   */
  EReference getMappers_Mappers();

  /**
   * Returns the meta object for the reference '{@link domain.Mappers#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Parent</em>'.
   * @see domain.Mappers#getParent()
   * @see #getMappers()
   * @generated
   */
  EReference getMappers_Parent();

  /**
   * Returns the meta object for class '{@link domain.Mapper <em>Mapper</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mapper</em>'.
   * @see domain.Mapper
   * @generated
   */
  EClass getMapper();

  /**
   * Returns the meta object for the attribute '{@link domain.Mapper#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.Mapper#getUid()
   * @see #getMapper()
   * @generated
   */
  EAttribute getMapper_Uid();

  /**
   * Returns the meta object for the container reference '{@link domain.Mapper#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Parent</em>'.
   * @see domain.Mapper#getParent()
   * @see #getMapper()
   * @generated
   */
  EReference getMapper_Parent();

  /**
   * Returns the meta object for the attribute '{@link domain.Mapper#isServiceLayer <em>Service Layer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Service Layer</em>'.
   * @see domain.Mapper#isServiceLayer()
   * @see #getMapper()
   * @generated
   */
  EAttribute getMapper_ServiceLayer();

  /**
   * Returns the meta object for the attribute '{@link domain.Mapper#isUiLayer <em>Ui Layer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ui Layer</em>'.
   * @see domain.Mapper#isUiLayer()
   * @see #getMapper()
   * @generated
   */
  EAttribute getMapper_UiLayer();

  /**
   * Returns the meta object for class '{@link domain.JavaMapper <em>Java Mapper</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Java Mapper</em>'.
   * @see domain.JavaMapper
   * @generated
   */
  EClass getJavaMapper();

  /**
   * Returns the meta object for the attribute '{@link domain.JavaMapper#getMappedToPackageName <em>Mapped To Package Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Mapped To Package Name</em>'.
   * @see domain.JavaMapper#getMappedToPackageName()
   * @see #getJavaMapper()
   * @generated
   */
  EAttribute getJavaMapper_MappedToPackageName();

  /**
   * Returns the meta object for the attribute '{@link domain.JavaMapper#getMappedToClassName <em>Mapped To Class Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Mapped To Class Name</em>'.
   * @see domain.JavaMapper#getMappedToClassName()
   * @see #getJavaMapper()
   * @generated
   */
  EAttribute getJavaMapper_MappedToClassName();

  /**
   * Returns the meta object for the attribute '{@link domain.JavaMapper#getArtifactId <em>Artifact Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Artifact Id</em>'.
   * @see domain.JavaMapper#getArtifactId()
   * @see #getJavaMapper()
   * @generated
   */
  EAttribute getJavaMapper_ArtifactId();

  /**
   * Returns the meta object for the attribute '{@link domain.JavaMapper#getGroupId <em>Group Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Group Id</em>'.
   * @see domain.JavaMapper#getGroupId()
   * @see #getJavaMapper()
   * @generated
   */
  EAttribute getJavaMapper_GroupId();

  /**
   * Returns the meta object for the attribute '{@link domain.JavaMapper#getVersion <em>Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Version</em>'.
   * @see domain.JavaMapper#getVersion()
   * @see #getJavaMapper()
   * @generated
   */
  EAttribute getJavaMapper_Version();

  /**
   * Returns the meta object for the attribute '{@link domain.JavaMapper#getLibraryName <em>Library Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Library Name</em>'.
   * @see domain.JavaMapper#getLibraryName()
   * @see #getJavaMapper()
   * @generated
   */
  EAttribute getJavaMapper_LibraryName();

  /**
   * Returns the meta object for class '{@link domain.Recipes <em>Recipes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Recipes</em>'.
   * @see domain.Recipes
   * @generated
   */
  EClass getRecipes();

  /**
   * Returns the meta object for the attribute '{@link domain.Recipes#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.Recipes#getUid()
   * @see #getRecipes()
   * @generated
   */
  EAttribute getRecipes_Uid();

  /**
   * Returns the meta object for the containment reference '{@link domain.Recipes#getRecipe <em>Recipe</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Recipe</em>'.
   * @see domain.Recipes#getRecipe()
   * @see #getRecipes()
   * @generated
   */
  EReference getRecipes_Recipe();

  /**
   * Returns the meta object for the containment reference list '{@link domain.Recipes#getConfigurations <em>Configurations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Configurations</em>'.
   * @see domain.Recipes#getConfigurations()
   * @see #getRecipes()
   * @generated
   */
  EReference getRecipes_Configurations();

  /**
   * Returns the meta object for the containment reference list '{@link domain.Recipes#getInfrastructures <em>Infrastructures</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Infrastructures</em>'.
   * @see domain.Recipes#getInfrastructures()
   * @see #getRecipes()
   * @generated
   */
  EReference getRecipes_Infrastructures();

  /**
   * Returns the meta object for the reference '{@link domain.Recipes#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Parent</em>'.
   * @see domain.Recipes#getParent()
   * @see #getRecipes()
   * @generated
   */
  EReference getRecipes_Parent();

  /**
   * Returns the meta object for class '{@link domain.UsingMappers <em>Using Mappers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Using Mappers</em>'.
   * @see domain.UsingMappers
   * @generated
   */
  EClass getUsingMappers();

  /**
   * Returns the meta object for the reference list '{@link domain.UsingMappers#getMappers <em>Mappers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Mappers</em>'.
   * @see domain.UsingMappers#getMappers()
   * @see #getUsingMappers()
   * @generated
   */
  EReference getUsingMappers_Mappers();

  /**
   * Returns the meta object for class '{@link domain.Ingredient <em>Ingredient</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ingredient</em>'.
   * @see domain.Ingredient
   * @generated
   */
  EClass getIngredient();

  /**
   * Returns the meta object for the attribute '{@link domain.Ingredient#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.Ingredient#getUid()
   * @see #getIngredient()
   * @generated
   */
  EAttribute getIngredient_Uid();

  /**
   * Returns the meta object for the attribute '{@link domain.Ingredient#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see domain.Ingredient#getName()
   * @see #getIngredient()
   * @generated
   */
  EAttribute getIngredient_Name();

  /**
   * Returns the meta object for the container reference '{@link domain.Ingredient#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Parent</em>'.
   * @see domain.Ingredient#getParent()
   * @see #getIngredient()
   * @generated
   */
  EReference getIngredient_Parent();

  /**
   * Returns the meta object for the containment reference list '{@link domain.Ingredient#getComponents <em>Components</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Components</em>'.
   * @see domain.Ingredient#getComponents()
   * @see #getIngredient()
   * @generated
   */
  EReference getIngredient_Components();

  /**
   * Returns the meta object for the attribute '{@link domain.Ingredient#getLayer <em>Layer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Layer</em>'.
   * @see domain.Ingredient#getLayer()
   * @see #getIngredient()
   * @generated
   */
  EAttribute getIngredient_Layer();

  /**
   * Returns the meta object for class '{@link domain.Infrastructure <em>Infrastructure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Infrastructure</em>'.
   * @see domain.Infrastructure
   * @generated
   */
  EClass getInfrastructure();

  /**
   * Returns the meta object for the attribute '{@link domain.Infrastructure#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.Infrastructure#getUid()
   * @see #getInfrastructure()
   * @generated
   */
  EAttribute getInfrastructure_Uid();

  /**
   * Returns the meta object for the reference '{@link domain.Infrastructure#getRecipe <em>Recipe</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Recipe</em>'.
   * @see domain.Infrastructure#getRecipe()
   * @see #getInfrastructure()
   * @generated
   */
  EReference getInfrastructure_Recipe();

  /**
   * Returns the meta object for the attribute '{@link domain.Infrastructure#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see domain.Infrastructure#getName()
   * @see #getInfrastructure()
   * @generated
   */
  EAttribute getInfrastructure_Name();

  /**
   * Returns the meta object for the reference '{@link domain.Infrastructure#getRecipeConfig <em>Recipe Config</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Recipe Config</em>'.
   * @see domain.Infrastructure#getRecipeConfig()
   * @see #getInfrastructure()
   * @generated
   */
  EReference getInfrastructure_RecipeConfig();

  /**
   * Returns the meta object for class '{@link domain.Recipe <em>Recipe</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Recipe</em>'.
   * @see domain.Recipe
   * @generated
   */
  EClass getRecipe();

  /**
   * Returns the meta object for the attribute '{@link domain.Recipe#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.Recipe#getUid()
   * @see #getRecipe()
   * @generated
   */
  EAttribute getRecipe_Uid();

  /**
   * Returns the meta object for the container reference '{@link domain.Recipe#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Parent</em>'.
   * @see domain.Recipe#getParent()
   * @see #getRecipe()
   * @generated
   */
  EReference getRecipe_Parent();

  /**
   * Returns the meta object for the attribute '{@link domain.Recipe#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see domain.Recipe#getName()
   * @see #getRecipe()
   * @generated
   */
  EAttribute getRecipe_Name();

  /**
   * Returns the meta object for the containment reference list '{@link domain.Recipe#getIngredients <em>Ingredients</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ingredients</em>'.
   * @see domain.Recipe#getIngredients()
   * @see #getRecipe()
   * @generated
   */
  EReference getRecipe_Ingredients();

  /**
   * Returns the meta object for the reference list '{@link domain.Recipe#getInfrastructures <em>Infrastructures</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Infrastructures</em>'.
   * @see domain.Recipe#getInfrastructures()
   * @see #getRecipe()
   * @generated
   */
  EReference getRecipe_Infrastructures();

  /**
   * Returns the meta object for class '{@link domain.Component <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Component</em>'.
   * @see domain.Component
   * @generated
   */
  EClass getComponent();

  /**
   * Returns the meta object for the attribute '{@link domain.Component#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.Component#getUid()
   * @see #getComponent()
   * @generated
   */
  EAttribute getComponent_Uid();

  /**
   * Returns the meta object for the attribute '{@link domain.Component#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see domain.Component#getName()
   * @see #getComponent()
   * @generated
   */
  EAttribute getComponent_Name();

  /**
   * Returns the meta object for the containment reference list '{@link domain.Component#getComponents <em>Components</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Components</em>'.
   * @see domain.Component#getComponents()
   * @see #getComponent()
   * @generated
   */
  EReference getComponent_Components();

  /**
   * Returns the meta object for the containment reference list '{@link domain.Component#getMappers <em>Mappers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Mappers</em>'.
   * @see domain.Component#getMappers()
   * @see #getComponent()
   * @generated
   */
  EReference getComponent_Mappers();

  /**
   * Returns the meta object for the attribute '{@link domain.Component#getBuildScript <em>Build Script</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Build Script</em>'.
   * @see domain.Component#getBuildScript()
   * @see #getComponent()
   * @generated
   */
  EAttribute getComponent_BuildScript();

  /**
   * Returns the meta object for the attribute '{@link domain.Component#getDeployScript <em>Deploy Script</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Deploy Script</em>'.
   * @see domain.Component#getDeployScript()
   * @see #getComponent()
   * @generated
   */
  EAttribute getComponent_DeployScript();

  /**
   * Returns the meta object for class '{@link domain.JavaComponent <em>Java Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Java Component</em>'.
   * @see domain.JavaComponent
   * @generated
   */
  EClass getJavaComponent();

  /**
   * Returns the meta object for the attribute '{@link domain.JavaComponent#getArtifactId <em>Artifact Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Artifact Id</em>'.
   * @see domain.JavaComponent#getArtifactId()
   * @see #getJavaComponent()
   * @generated
   */
  EAttribute getJavaComponent_ArtifactId();

  /**
   * Returns the meta object for the attribute '{@link domain.JavaComponent#getGroupId <em>Group Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Group Id</em>'.
   * @see domain.JavaComponent#getGroupId()
   * @see #getJavaComponent()
   * @generated
   */
  EAttribute getJavaComponent_GroupId();

  /**
   * Returns the meta object for the attribute '{@link domain.JavaComponent#getVersion <em>Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Version</em>'.
   * @see domain.JavaComponent#getVersion()
   * @see #getJavaComponent()
   * @generated
   */
  EAttribute getJavaComponent_Version();

  /**
   * Returns the meta object for the attribute '{@link domain.JavaComponent#getBasePackage <em>Base Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Base Package</em>'.
   * @see domain.JavaComponent#getBasePackage()
   * @see #getJavaComponent()
   * @generated
   */
  EAttribute getJavaComponent_BasePackage();

  /**
   * Returns the meta object for class '{@link domain.ModelMapper <em>Model Mapper</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model Mapper</em>'.
   * @see domain.ModelMapper
   * @generated
   */
  EClass getModelMapper();

  /**
   * Returns the meta object for the attribute '{@link domain.ModelMapper#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see domain.ModelMapper#getName()
   * @see #getModelMapper()
   * @generated
   */
  EAttribute getModelMapper_Name();

  /**
   * Returns the meta object for the container reference '{@link domain.ModelMapper#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Parent</em>'.
   * @see domain.ModelMapper#getParent()
   * @see #getModelMapper()
   * @generated
   */
  EReference getModelMapper_Parent();

  /**
   * Returns the meta object for the containment reference list '{@link domain.ModelMapper#getSpecifiers <em>Specifiers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Specifiers</em>'.
   * @see domain.ModelMapper#getSpecifiers()
   * @see #getModelMapper()
   * @generated
   */
  EReference getModelMapper_Specifiers();

  /**
   * Returns the meta object for the containment reference list '{@link domain.ModelMapper#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variables</em>'.
   * @see domain.ModelMapper#getVariables()
   * @see #getModelMapper()
   * @generated
   */
  EReference getModelMapper_Variables();

  /**
   * Returns the meta object for class '{@link domain.Configuration <em>Configuration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Configuration</em>'.
   * @see domain.Configuration
   * @generated
   */
  EClass getConfiguration();

  /**
   * Returns the meta object for the attribute '{@link domain.Configuration#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.Configuration#getUid()
   * @see #getConfiguration()
   * @generated
   */
  EAttribute getConfiguration_Uid();

  /**
   * Returns the meta object for the attribute '{@link domain.Configuration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see domain.Configuration#getName()
   * @see #getConfiguration()
   * @generated
   */
  EAttribute getConfiguration_Name();

  /**
   * Returns the meta object for the reference '{@link domain.Configuration#getInfrastructure <em>Infrastructure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Infrastructure</em>'.
   * @see domain.Configuration#getInfrastructure()
   * @see #getConfiguration()
   * @generated
   */
  EReference getConfiguration_Infrastructure();

  /**
   * Returns the meta object for the containment reference list '{@link domain.Configuration#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see domain.Configuration#getProperties()
   * @see #getConfiguration()
   * @generated
   */
  EReference getConfiguration_Properties();

  /**
   * Returns the meta object for the reference '{@link domain.Configuration#getConfigExtension <em>Config Extension</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Config Extension</em>'.
   * @see domain.Configuration#getConfigExtension()
   * @see #getConfiguration()
   * @generated
   */
  EReference getConfiguration_ConfigExtension();

  /**
   * Returns the meta object for the reference '{@link domain.Configuration#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Parent</em>'.
   * @see domain.Configuration#getParent()
   * @see #getConfiguration()
   * @generated
   */
  EReference getConfiguration_Parent();

  /**
   * Returns the meta object for class '{@link domain.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property</em>'.
   * @see domain.Property
   * @generated
   */
  EClass getProperty();

  /**
   * Returns the meta object for the attribute '{@link domain.Property#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.Property#getUid()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_Uid();

  /**
   * Returns the meta object for the reference '{@link domain.Property#getConfVarRef <em>Conf Var Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Conf Var Ref</em>'.
   * @see domain.Property#getConfVarRef()
   * @see #getProperty()
   * @generated
   */
  EReference getProperty_ConfVarRef();

  /**
   * Returns the meta object for the attribute '{@link domain.Property#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see domain.Property#getValue()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_Value();

  /**
   * Returns the meta object for the attribute '{@link domain.Property#getFakeName <em>Fake Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fake Name</em>'.
   * @see domain.Property#getFakeName()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_FakeName();

  /**
   * Returns the meta object for class '{@link domain.MappingSpecifier <em>Mapping Specifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mapping Specifier</em>'.
   * @see domain.MappingSpecifier
   * @generated
   */
  EClass getMappingSpecifier();

  /**
   * Returns the meta object for the attribute '{@link domain.MappingSpecifier#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.MappingSpecifier#getUid()
   * @see #getMappingSpecifier()
   * @generated
   */
  EAttribute getMappingSpecifier_Uid();

  /**
   * Returns the meta object for the reference '{@link domain.MappingSpecifier#getSpecifierRef <em>Specifier Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Specifier Ref</em>'.
   * @see domain.MappingSpecifier#getSpecifierRef()
   * @see #getMappingSpecifier()
   * @generated
   */
  EReference getMappingSpecifier_SpecifierRef();

  /**
   * Returns the meta object for the reference '{@link domain.MappingSpecifier#getValueRef <em>Value Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Value Ref</em>'.
   * @see domain.MappingSpecifier#getValueRef()
   * @see #getMappingSpecifier()
   * @generated
   */
  EReference getMappingSpecifier_ValueRef();

  /**
   * Returns the meta object for class '{@link domain.MappingVariable <em>Mapping Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mapping Variable</em>'.
   * @see domain.MappingVariable
   * @generated
   */
  EClass getMappingVariable();

  /**
   * Returns the meta object for the attribute '{@link domain.MappingVariable#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.MappingVariable#getUid()
   * @see #getMappingVariable()
   * @generated
   */
  EAttribute getMappingVariable_Uid();

  /**
   * Returns the meta object for the reference '{@link domain.MappingVariable#getVariableRef <em>Variable Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Variable Ref</em>'.
   * @see domain.MappingVariable#getVariableRef()
   * @see #getMappingVariable()
   * @generated
   */
  EReference getMappingVariable_VariableRef();

  /**
   * Returns the meta object for the attribute '{@link domain.MappingVariable#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see domain.MappingVariable#getValue()
   * @see #getMappingVariable()
   * @generated
   */
  EAttribute getMappingVariable_Value();

  /**
   * Returns the meta object for class '{@link domain.ArtifactRef <em>Artifact Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Artifact Ref</em>'.
   * @see domain.ArtifactRef
   * @generated
   */
  EClass getArtifactRef();

  /**
   * Returns the meta object for the attribute '{@link domain.ArtifactRef#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.ArtifactRef#getUid()
   * @see #getArtifactRef()
   * @generated
   */
  EAttribute getArtifactRef_Uid();

  /**
   * Returns the meta object for the reference '{@link domain.ArtifactRef#getDomainArtifactRef <em>Domain Artifact Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Domain Artifact Ref</em>'.
   * @see domain.ArtifactRef#getDomainArtifactRef()
   * @see #getArtifactRef()
   * @generated
   */
  EReference getArtifactRef_DomainArtifactRef();

  /**
   * Returns the meta object for the reference '{@link domain.ArtifactRef#getArtifactRef <em>Artifact Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Artifact Ref</em>'.
   * @see domain.ArtifactRef#getArtifactRef()
   * @see #getArtifactRef()
   * @generated
   */
  EReference getArtifactRef_ArtifactRef();

  /**
   * Returns the meta object for class '{@link domain.TypeDefinition <em>Type Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Definition</em>'.
   * @see domain.TypeDefinition
   * @generated
   */
  EClass getTypeDefinition();

  /**
   * Returns the meta object for the attribute '{@link domain.TypeDefinition#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.TypeDefinition#getUid()
   * @see #getTypeDefinition()
   * @generated
   */
  EAttribute getTypeDefinition_Uid();

  /**
   * Returns the meta object for the containment reference list '{@link domain.TypeDefinition#getTypes <em>Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Types</em>'.
   * @see domain.TypeDefinition#getTypes()
   * @see #getTypeDefinition()
   * @generated
   */
  EReference getTypeDefinition_Types();

  /**
   * Returns the meta object for the reference '{@link domain.TypeDefinition#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Parent</em>'.
   * @see domain.TypeDefinition#getParent()
   * @see #getTypeDefinition()
   * @generated
   */
  EReference getTypeDefinition_Parent();

  /**
   * Returns the meta object for class '{@link domain.TypeElement <em>Type Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Element</em>'.
   * @see domain.TypeElement
   * @generated
   */
  EClass getTypeElement();

  /**
   * Returns the meta object for the attribute '{@link domain.TypeElement#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.TypeElement#getUid()
   * @see #getTypeElement()
   * @generated
   */
  EAttribute getTypeElement_Uid();

  /**
   * Returns the meta object for the attribute '{@link domain.TypeElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see domain.TypeElement#getName()
   * @see #getTypeElement()
   * @generated
   */
  EAttribute getTypeElement_Name();

  /**
   * Returns the meta object for the container reference '{@link domain.TypeElement#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Parent</em>'.
   * @see domain.TypeElement#getParent()
   * @see #getTypeElement()
   * @generated
   */
  EReference getTypeElement_Parent();

  /**
   * Returns the meta object for class '{@link domain.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see domain.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for the containment reference list '{@link domain.Type#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see domain.Type#getAttributes()
   * @see #getType()
   * @generated
   */
  EReference getType_Attributes();

  /**
   * Returns the meta object for the containment reference list '{@link domain.Type#getOperations <em>Operations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Operations</em>'.
   * @see domain.Type#getOperations()
   * @see #getType()
   * @generated
   */
  EReference getType_Operations();

  /**
   * Returns the meta object for the containment reference '{@link domain.Type#getExtension <em>Extension</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Extension</em>'.
   * @see domain.Type#getExtension()
   * @see #getType()
   * @generated
   */
  EReference getType_Extension();

  /**
   * Returns the meta object for class '{@link domain.TypeReference <em>Type Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Reference</em>'.
   * @see domain.TypeReference
   * @generated
   */
  EClass getTypeReference();

  /**
   * Returns the meta object for class '{@link domain.TypeExtension <em>Type Extension</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Extension</em>'.
   * @see domain.TypeExtension
   * @generated
   */
  EClass getTypeExtension();

  /**
   * Returns the meta object for the attribute '{@link domain.TypeExtension#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.TypeExtension#getUid()
   * @see #getTypeExtension()
   * @generated
   */
  EAttribute getTypeExtension_Uid();

  /**
   * Returns the meta object for the reference '{@link domain.TypeExtension#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source</em>'.
   * @see domain.TypeExtension#getSource()
   * @see #getTypeExtension()
   * @generated
   */
  EReference getTypeExtension_Source();

  /**
   * Returns the meta object for the reference '{@link domain.TypeExtension#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see domain.TypeExtension#getTarget()
   * @see #getTypeExtension()
   * @generated
   */
  EReference getTypeExtension_Target();

  /**
   * Returns the meta object for class '{@link domain.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute</em>'.
   * @see domain.Attribute
   * @generated
   */
  EClass getAttribute();

  /**
   * Returns the meta object for the attribute '{@link domain.Attribute#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.Attribute#getUid()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Uid();

  /**
   * Returns the meta object for the attribute '{@link domain.Attribute#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see domain.Attribute#getName()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Name();

  /**
   * Returns the meta object for the attribute '{@link domain.Attribute#isPk <em>Pk</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pk</em>'.
   * @see domain.Attribute#isPk()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Pk();

  /**
   * Returns the meta object for the container reference '{@link domain.Attribute#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Parent</em>'.
   * @see domain.Attribute#getParent()
   * @see #getAttribute()
   * @generated
   */
  EReference getAttribute_Parent();

  /**
   * Returns the meta object for class '{@link domain.Operation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operation</em>'.
   * @see domain.Operation
   * @generated
   */
  EClass getOperation();

  /**
   * Returns the meta object for the attribute '{@link domain.Operation#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.Operation#getUid()
   * @see #getOperation()
   * @generated
   */
  EAttribute getOperation_Uid();

  /**
   * Returns the meta object for the attribute '{@link domain.Operation#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see domain.Operation#getName()
   * @see #getOperation()
   * @generated
   */
  EAttribute getOperation_Name();

  /**
   * Returns the meta object for the container reference '{@link domain.Operation#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Parent</em>'.
   * @see domain.Operation#getParent()
   * @see #getOperation()
   * @generated
   */
  EReference getOperation_Parent();

  /**
   * Returns the meta object for the containment reference list '{@link domain.Operation#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see domain.Operation#getParameters()
   * @see #getOperation()
   * @generated
   */
  EReference getOperation_Parameters();

  /**
   * Returns the meta object for the containment reference '{@link domain.Operation#getReturnValue <em>Return Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Return Value</em>'.
   * @see domain.Operation#getReturnValue()
   * @see #getOperation()
   * @generated
   */
  EReference getOperation_ReturnValue();

  /**
   * Returns the meta object for class '{@link domain.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter</em>'.
   * @see domain.Parameter
   * @generated
   */
  EClass getParameter();

  /**
   * Returns the meta object for the attribute '{@link domain.Parameter#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.Parameter#getUid()
   * @see #getParameter()
   * @generated
   */
  EAttribute getParameter_Uid();

  /**
   * Returns the meta object for the attribute '{@link domain.Parameter#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see domain.Parameter#getName()
   * @see #getParameter()
   * @generated
   */
  EAttribute getParameter_Name();

  /**
   * Returns the meta object for the container reference '{@link domain.Parameter#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Parent</em>'.
   * @see domain.Parameter#getParent()
   * @see #getParameter()
   * @generated
   */
  EReference getParameter_Parent();

  /**
   * Returns the meta object for class '{@link domain.ReturnValue <em>Return Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Return Value</em>'.
   * @see domain.ReturnValue
   * @generated
   */
  EClass getReturnValue();

  /**
   * Returns the meta object for the attribute '{@link domain.ReturnValue#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.ReturnValue#getUid()
   * @see #getReturnValue()
   * @generated
   */
  EAttribute getReturnValue_Uid();

  /**
   * Returns the meta object for class '{@link domain.Enumarator <em>Enumarator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enumarator</em>'.
   * @see domain.Enumarator
   * @generated
   */
  EClass getEnumarator();

  /**
   * Returns the meta object for the containment reference list '{@link domain.Enumarator#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Values</em>'.
   * @see domain.Enumarator#getValues()
   * @see #getEnumarator()
   * @generated
   */
  EReference getEnumarator_Values();

  /**
   * Returns the meta object for class '{@link domain.EnumAttribute <em>Enum Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Attribute</em>'.
   * @see domain.EnumAttribute
   * @generated
   */
  EClass getEnumAttribute();

  /**
   * Returns the meta object for the attribute '{@link domain.EnumAttribute#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.EnumAttribute#getUid()
   * @see #getEnumAttribute()
   * @generated
   */
  EAttribute getEnumAttribute_Uid();

  /**
   * Returns the meta object for the container reference '{@link domain.EnumAttribute#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Parent</em>'.
   * @see domain.EnumAttribute#getParent()
   * @see #getEnumAttribute()
   * @generated
   */
  EReference getEnumAttribute_Parent();

  /**
   * Returns the meta object for the attribute '{@link domain.EnumAttribute#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see domain.EnumAttribute#getName()
   * @see #getEnumAttribute()
   * @generated
   */
  EAttribute getEnumAttribute_Name();

  /**
   * Returns the meta object for the attribute '{@link domain.EnumAttribute#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see domain.EnumAttribute#getValue()
   * @see #getEnumAttribute()
   * @generated
   */
  EAttribute getEnumAttribute_Value();

  /**
   * Returns the meta object for class '{@link domain.TypePointer <em>Type Pointer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Pointer</em>'.
   * @see domain.TypePointer
   * @generated
   */
  EClass getTypePointer();

  /**
   * Returns the meta object for the reference '{@link domain.TypePointer#getPackageRef <em>Package Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Package Ref</em>'.
   * @see domain.TypePointer#getPackageRef()
   * @see #getTypePointer()
   * @generated
   */
  EReference getTypePointer_PackageRef();

  /**
   * Returns the meta object for the reference '{@link domain.TypePointer#getTypeRef <em>Type Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type Ref</em>'.
   * @see domain.TypePointer#getTypeRef()
   * @see #getTypePointer()
   * @generated
   */
  EReference getTypePointer_TypeRef();

  /**
   * Returns the meta object for the attribute '{@link domain.TypePointer#getFakePackageName <em>Fake Package Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fake Package Name</em>'.
   * @see domain.TypePointer#getFakePackageName()
   * @see #getTypePointer()
   * @generated
   */
  EAttribute getTypePointer_FakePackageName();

  /**
   * Returns the meta object for the attribute '{@link domain.TypePointer#getFakeTypeName <em>Fake Type Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fake Type Name</em>'.
   * @see domain.TypePointer#getFakeTypeName()
   * @see #getTypePointer()
   * @generated
   */
  EAttribute getTypePointer_FakeTypeName();

  /**
   * Returns the meta object for class '{@link domain.TypesRepository <em>Types Repository</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Types Repository</em>'.
   * @see domain.TypesRepository
   * @generated
   */
  EClass getTypesRepository();

  /**
   * Returns the meta object for the attribute '{@link domain.TypesRepository#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.TypesRepository#getUid()
   * @see #getTypesRepository()
   * @generated
   */
  EAttribute getTypesRepository_Uid();

  /**
   * Returns the meta object for the containment reference '{@link domain.TypesRepository#getTypeDefinition <em>Type Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type Definition</em>'.
   * @see domain.TypesRepository#getTypeDefinition()
   * @see #getTypesRepository()
   * @generated
   */
  EReference getTypesRepository_TypeDefinition();

  /**
   * Returns the meta object for the reference '{@link domain.TypesRepository#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Parent</em>'.
   * @see domain.TypesRepository#getParent()
   * @see #getTypesRepository()
   * @generated
   */
  EReference getTypesRepository_Parent();

  /**
   * Returns the meta object for class '{@link domain.Types <em>Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Types</em>'.
   * @see domain.Types
   * @generated
   */
  EClass getTypes();

  /**
   * Returns the meta object for the attribute '{@link domain.Types#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.Types#getUid()
   * @see #getTypes()
   * @generated
   */
  EAttribute getTypes_Uid();

  /**
   * Returns the meta object for the container reference '{@link domain.Types#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Parent</em>'.
   * @see domain.Types#getParent()
   * @see #getTypes()
   * @generated
   */
  EReference getTypes_Parent();

  /**
   * Returns the meta object for the attribute '{@link domain.Types#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see domain.Types#getName()
   * @see #getTypes()
   * @generated
   */
  EAttribute getTypes_Name();

  /**
   * Returns the meta object for the containment reference list '{@link domain.Types#getPackages <em>Packages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Packages</em>'.
   * @see domain.Types#getPackages()
   * @see #getTypes()
   * @generated
   */
  EReference getTypes_Packages();

  /**
   * Returns the meta object for the containment reference list '{@link domain.Types#getBusinessPackages <em>Business Packages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Business Packages</em>'.
   * @see domain.Types#getBusinessPackages()
   * @see #getTypes()
   * @generated
   */
  EReference getTypes_BusinessPackages();

  /**
   * Returns the meta object for class '{@link domain.Primitive <em>Primitive</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Primitive</em>'.
   * @see domain.Primitive
   * @generated
   */
  EClass getPrimitive();

  /**
   * Returns the meta object for class '{@link domain.Package <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Package</em>'.
   * @see domain.Package
   * @generated
   */
  EClass getPackage();

  /**
   * Returns the meta object for the attribute '{@link domain.Package#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.Package#getUid()
   * @see #getPackage()
   * @generated
   */
  EAttribute getPackage_Uid();

  /**
   * Returns the meta object for the attribute '{@link domain.Package#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see domain.Package#getName()
   * @see #getPackage()
   * @generated
   */
  EAttribute getPackage_Name();

  /**
   * Returns the meta object for the reference '{@link domain.Package#getTypedefinition <em>Typedefinition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Typedefinition</em>'.
   * @see domain.Package#getTypedefinition()
   * @see #getPackage()
   * @generated
   */
  EReference getPackage_Typedefinition();

  /**
   * Returns the meta object for the container reference '{@link domain.Package#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Parent</em>'.
   * @see domain.Package#getParent()
   * @see #getPackage()
   * @generated
   */
  EReference getPackage_Parent();

  /**
   * Returns the meta object for class '{@link domain.BusinessPackage <em>Business Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Business Package</em>'.
   * @see domain.BusinessPackage
   * @generated
   */
  EClass getBusinessPackage();

  /**
   * Returns the meta object for the attribute '{@link domain.BusinessPackage#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.BusinessPackage#getUid()
   * @see #getBusinessPackage()
   * @generated
   */
  EAttribute getBusinessPackage_Uid();

  /**
   * Returns the meta object for the attribute '{@link domain.BusinessPackage#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see domain.BusinessPackage#getName()
   * @see #getBusinessPackage()
   * @generated
   */
  EAttribute getBusinessPackage_Name();

  /**
   * Returns the meta object for the reference '{@link domain.BusinessPackage#getBusinessobjects <em>Businessobjects</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Businessobjects</em>'.
   * @see domain.BusinessPackage#getBusinessobjects()
   * @see #getBusinessPackage()
   * @generated
   */
  EReference getBusinessPackage_Businessobjects();

  /**
   * Returns the meta object for the container reference '{@link domain.BusinessPackage#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Parent</em>'.
   * @see domain.BusinessPackage#getParent()
   * @see #getBusinessPackage()
   * @generated
   */
  EReference getBusinessPackage_Parent();

  /**
   * Returns the meta object for enum '{@link domain.PlatformLayers <em>Platform Layers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Platform Layers</em>'.
   * @see domain.PlatformLayers
   * @generated
   */
  EEnum getPlatformLayers();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  DomainFactory getDomainFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link domain.impl.DomainImpl <em>Domain</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.DomainImpl
     * @see domain.impl.DomainPackageImpl#getDomain()
     * @generated
     */
    EClass DOMAIN = eINSTANCE.getDomain();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOMAIN__UID = eINSTANCE.getDomain_Uid();

    /**
     * The meta object literal for the '<em><b>Domain Artifacts</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAIN__DOMAIN_ARTIFACTS = eINSTANCE.getDomain_DomainArtifacts();

    /**
     * The meta object literal for the '<em><b>Domain Types</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAIN__DOMAIN_TYPES = eINSTANCE.getDomain_DomainTypes();

    /**
     * The meta object literal for the '<em><b>Domain Applications</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAIN__DOMAIN_APPLICATIONS = eINSTANCE.getDomain_DomainApplications();

    /**
     * The meta object literal for the '{@link domain.impl.DomainArtifactsImpl <em>Artifacts</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.DomainArtifactsImpl
     * @see domain.impl.DomainPackageImpl#getDomainArtifacts()
     * @generated
     */
    EClass DOMAIN_ARTIFACTS = eINSTANCE.getDomainArtifacts();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOMAIN_ARTIFACTS__UID = eINSTANCE.getDomainArtifacts_Uid();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOMAIN_ARTIFACTS__NAME = eINSTANCE.getDomainArtifacts_Name();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAIN_ARTIFACTS__PARENT = eINSTANCE.getDomainArtifacts_Parent();

    /**
     * The meta object literal for the '<em><b>Domain Artifact</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAIN_ARTIFACTS__DOMAIN_ARTIFACT = eINSTANCE.getDomainArtifacts_DomainArtifact();

    /**
     * The meta object literal for the '{@link domain.impl.DomainTypesImpl <em>Types</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.DomainTypesImpl
     * @see domain.impl.DomainPackageImpl#getDomainTypes()
     * @generated
     */
    EClass DOMAIN_TYPES = eINSTANCE.getDomainTypes();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOMAIN_TYPES__UID = eINSTANCE.getDomainTypes_Uid();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOMAIN_TYPES__NAME = eINSTANCE.getDomainTypes_Name();

    /**
     * The meta object literal for the '<em><b>Typesrepository</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAIN_TYPES__TYPESREPOSITORY = eINSTANCE.getDomainTypes_Typesrepository();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAIN_TYPES__PARENT = eINSTANCE.getDomainTypes_Parent();

    /**
     * The meta object literal for the '{@link domain.impl.DomainApplicationsImpl <em>Applications</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.DomainApplicationsImpl
     * @see domain.impl.DomainPackageImpl#getDomainApplications()
     * @generated
     */
    EClass DOMAIN_APPLICATIONS = eINSTANCE.getDomainApplications();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOMAIN_APPLICATIONS__UID = eINSTANCE.getDomainApplications_Uid();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOMAIN_APPLICATIONS__NAME = eINSTANCE.getDomainApplications_Name();

    /**
     * The meta object literal for the '<em><b>Applications</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAIN_APPLICATIONS__APPLICATIONS = eINSTANCE.getDomainApplications_Applications();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAIN_APPLICATIONS__PARENT = eINSTANCE.getDomainApplications_Parent();

    /**
     * The meta object literal for the '{@link domain.impl.DomainApplicationImpl <em>Application</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.DomainApplicationImpl
     * @see domain.impl.DomainPackageImpl#getDomainApplication()
     * @generated
     */
    EClass DOMAIN_APPLICATION = eINSTANCE.getDomainApplication();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOMAIN_APPLICATION__UID = eINSTANCE.getDomainApplication_Uid();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOMAIN_APPLICATION__NAME = eINSTANCE.getDomainApplication_Name();

    /**
     * The meta object literal for the '<em><b>Application</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAIN_APPLICATION__APPLICATION = eINSTANCE.getDomainApplication_Application();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAIN_APPLICATION__PARENT = eINSTANCE.getDomainApplication_Parent();

    /**
     * The meta object literal for the '{@link domain.impl.DomainArtifactImpl <em>Artifact</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.DomainArtifactImpl
     * @see domain.impl.DomainPackageImpl#getDomainArtifact()
     * @generated
     */
    EClass DOMAIN_ARTIFACT = eINSTANCE.getDomainArtifact();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOMAIN_ARTIFACT__UID = eINSTANCE.getDomainArtifact_Uid();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOMAIN_ARTIFACT__NAME = eINSTANCE.getDomainArtifact_Name();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAIN_ARTIFACT__PARENT = eINSTANCE.getDomainArtifact_Parent();

    /**
     * The meta object literal for the '<em><b>Artifact</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAIN_ARTIFACT__ARTIFACT = eINSTANCE.getDomainArtifact_Artifact();

    /**
     * The meta object literal for the '{@link domain.impl.ORMEntityImpl <em>ORM Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.ORMEntityImpl
     * @see domain.impl.DomainPackageImpl#getORMEntity()
     * @generated
     */
    EClass ORM_ENTITY = eINSTANCE.getORMEntity();

    /**
     * The meta object literal for the '{@link domain.impl.JPAServiceImpl <em>JPA Service</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.JPAServiceImpl
     * @see domain.impl.DomainPackageImpl#getJPAService()
     * @generated
     */
    EClass JPA_SERVICE = eINSTANCE.getJPAService();

    /**
     * The meta object literal for the '{@link domain.impl.EJBServiceImpl <em>EJB Service</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.EJBServiceImpl
     * @see domain.impl.DomainPackageImpl#getEJBService()
     * @generated
     */
    EClass EJB_SERVICE = eINSTANCE.getEJBService();

    /**
     * The meta object literal for the '{@link domain.impl.ArtifactsImpl <em>Artifacts</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.ArtifactsImpl
     * @see domain.impl.DomainPackageImpl#getArtifacts()
     * @generated
     */
    EClass ARTIFACTS = eINSTANCE.getArtifacts();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARTIFACTS__UID = eINSTANCE.getArtifacts_Uid();

    /**
     * The meta object literal for the '<em><b>Artifacts</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARTIFACTS__ARTIFACTS = eINSTANCE.getArtifacts_Artifacts();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARTIFACTS__PARENT = eINSTANCE.getArtifacts_Parent();

    /**
     * The meta object literal for the '{@link domain.impl.ArtifactImpl <em>Artifact</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.ArtifactImpl
     * @see domain.impl.DomainPackageImpl#getArtifact()
     * @generated
     */
    EClass ARTIFACT = eINSTANCE.getArtifact();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARTIFACT__UID = eINSTANCE.getArtifact_Uid();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARTIFACT__NAME = eINSTANCE.getArtifact_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARTIFACT__DESCRIPTION = eINSTANCE.getArtifact_Description();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARTIFACT__PARENT = eINSTANCE.getArtifact_Parent();

    /**
     * The meta object literal for the '<em><b>Config Variables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARTIFACT__CONFIG_VARIABLES = eINSTANCE.getArtifact_ConfigVariables();

    /**
     * The meta object literal for the '<em><b>Model Query</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARTIFACT__MODEL_QUERY = eINSTANCE.getArtifact_ModelQuery();

    /**
     * The meta object literal for the '<em><b>Specifiers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARTIFACT__SPECIFIERS = eINSTANCE.getArtifact_Specifiers();

    /**
     * The meta object literal for the '<em><b>Template</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARTIFACT__TEMPLATE = eINSTANCE.getArtifact_Template();

    /**
     * The meta object literal for the '{@link domain.impl.ConfigVariableImpl <em>Config Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.ConfigVariableImpl
     * @see domain.impl.DomainPackageImpl#getConfigVariable()
     * @generated
     */
    EClass CONFIG_VARIABLE = eINSTANCE.getConfigVariable();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONFIG_VARIABLE__UID = eINSTANCE.getConfigVariable_Uid();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONFIG_VARIABLE__NAME = eINSTANCE.getConfigVariable_Name();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONFIG_VARIABLE__PARENT = eINSTANCE.getConfigVariable_Parent();

    /**
     * The meta object literal for the '{@link domain.impl.VariableImpl <em>Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.VariableImpl
     * @see domain.impl.DomainPackageImpl#getVariable()
     * @generated
     */
    EClass VARIABLE = eINSTANCE.getVariable();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE__UID = eINSTANCE.getVariable_Uid();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE__PARENT = eINSTANCE.getVariable_Parent();

    /**
     * The meta object literal for the '{@link domain.impl.SpecifierImpl <em>Specifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.SpecifierImpl
     * @see domain.impl.DomainPackageImpl#getSpecifier()
     * @generated
     */
    EClass SPECIFIER = eINSTANCE.getSpecifier();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SPECIFIER__UID = eINSTANCE.getSpecifier_Uid();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SPECIFIER__NAME = eINSTANCE.getSpecifier_Name();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SPECIFIER__PARENT = eINSTANCE.getSpecifier_Parent();

    /**
     * The meta object literal for the '<em><b>Options</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SPECIFIER__OPTIONS = eINSTANCE.getSpecifier_Options();

    /**
     * The meta object literal for the '{@link domain.impl.OptionImpl <em>Option</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.OptionImpl
     * @see domain.impl.DomainPackageImpl#getOption()
     * @generated
     */
    EClass OPTION = eINSTANCE.getOption();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPTION__UID = eINSTANCE.getOption_Uid();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPTION__PARENT = eINSTANCE.getOption_Parent();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPTION__VALUE = eINSTANCE.getOption_Value();

    /**
     * The meta object literal for the '{@link domain.impl.ApplicationImpl <em>Application</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.ApplicationImpl
     * @see domain.impl.DomainPackageImpl#getApplication()
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
     * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLICATION__PARENT = eINSTANCE.getApplication_Parent();

    /**
     * The meta object literal for the '{@link domain.impl.ApplicationRecipesImpl <em>Application Recipes</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.ApplicationRecipesImpl
     * @see domain.impl.DomainPackageImpl#getApplicationRecipes()
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
     * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLICATION_RECIPES__PARENT = eINSTANCE.getApplicationRecipes_Parent();

    /**
     * The meta object literal for the '<em><b>Recipes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLICATION_RECIPES__RECIPES = eINSTANCE.getApplicationRecipes_Recipes();

    /**
     * The meta object literal for the '{@link domain.impl.ApplicationRecipeImpl <em>Application Recipe</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.ApplicationRecipeImpl
     * @see domain.impl.DomainPackageImpl#getApplicationRecipe()
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
     * The meta object literal for the '<em><b>Recipes</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLICATION_RECIPE__RECIPES = eINSTANCE.getApplicationRecipe_Recipes();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLICATION_RECIPE__PARENT = eINSTANCE.getApplicationRecipe_Parent();

    /**
     * The meta object literal for the '{@link domain.impl.ApplicationMappersImpl <em>Application Mappers</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.ApplicationMappersImpl
     * @see domain.impl.DomainPackageImpl#getApplicationMappers()
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
     * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLICATION_MAPPERS__PARENT = eINSTANCE.getApplicationMappers_Parent();

    /**
     * The meta object literal for the '<em><b>Mappers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLICATION_MAPPERS__MAPPERS = eINSTANCE.getApplicationMappers_Mappers();

    /**
     * The meta object literal for the '{@link domain.impl.ApplicationMapperImpl <em>Application Mapper</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.ApplicationMapperImpl
     * @see domain.impl.DomainPackageImpl#getApplicationMapper()
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

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLICATION_MAPPER__PARENT = eINSTANCE.getApplicationMapper_Parent();

    /**
     * The meta object literal for the '{@link domain.impl.BusinessObjectsImpl <em>Business Objects</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.BusinessObjectsImpl
     * @see domain.impl.DomainPackageImpl#getBusinessObjects()
     * @generated
     */
    EClass BUSINESS_OBJECTS = eINSTANCE.getBusinessObjects();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUSINESS_OBJECTS__UID = eINSTANCE.getBusinessObjects_Uid();

    /**
     * The meta object literal for the '<em><b>Business Object</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUSINESS_OBJECTS__BUSINESS_OBJECT = eINSTANCE.getBusinessObjects_BusinessObject();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUSINESS_OBJECTS__PARENT = eINSTANCE.getBusinessObjects_Parent();

    /**
     * The meta object literal for the '{@link domain.impl.BusinessObjectImpl <em>Business Object</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.BusinessObjectImpl
     * @see domain.impl.DomainPackageImpl#getBusinessObject()
     * @generated
     */
    EClass BUSINESS_OBJECT = eINSTANCE.getBusinessObject();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUSINESS_OBJECT__UID = eINSTANCE.getBusinessObject_Uid();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUSINESS_OBJECT__NAME = eINSTANCE.getBusinessObject_Name();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUSINESS_OBJECT__PARENT = eINSTANCE.getBusinessObject_Parent();

    /**
     * The meta object literal for the '<em><b>Create Methods</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUSINESS_OBJECT__CREATE_METHODS = eINSTANCE.getBusinessObject_CreateMethods();

    /**
     * The meta object literal for the '<em><b>Insert Methods</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUSINESS_OBJECT__INSERT_METHODS = eINSTANCE.getBusinessObject_InsertMethods();

    /**
     * The meta object literal for the '<em><b>Update Methods</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUSINESS_OBJECT__UPDATE_METHODS = eINSTANCE.getBusinessObject_UpdateMethods();

    /**
     * The meta object literal for the '<em><b>Remove Methods</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUSINESS_OBJECT__REMOVE_METHODS = eINSTANCE.getBusinessObject_RemoveMethods();

    /**
     * The meta object literal for the '<em><b>Search Methods</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUSINESS_OBJECT__SEARCH_METHODS = eINSTANCE.getBusinessObject_SearchMethods();

    /**
     * The meta object literal for the '<em><b>Others Methods</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUSINESS_OBJECT__OTHERS_METHODS = eINSTANCE.getBusinessObject_OthersMethods();

    /**
     * The meta object literal for the '{@link domain.impl.BusinessMethodImpl <em>Business Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.BusinessMethodImpl
     * @see domain.impl.DomainPackageImpl#getBusinessMethod()
     * @generated
     */
    EClass BUSINESS_METHOD = eINSTANCE.getBusinessMethod();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUSINESS_METHOD__UID = eINSTANCE.getBusinessMethod_Uid();

    /**
     * The meta object literal for the '<em><b>Method Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUSINESS_METHOD__METHOD_REF = eINSTANCE.getBusinessMethod_MethodRef();

    /**
     * The meta object literal for the '<em><b>Fake Method</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUSINESS_METHOD__FAKE_METHOD = eINSTANCE.getBusinessMethod_FakeMethod();

    /**
     * The meta object literal for the '{@link domain.impl.CreateMethodImpl <em>Create Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.CreateMethodImpl
     * @see domain.impl.DomainPackageImpl#getCreateMethod()
     * @generated
     */
    EClass CREATE_METHOD = eINSTANCE.getCreateMethod();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CREATE_METHOD__PARENT = eINSTANCE.getCreateMethod_Parent();

    /**
     * The meta object literal for the '{@link domain.impl.InsertMethodImpl <em>Insert Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.InsertMethodImpl
     * @see domain.impl.DomainPackageImpl#getInsertMethod()
     * @generated
     */
    EClass INSERT_METHOD = eINSTANCE.getInsertMethod();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSERT_METHOD__PARENT = eINSTANCE.getInsertMethod_Parent();

    /**
     * The meta object literal for the '{@link domain.impl.UpdateMethodImpl <em>Update Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.UpdateMethodImpl
     * @see domain.impl.DomainPackageImpl#getUpdateMethod()
     * @generated
     */
    EClass UPDATE_METHOD = eINSTANCE.getUpdateMethod();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UPDATE_METHOD__PARENT = eINSTANCE.getUpdateMethod_Parent();

    /**
     * The meta object literal for the '{@link domain.impl.RemoveMethodImpl <em>Remove Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.RemoveMethodImpl
     * @see domain.impl.DomainPackageImpl#getRemoveMethod()
     * @generated
     */
    EClass REMOVE_METHOD = eINSTANCE.getRemoveMethod();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REMOVE_METHOD__PARENT = eINSTANCE.getRemoveMethod_Parent();

    /**
     * The meta object literal for the '{@link domain.impl.SearchMethodImpl <em>Search Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.SearchMethodImpl
     * @see domain.impl.DomainPackageImpl#getSearchMethod()
     * @generated
     */
    EClass SEARCH_METHOD = eINSTANCE.getSearchMethod();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEARCH_METHOD__PARENT = eINSTANCE.getSearchMethod_Parent();

    /**
     * The meta object literal for the '{@link domain.impl.OtherMethodImpl <em>Other Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.OtherMethodImpl
     * @see domain.impl.DomainPackageImpl#getOtherMethod()
     * @generated
     */
    EClass OTHER_METHOD = eINSTANCE.getOtherMethod();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OTHER_METHOD__PARENT = eINSTANCE.getOtherMethod_Parent();

    /**
     * The meta object literal for the '{@link domain.impl.MappersImpl <em>Mappers</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.MappersImpl
     * @see domain.impl.DomainPackageImpl#getMappers()
     * @generated
     */
    EClass MAPPERS = eINSTANCE.getMappers();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAPPERS__UID = eINSTANCE.getMappers_Uid();

    /**
     * The meta object literal for the '<em><b>Mappers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAPPERS__MAPPERS = eINSTANCE.getMappers_Mappers();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAPPERS__PARENT = eINSTANCE.getMappers_Parent();

    /**
     * The meta object literal for the '{@link domain.impl.MapperImpl <em>Mapper</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.MapperImpl
     * @see domain.impl.DomainPackageImpl#getMapper()
     * @generated
     */
    EClass MAPPER = eINSTANCE.getMapper();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAPPER__UID = eINSTANCE.getMapper_Uid();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAPPER__PARENT = eINSTANCE.getMapper_Parent();

    /**
     * The meta object literal for the '<em><b>Service Layer</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAPPER__SERVICE_LAYER = eINSTANCE.getMapper_ServiceLayer();

    /**
     * The meta object literal for the '<em><b>Ui Layer</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAPPER__UI_LAYER = eINSTANCE.getMapper_UiLayer();

    /**
     * The meta object literal for the '{@link domain.impl.JavaMapperImpl <em>Java Mapper</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.JavaMapperImpl
     * @see domain.impl.DomainPackageImpl#getJavaMapper()
     * @generated
     */
    EClass JAVA_MAPPER = eINSTANCE.getJavaMapper();

    /**
     * The meta object literal for the '<em><b>Mapped To Package Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JAVA_MAPPER__MAPPED_TO_PACKAGE_NAME = eINSTANCE.getJavaMapper_MappedToPackageName();

    /**
     * The meta object literal for the '<em><b>Mapped To Class Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JAVA_MAPPER__MAPPED_TO_CLASS_NAME = eINSTANCE.getJavaMapper_MappedToClassName();

    /**
     * The meta object literal for the '<em><b>Artifact Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JAVA_MAPPER__ARTIFACT_ID = eINSTANCE.getJavaMapper_ArtifactId();

    /**
     * The meta object literal for the '<em><b>Group Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JAVA_MAPPER__GROUP_ID = eINSTANCE.getJavaMapper_GroupId();

    /**
     * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JAVA_MAPPER__VERSION = eINSTANCE.getJavaMapper_Version();

    /**
     * The meta object literal for the '<em><b>Library Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JAVA_MAPPER__LIBRARY_NAME = eINSTANCE.getJavaMapper_LibraryName();

    /**
     * The meta object literal for the '{@link domain.impl.RecipesImpl <em>Recipes</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.RecipesImpl
     * @see domain.impl.DomainPackageImpl#getRecipes()
     * @generated
     */
    EClass RECIPES = eINSTANCE.getRecipes();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RECIPES__UID = eINSTANCE.getRecipes_Uid();

    /**
     * The meta object literal for the '<em><b>Recipe</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RECIPES__RECIPE = eINSTANCE.getRecipes_Recipe();

    /**
     * The meta object literal for the '<em><b>Configurations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RECIPES__CONFIGURATIONS = eINSTANCE.getRecipes_Configurations();

    /**
     * The meta object literal for the '<em><b>Infrastructures</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RECIPES__INFRASTRUCTURES = eINSTANCE.getRecipes_Infrastructures();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RECIPES__PARENT = eINSTANCE.getRecipes_Parent();

    /**
     * The meta object literal for the '{@link domain.impl.UsingMappersImpl <em>Using Mappers</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.UsingMappersImpl
     * @see domain.impl.DomainPackageImpl#getUsingMappers()
     * @generated
     */
    EClass USING_MAPPERS = eINSTANCE.getUsingMappers();

    /**
     * The meta object literal for the '<em><b>Mappers</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USING_MAPPERS__MAPPERS = eINSTANCE.getUsingMappers_Mappers();

    /**
     * The meta object literal for the '{@link domain.impl.IngredientImpl <em>Ingredient</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.IngredientImpl
     * @see domain.impl.DomainPackageImpl#getIngredient()
     * @generated
     */
    EClass INGREDIENT = eINSTANCE.getIngredient();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INGREDIENT__UID = eINSTANCE.getIngredient_Uid();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INGREDIENT__NAME = eINSTANCE.getIngredient_Name();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INGREDIENT__PARENT = eINSTANCE.getIngredient_Parent();

    /**
     * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INGREDIENT__COMPONENTS = eINSTANCE.getIngredient_Components();

    /**
     * The meta object literal for the '<em><b>Layer</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INGREDIENT__LAYER = eINSTANCE.getIngredient_Layer();

    /**
     * The meta object literal for the '{@link domain.impl.InfrastructureImpl <em>Infrastructure</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.InfrastructureImpl
     * @see domain.impl.DomainPackageImpl#getInfrastructure()
     * @generated
     */
    EClass INFRASTRUCTURE = eINSTANCE.getInfrastructure();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INFRASTRUCTURE__UID = eINSTANCE.getInfrastructure_Uid();

    /**
     * The meta object literal for the '<em><b>Recipe</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INFRASTRUCTURE__RECIPE = eINSTANCE.getInfrastructure_Recipe();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INFRASTRUCTURE__NAME = eINSTANCE.getInfrastructure_Name();

    /**
     * The meta object literal for the '<em><b>Recipe Config</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INFRASTRUCTURE__RECIPE_CONFIG = eINSTANCE.getInfrastructure_RecipeConfig();

    /**
     * The meta object literal for the '{@link domain.impl.RecipeImpl <em>Recipe</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.RecipeImpl
     * @see domain.impl.DomainPackageImpl#getRecipe()
     * @generated
     */
    EClass RECIPE = eINSTANCE.getRecipe();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RECIPE__UID = eINSTANCE.getRecipe_Uid();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RECIPE__PARENT = eINSTANCE.getRecipe_Parent();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RECIPE__NAME = eINSTANCE.getRecipe_Name();

    /**
     * The meta object literal for the '<em><b>Ingredients</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RECIPE__INGREDIENTS = eINSTANCE.getRecipe_Ingredients();

    /**
     * The meta object literal for the '<em><b>Infrastructures</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RECIPE__INFRASTRUCTURES = eINSTANCE.getRecipe_Infrastructures();

    /**
     * The meta object literal for the '{@link domain.impl.ComponentImpl <em>Component</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.ComponentImpl
     * @see domain.impl.DomainPackageImpl#getComponent()
     * @generated
     */
    EClass COMPONENT = eINSTANCE.getComponent();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPONENT__UID = eINSTANCE.getComponent_Uid();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPONENT__NAME = eINSTANCE.getComponent_Name();

    /**
     * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT__COMPONENTS = eINSTANCE.getComponent_Components();

    /**
     * The meta object literal for the '<em><b>Mappers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT__MAPPERS = eINSTANCE.getComponent_Mappers();

    /**
     * The meta object literal for the '<em><b>Build Script</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPONENT__BUILD_SCRIPT = eINSTANCE.getComponent_BuildScript();

    /**
     * The meta object literal for the '<em><b>Deploy Script</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPONENT__DEPLOY_SCRIPT = eINSTANCE.getComponent_DeployScript();

    /**
     * The meta object literal for the '{@link domain.impl.JavaComponentImpl <em>Java Component</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.JavaComponentImpl
     * @see domain.impl.DomainPackageImpl#getJavaComponent()
     * @generated
     */
    EClass JAVA_COMPONENT = eINSTANCE.getJavaComponent();

    /**
     * The meta object literal for the '<em><b>Artifact Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JAVA_COMPONENT__ARTIFACT_ID = eINSTANCE.getJavaComponent_ArtifactId();

    /**
     * The meta object literal for the '<em><b>Group Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JAVA_COMPONENT__GROUP_ID = eINSTANCE.getJavaComponent_GroupId();

    /**
     * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JAVA_COMPONENT__VERSION = eINSTANCE.getJavaComponent_Version();

    /**
     * The meta object literal for the '<em><b>Base Package</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JAVA_COMPONENT__BASE_PACKAGE = eINSTANCE.getJavaComponent_BasePackage();

    /**
     * The meta object literal for the '{@link domain.impl.ModelMapperImpl <em>Model Mapper</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.ModelMapperImpl
     * @see domain.impl.DomainPackageImpl#getModelMapper()
     * @generated
     */
    EClass MODEL_MAPPER = eINSTANCE.getModelMapper();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL_MAPPER__NAME = eINSTANCE.getModelMapper_Name();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_MAPPER__PARENT = eINSTANCE.getModelMapper_Parent();

    /**
     * The meta object literal for the '<em><b>Specifiers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_MAPPER__SPECIFIERS = eINSTANCE.getModelMapper_Specifiers();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_MAPPER__VARIABLES = eINSTANCE.getModelMapper_Variables();

    /**
     * The meta object literal for the '{@link domain.impl.ConfigurationImpl <em>Configuration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.ConfigurationImpl
     * @see domain.impl.DomainPackageImpl#getConfiguration()
     * @generated
     */
    EClass CONFIGURATION = eINSTANCE.getConfiguration();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONFIGURATION__UID = eINSTANCE.getConfiguration_Uid();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONFIGURATION__NAME = eINSTANCE.getConfiguration_Name();

    /**
     * The meta object literal for the '<em><b>Infrastructure</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONFIGURATION__INFRASTRUCTURE = eINSTANCE.getConfiguration_Infrastructure();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONFIGURATION__PROPERTIES = eINSTANCE.getConfiguration_Properties();

    /**
     * The meta object literal for the '<em><b>Config Extension</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONFIGURATION__CONFIG_EXTENSION = eINSTANCE.getConfiguration_ConfigExtension();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONFIGURATION__PARENT = eINSTANCE.getConfiguration_Parent();

    /**
     * The meta object literal for the '{@link domain.impl.PropertyImpl <em>Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.PropertyImpl
     * @see domain.impl.DomainPackageImpl#getProperty()
     * @generated
     */
    EClass PROPERTY = eINSTANCE.getProperty();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY__UID = eINSTANCE.getProperty_Uid();

    /**
     * The meta object literal for the '<em><b>Conf Var Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY__CONF_VAR_REF = eINSTANCE.getProperty_ConfVarRef();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY__VALUE = eINSTANCE.getProperty_Value();

    /**
     * The meta object literal for the '<em><b>Fake Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY__FAKE_NAME = eINSTANCE.getProperty_FakeName();

    /**
     * The meta object literal for the '{@link domain.impl.MappingSpecifierImpl <em>Mapping Specifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.MappingSpecifierImpl
     * @see domain.impl.DomainPackageImpl#getMappingSpecifier()
     * @generated
     */
    EClass MAPPING_SPECIFIER = eINSTANCE.getMappingSpecifier();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAPPING_SPECIFIER__UID = eINSTANCE.getMappingSpecifier_Uid();

    /**
     * The meta object literal for the '<em><b>Specifier Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAPPING_SPECIFIER__SPECIFIER_REF = eINSTANCE.getMappingSpecifier_SpecifierRef();

    /**
     * The meta object literal for the '<em><b>Value Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAPPING_SPECIFIER__VALUE_REF = eINSTANCE.getMappingSpecifier_ValueRef();

    /**
     * The meta object literal for the '{@link domain.impl.MappingVariableImpl <em>Mapping Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.MappingVariableImpl
     * @see domain.impl.DomainPackageImpl#getMappingVariable()
     * @generated
     */
    EClass MAPPING_VARIABLE = eINSTANCE.getMappingVariable();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAPPING_VARIABLE__UID = eINSTANCE.getMappingVariable_Uid();

    /**
     * The meta object literal for the '<em><b>Variable Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAPPING_VARIABLE__VARIABLE_REF = eINSTANCE.getMappingVariable_VariableRef();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAPPING_VARIABLE__VALUE = eINSTANCE.getMappingVariable_Value();

    /**
     * The meta object literal for the '{@link domain.impl.ArtifactRefImpl <em>Artifact Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.ArtifactRefImpl
     * @see domain.impl.DomainPackageImpl#getArtifactRef()
     * @generated
     */
    EClass ARTIFACT_REF = eINSTANCE.getArtifactRef();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARTIFACT_REF__UID = eINSTANCE.getArtifactRef_Uid();

    /**
     * The meta object literal for the '<em><b>Domain Artifact Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARTIFACT_REF__DOMAIN_ARTIFACT_REF = eINSTANCE.getArtifactRef_DomainArtifactRef();

    /**
     * The meta object literal for the '<em><b>Artifact Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARTIFACT_REF__ARTIFACT_REF = eINSTANCE.getArtifactRef_ArtifactRef();

    /**
     * The meta object literal for the '{@link domain.impl.TypeDefinitionImpl <em>Type Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.TypeDefinitionImpl
     * @see domain.impl.DomainPackageImpl#getTypeDefinition()
     * @generated
     */
    EClass TYPE_DEFINITION = eINSTANCE.getTypeDefinition();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_DEFINITION__UID = eINSTANCE.getTypeDefinition_Uid();

    /**
     * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_DEFINITION__TYPES = eINSTANCE.getTypeDefinition_Types();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_DEFINITION__PARENT = eINSTANCE.getTypeDefinition_Parent();

    /**
     * The meta object literal for the '{@link domain.impl.TypeElementImpl <em>Type Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.TypeElementImpl
     * @see domain.impl.DomainPackageImpl#getTypeElement()
     * @generated
     */
    EClass TYPE_ELEMENT = eINSTANCE.getTypeElement();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_ELEMENT__UID = eINSTANCE.getTypeElement_Uid();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_ELEMENT__NAME = eINSTANCE.getTypeElement_Name();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_ELEMENT__PARENT = eINSTANCE.getTypeElement_Parent();

    /**
     * The meta object literal for the '{@link domain.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.TypeImpl
     * @see domain.impl.DomainPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE__ATTRIBUTES = eINSTANCE.getType_Attributes();

    /**
     * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE__OPERATIONS = eINSTANCE.getType_Operations();

    /**
     * The meta object literal for the '<em><b>Extension</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE__EXTENSION = eINSTANCE.getType_Extension();

    /**
     * The meta object literal for the '{@link domain.impl.TypeReferenceImpl <em>Type Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.TypeReferenceImpl
     * @see domain.impl.DomainPackageImpl#getTypeReference()
     * @generated
     */
    EClass TYPE_REFERENCE = eINSTANCE.getTypeReference();

    /**
     * The meta object literal for the '{@link domain.impl.TypeExtensionImpl <em>Type Extension</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.TypeExtensionImpl
     * @see domain.impl.DomainPackageImpl#getTypeExtension()
     * @generated
     */
    EClass TYPE_EXTENSION = eINSTANCE.getTypeExtension();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_EXTENSION__UID = eINSTANCE.getTypeExtension_Uid();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_EXTENSION__SOURCE = eINSTANCE.getTypeExtension_Source();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_EXTENSION__TARGET = eINSTANCE.getTypeExtension_Target();

    /**
     * The meta object literal for the '{@link domain.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.AttributeImpl
     * @see domain.impl.DomainPackageImpl#getAttribute()
     * @generated
     */
    EClass ATTRIBUTE = eINSTANCE.getAttribute();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__UID = eINSTANCE.getAttribute_Uid();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

    /**
     * The meta object literal for the '<em><b>Pk</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__PK = eINSTANCE.getAttribute_Pk();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE__PARENT = eINSTANCE.getAttribute_Parent();

    /**
     * The meta object literal for the '{@link domain.impl.OperationImpl <em>Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.OperationImpl
     * @see domain.impl.DomainPackageImpl#getOperation()
     * @generated
     */
    EClass OPERATION = eINSTANCE.getOperation();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATION__UID = eINSTANCE.getOperation_Uid();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATION__NAME = eINSTANCE.getOperation_Name();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION__PARENT = eINSTANCE.getOperation_Parent();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION__PARAMETERS = eINSTANCE.getOperation_Parameters();

    /**
     * The meta object literal for the '<em><b>Return Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION__RETURN_VALUE = eINSTANCE.getOperation_ReturnValue();

    /**
     * The meta object literal for the '{@link domain.impl.ParameterImpl <em>Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.ParameterImpl
     * @see domain.impl.DomainPackageImpl#getParameter()
     * @generated
     */
    EClass PARAMETER = eINSTANCE.getParameter();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER__UID = eINSTANCE.getParameter_Uid();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER__PARENT = eINSTANCE.getParameter_Parent();

    /**
     * The meta object literal for the '{@link domain.impl.ReturnValueImpl <em>Return Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.ReturnValueImpl
     * @see domain.impl.DomainPackageImpl#getReturnValue()
     * @generated
     */
    EClass RETURN_VALUE = eINSTANCE.getReturnValue();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RETURN_VALUE__UID = eINSTANCE.getReturnValue_Uid();

    /**
     * The meta object literal for the '{@link domain.impl.EnumaratorImpl <em>Enumarator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.EnumaratorImpl
     * @see domain.impl.DomainPackageImpl#getEnumarator()
     * @generated
     */
    EClass ENUMARATOR = eINSTANCE.getEnumarator();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUMARATOR__VALUES = eINSTANCE.getEnumarator_Values();

    /**
     * The meta object literal for the '{@link domain.impl.EnumAttributeImpl <em>Enum Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.EnumAttributeImpl
     * @see domain.impl.DomainPackageImpl#getEnumAttribute()
     * @generated
     */
    EClass ENUM_ATTRIBUTE = eINSTANCE.getEnumAttribute();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM_ATTRIBUTE__UID = eINSTANCE.getEnumAttribute_Uid();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM_ATTRIBUTE__PARENT = eINSTANCE.getEnumAttribute_Parent();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM_ATTRIBUTE__NAME = eINSTANCE.getEnumAttribute_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM_ATTRIBUTE__VALUE = eINSTANCE.getEnumAttribute_Value();

    /**
     * The meta object literal for the '{@link domain.impl.TypePointerImpl <em>Type Pointer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.TypePointerImpl
     * @see domain.impl.DomainPackageImpl#getTypePointer()
     * @generated
     */
    EClass TYPE_POINTER = eINSTANCE.getTypePointer();

    /**
     * The meta object literal for the '<em><b>Package Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_POINTER__PACKAGE_REF = eINSTANCE.getTypePointer_PackageRef();

    /**
     * The meta object literal for the '<em><b>Type Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_POINTER__TYPE_REF = eINSTANCE.getTypePointer_TypeRef();

    /**
     * The meta object literal for the '<em><b>Fake Package Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_POINTER__FAKE_PACKAGE_NAME = eINSTANCE.getTypePointer_FakePackageName();

    /**
     * The meta object literal for the '<em><b>Fake Type Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_POINTER__FAKE_TYPE_NAME = eINSTANCE.getTypePointer_FakeTypeName();

    /**
     * The meta object literal for the '{@link domain.impl.TypesRepositoryImpl <em>Types Repository</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.TypesRepositoryImpl
     * @see domain.impl.DomainPackageImpl#getTypesRepository()
     * @generated
     */
    EClass TYPES_REPOSITORY = eINSTANCE.getTypesRepository();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPES_REPOSITORY__UID = eINSTANCE.getTypesRepository_Uid();

    /**
     * The meta object literal for the '<em><b>Type Definition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPES_REPOSITORY__TYPE_DEFINITION = eINSTANCE.getTypesRepository_TypeDefinition();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPES_REPOSITORY__PARENT = eINSTANCE.getTypesRepository_Parent();

    /**
     * The meta object literal for the '{@link domain.impl.TypesImpl <em>Types</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.TypesImpl
     * @see domain.impl.DomainPackageImpl#getTypes()
     * @generated
     */
    EClass TYPES = eINSTANCE.getTypes();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPES__UID = eINSTANCE.getTypes_Uid();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPES__PARENT = eINSTANCE.getTypes_Parent();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPES__NAME = eINSTANCE.getTypes_Name();

    /**
     * The meta object literal for the '<em><b>Packages</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPES__PACKAGES = eINSTANCE.getTypes_Packages();

    /**
     * The meta object literal for the '<em><b>Business Packages</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPES__BUSINESS_PACKAGES = eINSTANCE.getTypes_BusinessPackages();

    /**
     * The meta object literal for the '{@link domain.impl.PrimitiveImpl <em>Primitive</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.PrimitiveImpl
     * @see domain.impl.DomainPackageImpl#getPrimitive()
     * @generated
     */
    EClass PRIMITIVE = eINSTANCE.getPrimitive();

    /**
     * The meta object literal for the '{@link domain.impl.PackageImpl <em>Package</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.PackageImpl
     * @see domain.impl.DomainPackageImpl#getPackage()
     * @generated
     */
    EClass PACKAGE = eINSTANCE.getPackage();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PACKAGE__UID = eINSTANCE.getPackage_Uid();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PACKAGE__NAME = eINSTANCE.getPackage_Name();

    /**
     * The meta object literal for the '<em><b>Typedefinition</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE__TYPEDEFINITION = eINSTANCE.getPackage_Typedefinition();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE__PARENT = eINSTANCE.getPackage_Parent();

    /**
     * The meta object literal for the '{@link domain.impl.BusinessPackageImpl <em>Business Package</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.BusinessPackageImpl
     * @see domain.impl.DomainPackageImpl#getBusinessPackage()
     * @generated
     */
    EClass BUSINESS_PACKAGE = eINSTANCE.getBusinessPackage();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUSINESS_PACKAGE__UID = eINSTANCE.getBusinessPackage_Uid();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUSINESS_PACKAGE__NAME = eINSTANCE.getBusinessPackage_Name();

    /**
     * The meta object literal for the '<em><b>Businessobjects</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUSINESS_PACKAGE__BUSINESSOBJECTS = eINSTANCE.getBusinessPackage_Businessobjects();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUSINESS_PACKAGE__PARENT = eINSTANCE.getBusinessPackage_Parent();

    /**
     * The meta object literal for the '{@link domain.PlatformLayers <em>Platform Layers</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.PlatformLayers
     * @see domain.impl.DomainPackageImpl#getPlatformLayers()
     * @generated
     */
    EEnum PLATFORM_LAYERS = eINSTANCE.getPlatformLayers();

  }

} //DomainPackage
