/**
 */
package domain;

import businessobjects.BusinessobjectsPackage;
import mapper.MapperPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import recipe.RecipePackage;
import typedefinition.TypedefinitionPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see domain.DomainFactory
 * @model kind="package"
 * @generated
 */
public interface DomainPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "domain";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://tura.org/2013/v1/domain";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "tura.domain";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DomainPackage eINSTANCE = domain.impl.DomainPackageImpl.init();

  /**
   * The meta object id for the '{@link domain.impl.Dammy1Impl <em>Dammy1</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.Dammy1Impl
   * @see domain.impl.DomainPackageImpl#getDammy1()
   * @generated
   */
  int DAMMY1 = 0;

  /**
   * The feature id for the '<em><b>Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DAMMY1__TYPES = TypedefinitionPackage.TYPE_DEFINITION__TYPES;

  /**
   * The feature id for the '<em><b>Enums</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DAMMY1__ENUMS = TypedefinitionPackage.TYPE_DEFINITION__ENUMS;

  /**
   * The number of structural features of the '<em>Dammy1</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DAMMY1_FEATURE_COUNT = TypedefinitionPackage.TYPE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link domain.impl.Dammy2Impl <em>Dammy2</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.Dammy2Impl
   * @see domain.impl.DomainPackageImpl#getDammy2()
   * @generated
   */
  int DAMMY2 = 1;

  /**
   * The feature id for the '<em><b>Business Object</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DAMMY2__BUSINESS_OBJECT = BusinessobjectsPackage.BUSINESS_OBJECTS__BUSINESS_OBJECT;

  /**
   * The number of structural features of the '<em>Dammy2</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DAMMY2_FEATURE_COUNT = BusinessobjectsPackage.BUSINESS_OBJECTS_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link domain.impl.Dammy3Impl <em>Dammy3</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.Dammy3Impl
   * @see domain.impl.DomainPackageImpl#getDammy3()
   * @generated
   */
  int DAMMY3 = 2;

  /**
   * The feature id for the '<em><b>Recipe</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DAMMY3__RECIPE = RecipePackage.RECIPES__RECIPE;

  /**
   * The number of structural features of the '<em>Dammy3</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DAMMY3_FEATURE_COUNT = RecipePackage.RECIPES_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link domain.impl.Dammy4Impl <em>Dammy4</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.Dammy4Impl
   * @see domain.impl.DomainPackageImpl#getDammy4()
   * @generated
   */
  int DAMMY4 = 3;

  /**
   * The feature id for the '<em><b>Mappers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DAMMY4__MAPPERS = MapperPackage.MAPPERS__MAPPERS;

  /**
   * The number of structural features of the '<em>Dammy4</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DAMMY4_FEATURE_COUNT = MapperPackage.MAPPERS_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link domain.impl.DomainImpl <em>Domain</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.DomainImpl
   * @see domain.impl.DomainPackageImpl#getDomain()
   * @generated
   */
  int DOMAIN = 4;

  /**
   * The feature id for the '<em><b>Domain Artifacts</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN__DOMAIN_ARTIFACTS = 0;

  /**
   * The feature id for the '<em><b>Domain Types</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN__DOMAIN_TYPES = 1;

  /**
   * The feature id for the '<em><b>Domain Applications</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN__DOMAIN_APPLICATIONS = 2;

  /**
   * The number of structural features of the '<em>Domain</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_FEATURE_COUNT = 3;


  /**
   * The meta object id for the '{@link domain.impl.DomainArtifactsImpl <em>Artifacts</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.DomainArtifactsImpl
   * @see domain.impl.DomainPackageImpl#getDomainArtifacts()
   * @generated
   */
  int DOMAIN_ARTIFACTS = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_ARTIFACTS__NAME = 0;

  /**
   * The feature id for the '<em><b>Artifacrs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_ARTIFACTS__ARTIFACRS = 1;

  /**
   * The number of structural features of the '<em>Artifacts</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_ARTIFACTS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link domain.impl.DomainArtifactImpl <em>Artifact</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.DomainArtifactImpl
   * @see domain.impl.DomainPackageImpl#getDomainArtifact()
   * @generated
   */
  int DOMAIN_ARTIFACT = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_ARTIFACT__NAME = 0;

  /**
   * The feature id for the '<em><b>Artifact</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_ARTIFACT__ARTIFACT = 1;

  /**
   * The number of structural features of the '<em>Artifact</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_ARTIFACT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link domain.impl.DomainTypesImpl <em>Types</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.DomainTypesImpl
   * @see domain.impl.DomainPackageImpl#getDomainTypes()
   * @generated
   */
  int DOMAIN_TYPES = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_TYPES__NAME = 0;

  /**
   * The feature id for the '<em><b>Typesrepository</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_TYPES__TYPESREPOSITORY = 1;

  /**
   * The number of structural features of the '<em>Types</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_TYPES_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link domain.impl.DomainApplicationsImpl <em>Applications</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.DomainApplicationsImpl
   * @see domain.impl.DomainPackageImpl#getDomainApplications()
   * @generated
   */
  int DOMAIN_APPLICATIONS = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_APPLICATIONS__NAME = 0;

  /**
   * The feature id for the '<em><b>Applications</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_APPLICATIONS__APPLICATIONS = 1;

  /**
   * The number of structural features of the '<em>Applications</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_APPLICATIONS_FEATURE_COUNT = 2;


  /**
   * The meta object id for the '{@link domain.impl.DomainApplicationImpl <em>Application</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see domain.impl.DomainApplicationImpl
   * @see domain.impl.DomainPackageImpl#getDomainApplication()
   * @generated
   */
  int DOMAIN_APPLICATION = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_APPLICATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Application</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_APPLICATION__APPLICATION = 1;

  /**
   * The number of structural features of the '<em>Application</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_APPLICATION_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link domain.Dammy1 <em>Dammy1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dammy1</em>'.
   * @see domain.Dammy1
   * @generated
   */
  EClass getDammy1();

  /**
   * Returns the meta object for class '{@link domain.Dammy2 <em>Dammy2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dammy2</em>'.
   * @see domain.Dammy2
   * @generated
   */
  EClass getDammy2();

  /**
   * Returns the meta object for class '{@link domain.Dammy3 <em>Dammy3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dammy3</em>'.
   * @see domain.Dammy3
   * @generated
   */
  EClass getDammy3();

  /**
   * Returns the meta object for class '{@link domain.Dammy4 <em>Dammy4</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dammy4</em>'.
   * @see domain.Dammy4
   * @generated
   */
  EClass getDammy4();

  /**
   * Returns the meta object for class '{@link domain.Domain <em>Domain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Domain</em>'.
   * @see domain.Domain
   * @generated
   */
  EClass getDomain();

  /**
   * Returns the meta object for the containment reference '{@link domain.Domain#getDomainArtifacts <em>Domain Artifacts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Domain Artifacts</em>'.
   * @see domain.Domain#getDomainArtifacts()
   * @see #getDomain()
   * @generated
   */
  EReference getDomain_DomainArtifacts();

  /**
   * Returns the meta object for the containment reference '{@link domain.Domain#getDomainTypes <em>Domain Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Domain Types</em>'.
   * @see domain.Domain#getDomainTypes()
   * @see #getDomain()
   * @generated
   */
  EReference getDomain_DomainTypes();

  /**
   * Returns the meta object for the containment reference '{@link domain.Domain#getDomainApplications <em>Domain Applications</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Domain Applications</em>'.
   * @see domain.Domain#getDomainApplications()
   * @see #getDomain()
   * @generated
   */
  EReference getDomain_DomainApplications();

  /**
   * Returns the meta object for class '{@link domain.DomainArtifacts <em>Artifacts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Artifacts</em>'.
   * @see domain.DomainArtifacts
   * @generated
   */
  EClass getDomainArtifacts();

  /**
   * Returns the meta object for the attribute '{@link domain.DomainArtifacts#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see domain.DomainArtifacts#getName()
   * @see #getDomainArtifacts()
   * @generated
   */
  EAttribute getDomainArtifacts_Name();

  /**
   * Returns the meta object for the containment reference '{@link domain.DomainArtifacts#getArtifacrs <em>Artifacrs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Artifacrs</em>'.
   * @see domain.DomainArtifacts#getArtifacrs()
   * @see #getDomainArtifacts()
   * @generated
   */
  EReference getDomainArtifacts_Artifacrs();

  /**
   * Returns the meta object for class '{@link domain.DomainArtifact <em>Artifact</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Artifact</em>'.
   * @see domain.DomainArtifact
   * @generated
   */
  EClass getDomainArtifact();

  /**
   * Returns the meta object for the attribute '{@link domain.DomainArtifact#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see domain.DomainArtifact#getName()
   * @see #getDomainArtifact()
   * @generated
   */
  EAttribute getDomainArtifact_Name();

  /**
   * Returns the meta object for the reference '{@link domain.DomainArtifact#getArtifact <em>Artifact</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Artifact</em>'.
   * @see domain.DomainArtifact#getArtifact()
   * @see #getDomainArtifact()
   * @generated
   */
  EReference getDomainArtifact_Artifact();

  /**
   * Returns the meta object for class '{@link domain.DomainTypes <em>Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Types</em>'.
   * @see domain.DomainTypes
   * @generated
   */
  EClass getDomainTypes();

  /**
   * Returns the meta object for the attribute '{@link domain.DomainTypes#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see domain.DomainTypes#getName()
   * @see #getDomainTypes()
   * @generated
   */
  EAttribute getDomainTypes_Name();

  /**
   * Returns the meta object for the reference '{@link domain.DomainTypes#getTypesrepository <em>Typesrepository</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Typesrepository</em>'.
   * @see domain.DomainTypes#getTypesrepository()
   * @see #getDomainTypes()
   * @generated
   */
  EReference getDomainTypes_Typesrepository();

  /**
   * Returns the meta object for class '{@link domain.DomainApplications <em>Applications</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Applications</em>'.
   * @see domain.DomainApplications
   * @generated
   */
  EClass getDomainApplications();

  /**
   * Returns the meta object for the attribute '{@link domain.DomainApplications#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see domain.DomainApplications#getName()
   * @see #getDomainApplications()
   * @generated
   */
  EAttribute getDomainApplications_Name();

  /**
   * Returns the meta object for the containment reference list '{@link domain.DomainApplications#getApplications <em>Applications</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Applications</em>'.
   * @see domain.DomainApplications#getApplications()
   * @see #getDomainApplications()
   * @generated
   */
  EReference getDomainApplications_Applications();

  /**
   * Returns the meta object for class '{@link domain.DomainApplication <em>Application</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Application</em>'.
   * @see domain.DomainApplication
   * @generated
   */
  EClass getDomainApplication();

  /**
   * Returns the meta object for the attribute '{@link domain.DomainApplication#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see domain.DomainApplication#getName()
   * @see #getDomainApplication()
   * @generated
   */
  EAttribute getDomainApplication_Name();

  /**
   * Returns the meta object for the reference '{@link domain.DomainApplication#getApplication <em>Application</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Application</em>'.
   * @see domain.DomainApplication#getApplication()
   * @see #getDomainApplication()
   * @generated
   */
  EReference getDomainApplication_Application();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  DomainFactory getDomainFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link domain.impl.Dammy1Impl <em>Dammy1</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.Dammy1Impl
     * @see domain.impl.DomainPackageImpl#getDammy1()
     * @generated
     */
    EClass DAMMY1 = eINSTANCE.getDammy1();
    /**
     * The meta object literal for the '{@link domain.impl.Dammy2Impl <em>Dammy2</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.Dammy2Impl
     * @see domain.impl.DomainPackageImpl#getDammy2()
     * @generated
     */
    EClass DAMMY2 = eINSTANCE.getDammy2();
    /**
     * The meta object literal for the '{@link domain.impl.Dammy3Impl <em>Dammy3</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.Dammy3Impl
     * @see domain.impl.DomainPackageImpl#getDammy3()
     * @generated
     */
    EClass DAMMY3 = eINSTANCE.getDammy3();
    /**
     * The meta object literal for the '{@link domain.impl.Dammy4Impl <em>Dammy4</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.Dammy4Impl
     * @see domain.impl.DomainPackageImpl#getDammy4()
     * @generated
     */
    EClass DAMMY4 = eINSTANCE.getDammy4();
    /**
     * The meta object literal for the '{@link domain.impl.DomainImpl <em>Domain</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.DomainImpl
     * @see domain.impl.DomainPackageImpl#getDomain()
     * @generated
     */
    EClass DOMAIN = eINSTANCE.getDomain();
    /**
     * The meta object literal for the '<em><b>Domain Artifacts</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAIN__DOMAIN_ARTIFACTS = eINSTANCE.getDomain_DomainArtifacts();
    /**
     * The meta object literal for the '<em><b>Domain Types</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAIN__DOMAIN_TYPES = eINSTANCE.getDomain_DomainTypes();
    /**
     * The meta object literal for the '<em><b>Domain Applications</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAIN__DOMAIN_APPLICATIONS = eINSTANCE.getDomain_DomainApplications();
    /**
     * The meta object literal for the '{@link domain.impl.DomainArtifactsImpl <em>Artifacts</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.DomainArtifactsImpl
     * @see domain.impl.DomainPackageImpl#getDomainArtifacts()
     * @generated
     */
    EClass DOMAIN_ARTIFACTS = eINSTANCE.getDomainArtifacts();
    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOMAIN_ARTIFACTS__NAME = eINSTANCE.getDomainArtifacts_Name();
    /**
     * The meta object literal for the '<em><b>Artifacrs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAIN_ARTIFACTS__ARTIFACRS = eINSTANCE.getDomainArtifacts_Artifacrs();
    /**
     * The meta object literal for the '{@link domain.impl.DomainArtifactImpl <em>Artifact</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.DomainArtifactImpl
     * @see domain.impl.DomainPackageImpl#getDomainArtifact()
     * @generated
     */
    EClass DOMAIN_ARTIFACT = eINSTANCE.getDomainArtifact();
    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOMAIN_ARTIFACT__NAME = eINSTANCE.getDomainArtifact_Name();
    /**
     * The meta object literal for the '<em><b>Artifact</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAIN_ARTIFACT__ARTIFACT = eINSTANCE.getDomainArtifact_Artifact();
    /**
     * The meta object literal for the '{@link domain.impl.DomainTypesImpl <em>Types</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.DomainTypesImpl
     * @see domain.impl.DomainPackageImpl#getDomainTypes()
     * @generated
     */
    EClass DOMAIN_TYPES = eINSTANCE.getDomainTypes();
    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOMAIN_TYPES__NAME = eINSTANCE.getDomainTypes_Name();
    /**
     * The meta object literal for the '<em><b>Typesrepository</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAIN_TYPES__TYPESREPOSITORY = eINSTANCE.getDomainTypes_Typesrepository();
    /**
     * The meta object literal for the '{@link domain.impl.DomainApplicationsImpl <em>Applications</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.DomainApplicationsImpl
     * @see domain.impl.DomainPackageImpl#getDomainApplications()
     * @generated
     */
    EClass DOMAIN_APPLICATIONS = eINSTANCE.getDomainApplications();
    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOMAIN_APPLICATIONS__NAME = eINSTANCE.getDomainApplications_Name();
    /**
     * The meta object literal for the '<em><b>Applications</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAIN_APPLICATIONS__APPLICATIONS = eINSTANCE.getDomainApplications_Applications();
    /**
     * The meta object literal for the '{@link domain.impl.DomainApplicationImpl <em>Application</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see domain.impl.DomainApplicationImpl
     * @see domain.impl.DomainPackageImpl#getDomainApplication()
     * @generated
     */
    EClass DOMAIN_APPLICATION = eINSTANCE.getDomainApplication();
    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOMAIN_APPLICATION__NAME = eINSTANCE.getDomainApplication_Name();
    /**
     * The meta object literal for the '<em><b>Application</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAIN_APPLICATION__APPLICATION = eINSTANCE.getDomainApplication_Application();

  }

} //DomainPackage
