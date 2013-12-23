/**
 */
package domain.util;

import domain.Application;
import domain.ApplicationMapper;
import domain.ApplicationMappers;
import domain.ApplicationRecipe;
import domain.ApplicationRecipes;
import domain.Artifact;
import domain.ArtifactRef;
import domain.Artifacts;
import domain.Attribute;
import domain.BusinessMethod;
import domain.BusinessObject;
import domain.BusinessObjects;
import domain.BusinessPackage;
import domain.Component;
import domain.ConfigVariable;
import domain.Configuration;
import domain.CreateMethod;
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
import domain.Infrastructure;
import domain.Ingredient;
import domain.InsertMethod;
import domain.JPAService;
import domain.JavaComponent;
import domain.JavaMapper;
import domain.Mapper;
import domain.Mappers;
import domain.MappingSpecifier;
import domain.MavenComponent;
import domain.ModelMapper;
import domain.ModelQuery;
import domain.ORMEntity;
import domain.Operation;
import domain.Option;
import domain.OtherMethod;
import domain.Parameter;
import domain.Primitive;
import domain.Property;
import domain.Query;
import domain.QueryParameter;
import domain.QueryVariable;
import domain.Recipe;
import domain.Recipes;
import domain.RemoveMethod;
import domain.ReturnValue;
import domain.SearchMethod;
import domain.Specifier;
import domain.Type;
import domain.TypeDefinition;
import domain.TypeElement;
import domain.TypeExtension;
import domain.TypePointer;
import domain.TypeReference;
import domain.Types;
import domain.TypesRepository;
import domain.UpdateMethod;
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
      case DomainPackage.BUSINESS_OBJECTS:
      {
        BusinessObjects businessObjects = (BusinessObjects)theEObject;
        T result = caseBusinessObjects(businessObjects);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.BUSINESS_OBJECT:
      {
        BusinessObject businessObject = (BusinessObject)theEObject;
        T result = caseBusinessObject(businessObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.BUSINESS_METHOD:
      {
        BusinessMethod businessMethod = (BusinessMethod)theEObject;
        T result = caseBusinessMethod(businessMethod);
        if (result == null) result = caseTypePointer(businessMethod);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.CREATE_METHOD:
      {
        CreateMethod createMethod = (CreateMethod)theEObject;
        T result = caseCreateMethod(createMethod);
        if (result == null) result = caseBusinessMethod(createMethod);
        if (result == null) result = caseTypePointer(createMethod);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.INSERT_METHOD:
      {
        InsertMethod insertMethod = (InsertMethod)theEObject;
        T result = caseInsertMethod(insertMethod);
        if (result == null) result = caseBusinessMethod(insertMethod);
        if (result == null) result = caseTypePointer(insertMethod);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.UPDATE_METHOD:
      {
        UpdateMethod updateMethod = (UpdateMethod)theEObject;
        T result = caseUpdateMethod(updateMethod);
        if (result == null) result = caseBusinessMethod(updateMethod);
        if (result == null) result = caseTypePointer(updateMethod);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.REMOVE_METHOD:
      {
        RemoveMethod removeMethod = (RemoveMethod)theEObject;
        T result = caseRemoveMethod(removeMethod);
        if (result == null) result = caseBusinessMethod(removeMethod);
        if (result == null) result = caseTypePointer(removeMethod);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.SEARCH_METHOD:
      {
        SearchMethod searchMethod = (SearchMethod)theEObject;
        T result = caseSearchMethod(searchMethod);
        if (result == null) result = caseBusinessMethod(searchMethod);
        if (result == null) result = caseTypePointer(searchMethod);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.OTHER_METHOD:
      {
        OtherMethod otherMethod = (OtherMethod)theEObject;
        T result = caseOtherMethod(otherMethod);
        if (result == null) result = caseBusinessMethod(otherMethod);
        if (result == null) result = caseTypePointer(otherMethod);
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
      case DomainPackage.BUSINESS_PACKAGE:
      {
        BusinessPackage businessPackage = (BusinessPackage)theEObject;
        T result = caseBusinessPackage(businessPackage);
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
   * Returns the result of interpreting the object as an instance of '<em>Business Objects</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Business Objects</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBusinessObjects(BusinessObjects object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Business Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Business Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBusinessObject(BusinessObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Business Method</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Business Method</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBusinessMethod(BusinessMethod object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Create Method</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Create Method</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCreateMethod(CreateMethod object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Insert Method</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Insert Method</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInsertMethod(InsertMethod object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Update Method</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Update Method</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUpdateMethod(UpdateMethod object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Remove Method</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Remove Method</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRemoveMethod(RemoveMethod object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Search Method</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Search Method</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSearchMethod(SearchMethod object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Other Method</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Other Method</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOtherMethod(OtherMethod object)
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
   * Returns the result of interpreting the object as an instance of '<em>Business Package</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Business Package</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBusinessPackage(BusinessPackage object)
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
