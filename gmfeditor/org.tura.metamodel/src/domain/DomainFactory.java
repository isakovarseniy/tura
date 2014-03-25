/**
 */
package domain;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see domain.DomainPackage
 * @generated
 */
public interface DomainFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DomainFactory eINSTANCE = domain.impl.DomainFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Domain</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Domain</em>'.
   * @generated
   */
  Domain createDomain();

  /**
   * Returns a new object of class '<em>Artifacts</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Artifacts</em>'.
   * @generated
   */
  DomainArtifacts createDomainArtifacts();

  /**
   * Returns a new object of class '<em>Types</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Types</em>'.
   * @generated
   */
  DomainTypes createDomainTypes();

  /**
   * Returns a new object of class '<em>Applications</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Applications</em>'.
   * @generated
   */
  DomainApplications createDomainApplications();

  /**
   * Returns a new object of class '<em>Application</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Application</em>'.
   * @generated
   */
  DomainApplication createDomainApplication();

  /**
   * Returns a new object of class '<em>Artifact</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Artifact</em>'.
   * @generated
   */
  DomainArtifact createDomainArtifact();

  /**
   * Returns a new object of class '<em>ORM Entity</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ORM Entity</em>'.
   * @generated
   */
  ORMEntity createORMEntity();

  /**
   * Returns a new object of class '<em>JPA Service</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>JPA Service</em>'.
   * @generated
   */
  JPAService createJPAService();

  /**
   * Returns a new object of class '<em>EJB Service</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>EJB Service</em>'.
   * @generated
   */
  EJBService createEJBService();

  /**
   * Returns a new object of class '<em>Continuous Iintegration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Continuous Iintegration</em>'.
   * @generated
   */
  ContinuousIintegration createContinuousIintegration();

  /**
   * Returns a new object of class '<em>Artifacts</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Artifacts</em>'.
   * @generated
   */
  Artifacts createArtifacts();

  /**
   * Returns a new object of class '<em>Artifact</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Artifact</em>'.
   * @generated
   */
  Artifact createArtifact();

  /**
   * Returns a new object of class '<em>Config Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Config Variable</em>'.
   * @generated
   */
  ConfigVariable createConfigVariable();

  /**
   * Returns a new object of class '<em>Model Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model Query</em>'.
   * @generated
   */
  ModelQuery createModelQuery();

  /**
   * Returns a new object of class '<em>Query Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Query Parameter</em>'.
   * @generated
   */
  QueryParameter createQueryParameter();

  /**
   * Returns a new object of class '<em>Specifier</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Specifier</em>'.
   * @generated
   */
  Specifier createSpecifier();

  /**
   * Returns a new object of class '<em>Option</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Option</em>'.
   * @generated
   */
  Option createOption();

  /**
   * Returns a new object of class '<em>Application</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Application</em>'.
   * @generated
   */
  Application createApplication();

  /**
   * Returns a new object of class '<em>Application UI Layer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Application UI Layer</em>'.
   * @generated
   */
  ApplicationUILayer createApplicationUILayer();

  /**
   * Returns a new object of class '<em>Application UI Package</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Application UI Package</em>'.
   * @generated
   */
  ApplicationUIPackage createApplicationUIPackage();

  /**
   * Returns a new object of class '<em>Application Recipes</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Application Recipes</em>'.
   * @generated
   */
  ApplicationRecipes createApplicationRecipes();

  /**
   * Returns a new object of class '<em>Application Recipe</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Application Recipe</em>'.
   * @generated
   */
  ApplicationRecipe createApplicationRecipe();

  /**
   * Returns a new object of class '<em>Application Mappers</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Application Mappers</em>'.
   * @generated
   */
  ApplicationMappers createApplicationMappers();

  /**
   * Returns a new object of class '<em>Application Mapper</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Application Mapper</em>'.
   * @generated
   */
  ApplicationMapper createApplicationMapper();

  /**
   * Returns a new object of class '<em>Method Pointer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Method Pointer</em>'.
   * @generated
   */
  MethodPointer createMethodPointer();

  /**
   * Returns a new object of class '<em>Mappers</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mappers</em>'.
   * @generated
   */
  Mappers createMappers();

  /**
   * Returns a new object of class '<em>Mapper</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mapper</em>'.
   * @generated
   */
  Mapper createMapper();

  /**
   * Returns a new object of class '<em>Java Mapper</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Java Mapper</em>'.
   * @generated
   */
  JavaMapper createJavaMapper();

  /**
   * Returns a new object of class '<em>Recipes</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Recipes</em>'.
   * @generated
   */
  Recipes createRecipes();

  /**
   * Returns a new object of class '<em>Deployment Sequence</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Deployment Sequence</em>'.
   * @generated
   */
  DeploymentSequence createDeploymentSequence();

  /**
   * Returns a new object of class '<em>Deployment Components</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Deployment Components</em>'.
   * @generated
   */
  DeploymentComponents createDeploymentComponents();

  /**
   * Returns a new object of class '<em>Deployment Component</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Deployment Component</em>'.
   * @generated
   */
  DeploymentComponent createDeploymentComponent();

  /**
   * Returns a new object of class '<em>Deployment Star Step</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Deployment Star Step</em>'.
   * @generated
   */
  DeploymentStarStep createDeploymentStarStep();

  /**
   * Returns a new object of class '<em>Using Mappers</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Using Mappers</em>'.
   * @generated
   */
  UsingMappers createUsingMappers();

  /**
   * Returns a new object of class '<em>Recipe</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Recipe</em>'.
   * @generated
   */
  Recipe createRecipe();

  /**
   * Returns a new object of class '<em>Ingredient</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ingredient</em>'.
   * @generated
   */
  Ingredient createIngredient();

  /**
   * Returns a new object of class '<em>Component</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Component</em>'.
   * @generated
   */
  Component createComponent();

  /**
   * Returns a new object of class '<em>Java Component</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Java Component</em>'.
   * @generated
   */
  JavaComponent createJavaComponent();

  /**
   * Returns a new object of class '<em>Infrastructure</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Infrastructure</em>'.
   * @generated
   */
  Infrastructure createInfrastructure();

  /**
   * Returns a new object of class '<em>Configuration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Configuration</em>'.
   * @generated
   */
  Configuration createConfiguration();

  /**
   * Returns a new object of class '<em>Model Mapper</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model Mapper</em>'.
   * @generated
   */
  ModelMapper createModelMapper();

  /**
   * Returns a new object of class '<em>Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Property</em>'.
   * @generated
   */
  Property createProperty();

  /**
   * Returns a new object of class '<em>Mapping Specifier</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mapping Specifier</em>'.
   * @generated
   */
  MappingSpecifier createMappingSpecifier();

  /**
   * Returns a new object of class '<em>Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Query</em>'.
   * @generated
   */
  Query createQuery();

  /**
   * Returns a new object of class '<em>Query Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Query Variable</em>'.
   * @generated
   */
  QueryVariable createQueryVariable();

  /**
   * Returns a new object of class '<em>Artifact Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Artifact Ref</em>'.
   * @generated
   */
  ArtifactRef createArtifactRef();

  /**
   * Returns a new object of class '<em>Type Pointer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Pointer</em>'.
   * @generated
   */
  TypePointer createTypePointer();

  /**
   * Returns a new object of class '<em>Type Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Definition</em>'.
   * @generated
   */
  TypeDefinition createTypeDefinition();

  /**
   * Returns a new object of class '<em>Type Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Element</em>'.
   * @generated
   */
  TypeElement createTypeElement();

  /**
   * Returns a new object of class '<em>Primitive</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Primitive</em>'.
   * @generated
   */
  Primitive createPrimitive();

  /**
   * Returns a new object of class '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type</em>'.
   * @generated
   */
  Type createType();

  /**
   * Returns a new object of class '<em>Type Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Reference</em>'.
   * @generated
   */
  TypeReference createTypeReference();

  /**
   * Returns a new object of class '<em>Type Extension</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Extension</em>'.
   * @generated
   */
  TypeExtension createTypeExtension();

  /**
   * Returns a new object of class '<em>Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute</em>'.
   * @generated
   */
  Attribute createAttribute();

  /**
   * Returns a new object of class '<em>Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Operation</em>'.
   * @generated
   */
  Operation createOperation();

  /**
   * Returns a new object of class '<em>Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameter</em>'.
   * @generated
   */
  Parameter createParameter();

  /**
   * Returns a new object of class '<em>Return Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Return Value</em>'.
   * @generated
   */
  ReturnValue createReturnValue();

  /**
   * Returns a new object of class '<em>Enumarator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enumarator</em>'.
   * @generated
   */
  Enumarator createEnumarator();

  /**
   * Returns a new object of class '<em>Enum Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enum Attribute</em>'.
   * @generated
   */
  EnumAttribute createEnumAttribute();

  /**
   * Returns a new object of class '<em>Types Repository</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Types Repository</em>'.
   * @generated
   */
  TypesRepository createTypesRepository();

  /**
   * Returns a new object of class '<em>Types</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Types</em>'.
   * @generated
   */
  Types createTypes();

  /**
   * Returns a new object of class '<em>Package</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Package</em>'.
   * @generated
   */
  Package createPackage();

  /**
   * Returns a new object of class '<em>UI Package</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>UI Package</em>'.
   * @generated
   */
  UIPackage createUIPackage();

  /**
   * Returns a new object of class '<em>Form</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Form</em>'.
   * @generated
   */
  Form createForm();

  /**
   * Returns a new object of class '<em>Form View</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Form View</em>'.
   * @generated
   */
  FormView createFormView();

  /**
   * Returns a new object of class '<em>Form Data Controls</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Form Data Controls</em>'.
   * @generated
   */
  FormDataControls createFormDataControls();

  /**
   * Returns a new object of class '<em>Controls</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Controls</em>'.
   * @generated
   */
  Controls createControls();

  /**
   * Returns a new object of class '<em>Trigger</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Trigger</em>'.
   * @generated
   */
  Trigger createTrigger();

  /**
   * Returns a new object of class '<em>Trigger Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Trigger Parameter</em>'.
   * @generated
   */
  TriggerParameter createTriggerParameter();

  /**
   * Returns a new object of class '<em>Context Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Context Value</em>'.
   * @generated
   */
  ContextValue createContextValue();

  /**
   * Returns a new object of class '<em>PRE Form Trigger</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>PRE Form Trigger</em>'.
   * @generated
   */
  PREFormTrigger createPREFormTrigger();

  /**
   * Returns a new object of class '<em>PRE Query Trigger</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>PRE Query Trigger</em>'.
   * @generated
   */
  PREQueryTrigger createPREQueryTrigger();

  /**
   * Returns a new object of class '<em>POST Query Trigger</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>POST Query Trigger</em>'.
   * @generated
   */
  POSTQueryTrigger createPOSTQueryTrigger();

  /**
   * Returns a new object of class '<em>PRE Insert Trigger</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>PRE Insert Trigger</em>'.
   * @generated
   */
  PREInsertTrigger createPREInsertTrigger();

  /**
   * Returns a new object of class '<em>PRE Delete Trigger</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>PRE Delete Trigger</em>'.
   * @generated
   */
  PREDeleteTrigger createPREDeleteTrigger();

  /**
   * Returns a new object of class '<em>POST Create Trigger</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>POST Create Trigger</em>'.
   * @generated
   */
  POSTCreateTrigger createPOSTCreateTrigger();

  /**
   * Returns a new object of class '<em>PRE Update Trigger</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>PRE Update Trigger</em>'.
   * @generated
   */
  PREUpdateTrigger createPREUpdateTrigger();

  /**
   * Returns a new object of class '<em>Create Trigger</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Create Trigger</em>'.
   * @generated
   */
  CreateTrigger createCreateTrigger();

  /**
   * Returns a new object of class '<em>Insert Trigger</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Insert Trigger</em>'.
   * @generated
   */
  InsertTrigger createInsertTrigger();

  /**
   * Returns a new object of class '<em>Update Trigger</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Update Trigger</em>'.
   * @generated
   */
  UpdateTrigger createUpdateTrigger();

  /**
   * Returns a new object of class '<em>Delete Trigger</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Delete Trigger</em>'.
   * @generated
   */
  DeleteTrigger createDeleteTrigger();

  /**
   * Returns a new object of class '<em>Search Trigger</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Search Trigger</em>'.
   * @generated
   */
  SearchTrigger createSearchTrigger();

  /**
   * Returns a new object of class '<em>Root</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Root</em>'.
   * @generated
   */
  Root createRoot();

  /**
   * Returns a new object of class '<em>Data Control</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Control</em>'.
   * @generated
   */
  DataControl createDataControl();

  /**
   * Returns a new object of class '<em>Relation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Relation</em>'.
   * @generated
   */
  Relation createRelation();

  /**
   * Returns a new object of class '<em>Artificial Field</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Artificial Field</em>'.
   * @generated
   */
  ArtificialField createArtificialField();

  /**
   * Returns a new object of class '<em>Link</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Link</em>'.
   * @generated
   */
  Link createLink();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  DomainPackage getDomainPackage();

} //DomainFactory
