/**
 */
package domain.impl;

import domain.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DomainFactoryImpl extends EFactoryImpl implements DomainFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DomainFactory init() {
		try {
			DomainFactory theDomainFactory = (DomainFactory)EPackage.Registry.INSTANCE.getEFactory(DomainPackage.eNS_URI);
			if (theDomainFactory != null) {
				return theDomainFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DomainFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DomainPackage.DOMAIN: return createDomain();
			case DomainPackage.DOMAIN_ARTIFACTS: return createDomainArtifacts();
			case DomainPackage.DOMAIN_ARTIFACT: return createDomainArtifact();
			case DomainPackage.DOMAIN_TYPES: return createDomainTypes();
			case DomainPackage.DOMAIN_TYPES_REPOSITORY: return createDomainTypesRepository();
			case DomainPackage.DOMAIN_APPLICATIONS: return createDomainApplications();
			case DomainPackage.DOMAIN_APPLICATION: return createDomainApplication();
			case DomainPackage.DOMAIN_REPOSITORIES: return createDomainRepositories();
			case DomainPackage.DOMAIN_REPOSITORY: return createDomainRepository();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain createDomain() {
		DomainImpl domain = new DomainImpl();
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainArtifacts createDomainArtifacts() {
		DomainArtifactsImpl domainArtifacts = new DomainArtifactsImpl();
		return domainArtifacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainArtifact createDomainArtifact() {
		DomainArtifactImpl domainArtifact = new DomainArtifactImpl();
		return domainArtifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainTypes createDomainTypes() {
		DomainTypesImpl domainTypes = new DomainTypesImpl();
		return domainTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainTypesRepository createDomainTypesRepository() {
		DomainTypesRepositoryImpl domainTypesRepository = new DomainTypesRepositoryImpl();
		return domainTypesRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainApplications createDomainApplications() {
		DomainApplicationsImpl domainApplications = new DomainApplicationsImpl();
		return domainApplications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainApplication createDomainApplication() {
		DomainApplicationImpl domainApplication = new DomainApplicationImpl();
		return domainApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainRepositories createDomainRepositories() {
		DomainRepositoriesImpl domainRepositories = new DomainRepositoriesImpl();
		return domainRepositories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainRepository createDomainRepository() {
		DomainRepositoryImpl domainRepository = new DomainRepositoryImpl();
		return domainRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainPackage getDomainPackage() {
		return (DomainPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DomainPackage getPackage() {
		return DomainPackage.eINSTANCE;
	}

} //DomainFactoryImpl
