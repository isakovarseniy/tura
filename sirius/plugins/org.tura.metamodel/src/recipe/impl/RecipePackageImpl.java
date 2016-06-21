/**
 */
package recipe.impl;

import application.ApplicationPackage;

import application.impl.ApplicationPackageImpl;

import artifact.ArtifactPackage;

import artifact.impl.ArtifactPackageImpl;

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
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import permission.PermissionPackage;

import permission.impl.PermissionPackageImpl;

import recipe.ArtifactRef;
import recipe.Component;
import recipe.ConfigExtension;
import recipe.Configuration;
import recipe.DeploymentComponent;
import recipe.DeploymentComponents;
import recipe.DeploymentSequence;
import recipe.DeploymentStarStep;
import recipe.HashProperty;
import recipe.Infrastructure;
import recipe.Ingredient;
import recipe.JavaComponent;
import recipe.KeyValuePair;
import recipe.MappingSpecifier;
import recipe.ModelMapper;
import recipe.PlatformLayers;
import recipe.Property;
import recipe.Query;
import recipe.QueryVariable;
import recipe.Recipe;
import recipe.RecipeFactory;
import recipe.RecipePackage;
import recipe.Recipes;
import recipe.UsingMappers;

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
public class RecipePackageImpl extends EPackageImpl implements RecipePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recipesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recipeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configExtensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deploymentSequenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deploymentComponentsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deploymentComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deploymentStarStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usingMappersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ingredientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass infrastructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelMapperEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hashPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keyValuePairEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappingSpecifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass artifactRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum platformLayersEEnum = null;

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
	 * @see recipe.RecipePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RecipePackageImpl() {
		super(eNS_URI, RecipeFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RecipePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RecipePackage init() {
		if (isInited) return (RecipePackage)EPackage.Registry.INSTANCE.getEPackage(RecipePackage.eNS_URI);

		// Obtain or create and register package
		RecipePackageImpl theRecipePackage = (RecipePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RecipePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RecipePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		DomainPackageImpl theDomainPackage = (DomainPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) instanceof DomainPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) : DomainPackage.eINSTANCE);
		ArtifactPackageImpl theArtifactPackage = (ArtifactPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ArtifactPackage.eNS_URI) instanceof ArtifactPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ArtifactPackage.eNS_URI) : ArtifactPackage.eINSTANCE);
		TypePackageImpl theTypePackage = (TypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) instanceof TypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) : TypePackage.eINSTANCE);
		ApplicationPackageImpl theApplicationPackage = (ApplicationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ApplicationPackage.eNS_URI) instanceof ApplicationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ApplicationPackage.eNS_URI) : ApplicationPackage.eINSTANCE);
		CommonPackageImpl theCommonPackage = (CommonPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) instanceof CommonPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) : CommonPackage.eINSTANCE);
		PermissionPackageImpl thePermissionPackage = (PermissionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PermissionPackage.eNS_URI) instanceof PermissionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PermissionPackage.eNS_URI) : PermissionPackage.eINSTANCE);
		InfrastructurePackageImpl theInfrastructurePackage = (InfrastructurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InfrastructurePackage.eNS_URI) instanceof InfrastructurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InfrastructurePackage.eNS_URI) : InfrastructurePackage.eINSTANCE);
		MessagePackageImpl theMessagePackage = (MessagePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MessagePackage.eNS_URI) instanceof MessagePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MessagePackage.eNS_URI) : MessagePackage.eINSTANCE);
		StylePackageImpl theStylePackage = (StylePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI) instanceof StylePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI) : StylePackage.eINSTANCE);
		FormPackageImpl theFormPackage = (FormPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FormPackage.eNS_URI) instanceof FormPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FormPackage.eNS_URI) : FormPackage.eINSTANCE);
		MapperPackageImpl theMapperPackage = (MapperPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MapperPackage.eNS_URI) instanceof MapperPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MapperPackage.eNS_URI) : MapperPackage.eINSTANCE);

		// Create package meta-data objects
		theRecipePackage.createPackageContents();
		theDomainPackage.createPackageContents();
		theArtifactPackage.createPackageContents();
		theTypePackage.createPackageContents();
		theApplicationPackage.createPackageContents();
		theCommonPackage.createPackageContents();
		thePermissionPackage.createPackageContents();
		theInfrastructurePackage.createPackageContents();
		theMessagePackage.createPackageContents();
		theStylePackage.createPackageContents();
		theFormPackage.createPackageContents();
		theMapperPackage.createPackageContents();

		// Initialize created meta-data
		theRecipePackage.initializePackageContents();
		theDomainPackage.initializePackageContents();
		theArtifactPackage.initializePackageContents();
		theTypePackage.initializePackageContents();
		theApplicationPackage.initializePackageContents();
		theCommonPackage.initializePackageContents();
		thePermissionPackage.initializePackageContents();
		theInfrastructurePackage.initializePackageContents();
		theMessagePackage.initializePackageContents();
		theStylePackage.initializePackageContents();
		theFormPackage.initializePackageContents();
		theMapperPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRecipePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RecipePackage.eNS_URI, theRecipePackage);
		return theRecipePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRecipes() {
		return recipesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecipes_Uid() {
		return (EAttribute)recipesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRecipes_Recipe() {
		return (EReference)recipesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRecipes_Configurations() {
		return (EReference)recipesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRecipes_Infrastructures() {
		return (EReference)recipesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRecipes_Deployment() {
		return (EReference)recipesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRecipes_ConfigExtension() {
		return (EReference)recipesEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRecipe() {
		return recipeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecipe_Uid() {
		return (EAttribute)recipeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecipe_Name() {
		return (EAttribute)recipeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRecipe_Ingredients() {
		return (EReference)recipeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRecipe_Infrastructures() {
		return (EReference)recipeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRecipe_Deployment() {
		return (EReference)recipeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigExtension() {
		return configExtensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigExtension_Uid() {
		return (EAttribute)configExtensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigExtension_Source() {
		return (EReference)configExtensionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigExtension_Target() {
		return (EReference)configExtensionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeploymentSequence() {
		return deploymentSequenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeploymentSequence_Uid() {
		return (EAttribute)deploymentSequenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeploymentSequence_Name() {
		return (EAttribute)deploymentSequenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeploymentSequence_DeploymentComponents() {
		return (EReference)deploymentSequenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeploymentComponents() {
		return deploymentComponentsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeploymentComponents_Uid() {
		return (EAttribute)deploymentComponentsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeploymentComponents_DeplymentStep() {
		return (EReference)deploymentComponentsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeploymentComponents_StartSeq() {
		return (EReference)deploymentComponentsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeploymentComponent() {
		return deploymentComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeploymentComponent_Uid() {
		return (EAttribute)deploymentComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeploymentComponent_Name() {
		return (EAttribute)deploymentComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeploymentComponent_Mapper() {
		return (EReference)deploymentComponentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeploymentComponent_DeploymentComponentLink() {
		return (EReference)deploymentComponentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeploymentStarStep() {
		return deploymentStarStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeploymentStarStep_Uid() {
		return (EAttribute)deploymentStarStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeploymentStarStep_Name() {
		return (EAttribute)deploymentStarStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeploymentStarStep_FirstStep() {
		return (EReference)deploymentStarStepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUsingMappers() {
		return usingMappersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUsingMappers_Mappers() {
		return (EReference)usingMappersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIngredient() {
		return ingredientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIngredient_Uid() {
		return (EAttribute)ingredientEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIngredient_Name() {
		return (EAttribute)ingredientEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIngredient_Components() {
		return (EReference)ingredientEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIngredient_Layer() {
		return (EAttribute)ingredientEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponent() {
		return componentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_Uid() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_Name() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_Mappers() {
		return (EReference)componentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_ComponentRoot() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJavaComponent() {
		return javaComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJavaComponent_ArtifactId() {
		return (EAttribute)javaComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJavaComponent_GroupId() {
		return (EAttribute)javaComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJavaComponent_Version() {
		return (EAttribute)javaComponentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJavaComponent_BasePackage() {
		return (EAttribute)javaComponentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInfrastructure() {
		return infrastructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInfrastructure_Uid() {
		return (EAttribute)infrastructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInfrastructure_Recipe() {
		return (EReference)infrastructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInfrastructure_Name() {
		return (EAttribute)infrastructureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInfrastructure_RecipeConfig() {
		return (EReference)infrastructureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfiguration() {
		return configurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfiguration_Uid() {
		return (EAttribute)configurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfiguration_Name() {
		return (EAttribute)configurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfiguration_Infrastructure() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfiguration_Properties() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfiguration_HashProperties() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelMapper() {
		return modelMapperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelMapper_Name() {
		return (EAttribute)modelMapperEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelMapper_ArtifactRoot() {
		return (EAttribute)modelMapperEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelMapper_Specifiers() {
		return (EReference)modelMapperEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelMapper_Queries() {
		return (EReference)modelMapperEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelMapper_ArtifactExecutionString() {
		return (EAttribute)modelMapperEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Uid() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_ConfVarRef() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Value() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_FakeName() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHashProperty() {
		return hashPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHashProperty_Uid() {
		return (EAttribute)hashPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHashProperty_ConfHashRef() {
		return (EReference)hashPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHashProperty_Hash() {
		return (EReference)hashPropertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHashProperty_FakeName() {
		return (EAttribute)hashPropertyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKeyValuePair() {
		return keyValuePairEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyValuePair_Uid() {
		return (EAttribute)keyValuePairEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyValuePair_Key() {
		return (EAttribute)keyValuePairEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyValuePair_Value() {
		return (EAttribute)keyValuePairEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMappingSpecifier() {
		return mappingSpecifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMappingSpecifier_Uid() {
		return (EAttribute)mappingSpecifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingSpecifier_SpecifierRef() {
		return (EReference)mappingSpecifierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingSpecifier_ValueRef() {
		return (EReference)mappingSpecifierEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuery() {
		return queryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuery_Uid() {
		return (EAttribute)queryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuery_ModelQuery() {
		return (EReference)queryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuery_Name() {
		return (EAttribute)queryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuery_QueryRef() {
		return (EReference)queryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuery_Variables() {
		return (EReference)queryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryVariable() {
		return queryVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryVariable_Uid() {
		return (EAttribute)queryVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQueryVariable_QueryParamRef() {
		return (EReference)queryVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryVariable_Value() {
		return (EAttribute)queryVariableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArtifactRef() {
		return artifactRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArtifactRef_Uid() {
		return (EAttribute)artifactRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArtifactRef_ArtifactRef() {
		return (EReference)artifactRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPlatformLayers() {
		return platformLayersEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecipeFactory getRecipeFactory() {
		return (RecipeFactory)getEFactoryInstance();
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
		recipesEClass = createEClass(RECIPES);
		createEAttribute(recipesEClass, RECIPES__UID);
		createEReference(recipesEClass, RECIPES__RECIPE);
		createEReference(recipesEClass, RECIPES__CONFIGURATIONS);
		createEReference(recipesEClass, RECIPES__INFRASTRUCTURES);
		createEReference(recipesEClass, RECIPES__DEPLOYMENT);
		createEReference(recipesEClass, RECIPES__CONFIG_EXTENSION);

		recipeEClass = createEClass(RECIPE);
		createEAttribute(recipeEClass, RECIPE__UID);
		createEAttribute(recipeEClass, RECIPE__NAME);
		createEReference(recipeEClass, RECIPE__INGREDIENTS);
		createEReference(recipeEClass, RECIPE__INFRASTRUCTURES);
		createEReference(recipeEClass, RECIPE__DEPLOYMENT);

		configExtensionEClass = createEClass(CONFIG_EXTENSION);
		createEAttribute(configExtensionEClass, CONFIG_EXTENSION__UID);
		createEReference(configExtensionEClass, CONFIG_EXTENSION__SOURCE);
		createEReference(configExtensionEClass, CONFIG_EXTENSION__TARGET);

		deploymentSequenceEClass = createEClass(DEPLOYMENT_SEQUENCE);
		createEAttribute(deploymentSequenceEClass, DEPLOYMENT_SEQUENCE__UID);
		createEAttribute(deploymentSequenceEClass, DEPLOYMENT_SEQUENCE__NAME);
		createEReference(deploymentSequenceEClass, DEPLOYMENT_SEQUENCE__DEPLOYMENT_COMPONENTS);

		deploymentComponentsEClass = createEClass(DEPLOYMENT_COMPONENTS);
		createEAttribute(deploymentComponentsEClass, DEPLOYMENT_COMPONENTS__UID);
		createEReference(deploymentComponentsEClass, DEPLOYMENT_COMPONENTS__DEPLYMENT_STEP);
		createEReference(deploymentComponentsEClass, DEPLOYMENT_COMPONENTS__START_SEQ);

		deploymentComponentEClass = createEClass(DEPLOYMENT_COMPONENT);
		createEAttribute(deploymentComponentEClass, DEPLOYMENT_COMPONENT__UID);
		createEAttribute(deploymentComponentEClass, DEPLOYMENT_COMPONENT__NAME);
		createEReference(deploymentComponentEClass, DEPLOYMENT_COMPONENT__MAPPER);
		createEReference(deploymentComponentEClass, DEPLOYMENT_COMPONENT__DEPLOYMENT_COMPONENT_LINK);

		deploymentStarStepEClass = createEClass(DEPLOYMENT_STAR_STEP);
		createEAttribute(deploymentStarStepEClass, DEPLOYMENT_STAR_STEP__UID);
		createEAttribute(deploymentStarStepEClass, DEPLOYMENT_STAR_STEP__NAME);
		createEReference(deploymentStarStepEClass, DEPLOYMENT_STAR_STEP__FIRST_STEP);

		usingMappersEClass = createEClass(USING_MAPPERS);
		createEReference(usingMappersEClass, USING_MAPPERS__MAPPERS);

		ingredientEClass = createEClass(INGREDIENT);
		createEAttribute(ingredientEClass, INGREDIENT__UID);
		createEAttribute(ingredientEClass, INGREDIENT__NAME);
		createEReference(ingredientEClass, INGREDIENT__COMPONENTS);
		createEAttribute(ingredientEClass, INGREDIENT__LAYER);

		componentEClass = createEClass(COMPONENT);
		createEAttribute(componentEClass, COMPONENT__UID);
		createEAttribute(componentEClass, COMPONENT__NAME);
		createEReference(componentEClass, COMPONENT__MAPPERS);
		createEAttribute(componentEClass, COMPONENT__COMPONENT_ROOT);

		javaComponentEClass = createEClass(JAVA_COMPONENT);
		createEAttribute(javaComponentEClass, JAVA_COMPONENT__ARTIFACT_ID);
		createEAttribute(javaComponentEClass, JAVA_COMPONENT__GROUP_ID);
		createEAttribute(javaComponentEClass, JAVA_COMPONENT__VERSION);
		createEAttribute(javaComponentEClass, JAVA_COMPONENT__BASE_PACKAGE);

		infrastructureEClass = createEClass(INFRASTRUCTURE);
		createEAttribute(infrastructureEClass, INFRASTRUCTURE__UID);
		createEReference(infrastructureEClass, INFRASTRUCTURE__RECIPE);
		createEAttribute(infrastructureEClass, INFRASTRUCTURE__NAME);
		createEReference(infrastructureEClass, INFRASTRUCTURE__RECIPE_CONFIG);

		configurationEClass = createEClass(CONFIGURATION);
		createEAttribute(configurationEClass, CONFIGURATION__UID);
		createEAttribute(configurationEClass, CONFIGURATION__NAME);
		createEReference(configurationEClass, CONFIGURATION__INFRASTRUCTURE);
		createEReference(configurationEClass, CONFIGURATION__PROPERTIES);
		createEReference(configurationEClass, CONFIGURATION__HASH_PROPERTIES);

		modelMapperEClass = createEClass(MODEL_MAPPER);
		createEAttribute(modelMapperEClass, MODEL_MAPPER__NAME);
		createEAttribute(modelMapperEClass, MODEL_MAPPER__ARTIFACT_ROOT);
		createEReference(modelMapperEClass, MODEL_MAPPER__SPECIFIERS);
		createEReference(modelMapperEClass, MODEL_MAPPER__QUERIES);
		createEAttribute(modelMapperEClass, MODEL_MAPPER__ARTIFACT_EXECUTION_STRING);

		propertyEClass = createEClass(PROPERTY);
		createEAttribute(propertyEClass, PROPERTY__UID);
		createEReference(propertyEClass, PROPERTY__CONF_VAR_REF);
		createEAttribute(propertyEClass, PROPERTY__VALUE);
		createEAttribute(propertyEClass, PROPERTY__FAKE_NAME);

		hashPropertyEClass = createEClass(HASH_PROPERTY);
		createEAttribute(hashPropertyEClass, HASH_PROPERTY__UID);
		createEReference(hashPropertyEClass, HASH_PROPERTY__CONF_HASH_REF);
		createEReference(hashPropertyEClass, HASH_PROPERTY__HASH);
		createEAttribute(hashPropertyEClass, HASH_PROPERTY__FAKE_NAME);

		keyValuePairEClass = createEClass(KEY_VALUE_PAIR);
		createEAttribute(keyValuePairEClass, KEY_VALUE_PAIR__UID);
		createEAttribute(keyValuePairEClass, KEY_VALUE_PAIR__KEY);
		createEAttribute(keyValuePairEClass, KEY_VALUE_PAIR__VALUE);

		mappingSpecifierEClass = createEClass(MAPPING_SPECIFIER);
		createEAttribute(mappingSpecifierEClass, MAPPING_SPECIFIER__UID);
		createEReference(mappingSpecifierEClass, MAPPING_SPECIFIER__SPECIFIER_REF);
		createEReference(mappingSpecifierEClass, MAPPING_SPECIFIER__VALUE_REF);

		queryEClass = createEClass(QUERY);
		createEAttribute(queryEClass, QUERY__UID);
		createEReference(queryEClass, QUERY__MODEL_QUERY);
		createEAttribute(queryEClass, QUERY__NAME);
		createEReference(queryEClass, QUERY__QUERY_REF);
		createEReference(queryEClass, QUERY__VARIABLES);

		queryVariableEClass = createEClass(QUERY_VARIABLE);
		createEAttribute(queryVariableEClass, QUERY_VARIABLE__UID);
		createEReference(queryVariableEClass, QUERY_VARIABLE__QUERY_PARAM_REF);
		createEAttribute(queryVariableEClass, QUERY_VARIABLE__VALUE);

		artifactRefEClass = createEClass(ARTIFACT_REF);
		createEAttribute(artifactRefEClass, ARTIFACT_REF__UID);
		createEReference(artifactRefEClass, ARTIFACT_REF__ARTIFACT_REF);

		// Create enums
		platformLayersEEnum = createEEnum(PLATFORM_LAYERS);
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
		MapperPackage theMapperPackage = (MapperPackage)EPackage.Registry.INSTANCE.getEPackage(MapperPackage.eNS_URI);
		ArtifactPackage theArtifactPackage = (ArtifactPackage)EPackage.Registry.INSTANCE.getEPackage(ArtifactPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		recipeEClass.getESuperTypes().add(this.getUsingMappers());
		ingredientEClass.getESuperTypes().add(this.getUsingMappers());
		javaComponentEClass.getESuperTypes().add(this.getComponent());
		modelMapperEClass.getESuperTypes().add(this.getArtifactRef());

		// Initialize classes and features; add operations and parameters
		initEClass(recipesEClass, Recipes.class, "Recipes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRecipes_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Recipes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRecipes_Recipe(), this.getRecipe(), null, "recipe", null, 0, 1, Recipes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRecipes_Configurations(), this.getConfiguration(), null, "configurations", null, 0, -1, Recipes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRecipes_Infrastructures(), this.getInfrastructure(), null, "infrastructures", null, 0, -1, Recipes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRecipes_Deployment(), this.getDeploymentSequence(), null, "deployment", null, 0, 1, Recipes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRecipes_ConfigExtension(), this.getConfigExtension(), null, "configExtension", null, 0, -1, Recipes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(recipeEClass, Recipe.class, "Recipe", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRecipe_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Recipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecipe_Name(), ecorePackage.getEString(), "name", null, 0, 1, Recipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRecipe_Ingredients(), this.getIngredient(), null, "ingredients", null, 0, -1, Recipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRecipe_Infrastructures(), this.getInfrastructure(), null, "infrastructures", null, 0, -1, Recipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRecipe_Deployment(), this.getDeploymentSequence(), null, "deployment", null, 0, 1, Recipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configExtensionEClass, ConfigExtension.class, "ConfigExtension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConfigExtension_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, ConfigExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfigExtension_Source(), this.getConfiguration(), null, "source", null, 0, 1, ConfigExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfigExtension_Target(), this.getConfiguration(), null, "target", null, 0, 1, ConfigExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deploymentSequenceEClass, DeploymentSequence.class, "DeploymentSequence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeploymentSequence_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, DeploymentSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeploymentSequence_Name(), ecorePackage.getEString(), "name", null, 0, 1, DeploymentSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeploymentSequence_DeploymentComponents(), this.getDeploymentComponents(), null, "deploymentComponents", null, 0, 1, DeploymentSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deploymentComponentsEClass, DeploymentComponents.class, "DeploymentComponents", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeploymentComponents_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, DeploymentComponents.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeploymentComponents_DeplymentStep(), this.getDeploymentComponent(), null, "deplymentStep", null, 0, -1, DeploymentComponents.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeploymentComponents_StartSeq(), this.getDeploymentStarStep(), null, "startSeq", null, 0, 1, DeploymentComponents.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deploymentComponentEClass, DeploymentComponent.class, "DeploymentComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeploymentComponent_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, DeploymentComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeploymentComponent_Name(), ecorePackage.getEString(), "name", null, 0, 1, DeploymentComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeploymentComponent_Mapper(), this.getModelMapper(), null, "mapper", null, 0, 1, DeploymentComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeploymentComponent_DeploymentComponentLink(), this.getDeploymentComponent(), null, "deploymentComponentLink", null, 0, 1, DeploymentComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deploymentStarStepEClass, DeploymentStarStep.class, "DeploymentStarStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeploymentStarStep_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, DeploymentStarStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeploymentStarStep_Name(), ecorePackage.getEString(), "name", null, 0, 1, DeploymentStarStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeploymentStarStep_FirstStep(), this.getDeploymentComponent(), null, "firstStep", null, 0, 1, DeploymentStarStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(usingMappersEClass, UsingMappers.class, "UsingMappers", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUsingMappers_Mappers(), theMapperPackage.getMappers(), null, "mappers", null, 0, -1, UsingMappers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ingredientEClass, Ingredient.class, "Ingredient", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIngredient_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Ingredient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIngredient_Name(), ecorePackage.getEString(), "name", null, 0, 1, Ingredient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIngredient_Components(), this.getComponent(), null, "components", null, 0, -1, Ingredient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIngredient_Layer(), this.getPlatformLayers(), "layer", null, 0, 1, Ingredient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentEClass, Component.class, "Component", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponent_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_Name(), ecorePackage.getEString(), "name", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_Mappers(), this.getModelMapper(), null, "mappers", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_ComponentRoot(), ecorePackage.getEString(), "componentRoot", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(javaComponentEClass, JavaComponent.class, "JavaComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJavaComponent_ArtifactId(), ecorePackage.getEString(), "artifactId", null, 0, 1, JavaComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaComponent_GroupId(), ecorePackage.getEString(), "groupId", null, 0, 1, JavaComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaComponent_Version(), ecorePackage.getEString(), "version", null, 0, 1, JavaComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaComponent_BasePackage(), ecorePackage.getEString(), "basePackage", null, 0, 1, JavaComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(infrastructureEClass, Infrastructure.class, "Infrastructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInfrastructure_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Infrastructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInfrastructure_Recipe(), this.getRecipe(), null, "recipe", null, 0, 1, Infrastructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInfrastructure_Name(), ecorePackage.getEString(), "name", null, 0, 1, Infrastructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInfrastructure_RecipeConfig(), this.getConfiguration(), null, "recipeConfig", null, 0, 1, Infrastructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configurationEClass, Configuration.class, "Configuration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConfiguration_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfiguration_Name(), ecorePackage.getEString(), "name", null, 0, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfiguration_Infrastructure(), this.getInfrastructure(), null, "infrastructure", null, 0, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfiguration_Properties(), this.getProperty(), null, "properties", null, 0, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfiguration_HashProperties(), this.getHashProperty(), null, "hashProperties", null, 0, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelMapperEClass, ModelMapper.class, "ModelMapper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelMapper_Name(), ecorePackage.getEString(), "name", null, 0, 1, ModelMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelMapper_ArtifactRoot(), ecorePackage.getEString(), "artifactRoot", null, 0, 1, ModelMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelMapper_Specifiers(), this.getMappingSpecifier(), null, "specifiers", null, 0, -1, ModelMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelMapper_Queries(), this.getQuery(), null, "queries", null, 0, -1, ModelMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelMapper_ArtifactExecutionString(), ecorePackage.getEString(), "artifactExecutionString", null, 0, 1, ModelMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProperty_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProperty_ConfVarRef(), theArtifactPackage.getConfigVariable(), null, "confVarRef", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Value(), ecorePackage.getEString(), "value", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_FakeName(), ecorePackage.getEString(), "fakeName", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hashPropertyEClass, HashProperty.class, "HashProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHashProperty_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, HashProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHashProperty_ConfHashRef(), theArtifactPackage.getConfigHash(), null, "confHashRef", null, 0, 1, HashProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHashProperty_Hash(), this.getKeyValuePair(), null, "hash", null, 0, -1, HashProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHashProperty_FakeName(), ecorePackage.getEString(), "fakeName", null, 0, 1, HashProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(keyValuePairEClass, KeyValuePair.class, "KeyValuePair", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKeyValuePair_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, KeyValuePair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeyValuePair_Key(), ecorePackage.getEString(), "key", null, 0, 1, KeyValuePair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeyValuePair_Value(), ecorePackage.getEString(), "value", null, 0, 1, KeyValuePair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mappingSpecifierEClass, MappingSpecifier.class, "MappingSpecifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMappingSpecifier_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, MappingSpecifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMappingSpecifier_SpecifierRef(), theArtifactPackage.getTechnology(), null, "specifierRef", null, 0, 1, MappingSpecifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMappingSpecifier_ValueRef(), theArtifactPackage.getOption(), null, "valueRef", null, 0, 1, MappingSpecifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(queryEClass, Query.class, "Query", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQuery_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Query.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuery_ModelQuery(), theArtifactPackage.getModelQuery(), null, "modelQuery", null, 0, 1, Query.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuery_Name(), ecorePackage.getEString(), "name", null, 0, 1, Query.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuery_QueryRef(), theArtifactPackage.getModelQuery(), null, "queryRef", null, 0, 1, Query.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuery_Variables(), this.getQueryVariable(), null, "variables", null, 0, -1, Query.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(queryVariableEClass, QueryVariable.class, "QueryVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQueryVariable_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, QueryVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQueryVariable_QueryParamRef(), theArtifactPackage.getQueryParameter(), null, "queryParamRef", null, 0, 1, QueryVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueryVariable_Value(), ecorePackage.getEString(), "value", null, 0, 1, QueryVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(artifactRefEClass, ArtifactRef.class, "ArtifactRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArtifactRef_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, ArtifactRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArtifactRef_ArtifactRef(), theArtifactPackage.getArtifact(), null, "artifactRef", null, 0, 1, ArtifactRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(platformLayersEEnum, PlatformLayers.class, "PlatformLayers");
		addEEnumLiteral(platformLayersEEnum, PlatformLayers.SERVICE_LAYER);
		addEEnumLiteral(platformLayersEEnum, PlatformLayers.UI_LAYER);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf.node
		createGmfAnnotations();
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations() {
		String source = "gmf.node";	
		addAnnotation
		  (hashPropertyEClass, 
		   source, 
		   new String[] {
			 "label", "fakeName",
			 "border.color", "0,0,0",
			 "color", "255,239,222"
		   });	
		addAnnotation
		  (queryEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "border.color", "0,0,0",
			 "color", "241,238,203"
		   });
	}

} //RecipePackageImpl
