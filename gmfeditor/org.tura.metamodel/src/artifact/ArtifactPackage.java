/**
 */
package artifact;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see artifact.ArtifactFactory
 * @model kind="package"
 * @generated
 */
public interface ArtifactPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "artifact";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://tura.org/2013/v1/artifact";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "tura.artifact";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ArtifactPackage eINSTANCE = artifact.impl.ArtifactPackageImpl.init();

  /**
   * The meta object id for the '{@link artifact.impl.ArtifactsImpl <em>Artifacts</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see artifact.impl.ArtifactsImpl
   * @see artifact.impl.ArtifactPackageImpl#getArtifacts()
   * @generated
   */
  int ARTIFACTS = 0;

  /**
   * The feature id for the '<em><b>Artifacts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTIFACTS__ARTIFACTS = 0;

  /**
   * The number of structural features of the '<em>Artifacts</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTIFACTS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link artifact.impl.ArtifactImpl <em>Artifact</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see artifact.impl.ArtifactImpl
   * @see artifact.impl.ArtifactPackageImpl#getArtifact()
   * @generated
   */
  int ARTIFACT = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTIFACT__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTIFACT__DESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>Config Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTIFACT__CONFIG_VARIABLES = 2;

  /**
   * The feature id for the '<em><b>Model Query</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTIFACT__MODEL_QUERY = 3;

  /**
   * The feature id for the '<em><b>Specifiers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTIFACT__SPECIFIERS = 4;

  /**
   * The feature id for the '<em><b>Template</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTIFACT__TEMPLATE = 5;

  /**
   * The number of structural features of the '<em>Artifact</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTIFACT_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link artifact.impl.VariableImpl <em>Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see artifact.impl.VariableImpl
   * @see artifact.impl.ArtifactPackageImpl#getVariable()
   * @generated
   */
  int VARIABLE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__NAME = 0;

  /**
   * The number of structural features of the '<em>Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_FEATURE_COUNT = 1;


  /**
   * The meta object id for the '{@link artifact.impl.SpecifierImpl <em>Specifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see artifact.impl.SpecifierImpl
   * @see artifact.impl.ArtifactPackageImpl#getSpecifier()
   * @generated
   */
  int SPECIFIER = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIFIER__NAME = 0;

  /**
   * The feature id for the '<em><b>Options</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIFIER__OPTIONS = 1;

  /**
   * The number of structural features of the '<em>Specifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIFIER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link artifact.impl.OptionImpl <em>Option</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see artifact.impl.OptionImpl
   * @see artifact.impl.ArtifactPackageImpl#getOption()
   * @generated
   */
  int OPTION = 4;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTION__VALUE = 0;

  /**
   * The number of structural features of the '<em>Option</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTION_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link artifact.Artifacts <em>Artifacts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Artifacts</em>'.
   * @see artifact.Artifacts
   * @generated
   */
  EClass getArtifacts();

  /**
   * Returns the meta object for the containment reference list '{@link artifact.Artifacts#getArtifacts <em>Artifacts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Artifacts</em>'.
   * @see artifact.Artifacts#getArtifacts()
   * @see #getArtifacts()
   * @generated
   */
  EReference getArtifacts_Artifacts();

  /**
   * Returns the meta object for class '{@link artifact.Artifact <em>Artifact</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Artifact</em>'.
   * @see artifact.Artifact
   * @generated
   */
  EClass getArtifact();

  /**
   * Returns the meta object for the attribute '{@link artifact.Artifact#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see artifact.Artifact#getName()
   * @see #getArtifact()
   * @generated
   */
  EAttribute getArtifact_Name();

  /**
   * Returns the meta object for the attribute '{@link artifact.Artifact#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see artifact.Artifact#getDescription()
   * @see #getArtifact()
   * @generated
   */
  EAttribute getArtifact_Description();

  /**
   * Returns the meta object for the containment reference list '{@link artifact.Artifact#getConfigVariables <em>Config Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Config Variables</em>'.
   * @see artifact.Artifact#getConfigVariables()
   * @see #getArtifact()
   * @generated
   */
  EReference getArtifact_ConfigVariables();

  /**
   * Returns the meta object for the containment reference list '{@link artifact.Artifact#getModelQuery <em>Model Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Model Query</em>'.
   * @see artifact.Artifact#getModelQuery()
   * @see #getArtifact()
   * @generated
   */
  EReference getArtifact_ModelQuery();

  /**
   * Returns the meta object for the containment reference list '{@link artifact.Artifact#getSpecifiers <em>Specifiers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Specifiers</em>'.
   * @see artifact.Artifact#getSpecifiers()
   * @see #getArtifact()
   * @generated
   */
  EReference getArtifact_Specifiers();

  /**
   * Returns the meta object for the attribute '{@link artifact.Artifact#getTemplate <em>Template</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Template</em>'.
   * @see artifact.Artifact#getTemplate()
   * @see #getArtifact()
   * @generated
   */
  EAttribute getArtifact_Template();

  /**
   * Returns the meta object for class '{@link artifact.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable</em>'.
   * @see artifact.Variable
   * @generated
   */
  EClass getVariable();

  /**
   * Returns the meta object for the attribute '{@link artifact.Variable#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see artifact.Variable#getName()
   * @see #getVariable()
   * @generated
   */
  EAttribute getVariable_Name();

  /**
   * Returns the meta object for class '{@link artifact.Specifier <em>Specifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Specifier</em>'.
   * @see artifact.Specifier
   * @generated
   */
  EClass getSpecifier();

  /**
   * Returns the meta object for the attribute '{@link artifact.Specifier#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see artifact.Specifier#getName()
   * @see #getSpecifier()
   * @generated
   */
  EAttribute getSpecifier_Name();

  /**
   * Returns the meta object for the containment reference list '{@link artifact.Specifier#getOptions <em>Options</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Options</em>'.
   * @see artifact.Specifier#getOptions()
   * @see #getSpecifier()
   * @generated
   */
  EReference getSpecifier_Options();

  /**
   * Returns the meta object for class '{@link artifact.Option <em>Option</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Option</em>'.
   * @see artifact.Option
   * @generated
   */
  EClass getOption();

  /**
   * Returns the meta object for the attribute '{@link artifact.Option#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see artifact.Option#getValue()
   * @see #getOption()
   * @generated
   */
  EAttribute getOption_Value();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ArtifactFactory getArtifactFactory();

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
     * The meta object literal for the '{@link artifact.impl.ArtifactsImpl <em>Artifacts</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see artifact.impl.ArtifactsImpl
     * @see artifact.impl.ArtifactPackageImpl#getArtifacts()
     * @generated
     */
    EClass ARTIFACTS = eINSTANCE.getArtifacts();

    /**
     * The meta object literal for the '<em><b>Artifacts</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARTIFACTS__ARTIFACTS = eINSTANCE.getArtifacts_Artifacts();

    /**
     * The meta object literal for the '{@link artifact.impl.ArtifactImpl <em>Artifact</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see artifact.impl.ArtifactImpl
     * @see artifact.impl.ArtifactPackageImpl#getArtifact()
     * @generated
     */
    EClass ARTIFACT = eINSTANCE.getArtifact();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARTIFACT__NAME = eINSTANCE.getArtifact_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARTIFACT__DESCRIPTION = eINSTANCE.getArtifact_Description();

    /**
     * The meta object literal for the '<em><b>Config Variables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARTIFACT__CONFIG_VARIABLES = eINSTANCE.getArtifact_ConfigVariables();

    /**
     * The meta object literal for the '<em><b>Model Query</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARTIFACT__MODEL_QUERY = eINSTANCE.getArtifact_ModelQuery();

    /**
     * The meta object literal for the '<em><b>Specifiers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARTIFACT__SPECIFIERS = eINSTANCE.getArtifact_Specifiers();

    /**
     * The meta object literal for the '<em><b>Template</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARTIFACT__TEMPLATE = eINSTANCE.getArtifact_Template();

    /**
     * The meta object literal for the '{@link artifact.impl.VariableImpl <em>Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see artifact.impl.VariableImpl
     * @see artifact.impl.ArtifactPackageImpl#getVariable()
     * @generated
     */
    EClass VARIABLE = eINSTANCE.getVariable();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

    /**
     * The meta object literal for the '{@link artifact.impl.SpecifierImpl <em>Specifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see artifact.impl.SpecifierImpl
     * @see artifact.impl.ArtifactPackageImpl#getSpecifier()
     * @generated
     */
    EClass SPECIFIER = eINSTANCE.getSpecifier();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SPECIFIER__NAME = eINSTANCE.getSpecifier_Name();

    /**
     * The meta object literal for the '<em><b>Options</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SPECIFIER__OPTIONS = eINSTANCE.getSpecifier_Options();

    /**
     * The meta object literal for the '{@link artifact.impl.OptionImpl <em>Option</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see artifact.impl.OptionImpl
     * @see artifact.impl.ArtifactPackageImpl#getOption()
     * @generated
     */
    EClass OPTION = eINSTANCE.getOption();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPTION__VALUE = eINSTANCE.getOption_Value();

  }

} //ArtifactPackage
