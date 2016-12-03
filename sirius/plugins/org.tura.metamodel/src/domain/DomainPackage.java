/**
 */
package domain;

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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see domain.DomainFactory
 * @model kind="package"
 * @generated
 */
public interface DomainPackage extends EPackage {
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
	String eNS_URI = "http://tura.org/2016/v2/domain";

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
	 * The feature id for the '<em><b>Domain Repositories</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__DOMAIN_REPOSITORIES = 3;

	/**
	 * The feature id for the '<em><b>Domain Applications</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__DOMAIN_APPLICATIONS = 4;

	/**
	 * The number of structural features of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FEATURE_COUNT = 5;

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
	 * The feature id for the '<em><b>Domain Artifact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ARTIFACTS__DOMAIN_ARTIFACT = 2;

	/**
	 * The feature id for the '<em><b>Tech Leafs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ARTIFACTS__TECH_LEAFS = 3;

	/**
	 * The number of structural features of the '<em>Artifacts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ARTIFACTS_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link domain.impl.DomainArtifactImpl <em>Artifact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.impl.DomainArtifactImpl
	 * @see domain.impl.DomainPackageImpl#getDomainArtifact()
	 * @generated
	 */
	int DOMAIN_ARTIFACT = 2;

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
	 * The feature id for the '<em><b>Artifact Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ARTIFACT__ARTIFACT_PACKAGES = 2;

	/**
	 * The number of structural features of the '<em>Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ARTIFACT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link domain.impl.DomainTypesImpl <em>Types</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.impl.DomainTypesImpl
	 * @see domain.impl.DomainPackageImpl#getDomainTypes()
	 * @generated
	 */
	int DOMAIN_TYPES = 3;

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
	 * The feature id for the '<em><b>Types Repository</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TYPES__TYPES_REPOSITORY = 2;

	/**
	 * The feature id for the '<em><b>Primitives</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TYPES__PRIMITIVES = 3;

	/**
	 * The number of structural features of the '<em>Types</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TYPES_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link domain.impl.DomainTypesRepositoryImpl <em>Types Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.impl.DomainTypesRepositoryImpl
	 * @see domain.impl.DomainPackageImpl#getDomainTypesRepository()
	 * @generated
	 */
	int DOMAIN_TYPES_REPOSITORY = 4;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TYPES_REPOSITORY__UID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TYPES_REPOSITORY__NAME = 1;

	/**
	 * The feature id for the '<em><b>Repository Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TYPES_REPOSITORY__REPOSITORY_PACKAGES = 2;

	/**
	 * The number of structural features of the '<em>Types Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TYPES_REPOSITORY_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link domain.impl.DomainApplicationsImpl <em>Applications</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.impl.DomainApplicationsImpl
	 * @see domain.impl.DomainPackageImpl#getDomainApplications()
	 * @generated
	 */
	int DOMAIN_APPLICATIONS = 5;

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
	 * The number of structural features of the '<em>Applications</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_APPLICATIONS_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link domain.impl.DomainApplicationImpl <em>Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.impl.DomainApplicationImpl
	 * @see domain.impl.DomainPackageImpl#getDomainApplication()
	 * @generated
	 */
	int DOMAIN_APPLICATION = 6;

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
	 * The feature id for the '<em><b>Application Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_APPLICATION__APPLICATION_PACKAGES = 2;

	/**
	 * The number of structural features of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_APPLICATION_FEATURE_COUNT = 3;


	/**
	 * The meta object id for the '{@link domain.impl.DomainRepositoriesImpl <em>Repositories</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.impl.DomainRepositoriesImpl
	 * @see domain.impl.DomainPackageImpl#getDomainRepositories()
	 * @generated
	 */
	int DOMAIN_REPOSITORIES = 7;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_REPOSITORIES__UID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_REPOSITORIES__NAME = 1;

	/**
	 * The feature id for the '<em><b>Domain Repositories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_REPOSITORIES__DOMAIN_REPOSITORIES = 2;

	/**
	 * The number of structural features of the '<em>Repositories</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_REPOSITORIES_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link domain.impl.DomainRepositoryImpl <em>Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.impl.DomainRepositoryImpl
	 * @see domain.impl.DomainPackageImpl#getDomainRepository()
	 * @generated
	 */
	int DOMAIN_REPOSITORY = 8;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_REPOSITORY__UID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_REPOSITORY__NAME = 1;

	/**
	 * The feature id for the '<em><b>Mappres</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_REPOSITORY__MAPPRES = 2;

	/**
	 * The number of structural features of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_REPOSITORY_FEATURE_COUNT = 3;

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
	 * Returns the meta object for the containment reference '{@link domain.Domain#getDomainRepositories <em>Domain Repositories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Domain Repositories</em>'.
	 * @see domain.Domain#getDomainRepositories()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_DomainRepositories();

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
	 * Returns the meta object for the containment reference list '{@link domain.DomainArtifacts#getTechLeafs <em>Tech Leafs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tech Leafs</em>'.
	 * @see domain.DomainArtifacts#getTechLeafs()
	 * @see #getDomainArtifacts()
	 * @generated
	 */
	EReference getDomainArtifacts_TechLeafs();

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
	 * Returns the meta object for the containment reference list '{@link domain.DomainArtifact#getArtifactPackages <em>Artifact Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Artifact Packages</em>'.
	 * @see domain.DomainArtifact#getArtifactPackages()
	 * @see #getDomainArtifact()
	 * @generated
	 */
	EReference getDomainArtifact_ArtifactPackages();

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
	 * Returns the meta object for the containment reference list '{@link domain.DomainTypes#getTypesRepository <em>Types Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types Repository</em>'.
	 * @see domain.DomainTypes#getTypesRepository()
	 * @see #getDomainTypes()
	 * @generated
	 */
	EReference getDomainTypes_TypesRepository();

	/**
	 * Returns the meta object for the containment reference '{@link domain.DomainTypes#getPrimitives <em>Primitives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Primitives</em>'.
	 * @see domain.DomainTypes#getPrimitives()
	 * @see #getDomainTypes()
	 * @generated
	 */
	EReference getDomainTypes_Primitives();

	/**
	 * Returns the meta object for class '{@link domain.DomainTypesRepository <em>Types Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Types Repository</em>'.
	 * @see domain.DomainTypesRepository
	 * @generated
	 */
	EClass getDomainTypesRepository();

	/**
	 * Returns the meta object for the attribute '{@link domain.DomainTypesRepository#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see domain.DomainTypesRepository#getUid()
	 * @see #getDomainTypesRepository()
	 * @generated
	 */
	EAttribute getDomainTypesRepository_Uid();

	/**
	 * Returns the meta object for the attribute '{@link domain.DomainTypesRepository#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see domain.DomainTypesRepository#getName()
	 * @see #getDomainTypesRepository()
	 * @generated
	 */
	EAttribute getDomainTypesRepository_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link domain.DomainTypesRepository#getRepositoryPackages <em>Repository Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Repository Packages</em>'.
	 * @see domain.DomainTypesRepository#getRepositoryPackages()
	 * @see #getDomainTypesRepository()
	 * @generated
	 */
	EReference getDomainTypesRepository_RepositoryPackages();

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
	 * Returns the meta object for the containment reference list '{@link domain.DomainApplication#getApplicationPackages <em>Application Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Application Packages</em>'.
	 * @see domain.DomainApplication#getApplicationPackages()
	 * @see #getDomainApplication()
	 * @generated
	 */
	EReference getDomainApplication_ApplicationPackages();

	/**
	 * Returns the meta object for class '{@link domain.DomainRepositories <em>Repositories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repositories</em>'.
	 * @see domain.DomainRepositories
	 * @generated
	 */
	EClass getDomainRepositories();

	/**
	 * Returns the meta object for the attribute '{@link domain.DomainRepositories#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see domain.DomainRepositories#getUid()
	 * @see #getDomainRepositories()
	 * @generated
	 */
	EAttribute getDomainRepositories_Uid();

	/**
	 * Returns the meta object for the attribute '{@link domain.DomainRepositories#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see domain.DomainRepositories#getName()
	 * @see #getDomainRepositories()
	 * @generated
	 */
	EAttribute getDomainRepositories_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link domain.DomainRepositories#getDomainRepositories <em>Domain Repositories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Domain Repositories</em>'.
	 * @see domain.DomainRepositories#getDomainRepositories()
	 * @see #getDomainRepositories()
	 * @generated
	 */
	EReference getDomainRepositories_DomainRepositories();

	/**
	 * Returns the meta object for class '{@link domain.DomainRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repository</em>'.
	 * @see domain.DomainRepository
	 * @generated
	 */
	EClass getDomainRepository();

	/**
	 * Returns the meta object for the attribute '{@link domain.DomainRepository#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see domain.DomainRepository#getUid()
	 * @see #getDomainRepository()
	 * @generated
	 */
	EAttribute getDomainRepository_Uid();

	/**
	 * Returns the meta object for the attribute '{@link domain.DomainRepository#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see domain.DomainRepository#getName()
	 * @see #getDomainRepository()
	 * @generated
	 */
	EAttribute getDomainRepository_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link domain.DomainRepository#getMappres <em>Mappres</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mappres</em>'.
	 * @see domain.DomainRepository#getMappres()
	 * @see #getDomainRepository()
	 * @generated
	 */
	EReference getDomainRepository_Mappres();

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
	interface Literals {
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
		 * The meta object literal for the '<em><b>Domain Repositories</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__DOMAIN_REPOSITORIES = eINSTANCE.getDomain_DomainRepositories();

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
		 * The meta object literal for the '<em><b>Domain Artifact</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_ARTIFACTS__DOMAIN_ARTIFACT = eINSTANCE.getDomainArtifacts_DomainArtifact();

		/**
		 * The meta object literal for the '<em><b>Tech Leafs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_ARTIFACTS__TECH_LEAFS = eINSTANCE.getDomainArtifacts_TechLeafs();

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
		 * The meta object literal for the '<em><b>Artifact Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_ARTIFACT__ARTIFACT_PACKAGES = eINSTANCE.getDomainArtifact_ArtifactPackages();

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
		 * The meta object literal for the '<em><b>Types Repository</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_TYPES__TYPES_REPOSITORY = eINSTANCE.getDomainTypes_TypesRepository();

		/**
		 * The meta object literal for the '<em><b>Primitives</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_TYPES__PRIMITIVES = eINSTANCE.getDomainTypes_Primitives();

		/**
		 * The meta object literal for the '{@link domain.impl.DomainTypesRepositoryImpl <em>Types Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.impl.DomainTypesRepositoryImpl
		 * @see domain.impl.DomainPackageImpl#getDomainTypesRepository()
		 * @generated
		 */
		EClass DOMAIN_TYPES_REPOSITORY = eINSTANCE.getDomainTypesRepository();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_TYPES_REPOSITORY__UID = eINSTANCE.getDomainTypesRepository_Uid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_TYPES_REPOSITORY__NAME = eINSTANCE.getDomainTypesRepository_Name();

		/**
		 * The meta object literal for the '<em><b>Repository Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_TYPES_REPOSITORY__REPOSITORY_PACKAGES = eINSTANCE.getDomainTypesRepository_RepositoryPackages();

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
		 * The meta object literal for the '<em><b>Application Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_APPLICATION__APPLICATION_PACKAGES = eINSTANCE.getDomainApplication_ApplicationPackages();

		/**
		 * The meta object literal for the '{@link domain.impl.DomainRepositoriesImpl <em>Repositories</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.impl.DomainRepositoriesImpl
		 * @see domain.impl.DomainPackageImpl#getDomainRepositories()
		 * @generated
		 */
		EClass DOMAIN_REPOSITORIES = eINSTANCE.getDomainRepositories();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_REPOSITORIES__UID = eINSTANCE.getDomainRepositories_Uid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_REPOSITORIES__NAME = eINSTANCE.getDomainRepositories_Name();

		/**
		 * The meta object literal for the '<em><b>Domain Repositories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_REPOSITORIES__DOMAIN_REPOSITORIES = eINSTANCE.getDomainRepositories_DomainRepositories();

		/**
		 * The meta object literal for the '{@link domain.impl.DomainRepositoryImpl <em>Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.impl.DomainRepositoryImpl
		 * @see domain.impl.DomainPackageImpl#getDomainRepository()
		 * @generated
		 */
		EClass DOMAIN_REPOSITORY = eINSTANCE.getDomainRepository();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_REPOSITORY__UID = eINSTANCE.getDomainRepository_Uid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_REPOSITORY__NAME = eINSTANCE.getDomainRepository_Name();

		/**
		 * The meta object literal for the '<em><b>Mappres</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_REPOSITORY__MAPPRES = eINSTANCE.getDomainRepository_Mappres();

	}

} //DomainPackage
