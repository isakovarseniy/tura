/**
 */
package domain.impl;

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
import domain.ContinuousIintegration;
import domain.CreateMethod;
import domain.Domain;
import domain.DomainApplication;
import domain.DomainApplications;
import domain.DomainArtifact;
import domain.DomainArtifacts;
import domain.DomainFactory;
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
import domain.ModelMapper;
import domain.ModelQuery;
import domain.ORMEntity;
import domain.Operation;
import domain.Option;
import domain.OtherMethod;
import domain.Parameter;
import domain.PlatformLayers;
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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class DomainFactoryImpl extends EFactoryImpl implements DomainFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DomainFactory init()
  {
    try
    {
      DomainFactory theDomainFactory = (DomainFactory)EPackage.Registry.INSTANCE.getEFactory("http://tura.org/2013/v1/domain"); 
      if (theDomainFactory != null)
      {
        return theDomainFactory;
      }
    }
    catch (Exception exception)
    {
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
  public DomainFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case DomainPackage.DOMAIN: return createDomain();
      case DomainPackage.DOMAIN_ARTIFACTS: return createDomainArtifacts();
      case DomainPackage.DOMAIN_TYPES: return createDomainTypes();
      case DomainPackage.DOMAIN_APPLICATIONS: return createDomainApplications();
      case DomainPackage.DOMAIN_APPLICATION: return createDomainApplication();
      case DomainPackage.DOMAIN_ARTIFACT: return createDomainArtifact();
      case DomainPackage.ORM_ENTITY: return createORMEntity();
      case DomainPackage.JPA_SERVICE: return createJPAService();
      case DomainPackage.EJB_SERVICE: return createEJBService();
      case DomainPackage.CONTINUOUS_IINTEGRATION: return createContinuousIintegration();
      case DomainPackage.ARTIFACTS: return createArtifacts();
      case DomainPackage.ARTIFACT: return createArtifact();
      case DomainPackage.CONFIG_VARIABLE: return createConfigVariable();
      case DomainPackage.MODEL_QUERY: return createModelQuery();
      case DomainPackage.QUERY_PARAMETER: return createQueryParameter();
      case DomainPackage.SPECIFIER: return createSpecifier();
      case DomainPackage.OPTION: return createOption();
      case DomainPackage.APPLICATION: return createApplication();
      case DomainPackage.APPLICATION_RECIPES: return createApplicationRecipes();
      case DomainPackage.APPLICATION_RECIPE: return createApplicationRecipe();
      case DomainPackage.APPLICATION_MAPPERS: return createApplicationMappers();
      case DomainPackage.APPLICATION_MAPPER: return createApplicationMapper();
      case DomainPackage.BUSINESS_OBJECTS: return createBusinessObjects();
      case DomainPackage.BUSINESS_OBJECT: return createBusinessObject();
      case DomainPackage.BUSINESS_METHOD: return createBusinessMethod();
      case DomainPackage.CREATE_METHOD: return createCreateMethod();
      case DomainPackage.INSERT_METHOD: return createInsertMethod();
      case DomainPackage.UPDATE_METHOD: return createUpdateMethod();
      case DomainPackage.REMOVE_METHOD: return createRemoveMethod();
      case DomainPackage.SEARCH_METHOD: return createSearchMethod();
      case DomainPackage.OTHER_METHOD: return createOtherMethod();
      case DomainPackage.MAPPERS: return createMappers();
      case DomainPackage.MAPPER: return createMapper();
      case DomainPackage.JAVA_MAPPER: return createJavaMapper();
      case DomainPackage.RECIPES: return createRecipes();
      case DomainPackage.USING_MAPPERS: return createUsingMappers();
      case DomainPackage.RECIPE: return createRecipe();
      case DomainPackage.INGREDIENT: return createIngredient();
      case DomainPackage.COMPONENT: return createComponent();
      case DomainPackage.JAVA_COMPONENT: return createJavaComponent();
      case DomainPackage.INFRASTRUCTURE: return createInfrastructure();
      case DomainPackage.CONFIGURATION: return createConfiguration();
      case DomainPackage.MODEL_MAPPER: return createModelMapper();
      case DomainPackage.PROPERTY: return createProperty();
      case DomainPackage.MAPPING_SPECIFIER: return createMappingSpecifier();
      case DomainPackage.QUERY: return createQuery();
      case DomainPackage.QUERY_VARIABLE: return createQueryVariable();
      case DomainPackage.ARTIFACT_REF: return createArtifactRef();
      case DomainPackage.TYPE_POINTER: return createTypePointer();
      case DomainPackage.TYPE_DEFINITION: return createTypeDefinition();
      case DomainPackage.TYPE_ELEMENT: return createTypeElement();
      case DomainPackage.PRIMITIVE: return createPrimitive();
      case DomainPackage.TYPE: return createType();
      case DomainPackage.TYPE_REFERENCE: return createTypeReference();
      case DomainPackage.TYPE_EXTENSION: return createTypeExtension();
      case DomainPackage.ATTRIBUTE: return createAttribute();
      case DomainPackage.OPERATION: return createOperation();
      case DomainPackage.PARAMETER: return createParameter();
      case DomainPackage.RETURN_VALUE: return createReturnValue();
      case DomainPackage.ENUMARATOR: return createEnumarator();
      case DomainPackage.ENUM_ATTRIBUTE: return createEnumAttribute();
      case DomainPackage.TYPES_REPOSITORY: return createTypesRepository();
      case DomainPackage.TYPES: return createTypes();
      case DomainPackage.PACKAGE: return createPackage();
      case DomainPackage.BUSINESS_PACKAGE: return createBusinessPackage();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case DomainPackage.PLATFORM_LAYERS:
        return createPlatformLayersFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case DomainPackage.PLATFORM_LAYERS:
        return convertPlatformLayersToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Domain createDomain()
  {
    DomainImpl domain = new DomainImpl();
    return domain;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomainArtifacts createDomainArtifacts()
  {
    DomainArtifactsImpl domainArtifacts = new DomainArtifactsImpl();
    return domainArtifacts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomainTypes createDomainTypes()
  {
    DomainTypesImpl domainTypes = new DomainTypesImpl();
    return domainTypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomainApplications createDomainApplications()
  {
    DomainApplicationsImpl domainApplications = new DomainApplicationsImpl();
    return domainApplications;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomainApplication createDomainApplication()
  {
    DomainApplicationImpl domainApplication = new DomainApplicationImpl();
    return domainApplication;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomainArtifact createDomainArtifact()
  {
    DomainArtifactImpl domainArtifact = new DomainArtifactImpl();
    return domainArtifact;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ORMEntity createORMEntity()
  {
    ORMEntityImpl ormEntity = new ORMEntityImpl();
    return ormEntity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JPAService createJPAService()
  {
    JPAServiceImpl jpaService = new JPAServiceImpl();
    return jpaService;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EJBService createEJBService()
  {
    EJBServiceImpl ejbService = new EJBServiceImpl();
    return ejbService;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContinuousIintegration createContinuousIintegration()
  {
    ContinuousIintegrationImpl continuousIintegration = new ContinuousIintegrationImpl();
    return continuousIintegration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Artifacts createArtifacts()
  {
    ArtifactsImpl artifacts = new ArtifactsImpl();
    return artifacts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Artifact createArtifact()
  {
    ArtifactImpl artifact = new ArtifactImpl();
    return artifact;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConfigVariable createConfigVariable()
  {
    ConfigVariableImpl configVariable = new ConfigVariableImpl();
    return configVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelQuery createModelQuery()
  {
    ModelQueryImpl modelQuery = new ModelQueryImpl();
    return modelQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QueryParameter createQueryParameter()
  {
    QueryParameterImpl queryParameter = new QueryParameterImpl();
    return queryParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Specifier createSpecifier()
  {
    SpecifierImpl specifier = new SpecifierImpl();
    return specifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Option createOption()
  {
    OptionImpl option = new OptionImpl();
    return option;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Application createApplication()
  {
    ApplicationImpl application = new ApplicationImpl();
    return application;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ApplicationRecipes createApplicationRecipes()
  {
    ApplicationRecipesImpl applicationRecipes = new ApplicationRecipesImpl();
    return applicationRecipes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ApplicationRecipe createApplicationRecipe()
  {
    ApplicationRecipeImpl applicationRecipe = new ApplicationRecipeImpl();
    return applicationRecipe;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ApplicationMappers createApplicationMappers()
  {
    ApplicationMappersImpl applicationMappers = new ApplicationMappersImpl();
    return applicationMappers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ApplicationMapper createApplicationMapper()
  {
    ApplicationMapperImpl applicationMapper = new ApplicationMapperImpl();
    return applicationMapper;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BusinessObjects createBusinessObjects()
  {
    BusinessObjectsImpl businessObjects = new BusinessObjectsImpl();
    return businessObjects;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BusinessObject createBusinessObject()
  {
    BusinessObjectImpl businessObject = new BusinessObjectImpl();
    return businessObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BusinessMethod createBusinessMethod()
  {
    BusinessMethodImpl businessMethod = new BusinessMethodImpl();
    return businessMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CreateMethod createCreateMethod()
  {
    CreateMethodImpl createMethod = new CreateMethodImpl();
    return createMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InsertMethod createInsertMethod()
  {
    InsertMethodImpl insertMethod = new InsertMethodImpl();
    return insertMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UpdateMethod createUpdateMethod()
  {
    UpdateMethodImpl updateMethod = new UpdateMethodImpl();
    return updateMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RemoveMethod createRemoveMethod()
  {
    RemoveMethodImpl removeMethod = new RemoveMethodImpl();
    return removeMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SearchMethod createSearchMethod()
  {
    SearchMethodImpl searchMethod = new SearchMethodImpl();
    return searchMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OtherMethod createOtherMethod()
  {
    OtherMethodImpl otherMethod = new OtherMethodImpl();
    return otherMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mappers createMappers()
  {
    MappersImpl mappers = new MappersImpl();
    return mappers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mapper createMapper()
  {
    MapperImpl mapper = new MapperImpl();
    return mapper;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JavaMapper createJavaMapper()
  {
    JavaMapperImpl javaMapper = new JavaMapperImpl();
    return javaMapper;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Recipes createRecipes()
  {
    RecipesImpl recipes = new RecipesImpl();
    return recipes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UsingMappers createUsingMappers()
  {
    UsingMappersImpl usingMappers = new UsingMappersImpl();
    return usingMappers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Recipe createRecipe()
  {
    RecipeImpl recipe = new RecipeImpl();
    return recipe;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Ingredient createIngredient()
  {
    IngredientImpl ingredient = new IngredientImpl();
    return ingredient;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Component createComponent()
  {
    ComponentImpl component = new ComponentImpl();
    return component;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JavaComponent createJavaComponent()
  {
    JavaComponentImpl javaComponent = new JavaComponentImpl();
    return javaComponent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Infrastructure createInfrastructure()
  {
    InfrastructureImpl infrastructure = new InfrastructureImpl();
    return infrastructure;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Configuration createConfiguration()
  {
    ConfigurationImpl configuration = new ConfigurationImpl();
    return configuration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelMapper createModelMapper()
  {
    ModelMapperImpl modelMapper = new ModelMapperImpl();
    return modelMapper;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Property createProperty()
  {
    PropertyImpl property = new PropertyImpl();
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MappingSpecifier createMappingSpecifier()
  {
    MappingSpecifierImpl mappingSpecifier = new MappingSpecifierImpl();
    return mappingSpecifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Query createQuery()
  {
    QueryImpl query = new QueryImpl();
    return query;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QueryVariable createQueryVariable()
  {
    QueryVariableImpl queryVariable = new QueryVariableImpl();
    return queryVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArtifactRef createArtifactRef()
  {
    ArtifactRefImpl artifactRef = new ArtifactRefImpl();
    return artifactRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypePointer createTypePointer()
  {
    TypePointerImpl typePointer = new TypePointerImpl();
    return typePointer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeDefinition createTypeDefinition()
  {
    TypeDefinitionImpl typeDefinition = new TypeDefinitionImpl();
    return typeDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeElement createTypeElement()
  {
    TypeElementImpl typeElement = new TypeElementImpl();
    return typeElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Primitive createPrimitive()
  {
    PrimitiveImpl primitive = new PrimitiveImpl();
    return primitive;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeReference createTypeReference()
  {
    TypeReferenceImpl typeReference = new TypeReferenceImpl();
    return typeReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeExtension createTypeExtension()
  {
    TypeExtensionImpl typeExtension = new TypeExtensionImpl();
    return typeExtension;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute createAttribute()
  {
    AttributeImpl attribute = new AttributeImpl();
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operation createOperation()
  {
    OperationImpl operation = new OperationImpl();
    return operation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter createParameter()
  {
    ParameterImpl parameter = new ParameterImpl();
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReturnValue createReturnValue()
  {
    ReturnValueImpl returnValue = new ReturnValueImpl();
    return returnValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Enumarator createEnumarator()
  {
    EnumaratorImpl enumarator = new EnumaratorImpl();
    return enumarator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumAttribute createEnumAttribute()
  {
    EnumAttributeImpl enumAttribute = new EnumAttributeImpl();
    return enumAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypesRepository createTypesRepository()
  {
    TypesRepositoryImpl typesRepository = new TypesRepositoryImpl();
    return typesRepository;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Types createTypes()
  {
    TypesImpl types = new TypesImpl();
    return types;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public domain.Package createPackage()
  {
    PackageImpl package_ = new PackageImpl();
    return package_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BusinessPackage createBusinessPackage()
  {
    BusinessPackageImpl businessPackage = new BusinessPackageImpl();
    return businessPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PlatformLayers createPlatformLayersFromString(EDataType eDataType, String initialValue)
  {
    PlatformLayers result = PlatformLayers.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertPlatformLayersToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomainPackage getDomainPackage()
  {
    return (DomainPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static DomainPackage getPackage()
  {
    return DomainPackage.eINSTANCE;
  }

} //DomainFactoryImpl
