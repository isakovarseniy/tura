/**
 */
package domain.util;

import domain.Application;
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
import domain.EnumAttribute;
import domain.Enumarator;
import domain.Form;
import domain.FormDataControls;
import domain.FormView;
import domain.Infrastructure;
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
import domain.SearchTrigger;
import domain.Specifier;
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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see domain.DomainPackage
 * @generated
 */
public class DomainSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DomainPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomainSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = DomainPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case DomainPackage.DOMAIN:
      {
        Domain domain = (Domain)theEObject;
        T result = caseDomain(domain);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.DOMAIN_ARTIFACTS:
      {
        DomainArtifacts domainArtifacts = (DomainArtifacts)theEObject;
        T result = caseDomainArtifacts(domainArtifacts);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.DOMAIN_TYPES:
      {
        DomainTypes domainTypes = (DomainTypes)theEObject;
        T result = caseDomainTypes(domainTypes);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.DOMAIN_APPLICATIONS:
      {
        DomainApplications domainApplications = (DomainApplications)theEObject;
        T result = caseDomainApplications(domainApplications);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.DOMAIN_APPLICATION:
      {
        DomainApplication domainApplication = (DomainApplication)theEObject;
        T result = caseDomainApplication(domainApplication);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.DOMAIN_ARTIFACT:
      {
        DomainArtifact domainArtifact = (DomainArtifact)theEObject;
        T result = caseDomainArtifact(domainArtifact);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.ORM_ENTITY:
      {
        ORMEntity ormEntity = (ORMEntity)theEObject;
        T result = caseORMEntity(ormEntity);
        if (result == null) result = caseDomainArtifact(ormEntity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.JPA_SERVICE:
      {
        JPAService jpaService = (JPAService)theEObject;
        T result = caseJPAService(jpaService);
        if (result == null) result = caseDomainArtifact(jpaService);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.EJB_SERVICE:
      {
        EJBService ejbService = (EJBService)theEObject;
        T result = caseEJBService(ejbService);
        if (result == null) result = caseDomainArtifact(ejbService);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.CONTINUOUS_IINTEGRATION:
      {
        ContinuousIintegration continuousIintegration = (ContinuousIintegration)theEObject;
        T result = caseContinuousIintegration(continuousIintegration);
        if (result == null) result = caseDomainArtifact(continuousIintegration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.ARTIFACTS:
      {
        Artifacts artifacts = (Artifacts)theEObject;
        T result = caseArtifacts(artifacts);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.ARTIFACT:
      {
        Artifact artifact = (Artifact)theEObject;
        T result = caseArtifact(artifact);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.CONFIG_VARIABLE:
      {
        ConfigVariable configVariable = (ConfigVariable)theEObject;
        T result = caseConfigVariable(configVariable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.MODEL_QUERY:
      {
        ModelQuery modelQuery = (ModelQuery)theEObject;
        T result = caseModelQuery(modelQuery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.QUERY_PARAMETER:
      {
        QueryParameter queryParameter = (QueryParameter)theEObject;
        T result = caseQueryParameter(queryParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.SPECIFIER:
      {
        Specifier specifier = (Specifier)theEObject;
        T result = caseSpecifier(specifier);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.OPTION:
      {
        Option option = (Option)theEObject;
        T result = caseOption(option);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.APPLICATION:
      {
        Application application = (Application)theEObject;
        T result = caseApplication(application);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.APPLICATION_UI_LAYER:
      {
        ApplicationUILayer applicationUILayer = (ApplicationUILayer)theEObject;
        T result = caseApplicationUILayer(applicationUILayer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.APPLICATION_UI_PACKAGE:
      {
        ApplicationUIPackage applicationUIPackage = (ApplicationUIPackage)theEObject;
        T result = caseApplicationUIPackage(applicationUIPackage);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.APPLICATION_RECIPES:
      {
        ApplicationRecipes applicationRecipes = (ApplicationRecipes)theEObject;
        T result = caseApplicationRecipes(applicationRecipes);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.APPLICATION_RECIPE:
      {
        ApplicationRecipe applicationRecipe = (ApplicationRecipe)theEObject;
        T result = caseApplicationRecipe(applicationRecipe);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.APPLICATION_MAPPERS:
      {
        ApplicationMappers applicationMappers = (ApplicationMappers)theEObject;
        T result = caseApplicationMappers(applicationMappers);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.APPLICATION_MAPPER:
      {
        ApplicationMapper applicationMapper = (ApplicationMapper)theEObject;
        T result = caseApplicationMapper(applicationMapper);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.METHOD_POINTER:
      {
        MethodPointer methodPointer = (MethodPointer)theEObject;
        T result = caseMethodPointer(methodPointer);
        if (result == null) result = caseTypePointer(methodPointer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.MAPPERS:
      {
        Mappers mappers = (Mappers)theEObject;
        T result = caseMappers(mappers);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.MAPPER:
      {
        Mapper mapper = (Mapper)theEObject;
        T result = caseMapper(mapper);
        if (result == null) result = caseTypePointer(mapper);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.JAVA_MAPPER:
      {
        JavaMapper javaMapper = (JavaMapper)theEObject;
        T result = caseJavaMapper(javaMapper);
        if (result == null) result = caseMapper(javaMapper);
        if (result == null) result = caseTypePointer(javaMapper);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.RECIPES:
      {
        Recipes recipes = (Recipes)theEObject;
        T result = caseRecipes(recipes);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.DEPLOYMENT_SEQUENCE:
      {
        DeploymentSequence deploymentSequence = (DeploymentSequence)theEObject;
        T result = caseDeploymentSequence(deploymentSequence);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.DEPLOYMENT_COMPONENTS:
      {
        DeploymentComponents deploymentComponents = (DeploymentComponents)theEObject;
        T result = caseDeploymentComponents(deploymentComponents);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.DEPLOYMENT_COMPONENT:
      {
        DeploymentComponent deploymentComponent = (DeploymentComponent)theEObject;
        T result = caseDeploymentComponent(deploymentComponent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.DEPLOYMENT_STAR_STEP:
      {
        DeploymentStarStep deploymentStarStep = (DeploymentStarStep)theEObject;
        T result = caseDeploymentStarStep(deploymentStarStep);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.USING_MAPPERS:
      {
        UsingMappers usingMappers = (UsingMappers)theEObject;
        T result = caseUsingMappers(usingMappers);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.RECIPE:
      {
        Recipe recipe = (Recipe)theEObject;
        T result = caseRecipe(recipe);
        if (result == null) result = caseUsingMappers(recipe);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.INGREDIENT:
      {
        Ingredient ingredient = (Ingredient)theEObject;
        T result = caseIngredient(ingredient);
        if (result == null) result = caseUsingMappers(ingredient);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.COMPONENT:
      {
        Component component = (Component)theEObject;
        T result = caseComponent(component);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.JAVA_COMPONENT:
      {
        JavaComponent javaComponent = (JavaComponent)theEObject;
        T result = caseJavaComponent(javaComponent);
        if (result == null) result = caseComponent(javaComponent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.INFRASTRUCTURE:
      {
        Infrastructure infrastructure = (Infrastructure)theEObject;
        T result = caseInfrastructure(infrastructure);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.CONFIGURATION:
      {
        Configuration configuration = (Configuration)theEObject;
        T result = caseConfiguration(configuration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.MODEL_MAPPER:
      {
        ModelMapper modelMapper = (ModelMapper)theEObject;
        T result = caseModelMapper(modelMapper);
        if (result == null) result = caseArtifactRef(modelMapper);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.PROPERTY:
      {
        Property property = (Property)theEObject;
        T result = caseProperty(property);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.MAPPING_SPECIFIER:
      {
        MappingSpecifier mappingSpecifier = (MappingSpecifier)theEObject;
        T result = caseMappingSpecifier(mappingSpecifier);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.QUERY:
      {
        Query query = (Query)theEObject;
        T result = caseQuery(query);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.QUERY_VARIABLE:
      {
        QueryVariable queryVariable = (QueryVariable)theEObject;
        T result = caseQueryVariable(queryVariable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.ARTIFACT_REF:
      {
        ArtifactRef artifactRef = (ArtifactRef)theEObject;
        T result = caseArtifactRef(artifactRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.TYPE_POINTER:
      {
        TypePointer typePointer = (TypePointer)theEObject;
        T result = caseTypePointer(typePointer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.TYPE_DEFINITION:
      {
        TypeDefinition typeDefinition = (TypeDefinition)theEObject;
        T result = caseTypeDefinition(typeDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.TYPE_ELEMENT:
      {
        TypeElement typeElement = (TypeElement)theEObject;
        T result = caseTypeElement(typeElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.PRIMITIVE:
      {
        Primitive primitive = (Primitive)theEObject;
        T result = casePrimitive(primitive);
        if (result == null) result = caseTypeElement(primitive);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.TYPE:
      {
        Type type = (Type)theEObject;
        T result = caseType(type);
        if (result == null) result = caseTypeElement(type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.TYPE_REFERENCE:
      {
        TypeReference typeReference = (TypeReference)theEObject;
        T result = caseTypeReference(typeReference);
        if (result == null) result = caseTypeElement(typeReference);
        if (result == null) result = caseTypePointer(typeReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.TYPE_EXTENSION:
      {
        TypeExtension typeExtension = (TypeExtension)theEObject;
        T result = caseTypeExtension(typeExtension);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.ATTRIBUTE:
      {
        Attribute attribute = (Attribute)theEObject;
        T result = caseAttribute(attribute);
        if (result == null) result = caseTypePointer(attribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.OPERATION:
      {
        Operation operation = (Operation)theEObject;
        T result = caseOperation(operation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.PARAMETER:
      {
        Parameter parameter = (Parameter)theEObject;
        T result = caseParameter(parameter);
        if (result == null) result = caseTypePointer(parameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.RETURN_VALUE:
      {
        ReturnValue returnValue = (ReturnValue)theEObject;
        T result = caseReturnValue(returnValue);
        if (result == null) result = caseTypePointer(returnValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.ENUMARATOR:
      {
        Enumarator enumarator = (Enumarator)theEObject;
        T result = caseEnumarator(enumarator);
        if (result == null) result = caseTypeElement(enumarator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.ENUM_ATTRIBUTE:
      {
        EnumAttribute enumAttribute = (EnumAttribute)theEObject;
        T result = caseEnumAttribute(enumAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.TYPES_REPOSITORY:
      {
        TypesRepository typesRepository = (TypesRepository)theEObject;
        T result = caseTypesRepository(typesRepository);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.TYPES:
      {
        Types types = (Types)theEObject;
        T result = caseTypes(types);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.PACKAGE:
      {
        domain.Package package_ = (domain.Package)theEObject;
        T result = casePackage(package_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.UI_PACKAGE:
      {
        UIPackage uiPackage = (UIPackage)theEObject;
        T result = caseUIPackage(uiPackage);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.FORM:
      {
        Form form = (Form)theEObject;
        T result = caseForm(form);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.FORM_VIEW:
      {
        FormView formView = (FormView)theEObject;
        T result = caseFormView(formView);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.FORM_DATA_CONTROLS:
      {
        FormDataControls formDataControls = (FormDataControls)theEObject;
        T result = caseFormDataControls(formDataControls);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.CONTROLS:
      {
        Controls controls = (Controls)theEObject;
        T result = caseControls(controls);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.TRIGGER:
      {
        Trigger trigger = (Trigger)theEObject;
        T result = caseTrigger(trigger);
        if (result == null) result = caseMethodPointer(trigger);
        if (result == null) result = caseTypePointer(trigger);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.TRIGGER_PARAMETER:
      {
        TriggerParameter triggerParameter = (TriggerParameter)theEObject;
        T result = caseTriggerParameter(triggerParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.CONTEXT_VALUE:
      {
        ContextValue contextValue = (ContextValue)theEObject;
        T result = caseContextValue(contextValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.PRE_FORM_TRIGGER:
      {
        PREFormTrigger preFormTrigger = (PREFormTrigger)theEObject;
        T result = casePREFormTrigger(preFormTrigger);
        if (result == null) result = caseTrigger(preFormTrigger);
        if (result == null) result = caseMethodPointer(preFormTrigger);
        if (result == null) result = caseTypePointer(preFormTrigger);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.PRE_QUERY_TRIGGER:
      {
        PREQueryTrigger preQueryTrigger = (PREQueryTrigger)theEObject;
        T result = casePREQueryTrigger(preQueryTrigger);
        if (result == null) result = caseTrigger(preQueryTrigger);
        if (result == null) result = caseMethodPointer(preQueryTrigger);
        if (result == null) result = caseTypePointer(preQueryTrigger);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.POST_QUERY_TRIGGER:
      {
        POSTQueryTrigger postQueryTrigger = (POSTQueryTrigger)theEObject;
        T result = casePOSTQueryTrigger(postQueryTrigger);
        if (result == null) result = caseTrigger(postQueryTrigger);
        if (result == null) result = caseMethodPointer(postQueryTrigger);
        if (result == null) result = caseTypePointer(postQueryTrigger);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.PRE_INSERT_TRIGGER:
      {
        PREInsertTrigger preInsertTrigger = (PREInsertTrigger)theEObject;
        T result = casePREInsertTrigger(preInsertTrigger);
        if (result == null) result = caseTrigger(preInsertTrigger);
        if (result == null) result = caseMethodPointer(preInsertTrigger);
        if (result == null) result = caseTypePointer(preInsertTrigger);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.PRE_DELETE_TRIGGER:
      {
        PREDeleteTrigger preDeleteTrigger = (PREDeleteTrigger)theEObject;
        T result = casePREDeleteTrigger(preDeleteTrigger);
        if (result == null) result = caseTrigger(preDeleteTrigger);
        if (result == null) result = caseMethodPointer(preDeleteTrigger);
        if (result == null) result = caseTypePointer(preDeleteTrigger);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.POST_CREATE_TRIGGER:
      {
        POSTCreateTrigger postCreateTrigger = (POSTCreateTrigger)theEObject;
        T result = casePOSTCreateTrigger(postCreateTrigger);
        if (result == null) result = caseTrigger(postCreateTrigger);
        if (result == null) result = caseMethodPointer(postCreateTrigger);
        if (result == null) result = caseTypePointer(postCreateTrigger);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.PRE_UPDATE_TRIGGER:
      {
        PREUpdateTrigger preUpdateTrigger = (PREUpdateTrigger)theEObject;
        T result = casePREUpdateTrigger(preUpdateTrigger);
        if (result == null) result = caseTrigger(preUpdateTrigger);
        if (result == null) result = caseMethodPointer(preUpdateTrigger);
        if (result == null) result = caseTypePointer(preUpdateTrigger);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.CREATE_TRIGGER:
      {
        CreateTrigger createTrigger = (CreateTrigger)theEObject;
        T result = caseCreateTrigger(createTrigger);
        if (result == null) result = caseTrigger(createTrigger);
        if (result == null) result = caseMethodPointer(createTrigger);
        if (result == null) result = caseTypePointer(createTrigger);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.INSERT_TRIGGER:
      {
        InsertTrigger insertTrigger = (InsertTrigger)theEObject;
        T result = caseInsertTrigger(insertTrigger);
        if (result == null) result = caseTrigger(insertTrigger);
        if (result == null) result = caseMethodPointer(insertTrigger);
        if (result == null) result = caseTypePointer(insertTrigger);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.UPDATE_TRIGGER:
      {
        UpdateTrigger updateTrigger = (UpdateTrigger)theEObject;
        T result = caseUpdateTrigger(updateTrigger);
        if (result == null) result = caseTrigger(updateTrigger);
        if (result == null) result = caseMethodPointer(updateTrigger);
        if (result == null) result = caseTypePointer(updateTrigger);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.DELETE_TRIGGER:
      {
        DeleteTrigger deleteTrigger = (DeleteTrigger)theEObject;
        T result = caseDeleteTrigger(deleteTrigger);
        if (result == null) result = caseTrigger(deleteTrigger);
        if (result == null) result = caseMethodPointer(deleteTrigger);
        if (result == null) result = caseTypePointer(deleteTrigger);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.SEARCH_TRIGGER:
      {
        SearchTrigger searchTrigger = (SearchTrigger)theEObject;
        T result = caseSearchTrigger(searchTrigger);
        if (result == null) result = caseTrigger(searchTrigger);
        if (result == null) result = caseMethodPointer(searchTrigger);
        if (result == null) result = caseTypePointer(searchTrigger);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.ROOT:
      {
        Root root = (Root)theEObject;
        T result = caseRoot(root);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.DATA_CONTROL:
      {
        DataControl dataControl = (DataControl)theEObject;
        T result = caseDataControl(dataControl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.RELATION:
      {
        Relation relation = (Relation)theEObject;
        T result = caseRelation(relation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.ARTIFICIAL_FIELD:
      {
        ArtificialField artificialField = (ArtificialField)theEObject;
        T result = caseArtificialField(artificialField);
        if (result == null) result = caseTypePointer(artificialField);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.LINK:
      {
        Link link = (Link)theEObject;
        T result = caseLink(link);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Domain</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Domain</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDomain(Domain object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Artifacts</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Artifacts</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDomainArtifacts(DomainArtifacts object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Types</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Types</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDomainTypes(DomainTypes object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Applications</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Applications</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDomainApplications(DomainApplications object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Application</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Application</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDomainApplication(DomainApplication object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Artifact</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Artifact</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDomainArtifact(DomainArtifact object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ORM Entity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ORM Entity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseORMEntity(ORMEntity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>JPA Service</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>JPA Service</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJPAService(JPAService object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EJB Service</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EJB Service</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEJBService(EJBService object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Continuous Iintegration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Continuous Iintegration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContinuousIintegration(ContinuousIintegration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Artifacts</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Artifacts</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArtifacts(Artifacts object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Artifact</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Artifact</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArtifact(Artifact object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Config Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Config Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConfigVariable(ConfigVariable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model Query</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model Query</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModelQuery(ModelQuery object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Query Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Query Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQueryParameter(QueryParameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Specifier</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Specifier</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSpecifier(Specifier object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Option</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Option</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOption(Option object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Application</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Application</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseApplication(Application object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Application UI Layer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Application UI Layer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseApplicationUILayer(ApplicationUILayer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Application UI Package</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Application UI Package</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseApplicationUIPackage(ApplicationUIPackage object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Application Recipes</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Application Recipes</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseApplicationRecipes(ApplicationRecipes object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Application Recipe</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Application Recipe</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseApplicationRecipe(ApplicationRecipe object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Application Mappers</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Application Mappers</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseApplicationMappers(ApplicationMappers object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Application Mapper</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Application Mapper</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseApplicationMapper(ApplicationMapper object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Method Pointer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Method Pointer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMethodPointer(MethodPointer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mappers</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mappers</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMappers(Mappers object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mapper</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mapper</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMapper(Mapper object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Java Mapper</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Java Mapper</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJavaMapper(JavaMapper object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Recipes</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Recipes</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRecipes(Recipes object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Deployment Sequence</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Deployment Sequence</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeploymentSequence(DeploymentSequence object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Deployment Components</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Deployment Components</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeploymentComponents(DeploymentComponents object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Deployment Component</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Deployment Component</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeploymentComponent(DeploymentComponent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Deployment Star Step</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Deployment Star Step</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeploymentStarStep(DeploymentStarStep object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Using Mappers</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Using Mappers</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUsingMappers(UsingMappers object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Recipe</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Recipe</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRecipe(Recipe object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ingredient</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ingredient</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIngredient(Ingredient object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Component</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComponent(Component object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Java Component</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Java Component</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJavaComponent(JavaComponent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Infrastructure</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Infrastructure</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInfrastructure(Infrastructure object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Configuration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Configuration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConfiguration(Configuration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model Mapper</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model Mapper</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModelMapper(ModelMapper object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProperty(Property object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mapping Specifier</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mapping Specifier</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMappingSpecifier(MappingSpecifier object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Query</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Query</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQuery(Query object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Query Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Query Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQueryVariable(QueryVariable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Artifact Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Artifact Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArtifactRef(ArtifactRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Pointer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Pointer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypePointer(TypePointer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeDefinition(TypeDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeElement(TypeElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Primitive</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Primitive</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrimitive(Primitive object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseType(Type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeReference(TypeReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Extension</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Extension</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeExtension(TypeExtension object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttribute(Attribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOperation(Operation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameter(Parameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Return Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Return Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReturnValue(ReturnValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enumarator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enumarator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnumarator(Enumarator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enum Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enum Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnumAttribute(EnumAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Types Repository</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Types Repository</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypesRepository(TypesRepository object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Types</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Types</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypes(Types object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Package</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Package</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePackage(domain.Package object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UI Package</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UI Package</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUIPackage(UIPackage object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Form</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Form</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseForm(Form object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Form View</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Form View</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFormView(FormView object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Form Data Controls</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Form Data Controls</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFormDataControls(FormDataControls object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Controls</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Controls</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseControls(Controls object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Trigger</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Trigger</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTrigger(Trigger object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Trigger Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Trigger Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTriggerParameter(TriggerParameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Context Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Context Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContextValue(ContextValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>PRE Form Trigger</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>PRE Form Trigger</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePREFormTrigger(PREFormTrigger object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>PRE Query Trigger</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>PRE Query Trigger</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePREQueryTrigger(PREQueryTrigger object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>POST Query Trigger</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>POST Query Trigger</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePOSTQueryTrigger(POSTQueryTrigger object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>PRE Insert Trigger</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>PRE Insert Trigger</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePREInsertTrigger(PREInsertTrigger object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>PRE Delete Trigger</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>PRE Delete Trigger</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePREDeleteTrigger(PREDeleteTrigger object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>POST Create Trigger</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>POST Create Trigger</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePOSTCreateTrigger(POSTCreateTrigger object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>PRE Update Trigger</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>PRE Update Trigger</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePREUpdateTrigger(PREUpdateTrigger object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Create Trigger</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Create Trigger</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCreateTrigger(CreateTrigger object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Insert Trigger</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Insert Trigger</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInsertTrigger(InsertTrigger object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Update Trigger</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Update Trigger</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUpdateTrigger(UpdateTrigger object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Delete Trigger</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Delete Trigger</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeleteTrigger(DeleteTrigger object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Search Trigger</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Search Trigger</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSearchTrigger(SearchTrigger object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Root</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Root</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRoot(Root object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Control</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Control</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataControl(DataControl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Relation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Relation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRelation(Relation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Artificial Field</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Artificial Field</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArtificialField(ArtificialField object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Link</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Link</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLink(Link object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //DomainSwitch
