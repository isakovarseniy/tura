/**
 */
package tura.domain;

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
 * @see tura.domain.DomainFactory
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
	DomainPackage eINSTANCE = tura.domain.impl.DomainPackageImpl.init();

	/**
	 * The meta object id for the '{@link tura.domain.impl.DomainImpl <em>Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tura.domain.impl.DomainImpl
	 * @see tura.domain.impl.DomainPackageImpl#getDomain()
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
	 * The number of operations of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tura.domain.impl.DomainArtifactsImpl <em>Artifacts</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tura.domain.impl.DomainArtifactsImpl
	 * @see tura.domain.impl.DomainPackageImpl#getDomainArtifacts()
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
	 * The number of structural features of the '<em>Artifacts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ARTIFACTS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Artifacts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ARTIFACTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tura.domain.impl.DomainArtifactImpl <em>Artifact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tura.domain.impl.DomainArtifactImpl
	 * @see tura.domain.impl.DomainPackageImpl#getDomainArtifact()
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
	 * The feature id for the '<em><b>Artifact</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ARTIFACT__ARTIFACT = 2;

	/**
	 * The number of structural features of the '<em>Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ARTIFACT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ARTIFACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tura.domain.impl.DomainTypesImpl <em>Types</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tura.domain.impl.DomainTypesImpl
	 * @see tura.domain.impl.DomainPackageImpl#getDomainTypes()
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
	 * The number of structural features of the '<em>Types</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TYPES_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Types</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TYPES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tura.domain.impl.DomainTypesRepositoryImpl <em>Types Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tura.domain.impl.DomainTypesRepositoryImpl
	 * @see tura.domain.impl.DomainPackageImpl#getDomainTypesRepository()
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
	 * The feature id for the '<em><b>Repository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TYPES_REPOSITORY__REPOSITORY = 2;

	/**
	 * The number of structural features of the '<em>Types Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TYPES_REPOSITORY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Types Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TYPES_REPOSITORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tura.domain.impl.DomainApplicationsImpl <em>Applications</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tura.domain.impl.DomainApplicationsImpl
	 * @see tura.domain.impl.DomainPackageImpl#getDomainApplications()
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
	 * The number of operations of the '<em>Applications</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_APPLICATIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tura.domain.impl.DomainApplicationImpl <em>Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tura.domain.impl.DomainApplicationImpl
	 * @see tura.domain.impl.DomainPackageImpl#getDomainApplication()
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
	 * The feature id for the '<em><b>Application</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_APPLICATION__APPLICATION = 2;

	/**
	 * The number of structural features of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_APPLICATION_FEATURE_COUNT = 3;


	/**
	 * The number of operations of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_APPLICATION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link tura.domain.Domain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain</em>'.
	 * @see tura.domain.Domain
	 * @generated
	 */
	EClass getDomain();

	/**
	 * Returns the meta object for the attribute '{@link tura.domain.Domain#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see tura.domain.Domain#getUid()
	 * @see #getDomain()
	 * @generated
	 */
	EAttribute getDomain_Uid();

	/**
	 * Returns the meta object for the containment reference '{@link tura.domain.Domain#getDomainArtifacts <em>Domain Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Domain Artifacts</em>'.
	 * @see tura.domain.Domain#getDomainArtifacts()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_DomainArtifacts();

	/**
	 * Returns the meta object for the containment reference '{@link tura.domain.Domain#getDomainTypes <em>Domain Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Domain Types</em>'.
	 * @see tura.domain.Domain#getDomainTypes()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_DomainTypes();

	/**
	 * Returns the meta object for the containment reference '{@link tura.domain.Domain#getDomainApplications <em>Domain Applications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Domain Applications</em>'.
	 * @see tura.domain.Domain#getDomainApplications()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_DomainApplications();

	/**
	 * Returns the meta object for class '{@link tura.domain.DomainArtifacts <em>Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artifacts</em>'.
	 * @see tura.domain.DomainArtifacts
	 * @generated
	 */
	EClass getDomainArtifacts();

	/**
	 * Returns the meta object for the attribute '{@link tura.domain.DomainArtifacts#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see tura.domain.DomainArtifacts#getUid()
	 * @see #getDomainArtifacts()
	 * @generated
	 */
	EAttribute getDomainArtifacts_Uid();

	/**
	 * Returns the meta object for the attribute '{@link tura.domain.DomainArtifacts#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tura.domain.DomainArtifacts#getName()
	 * @see #getDomainArtifacts()
	 * @generated
	 */
	EAttribute getDomainArtifacts_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link tura.domain.DomainArtifacts#getDomainArtifact <em>Domain Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Domain Artifact</em>'.
	 * @see tura.domain.DomainArtifacts#getDomainArtifact()
	 * @see #getDomainArtifacts()
	 * @generated
	 */
	EReference getDomainArtifacts_DomainArtifact();

	/**
	 * Returns the meta object for class '{@link tura.domain.DomainArtifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artifact</em>'.
	 * @see tura.domain.DomainArtifact
	 * @generated
	 */
	EClass getDomainArtifact();

	/**
	 * Returns the meta object for the attribute '{@link tura.domain.DomainArtifact#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see tura.domain.DomainArtifact#getUid()
	 * @see #getDomainArtifact()
	 * @generated
	 */
	EAttribute getDomainArtifact_Uid();

	/**
	 * Returns the meta object for the attribute '{@link tura.domain.DomainArtifact#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tura.domain.DomainArtifact#getName()
	 * @see #getDomainArtifact()
	 * @generated
	 */
	EAttribute getDomainArtifact_Name();

	/**
	 * Returns the meta object for the containment reference '{@link tura.domain.DomainArtifact#getArtifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Artifact</em>'.
	 * @see tura.domain.DomainArtifact#getArtifact()
	 * @see #getDomainArtifact()
	 * @generated
	 */
	EReference getDomainArtifact_Artifact();

	/**
	 * Returns the meta object for class '{@link tura.domain.DomainTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Types</em>'.
	 * @see tura.domain.DomainTypes
	 * @generated
	 */
	EClass getDomainTypes();

	/**
	 * Returns the meta object for the attribute '{@link tura.domain.DomainTypes#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see tura.domain.DomainTypes#getUid()
	 * @see #getDomainTypes()
	 * @generated
	 */
	EAttribute getDomainTypes_Uid();

	/**
	 * Returns the meta object for the attribute '{@link tura.domain.DomainTypes#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tura.domain.DomainTypes#getName()
	 * @see #getDomainTypes()
	 * @generated
	 */
	EAttribute getDomainTypes_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link tura.domain.DomainTypes#getTypesRepository <em>Types Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types Repository</em>'.
	 * @see tura.domain.DomainTypes#getTypesRepository()
	 * @see #getDomainTypes()
	 * @generated
	 */
	EReference getDomainTypes_TypesRepository();

	/**
	 * Returns the meta object for class '{@link tura.domain.DomainTypesRepository <em>Types Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Types Repository</em>'.
	 * @see tura.domain.DomainTypesRepository
	 * @generated
	 */
	EClass getDomainTypesRepository();

	/**
	 * Returns the meta object for the attribute '{@link tura.domain.DomainTypesRepository#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see tura.domain.DomainTypesRepository#getUid()
	 * @see #getDomainTypesRepository()
	 * @generated
	 */
	EAttribute getDomainTypesRepository_Uid();

	/**
	 * Returns the meta object for the attribute '{@link tura.domain.DomainTypesRepository#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tura.domain.DomainTypesRepository#getName()
	 * @see #getDomainTypesRepository()
	 * @generated
	 */
	EAttribute getDomainTypesRepository_Name();

	/**
	 * Returns the meta object for the containment reference '{@link tura.domain.DomainTypesRepository#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Repository</em>'.
	 * @see tura.domain.DomainTypesRepository#getRepository()
	 * @see #getDomainTypesRepository()
	 * @generated
	 */
	EReference getDomainTypesRepository_Repository();

	/**
	 * Returns the meta object for class '{@link tura.domain.DomainApplications <em>Applications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Applications</em>'.
	 * @see tura.domain.DomainApplications
	 * @generated
	 */
	EClass getDomainApplications();

	/**
	 * Returns the meta object for the attribute '{@link tura.domain.DomainApplications#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see tura.domain.DomainApplications#getUid()
	 * @see #getDomainApplications()
	 * @generated
	 */
	EAttribute getDomainApplications_Uid();

	/**
	 * Returns the meta object for the attribute '{@link tura.domain.DomainApplications#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tura.domain.DomainApplications#getName()
	 * @see #getDomainApplications()
	 * @generated
	 */
	EAttribute getDomainApplications_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link tura.domain.DomainApplications#getApplications <em>Applications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Applications</em>'.
	 * @see tura.domain.DomainApplications#getApplications()
	 * @see #getDomainApplications()
	 * @generated
	 */
	EReference getDomainApplications_Applications();

	/**
	 * Returns the meta object for class '{@link tura.domain.DomainApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application</em>'.
	 * @see tura.domain.DomainApplication
	 * @generated
	 */
	EClass getDomainApplication();

	/**
	 * Returns the meta object for the attribute '{@link tura.domain.DomainApplication#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see tura.domain.DomainApplication#getUid()
	 * @see #getDomainApplication()
	 * @generated
	 */
	EAttribute getDomainApplication_Uid();

	/**
	 * Returns the meta object for the attribute '{@link tura.domain.DomainApplication#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tura.domain.DomainApplication#getName()
	 * @see #getDomainApplication()
	 * @generated
	 */
	EAttribute getDomainApplication_Name();

	/**
	 * Returns the meta object for the containment reference '{@link tura.domain.DomainApplication#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Application</em>'.
	 * @see tura.domain.DomainApplication#getApplication()
	 * @see #getDomainApplication()
	 * @generated
	 */
	EReference getDomainApplication_Application();

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
		 * The meta object literal for the '{@link tura.domain.impl.DomainImpl <em>Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tura.domain.impl.DomainImpl
		 * @see tura.domain.impl.DomainPackageImpl#getDomain()
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
		 * The meta object literal for the '{@link tura.domain.impl.DomainArtifactsImpl <em>Artifacts</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tura.domain.impl.DomainArtifactsImpl
		 * @see tura.domain.impl.DomainPackageImpl#getDomainArtifacts()
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
		 * The meta object literal for the '{@link tura.domain.impl.DomainArtifactImpl <em>Artifact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tura.domain.impl.DomainArtifactImpl
		 * @see tura.domain.impl.DomainPackageImpl#getDomainArtifact()
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
		 * The meta object literal for the '<em><b>Artifact</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_ARTIFACT__ARTIFACT = eINSTANCE.getDomainArtifact_Artifact();

		/**
		 * The meta object literal for the '{@link tura.domain.impl.DomainTypesImpl <em>Types</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tura.domain.impl.DomainTypesImpl
		 * @see tura.domain.impl.DomainPackageImpl#getDomainTypes()
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
		 * The meta object literal for the '{@link tura.domain.impl.DomainTypesRepositoryImpl <em>Types Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tura.domain.impl.DomainTypesRepositoryImpl
		 * @see tura.domain.impl.DomainPackageImpl#getDomainTypesRepository()
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
		 * The meta object literal for the '<em><b>Repository</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_TYPES_REPOSITORY__REPOSITORY = eINSTANCE.getDomainTypesRepository_Repository();

		/**
		 * The meta object literal for the '{@link tura.domain.impl.DomainApplicationsImpl <em>Applications</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tura.domain.impl.DomainApplicationsImpl
		 * @see tura.domain.impl.DomainPackageImpl#getDomainApplications()
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
		 * The meta object literal for the '{@link tura.domain.impl.DomainApplicationImpl <em>Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tura.domain.impl.DomainApplicationImpl
		 * @see tura.domain.impl.DomainPackageImpl#getDomainApplication()
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
		 * The meta object literal for the '<em><b>Application</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_APPLICATION__APPLICATION = eINSTANCE.getDomainApplication_Application();

	}

} //DomainPackage
