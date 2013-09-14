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
import domain.JavaMapper;
import domain.Mapper;
import domain.Mappers;
import domain.MappingSpecifier;
import domain.MappingVariable;
import domain.ModelMapper;
import domain.ORMEntity;
import domain.Operation;
import domain.Option;
import domain.OtherMethod;
import domain.Parameter;
import domain.Primitive;
import domain.Property;
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
import domain.Variable;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

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
      public Adapter caseVariable(Variable object)
      {
        return createVariableAdapter();
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
      public Adapter caseBusinessObjects(BusinessObjects object)
      {
        return createBusinessObjectsAdapter();
      }
      @Override
      public Adapter caseBusinessObject(BusinessObject object)
      {
        return createBusinessObjectAdapter();
      }
      @Override
      public Adapter caseBusinessMethod(BusinessMethod object)
      {
        return createBusinessMethodAdapter();
      }
      @Override
      public Adapter caseCreateMethod(CreateMethod object)
      {
        return createCreateMethodAdapter();
      }
      @Override
      public Adapter caseInsertMethod(InsertMethod object)
      {
        return createInsertMethodAdapter();
      }
      @Override
      public Adapter caseUpdateMethod(UpdateMethod object)
      {
        return createUpdateMethodAdapter();
      }
      @Override
      public Adapter caseRemoveMethod(RemoveMethod object)
      {
        return createRemoveMethodAdapter();
      }
      @Override
      public Adapter caseSearchMethod(SearchMethod object)
      {
        return createSearchMethodAdapter();
      }
      @Override
      public Adapter caseOtherMethod(OtherMethod object)
      {
        return createOtherMethodAdapter();
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
      public Adapter caseIngredient(Ingredient object)
      {
        return createIngredientAdapter();
      }
      @Override
      public Adapter caseRecipe(Recipe object)
      {
        return createRecipeAdapter();
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
      public Adapter caseComponent(Component object)
      {
        return createComponentAdapter();
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
      public Adapter caseMappingVariable(MappingVariable object)
      {
        return createMappingVariableAdapter();
      }
      @Override
      public Adapter caseArtifactRef(ArtifactRef object)
      {
        return createArtifactRefAdapter();
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
      public Adapter caseTypePointer(TypePointer object)
      {
        return createTypePointerAdapter();
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
      public Adapter casePrimitive(Primitive object)
      {
        return createPrimitiveAdapter();
      }
      @Override
      public Adapter casePackage(domain.Package object)
      {
        return createPackageAdapter();
      }
      @Override
      public Adapter caseBusinessPackage(BusinessPackage object)
      {
        return createBusinessPackageAdapter();
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
   * Creates a new adapter for an object of class '{@link domain.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.Variable
   * @generated
   */
  public Adapter createVariableAdapter()
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
   * Creates a new adapter for an object of class '{@link domain.BusinessObjects <em>Business Objects</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.BusinessObjects
   * @generated
   */
  public Adapter createBusinessObjectsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.BusinessObject <em>Business Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.BusinessObject
   * @generated
   */
  public Adapter createBusinessObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.BusinessMethod <em>Business Method</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.BusinessMethod
   * @generated
   */
  public Adapter createBusinessMethodAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.CreateMethod <em>Create Method</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.CreateMethod
   * @generated
   */
  public Adapter createCreateMethodAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.InsertMethod <em>Insert Method</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.InsertMethod
   * @generated
   */
  public Adapter createInsertMethodAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.UpdateMethod <em>Update Method</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.UpdateMethod
   * @generated
   */
  public Adapter createUpdateMethodAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.RemoveMethod <em>Remove Method</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.RemoveMethod
   * @generated
   */
  public Adapter createRemoveMethodAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.SearchMethod <em>Search Method</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.SearchMethod
   * @generated
   */
  public Adapter createSearchMethodAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.OtherMethod <em>Other Method</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.OtherMethod
   * @generated
   */
  public Adapter createOtherMethodAdapter()
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
   * Creates a new adapter for an object of class '{@link domain.MappingVariable <em>Mapping Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.MappingVariable
   * @generated
   */
  public Adapter createMappingVariableAdapter()
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
   * Creates a new adapter for an object of class '{@link domain.BusinessPackage <em>Business Package</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.BusinessPackage
   * @generated
   */
  public Adapter createBusinessPackageAdapter()
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
