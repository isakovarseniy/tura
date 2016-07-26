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
	ArtifactPackage eINSTANCE = artifact.impl.ArtifactPackageImpl.init();

	/**
	 * The meta object id for the '{@link artifact.impl.ArtifactGroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see artifact.impl.ArtifactGroupImpl
	 * @see artifact.impl.ArtifactPackageImpl#getArtifactGroup()
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
	 * The meta object id for the '{@link artifact.impl.TechLeafImpl <em>Tech Leaf</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see artifact.impl.TechLeafImpl
	 * @see artifact.impl.ArtifactPackageImpl#getTechLeaf()
	 * @generated
	 */
	int TECH_LEAF = 1;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECH_LEAF__UID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECH_LEAF__NAME = 1;

	/**
	 * The feature id for the '<em><b>Hints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECH_LEAF__HINTS = 2;

	/**
	 * The feature id for the '<em><b>Config Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECH_LEAF__CONFIG_VARIABLES = 3;

	/**
	 * The feature id for the '<em><b>Tech Leafs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECH_LEAF__TECH_LEAFS = 4;

	/**
	 * The number of structural features of the '<em>Tech Leaf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECH_LEAF_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link artifact.impl.ArtifactImpl <em>Artifact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see artifact.impl.ArtifactImpl
	 * @see artifact.impl.ArtifactPackageImpl#getArtifact()
	 * @generated
	 */
	int ARTIFACT = 2;

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
	 * The feature id for the '<em><b>Config Variables</b></em>' reference list.
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
	 * The feature id for the '<em><b>Hints</b></em>' reference list.
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
	 * The meta object id for the '{@link artifact.impl.GenerationHintImpl <em>Generation Hint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see artifact.impl.GenerationHintImpl
	 * @see artifact.impl.ArtifactPackageImpl#getGenerationHint()
	 * @generated
	 */
	int GENERATION_HINT = 3;

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
	 * The number of structural features of the '<em>Generation Hint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_HINT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link artifact.impl.ConfigVariableImpl <em>Config Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see artifact.impl.ConfigVariableImpl
	 * @see artifact.impl.ArtifactPackageImpl#getConfigVariable()
	 * @generated
	 */
	int CONFIG_VARIABLE = 4;

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
	 * The meta object id for the '{@link artifact.impl.ConfigHashImpl <em>Config Hash</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see artifact.impl.ConfigHashImpl
	 * @see artifact.impl.ArtifactPackageImpl#getConfigHash()
	 * @generated
	 */
	int CONFIG_HASH = 5;

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
	 * The number of structural features of the '<em>Config Hash</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_HASH_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link artifact.impl.ModelQueryImpl <em>Model Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see artifact.impl.ModelQueryImpl
	 * @see artifact.impl.ArtifactPackageImpl#getModelQuery()
	 * @generated
	 */
	int MODEL_QUERY = 6;

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
	 * The meta object id for the '{@link artifact.impl.QueryParameterImpl <em>Query Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see artifact.impl.QueryParameterImpl
	 * @see artifact.impl.ArtifactPackageImpl#getQueryParameter()
	 * @generated
	 */
	int QUERY_PARAMETER = 7;

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
	 * The meta object id for the '{@link artifact.impl.TechnologyImpl <em>Technology</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see artifact.impl.TechnologyImpl
	 * @see artifact.impl.ArtifactPackageImpl#getTechnology()
	 * @generated
	 */
	int TECHNOLOGY = 8;

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
	 * The meta object id for the '{@link artifact.impl.OptionImpl <em>Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see artifact.impl.OptionImpl
	 * @see artifact.impl.ArtifactPackageImpl#getOption()
	 * @generated
	 */
	int OPTION = 9;

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
	 * Returns the meta object for class '{@link artifact.ArtifactGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see artifact.ArtifactGroup
	 * @generated
	 */
	EClass getArtifactGroup();

	/**
	 * Returns the meta object for the attribute '{@link artifact.ArtifactGroup#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see artifact.ArtifactGroup#getUid()
	 * @see #getArtifactGroup()
	 * @generated
	 */
	EAttribute getArtifactGroup_Uid();

	/**
	 * Returns the meta object for the attribute '{@link artifact.ArtifactGroup#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see artifact.ArtifactGroup#getName()
	 * @see #getArtifactGroup()
	 * @generated
	 */
	EAttribute getArtifactGroup_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link artifact.ArtifactGroup#getArtifacts <em>Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Artifacts</em>'.
	 * @see artifact.ArtifactGroup#getArtifacts()
	 * @see #getArtifactGroup()
	 * @generated
	 */
	EReference getArtifactGroup_Artifacts();

	/**
	 * Returns the meta object for class '{@link artifact.TechLeaf <em>Tech Leaf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tech Leaf</em>'.
	 * @see artifact.TechLeaf
	 * @generated
	 */
	EClass getTechLeaf();

	/**
	 * Returns the meta object for the attribute '{@link artifact.TechLeaf#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see artifact.TechLeaf#getUid()
	 * @see #getTechLeaf()
	 * @generated
	 */
	EAttribute getTechLeaf_Uid();

	/**
	 * Returns the meta object for the attribute '{@link artifact.TechLeaf#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see artifact.TechLeaf#getName()
	 * @see #getTechLeaf()
	 * @generated
	 */
	EAttribute getTechLeaf_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link artifact.TechLeaf#getHints <em>Hints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hints</em>'.
	 * @see artifact.TechLeaf#getHints()
	 * @see #getTechLeaf()
	 * @generated
	 */
	EReference getTechLeaf_Hints();

	/**
	 * Returns the meta object for the containment reference list '{@link artifact.TechLeaf#getConfigVariables <em>Config Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Config Variables</em>'.
	 * @see artifact.TechLeaf#getConfigVariables()
	 * @see #getTechLeaf()
	 * @generated
	 */
	EReference getTechLeaf_ConfigVariables();

	/**
	 * Returns the meta object for the containment reference list '{@link artifact.TechLeaf#getTechLeafs <em>Tech Leafs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tech Leafs</em>'.
	 * @see artifact.TechLeaf#getTechLeafs()
	 * @see #getTechLeaf()
	 * @generated
	 */
	EReference getTechLeaf_TechLeafs();

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
	 * Returns the meta object for the attribute '{@link artifact.Artifact#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see artifact.Artifact#getUid()
	 * @see #getArtifact()
	 * @generated
	 */
	EAttribute getArtifact_Uid();

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
	 * Returns the meta object for the reference list '{@link artifact.Artifact#getConfigVariables <em>Config Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Config Variables</em>'.
	 * @see artifact.Artifact#getConfigVariables()
	 * @see #getArtifact()
	 * @generated
	 */
	EReference getArtifact_ConfigVariables();

	/**
	 * Returns the meta object for the containment reference list '{@link artifact.Artifact#getConfigHashes <em>Config Hashes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Config Hashes</em>'.
	 * @see artifact.Artifact#getConfigHashes()
	 * @see #getArtifact()
	 * @generated
	 */
	EReference getArtifact_ConfigHashes();

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
	 * Returns the meta object for the containment reference list '{@link artifact.Artifact#getTechnologies <em>Technologies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Technologies</em>'.
	 * @see artifact.Artifact#getTechnologies()
	 * @see #getArtifact()
	 * @generated
	 */
	EReference getArtifact_Technologies();

	/**
	 * Returns the meta object for the reference list '{@link artifact.Artifact#getHints <em>Hints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Hints</em>'.
	 * @see artifact.Artifact#getHints()
	 * @see #getArtifact()
	 * @generated
	 */
	EReference getArtifact_Hints();

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
	 * Returns the meta object for class '{@link artifact.GenerationHint <em>Generation Hint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generation Hint</em>'.
	 * @see artifact.GenerationHint
	 * @generated
	 */
	EClass getGenerationHint();

	/**
	 * Returns the meta object for the attribute '{@link artifact.GenerationHint#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see artifact.GenerationHint#getUid()
	 * @see #getGenerationHint()
	 * @generated
	 */
	EAttribute getGenerationHint_Uid();

	/**
	 * Returns the meta object for the attribute '{@link artifact.GenerationHint#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see artifact.GenerationHint#getName()
	 * @see #getGenerationHint()
	 * @generated
	 */
	EAttribute getGenerationHint_Name();

	/**
	 * Returns the meta object for class '{@link artifact.ConfigVariable <em>Config Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Config Variable</em>'.
	 * @see artifact.ConfigVariable
	 * @generated
	 */
	EClass getConfigVariable();

	/**
	 * Returns the meta object for the attribute '{@link artifact.ConfigVariable#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see artifact.ConfigVariable#getUid()
	 * @see #getConfigVariable()
	 * @generated
	 */
	EAttribute getConfigVariable_Uid();

	/**
	 * Returns the meta object for the attribute '{@link artifact.ConfigVariable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see artifact.ConfigVariable#getName()
	 * @see #getConfigVariable()
	 * @generated
	 */
	EAttribute getConfigVariable_Name();

	/**
	 * Returns the meta object for class '{@link artifact.ConfigHash <em>Config Hash</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Config Hash</em>'.
	 * @see artifact.ConfigHash
	 * @generated
	 */
	EClass getConfigHash();

	/**
	 * Returns the meta object for the attribute '{@link artifact.ConfigHash#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see artifact.ConfigHash#getUid()
	 * @see #getConfigHash()
	 * @generated
	 */
	EAttribute getConfigHash_Uid();

	/**
	 * Returns the meta object for the attribute '{@link artifact.ConfigHash#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see artifact.ConfigHash#getName()
	 * @see #getConfigHash()
	 * @generated
	 */
	EAttribute getConfigHash_Name();

	/**
	 * Returns the meta object for class '{@link artifact.ModelQuery <em>Model Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Query</em>'.
	 * @see artifact.ModelQuery
	 * @generated
	 */
	EClass getModelQuery();

	/**
	 * Returns the meta object for the attribute '{@link artifact.ModelQuery#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see artifact.ModelQuery#getUid()
	 * @see #getModelQuery()
	 * @generated
	 */
	EAttribute getModelQuery_Uid();

	/**
	 * Returns the meta object for the attribute '{@link artifact.ModelQuery#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see artifact.ModelQuery#getName()
	 * @see #getModelQuery()
	 * @generated
	 */
	EAttribute getModelQuery_Name();

	/**
	 * Returns the meta object for the attribute '{@link artifact.ModelQuery#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Query</em>'.
	 * @see artifact.ModelQuery#getQuery()
	 * @see #getModelQuery()
	 * @generated
	 */
	EAttribute getModelQuery_Query();

	/**
	 * Returns the meta object for the containment reference list '{@link artifact.ModelQuery#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see artifact.ModelQuery#getParameters()
	 * @see #getModelQuery()
	 * @generated
	 */
	EReference getModelQuery_Parameters();

	/**
	 * Returns the meta object for class '{@link artifact.QueryParameter <em>Query Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Parameter</em>'.
	 * @see artifact.QueryParameter
	 * @generated
	 */
	EClass getQueryParameter();

	/**
	 * Returns the meta object for the attribute '{@link artifact.QueryParameter#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see artifact.QueryParameter#getUid()
	 * @see #getQueryParameter()
	 * @generated
	 */
	EAttribute getQueryParameter_Uid();

	/**
	 * Returns the meta object for the attribute '{@link artifact.QueryParameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see artifact.QueryParameter#getName()
	 * @see #getQueryParameter()
	 * @generated
	 */
	EAttribute getQueryParameter_Name();

	/**
	 * Returns the meta object for class '{@link artifact.Technology <em>Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Technology</em>'.
	 * @see artifact.Technology
	 * @generated
	 */
	EClass getTechnology();

	/**
	 * Returns the meta object for the attribute '{@link artifact.Technology#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see artifact.Technology#getUid()
	 * @see #getTechnology()
	 * @generated
	 */
	EAttribute getTechnology_Uid();

	/**
	 * Returns the meta object for the attribute '{@link artifact.Technology#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see artifact.Technology#getName()
	 * @see #getTechnology()
	 * @generated
	 */
	EAttribute getTechnology_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link artifact.Technology#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Options</em>'.
	 * @see artifact.Technology#getOptions()
	 * @see #getTechnology()
	 * @generated
	 */
	EReference getTechnology_Options();

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
	 * Returns the meta object for the attribute '{@link artifact.Option#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see artifact.Option#getUid()
	 * @see #getOption()
	 * @generated
	 */
	EAttribute getOption_Uid();

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
	interface Literals {
		/**
		 * The meta object literal for the '{@link artifact.impl.ArtifactGroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see artifact.impl.ArtifactGroupImpl
		 * @see artifact.impl.ArtifactPackageImpl#getArtifactGroup()
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
		 * The meta object literal for the '{@link artifact.impl.TechLeafImpl <em>Tech Leaf</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see artifact.impl.TechLeafImpl
		 * @see artifact.impl.ArtifactPackageImpl#getTechLeaf()
		 * @generated
		 */
		EClass TECH_LEAF = eINSTANCE.getTechLeaf();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TECH_LEAF__UID = eINSTANCE.getTechLeaf_Uid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TECH_LEAF__NAME = eINSTANCE.getTechLeaf_Name();

		/**
		 * The meta object literal for the '<em><b>Hints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TECH_LEAF__HINTS = eINSTANCE.getTechLeaf_Hints();

		/**
		 * The meta object literal for the '<em><b>Config Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TECH_LEAF__CONFIG_VARIABLES = eINSTANCE.getTechLeaf_ConfigVariables();

		/**
		 * The meta object literal for the '<em><b>Tech Leafs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TECH_LEAF__TECH_LEAFS = eINSTANCE.getTechLeaf_TechLeafs();

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
		 * The meta object literal for the '<em><b>Config Variables</b></em>' reference list feature.
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
		 * The meta object literal for the '<em><b>Hints</b></em>' reference list feature.
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
		 * The meta object literal for the '{@link artifact.impl.GenerationHintImpl <em>Generation Hint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see artifact.impl.GenerationHintImpl
		 * @see artifact.impl.ArtifactPackageImpl#getGenerationHint()
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
		 * The meta object literal for the '{@link artifact.impl.ConfigVariableImpl <em>Config Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see artifact.impl.ConfigVariableImpl
		 * @see artifact.impl.ArtifactPackageImpl#getConfigVariable()
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
		 * The meta object literal for the '{@link artifact.impl.ConfigHashImpl <em>Config Hash</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see artifact.impl.ConfigHashImpl
		 * @see artifact.impl.ArtifactPackageImpl#getConfigHash()
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
		 * The meta object literal for the '{@link artifact.impl.ModelQueryImpl <em>Model Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see artifact.impl.ModelQueryImpl
		 * @see artifact.impl.ArtifactPackageImpl#getModelQuery()
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
		 * The meta object literal for the '{@link artifact.impl.QueryParameterImpl <em>Query Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see artifact.impl.QueryParameterImpl
		 * @see artifact.impl.ArtifactPackageImpl#getQueryParameter()
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
		 * The meta object literal for the '{@link artifact.impl.TechnologyImpl <em>Technology</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see artifact.impl.TechnologyImpl
		 * @see artifact.impl.ArtifactPackageImpl#getTechnology()
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
		 * The meta object literal for the '{@link artifact.impl.OptionImpl <em>Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see artifact.impl.OptionImpl
		 * @see artifact.impl.ArtifactPackageImpl#getOption()
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
