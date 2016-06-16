/**
 */
package tura.artifact;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see tura.artifact.ArtifactFactory
 * @model kind="package"
 * @generated
 */
public interface ArtifactPackage extends EPackage {
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
	String eNS_URI = "http://tura.org/2016/v2/artifact";

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
	ArtifactPackage eINSTANCE = tura.artifact.impl.ArtifactPackageImpl.init();

	/**
	 * The meta object id for the '{@link tura.artifact.impl.ArtifactGroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tura.artifact.impl.ArtifactGroupImpl
	 * @see tura.artifact.impl.ArtifactPackageImpl#getArtifactGroup()
	 * @generated
	 */
	int ARTIFACT_GROUP = 0;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_GROUP__UID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_GROUP__NAME = 1;

	/**
	 * The feature id for the '<em><b>Artifacts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_GROUP__ARTIFACTS = 2;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_GROUP_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tura.artifact.impl.ArtifactImpl <em>Artifact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tura.artifact.impl.ArtifactImpl
	 * @see tura.artifact.impl.ArtifactPackageImpl#getArtifact()
	 * @generated
	 */
	int ARTIFACT = 1;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__UID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Config Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__CONFIG_VARIABLES = 3;

	/**
	 * The feature id for the '<em><b>Config Hashes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__CONFIG_HASHES = 4;

	/**
	 * The feature id for the '<em><b>Model Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__MODEL_QUERY = 5;

	/**
	 * The feature id for the '<em><b>Technologies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__TECHNOLOGIES = 6;

	/**
	 * The feature id for the '<em><b>Hints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__HINTS = 7;

	/**
	 * The feature id for the '<em><b>Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__TEMPLATE = 8;

	/**
	 * The number of structural features of the '<em>Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tura.artifact.impl.GenerationHintImpl <em>Generation Hint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tura.artifact.impl.GenerationHintImpl
	 * @see tura.artifact.impl.ArtifactPackageImpl#getGenerationHint()
	 * @generated
	 */
	int GENERATION_HINT = 2;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_HINT__UID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_HINT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Applyed Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_HINT__APPLYED_CLASS = 2;

	/**
	 * The number of structural features of the '<em>Generation Hint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_HINT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Generation Hint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_HINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tura.artifact.impl.ConfigVariableImpl <em>Config Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tura.artifact.impl.ConfigVariableImpl
	 * @see tura.artifact.impl.ArtifactPackageImpl#getConfigVariable()
	 * @generated
	 */
	int CONFIG_VARIABLE = 3;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_VARIABLE__UID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_VARIABLE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Config Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_VARIABLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Config Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_VARIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tura.artifact.impl.ConfigHashImpl <em>Config Hash</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tura.artifact.impl.ConfigHashImpl
	 * @see tura.artifact.impl.ArtifactPackageImpl#getConfigHash()
	 * @generated
	 */
	int CONFIG_HASH = 4;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_HASH__UID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_HASH__NAME = 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_HASH__PARENT = 2;

	/**
	 * The number of structural features of the '<em>Config Hash</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_HASH_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Config Hash</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_HASH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tura.artifact.impl.ModelQueryImpl <em>Model Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tura.artifact.impl.ModelQueryImpl
	 * @see tura.artifact.impl.ArtifactPackageImpl#getModelQuery()
	 * @generated
	 */
	int MODEL_QUERY = 5;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_QUERY__UID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_QUERY__NAME = 1;

	/**
	 * The feature id for the '<em><b>Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_QUERY__QUERY = 2;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_QUERY__PARAMETERS = 3;

	/**
	 * The number of structural features of the '<em>Model Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_QUERY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Model Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_QUERY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tura.artifact.impl.QueryParameterImpl <em>Query Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tura.artifact.impl.QueryParameterImpl
	 * @see tura.artifact.impl.ArtifactPackageImpl#getQueryParameter()
	 * @generated
	 */
	int QUERY_PARAMETER = 6;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER__UID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER__NAME = 1;

	/**
	 * The number of structural features of the '<em>Query Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Query Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tura.artifact.impl.TechnologyImpl <em>Technology</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tura.artifact.impl.TechnologyImpl
	 * @see tura.artifact.impl.ArtifactPackageImpl#getTechnology()
	 * @generated
	 */
	int TECHNOLOGY = 7;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY__UID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY__NAME = 1;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY__OPTIONS = 2;

	/**
	 * The number of structural features of the '<em>Technology</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Technology</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tura.artifact.impl.OptionImpl <em>Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tura.artifact.impl.OptionImpl
	 * @see tura.artifact.impl.ArtifactPackageImpl#getOption()
	 * @generated
	 */
	int OPTION = 8;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__UID = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link tura.artifact.ArtifactGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see tura.artifact.ArtifactGroup
	 * @generated
	 */
	EClass getArtifactGroup();

	/**
	 * Returns the meta object for the attribute '{@link tura.artifact.ArtifactGroup#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see tura.artifact.ArtifactGroup#getUid()
	 * @see #getArtifactGroup()
	 * @generated
	 */
	EAttribute getArtifactGroup_Uid();

	/**
	 * Returns the meta object for the attribute '{@link tura.artifact.ArtifactGroup#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tura.artifact.ArtifactGroup#getName()
	 * @see #getArtifactGroup()
	 * @generated
	 */
	EAttribute getArtifactGroup_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link tura.artifact.ArtifactGroup#getArtifacts <em>Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Artifacts</em>'.
	 * @see tura.artifact.ArtifactGroup#getArtifacts()
	 * @see #getArtifactGroup()
	 * @generated
	 */
	EReference getArtifactGroup_Artifacts();

	/**
	 * Returns the meta object for class '{@link tura.artifact.Artifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artifact</em>'.
	 * @see tura.artifact.Artifact
	 * @generated
	 */
	EClass getArtifact();

	/**
	 * Returns the meta object for the attribute '{@link tura.artifact.Artifact#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see tura.artifact.Artifact#getUid()
	 * @see #getArtifact()
	 * @generated
	 */
	EAttribute getArtifact_Uid();

	/**
	 * Returns the meta object for the attribute '{@link tura.artifact.Artifact#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tura.artifact.Artifact#getName()
	 * @see #getArtifact()
	 * @generated
	 */
	EAttribute getArtifact_Name();

	/**
	 * Returns the meta object for the attribute '{@link tura.artifact.Artifact#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see tura.artifact.Artifact#getDescription()
	 * @see #getArtifact()
	 * @generated
	 */
	EAttribute getArtifact_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link tura.artifact.Artifact#getConfigVariables <em>Config Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Config Variables</em>'.
	 * @see tura.artifact.Artifact#getConfigVariables()
	 * @see #getArtifact()
	 * @generated
	 */
	EReference getArtifact_ConfigVariables();

	/**
	 * Returns the meta object for the containment reference list '{@link tura.artifact.Artifact#getConfigHashes <em>Config Hashes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Config Hashes</em>'.
	 * @see tura.artifact.Artifact#getConfigHashes()
	 * @see #getArtifact()
	 * @generated
	 */
	EReference getArtifact_ConfigHashes();

	/**
	 * Returns the meta object for the containment reference list '{@link tura.artifact.Artifact#getModelQuery <em>Model Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Model Query</em>'.
	 * @see tura.artifact.Artifact#getModelQuery()
	 * @see #getArtifact()
	 * @generated
	 */
	EReference getArtifact_ModelQuery();

	/**
	 * Returns the meta object for the containment reference list '{@link tura.artifact.Artifact#getTechnologies <em>Technologies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Technologies</em>'.
	 * @see tura.artifact.Artifact#getTechnologies()
	 * @see #getArtifact()
	 * @generated
	 */
	EReference getArtifact_Technologies();

	/**
	 * Returns the meta object for the containment reference list '{@link tura.artifact.Artifact#getHints <em>Hints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hints</em>'.
	 * @see tura.artifact.Artifact#getHints()
	 * @see #getArtifact()
	 * @generated
	 */
	EReference getArtifact_Hints();

	/**
	 * Returns the meta object for the attribute '{@link tura.artifact.Artifact#getTemplate <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Template</em>'.
	 * @see tura.artifact.Artifact#getTemplate()
	 * @see #getArtifact()
	 * @generated
	 */
	EAttribute getArtifact_Template();

	/**
	 * Returns the meta object for class '{@link tura.artifact.GenerationHint <em>Generation Hint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generation Hint</em>'.
	 * @see tura.artifact.GenerationHint
	 * @generated
	 */
	EClass getGenerationHint();

	/**
	 * Returns the meta object for the attribute '{@link tura.artifact.GenerationHint#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see tura.artifact.GenerationHint#getUid()
	 * @see #getGenerationHint()
	 * @generated
	 */
	EAttribute getGenerationHint_Uid();

	/**
	 * Returns the meta object for the attribute '{@link tura.artifact.GenerationHint#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tura.artifact.GenerationHint#getName()
	 * @see #getGenerationHint()
	 * @generated
	 */
	EAttribute getGenerationHint_Name();

	/**
	 * Returns the meta object for the attribute '{@link tura.artifact.GenerationHint#getApplyedClass <em>Applyed Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Applyed Class</em>'.
	 * @see tura.artifact.GenerationHint#getApplyedClass()
	 * @see #getGenerationHint()
	 * @generated
	 */
	EAttribute getGenerationHint_ApplyedClass();

	/**
	 * Returns the meta object for class '{@link tura.artifact.ConfigVariable <em>Config Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Config Variable</em>'.
	 * @see tura.artifact.ConfigVariable
	 * @generated
	 */
	EClass getConfigVariable();

	/**
	 * Returns the meta object for the attribute '{@link tura.artifact.ConfigVariable#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see tura.artifact.ConfigVariable#getUid()
	 * @see #getConfigVariable()
	 * @generated
	 */
	EAttribute getConfigVariable_Uid();

	/**
	 * Returns the meta object for the attribute '{@link tura.artifact.ConfigVariable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tura.artifact.ConfigVariable#getName()
	 * @see #getConfigVariable()
	 * @generated
	 */
	EAttribute getConfigVariable_Name();

	/**
	 * Returns the meta object for class '{@link tura.artifact.ConfigHash <em>Config Hash</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Config Hash</em>'.
	 * @see tura.artifact.ConfigHash
	 * @generated
	 */
	EClass getConfigHash();

	/**
	 * Returns the meta object for the attribute '{@link tura.artifact.ConfigHash#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see tura.artifact.ConfigHash#getUid()
	 * @see #getConfigHash()
	 * @generated
	 */
	EAttribute getConfigHash_Uid();

	/**
	 * Returns the meta object for the attribute '{@link tura.artifact.ConfigHash#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tura.artifact.ConfigHash#getName()
	 * @see #getConfigHash()
	 * @generated
	 */
	EAttribute getConfigHash_Name();

	/**
	 * Returns the meta object for the container reference '{@link tura.artifact.ConfigHash#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see tura.artifact.ConfigHash#getParent()
	 * @see #getConfigHash()
	 * @generated
	 */
	EReference getConfigHash_Parent();

	/**
	 * Returns the meta object for class '{@link tura.artifact.ModelQuery <em>Model Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Query</em>'.
	 * @see tura.artifact.ModelQuery
	 * @generated
	 */
	EClass getModelQuery();

	/**
	 * Returns the meta object for the attribute '{@link tura.artifact.ModelQuery#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see tura.artifact.ModelQuery#getUid()
	 * @see #getModelQuery()
	 * @generated
	 */
	EAttribute getModelQuery_Uid();

	/**
	 * Returns the meta object for the attribute '{@link tura.artifact.ModelQuery#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tura.artifact.ModelQuery#getName()
	 * @see #getModelQuery()
	 * @generated
	 */
	EAttribute getModelQuery_Name();

	/**
	 * Returns the meta object for the attribute '{@link tura.artifact.ModelQuery#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Query</em>'.
	 * @see tura.artifact.ModelQuery#getQuery()
	 * @see #getModelQuery()
	 * @generated
	 */
	EAttribute getModelQuery_Query();

	/**
	 * Returns the meta object for the containment reference list '{@link tura.artifact.ModelQuery#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see tura.artifact.ModelQuery#getParameters()
	 * @see #getModelQuery()
	 * @generated
	 */
	EReference getModelQuery_Parameters();

	/**
	 * Returns the meta object for class '{@link tura.artifact.QueryParameter <em>Query Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Parameter</em>'.
	 * @see tura.artifact.QueryParameter
	 * @generated
	 */
	EClass getQueryParameter();

	/**
	 * Returns the meta object for the attribute '{@link tura.artifact.QueryParameter#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see tura.artifact.QueryParameter#getUid()
	 * @see #getQueryParameter()
	 * @generated
	 */
	EAttribute getQueryParameter_Uid();

	/**
	 * Returns the meta object for the attribute '{@link tura.artifact.QueryParameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tura.artifact.QueryParameter#getName()
	 * @see #getQueryParameter()
	 * @generated
	 */
	EAttribute getQueryParameter_Name();

	/**
	 * Returns the meta object for class '{@link tura.artifact.Technology <em>Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Technology</em>'.
	 * @see tura.artifact.Technology
	 * @generated
	 */
	EClass getTechnology();

	/**
	 * Returns the meta object for the attribute '{@link tura.artifact.Technology#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see tura.artifact.Technology#getUid()
	 * @see #getTechnology()
	 * @generated
	 */
	EAttribute getTechnology_Uid();

	/**
	 * Returns the meta object for the attribute '{@link tura.artifact.Technology#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tura.artifact.Technology#getName()
	 * @see #getTechnology()
	 * @generated
	 */
	EAttribute getTechnology_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link tura.artifact.Technology#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Options</em>'.
	 * @see tura.artifact.Technology#getOptions()
	 * @see #getTechnology()
	 * @generated
	 */
	EReference getTechnology_Options();

	/**
	 * Returns the meta object for class '{@link tura.artifact.Option <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Option</em>'.
	 * @see tura.artifact.Option
	 * @generated
	 */
	EClass getOption();

	/**
	 * Returns the meta object for the attribute '{@link tura.artifact.Option#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see tura.artifact.Option#getUid()
	 * @see #getOption()
	 * @generated
	 */
	EAttribute getOption_Uid();

	/**
	 * Returns the meta object for the attribute '{@link tura.artifact.Option#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see tura.artifact.Option#getValue()
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
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link tura.artifact.impl.ArtifactGroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tura.artifact.impl.ArtifactGroupImpl
		 * @see tura.artifact.impl.ArtifactPackageImpl#getArtifactGroup()
		 * @generated
		 */
		EClass ARTIFACT_GROUP = eINSTANCE.getArtifactGroup();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACT_GROUP__UID = eINSTANCE.getArtifactGroup_Uid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACT_GROUP__NAME = eINSTANCE.getArtifactGroup_Name();

		/**
		 * The meta object literal for the '<em><b>Artifacts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIFACT_GROUP__ARTIFACTS = eINSTANCE.getArtifactGroup_Artifacts();

		/**
		 * The meta object literal for the '{@link tura.artifact.impl.ArtifactImpl <em>Artifact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tura.artifact.impl.ArtifactImpl
		 * @see tura.artifact.impl.ArtifactPackageImpl#getArtifact()
		 * @generated
		 */
		EClass ARTIFACT = eINSTANCE.getArtifact();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACT__UID = eINSTANCE.getArtifact_Uid();

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
		 * The meta object literal for the '<em><b>Config Hashes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIFACT__CONFIG_HASHES = eINSTANCE.getArtifact_ConfigHashes();

		/**
		 * The meta object literal for the '<em><b>Model Query</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIFACT__MODEL_QUERY = eINSTANCE.getArtifact_ModelQuery();

		/**
		 * The meta object literal for the '<em><b>Technologies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIFACT__TECHNOLOGIES = eINSTANCE.getArtifact_Technologies();

		/**
		 * The meta object literal for the '<em><b>Hints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIFACT__HINTS = eINSTANCE.getArtifact_Hints();

		/**
		 * The meta object literal for the '<em><b>Template</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACT__TEMPLATE = eINSTANCE.getArtifact_Template();

		/**
		 * The meta object literal for the '{@link tura.artifact.impl.GenerationHintImpl <em>Generation Hint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tura.artifact.impl.GenerationHintImpl
		 * @see tura.artifact.impl.ArtifactPackageImpl#getGenerationHint()
		 * @generated
		 */
		EClass GENERATION_HINT = eINSTANCE.getGenerationHint();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATION_HINT__UID = eINSTANCE.getGenerationHint_Uid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATION_HINT__NAME = eINSTANCE.getGenerationHint_Name();

		/**
		 * The meta object literal for the '<em><b>Applyed Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATION_HINT__APPLYED_CLASS = eINSTANCE.getGenerationHint_ApplyedClass();

		/**
		 * The meta object literal for the '{@link tura.artifact.impl.ConfigVariableImpl <em>Config Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tura.artifact.impl.ConfigVariableImpl
		 * @see tura.artifact.impl.ArtifactPackageImpl#getConfigVariable()
		 * @generated
		 */
		EClass CONFIG_VARIABLE = eINSTANCE.getConfigVariable();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG_VARIABLE__UID = eINSTANCE.getConfigVariable_Uid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG_VARIABLE__NAME = eINSTANCE.getConfigVariable_Name();

		/**
		 * The meta object literal for the '{@link tura.artifact.impl.ConfigHashImpl <em>Config Hash</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tura.artifact.impl.ConfigHashImpl
		 * @see tura.artifact.impl.ArtifactPackageImpl#getConfigHash()
		 * @generated
		 */
		EClass CONFIG_HASH = eINSTANCE.getConfigHash();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG_HASH__UID = eINSTANCE.getConfigHash_Uid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG_HASH__NAME = eINSTANCE.getConfigHash_Name();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIG_HASH__PARENT = eINSTANCE.getConfigHash_Parent();

		/**
		 * The meta object literal for the '{@link tura.artifact.impl.ModelQueryImpl <em>Model Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tura.artifact.impl.ModelQueryImpl
		 * @see tura.artifact.impl.ArtifactPackageImpl#getModelQuery()
		 * @generated
		 */
		EClass MODEL_QUERY = eINSTANCE.getModelQuery();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_QUERY__UID = eINSTANCE.getModelQuery_Uid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_QUERY__NAME = eINSTANCE.getModelQuery_Name();

		/**
		 * The meta object literal for the '<em><b>Query</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_QUERY__QUERY = eINSTANCE.getModelQuery_Query();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_QUERY__PARAMETERS = eINSTANCE.getModelQuery_Parameters();

		/**
		 * The meta object literal for the '{@link tura.artifact.impl.QueryParameterImpl <em>Query Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tura.artifact.impl.QueryParameterImpl
		 * @see tura.artifact.impl.ArtifactPackageImpl#getQueryParameter()
		 * @generated
		 */
		EClass QUERY_PARAMETER = eINSTANCE.getQueryParameter();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_PARAMETER__UID = eINSTANCE.getQueryParameter_Uid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_PARAMETER__NAME = eINSTANCE.getQueryParameter_Name();

		/**
		 * The meta object literal for the '{@link tura.artifact.impl.TechnologyImpl <em>Technology</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tura.artifact.impl.TechnologyImpl
		 * @see tura.artifact.impl.ArtifactPackageImpl#getTechnology()
		 * @generated
		 */
		EClass TECHNOLOGY = eINSTANCE.getTechnology();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TECHNOLOGY__UID = eINSTANCE.getTechnology_Uid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TECHNOLOGY__NAME = eINSTANCE.getTechnology_Name();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TECHNOLOGY__OPTIONS = eINSTANCE.getTechnology_Options();

		/**
		 * The meta object literal for the '{@link tura.artifact.impl.OptionImpl <em>Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tura.artifact.impl.OptionImpl
		 * @see tura.artifact.impl.ArtifactPackageImpl#getOption()
		 * @generated
		 */
		EClass OPTION = eINSTANCE.getOption();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTION__UID = eINSTANCE.getOption_Uid();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTION__VALUE = eINSTANCE.getOption_Value();

	}

} //ArtifactPackage
