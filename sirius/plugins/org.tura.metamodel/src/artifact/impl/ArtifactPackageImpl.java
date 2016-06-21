/**
 */
package artifact.impl;

import application.ApplicationPackage;

import application.impl.ApplicationPackageImpl;

import artifact.Artifact;
import artifact.ArtifactFactory;
import artifact.ArtifactGroup;
import artifact.ArtifactPackage;
import artifact.ConfigHash;
import artifact.ConfigVariable;
import artifact.GenerationHint;
import artifact.ModelQuery;
import artifact.Option;
import artifact.QueryParameter;
import artifact.Technology;

import common.CommonPackage;

import common.impl.CommonPackageImpl;

import domain.DomainPackage;

import domain.impl.DomainPackageImpl;

import form.FormPackage;

import form.impl.FormPackageImpl;

import infrastructure.InfrastructurePackage;

import infrastructure.impl.InfrastructurePackageImpl;

import mapper.MapperPackage;

import mapper.impl.MapperPackageImpl;

import message.MessagePackage;

import message.impl.MessagePackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import permission.PermissionPackage;

import permission.impl.PermissionPackageImpl;

import recipe.RecipePackage;

import recipe.impl.RecipePackageImpl;

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
public class ArtifactPackageImpl extends EPackageImpl implements ArtifactPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass artifactGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass artifactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generationHintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configHashEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelQueryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass technologyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optionEClass = null;

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
	 * @see artifact.ArtifactPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ArtifactPackageImpl() {
		super(eNS_URI, ArtifactFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ArtifactPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ArtifactPackage init() {
		if (isInited) return (ArtifactPackage)EPackage.Registry.INSTANCE.getEPackage(ArtifactPackage.eNS_URI);

		// Obtain or create and register package
		ArtifactPackageImpl theArtifactPackage = (ArtifactPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ArtifactPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ArtifactPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		DomainPackageImpl theDomainPackage = (DomainPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) instanceof DomainPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) : DomainPackage.eINSTANCE);
		TypePackageImpl theTypePackage = (TypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) instanceof TypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) : TypePackage.eINSTANCE);
		ApplicationPackageImpl theApplicationPackage = (ApplicationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ApplicationPackage.eNS_URI) instanceof ApplicationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ApplicationPackage.eNS_URI) : ApplicationPackage.eINSTANCE);
		CommonPackageImpl theCommonPackage = (CommonPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) instanceof CommonPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) : CommonPackage.eINSTANCE);
		PermissionPackageImpl thePermissionPackage = (PermissionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PermissionPackage.eNS_URI) instanceof PermissionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PermissionPackage.eNS_URI) : PermissionPackage.eINSTANCE);
		InfrastructurePackageImpl theInfrastructurePackage = (InfrastructurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InfrastructurePackage.eNS_URI) instanceof InfrastructurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InfrastructurePackage.eNS_URI) : InfrastructurePackage.eINSTANCE);
		MessagePackageImpl theMessagePackage = (MessagePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MessagePackage.eNS_URI) instanceof MessagePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MessagePackage.eNS_URI) : MessagePackage.eINSTANCE);
		StylePackageImpl theStylePackage = (StylePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI) instanceof StylePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI) : StylePackage.eINSTANCE);
		FormPackageImpl theFormPackage = (FormPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FormPackage.eNS_URI) instanceof FormPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FormPackage.eNS_URI) : FormPackage.eINSTANCE);
		RecipePackageImpl theRecipePackage = (RecipePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RecipePackage.eNS_URI) instanceof RecipePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RecipePackage.eNS_URI) : RecipePackage.eINSTANCE);
		MapperPackageImpl theMapperPackage = (MapperPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MapperPackage.eNS_URI) instanceof MapperPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MapperPackage.eNS_URI) : MapperPackage.eINSTANCE);

		// Create package meta-data objects
		theArtifactPackage.createPackageContents();
		theDomainPackage.createPackageContents();
		theTypePackage.createPackageContents();
		theApplicationPackage.createPackageContents();
		theCommonPackage.createPackageContents();
		thePermissionPackage.createPackageContents();
		theInfrastructurePackage.createPackageContents();
		theMessagePackage.createPackageContents();
		theStylePackage.createPackageContents();
		theFormPackage.createPackageContents();
		theRecipePackage.createPackageContents();
		theMapperPackage.createPackageContents();

		// Initialize created meta-data
		theArtifactPackage.initializePackageContents();
		theDomainPackage.initializePackageContents();
		theTypePackage.initializePackageContents();
		theApplicationPackage.initializePackageContents();
		theCommonPackage.initializePackageContents();
		thePermissionPackage.initializePackageContents();
		theInfrastructurePackage.initializePackageContents();
		theMessagePackage.initializePackageContents();
		theStylePackage.initializePackageContents();
		theFormPackage.initializePackageContents();
		theRecipePackage.initializePackageContents();
		theMapperPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theArtifactPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ArtifactPackage.eNS_URI, theArtifactPackage);
		return theArtifactPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArtifactGroup() {
		return artifactGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArtifactGroup_Uid() {
		return (EAttribute)artifactGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArtifactGroup_Name() {
		return (EAttribute)artifactGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArtifactGroup_Artifacts() {
		return (EReference)artifactGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArtifact() {
		return artifactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArtifact_Uid() {
		return (EAttribute)artifactEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArtifact_Name() {
		return (EAttribute)artifactEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArtifact_Description() {
		return (EAttribute)artifactEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArtifact_ConfigVariables() {
		return (EReference)artifactEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArtifact_ConfigHashes() {
		return (EReference)artifactEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArtifact_ModelQuery() {
		return (EReference)artifactEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArtifact_Technologies() {
		return (EReference)artifactEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArtifact_Hints() {
		return (EReference)artifactEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArtifact_Template() {
		return (EAttribute)artifactEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenerationHint() {
		return generationHintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenerationHint_Uid() {
		return (EAttribute)generationHintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenerationHint_Name() {
		return (EAttribute)generationHintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenerationHint_ApplyedClass() {
		return (EAttribute)generationHintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigVariable() {
		return configVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigVariable_Uid() {
		return (EAttribute)configVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigVariable_Name() {
		return (EAttribute)configVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigHash() {
		return configHashEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigHash_Uid() {
		return (EAttribute)configHashEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigHash_Name() {
		return (EAttribute)configHashEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigHash_Parent() {
		return (EReference)configHashEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelQuery() {
		return modelQueryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelQuery_Uid() {
		return (EAttribute)modelQueryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelQuery_Name() {
		return (EAttribute)modelQueryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelQuery_Query() {
		return (EAttribute)modelQueryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelQuery_Parameters() {
		return (EReference)modelQueryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryParameter() {
		return queryParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryParameter_Uid() {
		return (EAttribute)queryParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryParameter_Name() {
		return (EAttribute)queryParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTechnology() {
		return technologyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTechnology_Uid() {
		return (EAttribute)technologyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTechnology_Name() {
		return (EAttribute)technologyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTechnology_Options() {
		return (EReference)technologyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOption() {
		return optionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOption_Uid() {
		return (EAttribute)optionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOption_Value() {
		return (EAttribute)optionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactFactory getArtifactFactory() {
		return (ArtifactFactory)getEFactoryInstance();
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
		artifactGroupEClass = createEClass(ARTIFACT_GROUP);
		createEAttribute(artifactGroupEClass, ARTIFACT_GROUP__UID);
		createEAttribute(artifactGroupEClass, ARTIFACT_GROUP__NAME);
		createEReference(artifactGroupEClass, ARTIFACT_GROUP__ARTIFACTS);

		artifactEClass = createEClass(ARTIFACT);
		createEAttribute(artifactEClass, ARTIFACT__UID);
		createEAttribute(artifactEClass, ARTIFACT__NAME);
		createEAttribute(artifactEClass, ARTIFACT__DESCRIPTION);
		createEReference(artifactEClass, ARTIFACT__CONFIG_VARIABLES);
		createEReference(artifactEClass, ARTIFACT__CONFIG_HASHES);
		createEReference(artifactEClass, ARTIFACT__MODEL_QUERY);
		createEReference(artifactEClass, ARTIFACT__TECHNOLOGIES);
		createEReference(artifactEClass, ARTIFACT__HINTS);
		createEAttribute(artifactEClass, ARTIFACT__TEMPLATE);

		generationHintEClass = createEClass(GENERATION_HINT);
		createEAttribute(generationHintEClass, GENERATION_HINT__UID);
		createEAttribute(generationHintEClass, GENERATION_HINT__NAME);
		createEAttribute(generationHintEClass, GENERATION_HINT__APPLYED_CLASS);

		configVariableEClass = createEClass(CONFIG_VARIABLE);
		createEAttribute(configVariableEClass, CONFIG_VARIABLE__UID);
		createEAttribute(configVariableEClass, CONFIG_VARIABLE__NAME);

		configHashEClass = createEClass(CONFIG_HASH);
		createEAttribute(configHashEClass, CONFIG_HASH__UID);
		createEAttribute(configHashEClass, CONFIG_HASH__NAME);
		createEReference(configHashEClass, CONFIG_HASH__PARENT);

		modelQueryEClass = createEClass(MODEL_QUERY);
		createEAttribute(modelQueryEClass, MODEL_QUERY__UID);
		createEAttribute(modelQueryEClass, MODEL_QUERY__NAME);
		createEAttribute(modelQueryEClass, MODEL_QUERY__QUERY);
		createEReference(modelQueryEClass, MODEL_QUERY__PARAMETERS);

		queryParameterEClass = createEClass(QUERY_PARAMETER);
		createEAttribute(queryParameterEClass, QUERY_PARAMETER__UID);
		createEAttribute(queryParameterEClass, QUERY_PARAMETER__NAME);

		technologyEClass = createEClass(TECHNOLOGY);
		createEAttribute(technologyEClass, TECHNOLOGY__UID);
		createEAttribute(technologyEClass, TECHNOLOGY__NAME);
		createEReference(technologyEClass, TECHNOLOGY__OPTIONS);

		optionEClass = createEClass(OPTION);
		createEAttribute(optionEClass, OPTION__UID);
		createEAttribute(optionEClass, OPTION__VALUE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(artifactGroupEClass, ArtifactGroup.class, "ArtifactGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArtifactGroup_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, ArtifactGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArtifactGroup_Name(), ecorePackage.getEString(), "name", null, 0, 1, ArtifactGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArtifactGroup_Artifacts(), this.getArtifact(), null, "artifacts", null, 0, -1, ArtifactGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(artifactEClass, Artifact.class, "Artifact", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArtifact_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArtifact_Name(), ecorePackage.getEString(), "name", null, 0, 1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArtifact_Description(), ecorePackage.getEString(), "description", null, 0, 1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArtifact_ConfigVariables(), this.getConfigVariable(), null, "configVariables", null, 0, -1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArtifact_ConfigHashes(), this.getConfigHash(), this.getConfigHash_Parent(), "configHashes", null, 0, -1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArtifact_ModelQuery(), this.getModelQuery(), null, "modelQuery", null, 0, -1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArtifact_Technologies(), this.getTechnology(), null, "technologies", null, 0, -1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArtifact_Hints(), this.getGenerationHint(), null, "hints", null, 0, -1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArtifact_Template(), ecorePackage.getEString(), "template", null, 0, 1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(generationHintEClass, GenerationHint.class, "GenerationHint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGenerationHint_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, GenerationHint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenerationHint_Name(), ecorePackage.getEString(), "name", null, 0, 1, GenerationHint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenerationHint_ApplyedClass(), ecorePackage.getEString(), "applyedClass", null, 0, 1, GenerationHint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configVariableEClass, ConfigVariable.class, "ConfigVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConfigVariable_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, ConfigVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfigVariable_Name(), ecorePackage.getEString(), "name", null, 0, 1, ConfigVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configHashEClass, ConfigHash.class, "ConfigHash", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConfigHash_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, ConfigHash.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfigHash_Name(), ecorePackage.getEString(), "name", null, 0, 1, ConfigHash.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfigHash_Parent(), this.getArtifact(), this.getArtifact_ConfigHashes(), "parent", null, 0, 1, ConfigHash.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelQueryEClass, ModelQuery.class, "ModelQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelQuery_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, ModelQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelQuery_Name(), ecorePackage.getEString(), "name", null, 0, 1, ModelQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelQuery_Query(), ecorePackage.getEString(), "query", null, 0, 1, ModelQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelQuery_Parameters(), this.getQueryParameter(), null, "parameters", null, 0, -1, ModelQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(queryParameterEClass, QueryParameter.class, "QueryParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQueryParameter_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, QueryParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueryParameter_Name(), ecorePackage.getEString(), "name", null, 0, 1, QueryParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(technologyEClass, Technology.class, "Technology", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTechnology_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Technology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTechnology_Name(), ecorePackage.getEString(), "name", null, 0, 1, Technology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTechnology_Options(), this.getOption(), null, "options", null, 1, -1, Technology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(optionEClass, Option.class, "Option", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOption_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOption_Value(), ecorePackage.getEString(), "value", null, 0, 1, Option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ArtifactPackageImpl
