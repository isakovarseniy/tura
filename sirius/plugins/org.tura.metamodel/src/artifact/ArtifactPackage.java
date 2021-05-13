/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

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
	 * The feature id for the '<em><b>Key Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_GROUP__KEY_ID = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_GROUP__NAME = 2;

	/**
	 * The feature id for the '<em><b>Artifacts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_GROUP__ARTIFACTS = 3;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_GROUP_FEATURE_COUNT = 4;

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
	 * The feature id for the '<em><b>Key Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECH_LEAF__KEY_ID = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECH_LEAF__NAME = 2;

	/**
	 * The feature id for the '<em><b>Hints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECH_LEAF__HINTS = 3;

	/**
	 * The feature id for the '<em><b>Config Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECH_LEAF__CONFIG_VARIABLES = 4;

	/**
	 * The feature id for the '<em><b>Config Hashes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECH_LEAF__CONFIG_HASHES = 5;

	/**
	 * The feature id for the '<em><b>Tech Leafs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECH_LEAF__TECH_LEAFS = 6;

	/**
	 * The number of structural features of the '<em>Tech Leaf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECH_LEAF_FEATURE_COUNT = 7;

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
	 * The feature id for the '<em><b>Key Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__KEY_ID = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__NAME = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Config Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__CONFIG_VARIABLES = 4;

	/**
	 * The feature id for the '<em><b>Config Hashes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__CONFIG_HASHES = 5;

	/**
	 * The feature id for the '<em><b>Model Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__MODEL_QUERY = 6;

	/**
	 * The feature id for the '<em><b>Technologies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__TECHNOLOGIES = 7;

	/**
	 * The feature id for the '<em><b>Hints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__HINTS = 8;

	/**
	 * The feature id for the '<em><b>Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__TEMPLATE = 9;

	/**
	 * The number of structural features of the '<em>Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link artifact.impl.GenerationHintWithNickNameImpl <em>Generation Hint With Nick Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see artifact.impl.GenerationHintWithNickNameImpl
	 * @see artifact.impl.ArtifactPackageImpl#getGenerationHintWithNickName()
	 * @generated
	 */
	int GENERATION_HINT_WITH_NICK_NAME = 3;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_HINT_WITH_NICK_NAME__UID = 0;

	/**
	 * The feature id for the '<em><b>Key Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_HINT_WITH_NICK_NAME__KEY_ID = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_HINT_WITH_NICK_NAME__NAME = 2;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_HINT_WITH_NICK_NAME__HINT = 3;

	/**
	 * The number of structural features of the '<em>Generation Hint With Nick Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_HINT_WITH_NICK_NAME_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link artifact.impl.ConfigVariableWithNickNameImpl <em>Config Variable With Nick Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see artifact.impl.ConfigVariableWithNickNameImpl
	 * @see artifact.impl.ArtifactPackageImpl#getConfigVariableWithNickName()
	 * @generated
	 */
	int CONFIG_VARIABLE_WITH_NICK_NAME = 4;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_VARIABLE_WITH_NICK_NAME__UID = 0;

	/**
	 * The feature id for the '<em><b>Key Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_VARIABLE_WITH_NICK_NAME__KEY_ID = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_VARIABLE_WITH_NICK_NAME__NAME = 2;

	/**
	 * The feature id for the '<em><b>Var Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_VARIABLE_WITH_NICK_NAME__VAR_REF = 3;

	/**
	 * The number of structural features of the '<em>Config Variable With Nick Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_VARIABLE_WITH_NICK_NAME_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link artifact.impl.ConfigHashWithNickNameImpl <em>Config Hash With Nick Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see artifact.impl.ConfigHashWithNickNameImpl
	 * @see artifact.impl.ArtifactPackageImpl#getConfigHashWithNickName()
	 * @generated
	 */
	int CONFIG_HASH_WITH_NICK_NAME = 5;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_HASH_WITH_NICK_NAME__UID = 0;

	/**
	 * The feature id for the '<em><b>Key Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_HASH_WITH_NICK_NAME__KEY_ID = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_HASH_WITH_NICK_NAME__NAME = 2;

	/**
	 * The feature id for the '<em><b>Hash</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_HASH_WITH_NICK_NAME__HASH = 3;

	/**
	 * The number of structural features of the '<em>Config Hash With Nick Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_HASH_WITH_NICK_NAME_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link artifact.impl.GenerationHintImpl <em>Generation Hint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see artifact.impl.GenerationHintImpl
	 * @see artifact.impl.ArtifactPackageImpl#getGenerationHint()
	 * @generated
	 */
	int GENERATION_HINT = 6;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_HINT__UID = 0;

	/**
	 * The feature id for the '<em><b>Key Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_HINT__KEY_ID = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_HINT__NAME = 2;

	/**
	 * The number of structural features of the '<em>Generation Hint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_HINT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link artifact.impl.ConfigVariableImpl <em>Config Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see artifact.impl.ConfigVariableImpl
	 * @see artifact.impl.ArtifactPackageImpl#getConfigVariable()
	 * @generated
	 */
	int CONFIG_VARIABLE = 7;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_VARIABLE__UID = 0;

	/**
	 * The feature id for the '<em><b>Key Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_VARIABLE__KEY_ID = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_VARIABLE__NAME = 2;

	/**
	 * The number of structural features of the '<em>Config Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_VARIABLE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link artifact.impl.ConfigHashImpl <em>Config Hash</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see artifact.impl.ConfigHashImpl
	 * @see artifact.impl.ArtifactPackageImpl#getConfigHash()
	 * @generated
	 */
	int CONFIG_HASH = 8;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_HASH__UID = 0;

	/**
	 * The feature id for the '<em><b>Key Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_HASH__KEY_ID = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_HASH__NAME = 2;

	/**
	 * The number of structural features of the '<em>Config Hash</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_HASH_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link artifact.impl.ModelQueryImpl <em>Model Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see artifact.impl.ModelQueryImpl
	 * @see artifact.impl.ArtifactPackageImpl#getModelQuery()
	 * @generated
	 */
	int MODEL_QUERY = 9;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_QUERY__UID = 0;

	/**
	 * The feature id for the '<em><b>Key Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_QUERY__KEY_ID = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_QUERY__NAME = 2;

	/**
	 * The feature id for the '<em><b>Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_QUERY__QUERY = 3;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_QUERY__PARAMETERS = 4;

	/**
	 * The number of structural features of the '<em>Model Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_QUERY_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link artifact.impl.QueryParameterImpl <em>Query Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see artifact.impl.QueryParameterImpl
	 * @see artifact.impl.ArtifactPackageImpl#getQueryParameter()
	 * @generated
	 */
	int QUERY_PARAMETER = 10;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER__UID = 0;

	/**
	 * The feature id for the '<em><b>Key Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER__KEY_ID = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER__NAME = 2;

	/**
	 * The number of structural features of the '<em>Query Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link artifact.impl.TechnologyImpl <em>Technology</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see artifact.impl.TechnologyImpl
	 * @see artifact.impl.ArtifactPackageImpl#getTechnology()
	 * @generated
	 */
	int TECHNOLOGY = 11;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY__UID = 0;

	/**
	 * The feature id for the '<em><b>Key Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY__KEY_ID = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY__NAME = 2;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY__OPTIONS = 3;

	/**
	 * The number of structural features of the '<em>Technology</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link artifact.impl.OptionImpl <em>Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see artifact.impl.OptionImpl
	 * @see artifact.impl.ArtifactPackageImpl#getOption()
	 * @generated
	 */
	int OPTION = 12;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__UID = 0;

	/**
	 * The feature id for the '<em><b>Key Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__KEY_ID = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__VALUE = 2;

	/**
	 * The number of structural features of the '<em>Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link artifact.impl.CategorizedImpl <em>Categorized</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see artifact.impl.CategorizedImpl
	 * @see artifact.impl.ArtifactPackageImpl#getCategorized()
	 * @generated
	 */
	int CATEGORIZED = 13;

	/**
	 * The feature id for the '<em><b>Classifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZED__CLASSIFIERS = 0;

	/**
	 * The number of structural features of the '<em>Categorized</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZED_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link artifact.impl.ClassifierImpl <em>Classifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see artifact.impl.ClassifierImpl
	 * @see artifact.impl.ArtifactPackageImpl#getClassifier()
	 * @generated
	 */
	int CLASSIFIER = 14;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__UID = 0;

	/**
	 * The feature id for the '<em><b>Key Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__KEY_ID = 1;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__HINT = 2;

	/**
	 * The feature id for the '<em><b>Details</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__DETAILS = 3;

	/**
	 * The number of structural features of the '<em>Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_FEATURE_COUNT = 4;


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
	 * Returns the meta object for the attribute '{@link artifact.ArtifactGroup#getKeyId <em>Key Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key Id</em>'.
	 * @see artifact.ArtifactGroup#getKeyId()
	 * @see #getArtifactGroup()
	 * @generated
	 */
	EAttribute getArtifactGroup_KeyId();

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
	 * Returns the meta object for the attribute '{@link artifact.TechLeaf#getKeyId <em>Key Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key Id</em>'.
	 * @see artifact.TechLeaf#getKeyId()
	 * @see #getTechLeaf()
	 * @generated
	 */
	EAttribute getTechLeaf_KeyId();

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
	 * Returns the meta object for the containment reference list '{@link artifact.TechLeaf#getConfigHashes <em>Config Hashes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Config Hashes</em>'.
	 * @see artifact.TechLeaf#getConfigHashes()
	 * @see #getTechLeaf()
	 * @generated
	 */
	EReference getTechLeaf_ConfigHashes();

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
	 * Returns the meta object for the attribute '{@link artifact.Artifact#getKeyId <em>Key Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key Id</em>'.
	 * @see artifact.Artifact#getKeyId()
	 * @see #getArtifact()
	 * @generated
	 */
	EAttribute getArtifact_KeyId();

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
	 * Returns the meta object for the containment reference list '{@link artifact.Artifact#getHints <em>Hints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hints</em>'.
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
	 * Returns the meta object for class '{@link artifact.GenerationHintWithNickName <em>Generation Hint With Nick Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generation Hint With Nick Name</em>'.
	 * @see artifact.GenerationHintWithNickName
	 * @generated
	 */
	EClass getGenerationHintWithNickName();

	/**
	 * Returns the meta object for the attribute '{@link artifact.GenerationHintWithNickName#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see artifact.GenerationHintWithNickName#getUid()
	 * @see #getGenerationHintWithNickName()
	 * @generated
	 */
	EAttribute getGenerationHintWithNickName_Uid();

	/**
	 * Returns the meta object for the attribute '{@link artifact.GenerationHintWithNickName#getKeyId <em>Key Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key Id</em>'.
	 * @see artifact.GenerationHintWithNickName#getKeyId()
	 * @see #getGenerationHintWithNickName()
	 * @generated
	 */
	EAttribute getGenerationHintWithNickName_KeyId();

	/**
	 * Returns the meta object for the attribute '{@link artifact.GenerationHintWithNickName#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see artifact.GenerationHintWithNickName#getName()
	 * @see #getGenerationHintWithNickName()
	 * @generated
	 */
	EAttribute getGenerationHintWithNickName_Name();

	/**
	 * Returns the meta object for the reference '{@link artifact.GenerationHintWithNickName#getHint <em>Hint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hint</em>'.
	 * @see artifact.GenerationHintWithNickName#getHint()
	 * @see #getGenerationHintWithNickName()
	 * @generated
	 */
	EReference getGenerationHintWithNickName_Hint();

	/**
	 * Returns the meta object for class '{@link artifact.ConfigVariableWithNickName <em>Config Variable With Nick Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Config Variable With Nick Name</em>'.
	 * @see artifact.ConfigVariableWithNickName
	 * @generated
	 */
	EClass getConfigVariableWithNickName();

	/**
	 * Returns the meta object for the attribute '{@link artifact.ConfigVariableWithNickName#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see artifact.ConfigVariableWithNickName#getUid()
	 * @see #getConfigVariableWithNickName()
	 * @generated
	 */
	EAttribute getConfigVariableWithNickName_Uid();

	/**
	 * Returns the meta object for the attribute '{@link artifact.ConfigVariableWithNickName#getKeyId <em>Key Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key Id</em>'.
	 * @see artifact.ConfigVariableWithNickName#getKeyId()
	 * @see #getConfigVariableWithNickName()
	 * @generated
	 */
	EAttribute getConfigVariableWithNickName_KeyId();

	/**
	 * Returns the meta object for the attribute '{@link artifact.ConfigVariableWithNickName#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see artifact.ConfigVariableWithNickName#getName()
	 * @see #getConfigVariableWithNickName()
	 * @generated
	 */
	EAttribute getConfigVariableWithNickName_Name();

	/**
	 * Returns the meta object for the reference '{@link artifact.ConfigVariableWithNickName#getVarRef <em>Var Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Var Ref</em>'.
	 * @see artifact.ConfigVariableWithNickName#getVarRef()
	 * @see #getConfigVariableWithNickName()
	 * @generated
	 */
	EReference getConfigVariableWithNickName_VarRef();

	/**
	 * Returns the meta object for class '{@link artifact.ConfigHashWithNickName <em>Config Hash With Nick Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Config Hash With Nick Name</em>'.
	 * @see artifact.ConfigHashWithNickName
	 * @generated
	 */
	EClass getConfigHashWithNickName();

	/**
	 * Returns the meta object for the attribute '{@link artifact.ConfigHashWithNickName#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see artifact.ConfigHashWithNickName#getUid()
	 * @see #getConfigHashWithNickName()
	 * @generated
	 */
	EAttribute getConfigHashWithNickName_Uid();

	/**
	 * Returns the meta object for the attribute '{@link artifact.ConfigHashWithNickName#getKeyId <em>Key Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key Id</em>'.
	 * @see artifact.ConfigHashWithNickName#getKeyId()
	 * @see #getConfigHashWithNickName()
	 * @generated
	 */
	EAttribute getConfigHashWithNickName_KeyId();

	/**
	 * Returns the meta object for the attribute '{@link artifact.ConfigHashWithNickName#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see artifact.ConfigHashWithNickName#getName()
	 * @see #getConfigHashWithNickName()
	 * @generated
	 */
	EAttribute getConfigHashWithNickName_Name();

	/**
	 * Returns the meta object for the reference '{@link artifact.ConfigHashWithNickName#getHash <em>Hash</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hash</em>'.
	 * @see artifact.ConfigHashWithNickName#getHash()
	 * @see #getConfigHashWithNickName()
	 * @generated
	 */
	EReference getConfigHashWithNickName_Hash();

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
	 * Returns the meta object for the attribute '{@link artifact.GenerationHint#getKeyId <em>Key Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key Id</em>'.
	 * @see artifact.GenerationHint#getKeyId()
	 * @see #getGenerationHint()
	 * @generated
	 */
	EAttribute getGenerationHint_KeyId();

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
	 * Returns the meta object for the attribute '{@link artifact.ConfigVariable#getKeyId <em>Key Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key Id</em>'.
	 * @see artifact.ConfigVariable#getKeyId()
	 * @see #getConfigVariable()
	 * @generated
	 */
	EAttribute getConfigVariable_KeyId();

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
	 * Returns the meta object for the attribute '{@link artifact.ConfigHash#getKeyId <em>Key Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key Id</em>'.
	 * @see artifact.ConfigHash#getKeyId()
	 * @see #getConfigHash()
	 * @generated
	 */
	EAttribute getConfigHash_KeyId();

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
	 * Returns the meta object for the attribute '{@link artifact.ModelQuery#getKeyId <em>Key Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key Id</em>'.
	 * @see artifact.ModelQuery#getKeyId()
	 * @see #getModelQuery()
	 * @generated
	 */
	EAttribute getModelQuery_KeyId();

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
	 * Returns the meta object for the attribute '{@link artifact.QueryParameter#getKeyId <em>Key Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key Id</em>'.
	 * @see artifact.QueryParameter#getKeyId()
	 * @see #getQueryParameter()
	 * @generated
	 */
	EAttribute getQueryParameter_KeyId();

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
	 * Returns the meta object for the attribute '{@link artifact.Technology#getKeyId <em>Key Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key Id</em>'.
	 * @see artifact.Technology#getKeyId()
	 * @see #getTechnology()
	 * @generated
	 */
	EAttribute getTechnology_KeyId();

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
	 * Returns the meta object for the attribute '{@link artifact.Option#getKeyId <em>Key Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key Id</em>'.
	 * @see artifact.Option#getKeyId()
	 * @see #getOption()
	 * @generated
	 */
	EAttribute getOption_KeyId();

	/**
	 * Returns the meta object for the reference '{@link artifact.Option#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see artifact.Option#getValue()
	 * @see #getOption()
	 * @generated
	 */
	EReference getOption_Value();

	/**
	 * Returns the meta object for class '{@link artifact.Categorized <em>Categorized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Categorized</em>'.
	 * @see artifact.Categorized
	 * @generated
	 */
	EClass getCategorized();

	/**
	 * Returns the meta object for the containment reference list '{@link artifact.Categorized#getClassifiers <em>Classifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classifiers</em>'.
	 * @see artifact.Categorized#getClassifiers()
	 * @see #getCategorized()
	 * @generated
	 */
	EReference getCategorized_Classifiers();

	/**
	 * Returns the meta object for class '{@link artifact.Classifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classifier</em>'.
	 * @see artifact.Classifier
	 * @generated
	 */
	EClass getClassifier();

	/**
	 * Returns the meta object for the attribute '{@link artifact.Classifier#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see artifact.Classifier#getUid()
	 * @see #getClassifier()
	 * @generated
	 */
	EAttribute getClassifier_Uid();

	/**
	 * Returns the meta object for the attribute '{@link artifact.Classifier#getKeyId <em>Key Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key Id</em>'.
	 * @see artifact.Classifier#getKeyId()
	 * @see #getClassifier()
	 * @generated
	 */
	EAttribute getClassifier_KeyId();

	/**
	 * Returns the meta object for the reference '{@link artifact.Classifier#getHint <em>Hint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hint</em>'.
	 * @see artifact.Classifier#getHint()
	 * @see #getClassifier()
	 * @generated
	 */
	EReference getClassifier_Hint();

	/**
	 * Returns the meta object for the attribute '{@link artifact.Classifier#getDetails <em>Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Details</em>'.
	 * @see artifact.Classifier#getDetails()
	 * @see #getClassifier()
	 * @generated
	 */
	EAttribute getClassifier_Details();

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
		 * The meta object literal for the '<em><b>Key Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACT_GROUP__KEY_ID = eINSTANCE.getArtifactGroup_KeyId();

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
		 * The meta object literal for the '<em><b>Key Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TECH_LEAF__KEY_ID = eINSTANCE.getTechLeaf_KeyId();

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
		 * The meta object literal for the '<em><b>Config Hashes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TECH_LEAF__CONFIG_HASHES = eINSTANCE.getTechLeaf_ConfigHashes();

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
		 * The meta object literal for the '<em><b>Key Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACT__KEY_ID = eINSTANCE.getArtifact_KeyId();

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
		 * The meta object literal for the '{@link artifact.impl.GenerationHintWithNickNameImpl <em>Generation Hint With Nick Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see artifact.impl.GenerationHintWithNickNameImpl
		 * @see artifact.impl.ArtifactPackageImpl#getGenerationHintWithNickName()
		 * @generated
		 */
		EClass GENERATION_HINT_WITH_NICK_NAME = eINSTANCE.getGenerationHintWithNickName();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATION_HINT_WITH_NICK_NAME__UID = eINSTANCE.getGenerationHintWithNickName_Uid();

		/**
		 * The meta object literal for the '<em><b>Key Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATION_HINT_WITH_NICK_NAME__KEY_ID = eINSTANCE.getGenerationHintWithNickName_KeyId();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATION_HINT_WITH_NICK_NAME__NAME = eINSTANCE.getGenerationHintWithNickName_Name();

		/**
		 * The meta object literal for the '<em><b>Hint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATION_HINT_WITH_NICK_NAME__HINT = eINSTANCE.getGenerationHintWithNickName_Hint();

		/**
		 * The meta object literal for the '{@link artifact.impl.ConfigVariableWithNickNameImpl <em>Config Variable With Nick Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see artifact.impl.ConfigVariableWithNickNameImpl
		 * @see artifact.impl.ArtifactPackageImpl#getConfigVariableWithNickName()
		 * @generated
		 */
		EClass CONFIG_VARIABLE_WITH_NICK_NAME = eINSTANCE.getConfigVariableWithNickName();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG_VARIABLE_WITH_NICK_NAME__UID = eINSTANCE.getConfigVariableWithNickName_Uid();

		/**
		 * The meta object literal for the '<em><b>Key Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG_VARIABLE_WITH_NICK_NAME__KEY_ID = eINSTANCE.getConfigVariableWithNickName_KeyId();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG_VARIABLE_WITH_NICK_NAME__NAME = eINSTANCE.getConfigVariableWithNickName_Name();

		/**
		 * The meta object literal for the '<em><b>Var Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIG_VARIABLE_WITH_NICK_NAME__VAR_REF = eINSTANCE.getConfigVariableWithNickName_VarRef();

		/**
		 * The meta object literal for the '{@link artifact.impl.ConfigHashWithNickNameImpl <em>Config Hash With Nick Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see artifact.impl.ConfigHashWithNickNameImpl
		 * @see artifact.impl.ArtifactPackageImpl#getConfigHashWithNickName()
		 * @generated
		 */
		EClass CONFIG_HASH_WITH_NICK_NAME = eINSTANCE.getConfigHashWithNickName();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG_HASH_WITH_NICK_NAME__UID = eINSTANCE.getConfigHashWithNickName_Uid();

		/**
		 * The meta object literal for the '<em><b>Key Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG_HASH_WITH_NICK_NAME__KEY_ID = eINSTANCE.getConfigHashWithNickName_KeyId();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG_HASH_WITH_NICK_NAME__NAME = eINSTANCE.getConfigHashWithNickName_Name();

		/**
		 * The meta object literal for the '<em><b>Hash</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIG_HASH_WITH_NICK_NAME__HASH = eINSTANCE.getConfigHashWithNickName_Hash();

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
		 * The meta object literal for the '<em><b>Key Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATION_HINT__KEY_ID = eINSTANCE.getGenerationHint_KeyId();

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
		 * The meta object literal for the '<em><b>Key Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG_VARIABLE__KEY_ID = eINSTANCE.getConfigVariable_KeyId();

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
		 * The meta object literal for the '<em><b>Key Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG_HASH__KEY_ID = eINSTANCE.getConfigHash_KeyId();

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
		 * The meta object literal for the '<em><b>Key Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_QUERY__KEY_ID = eINSTANCE.getModelQuery_KeyId();

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
		 * The meta object literal for the '<em><b>Key Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_PARAMETER__KEY_ID = eINSTANCE.getQueryParameter_KeyId();

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
		 * The meta object literal for the '<em><b>Key Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TECHNOLOGY__KEY_ID = eINSTANCE.getTechnology_KeyId();

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
		 * The meta object literal for the '<em><b>Key Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTION__KEY_ID = eINSTANCE.getOption_KeyId();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPTION__VALUE = eINSTANCE.getOption_Value();

		/**
		 * The meta object literal for the '{@link artifact.impl.CategorizedImpl <em>Categorized</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see artifact.impl.CategorizedImpl
		 * @see artifact.impl.ArtifactPackageImpl#getCategorized()
		 * @generated
		 */
		EClass CATEGORIZED = eINSTANCE.getCategorized();

		/**
		 * The meta object literal for the '<em><b>Classifiers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORIZED__CLASSIFIERS = eINSTANCE.getCategorized_Classifiers();

		/**
		 * The meta object literal for the '{@link artifact.impl.ClassifierImpl <em>Classifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see artifact.impl.ClassifierImpl
		 * @see artifact.impl.ArtifactPackageImpl#getClassifier()
		 * @generated
		 */
		EClass CLASSIFIER = eINSTANCE.getClassifier();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSIFIER__UID = eINSTANCE.getClassifier_Uid();

		/**
		 * The meta object literal for the '<em><b>Key Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSIFIER__KEY_ID = eINSTANCE.getClassifier_KeyId();

		/**
		 * The meta object literal for the '<em><b>Hint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIER__HINT = eINSTANCE.getClassifier_Hint();

		/**
		 * The meta object literal for the '<em><b>Details</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSIFIER__DETAILS = eINSTANCE.getClassifier_Details();

	}

} //ArtifactPackage
