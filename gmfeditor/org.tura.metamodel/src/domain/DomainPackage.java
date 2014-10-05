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
   * The meta object id for the '{@link domain.impl.HTMLLayerHolderImpl <em>HTML Layer Holder</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.HTMLLayerHolderImpl
   * @see domain.impl.DomainPackageImpl#getHTMLLayerHolder()
   * @generated
   */
  int HTML_LAYER_HOLDER = 1;

  /**
   * The feature id for the '<em><b>Columns</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HTML_LAYER_HOLDER__COLUMNS = 0;

  /**
   * The number of structural features of the '<em>HTML Layer Holder</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HTML_LAYER_HOLDER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link domain.impl.CategorizedImpl <em>Categorized</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.CategorizedImpl
   * @see domain.impl.DomainPackageImpl#getCategorized()
   * @generated
   */
  int CATEGORIZED = 2;

  /**
   * The feature id for the '<em><b>Classifiers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORIZED__CLASSIFIERS = 0;

  /**
   * The number of structural features of the '<em>Categorized</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORIZED_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link domain.impl.ClassifierImpl <em>Classifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.ClassifierImpl
   * @see domain.impl.DomainPackageImpl#getClassifier()
   * @generated
   */
  int CLASSIFIER = 3;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER__UID = 0;

  /**
   * The feature id for the '<em><b>Hint</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER__HINT = 1;

  /**
   * The number of structural features of the '<em>Classifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link domain.impl.DomainArtifactsImpl <em>Artifacts</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.DomainArtifactsImpl
   * @see domain.impl.DomainPackageImpl#getDomainArtifacts()
   * @generated
   */
  int DOMAIN_ARTIFACTS = 4;

  /**
   * The feature id for the '<em><b>Columns</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_ARTIFACTS__COLUMNS = HTML_LAYER_HOLDER__COLUMNS;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_ARTIFACTS__UID = HTML_LAYER_HOLDER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_ARTIFACTS__NAME = HTML_LAYER_HOLDER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_ARTIFACTS__PARENT = HTML_LAYER_HOLDER_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Domain Artifact</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_ARTIFACTS__DOMAIN_ARTIFACT = HTML_LAYER_HOLDER_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Artifacts</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_ARTIFACTS_FEATURE_COUNT = HTML_LAYER_HOLDER_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link domain.impl.DomainTypesImpl <em>Types</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.DomainTypesImpl
   * @see domain.impl.DomainPackageImpl#getDomainTypes()
   * @generated
   */
  int DOMAIN_TYPES = 5;

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
  int DOMAIN_APPLICATIONS = 6;

  /**
   * The feature id for the '<em><b>Columns</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_APPLICATIONS__COLUMNS = HTML_LAYER_HOLDER__COLUMNS;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_APPLICATIONS__UID = HTML_LAYER_HOLDER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_APPLICATIONS__NAME = HTML_LAYER_HOLDER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Applications</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_APPLICATIONS__APPLICATIONS = HTML_LAYER_HOLDER_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_APPLICATIONS__PARENT = HTML_LAYER_HOLDER_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Applications</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_APPLICATIONS_FEATURE_COUNT = HTML_LAYER_HOLDER_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link domain.impl.DomainApplicationImpl <em>Application</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.DomainApplicationImpl
   * @see domain.impl.DomainPackageImpl#getDomainApplication()
   * @generated
   */
  int DOMAIN_APPLICATION = 7;

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
  int DOMAIN_ARTIFACT = 8;

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
  int ORM_ENTITY = 9;

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
  int JPA_SERVICE = 10;

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
  int EJB_SERVICE = 11;

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
   * The meta object id for the '{@link domain.impl.ContinuousIintegrationImpl <em>Continuous Iintegration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.ContinuousIintegrationImpl
   * @see domain.impl.DomainPackageImpl#getContinuousIintegration()
   * @generated
   */
  int CONTINUOUS_IINTEGRATION = 12;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTINUOUS_IINTEGRATION__UID = DOMAIN_ARTIFACT__UID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTINUOUS_IINTEGRATION__NAME = DOMAIN_ARTIFACT__NAME;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTINUOUS_IINTEGRATION__PARENT = DOMAIN_ARTIFACT__PARENT;

  /**
   * The feature id for the '<em><b>Artifact</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTINUOUS_IINTEGRATION__ARTIFACT = DOMAIN_ARTIFACT__ARTIFACT;

  /**
   * The number of structural features of the '<em>Continuous Iintegration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTINUOUS_IINTEGRATION_FEATURE_COUNT = DOMAIN_ARTIFACT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link domain.impl.ArtifactsImpl <em>Artifacts</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.ArtifactsImpl
   * @see domain.impl.DomainPackageImpl#getArtifacts()
   * @generated
   */
  int ARTIFACTS = 13;

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
  int ARTIFACT = 14;

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
   * The feature id for the '<em><b>Hints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTIFACT__HINTS = 7;

  /**
   * The feature id for the '<em><b>Template</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTIFACT__TEMPLATE = 8;

  /**
   * The number of structural features of the '<em>Artifact</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTIFACT_FEATURE_COUNT = 9;

  /**
   * The meta object id for the '{@link domain.impl.GenerationHintImpl <em>Generation Hint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.GenerationHintImpl
   * @see domain.impl.DomainPackageImpl#getGenerationHint()
   * @generated
   */
  int GENERATION_HINT = 15;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERATION_HINT__UID = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERATION_HINT__NAME = 1;

  /**
   * The feature id for the '<em><b>Applyed Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERATION_HINT__APPLYED_CLASS = 2;

  /**
   * The number of structural features of the '<em>Generation Hint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERATION_HINT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link domain.impl.ConfigVariableImpl <em>Config Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.ConfigVariableImpl
   * @see domain.impl.DomainPackageImpl#getConfigVariable()
   * @generated
   */
  int CONFIG_VARIABLE = 16;

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
   * The meta object id for the '{@link domain.impl.ModelQueryImpl <em>Model Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.ModelQueryImpl
   * @see domain.impl.DomainPackageImpl#getModelQuery()
   * @generated
   */
  int MODEL_QUERY = 17;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_QUERY__UID = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_QUERY__NAME = 1;

  /**
   * The feature id for the '<em><b>Query</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_QUERY__QUERY = 2;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_QUERY__PARENT = 3;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_QUERY__PARAMETERS = 4;

  /**
   * The number of structural features of the '<em>Model Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_QUERY_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link domain.impl.QueryParameterImpl <em>Query Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.QueryParameterImpl
   * @see domain.impl.DomainPackageImpl#getQueryParameter()
   * @generated
   */
  int QUERY_PARAMETER = 18;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_PARAMETER__UID = 0;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_PARAMETER__PARENT = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_PARAMETER__NAME = 2;

  /**
   * The number of structural features of the '<em>Query Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_PARAMETER_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link domain.impl.SpecifierImpl <em>Specifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.SpecifierImpl
   * @see domain.impl.DomainPackageImpl#getSpecifier()
   * @generated
   */
  int SPECIFIER = 19;

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
  int OPTION = 20;

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
  int APPLICATION = 21;

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
   * The feature id for the '<em><b>Application UI Layer</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__APPLICATION_UI_LAYER = 3;

  /**
   * The feature id for the '<em><b>Application Infrastructure Layer</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__APPLICATION_INFRASTRUCTURE_LAYER = 4;

  /**
   * The feature id for the '<em><b>Application Style</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__APPLICATION_STYLE = 5;

  /**
   * The feature id for the '<em><b>Application Role</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__APPLICATION_ROLE = 6;

  /**
   * The feature id for the '<em><b>Application Messages</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__APPLICATION_MESSAGES = 7;

  /**
   * The feature id for the '<em><b>Parent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__PARENT = 8;

  /**
   * The number of structural features of the '<em>Application</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_FEATURE_COUNT = 9;

  /**
   * The meta object id for the '{@link domain.impl.ApplicationMessagesImpl <em>Application Messages</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.ApplicationMessagesImpl
   * @see domain.impl.DomainPackageImpl#getApplicationMessages()
   * @generated
   */
  int APPLICATION_MESSAGES = 22;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_MESSAGES__UID = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_MESSAGES__NAME = 1;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_MESSAGES__PARENT = 2;

  /**
   * The feature id for the '<em><b>Messages</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_MESSAGES__MESSAGES = 3;

  /**
   * The number of structural features of the '<em>Application Messages</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_MESSAGES_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link domain.impl.ApplicationRoleImpl <em>Application Role</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.ApplicationRoleImpl
   * @see domain.impl.DomainPackageImpl#getApplicationRole()
   * @generated
   */
  int APPLICATION_ROLE = 23;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_ROLE__UID = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_ROLE__NAME = 1;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_ROLE__PARENT = 2;

  /**
   * The feature id for the '<em><b>Roles</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_ROLE__ROLES = 3;

  /**
   * The number of structural features of the '<em>Application Role</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_ROLE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link domain.impl.ApplicationStyleImpl <em>Application Style</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.ApplicationStyleImpl
   * @see domain.impl.DomainPackageImpl#getApplicationStyle()
   * @generated
   */
  int APPLICATION_STYLE = 24;

  /**
   * The feature id for the '<em><b>Columns</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_STYLE__COLUMNS = HTML_LAYER_HOLDER__COLUMNS;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_STYLE__UID = HTML_LAYER_HOLDER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_STYLE__NAME = HTML_LAYER_HOLDER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_STYLE__PARENT = HTML_LAYER_HOLDER_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Styles Package</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_STYLE__STYLES_PACKAGE = HTML_LAYER_HOLDER_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Application Style</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_STYLE_FEATURE_COUNT = HTML_LAYER_HOLDER_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link domain.impl.StylesPackageImpl <em>Styles Package</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.StylesPackageImpl
   * @see domain.impl.DomainPackageImpl#getStylesPackage()
   * @generated
   */
  int STYLES_PACKAGE = 25;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STYLES_PACKAGE__UID = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STYLES_PACKAGE__NAME = 1;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STYLES_PACKAGE__PARENT = 2;

  /**
   * The feature id for the '<em><b>Styles</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STYLES_PACKAGE__STYLES = 3;

  /**
   * The number of structural features of the '<em>Styles Package</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STYLES_PACKAGE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link domain.impl.ApplicationUILayerImpl <em>Application UI Layer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.ApplicationUILayerImpl
   * @see domain.impl.DomainPackageImpl#getApplicationUILayer()
   * @generated
   */
  int APPLICATION_UI_LAYER = 26;

  /**
   * The feature id for the '<em><b>Columns</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_UI_LAYER__COLUMNS = HTML_LAYER_HOLDER__COLUMNS;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_UI_LAYER__UID = HTML_LAYER_HOLDER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_UI_LAYER__NAME = HTML_LAYER_HOLDER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_UI_LAYER__PARENT = HTML_LAYER_HOLDER_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Application UI Packages</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_UI_LAYER__APPLICATION_UI_PACKAGES = HTML_LAYER_HOLDER_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Application UI Layer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_UI_LAYER_FEATURE_COUNT = HTML_LAYER_HOLDER_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link domain.impl.ApplicationUIPackageImpl <em>Application UI Package</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.ApplicationUIPackageImpl
   * @see domain.impl.DomainPackageImpl#getApplicationUIPackage()
   * @generated
   */
  int APPLICATION_UI_PACKAGE = 27;

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
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_UI_PACKAGE__PARENT = 2;

  /**
   * The feature id for the '<em><b>Uipackage</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_UI_PACKAGE__UIPACKAGE = 3;

  /**
   * The number of structural features of the '<em>Application UI Package</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_UI_PACKAGE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link domain.impl.ApplicationRecipesImpl <em>Application Recipes</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.ApplicationRecipesImpl
   * @see domain.impl.DomainPackageImpl#getApplicationRecipes()
   * @generated
   */
  int APPLICATION_RECIPES = 28;

  /**
   * The feature id for the '<em><b>Columns</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_RECIPES__COLUMNS = HTML_LAYER_HOLDER__COLUMNS;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_RECIPES__UID = HTML_LAYER_HOLDER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_RECIPES__NAME = HTML_LAYER_HOLDER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_RECIPES__PARENT = HTML_LAYER_HOLDER_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Recipes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_RECIPES__RECIPES = HTML_LAYER_HOLDER_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Application Recipes</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_RECIPES_FEATURE_COUNT = HTML_LAYER_HOLDER_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link domain.impl.ApplicationRecipeImpl <em>Application Recipe</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.ApplicationRecipeImpl
   * @see domain.impl.DomainPackageImpl#getApplicationRecipe()
   * @generated
   */
  int APPLICATION_RECIPE = 29;

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
  int APPLICATION_MAPPERS = 30;

  /**
   * The feature id for the '<em><b>Columns</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_MAPPERS__COLUMNS = HTML_LAYER_HOLDER__COLUMNS;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_MAPPERS__UID = HTML_LAYER_HOLDER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_MAPPERS__NAME = HTML_LAYER_HOLDER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_MAPPERS__PARENT = HTML_LAYER_HOLDER_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Mappers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_MAPPERS__MAPPERS = HTML_LAYER_HOLDER_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Application Mappers</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_MAPPERS_FEATURE_COUNT = HTML_LAYER_HOLDER_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link domain.impl.ApplicationMapperImpl <em>Application Mapper</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.ApplicationMapperImpl
   * @see domain.impl.DomainPackageImpl#getApplicationMapper()
   * @generated
   */
  int APPLICATION_MAPPER = 31;

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
   * The meta object id for the '{@link domain.impl.TypePointerImpl <em>Type Pointer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.TypePointerImpl
   * @see domain.impl.DomainPackageImpl#getTypePointer()
   * @generated
   */
  int TYPE_POINTER = 70;

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
   * The meta object id for the '{@link domain.impl.MethodPointerImpl <em>Method Pointer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.MethodPointerImpl
   * @see domain.impl.DomainPackageImpl#getMethodPointer()
   * @generated
   */
  int METHOD_POINTER = 32;

  /**
   * The feature id for the '<em><b>Package Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_POINTER__PACKAGE_REF = TYPE_POINTER__PACKAGE_REF;

  /**
   * The feature id for the '<em><b>Type Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_POINTER__TYPE_REF = TYPE_POINTER__TYPE_REF;

  /**
   * The feature id for the '<em><b>Fake Package Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_POINTER__FAKE_PACKAGE_NAME = TYPE_POINTER__FAKE_PACKAGE_NAME;

  /**
   * The feature id for the '<em><b>Fake Type Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_POINTER__FAKE_TYPE_NAME = TYPE_POINTER__FAKE_TYPE_NAME;

  /**
   * The feature id for the '<em><b>Method Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_POINTER__METHOD_REF = TYPE_POINTER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Fake Method</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_POINTER__FAKE_METHOD = TYPE_POINTER_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Method Pointer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_POINTER_FEATURE_COUNT = TYPE_POINTER_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link domain.impl.MessagesImpl <em>Messages</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.MessagesImpl
   * @see domain.impl.DomainPackageImpl#getMessages()
   * @generated
   */
  int MESSAGES = 33;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGES__UID = 0;

  /**
   * The feature id for the '<em><b>Parent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGES__PARENT = 1;

  /**
   * The feature id for the '<em><b>Message Libraries</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGES__MESSAGE_LIBRARIES = 2;

  /**
   * The number of structural features of the '<em>Messages</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGES_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link domain.impl.MessageLibraryImpl <em>Message Library</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.MessageLibraryImpl
   * @see domain.impl.DomainPackageImpl#getMessageLibrary()
   * @generated
   */
  int MESSAGE_LIBRARY = 34;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_LIBRARY__UID = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_LIBRARY__NAME = 1;

  /**
   * The feature id for the '<em><b>Lib Languages</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_LIBRARY__LIB_LANGUAGES = 2;

  /**
   * The feature id for the '<em><b>Messages</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_LIBRARY__MESSAGES = 3;

  /**
   * The number of structural features of the '<em>Message Library</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_LIBRARY_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link domain.impl.LanguageRefImpl <em>Language Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.LanguageRefImpl
   * @see domain.impl.DomainPackageImpl#getLanguageRef()
   * @generated
   */
  int LANGUAGE_REF = 35;

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
   * The meta object id for the '{@link domain.impl.MessageImpl <em>Message</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.MessageImpl
   * @see domain.impl.DomainPackageImpl#getMessage()
   * @generated
   */
  int MESSAGE = 36;

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
   * The meta object id for the '{@link domain.impl.TranslationImpl <em>Translation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.TranslationImpl
   * @see domain.impl.DomainPackageImpl#getTranslation()
   * @generated
   */
  int TRANSLATION = 37;

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
   * The meta object id for the '{@link domain.impl.LanguageImpl <em>Language</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.LanguageImpl
   * @see domain.impl.DomainPackageImpl#getLanguage()
   * @generated
   */
  int LANGUAGE = 38;

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
   * The number of structural features of the '<em>Language</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LANGUAGE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link domain.impl.RolesImpl <em>Roles</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.RolesImpl
   * @see domain.impl.DomainPackageImpl#getRoles()
   * @generated
   */
  int ROLES = 39;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLES__UID = 0;

  /**
   * The feature id for the '<em><b>Parent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLES__PARENT = 1;

  /**
   * The feature id for the '<em><b>Roles</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLES__ROLES = 2;

  /**
   * The feature id for the '<em><b>Groups</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLES__GROUPS = 3;

  /**
   * The number of structural features of the '<em>Roles</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLES_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link domain.impl.RoleImpl <em>Role</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.RoleImpl
   * @see domain.impl.DomainPackageImpl#getRole()
   * @generated
   */
  int ROLE = 40;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE__UID = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE__NAME = 1;

  /**
   * The number of structural features of the '<em>Role</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link domain.impl.GroupImpl <em>Group</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.GroupImpl
   * @see domain.impl.DomainPackageImpl#getGroup()
   * @generated
   */
  int GROUP = 41;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP__UID = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP__NAME = 1;

  /**
   * The feature id for the '<em><b>Group2 Group</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP__GROUP2_GROUP = 2;

  /**
   * The feature id for the '<em><b>Group2 Role</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP__GROUP2_ROLE = 3;

  /**
   * The number of structural features of the '<em>Group</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link domain.impl.StylesImpl <em>Styles</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.StylesImpl
   * @see domain.impl.DomainPackageImpl#getStyles()
   * @generated
   */
  int STYLES = 42;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STYLES__UID = 0;

  /**
   * The feature id for the '<em><b>Parent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STYLES__PARENT = 1;

  /**
   * The feature id for the '<em><b>Libraries</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STYLES__LIBRARIES = 2;

  /**
   * The number of structural features of the '<em>Styles</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STYLES_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link domain.impl.StyleLibraryImpl <em>Style Library</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.StyleLibraryImpl
   * @see domain.impl.DomainPackageImpl#getStyleLibrary()
   * @generated
   */
  int STYLE_LIBRARY = 43;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STYLE_LIBRARY__UID = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STYLE_LIBRARY__NAME = 1;

  /**
   * The feature id for the '<em><b>Styles</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STYLE_LIBRARY__STYLES = 2;

  /**
   * The number of structural features of the '<em>Style Library</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STYLE_LIBRARY_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link domain.impl.StyleSetImpl <em>Style Set</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.StyleSetImpl
   * @see domain.impl.DomainPackageImpl#getStyleSet()
   * @generated
   */
  int STYLE_SET = 44;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STYLE_SET__UID = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STYLE_SET__NAME = 1;

  /**
   * The number of structural features of the '<em>Style Set</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STYLE_SET_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link domain.impl.MappersImpl <em>Mappers</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.MappersImpl
   * @see domain.impl.DomainPackageImpl#getMappers()
   * @generated
   */
  int MAPPERS = 45;

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
  int MAPPER = 46;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPER__UID = 0;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPER__PARENT = 1;

  /**
   * The feature id for the '<em><b>Service Layer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPER__SERVICE_LAYER = 2;

  /**
   * The feature id for the '<em><b>Ui Layer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPER__UI_LAYER = 3;

  /**
   * The number of structural features of the '<em>Mapper</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPER_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link domain.impl.TypeMapperImpl <em>Type Mapper</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.TypeMapperImpl
   * @see domain.impl.DomainPackageImpl#getTypeMapper()
   * @generated
   */
  int TYPE_MAPPER = 47;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_MAPPER__UID = MAPPER__UID;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_MAPPER__PARENT = MAPPER__PARENT;

  /**
   * The feature id for the '<em><b>Service Layer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_MAPPER__SERVICE_LAYER = MAPPER__SERVICE_LAYER;

  /**
   * The feature id for the '<em><b>Ui Layer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_MAPPER__UI_LAYER = MAPPER__UI_LAYER;

  /**
   * The feature id for the '<em><b>Package Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_MAPPER__PACKAGE_REF = MAPPER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_MAPPER__TYPE_REF = MAPPER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Fake Package Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_MAPPER__FAKE_PACKAGE_NAME = MAPPER_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Fake Type Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_MAPPER__FAKE_TYPE_NAME = MAPPER_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Type Mapper</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_MAPPER_FEATURE_COUNT = MAPPER_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link domain.impl.JavaMapperImpl <em>Java Mapper</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.JavaMapperImpl
   * @see domain.impl.DomainPackageImpl#getJavaMapper()
   * @generated
   */
  int JAVA_MAPPER = 48;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_MAPPER__UID = TYPE_MAPPER__UID;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_MAPPER__PARENT = TYPE_MAPPER__PARENT;

  /**
   * The feature id for the '<em><b>Service Layer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_MAPPER__SERVICE_LAYER = TYPE_MAPPER__SERVICE_LAYER;

  /**
   * The feature id for the '<em><b>Ui Layer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_MAPPER__UI_LAYER = TYPE_MAPPER__UI_LAYER;

  /**
   * The feature id for the '<em><b>Package Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_MAPPER__PACKAGE_REF = TYPE_MAPPER__PACKAGE_REF;

  /**
   * The feature id for the '<em><b>Type Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_MAPPER__TYPE_REF = TYPE_MAPPER__TYPE_REF;

  /**
   * The feature id for the '<em><b>Fake Package Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_MAPPER__FAKE_PACKAGE_NAME = TYPE_MAPPER__FAKE_PACKAGE_NAME;

  /**
   * The feature id for the '<em><b>Fake Type Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_MAPPER__FAKE_TYPE_NAME = TYPE_MAPPER__FAKE_TYPE_NAME;

  /**
   * The feature id for the '<em><b>Mapped To Package Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_MAPPER__MAPPED_TO_PACKAGE_NAME = TYPE_MAPPER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Mapped To Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_MAPPER__MAPPED_TO_CLASS_NAME = TYPE_MAPPER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Artifact Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_MAPPER__ARTIFACT_ID = TYPE_MAPPER_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Group Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_MAPPER__GROUP_ID = TYPE_MAPPER_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_MAPPER__VERSION = TYPE_MAPPER_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Library Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_MAPPER__LIBRARY_NAME = TYPE_MAPPER_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Java Mapper</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_MAPPER_FEATURE_COUNT = TYPE_MAPPER_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link domain.impl.JavaScriptMapperImpl <em>Java Script Mapper</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.JavaScriptMapperImpl
   * @see domain.impl.DomainPackageImpl#getJavaScriptMapper()
   * @generated
   */
  int JAVA_SCRIPT_MAPPER = 49;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_SCRIPT_MAPPER__UID = TYPE_MAPPER__UID;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_SCRIPT_MAPPER__PARENT = TYPE_MAPPER__PARENT;

  /**
   * The feature id for the '<em><b>Service Layer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_SCRIPT_MAPPER__SERVICE_LAYER = TYPE_MAPPER__SERVICE_LAYER;

  /**
   * The feature id for the '<em><b>Ui Layer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_SCRIPT_MAPPER__UI_LAYER = TYPE_MAPPER__UI_LAYER;

  /**
   * The feature id for the '<em><b>Package Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_SCRIPT_MAPPER__PACKAGE_REF = TYPE_MAPPER__PACKAGE_REF;

  /**
   * The feature id for the '<em><b>Type Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_SCRIPT_MAPPER__TYPE_REF = TYPE_MAPPER__TYPE_REF;

  /**
   * The feature id for the '<em><b>Fake Package Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_SCRIPT_MAPPER__FAKE_PACKAGE_NAME = TYPE_MAPPER__FAKE_PACKAGE_NAME;

  /**
   * The feature id for the '<em><b>Fake Type Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_SCRIPT_MAPPER__FAKE_TYPE_NAME = TYPE_MAPPER__FAKE_TYPE_NAME;

  /**
   * The feature id for the '<em><b>Library Url</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_SCRIPT_MAPPER__LIBRARY_URL = TYPE_MAPPER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Java Script Mapper</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_SCRIPT_MAPPER_FEATURE_COUNT = TYPE_MAPPER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link domain.impl.CSSMapperImpl <em>CSS Mapper</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.CSSMapperImpl
   * @see domain.impl.DomainPackageImpl#getCSSMapper()
   * @generated
   */
  int CSS_MAPPER = 50;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_MAPPER__UID = MAPPER__UID;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_MAPPER__PARENT = MAPPER__PARENT;

  /**
   * The feature id for the '<em><b>Service Layer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_MAPPER__SERVICE_LAYER = MAPPER__SERVICE_LAYER;

  /**
   * The feature id for the '<em><b>Ui Layer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_MAPPER__UI_LAYER = MAPPER__UI_LAYER;

  /**
   * The feature id for the '<em><b>Library Url</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_MAPPER__LIBRARY_URL = MAPPER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Style Package</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_MAPPER__STYLE_PACKAGE = MAPPER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Style Library</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_MAPPER__STYLE_LIBRARY = MAPPER_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Fake Package Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_MAPPER__FAKE_PACKAGE_NAME = MAPPER_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Fake Type Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_MAPPER__FAKE_TYPE_NAME = MAPPER_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>CSS Mapper</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_MAPPER_FEATURE_COUNT = MAPPER_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link domain.impl.RoleMapperImpl <em>Role Mapper</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.RoleMapperImpl
   * @see domain.impl.DomainPackageImpl#getRoleMapper()
   * @generated
   */
  int ROLE_MAPPER = 51;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_MAPPER__UID = MAPPER__UID;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_MAPPER__PARENT = MAPPER__PARENT;

  /**
   * The feature id for the '<em><b>Service Layer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_MAPPER__SERVICE_LAYER = MAPPER__SERVICE_LAYER;

  /**
   * The feature id for the '<em><b>Ui Layer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_MAPPER__UI_LAYER = MAPPER__UI_LAYER;

  /**
   * The feature id for the '<em><b>Role</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_MAPPER__ROLE = MAPPER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Local Role Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_MAPPER__LOCAL_ROLE_NAME = MAPPER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Global Role Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_MAPPER__GLOBAL_ROLE_NAME = MAPPER_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Fake Role Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_MAPPER__FAKE_ROLE_NAME = MAPPER_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Role Mapper</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_MAPPER_FEATURE_COUNT = MAPPER_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link domain.impl.RecipesImpl <em>Recipes</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.RecipesImpl
   * @see domain.impl.DomainPackageImpl#getRecipes()
   * @generated
   */
  int RECIPES = 52;

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
   * The feature id for the '<em><b>Deployment</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECIPES__DEPLOYMENT = 5;

  /**
   * The number of structural features of the '<em>Recipes</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECIPES_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link domain.impl.DeploymentSequenceImpl <em>Deployment Sequence</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.DeploymentSequenceImpl
   * @see domain.impl.DomainPackageImpl#getDeploymentSequence()
   * @generated
   */
  int DEPLOYMENT_SEQUENCE = 53;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOYMENT_SEQUENCE__UID = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOYMENT_SEQUENCE__NAME = 1;

  /**
   * The feature id for the '<em><b>Deployment Components</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOYMENT_SEQUENCE__DEPLOYMENT_COMPONENTS = 2;

  /**
   * The number of structural features of the '<em>Deployment Sequence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOYMENT_SEQUENCE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link domain.impl.DeploymentComponentsImpl <em>Deployment Components</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.DeploymentComponentsImpl
   * @see domain.impl.DomainPackageImpl#getDeploymentComponents()
   * @generated
   */
  int DEPLOYMENT_COMPONENTS = 54;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOYMENT_COMPONENTS__UID = 0;

  /**
   * The feature id for the '<em><b>Deplyment Step</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOYMENT_COMPONENTS__DEPLYMENT_STEP = 1;

  /**
   * The feature id for the '<em><b>Start Seq</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOYMENT_COMPONENTS__START_SEQ = 2;

  /**
   * The number of structural features of the '<em>Deployment Components</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOYMENT_COMPONENTS_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link domain.impl.DeploymentComponentImpl <em>Deployment Component</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.DeploymentComponentImpl
   * @see domain.impl.DomainPackageImpl#getDeploymentComponent()
   * @generated
   */
  int DEPLOYMENT_COMPONENT = 55;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOYMENT_COMPONENT__UID = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOYMENT_COMPONENT__NAME = 1;

  /**
   * The feature id for the '<em><b>Mapper</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOYMENT_COMPONENT__MAPPER = 2;

  /**
   * The feature id for the '<em><b>Deployment Component Link</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOYMENT_COMPONENT__DEPLOYMENT_COMPONENT_LINK = 3;

  /**
   * The number of structural features of the '<em>Deployment Component</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOYMENT_COMPONENT_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link domain.impl.DeploymentStarStepImpl <em>Deployment Star Step</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.DeploymentStarStepImpl
   * @see domain.impl.DomainPackageImpl#getDeploymentStarStep()
   * @generated
   */
  int DEPLOYMENT_STAR_STEP = 56;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOYMENT_STAR_STEP__UID = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOYMENT_STAR_STEP__NAME = 1;

  /**
   * The feature id for the '<em><b>First Step</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOYMENT_STAR_STEP__FIRST_STEP = 2;

  /**
   * The number of structural features of the '<em>Deployment Star Step</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOYMENT_STAR_STEP_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link domain.impl.UsingMappersImpl <em>Using Mappers</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.UsingMappersImpl
   * @see domain.impl.DomainPackageImpl#getUsingMappers()
   * @generated
   */
  int USING_MAPPERS = 57;

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
   * The meta object id for the '{@link domain.impl.RecipeImpl <em>Recipe</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.RecipeImpl
   * @see domain.impl.DomainPackageImpl#getRecipe()
   * @generated
   */
  int RECIPE = 58;

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
   * The feature id for the '<em><b>Deployment</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECIPE__DEPLOYMENT = USING_MAPPERS_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Recipe</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECIPE_FEATURE_COUNT = USING_MAPPERS_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link domain.impl.IngredientImpl <em>Ingredient</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.IngredientImpl
   * @see domain.impl.DomainPackageImpl#getIngredient()
   * @generated
   */
  int INGREDIENT = 59;

  /**
   * The feature id for the '<em><b>Mappers</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INGREDIENT__MAPPERS = USING_MAPPERS__MAPPERS;

  /**
   * The feature id for the '<em><b>Columns</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INGREDIENT__COLUMNS = USING_MAPPERS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INGREDIENT__UID = USING_MAPPERS_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INGREDIENT__NAME = USING_MAPPERS_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INGREDIENT__PARENT = USING_MAPPERS_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Components</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INGREDIENT__COMPONENTS = USING_MAPPERS_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Layer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INGREDIENT__LAYER = USING_MAPPERS_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Ingredient</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INGREDIENT_FEATURE_COUNT = USING_MAPPERS_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link domain.impl.ComponentImpl <em>Component</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.ComponentImpl
   * @see domain.impl.DomainPackageImpl#getComponent()
   * @generated
   */
  int COMPONENT = 60;

  /**
   * The feature id for the '<em><b>Columns</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__COLUMNS = HTML_LAYER_HOLDER__COLUMNS;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__UID = HTML_LAYER_HOLDER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__NAME = HTML_LAYER_HOLDER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__PARENT = HTML_LAYER_HOLDER_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Mappers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__MAPPERS = HTML_LAYER_HOLDER_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Component Root</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__COMPONENT_ROOT = HTML_LAYER_HOLDER_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Component</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_FEATURE_COUNT = HTML_LAYER_HOLDER_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link domain.impl.JavaComponentImpl <em>Java Component</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.JavaComponentImpl
   * @see domain.impl.DomainPackageImpl#getJavaComponent()
   * @generated
   */
  int JAVA_COMPONENT = 61;

  /**
   * The feature id for the '<em><b>Columns</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_COMPONENT__COLUMNS = COMPONENT__COLUMNS;

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
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_COMPONENT__PARENT = COMPONENT__PARENT;

  /**
   * The feature id for the '<em><b>Mappers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_COMPONENT__MAPPERS = COMPONENT__MAPPERS;

  /**
   * The feature id for the '<em><b>Component Root</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_COMPONENT__COMPONENT_ROOT = COMPONENT__COMPONENT_ROOT;

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
   * The meta object id for the '{@link domain.impl.InfrastructureImpl <em>Infrastructure</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.InfrastructureImpl
   * @see domain.impl.DomainPackageImpl#getInfrastructure()
   * @generated
   */
  int INFRASTRUCTURE = 62;

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
   * The meta object id for the '{@link domain.impl.ConfigurationImpl <em>Configuration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.ConfigurationImpl
   * @see domain.impl.DomainPackageImpl#getConfiguration()
   * @generated
   */
  int CONFIGURATION = 63;

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
   * The meta object id for the '{@link domain.impl.ArtifactRefImpl <em>Artifact Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.ArtifactRefImpl
   * @see domain.impl.DomainPackageImpl#getArtifactRef()
   * @generated
   */
  int ARTIFACT_REF = 69;

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
   * The meta object id for the '{@link domain.impl.ModelMapperImpl <em>Model Mapper</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.ModelMapperImpl
   * @see domain.impl.DomainPackageImpl#getModelMapper()
   * @generated
   */
  int MODEL_MAPPER = 64;

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
   * The feature id for the '<em><b>Queries</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_MAPPER__QUERIES = ARTIFACT_REF_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Artifact Execution String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_MAPPER__ARTIFACT_EXECUTION_STRING = ARTIFACT_REF_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Model Mapper</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_MAPPER_FEATURE_COUNT = ARTIFACT_REF_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link domain.impl.PropertyImpl <em>Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.PropertyImpl
   * @see domain.impl.DomainPackageImpl#getProperty()
   * @generated
   */
  int PROPERTY = 65;

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
  int MAPPING_SPECIFIER = 66;

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
   * The meta object id for the '{@link domain.impl.QueryImpl <em>Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.QueryImpl
   * @see domain.impl.DomainPackageImpl#getQuery()
   * @generated
   */
  int QUERY = 67;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY__UID = 0;

  /**
   * The feature id for the '<em><b>Model Query</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY__MODEL_QUERY = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY__NAME = 2;

  /**
   * The feature id for the '<em><b>Query Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY__QUERY_REF = 3;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY__VARIABLES = 4;

  /**
   * The feature id for the '<em><b>Group Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY__GROUP_CODE = 5;

  /**
   * The number of structural features of the '<em>Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link domain.impl.QueryVariableImpl <em>Query Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.QueryVariableImpl
   * @see domain.impl.DomainPackageImpl#getQueryVariable()
   * @generated
   */
  int QUERY_VARIABLE = 68;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_VARIABLE__UID = 0;

  /**
   * The feature id for the '<em><b>Query Param Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_VARIABLE__QUERY_PARAM_REF = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_VARIABLE__VALUE = 2;

  /**
   * The number of structural features of the '<em>Query Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_VARIABLE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link domain.impl.TypeDefinitionImpl <em>Type Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.TypeDefinitionImpl
   * @see domain.impl.DomainPackageImpl#getTypeDefinition()
   * @generated
   */
  int TYPE_DEFINITION = 71;

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
  int TYPE_ELEMENT = 72;

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
   * The meta object id for the '{@link domain.impl.PrimitiveImpl <em>Primitive</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.PrimitiveImpl
   * @see domain.impl.DomainPackageImpl#getPrimitive()
   * @generated
   */
  int PRIMITIVE = 73;

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
   * The meta object id for the '{@link domain.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.TypeImpl
   * @see domain.impl.DomainPackageImpl#getType()
   * @generated
   */
  int TYPE = 74;

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
   * The feature id for the '<em><b>Classifiers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__CLASSIFIERS = TYPE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__ATTRIBUTES = TYPE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Operations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__OPERATIONS = TYPE_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Extension</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__EXTENSION = TYPE_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = TYPE_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link domain.impl.TypeReferenceImpl <em>Type Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.TypeReferenceImpl
   * @see domain.impl.DomainPackageImpl#getTypeReference()
   * @generated
   */
  int TYPE_REFERENCE = 75;

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
   * The meta object id for the '{@link domain.impl.TypeExtensionImpl <em>Type Extension</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.TypeExtensionImpl
   * @see domain.impl.DomainPackageImpl#getTypeExtension()
   * @generated
   */
  int TYPE_EXTENSION = 76;

  /**
   * The feature id for the '<em><b>Classifiers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_EXTENSION__CLASSIFIERS = CATEGORIZED__CLASSIFIERS;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_EXTENSION__UID = CATEGORIZED_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_EXTENSION__SOURCE = CATEGORIZED_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_EXTENSION__TARGET = CATEGORIZED_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Type Extension</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_EXTENSION_FEATURE_COUNT = CATEGORIZED_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link domain.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.AttributeImpl
   * @see domain.impl.DomainPackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 77;

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
   * The meta object id for the '{@link domain.impl.OperationImpl <em>Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.OperationImpl
   * @see domain.impl.DomainPackageImpl#getOperation()
   * @generated
   */
  int OPERATION = 78;

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
   * The meta object id for the '{@link domain.impl.ParameterImpl <em>Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.ParameterImpl
   * @see domain.impl.DomainPackageImpl#getParameter()
   * @generated
   */
  int PARAMETER = 79;

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
   * The feature id for the '<em><b>Order</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__ORDER = TYPE_POINTER_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__PARENT = TYPE_POINTER_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_FEATURE_COUNT = TYPE_POINTER_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link domain.impl.ReturnValueImpl <em>Return Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.ReturnValueImpl
   * @see domain.impl.DomainPackageImpl#getReturnValue()
   * @generated
   */
  int RETURN_VALUE = 80;

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
   * The meta object id for the '{@link domain.impl.EnumaratorImpl <em>Enumarator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.EnumaratorImpl
   * @see domain.impl.DomainPackageImpl#getEnumarator()
   * @generated
   */
  int ENUMARATOR = 81;

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
   * The meta object id for the '{@link domain.impl.EnumAttributeImpl <em>Enum Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.EnumAttributeImpl
   * @see domain.impl.DomainPackageImpl#getEnumAttribute()
   * @generated
   */
  int ENUM_ATTRIBUTE = 82;

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
   * The meta object id for the '{@link domain.impl.TypesRepositoryImpl <em>Types Repository</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.TypesRepositoryImpl
   * @see domain.impl.DomainPackageImpl#getTypesRepository()
   * @generated
   */
  int TYPES_REPOSITORY = 83;

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
   * The meta object id for the '{@link domain.impl.TypesImpl <em>Types</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.TypesImpl
   * @see domain.impl.DomainPackageImpl#getTypes()
   * @generated
   */
  int TYPES = 84;

  /**
   * The feature id for the '<em><b>Columns</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPES__COLUMNS = HTML_LAYER_HOLDER__COLUMNS;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPES__UID = HTML_LAYER_HOLDER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPES__PARENT = HTML_LAYER_HOLDER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPES__NAME = HTML_LAYER_HOLDER_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Packages</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPES__PACKAGES = HTML_LAYER_HOLDER_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Types</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPES_FEATURE_COUNT = HTML_LAYER_HOLDER_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link domain.impl.PackageImpl <em>Package</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.PackageImpl
   * @see domain.impl.DomainPackageImpl#getPackage()
   * @generated
   */
  int PACKAGE = 85;

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
   * The meta object id for the '{@link domain.impl.UIPackageImpl <em>UI Package</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.UIPackageImpl
   * @see domain.impl.DomainPackageImpl#getUIPackage()
   * @generated
   */
  int UI_PACKAGE = 86;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UI_PACKAGE__UID = 0;

  /**
   * The feature id for the '<em><b>Parent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UI_PACKAGE__PARENT = 1;

  /**
   * The feature id for the '<em><b>Forms</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UI_PACKAGE__FORMS = 2;

  /**
   * The number of structural features of the '<em>UI Package</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UI_PACKAGE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link domain.impl.FormImpl <em>Form</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.FormImpl
   * @see domain.impl.DomainPackageImpl#getForm()
   * @generated
   */
  int FORM = 87;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORM__UID = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORM__NAME = 1;

  /**
   * The feature id for the '<em><b>View</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORM__VIEW = 2;

  /**
   * The feature id for the '<em><b>Datacontrols</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORM__DATACONTROLS = 3;

  /**
   * The number of structural features of the '<em>Form</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORM_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link domain.impl.FormViewImpl <em>Form View</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.FormViewImpl
   * @see domain.impl.DomainPackageImpl#getFormView()
   * @generated
   */
  int FORM_VIEW = 88;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORM_VIEW__UID = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORM_VIEW__NAME = 1;

  /**
   * The feature id for the '<em><b>View</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORM_VIEW__VIEW = 2;

  /**
   * The number of structural features of the '<em>Form View</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORM_VIEW_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link domain.impl.ViewsImpl <em>Views</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.ViewsImpl
   * @see domain.impl.DomainPackageImpl#getViews()
   * @generated
   */
  int VIEWS = 89;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEWS__UID = 0;

  /**
   * The feature id for the '<em><b>Parent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEWS__PARENT = 1;

  /**
   * The feature id for the '<em><b>Canvases</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEWS__CANVASES = 2;

  /**
   * The feature id for the '<em><b>View Inheritances</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEWS__VIEW_INHERITANCES = 3;

  /**
   * The feature id for the '<em><b>Tab Pages Inheritances</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEWS__TAB_PAGES_INHERITANCES = 4;

  /**
   * The number of structural features of the '<em>Views</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEWS_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link domain.impl.MultiLangLabelImpl <em>Multi Lang Label</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.MultiLangLabelImpl
   * @see domain.impl.DomainPackageImpl#getMultiLangLabel()
   * @generated
   */
  int MULTI_LANG_LABEL = 90;

  /**
   * The feature id for the '<em><b>Multi Lang Label</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_LANG_LABEL__MULTI_LANG_LABEL = 0;

  /**
   * The number of structural features of the '<em>Multi Lang Label</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_LANG_LABEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link domain.impl.CanvasFrameImpl <em>Canvas Frame</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.CanvasFrameImpl
   * @see domain.impl.DomainPackageImpl#getCanvasFrame()
   * @generated
   */
  int CANVAS_FRAME = 91;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CANVAS_FRAME__UID = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CANVAS_FRAME__NAME = 1;

  /**
   * The number of structural features of the '<em>Canvas Frame</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CANVAS_FRAME_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link domain.impl.ViewPortHolderImpl <em>View Port Holder</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.ViewPortHolderImpl
   * @see domain.impl.DomainPackageImpl#getViewPortHolder()
   * @generated
   */
  int VIEW_PORT_HOLDER = 92;

  /**
   * The feature id for the '<em><b>Columns</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_PORT_HOLDER__COLUMNS = HTML_LAYER_HOLDER__COLUMNS;

  /**
   * The feature id for the '<em><b>View Element</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_PORT_HOLDER__VIEW_ELEMENT = HTML_LAYER_HOLDER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>View Port Holder</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_PORT_HOLDER_FEATURE_COUNT = HTML_LAYER_HOLDER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link domain.impl.DefaultCavasImpl <em>Default Cavas</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.DefaultCavasImpl
   * @see domain.impl.DomainPackageImpl#getDefaultCavas()
   * @generated
   */
  int DEFAULT_CAVAS = 93;

  /**
   * The feature id for the '<em><b>Default Canvas</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFAULT_CAVAS__DEFAULT_CANVAS = 0;

  /**
   * The number of structural features of the '<em>Default Cavas</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFAULT_CAVAS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link domain.impl.ViewElementImpl <em>View Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.ViewElementImpl
   * @see domain.impl.DomainPackageImpl#getViewElement()
   * @generated
   */
  int VIEW_ELEMENT = 94;

  /**
   * The number of structural features of the '<em>View Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_ELEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link domain.impl.CanvasImpl <em>Canvas</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.CanvasImpl
   * @see domain.impl.DomainPackageImpl#getCanvas()
   * @generated
   */
  int CANVAS = 95;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CANVAS__UID = CANVAS_FRAME__UID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CANVAS__NAME = CANVAS_FRAME__NAME;

  /**
   * The feature id for the '<em><b>Columns</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CANVAS__COLUMNS = CANVAS_FRAME_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>View Element</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CANVAS__VIEW_ELEMENT = CANVAS_FRAME_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Default Canvas</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CANVAS__DEFAULT_CANVAS = CANVAS_FRAME_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Multi Lang Label</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CANVAS__MULTI_LANG_LABEL = CANVAS_FRAME_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Canvas</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CANVAS_FEATURE_COUNT = CANVAS_FRAME_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link domain.impl.WindowImpl <em>Window</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.WindowImpl
   * @see domain.impl.DomainPackageImpl#getWindow()
   * @generated
   */
  int WINDOW = 96;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WINDOW__UID = CANVAS_FRAME__UID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WINDOW__NAME = CANVAS_FRAME__NAME;

  /**
   * The feature id for the '<em><b>Columns</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WINDOW__COLUMNS = CANVAS_FRAME_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>View Element</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WINDOW__VIEW_ELEMENT = CANVAS_FRAME_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Multi Lang Label</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WINDOW__MULTI_LANG_LABEL = CANVAS_FRAME_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Window</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WINDOW_FEATURE_COUNT = CANVAS_FRAME_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link domain.impl.TabCanvasImpl <em>Tab Canvas</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.TabCanvasImpl
   * @see domain.impl.DomainPackageImpl#getTabCanvas()
   * @generated
   */
  int TAB_CANVAS = 97;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAB_CANVAS__UID = CANVAS_FRAME__UID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAB_CANVAS__NAME = CANVAS_FRAME__NAME;

  /**
   * The feature id for the '<em><b>Default Canvas</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAB_CANVAS__DEFAULT_CANVAS = CANVAS_FRAME_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Multi Lang Label</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAB_CANVAS__MULTI_LANG_LABEL = CANVAS_FRAME_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Tab Canvas</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAB_CANVAS_FEATURE_COUNT = CANVAS_FRAME_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link domain.impl.TabPageImpl <em>Tab Page</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.TabPageImpl
   * @see domain.impl.DomainPackageImpl#getTabPage()
   * @generated
   */
  int TAB_PAGE = 98;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAB_PAGE__UID = CANVAS_FRAME__UID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAB_PAGE__NAME = CANVAS_FRAME__NAME;

  /**
   * The feature id for the '<em><b>Columns</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAB_PAGE__COLUMNS = CANVAS_FRAME_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>View Element</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAB_PAGE__VIEW_ELEMENT = CANVAS_FRAME_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Multi Lang Label</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAB_PAGE__MULTI_LANG_LABEL = CANVAS_FRAME_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Tab Page</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAB_PAGE_FEATURE_COUNT = CANVAS_FRAME_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link domain.impl.ViewPortImpl <em>View Port</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.ViewPortImpl
   * @see domain.impl.DomainPackageImpl#getViewPort()
   * @generated
   */
  int VIEW_PORT = 99;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_PORT__UID = VIEW_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_PORT__NAME = VIEW_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>View Port Trigger</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_PORT__VIEW_PORT_TRIGGER = VIEW_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>View Port</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_PORT_FEATURE_COUNT = VIEW_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link domain.impl.ViewAreaImpl <em>View Area</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.ViewAreaImpl
   * @see domain.impl.DomainPackageImpl#getViewArea()
   * @generated
   */
  int VIEW_AREA = 100;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_AREA__UID = VIEW_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_AREA__NAME = VIEW_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Canvas View</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_AREA__CANVAS_VIEW = VIEW_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>View Area</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_AREA_FEATURE_COUNT = VIEW_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link domain.impl.TriggerImpl <em>Trigger</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.TriggerImpl
   * @see domain.impl.DomainPackageImpl#getTrigger()
   * @generated
   */
  int TRIGGER = 132;

  /**
   * The feature id for the '<em><b>Package Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRIGGER__PACKAGE_REF = METHOD_POINTER__PACKAGE_REF;

  /**
   * The feature id for the '<em><b>Type Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRIGGER__TYPE_REF = METHOD_POINTER__TYPE_REF;

  /**
   * The feature id for the '<em><b>Fake Package Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRIGGER__FAKE_PACKAGE_NAME = METHOD_POINTER__FAKE_PACKAGE_NAME;

  /**
   * The feature id for the '<em><b>Fake Type Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRIGGER__FAKE_TYPE_NAME = METHOD_POINTER__FAKE_TYPE_NAME;

  /**
   * The feature id for the '<em><b>Method Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRIGGER__METHOD_REF = METHOD_POINTER__METHOD_REF;

  /**
   * The feature id for the '<em><b>Fake Method</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRIGGER__FAKE_METHOD = METHOD_POINTER__FAKE_METHOD;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRIGGER__PARAMETERS = METHOD_POINTER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Trigger</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRIGGER_FEATURE_COUNT = METHOD_POINTER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link domain.impl.ViewPortTriggerImpl <em>View Port Trigger</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.ViewPortTriggerImpl
   * @see domain.impl.DomainPackageImpl#getViewPortTrigger()
   * @generated
   */
  int VIEW_PORT_TRIGGER = 101;

  /**
   * The feature id for the '<em><b>Package Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_PORT_TRIGGER__PACKAGE_REF = TRIGGER__PACKAGE_REF;

  /**
   * The feature id for the '<em><b>Type Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_PORT_TRIGGER__TYPE_REF = TRIGGER__TYPE_REF;

  /**
   * The feature id for the '<em><b>Fake Package Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_PORT_TRIGGER__FAKE_PACKAGE_NAME = TRIGGER__FAKE_PACKAGE_NAME;

  /**
   * The feature id for the '<em><b>Fake Type Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_PORT_TRIGGER__FAKE_TYPE_NAME = TRIGGER__FAKE_TYPE_NAME;

  /**
   * The feature id for the '<em><b>Method Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_PORT_TRIGGER__METHOD_REF = TRIGGER__METHOD_REF;

  /**
   * The feature id for the '<em><b>Fake Method</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_PORT_TRIGGER__FAKE_METHOD = TRIGGER__FAKE_METHOD;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_PORT_TRIGGER__PARAMETERS = TRIGGER__PARAMETERS;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_PORT_TRIGGER__UID = TRIGGER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>View Port Trigger</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_PORT_TRIGGER_FEATURE_COUNT = TRIGGER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link domain.impl.ViewInheritanceImpl <em>View Inheritance</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.ViewInheritanceImpl
   * @see domain.impl.DomainPackageImpl#getViewInheritance()
   * @generated
   */
  int VIEW_INHERITANCE = 102;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_INHERITANCE__UID = 0;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_INHERITANCE__SOURCE = 1;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_INHERITANCE__TARGET = 2;

  /**
   * The number of structural features of the '<em>View Inheritance</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_INHERITANCE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link domain.impl.TabPagesInheritanceImpl <em>Tab Pages Inheritance</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.TabPagesInheritanceImpl
   * @see domain.impl.DomainPackageImpl#getTabPagesInheritance()
   * @generated
   */
  int TAB_PAGES_INHERITANCE = 103;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAB_PAGES_INHERITANCE__UID = 0;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAB_PAGES_INHERITANCE__SOURCE = 1;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAB_PAGES_INHERITANCE__TARGET = 2;

  /**
   * The number of structural features of the '<em>Tab Pages Inheritance</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAB_PAGES_INHERITANCE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link domain.impl.FormDataControlsImpl <em>Form Data Controls</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.FormDataControlsImpl
   * @see domain.impl.DomainPackageImpl#getFormDataControls()
   * @generated
   */
  int FORM_DATA_CONTROLS = 104;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORM_DATA_CONTROLS__UID = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORM_DATA_CONTROLS__NAME = 1;

  /**
   * The feature id for the '<em><b>Form Control</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORM_DATA_CONTROLS__FORM_CONTROL = 2;

  /**
   * The number of structural features of the '<em>Form Data Controls</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORM_DATA_CONTROLS_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link domain.impl.CanvasViewImpl <em>Canvas View</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.CanvasViewImpl
   * @see domain.impl.DomainPackageImpl#getCanvasView()
   * @generated
   */
  int CANVAS_VIEW = 105;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CANVAS_VIEW__UID = 0;

  /**
   * The feature id for the '<em><b>Parent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CANVAS_VIEW__PARENT = 1;

  /**
   * The feature id for the '<em><b>Base Canvas</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CANVAS_VIEW__BASE_CANVAS = 2;

  /**
   * The number of structural features of the '<em>Canvas View</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CANVAS_VIEW_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link domain.impl.StyleImpl <em>Style</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.StyleImpl
   * @see domain.impl.DomainPackageImpl#getStyle()
   * @generated
   */
  int STYLE = 106;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STYLE__UID = 0;

  /**
   * The feature id for the '<em><b>Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STYLE__STYLE = 1;

  /**
   * The number of structural features of the '<em>Style</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STYLE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link domain.impl.ChildrenHolderImpl <em>Children Holder</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.ChildrenHolderImpl
   * @see domain.impl.DomainPackageImpl#getChildrenHolder()
   * @generated
   */
  int CHILDREN_HOLDER = 107;

  /**
   * The feature id for the '<em><b>Children</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHILDREN_HOLDER__CHILDREN = 0;

  /**
   * The number of structural features of the '<em>Children Holder</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHILDREN_HOLDER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link domain.impl.StyleClassImpl <em>Style Class</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.StyleClassImpl
   * @see domain.impl.DomainPackageImpl#getStyleClass()
   * @generated
   */
  int STYLE_CLASS = 108;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STYLE_CLASS__UID = 0;

  /**
   * The feature id for the '<em><b>Styles Package</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STYLE_CLASS__STYLES_PACKAGE = 1;

  /**
   * The feature id for the '<em><b>Library</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STYLE_CLASS__LIBRARY = 2;

  /**
   * The feature id for the '<em><b>Style Set</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STYLE_CLASS__STYLE_SET = 3;

  /**
   * The number of structural features of the '<em>Style Class</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STYLE_CLASS_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link domain.impl.ContextParameterImpl <em>Context Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.ContextParameterImpl
   * @see domain.impl.DomainPackageImpl#getContextParameter()
   * @generated
   */
  int CONTEXT_PARAMETER = 109;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_PARAMETER__UID = 0;

  /**
   * The feature id for the '<em><b>Parameter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_PARAMETER__PARAMETER = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_PARAMETER__VALUE = 2;

  /**
   * The number of structural features of the '<em>Context Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_PARAMETER_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link domain.impl.ContextValueImpl <em>Context Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.ContextValueImpl
   * @see domain.impl.DomainPackageImpl#getContextValue()
   * @generated
   */
  int CONTEXT_VALUE = 110;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_VALUE__UID = 0;

  /**
   * The feature id for the '<em><b>Constant</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_VALUE__CONSTANT = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_VALUE__VALUE = 2;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_VALUE__EXPRESSION = 3;

  /**
   * The number of structural features of the '<em>Context Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_VALUE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link domain.impl.ExpressionPartImpl <em>Expression Part</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.ExpressionPartImpl
   * @see domain.impl.DomainPackageImpl#getExpressionPart()
   * @generated
   */
  int EXPRESSION_PART = 111;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_PART__UID = 0;

  /**
   * The feature id for the '<em><b>Obj Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_PART__OBJ_REF = 1;

  /**
   * The feature id for the '<em><b>Order</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_PART__ORDER = 2;

  /**
   * The number of structural features of the '<em>Expression Part</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_PART_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link domain.impl.ContextParametersImpl <em>Context Parameters</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.ContextParametersImpl
   * @see domain.impl.DomainPackageImpl#getContextParameters()
   * @generated
   */
  int CONTEXT_PARAMETERS = 112;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_PARAMETERS__PARAMETERS = 0;

  /**
   * The number of structural features of the '<em>Context Parameters</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_PARAMETERS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link domain.impl.ContextImpl <em>Context</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.ContextImpl
   * @see domain.impl.DomainPackageImpl#getContext()
   * @generated
   */
  int CONTEXT = 113;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT__UID = CONTEXT_VALUE__UID;

  /**
   * The feature id for the '<em><b>Constant</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT__CONSTANT = CONTEXT_VALUE__CONSTANT;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT__VALUE = CONTEXT_VALUE__VALUE;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT__EXPRESSION = CONTEXT_VALUE__EXPRESSION;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT__PARAMETERS = CONTEXT_VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Context</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_FEATURE_COUNT = CONTEXT_VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link domain.impl.StyleElementImpl <em>Style Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.StyleElementImpl
   * @see domain.impl.DomainPackageImpl#getStyleElement()
   * @generated
   */
  int STYLE_ELEMENT = 114;

  /**
   * The feature id for the '<em><b>Style</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STYLE_ELEMENT__STYLE = 0;

  /**
   * The feature id for the '<em><b>Style Class</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STYLE_ELEMENT__STYLE_CLASS = 1;

  /**
   * The number of structural features of the '<em>Style Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STYLE_ELEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link domain.impl.UielementImpl <em>Uielement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.UielementImpl
   * @see domain.impl.DomainPackageImpl#getUielement()
   * @generated
   */
  int UIELEMENT = 115;

  /**
   * The feature id for the '<em><b>Style</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UIELEMENT__STYLE = STYLE_ELEMENT__STYLE;

  /**
   * The feature id for the '<em><b>Style Class</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UIELEMENT__STYLE_CLASS = STYLE_ELEMENT__STYLE_CLASS;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UIELEMENT__UID = STYLE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Nickname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UIELEMENT__NICKNAME = STYLE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UIELEMENT__ENABLED = STYLE_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Required</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UIELEMENT__REQUIRED = STYLE_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Read Only</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UIELEMENT__READ_ONLY = STYLE_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>On Event Refresh Area</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UIELEMENT__ON_EVENT_REFRESH_AREA = STYLE_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Uielement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UIELEMENT_FEATURE_COUNT = STYLE_ELEMENT_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link domain.impl.SourcesPointerImpl <em>Sources Pointer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.SourcesPointerImpl
   * @see domain.impl.DomainPackageImpl#getSourcesPointer()
   * @generated
   */
  int SOURCES_POINTER = 116;

  /**
   * The feature id for the '<em><b>Style</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOURCES_POINTER__STYLE = UIELEMENT__STYLE;

  /**
   * The feature id for the '<em><b>Style Class</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOURCES_POINTER__STYLE_CLASS = UIELEMENT__STYLE_CLASS;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOURCES_POINTER__UID = UIELEMENT__UID;

  /**
   * The feature id for the '<em><b>Nickname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOURCES_POINTER__NICKNAME = UIELEMENT__NICKNAME;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOURCES_POINTER__ENABLED = UIELEMENT__ENABLED;

  /**
   * The feature id for the '<em><b>Required</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOURCES_POINTER__REQUIRED = UIELEMENT__REQUIRED;

  /**
   * The feature id for the '<em><b>Read Only</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOURCES_POINTER__READ_ONLY = UIELEMENT__READ_ONLY;

  /**
   * The feature id for the '<em><b>On Event Refresh Area</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOURCES_POINTER__ON_EVENT_REFRESH_AREA = UIELEMENT__ON_EVENT_REFRESH_AREA;

  /**
   * The feature id for the '<em><b>Source Pointer</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOURCES_POINTER__SOURCE_POINTER = UIELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value Pointer</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOURCES_POINTER__VALUE_POINTER = UIELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Source Cast</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOURCES_POINTER__SOURCE_CAST = UIELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Sources Pointer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOURCES_POINTER_FEATURE_COUNT = UIELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link domain.impl.ActionElementImpl <em>Action Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.ActionElementImpl
   * @see domain.impl.DomainPackageImpl#getActionElement()
   * @generated
   */
  int ACTION_ELEMENT = 117;

  /**
   * The feature id for the '<em><b>Style</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_ELEMENT__STYLE = UIELEMENT__STYLE;

  /**
   * The feature id for the '<em><b>Style Class</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_ELEMENT__STYLE_CLASS = UIELEMENT__STYLE_CLASS;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_ELEMENT__UID = UIELEMENT__UID;

  /**
   * The feature id for the '<em><b>Nickname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_ELEMENT__NICKNAME = UIELEMENT__NICKNAME;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_ELEMENT__ENABLED = UIELEMENT__ENABLED;

  /**
   * The feature id for the '<em><b>Required</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_ELEMENT__REQUIRED = UIELEMENT__REQUIRED;

  /**
   * The feature id for the '<em><b>Read Only</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_ELEMENT__READ_ONLY = UIELEMENT__READ_ONLY;

  /**
   * The feature id for the '<em><b>On Event Refresh Area</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_ELEMENT__ON_EVENT_REFRESH_AREA = UIELEMENT__ON_EVENT_REFRESH_AREA;

  /**
   * The feature id for the '<em><b>Package Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_ELEMENT__PACKAGE_REF = UIELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_ELEMENT__TYPE_REF = UIELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Fake Package Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_ELEMENT__FAKE_PACKAGE_NAME = UIELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Fake Type Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_ELEMENT__FAKE_TYPE_NAME = UIELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Method Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_ELEMENT__METHOD_REF = UIELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Fake Method</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_ELEMENT__FAKE_METHOD = UIELEMENT_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_ELEMENT__PARAMETERS = UIELEMENT_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>Action Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_ELEMENT_FEATURE_COUNT = UIELEMENT_FEATURE_COUNT + 7;

  /**
   * The meta object id for the '{@link domain.impl.InputElementImpl <em>Input Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.InputElementImpl
   * @see domain.impl.DomainPackageImpl#getInputElement()
   * @generated
   */
  int INPUT_ELEMENT = 118;

  /**
   * The feature id for the '<em><b>Style</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_ELEMENT__STYLE = SOURCES_POINTER__STYLE;

  /**
   * The feature id for the '<em><b>Style Class</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_ELEMENT__STYLE_CLASS = SOURCES_POINTER__STYLE_CLASS;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_ELEMENT__UID = SOURCES_POINTER__UID;

  /**
   * The feature id for the '<em><b>Nickname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_ELEMENT__NICKNAME = SOURCES_POINTER__NICKNAME;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_ELEMENT__ENABLED = SOURCES_POINTER__ENABLED;

  /**
   * The feature id for the '<em><b>Required</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_ELEMENT__REQUIRED = SOURCES_POINTER__REQUIRED;

  /**
   * The feature id for the '<em><b>Read Only</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_ELEMENT__READ_ONLY = SOURCES_POINTER__READ_ONLY;

  /**
   * The feature id for the '<em><b>On Event Refresh Area</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_ELEMENT__ON_EVENT_REFRESH_AREA = SOURCES_POINTER__ON_EVENT_REFRESH_AREA;

  /**
   * The feature id for the '<em><b>Source Pointer</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_ELEMENT__SOURCE_POINTER = SOURCES_POINTER__SOURCE_POINTER;

  /**
   * The feature id for the '<em><b>Value Pointer</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_ELEMENT__VALUE_POINTER = SOURCES_POINTER__VALUE_POINTER;

  /**
   * The feature id for the '<em><b>Source Cast</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_ELEMENT__SOURCE_CAST = SOURCES_POINTER__SOURCE_CAST;

  /**
   * The number of structural features of the '<em>Input Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_ELEMENT_FEATURE_COUNT = SOURCES_POINTER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link domain.impl.SelectionImpl <em>Selection</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.SelectionImpl
   * @see domain.impl.DomainPackageImpl#getSelection()
   * @generated
   */
  int SELECTION = 119;

  /**
   * The feature id for the '<em><b>Style</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTION__STYLE = STYLE_ELEMENT__STYLE;

  /**
   * The feature id for the '<em><b>Style Class</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTION__STYLE_CLASS = STYLE_ELEMENT__STYLE_CLASS;

  /**
   * The feature id for the '<em><b>Display Option Pointer</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTION__DISPLAY_OPTION_POINTER = STYLE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value Option Pointer</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTION__VALUE_OPTION_POINTER = STYLE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Selection</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTION_FEATURE_COUNT = STYLE_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link domain.impl.OptionSelectionImpl <em>Option Selection</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.OptionSelectionImpl
   * @see domain.impl.DomainPackageImpl#getOptionSelection()
   * @generated
   */
  int OPTION_SELECTION = 120;

  /**
   * The feature id for the '<em><b>Style</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTION_SELECTION__STYLE = INPUT_ELEMENT__STYLE;

  /**
   * The feature id for the '<em><b>Style Class</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTION_SELECTION__STYLE_CLASS = INPUT_ELEMENT__STYLE_CLASS;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTION_SELECTION__UID = INPUT_ELEMENT__UID;

  /**
   * The feature id for the '<em><b>Nickname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTION_SELECTION__NICKNAME = INPUT_ELEMENT__NICKNAME;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTION_SELECTION__ENABLED = INPUT_ELEMENT__ENABLED;

  /**
   * The feature id for the '<em><b>Required</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTION_SELECTION__REQUIRED = INPUT_ELEMENT__REQUIRED;

  /**
   * The feature id for the '<em><b>Read Only</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTION_SELECTION__READ_ONLY = INPUT_ELEMENT__READ_ONLY;

  /**
   * The feature id for the '<em><b>On Event Refresh Area</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTION_SELECTION__ON_EVENT_REFRESH_AREA = INPUT_ELEMENT__ON_EVENT_REFRESH_AREA;

  /**
   * The feature id for the '<em><b>Source Pointer</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTION_SELECTION__SOURCE_POINTER = INPUT_ELEMENT__SOURCE_POINTER;

  /**
   * The feature id for the '<em><b>Value Pointer</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTION_SELECTION__VALUE_POINTER = INPUT_ELEMENT__VALUE_POINTER;

  /**
   * The feature id for the '<em><b>Source Cast</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTION_SELECTION__SOURCE_CAST = INPUT_ELEMENT__SOURCE_CAST;

  /**
   * The feature id for the '<em><b>Option Pointer</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTION_SELECTION__OPTION_POINTER = INPUT_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Option Cast</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTION_SELECTION__OPTION_CAST = INPUT_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Option Selection</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTION_SELECTION_FEATURE_COUNT = INPUT_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link domain.impl.LayerHolderImpl <em>Layer Holder</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.LayerHolderImpl
   * @see domain.impl.DomainPackageImpl#getLayerHolder()
   * @generated
   */
  int LAYER_HOLDER = 121;

  /**
   * The feature id for the '<em><b>Style</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYER_HOLDER__STYLE = UIELEMENT__STYLE;

  /**
   * The feature id for the '<em><b>Style Class</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYER_HOLDER__STYLE_CLASS = UIELEMENT__STYLE_CLASS;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYER_HOLDER__UID = UIELEMENT__UID;

  /**
   * The feature id for the '<em><b>Nickname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYER_HOLDER__NICKNAME = UIELEMENT__NICKNAME;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYER_HOLDER__ENABLED = UIELEMENT__ENABLED;

  /**
   * The feature id for the '<em><b>Required</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYER_HOLDER__REQUIRED = UIELEMENT__REQUIRED;

  /**
   * The feature id for the '<em><b>Read Only</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYER_HOLDER__READ_ONLY = UIELEMENT__READ_ONLY;

  /**
   * The feature id for the '<em><b>On Event Refresh Area</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYER_HOLDER__ON_EVENT_REFRESH_AREA = UIELEMENT__ON_EVENT_REFRESH_AREA;

  /**
   * The feature id for the '<em><b>Children</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYER_HOLDER__CHILDREN = UIELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Columns</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYER_HOLDER__COLUMNS = UIELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Layer Holder</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYER_HOLDER_FEATURE_COUNT = UIELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link domain.impl.InputTextImpl <em>Input Text</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.InputTextImpl
   * @see domain.impl.DomainPackageImpl#getInputText()
   * @generated
   */
  int INPUT_TEXT = 122;

  /**
   * The feature id for the '<em><b>Style</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_TEXT__STYLE = INPUT_ELEMENT__STYLE;

  /**
   * The feature id for the '<em><b>Style Class</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_TEXT__STYLE_CLASS = INPUT_ELEMENT__STYLE_CLASS;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_TEXT__UID = INPUT_ELEMENT__UID;

  /**
   * The feature id for the '<em><b>Nickname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_TEXT__NICKNAME = INPUT_ELEMENT__NICKNAME;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_TEXT__ENABLED = INPUT_ELEMENT__ENABLED;

  /**
   * The feature id for the '<em><b>Required</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_TEXT__REQUIRED = INPUT_ELEMENT__REQUIRED;

  /**
   * The feature id for the '<em><b>Read Only</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_TEXT__READ_ONLY = INPUT_ELEMENT__READ_ONLY;

  /**
   * The feature id for the '<em><b>On Event Refresh Area</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_TEXT__ON_EVENT_REFRESH_AREA = INPUT_ELEMENT__ON_EVENT_REFRESH_AREA;

  /**
   * The feature id for the '<em><b>Source Pointer</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_TEXT__SOURCE_POINTER = INPUT_ELEMENT__SOURCE_POINTER;

  /**
   * The feature id for the '<em><b>Value Pointer</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_TEXT__VALUE_POINTER = INPUT_ELEMENT__VALUE_POINTER;

  /**
   * The feature id for the '<em><b>Source Cast</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_TEXT__SOURCE_CAST = INPUT_ELEMENT__SOURCE_CAST;

  /**
   * The number of structural features of the '<em>Input Text</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_TEXT_FEATURE_COUNT = INPUT_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link domain.impl.LabelImpl <em>Label</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.LabelImpl
   * @see domain.impl.DomainPackageImpl#getLabel()
   * @generated
   */
  int LABEL = 123;

  /**
   * The feature id for the '<em><b>Style</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL__STYLE = UIELEMENT__STYLE;

  /**
   * The feature id for the '<em><b>Style Class</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL__STYLE_CLASS = UIELEMENT__STYLE_CLASS;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL__UID = UIELEMENT__UID;

  /**
   * The feature id for the '<em><b>Nickname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL__NICKNAME = UIELEMENT__NICKNAME;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL__ENABLED = UIELEMENT__ENABLED;

  /**
   * The feature id for the '<em><b>Required</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL__REQUIRED = UIELEMENT__REQUIRED;

  /**
   * The feature id for the '<em><b>Read Only</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL__READ_ONLY = UIELEMENT__READ_ONLY;

  /**
   * The feature id for the '<em><b>On Event Refresh Area</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL__ON_EVENT_REFRESH_AREA = UIELEMENT__ON_EVENT_REFRESH_AREA;

  /**
   * The feature id for the '<em><b>Multi Lang Label</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL__MULTI_LANG_LABEL = UIELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL__LABEL = UIELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Label</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_FEATURE_COUNT = UIELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link domain.impl.OutputTextImpl <em>Output Text</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.OutputTextImpl
   * @see domain.impl.DomainPackageImpl#getOutputText()
   * @generated
   */
  int OUTPUT_TEXT = 124;

  /**
   * The feature id for the '<em><b>Style</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_TEXT__STYLE = INPUT_ELEMENT__STYLE;

  /**
   * The feature id for the '<em><b>Style Class</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_TEXT__STYLE_CLASS = INPUT_ELEMENT__STYLE_CLASS;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_TEXT__UID = INPUT_ELEMENT__UID;

  /**
   * The feature id for the '<em><b>Nickname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_TEXT__NICKNAME = INPUT_ELEMENT__NICKNAME;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_TEXT__ENABLED = INPUT_ELEMENT__ENABLED;

  /**
   * The feature id for the '<em><b>Required</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_TEXT__REQUIRED = INPUT_ELEMENT__REQUIRED;

  /**
   * The feature id for the '<em><b>Read Only</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_TEXT__READ_ONLY = INPUT_ELEMENT__READ_ONLY;

  /**
   * The feature id for the '<em><b>On Event Refresh Area</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_TEXT__ON_EVENT_REFRESH_AREA = INPUT_ELEMENT__ON_EVENT_REFRESH_AREA;

  /**
   * The feature id for the '<em><b>Source Pointer</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_TEXT__SOURCE_POINTER = INPUT_ELEMENT__SOURCE_POINTER;

  /**
   * The feature id for the '<em><b>Value Pointer</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_TEXT__VALUE_POINTER = INPUT_ELEMENT__VALUE_POINTER;

  /**
   * The feature id for the '<em><b>Source Cast</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_TEXT__SOURCE_CAST = INPUT_ELEMENT__SOURCE_CAST;

  /**
   * The number of structural features of the '<em>Output Text</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_TEXT_FEATURE_COUNT = INPUT_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link domain.impl.CheckBoxImpl <em>Check Box</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.CheckBoxImpl
   * @see domain.impl.DomainPackageImpl#getCheckBox()
   * @generated
   */
  int CHECK_BOX = 125;

  /**
   * The feature id for the '<em><b>Style</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_BOX__STYLE = INPUT_ELEMENT__STYLE;

  /**
   * The feature id for the '<em><b>Style Class</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_BOX__STYLE_CLASS = INPUT_ELEMENT__STYLE_CLASS;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_BOX__UID = INPUT_ELEMENT__UID;

  /**
   * The feature id for the '<em><b>Nickname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_BOX__NICKNAME = INPUT_ELEMENT__NICKNAME;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_BOX__ENABLED = INPUT_ELEMENT__ENABLED;

  /**
   * The feature id for the '<em><b>Required</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_BOX__REQUIRED = INPUT_ELEMENT__REQUIRED;

  /**
   * The feature id for the '<em><b>Read Only</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_BOX__READ_ONLY = INPUT_ELEMENT__READ_ONLY;

  /**
   * The feature id for the '<em><b>On Event Refresh Area</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_BOX__ON_EVENT_REFRESH_AREA = INPUT_ELEMENT__ON_EVENT_REFRESH_AREA;

  /**
   * The feature id for the '<em><b>Source Pointer</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_BOX__SOURCE_POINTER = INPUT_ELEMENT__SOURCE_POINTER;

  /**
   * The feature id for the '<em><b>Value Pointer</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_BOX__VALUE_POINTER = INPUT_ELEMENT__VALUE_POINTER;

  /**
   * The feature id for the '<em><b>Source Cast</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_BOX__SOURCE_CAST = INPUT_ELEMENT__SOURCE_CAST;

  /**
   * The number of structural features of the '<em>Check Box</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_BOX_FEATURE_COUNT = INPUT_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link domain.impl.DropDownSelectionImpl <em>Drop Down Selection</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.DropDownSelectionImpl
   * @see domain.impl.DomainPackageImpl#getDropDownSelection()
   * @generated
   */
  int DROP_DOWN_SELECTION = 126;

  /**
   * The feature id for the '<em><b>Style</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DROP_DOWN_SELECTION__STYLE = OPTION_SELECTION__STYLE;

  /**
   * The feature id for the '<em><b>Style Class</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DROP_DOWN_SELECTION__STYLE_CLASS = OPTION_SELECTION__STYLE_CLASS;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DROP_DOWN_SELECTION__UID = OPTION_SELECTION__UID;

  /**
   * The feature id for the '<em><b>Nickname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DROP_DOWN_SELECTION__NICKNAME = OPTION_SELECTION__NICKNAME;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DROP_DOWN_SELECTION__ENABLED = OPTION_SELECTION__ENABLED;

  /**
   * The feature id for the '<em><b>Required</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DROP_DOWN_SELECTION__REQUIRED = OPTION_SELECTION__REQUIRED;

  /**
   * The feature id for the '<em><b>Read Only</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DROP_DOWN_SELECTION__READ_ONLY = OPTION_SELECTION__READ_ONLY;

  /**
   * The feature id for the '<em><b>On Event Refresh Area</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DROP_DOWN_SELECTION__ON_EVENT_REFRESH_AREA = OPTION_SELECTION__ON_EVENT_REFRESH_AREA;

  /**
   * The feature id for the '<em><b>Source Pointer</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DROP_DOWN_SELECTION__SOURCE_POINTER = OPTION_SELECTION__SOURCE_POINTER;

  /**
   * The feature id for the '<em><b>Value Pointer</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DROP_DOWN_SELECTION__VALUE_POINTER = OPTION_SELECTION__VALUE_POINTER;

  /**
   * The feature id for the '<em><b>Source Cast</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DROP_DOWN_SELECTION__SOURCE_CAST = OPTION_SELECTION__SOURCE_CAST;

  /**
   * The feature id for the '<em><b>Option Pointer</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DROP_DOWN_SELECTION__OPTION_POINTER = OPTION_SELECTION__OPTION_POINTER;

  /**
   * The feature id for the '<em><b>Option Cast</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DROP_DOWN_SELECTION__OPTION_CAST = OPTION_SELECTION__OPTION_CAST;

  /**
   * The feature id for the '<em><b>Selection</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DROP_DOWN_SELECTION__SELECTION = OPTION_SELECTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Drop Down Selection</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DROP_DOWN_SELECTION_FEATURE_COUNT = OPTION_SELECTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link domain.impl.ColumnImpl <em>Column</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.ColumnImpl
   * @see domain.impl.DomainPackageImpl#getColumn()
   * @generated
   */
  int COLUMN = 127;

  /**
   * The feature id for the '<em><b>Style</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN__STYLE = STYLE_ELEMENT__STYLE;

  /**
   * The feature id for the '<em><b>Style Class</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN__STYLE_CLASS = STYLE_ELEMENT__STYLE_CLASS;

  /**
   * The feature id for the '<em><b>Multi Lang Label</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN__MULTI_LANG_LABEL = STYLE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN__UID = STYLE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN__LABEL = STYLE_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN__ELEMENT = STYLE_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Column</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_FEATURE_COUNT = STYLE_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link domain.impl.TableImpl <em>Table</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.TableImpl
   * @see domain.impl.DomainPackageImpl#getTable()
   * @generated
   */
  int TABLE = 128;

  /**
   * The feature id for the '<em><b>Style</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE__STYLE = SOURCES_POINTER__STYLE;

  /**
   * The feature id for the '<em><b>Style Class</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE__STYLE_CLASS = SOURCES_POINTER__STYLE_CLASS;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE__UID = SOURCES_POINTER__UID;

  /**
   * The feature id for the '<em><b>Nickname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE__NICKNAME = SOURCES_POINTER__NICKNAME;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE__ENABLED = SOURCES_POINTER__ENABLED;

  /**
   * The feature id for the '<em><b>Required</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE__REQUIRED = SOURCES_POINTER__REQUIRED;

  /**
   * The feature id for the '<em><b>Read Only</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE__READ_ONLY = SOURCES_POINTER__READ_ONLY;

  /**
   * The feature id for the '<em><b>On Event Refresh Area</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE__ON_EVENT_REFRESH_AREA = SOURCES_POINTER__ON_EVENT_REFRESH_AREA;

  /**
   * The feature id for the '<em><b>Source Pointer</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE__SOURCE_POINTER = SOURCES_POINTER__SOURCE_POINTER;

  /**
   * The feature id for the '<em><b>Value Pointer</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE__VALUE_POINTER = SOURCES_POINTER__VALUE_POINTER;

  /**
   * The feature id for the '<em><b>Source Cast</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE__SOURCE_CAST = SOURCES_POINTER__SOURCE_CAST;

  /**
   * The feature id for the '<em><b>Columns</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE__COLUMNS = SOURCES_POINTER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Multi Lang Label</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE__MULTI_LANG_LABEL = SOURCES_POINTER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE__LABEL = SOURCES_POINTER_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Cols</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE__COLS = SOURCES_POINTER_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Table</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_FEATURE_COUNT = SOURCES_POINTER_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link domain.impl.TreeImpl <em>Tree</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.TreeImpl
   * @see domain.impl.DomainPackageImpl#getTree()
   * @generated
   */
  int TREE = 129;

  /**
   * The feature id for the '<em><b>Style</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TREE__STYLE = SOURCES_POINTER__STYLE;

  /**
   * The feature id for the '<em><b>Style Class</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TREE__STYLE_CLASS = SOURCES_POINTER__STYLE_CLASS;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TREE__UID = SOURCES_POINTER__UID;

  /**
   * The feature id for the '<em><b>Nickname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TREE__NICKNAME = SOURCES_POINTER__NICKNAME;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TREE__ENABLED = SOURCES_POINTER__ENABLED;

  /**
   * The feature id for the '<em><b>Required</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TREE__REQUIRED = SOURCES_POINTER__REQUIRED;

  /**
   * The feature id for the '<em><b>Read Only</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TREE__READ_ONLY = SOURCES_POINTER__READ_ONLY;

  /**
   * The feature id for the '<em><b>On Event Refresh Area</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TREE__ON_EVENT_REFRESH_AREA = SOURCES_POINTER__ON_EVENT_REFRESH_AREA;

  /**
   * The feature id for the '<em><b>Source Pointer</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TREE__SOURCE_POINTER = SOURCES_POINTER__SOURCE_POINTER;

  /**
   * The feature id for the '<em><b>Value Pointer</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TREE__VALUE_POINTER = SOURCES_POINTER__VALUE_POINTER;

  /**
   * The feature id for the '<em><b>Source Cast</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TREE__SOURCE_CAST = SOURCES_POINTER__SOURCE_CAST;

  /**
   * The feature id for the '<em><b>Multi Lang Label</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TREE__MULTI_LANG_LABEL = SOURCES_POINTER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TREE__LABEL = SOURCES_POINTER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Image</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TREE__IMAGE = SOURCES_POINTER_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Tree</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TREE_FEATURE_COUNT = SOURCES_POINTER_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link domain.impl.ButtonImpl <em>Button</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.ButtonImpl
   * @see domain.impl.DomainPackageImpl#getButton()
   * @generated
   */
  int BUTTON = 130;

  /**
   * The feature id for the '<em><b>Style</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__STYLE = ACTION_ELEMENT__STYLE;

  /**
   * The feature id for the '<em><b>Style Class</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__STYLE_CLASS = ACTION_ELEMENT__STYLE_CLASS;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__UID = ACTION_ELEMENT__UID;

  /**
   * The feature id for the '<em><b>Nickname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__NICKNAME = ACTION_ELEMENT__NICKNAME;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__ENABLED = ACTION_ELEMENT__ENABLED;

  /**
   * The feature id for the '<em><b>Required</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__REQUIRED = ACTION_ELEMENT__REQUIRED;

  /**
   * The feature id for the '<em><b>Read Only</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__READ_ONLY = ACTION_ELEMENT__READ_ONLY;

  /**
   * The feature id for the '<em><b>On Event Refresh Area</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__ON_EVENT_REFRESH_AREA = ACTION_ELEMENT__ON_EVENT_REFRESH_AREA;

  /**
   * The feature id for the '<em><b>Package Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__PACKAGE_REF = ACTION_ELEMENT__PACKAGE_REF;

  /**
   * The feature id for the '<em><b>Type Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__TYPE_REF = ACTION_ELEMENT__TYPE_REF;

  /**
   * The feature id for the '<em><b>Fake Package Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__FAKE_PACKAGE_NAME = ACTION_ELEMENT__FAKE_PACKAGE_NAME;

  /**
   * The feature id for the '<em><b>Fake Type Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__FAKE_TYPE_NAME = ACTION_ELEMENT__FAKE_TYPE_NAME;

  /**
   * The feature id for the '<em><b>Method Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__METHOD_REF = ACTION_ELEMENT__METHOD_REF;

  /**
   * The feature id for the '<em><b>Fake Method</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__FAKE_METHOD = ACTION_ELEMENT__FAKE_METHOD;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__PARAMETERS = ACTION_ELEMENT__PARAMETERS;

  /**
   * The feature id for the '<em><b>Multi Lang Label</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__MULTI_LANG_LABEL = ACTION_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__LABEL = ACTION_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Button</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON_FEATURE_COUNT = ACTION_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link domain.impl.ControlsImpl <em>Controls</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.ControlsImpl
   * @see domain.impl.DomainPackageImpl#getControls()
   * @generated
   */
  int CONTROLS = 131;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROLS__UID = 0;

  /**
   * The feature id for the '<em><b>Parent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROLS__PARENT = 1;

  /**
   * The feature id for the '<em><b>Root</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROLS__ROOT = 2;

  /**
   * The feature id for the '<em><b>Controls</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROLS__CONTROLS = 3;

  /**
   * The feature id for the '<em><b>Relations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROLS__RELATIONS = 4;

  /**
   * The number of structural features of the '<em>Controls</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROLS_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link domain.impl.PREFormTriggerImpl <em>PRE Form Trigger</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.PREFormTriggerImpl
   * @see domain.impl.DomainPackageImpl#getPREFormTrigger()
   * @generated
   */
  int PRE_FORM_TRIGGER = 133;

  /**
   * The feature id for the '<em><b>Package Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_FORM_TRIGGER__PACKAGE_REF = TRIGGER__PACKAGE_REF;

  /**
   * The feature id for the '<em><b>Type Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_FORM_TRIGGER__TYPE_REF = TRIGGER__TYPE_REF;

  /**
   * The feature id for the '<em><b>Fake Package Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_FORM_TRIGGER__FAKE_PACKAGE_NAME = TRIGGER__FAKE_PACKAGE_NAME;

  /**
   * The feature id for the '<em><b>Fake Type Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_FORM_TRIGGER__FAKE_TYPE_NAME = TRIGGER__FAKE_TYPE_NAME;

  /**
   * The feature id for the '<em><b>Method Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_FORM_TRIGGER__METHOD_REF = TRIGGER__METHOD_REF;

  /**
   * The feature id for the '<em><b>Fake Method</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_FORM_TRIGGER__FAKE_METHOD = TRIGGER__FAKE_METHOD;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_FORM_TRIGGER__PARAMETERS = TRIGGER__PARAMETERS;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_FORM_TRIGGER__UID = TRIGGER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>PRE Form Trigger</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_FORM_TRIGGER_FEATURE_COUNT = TRIGGER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link domain.impl.PREQueryTriggerImpl <em>PRE Query Trigger</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.PREQueryTriggerImpl
   * @see domain.impl.DomainPackageImpl#getPREQueryTrigger()
   * @generated
   */
  int PRE_QUERY_TRIGGER = 134;

  /**
   * The feature id for the '<em><b>Package Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_QUERY_TRIGGER__PACKAGE_REF = TRIGGER__PACKAGE_REF;

  /**
   * The feature id for the '<em><b>Type Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_QUERY_TRIGGER__TYPE_REF = TRIGGER__TYPE_REF;

  /**
   * The feature id for the '<em><b>Fake Package Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_QUERY_TRIGGER__FAKE_PACKAGE_NAME = TRIGGER__FAKE_PACKAGE_NAME;

  /**
   * The feature id for the '<em><b>Fake Type Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_QUERY_TRIGGER__FAKE_TYPE_NAME = TRIGGER__FAKE_TYPE_NAME;

  /**
   * The feature id for the '<em><b>Method Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_QUERY_TRIGGER__METHOD_REF = TRIGGER__METHOD_REF;

  /**
   * The feature id for the '<em><b>Fake Method</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_QUERY_TRIGGER__FAKE_METHOD = TRIGGER__FAKE_METHOD;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_QUERY_TRIGGER__PARAMETERS = TRIGGER__PARAMETERS;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_QUERY_TRIGGER__UID = TRIGGER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>PRE Query Trigger</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_QUERY_TRIGGER_FEATURE_COUNT = TRIGGER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link domain.impl.POSTQueryTriggerImpl <em>POST Query Trigger</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.POSTQueryTriggerImpl
   * @see domain.impl.DomainPackageImpl#getPOSTQueryTrigger()
   * @generated
   */
  int POST_QUERY_TRIGGER = 135;

  /**
   * The feature id for the '<em><b>Package Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POST_QUERY_TRIGGER__PACKAGE_REF = TRIGGER__PACKAGE_REF;

  /**
   * The feature id for the '<em><b>Type Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POST_QUERY_TRIGGER__TYPE_REF = TRIGGER__TYPE_REF;

  /**
   * The feature id for the '<em><b>Fake Package Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POST_QUERY_TRIGGER__FAKE_PACKAGE_NAME = TRIGGER__FAKE_PACKAGE_NAME;

  /**
   * The feature id for the '<em><b>Fake Type Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POST_QUERY_TRIGGER__FAKE_TYPE_NAME = TRIGGER__FAKE_TYPE_NAME;

  /**
   * The feature id for the '<em><b>Method Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POST_QUERY_TRIGGER__METHOD_REF = TRIGGER__METHOD_REF;

  /**
   * The feature id for the '<em><b>Fake Method</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POST_QUERY_TRIGGER__FAKE_METHOD = TRIGGER__FAKE_METHOD;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POST_QUERY_TRIGGER__PARAMETERS = TRIGGER__PARAMETERS;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POST_QUERY_TRIGGER__UID = TRIGGER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>POST Query Trigger</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POST_QUERY_TRIGGER_FEATURE_COUNT = TRIGGER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link domain.impl.PREInsertTriggerImpl <em>PRE Insert Trigger</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.PREInsertTriggerImpl
   * @see domain.impl.DomainPackageImpl#getPREInsertTrigger()
   * @generated
   */
  int PRE_INSERT_TRIGGER = 136;

  /**
   * The feature id for the '<em><b>Package Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_INSERT_TRIGGER__PACKAGE_REF = TRIGGER__PACKAGE_REF;

  /**
   * The feature id for the '<em><b>Type Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_INSERT_TRIGGER__TYPE_REF = TRIGGER__TYPE_REF;

  /**
   * The feature id for the '<em><b>Fake Package Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_INSERT_TRIGGER__FAKE_PACKAGE_NAME = TRIGGER__FAKE_PACKAGE_NAME;

  /**
   * The feature id for the '<em><b>Fake Type Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_INSERT_TRIGGER__FAKE_TYPE_NAME = TRIGGER__FAKE_TYPE_NAME;

  /**
   * The feature id for the '<em><b>Method Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_INSERT_TRIGGER__METHOD_REF = TRIGGER__METHOD_REF;

  /**
   * The feature id for the '<em><b>Fake Method</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_INSERT_TRIGGER__FAKE_METHOD = TRIGGER__FAKE_METHOD;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_INSERT_TRIGGER__PARAMETERS = TRIGGER__PARAMETERS;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_INSERT_TRIGGER__UID = TRIGGER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>PRE Insert Trigger</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_INSERT_TRIGGER_FEATURE_COUNT = TRIGGER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link domain.impl.PREDeleteTriggerImpl <em>PRE Delete Trigger</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.PREDeleteTriggerImpl
   * @see domain.impl.DomainPackageImpl#getPREDeleteTrigger()
   * @generated
   */
  int PRE_DELETE_TRIGGER = 137;

  /**
   * The feature id for the '<em><b>Package Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_DELETE_TRIGGER__PACKAGE_REF = TRIGGER__PACKAGE_REF;

  /**
   * The feature id for the '<em><b>Type Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_DELETE_TRIGGER__TYPE_REF = TRIGGER__TYPE_REF;

  /**
   * The feature id for the '<em><b>Fake Package Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_DELETE_TRIGGER__FAKE_PACKAGE_NAME = TRIGGER__FAKE_PACKAGE_NAME;

  /**
   * The feature id for the '<em><b>Fake Type Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_DELETE_TRIGGER__FAKE_TYPE_NAME = TRIGGER__FAKE_TYPE_NAME;

  /**
   * The feature id for the '<em><b>Method Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_DELETE_TRIGGER__METHOD_REF = TRIGGER__METHOD_REF;

  /**
   * The feature id for the '<em><b>Fake Method</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_DELETE_TRIGGER__FAKE_METHOD = TRIGGER__FAKE_METHOD;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_DELETE_TRIGGER__PARAMETERS = TRIGGER__PARAMETERS;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_DELETE_TRIGGER__UID = TRIGGER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>PRE Delete Trigger</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_DELETE_TRIGGER_FEATURE_COUNT = TRIGGER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link domain.impl.POSTCreateTriggerImpl <em>POST Create Trigger</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.POSTCreateTriggerImpl
   * @see domain.impl.DomainPackageImpl#getPOSTCreateTrigger()
   * @generated
   */
  int POST_CREATE_TRIGGER = 138;

  /**
   * The feature id for the '<em><b>Package Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POST_CREATE_TRIGGER__PACKAGE_REF = TRIGGER__PACKAGE_REF;

  /**
   * The feature id for the '<em><b>Type Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POST_CREATE_TRIGGER__TYPE_REF = TRIGGER__TYPE_REF;

  /**
   * The feature id for the '<em><b>Fake Package Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POST_CREATE_TRIGGER__FAKE_PACKAGE_NAME = TRIGGER__FAKE_PACKAGE_NAME;

  /**
   * The feature id for the '<em><b>Fake Type Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POST_CREATE_TRIGGER__FAKE_TYPE_NAME = TRIGGER__FAKE_TYPE_NAME;

  /**
   * The feature id for the '<em><b>Method Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POST_CREATE_TRIGGER__METHOD_REF = TRIGGER__METHOD_REF;

  /**
   * The feature id for the '<em><b>Fake Method</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POST_CREATE_TRIGGER__FAKE_METHOD = TRIGGER__FAKE_METHOD;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POST_CREATE_TRIGGER__PARAMETERS = TRIGGER__PARAMETERS;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POST_CREATE_TRIGGER__UID = TRIGGER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>POST Create Trigger</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POST_CREATE_TRIGGER_FEATURE_COUNT = TRIGGER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link domain.impl.PREUpdateTriggerImpl <em>PRE Update Trigger</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.PREUpdateTriggerImpl
   * @see domain.impl.DomainPackageImpl#getPREUpdateTrigger()
   * @generated
   */
  int PRE_UPDATE_TRIGGER = 139;

  /**
   * The feature id for the '<em><b>Package Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_UPDATE_TRIGGER__PACKAGE_REF = TRIGGER__PACKAGE_REF;

  /**
   * The feature id for the '<em><b>Type Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_UPDATE_TRIGGER__TYPE_REF = TRIGGER__TYPE_REF;

  /**
   * The feature id for the '<em><b>Fake Package Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_UPDATE_TRIGGER__FAKE_PACKAGE_NAME = TRIGGER__FAKE_PACKAGE_NAME;

  /**
   * The feature id for the '<em><b>Fake Type Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_UPDATE_TRIGGER__FAKE_TYPE_NAME = TRIGGER__FAKE_TYPE_NAME;

  /**
   * The feature id for the '<em><b>Method Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_UPDATE_TRIGGER__METHOD_REF = TRIGGER__METHOD_REF;

  /**
   * The feature id for the '<em><b>Fake Method</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_UPDATE_TRIGGER__FAKE_METHOD = TRIGGER__FAKE_METHOD;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_UPDATE_TRIGGER__PARAMETERS = TRIGGER__PARAMETERS;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_UPDATE_TRIGGER__UID = TRIGGER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>PRE Update Trigger</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_UPDATE_TRIGGER_FEATURE_COUNT = TRIGGER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link domain.impl.CreateTriggerImpl <em>Create Trigger</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.CreateTriggerImpl
   * @see domain.impl.DomainPackageImpl#getCreateTrigger()
   * @generated
   */
  int CREATE_TRIGGER = 140;

  /**
   * The feature id for the '<em><b>Package Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_TRIGGER__PACKAGE_REF = TRIGGER__PACKAGE_REF;

  /**
   * The feature id for the '<em><b>Type Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_TRIGGER__TYPE_REF = TRIGGER__TYPE_REF;

  /**
   * The feature id for the '<em><b>Fake Package Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_TRIGGER__FAKE_PACKAGE_NAME = TRIGGER__FAKE_PACKAGE_NAME;

  /**
   * The feature id for the '<em><b>Fake Type Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_TRIGGER__FAKE_TYPE_NAME = TRIGGER__FAKE_TYPE_NAME;

  /**
   * The feature id for the '<em><b>Method Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_TRIGGER__METHOD_REF = TRIGGER__METHOD_REF;

  /**
   * The feature id for the '<em><b>Fake Method</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_TRIGGER__FAKE_METHOD = TRIGGER__FAKE_METHOD;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_TRIGGER__PARAMETERS = TRIGGER__PARAMETERS;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_TRIGGER__UID = TRIGGER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Create Trigger</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_TRIGGER_FEATURE_COUNT = TRIGGER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link domain.impl.InsertTriggerImpl <em>Insert Trigger</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.InsertTriggerImpl
   * @see domain.impl.DomainPackageImpl#getInsertTrigger()
   * @generated
   */
  int INSERT_TRIGGER = 141;

  /**
   * The feature id for the '<em><b>Package Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSERT_TRIGGER__PACKAGE_REF = TRIGGER__PACKAGE_REF;

  /**
   * The feature id for the '<em><b>Type Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSERT_TRIGGER__TYPE_REF = TRIGGER__TYPE_REF;

  /**
   * The feature id for the '<em><b>Fake Package Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSERT_TRIGGER__FAKE_PACKAGE_NAME = TRIGGER__FAKE_PACKAGE_NAME;

  /**
   * The feature id for the '<em><b>Fake Type Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSERT_TRIGGER__FAKE_TYPE_NAME = TRIGGER__FAKE_TYPE_NAME;

  /**
   * The feature id for the '<em><b>Method Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSERT_TRIGGER__METHOD_REF = TRIGGER__METHOD_REF;

  /**
   * The feature id for the '<em><b>Fake Method</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSERT_TRIGGER__FAKE_METHOD = TRIGGER__FAKE_METHOD;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSERT_TRIGGER__PARAMETERS = TRIGGER__PARAMETERS;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSERT_TRIGGER__UID = TRIGGER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Insert Trigger</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSERT_TRIGGER_FEATURE_COUNT = TRIGGER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link domain.impl.UpdateTriggerImpl <em>Update Trigger</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.UpdateTriggerImpl
   * @see domain.impl.DomainPackageImpl#getUpdateTrigger()
   * @generated
   */
  int UPDATE_TRIGGER = 142;

  /**
   * The feature id for the '<em><b>Package Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_TRIGGER__PACKAGE_REF = TRIGGER__PACKAGE_REF;

  /**
   * The feature id for the '<em><b>Type Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_TRIGGER__TYPE_REF = TRIGGER__TYPE_REF;

  /**
   * The feature id for the '<em><b>Fake Package Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_TRIGGER__FAKE_PACKAGE_NAME = TRIGGER__FAKE_PACKAGE_NAME;

  /**
   * The feature id for the '<em><b>Fake Type Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_TRIGGER__FAKE_TYPE_NAME = TRIGGER__FAKE_TYPE_NAME;

  /**
   * The feature id for the '<em><b>Method Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_TRIGGER__METHOD_REF = TRIGGER__METHOD_REF;

  /**
   * The feature id for the '<em><b>Fake Method</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_TRIGGER__FAKE_METHOD = TRIGGER__FAKE_METHOD;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_TRIGGER__PARAMETERS = TRIGGER__PARAMETERS;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_TRIGGER__UID = TRIGGER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Update Trigger</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_TRIGGER_FEATURE_COUNT = TRIGGER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link domain.impl.DeleteTriggerImpl <em>Delete Trigger</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.DeleteTriggerImpl
   * @see domain.impl.DomainPackageImpl#getDeleteTrigger()
   * @generated
   */
  int DELETE_TRIGGER = 143;

  /**
   * The feature id for the '<em><b>Package Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELETE_TRIGGER__PACKAGE_REF = TRIGGER__PACKAGE_REF;

  /**
   * The feature id for the '<em><b>Type Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELETE_TRIGGER__TYPE_REF = TRIGGER__TYPE_REF;

  /**
   * The feature id for the '<em><b>Fake Package Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELETE_TRIGGER__FAKE_PACKAGE_NAME = TRIGGER__FAKE_PACKAGE_NAME;

  /**
   * The feature id for the '<em><b>Fake Type Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELETE_TRIGGER__FAKE_TYPE_NAME = TRIGGER__FAKE_TYPE_NAME;

  /**
   * The feature id for the '<em><b>Method Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELETE_TRIGGER__METHOD_REF = TRIGGER__METHOD_REF;

  /**
   * The feature id for the '<em><b>Fake Method</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELETE_TRIGGER__FAKE_METHOD = TRIGGER__FAKE_METHOD;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELETE_TRIGGER__PARAMETERS = TRIGGER__PARAMETERS;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELETE_TRIGGER__UID = TRIGGER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Delete Trigger</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELETE_TRIGGER_FEATURE_COUNT = TRIGGER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link domain.impl.SearchTriggerImpl <em>Search Trigger</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.SearchTriggerImpl
   * @see domain.impl.DomainPackageImpl#getSearchTrigger()
   * @generated
   */
  int SEARCH_TRIGGER = 144;

  /**
   * The feature id for the '<em><b>Package Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEARCH_TRIGGER__PACKAGE_REF = TRIGGER__PACKAGE_REF;

  /**
   * The feature id for the '<em><b>Type Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEARCH_TRIGGER__TYPE_REF = TRIGGER__TYPE_REF;

  /**
   * The feature id for the '<em><b>Fake Package Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEARCH_TRIGGER__FAKE_PACKAGE_NAME = TRIGGER__FAKE_PACKAGE_NAME;

  /**
   * The feature id for the '<em><b>Fake Type Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEARCH_TRIGGER__FAKE_TYPE_NAME = TRIGGER__FAKE_TYPE_NAME;

  /**
   * The feature id for the '<em><b>Method Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEARCH_TRIGGER__METHOD_REF = TRIGGER__METHOD_REF;

  /**
   * The feature id for the '<em><b>Fake Method</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEARCH_TRIGGER__FAKE_METHOD = TRIGGER__FAKE_METHOD;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEARCH_TRIGGER__PARAMETERS = TRIGGER__PARAMETERS;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEARCH_TRIGGER__UID = TRIGGER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Search Trigger</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEARCH_TRIGGER_FEATURE_COUNT = TRIGGER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link domain.impl.RootImpl <em>Root</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.RootImpl
   * @see domain.impl.DomainPackageImpl#getRoot()
   * @generated
   */
  int ROOT = 145;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT__UID = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT__NAME = 1;

  /**
   * The feature id for the '<em><b>Pre Form Trigger</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT__PRE_FORM_TRIGGER = 2;

  /**
   * The number of structural features of the '<em>Root</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link domain.impl.DataControlImpl <em>Data Control</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.DataControlImpl
   * @see domain.impl.DomainPackageImpl#getDataControl()
   * @generated
   */
  int DATA_CONTROL = 146;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_CONTROL__UID = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_CONTROL__NAME = 1;

  /**
   * The feature id for the '<em><b>Base Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_CONTROL__BASE_TYPE = 2;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_CONTROL__PARENT = 3;

  /**
   * The feature id for the '<em><b>Pre Query Trigger</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_CONTROL__PRE_QUERY_TRIGGER = 4;

  /**
   * The feature id for the '<em><b>Post Query Trigger</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_CONTROL__POST_QUERY_TRIGGER = 5;

  /**
   * The feature id for the '<em><b>Pre Insert Trigger</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_CONTROL__PRE_INSERT_TRIGGER = 6;

  /**
   * The feature id for the '<em><b>Pre Delete Trigger</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_CONTROL__PRE_DELETE_TRIGGER = 7;

  /**
   * The feature id for the '<em><b>Post Create Trigger</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_CONTROL__POST_CREATE_TRIGGER = 8;

  /**
   * The feature id for the '<em><b>Pre Update Trigger</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_CONTROL__PRE_UPDATE_TRIGGER = 9;

  /**
   * The feature id for the '<em><b>Create</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_CONTROL__CREATE = 10;

  /**
   * The feature id for the '<em><b>Insert</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_CONTROL__INSERT = 11;

  /**
   * The feature id for the '<em><b>Update</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_CONTROL__UPDATE = 12;

  /**
   * The feature id for the '<em><b>Remove</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_CONTROL__REMOVE = 13;

  /**
   * The feature id for the '<em><b>Search</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_CONTROL__SEARCH = 14;

  /**
   * The feature id for the '<em><b>Artificial Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_CONTROL__ARTIFICIAL_FIELDS = 15;

  /**
   * The number of structural features of the '<em>Data Control</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_CONTROL_FEATURE_COUNT = 16;

  /**
   * The meta object id for the '{@link domain.impl.RelationImpl <em>Relation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.RelationImpl
   * @see domain.impl.DomainPackageImpl#getRelation()
   * @generated
   */
  int RELATION = 147;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__UID = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__NAME = 1;

  /**
   * The feature id for the '<em><b>Master</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__MASTER = 2;

  /**
   * The feature id for the '<em><b>Detail</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__DETAIL = 3;

  /**
   * The feature id for the '<em><b>Is Tree</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__IS_TREE = 4;

  /**
   * The feature id for the '<em><b>Links</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__LINKS = 5;

  /**
   * The number of structural features of the '<em>Relation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link domain.impl.ArtificialFieldImpl <em>Artificial Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.ArtificialFieldImpl
   * @see domain.impl.DomainPackageImpl#getArtificialField()
   * @generated
   */
  int ARTIFICIAL_FIELD = 148;

  /**
   * The feature id for the '<em><b>Package Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTIFICIAL_FIELD__PACKAGE_REF = TYPE_POINTER__PACKAGE_REF;

  /**
   * The feature id for the '<em><b>Type Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTIFICIAL_FIELD__TYPE_REF = TYPE_POINTER__TYPE_REF;

  /**
   * The feature id for the '<em><b>Fake Package Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTIFICIAL_FIELD__FAKE_PACKAGE_NAME = TYPE_POINTER__FAKE_PACKAGE_NAME;

  /**
   * The feature id for the '<em><b>Fake Type Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTIFICIAL_FIELD__FAKE_TYPE_NAME = TYPE_POINTER__FAKE_TYPE_NAME;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTIFICIAL_FIELD__UID = TYPE_POINTER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTIFICIAL_FIELD__NAME = TYPE_POINTER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTIFICIAL_FIELD__PARENT = TYPE_POINTER_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Artificial Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTIFICIAL_FIELD_FEATURE_COUNT = TYPE_POINTER_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link domain.impl.LinkImpl <em>Link</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.LinkImpl
   * @see domain.impl.DomainPackageImpl#getLink()
   * @generated
   */
  int LINK = 149;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__UID = 0;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__PARENT = 1;

  /**
   * The feature id for the '<em><b>Master Field</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__MASTER_FIELD = 2;

  /**
   * The feature id for the '<em><b>Detail Field</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__DETAIL_FIELD = 3;

  /**
   * The number of structural features of the '<em>Link</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link domain.impl.ApplicationInfrastructureLayerImpl <em>Application Infrastructure Layer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.ApplicationInfrastructureLayerImpl
   * @see domain.impl.DomainPackageImpl#getApplicationInfrastructureLayer()
   * @generated
   */
  int APPLICATION_INFRASTRUCTURE_LAYER = 150;

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
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_INFRASTRUCTURE_LAYER__PARENT = 2;

  /**
   * The feature id for the '<em><b>Infarastructure</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_INFRASTRUCTURE_LAYER__INFARASTRUCTURE = 3;

  /**
   * The number of structural features of the '<em>Application Infrastructure Layer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_INFRASTRUCTURE_LAYER_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link domain.impl.EnterpriseInfrastructureImpl <em>Enterprise Infrastructure</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.EnterpriseInfrastructureImpl
   * @see domain.impl.DomainPackageImpl#getEnterpriseInfrastructure()
   * @generated
   */
  int ENTERPRISE_INFRASTRUCTURE = 151;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTERPRISE_INFRASTRUCTURE__UID = 0;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTERPRISE_INFRASTRUCTURE__PARENT = 1;

  /**
   * The feature id for the '<em><b>Datacenters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTERPRISE_INFRASTRUCTURE__DATACENTERS = 2;

  /**
   * The feature id for the '<em><b>Infrastructure Connections</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTERPRISE_INFRASTRUCTURE__INFRASTRUCTURE_CONNECTIONS = 3;

  /**
   * The number of structural features of the '<em>Enterprise Infrastructure</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTERPRISE_INFRASTRUCTURE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link domain.impl.DatacenterImpl <em>Datacenter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.DatacenterImpl
   * @see domain.impl.DomainPackageImpl#getDatacenter()
   * @generated
   */
  int DATACENTER = 152;

  /**
   * The feature id for the '<em><b>Columns</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATACENTER__COLUMNS = HTML_LAYER_HOLDER__COLUMNS;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATACENTER__UID = HTML_LAYER_HOLDER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATACENTER__PARENT = HTML_LAYER_HOLDER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Subsystems</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATACENTER__SUBSYSTEMS = HTML_LAYER_HOLDER_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATACENTER__NAME = HTML_LAYER_HOLDER_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Datacenter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATACENTER_FEATURE_COUNT = HTML_LAYER_HOLDER_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link domain.impl.SubsystemImpl <em>Subsystem</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.SubsystemImpl
   * @see domain.impl.DomainPackageImpl#getSubsystem()
   * @generated
   */
  int SUBSYSTEM = 153;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSYSTEM__UID = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSYSTEM__NAME = 1;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSYSTEM__PARENT = 2;

  /**
   * The feature id for the '<em><b>Infrastructure Layer</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSYSTEM__INFRASTRUCTURE_LAYER = 3;

  /**
   * The number of structural features of the '<em>Subsystem</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSYSTEM_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link domain.impl.InfrastructureLayerImpl <em>Infrastructure Layer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.InfrastructureLayerImpl
   * @see domain.impl.DomainPackageImpl#getInfrastructureLayer()
   * @generated
   */
  int INFRASTRUCTURE_LAYER = 154;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFRASTRUCTURE_LAYER__UID = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFRASTRUCTURE_LAYER__NAME = 1;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFRASTRUCTURE_LAYER__PARENT = 2;

  /**
   * The feature id for the '<em><b>Infrastructure Component</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFRASTRUCTURE_LAYER__INFRASTRUCTURE_COMPONENT = 3;

  /**
   * The number of structural features of the '<em>Infrastructure Layer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFRASTRUCTURE_LAYER_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link domain.impl.InfrastructureConnectionImpl <em>Infrastructure Connection</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.InfrastructureConnectionImpl
   * @see domain.impl.DomainPackageImpl#getInfrastructureConnection()
   * @generated
   */
  int INFRASTRUCTURE_CONNECTION = 155;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFRASTRUCTURE_CONNECTION__UID = 0;

  /**
   * The feature id for the '<em><b>Master</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFRASTRUCTURE_CONNECTION__MASTER = 1;

  /**
   * The feature id for the '<em><b>Detail</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFRASTRUCTURE_CONNECTION__DETAIL = 2;

  /**
   * The number of structural features of the '<em>Infrastructure Connection</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFRASTRUCTURE_CONNECTION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link domain.impl.InfrastructureComponentImpl <em>Infrastructure Component</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.InfrastructureComponentImpl
   * @see domain.impl.DomainPackageImpl#getInfrastructureComponent()
   * @generated
   */
  int INFRASTRUCTURE_COMPONENT = 156;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFRASTRUCTURE_COMPONENT__UID = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFRASTRUCTURE_COMPONENT__NAME = 1;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFRASTRUCTURE_COMPONENT__PARENT = 2;

  /**
   * The number of structural features of the '<em>Infrastructure Component</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFRASTRUCTURE_COMPONENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link domain.impl.ServerImpl <em>Server</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.ServerImpl
   * @see domain.impl.DomainPackageImpl#getServer()
   * @generated
   */
  int SERVER = 157;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVER__UID = INFRASTRUCTURE_COMPONENT__UID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVER__NAME = INFRASTRUCTURE_COMPONENT__NAME;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVER__PARENT = INFRASTRUCTURE_COMPONENT__PARENT;

  /**
   * The number of structural features of the '<em>Server</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVER_FEATURE_COUNT = INFRASTRUCTURE_COMPONENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link domain.impl.RouterImpl <em>Router</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.RouterImpl
   * @see domain.impl.DomainPackageImpl#getRouter()
   * @generated
   */
  int ROUTER = 158;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROUTER__UID = INFRASTRUCTURE_COMPONENT__UID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROUTER__NAME = INFRASTRUCTURE_COMPONENT__NAME;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROUTER__PARENT = INFRASTRUCTURE_COMPONENT__PARENT;

  /**
   * The number of structural features of the '<em>Router</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROUTER_FEATURE_COUNT = INFRASTRUCTURE_COMPONENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link domain.impl.HubImpl <em>Hub</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.HubImpl
   * @see domain.impl.DomainPackageImpl#getHub()
   * @generated
   */
  int HUB = 159;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUB__UID = INFRASTRUCTURE_COMPONENT__UID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUB__NAME = INFRASTRUCTURE_COMPONENT__NAME;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUB__PARENT = INFRASTRUCTURE_COMPONENT__PARENT;

  /**
   * The number of structural features of the '<em>Hub</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUB_FEATURE_COUNT = INFRASTRUCTURE_COMPONENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link domain.impl.StorageImpl <em>Storage</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.StorageImpl
   * @see domain.impl.DomainPackageImpl#getStorage()
   * @generated
   */
  int STORAGE = 160;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STORAGE__UID = INFRASTRUCTURE_COMPONENT__UID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STORAGE__NAME = INFRASTRUCTURE_COMPONENT__NAME;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STORAGE__PARENT = INFRASTRUCTURE_COMPONENT__PARENT;

  /**
   * The number of structural features of the '<em>Storage</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STORAGE_FEATURE_COUNT = INFRASTRUCTURE_COMPONENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link domain.impl.ServerClasterImpl <em>Server Claster</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.ServerClasterImpl
   * @see domain.impl.DomainPackageImpl#getServerClaster()
   * @generated
   */
  int SERVER_CLASTER = 161;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVER_CLASTER__UID = INFRASTRUCTURE_COMPONENT__UID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVER_CLASTER__NAME = INFRASTRUCTURE_COMPONENT__NAME;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVER_CLASTER__PARENT = INFRASTRUCTURE_COMPONENT__PARENT;

  /**
   * The feature id for the '<em><b>Servers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVER_CLASTER__SERVERS = INFRASTRUCTURE_COMPONENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Server Claster</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVER_CLASTER_FEATURE_COUNT = INFRASTRUCTURE_COMPONENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link domain.PlatformLayers <em>Platform Layers</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.PlatformLayers
   * @see domain.impl.DomainPackageImpl#getPlatformLayers()
   * @generated
   */
  int PLATFORM_LAYERS = 162;


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
   * Returns the meta object for class '{@link domain.HTMLLayerHolder <em>HTML Layer Holder</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>HTML Layer Holder</em>'.
   * @see domain.HTMLLayerHolder
   * @generated
   */
  EClass getHTMLLayerHolder();

  /**
   * Returns the meta object for the attribute '{@link domain.HTMLLayerHolder#getColumns <em>Columns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Columns</em>'.
   * @see domain.HTMLLayerHolder#getColumns()
   * @see #getHTMLLayerHolder()
   * @generated
   */
  EAttribute getHTMLLayerHolder_Columns();

  /**
   * Returns the meta object for class '{@link domain.Categorized <em>Categorized</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Categorized</em>'.
   * @see domain.Categorized
   * @generated
   */
  EClass getCategorized();

  /**
   * Returns the meta object for the containment reference list '{@link domain.Categorized#getClassifiers <em>Classifiers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Classifiers</em>'.
   * @see domain.Categorized#getClassifiers()
   * @see #getCategorized()
   * @generated
   */
  EReference getCategorized_Classifiers();

  /**
   * Returns the meta object for class '{@link domain.Classifier <em>Classifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Classifier</em>'.
   * @see domain.Classifier
   * @generated
   */
  EClass getClassifier();

  /**
   * Returns the meta object for the attribute '{@link domain.Classifier#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.Classifier#getUid()
   * @see #getClassifier()
   * @generated
   */
  EAttribute getClassifier_Uid();

  /**
   * Returns the meta object for the reference '{@link domain.Classifier#getHint <em>Hint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Hint</em>'.
   * @see domain.Classifier#getHint()
   * @see #getClassifier()
   * @generated
   */
  EReference getClassifier_Hint();

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
   * Returns the meta object for class '{@link domain.ContinuousIintegration <em>Continuous Iintegration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Continuous Iintegration</em>'.
   * @see domain.ContinuousIintegration
   * @generated
   */
  EClass getContinuousIintegration();

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
   * Returns the meta object for the containment reference list '{@link domain.Artifact#getHints <em>Hints</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Hints</em>'.
   * @see domain.Artifact#getHints()
   * @see #getArtifact()
   * @generated
   */
  EReference getArtifact_Hints();

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
   * Returns the meta object for class '{@link domain.GenerationHint <em>Generation Hint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Generation Hint</em>'.
   * @see domain.GenerationHint
   * @generated
   */
  EClass getGenerationHint();

  /**
   * Returns the meta object for the attribute '{@link domain.GenerationHint#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.GenerationHint#getUid()
   * @see #getGenerationHint()
   * @generated
   */
  EAttribute getGenerationHint_Uid();

  /**
   * Returns the meta object for the attribute '{@link domain.GenerationHint#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see domain.GenerationHint#getName()
   * @see #getGenerationHint()
   * @generated
   */
  EAttribute getGenerationHint_Name();

  /**
   * Returns the meta object for the attribute '{@link domain.GenerationHint#getApplyedClass <em>Applyed Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Applyed Class</em>'.
   * @see domain.GenerationHint#getApplyedClass()
   * @see #getGenerationHint()
   * @generated
   */
  EAttribute getGenerationHint_ApplyedClass();

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
   * Returns the meta object for class '{@link domain.ModelQuery <em>Model Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model Query</em>'.
   * @see domain.ModelQuery
   * @generated
   */
  EClass getModelQuery();

  /**
   * Returns the meta object for the attribute '{@link domain.ModelQuery#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.ModelQuery#getUid()
   * @see #getModelQuery()
   * @generated
   */
  EAttribute getModelQuery_Uid();

  /**
   * Returns the meta object for the attribute '{@link domain.ModelQuery#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see domain.ModelQuery#getName()
   * @see #getModelQuery()
   * @generated
   */
  EAttribute getModelQuery_Name();

  /**
   * Returns the meta object for the attribute '{@link domain.ModelQuery#getQuery <em>Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Query</em>'.
   * @see domain.ModelQuery#getQuery()
   * @see #getModelQuery()
   * @generated
   */
  EAttribute getModelQuery_Query();

  /**
   * Returns the meta object for the container reference '{@link domain.ModelQuery#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Parent</em>'.
   * @see domain.ModelQuery#getParent()
   * @see #getModelQuery()
   * @generated
   */
  EReference getModelQuery_Parent();

  /**
   * Returns the meta object for the containment reference list '{@link domain.ModelQuery#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see domain.ModelQuery#getParameters()
   * @see #getModelQuery()
   * @generated
   */
  EReference getModelQuery_Parameters();

  /**
   * Returns the meta object for class '{@link domain.QueryParameter <em>Query Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Query Parameter</em>'.
   * @see domain.QueryParameter
   * @generated
   */
  EClass getQueryParameter();

  /**
   * Returns the meta object for the attribute '{@link domain.QueryParameter#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.QueryParameter#getUid()
   * @see #getQueryParameter()
   * @generated
   */
  EAttribute getQueryParameter_Uid();

  /**
   * Returns the meta object for the container reference '{@link domain.QueryParameter#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Parent</em>'.
   * @see domain.QueryParameter#getParent()
   * @see #getQueryParameter()
   * @generated
   */
  EReference getQueryParameter_Parent();

  /**
   * Returns the meta object for the attribute '{@link domain.QueryParameter#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see domain.QueryParameter#getName()
   * @see #getQueryParameter()
   * @generated
   */
  EAttribute getQueryParameter_Name();

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
   * Returns the meta object for the containment reference '{@link domain.Application#getApplicationUILayer <em>Application UI Layer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Application UI Layer</em>'.
   * @see domain.Application#getApplicationUILayer()
   * @see #getApplication()
   * @generated
   */
  EReference getApplication_ApplicationUILayer();

  /**
   * Returns the meta object for the containment reference '{@link domain.Application#getApplicationInfrastructureLayer <em>Application Infrastructure Layer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Application Infrastructure Layer</em>'.
   * @see domain.Application#getApplicationInfrastructureLayer()
   * @see #getApplication()
   * @generated
   */
  EReference getApplication_ApplicationInfrastructureLayer();

  /**
   * Returns the meta object for the containment reference '{@link domain.Application#getApplicationStyle <em>Application Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Application Style</em>'.
   * @see domain.Application#getApplicationStyle()
   * @see #getApplication()
   * @generated
   */
  EReference getApplication_ApplicationStyle();

  /**
   * Returns the meta object for the containment reference '{@link domain.Application#getApplicationRole <em>Application Role</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Application Role</em>'.
   * @see domain.Application#getApplicationRole()
   * @see #getApplication()
   * @generated
   */
  EReference getApplication_ApplicationRole();

  /**
   * Returns the meta object for the containment reference '{@link domain.Application#getApplicationMessages <em>Application Messages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Application Messages</em>'.
   * @see domain.Application#getApplicationMessages()
   * @see #getApplication()
   * @generated
   */
  EReference getApplication_ApplicationMessages();

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
   * Returns the meta object for class '{@link domain.ApplicationMessages <em>Application Messages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Application Messages</em>'.
   * @see domain.ApplicationMessages
   * @generated
   */
  EClass getApplicationMessages();

  /**
   * Returns the meta object for the attribute '{@link domain.ApplicationMessages#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.ApplicationMessages#getUid()
   * @see #getApplicationMessages()
   * @generated
   */
  EAttribute getApplicationMessages_Uid();

  /**
   * Returns the meta object for the attribute '{@link domain.ApplicationMessages#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see domain.ApplicationMessages#getName()
   * @see #getApplicationMessages()
   * @generated
   */
  EAttribute getApplicationMessages_Name();

  /**
   * Returns the meta object for the container reference '{@link domain.ApplicationMessages#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Parent</em>'.
   * @see domain.ApplicationMessages#getParent()
   * @see #getApplicationMessages()
   * @generated
   */
  EReference getApplicationMessages_Parent();

  /**
   * Returns the meta object for the reference '{@link domain.ApplicationMessages#getMessages <em>Messages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Messages</em>'.
   * @see domain.ApplicationMessages#getMessages()
   * @see #getApplicationMessages()
   * @generated
   */
  EReference getApplicationMessages_Messages();

  /**
   * Returns the meta object for class '{@link domain.ApplicationRole <em>Application Role</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Application Role</em>'.
   * @see domain.ApplicationRole
   * @generated
   */
  EClass getApplicationRole();

  /**
   * Returns the meta object for the attribute '{@link domain.ApplicationRole#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.ApplicationRole#getUid()
   * @see #getApplicationRole()
   * @generated
   */
  EAttribute getApplicationRole_Uid();

  /**
   * Returns the meta object for the attribute '{@link domain.ApplicationRole#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see domain.ApplicationRole#getName()
   * @see #getApplicationRole()
   * @generated
   */
  EAttribute getApplicationRole_Name();

  /**
   * Returns the meta object for the container reference '{@link domain.ApplicationRole#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Parent</em>'.
   * @see domain.ApplicationRole#getParent()
   * @see #getApplicationRole()
   * @generated
   */
  EReference getApplicationRole_Parent();

  /**
   * Returns the meta object for the reference '{@link domain.ApplicationRole#getRoles <em>Roles</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Roles</em>'.
   * @see domain.ApplicationRole#getRoles()
   * @see #getApplicationRole()
   * @generated
   */
  EReference getApplicationRole_Roles();

  /**
   * Returns the meta object for class '{@link domain.ApplicationStyle <em>Application Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Application Style</em>'.
   * @see domain.ApplicationStyle
   * @generated
   */
  EClass getApplicationStyle();

  /**
   * Returns the meta object for the attribute '{@link domain.ApplicationStyle#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.ApplicationStyle#getUid()
   * @see #getApplicationStyle()
   * @generated
   */
  EAttribute getApplicationStyle_Uid();

  /**
   * Returns the meta object for the attribute '{@link domain.ApplicationStyle#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see domain.ApplicationStyle#getName()
   * @see #getApplicationStyle()
   * @generated
   */
  EAttribute getApplicationStyle_Name();

  /**
   * Returns the meta object for the container reference '{@link domain.ApplicationStyle#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Parent</em>'.
   * @see domain.ApplicationStyle#getParent()
   * @see #getApplicationStyle()
   * @generated
   */
  EReference getApplicationStyle_Parent();

  /**
   * Returns the meta object for the containment reference list '{@link domain.ApplicationStyle#getStylesPackage <em>Styles Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Styles Package</em>'.
   * @see domain.ApplicationStyle#getStylesPackage()
   * @see #getApplicationStyle()
   * @generated
   */
  EReference getApplicationStyle_StylesPackage();

  /**
   * Returns the meta object for class '{@link domain.StylesPackage <em>Styles Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Styles Package</em>'.
   * @see domain.StylesPackage
   * @generated
   */
  EClass getStylesPackage();

  /**
   * Returns the meta object for the attribute '{@link domain.StylesPackage#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.StylesPackage#getUid()
   * @see #getStylesPackage()
   * @generated
   */
  EAttribute getStylesPackage_Uid();

  /**
   * Returns the meta object for the attribute '{@link domain.StylesPackage#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see domain.StylesPackage#getName()
   * @see #getStylesPackage()
   * @generated
   */
  EAttribute getStylesPackage_Name();

  /**
   * Returns the meta object for the container reference '{@link domain.StylesPackage#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Parent</em>'.
   * @see domain.StylesPackage#getParent()
   * @see #getStylesPackage()
   * @generated
   */
  EReference getStylesPackage_Parent();

  /**
   * Returns the meta object for the reference '{@link domain.StylesPackage#getStyles <em>Styles</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Styles</em>'.
   * @see domain.StylesPackage#getStyles()
   * @see #getStylesPackage()
   * @generated
   */
  EReference getStylesPackage_Styles();

  /**
   * Returns the meta object for class '{@link domain.ApplicationUILayer <em>Application UI Layer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Application UI Layer</em>'.
   * @see domain.ApplicationUILayer
   * @generated
   */
  EClass getApplicationUILayer();

  /**
   * Returns the meta object for the attribute '{@link domain.ApplicationUILayer#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.ApplicationUILayer#getUid()
   * @see #getApplicationUILayer()
   * @generated
   */
  EAttribute getApplicationUILayer_Uid();

  /**
   * Returns the meta object for the attribute '{@link domain.ApplicationUILayer#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see domain.ApplicationUILayer#getName()
   * @see #getApplicationUILayer()
   * @generated
   */
  EAttribute getApplicationUILayer_Name();

  /**
   * Returns the meta object for the container reference '{@link domain.ApplicationUILayer#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Parent</em>'.
   * @see domain.ApplicationUILayer#getParent()
   * @see #getApplicationUILayer()
   * @generated
   */
  EReference getApplicationUILayer_Parent();

  /**
   * Returns the meta object for the containment reference list '{@link domain.ApplicationUILayer#getApplicationUIPackages <em>Application UI Packages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Application UI Packages</em>'.
   * @see domain.ApplicationUILayer#getApplicationUIPackages()
   * @see #getApplicationUILayer()
   * @generated
   */
  EReference getApplicationUILayer_ApplicationUIPackages();

  /**
   * Returns the meta object for class '{@link domain.ApplicationUIPackage <em>Application UI Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Application UI Package</em>'.
   * @see domain.ApplicationUIPackage
   * @generated
   */
  EClass getApplicationUIPackage();

  /**
   * Returns the meta object for the attribute '{@link domain.ApplicationUIPackage#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.ApplicationUIPackage#getUid()
   * @see #getApplicationUIPackage()
   * @generated
   */
  EAttribute getApplicationUIPackage_Uid();

  /**
   * Returns the meta object for the attribute '{@link domain.ApplicationUIPackage#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see domain.ApplicationUIPackage#getName()
   * @see #getApplicationUIPackage()
   * @generated
   */
  EAttribute getApplicationUIPackage_Name();

  /**
   * Returns the meta object for the container reference '{@link domain.ApplicationUIPackage#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Parent</em>'.
   * @see domain.ApplicationUIPackage#getParent()
   * @see #getApplicationUIPackage()
   * @generated
   */
  EReference getApplicationUIPackage_Parent();

  /**
   * Returns the meta object for the reference '{@link domain.ApplicationUIPackage#getUipackage <em>Uipackage</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Uipackage</em>'.
   * @see domain.ApplicationUIPackage#getUipackage()
   * @see #getApplicationUIPackage()
   * @generated
   */
  EReference getApplicationUIPackage_Uipackage();

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
   * Returns the meta object for class '{@link domain.MethodPointer <em>Method Pointer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Method Pointer</em>'.
   * @see domain.MethodPointer
   * @generated
   */
  EClass getMethodPointer();

  /**
   * Returns the meta object for the reference '{@link domain.MethodPointer#getMethodRef <em>Method Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Method Ref</em>'.
   * @see domain.MethodPointer#getMethodRef()
   * @see #getMethodPointer()
   * @generated
   */
  EReference getMethodPointer_MethodRef();

  /**
   * Returns the meta object for the attribute '{@link domain.MethodPointer#getFakeMethod <em>Fake Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fake Method</em>'.
   * @see domain.MethodPointer#getFakeMethod()
   * @see #getMethodPointer()
   * @generated
   */
  EAttribute getMethodPointer_FakeMethod();

  /**
   * Returns the meta object for class '{@link domain.Messages <em>Messages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Messages</em>'.
   * @see domain.Messages
   * @generated
   */
  EClass getMessages();

  /**
   * Returns the meta object for the attribute '{@link domain.Messages#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.Messages#getUid()
   * @see #getMessages()
   * @generated
   */
  EAttribute getMessages_Uid();

  /**
   * Returns the meta object for the reference '{@link domain.Messages#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Parent</em>'.
   * @see domain.Messages#getParent()
   * @see #getMessages()
   * @generated
   */
  EReference getMessages_Parent();

  /**
   * Returns the meta object for the containment reference list '{@link domain.Messages#getMessageLibraries <em>Message Libraries</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Message Libraries</em>'.
   * @see domain.Messages#getMessageLibraries()
   * @see #getMessages()
   * @generated
   */
  EReference getMessages_MessageLibraries();

  /**
   * Returns the meta object for class '{@link domain.MessageLibrary <em>Message Library</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Message Library</em>'.
   * @see domain.MessageLibrary
   * @generated
   */
  EClass getMessageLibrary();

  /**
   * Returns the meta object for the attribute '{@link domain.MessageLibrary#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.MessageLibrary#getUid()
   * @see #getMessageLibrary()
   * @generated
   */
  EAttribute getMessageLibrary_Uid();

  /**
   * Returns the meta object for the attribute '{@link domain.MessageLibrary#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see domain.MessageLibrary#getName()
   * @see #getMessageLibrary()
   * @generated
   */
  EAttribute getMessageLibrary_Name();

  /**
   * Returns the meta object for the containment reference list '{@link domain.MessageLibrary#getLibLanguages <em>Lib Languages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Lib Languages</em>'.
   * @see domain.MessageLibrary#getLibLanguages()
   * @see #getMessageLibrary()
   * @generated
   */
  EReference getMessageLibrary_LibLanguages();

  /**
   * Returns the meta object for the containment reference list '{@link domain.MessageLibrary#getMessages <em>Messages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Messages</em>'.
   * @see domain.MessageLibrary#getMessages()
   * @see #getMessageLibrary()
   * @generated
   */
  EReference getMessageLibrary_Messages();

  /**
   * Returns the meta object for class '{@link domain.LanguageRef <em>Language Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Language Ref</em>'.
   * @see domain.LanguageRef
   * @generated
   */
  EClass getLanguageRef();

  /**
   * Returns the meta object for the attribute '{@link domain.LanguageRef#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.LanguageRef#getUid()
   * @see #getLanguageRef()
   * @generated
   */
  EAttribute getLanguageRef_Uid();

  /**
   * Returns the meta object for the reference '{@link domain.LanguageRef#getLang <em>Lang</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Lang</em>'.
   * @see domain.LanguageRef#getLang()
   * @see #getLanguageRef()
   * @generated
   */
  EReference getLanguageRef_Lang();

  /**
   * Returns the meta object for class '{@link domain.Message <em>Message</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Message</em>'.
   * @see domain.Message
   * @generated
   */
  EClass getMessage();

  /**
   * Returns the meta object for the attribute '{@link domain.Message#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.Message#getUid()
   * @see #getMessage()
   * @generated
   */
  EAttribute getMessage_Uid();

  /**
   * Returns the meta object for the attribute '{@link domain.Message#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see domain.Message#getName()
   * @see #getMessage()
   * @generated
   */
  EAttribute getMessage_Name();

  /**
   * Returns the meta object for the containment reference list '{@link domain.Message#getTranslatioins <em>Translatioins</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Translatioins</em>'.
   * @see domain.Message#getTranslatioins()
   * @see #getMessage()
   * @generated
   */
  EReference getMessage_Translatioins();

  /**
   * Returns the meta object for class '{@link domain.Translation <em>Translation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Translation</em>'.
   * @see domain.Translation
   * @generated
   */
  EClass getTranslation();

  /**
   * Returns the meta object for the attribute '{@link domain.Translation#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.Translation#getUid()
   * @see #getTranslation()
   * @generated
   */
  EAttribute getTranslation_Uid();

  /**
   * Returns the meta object for the attribute '{@link domain.Translation#getTranslation <em>Translation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Translation</em>'.
   * @see domain.Translation#getTranslation()
   * @see #getTranslation()
   * @generated
   */
  EAttribute getTranslation_Translation();

  /**
   * Returns the meta object for the reference '{@link domain.Translation#getLang <em>Lang</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Lang</em>'.
   * @see domain.Translation#getLang()
   * @see #getTranslation()
   * @generated
   */
  EReference getTranslation_Lang();

  /**
   * Returns the meta object for class '{@link domain.Language <em>Language</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Language</em>'.
   * @see domain.Language
   * @generated
   */
  EClass getLanguage();

  /**
   * Returns the meta object for the attribute '{@link domain.Language#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.Language#getUid()
   * @see #getLanguage()
   * @generated
   */
  EAttribute getLanguage_Uid();

  /**
   * Returns the meta object for the attribute '{@link domain.Language#getLang <em>Lang</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lang</em>'.
   * @see domain.Language#getLang()
   * @see #getLanguage()
   * @generated
   */
  EAttribute getLanguage_Lang();

  /**
   * Returns the meta object for the attribute '{@link domain.Language#getCode <em>Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Code</em>'.
   * @see domain.Language#getCode()
   * @see #getLanguage()
   * @generated
   */
  EAttribute getLanguage_Code();

  /**
   * Returns the meta object for class '{@link domain.Roles <em>Roles</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Roles</em>'.
   * @see domain.Roles
   * @generated
   */
  EClass getRoles();

  /**
   * Returns the meta object for the attribute '{@link domain.Roles#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.Roles#getUid()
   * @see #getRoles()
   * @generated
   */
  EAttribute getRoles_Uid();

  /**
   * Returns the meta object for the reference '{@link domain.Roles#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Parent</em>'.
   * @see domain.Roles#getParent()
   * @see #getRoles()
   * @generated
   */
  EReference getRoles_Parent();

  /**
   * Returns the meta object for the containment reference list '{@link domain.Roles#getRoles <em>Roles</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Roles</em>'.
   * @see domain.Roles#getRoles()
   * @see #getRoles()
   * @generated
   */
  EReference getRoles_Roles();

  /**
   * Returns the meta object for the containment reference list '{@link domain.Roles#getGroups <em>Groups</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Groups</em>'.
   * @see domain.Roles#getGroups()
   * @see #getRoles()
   * @generated
   */
  EReference getRoles_Groups();

  /**
   * Returns the meta object for class '{@link domain.Role <em>Role</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Role</em>'.
   * @see domain.Role
   * @generated
   */
  EClass getRole();

  /**
   * Returns the meta object for the attribute '{@link domain.Role#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.Role#getUid()
   * @see #getRole()
   * @generated
   */
  EAttribute getRole_Uid();

  /**
   * Returns the meta object for the attribute '{@link domain.Role#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see domain.Role#getName()
   * @see #getRole()
   * @generated
   */
  EAttribute getRole_Name();

  /**
   * Returns the meta object for class '{@link domain.Group <em>Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Group</em>'.
   * @see domain.Group
   * @generated
   */
  EClass getGroup();

  /**
   * Returns the meta object for the attribute '{@link domain.Group#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.Group#getUid()
   * @see #getGroup()
   * @generated
   */
  EAttribute getGroup_Uid();

  /**
   * Returns the meta object for the attribute '{@link domain.Group#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see domain.Group#getName()
   * @see #getGroup()
   * @generated
   */
  EAttribute getGroup_Name();

  /**
   * Returns the meta object for the reference list '{@link domain.Group#getGroup2Group <em>Group2 Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Group2 Group</em>'.
   * @see domain.Group#getGroup2Group()
   * @see #getGroup()
   * @generated
   */
  EReference getGroup_Group2Group();

  /**
   * Returns the meta object for the reference list '{@link domain.Group#getGroup2Role <em>Group2 Role</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Group2 Role</em>'.
   * @see domain.Group#getGroup2Role()
   * @see #getGroup()
   * @generated
   */
  EReference getGroup_Group2Role();

  /**
   * Returns the meta object for class '{@link domain.Styles <em>Styles</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Styles</em>'.
   * @see domain.Styles
   * @generated
   */
  EClass getStyles();

  /**
   * Returns the meta object for the attribute '{@link domain.Styles#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.Styles#getUid()
   * @see #getStyles()
   * @generated
   */
  EAttribute getStyles_Uid();

  /**
   * Returns the meta object for the reference '{@link domain.Styles#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Parent</em>'.
   * @see domain.Styles#getParent()
   * @see #getStyles()
   * @generated
   */
  EReference getStyles_Parent();

  /**
   * Returns the meta object for the containment reference list '{@link domain.Styles#getLibraries <em>Libraries</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Libraries</em>'.
   * @see domain.Styles#getLibraries()
   * @see #getStyles()
   * @generated
   */
  EReference getStyles_Libraries();

  /**
   * Returns the meta object for class '{@link domain.StyleLibrary <em>Style Library</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Style Library</em>'.
   * @see domain.StyleLibrary
   * @generated
   */
  EClass getStyleLibrary();

  /**
   * Returns the meta object for the attribute '{@link domain.StyleLibrary#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.StyleLibrary#getUid()
   * @see #getStyleLibrary()
   * @generated
   */
  EAttribute getStyleLibrary_Uid();

  /**
   * Returns the meta object for the attribute '{@link domain.StyleLibrary#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see domain.StyleLibrary#getName()
   * @see #getStyleLibrary()
   * @generated
   */
  EAttribute getStyleLibrary_Name();

  /**
   * Returns the meta object for the containment reference list '{@link domain.StyleLibrary#getStyles <em>Styles</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Styles</em>'.
   * @see domain.StyleLibrary#getStyles()
   * @see #getStyleLibrary()
   * @generated
   */
  EReference getStyleLibrary_Styles();

  /**
   * Returns the meta object for class '{@link domain.StyleSet <em>Style Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Style Set</em>'.
   * @see domain.StyleSet
   * @generated
   */
  EClass getStyleSet();

  /**
   * Returns the meta object for the attribute '{@link domain.StyleSet#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.StyleSet#getUid()
   * @see #getStyleSet()
   * @generated
   */
  EAttribute getStyleSet_Uid();

  /**
   * Returns the meta object for the attribute '{@link domain.StyleSet#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see domain.StyleSet#getName()
   * @see #getStyleSet()
   * @generated
   */
  EAttribute getStyleSet_Name();

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
   * Returns the meta object for class '{@link domain.TypeMapper <em>Type Mapper</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Mapper</em>'.
   * @see domain.TypeMapper
   * @generated
   */
  EClass getTypeMapper();

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
   * Returns the meta object for class '{@link domain.JavaScriptMapper <em>Java Script Mapper</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Java Script Mapper</em>'.
   * @see domain.JavaScriptMapper
   * @generated
   */
  EClass getJavaScriptMapper();

  /**
   * Returns the meta object for the attribute '{@link domain.JavaScriptMapper#getLibraryUrl <em>Library Url</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Library Url</em>'.
   * @see domain.JavaScriptMapper#getLibraryUrl()
   * @see #getJavaScriptMapper()
   * @generated
   */
  EAttribute getJavaScriptMapper_LibraryUrl();

  /**
   * Returns the meta object for class '{@link domain.CSSMapper <em>CSS Mapper</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>CSS Mapper</em>'.
   * @see domain.CSSMapper
   * @generated
   */
  EClass getCSSMapper();

  /**
   * Returns the meta object for the attribute '{@link domain.CSSMapper#getLibraryUrl <em>Library Url</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Library Url</em>'.
   * @see domain.CSSMapper#getLibraryUrl()
   * @see #getCSSMapper()
   * @generated
   */
  EAttribute getCSSMapper_LibraryUrl();

  /**
   * Returns the meta object for the reference '{@link domain.CSSMapper#getStylePackage <em>Style Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Style Package</em>'.
   * @see domain.CSSMapper#getStylePackage()
   * @see #getCSSMapper()
   * @generated
   */
  EReference getCSSMapper_StylePackage();

  /**
   * Returns the meta object for the reference '{@link domain.CSSMapper#getStyleLibrary <em>Style Library</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Style Library</em>'.
   * @see domain.CSSMapper#getStyleLibrary()
   * @see #getCSSMapper()
   * @generated
   */
  EReference getCSSMapper_StyleLibrary();

  /**
   * Returns the meta object for the attribute '{@link domain.CSSMapper#getFakePackageName <em>Fake Package Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fake Package Name</em>'.
   * @see domain.CSSMapper#getFakePackageName()
   * @see #getCSSMapper()
   * @generated
   */
  EAttribute getCSSMapper_FakePackageName();

  /**
   * Returns the meta object for the attribute '{@link domain.CSSMapper#getFakeTypeName <em>Fake Type Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fake Type Name</em>'.
   * @see domain.CSSMapper#getFakeTypeName()
   * @see #getCSSMapper()
   * @generated
   */
  EAttribute getCSSMapper_FakeTypeName();

  /**
   * Returns the meta object for class '{@link domain.RoleMapper <em>Role Mapper</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Role Mapper</em>'.
   * @see domain.RoleMapper
   * @generated
   */
  EClass getRoleMapper();

  /**
   * Returns the meta object for the reference '{@link domain.RoleMapper#getRole <em>Role</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Role</em>'.
   * @see domain.RoleMapper#getRole()
   * @see #getRoleMapper()
   * @generated
   */
  EReference getRoleMapper_Role();

  /**
   * Returns the meta object for the attribute '{@link domain.RoleMapper#getLocalRoleName <em>Local Role Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Local Role Name</em>'.
   * @see domain.RoleMapper#getLocalRoleName()
   * @see #getRoleMapper()
   * @generated
   */
  EAttribute getRoleMapper_LocalRoleName();

  /**
   * Returns the meta object for the attribute '{@link domain.RoleMapper#getGlobalRoleName <em>Global Role Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Global Role Name</em>'.
   * @see domain.RoleMapper#getGlobalRoleName()
   * @see #getRoleMapper()
   * @generated
   */
  EAttribute getRoleMapper_GlobalRoleName();

  /**
   * Returns the meta object for the attribute '{@link domain.RoleMapper#getFakeRoleName <em>Fake Role Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fake Role Name</em>'.
   * @see domain.RoleMapper#getFakeRoleName()
   * @see #getRoleMapper()
   * @generated
   */
  EAttribute getRoleMapper_FakeRoleName();

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
   * Returns the meta object for the containment reference '{@link domain.Recipes#getDeployment <em>Deployment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Deployment</em>'.
   * @see domain.Recipes#getDeployment()
   * @see #getRecipes()
   * @generated
   */
  EReference getRecipes_Deployment();

  /**
   * Returns the meta object for class '{@link domain.DeploymentSequence <em>Deployment Sequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Deployment Sequence</em>'.
   * @see domain.DeploymentSequence
   * @generated
   */
  EClass getDeploymentSequence();

  /**
   * Returns the meta object for the attribute '{@link domain.DeploymentSequence#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.DeploymentSequence#getUid()
   * @see #getDeploymentSequence()
   * @generated
   */
  EAttribute getDeploymentSequence_Uid();

  /**
   * Returns the meta object for the attribute '{@link domain.DeploymentSequence#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see domain.DeploymentSequence#getName()
   * @see #getDeploymentSequence()
   * @generated
   */
  EAttribute getDeploymentSequence_Name();

  /**
   * Returns the meta object for the containment reference '{@link domain.DeploymentSequence#getDeploymentComponents <em>Deployment Components</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Deployment Components</em>'.
   * @see domain.DeploymentSequence#getDeploymentComponents()
   * @see #getDeploymentSequence()
   * @generated
   */
  EReference getDeploymentSequence_DeploymentComponents();

  /**
   * Returns the meta object for class '{@link domain.DeploymentComponents <em>Deployment Components</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Deployment Components</em>'.
   * @see domain.DeploymentComponents
   * @generated
   */
  EClass getDeploymentComponents();

  /**
   * Returns the meta object for the attribute '{@link domain.DeploymentComponents#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.DeploymentComponents#getUid()
   * @see #getDeploymentComponents()
   * @generated
   */
  EAttribute getDeploymentComponents_Uid();

  /**
   * Returns the meta object for the containment reference list '{@link domain.DeploymentComponents#getDeplymentStep <em>Deplyment Step</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Deplyment Step</em>'.
   * @see domain.DeploymentComponents#getDeplymentStep()
   * @see #getDeploymentComponents()
   * @generated
   */
  EReference getDeploymentComponents_DeplymentStep();

  /**
   * Returns the meta object for the containment reference '{@link domain.DeploymentComponents#getStartSeq <em>Start Seq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Start Seq</em>'.
   * @see domain.DeploymentComponents#getStartSeq()
   * @see #getDeploymentComponents()
   * @generated
   */
  EReference getDeploymentComponents_StartSeq();

  /**
   * Returns the meta object for class '{@link domain.DeploymentComponent <em>Deployment Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Deployment Component</em>'.
   * @see domain.DeploymentComponent
   * @generated
   */
  EClass getDeploymentComponent();

  /**
   * Returns the meta object for the attribute '{@link domain.DeploymentComponent#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.DeploymentComponent#getUid()
   * @see #getDeploymentComponent()
   * @generated
   */
  EAttribute getDeploymentComponent_Uid();

  /**
   * Returns the meta object for the attribute '{@link domain.DeploymentComponent#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see domain.DeploymentComponent#getName()
   * @see #getDeploymentComponent()
   * @generated
   */
  EAttribute getDeploymentComponent_Name();

  /**
   * Returns the meta object for the reference '{@link domain.DeploymentComponent#getMapper <em>Mapper</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Mapper</em>'.
   * @see domain.DeploymentComponent#getMapper()
   * @see #getDeploymentComponent()
   * @generated
   */
  EReference getDeploymentComponent_Mapper();

  /**
   * Returns the meta object for the reference '{@link domain.DeploymentComponent#getDeploymentComponentLink <em>Deployment Component Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Deployment Component Link</em>'.
   * @see domain.DeploymentComponent#getDeploymentComponentLink()
   * @see #getDeploymentComponent()
   * @generated
   */
  EReference getDeploymentComponent_DeploymentComponentLink();

  /**
   * Returns the meta object for class '{@link domain.DeploymentStarStep <em>Deployment Star Step</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Deployment Star Step</em>'.
   * @see domain.DeploymentStarStep
   * @generated
   */
  EClass getDeploymentStarStep();

  /**
   * Returns the meta object for the attribute '{@link domain.DeploymentStarStep#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.DeploymentStarStep#getUid()
   * @see #getDeploymentStarStep()
   * @generated
   */
  EAttribute getDeploymentStarStep_Uid();

  /**
   * Returns the meta object for the attribute '{@link domain.DeploymentStarStep#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see domain.DeploymentStarStep#getName()
   * @see #getDeploymentStarStep()
   * @generated
   */
  EAttribute getDeploymentStarStep_Name();

  /**
   * Returns the meta object for the reference '{@link domain.DeploymentStarStep#getFirstStep <em>First Step</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>First Step</em>'.
   * @see domain.DeploymentStarStep#getFirstStep()
   * @see #getDeploymentStarStep()
   * @generated
   */
  EReference getDeploymentStarStep_FirstStep();

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
   * Returns the meta object for the reference '{@link domain.Recipe#getDeployment <em>Deployment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Deployment</em>'.
   * @see domain.Recipe#getDeployment()
   * @see #getRecipe()
   * @generated
   */
  EReference getRecipe_Deployment();

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
   * Returns the meta object for the container reference '{@link domain.Component#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Parent</em>'.
   * @see domain.Component#getParent()
   * @see #getComponent()
   * @generated
   */
  EReference getComponent_Parent();

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
   * Returns the meta object for the attribute '{@link domain.Component#getComponentRoot <em>Component Root</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Component Root</em>'.
   * @see domain.Component#getComponentRoot()
   * @see #getComponent()
   * @generated
   */
  EAttribute getComponent_ComponentRoot();

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
   * Returns the meta object for the containment reference list '{@link domain.ModelMapper#getQueries <em>Queries</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Queries</em>'.
   * @see domain.ModelMapper#getQueries()
   * @see #getModelMapper()
   * @generated
   */
  EReference getModelMapper_Queries();

  /**
   * Returns the meta object for the attribute '{@link domain.ModelMapper#getArtifactExecutionString <em>Artifact Execution String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Artifact Execution String</em>'.
   * @see domain.ModelMapper#getArtifactExecutionString()
   * @see #getModelMapper()
   * @generated
   */
  EAttribute getModelMapper_ArtifactExecutionString();

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
   * Returns the meta object for class '{@link domain.Query <em>Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Query</em>'.
   * @see domain.Query
   * @generated
   */
  EClass getQuery();

  /**
   * Returns the meta object for the attribute '{@link domain.Query#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.Query#getUid()
   * @see #getQuery()
   * @generated
   */
  EAttribute getQuery_Uid();

  /**
   * Returns the meta object for the reference '{@link domain.Query#getModelQuery <em>Model Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Model Query</em>'.
   * @see domain.Query#getModelQuery()
   * @see #getQuery()
   * @generated
   */
  EReference getQuery_ModelQuery();

  /**
   * Returns the meta object for the attribute '{@link domain.Query#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see domain.Query#getName()
   * @see #getQuery()
   * @generated
   */
  EAttribute getQuery_Name();

  /**
   * Returns the meta object for the reference '{@link domain.Query#getQueryRef <em>Query Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Query Ref</em>'.
   * @see domain.Query#getQueryRef()
   * @see #getQuery()
   * @generated
   */
  EReference getQuery_QueryRef();

  /**
   * Returns the meta object for the containment reference list '{@link domain.Query#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variables</em>'.
   * @see domain.Query#getVariables()
   * @see #getQuery()
   * @generated
   */
  EReference getQuery_Variables();

  /**
   * Returns the meta object for the attribute '{@link domain.Query#getGroupCode <em>Group Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Group Code</em>'.
   * @see domain.Query#getGroupCode()
   * @see #getQuery()
   * @generated
   */
  EAttribute getQuery_GroupCode();

  /**
   * Returns the meta object for class '{@link domain.QueryVariable <em>Query Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Query Variable</em>'.
   * @see domain.QueryVariable
   * @generated
   */
  EClass getQueryVariable();

  /**
   * Returns the meta object for the attribute '{@link domain.QueryVariable#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.QueryVariable#getUid()
   * @see #getQueryVariable()
   * @generated
   */
  EAttribute getQueryVariable_Uid();

  /**
   * Returns the meta object for the reference '{@link domain.QueryVariable#getQueryParamRef <em>Query Param Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Query Param Ref</em>'.
   * @see domain.QueryVariable#getQueryParamRef()
   * @see #getQueryVariable()
   * @generated
   */
  EReference getQueryVariable_QueryParamRef();

  /**
   * Returns the meta object for the attribute '{@link domain.QueryVariable#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see domain.QueryVariable#getValue()
   * @see #getQueryVariable()
   * @generated
   */
  EAttribute getQueryVariable_Value();

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
   * Returns the meta object for class '{@link domain.Primitive <em>Primitive</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Primitive</em>'.
   * @see domain.Primitive
   * @generated
   */
  EClass getPrimitive();

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
   * Returns the meta object for the containment reference list '{@link domain.Type#getExtension <em>Extension</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Extension</em>'.
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
   * Returns the meta object for the attribute '{@link domain.Parameter#getOrder <em>Order</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Order</em>'.
   * @see domain.Parameter#getOrder()
   * @see #getParameter()
   * @generated
   */
  EAttribute getParameter_Order();

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
   * Returns the meta object for class '{@link domain.UIPackage <em>UI Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UI Package</em>'.
   * @see domain.UIPackage
   * @generated
   */
  EClass getUIPackage();

  /**
   * Returns the meta object for the attribute '{@link domain.UIPackage#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.UIPackage#getUid()
   * @see #getUIPackage()
   * @generated
   */
  EAttribute getUIPackage_Uid();

  /**
   * Returns the meta object for the reference '{@link domain.UIPackage#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Parent</em>'.
   * @see domain.UIPackage#getParent()
   * @see #getUIPackage()
   * @generated
   */
  EReference getUIPackage_Parent();

  /**
   * Returns the meta object for the containment reference list '{@link domain.UIPackage#getForms <em>Forms</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Forms</em>'.
   * @see domain.UIPackage#getForms()
   * @see #getUIPackage()
   * @generated
   */
  EReference getUIPackage_Forms();

  /**
   * Returns the meta object for class '{@link domain.Form <em>Form</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Form</em>'.
   * @see domain.Form
   * @generated
   */
  EClass getForm();

  /**
   * Returns the meta object for the attribute '{@link domain.Form#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.Form#getUid()
   * @see #getForm()
   * @generated
   */
  EAttribute getForm_Uid();

  /**
   * Returns the meta object for the attribute '{@link domain.Form#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see domain.Form#getName()
   * @see #getForm()
   * @generated
   */
  EAttribute getForm_Name();

  /**
   * Returns the meta object for the containment reference '{@link domain.Form#getView <em>View</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>View</em>'.
   * @see domain.Form#getView()
   * @see #getForm()
   * @generated
   */
  EReference getForm_View();

  /**
   * Returns the meta object for the containment reference '{@link domain.Form#getDatacontrols <em>Datacontrols</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Datacontrols</em>'.
   * @see domain.Form#getDatacontrols()
   * @see #getForm()
   * @generated
   */
  EReference getForm_Datacontrols();

  /**
   * Returns the meta object for class '{@link domain.FormView <em>Form View</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Form View</em>'.
   * @see domain.FormView
   * @generated
   */
  EClass getFormView();

  /**
   * Returns the meta object for the attribute '{@link domain.FormView#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.FormView#getUid()
   * @see #getFormView()
   * @generated
   */
  EAttribute getFormView_Uid();

  /**
   * Returns the meta object for the attribute '{@link domain.FormView#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see domain.FormView#getName()
   * @see #getFormView()
   * @generated
   */
  EAttribute getFormView_Name();

  /**
   * Returns the meta object for the reference '{@link domain.FormView#getView <em>View</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>View</em>'.
   * @see domain.FormView#getView()
   * @see #getFormView()
   * @generated
   */
  EReference getFormView_View();

  /**
   * Returns the meta object for class '{@link domain.Views <em>Views</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Views</em>'.
   * @see domain.Views
   * @generated
   */
  EClass getViews();

  /**
   * Returns the meta object for the attribute '{@link domain.Views#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.Views#getUid()
   * @see #getViews()
   * @generated
   */
  EAttribute getViews_Uid();

  /**
   * Returns the meta object for the reference '{@link domain.Views#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Parent</em>'.
   * @see domain.Views#getParent()
   * @see #getViews()
   * @generated
   */
  EReference getViews_Parent();

  /**
   * Returns the meta object for the containment reference list '{@link domain.Views#getCanvases <em>Canvases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Canvases</em>'.
   * @see domain.Views#getCanvases()
   * @see #getViews()
   * @generated
   */
  EReference getViews_Canvases();

  /**
   * Returns the meta object for the containment reference list '{@link domain.Views#getViewInheritances <em>View Inheritances</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>View Inheritances</em>'.
   * @see domain.Views#getViewInheritances()
   * @see #getViews()
   * @generated
   */
  EReference getViews_ViewInheritances();

  /**
   * Returns the meta object for the containment reference list '{@link domain.Views#getTabPagesInheritances <em>Tab Pages Inheritances</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Tab Pages Inheritances</em>'.
   * @see domain.Views#getTabPagesInheritances()
   * @see #getViews()
   * @generated
   */
  EReference getViews_TabPagesInheritances();

  /**
   * Returns the meta object for class '{@link domain.MultiLangLabel <em>Multi Lang Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multi Lang Label</em>'.
   * @see domain.MultiLangLabel
   * @generated
   */
  EClass getMultiLangLabel();

  /**
   * Returns the meta object for the containment reference '{@link domain.MultiLangLabel#getMultiLangLabel <em>Multi Lang Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Multi Lang Label</em>'.
   * @see domain.MultiLangLabel#getMultiLangLabel()
   * @see #getMultiLangLabel()
   * @generated
   */
  EReference getMultiLangLabel_MultiLangLabel();

  /**
   * Returns the meta object for class '{@link domain.CanvasFrame <em>Canvas Frame</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Canvas Frame</em>'.
   * @see domain.CanvasFrame
   * @generated
   */
  EClass getCanvasFrame();

  /**
   * Returns the meta object for the attribute '{@link domain.CanvasFrame#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.CanvasFrame#getUid()
   * @see #getCanvasFrame()
   * @generated
   */
  EAttribute getCanvasFrame_Uid();

  /**
   * Returns the meta object for the attribute '{@link domain.CanvasFrame#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see domain.CanvasFrame#getName()
   * @see #getCanvasFrame()
   * @generated
   */
  EAttribute getCanvasFrame_Name();

  /**
   * Returns the meta object for class '{@link domain.ViewPortHolder <em>View Port Holder</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>View Port Holder</em>'.
   * @see domain.ViewPortHolder
   * @generated
   */
  EClass getViewPortHolder();

  /**
   * Returns the meta object for the containment reference list '{@link domain.ViewPortHolder#getViewElement <em>View Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>View Element</em>'.
   * @see domain.ViewPortHolder#getViewElement()
   * @see #getViewPortHolder()
   * @generated
   */
  EReference getViewPortHolder_ViewElement();

  /**
   * Returns the meta object for class '{@link domain.DefaultCavas <em>Default Cavas</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Default Cavas</em>'.
   * @see domain.DefaultCavas
   * @generated
   */
  EClass getDefaultCavas();

  /**
   * Returns the meta object for the attribute '{@link domain.DefaultCavas#isDefaultCanvas <em>Default Canvas</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default Canvas</em>'.
   * @see domain.DefaultCavas#isDefaultCanvas()
   * @see #getDefaultCavas()
   * @generated
   */
  EAttribute getDefaultCavas_DefaultCanvas();

  /**
   * Returns the meta object for class '{@link domain.ViewElement <em>View Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>View Element</em>'.
   * @see domain.ViewElement
   * @generated
   */
  EClass getViewElement();

  /**
   * Returns the meta object for class '{@link domain.Canvas <em>Canvas</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Canvas</em>'.
   * @see domain.Canvas
   * @generated
   */
  EClass getCanvas();

  /**
   * Returns the meta object for class '{@link domain.Window <em>Window</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Window</em>'.
   * @see domain.Window
   * @generated
   */
  EClass getWindow();

  /**
   * Returns the meta object for class '{@link domain.TabCanvas <em>Tab Canvas</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tab Canvas</em>'.
   * @see domain.TabCanvas
   * @generated
   */
  EClass getTabCanvas();

  /**
   * Returns the meta object for class '{@link domain.TabPage <em>Tab Page</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tab Page</em>'.
   * @see domain.TabPage
   * @generated
   */
  EClass getTabPage();

  /**
   * Returns the meta object for class '{@link domain.ViewPort <em>View Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>View Port</em>'.
   * @see domain.ViewPort
   * @generated
   */
  EClass getViewPort();

  /**
   * Returns the meta object for the attribute '{@link domain.ViewPort#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.ViewPort#getUid()
   * @see #getViewPort()
   * @generated
   */
  EAttribute getViewPort_Uid();

  /**
   * Returns the meta object for the attribute '{@link domain.ViewPort#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see domain.ViewPort#getName()
   * @see #getViewPort()
   * @generated
   */
  EAttribute getViewPort_Name();

  /**
   * Returns the meta object for the containment reference '{@link domain.ViewPort#getViewPortTrigger <em>View Port Trigger</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>View Port Trigger</em>'.
   * @see domain.ViewPort#getViewPortTrigger()
   * @see #getViewPort()
   * @generated
   */
  EReference getViewPort_ViewPortTrigger();

  /**
   * Returns the meta object for class '{@link domain.ViewArea <em>View Area</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>View Area</em>'.
   * @see domain.ViewArea
   * @generated
   */
  EClass getViewArea();

  /**
   * Returns the meta object for the attribute '{@link domain.ViewArea#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.ViewArea#getUid()
   * @see #getViewArea()
   * @generated
   */
  EAttribute getViewArea_Uid();

  /**
   * Returns the meta object for the attribute '{@link domain.ViewArea#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see domain.ViewArea#getName()
   * @see #getViewArea()
   * @generated
   */
  EAttribute getViewArea_Name();

  /**
   * Returns the meta object for the reference '{@link domain.ViewArea#getCanvasView <em>Canvas View</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Canvas View</em>'.
   * @see domain.ViewArea#getCanvasView()
   * @see #getViewArea()
   * @generated
   */
  EReference getViewArea_CanvasView();

  /**
   * Returns the meta object for class '{@link domain.ViewPortTrigger <em>View Port Trigger</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>View Port Trigger</em>'.
   * @see domain.ViewPortTrigger
   * @generated
   */
  EClass getViewPortTrigger();

  /**
   * Returns the meta object for the attribute '{@link domain.ViewPortTrigger#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.ViewPortTrigger#getUid()
   * @see #getViewPortTrigger()
   * @generated
   */
  EAttribute getViewPortTrigger_Uid();

  /**
   * Returns the meta object for class '{@link domain.ViewInheritance <em>View Inheritance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>View Inheritance</em>'.
   * @see domain.ViewInheritance
   * @generated
   */
  EClass getViewInheritance();

  /**
   * Returns the meta object for the attribute '{@link domain.ViewInheritance#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.ViewInheritance#getUid()
   * @see #getViewInheritance()
   * @generated
   */
  EAttribute getViewInheritance_Uid();

  /**
   * Returns the meta object for the reference '{@link domain.ViewInheritance#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source</em>'.
   * @see domain.ViewInheritance#getSource()
   * @see #getViewInheritance()
   * @generated
   */
  EReference getViewInheritance_Source();

  /**
   * Returns the meta object for the reference '{@link domain.ViewInheritance#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see domain.ViewInheritance#getTarget()
   * @see #getViewInheritance()
   * @generated
   */
  EReference getViewInheritance_Target();

  /**
   * Returns the meta object for class '{@link domain.TabPagesInheritance <em>Tab Pages Inheritance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tab Pages Inheritance</em>'.
   * @see domain.TabPagesInheritance
   * @generated
   */
  EClass getTabPagesInheritance();

  /**
   * Returns the meta object for the attribute '{@link domain.TabPagesInheritance#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.TabPagesInheritance#getUid()
   * @see #getTabPagesInheritance()
   * @generated
   */
  EAttribute getTabPagesInheritance_Uid();

  /**
   * Returns the meta object for the reference '{@link domain.TabPagesInheritance#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source</em>'.
   * @see domain.TabPagesInheritance#getSource()
   * @see #getTabPagesInheritance()
   * @generated
   */
  EReference getTabPagesInheritance_Source();

  /**
   * Returns the meta object for the reference '{@link domain.TabPagesInheritance#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see domain.TabPagesInheritance#getTarget()
   * @see #getTabPagesInheritance()
   * @generated
   */
  EReference getTabPagesInheritance_Target();

  /**
   * Returns the meta object for class '{@link domain.FormDataControls <em>Form Data Controls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Form Data Controls</em>'.
   * @see domain.FormDataControls
   * @generated
   */
  EClass getFormDataControls();

  /**
   * Returns the meta object for the attribute '{@link domain.FormDataControls#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.FormDataControls#getUid()
   * @see #getFormDataControls()
   * @generated
   */
  EAttribute getFormDataControls_Uid();

  /**
   * Returns the meta object for the attribute '{@link domain.FormDataControls#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see domain.FormDataControls#getName()
   * @see #getFormDataControls()
   * @generated
   */
  EAttribute getFormDataControls_Name();

  /**
   * Returns the meta object for the reference '{@link domain.FormDataControls#getFormControl <em>Form Control</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Form Control</em>'.
   * @see domain.FormDataControls#getFormControl()
   * @see #getFormDataControls()
   * @generated
   */
  EReference getFormDataControls_FormControl();

  /**
   * Returns the meta object for class '{@link domain.CanvasView <em>Canvas View</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Canvas View</em>'.
   * @see domain.CanvasView
   * @generated
   */
  EClass getCanvasView();

  /**
   * Returns the meta object for the attribute '{@link domain.CanvasView#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.CanvasView#getUid()
   * @see #getCanvasView()
   * @generated
   */
  EAttribute getCanvasView_Uid();

  /**
   * Returns the meta object for the reference '{@link domain.CanvasView#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Parent</em>'.
   * @see domain.CanvasView#getParent()
   * @see #getCanvasView()
   * @generated
   */
  EReference getCanvasView_Parent();

  /**
   * Returns the meta object for the containment reference '{@link domain.CanvasView#getBaseCanvas <em>Base Canvas</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Base Canvas</em>'.
   * @see domain.CanvasView#getBaseCanvas()
   * @see #getCanvasView()
   * @generated
   */
  EReference getCanvasView_BaseCanvas();

  /**
   * Returns the meta object for class '{@link domain.Style <em>Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Style</em>'.
   * @see domain.Style
   * @generated
   */
  EClass getStyle();

  /**
   * Returns the meta object for the attribute '{@link domain.Style#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.Style#getUid()
   * @see #getStyle()
   * @generated
   */
  EAttribute getStyle_Uid();

  /**
   * Returns the meta object for the attribute '{@link domain.Style#getStyle <em>Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Style</em>'.
   * @see domain.Style#getStyle()
   * @see #getStyle()
   * @generated
   */
  EAttribute getStyle_Style();

  /**
   * Returns the meta object for class '{@link domain.ChildrenHolder <em>Children Holder</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Children Holder</em>'.
   * @see domain.ChildrenHolder
   * @generated
   */
  EClass getChildrenHolder();

  /**
   * Returns the meta object for the containment reference list '{@link domain.ChildrenHolder#getChildren <em>Children</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Children</em>'.
   * @see domain.ChildrenHolder#getChildren()
   * @see #getChildrenHolder()
   * @generated
   */
  EReference getChildrenHolder_Children();

  /**
   * Returns the meta object for class '{@link domain.StyleClass <em>Style Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Style Class</em>'.
   * @see domain.StyleClass
   * @generated
   */
  EClass getStyleClass();

  /**
   * Returns the meta object for the attribute '{@link domain.StyleClass#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.StyleClass#getUid()
   * @see #getStyleClass()
   * @generated
   */
  EAttribute getStyleClass_Uid();

  /**
   * Returns the meta object for the reference '{@link domain.StyleClass#getStylesPackage <em>Styles Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Styles Package</em>'.
   * @see domain.StyleClass#getStylesPackage()
   * @see #getStyleClass()
   * @generated
   */
  EReference getStyleClass_StylesPackage();

  /**
   * Returns the meta object for the reference '{@link domain.StyleClass#getLibrary <em>Library</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Library</em>'.
   * @see domain.StyleClass#getLibrary()
   * @see #getStyleClass()
   * @generated
   */
  EReference getStyleClass_Library();

  /**
   * Returns the meta object for the reference '{@link domain.StyleClass#getStyleSet <em>Style Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Style Set</em>'.
   * @see domain.StyleClass#getStyleSet()
   * @see #getStyleClass()
   * @generated
   */
  EReference getStyleClass_StyleSet();

  /**
   * Returns the meta object for class '{@link domain.ContextParameter <em>Context Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Context Parameter</em>'.
   * @see domain.ContextParameter
   * @generated
   */
  EClass getContextParameter();

  /**
   * Returns the meta object for the attribute '{@link domain.ContextParameter#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.ContextParameter#getUid()
   * @see #getContextParameter()
   * @generated
   */
  EAttribute getContextParameter_Uid();

  /**
   * Returns the meta object for the reference '{@link domain.ContextParameter#getParameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Parameter</em>'.
   * @see domain.ContextParameter#getParameter()
   * @see #getContextParameter()
   * @generated
   */
  EReference getContextParameter_Parameter();

  /**
   * Returns the meta object for the containment reference '{@link domain.ContextParameter#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see domain.ContextParameter#getValue()
   * @see #getContextParameter()
   * @generated
   */
  EReference getContextParameter_Value();

  /**
   * Returns the meta object for class '{@link domain.ContextValue <em>Context Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Context Value</em>'.
   * @see domain.ContextValue
   * @generated
   */
  EClass getContextValue();

  /**
   * Returns the meta object for the attribute '{@link domain.ContextValue#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.ContextValue#getUid()
   * @see #getContextValue()
   * @generated
   */
  EAttribute getContextValue_Uid();

  /**
   * Returns the meta object for the attribute '{@link domain.ContextValue#isConstant <em>Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Constant</em>'.
   * @see domain.ContextValue#isConstant()
   * @see #getContextValue()
   * @generated
   */
  EAttribute getContextValue_Constant();

  /**
   * Returns the meta object for the attribute '{@link domain.ContextValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see domain.ContextValue#getValue()
   * @see #getContextValue()
   * @generated
   */
  EAttribute getContextValue_Value();

  /**
   * Returns the meta object for the containment reference list '{@link domain.ContextValue#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expression</em>'.
   * @see domain.ContextValue#getExpression()
   * @see #getContextValue()
   * @generated
   */
  EReference getContextValue_Expression();

  /**
   * Returns the meta object for class '{@link domain.ExpressionPart <em>Expression Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression Part</em>'.
   * @see domain.ExpressionPart
   * @generated
   */
  EClass getExpressionPart();

  /**
   * Returns the meta object for the attribute '{@link domain.ExpressionPart#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.ExpressionPart#getUid()
   * @see #getExpressionPart()
   * @generated
   */
  EAttribute getExpressionPart_Uid();

  /**
   * Returns the meta object for the reference '{@link domain.ExpressionPart#getObjRef <em>Obj Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Obj Ref</em>'.
   * @see domain.ExpressionPart#getObjRef()
   * @see #getExpressionPart()
   * @generated
   */
  EReference getExpressionPart_ObjRef();

  /**
   * Returns the meta object for the attribute '{@link domain.ExpressionPart#getOrder <em>Order</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Order</em>'.
   * @see domain.ExpressionPart#getOrder()
   * @see #getExpressionPart()
   * @generated
   */
  EAttribute getExpressionPart_Order();

  /**
   * Returns the meta object for class '{@link domain.ContextParameters <em>Context Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Context Parameters</em>'.
   * @see domain.ContextParameters
   * @generated
   */
  EClass getContextParameters();

  /**
   * Returns the meta object for the containment reference list '{@link domain.ContextParameters#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see domain.ContextParameters#getParameters()
   * @see #getContextParameters()
   * @generated
   */
  EReference getContextParameters_Parameters();

  /**
   * Returns the meta object for class '{@link domain.Context <em>Context</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Context</em>'.
   * @see domain.Context
   * @generated
   */
  EClass getContext();

  /**
   * Returns the meta object for class '{@link domain.StyleElement <em>Style Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Style Element</em>'.
   * @see domain.StyleElement
   * @generated
   */
  EClass getStyleElement();

  /**
   * Returns the meta object for the containment reference '{@link domain.StyleElement#getStyle <em>Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Style</em>'.
   * @see domain.StyleElement#getStyle()
   * @see #getStyleElement()
   * @generated
   */
  EReference getStyleElement_Style();

  /**
   * Returns the meta object for the containment reference list '{@link domain.StyleElement#getStyleClass <em>Style Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Style Class</em>'.
   * @see domain.StyleElement#getStyleClass()
   * @see #getStyleElement()
   * @generated
   */
  EReference getStyleElement_StyleClass();

  /**
   * Returns the meta object for class '{@link domain.Uielement <em>Uielement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Uielement</em>'.
   * @see domain.Uielement
   * @generated
   */
  EClass getUielement();

  /**
   * Returns the meta object for the attribute '{@link domain.Uielement#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.Uielement#getUid()
   * @see #getUielement()
   * @generated
   */
  EAttribute getUielement_Uid();

  /**
   * Returns the meta object for the attribute '{@link domain.Uielement#getNickname <em>Nickname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nickname</em>'.
   * @see domain.Uielement#getNickname()
   * @see #getUielement()
   * @generated
   */
  EAttribute getUielement_Nickname();

  /**
   * Returns the meta object for the containment reference '{@link domain.Uielement#getEnabled <em>Enabled</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Enabled</em>'.
   * @see domain.Uielement#getEnabled()
   * @see #getUielement()
   * @generated
   */
  EReference getUielement_Enabled();

  /**
   * Returns the meta object for the containment reference '{@link domain.Uielement#getRequired <em>Required</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Required</em>'.
   * @see domain.Uielement#getRequired()
   * @see #getUielement()
   * @generated
   */
  EReference getUielement_Required();

  /**
   * Returns the meta object for the containment reference '{@link domain.Uielement#getReadOnly <em>Read Only</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Read Only</em>'.
   * @see domain.Uielement#getReadOnly()
   * @see #getUielement()
   * @generated
   */
  EReference getUielement_ReadOnly();

  /**
   * Returns the meta object for the reference list '{@link domain.Uielement#getOnEventRefreshArea <em>On Event Refresh Area</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>On Event Refresh Area</em>'.
   * @see domain.Uielement#getOnEventRefreshArea()
   * @see #getUielement()
   * @generated
   */
  EReference getUielement_OnEventRefreshArea();

  /**
   * Returns the meta object for class '{@link domain.SourcesPointer <em>Sources Pointer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sources Pointer</em>'.
   * @see domain.SourcesPointer
   * @generated
   */
  EClass getSourcesPointer();

  /**
   * Returns the meta object for the reference '{@link domain.SourcesPointer#getSourcePointer <em>Source Pointer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source Pointer</em>'.
   * @see domain.SourcesPointer#getSourcePointer()
   * @see #getSourcesPointer()
   * @generated
   */
  EReference getSourcesPointer_SourcePointer();

  /**
   * Returns the meta object for the reference '{@link domain.SourcesPointer#getValuePointer <em>Value Pointer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Value Pointer</em>'.
   * @see domain.SourcesPointer#getValuePointer()
   * @see #getSourcesPointer()
   * @generated
   */
  EReference getSourcesPointer_ValuePointer();

  /**
   * Returns the meta object for the reference '{@link domain.SourcesPointer#getSourceCast <em>Source Cast</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source Cast</em>'.
   * @see domain.SourcesPointer#getSourceCast()
   * @see #getSourcesPointer()
   * @generated
   */
  EReference getSourcesPointer_SourceCast();

  /**
   * Returns the meta object for class '{@link domain.ActionElement <em>Action Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action Element</em>'.
   * @see domain.ActionElement
   * @generated
   */
  EClass getActionElement();

  /**
   * Returns the meta object for class '{@link domain.InputElement <em>Input Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Input Element</em>'.
   * @see domain.InputElement
   * @generated
   */
  EClass getInputElement();

  /**
   * Returns the meta object for class '{@link domain.Selection <em>Selection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Selection</em>'.
   * @see domain.Selection
   * @generated
   */
  EClass getSelection();

  /**
   * Returns the meta object for the reference '{@link domain.Selection#getDisplayOptionPointer <em>Display Option Pointer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Display Option Pointer</em>'.
   * @see domain.Selection#getDisplayOptionPointer()
   * @see #getSelection()
   * @generated
   */
  EReference getSelection_DisplayOptionPointer();

  /**
   * Returns the meta object for the reference '{@link domain.Selection#getValueOptionPointer <em>Value Option Pointer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Value Option Pointer</em>'.
   * @see domain.Selection#getValueOptionPointer()
   * @see #getSelection()
   * @generated
   */
  EReference getSelection_ValueOptionPointer();

  /**
   * Returns the meta object for class '{@link domain.OptionSelection <em>Option Selection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Option Selection</em>'.
   * @see domain.OptionSelection
   * @generated
   */
  EClass getOptionSelection();

  /**
   * Returns the meta object for the reference '{@link domain.OptionSelection#getOptionPointer <em>Option Pointer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Option Pointer</em>'.
   * @see domain.OptionSelection#getOptionPointer()
   * @see #getOptionSelection()
   * @generated
   */
  EReference getOptionSelection_OptionPointer();

  /**
   * Returns the meta object for the reference '{@link domain.OptionSelection#getOptionCast <em>Option Cast</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Option Cast</em>'.
   * @see domain.OptionSelection#getOptionCast()
   * @see #getOptionSelection()
   * @generated
   */
  EReference getOptionSelection_OptionCast();

  /**
   * Returns the meta object for class '{@link domain.LayerHolder <em>Layer Holder</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Layer Holder</em>'.
   * @see domain.LayerHolder
   * @generated
   */
  EClass getLayerHolder();

  /**
   * Returns the meta object for class '{@link domain.InputText <em>Input Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Input Text</em>'.
   * @see domain.InputText
   * @generated
   */
  EClass getInputText();

  /**
   * Returns the meta object for class '{@link domain.Label <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Label</em>'.
   * @see domain.Label
   * @generated
   */
  EClass getLabel();

  /**
   * Returns the meta object for the attribute '{@link domain.Label#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label</em>'.
   * @see domain.Label#getLabel()
   * @see #getLabel()
   * @generated
   */
  EAttribute getLabel_Label();

  /**
   * Returns the meta object for class '{@link domain.OutputText <em>Output Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Output Text</em>'.
   * @see domain.OutputText
   * @generated
   */
  EClass getOutputText();

  /**
   * Returns the meta object for class '{@link domain.CheckBox <em>Check Box</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Check Box</em>'.
   * @see domain.CheckBox
   * @generated
   */
  EClass getCheckBox();

  /**
   * Returns the meta object for class '{@link domain.DropDownSelection <em>Drop Down Selection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Drop Down Selection</em>'.
   * @see domain.DropDownSelection
   * @generated
   */
  EClass getDropDownSelection();

  /**
   * Returns the meta object for the containment reference '{@link domain.DropDownSelection#getSelection <em>Selection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Selection</em>'.
   * @see domain.DropDownSelection#getSelection()
   * @see #getDropDownSelection()
   * @generated
   */
  EReference getDropDownSelection_Selection();

  /**
   * Returns the meta object for class '{@link domain.Column <em>Column</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Column</em>'.
   * @see domain.Column
   * @generated
   */
  EClass getColumn();

  /**
   * Returns the meta object for the attribute '{@link domain.Column#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.Column#getUid()
   * @see #getColumn()
   * @generated
   */
  EAttribute getColumn_Uid();

  /**
   * Returns the meta object for the attribute '{@link domain.Column#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label</em>'.
   * @see domain.Column#getLabel()
   * @see #getColumn()
   * @generated
   */
  EAttribute getColumn_Label();

  /**
   * Returns the meta object for the containment reference '{@link domain.Column#getElement <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Element</em>'.
   * @see domain.Column#getElement()
   * @see #getColumn()
   * @generated
   */
  EReference getColumn_Element();

  /**
   * Returns the meta object for class '{@link domain.Table <em>Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Table</em>'.
   * @see domain.Table
   * @generated
   */
  EClass getTable();

  /**
   * Returns the meta object for the attribute '{@link domain.Table#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label</em>'.
   * @see domain.Table#getLabel()
   * @see #getTable()
   * @generated
   */
  EAttribute getTable_Label();

  /**
   * Returns the meta object for the containment reference list '{@link domain.Table#getCols <em>Cols</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cols</em>'.
   * @see domain.Table#getCols()
   * @see #getTable()
   * @generated
   */
  EReference getTable_Cols();

  /**
   * Returns the meta object for class '{@link domain.Tree <em>Tree</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tree</em>'.
   * @see domain.Tree
   * @generated
   */
  EClass getTree();

  /**
   * Returns the meta object for the attribute '{@link domain.Tree#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label</em>'.
   * @see domain.Tree#getLabel()
   * @see #getTree()
   * @generated
   */
  EAttribute getTree_Label();

  /**
   * Returns the meta object for the containment reference '{@link domain.Tree#getImage <em>Image</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Image</em>'.
   * @see domain.Tree#getImage()
   * @see #getTree()
   * @generated
   */
  EReference getTree_Image();

  /**
   * Returns the meta object for class '{@link domain.Button <em>Button</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Button</em>'.
   * @see domain.Button
   * @generated
   */
  EClass getButton();

  /**
   * Returns the meta object for the attribute '{@link domain.Button#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label</em>'.
   * @see domain.Button#getLabel()
   * @see #getButton()
   * @generated
   */
  EAttribute getButton_Label();

  /**
   * Returns the meta object for class '{@link domain.Controls <em>Controls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Controls</em>'.
   * @see domain.Controls
   * @generated
   */
  EClass getControls();

  /**
   * Returns the meta object for the attribute '{@link domain.Controls#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.Controls#getUid()
   * @see #getControls()
   * @generated
   */
  EAttribute getControls_Uid();

  /**
   * Returns the meta object for the reference '{@link domain.Controls#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Parent</em>'.
   * @see domain.Controls#getParent()
   * @see #getControls()
   * @generated
   */
  EReference getControls_Parent();

  /**
   * Returns the meta object for the containment reference '{@link domain.Controls#getRoot <em>Root</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Root</em>'.
   * @see domain.Controls#getRoot()
   * @see #getControls()
   * @generated
   */
  EReference getControls_Root();

  /**
   * Returns the meta object for the containment reference list '{@link domain.Controls#getControls <em>Controls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Controls</em>'.
   * @see domain.Controls#getControls()
   * @see #getControls()
   * @generated
   */
  EReference getControls_Controls();

  /**
   * Returns the meta object for the containment reference list '{@link domain.Controls#getRelations <em>Relations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Relations</em>'.
   * @see domain.Controls#getRelations()
   * @see #getControls()
   * @generated
   */
  EReference getControls_Relations();

  /**
   * Returns the meta object for class '{@link domain.Trigger <em>Trigger</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Trigger</em>'.
   * @see domain.Trigger
   * @generated
   */
  EClass getTrigger();

  /**
   * Returns the meta object for class '{@link domain.PREFormTrigger <em>PRE Form Trigger</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>PRE Form Trigger</em>'.
   * @see domain.PREFormTrigger
   * @generated
   */
  EClass getPREFormTrigger();

  /**
   * Returns the meta object for the attribute '{@link domain.PREFormTrigger#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.PREFormTrigger#getUid()
   * @see #getPREFormTrigger()
   * @generated
   */
  EAttribute getPREFormTrigger_Uid();

  /**
   * Returns the meta object for class '{@link domain.PREQueryTrigger <em>PRE Query Trigger</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>PRE Query Trigger</em>'.
   * @see domain.PREQueryTrigger
   * @generated
   */
  EClass getPREQueryTrigger();

  /**
   * Returns the meta object for the attribute '{@link domain.PREQueryTrigger#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.PREQueryTrigger#getUid()
   * @see #getPREQueryTrigger()
   * @generated
   */
  EAttribute getPREQueryTrigger_Uid();

  /**
   * Returns the meta object for class '{@link domain.POSTQueryTrigger <em>POST Query Trigger</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>POST Query Trigger</em>'.
   * @see domain.POSTQueryTrigger
   * @generated
   */
  EClass getPOSTQueryTrigger();

  /**
   * Returns the meta object for the attribute '{@link domain.POSTQueryTrigger#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.POSTQueryTrigger#getUid()
   * @see #getPOSTQueryTrigger()
   * @generated
   */
  EAttribute getPOSTQueryTrigger_Uid();

  /**
   * Returns the meta object for class '{@link domain.PREInsertTrigger <em>PRE Insert Trigger</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>PRE Insert Trigger</em>'.
   * @see domain.PREInsertTrigger
   * @generated
   */
  EClass getPREInsertTrigger();

  /**
   * Returns the meta object for the attribute '{@link domain.PREInsertTrigger#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.PREInsertTrigger#getUid()
   * @see #getPREInsertTrigger()
   * @generated
   */
  EAttribute getPREInsertTrigger_Uid();

  /**
   * Returns the meta object for class '{@link domain.PREDeleteTrigger <em>PRE Delete Trigger</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>PRE Delete Trigger</em>'.
   * @see domain.PREDeleteTrigger
   * @generated
   */
  EClass getPREDeleteTrigger();

  /**
   * Returns the meta object for the attribute '{@link domain.PREDeleteTrigger#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.PREDeleteTrigger#getUid()
   * @see #getPREDeleteTrigger()
   * @generated
   */
  EAttribute getPREDeleteTrigger_Uid();

  /**
   * Returns the meta object for class '{@link domain.POSTCreateTrigger <em>POST Create Trigger</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>POST Create Trigger</em>'.
   * @see domain.POSTCreateTrigger
   * @generated
   */
  EClass getPOSTCreateTrigger();

  /**
   * Returns the meta object for the attribute '{@link domain.POSTCreateTrigger#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.POSTCreateTrigger#getUid()
   * @see #getPOSTCreateTrigger()
   * @generated
   */
  EAttribute getPOSTCreateTrigger_Uid();

  /**
   * Returns the meta object for class '{@link domain.PREUpdateTrigger <em>PRE Update Trigger</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>PRE Update Trigger</em>'.
   * @see domain.PREUpdateTrigger
   * @generated
   */
  EClass getPREUpdateTrigger();

  /**
   * Returns the meta object for the attribute '{@link domain.PREUpdateTrigger#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.PREUpdateTrigger#getUid()
   * @see #getPREUpdateTrigger()
   * @generated
   */
  EAttribute getPREUpdateTrigger_Uid();

  /**
   * Returns the meta object for class '{@link domain.CreateTrigger <em>Create Trigger</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Create Trigger</em>'.
   * @see domain.CreateTrigger
   * @generated
   */
  EClass getCreateTrigger();

  /**
   * Returns the meta object for the attribute '{@link domain.CreateTrigger#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.CreateTrigger#getUid()
   * @see #getCreateTrigger()
   * @generated
   */
  EAttribute getCreateTrigger_Uid();

  /**
   * Returns the meta object for class '{@link domain.InsertTrigger <em>Insert Trigger</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Insert Trigger</em>'.
   * @see domain.InsertTrigger
   * @generated
   */
  EClass getInsertTrigger();

  /**
   * Returns the meta object for the attribute '{@link domain.InsertTrigger#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.InsertTrigger#getUid()
   * @see #getInsertTrigger()
   * @generated
   */
  EAttribute getInsertTrigger_Uid();

  /**
   * Returns the meta object for class '{@link domain.UpdateTrigger <em>Update Trigger</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Update Trigger</em>'.
   * @see domain.UpdateTrigger
   * @generated
   */
  EClass getUpdateTrigger();

  /**
   * Returns the meta object for the attribute '{@link domain.UpdateTrigger#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.UpdateTrigger#getUid()
   * @see #getUpdateTrigger()
   * @generated
   */
  EAttribute getUpdateTrigger_Uid();

  /**
   * Returns the meta object for class '{@link domain.DeleteTrigger <em>Delete Trigger</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Delete Trigger</em>'.
   * @see domain.DeleteTrigger
   * @generated
   */
  EClass getDeleteTrigger();

  /**
   * Returns the meta object for the attribute '{@link domain.DeleteTrigger#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.DeleteTrigger#getUid()
   * @see #getDeleteTrigger()
   * @generated
   */
  EAttribute getDeleteTrigger_Uid();

  /**
   * Returns the meta object for class '{@link domain.SearchTrigger <em>Search Trigger</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Search Trigger</em>'.
   * @see domain.SearchTrigger
   * @generated
   */
  EClass getSearchTrigger();

  /**
   * Returns the meta object for the attribute '{@link domain.SearchTrigger#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.SearchTrigger#getUid()
   * @see #getSearchTrigger()
   * @generated
   */
  EAttribute getSearchTrigger_Uid();

  /**
   * Returns the meta object for class '{@link domain.Root <em>Root</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Root</em>'.
   * @see domain.Root
   * @generated
   */
  EClass getRoot();

  /**
   * Returns the meta object for the attribute '{@link domain.Root#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.Root#getUid()
   * @see #getRoot()
   * @generated
   */
  EAttribute getRoot_Uid();

  /**
   * Returns the meta object for the attribute '{@link domain.Root#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see domain.Root#getName()
   * @see #getRoot()
   * @generated
   */
  EAttribute getRoot_Name();

  /**
   * Returns the meta object for the containment reference '{@link domain.Root#getPreFormTrigger <em>Pre Form Trigger</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pre Form Trigger</em>'.
   * @see domain.Root#getPreFormTrigger()
   * @see #getRoot()
   * @generated
   */
  EReference getRoot_PreFormTrigger();

  /**
   * Returns the meta object for class '{@link domain.DataControl <em>Data Control</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Control</em>'.
   * @see domain.DataControl
   * @generated
   */
  EClass getDataControl();

  /**
   * Returns the meta object for the attribute '{@link domain.DataControl#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.DataControl#getUid()
   * @see #getDataControl()
   * @generated
   */
  EAttribute getDataControl_Uid();

  /**
   * Returns the meta object for the attribute '{@link domain.DataControl#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see domain.DataControl#getName()
   * @see #getDataControl()
   * @generated
   */
  EAttribute getDataControl_Name();

  /**
   * Returns the meta object for the reference '{@link domain.DataControl#getBaseType <em>Base Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Base Type</em>'.
   * @see domain.DataControl#getBaseType()
   * @see #getDataControl()
   * @generated
   */
  EReference getDataControl_BaseType();

  /**
   * Returns the meta object for the container reference '{@link domain.DataControl#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Parent</em>'.
   * @see domain.DataControl#getParent()
   * @see #getDataControl()
   * @generated
   */
  EReference getDataControl_Parent();

  /**
   * Returns the meta object for the containment reference '{@link domain.DataControl#getPreQueryTrigger <em>Pre Query Trigger</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pre Query Trigger</em>'.
   * @see domain.DataControl#getPreQueryTrigger()
   * @see #getDataControl()
   * @generated
   */
  EReference getDataControl_PreQueryTrigger();

  /**
   * Returns the meta object for the containment reference '{@link domain.DataControl#getPostQueryTrigger <em>Post Query Trigger</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Post Query Trigger</em>'.
   * @see domain.DataControl#getPostQueryTrigger()
   * @see #getDataControl()
   * @generated
   */
  EReference getDataControl_PostQueryTrigger();

  /**
   * Returns the meta object for the containment reference '{@link domain.DataControl#getPreInsertTrigger <em>Pre Insert Trigger</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pre Insert Trigger</em>'.
   * @see domain.DataControl#getPreInsertTrigger()
   * @see #getDataControl()
   * @generated
   */
  EReference getDataControl_PreInsertTrigger();

  /**
   * Returns the meta object for the containment reference '{@link domain.DataControl#getPreDeleteTrigger <em>Pre Delete Trigger</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pre Delete Trigger</em>'.
   * @see domain.DataControl#getPreDeleteTrigger()
   * @see #getDataControl()
   * @generated
   */
  EReference getDataControl_PreDeleteTrigger();

  /**
   * Returns the meta object for the containment reference '{@link domain.DataControl#getPostCreateTrigger <em>Post Create Trigger</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Post Create Trigger</em>'.
   * @see domain.DataControl#getPostCreateTrigger()
   * @see #getDataControl()
   * @generated
   */
  EReference getDataControl_PostCreateTrigger();

  /**
   * Returns the meta object for the containment reference '{@link domain.DataControl#getPreUpdateTrigger <em>Pre Update Trigger</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pre Update Trigger</em>'.
   * @see domain.DataControl#getPreUpdateTrigger()
   * @see #getDataControl()
   * @generated
   */
  EReference getDataControl_PreUpdateTrigger();

  /**
   * Returns the meta object for the containment reference '{@link domain.DataControl#getCreate <em>Create</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Create</em>'.
   * @see domain.DataControl#getCreate()
   * @see #getDataControl()
   * @generated
   */
  EReference getDataControl_Create();

  /**
   * Returns the meta object for the containment reference '{@link domain.DataControl#getInsert <em>Insert</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Insert</em>'.
   * @see domain.DataControl#getInsert()
   * @see #getDataControl()
   * @generated
   */
  EReference getDataControl_Insert();

  /**
   * Returns the meta object for the containment reference '{@link domain.DataControl#getUpdate <em>Update</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Update</em>'.
   * @see domain.DataControl#getUpdate()
   * @see #getDataControl()
   * @generated
   */
  EReference getDataControl_Update();

  /**
   * Returns the meta object for the containment reference '{@link domain.DataControl#getRemove <em>Remove</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Remove</em>'.
   * @see domain.DataControl#getRemove()
   * @see #getDataControl()
   * @generated
   */
  EReference getDataControl_Remove();

  /**
   * Returns the meta object for the containment reference '{@link domain.DataControl#getSearch <em>Search</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Search</em>'.
   * @see domain.DataControl#getSearch()
   * @see #getDataControl()
   * @generated
   */
  EReference getDataControl_Search();

  /**
   * Returns the meta object for the containment reference list '{@link domain.DataControl#getArtificialFields <em>Artificial Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Artificial Fields</em>'.
   * @see domain.DataControl#getArtificialFields()
   * @see #getDataControl()
   * @generated
   */
  EReference getDataControl_ArtificialFields();

  /**
   * Returns the meta object for class '{@link domain.Relation <em>Relation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relation</em>'.
   * @see domain.Relation
   * @generated
   */
  EClass getRelation();

  /**
   * Returns the meta object for the attribute '{@link domain.Relation#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.Relation#getUid()
   * @see #getRelation()
   * @generated
   */
  EAttribute getRelation_Uid();

  /**
   * Returns the meta object for the attribute '{@link domain.Relation#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see domain.Relation#getName()
   * @see #getRelation()
   * @generated
   */
  EAttribute getRelation_Name();

  /**
   * Returns the meta object for the reference '{@link domain.Relation#getMaster <em>Master</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Master</em>'.
   * @see domain.Relation#getMaster()
   * @see #getRelation()
   * @generated
   */
  EReference getRelation_Master();

  /**
   * Returns the meta object for the reference '{@link domain.Relation#getDetail <em>Detail</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Detail</em>'.
   * @see domain.Relation#getDetail()
   * @see #getRelation()
   * @generated
   */
  EReference getRelation_Detail();

  /**
   * Returns the meta object for the attribute '{@link domain.Relation#isIsTree <em>Is Tree</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Tree</em>'.
   * @see domain.Relation#isIsTree()
   * @see #getRelation()
   * @generated
   */
  EAttribute getRelation_IsTree();

  /**
   * Returns the meta object for the containment reference list '{@link domain.Relation#getLinks <em>Links</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Links</em>'.
   * @see domain.Relation#getLinks()
   * @see #getRelation()
   * @generated
   */
  EReference getRelation_Links();

  /**
   * Returns the meta object for class '{@link domain.ArtificialField <em>Artificial Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Artificial Field</em>'.
   * @see domain.ArtificialField
   * @generated
   */
  EClass getArtificialField();

  /**
   * Returns the meta object for the attribute '{@link domain.ArtificialField#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.ArtificialField#getUid()
   * @see #getArtificialField()
   * @generated
   */
  EAttribute getArtificialField_Uid();

  /**
   * Returns the meta object for the attribute '{@link domain.ArtificialField#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see domain.ArtificialField#getName()
   * @see #getArtificialField()
   * @generated
   */
  EAttribute getArtificialField_Name();

  /**
   * Returns the meta object for the container reference '{@link domain.ArtificialField#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Parent</em>'.
   * @see domain.ArtificialField#getParent()
   * @see #getArtificialField()
   * @generated
   */
  EReference getArtificialField_Parent();

  /**
   * Returns the meta object for class '{@link domain.Link <em>Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Link</em>'.
   * @see domain.Link
   * @generated
   */
  EClass getLink();

  /**
   * Returns the meta object for the attribute '{@link domain.Link#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.Link#getUid()
   * @see #getLink()
   * @generated
   */
  EAttribute getLink_Uid();

  /**
   * Returns the meta object for the container reference '{@link domain.Link#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Parent</em>'.
   * @see domain.Link#getParent()
   * @see #getLink()
   * @generated
   */
  EReference getLink_Parent();

  /**
   * Returns the meta object for the reference '{@link domain.Link#getMasterField <em>Master Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Master Field</em>'.
   * @see domain.Link#getMasterField()
   * @see #getLink()
   * @generated
   */
  EReference getLink_MasterField();

  /**
   * Returns the meta object for the reference '{@link domain.Link#getDetailField <em>Detail Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Detail Field</em>'.
   * @see domain.Link#getDetailField()
   * @see #getLink()
   * @generated
   */
  EReference getLink_DetailField();

  /**
   * Returns the meta object for class '{@link domain.ApplicationInfrastructureLayer <em>Application Infrastructure Layer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Application Infrastructure Layer</em>'.
   * @see domain.ApplicationInfrastructureLayer
   * @generated
   */
  EClass getApplicationInfrastructureLayer();

  /**
   * Returns the meta object for the attribute '{@link domain.ApplicationInfrastructureLayer#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.ApplicationInfrastructureLayer#getUid()
   * @see #getApplicationInfrastructureLayer()
   * @generated
   */
  EAttribute getApplicationInfrastructureLayer_Uid();

  /**
   * Returns the meta object for the attribute '{@link domain.ApplicationInfrastructureLayer#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see domain.ApplicationInfrastructureLayer#getName()
   * @see #getApplicationInfrastructureLayer()
   * @generated
   */
  EAttribute getApplicationInfrastructureLayer_Name();

  /**
   * Returns the meta object for the container reference '{@link domain.ApplicationInfrastructureLayer#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Parent</em>'.
   * @see domain.ApplicationInfrastructureLayer#getParent()
   * @see #getApplicationInfrastructureLayer()
   * @generated
   */
  EReference getApplicationInfrastructureLayer_Parent();

  /**
   * Returns the meta object for the containment reference '{@link domain.ApplicationInfrastructureLayer#getInfarastructure <em>Infarastructure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Infarastructure</em>'.
   * @see domain.ApplicationInfrastructureLayer#getInfarastructure()
   * @see #getApplicationInfrastructureLayer()
   * @generated
   */
  EReference getApplicationInfrastructureLayer_Infarastructure();

  /**
   * Returns the meta object for class '{@link domain.EnterpriseInfrastructure <em>Enterprise Infrastructure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enterprise Infrastructure</em>'.
   * @see domain.EnterpriseInfrastructure
   * @generated
   */
  EClass getEnterpriseInfrastructure();

  /**
   * Returns the meta object for the attribute '{@link domain.EnterpriseInfrastructure#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.EnterpriseInfrastructure#getUid()
   * @see #getEnterpriseInfrastructure()
   * @generated
   */
  EAttribute getEnterpriseInfrastructure_Uid();

  /**
   * Returns the meta object for the container reference '{@link domain.EnterpriseInfrastructure#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Parent</em>'.
   * @see domain.EnterpriseInfrastructure#getParent()
   * @see #getEnterpriseInfrastructure()
   * @generated
   */
  EReference getEnterpriseInfrastructure_Parent();

  /**
   * Returns the meta object for the containment reference list '{@link domain.EnterpriseInfrastructure#getDatacenters <em>Datacenters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Datacenters</em>'.
   * @see domain.EnterpriseInfrastructure#getDatacenters()
   * @see #getEnterpriseInfrastructure()
   * @generated
   */
  EReference getEnterpriseInfrastructure_Datacenters();

  /**
   * Returns the meta object for the containment reference list '{@link domain.EnterpriseInfrastructure#getInfrastructureConnections <em>Infrastructure Connections</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Infrastructure Connections</em>'.
   * @see domain.EnterpriseInfrastructure#getInfrastructureConnections()
   * @see #getEnterpriseInfrastructure()
   * @generated
   */
  EReference getEnterpriseInfrastructure_InfrastructureConnections();

  /**
   * Returns the meta object for class '{@link domain.Datacenter <em>Datacenter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Datacenter</em>'.
   * @see domain.Datacenter
   * @generated
   */
  EClass getDatacenter();

  /**
   * Returns the meta object for the attribute '{@link domain.Datacenter#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.Datacenter#getUid()
   * @see #getDatacenter()
   * @generated
   */
  EAttribute getDatacenter_Uid();

  /**
   * Returns the meta object for the container reference '{@link domain.Datacenter#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Parent</em>'.
   * @see domain.Datacenter#getParent()
   * @see #getDatacenter()
   * @generated
   */
  EReference getDatacenter_Parent();

  /**
   * Returns the meta object for the containment reference list '{@link domain.Datacenter#getSubsystems <em>Subsystems</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Subsystems</em>'.
   * @see domain.Datacenter#getSubsystems()
   * @see #getDatacenter()
   * @generated
   */
  EReference getDatacenter_Subsystems();

  /**
   * Returns the meta object for the attribute '{@link domain.Datacenter#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see domain.Datacenter#getName()
   * @see #getDatacenter()
   * @generated
   */
  EAttribute getDatacenter_Name();

  /**
   * Returns the meta object for class '{@link domain.Subsystem <em>Subsystem</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Subsystem</em>'.
   * @see domain.Subsystem
   * @generated
   */
  EClass getSubsystem();

  /**
   * Returns the meta object for the attribute '{@link domain.Subsystem#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.Subsystem#getUid()
   * @see #getSubsystem()
   * @generated
   */
  EAttribute getSubsystem_Uid();

  /**
   * Returns the meta object for the attribute '{@link domain.Subsystem#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see domain.Subsystem#getName()
   * @see #getSubsystem()
   * @generated
   */
  EAttribute getSubsystem_Name();

  /**
   * Returns the meta object for the container reference '{@link domain.Subsystem#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Parent</em>'.
   * @see domain.Subsystem#getParent()
   * @see #getSubsystem()
   * @generated
   */
  EReference getSubsystem_Parent();

  /**
   * Returns the meta object for the containment reference list '{@link domain.Subsystem#getInfrastructureLayer <em>Infrastructure Layer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Infrastructure Layer</em>'.
   * @see domain.Subsystem#getInfrastructureLayer()
   * @see #getSubsystem()
   * @generated
   */
  EReference getSubsystem_InfrastructureLayer();

  /**
   * Returns the meta object for class '{@link domain.InfrastructureLayer <em>Infrastructure Layer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Infrastructure Layer</em>'.
   * @see domain.InfrastructureLayer
   * @generated
   */
  EClass getInfrastructureLayer();

  /**
   * Returns the meta object for the attribute '{@link domain.InfrastructureLayer#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.InfrastructureLayer#getUid()
   * @see #getInfrastructureLayer()
   * @generated
   */
  EAttribute getInfrastructureLayer_Uid();

  /**
   * Returns the meta object for the attribute '{@link domain.InfrastructureLayer#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see domain.InfrastructureLayer#getName()
   * @see #getInfrastructureLayer()
   * @generated
   */
  EAttribute getInfrastructureLayer_Name();

  /**
   * Returns the meta object for the container reference '{@link domain.InfrastructureLayer#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Parent</em>'.
   * @see domain.InfrastructureLayer#getParent()
   * @see #getInfrastructureLayer()
   * @generated
   */
  EReference getInfrastructureLayer_Parent();

  /**
   * Returns the meta object for the containment reference list '{@link domain.InfrastructureLayer#getInfrastructureComponent <em>Infrastructure Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Infrastructure Component</em>'.
   * @see domain.InfrastructureLayer#getInfrastructureComponent()
   * @see #getInfrastructureLayer()
   * @generated
   */
  EReference getInfrastructureLayer_InfrastructureComponent();

  /**
   * Returns the meta object for class '{@link domain.InfrastructureConnection <em>Infrastructure Connection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Infrastructure Connection</em>'.
   * @see domain.InfrastructureConnection
   * @generated
   */
  EClass getInfrastructureConnection();

  /**
   * Returns the meta object for the attribute '{@link domain.InfrastructureConnection#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.InfrastructureConnection#getUid()
   * @see #getInfrastructureConnection()
   * @generated
   */
  EAttribute getInfrastructureConnection_Uid();

  /**
   * Returns the meta object for the reference '{@link domain.InfrastructureConnection#getMaster <em>Master</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Master</em>'.
   * @see domain.InfrastructureConnection#getMaster()
   * @see #getInfrastructureConnection()
   * @generated
   */
  EReference getInfrastructureConnection_Master();

  /**
   * Returns the meta object for the reference '{@link domain.InfrastructureConnection#getDetail <em>Detail</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Detail</em>'.
   * @see domain.InfrastructureConnection#getDetail()
   * @see #getInfrastructureConnection()
   * @generated
   */
  EReference getInfrastructureConnection_Detail();

  /**
   * Returns the meta object for class '{@link domain.InfrastructureComponent <em>Infrastructure Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Infrastructure Component</em>'.
   * @see domain.InfrastructureComponent
   * @generated
   */
  EClass getInfrastructureComponent();

  /**
   * Returns the meta object for the attribute '{@link domain.InfrastructureComponent#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see domain.InfrastructureComponent#getUid()
   * @see #getInfrastructureComponent()
   * @generated
   */
  EAttribute getInfrastructureComponent_Uid();

  /**
   * Returns the meta object for the attribute '{@link domain.InfrastructureComponent#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see domain.InfrastructureComponent#getName()
   * @see #getInfrastructureComponent()
   * @generated
   */
  EAttribute getInfrastructureComponent_Name();

  /**
   * Returns the meta object for the container reference '{@link domain.InfrastructureComponent#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Parent</em>'.
   * @see domain.InfrastructureComponent#getParent()
   * @see #getInfrastructureComponent()
   * @generated
   */
  EReference getInfrastructureComponent_Parent();

  /**
   * Returns the meta object for class '{@link domain.Server <em>Server</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Server</em>'.
   * @see domain.Server
   * @generated
   */
  EClass getServer();

  /**
   * Returns the meta object for class '{@link domain.Router <em>Router</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Router</em>'.
   * @see domain.Router
   * @generated
   */
  EClass getRouter();

  /**
   * Returns the meta object for class '{@link domain.Hub <em>Hub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Hub</em>'.
   * @see domain.Hub
   * @generated
   */
  EClass getHub();

  /**
   * Returns the meta object for class '{@link domain.Storage <em>Storage</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Storage</em>'.
   * @see domain.Storage
   * @generated
   */
  EClass getStorage();

  /**
   * Returns the meta object for class '{@link domain.ServerClaster <em>Server Claster</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Server Claster</em>'.
   * @see domain.ServerClaster
   * @generated
   */
  EClass getServerClaster();

  /**
   * Returns the meta object for the containment reference list '{@link domain.ServerClaster#getServers <em>Servers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Servers</em>'.
   * @see domain.ServerClaster#getServers()
   * @see #getServerClaster()
   * @generated
   */
  EReference getServerClaster_Servers();

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
     * The meta object literal for the '{@link domain.impl.HTMLLayerHolderImpl <em>HTML Layer Holder</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.HTMLLayerHolderImpl
     * @see domain.impl.DomainPackageImpl#getHTMLLayerHolder()
     * @generated
     */
    EClass HTML_LAYER_HOLDER = eINSTANCE.getHTMLLayerHolder();

    /**
     * The meta object literal for the '<em><b>Columns</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HTML_LAYER_HOLDER__COLUMNS = eINSTANCE.getHTMLLayerHolder_Columns();

    /**
     * The meta object literal for the '{@link domain.impl.CategorizedImpl <em>Categorized</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.CategorizedImpl
     * @see domain.impl.DomainPackageImpl#getCategorized()
     * @generated
     */
    EClass CATEGORIZED = eINSTANCE.getCategorized();

    /**
     * The meta object literal for the '<em><b>Classifiers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CATEGORIZED__CLASSIFIERS = eINSTANCE.getCategorized_Classifiers();

    /**
     * The meta object literal for the '{@link domain.impl.ClassifierImpl <em>Classifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.ClassifierImpl
     * @see domain.impl.DomainPackageImpl#getClassifier()
     * @generated
     */
    EClass CLASSIFIER = eINSTANCE.getClassifier();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASSIFIER__UID = eINSTANCE.getClassifier_Uid();

    /**
     * The meta object literal for the '<em><b>Hint</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASSIFIER__HINT = eINSTANCE.getClassifier_Hint();

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
     * The meta object literal for the '{@link domain.impl.ContinuousIintegrationImpl <em>Continuous Iintegration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.ContinuousIintegrationImpl
     * @see domain.impl.DomainPackageImpl#getContinuousIintegration()
     * @generated
     */
    EClass CONTINUOUS_IINTEGRATION = eINSTANCE.getContinuousIintegration();

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
     * The meta object literal for the '<em><b>Hints</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARTIFACT__HINTS = eINSTANCE.getArtifact_Hints();

    /**
     * The meta object literal for the '<em><b>Template</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARTIFACT__TEMPLATE = eINSTANCE.getArtifact_Template();

    /**
     * The meta object literal for the '{@link domain.impl.GenerationHintImpl <em>Generation Hint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.GenerationHintImpl
     * @see domain.impl.DomainPackageImpl#getGenerationHint()
     * @generated
     */
    EClass GENERATION_HINT = eINSTANCE.getGenerationHint();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GENERATION_HINT__UID = eINSTANCE.getGenerationHint_Uid();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GENERATION_HINT__NAME = eINSTANCE.getGenerationHint_Name();

    /**
     * The meta object literal for the '<em><b>Applyed Class</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GENERATION_HINT__APPLYED_CLASS = eINSTANCE.getGenerationHint_ApplyedClass();

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
     * The meta object literal for the '{@link domain.impl.ModelQueryImpl <em>Model Query</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.ModelQueryImpl
     * @see domain.impl.DomainPackageImpl#getModelQuery()
     * @generated
     */
    EClass MODEL_QUERY = eINSTANCE.getModelQuery();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL_QUERY__UID = eINSTANCE.getModelQuery_Uid();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL_QUERY__NAME = eINSTANCE.getModelQuery_Name();

    /**
     * The meta object literal for the '<em><b>Query</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL_QUERY__QUERY = eINSTANCE.getModelQuery_Query();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_QUERY__PARENT = eINSTANCE.getModelQuery_Parent();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_QUERY__PARAMETERS = eINSTANCE.getModelQuery_Parameters();

    /**
     * The meta object literal for the '{@link domain.impl.QueryParameterImpl <em>Query Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.QueryParameterImpl
     * @see domain.impl.DomainPackageImpl#getQueryParameter()
     * @generated
     */
    EClass QUERY_PARAMETER = eINSTANCE.getQueryParameter();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUERY_PARAMETER__UID = eINSTANCE.getQueryParameter_Uid();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUERY_PARAMETER__PARENT = eINSTANCE.getQueryParameter_Parent();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUERY_PARAMETER__NAME = eINSTANCE.getQueryParameter_Name();

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
     * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLICATION__PARENT = eINSTANCE.getApplication_Parent();

    /**
     * The meta object literal for the '{@link domain.impl.ApplicationMessagesImpl <em>Application Messages</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.ApplicationMessagesImpl
     * @see domain.impl.DomainPackageImpl#getApplicationMessages()
     * @generated
     */
    EClass APPLICATION_MESSAGES = eINSTANCE.getApplicationMessages();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute APPLICATION_MESSAGES__UID = eINSTANCE.getApplicationMessages_Uid();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute APPLICATION_MESSAGES__NAME = eINSTANCE.getApplicationMessages_Name();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLICATION_MESSAGES__PARENT = eINSTANCE.getApplicationMessages_Parent();

    /**
     * The meta object literal for the '<em><b>Messages</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLICATION_MESSAGES__MESSAGES = eINSTANCE.getApplicationMessages_Messages();

    /**
     * The meta object literal for the '{@link domain.impl.ApplicationRoleImpl <em>Application Role</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.ApplicationRoleImpl
     * @see domain.impl.DomainPackageImpl#getApplicationRole()
     * @generated
     */
    EClass APPLICATION_ROLE = eINSTANCE.getApplicationRole();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute APPLICATION_ROLE__UID = eINSTANCE.getApplicationRole_Uid();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute APPLICATION_ROLE__NAME = eINSTANCE.getApplicationRole_Name();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLICATION_ROLE__PARENT = eINSTANCE.getApplicationRole_Parent();

    /**
     * The meta object literal for the '<em><b>Roles</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLICATION_ROLE__ROLES = eINSTANCE.getApplicationRole_Roles();

    /**
     * The meta object literal for the '{@link domain.impl.ApplicationStyleImpl <em>Application Style</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.ApplicationStyleImpl
     * @see domain.impl.DomainPackageImpl#getApplicationStyle()
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
     * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLICATION_STYLE__PARENT = eINSTANCE.getApplicationStyle_Parent();

    /**
     * The meta object literal for the '<em><b>Styles Package</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLICATION_STYLE__STYLES_PACKAGE = eINSTANCE.getApplicationStyle_StylesPackage();

    /**
     * The meta object literal for the '{@link domain.impl.StylesPackageImpl <em>Styles Package</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.StylesPackageImpl
     * @see domain.impl.DomainPackageImpl#getStylesPackage()
     * @generated
     */
    EClass STYLES_PACKAGE = eINSTANCE.getStylesPackage();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STYLES_PACKAGE__UID = eINSTANCE.getStylesPackage_Uid();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STYLES_PACKAGE__NAME = eINSTANCE.getStylesPackage_Name();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STYLES_PACKAGE__PARENT = eINSTANCE.getStylesPackage_Parent();

    /**
     * The meta object literal for the '<em><b>Styles</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STYLES_PACKAGE__STYLES = eINSTANCE.getStylesPackage_Styles();

    /**
     * The meta object literal for the '{@link domain.impl.ApplicationUILayerImpl <em>Application UI Layer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.ApplicationUILayerImpl
     * @see domain.impl.DomainPackageImpl#getApplicationUILayer()
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
     * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLICATION_UI_LAYER__PARENT = eINSTANCE.getApplicationUILayer_Parent();

    /**
     * The meta object literal for the '<em><b>Application UI Packages</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLICATION_UI_LAYER__APPLICATION_UI_PACKAGES = eINSTANCE.getApplicationUILayer_ApplicationUIPackages();

    /**
     * The meta object literal for the '{@link domain.impl.ApplicationUIPackageImpl <em>Application UI Package</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.ApplicationUIPackageImpl
     * @see domain.impl.DomainPackageImpl#getApplicationUIPackage()
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
     * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLICATION_UI_PACKAGE__PARENT = eINSTANCE.getApplicationUIPackage_Parent();

    /**
     * The meta object literal for the '<em><b>Uipackage</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLICATION_UI_PACKAGE__UIPACKAGE = eINSTANCE.getApplicationUIPackage_Uipackage();

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
     * The meta object literal for the '{@link domain.impl.MethodPointerImpl <em>Method Pointer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.MethodPointerImpl
     * @see domain.impl.DomainPackageImpl#getMethodPointer()
     * @generated
     */
    EClass METHOD_POINTER = eINSTANCE.getMethodPointer();

    /**
     * The meta object literal for the '<em><b>Method Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_POINTER__METHOD_REF = eINSTANCE.getMethodPointer_MethodRef();

    /**
     * The meta object literal for the '<em><b>Fake Method</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METHOD_POINTER__FAKE_METHOD = eINSTANCE.getMethodPointer_FakeMethod();

    /**
     * The meta object literal for the '{@link domain.impl.MessagesImpl <em>Messages</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.MessagesImpl
     * @see domain.impl.DomainPackageImpl#getMessages()
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
     * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MESSAGES__PARENT = eINSTANCE.getMessages_Parent();

    /**
     * The meta object literal for the '<em><b>Message Libraries</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MESSAGES__MESSAGE_LIBRARIES = eINSTANCE.getMessages_MessageLibraries();

    /**
     * The meta object literal for the '{@link domain.impl.MessageLibraryImpl <em>Message Library</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.MessageLibraryImpl
     * @see domain.impl.DomainPackageImpl#getMessageLibrary()
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
     * The meta object literal for the '{@link domain.impl.LanguageRefImpl <em>Language Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.LanguageRefImpl
     * @see domain.impl.DomainPackageImpl#getLanguageRef()
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
     * The meta object literal for the '{@link domain.impl.MessageImpl <em>Message</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.MessageImpl
     * @see domain.impl.DomainPackageImpl#getMessage()
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
     * The meta object literal for the '{@link domain.impl.TranslationImpl <em>Translation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.TranslationImpl
     * @see domain.impl.DomainPackageImpl#getTranslation()
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
     * The meta object literal for the '{@link domain.impl.LanguageImpl <em>Language</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.LanguageImpl
     * @see domain.impl.DomainPackageImpl#getLanguage()
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
     * The meta object literal for the '{@link domain.impl.RolesImpl <em>Roles</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.RolesImpl
     * @see domain.impl.DomainPackageImpl#getRoles()
     * @generated
     */
    EClass ROLES = eINSTANCE.getRoles();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ROLES__UID = eINSTANCE.getRoles_Uid();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROLES__PARENT = eINSTANCE.getRoles_Parent();

    /**
     * The meta object literal for the '<em><b>Roles</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROLES__ROLES = eINSTANCE.getRoles_Roles();

    /**
     * The meta object literal for the '<em><b>Groups</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROLES__GROUPS = eINSTANCE.getRoles_Groups();

    /**
     * The meta object literal for the '{@link domain.impl.RoleImpl <em>Role</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.RoleImpl
     * @see domain.impl.DomainPackageImpl#getRole()
     * @generated
     */
    EClass ROLE = eINSTANCE.getRole();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ROLE__UID = eINSTANCE.getRole_Uid();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ROLE__NAME = eINSTANCE.getRole_Name();

    /**
     * The meta object literal for the '{@link domain.impl.GroupImpl <em>Group</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.GroupImpl
     * @see domain.impl.DomainPackageImpl#getGroup()
     * @generated
     */
    EClass GROUP = eINSTANCE.getGroup();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GROUP__UID = eINSTANCE.getGroup_Uid();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GROUP__NAME = eINSTANCE.getGroup_Name();

    /**
     * The meta object literal for the '<em><b>Group2 Group</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GROUP__GROUP2_GROUP = eINSTANCE.getGroup_Group2Group();

    /**
     * The meta object literal for the '<em><b>Group2 Role</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GROUP__GROUP2_ROLE = eINSTANCE.getGroup_Group2Role();

    /**
     * The meta object literal for the '{@link domain.impl.StylesImpl <em>Styles</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.StylesImpl
     * @see domain.impl.DomainPackageImpl#getStyles()
     * @generated
     */
    EClass STYLES = eINSTANCE.getStyles();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STYLES__UID = eINSTANCE.getStyles_Uid();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STYLES__PARENT = eINSTANCE.getStyles_Parent();

    /**
     * The meta object literal for the '<em><b>Libraries</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STYLES__LIBRARIES = eINSTANCE.getStyles_Libraries();

    /**
     * The meta object literal for the '{@link domain.impl.StyleLibraryImpl <em>Style Library</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.StyleLibraryImpl
     * @see domain.impl.DomainPackageImpl#getStyleLibrary()
     * @generated
     */
    EClass STYLE_LIBRARY = eINSTANCE.getStyleLibrary();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STYLE_LIBRARY__UID = eINSTANCE.getStyleLibrary_Uid();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STYLE_LIBRARY__NAME = eINSTANCE.getStyleLibrary_Name();

    /**
     * The meta object literal for the '<em><b>Styles</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STYLE_LIBRARY__STYLES = eINSTANCE.getStyleLibrary_Styles();

    /**
     * The meta object literal for the '{@link domain.impl.StyleSetImpl <em>Style Set</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.StyleSetImpl
     * @see domain.impl.DomainPackageImpl#getStyleSet()
     * @generated
     */
    EClass STYLE_SET = eINSTANCE.getStyleSet();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STYLE_SET__UID = eINSTANCE.getStyleSet_Uid();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STYLE_SET__NAME = eINSTANCE.getStyleSet_Name();

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
     * The meta object literal for the '{@link domain.impl.TypeMapperImpl <em>Type Mapper</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.TypeMapperImpl
     * @see domain.impl.DomainPackageImpl#getTypeMapper()
     * @generated
     */
    EClass TYPE_MAPPER = eINSTANCE.getTypeMapper();

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
     * The meta object literal for the '{@link domain.impl.JavaScriptMapperImpl <em>Java Script Mapper</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.JavaScriptMapperImpl
     * @see domain.impl.DomainPackageImpl#getJavaScriptMapper()
     * @generated
     */
    EClass JAVA_SCRIPT_MAPPER = eINSTANCE.getJavaScriptMapper();

    /**
     * The meta object literal for the '<em><b>Library Url</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JAVA_SCRIPT_MAPPER__LIBRARY_URL = eINSTANCE.getJavaScriptMapper_LibraryUrl();

    /**
     * The meta object literal for the '{@link domain.impl.CSSMapperImpl <em>CSS Mapper</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.CSSMapperImpl
     * @see domain.impl.DomainPackageImpl#getCSSMapper()
     * @generated
     */
    EClass CSS_MAPPER = eINSTANCE.getCSSMapper();

    /**
     * The meta object literal for the '<em><b>Library Url</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CSS_MAPPER__LIBRARY_URL = eINSTANCE.getCSSMapper_LibraryUrl();

    /**
     * The meta object literal for the '<em><b>Style Package</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CSS_MAPPER__STYLE_PACKAGE = eINSTANCE.getCSSMapper_StylePackage();

    /**
     * The meta object literal for the '<em><b>Style Library</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CSS_MAPPER__STYLE_LIBRARY = eINSTANCE.getCSSMapper_StyleLibrary();

    /**
     * The meta object literal for the '<em><b>Fake Package Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CSS_MAPPER__FAKE_PACKAGE_NAME = eINSTANCE.getCSSMapper_FakePackageName();

    /**
     * The meta object literal for the '<em><b>Fake Type Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CSS_MAPPER__FAKE_TYPE_NAME = eINSTANCE.getCSSMapper_FakeTypeName();

    /**
     * The meta object literal for the '{@link domain.impl.RoleMapperImpl <em>Role Mapper</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.RoleMapperImpl
     * @see domain.impl.DomainPackageImpl#getRoleMapper()
     * @generated
     */
    EClass ROLE_MAPPER = eINSTANCE.getRoleMapper();

    /**
     * The meta object literal for the '<em><b>Role</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROLE_MAPPER__ROLE = eINSTANCE.getRoleMapper_Role();

    /**
     * The meta object literal for the '<em><b>Local Role Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ROLE_MAPPER__LOCAL_ROLE_NAME = eINSTANCE.getRoleMapper_LocalRoleName();

    /**
     * The meta object literal for the '<em><b>Global Role Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ROLE_MAPPER__GLOBAL_ROLE_NAME = eINSTANCE.getRoleMapper_GlobalRoleName();

    /**
     * The meta object literal for the '<em><b>Fake Role Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ROLE_MAPPER__FAKE_ROLE_NAME = eINSTANCE.getRoleMapper_FakeRoleName();

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
     * The meta object literal for the '<em><b>Deployment</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RECIPES__DEPLOYMENT = eINSTANCE.getRecipes_Deployment();

    /**
     * The meta object literal for the '{@link domain.impl.DeploymentSequenceImpl <em>Deployment Sequence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.DeploymentSequenceImpl
     * @see domain.impl.DomainPackageImpl#getDeploymentSequence()
     * @generated
     */
    EClass DEPLOYMENT_SEQUENCE = eINSTANCE.getDeploymentSequence();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEPLOYMENT_SEQUENCE__UID = eINSTANCE.getDeploymentSequence_Uid();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEPLOYMENT_SEQUENCE__NAME = eINSTANCE.getDeploymentSequence_Name();

    /**
     * The meta object literal for the '<em><b>Deployment Components</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEPLOYMENT_SEQUENCE__DEPLOYMENT_COMPONENTS = eINSTANCE.getDeploymentSequence_DeploymentComponents();

    /**
     * The meta object literal for the '{@link domain.impl.DeploymentComponentsImpl <em>Deployment Components</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.DeploymentComponentsImpl
     * @see domain.impl.DomainPackageImpl#getDeploymentComponents()
     * @generated
     */
    EClass DEPLOYMENT_COMPONENTS = eINSTANCE.getDeploymentComponents();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEPLOYMENT_COMPONENTS__UID = eINSTANCE.getDeploymentComponents_Uid();

    /**
     * The meta object literal for the '<em><b>Deplyment Step</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEPLOYMENT_COMPONENTS__DEPLYMENT_STEP = eINSTANCE.getDeploymentComponents_DeplymentStep();

    /**
     * The meta object literal for the '<em><b>Start Seq</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEPLOYMENT_COMPONENTS__START_SEQ = eINSTANCE.getDeploymentComponents_StartSeq();

    /**
     * The meta object literal for the '{@link domain.impl.DeploymentComponentImpl <em>Deployment Component</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.DeploymentComponentImpl
     * @see domain.impl.DomainPackageImpl#getDeploymentComponent()
     * @generated
     */
    EClass DEPLOYMENT_COMPONENT = eINSTANCE.getDeploymentComponent();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEPLOYMENT_COMPONENT__UID = eINSTANCE.getDeploymentComponent_Uid();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEPLOYMENT_COMPONENT__NAME = eINSTANCE.getDeploymentComponent_Name();

    /**
     * The meta object literal for the '<em><b>Mapper</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEPLOYMENT_COMPONENT__MAPPER = eINSTANCE.getDeploymentComponent_Mapper();

    /**
     * The meta object literal for the '<em><b>Deployment Component Link</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEPLOYMENT_COMPONENT__DEPLOYMENT_COMPONENT_LINK = eINSTANCE.getDeploymentComponent_DeploymentComponentLink();

    /**
     * The meta object literal for the '{@link domain.impl.DeploymentStarStepImpl <em>Deployment Star Step</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.DeploymentStarStepImpl
     * @see domain.impl.DomainPackageImpl#getDeploymentStarStep()
     * @generated
     */
    EClass DEPLOYMENT_STAR_STEP = eINSTANCE.getDeploymentStarStep();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEPLOYMENT_STAR_STEP__UID = eINSTANCE.getDeploymentStarStep_Uid();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEPLOYMENT_STAR_STEP__NAME = eINSTANCE.getDeploymentStarStep_Name();

    /**
     * The meta object literal for the '<em><b>First Step</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEPLOYMENT_STAR_STEP__FIRST_STEP = eINSTANCE.getDeploymentStarStep_FirstStep();

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
     * The meta object literal for the '<em><b>Deployment</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RECIPE__DEPLOYMENT = eINSTANCE.getRecipe_Deployment();

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
     * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT__PARENT = eINSTANCE.getComponent_Parent();

    /**
     * The meta object literal for the '<em><b>Mappers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT__MAPPERS = eINSTANCE.getComponent_Mappers();

    /**
     * The meta object literal for the '<em><b>Component Root</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPONENT__COMPONENT_ROOT = eINSTANCE.getComponent_ComponentRoot();

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
     * The meta object literal for the '<em><b>Queries</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_MAPPER__QUERIES = eINSTANCE.getModelMapper_Queries();

    /**
     * The meta object literal for the '<em><b>Artifact Execution String</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL_MAPPER__ARTIFACT_EXECUTION_STRING = eINSTANCE.getModelMapper_ArtifactExecutionString();

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
     * The meta object literal for the '{@link domain.impl.QueryImpl <em>Query</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.QueryImpl
     * @see domain.impl.DomainPackageImpl#getQuery()
     * @generated
     */
    EClass QUERY = eINSTANCE.getQuery();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUERY__UID = eINSTANCE.getQuery_Uid();

    /**
     * The meta object literal for the '<em><b>Model Query</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUERY__MODEL_QUERY = eINSTANCE.getQuery_ModelQuery();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUERY__NAME = eINSTANCE.getQuery_Name();

    /**
     * The meta object literal for the '<em><b>Query Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUERY__QUERY_REF = eINSTANCE.getQuery_QueryRef();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUERY__VARIABLES = eINSTANCE.getQuery_Variables();

    /**
     * The meta object literal for the '<em><b>Group Code</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUERY__GROUP_CODE = eINSTANCE.getQuery_GroupCode();

    /**
     * The meta object literal for the '{@link domain.impl.QueryVariableImpl <em>Query Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.QueryVariableImpl
     * @see domain.impl.DomainPackageImpl#getQueryVariable()
     * @generated
     */
    EClass QUERY_VARIABLE = eINSTANCE.getQueryVariable();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUERY_VARIABLE__UID = eINSTANCE.getQueryVariable_Uid();

    /**
     * The meta object literal for the '<em><b>Query Param Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUERY_VARIABLE__QUERY_PARAM_REF = eINSTANCE.getQueryVariable_QueryParamRef();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUERY_VARIABLE__VALUE = eINSTANCE.getQueryVariable_Value();

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
     * The meta object literal for the '{@link domain.impl.PrimitiveImpl <em>Primitive</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.PrimitiveImpl
     * @see domain.impl.DomainPackageImpl#getPrimitive()
     * @generated
     */
    EClass PRIMITIVE = eINSTANCE.getPrimitive();

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
     * The meta object literal for the '<em><b>Extension</b></em>' containment reference list feature.
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
     * The meta object literal for the '<em><b>Order</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER__ORDER = eINSTANCE.getParameter_Order();

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
     * The meta object literal for the '{@link domain.impl.UIPackageImpl <em>UI Package</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.UIPackageImpl
     * @see domain.impl.DomainPackageImpl#getUIPackage()
     * @generated
     */
    EClass UI_PACKAGE = eINSTANCE.getUIPackage();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UI_PACKAGE__UID = eINSTANCE.getUIPackage_Uid();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UI_PACKAGE__PARENT = eINSTANCE.getUIPackage_Parent();

    /**
     * The meta object literal for the '<em><b>Forms</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UI_PACKAGE__FORMS = eINSTANCE.getUIPackage_Forms();

    /**
     * The meta object literal for the '{@link domain.impl.FormImpl <em>Form</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.FormImpl
     * @see domain.impl.DomainPackageImpl#getForm()
     * @generated
     */
    EClass FORM = eINSTANCE.getForm();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FORM__UID = eINSTANCE.getForm_Uid();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FORM__NAME = eINSTANCE.getForm_Name();

    /**
     * The meta object literal for the '<em><b>View</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORM__VIEW = eINSTANCE.getForm_View();

    /**
     * The meta object literal for the '<em><b>Datacontrols</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORM__DATACONTROLS = eINSTANCE.getForm_Datacontrols();

    /**
     * The meta object literal for the '{@link domain.impl.FormViewImpl <em>Form View</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.FormViewImpl
     * @see domain.impl.DomainPackageImpl#getFormView()
     * @generated
     */
    EClass FORM_VIEW = eINSTANCE.getFormView();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FORM_VIEW__UID = eINSTANCE.getFormView_Uid();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FORM_VIEW__NAME = eINSTANCE.getFormView_Name();

    /**
     * The meta object literal for the '<em><b>View</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORM_VIEW__VIEW = eINSTANCE.getFormView_View();

    /**
     * The meta object literal for the '{@link domain.impl.ViewsImpl <em>Views</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.ViewsImpl
     * @see domain.impl.DomainPackageImpl#getViews()
     * @generated
     */
    EClass VIEWS = eINSTANCE.getViews();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIEWS__UID = eINSTANCE.getViews_Uid();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEWS__PARENT = eINSTANCE.getViews_Parent();

    /**
     * The meta object literal for the '<em><b>Canvases</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEWS__CANVASES = eINSTANCE.getViews_Canvases();

    /**
     * The meta object literal for the '<em><b>View Inheritances</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEWS__VIEW_INHERITANCES = eINSTANCE.getViews_ViewInheritances();

    /**
     * The meta object literal for the '<em><b>Tab Pages Inheritances</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEWS__TAB_PAGES_INHERITANCES = eINSTANCE.getViews_TabPagesInheritances();

    /**
     * The meta object literal for the '{@link domain.impl.MultiLangLabelImpl <em>Multi Lang Label</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.MultiLangLabelImpl
     * @see domain.impl.DomainPackageImpl#getMultiLangLabel()
     * @generated
     */
    EClass MULTI_LANG_LABEL = eINSTANCE.getMultiLangLabel();

    /**
     * The meta object literal for the '<em><b>Multi Lang Label</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTI_LANG_LABEL__MULTI_LANG_LABEL = eINSTANCE.getMultiLangLabel_MultiLangLabel();

    /**
     * The meta object literal for the '{@link domain.impl.CanvasFrameImpl <em>Canvas Frame</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.CanvasFrameImpl
     * @see domain.impl.DomainPackageImpl#getCanvasFrame()
     * @generated
     */
    EClass CANVAS_FRAME = eINSTANCE.getCanvasFrame();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CANVAS_FRAME__UID = eINSTANCE.getCanvasFrame_Uid();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CANVAS_FRAME__NAME = eINSTANCE.getCanvasFrame_Name();

    /**
     * The meta object literal for the '{@link domain.impl.ViewPortHolderImpl <em>View Port Holder</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.ViewPortHolderImpl
     * @see domain.impl.DomainPackageImpl#getViewPortHolder()
     * @generated
     */
    EClass VIEW_PORT_HOLDER = eINSTANCE.getViewPortHolder();

    /**
     * The meta object literal for the '<em><b>View Element</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEW_PORT_HOLDER__VIEW_ELEMENT = eINSTANCE.getViewPortHolder_ViewElement();

    /**
     * The meta object literal for the '{@link domain.impl.DefaultCavasImpl <em>Default Cavas</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.DefaultCavasImpl
     * @see domain.impl.DomainPackageImpl#getDefaultCavas()
     * @generated
     */
    EClass DEFAULT_CAVAS = eINSTANCE.getDefaultCavas();

    /**
     * The meta object literal for the '<em><b>Default Canvas</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEFAULT_CAVAS__DEFAULT_CANVAS = eINSTANCE.getDefaultCavas_DefaultCanvas();

    /**
     * The meta object literal for the '{@link domain.impl.ViewElementImpl <em>View Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.ViewElementImpl
     * @see domain.impl.DomainPackageImpl#getViewElement()
     * @generated
     */
    EClass VIEW_ELEMENT = eINSTANCE.getViewElement();

    /**
     * The meta object literal for the '{@link domain.impl.CanvasImpl <em>Canvas</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.CanvasImpl
     * @see domain.impl.DomainPackageImpl#getCanvas()
     * @generated
     */
    EClass CANVAS = eINSTANCE.getCanvas();

    /**
     * The meta object literal for the '{@link domain.impl.WindowImpl <em>Window</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.WindowImpl
     * @see domain.impl.DomainPackageImpl#getWindow()
     * @generated
     */
    EClass WINDOW = eINSTANCE.getWindow();

    /**
     * The meta object literal for the '{@link domain.impl.TabCanvasImpl <em>Tab Canvas</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.TabCanvasImpl
     * @see domain.impl.DomainPackageImpl#getTabCanvas()
     * @generated
     */
    EClass TAB_CANVAS = eINSTANCE.getTabCanvas();

    /**
     * The meta object literal for the '{@link domain.impl.TabPageImpl <em>Tab Page</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.TabPageImpl
     * @see domain.impl.DomainPackageImpl#getTabPage()
     * @generated
     */
    EClass TAB_PAGE = eINSTANCE.getTabPage();

    /**
     * The meta object literal for the '{@link domain.impl.ViewPortImpl <em>View Port</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.ViewPortImpl
     * @see domain.impl.DomainPackageImpl#getViewPort()
     * @generated
     */
    EClass VIEW_PORT = eINSTANCE.getViewPort();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIEW_PORT__UID = eINSTANCE.getViewPort_Uid();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIEW_PORT__NAME = eINSTANCE.getViewPort_Name();

    /**
     * The meta object literal for the '<em><b>View Port Trigger</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEW_PORT__VIEW_PORT_TRIGGER = eINSTANCE.getViewPort_ViewPortTrigger();

    /**
     * The meta object literal for the '{@link domain.impl.ViewAreaImpl <em>View Area</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.ViewAreaImpl
     * @see domain.impl.DomainPackageImpl#getViewArea()
     * @generated
     */
    EClass VIEW_AREA = eINSTANCE.getViewArea();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIEW_AREA__UID = eINSTANCE.getViewArea_Uid();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIEW_AREA__NAME = eINSTANCE.getViewArea_Name();

    /**
     * The meta object literal for the '<em><b>Canvas View</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEW_AREA__CANVAS_VIEW = eINSTANCE.getViewArea_CanvasView();

    /**
     * The meta object literal for the '{@link domain.impl.ViewPortTriggerImpl <em>View Port Trigger</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.ViewPortTriggerImpl
     * @see domain.impl.DomainPackageImpl#getViewPortTrigger()
     * @generated
     */
    EClass VIEW_PORT_TRIGGER = eINSTANCE.getViewPortTrigger();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIEW_PORT_TRIGGER__UID = eINSTANCE.getViewPortTrigger_Uid();

    /**
     * The meta object literal for the '{@link domain.impl.ViewInheritanceImpl <em>View Inheritance</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.ViewInheritanceImpl
     * @see domain.impl.DomainPackageImpl#getViewInheritance()
     * @generated
     */
    EClass VIEW_INHERITANCE = eINSTANCE.getViewInheritance();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIEW_INHERITANCE__UID = eINSTANCE.getViewInheritance_Uid();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEW_INHERITANCE__SOURCE = eINSTANCE.getViewInheritance_Source();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEW_INHERITANCE__TARGET = eINSTANCE.getViewInheritance_Target();

    /**
     * The meta object literal for the '{@link domain.impl.TabPagesInheritanceImpl <em>Tab Pages Inheritance</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.TabPagesInheritanceImpl
     * @see domain.impl.DomainPackageImpl#getTabPagesInheritance()
     * @generated
     */
    EClass TAB_PAGES_INHERITANCE = eINSTANCE.getTabPagesInheritance();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TAB_PAGES_INHERITANCE__UID = eINSTANCE.getTabPagesInheritance_Uid();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TAB_PAGES_INHERITANCE__SOURCE = eINSTANCE.getTabPagesInheritance_Source();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TAB_PAGES_INHERITANCE__TARGET = eINSTANCE.getTabPagesInheritance_Target();

    /**
     * The meta object literal for the '{@link domain.impl.FormDataControlsImpl <em>Form Data Controls</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.FormDataControlsImpl
     * @see domain.impl.DomainPackageImpl#getFormDataControls()
     * @generated
     */
    EClass FORM_DATA_CONTROLS = eINSTANCE.getFormDataControls();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FORM_DATA_CONTROLS__UID = eINSTANCE.getFormDataControls_Uid();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FORM_DATA_CONTROLS__NAME = eINSTANCE.getFormDataControls_Name();

    /**
     * The meta object literal for the '<em><b>Form Control</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORM_DATA_CONTROLS__FORM_CONTROL = eINSTANCE.getFormDataControls_FormControl();

    /**
     * The meta object literal for the '{@link domain.impl.CanvasViewImpl <em>Canvas View</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.CanvasViewImpl
     * @see domain.impl.DomainPackageImpl#getCanvasView()
     * @generated
     */
    EClass CANVAS_VIEW = eINSTANCE.getCanvasView();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CANVAS_VIEW__UID = eINSTANCE.getCanvasView_Uid();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CANVAS_VIEW__PARENT = eINSTANCE.getCanvasView_Parent();

    /**
     * The meta object literal for the '<em><b>Base Canvas</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CANVAS_VIEW__BASE_CANVAS = eINSTANCE.getCanvasView_BaseCanvas();

    /**
     * The meta object literal for the '{@link domain.impl.StyleImpl <em>Style</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.StyleImpl
     * @see domain.impl.DomainPackageImpl#getStyle()
     * @generated
     */
    EClass STYLE = eINSTANCE.getStyle();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STYLE__UID = eINSTANCE.getStyle_Uid();

    /**
     * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STYLE__STYLE = eINSTANCE.getStyle_Style();

    /**
     * The meta object literal for the '{@link domain.impl.ChildrenHolderImpl <em>Children Holder</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.ChildrenHolderImpl
     * @see domain.impl.DomainPackageImpl#getChildrenHolder()
     * @generated
     */
    EClass CHILDREN_HOLDER = eINSTANCE.getChildrenHolder();

    /**
     * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHILDREN_HOLDER__CHILDREN = eINSTANCE.getChildrenHolder_Children();

    /**
     * The meta object literal for the '{@link domain.impl.StyleClassImpl <em>Style Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.StyleClassImpl
     * @see domain.impl.DomainPackageImpl#getStyleClass()
     * @generated
     */
    EClass STYLE_CLASS = eINSTANCE.getStyleClass();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STYLE_CLASS__UID = eINSTANCE.getStyleClass_Uid();

    /**
     * The meta object literal for the '<em><b>Styles Package</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STYLE_CLASS__STYLES_PACKAGE = eINSTANCE.getStyleClass_StylesPackage();

    /**
     * The meta object literal for the '<em><b>Library</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STYLE_CLASS__LIBRARY = eINSTANCE.getStyleClass_Library();

    /**
     * The meta object literal for the '<em><b>Style Set</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STYLE_CLASS__STYLE_SET = eINSTANCE.getStyleClass_StyleSet();

    /**
     * The meta object literal for the '{@link domain.impl.ContextParameterImpl <em>Context Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.ContextParameterImpl
     * @see domain.impl.DomainPackageImpl#getContextParameter()
     * @generated
     */
    EClass CONTEXT_PARAMETER = eINSTANCE.getContextParameter();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTEXT_PARAMETER__UID = eINSTANCE.getContextParameter_Uid();

    /**
     * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTEXT_PARAMETER__PARAMETER = eINSTANCE.getContextParameter_Parameter();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTEXT_PARAMETER__VALUE = eINSTANCE.getContextParameter_Value();

    /**
     * The meta object literal for the '{@link domain.impl.ContextValueImpl <em>Context Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.ContextValueImpl
     * @see domain.impl.DomainPackageImpl#getContextValue()
     * @generated
     */
    EClass CONTEXT_VALUE = eINSTANCE.getContextValue();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTEXT_VALUE__UID = eINSTANCE.getContextValue_Uid();

    /**
     * The meta object literal for the '<em><b>Constant</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTEXT_VALUE__CONSTANT = eINSTANCE.getContextValue_Constant();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTEXT_VALUE__VALUE = eINSTANCE.getContextValue_Value();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTEXT_VALUE__EXPRESSION = eINSTANCE.getContextValue_Expression();

    /**
     * The meta object literal for the '{@link domain.impl.ExpressionPartImpl <em>Expression Part</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.ExpressionPartImpl
     * @see domain.impl.DomainPackageImpl#getExpressionPart()
     * @generated
     */
    EClass EXPRESSION_PART = eINSTANCE.getExpressionPart();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION_PART__UID = eINSTANCE.getExpressionPart_Uid();

    /**
     * The meta object literal for the '<em><b>Obj Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_PART__OBJ_REF = eINSTANCE.getExpressionPart_ObjRef();

    /**
     * The meta object literal for the '<em><b>Order</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION_PART__ORDER = eINSTANCE.getExpressionPart_Order();

    /**
     * The meta object literal for the '{@link domain.impl.ContextParametersImpl <em>Context Parameters</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.ContextParametersImpl
     * @see domain.impl.DomainPackageImpl#getContextParameters()
     * @generated
     */
    EClass CONTEXT_PARAMETERS = eINSTANCE.getContextParameters();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTEXT_PARAMETERS__PARAMETERS = eINSTANCE.getContextParameters_Parameters();

    /**
     * The meta object literal for the '{@link domain.impl.ContextImpl <em>Context</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.ContextImpl
     * @see domain.impl.DomainPackageImpl#getContext()
     * @generated
     */
    EClass CONTEXT = eINSTANCE.getContext();

    /**
     * The meta object literal for the '{@link domain.impl.StyleElementImpl <em>Style Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.StyleElementImpl
     * @see domain.impl.DomainPackageImpl#getStyleElement()
     * @generated
     */
    EClass STYLE_ELEMENT = eINSTANCE.getStyleElement();

    /**
     * The meta object literal for the '<em><b>Style</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STYLE_ELEMENT__STYLE = eINSTANCE.getStyleElement_Style();

    /**
     * The meta object literal for the '<em><b>Style Class</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STYLE_ELEMENT__STYLE_CLASS = eINSTANCE.getStyleElement_StyleClass();

    /**
     * The meta object literal for the '{@link domain.impl.UielementImpl <em>Uielement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.UielementImpl
     * @see domain.impl.DomainPackageImpl#getUielement()
     * @generated
     */
    EClass UIELEMENT = eINSTANCE.getUielement();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UIELEMENT__UID = eINSTANCE.getUielement_Uid();

    /**
     * The meta object literal for the '<em><b>Nickname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UIELEMENT__NICKNAME = eINSTANCE.getUielement_Nickname();

    /**
     * The meta object literal for the '<em><b>Enabled</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UIELEMENT__ENABLED = eINSTANCE.getUielement_Enabled();

    /**
     * The meta object literal for the '<em><b>Required</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UIELEMENT__REQUIRED = eINSTANCE.getUielement_Required();

    /**
     * The meta object literal for the '<em><b>Read Only</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UIELEMENT__READ_ONLY = eINSTANCE.getUielement_ReadOnly();

    /**
     * The meta object literal for the '<em><b>On Event Refresh Area</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UIELEMENT__ON_EVENT_REFRESH_AREA = eINSTANCE.getUielement_OnEventRefreshArea();

    /**
     * The meta object literal for the '{@link domain.impl.SourcesPointerImpl <em>Sources Pointer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.SourcesPointerImpl
     * @see domain.impl.DomainPackageImpl#getSourcesPointer()
     * @generated
     */
    EClass SOURCES_POINTER = eINSTANCE.getSourcesPointer();

    /**
     * The meta object literal for the '<em><b>Source Pointer</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SOURCES_POINTER__SOURCE_POINTER = eINSTANCE.getSourcesPointer_SourcePointer();

    /**
     * The meta object literal for the '<em><b>Value Pointer</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SOURCES_POINTER__VALUE_POINTER = eINSTANCE.getSourcesPointer_ValuePointer();

    /**
     * The meta object literal for the '<em><b>Source Cast</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SOURCES_POINTER__SOURCE_CAST = eINSTANCE.getSourcesPointer_SourceCast();

    /**
     * The meta object literal for the '{@link domain.impl.ActionElementImpl <em>Action Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.ActionElementImpl
     * @see domain.impl.DomainPackageImpl#getActionElement()
     * @generated
     */
    EClass ACTION_ELEMENT = eINSTANCE.getActionElement();

    /**
     * The meta object literal for the '{@link domain.impl.InputElementImpl <em>Input Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.InputElementImpl
     * @see domain.impl.DomainPackageImpl#getInputElement()
     * @generated
     */
    EClass INPUT_ELEMENT = eINSTANCE.getInputElement();

    /**
     * The meta object literal for the '{@link domain.impl.SelectionImpl <em>Selection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.SelectionImpl
     * @see domain.impl.DomainPackageImpl#getSelection()
     * @generated
     */
    EClass SELECTION = eINSTANCE.getSelection();

    /**
     * The meta object literal for the '<em><b>Display Option Pointer</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECTION__DISPLAY_OPTION_POINTER = eINSTANCE.getSelection_DisplayOptionPointer();

    /**
     * The meta object literal for the '<em><b>Value Option Pointer</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECTION__VALUE_OPTION_POINTER = eINSTANCE.getSelection_ValueOptionPointer();

    /**
     * The meta object literal for the '{@link domain.impl.OptionSelectionImpl <em>Option Selection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.OptionSelectionImpl
     * @see domain.impl.DomainPackageImpl#getOptionSelection()
     * @generated
     */
    EClass OPTION_SELECTION = eINSTANCE.getOptionSelection();

    /**
     * The meta object literal for the '<em><b>Option Pointer</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPTION_SELECTION__OPTION_POINTER = eINSTANCE.getOptionSelection_OptionPointer();

    /**
     * The meta object literal for the '<em><b>Option Cast</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPTION_SELECTION__OPTION_CAST = eINSTANCE.getOptionSelection_OptionCast();

    /**
     * The meta object literal for the '{@link domain.impl.LayerHolderImpl <em>Layer Holder</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.LayerHolderImpl
     * @see domain.impl.DomainPackageImpl#getLayerHolder()
     * @generated
     */
    EClass LAYER_HOLDER = eINSTANCE.getLayerHolder();

    /**
     * The meta object literal for the '{@link domain.impl.InputTextImpl <em>Input Text</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.InputTextImpl
     * @see domain.impl.DomainPackageImpl#getInputText()
     * @generated
     */
    EClass INPUT_TEXT = eINSTANCE.getInputText();

    /**
     * The meta object literal for the '{@link domain.impl.LabelImpl <em>Label</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.LabelImpl
     * @see domain.impl.DomainPackageImpl#getLabel()
     * @generated
     */
    EClass LABEL = eINSTANCE.getLabel();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LABEL__LABEL = eINSTANCE.getLabel_Label();

    /**
     * The meta object literal for the '{@link domain.impl.OutputTextImpl <em>Output Text</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.OutputTextImpl
     * @see domain.impl.DomainPackageImpl#getOutputText()
     * @generated
     */
    EClass OUTPUT_TEXT = eINSTANCE.getOutputText();

    /**
     * The meta object literal for the '{@link domain.impl.CheckBoxImpl <em>Check Box</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.CheckBoxImpl
     * @see domain.impl.DomainPackageImpl#getCheckBox()
     * @generated
     */
    EClass CHECK_BOX = eINSTANCE.getCheckBox();

    /**
     * The meta object literal for the '{@link domain.impl.DropDownSelectionImpl <em>Drop Down Selection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.DropDownSelectionImpl
     * @see domain.impl.DomainPackageImpl#getDropDownSelection()
     * @generated
     */
    EClass DROP_DOWN_SELECTION = eINSTANCE.getDropDownSelection();

    /**
     * The meta object literal for the '<em><b>Selection</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DROP_DOWN_SELECTION__SELECTION = eINSTANCE.getDropDownSelection_Selection();

    /**
     * The meta object literal for the '{@link domain.impl.ColumnImpl <em>Column</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.ColumnImpl
     * @see domain.impl.DomainPackageImpl#getColumn()
     * @generated
     */
    EClass COLUMN = eINSTANCE.getColumn();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLUMN__UID = eINSTANCE.getColumn_Uid();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLUMN__LABEL = eINSTANCE.getColumn_Label();

    /**
     * The meta object literal for the '<em><b>Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLUMN__ELEMENT = eINSTANCE.getColumn_Element();

    /**
     * The meta object literal for the '{@link domain.impl.TableImpl <em>Table</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.TableImpl
     * @see domain.impl.DomainPackageImpl#getTable()
     * @generated
     */
    EClass TABLE = eINSTANCE.getTable();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TABLE__LABEL = eINSTANCE.getTable_Label();

    /**
     * The meta object literal for the '<em><b>Cols</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TABLE__COLS = eINSTANCE.getTable_Cols();

    /**
     * The meta object literal for the '{@link domain.impl.TreeImpl <em>Tree</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.TreeImpl
     * @see domain.impl.DomainPackageImpl#getTree()
     * @generated
     */
    EClass TREE = eINSTANCE.getTree();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TREE__LABEL = eINSTANCE.getTree_Label();

    /**
     * The meta object literal for the '<em><b>Image</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TREE__IMAGE = eINSTANCE.getTree_Image();

    /**
     * The meta object literal for the '{@link domain.impl.ButtonImpl <em>Button</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.ButtonImpl
     * @see domain.impl.DomainPackageImpl#getButton()
     * @generated
     */
    EClass BUTTON = eINSTANCE.getButton();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUTTON__LABEL = eINSTANCE.getButton_Label();

    /**
     * The meta object literal for the '{@link domain.impl.ControlsImpl <em>Controls</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.ControlsImpl
     * @see domain.impl.DomainPackageImpl#getControls()
     * @generated
     */
    EClass CONTROLS = eINSTANCE.getControls();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTROLS__UID = eINSTANCE.getControls_Uid();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTROLS__PARENT = eINSTANCE.getControls_Parent();

    /**
     * The meta object literal for the '<em><b>Root</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTROLS__ROOT = eINSTANCE.getControls_Root();

    /**
     * The meta object literal for the '<em><b>Controls</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTROLS__CONTROLS = eINSTANCE.getControls_Controls();

    /**
     * The meta object literal for the '<em><b>Relations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTROLS__RELATIONS = eINSTANCE.getControls_Relations();

    /**
     * The meta object literal for the '{@link domain.impl.TriggerImpl <em>Trigger</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.TriggerImpl
     * @see domain.impl.DomainPackageImpl#getTrigger()
     * @generated
     */
    EClass TRIGGER = eINSTANCE.getTrigger();

    /**
     * The meta object literal for the '{@link domain.impl.PREFormTriggerImpl <em>PRE Form Trigger</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.PREFormTriggerImpl
     * @see domain.impl.DomainPackageImpl#getPREFormTrigger()
     * @generated
     */
    EClass PRE_FORM_TRIGGER = eINSTANCE.getPREFormTrigger();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRE_FORM_TRIGGER__UID = eINSTANCE.getPREFormTrigger_Uid();

    /**
     * The meta object literal for the '{@link domain.impl.PREQueryTriggerImpl <em>PRE Query Trigger</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.PREQueryTriggerImpl
     * @see domain.impl.DomainPackageImpl#getPREQueryTrigger()
     * @generated
     */
    EClass PRE_QUERY_TRIGGER = eINSTANCE.getPREQueryTrigger();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRE_QUERY_TRIGGER__UID = eINSTANCE.getPREQueryTrigger_Uid();

    /**
     * The meta object literal for the '{@link domain.impl.POSTQueryTriggerImpl <em>POST Query Trigger</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.POSTQueryTriggerImpl
     * @see domain.impl.DomainPackageImpl#getPOSTQueryTrigger()
     * @generated
     */
    EClass POST_QUERY_TRIGGER = eINSTANCE.getPOSTQueryTrigger();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POST_QUERY_TRIGGER__UID = eINSTANCE.getPOSTQueryTrigger_Uid();

    /**
     * The meta object literal for the '{@link domain.impl.PREInsertTriggerImpl <em>PRE Insert Trigger</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.PREInsertTriggerImpl
     * @see domain.impl.DomainPackageImpl#getPREInsertTrigger()
     * @generated
     */
    EClass PRE_INSERT_TRIGGER = eINSTANCE.getPREInsertTrigger();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRE_INSERT_TRIGGER__UID = eINSTANCE.getPREInsertTrigger_Uid();

    /**
     * The meta object literal for the '{@link domain.impl.PREDeleteTriggerImpl <em>PRE Delete Trigger</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.PREDeleteTriggerImpl
     * @see domain.impl.DomainPackageImpl#getPREDeleteTrigger()
     * @generated
     */
    EClass PRE_DELETE_TRIGGER = eINSTANCE.getPREDeleteTrigger();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRE_DELETE_TRIGGER__UID = eINSTANCE.getPREDeleteTrigger_Uid();

    /**
     * The meta object literal for the '{@link domain.impl.POSTCreateTriggerImpl <em>POST Create Trigger</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.POSTCreateTriggerImpl
     * @see domain.impl.DomainPackageImpl#getPOSTCreateTrigger()
     * @generated
     */
    EClass POST_CREATE_TRIGGER = eINSTANCE.getPOSTCreateTrigger();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POST_CREATE_TRIGGER__UID = eINSTANCE.getPOSTCreateTrigger_Uid();

    /**
     * The meta object literal for the '{@link domain.impl.PREUpdateTriggerImpl <em>PRE Update Trigger</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.PREUpdateTriggerImpl
     * @see domain.impl.DomainPackageImpl#getPREUpdateTrigger()
     * @generated
     */
    EClass PRE_UPDATE_TRIGGER = eINSTANCE.getPREUpdateTrigger();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRE_UPDATE_TRIGGER__UID = eINSTANCE.getPREUpdateTrigger_Uid();

    /**
     * The meta object literal for the '{@link domain.impl.CreateTriggerImpl <em>Create Trigger</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.CreateTriggerImpl
     * @see domain.impl.DomainPackageImpl#getCreateTrigger()
     * @generated
     */
    EClass CREATE_TRIGGER = eINSTANCE.getCreateTrigger();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CREATE_TRIGGER__UID = eINSTANCE.getCreateTrigger_Uid();

    /**
     * The meta object literal for the '{@link domain.impl.InsertTriggerImpl <em>Insert Trigger</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.InsertTriggerImpl
     * @see domain.impl.DomainPackageImpl#getInsertTrigger()
     * @generated
     */
    EClass INSERT_TRIGGER = eINSTANCE.getInsertTrigger();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSERT_TRIGGER__UID = eINSTANCE.getInsertTrigger_Uid();

    /**
     * The meta object literal for the '{@link domain.impl.UpdateTriggerImpl <em>Update Trigger</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.UpdateTriggerImpl
     * @see domain.impl.DomainPackageImpl#getUpdateTrigger()
     * @generated
     */
    EClass UPDATE_TRIGGER = eINSTANCE.getUpdateTrigger();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UPDATE_TRIGGER__UID = eINSTANCE.getUpdateTrigger_Uid();

    /**
     * The meta object literal for the '{@link domain.impl.DeleteTriggerImpl <em>Delete Trigger</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.DeleteTriggerImpl
     * @see domain.impl.DomainPackageImpl#getDeleteTrigger()
     * @generated
     */
    EClass DELETE_TRIGGER = eINSTANCE.getDeleteTrigger();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DELETE_TRIGGER__UID = eINSTANCE.getDeleteTrigger_Uid();

    /**
     * The meta object literal for the '{@link domain.impl.SearchTriggerImpl <em>Search Trigger</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.SearchTriggerImpl
     * @see domain.impl.DomainPackageImpl#getSearchTrigger()
     * @generated
     */
    EClass SEARCH_TRIGGER = eINSTANCE.getSearchTrigger();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SEARCH_TRIGGER__UID = eINSTANCE.getSearchTrigger_Uid();

    /**
     * The meta object literal for the '{@link domain.impl.RootImpl <em>Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.RootImpl
     * @see domain.impl.DomainPackageImpl#getRoot()
     * @generated
     */
    EClass ROOT = eINSTANCE.getRoot();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ROOT__UID = eINSTANCE.getRoot_Uid();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ROOT__NAME = eINSTANCE.getRoot_Name();

    /**
     * The meta object literal for the '<em><b>Pre Form Trigger</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROOT__PRE_FORM_TRIGGER = eINSTANCE.getRoot_PreFormTrigger();

    /**
     * The meta object literal for the '{@link domain.impl.DataControlImpl <em>Data Control</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.DataControlImpl
     * @see domain.impl.DomainPackageImpl#getDataControl()
     * @generated
     */
    EClass DATA_CONTROL = eINSTANCE.getDataControl();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_CONTROL__UID = eINSTANCE.getDataControl_Uid();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_CONTROL__NAME = eINSTANCE.getDataControl_Name();

    /**
     * The meta object literal for the '<em><b>Base Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_CONTROL__BASE_TYPE = eINSTANCE.getDataControl_BaseType();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_CONTROL__PARENT = eINSTANCE.getDataControl_Parent();

    /**
     * The meta object literal for the '<em><b>Pre Query Trigger</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_CONTROL__PRE_QUERY_TRIGGER = eINSTANCE.getDataControl_PreQueryTrigger();

    /**
     * The meta object literal for the '<em><b>Post Query Trigger</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_CONTROL__POST_QUERY_TRIGGER = eINSTANCE.getDataControl_PostQueryTrigger();

    /**
     * The meta object literal for the '<em><b>Pre Insert Trigger</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_CONTROL__PRE_INSERT_TRIGGER = eINSTANCE.getDataControl_PreInsertTrigger();

    /**
     * The meta object literal for the '<em><b>Pre Delete Trigger</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_CONTROL__PRE_DELETE_TRIGGER = eINSTANCE.getDataControl_PreDeleteTrigger();

    /**
     * The meta object literal for the '<em><b>Post Create Trigger</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_CONTROL__POST_CREATE_TRIGGER = eINSTANCE.getDataControl_PostCreateTrigger();

    /**
     * The meta object literal for the '<em><b>Pre Update Trigger</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_CONTROL__PRE_UPDATE_TRIGGER = eINSTANCE.getDataControl_PreUpdateTrigger();

    /**
     * The meta object literal for the '<em><b>Create</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_CONTROL__CREATE = eINSTANCE.getDataControl_Create();

    /**
     * The meta object literal for the '<em><b>Insert</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_CONTROL__INSERT = eINSTANCE.getDataControl_Insert();

    /**
     * The meta object literal for the '<em><b>Update</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_CONTROL__UPDATE = eINSTANCE.getDataControl_Update();

    /**
     * The meta object literal for the '<em><b>Remove</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_CONTROL__REMOVE = eINSTANCE.getDataControl_Remove();

    /**
     * The meta object literal for the '<em><b>Search</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_CONTROL__SEARCH = eINSTANCE.getDataControl_Search();

    /**
     * The meta object literal for the '<em><b>Artificial Fields</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_CONTROL__ARTIFICIAL_FIELDS = eINSTANCE.getDataControl_ArtificialFields();

    /**
     * The meta object literal for the '{@link domain.impl.RelationImpl <em>Relation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.RelationImpl
     * @see domain.impl.DomainPackageImpl#getRelation()
     * @generated
     */
    EClass RELATION = eINSTANCE.getRelation();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RELATION__UID = eINSTANCE.getRelation_Uid();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RELATION__NAME = eINSTANCE.getRelation_Name();

    /**
     * The meta object literal for the '<em><b>Master</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATION__MASTER = eINSTANCE.getRelation_Master();

    /**
     * The meta object literal for the '<em><b>Detail</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATION__DETAIL = eINSTANCE.getRelation_Detail();

    /**
     * The meta object literal for the '<em><b>Is Tree</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RELATION__IS_TREE = eINSTANCE.getRelation_IsTree();

    /**
     * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATION__LINKS = eINSTANCE.getRelation_Links();

    /**
     * The meta object literal for the '{@link domain.impl.ArtificialFieldImpl <em>Artificial Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.ArtificialFieldImpl
     * @see domain.impl.DomainPackageImpl#getArtificialField()
     * @generated
     */
    EClass ARTIFICIAL_FIELD = eINSTANCE.getArtificialField();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARTIFICIAL_FIELD__UID = eINSTANCE.getArtificialField_Uid();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARTIFICIAL_FIELD__NAME = eINSTANCE.getArtificialField_Name();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARTIFICIAL_FIELD__PARENT = eINSTANCE.getArtificialField_Parent();

    /**
     * The meta object literal for the '{@link domain.impl.LinkImpl <em>Link</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.LinkImpl
     * @see domain.impl.DomainPackageImpl#getLink()
     * @generated
     */
    EClass LINK = eINSTANCE.getLink();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LINK__UID = eINSTANCE.getLink_Uid();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LINK__PARENT = eINSTANCE.getLink_Parent();

    /**
     * The meta object literal for the '<em><b>Master Field</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LINK__MASTER_FIELD = eINSTANCE.getLink_MasterField();

    /**
     * The meta object literal for the '<em><b>Detail Field</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LINK__DETAIL_FIELD = eINSTANCE.getLink_DetailField();

    /**
     * The meta object literal for the '{@link domain.impl.ApplicationInfrastructureLayerImpl <em>Application Infrastructure Layer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.ApplicationInfrastructureLayerImpl
     * @see domain.impl.DomainPackageImpl#getApplicationInfrastructureLayer()
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
     * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLICATION_INFRASTRUCTURE_LAYER__PARENT = eINSTANCE.getApplicationInfrastructureLayer_Parent();

    /**
     * The meta object literal for the '<em><b>Infarastructure</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLICATION_INFRASTRUCTURE_LAYER__INFARASTRUCTURE = eINSTANCE.getApplicationInfrastructureLayer_Infarastructure();

    /**
     * The meta object literal for the '{@link domain.impl.EnterpriseInfrastructureImpl <em>Enterprise Infrastructure</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.EnterpriseInfrastructureImpl
     * @see domain.impl.DomainPackageImpl#getEnterpriseInfrastructure()
     * @generated
     */
    EClass ENTERPRISE_INFRASTRUCTURE = eINSTANCE.getEnterpriseInfrastructure();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTERPRISE_INFRASTRUCTURE__UID = eINSTANCE.getEnterpriseInfrastructure_Uid();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTERPRISE_INFRASTRUCTURE__PARENT = eINSTANCE.getEnterpriseInfrastructure_Parent();

    /**
     * The meta object literal for the '<em><b>Datacenters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTERPRISE_INFRASTRUCTURE__DATACENTERS = eINSTANCE.getEnterpriseInfrastructure_Datacenters();

    /**
     * The meta object literal for the '<em><b>Infrastructure Connections</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTERPRISE_INFRASTRUCTURE__INFRASTRUCTURE_CONNECTIONS = eINSTANCE.getEnterpriseInfrastructure_InfrastructureConnections();

    /**
     * The meta object literal for the '{@link domain.impl.DatacenterImpl <em>Datacenter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.DatacenterImpl
     * @see domain.impl.DomainPackageImpl#getDatacenter()
     * @generated
     */
    EClass DATACENTER = eINSTANCE.getDatacenter();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATACENTER__UID = eINSTANCE.getDatacenter_Uid();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATACENTER__PARENT = eINSTANCE.getDatacenter_Parent();

    /**
     * The meta object literal for the '<em><b>Subsystems</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATACENTER__SUBSYSTEMS = eINSTANCE.getDatacenter_Subsystems();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATACENTER__NAME = eINSTANCE.getDatacenter_Name();

    /**
     * The meta object literal for the '{@link domain.impl.SubsystemImpl <em>Subsystem</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.SubsystemImpl
     * @see domain.impl.DomainPackageImpl#getSubsystem()
     * @generated
     */
    EClass SUBSYSTEM = eINSTANCE.getSubsystem();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUBSYSTEM__UID = eINSTANCE.getSubsystem_Uid();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUBSYSTEM__NAME = eINSTANCE.getSubsystem_Name();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUBSYSTEM__PARENT = eINSTANCE.getSubsystem_Parent();

    /**
     * The meta object literal for the '<em><b>Infrastructure Layer</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUBSYSTEM__INFRASTRUCTURE_LAYER = eINSTANCE.getSubsystem_InfrastructureLayer();

    /**
     * The meta object literal for the '{@link domain.impl.InfrastructureLayerImpl <em>Infrastructure Layer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.InfrastructureLayerImpl
     * @see domain.impl.DomainPackageImpl#getInfrastructureLayer()
     * @generated
     */
    EClass INFRASTRUCTURE_LAYER = eINSTANCE.getInfrastructureLayer();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INFRASTRUCTURE_LAYER__UID = eINSTANCE.getInfrastructureLayer_Uid();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INFRASTRUCTURE_LAYER__NAME = eINSTANCE.getInfrastructureLayer_Name();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INFRASTRUCTURE_LAYER__PARENT = eINSTANCE.getInfrastructureLayer_Parent();

    /**
     * The meta object literal for the '<em><b>Infrastructure Component</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INFRASTRUCTURE_LAYER__INFRASTRUCTURE_COMPONENT = eINSTANCE.getInfrastructureLayer_InfrastructureComponent();

    /**
     * The meta object literal for the '{@link domain.impl.InfrastructureConnectionImpl <em>Infrastructure Connection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.InfrastructureConnectionImpl
     * @see domain.impl.DomainPackageImpl#getInfrastructureConnection()
     * @generated
     */
    EClass INFRASTRUCTURE_CONNECTION = eINSTANCE.getInfrastructureConnection();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INFRASTRUCTURE_CONNECTION__UID = eINSTANCE.getInfrastructureConnection_Uid();

    /**
     * The meta object literal for the '<em><b>Master</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INFRASTRUCTURE_CONNECTION__MASTER = eINSTANCE.getInfrastructureConnection_Master();

    /**
     * The meta object literal for the '<em><b>Detail</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INFRASTRUCTURE_CONNECTION__DETAIL = eINSTANCE.getInfrastructureConnection_Detail();

    /**
     * The meta object literal for the '{@link domain.impl.InfrastructureComponentImpl <em>Infrastructure Component</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.InfrastructureComponentImpl
     * @see domain.impl.DomainPackageImpl#getInfrastructureComponent()
     * @generated
     */
    EClass INFRASTRUCTURE_COMPONENT = eINSTANCE.getInfrastructureComponent();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INFRASTRUCTURE_COMPONENT__UID = eINSTANCE.getInfrastructureComponent_Uid();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INFRASTRUCTURE_COMPONENT__NAME = eINSTANCE.getInfrastructureComponent_Name();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INFRASTRUCTURE_COMPONENT__PARENT = eINSTANCE.getInfrastructureComponent_Parent();

    /**
     * The meta object literal for the '{@link domain.impl.ServerImpl <em>Server</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.ServerImpl
     * @see domain.impl.DomainPackageImpl#getServer()
     * @generated
     */
    EClass SERVER = eINSTANCE.getServer();

    /**
     * The meta object literal for the '{@link domain.impl.RouterImpl <em>Router</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.RouterImpl
     * @see domain.impl.DomainPackageImpl#getRouter()
     * @generated
     */
    EClass ROUTER = eINSTANCE.getRouter();

    /**
     * The meta object literal for the '{@link domain.impl.HubImpl <em>Hub</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.HubImpl
     * @see domain.impl.DomainPackageImpl#getHub()
     * @generated
     */
    EClass HUB = eINSTANCE.getHub();

    /**
     * The meta object literal for the '{@link domain.impl.StorageImpl <em>Storage</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.StorageImpl
     * @see domain.impl.DomainPackageImpl#getStorage()
     * @generated
     */
    EClass STORAGE = eINSTANCE.getStorage();

    /**
     * The meta object literal for the '{@link domain.impl.ServerClasterImpl <em>Server Claster</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.ServerClasterImpl
     * @see domain.impl.DomainPackageImpl#getServerClaster()
     * @generated
     */
    EClass SERVER_CLASTER = eINSTANCE.getServerClaster();

    /**
     * The meta object literal for the '<em><b>Servers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVER_CLASTER__SERVERS = eINSTANCE.getServerClaster_Servers();

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
