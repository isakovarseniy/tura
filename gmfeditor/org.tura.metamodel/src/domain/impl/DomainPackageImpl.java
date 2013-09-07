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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

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
  private EClass variableEClass = null;

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
  private EClass businessObjectsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass businessObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass businessMethodEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass createMethodEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass insertMethodEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass updateMethodEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass removeMethodEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass searchMethodEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass otherMethodEClass = null;

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
  private EClass recipeEClass = null;

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
  private EClass modelMapperEClass = null;

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
  private EClass mappingVariableEClass = null;

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
  private EClass typePointerEClass = null;

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
  private EClass primitiveEClass = null;

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
  private EClass businessPackageEClass = null;

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
  public EClass getVariable()
  {
    return variableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariable_Uid()
  {
    return (EAttribute)variableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariable_Name()
  {
    return (EAttribute)variableEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariable_Parent()
  {
    return (EReference)variableEClass.getEStructuralFeatures().get(2);
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
  public EReference getApplication_Parent()
  {
    return (EReference)applicationEClass.getEStructuralFeatures().get(3);
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
  public EClass getBusinessObjects()
  {
    return businessObjectsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBusinessObjects_Uid()
  {
    return (EAttribute)businessObjectsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBusinessObjects_BusinessObject()
  {
    return (EReference)businessObjectsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBusinessObjects_Parent()
  {
    return (EReference)businessObjectsEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBusinessObject()
  {
    return businessObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBusinessObject_Uid()
  {
    return (EAttribute)businessObjectEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBusinessObject_Name()
  {
    return (EAttribute)businessObjectEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBusinessObject_Parent()
  {
    return (EReference)businessObjectEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBusinessObject_CreateMethods()
  {
    return (EReference)businessObjectEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBusinessObject_InsertMethods()
  {
    return (EReference)businessObjectEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBusinessObject_UpdateMethods()
  {
    return (EReference)businessObjectEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBusinessObject_RemoveMethods()
  {
    return (EReference)businessObjectEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBusinessObject_SearchMethods()
  {
    return (EReference)businessObjectEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBusinessObject_OthersMethods()
  {
    return (EReference)businessObjectEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBusinessMethod()
  {
    return businessMethodEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBusinessMethod_Uid()
  {
    return (EAttribute)businessMethodEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBusinessMethod_Method()
  {
    return (EAttribute)businessMethodEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCreateMethod()
  {
    return createMethodEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCreateMethod_Parent()
  {
    return (EReference)createMethodEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInsertMethod()
  {
    return insertMethodEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInsertMethod_Parent()
  {
    return (EReference)insertMethodEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUpdateMethod()
  {
    return updateMethodEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUpdateMethod_Parent()
  {
    return (EReference)updateMethodEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRemoveMethod()
  {
    return removeMethodEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRemoveMethod_Parent()
  {
    return (EReference)removeMethodEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSearchMethod()
  {
    return searchMethodEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSearchMethod_Parent()
  {
    return (EReference)searchMethodEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOtherMethod()
  {
    return otherMethodEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOtherMethod_Parent()
  {
    return (EReference)otherMethodEClass.getEStructuralFeatures().get(0);
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
  public EReference getRecipes_Parent()
  {
    return (EReference)recipesEClass.getEStructuralFeatures().get(3);
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
  public EReference getRecipe_Components()
  {
    return (EReference)recipeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRecipe_RecipeConfig()
  {
    return (EReference)recipeEClass.getEStructuralFeatures().get(4);
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
  public EReference getComponent_Components()
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
  public EReference getModelMapper_Variables()
  {
    return (EReference)modelMapperEClass.getEStructuralFeatures().get(3);
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
  public EReference getConfiguration_Recipe()
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
  public EAttribute getProperty_Name()
  {
    return (EAttribute)propertyEClass.getEStructuralFeatures().get(1);
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
  public EAttribute getMappingSpecifier_Name()
  {
    return (EAttribute)mappingSpecifierEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMappingSpecifier_Value()
  {
    return (EAttribute)mappingSpecifierEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMappingVariable()
  {
    return mappingVariableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMappingVariable_Uid()
  {
    return (EAttribute)mappingVariableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMappingVariable_Name()
  {
    return (EAttribute)mappingVariableEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMappingVariable_Value()
  {
    return (EAttribute)mappingVariableEClass.getEStructuralFeatures().get(2);
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
  public EAttribute getArtifactRef_DomainArtifact()
  {
    return (EAttribute)artifactRefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArtifactRef_ArtifactName()
  {
    return (EAttribute)artifactRefEClass.getEStructuralFeatures().get(2);
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
  public EReference getTypeDefinition_Enums()
  {
    return (EReference)typeDefinitionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeDefinition_Parent()
  {
    return (EReference)typeDefinitionEClass.getEStructuralFeatures().get(3);
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
  public EReference getTypeElement_Parent()
  {
    return (EReference)typeElementEClass.getEStructuralFeatures().get(0);
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
  public EAttribute getType_Uid()
  {
    return (EAttribute)typeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getType_Name()
  {
    return (EAttribute)typeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getType_Attributes()
  {
    return (EReference)typeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getType_Operations()
  {
    return (EReference)typeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getType_Extension()
  {
    return (EReference)typeEClass.getEStructuralFeatures().get(4);
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
  public EAttribute getTypeReference_Uid()
  {
    return (EAttribute)typeReferenceEClass.getEStructuralFeatures().get(0);
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
  public EReference getAttribute_Parent()
  {
    return (EReference)attributeEClass.getEStructuralFeatures().get(2);
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
  public EReference getParameter_Parent()
  {
    return (EReference)parameterEClass.getEStructuralFeatures().get(2);
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
  public EAttribute getEnumarator_Uid()
  {
    return (EAttribute)enumaratorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEnumarator_Name()
  {
    return (EAttribute)enumaratorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnumarator_Parent()
  {
    return (EReference)enumaratorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnumarator_Values()
  {
    return (EReference)enumaratorEClass.getEStructuralFeatures().get(3);
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
  public EClass getTypePointer()
  {
    return typePointerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypePointer_PackageName()
  {
    return (EAttribute)typePointerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypePointer_TypeName()
  {
    return (EAttribute)typePointerEClass.getEStructuralFeatures().get(1);
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
  public EReference getTypes_Primitives()
  {
    return (EReference)typesEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypes_Packages()
  {
    return (EReference)typesEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypes_BusinessPackages()
  {
    return (EReference)typesEClass.getEStructuralFeatures().get(5);
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
  public EAttribute getPrimitive_Uid()
  {
    return (EAttribute)primitiveEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPrimitive_Name()
  {
    return (EAttribute)primitiveEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPrimitive_Parent()
  {
    return (EReference)primitiveEClass.getEStructuralFeatures().get(2);
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
  public EClass getBusinessPackage()
  {
    return businessPackageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBusinessPackage_Uid()
  {
    return (EAttribute)businessPackageEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBusinessPackage_Name()
  {
    return (EAttribute)businessPackageEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBusinessPackage_Businessobjects()
  {
    return (EReference)businessPackageEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBusinessPackage_Parent()
  {
    return (EReference)businessPackageEClass.getEStructuralFeatures().get(3);
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

    variableEClass = createEClass(VARIABLE);
    createEAttribute(variableEClass, VARIABLE__UID);
    createEAttribute(variableEClass, VARIABLE__NAME);
    createEReference(variableEClass, VARIABLE__PARENT);

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
    createEReference(applicationEClass, APPLICATION__PARENT);

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

    businessObjectsEClass = createEClass(BUSINESS_OBJECTS);
    createEAttribute(businessObjectsEClass, BUSINESS_OBJECTS__UID);
    createEReference(businessObjectsEClass, BUSINESS_OBJECTS__BUSINESS_OBJECT);
    createEReference(businessObjectsEClass, BUSINESS_OBJECTS__PARENT);

    businessObjectEClass = createEClass(BUSINESS_OBJECT);
    createEAttribute(businessObjectEClass, BUSINESS_OBJECT__UID);
    createEAttribute(businessObjectEClass, BUSINESS_OBJECT__NAME);
    createEReference(businessObjectEClass, BUSINESS_OBJECT__PARENT);
    createEReference(businessObjectEClass, BUSINESS_OBJECT__CREATE_METHODS);
    createEReference(businessObjectEClass, BUSINESS_OBJECT__INSERT_METHODS);
    createEReference(businessObjectEClass, BUSINESS_OBJECT__UPDATE_METHODS);
    createEReference(businessObjectEClass, BUSINESS_OBJECT__REMOVE_METHODS);
    createEReference(businessObjectEClass, BUSINESS_OBJECT__SEARCH_METHODS);
    createEReference(businessObjectEClass, BUSINESS_OBJECT__OTHERS_METHODS);

    businessMethodEClass = createEClass(BUSINESS_METHOD);
    createEAttribute(businessMethodEClass, BUSINESS_METHOD__UID);
    createEAttribute(businessMethodEClass, BUSINESS_METHOD__METHOD);

    createMethodEClass = createEClass(CREATE_METHOD);
    createEReference(createMethodEClass, CREATE_METHOD__PARENT);

    insertMethodEClass = createEClass(INSERT_METHOD);
    createEReference(insertMethodEClass, INSERT_METHOD__PARENT);

    updateMethodEClass = createEClass(UPDATE_METHOD);
    createEReference(updateMethodEClass, UPDATE_METHOD__PARENT);

    removeMethodEClass = createEClass(REMOVE_METHOD);
    createEReference(removeMethodEClass, REMOVE_METHOD__PARENT);

    searchMethodEClass = createEClass(SEARCH_METHOD);
    createEReference(searchMethodEClass, SEARCH_METHOD__PARENT);

    otherMethodEClass = createEClass(OTHER_METHOD);
    createEReference(otherMethodEClass, OTHER_METHOD__PARENT);

    mappersEClass = createEClass(MAPPERS);
    createEAttribute(mappersEClass, MAPPERS__UID);
    createEReference(mappersEClass, MAPPERS__MAPPERS);
    createEReference(mappersEClass, MAPPERS__PARENT);

    mapperEClass = createEClass(MAPPER);
    createEAttribute(mapperEClass, MAPPER__UID);
    createEReference(mapperEClass, MAPPER__PARENT);

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
    createEReference(recipesEClass, RECIPES__PARENT);

    recipeEClass = createEClass(RECIPE);
    createEAttribute(recipeEClass, RECIPE__UID);
    createEReference(recipeEClass, RECIPE__PARENT);
    createEAttribute(recipeEClass, RECIPE__NAME);
    createEReference(recipeEClass, RECIPE__COMPONENTS);
    createEReference(recipeEClass, RECIPE__RECIPE_CONFIG);

    componentEClass = createEClass(COMPONENT);
    createEAttribute(componentEClass, COMPONENT__UID);
    createEAttribute(componentEClass, COMPONENT__NAME);
    createEReference(componentEClass, COMPONENT__COMPONENTS);
    createEReference(componentEClass, COMPONENT__MAPPERS);

    modelMapperEClass = createEClass(MODEL_MAPPER);
    createEAttribute(modelMapperEClass, MODEL_MAPPER__NAME);
    createEReference(modelMapperEClass, MODEL_MAPPER__PARENT);
    createEReference(modelMapperEClass, MODEL_MAPPER__SPECIFIERS);
    createEReference(modelMapperEClass, MODEL_MAPPER__VARIABLES);

    configurationEClass = createEClass(CONFIGURATION);
    createEAttribute(configurationEClass, CONFIGURATION__UID);
    createEAttribute(configurationEClass, CONFIGURATION__NAME);
    createEReference(configurationEClass, CONFIGURATION__RECIPE);
    createEReference(configurationEClass, CONFIGURATION__PROPERTIES);
    createEReference(configurationEClass, CONFIGURATION__CONFIG_EXTENSION);
    createEReference(configurationEClass, CONFIGURATION__PARENT);

    propertyEClass = createEClass(PROPERTY);
    createEAttribute(propertyEClass, PROPERTY__UID);
    createEAttribute(propertyEClass, PROPERTY__NAME);
    createEAttribute(propertyEClass, PROPERTY__VALUE);

    mappingSpecifierEClass = createEClass(MAPPING_SPECIFIER);
    createEAttribute(mappingSpecifierEClass, MAPPING_SPECIFIER__UID);
    createEAttribute(mappingSpecifierEClass, MAPPING_SPECIFIER__NAME);
    createEAttribute(mappingSpecifierEClass, MAPPING_SPECIFIER__VALUE);

    mappingVariableEClass = createEClass(MAPPING_VARIABLE);
    createEAttribute(mappingVariableEClass, MAPPING_VARIABLE__UID);
    createEAttribute(mappingVariableEClass, MAPPING_VARIABLE__NAME);
    createEAttribute(mappingVariableEClass, MAPPING_VARIABLE__VALUE);

    artifactRefEClass = createEClass(ARTIFACT_REF);
    createEAttribute(artifactRefEClass, ARTIFACT_REF__UID);
    createEAttribute(artifactRefEClass, ARTIFACT_REF__DOMAIN_ARTIFACT);
    createEAttribute(artifactRefEClass, ARTIFACT_REF__ARTIFACT_NAME);

    typeDefinitionEClass = createEClass(TYPE_DEFINITION);
    createEAttribute(typeDefinitionEClass, TYPE_DEFINITION__UID);
    createEReference(typeDefinitionEClass, TYPE_DEFINITION__TYPES);
    createEReference(typeDefinitionEClass, TYPE_DEFINITION__ENUMS);
    createEReference(typeDefinitionEClass, TYPE_DEFINITION__PARENT);

    typeElementEClass = createEClass(TYPE_ELEMENT);
    createEReference(typeElementEClass, TYPE_ELEMENT__PARENT);

    typeEClass = createEClass(TYPE);
    createEAttribute(typeEClass, TYPE__UID);
    createEAttribute(typeEClass, TYPE__NAME);
    createEReference(typeEClass, TYPE__ATTRIBUTES);
    createEReference(typeEClass, TYPE__OPERATIONS);
    createEReference(typeEClass, TYPE__EXTENSION);

    typeReferenceEClass = createEClass(TYPE_REFERENCE);
    createEAttribute(typeReferenceEClass, TYPE_REFERENCE__UID);

    typeExtensionEClass = createEClass(TYPE_EXTENSION);
    createEAttribute(typeExtensionEClass, TYPE_EXTENSION__UID);
    createEReference(typeExtensionEClass, TYPE_EXTENSION__SOURCE);
    createEReference(typeExtensionEClass, TYPE_EXTENSION__TARGET);

    attributeEClass = createEClass(ATTRIBUTE);
    createEAttribute(attributeEClass, ATTRIBUTE__UID);
    createEAttribute(attributeEClass, ATTRIBUTE__NAME);
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
    createEReference(parameterEClass, PARAMETER__PARENT);

    returnValueEClass = createEClass(RETURN_VALUE);
    createEAttribute(returnValueEClass, RETURN_VALUE__UID);

    enumaratorEClass = createEClass(ENUMARATOR);
    createEAttribute(enumaratorEClass, ENUMARATOR__UID);
    createEAttribute(enumaratorEClass, ENUMARATOR__NAME);
    createEReference(enumaratorEClass, ENUMARATOR__PARENT);
    createEReference(enumaratorEClass, ENUMARATOR__VALUES);

    enumAttributeEClass = createEClass(ENUM_ATTRIBUTE);
    createEAttribute(enumAttributeEClass, ENUM_ATTRIBUTE__UID);
    createEReference(enumAttributeEClass, ENUM_ATTRIBUTE__PARENT);
    createEAttribute(enumAttributeEClass, ENUM_ATTRIBUTE__NAME);
    createEAttribute(enumAttributeEClass, ENUM_ATTRIBUTE__VALUE);

    typePointerEClass = createEClass(TYPE_POINTER);
    createEAttribute(typePointerEClass, TYPE_POINTER__PACKAGE_NAME);
    createEAttribute(typePointerEClass, TYPE_POINTER__TYPE_NAME);

    typesRepositoryEClass = createEClass(TYPES_REPOSITORY);
    createEAttribute(typesRepositoryEClass, TYPES_REPOSITORY__UID);
    createEReference(typesRepositoryEClass, TYPES_REPOSITORY__TYPE_DEFINITION);
    createEReference(typesRepositoryEClass, TYPES_REPOSITORY__PARENT);

    typesEClass = createEClass(TYPES);
    createEAttribute(typesEClass, TYPES__UID);
    createEReference(typesEClass, TYPES__PARENT);
    createEAttribute(typesEClass, TYPES__NAME);
    createEReference(typesEClass, TYPES__PRIMITIVES);
    createEReference(typesEClass, TYPES__PACKAGES);
    createEReference(typesEClass, TYPES__BUSINESS_PACKAGES);

    primitiveEClass = createEClass(PRIMITIVE);
    createEAttribute(primitiveEClass, PRIMITIVE__UID);
    createEAttribute(primitiveEClass, PRIMITIVE__NAME);
    createEReference(primitiveEClass, PRIMITIVE__PARENT);

    packageEClass = createEClass(PACKAGE);
    createEAttribute(packageEClass, PACKAGE__UID);
    createEAttribute(packageEClass, PACKAGE__NAME);
    createEReference(packageEClass, PACKAGE__TYPEDEFINITION);
    createEReference(packageEClass, PACKAGE__PARENT);

    businessPackageEClass = createEClass(BUSINESS_PACKAGE);
    createEAttribute(businessPackageEClass, BUSINESS_PACKAGE__UID);
    createEAttribute(businessPackageEClass, BUSINESS_PACKAGE__NAME);
    createEReference(businessPackageEClass, BUSINESS_PACKAGE__BUSINESSOBJECTS);
    createEReference(businessPackageEClass, BUSINESS_PACKAGE__PARENT);
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
    ormEntityEClass.getESuperTypes().add(this.getDomainArtifact());
    jpaServiceEClass.getESuperTypes().add(this.getDomainArtifact());
    ejbServiceEClass.getESuperTypes().add(this.getDomainArtifact());
    businessMethodEClass.getESuperTypes().add(this.getTypePointer());
    createMethodEClass.getESuperTypes().add(this.getBusinessMethod());
    insertMethodEClass.getESuperTypes().add(this.getBusinessMethod());
    updateMethodEClass.getESuperTypes().add(this.getBusinessMethod());
    removeMethodEClass.getESuperTypes().add(this.getBusinessMethod());
    searchMethodEClass.getESuperTypes().add(this.getBusinessMethod());
    otherMethodEClass.getESuperTypes().add(this.getBusinessMethod());
    mapperEClass.getESuperTypes().add(this.getTypePointer());
    javaMapperEClass.getESuperTypes().add(this.getMapper());
    modelMapperEClass.getESuperTypes().add(this.getArtifactRef());
    typeEClass.getESuperTypes().add(this.getTypeElement());
    typeReferenceEClass.getESuperTypes().add(this.getTypeElement());
    typeReferenceEClass.getESuperTypes().add(this.getTypePointer());
    attributeEClass.getESuperTypes().add(this.getTypePointer());
    parameterEClass.getESuperTypes().add(this.getTypePointer());
    returnValueEClass.getESuperTypes().add(this.getTypePointer());

    // Initialize classes and features; add operations and parameters
    initEClass(domainEClass, Domain.class, "Domain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDomain_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDomain_DomainArtifacts(), this.getDomainArtifacts(), this.getDomainArtifacts_Parent(), "domainArtifacts", null, 1, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDomain_DomainTypes(), this.getDomainTypes(), this.getDomainTypes_Parent(), "domainTypes", null, 1, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDomain_DomainApplications(), this.getDomainApplications(), this.getDomainApplications_Parent(), "domainApplications", null, 1, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
    initEReference(getArtifact_ModelQuery(), this.getVariable(), this.getVariable_Parent(), "modelQuery", null, 0, -1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getArtifact_Specifiers(), this.getSpecifier(), this.getSpecifier_Parent(), "specifiers", null, 0, -1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getArtifact_Template(), ecorePackage.getEString(), "template", null, 0, 1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(configVariableEClass, ConfigVariable.class, "ConfigVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getConfigVariable_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, ConfigVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConfigVariable_Name(), ecorePackage.getEString(), "name", null, 0, 1, ConfigVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConfigVariable_Parent(), this.getArtifact(), this.getArtifact_ConfigVariables(), "parent", null, 0, 1, ConfigVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVariable_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVariable_Name(), ecorePackage.getEString(), "name", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVariable_Parent(), this.getArtifact(), this.getArtifact_ModelQuery(), "parent", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
    initEReference(getApplication_Parent(), this.getDomainApplication(), this.getDomainApplication_Application(), "parent", null, 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

    initEClass(businessObjectsEClass, BusinessObjects.class, "BusinessObjects", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBusinessObjects_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, BusinessObjects.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBusinessObjects_BusinessObject(), this.getBusinessObject(), this.getBusinessObject_Parent(), "businessObject", null, 0, -1, BusinessObjects.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBusinessObjects_Parent(), this.getBusinessPackage(), this.getBusinessPackage_Businessobjects(), "parent", null, 0, 1, BusinessObjects.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(businessObjectEClass, BusinessObject.class, "BusinessObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBusinessObject_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, BusinessObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBusinessObject_Name(), ecorePackage.getEString(), "name", null, 0, 1, BusinessObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBusinessObject_Parent(), this.getBusinessObjects(), this.getBusinessObjects_BusinessObject(), "parent", null, 0, 1, BusinessObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBusinessObject_CreateMethods(), this.getCreateMethod(), this.getCreateMethod_Parent(), "createMethods", null, 0, -1, BusinessObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBusinessObject_InsertMethods(), this.getInsertMethod(), this.getInsertMethod_Parent(), "insertMethods", null, 0, -1, BusinessObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBusinessObject_UpdateMethods(), this.getUpdateMethod(), this.getUpdateMethod_Parent(), "updateMethods", null, 0, -1, BusinessObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBusinessObject_RemoveMethods(), this.getRemoveMethod(), this.getRemoveMethod_Parent(), "removeMethods", null, 0, -1, BusinessObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBusinessObject_SearchMethods(), this.getSearchMethod(), this.getSearchMethod_Parent(), "searchMethods", null, 0, -1, BusinessObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBusinessObject_OthersMethods(), this.getOtherMethod(), this.getOtherMethod_Parent(), "othersMethods", null, 0, -1, BusinessObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(businessMethodEClass, BusinessMethod.class, "BusinessMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBusinessMethod_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, BusinessMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBusinessMethod_Method(), ecorePackage.getEString(), "method", null, 0, 1, BusinessMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(createMethodEClass, CreateMethod.class, "CreateMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCreateMethod_Parent(), this.getBusinessObject(), this.getBusinessObject_CreateMethods(), "parent", null, 0, 1, CreateMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(insertMethodEClass, InsertMethod.class, "InsertMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInsertMethod_Parent(), this.getBusinessObject(), this.getBusinessObject_InsertMethods(), "parent", null, 0, 1, InsertMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(updateMethodEClass, UpdateMethod.class, "UpdateMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUpdateMethod_Parent(), this.getBusinessObject(), this.getBusinessObject_UpdateMethods(), "parent", null, 0, 1, UpdateMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(removeMethodEClass, RemoveMethod.class, "RemoveMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRemoveMethod_Parent(), this.getBusinessObject(), this.getBusinessObject_RemoveMethods(), "parent", null, 0, 1, RemoveMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(searchMethodEClass, SearchMethod.class, "SearchMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSearchMethod_Parent(), this.getBusinessObject(), this.getBusinessObject_SearchMethods(), "parent", null, 0, 1, SearchMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(otherMethodEClass, OtherMethod.class, "OtherMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOtherMethod_Parent(), this.getBusinessObject(), this.getBusinessObject_OthersMethods(), "parent", null, 0, 1, OtherMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mappersEClass, Mappers.class, "Mappers", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMappers_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Mappers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMappers_Mappers(), this.getMapper(), this.getMapper_Parent(), "mappers", null, 0, -1, Mappers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMappers_Parent(), this.getApplicationMapper(), this.getApplicationMapper_Mapper(), "parent", null, 0, 1, Mappers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mapperEClass, Mapper.class, "Mapper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMapper_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Mapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMapper_Parent(), this.getMappers(), this.getMappers_Mappers(), "parent", null, 0, 1, Mapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
    initEReference(getRecipes_Parent(), this.getApplicationRecipe(), this.getApplicationRecipe_Recipes(), "parent", null, 0, 1, Recipes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(recipeEClass, Recipe.class, "Recipe", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRecipe_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Recipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRecipe_Parent(), this.getRecipes(), this.getRecipes_Recipe(), "parent", null, 0, 1, Recipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRecipe_Name(), ecorePackage.getEString(), "name", null, 0, 1, Recipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRecipe_Components(), this.getComponent(), null, "components", null, 0, -1, Recipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRecipe_RecipeConfig(), this.getConfiguration(), this.getConfiguration_Recipe(), "recipeConfig", null, 0, 1, Recipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(componentEClass, Component.class, "Component", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getComponent_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getComponent_Name(), ecorePackage.getEString(), "name", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComponent_Components(), this.getComponent(), null, "components", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComponent_Mappers(), this.getModelMapper(), this.getModelMapper_Parent(), "mappers", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(modelMapperEClass, ModelMapper.class, "ModelMapper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getModelMapper_Name(), ecorePackage.getEString(), "name", null, 0, 1, ModelMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelMapper_Parent(), this.getComponent(), this.getComponent_Mappers(), "parent", null, 0, 1, ModelMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelMapper_Specifiers(), this.getMappingSpecifier(), null, "specifiers", null, 0, -1, ModelMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelMapper_Variables(), this.getMappingVariable(), null, "variables", null, 0, -1, ModelMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(configurationEClass, Configuration.class, "Configuration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getConfiguration_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConfiguration_Name(), ecorePackage.getEString(), "name", null, 0, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConfiguration_Recipe(), this.getRecipe(), this.getRecipe_RecipeConfig(), "recipe", null, 0, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConfiguration_Properties(), this.getProperty(), null, "properties", null, 0, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConfiguration_ConfigExtension(), this.getConfiguration(), this.getConfiguration_Parent(), "configExtension", null, 0, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConfiguration_Parent(), this.getConfiguration(), this.getConfiguration_ConfigExtension(), "parent", null, 0, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProperty_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProperty_Name(), ecorePackage.getEString(), "name", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProperty_Value(), ecorePackage.getEString(), "value", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mappingSpecifierEClass, MappingSpecifier.class, "MappingSpecifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMappingSpecifier_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, MappingSpecifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMappingSpecifier_Name(), ecorePackage.getEString(), "name", null, 0, 1, MappingSpecifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMappingSpecifier_Value(), ecorePackage.getEString(), "value", null, 0, 1, MappingSpecifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mappingVariableEClass, MappingVariable.class, "MappingVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMappingVariable_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, MappingVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMappingVariable_Name(), ecorePackage.getEString(), "name", null, 0, 1, MappingVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMappingVariable_Value(), ecorePackage.getEString(), "value", null, 0, 1, MappingVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(artifactRefEClass, ArtifactRef.class, "ArtifactRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getArtifactRef_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, ArtifactRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getArtifactRef_DomainArtifact(), ecorePackage.getEString(), "domainArtifact", null, 0, 1, ArtifactRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getArtifactRef_ArtifactName(), ecorePackage.getEString(), "artifactName", null, 0, 1, ArtifactRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeDefinitionEClass, TypeDefinition.class, "TypeDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTypeDefinition_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, TypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypeDefinition_Types(), this.getTypeElement(), this.getTypeElement_Parent(), "types", null, 0, -1, TypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypeDefinition_Enums(), this.getEnumarator(), this.getEnumarator_Parent(), "enums", null, 0, -1, TypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypeDefinition_Parent(), this.getPackage(), this.getPackage_Typedefinition(), "parent", null, 0, 1, TypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeElementEClass, TypeElement.class, "TypeElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTypeElement_Parent(), this.getTypeDefinition(), this.getTypeDefinition_Types(), "parent", null, 0, 1, TypeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeEClass, Type.class, "Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getType_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getType_Name(), ecorePackage.getEString(), "name", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getType_Attributes(), this.getAttribute(), this.getAttribute_Parent(), "attributes", null, 0, -1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getType_Operations(), this.getOperation(), this.getOperation_Parent(), "operations", null, 0, -1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getType_Extension(), this.getTypeExtension(), null, "extension", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeReferenceEClass, TypeReference.class, "TypeReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTypeReference_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, TypeReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeExtensionEClass, TypeExtension.class, "TypeExtension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTypeExtension_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, TypeExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypeExtension_Source(), this.getTypeElement(), null, "source", null, 0, 1, TypeExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypeExtension_Target(), this.getTypeElement(), null, "target", null, 0, 1, TypeExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAttribute_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttribute_Name(), ecorePackage.getEString(), "name", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
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
    initEReference(getParameter_Parent(), this.getOperation(), this.getOperation_Parameters(), "parent", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(returnValueEClass, ReturnValue.class, "ReturnValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getReturnValue_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, ReturnValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enumaratorEClass, Enumarator.class, "Enumarator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEnumarator_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Enumarator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEnumarator_Name(), ecorePackage.getEString(), "name", null, 0, 1, Enumarator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEnumarator_Parent(), this.getTypeDefinition(), this.getTypeDefinition_Enums(), "parent", null, 0, 1, Enumarator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEnumarator_Values(), this.getEnumAttribute(), this.getEnumAttribute_Parent(), "values", null, 0, -1, Enumarator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enumAttributeEClass, EnumAttribute.class, "EnumAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEnumAttribute_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, EnumAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEnumAttribute_Parent(), this.getEnumarator(), this.getEnumarator_Values(), "parent", null, 0, 1, EnumAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEnumAttribute_Name(), ecorePackage.getEString(), "name", null, 0, 1, EnumAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEnumAttribute_Value(), ecorePackage.getEString(), "value", null, 0, 1, EnumAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typePointerEClass, TypePointer.class, "TypePointer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTypePointer_PackageName(), ecorePackage.getEString(), "packageName", null, 0, 1, TypePointer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTypePointer_TypeName(), ecorePackage.getEString(), "typeName", null, 0, 1, TypePointer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typesRepositoryEClass, TypesRepository.class, "TypesRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTypesRepository_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, TypesRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypesRepository_TypeDefinition(), this.getTypes(), this.getTypes_Parent(), "typeDefinition", null, 1, 1, TypesRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypesRepository_Parent(), this.getDomainTypes(), this.getDomainTypes_Typesrepository(), "parent", null, 0, 1, TypesRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typesEClass, Types.class, "Types", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTypes_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Types.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypes_Parent(), this.getTypesRepository(), this.getTypesRepository_TypeDefinition(), "parent", null, 0, 1, Types.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTypes_Name(), ecorePackage.getEString(), "name", null, 0, 1, Types.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypes_Primitives(), this.getPrimitive(), this.getPrimitive_Parent(), "primitives", null, 0, -1, Types.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypes_Packages(), this.getPackage(), this.getPackage_Parent(), "packages", null, 0, -1, Types.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypes_BusinessPackages(), this.getBusinessPackage(), this.getBusinessPackage_Parent(), "businessPackages", null, 0, -1, Types.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(primitiveEClass, Primitive.class, "Primitive", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPrimitive_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Primitive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPrimitive_Name(), ecorePackage.getEString(), "name", null, 0, 1, Primitive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPrimitive_Parent(), this.getTypes(), this.getTypes_Primitives(), "parent", null, 0, 1, Primitive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(packageEClass, domain.Package.class, "Package", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPackage_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, domain.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPackage_Name(), ecorePackage.getEString(), "name", null, 0, 1, domain.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPackage_Typedefinition(), this.getTypeDefinition(), this.getTypeDefinition_Parent(), "typedefinition", null, 0, 1, domain.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPackage_Parent(), this.getTypes(), this.getTypes_Packages(), "parent", null, 0, 1, domain.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(businessPackageEClass, BusinessPackage.class, "BusinessPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBusinessPackage_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, BusinessPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBusinessPackage_Name(), ecorePackage.getEString(), "name", null, 0, 1, BusinessPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBusinessPackage_Businessobjects(), this.getBusinessObjects(), this.getBusinessObjects_Parent(), "businessobjects", null, 0, 1, BusinessPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBusinessPackage_Parent(), this.getTypes(), this.getTypes_BusinessPackages(), "parent", null, 0, 1, BusinessPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
    // gmf.diagram.businessObjects
    createGmf_6Annotations();
    // gmf.diagram.mapper
    createGmf_7Annotations();
    // gmf.diagram.recipe
    createGmf_8Annotations();
    // gmf.link
    createGmf_9Annotations();
    // gmf.diagram.typedefinition
    createGmf_10Annotations();
    // gmf.diagram.typesrepository
    createGmf_11Annotations();
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
       "label", "name"
       });			
    addAnnotation
      (domainTypesEClass, 
       source, 
       new String[] 
       {
       "label", "name"
       });		
    addAnnotation
      (domainApplicationsEClass, 
       source, 
       new String[] 
       {
       "label", "name"
       });			
    addAnnotation
      (domainApplicationEClass, 
       source, 
       new String[] 
       {
       "label", "name"
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
       "label", "name"
       });		
    addAnnotation
      (jpaServiceEClass, 
       source, 
       new String[] 
       {
       "label", "name"
       });		
    addAnnotation
      (ejbServiceEClass, 
       source, 
       new String[] 
       {
       "label", "name"
       });			
    addAnnotation
      (artifactEClass, 
       source, 
       new String[] 
       {
       "label", "name"
       });					
    addAnnotation
      (configVariableEClass, 
       source, 
       new String[] 
       {
       "label", "name"
       });		
    addAnnotation
      (variableEClass, 
       source, 
       new String[] 
       {
       "label", "name"
       });		
    addAnnotation
      (specifierEClass, 
       source, 
       new String[] 
       {
       "label", "name"
       });		
    addAnnotation
      (optionEClass, 
       source, 
       new String[] 
       {
       "label", "name"
       });			
    addAnnotation
      (applicationRecipesEClass, 
       source, 
       new String[] 
       {
       "label", "name"
       });			
    addAnnotation
      (applicationRecipeEClass, 
       source, 
       new String[] 
       {
       "label", "name"
       });		
    addAnnotation
      (applicationMappersEClass, 
       source, 
       new String[] 
       {
       "label", "name"
       });			
    addAnnotation
      (applicationMapperEClass, 
       source, 
       new String[] 
       {
       "label", "name"
       });			
    addAnnotation
      (businessObjectEClass, 
       source, 
       new String[] 
       {
       "label", "name"
       });								
    addAnnotation
      (createMethodEClass, 
       source, 
       new String[] 
       {
       "label", "method"
       });		
    addAnnotation
      (insertMethodEClass, 
       source, 
       new String[] 
       {
       "label", "method"
       });		
    addAnnotation
      (updateMethodEClass, 
       source, 
       new String[] 
       {
       "label", "method"
       });		
    addAnnotation
      (removeMethodEClass, 
       source, 
       new String[] 
       {
       "label", "method"
       });		
    addAnnotation
      (searchMethodEClass, 
       source, 
       new String[] 
       {
       "label", "method"
       });		
    addAnnotation
      (otherMethodEClass, 
       source, 
       new String[] 
       {
       "label", "method"
       });			
    addAnnotation
      (javaMapperEClass, 
       source, 
       new String[] 
       {
       "label", "packageName"
       });			
    addAnnotation
      (recipeEClass, 
       source, 
       new String[] 
       {
       "label", "name"
       });				
    addAnnotation
      (componentEClass, 
       source, 
       new String[] 
       {
       "label", "name"
       });				
    addAnnotation
      (modelMapperEClass, 
       source, 
       new String[] 
       {
       "label", "name"
       });		
    addAnnotation
      (configurationEClass, 
       source, 
       new String[] 
       {
       "label", "name"
       });				
    addAnnotation
      (propertyEClass, 
       source, 
       new String[] 
       {
       "label", "name"
       });			
    addAnnotation
      (typeEClass, 
       source, 
       new String[] 
       {
       "label", "name"
       });				
    addAnnotation
      (typeReferenceEClass, 
       source, 
       new String[] 
       {
       "label", "packageName,typeName"
       });			
    addAnnotation
      (attributeEClass, 
       source, 
       new String[] 
       {
       "label", "name"
       });		
    addAnnotation
      (operationEClass, 
       source, 
       new String[] 
       {
       "label", "name"
       });				
    addAnnotation
      (parameterEClass, 
       source, 
       new String[] 
       {
       "label", "name"
       });		
    addAnnotation
      (returnValueEClass, 
       source, 
       new String[] 
       {
       "label", "packageName,typeName"
       });		
    addAnnotation
      (enumaratorEClass, 
       source, 
       new String[] 
       {
       "label", "name"
       });			
    addAnnotation
      (enumAttributeEClass, 
       source, 
       new String[] 
       {
       "label", "name"
       });			
    addAnnotation
      (typesEClass, 
       source, 
       new String[] 
       {
       "label", "name"
       });					
    addAnnotation
      (primitiveEClass, 
       source, 
       new String[] 
       {
       "label", "name"
       });		
    addAnnotation
      (packageEClass, 
       source, 
       new String[] 
       {
       "label", "name"
       });		
    addAnnotation
      (businessPackageEClass, 
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
       });		
    addAnnotation
      (getArtifact_ModelQuery(), 
       source, 
       new String[] 
       {
       });		
    addAnnotation
      (getArtifact_Specifiers(), 
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
      (getBusinessObject_CreateMethods(), 
       source, 
       new String[] 
       {
       });		
    addAnnotation
      (getBusinessObject_InsertMethods(), 
       source, 
       new String[] 
       {
       });		
    addAnnotation
      (getBusinessObject_UpdateMethods(), 
       source, 
       new String[] 
       {
       });		
    addAnnotation
      (getBusinessObject_RemoveMethods(), 
       source, 
       new String[] 
       {
       });		
    addAnnotation
      (getBusinessObject_SearchMethods(), 
       source, 
       new String[] 
       {
       });		
    addAnnotation
      (getBusinessObject_OthersMethods(), 
       source, 
       new String[] 
       {
       });												
    addAnnotation
      (getRecipe_Components(), 
       source, 
       new String[] 
       {
       });				
    addAnnotation
      (getComponent_Components(), 
       source, 
       new String[] 
       {
       });		
    addAnnotation
      (getComponent_Mappers(), 
       source, 
       new String[] 
       {
       "layout", "list"
       });				
    addAnnotation
      (getConfiguration_Properties(), 
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
       });		
    addAnnotation
      (getType_Operations(), 
       source, 
       new String[] 
       {
       });						
    addAnnotation
      (getOperation_Parameters(), 
       source, 
       new String[] 
       {
       });		
    addAnnotation
      (getOperation_ReturnValue(), 
       source, 
       new String[] 
       {
       });					
    addAnnotation
      (getEnumarator_Values(), 
       source, 
       new String[] 
       {
       });					
    addAnnotation
      (getTypes_Primitives(), 
       source, 
       new String[] 
       {
       });		
    addAnnotation
      (getTypes_Packages(), 
       source, 
       new String[] 
       {
       });		
    addAnnotation
      (getTypes_BusinessPackages(), 
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
   * Initializes the annotations for <b>gmf.diagram.businessObjects</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmf_6Annotations()
  {
    String source = "gmf.diagram.businessObjects";																														
    addAnnotation
      (businessObjectsEClass, 
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
  protected void createGmf_7Annotations()
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
  protected void createGmf_8Annotations()
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
   * Initializes the annotations for <b>gmf.link</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmf_9Annotations()
  {
    String source = "gmf.link";																																																	
    addAnnotation
      (getRecipe_RecipeConfig(), 
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

} //DomainPackageImpl
