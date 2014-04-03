/**
 */
package domain.impl;

import domain.Application;
import domain.ApplicationInfrastructureLayer;
import domain.ApplicationMapper;
import domain.ApplicationMappers;
import domain.ApplicationRecipe;
import domain.ApplicationRecipes;
import domain.ApplicationUILayer;
import domain.ApplicationUIPackage;
import domain.Artifact;
import domain.ArtifactRef;
import domain.Artifacts;
import domain.ArtificialField;
import domain.Attribute;
import domain.Component;
import domain.ConfigVariable;
import domain.Configuration;
import domain.ContextValue;
import domain.ContinuousIintegration;
import domain.Controls;
import domain.CreateTrigger;
import domain.DataControl;
import domain.Datacenter;
import domain.DeleteTrigger;
import domain.DeploymentComponent;
import domain.DeploymentComponents;
import domain.DeploymentSequence;
import domain.DeploymentStarStep;
import domain.Domain;
import domain.DomainApplication;
import domain.DomainApplications;
import domain.DomainArtifact;
import domain.DomainArtifacts;
import domain.DomainFactory;
import domain.DomainPackage;
import domain.DomainTypes;
import domain.EJBService;
import domain.EnterpriseInfrastructure;
import domain.EnumAttribute;
import domain.Enumarator;
import domain.Form;
import domain.FormDataControls;
import domain.FormView;
import domain.HTMLLayerHolder;
import domain.Hub;
import domain.Infrastructure;
import domain.InfrastructureComponent;
import domain.InfrastructureConnection;
import domain.InfrastructureLayer;
import domain.Ingredient;
import domain.InsertTrigger;
import domain.JPAService;
import domain.JavaComponent;
import domain.JavaMapper;
import domain.Link;
import domain.Mapper;
import domain.Mappers;
import domain.MappingSpecifier;
import domain.MethodPointer;
import domain.ModelMapper;
import domain.ModelQuery;
import domain.ORMEntity;
import domain.Operation;
import domain.Option;
import domain.POSTCreateTrigger;
import domain.POSTQueryTrigger;
import domain.PREDeleteTrigger;
import domain.PREFormTrigger;
import domain.PREInsertTrigger;
import domain.PREQueryTrigger;
import domain.PREUpdateTrigger;
import domain.Parameter;
import domain.PlatformLayers;
import domain.Primitive;
import domain.Property;
import domain.Query;
import domain.QueryParameter;
import domain.QueryVariable;
import domain.Recipe;
import domain.Recipes;
import domain.Relation;
import domain.ReturnValue;
import domain.Root;
import domain.Router;
import domain.SearchTrigger;
import domain.Server;
import domain.ServerClaster;
import domain.Specifier;
import domain.Storage;
import domain.Subsystem;
import domain.Trigger;
import domain.TriggerParameter;
import domain.Type;
import domain.TypeDefinition;
import domain.TypeElement;
import domain.TypeExtension;
import domain.TypePointer;
import domain.TypeReference;
import domain.Types;
import domain.TypesRepository;
import domain.UIPackage;
import domain.UpdateTrigger;
import domain.UsingMappers;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import domain.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DomainPackageImpl extends EPackageImpl implements DomainPackage
{
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
  private EClass htmlLayerHolderEClass = null;

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
  private EClass domainTypesEClass = null;

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
  private EClass domainArtifactEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ormEntityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass jpaServiceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ejbServiceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass continuousIintegrationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass artifactsEClass = null;

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
  private EClass configVariableEClass = null;

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
  private EClass specifierEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass optionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass applicationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass applicationUILayerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass applicationUIPackageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass applicationRecipesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass applicationRecipeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass applicationMappersEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass applicationMapperEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass methodPointerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mappersEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mapperEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass javaMapperEClass = null;

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
  private EClass recipeEClass = null;

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
  private EClass typePointerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass primitiveEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeReferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeExtensionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass operationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass returnValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enumaratorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enumAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typesRepositoryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass packageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uiPackageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass formEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass formViewEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass formDataControlsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass controlsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass triggerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass triggerParameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass contextValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass preFormTriggerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass preQueryTriggerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass postQueryTriggerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass preInsertTriggerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass preDeleteTriggerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass postCreateTriggerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass preUpdateTriggerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass createTriggerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass insertTriggerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass updateTriggerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass deleteTriggerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass searchTriggerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rootEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataControlEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass relationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass artificialFieldEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass linkEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass applicationInfrastructureLayerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enterpriseInfrastructureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass datacenterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass subsystemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass infrastructureLayerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass infrastructureConnectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass infrastructureComponentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass serverEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass routerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass hubEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass storageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass serverClasterEClass = null;

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
   * @see domain.DomainPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private DomainPackageImpl()
  {
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
  public static DomainPackage init()
  {
    if (isInited) return (DomainPackage)EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI);

    // Obtain or create and register package
    DomainPackageImpl theDomainPackage = (DomainPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DomainPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DomainPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theDomainPackage.createPackageContents();

    // Initialize created meta-data
    theDomainPackage.initializePackageContents();

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
  public EClass getDomain()
  {
    return domainEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDomain_Uid()
  {
    return (EAttribute)domainEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDomain_DomainArtifacts()
  {
    return (EReference)domainEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDomain_DomainTypes()
  {
    return (EReference)domainEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDomain_DomainApplications()
  {
    return (EReference)domainEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHTMLLayerHolder()
  {
    return htmlLayerHolderEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHTMLLayerHolder_Columns()
  {
    return (EAttribute)htmlLayerHolderEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDomainArtifacts()
  {
    return domainArtifactsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDomainArtifacts_Uid()
  {
    return (EAttribute)domainArtifactsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDomainArtifacts_Name()
  {
    return (EAttribute)domainArtifactsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDomainArtifacts_Parent()
  {
    return (EReference)domainArtifactsEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDomainArtifacts_DomainArtifact()
  {
    return (EReference)domainArtifactsEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDomainTypes()
  {
    return domainTypesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDomainTypes_Uid()
  {
    return (EAttribute)domainTypesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDomainTypes_Name()
  {
    return (EAttribute)domainTypesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDomainTypes_Typesrepository()
  {
    return (EReference)domainTypesEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDomainTypes_Parent()
  {
    return (EReference)domainTypesEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDomainApplications()
  {
    return domainApplicationsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDomainApplications_Uid()
  {
    return (EAttribute)domainApplicationsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDomainApplications_Name()
  {
    return (EAttribute)domainApplicationsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDomainApplications_Applications()
  {
    return (EReference)domainApplicationsEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDomainApplications_Parent()
  {
    return (EReference)domainApplicationsEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDomainApplication()
  {
    return domainApplicationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDomainApplication_Uid()
  {
    return (EAttribute)domainApplicationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDomainApplication_Name()
  {
    return (EAttribute)domainApplicationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDomainApplication_Application()
  {
    return (EReference)domainApplicationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDomainApplication_Parent()
  {
    return (EReference)domainApplicationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDomainArtifact()
  {
    return domainArtifactEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDomainArtifact_Uid()
  {
    return (EAttribute)domainArtifactEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDomainArtifact_Name()
  {
    return (EAttribute)domainArtifactEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDomainArtifact_Parent()
  {
    return (EReference)domainArtifactEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDomainArtifact_Artifact()
  {
    return (EReference)domainArtifactEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getORMEntity()
  {
    return ormEntityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getJPAService()
  {
    return jpaServiceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEJBService()
  {
    return ejbServiceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getContinuousIintegration()
  {
    return continuousIintegrationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArtifacts()
  {
    return artifactsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArtifacts_Uid()
  {
    return (EAttribute)artifactsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArtifacts_Artifacts()
  {
    return (EReference)artifactsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArtifacts_Parent()
  {
    return (EReference)artifactsEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArtifact()
  {
    return artifactEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArtifact_Uid()
  {
    return (EAttribute)artifactEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArtifact_Name()
  {
    return (EAttribute)artifactEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArtifact_Description()
  {
    return (EAttribute)artifactEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArtifact_Parent()
  {
    return (EReference)artifactEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArtifact_ConfigVariables()
  {
    return (EReference)artifactEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArtifact_ModelQuery()
  {
    return (EReference)artifactEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArtifact_Specifiers()
  {
    return (EReference)artifactEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArtifact_Template()
  {
    return (EAttribute)artifactEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConfigVariable()
  {
    return configVariableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConfigVariable_Uid()
  {
    return (EAttribute)configVariableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConfigVariable_Name()
  {
    return (EAttribute)configVariableEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConfigVariable_Parent()
  {
    return (EReference)configVariableEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModelQuery()
  {
    return modelQueryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModelQuery_Uid()
  {
    return (EAttribute)modelQueryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModelQuery_Name()
  {
    return (EAttribute)modelQueryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModelQuery_Query()
  {
    return (EAttribute)modelQueryEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelQuery_Parent()
  {
    return (EReference)modelQueryEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelQuery_Parameters()
  {
    return (EReference)modelQueryEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQueryParameter()
  {
    return queryParameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQueryParameter_Uid()
  {
    return (EAttribute)queryParameterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQueryParameter_Parent()
  {
    return (EReference)queryParameterEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQueryParameter_Name()
  {
    return (EAttribute)queryParameterEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSpecifier()
  {
    return specifierEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSpecifier_Uid()
  {
    return (EAttribute)specifierEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSpecifier_Name()
  {
    return (EAttribute)specifierEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSpecifier_Parent()
  {
    return (EReference)specifierEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSpecifier_Options()
  {
    return (EReference)specifierEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOption()
  {
    return optionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOption_Uid()
  {
    return (EAttribute)optionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOption_Parent()
  {
    return (EReference)optionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOption_Value()
  {
    return (EAttribute)optionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getApplication()
  {
    return applicationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getApplication_Uid()
  {
    return (EAttribute)applicationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getApplication_ApplicationRecipes()
  {
    return (EReference)applicationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getApplication_ApplicationMappers()
  {
    return (EReference)applicationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getApplication_ApplicationUILayer()
  {
    return (EReference)applicationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getApplication_ApplicationInfrastructureLayer()
  {
    return (EReference)applicationEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getApplication_Parent()
  {
    return (EReference)applicationEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getApplicationUILayer()
  {
    return applicationUILayerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getApplicationUILayer_Uid()
  {
    return (EAttribute)applicationUILayerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getApplicationUILayer_Name()
  {
    return (EAttribute)applicationUILayerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getApplicationUILayer_Parent()
  {
    return (EReference)applicationUILayerEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getApplicationUILayer_ApplicationUIPackages()
  {
    return (EReference)applicationUILayerEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getApplicationUIPackage()
  {
    return applicationUIPackageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getApplicationUIPackage_Uid()
  {
    return (EAttribute)applicationUIPackageEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getApplicationUIPackage_Name()
  {
    return (EAttribute)applicationUIPackageEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getApplicationUIPackage_Parent()
  {
    return (EReference)applicationUIPackageEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getApplicationUIPackage_Uipackage()
  {
    return (EReference)applicationUIPackageEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getApplicationRecipes()
  {
    return applicationRecipesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getApplicationRecipes_Uid()
  {
    return (EAttribute)applicationRecipesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getApplicationRecipes_Name()
  {
    return (EAttribute)applicationRecipesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getApplicationRecipes_Parent()
  {
    return (EReference)applicationRecipesEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getApplicationRecipes_Recipes()
  {
    return (EReference)applicationRecipesEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getApplicationRecipe()
  {
    return applicationRecipeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getApplicationRecipe_Uid()
  {
    return (EAttribute)applicationRecipeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getApplicationRecipe_Name()
  {
    return (EAttribute)applicationRecipeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getApplicationRecipe_Recipes()
  {
    return (EReference)applicationRecipeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getApplicationRecipe_Parent()
  {
    return (EReference)applicationRecipeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getApplicationMappers()
  {
    return applicationMappersEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getApplicationMappers_Uid()
  {
    return (EAttribute)applicationMappersEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getApplicationMappers_Name()
  {
    return (EAttribute)applicationMappersEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getApplicationMappers_Parent()
  {
    return (EReference)applicationMappersEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getApplicationMappers_Mappers()
  {
    return (EReference)applicationMappersEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getApplicationMapper()
  {
    return applicationMapperEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getApplicationMapper_Uid()
  {
    return (EAttribute)applicationMapperEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getApplicationMapper_Name()
  {
    return (EAttribute)applicationMapperEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getApplicationMapper_Mapper()
  {
    return (EReference)applicationMapperEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getApplicationMapper_Parent()
  {
    return (EReference)applicationMapperEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMethodPointer()
  {
    return methodPointerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMethodPointer_MethodRef()
  {
    return (EReference)methodPointerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMethodPointer_FakeMethod()
  {
    return (EAttribute)methodPointerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMappers()
  {
    return mappersEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMappers_Uid()
  {
    return (EAttribute)mappersEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMappers_Mappers()
  {
    return (EReference)mappersEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMappers_Parent()
  {
    return (EReference)mappersEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMapper()
  {
    return mapperEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMapper_Uid()
  {
    return (EAttribute)mapperEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMapper_Parent()
  {
    return (EReference)mapperEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMapper_ServiceLayer()
  {
    return (EAttribute)mapperEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMapper_UiLayer()
  {
    return (EAttribute)mapperEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getJavaMapper()
  {
    return javaMapperEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJavaMapper_MappedToPackageName()
  {
    return (EAttribute)javaMapperEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJavaMapper_MappedToClassName()
  {
    return (EAttribute)javaMapperEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJavaMapper_ArtifactId()
  {
    return (EAttribute)javaMapperEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJavaMapper_GroupId()
  {
    return (EAttribute)javaMapperEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJavaMapper_Version()
  {
    return (EAttribute)javaMapperEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJavaMapper_LibraryName()
  {
    return (EAttribute)javaMapperEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRecipes()
  {
    return recipesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRecipes_Uid()
  {
    return (EAttribute)recipesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRecipes_Recipe()
  {
    return (EReference)recipesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRecipes_Configurations()
  {
    return (EReference)recipesEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRecipes_Infrastructures()
  {
    return (EReference)recipesEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRecipes_Parent()
  {
    return (EReference)recipesEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRecipes_Deployment()
  {
    return (EReference)recipesEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeploymentSequence()
  {
    return deploymentSequenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeploymentSequence_Uid()
  {
    return (EAttribute)deploymentSequenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeploymentSequence_Name()
  {
    return (EAttribute)deploymentSequenceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeploymentSequence_DeploymentComponents()
  {
    return (EReference)deploymentSequenceEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeploymentComponents()
  {
    return deploymentComponentsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeploymentComponents_Uid()
  {
    return (EAttribute)deploymentComponentsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeploymentComponents_DeplymentStep()
  {
    return (EReference)deploymentComponentsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeploymentComponents_StartSeq()
  {
    return (EReference)deploymentComponentsEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeploymentComponent()
  {
    return deploymentComponentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeploymentComponent_Uid()
  {
    return (EAttribute)deploymentComponentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeploymentComponent_Name()
  {
    return (EAttribute)deploymentComponentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeploymentComponent_Mapper()
  {
    return (EReference)deploymentComponentEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeploymentComponent_DeplymentComponent()
  {
    return (EReference)deploymentComponentEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeploymentStarStep()
  {
    return deploymentStarStepEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeploymentStarStep_Uid()
  {
    return (EAttribute)deploymentStarStepEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeploymentStarStep_Name()
  {
    return (EAttribute)deploymentStarStepEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeploymentStarStep_FirstStep()
  {
    return (EReference)deploymentStarStepEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUsingMappers()
  {
    return usingMappersEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUsingMappers_Mappers()
  {
    return (EReference)usingMappersEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRecipe()
  {
    return recipeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRecipe_Uid()
  {
    return (EAttribute)recipeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRecipe_Parent()
  {
    return (EReference)recipeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRecipe_Name()
  {
    return (EAttribute)recipeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRecipe_Ingredients()
  {
    return (EReference)recipeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRecipe_Infrastructures()
  {
    return (EReference)recipeEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRecipe_Deloyment()
  {
    return (EReference)recipeEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIngredient()
  {
    return ingredientEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIngredient_Uid()
  {
    return (EAttribute)ingredientEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIngredient_Name()
  {
    return (EAttribute)ingredientEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIngredient_Parent()
  {
    return (EReference)ingredientEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIngredient_Components()
  {
    return (EReference)ingredientEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIngredient_Layer()
  {
    return (EAttribute)ingredientEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComponent()
  {
    return componentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComponent_Uid()
  {
    return (EAttribute)componentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComponent_Name()
  {
    return (EAttribute)componentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponent_Parent()
  {
    return (EReference)componentEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponent_Mappers()
  {
    return (EReference)componentEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComponent_ComponentRoot()
  {
    return (EAttribute)componentEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getJavaComponent()
  {
    return javaComponentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJavaComponent_ArtifactId()
  {
    return (EAttribute)javaComponentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJavaComponent_GroupId()
  {
    return (EAttribute)javaComponentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJavaComponent_Version()
  {
    return (EAttribute)javaComponentEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJavaComponent_BasePackage()
  {
    return (EAttribute)javaComponentEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInfrastructure()
  {
    return infrastructureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInfrastructure_Uid()
  {
    return (EAttribute)infrastructureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInfrastructure_Recipe()
  {
    return (EReference)infrastructureEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInfrastructure_Name()
  {
    return (EAttribute)infrastructureEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInfrastructure_RecipeConfig()
  {
    return (EReference)infrastructureEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConfiguration()
  {
    return configurationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConfiguration_Uid()
  {
    return (EAttribute)configurationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConfiguration_Name()
  {
    return (EAttribute)configurationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConfiguration_Infrastructure()
  {
    return (EReference)configurationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConfiguration_Properties()
  {
    return (EReference)configurationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConfiguration_ConfigExtension()
  {
    return (EReference)configurationEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConfiguration_Parent()
  {
    return (EReference)configurationEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModelMapper()
  {
    return modelMapperEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModelMapper_Name()
  {
    return (EAttribute)modelMapperEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelMapper_Parent()
  {
    return (EReference)modelMapperEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelMapper_Specifiers()
  {
    return (EReference)modelMapperEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelMapper_Queries()
  {
    return (EReference)modelMapperEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModelMapper_ArtifactExecutionString()
  {
    return (EAttribute)modelMapperEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProperty()
  {
    return propertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProperty_Uid()
  {
    return (EAttribute)propertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProperty_ConfVarRef()
  {
    return (EReference)propertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProperty_Value()
  {
    return (EAttribute)propertyEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProperty_FakeName()
  {
    return (EAttribute)propertyEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMappingSpecifier()
  {
    return mappingSpecifierEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMappingSpecifier_Uid()
  {
    return (EAttribute)mappingSpecifierEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMappingSpecifier_SpecifierRef()
  {
    return (EReference)mappingSpecifierEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMappingSpecifier_ValueRef()
  {
    return (EReference)mappingSpecifierEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQuery()
  {
    return queryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQuery_Uid()
  {
    return (EAttribute)queryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQuery_ModelQuery()
  {
    return (EReference)queryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQuery_Name()
  {
    return (EAttribute)queryEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQuery_QueryRef()
  {
    return (EReference)queryEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQuery_Variables()
  {
    return (EReference)queryEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQuery_GroupCode()
  {
    return (EAttribute)queryEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQueryVariable()
  {
    return queryVariableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQueryVariable_Uid()
  {
    return (EAttribute)queryVariableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQueryVariable_QueryParamRef()
  {
    return (EReference)queryVariableEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQueryVariable_Value()
  {
    return (EAttribute)queryVariableEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArtifactRef()
  {
    return artifactRefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArtifactRef_Uid()
  {
    return (EAttribute)artifactRefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArtifactRef_DomainArtifactRef()
  {
    return (EReference)artifactRefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArtifactRef_ArtifactRef()
  {
    return (EReference)artifactRefEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypePointer()
  {
    return typePointerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypePointer_PackageRef()
  {
    return (EReference)typePointerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypePointer_TypeRef()
  {
    return (EReference)typePointerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypePointer_FakePackageName()
  {
    return (EAttribute)typePointerEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypePointer_FakeTypeName()
  {
    return (EAttribute)typePointerEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeDefinition()
  {
    return typeDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeDefinition_Uid()
  {
    return (EAttribute)typeDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeDefinition_Types()
  {
    return (EReference)typeDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeDefinition_Parent()
  {
    return (EReference)typeDefinitionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeElement()
  {
    return typeElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeElement_Uid()
  {
    return (EAttribute)typeElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeElement_Name()
  {
    return (EAttribute)typeElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeElement_Parent()
  {
    return (EReference)typeElementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPrimitive()
  {
    return primitiveEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getType()
  {
    return typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getType_Attributes()
  {
    return (EReference)typeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getType_Operations()
  {
    return (EReference)typeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getType_Extension()
  {
    return (EReference)typeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeReference()
  {
    return typeReferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeExtension()
  {
    return typeExtensionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeExtension_Uid()
  {
    return (EAttribute)typeExtensionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeExtension_Source()
  {
    return (EReference)typeExtensionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeExtension_Target()
  {
    return (EReference)typeExtensionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttribute()
  {
    return attributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttribute_Uid()
  {
    return (EAttribute)attributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttribute_Name()
  {
    return (EAttribute)attributeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttribute_Pk()
  {
    return (EAttribute)attributeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAttribute_Parent()
  {
    return (EReference)attributeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOperation()
  {
    return operationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperation_Uid()
  {
    return (EAttribute)operationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperation_Name()
  {
    return (EAttribute)operationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperation_Parent()
  {
    return (EReference)operationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperation_Parameters()
  {
    return (EReference)operationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperation_ReturnValue()
  {
    return (EReference)operationEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameter()
  {
    return parameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameter_Uid()
  {
    return (EAttribute)parameterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameter_Name()
  {
    return (EAttribute)parameterEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameter_Order()
  {
    return (EAttribute)parameterEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameter_Parent()
  {
    return (EReference)parameterEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReturnValue()
  {
    return returnValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getReturnValue_Uid()
  {
    return (EAttribute)returnValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnumarator()
  {
    return enumaratorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnumarator_Values()
  {
    return (EReference)enumaratorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnumAttribute()
  {
    return enumAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEnumAttribute_Uid()
  {
    return (EAttribute)enumAttributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnumAttribute_Parent()
  {
    return (EReference)enumAttributeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEnumAttribute_Name()
  {
    return (EAttribute)enumAttributeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEnumAttribute_Value()
  {
    return (EAttribute)enumAttributeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypesRepository()
  {
    return typesRepositoryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypesRepository_Uid()
  {
    return (EAttribute)typesRepositoryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypesRepository_TypeDefinition()
  {
    return (EReference)typesRepositoryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypesRepository_Parent()
  {
    return (EReference)typesRepositoryEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypes()
  {
    return typesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypes_Uid()
  {
    return (EAttribute)typesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypes_Parent()
  {
    return (EReference)typesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypes_Name()
  {
    return (EAttribute)typesEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypes_Packages()
  {
    return (EReference)typesEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPackage()
  {
    return packageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPackage_Uid()
  {
    return (EAttribute)packageEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPackage_Name()
  {
    return (EAttribute)packageEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPackage_Typedefinition()
  {
    return (EReference)packageEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPackage_Parent()
  {
    return (EReference)packageEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUIPackage()
  {
    return uiPackageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUIPackage_Uid()
  {
    return (EAttribute)uiPackageEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUIPackage_Parent()
  {
    return (EReference)uiPackageEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUIPackage_Forms()
  {
    return (EReference)uiPackageEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getForm()
  {
    return formEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getForm_Uid()
  {
    return (EAttribute)formEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getForm_Name()
  {
    return (EAttribute)formEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getForm_View()
  {
    return (EReference)formEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getForm_Datacontrols()
  {
    return (EReference)formEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFormView()
  {
    return formViewEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFormView_Uid()
  {
    return (EAttribute)formViewEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFormView_Name()
  {
    return (EAttribute)formViewEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFormDataControls()
  {
    return formDataControlsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFormDataControls_Uid()
  {
    return (EAttribute)formDataControlsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFormDataControls_Name()
  {
    return (EAttribute)formDataControlsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFormDataControls_Control()
  {
    return (EReference)formDataControlsEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getControls()
  {
    return controlsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getControls_Uid()
  {
    return (EAttribute)controlsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getControls_Root()
  {
    return (EReference)controlsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getControls_Controls()
  {
    return (EReference)controlsEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getControls_Relations()
  {
    return (EReference)controlsEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTrigger()
  {
    return triggerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTrigger_Uid()
  {
    return (EAttribute)triggerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTrigger_Name()
  {
    return (EAttribute)triggerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTrigger_Parameters()
  {
    return (EReference)triggerEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTriggerParameter()
  {
    return triggerParameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTriggerParameter_Uid()
  {
    return (EAttribute)triggerParameterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTriggerParameter_Parameter()
  {
    return (EReference)triggerParameterEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTriggerParameter_Value()
  {
    return (EReference)triggerParameterEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getContextValue()
  {
    return contextValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContextValue_Uid()
  {
    return (EAttribute)contextValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContextValue_IsExpression()
  {
    return (EAttribute)contextValueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContextValue_Value()
  {
    return (EAttribute)contextValueEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPREFormTrigger()
  {
    return preFormTriggerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPREQueryTrigger()
  {
    return preQueryTriggerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPOSTQueryTrigger()
  {
    return postQueryTriggerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPREInsertTrigger()
  {
    return preInsertTriggerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPREDeleteTrigger()
  {
    return preDeleteTriggerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPOSTCreateTrigger()
  {
    return postCreateTriggerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPREUpdateTrigger()
  {
    return preUpdateTriggerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCreateTrigger()
  {
    return createTriggerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInsertTrigger()
  {
    return insertTriggerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUpdateTrigger()
  {
    return updateTriggerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeleteTrigger()
  {
    return deleteTriggerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSearchTrigger()
  {
    return searchTriggerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRoot()
  {
    return rootEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRoot_Uid()
  {
    return (EAttribute)rootEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRoot_Name()
  {
    return (EAttribute)rootEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRoot_PreFormTrigger()
  {
    return (EReference)rootEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataControl()
  {
    return dataControlEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDataControl_Uid()
  {
    return (EAttribute)dataControlEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDataControl_Name()
  {
    return (EAttribute)dataControlEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataControl_Parent()
  {
    return (EReference)dataControlEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataControl_PreQueryTrigger()
  {
    return (EReference)dataControlEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataControl_PostQueryTrigger()
  {
    return (EReference)dataControlEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataControl_PreInsertTrigger()
  {
    return (EReference)dataControlEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataControl_PreDeleteTrigger()
  {
    return (EReference)dataControlEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataControl_PostCreateTrigger()
  {
    return (EReference)dataControlEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataControl_PreUpdateTrigger()
  {
    return (EReference)dataControlEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataControl_ArtificialFields()
  {
    return (EReference)dataControlEClass.getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataControl_Create()
  {
    return (EReference)dataControlEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataControl_Insert()
  {
    return (EReference)dataControlEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataControl_Update()
  {
    return (EReference)dataControlEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataControl_Remove()
  {
    return (EReference)dataControlEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataControl_Search()
  {
    return (EReference)dataControlEClass.getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRelation()
  {
    return relationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRelation_Uid()
  {
    return (EAttribute)relationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRelation_Name()
  {
    return (EAttribute)relationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelation_Master()
  {
    return (EReference)relationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelation_Detail()
  {
    return (EReference)relationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRelation_IsTree()
  {
    return (EAttribute)relationEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelation_Links()
  {
    return (EReference)relationEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArtificialField()
  {
    return artificialFieldEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArtificialField_Uid()
  {
    return (EAttribute)artificialFieldEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArtificialField_Name()
  {
    return (EAttribute)artificialFieldEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArtificialField_Parent()
  {
    return (EReference)artificialFieldEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLink()
  {
    return linkEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLink_Uid()
  {
    return (EAttribute)linkEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLink_Parent()
  {
    return (EReference)linkEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLink_MasterField()
  {
    return (EReference)linkEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLink_DetailField()
  {
    return (EReference)linkEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getApplicationInfrastructureLayer()
  {
    return applicationInfrastructureLayerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getApplicationInfrastructureLayer_Uid()
  {
    return (EAttribute)applicationInfrastructureLayerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getApplicationInfrastructureLayer_Name()
  {
    return (EAttribute)applicationInfrastructureLayerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getApplicationInfrastructureLayer_Parent()
  {
    return (EReference)applicationInfrastructureLayerEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getApplicationInfrastructureLayer_Infarastructure()
  {
    return (EReference)applicationInfrastructureLayerEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnterpriseInfrastructure()
  {
    return enterpriseInfrastructureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEnterpriseInfrastructure_Uid()
  {
    return (EAttribute)enterpriseInfrastructureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnterpriseInfrastructure_Parent()
  {
    return (EReference)enterpriseInfrastructureEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnterpriseInfrastructure_Datacenters()
  {
    return (EReference)enterpriseInfrastructureEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnterpriseInfrastructure_InfrastructureConnections()
  {
    return (EReference)enterpriseInfrastructureEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDatacenter()
  {
    return datacenterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDatacenter_Uid()
  {
    return (EAttribute)datacenterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDatacenter_Parent()
  {
    return (EReference)datacenterEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDatacenter_Subsystems()
  {
    return (EReference)datacenterEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDatacenter_Name()
  {
    return (EAttribute)datacenterEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSubsystem()
  {
    return subsystemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSubsystem_Uid()
  {
    return (EAttribute)subsystemEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSubsystem_Name()
  {
    return (EAttribute)subsystemEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubsystem_Parent()
  {
    return (EReference)subsystemEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubsystem_InfrastructureLayer()
  {
    return (EReference)subsystemEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInfrastructureLayer()
  {
    return infrastructureLayerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInfrastructureLayer_Uid()
  {
    return (EAttribute)infrastructureLayerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInfrastructureLayer_Name()
  {
    return (EAttribute)infrastructureLayerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInfrastructureLayer_Parent()
  {
    return (EReference)infrastructureLayerEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInfrastructureLayer_InfrastructureComponent()
  {
    return (EReference)infrastructureLayerEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInfrastructureConnection()
  {
    return infrastructureConnectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInfrastructureConnection_Uid()
  {
    return (EAttribute)infrastructureConnectionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInfrastructureConnection_Master()
  {
    return (EReference)infrastructureConnectionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInfrastructureConnection_Detail()
  {
    return (EReference)infrastructureConnectionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInfrastructureComponent()
  {
    return infrastructureComponentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInfrastructureComponent_Uid()
  {
    return (EAttribute)infrastructureComponentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInfrastructureComponent_Name()
  {
    return (EAttribute)infrastructureComponentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInfrastructureComponent_Parent()
  {
    return (EReference)infrastructureComponentEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getServer()
  {
    return serverEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRouter()
  {
    return routerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHub()
  {
    return hubEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStorage()
  {
    return storageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getServerClaster()
  {
    return serverClasterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getServerClaster_Servers()
  {
    return (EReference)serverClasterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getPlatformLayers()
  {
    return platformLayersEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomainFactory getDomainFactory()
  {
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
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    domainEClass = createEClass(DOMAIN);
    createEAttribute(domainEClass, DOMAIN__UID);
    createEReference(domainEClass, DOMAIN__DOMAIN_ARTIFACTS);
    createEReference(domainEClass, DOMAIN__DOMAIN_TYPES);
    createEReference(domainEClass, DOMAIN__DOMAIN_APPLICATIONS);

    htmlLayerHolderEClass = createEClass(HTML_LAYER_HOLDER);
    createEAttribute(htmlLayerHolderEClass, HTML_LAYER_HOLDER__COLUMNS);

    domainArtifactsEClass = createEClass(DOMAIN_ARTIFACTS);
    createEAttribute(domainArtifactsEClass, DOMAIN_ARTIFACTS__UID);
    createEAttribute(domainArtifactsEClass, DOMAIN_ARTIFACTS__NAME);
    createEReference(domainArtifactsEClass, DOMAIN_ARTIFACTS__PARENT);
    createEReference(domainArtifactsEClass, DOMAIN_ARTIFACTS__DOMAIN_ARTIFACT);

    domainTypesEClass = createEClass(DOMAIN_TYPES);
    createEAttribute(domainTypesEClass, DOMAIN_TYPES__UID);
    createEAttribute(domainTypesEClass, DOMAIN_TYPES__NAME);
    createEReference(domainTypesEClass, DOMAIN_TYPES__TYPESREPOSITORY);
    createEReference(domainTypesEClass, DOMAIN_TYPES__PARENT);

    domainApplicationsEClass = createEClass(DOMAIN_APPLICATIONS);
    createEAttribute(domainApplicationsEClass, DOMAIN_APPLICATIONS__UID);
    createEAttribute(domainApplicationsEClass, DOMAIN_APPLICATIONS__NAME);
    createEReference(domainApplicationsEClass, DOMAIN_APPLICATIONS__APPLICATIONS);
    createEReference(domainApplicationsEClass, DOMAIN_APPLICATIONS__PARENT);

    domainApplicationEClass = createEClass(DOMAIN_APPLICATION);
    createEAttribute(domainApplicationEClass, DOMAIN_APPLICATION__UID);
    createEAttribute(domainApplicationEClass, DOMAIN_APPLICATION__NAME);
    createEReference(domainApplicationEClass, DOMAIN_APPLICATION__APPLICATION);
    createEReference(domainApplicationEClass, DOMAIN_APPLICATION__PARENT);

    domainArtifactEClass = createEClass(DOMAIN_ARTIFACT);
    createEAttribute(domainArtifactEClass, DOMAIN_ARTIFACT__UID);
    createEAttribute(domainArtifactEClass, DOMAIN_ARTIFACT__NAME);
    createEReference(domainArtifactEClass, DOMAIN_ARTIFACT__PARENT);
    createEReference(domainArtifactEClass, DOMAIN_ARTIFACT__ARTIFACT);

    ormEntityEClass = createEClass(ORM_ENTITY);

    jpaServiceEClass = createEClass(JPA_SERVICE);

    ejbServiceEClass = createEClass(EJB_SERVICE);

    continuousIintegrationEClass = createEClass(CONTINUOUS_IINTEGRATION);

    artifactsEClass = createEClass(ARTIFACTS);
    createEAttribute(artifactsEClass, ARTIFACTS__UID);
    createEReference(artifactsEClass, ARTIFACTS__ARTIFACTS);
    createEReference(artifactsEClass, ARTIFACTS__PARENT);

    artifactEClass = createEClass(ARTIFACT);
    createEAttribute(artifactEClass, ARTIFACT__UID);
    createEAttribute(artifactEClass, ARTIFACT__NAME);
    createEAttribute(artifactEClass, ARTIFACT__DESCRIPTION);
    createEReference(artifactEClass, ARTIFACT__PARENT);
    createEReference(artifactEClass, ARTIFACT__CONFIG_VARIABLES);
    createEReference(artifactEClass, ARTIFACT__MODEL_QUERY);
    createEReference(artifactEClass, ARTIFACT__SPECIFIERS);
    createEAttribute(artifactEClass, ARTIFACT__TEMPLATE);

    configVariableEClass = createEClass(CONFIG_VARIABLE);
    createEAttribute(configVariableEClass, CONFIG_VARIABLE__UID);
    createEAttribute(configVariableEClass, CONFIG_VARIABLE__NAME);
    createEReference(configVariableEClass, CONFIG_VARIABLE__PARENT);

    modelQueryEClass = createEClass(MODEL_QUERY);
    createEAttribute(modelQueryEClass, MODEL_QUERY__UID);
    createEAttribute(modelQueryEClass, MODEL_QUERY__NAME);
    createEAttribute(modelQueryEClass, MODEL_QUERY__QUERY);
    createEReference(modelQueryEClass, MODEL_QUERY__PARENT);
    createEReference(modelQueryEClass, MODEL_QUERY__PARAMETERS);

    queryParameterEClass = createEClass(QUERY_PARAMETER);
    createEAttribute(queryParameterEClass, QUERY_PARAMETER__UID);
    createEReference(queryParameterEClass, QUERY_PARAMETER__PARENT);
    createEAttribute(queryParameterEClass, QUERY_PARAMETER__NAME);

    specifierEClass = createEClass(SPECIFIER);
    createEAttribute(specifierEClass, SPECIFIER__UID);
    createEAttribute(specifierEClass, SPECIFIER__NAME);
    createEReference(specifierEClass, SPECIFIER__PARENT);
    createEReference(specifierEClass, SPECIFIER__OPTIONS);

    optionEClass = createEClass(OPTION);
    createEAttribute(optionEClass, OPTION__UID);
    createEReference(optionEClass, OPTION__PARENT);
    createEAttribute(optionEClass, OPTION__VALUE);

    applicationEClass = createEClass(APPLICATION);
    createEAttribute(applicationEClass, APPLICATION__UID);
    createEReference(applicationEClass, APPLICATION__APPLICATION_RECIPES);
    createEReference(applicationEClass, APPLICATION__APPLICATION_MAPPERS);
    createEReference(applicationEClass, APPLICATION__APPLICATION_UI_LAYER);
    createEReference(applicationEClass, APPLICATION__APPLICATION_INFRASTRUCTURE_LAYER);
    createEReference(applicationEClass, APPLICATION__PARENT);

    applicationUILayerEClass = createEClass(APPLICATION_UI_LAYER);
    createEAttribute(applicationUILayerEClass, APPLICATION_UI_LAYER__UID);
    createEAttribute(applicationUILayerEClass, APPLICATION_UI_LAYER__NAME);
    createEReference(applicationUILayerEClass, APPLICATION_UI_LAYER__PARENT);
    createEReference(applicationUILayerEClass, APPLICATION_UI_LAYER__APPLICATION_UI_PACKAGES);

    applicationUIPackageEClass = createEClass(APPLICATION_UI_PACKAGE);
    createEAttribute(applicationUIPackageEClass, APPLICATION_UI_PACKAGE__UID);
    createEAttribute(applicationUIPackageEClass, APPLICATION_UI_PACKAGE__NAME);
    createEReference(applicationUIPackageEClass, APPLICATION_UI_PACKAGE__PARENT);
    createEReference(applicationUIPackageEClass, APPLICATION_UI_PACKAGE__UIPACKAGE);

    applicationRecipesEClass = createEClass(APPLICATION_RECIPES);
    createEAttribute(applicationRecipesEClass, APPLICATION_RECIPES__UID);
    createEAttribute(applicationRecipesEClass, APPLICATION_RECIPES__NAME);
    createEReference(applicationRecipesEClass, APPLICATION_RECIPES__PARENT);
    createEReference(applicationRecipesEClass, APPLICATION_RECIPES__RECIPES);

    applicationRecipeEClass = createEClass(APPLICATION_RECIPE);
    createEAttribute(applicationRecipeEClass, APPLICATION_RECIPE__UID);
    createEAttribute(applicationRecipeEClass, APPLICATION_RECIPE__NAME);
    createEReference(applicationRecipeEClass, APPLICATION_RECIPE__RECIPES);
    createEReference(applicationRecipeEClass, APPLICATION_RECIPE__PARENT);

    applicationMappersEClass = createEClass(APPLICATION_MAPPERS);
    createEAttribute(applicationMappersEClass, APPLICATION_MAPPERS__UID);
    createEAttribute(applicationMappersEClass, APPLICATION_MAPPERS__NAME);
    createEReference(applicationMappersEClass, APPLICATION_MAPPERS__PARENT);
    createEReference(applicationMappersEClass, APPLICATION_MAPPERS__MAPPERS);

    applicationMapperEClass = createEClass(APPLICATION_MAPPER);
    createEAttribute(applicationMapperEClass, APPLICATION_MAPPER__UID);
    createEAttribute(applicationMapperEClass, APPLICATION_MAPPER__NAME);
    createEReference(applicationMapperEClass, APPLICATION_MAPPER__MAPPER);
    createEReference(applicationMapperEClass, APPLICATION_MAPPER__PARENT);

    methodPointerEClass = createEClass(METHOD_POINTER);
    createEReference(methodPointerEClass, METHOD_POINTER__METHOD_REF);
    createEAttribute(methodPointerEClass, METHOD_POINTER__FAKE_METHOD);

    mappersEClass = createEClass(MAPPERS);
    createEAttribute(mappersEClass, MAPPERS__UID);
    createEReference(mappersEClass, MAPPERS__MAPPERS);
    createEReference(mappersEClass, MAPPERS__PARENT);

    mapperEClass = createEClass(MAPPER);
    createEAttribute(mapperEClass, MAPPER__UID);
    createEReference(mapperEClass, MAPPER__PARENT);
    createEAttribute(mapperEClass, MAPPER__SERVICE_LAYER);
    createEAttribute(mapperEClass, MAPPER__UI_LAYER);

    javaMapperEClass = createEClass(JAVA_MAPPER);
    createEAttribute(javaMapperEClass, JAVA_MAPPER__MAPPED_TO_PACKAGE_NAME);
    createEAttribute(javaMapperEClass, JAVA_MAPPER__MAPPED_TO_CLASS_NAME);
    createEAttribute(javaMapperEClass, JAVA_MAPPER__ARTIFACT_ID);
    createEAttribute(javaMapperEClass, JAVA_MAPPER__GROUP_ID);
    createEAttribute(javaMapperEClass, JAVA_MAPPER__VERSION);
    createEAttribute(javaMapperEClass, JAVA_MAPPER__LIBRARY_NAME);

    recipesEClass = createEClass(RECIPES);
    createEAttribute(recipesEClass, RECIPES__UID);
    createEReference(recipesEClass, RECIPES__RECIPE);
    createEReference(recipesEClass, RECIPES__CONFIGURATIONS);
    createEReference(recipesEClass, RECIPES__INFRASTRUCTURES);
    createEReference(recipesEClass, RECIPES__PARENT);
    createEReference(recipesEClass, RECIPES__DEPLOYMENT);

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
    createEReference(deploymentComponentEClass, DEPLOYMENT_COMPONENT__DEPLYMENT_COMPONENT);

    deploymentStarStepEClass = createEClass(DEPLOYMENT_STAR_STEP);
    createEAttribute(deploymentStarStepEClass, DEPLOYMENT_STAR_STEP__UID);
    createEAttribute(deploymentStarStepEClass, DEPLOYMENT_STAR_STEP__NAME);
    createEReference(deploymentStarStepEClass, DEPLOYMENT_STAR_STEP__FIRST_STEP);

    usingMappersEClass = createEClass(USING_MAPPERS);
    createEReference(usingMappersEClass, USING_MAPPERS__MAPPERS);

    recipeEClass = createEClass(RECIPE);
    createEAttribute(recipeEClass, RECIPE__UID);
    createEReference(recipeEClass, RECIPE__PARENT);
    createEAttribute(recipeEClass, RECIPE__NAME);
    createEReference(recipeEClass, RECIPE__INGREDIENTS);
    createEReference(recipeEClass, RECIPE__INFRASTRUCTURES);
    createEReference(recipeEClass, RECIPE__DELOYMENT);

    ingredientEClass = createEClass(INGREDIENT);
    createEAttribute(ingredientEClass, INGREDIENT__UID);
    createEAttribute(ingredientEClass, INGREDIENT__NAME);
    createEReference(ingredientEClass, INGREDIENT__PARENT);
    createEReference(ingredientEClass, INGREDIENT__COMPONENTS);
    createEAttribute(ingredientEClass, INGREDIENT__LAYER);

    componentEClass = createEClass(COMPONENT);
    createEAttribute(componentEClass, COMPONENT__UID);
    createEAttribute(componentEClass, COMPONENT__NAME);
    createEReference(componentEClass, COMPONENT__PARENT);
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
    createEReference(configurationEClass, CONFIGURATION__CONFIG_EXTENSION);
    createEReference(configurationEClass, CONFIGURATION__PARENT);

    modelMapperEClass = createEClass(MODEL_MAPPER);
    createEAttribute(modelMapperEClass, MODEL_MAPPER__NAME);
    createEReference(modelMapperEClass, MODEL_MAPPER__PARENT);
    createEReference(modelMapperEClass, MODEL_MAPPER__SPECIFIERS);
    createEReference(modelMapperEClass, MODEL_MAPPER__QUERIES);
    createEAttribute(modelMapperEClass, MODEL_MAPPER__ARTIFACT_EXECUTION_STRING);

    propertyEClass = createEClass(PROPERTY);
    createEAttribute(propertyEClass, PROPERTY__UID);
    createEReference(propertyEClass, PROPERTY__CONF_VAR_REF);
    createEAttribute(propertyEClass, PROPERTY__VALUE);
    createEAttribute(propertyEClass, PROPERTY__FAKE_NAME);

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
    createEAttribute(queryEClass, QUERY__GROUP_CODE);

    queryVariableEClass = createEClass(QUERY_VARIABLE);
    createEAttribute(queryVariableEClass, QUERY_VARIABLE__UID);
    createEReference(queryVariableEClass, QUERY_VARIABLE__QUERY_PARAM_REF);
    createEAttribute(queryVariableEClass, QUERY_VARIABLE__VALUE);

    artifactRefEClass = createEClass(ARTIFACT_REF);
    createEAttribute(artifactRefEClass, ARTIFACT_REF__UID);
    createEReference(artifactRefEClass, ARTIFACT_REF__DOMAIN_ARTIFACT_REF);
    createEReference(artifactRefEClass, ARTIFACT_REF__ARTIFACT_REF);

    typePointerEClass = createEClass(TYPE_POINTER);
    createEReference(typePointerEClass, TYPE_POINTER__PACKAGE_REF);
    createEReference(typePointerEClass, TYPE_POINTER__TYPE_REF);
    createEAttribute(typePointerEClass, TYPE_POINTER__FAKE_PACKAGE_NAME);
    createEAttribute(typePointerEClass, TYPE_POINTER__FAKE_TYPE_NAME);

    typeDefinitionEClass = createEClass(TYPE_DEFINITION);
    createEAttribute(typeDefinitionEClass, TYPE_DEFINITION__UID);
    createEReference(typeDefinitionEClass, TYPE_DEFINITION__TYPES);
    createEReference(typeDefinitionEClass, TYPE_DEFINITION__PARENT);

    typeElementEClass = createEClass(TYPE_ELEMENT);
    createEAttribute(typeElementEClass, TYPE_ELEMENT__UID);
    createEAttribute(typeElementEClass, TYPE_ELEMENT__NAME);
    createEReference(typeElementEClass, TYPE_ELEMENT__PARENT);

    primitiveEClass = createEClass(PRIMITIVE);

    typeEClass = createEClass(TYPE);
    createEReference(typeEClass, TYPE__ATTRIBUTES);
    createEReference(typeEClass, TYPE__OPERATIONS);
    createEReference(typeEClass, TYPE__EXTENSION);

    typeReferenceEClass = createEClass(TYPE_REFERENCE);

    typeExtensionEClass = createEClass(TYPE_EXTENSION);
    createEAttribute(typeExtensionEClass, TYPE_EXTENSION__UID);
    createEReference(typeExtensionEClass, TYPE_EXTENSION__SOURCE);
    createEReference(typeExtensionEClass, TYPE_EXTENSION__TARGET);

    attributeEClass = createEClass(ATTRIBUTE);
    createEAttribute(attributeEClass, ATTRIBUTE__UID);
    createEAttribute(attributeEClass, ATTRIBUTE__NAME);
    createEAttribute(attributeEClass, ATTRIBUTE__PK);
    createEReference(attributeEClass, ATTRIBUTE__PARENT);

    operationEClass = createEClass(OPERATION);
    createEAttribute(operationEClass, OPERATION__UID);
    createEAttribute(operationEClass, OPERATION__NAME);
    createEReference(operationEClass, OPERATION__PARENT);
    createEReference(operationEClass, OPERATION__PARAMETERS);
    createEReference(operationEClass, OPERATION__RETURN_VALUE);

    parameterEClass = createEClass(PARAMETER);
    createEAttribute(parameterEClass, PARAMETER__UID);
    createEAttribute(parameterEClass, PARAMETER__NAME);
    createEAttribute(parameterEClass, PARAMETER__ORDER);
    createEReference(parameterEClass, PARAMETER__PARENT);

    returnValueEClass = createEClass(RETURN_VALUE);
    createEAttribute(returnValueEClass, RETURN_VALUE__UID);

    enumaratorEClass = createEClass(ENUMARATOR);
    createEReference(enumaratorEClass, ENUMARATOR__VALUES);

    enumAttributeEClass = createEClass(ENUM_ATTRIBUTE);
    createEAttribute(enumAttributeEClass, ENUM_ATTRIBUTE__UID);
    createEReference(enumAttributeEClass, ENUM_ATTRIBUTE__PARENT);
    createEAttribute(enumAttributeEClass, ENUM_ATTRIBUTE__NAME);
    createEAttribute(enumAttributeEClass, ENUM_ATTRIBUTE__VALUE);

    typesRepositoryEClass = createEClass(TYPES_REPOSITORY);
    createEAttribute(typesRepositoryEClass, TYPES_REPOSITORY__UID);
    createEReference(typesRepositoryEClass, TYPES_REPOSITORY__TYPE_DEFINITION);
    createEReference(typesRepositoryEClass, TYPES_REPOSITORY__PARENT);

    typesEClass = createEClass(TYPES);
    createEAttribute(typesEClass, TYPES__UID);
    createEReference(typesEClass, TYPES__PARENT);
    createEAttribute(typesEClass, TYPES__NAME);
    createEReference(typesEClass, TYPES__PACKAGES);

    packageEClass = createEClass(PACKAGE);
    createEAttribute(packageEClass, PACKAGE__UID);
    createEAttribute(packageEClass, PACKAGE__NAME);
    createEReference(packageEClass, PACKAGE__TYPEDEFINITION);
    createEReference(packageEClass, PACKAGE__PARENT);

    uiPackageEClass = createEClass(UI_PACKAGE);
    createEAttribute(uiPackageEClass, UI_PACKAGE__UID);
    createEReference(uiPackageEClass, UI_PACKAGE__PARENT);
    createEReference(uiPackageEClass, UI_PACKAGE__FORMS);

    formEClass = createEClass(FORM);
    createEAttribute(formEClass, FORM__UID);
    createEAttribute(formEClass, FORM__NAME);
    createEReference(formEClass, FORM__VIEW);
    createEReference(formEClass, FORM__DATACONTROLS);

    formViewEClass = createEClass(FORM_VIEW);
    createEAttribute(formViewEClass, FORM_VIEW__UID);
    createEAttribute(formViewEClass, FORM_VIEW__NAME);

    formDataControlsEClass = createEClass(FORM_DATA_CONTROLS);
    createEAttribute(formDataControlsEClass, FORM_DATA_CONTROLS__UID);
    createEAttribute(formDataControlsEClass, FORM_DATA_CONTROLS__NAME);
    createEReference(formDataControlsEClass, FORM_DATA_CONTROLS__CONTROL);

    controlsEClass = createEClass(CONTROLS);
    createEAttribute(controlsEClass, CONTROLS__UID);
    createEReference(controlsEClass, CONTROLS__ROOT);
    createEReference(controlsEClass, CONTROLS__CONTROLS);
    createEReference(controlsEClass, CONTROLS__RELATIONS);

    triggerEClass = createEClass(TRIGGER);
    createEAttribute(triggerEClass, TRIGGER__UID);
    createEAttribute(triggerEClass, TRIGGER__NAME);
    createEReference(triggerEClass, TRIGGER__PARAMETERS);

    triggerParameterEClass = createEClass(TRIGGER_PARAMETER);
    createEAttribute(triggerParameterEClass, TRIGGER_PARAMETER__UID);
    createEReference(triggerParameterEClass, TRIGGER_PARAMETER__PARAMETER);
    createEReference(triggerParameterEClass, TRIGGER_PARAMETER__VALUE);

    contextValueEClass = createEClass(CONTEXT_VALUE);
    createEAttribute(contextValueEClass, CONTEXT_VALUE__UID);
    createEAttribute(contextValueEClass, CONTEXT_VALUE__IS_EXPRESSION);
    createEAttribute(contextValueEClass, CONTEXT_VALUE__VALUE);

    preFormTriggerEClass = createEClass(PRE_FORM_TRIGGER);

    preQueryTriggerEClass = createEClass(PRE_QUERY_TRIGGER);

    postQueryTriggerEClass = createEClass(POST_QUERY_TRIGGER);

    preInsertTriggerEClass = createEClass(PRE_INSERT_TRIGGER);

    preDeleteTriggerEClass = createEClass(PRE_DELETE_TRIGGER);

    postCreateTriggerEClass = createEClass(POST_CREATE_TRIGGER);

    preUpdateTriggerEClass = createEClass(PRE_UPDATE_TRIGGER);

    createTriggerEClass = createEClass(CREATE_TRIGGER);

    insertTriggerEClass = createEClass(INSERT_TRIGGER);

    updateTriggerEClass = createEClass(UPDATE_TRIGGER);

    deleteTriggerEClass = createEClass(DELETE_TRIGGER);

    searchTriggerEClass = createEClass(SEARCH_TRIGGER);

    rootEClass = createEClass(ROOT);
    createEAttribute(rootEClass, ROOT__UID);
    createEAttribute(rootEClass, ROOT__NAME);
    createEReference(rootEClass, ROOT__PRE_FORM_TRIGGER);

    dataControlEClass = createEClass(DATA_CONTROL);
    createEAttribute(dataControlEClass, DATA_CONTROL__UID);
    createEAttribute(dataControlEClass, DATA_CONTROL__NAME);
    createEReference(dataControlEClass, DATA_CONTROL__PARENT);
    createEReference(dataControlEClass, DATA_CONTROL__PRE_QUERY_TRIGGER);
    createEReference(dataControlEClass, DATA_CONTROL__POST_QUERY_TRIGGER);
    createEReference(dataControlEClass, DATA_CONTROL__PRE_INSERT_TRIGGER);
    createEReference(dataControlEClass, DATA_CONTROL__PRE_DELETE_TRIGGER);
    createEReference(dataControlEClass, DATA_CONTROL__POST_CREATE_TRIGGER);
    createEReference(dataControlEClass, DATA_CONTROL__PRE_UPDATE_TRIGGER);
    createEReference(dataControlEClass, DATA_CONTROL__CREATE);
    createEReference(dataControlEClass, DATA_CONTROL__INSERT);
    createEReference(dataControlEClass, DATA_CONTROL__UPDATE);
    createEReference(dataControlEClass, DATA_CONTROL__REMOVE);
    createEReference(dataControlEClass, DATA_CONTROL__SEARCH);
    createEReference(dataControlEClass, DATA_CONTROL__ARTIFICIAL_FIELDS);

    relationEClass = createEClass(RELATION);
    createEAttribute(relationEClass, RELATION__UID);
    createEAttribute(relationEClass, RELATION__NAME);
    createEReference(relationEClass, RELATION__MASTER);
    createEReference(relationEClass, RELATION__DETAIL);
    createEAttribute(relationEClass, RELATION__IS_TREE);
    createEReference(relationEClass, RELATION__LINKS);

    artificialFieldEClass = createEClass(ARTIFICIAL_FIELD);
    createEAttribute(artificialFieldEClass, ARTIFICIAL_FIELD__UID);
    createEAttribute(artificialFieldEClass, ARTIFICIAL_FIELD__NAME);
    createEReference(artificialFieldEClass, ARTIFICIAL_FIELD__PARENT);

    linkEClass = createEClass(LINK);
    createEAttribute(linkEClass, LINK__UID);
    createEReference(linkEClass, LINK__PARENT);
    createEReference(linkEClass, LINK__MASTER_FIELD);
    createEReference(linkEClass, LINK__DETAIL_FIELD);

    applicationInfrastructureLayerEClass = createEClass(APPLICATION_INFRASTRUCTURE_LAYER);
    createEAttribute(applicationInfrastructureLayerEClass, APPLICATION_INFRASTRUCTURE_LAYER__UID);
    createEAttribute(applicationInfrastructureLayerEClass, APPLICATION_INFRASTRUCTURE_LAYER__NAME);
    createEReference(applicationInfrastructureLayerEClass, APPLICATION_INFRASTRUCTURE_LAYER__PARENT);
    createEReference(applicationInfrastructureLayerEClass, APPLICATION_INFRASTRUCTURE_LAYER__INFARASTRUCTURE);

    enterpriseInfrastructureEClass = createEClass(ENTERPRISE_INFRASTRUCTURE);
    createEAttribute(enterpriseInfrastructureEClass, ENTERPRISE_INFRASTRUCTURE__UID);
    createEReference(enterpriseInfrastructureEClass, ENTERPRISE_INFRASTRUCTURE__PARENT);
    createEReference(enterpriseInfrastructureEClass, ENTERPRISE_INFRASTRUCTURE__DATACENTERS);
    createEReference(enterpriseInfrastructureEClass, ENTERPRISE_INFRASTRUCTURE__INFRASTRUCTURE_CONNECTIONS);

    datacenterEClass = createEClass(DATACENTER);
    createEAttribute(datacenterEClass, DATACENTER__UID);
    createEReference(datacenterEClass, DATACENTER__PARENT);
    createEReference(datacenterEClass, DATACENTER__SUBSYSTEMS);
    createEAttribute(datacenterEClass, DATACENTER__NAME);

    subsystemEClass = createEClass(SUBSYSTEM);
    createEAttribute(subsystemEClass, SUBSYSTEM__UID);
    createEAttribute(subsystemEClass, SUBSYSTEM__NAME);
    createEReference(subsystemEClass, SUBSYSTEM__PARENT);
    createEReference(subsystemEClass, SUBSYSTEM__INFRASTRUCTURE_LAYER);

    infrastructureLayerEClass = createEClass(INFRASTRUCTURE_LAYER);
    createEAttribute(infrastructureLayerEClass, INFRASTRUCTURE_LAYER__UID);
    createEAttribute(infrastructureLayerEClass, INFRASTRUCTURE_LAYER__NAME);
    createEReference(infrastructureLayerEClass, INFRASTRUCTURE_LAYER__PARENT);
    createEReference(infrastructureLayerEClass, INFRASTRUCTURE_LAYER__INFRASTRUCTURE_COMPONENT);

    infrastructureConnectionEClass = createEClass(INFRASTRUCTURE_CONNECTION);
    createEAttribute(infrastructureConnectionEClass, INFRASTRUCTURE_CONNECTION__UID);
    createEReference(infrastructureConnectionEClass, INFRASTRUCTURE_CONNECTION__MASTER);
    createEReference(infrastructureConnectionEClass, INFRASTRUCTURE_CONNECTION__DETAIL);

    infrastructureComponentEClass = createEClass(INFRASTRUCTURE_COMPONENT);
    createEAttribute(infrastructureComponentEClass, INFRASTRUCTURE_COMPONENT__UID);
    createEAttribute(infrastructureComponentEClass, INFRASTRUCTURE_COMPONENT__NAME);
    createEReference(infrastructureComponentEClass, INFRASTRUCTURE_COMPONENT__PARENT);

    serverEClass = createEClass(SERVER);

    routerEClass = createEClass(ROUTER);

    hubEClass = createEClass(HUB);

    storageEClass = createEClass(STORAGE);

    serverClasterEClass = createEClass(SERVER_CLASTER);
    createEReference(serverClasterEClass, SERVER_CLASTER__SERVERS);

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
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    domainArtifactsEClass.getESuperTypes().add(this.getHTMLLayerHolder());
    domainApplicationsEClass.getESuperTypes().add(this.getHTMLLayerHolder());
    ormEntityEClass.getESuperTypes().add(this.getDomainArtifact());
    jpaServiceEClass.getESuperTypes().add(this.getDomainArtifact());
    ejbServiceEClass.getESuperTypes().add(this.getDomainArtifact());
    continuousIintegrationEClass.getESuperTypes().add(this.getDomainArtifact());
    applicationRecipesEClass.getESuperTypes().add(this.getHTMLLayerHolder());
    applicationMappersEClass.getESuperTypes().add(this.getHTMLLayerHolder());
    methodPointerEClass.getESuperTypes().add(this.getTypePointer());
    mapperEClass.getESuperTypes().add(this.getTypePointer());
    javaMapperEClass.getESuperTypes().add(this.getMapper());
    recipeEClass.getESuperTypes().add(this.getUsingMappers());
    ingredientEClass.getESuperTypes().add(this.getUsingMappers());
    ingredientEClass.getESuperTypes().add(this.getHTMLLayerHolder());
    componentEClass.getESuperTypes().add(this.getHTMLLayerHolder());
    javaComponentEClass.getESuperTypes().add(this.getComponent());
    modelMapperEClass.getESuperTypes().add(this.getArtifactRef());
    primitiveEClass.getESuperTypes().add(this.getTypeElement());
    typeEClass.getESuperTypes().add(this.getTypeElement());
    typeReferenceEClass.getESuperTypes().add(this.getTypeElement());
    typeReferenceEClass.getESuperTypes().add(this.getTypePointer());
    attributeEClass.getESuperTypes().add(this.getTypePointer());
    parameterEClass.getESuperTypes().add(this.getTypePointer());
    returnValueEClass.getESuperTypes().add(this.getTypePointer());
    enumaratorEClass.getESuperTypes().add(this.getTypeElement());
    typesEClass.getESuperTypes().add(this.getHTMLLayerHolder());
    triggerEClass.getESuperTypes().add(this.getMethodPointer());
    preFormTriggerEClass.getESuperTypes().add(this.getTrigger());
    preQueryTriggerEClass.getESuperTypes().add(this.getTrigger());
    postQueryTriggerEClass.getESuperTypes().add(this.getTrigger());
    preInsertTriggerEClass.getESuperTypes().add(this.getTrigger());
    preDeleteTriggerEClass.getESuperTypes().add(this.getTrigger());
    postCreateTriggerEClass.getESuperTypes().add(this.getTrigger());
    preUpdateTriggerEClass.getESuperTypes().add(this.getTrigger());
    createTriggerEClass.getESuperTypes().add(this.getTrigger());
    insertTriggerEClass.getESuperTypes().add(this.getTrigger());
    updateTriggerEClass.getESuperTypes().add(this.getTrigger());
    deleteTriggerEClass.getESuperTypes().add(this.getTrigger());
    searchTriggerEClass.getESuperTypes().add(this.getTrigger());
    artificialFieldEClass.getESuperTypes().add(this.getTypePointer());
    datacenterEClass.getESuperTypes().add(this.getHTMLLayerHolder());
    serverEClass.getESuperTypes().add(this.getInfrastructureComponent());
    routerEClass.getESuperTypes().add(this.getInfrastructureComponent());
    hubEClass.getESuperTypes().add(this.getInfrastructureComponent());
    storageEClass.getESuperTypes().add(this.getInfrastructureComponent());
    serverClasterEClass.getESuperTypes().add(this.getInfrastructureComponent());

    // Initialize classes and features; add operations and parameters
    initEClass(domainEClass, Domain.class, "Domain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDomain_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDomain_DomainArtifacts(), this.getDomainArtifacts(), this.getDomainArtifacts_Parent(), "domainArtifacts", null, 1, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDomain_DomainTypes(), this.getDomainTypes(), this.getDomainTypes_Parent(), "domainTypes", null, 1, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDomain_DomainApplications(), this.getDomainApplications(), this.getDomainApplications_Parent(), "domainApplications", null, 1, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(htmlLayerHolderEClass, HTMLLayerHolder.class, "HTMLLayerHolder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getHTMLLayerHolder_Columns(), ecorePackage.getEInt(), "columns", "1", 0, 1, HTMLLayerHolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(domainArtifactsEClass, DomainArtifacts.class, "DomainArtifacts", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDomainArtifacts_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, DomainArtifacts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDomainArtifacts_Name(), ecorePackage.getEString(), "name", null, 0, 1, DomainArtifacts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDomainArtifacts_Parent(), this.getDomain(), this.getDomain_DomainArtifacts(), "parent", null, 0, 1, DomainArtifacts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDomainArtifacts_DomainArtifact(), this.getDomainArtifact(), this.getDomainArtifact_Parent(), "domainArtifact", null, 0, -1, DomainArtifacts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(domainTypesEClass, DomainTypes.class, "DomainTypes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDomainTypes_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, DomainTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDomainTypes_Name(), ecorePackage.getEString(), "name", null, 0, 1, DomainTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDomainTypes_Typesrepository(), this.getTypesRepository(), this.getTypesRepository_Parent(), "typesrepository", null, 0, 1, DomainTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDomainTypes_Parent(), this.getDomain(), this.getDomain_DomainTypes(), "parent", null, 0, 1, DomainTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(domainApplicationsEClass, DomainApplications.class, "DomainApplications", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDomainApplications_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, DomainApplications.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDomainApplications_Name(), ecorePackage.getEString(), "name", null, 0, 1, DomainApplications.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDomainApplications_Applications(), this.getDomainApplication(), this.getDomainApplication_Parent(), "applications", null, 0, -1, DomainApplications.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDomainApplications_Parent(), this.getDomain(), this.getDomain_DomainApplications(), "parent", null, 0, 1, DomainApplications.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(domainApplicationEClass, DomainApplication.class, "DomainApplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDomainApplication_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, DomainApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDomainApplication_Name(), ecorePackage.getEString(), "name", null, 0, 1, DomainApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDomainApplication_Application(), this.getApplication(), this.getApplication_Parent(), "application", null, 0, 1, DomainApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDomainApplication_Parent(), this.getDomainApplications(), this.getDomainApplications_Applications(), "parent", null, 0, 1, DomainApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(domainArtifactEClass, DomainArtifact.class, "DomainArtifact", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDomainArtifact_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, DomainArtifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDomainArtifact_Name(), ecorePackage.getEString(), "name", null, 0, 1, DomainArtifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDomainArtifact_Parent(), this.getDomainArtifacts(), this.getDomainArtifacts_DomainArtifact(), "parent", null, 0, 1, DomainArtifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDomainArtifact_Artifact(), this.getArtifacts(), this.getArtifacts_Parent(), "artifact", null, 0, 1, DomainArtifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ormEntityEClass, ORMEntity.class, "ORMEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(jpaServiceEClass, JPAService.class, "JPAService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(ejbServiceEClass, EJBService.class, "EJBService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(continuousIintegrationEClass, ContinuousIintegration.class, "ContinuousIintegration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(artifactsEClass, Artifacts.class, "Artifacts", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getArtifacts_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Artifacts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getArtifacts_Artifacts(), this.getArtifact(), this.getArtifact_Parent(), "artifacts", null, 0, -1, Artifacts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getArtifacts_Parent(), this.getDomainArtifact(), this.getDomainArtifact_Artifact(), "parent", null, 0, 1, Artifacts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(artifactEClass, Artifact.class, "Artifact", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getArtifact_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getArtifact_Name(), ecorePackage.getEString(), "name", null, 0, 1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getArtifact_Description(), ecorePackage.getEString(), "description", null, 0, 1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getArtifact_Parent(), this.getArtifacts(), this.getArtifacts_Artifacts(), "parent", null, 0, 1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getArtifact_ConfigVariables(), this.getConfigVariable(), this.getConfigVariable_Parent(), "configVariables", null, 0, -1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getArtifact_ModelQuery(), this.getModelQuery(), this.getModelQuery_Parent(), "modelQuery", null, 0, -1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getArtifact_Specifiers(), this.getSpecifier(), this.getSpecifier_Parent(), "specifiers", null, 0, -1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getArtifact_Template(), ecorePackage.getEString(), "template", null, 0, 1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(configVariableEClass, ConfigVariable.class, "ConfigVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getConfigVariable_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, ConfigVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConfigVariable_Name(), ecorePackage.getEString(), "name", null, 0, 1, ConfigVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConfigVariable_Parent(), this.getArtifact(), this.getArtifact_ConfigVariables(), "parent", null, 0, 1, ConfigVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(modelQueryEClass, ModelQuery.class, "ModelQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getModelQuery_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, ModelQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getModelQuery_Name(), ecorePackage.getEString(), "name", null, 0, 1, ModelQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getModelQuery_Query(), ecorePackage.getEString(), "query", null, 0, 1, ModelQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelQuery_Parent(), this.getArtifact(), this.getArtifact_ModelQuery(), "parent", null, 0, 1, ModelQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelQuery_Parameters(), this.getQueryParameter(), this.getQueryParameter_Parent(), "parameters", null, 0, -1, ModelQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(queryParameterEClass, QueryParameter.class, "QueryParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getQueryParameter_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, QueryParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getQueryParameter_Parent(), this.getModelQuery(), this.getModelQuery_Parameters(), "parent", null, 0, 1, QueryParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getQueryParameter_Name(), ecorePackage.getEString(), "name", null, 0, 1, QueryParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(specifierEClass, Specifier.class, "Specifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSpecifier_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Specifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSpecifier_Name(), ecorePackage.getEString(), "name", null, 0, 1, Specifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSpecifier_Parent(), this.getArtifact(), this.getArtifact_Specifiers(), "parent", null, 0, 1, Specifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSpecifier_Options(), this.getOption(), this.getOption_Parent(), "options", null, 1, -1, Specifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(optionEClass, Option.class, "Option", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOption_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOption_Parent(), this.getSpecifier(), this.getSpecifier_Options(), "parent", null, 0, 1, Option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOption_Value(), ecorePackage.getEString(), "value", null, 0, 1, Option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(applicationEClass, Application.class, "Application", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getApplication_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getApplication_ApplicationRecipes(), this.getApplicationRecipes(), this.getApplicationRecipes_Parent(), "applicationRecipes", null, 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getApplication_ApplicationMappers(), this.getApplicationMappers(), this.getApplicationMappers_Parent(), "applicationMappers", null, 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getApplication_ApplicationUILayer(), this.getApplicationUILayer(), this.getApplicationUILayer_Parent(), "applicationUILayer", null, 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getApplication_ApplicationInfrastructureLayer(), this.getApplicationInfrastructureLayer(), this.getApplicationInfrastructureLayer_Parent(), "applicationInfrastructureLayer", null, 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getApplication_Parent(), this.getDomainApplication(), this.getDomainApplication_Application(), "parent", null, 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(applicationUILayerEClass, ApplicationUILayer.class, "ApplicationUILayer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getApplicationUILayer_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, ApplicationUILayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getApplicationUILayer_Name(), ecorePackage.getEString(), "name", null, 0, 1, ApplicationUILayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getApplicationUILayer_Parent(), this.getApplication(), this.getApplication_ApplicationUILayer(), "parent", null, 0, 1, ApplicationUILayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getApplicationUILayer_ApplicationUIPackages(), this.getApplicationUIPackage(), this.getApplicationUIPackage_Parent(), "applicationUIPackages", null, 0, -1, ApplicationUILayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(applicationUIPackageEClass, ApplicationUIPackage.class, "ApplicationUIPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getApplicationUIPackage_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, ApplicationUIPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getApplicationUIPackage_Name(), ecorePackage.getEString(), "name", null, 0, 1, ApplicationUIPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getApplicationUIPackage_Parent(), this.getApplicationUILayer(), this.getApplicationUILayer_ApplicationUIPackages(), "parent", null, 0, 1, ApplicationUIPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getApplicationUIPackage_Uipackage(), this.getUIPackage(), this.getUIPackage_Parent(), "uipackage", null, 0, 1, ApplicationUIPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(applicationRecipesEClass, ApplicationRecipes.class, "ApplicationRecipes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getApplicationRecipes_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, ApplicationRecipes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getApplicationRecipes_Name(), ecorePackage.getEString(), "name", null, 0, 1, ApplicationRecipes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getApplicationRecipes_Parent(), this.getApplication(), this.getApplication_ApplicationRecipes(), "parent", null, 0, 1, ApplicationRecipes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getApplicationRecipes_Recipes(), this.getApplicationRecipe(), this.getApplicationRecipe_Parent(), "recipes", null, 0, -1, ApplicationRecipes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(applicationRecipeEClass, ApplicationRecipe.class, "ApplicationRecipe", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getApplicationRecipe_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, ApplicationRecipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getApplicationRecipe_Name(), ecorePackage.getEString(), "name", null, 0, 1, ApplicationRecipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getApplicationRecipe_Recipes(), this.getRecipes(), this.getRecipes_Parent(), "recipes", null, 0, 1, ApplicationRecipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getApplicationRecipe_Parent(), this.getApplicationRecipes(), this.getApplicationRecipes_Recipes(), "parent", null, 0, 1, ApplicationRecipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(applicationMappersEClass, ApplicationMappers.class, "ApplicationMappers", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getApplicationMappers_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, ApplicationMappers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getApplicationMappers_Name(), ecorePackage.getEString(), "name", null, 0, 1, ApplicationMappers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getApplicationMappers_Parent(), this.getApplication(), this.getApplication_ApplicationMappers(), "parent", null, 0, 1, ApplicationMappers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getApplicationMappers_Mappers(), this.getApplicationMapper(), this.getApplicationMapper_Parent(), "mappers", null, 0, -1, ApplicationMappers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(applicationMapperEClass, ApplicationMapper.class, "ApplicationMapper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getApplicationMapper_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, ApplicationMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getApplicationMapper_Name(), ecorePackage.getEString(), "name", null, 0, 1, ApplicationMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getApplicationMapper_Mapper(), this.getMappers(), this.getMappers_Parent(), "mapper", null, 0, 1, ApplicationMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getApplicationMapper_Parent(), this.getApplicationMappers(), this.getApplicationMappers_Mappers(), "parent", null, 0, 1, ApplicationMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(methodPointerEClass, MethodPointer.class, "MethodPointer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMethodPointer_MethodRef(), this.getOperation(), null, "methodRef", null, 0, 1, MethodPointer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMethodPointer_FakeMethod(), ecorePackage.getEString(), "fakeMethod", null, 0, 1, MethodPointer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mappersEClass, Mappers.class, "Mappers", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMappers_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Mappers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMappers_Mappers(), this.getMapper(), this.getMapper_Parent(), "mappers", null, 0, -1, Mappers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMappers_Parent(), this.getApplicationMapper(), this.getApplicationMapper_Mapper(), "parent", null, 0, 1, Mappers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mapperEClass, Mapper.class, "Mapper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMapper_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Mapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMapper_Parent(), this.getMappers(), this.getMappers_Mappers(), "parent", null, 0, 1, Mapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMapper_ServiceLayer(), ecorePackage.getEBoolean(), "serviceLayer", null, 0, 1, Mapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMapper_UiLayer(), ecorePackage.getEBoolean(), "uiLayer", null, 0, 1, Mapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(javaMapperEClass, JavaMapper.class, "JavaMapper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getJavaMapper_MappedToPackageName(), ecorePackage.getEString(), "mappedToPackageName", null, 0, 1, JavaMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getJavaMapper_MappedToClassName(), ecorePackage.getEString(), "mappedToClassName", null, 0, 1, JavaMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getJavaMapper_ArtifactId(), ecorePackage.getEString(), "artifactId", null, 0, 1, JavaMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getJavaMapper_GroupId(), ecorePackage.getEString(), "groupId", null, 0, 1, JavaMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getJavaMapper_Version(), ecorePackage.getEString(), "version", null, 0, 1, JavaMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getJavaMapper_LibraryName(), ecorePackage.getEString(), "libraryName", null, 0, 1, JavaMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(recipesEClass, Recipes.class, "Recipes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRecipes_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Recipes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRecipes_Recipe(), this.getRecipe(), this.getRecipe_Parent(), "recipe", null, 0, 1, Recipes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRecipes_Configurations(), this.getConfiguration(), null, "configurations", null, 0, -1, Recipes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRecipes_Infrastructures(), this.getInfrastructure(), null, "infrastructures", null, 0, -1, Recipes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRecipes_Parent(), this.getApplicationRecipe(), this.getApplicationRecipe_Recipes(), "parent", null, 0, 1, Recipes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRecipes_Deployment(), this.getDeploymentSequence(), null, "deployment", null, 0, 1, Recipes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
    initEReference(getDeploymentComponent_DeplymentComponent(), this.getDeploymentComponent(), null, "deplymentComponent", null, 0, 1, DeploymentComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(deploymentStarStepEClass, DeploymentStarStep.class, "DeploymentStarStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDeploymentStarStep_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, DeploymentStarStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDeploymentStarStep_Name(), ecorePackage.getEString(), "name", null, 0, 1, DeploymentStarStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDeploymentStarStep_FirstStep(), this.getDeploymentComponent(), null, "firstStep", null, 0, 1, DeploymentStarStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(usingMappersEClass, UsingMappers.class, "UsingMappers", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUsingMappers_Mappers(), this.getApplicationMapper(), null, "mappers", null, 0, -1, UsingMappers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(recipeEClass, Recipe.class, "Recipe", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRecipe_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Recipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRecipe_Parent(), this.getRecipes(), this.getRecipes_Recipe(), "parent", null, 0, 1, Recipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRecipe_Name(), ecorePackage.getEString(), "name", null, 0, 1, Recipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRecipe_Ingredients(), this.getIngredient(), this.getIngredient_Parent(), "ingredients", null, 0, -1, Recipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRecipe_Infrastructures(), this.getInfrastructure(), this.getInfrastructure_Recipe(), "infrastructures", null, 0, -1, Recipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRecipe_Deloyment(), this.getDeploymentSequence(), null, "deloyment", null, 0, 1, Recipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ingredientEClass, Ingredient.class, "Ingredient", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIngredient_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Ingredient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIngredient_Name(), ecorePackage.getEString(), "name", null, 0, 1, Ingredient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIngredient_Parent(), this.getRecipe(), this.getRecipe_Ingredients(), "parent", null, 0, 1, Ingredient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIngredient_Components(), this.getComponent(), this.getComponent_Parent(), "components", null, 0, -1, Ingredient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIngredient_Layer(), this.getPlatformLayers(), "layer", null, 0, 1, Ingredient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(componentEClass, Component.class, "Component", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getComponent_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getComponent_Name(), ecorePackage.getEString(), "name", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComponent_Parent(), this.getIngredient(), this.getIngredient_Components(), "parent", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComponent_Mappers(), this.getModelMapper(), this.getModelMapper_Parent(), "mappers", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getComponent_ComponentRoot(), ecorePackage.getEString(), "componentRoot", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(javaComponentEClass, JavaComponent.class, "JavaComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getJavaComponent_ArtifactId(), ecorePackage.getEString(), "artifactId", null, 0, 1, JavaComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getJavaComponent_GroupId(), ecorePackage.getEString(), "groupId", null, 0, 1, JavaComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getJavaComponent_Version(), ecorePackage.getEString(), "version", null, 0, 1, JavaComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getJavaComponent_BasePackage(), ecorePackage.getEString(), "basePackage", null, 0, 1, JavaComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(infrastructureEClass, Infrastructure.class, "Infrastructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInfrastructure_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Infrastructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInfrastructure_Recipe(), this.getRecipe(), this.getRecipe_Infrastructures(), "recipe", null, 0, 1, Infrastructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInfrastructure_Name(), ecorePackage.getEString(), "name", null, 0, 1, Infrastructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInfrastructure_RecipeConfig(), this.getConfiguration(), this.getConfiguration_Infrastructure(), "recipeConfig", null, 0, 1, Infrastructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(configurationEClass, Configuration.class, "Configuration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getConfiguration_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConfiguration_Name(), ecorePackage.getEString(), "name", null, 0, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConfiguration_Infrastructure(), this.getInfrastructure(), this.getInfrastructure_RecipeConfig(), "infrastructure", null, 0, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConfiguration_Properties(), this.getProperty(), null, "properties", null, 0, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConfiguration_ConfigExtension(), this.getConfiguration(), this.getConfiguration_Parent(), "configExtension", null, 0, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConfiguration_Parent(), this.getConfiguration(), this.getConfiguration_ConfigExtension(), "parent", null, 0, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(modelMapperEClass, ModelMapper.class, "ModelMapper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getModelMapper_Name(), ecorePackage.getEString(), "name", null, 0, 1, ModelMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelMapper_Parent(), this.getComponent(), this.getComponent_Mappers(), "parent", null, 0, 1, ModelMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelMapper_Specifiers(), this.getMappingSpecifier(), null, "specifiers", null, 0, -1, ModelMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelMapper_Queries(), this.getQuery(), null, "queries", null, 0, -1, ModelMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getModelMapper_ArtifactExecutionString(), ecorePackage.getEString(), "artifactExecutionString", null, 0, 1, ModelMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProperty_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProperty_ConfVarRef(), this.getConfigVariable(), null, "confVarRef", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProperty_Value(), ecorePackage.getEString(), "value", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProperty_FakeName(), ecorePackage.getEString(), "fakeName", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mappingSpecifierEClass, MappingSpecifier.class, "MappingSpecifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMappingSpecifier_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, MappingSpecifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMappingSpecifier_SpecifierRef(), this.getSpecifier(), null, "specifierRef", null, 0, 1, MappingSpecifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMappingSpecifier_ValueRef(), this.getOption(), null, "valueRef", null, 0, 1, MappingSpecifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(queryEClass, Query.class, "Query", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getQuery_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Query.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getQuery_ModelQuery(), this.getModelQuery(), null, "modelQuery", null, 0, 1, Query.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getQuery_Name(), ecorePackage.getEString(), "name", null, 0, 1, Query.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getQuery_QueryRef(), this.getModelQuery(), null, "queryRef", null, 0, 1, Query.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getQuery_Variables(), this.getQueryVariable(), null, "variables", null, 0, -1, Query.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getQuery_GroupCode(), ecorePackage.getEString(), "groupCode", null, 0, 1, Query.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(queryVariableEClass, QueryVariable.class, "QueryVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getQueryVariable_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, QueryVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getQueryVariable_QueryParamRef(), this.getQueryParameter(), null, "queryParamRef", null, 0, 1, QueryVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getQueryVariable_Value(), ecorePackage.getEString(), "value", null, 0, 1, QueryVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(artifactRefEClass, ArtifactRef.class, "ArtifactRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getArtifactRef_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, ArtifactRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getArtifactRef_DomainArtifactRef(), this.getDomainArtifact(), null, "domainArtifactRef", null, 0, 1, ArtifactRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getArtifactRef_ArtifactRef(), this.getArtifact(), null, "artifactRef", null, 0, 1, ArtifactRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typePointerEClass, TypePointer.class, "TypePointer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTypePointer_PackageRef(), this.getPackage(), null, "packageRef", null, 0, 1, TypePointer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypePointer_TypeRef(), this.getTypeElement(), null, "typeRef", null, 0, 1, TypePointer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTypePointer_FakePackageName(), ecorePackage.getEString(), "fakePackageName", null, 0, 1, TypePointer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTypePointer_FakeTypeName(), ecorePackage.getEString(), "fakeTypeName", null, 0, 1, TypePointer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeDefinitionEClass, TypeDefinition.class, "TypeDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTypeDefinition_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, TypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypeDefinition_Types(), this.getTypeElement(), this.getTypeElement_Parent(), "types", null, 0, -1, TypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypeDefinition_Parent(), this.getPackage(), this.getPackage_Typedefinition(), "parent", null, 0, 1, TypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeElementEClass, TypeElement.class, "TypeElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTypeElement_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, TypeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTypeElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, TypeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypeElement_Parent(), this.getTypeDefinition(), this.getTypeDefinition_Types(), "parent", null, 0, 1, TypeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(primitiveEClass, Primitive.class, "Primitive", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(typeEClass, Type.class, "Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getType_Attributes(), this.getAttribute(), this.getAttribute_Parent(), "attributes", null, 0, -1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getType_Operations(), this.getOperation(), this.getOperation_Parent(), "operations", null, 0, -1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getType_Extension(), this.getTypeExtension(), null, "extension", null, 0, -1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeReferenceEClass, TypeReference.class, "TypeReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(typeExtensionEClass, TypeExtension.class, "TypeExtension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTypeExtension_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, TypeExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypeExtension_Source(), this.getTypeElement(), null, "source", null, 0, 1, TypeExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypeExtension_Target(), this.getTypeElement(), null, "target", null, 0, 1, TypeExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAttribute_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttribute_Name(), ecorePackage.getEString(), "name", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttribute_Pk(), ecorePackage.getEBoolean(), "pk", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAttribute_Parent(), this.getType(), this.getType_Attributes(), "parent", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOperation_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOperation_Name(), ecorePackage.getEString(), "name", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOperation_Parent(), this.getType(), this.getType_Operations(), "parent", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOperation_Parameters(), this.getParameter(), this.getParameter_Parent(), "parameters", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOperation_ReturnValue(), this.getReturnValue(), null, "returnValue", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getParameter_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getParameter_Name(), ecorePackage.getEString(), "name", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getParameter_Order(), ecorePackage.getEInt(), "order", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getParameter_Parent(), this.getOperation(), this.getOperation_Parameters(), "parent", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(returnValueEClass, ReturnValue.class, "ReturnValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getReturnValue_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, ReturnValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enumaratorEClass, Enumarator.class, "Enumarator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEnumarator_Values(), this.getEnumAttribute(), this.getEnumAttribute_Parent(), "values", null, 0, -1, Enumarator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enumAttributeEClass, EnumAttribute.class, "EnumAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEnumAttribute_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, EnumAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEnumAttribute_Parent(), this.getEnumarator(), this.getEnumarator_Values(), "parent", null, 0, 1, EnumAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEnumAttribute_Name(), ecorePackage.getEString(), "name", null, 0, 1, EnumAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEnumAttribute_Value(), ecorePackage.getEString(), "value", null, 0, 1, EnumAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typesRepositoryEClass, TypesRepository.class, "TypesRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTypesRepository_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, TypesRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypesRepository_TypeDefinition(), this.getTypes(), this.getTypes_Parent(), "typeDefinition", null, 1, 1, TypesRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypesRepository_Parent(), this.getDomainTypes(), this.getDomainTypes_Typesrepository(), "parent", null, 0, 1, TypesRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typesEClass, Types.class, "Types", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTypes_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Types.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypes_Parent(), this.getTypesRepository(), this.getTypesRepository_TypeDefinition(), "parent", null, 0, 1, Types.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTypes_Name(), ecorePackage.getEString(), "name", null, 0, 1, Types.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypes_Packages(), this.getPackage(), this.getPackage_Parent(), "packages", null, 0, -1, Types.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(packageEClass, domain.Package.class, "Package", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPackage_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, domain.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPackage_Name(), ecorePackage.getEString(), "name", null, 0, 1, domain.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPackage_Typedefinition(), this.getTypeDefinition(), this.getTypeDefinition_Parent(), "typedefinition", null, 0, 1, domain.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPackage_Parent(), this.getTypes(), this.getTypes_Packages(), "parent", null, 0, 1, domain.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uiPackageEClass, UIPackage.class, "UIPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUIPackage_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, UIPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUIPackage_Parent(), this.getApplicationUIPackage(), this.getApplicationUIPackage_Uipackage(), "parent", null, 0, 1, UIPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUIPackage_Forms(), this.getForm(), null, "forms", null, 0, -1, UIPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(formEClass, Form.class, "Form", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getForm_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Form.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getForm_Name(), ecorePackage.getEString(), "name", null, 0, 1, Form.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getForm_View(), this.getFormView(), null, "view", null, 0, 1, Form.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getForm_Datacontrols(), this.getFormDataControls(), null, "datacontrols", null, 0, 1, Form.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(formViewEClass, FormView.class, "FormView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFormView_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, FormView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFormView_Name(), ecorePackage.getEString(), "name", null, 0, 1, FormView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(formDataControlsEClass, FormDataControls.class, "FormDataControls", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFormDataControls_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, FormDataControls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFormDataControls_Name(), ecorePackage.getEString(), "name", null, 0, 1, FormDataControls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFormDataControls_Control(), this.getControls(), null, "control", null, 0, 1, FormDataControls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(controlsEClass, Controls.class, "Controls", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getControls_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Controls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getControls_Root(), this.getRoot(), null, "root", null, 0, 1, Controls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getControls_Controls(), this.getDataControl(), this.getDataControl_Parent(), "controls", null, 0, -1, Controls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getControls_Relations(), this.getRelation(), null, "relations", null, 0, -1, Controls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(triggerEClass, Trigger.class, "Trigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTrigger_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Trigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTrigger_Name(), ecorePackage.getEString(), "name", null, 0, 1, Trigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTrigger_Parameters(), this.getTriggerParameter(), null, "parameters", null, 0, -1, Trigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(triggerParameterEClass, TriggerParameter.class, "TriggerParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTriggerParameter_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, TriggerParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTriggerParameter_Parameter(), this.getParameter(), null, "parameter", null, 0, 1, TriggerParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTriggerParameter_Value(), this.getContextValue(), null, "value", null, 0, 1, TriggerParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(contextValueEClass, ContextValue.class, "ContextValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getContextValue_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, ContextValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getContextValue_IsExpression(), ecorePackage.getEBoolean(), "isExpression", null, 0, 1, ContextValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getContextValue_Value(), ecorePackage.getEString(), "value", null, 0, 1, ContextValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(preFormTriggerEClass, PREFormTrigger.class, "PREFormTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(preQueryTriggerEClass, PREQueryTrigger.class, "PREQueryTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(postQueryTriggerEClass, POSTQueryTrigger.class, "POSTQueryTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(preInsertTriggerEClass, PREInsertTrigger.class, "PREInsertTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(preDeleteTriggerEClass, PREDeleteTrigger.class, "PREDeleteTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(postCreateTriggerEClass, POSTCreateTrigger.class, "POSTCreateTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(preUpdateTriggerEClass, PREUpdateTrigger.class, "PREUpdateTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(createTriggerEClass, CreateTrigger.class, "CreateTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(insertTriggerEClass, InsertTrigger.class, "InsertTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(updateTriggerEClass, UpdateTrigger.class, "UpdateTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(deleteTriggerEClass, DeleteTrigger.class, "DeleteTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(searchTriggerEClass, SearchTrigger.class, "SearchTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(rootEClass, Root.class, "Root", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRoot_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRoot_Name(), ecorePackage.getEString(), "name", null, 0, 1, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRoot_PreFormTrigger(), this.getPREFormTrigger(), null, "preFormTrigger", null, 0, 1, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataControlEClass, DataControl.class, "DataControl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDataControl_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, DataControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDataControl_Name(), ecorePackage.getEString(), "name", null, 0, 1, DataControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDataControl_Parent(), this.getControls(), this.getControls_Controls(), "parent", null, 0, 1, DataControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDataControl_PreQueryTrigger(), this.getPREQueryTrigger(), null, "preQueryTrigger", null, 0, 1, DataControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDataControl_PostQueryTrigger(), this.getPOSTQueryTrigger(), null, "postQueryTrigger", null, 0, 1, DataControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDataControl_PreInsertTrigger(), this.getPREInsertTrigger(), null, "preInsertTrigger", null, 0, 1, DataControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDataControl_PreDeleteTrigger(), this.getPREDeleteTrigger(), null, "preDeleteTrigger", null, 0, 1, DataControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDataControl_PostCreateTrigger(), this.getPOSTCreateTrigger(), null, "postCreateTrigger", null, 0, 1, DataControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDataControl_PreUpdateTrigger(), this.getPREUpdateTrigger(), null, "preUpdateTrigger", null, 0, 1, DataControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDataControl_Create(), this.getCreateTrigger(), null, "create", null, 0, 1, DataControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDataControl_Insert(), this.getInsertTrigger(), null, "insert", null, 0, 1, DataControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDataControl_Update(), this.getUpdateTrigger(), null, "update", null, 0, 1, DataControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDataControl_Remove(), this.getDeleteTrigger(), null, "remove", null, 0, 1, DataControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDataControl_Search(), this.getSearchTrigger(), null, "search", null, 0, 1, DataControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDataControl_ArtificialFields(), this.getArtificialField(), this.getArtificialField_Parent(), "artificialFields", null, 0, -1, DataControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(relationEClass, Relation.class, "Relation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRelation_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRelation_Name(), ecorePackage.getEString(), "name", null, 0, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRelation_Master(), this.getDataControl(), null, "master", null, 0, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRelation_Detail(), this.getDataControl(), null, "detail", null, 0, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRelation_IsTree(), ecorePackage.getEBoolean(), "isTree", null, 0, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRelation_Links(), this.getLink(), this.getLink_Parent(), "links", null, 0, -1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(artificialFieldEClass, ArtificialField.class, "ArtificialField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getArtificialField_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, ArtificialField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getArtificialField_Name(), ecorePackage.getEString(), "name", null, 0, 1, ArtificialField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getArtificialField_Parent(), this.getDataControl(), this.getDataControl_ArtificialFields(), "parent", null, 0, 1, ArtificialField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(linkEClass, Link.class, "Link", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLink_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLink_Parent(), this.getRelation(), this.getRelation_Links(), "parent", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLink_MasterField(), this.getAttribute(), null, "masterField", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLink_DetailField(), this.getAttribute(), null, "detailField", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(applicationInfrastructureLayerEClass, ApplicationInfrastructureLayer.class, "ApplicationInfrastructureLayer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getApplicationInfrastructureLayer_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, ApplicationInfrastructureLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getApplicationInfrastructureLayer_Name(), ecorePackage.getEString(), "name", null, 0, 1, ApplicationInfrastructureLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getApplicationInfrastructureLayer_Parent(), this.getApplication(), this.getApplication_ApplicationInfrastructureLayer(), "parent", null, 0, 1, ApplicationInfrastructureLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getApplicationInfrastructureLayer_Infarastructure(), this.getEnterpriseInfrastructure(), this.getEnterpriseInfrastructure_Parent(), "infarastructure", null, 0, 1, ApplicationInfrastructureLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enterpriseInfrastructureEClass, EnterpriseInfrastructure.class, "EnterpriseInfrastructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEnterpriseInfrastructure_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, EnterpriseInfrastructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEnterpriseInfrastructure_Parent(), this.getApplicationInfrastructureLayer(), this.getApplicationInfrastructureLayer_Infarastructure(), "parent", null, 0, 1, EnterpriseInfrastructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEnterpriseInfrastructure_Datacenters(), this.getDatacenter(), this.getDatacenter_Parent(), "datacenters", null, 0, -1, EnterpriseInfrastructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEnterpriseInfrastructure_InfrastructureConnections(), this.getInfrastructureConnection(), null, "infrastructureConnections", null, 0, -1, EnterpriseInfrastructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(datacenterEClass, Datacenter.class, "Datacenter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDatacenter_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Datacenter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDatacenter_Parent(), this.getEnterpriseInfrastructure(), this.getEnterpriseInfrastructure_Datacenters(), "parent", null, 0, 1, Datacenter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDatacenter_Subsystems(), this.getSubsystem(), this.getSubsystem_Parent(), "subsystems", null, 0, -1, Datacenter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDatacenter_Name(), ecorePackage.getEString(), "name", null, 0, 1, Datacenter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(subsystemEClass, Subsystem.class, "Subsystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSubsystem_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Subsystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSubsystem_Name(), ecorePackage.getEString(), "name", null, 0, 1, Subsystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSubsystem_Parent(), this.getDatacenter(), this.getDatacenter_Subsystems(), "parent", null, 0, 1, Subsystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSubsystem_InfrastructureLayer(), this.getInfrastructureLayer(), this.getInfrastructureLayer_Parent(), "infrastructureLayer", null, 0, -1, Subsystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(infrastructureLayerEClass, InfrastructureLayer.class, "InfrastructureLayer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInfrastructureLayer_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, InfrastructureLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInfrastructureLayer_Name(), ecorePackage.getEString(), "name", null, 0, 1, InfrastructureLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInfrastructureLayer_Parent(), this.getSubsystem(), this.getSubsystem_InfrastructureLayer(), "parent", null, 0, 1, InfrastructureLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInfrastructureLayer_InfrastructureComponent(), this.getInfrastructureComponent(), this.getInfrastructureComponent_Parent(), "infrastructureComponent", null, 0, -1, InfrastructureLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(infrastructureConnectionEClass, InfrastructureConnection.class, "InfrastructureConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInfrastructureConnection_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, InfrastructureConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInfrastructureConnection_Master(), this.getInfrastructureComponent(), null, "master", null, 0, 1, InfrastructureConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInfrastructureConnection_Detail(), this.getInfrastructureComponent(), null, "detail", null, 0, 1, InfrastructureConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(infrastructureComponentEClass, InfrastructureComponent.class, "InfrastructureComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInfrastructureComponent_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, InfrastructureComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInfrastructureComponent_Name(), ecorePackage.getEString(), "name", null, 0, 1, InfrastructureComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInfrastructureComponent_Parent(), this.getInfrastructureLayer(), this.getInfrastructureLayer_InfrastructureComponent(), "parent", null, 0, 1, InfrastructureComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(serverEClass, Server.class, "Server", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(routerEClass, Router.class, "Router", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(hubEClass, Hub.class, "Hub", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(storageEClass, Storage.class, "Storage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(serverClasterEClass, ServerClaster.class, "ServerClaster", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getServerClaster_Servers(), this.getServer(), null, "servers", null, 0, -1, ServerClaster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(platformLayersEEnum, PlatformLayers.class, "PlatformLayers");
    addEEnumLiteral(platformLayersEEnum, PlatformLayers.SERVICE_LAYER);
    addEEnumLiteral(platformLayersEEnum, PlatformLayers.UI_LAYER);

    // Create resource
    createResource(eNS_URI);

    // Create annotations
    // gmf
    createGmfAnnotations();
    // gmf.diagram
    createGmf_1Annotations();
    // gmf.node
    createGmf_2Annotations();
    // gmf.compartment
    createGmf_3Annotations();
    // gmf.diagram.artifact
    createGmf_4Annotations();
    // gmf.diagram.application
    createGmf_5Annotations();
    // gmf.diagram.mapper
    createGmf_6Annotations();
    // gmf.diagram.recipe
    createGmf_7Annotations();
    // gmf.diagram.deployment
    createGmf_8Annotations();
    // gmf.link
    createGmf_9Annotations();
    // gmf.diagram.typedefinition
    createGmf_10Annotations();
    // gmf.diagram.typesrepository
    createGmf_11Annotations();
    // gmf.diagram.uipackage
    createGmf_12Annotations();
    // gmf.diagram.control
    createGmf_13Annotations();
    // gmf.diagram.infarastructure
    createGmf_14Annotations();
  }

  /**
   * Initializes the annotations for <b>gmf</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmfAnnotations()
  {
    String source = "gmf";		
    addAnnotation
      (this, 
       source, 
       new String[] 
       {
       });																																																																																																																											
  }

  /**
   * Initializes the annotations for <b>gmf.diagram</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmf_1Annotations()
  {
    String source = "gmf.diagram";			
    addAnnotation
      (domainEClass, 
       source, 
       new String[] 
       {
       });																																																																																																																										
  }

  /**
   * Initializes the annotations for <b>gmf.node</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmf_2Annotations()
  {
    String source = "gmf.node";				
    addAnnotation
      (domainArtifactsEClass, 
       source, 
       new String[] 
       {
       "label", "name",
       "border.color", "0,0,0",
       "color", "255,239,222"
       });			
    addAnnotation
      (domainTypesEClass, 
       source, 
       new String[] 
       {
       "label", "name",
       "border.color", "0,0,0",
       "color", "255,239,222"
       });		
    addAnnotation
      (domainApplicationsEClass, 
       source, 
       new String[] 
       {
       "label", "name",
       "border.color", "0,0,0",
       "color", "255,239,222"
       });			
    addAnnotation
      (domainApplicationEClass, 
       source, 
       new String[] 
       {
       "label", "name",
       "border.color", "0,0,0",
       "color", "241,238,203"
       });		
    addAnnotation
      (domainArtifactEClass, 
       source, 
       new String[] 
       {
       "label", "name"
       });		
    addAnnotation
      (ormEntityEClass, 
       source, 
       new String[] 
       {
       "label", "name",
       "border.color", "0,0,0",
       "color", "241,238,203"
       });		
    addAnnotation
      (jpaServiceEClass, 
       source, 
       new String[] 
       {
       "label", "name",
       "border.color", "0,0,0",
       "color", "241,238,203"
       });		
    addAnnotation
      (ejbServiceEClass, 
       source, 
       new String[] 
       {
       "label", "name",
       "border.color", "0,0,0",
       "color", "241,238,203"
       });		
    addAnnotation
      (continuousIintegrationEClass, 
       source, 
       new String[] 
       {
       "label", "name",
       "border.color", "0,0,0",
       "color", "241,238,203"
       });			
    addAnnotation
      (artifactEClass, 
       source, 
       new String[] 
       {
       "label", "name",
       "border.color", "0,0,0",
       "color", "255,239,222"
       });					
    addAnnotation
      (configVariableEClass, 
       source, 
       new String[] 
       {
       "label", "name",
       "border.color", "0,0,0",
       "color", "255,239,222"
       });		
    addAnnotation
      (modelQueryEClass, 
       source, 
       new String[] 
       {
       "label", "name",
       "border.color", "0,0,0",
       "color", "255,239,222"
       });		
    addAnnotation
      (specifierEClass, 
       source, 
       new String[] 
       {
       "label", "name",
       "border.color", "0,0,0",
       "color", "255,239,222"
       });		
    addAnnotation
      (optionEClass, 
       source, 
       new String[] 
       {
       "label", "name"
       });			
    addAnnotation
      (applicationUILayerEClass, 
       source, 
       new String[] 
       {
       "label", "name",
       "border.color", "0,0,0",
       "color", "192,192,192"
       });			
    addAnnotation
      (applicationUIPackageEClass, 
       source, 
       new String[] 
       {
       "label", "name",
       "border.color", "0,0,0",
       "color", "255,196,176"
       });		
    addAnnotation
      (applicationRecipesEClass, 
       source, 
       new String[] 
       {
       "label", "name",
       "border.color", "0,0,0",
       "color", "192,192,192"
       });			
    addAnnotation
      (applicationRecipeEClass, 
       source, 
       new String[] 
       {
       "label", "name",
       "border.color", "0,0,0",
       "color", "255,196,176"
       });		
    addAnnotation
      (applicationMappersEClass, 
       source, 
       new String[] 
       {
       "label", "name",
       "border.color", "0,0,0",
       "color", "164,230,255"
       });			
    addAnnotation
      (applicationMapperEClass, 
       source, 
       new String[] 
       {
       "label", "name",
       "border.color", "0,0,0",
       "color", "255,237,85"
       });			
    addAnnotation
      (javaMapperEClass, 
       source, 
       new String[] 
       {
       "label", "fakePackageName,fakeTypeName",
       "border.color", "0,0,0",
       "color", "255,237,85"
       });			
    addAnnotation
      (deploymentSequenceEClass, 
       source, 
       new String[] 
       {
       "label", "name",
       "border.color", "0,0,0",
       "color", "177,201,236"
       });			
    addAnnotation
      (deploymentComponentEClass, 
       source, 
       new String[] 
       {
       "label", "name",
       "border.color", "0,0,0",
       "color", "177,201,236"
       });			
    addAnnotation
      (deploymentStarStepEClass, 
       source, 
       new String[] 
       {
       "label", "name",
       "border.color", "0,0,0",
       "color", "255,69,0"
       });			
    addAnnotation
      (recipeEClass, 
       source, 
       new String[] 
       {
       "label", "name",
       "border.color", "0,0,0",
       "color", "255,239,222"
       });					
    addAnnotation
      (ingredientEClass, 
       source, 
       new String[] 
       {
       "label", "name",
       "border.color", "0,0,0",
       "color", "255,222,32"
       });				
    addAnnotation
      (javaComponentEClass, 
       source, 
       new String[] 
       {
       "label", "name",
       "border.color", "0,0,0",
       "color", "128,128,128"
       });		
    addAnnotation
      (infrastructureEClass, 
       source, 
       new String[] 
       {
       "label", "name",
       "border.color", "0,0,0",
       "color", "255,239,222"
       });			
    addAnnotation
      (configurationEClass, 
       source, 
       new String[] 
       {
       "label", "name",
       "border.color", "0,0,0",
       "color", "255,239,222"
       });				
    addAnnotation
      (modelMapperEClass, 
       source, 
       new String[] 
       {
       "label", "name",
       "border.color", "0,0,0",
       "color", "192,192,192"
       });			
    addAnnotation
      (propertyEClass, 
       source, 
       new String[] 
       {
       "label", "fakeName",
       "border.color", "0,0,0",
       "color", "255,239,222"
       });		
    addAnnotation
      (queryEClass, 
       source, 
       new String[] 
       {
       "label", "name",
       "border.color", "0,0,0",
       "color", "241,238,203"
       });			
    addAnnotation
      (primitiveEClass, 
       source, 
       new String[] 
       {
       "label", "name",
       "border.color", "0,0,0",
       "color", "255,239,222"
       });		
    addAnnotation
      (typeEClass, 
       source, 
       new String[] 
       {
       "label", "name",
       "border.color", "0,0,0",
       "color", "255,239,222"
       });				
    addAnnotation
      (typeReferenceEClass, 
       source, 
       new String[] 
       {
       "label", "fakePackageName,fakeTypeName",
       "border.color", "0,0,0",
       "color", "255,239,222"
       });			
    addAnnotation
      (attributeEClass, 
       source, 
       new String[] 
       {
       "label", "name",
       "border.color", "0,0,0",
       "color", "255,239,222"
       });		
    addAnnotation
      (operationEClass, 
       source, 
       new String[] 
       {
       "label", "name",
       "border.color", "0,0,0",
       "color", "255,239,222"
       });		
    addAnnotation
      (enumaratorEClass, 
       source, 
       new String[] 
       {
       "label", "name",
       "border.color", "0,0,0",
       "color", "255,239,222"
       });			
    addAnnotation
      (enumAttributeEClass, 
       source, 
       new String[] 
       {
       "label", "name",
       "border.color", "0,0,0",
       "color", "255,239,222"
       });			
    addAnnotation
      (typesEClass, 
       source, 
       new String[] 
       {
       "label", "name",
       "border.color", "0,0,0",
       "color", "255,239,222"
       });			
    addAnnotation
      (packageEClass, 
       source, 
       new String[] 
       {
       "label", "name",
       "border.color", "0,0,0",
       "color", "241,238,203"
       });			
    addAnnotation
      (formEClass, 
       source, 
       new String[] 
       {
       "label", "name",
       "border.color", "0,0,0",
       "color", "241,238,203"
       });				
    addAnnotation
      (formViewEClass, 
       source, 
       new String[] 
       {
       "label", "name",
       "border.color", "0,0,0",
       "color", "241,238,203"
       });		
    addAnnotation
      (formDataControlsEClass, 
       source, 
       new String[] 
       {
       "label", "name",
       "border.color", "0,0,0",
       "color", "241,238,203"
       });			
    addAnnotation
      (preFormTriggerEClass, 
       source, 
       new String[] 
       {
       "label", "fakeMethod",
       "border.color", "0,0,0",
       "color", "241,238,203"
       });		
    addAnnotation
      (preQueryTriggerEClass, 
       source, 
       new String[] 
       {
       "label", "fakeMethod",
       "border.color", "0,0,0",
       "color", "241,238,203"
       });		
    addAnnotation
      (postQueryTriggerEClass, 
       source, 
       new String[] 
       {
       "label", "fakeMethod",
       "border.color", "0,0,0",
       "color", "241,238,203"
       });		
    addAnnotation
      (preInsertTriggerEClass, 
       source, 
       new String[] 
       {
       "label", "fakeMethod",
       "border.color", "0,0,0",
       "color", "241,238,203"
       });		
    addAnnotation
      (preDeleteTriggerEClass, 
       source, 
       new String[] 
       {
       "label", "fakeMethod",
       "border.color", "0,0,0",
       "color", "241,238,203"
       });		
    addAnnotation
      (postCreateTriggerEClass, 
       source, 
       new String[] 
       {
       "label", "fakeMethod",
       "border.color", "0,0,0",
       "color", "241,238,203"
       });		
    addAnnotation
      (preUpdateTriggerEClass, 
       source, 
       new String[] 
       {
       "label", "fakeMethod",
       "border.color", "0,0,0",
       "color", "241,238,203"
       });		
    addAnnotation
      (createTriggerEClass, 
       source, 
       new String[] 
       {
       "label", "fakeMethod",
       "border.color", "0,0,0",
       "color", "241,238,203"
       });		
    addAnnotation
      (insertTriggerEClass, 
       source, 
       new String[] 
       {
       "label", "fakeMethod",
       "border.color", "0,0,0",
       "color", "241,238,203"
       });		
    addAnnotation
      (updateTriggerEClass, 
       source, 
       new String[] 
       {
       "label", "fakeMethod",
       "border.color", "0,0,0",
       "color", "241,238,203"
       });		
    addAnnotation
      (deleteTriggerEClass, 
       source, 
       new String[] 
       {
       "label", "fakeMethod",
       "border.color", "0,0,0",
       "color", "241,238,203"
       });		
    addAnnotation
      (searchTriggerEClass, 
       source, 
       new String[] 
       {
       "label", "fakeMethod",
       "border.color", "0,0,0",
       "color", "241,238,203"
       });		
    addAnnotation
      (rootEClass, 
       source, 
       new String[] 
       {
       "label", "name",
       "border.color", "0,0,0",
       "color", "241,238,203"
       });			
    addAnnotation
      (dataControlEClass, 
       source, 
       new String[] 
       {
       "label", "name",
       "border.color", "0,0,0",
       "color", "241,238,203"
       });															
    addAnnotation
      (artificialFieldEClass, 
       source, 
       new String[] 
       {
       "label", "name",
       "border.color", "0,0,0",
       "color", "241,238,203"
       });		
    addAnnotation
      (applicationInfrastructureLayerEClass, 
       source, 
       new String[] 
       {
       "label", "name",
       "border.color", "0,0,0",
       "color", "192,192,192"
       });			
    addAnnotation
      (datacenterEClass, 
       source, 
       new String[] 
       {
       "label", "name"
       });			
    addAnnotation
      (subsystemEClass, 
       source, 
       new String[] 
       {
       "label", "name"
       });			
    addAnnotation
      (infrastructureLayerEClass, 
       source, 
       new String[] 
       {
       "label", "name"
       });				
    addAnnotation
      (serverEClass, 
       source, 
       new String[] 
       {
       "figure", "org.tura.metamodel.commons.figures.ServerFigure",
       "label.icon", "false",
       "label", "name",
       "label.placement", "external"
       });		
    addAnnotation
      (routerEClass, 
       source, 
       new String[] 
       {
       "figure", "org.tura.metamodel.commons.figures.RouterFigure",
       "label.icon", "false",
       "label", "name",
       "label.placement", "external"
       });		
    addAnnotation
      (hubEClass, 
       source, 
       new String[] 
       {
       "figure", "org.tura.metamodel.commons.figures.HubFigure",
       "label.icon", "false",
       "label", "name",
       "label.placement", "external"
       });		
    addAnnotation
      (storageEClass, 
       source, 
       new String[] 
       {
       "figure", "org.tura.metamodel.commons.figures.StorageFigure",
       "label.icon", "false",
       "label", "name",
       "label.placement", "external"
       });		
    addAnnotation
      (serverClasterEClass, 
       source, 
       new String[] 
       {
       "label", "name"
       });
  }

  /**
   * Initializes the annotations for <b>gmf.compartment</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmf_3Annotations()
  {
    String source = "gmf.compartment";					
    addAnnotation
      (getDomainArtifacts_DomainArtifact(), 
       source, 
       new String[] 
       {
       });				
    addAnnotation
      (getDomainApplications_Applications(), 
       source, 
       new String[] 
       {
       });										
    addAnnotation
      (getArtifact_ConfigVariables(), 
       source, 
       new String[] 
       {
       "layout", "list"
       });		
    addAnnotation
      (getArtifact_ModelQuery(), 
       source, 
       new String[] 
       {
       "layout", "list"
       });		
    addAnnotation
      (getArtifact_Specifiers(), 
       source, 
       new String[] 
       {
       "layout", "list"
       });								
    addAnnotation
      (getApplicationUILayer_ApplicationUIPackages(), 
       source, 
       new String[] 
       {
       });				
    addAnnotation
      (getApplicationRecipes_Recipes(), 
       source, 
       new String[] 
       {
       });				
    addAnnotation
      (getApplicationMappers_Mappers(), 
       source, 
       new String[] 
       {
       });													
    addAnnotation
      (getRecipe_Ingredients(), 
       source, 
       new String[] 
       {
       "layout", "list"
       });					
    addAnnotation
      (getIngredient_Components(), 
       source, 
       new String[] 
       {
       });		
    addAnnotation
      (getComponent_Mappers(), 
       source, 
       new String[] 
       {
       });						
    addAnnotation
      (getConfiguration_Properties(), 
       source, 
       new String[] 
       {
       "layout", "list"
       });				
    addAnnotation
      (getModelMapper_Queries(), 
       source, 
       new String[] 
       {
       "layout", "list"
       });							
    addAnnotation
      (getType_Attributes(), 
       source, 
       new String[] 
       {
       "layout", "list"
       });		
    addAnnotation
      (getType_Operations(), 
       source, 
       new String[] 
       {
       "layout", "list"
       });							
    addAnnotation
      (getEnumarator_Values(), 
       source, 
       new String[] 
       {
       "layout", "list"
       });					
    addAnnotation
      (getTypes_Packages(), 
       source, 
       new String[] 
       {
       });					
    addAnnotation
      (getForm_View(), 
       source, 
       new String[] 
       {
       "layout", "list"
       });		
    addAnnotation
      (getForm_Datacontrols(), 
       source, 
       new String[] 
       {
       "layout", "list"
       });																		
    addAnnotation
      (getRoot_PreFormTrigger(), 
       source, 
       new String[] 
       {
       "layout", "list"
       });			
    addAnnotation
      (getDataControl_PreQueryTrigger(), 
       source, 
       new String[] 
       {
       "layout", "list"
       });		
    addAnnotation
      (getDataControl_PostQueryTrigger(), 
       source, 
       new String[] 
       {
       "layout", "list"
       });		
    addAnnotation
      (getDataControl_PreInsertTrigger(), 
       source, 
       new String[] 
       {
       "layout", "list"
       });		
    addAnnotation
      (getDataControl_PreDeleteTrigger(), 
       source, 
       new String[] 
       {
       "layout", "list"
       });		
    addAnnotation
      (getDataControl_PostCreateTrigger(), 
       source, 
       new String[] 
       {
       "layout", "list"
       });		
    addAnnotation
      (getDataControl_PreUpdateTrigger(), 
       source, 
       new String[] 
       {
       "layout", "list"
       });		
    addAnnotation
      (getDataControl_Create(), 
       source, 
       new String[] 
       {
       "layout", "list"
       });		
    addAnnotation
      (getDataControl_Insert(), 
       source, 
       new String[] 
       {
       "layout", "list"
       });		
    addAnnotation
      (getDataControl_Update(), 
       source, 
       new String[] 
       {
       "layout", "list"
       });		
    addAnnotation
      (getDataControl_Remove(), 
       source, 
       new String[] 
       {
       "layout", "list"
       });		
    addAnnotation
      (getDataControl_Search(), 
       source, 
       new String[] 
       {
       "layout", "list"
       });		
    addAnnotation
      (getDataControl_ArtificialFields(), 
       source, 
       new String[] 
       {
       "layout", "list"
       });							
    addAnnotation
      (getDatacenter_Subsystems(), 
       source, 
       new String[] 
       {
       });			
    addAnnotation
      (getSubsystem_InfrastructureLayer(), 
       source, 
       new String[] 
       {
       });			
    addAnnotation
      (getInfrastructureLayer_InfrastructureComponent(), 
       source, 
       new String[] 
       {
       });						
  }

  /**
   * Initializes the annotations for <b>gmf.diagram.artifact</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmf_4Annotations()
  {
    String source = "gmf.diagram.artifact";															
    addAnnotation
      (artifactsEClass, 
       source, 
       new String[] 
       {
       });																																																																																																														
  }

  /**
   * Initializes the annotations for <b>gmf.diagram.application</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmf_5Annotations()
  {
    String source = "gmf.diagram.application";																								
    addAnnotation
      (applicationEClass, 
       source, 
       new String[] 
       {
       });																																																																																																					
  }

  /**
   * Initializes the annotations for <b>gmf.diagram.mapper</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmf_6Annotations()
  {
    String source = "gmf.diagram.mapper";																																		
    addAnnotation
      (mappersEClass, 
       source, 
       new String[] 
       {
       });																																																																																											
  }

  /**
   * Initializes the annotations for <b>gmf.diagram.recipe</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmf_7Annotations()
  {
    String source = "gmf.diagram.recipe";																																				
    addAnnotation
      (recipesEClass, 
       source, 
       new String[] 
       {
       });																																																																																									
  }

  /**
   * Initializes the annotations for <b>gmf.diagram.deployment</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmf_8Annotations()
  {
    String source = "gmf.diagram.deployment";																																						
    addAnnotation
      (deploymentComponentsEClass, 
       source, 
       new String[] 
       {
       });																																																																																							
  }

  /**
   * Initializes the annotations for <b>gmf.link</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmf_9Annotations()
  {
    String source = "gmf.link";																																								
    addAnnotation
      (getDeploymentComponent_DeplymentComponent(), 
       source, 
       new String[] 
       {
       "target.decoration", "arrow",
       "style", "dash"
       });			
    addAnnotation
      (getDeploymentStarStep_FirstStep(), 
       source, 
       new String[] 
       {
       "target.decoration", "arrow",
       "style", "dash"
       });				
    addAnnotation
      (getRecipe_Infrastructures(), 
       source, 
       new String[] 
       {
       "target.decoration", "arrow",
       "style", "dash"
       });		
    addAnnotation
      (getRecipe_Deloyment(), 
       source, 
       new String[] 
       {
       "target.decoration", "arrow",
       "style", "dash"
       });							
    addAnnotation
      (getInfrastructure_RecipeConfig(), 
       source, 
       new String[] 
       {
       "target.decoration", "arrow",
       "style", "dash"
       });				
    addAnnotation
      (getConfiguration_ConfigExtension(), 
       source, 
       new String[] 
       {
       "style", "dot",
       "width", "2",
       "target.decoration", "closedarrow"
       });												
    addAnnotation
      (typeExtensionEClass, 
       source, 
       new String[] 
       {
       "source", "source",
       "target", "target",
       "style", "dot",
       "width", "2",
       "target.decoration", "closedarrow"
       });																																													
    addAnnotation
      (relationEClass, 
       source, 
       new String[] 
       {
       "source", "master",
       "target", "detail",
       "style", "dash",
       "target.decoration", "arrow"
       });											
    addAnnotation
      (infrastructureConnectionEClass, 
       source, 
       new String[] 
       {
       "source", "master",
       "target", "detail"
       });					
  }

  /**
   * Initializes the annotations for <b>gmf.diagram.typedefinition</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmf_10Annotations()
  {
    String source = "gmf.diagram.typedefinition";																																																												
    addAnnotation
      (typeDefinitionEClass, 
       source, 
       new String[] 
       {
       });																																																																	
  }

  /**
   * Initializes the annotations for <b>gmf.diagram.typesrepository</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmf_11Annotations()
  {
    String source = "gmf.diagram.typesrepository";																																																																								
    addAnnotation
      (typesRepositoryEClass, 
       source, 
       new String[] 
       {
       });																																																					
  }

  /**
   * Initializes the annotations for <b>gmf.diagram.uipackage</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmf_12Annotations()
  {
    String source = "gmf.diagram.uipackage";																																																																												
    addAnnotation
      (uiPackageEClass, 
       source, 
       new String[] 
       {
       });																																																	
  }

  /**
   * Initializes the annotations for <b>gmf.diagram.control</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmf_13Annotations()
  {
    String source = "gmf.diagram.control";																																																																																		
    addAnnotation
      (controlsEClass, 
       source, 
       new String[] 
       {
       });																																											
  }

  /**
   * Initializes the annotations for <b>gmf.diagram.infarastructure</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmf_14Annotations()
  {
    String source = "gmf.diagram.infarastructure";																																																																																																																	
    addAnnotation
      (enterpriseInfrastructureEClass, 
       source, 
       new String[] 
       {
       });												
  }

} //DomainPackageImpl
