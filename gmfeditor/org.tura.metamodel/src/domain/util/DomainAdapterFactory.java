/**
 */
package domain.util;

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
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import domain.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see domain.DomainPackage
 * @generated
 */
public class DomainAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DomainPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomainAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = DomainPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DomainSwitch<Adapter> modelSwitch =
    new DomainSwitch<Adapter>()
    {
      @Override
      public Adapter caseDomain(Domain object)
      {
        return createDomainAdapter();
      }
      @Override
      public Adapter caseHTMLLayerHolder(HTMLLayerHolder object)
      {
        return createHTMLLayerHolderAdapter();
      }
      @Override
      public Adapter caseDomainArtifacts(DomainArtifacts object)
      {
        return createDomainArtifactsAdapter();
      }
      @Override
      public Adapter caseDomainTypes(DomainTypes object)
      {
        return createDomainTypesAdapter();
      }
      @Override
      public Adapter caseDomainApplications(DomainApplications object)
      {
        return createDomainApplicationsAdapter();
      }
      @Override
      public Adapter caseDomainApplication(DomainApplication object)
      {
        return createDomainApplicationAdapter();
      }
      @Override
      public Adapter caseDomainArtifact(DomainArtifact object)
      {
        return createDomainArtifactAdapter();
      }
      @Override
      public Adapter caseORMEntity(ORMEntity object)
      {
        return createORMEntityAdapter();
      }
      @Override
      public Adapter caseJPAService(JPAService object)
      {
        return createJPAServiceAdapter();
      }
      @Override
      public Adapter caseEJBService(EJBService object)
      {
        return createEJBServiceAdapter();
      }
      @Override
      public Adapter caseContinuousIintegration(ContinuousIintegration object)
      {
        return createContinuousIintegrationAdapter();
      }
      @Override
      public Adapter caseArtifacts(Artifacts object)
      {
        return createArtifactsAdapter();
      }
      @Override
      public Adapter caseArtifact(Artifact object)
      {
        return createArtifactAdapter();
      }
      @Override
      public Adapter caseConfigVariable(ConfigVariable object)
      {
        return createConfigVariableAdapter();
      }
      @Override
      public Adapter caseModelQuery(ModelQuery object)
      {
        return createModelQueryAdapter();
      }
      @Override
      public Adapter caseQueryParameter(QueryParameter object)
      {
        return createQueryParameterAdapter();
      }
      @Override
      public Adapter caseSpecifier(Specifier object)
      {
        return createSpecifierAdapter();
      }
      @Override
      public Adapter caseOption(Option object)
      {
        return createOptionAdapter();
      }
      @Override
      public Adapter caseApplication(Application object)
      {
        return createApplicationAdapter();
      }
      @Override
      public Adapter caseApplicationUILayer(ApplicationUILayer object)
      {
        return createApplicationUILayerAdapter();
      }
      @Override
      public Adapter caseApplicationUIPackage(ApplicationUIPackage object)
      {
        return createApplicationUIPackageAdapter();
      }
      @Override
      public Adapter caseApplicationRecipes(ApplicationRecipes object)
      {
        return createApplicationRecipesAdapter();
      }
      @Override
      public Adapter caseApplicationRecipe(ApplicationRecipe object)
      {
        return createApplicationRecipeAdapter();
      }
      @Override
      public Adapter caseApplicationMappers(ApplicationMappers object)
      {
        return createApplicationMappersAdapter();
      }
      @Override
      public Adapter caseApplicationMapper(ApplicationMapper object)
      {
        return createApplicationMapperAdapter();
      }
      @Override
      public Adapter caseMethodPointer(MethodPointer object)
      {
        return createMethodPointerAdapter();
      }
      @Override
      public Adapter caseMappers(Mappers object)
      {
        return createMappersAdapter();
      }
      @Override
      public Adapter caseMapper(Mapper object)
      {
        return createMapperAdapter();
      }
      @Override
      public Adapter caseJavaMapper(JavaMapper object)
      {
        return createJavaMapperAdapter();
      }
      @Override
      public Adapter caseRecipes(Recipes object)
      {
        return createRecipesAdapter();
      }
      @Override
      public Adapter caseDeploymentSequence(DeploymentSequence object)
      {
        return createDeploymentSequenceAdapter();
      }
      @Override
      public Adapter caseDeploymentComponents(DeploymentComponents object)
      {
        return createDeploymentComponentsAdapter();
      }
      @Override
      public Adapter caseDeploymentComponent(DeploymentComponent object)
      {
        return createDeploymentComponentAdapter();
      }
      @Override
      public Adapter caseDeploymentStarStep(DeploymentStarStep object)
      {
        return createDeploymentStarStepAdapter();
      }
      @Override
      public Adapter caseUsingMappers(UsingMappers object)
      {
        return createUsingMappersAdapter();
      }
      @Override
      public Adapter caseRecipe(Recipe object)
      {
        return createRecipeAdapter();
      }
      @Override
      public Adapter caseIngredient(Ingredient object)
      {
        return createIngredientAdapter();
      }
      @Override
      public Adapter caseComponent(Component object)
      {
        return createComponentAdapter();
      }
      @Override
      public Adapter caseJavaComponent(JavaComponent object)
      {
        return createJavaComponentAdapter();
      }
      @Override
      public Adapter caseInfrastructure(Infrastructure object)
      {
        return createInfrastructureAdapter();
      }
      @Override
      public Adapter caseConfiguration(Configuration object)
      {
        return createConfigurationAdapter();
      }
      @Override
      public Adapter caseModelMapper(ModelMapper object)
      {
        return createModelMapperAdapter();
      }
      @Override
      public Adapter caseProperty(Property object)
      {
        return createPropertyAdapter();
      }
      @Override
      public Adapter caseMappingSpecifier(MappingSpecifier object)
      {
        return createMappingSpecifierAdapter();
      }
      @Override
      public Adapter caseQuery(Query object)
      {
        return createQueryAdapter();
      }
      @Override
      public Adapter caseQueryVariable(QueryVariable object)
      {
        return createQueryVariableAdapter();
      }
      @Override
      public Adapter caseArtifactRef(ArtifactRef object)
      {
        return createArtifactRefAdapter();
      }
      @Override
      public Adapter caseTypePointer(TypePointer object)
      {
        return createTypePointerAdapter();
      }
      @Override
      public Adapter caseTypeDefinition(TypeDefinition object)
      {
        return createTypeDefinitionAdapter();
      }
      @Override
      public Adapter caseTypeElement(TypeElement object)
      {
        return createTypeElementAdapter();
      }
      @Override
      public Adapter casePrimitive(Primitive object)
      {
        return createPrimitiveAdapter();
      }
      @Override
      public Adapter caseType(Type object)
      {
        return createTypeAdapter();
      }
      @Override
      public Adapter caseTypeReference(TypeReference object)
      {
        return createTypeReferenceAdapter();
      }
      @Override
      public Adapter caseTypeExtension(TypeExtension object)
      {
        return createTypeExtensionAdapter();
      }
      @Override
      public Adapter caseAttribute(Attribute object)
      {
        return createAttributeAdapter();
      }
      @Override
      public Adapter caseOperation(Operation object)
      {
        return createOperationAdapter();
      }
      @Override
      public Adapter caseParameter(Parameter object)
      {
        return createParameterAdapter();
      }
      @Override
      public Adapter caseReturnValue(ReturnValue object)
      {
        return createReturnValueAdapter();
      }
      @Override
      public Adapter caseEnumarator(Enumarator object)
      {
        return createEnumaratorAdapter();
      }
      @Override
      public Adapter caseEnumAttribute(EnumAttribute object)
      {
        return createEnumAttributeAdapter();
      }
      @Override
      public Adapter caseTypesRepository(TypesRepository object)
      {
        return createTypesRepositoryAdapter();
      }
      @Override
      public Adapter caseTypes(Types object)
      {
        return createTypesAdapter();
      }
      @Override
      public Adapter casePackage(domain.Package object)
      {
        return createPackageAdapter();
      }
      @Override
      public Adapter caseUIPackage(UIPackage object)
      {
        return createUIPackageAdapter();
      }
      @Override
      public Adapter caseForm(Form object)
      {
        return createFormAdapter();
      }
      @Override
      public Adapter caseFormView(FormView object)
      {
        return createFormViewAdapter();
      }
      @Override
      public Adapter caseFormDataControls(FormDataControls object)
      {
        return createFormDataControlsAdapter();
      }
      @Override
      public Adapter caseControls(Controls object)
      {
        return createControlsAdapter();
      }
      @Override
      public Adapter caseTrigger(Trigger object)
      {
        return createTriggerAdapter();
      }
      @Override
      public Adapter caseTriggerParameter(TriggerParameter object)
      {
        return createTriggerParameterAdapter();
      }
      @Override
      public Adapter caseContextValue(ContextValue object)
      {
        return createContextValueAdapter();
      }
      @Override
      public Adapter casePREFormTrigger(PREFormTrigger object)
      {
        return createPREFormTriggerAdapter();
      }
      @Override
      public Adapter casePREQueryTrigger(PREQueryTrigger object)
      {
        return createPREQueryTriggerAdapter();
      }
      @Override
      public Adapter casePOSTQueryTrigger(POSTQueryTrigger object)
      {
        return createPOSTQueryTriggerAdapter();
      }
      @Override
      public Adapter casePREInsertTrigger(PREInsertTrigger object)
      {
        return createPREInsertTriggerAdapter();
      }
      @Override
      public Adapter casePREDeleteTrigger(PREDeleteTrigger object)
      {
        return createPREDeleteTriggerAdapter();
      }
      @Override
      public Adapter casePOSTCreateTrigger(POSTCreateTrigger object)
      {
        return createPOSTCreateTriggerAdapter();
      }
      @Override
      public Adapter casePREUpdateTrigger(PREUpdateTrigger object)
      {
        return createPREUpdateTriggerAdapter();
      }
      @Override
      public Adapter caseCreateTrigger(CreateTrigger object)
      {
        return createCreateTriggerAdapter();
      }
      @Override
      public Adapter caseInsertTrigger(InsertTrigger object)
      {
        return createInsertTriggerAdapter();
      }
      @Override
      public Adapter caseUpdateTrigger(UpdateTrigger object)
      {
        return createUpdateTriggerAdapter();
      }
      @Override
      public Adapter caseDeleteTrigger(DeleteTrigger object)
      {
        return createDeleteTriggerAdapter();
      }
      @Override
      public Adapter caseSearchTrigger(SearchTrigger object)
      {
        return createSearchTriggerAdapter();
      }
      @Override
      public Adapter caseRoot(Root object)
      {
        return createRootAdapter();
      }
      @Override
      public Adapter caseDataControl(DataControl object)
      {
        return createDataControlAdapter();
      }
      @Override
      public Adapter caseRelation(Relation object)
      {
        return createRelationAdapter();
      }
      @Override
      public Adapter caseArtificialField(ArtificialField object)
      {
        return createArtificialFieldAdapter();
      }
      @Override
      public Adapter caseLink(Link object)
      {
        return createLinkAdapter();
      }
      @Override
      public Adapter caseApplicationInfrastructureLayer(ApplicationInfrastructureLayer object)
      {
        return createApplicationInfrastructureLayerAdapter();
      }
      @Override
      public Adapter caseEnterpriseInfrastructure(EnterpriseInfrastructure object)
      {
        return createEnterpriseInfrastructureAdapter();
      }
      @Override
      public Adapter caseDatacenter(Datacenter object)
      {
        return createDatacenterAdapter();
      }
      @Override
      public Adapter caseSubsystem(Subsystem object)
      {
        return createSubsystemAdapter();
      }
      @Override
      public Adapter caseInfrastructureLayer(InfrastructureLayer object)
      {
        return createInfrastructureLayerAdapter();
      }
      @Override
      public Adapter caseInfrastructureConnection(InfrastructureConnection object)
      {
        return createInfrastructureConnectionAdapter();
      }
      @Override
      public Adapter caseInfrastructureComponent(InfrastructureComponent object)
      {
        return createInfrastructureComponentAdapter();
      }
      @Override
      public Adapter caseServer(Server object)
      {
        return createServerAdapter();
      }
      @Override
      public Adapter caseRouter(Router object)
      {
        return createRouterAdapter();
      }
      @Override
      public Adapter caseHub(Hub object)
      {
        return createHubAdapter();
      }
      @Override
      public Adapter caseStorage(Storage object)
      {
        return createStorageAdapter();
      }
      @Override
      public Adapter caseServerClaster(ServerClaster object)
      {
        return createServerClasterAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link domain.Domain <em>Domain</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.Domain
   * @generated
   */
  public Adapter createDomainAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.HTMLLayerHolder <em>HTML Layer Holder</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.HTMLLayerHolder
   * @generated
   */
  public Adapter createHTMLLayerHolderAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.DomainArtifacts <em>Artifacts</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.DomainArtifacts
   * @generated
   */
  public Adapter createDomainArtifactsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.DomainTypes <em>Types</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.DomainTypes
   * @generated
   */
  public Adapter createDomainTypesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.DomainApplications <em>Applications</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.DomainApplications
   * @generated
   */
  public Adapter createDomainApplicationsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.DomainApplication <em>Application</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.DomainApplication
   * @generated
   */
  public Adapter createDomainApplicationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.DomainArtifact <em>Artifact</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.DomainArtifact
   * @generated
   */
  public Adapter createDomainArtifactAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.ORMEntity <em>ORM Entity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.ORMEntity
   * @generated
   */
  public Adapter createORMEntityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.JPAService <em>JPA Service</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.JPAService
   * @generated
   */
  public Adapter createJPAServiceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.EJBService <em>EJB Service</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.EJBService
   * @generated
   */
  public Adapter createEJBServiceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.ContinuousIintegration <em>Continuous Iintegration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.ContinuousIintegration
   * @generated
   */
  public Adapter createContinuousIintegrationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.Artifacts <em>Artifacts</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.Artifacts
   * @generated
   */
  public Adapter createArtifactsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.Artifact <em>Artifact</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.Artifact
   * @generated
   */
  public Adapter createArtifactAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.ConfigVariable <em>Config Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.ConfigVariable
   * @generated
   */
  public Adapter createConfigVariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.ModelQuery <em>Model Query</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.ModelQuery
   * @generated
   */
  public Adapter createModelQueryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.QueryParameter <em>Query Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.QueryParameter
   * @generated
   */
  public Adapter createQueryParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.Specifier <em>Specifier</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.Specifier
   * @generated
   */
  public Adapter createSpecifierAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.Option <em>Option</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.Option
   * @generated
   */
  public Adapter createOptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.Application <em>Application</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.Application
   * @generated
   */
  public Adapter createApplicationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.ApplicationUILayer <em>Application UI Layer</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.ApplicationUILayer
   * @generated
   */
  public Adapter createApplicationUILayerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.ApplicationUIPackage <em>Application UI Package</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.ApplicationUIPackage
   * @generated
   */
  public Adapter createApplicationUIPackageAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.ApplicationRecipes <em>Application Recipes</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.ApplicationRecipes
   * @generated
   */
  public Adapter createApplicationRecipesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.ApplicationRecipe <em>Application Recipe</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.ApplicationRecipe
   * @generated
   */
  public Adapter createApplicationRecipeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.ApplicationMappers <em>Application Mappers</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.ApplicationMappers
   * @generated
   */
  public Adapter createApplicationMappersAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.ApplicationMapper <em>Application Mapper</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.ApplicationMapper
   * @generated
   */
  public Adapter createApplicationMapperAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.MethodPointer <em>Method Pointer</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.MethodPointer
   * @generated
   */
  public Adapter createMethodPointerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.Mappers <em>Mappers</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.Mappers
   * @generated
   */
  public Adapter createMappersAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.Mapper <em>Mapper</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.Mapper
   * @generated
   */
  public Adapter createMapperAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.JavaMapper <em>Java Mapper</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.JavaMapper
   * @generated
   */
  public Adapter createJavaMapperAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.Recipes <em>Recipes</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.Recipes
   * @generated
   */
  public Adapter createRecipesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.DeploymentSequence <em>Deployment Sequence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.DeploymentSequence
   * @generated
   */
  public Adapter createDeploymentSequenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.DeploymentComponents <em>Deployment Components</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.DeploymentComponents
   * @generated
   */
  public Adapter createDeploymentComponentsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.DeploymentComponent <em>Deployment Component</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.DeploymentComponent
   * @generated
   */
  public Adapter createDeploymentComponentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.DeploymentStarStep <em>Deployment Star Step</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.DeploymentStarStep
   * @generated
   */
  public Adapter createDeploymentStarStepAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.UsingMappers <em>Using Mappers</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.UsingMappers
   * @generated
   */
  public Adapter createUsingMappersAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.Recipe <em>Recipe</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.Recipe
   * @generated
   */
  public Adapter createRecipeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.Ingredient <em>Ingredient</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.Ingredient
   * @generated
   */
  public Adapter createIngredientAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.Component <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.Component
   * @generated
   */
  public Adapter createComponentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.JavaComponent <em>Java Component</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.JavaComponent
   * @generated
   */
  public Adapter createJavaComponentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.Infrastructure <em>Infrastructure</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.Infrastructure
   * @generated
   */
  public Adapter createInfrastructureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.Configuration <em>Configuration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.Configuration
   * @generated
   */
  public Adapter createConfigurationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.ModelMapper <em>Model Mapper</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.ModelMapper
   * @generated
   */
  public Adapter createModelMapperAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.Property
   * @generated
   */
  public Adapter createPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.MappingSpecifier <em>Mapping Specifier</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.MappingSpecifier
   * @generated
   */
  public Adapter createMappingSpecifierAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.Query <em>Query</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.Query
   * @generated
   */
  public Adapter createQueryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.QueryVariable <em>Query Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.QueryVariable
   * @generated
   */
  public Adapter createQueryVariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.ArtifactRef <em>Artifact Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.ArtifactRef
   * @generated
   */
  public Adapter createArtifactRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.TypePointer <em>Type Pointer</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.TypePointer
   * @generated
   */
  public Adapter createTypePointerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.TypeDefinition <em>Type Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.TypeDefinition
   * @generated
   */
  public Adapter createTypeDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.TypeElement <em>Type Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.TypeElement
   * @generated
   */
  public Adapter createTypeElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.Primitive <em>Primitive</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.Primitive
   * @generated
   */
  public Adapter createPrimitiveAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.Type
   * @generated
   */
  public Adapter createTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.TypeReference <em>Type Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.TypeReference
   * @generated
   */
  public Adapter createTypeReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.TypeExtension <em>Type Extension</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.TypeExtension
   * @generated
   */
  public Adapter createTypeExtensionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.Attribute
   * @generated
   */
  public Adapter createAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.Operation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.Operation
   * @generated
   */
  public Adapter createOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.Parameter
   * @generated
   */
  public Adapter createParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.ReturnValue <em>Return Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.ReturnValue
   * @generated
   */
  public Adapter createReturnValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.Enumarator <em>Enumarator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.Enumarator
   * @generated
   */
  public Adapter createEnumaratorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.EnumAttribute <em>Enum Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.EnumAttribute
   * @generated
   */
  public Adapter createEnumAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.TypesRepository <em>Types Repository</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.TypesRepository
   * @generated
   */
  public Adapter createTypesRepositoryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.Types <em>Types</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.Types
   * @generated
   */
  public Adapter createTypesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.Package <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.Package
   * @generated
   */
  public Adapter createPackageAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.UIPackage <em>UI Package</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.UIPackage
   * @generated
   */
  public Adapter createUIPackageAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.Form <em>Form</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.Form
   * @generated
   */
  public Adapter createFormAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.FormView <em>Form View</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.FormView
   * @generated
   */
  public Adapter createFormViewAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.FormDataControls <em>Form Data Controls</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.FormDataControls
   * @generated
   */
  public Adapter createFormDataControlsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.Controls <em>Controls</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.Controls
   * @generated
   */
  public Adapter createControlsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.Trigger <em>Trigger</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.Trigger
   * @generated
   */
  public Adapter createTriggerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.TriggerParameter <em>Trigger Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.TriggerParameter
   * @generated
   */
  public Adapter createTriggerParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.ContextValue <em>Context Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.ContextValue
   * @generated
   */
  public Adapter createContextValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.PREFormTrigger <em>PRE Form Trigger</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.PREFormTrigger
   * @generated
   */
  public Adapter createPREFormTriggerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.PREQueryTrigger <em>PRE Query Trigger</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.PREQueryTrigger
   * @generated
   */
  public Adapter createPREQueryTriggerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.POSTQueryTrigger <em>POST Query Trigger</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.POSTQueryTrigger
   * @generated
   */
  public Adapter createPOSTQueryTriggerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.PREInsertTrigger <em>PRE Insert Trigger</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.PREInsertTrigger
   * @generated
   */
  public Adapter createPREInsertTriggerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.PREDeleteTrigger <em>PRE Delete Trigger</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.PREDeleteTrigger
   * @generated
   */
  public Adapter createPREDeleteTriggerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.POSTCreateTrigger <em>POST Create Trigger</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.POSTCreateTrigger
   * @generated
   */
  public Adapter createPOSTCreateTriggerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.PREUpdateTrigger <em>PRE Update Trigger</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.PREUpdateTrigger
   * @generated
   */
  public Adapter createPREUpdateTriggerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.CreateTrigger <em>Create Trigger</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.CreateTrigger
   * @generated
   */
  public Adapter createCreateTriggerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.InsertTrigger <em>Insert Trigger</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.InsertTrigger
   * @generated
   */
  public Adapter createInsertTriggerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.UpdateTrigger <em>Update Trigger</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.UpdateTrigger
   * @generated
   */
  public Adapter createUpdateTriggerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.DeleteTrigger <em>Delete Trigger</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.DeleteTrigger
   * @generated
   */
  public Adapter createDeleteTriggerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.SearchTrigger <em>Search Trigger</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.SearchTrigger
   * @generated
   */
  public Adapter createSearchTriggerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.Root <em>Root</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.Root
   * @generated
   */
  public Adapter createRootAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.DataControl <em>Data Control</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.DataControl
   * @generated
   */
  public Adapter createDataControlAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.Relation <em>Relation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.Relation
   * @generated
   */
  public Adapter createRelationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.ArtificialField <em>Artificial Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.ArtificialField
   * @generated
   */
  public Adapter createArtificialFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.Link <em>Link</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.Link
   * @generated
   */
  public Adapter createLinkAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.ApplicationInfrastructureLayer <em>Application Infrastructure Layer</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.ApplicationInfrastructureLayer
   * @generated
   */
  public Adapter createApplicationInfrastructureLayerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.EnterpriseInfrastructure <em>Enterprise Infrastructure</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.EnterpriseInfrastructure
   * @generated
   */
  public Adapter createEnterpriseInfrastructureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.Datacenter <em>Datacenter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.Datacenter
   * @generated
   */
  public Adapter createDatacenterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.Subsystem <em>Subsystem</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.Subsystem
   * @generated
   */
  public Adapter createSubsystemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.InfrastructureLayer <em>Infrastructure Layer</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.InfrastructureLayer
   * @generated
   */
  public Adapter createInfrastructureLayerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.InfrastructureConnection <em>Infrastructure Connection</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.InfrastructureConnection
   * @generated
   */
  public Adapter createInfrastructureConnectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.InfrastructureComponent <em>Infrastructure Component</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.InfrastructureComponent
   * @generated
   */
  public Adapter createInfrastructureComponentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.Server <em>Server</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.Server
   * @generated
   */
  public Adapter createServerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.Router <em>Router</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.Router
   * @generated
   */
  public Adapter createRouterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.Hub <em>Hub</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.Hub
   * @generated
   */
  public Adapter createHubAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.Storage <em>Storage</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.Storage
   * @generated
   */
  public Adapter createStorageAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.ServerClaster <em>Server Claster</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.ServerClaster
   * @generated
   */
  public Adapter createServerClasterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //DomainAdapterFactory
