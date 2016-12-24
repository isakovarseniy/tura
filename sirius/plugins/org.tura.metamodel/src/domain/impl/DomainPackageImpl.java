/**
 */
package domain.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import application.ApplicationPackage;
import application.impl.ApplicationPackageImpl;
import artifact.ArtifactPackage;
import artifact.impl.ArtifactPackageImpl;
import common.CommonPackage;
import common.impl.CommonPackageImpl;
import domain.Domain;
import domain.DomainApplication;
import domain.DomainApplications;
import domain.DomainArtifact;
import domain.DomainArtifacts;
import domain.DomainFactory;
import domain.DomainPackage;
import domain.DomainRepositories;
import domain.DomainRepository;
import domain.DomainTypes;
import domain.DomainTypesRepository;
import form.FormPackage;
import form.impl.FormPackageImpl;
import infrastructure.InfrastructurePackage;
import infrastructure.impl.InfrastructurePackageImpl;
import mapper.MapperPackage;
import mapper.impl.MapperPackageImpl;
import message.MessagePackage;
import message.impl.MessagePackageImpl;
import permission.PermissionPackage;
import permission.impl.PermissionPackageImpl;
import recipe.RecipePackage;
import recipe.impl.RecipePackageImpl;
import repository.RepositoryPackage;
import repository.impl.RepositoryPackageImpl;
import style.StylePackage;
import style.impl.StylePackageImpl;
import type.TypePackage;
import type.impl.TypePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DomainPackageImpl extends EPackageImpl implements DomainPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainArtifactsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainArtifactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainTypesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainTypesRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainApplicationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainApplicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainRepositoriesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainRepositoryEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see domain.DomainPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DomainPackageImpl() {
		super(eNS_URI, DomainFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link DomainPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DomainPackage init() {
		if (isInited) return (DomainPackage)EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI);

		// Obtain or create and register package
		DomainPackageImpl theDomainPackage = (DomainPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DomainPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DomainPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ArtifactPackageImpl theArtifactPackage = (ArtifactPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ArtifactPackage.eNS_URI) instanceof ArtifactPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ArtifactPackage.eNS_URI) : ArtifactPackage.eINSTANCE);
		TypePackageImpl theTypePackage = (TypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) instanceof TypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) : TypePackage.eINSTANCE);
		ApplicationPackageImpl theApplicationPackage = (ApplicationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ApplicationPackage.eNS_URI) instanceof ApplicationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ApplicationPackage.eNS_URI) : ApplicationPackage.eINSTANCE);
		RepositoryPackageImpl theRepositoryPackage = (RepositoryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RepositoryPackage.eNS_URI) instanceof RepositoryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RepositoryPackage.eNS_URI) : RepositoryPackage.eINSTANCE);
		PermissionPackageImpl thePermissionPackage = (PermissionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PermissionPackage.eNS_URI) instanceof PermissionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PermissionPackage.eNS_URI) : PermissionPackage.eINSTANCE);
		InfrastructurePackageImpl theInfrastructurePackage = (InfrastructurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InfrastructurePackage.eNS_URI) instanceof InfrastructurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InfrastructurePackage.eNS_URI) : InfrastructurePackage.eINSTANCE);
		MessagePackageImpl theMessagePackage = (MessagePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MessagePackage.eNS_URI) instanceof MessagePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MessagePackage.eNS_URI) : MessagePackage.eINSTANCE);
		StylePackageImpl theStylePackage = (StylePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI) instanceof StylePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI) : StylePackage.eINSTANCE);
		FormPackageImpl theFormPackage = (FormPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FormPackage.eNS_URI) instanceof FormPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FormPackage.eNS_URI) : FormPackage.eINSTANCE);
		RecipePackageImpl theRecipePackage = (RecipePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RecipePackage.eNS_URI) instanceof RecipePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RecipePackage.eNS_URI) : RecipePackage.eINSTANCE);
		MapperPackageImpl theMapperPackage = (MapperPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MapperPackage.eNS_URI) instanceof MapperPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MapperPackage.eNS_URI) : MapperPackage.eINSTANCE);
		CommonPackageImpl theCommonPackage = (CommonPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) instanceof CommonPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) : CommonPackage.eINSTANCE);

		// Create package meta-data objects
		theDomainPackage.createPackageContents();
		theArtifactPackage.createPackageContents();
		theTypePackage.createPackageContents();
		theApplicationPackage.createPackageContents();
		theRepositoryPackage.createPackageContents();
		thePermissionPackage.createPackageContents();
		theInfrastructurePackage.createPackageContents();
		theMessagePackage.createPackageContents();
		theStylePackage.createPackageContents();
		theFormPackage.createPackageContents();
		theRecipePackage.createPackageContents();
		theMapperPackage.createPackageContents();
		theCommonPackage.createPackageContents();

		// Initialize created meta-data
		theDomainPackage.initializePackageContents();
		theArtifactPackage.initializePackageContents();
		theTypePackage.initializePackageContents();
		theApplicationPackage.initializePackageContents();
		theRepositoryPackage.initializePackageContents();
		thePermissionPackage.initializePackageContents();
		theInfrastructurePackage.initializePackageContents();
		theMessagePackage.initializePackageContents();
		theStylePackage.initializePackageContents();
		theFormPackage.initializePackageContents();
		theRecipePackage.initializePackageContents();
		theMapperPackage.initializePackageContents();
		theCommonPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDomainPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DomainPackage.eNS_URI, theDomainPackage);
		return theDomainPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomain() {
		return domainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomain_Uid() {
		return (EAttribute)domainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_DomainArtifacts() {
		return (EReference)domainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_DomainTypes() {
		return (EReference)domainEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_DomainRepositories() {
		return (EReference)domainEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_DomainApplications() {
		return (EReference)domainEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainArtifacts() {
		return domainArtifactsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainArtifacts_Uid() {
		return (EAttribute)domainArtifactsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainArtifacts_Name() {
		return (EAttribute)domainArtifactsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainArtifacts_DomainArtifact() {
		return (EReference)domainArtifactsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainArtifacts_TechLeafs() {
		return (EReference)domainArtifactsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainArtifact() {
		return domainArtifactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainArtifact_Uid() {
		return (EAttribute)domainArtifactEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainArtifact_Name() {
		return (EAttribute)domainArtifactEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainArtifact_ArtifactPackages() {
		return (EReference)domainArtifactEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainTypes() {
		return domainTypesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainTypes_Uid() {
		return (EAttribute)domainTypesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainTypes_Name() {
		return (EAttribute)domainTypesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainTypes_TypesRepository() {
		return (EReference)domainTypesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainTypes_Primitives() {
		return (EReference)domainTypesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainTypesRepository() {
		return domainTypesRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainTypesRepository_Uid() {
		return (EAttribute)domainTypesRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainTypesRepository_Name() {
		return (EAttribute)domainTypesRepositoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainTypesRepository_RepositoryPackages() {
		return (EReference)domainTypesRepositoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainApplications() {
		return domainApplicationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainApplications_Uid() {
		return (EAttribute)domainApplicationsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainApplications_Name() {
		return (EAttribute)domainApplicationsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainApplications_Applications() {
		return (EReference)domainApplicationsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainApplication() {
		return domainApplicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainApplication_Uid() {
		return (EAttribute)domainApplicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainApplication_Name() {
		return (EAttribute)domainApplicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainApplication_ApplicationPackages() {
		return (EReference)domainApplicationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainRepositories() {
		return domainRepositoriesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainRepositories_Uid() {
		return (EAttribute)domainRepositoriesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainRepositories_Name() {
		return (EAttribute)domainRepositoriesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainRepositories_DomainRepositories() {
		return (EReference)domainRepositoriesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainRepository() {
		return domainRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainRepository_Uid() {
		return (EAttribute)domainRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainRepository_Name() {
		return (EAttribute)domainRepositoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainRepository_Mappres() {
		return (EReference)domainRepositoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainFactory getDomainFactory() {
		return (DomainFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		domainEClass = createEClass(DOMAIN);
		createEAttribute(domainEClass, DOMAIN__UID);
		createEReference(domainEClass, DOMAIN__DOMAIN_ARTIFACTS);
		createEReference(domainEClass, DOMAIN__DOMAIN_TYPES);
		createEReference(domainEClass, DOMAIN__DOMAIN_REPOSITORIES);
		createEReference(domainEClass, DOMAIN__DOMAIN_APPLICATIONS);

		domainArtifactsEClass = createEClass(DOMAIN_ARTIFACTS);
		createEAttribute(domainArtifactsEClass, DOMAIN_ARTIFACTS__UID);
		createEAttribute(domainArtifactsEClass, DOMAIN_ARTIFACTS__NAME);
		createEReference(domainArtifactsEClass, DOMAIN_ARTIFACTS__DOMAIN_ARTIFACT);
		createEReference(domainArtifactsEClass, DOMAIN_ARTIFACTS__TECH_LEAFS);

		domainArtifactEClass = createEClass(DOMAIN_ARTIFACT);
		createEAttribute(domainArtifactEClass, DOMAIN_ARTIFACT__UID);
		createEAttribute(domainArtifactEClass, DOMAIN_ARTIFACT__NAME);
		createEReference(domainArtifactEClass, DOMAIN_ARTIFACT__ARTIFACT_PACKAGES);

		domainTypesEClass = createEClass(DOMAIN_TYPES);
		createEAttribute(domainTypesEClass, DOMAIN_TYPES__UID);
		createEAttribute(domainTypesEClass, DOMAIN_TYPES__NAME);
		createEReference(domainTypesEClass, DOMAIN_TYPES__TYPES_REPOSITORY);
		createEReference(domainTypesEClass, DOMAIN_TYPES__PRIMITIVES);

		domainTypesRepositoryEClass = createEClass(DOMAIN_TYPES_REPOSITORY);
		createEAttribute(domainTypesRepositoryEClass, DOMAIN_TYPES_REPOSITORY__UID);
		createEAttribute(domainTypesRepositoryEClass, DOMAIN_TYPES_REPOSITORY__NAME);
		createEReference(domainTypesRepositoryEClass, DOMAIN_TYPES_REPOSITORY__REPOSITORY_PACKAGES);

		domainApplicationsEClass = createEClass(DOMAIN_APPLICATIONS);
		createEAttribute(domainApplicationsEClass, DOMAIN_APPLICATIONS__UID);
		createEAttribute(domainApplicationsEClass, DOMAIN_APPLICATIONS__NAME);
		createEReference(domainApplicationsEClass, DOMAIN_APPLICATIONS__APPLICATIONS);

		domainApplicationEClass = createEClass(DOMAIN_APPLICATION);
		createEAttribute(domainApplicationEClass, DOMAIN_APPLICATION__UID);
		createEAttribute(domainApplicationEClass, DOMAIN_APPLICATION__NAME);
		createEReference(domainApplicationEClass, DOMAIN_APPLICATION__APPLICATION_PACKAGES);

		domainRepositoriesEClass = createEClass(DOMAIN_REPOSITORIES);
		createEAttribute(domainRepositoriesEClass, DOMAIN_REPOSITORIES__UID);
		createEAttribute(domainRepositoriesEClass, DOMAIN_REPOSITORIES__NAME);
		createEReference(domainRepositoriesEClass, DOMAIN_REPOSITORIES__DOMAIN_REPOSITORIES);

		domainRepositoryEClass = createEClass(DOMAIN_REPOSITORY);
		createEAttribute(domainRepositoryEClass, DOMAIN_REPOSITORY__UID);
		createEAttribute(domainRepositoryEClass, DOMAIN_REPOSITORY__NAME);
		createEReference(domainRepositoryEClass, DOMAIN_REPOSITORY__MAPPRES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ArtifactPackage theArtifactPackage = (ArtifactPackage)EPackage.Registry.INSTANCE.getEPackage(ArtifactPackage.eNS_URI);
		TypePackage theTypePackage = (TypePackage)EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI);
		ApplicationPackage theApplicationPackage = (ApplicationPackage)EPackage.Registry.INSTANCE.getEPackage(ApplicationPackage.eNS_URI);
		RepositoryPackage theRepositoryPackage = (RepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(RepositoryPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(domainEClass, Domain.class, "Domain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDomain_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_DomainArtifacts(), this.getDomainArtifacts(), null, "domainArtifacts", null, 1, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_DomainTypes(), this.getDomainTypes(), null, "domainTypes", null, 1, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_DomainRepositories(), this.getDomainRepositories(), null, "domainRepositories", null, 1, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_DomainApplications(), this.getDomainApplications(), null, "domainApplications", null, 1, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domainArtifactsEClass, DomainArtifacts.class, "DomainArtifacts", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDomainArtifacts_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, DomainArtifacts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomainArtifacts_Name(), ecorePackage.getEString(), "name", null, 0, 1, DomainArtifacts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainArtifacts_DomainArtifact(), this.getDomainArtifact(), null, "domainArtifact", null, 0, -1, DomainArtifacts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainArtifacts_TechLeafs(), theArtifactPackage.getTechLeaf(), null, "techLeafs", null, 0, -1, DomainArtifacts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domainArtifactEClass, DomainArtifact.class, "DomainArtifact", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDomainArtifact_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, DomainArtifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomainArtifact_Name(), ecorePackage.getEString(), "name", null, 0, 1, DomainArtifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainArtifact_ArtifactPackages(), theArtifactPackage.getArtifactGroup(), null, "artifactPackages", null, 0, -1, DomainArtifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domainTypesEClass, DomainTypes.class, "DomainTypes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDomainTypes_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, DomainTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomainTypes_Name(), ecorePackage.getEString(), "name", null, 0, 1, DomainTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainTypes_TypesRepository(), this.getDomainTypesRepository(), null, "typesRepository", null, 0, -1, DomainTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainTypes_Primitives(), theTypePackage.getPrimitivesGroup(), null, "primitives", null, 0, 1, DomainTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domainTypesRepositoryEClass, DomainTypesRepository.class, "DomainTypesRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDomainTypesRepository_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, DomainTypesRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomainTypesRepository_Name(), ecorePackage.getEString(), "name", null, 0, 1, DomainTypesRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainTypesRepository_RepositoryPackages(), theTypePackage.getTypeGroup(), null, "repositoryPackages", null, 0, -1, DomainTypesRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domainApplicationsEClass, DomainApplications.class, "DomainApplications", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDomainApplications_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, DomainApplications.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomainApplications_Name(), ecorePackage.getEString(), "name", null, 0, 1, DomainApplications.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainApplications_Applications(), this.getDomainApplication(), null, "applications", null, 0, -1, DomainApplications.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domainApplicationEClass, DomainApplication.class, "DomainApplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDomainApplication_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, DomainApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomainApplication_Name(), ecorePackage.getEString(), "name", null, 0, 1, DomainApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainApplication_ApplicationPackages(), theApplicationPackage.getApplicationGroup(), null, "applicationPackages", null, 0, -1, DomainApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domainRepositoriesEClass, DomainRepositories.class, "DomainRepositories", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDomainRepositories_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, DomainRepositories.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomainRepositories_Name(), ecorePackage.getEString(), "name", null, 0, 1, DomainRepositories.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainRepositories_DomainRepositories(), this.getDomainRepository(), null, "domainRepositories", null, 0, -1, DomainRepositories.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domainRepositoryEClass, DomainRepository.class, "DomainRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDomainRepository_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, DomainRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomainRepository_Name(), ecorePackage.getEString(), "name", null, 0, 1, DomainRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainRepository_Mappres(), theRepositoryPackage.getUnitMapper(), null, "mappres", null, 0, -1, DomainRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf.diagram
		createGmfAnnotations();
		// gmf.node
		createGmf_1Annotations();
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations() {
		String source = "gmf.diagram";	
		addAnnotation
		  (domainEClass, 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations() {
		String source = "gmf.node";	
		addAnnotation
		  (domainArtifactsEClass, 
		   source, 
		   new String[] {
			 "label", "name"
		   });
	}

} //DomainPackageImpl
