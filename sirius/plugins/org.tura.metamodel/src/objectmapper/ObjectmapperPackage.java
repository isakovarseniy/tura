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
package objectmapper;

import artifact.ArtifactPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import type.TypePackage;

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
 * @see objectmapper.ObjectmapperFactory
 * @model kind="package"
 * @generated
 */
public interface ObjectmapperPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "objectmapper";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://tura.org/2016/v2/objectmapper";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tura.objectmapper";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ObjectmapperPackage eINSTANCE = objectmapper.impl.ObjectmapperPackageImpl.init();

	/**
	 * The meta object id for the '{@link objectmapper.impl.ProcessingStageImpl <em>Processing Stage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see objectmapper.impl.ProcessingStageImpl
	 * @see objectmapper.impl.ObjectmapperPackageImpl#getProcessingStage()
	 * @generated
	 */
	int PROCESSING_STAGE = 0;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_STAGE__UID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_STAGE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Next Stage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_STAGE__NEXT_STAGE = 2;

	/**
	 * The number of structural features of the '<em>Processing Stage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_STAGE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link objectmapper.impl.ObjectMapperGroupImpl <em>Object Mapper Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see objectmapper.impl.ObjectMapperGroupImpl
	 * @see objectmapper.impl.ObjectmapperPackageImpl#getObjectMapperGroup()
	 * @generated
	 */
	int OBJECT_MAPPER_GROUP = 1;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MAPPER_GROUP__UID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MAPPER_GROUP__NAME = 1;

	/**
	 * The feature id for the '<em><b>Object Mappers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MAPPER_GROUP__OBJECT_MAPPERS = 2;

	/**
	 * The feature id for the '<em><b>Stages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MAPPER_GROUP__STAGES = 3;

	/**
	 * The feature id for the '<em><b>Attributes Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MAPPER_GROUP__ATTRIBUTES_CONNECTOR = 4;

	/**
	 * The feature id for the '<em><b>Operations Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MAPPER_GROUP__OPERATIONS_CONNECTOR = 5;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MAPPER_GROUP__VARIABLES = 6;

	/**
	 * The number of structural features of the '<em>Object Mapper Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MAPPER_GROUP_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link objectmapper.impl.ObjectMapperImpl <em>Object Mapper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see objectmapper.impl.ObjectMapperImpl
	 * @see objectmapper.impl.ObjectmapperPackageImpl#getObjectMapper()
	 * @generated
	 */
	int OBJECT_MAPPER = 2;

	/**
	 * The feature id for the '<em><b>Classifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MAPPER__CLASSIFIERS = ArtifactPackage.CATEGORIZED__CLASSIFIERS;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MAPPER__UID = ArtifactPackage.CATEGORIZED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MAPPER__NAME = ArtifactPackage.CATEGORIZED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Stage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MAPPER__STAGE = ArtifactPackage.CATEGORIZED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Base Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MAPPER__BASE_TYPE = ArtifactPackage.CATEGORIZED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MAPPER__RELATIONS = ArtifactPackage.CATEGORIZED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Calculations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MAPPER__CALCULATIONS = ArtifactPackage.CATEGORIZED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Aggrigations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MAPPER__AGGRIGATIONS = ArtifactPackage.CATEGORIZED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MAPPER__ATTRIBUTES = ArtifactPackage.CATEGORIZED_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Object Mapper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MAPPER_FEATURE_COUNT = ArtifactPackage.CATEGORIZED_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link objectmapper.impl.OmRelationImpl <em>Om Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see objectmapper.impl.OmRelationImpl
	 * @see objectmapper.impl.ObjectmapperPackageImpl#getOmRelation()
	 * @generated
	 */
	int OM_RELATION = 5;

	/**
	 * The meta object id for the '{@link objectmapper.impl.AttributeConnectorImpl <em>Attribute Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see objectmapper.impl.AttributeConnectorImpl
	 * @see objectmapper.impl.ObjectmapperPackageImpl#getAttributeConnector()
	 * @generated
	 */
	int ATTRIBUTE_CONNECTOR = 7;

	/**
	 * The meta object id for the '{@link objectmapper.impl.OperationConnectorImpl <em>Operation Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see objectmapper.impl.OperationConnectorImpl
	 * @see objectmapper.impl.ObjectmapperPackageImpl#getOperationConnector()
	 * @generated
	 */
	int OPERATION_CONNECTOR = 8;

	/**
	 * The meta object id for the '{@link objectmapper.impl.CalculatedFieldImpl <em>Calculated Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see objectmapper.impl.CalculatedFieldImpl
	 * @see objectmapper.impl.ObjectmapperPackageImpl#getCalculatedField()
	 * @generated
	 */
	int CALCULATED_FIELD = 9;

	/**
	 * The feature id for the '<em><b>Type Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATED_FIELD__TYPE_REF = TypePackage.TYPE_POINTER__TYPE_REF;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATED_FIELD__UID = TypePackage.TYPE_POINTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATED_FIELD__NAME = TypePackage.TYPE_POINTER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Calculated Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATED_FIELD_FEATURE_COUNT = TypePackage.TYPE_POINTER_FEATURE_COUNT + 2;


	/**
	 * The meta object id for the '{@link objectmapper.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see objectmapper.impl.VariableImpl
	 * @see objectmapper.impl.ObjectmapperPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 3;

	/**
	 * The feature id for the '<em><b>Type Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__TYPE_REF = CALCULATED_FIELD__TYPE_REF;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__UID = CALCULATED_FIELD__UID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = CALCULATED_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__VALUE = CALCULATED_FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = CALCULATED_FIELD_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link objectmapper.impl.AggregationImpl <em>Aggregation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see objectmapper.impl.AggregationImpl
	 * @see objectmapper.impl.ObjectmapperPackageImpl#getAggregation()
	 * @generated
	 */
	int AGGREGATION = 4;

	/**
	 * The feature id for the '<em><b>Type Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION__TYPE_REF = CALCULATED_FIELD__TYPE_REF;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION__UID = CALCULATED_FIELD__UID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION__NAME = CALCULATED_FIELD__NAME;

	/**
	 * The number of structural features of the '<em>Aggregation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_FEATURE_COUNT = CALCULATED_FIELD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OM_RELATION__UID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OM_RELATION__NAME = 1;

	/**
	 * The feature id for the '<em><b>Object Mapper Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OM_RELATION__OBJECT_MAPPER_REF = 2;

	/**
	 * The feature id for the '<em><b>Type Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OM_RELATION__TYPE_REF = 3;

	/**
	 * The feature id for the '<em><b>Assosiation Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OM_RELATION__ASSOSIATION_REF = 4;

	/**
	 * The number of structural features of the '<em>Om Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OM_RELATION_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link objectmapper.impl.OperationConnectorRefImpl <em>Operation Connector Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see objectmapper.impl.OperationConnectorRefImpl
	 * @see objectmapper.impl.ObjectmapperPackageImpl#getOperationConnectorRef()
	 * @generated
	 */
	int OPERATION_CONNECTOR_REF = 6;

	/**
	 * The feature id for the '<em><b>Operation Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CONNECTOR_REF__OPERATION_REF = 0;

	/**
	 * The number of structural features of the '<em>Operation Connector Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CONNECTOR_REF_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Operation Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CONNECTOR__OPERATION_REF = OPERATION_CONNECTOR_REF__OPERATION_REF;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CONNECTOR__UID = OPERATION_CONNECTOR_REF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CONNECTOR__SOURCE = OPERATION_CONNECTOR_REF_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CONNECTOR__TARGET = OPERATION_CONNECTOR_REF_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Merge Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CONNECTOR__MERGE_ATTR = OPERATION_CONNECTOR_REF_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Default Search</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CONNECTOR__DEFAULT_SEARCH = OPERATION_CONNECTOR_REF_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Attribute Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CONNECTOR_FEATURE_COUNT = OPERATION_CONNECTOR_REF_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Operation Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CONNECTOR__OPERATION_REF = OPERATION_CONNECTOR_REF__OPERATION_REF;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CONNECTOR__UID = OPERATION_CONNECTOR_REF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CONNECTOR__NAME = OPERATION_CONNECTOR_REF_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CONNECTOR__SOURCE = OPERATION_CONNECTOR_REF_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CONNECTOR__TARGET = OPERATION_CONNECTOR_REF_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Operation Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CONNECTOR__OPERATION_TYPE = OPERATION_CONNECTOR_REF_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Default Search</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CONNECTOR__DEFAULT_SEARCH = OPERATION_CONNECTOR_REF_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Operation Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CONNECTOR_FEATURE_COUNT = OPERATION_CONNECTOR_REF_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link objectmapper.OperationType <em>Operation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see objectmapper.OperationType
	 * @see objectmapper.impl.ObjectmapperPackageImpl#getOperationType()
	 * @generated
	 */
	int OPERATION_TYPE = 10;


	/**
	 * Returns the meta object for class '{@link objectmapper.ProcessingStage <em>Processing Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processing Stage</em>'.
	 * @see objectmapper.ProcessingStage
	 * @generated
	 */
	EClass getProcessingStage();

	/**
	 * Returns the meta object for the attribute '{@link objectmapper.ProcessingStage#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see objectmapper.ProcessingStage#getUid()
	 * @see #getProcessingStage()
	 * @generated
	 */
	EAttribute getProcessingStage_Uid();

	/**
	 * Returns the meta object for the attribute '{@link objectmapper.ProcessingStage#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see objectmapper.ProcessingStage#getName()
	 * @see #getProcessingStage()
	 * @generated
	 */
	EAttribute getProcessingStage_Name();

	/**
	 * Returns the meta object for the reference '{@link objectmapper.ProcessingStage#getNextStage <em>Next Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next Stage</em>'.
	 * @see objectmapper.ProcessingStage#getNextStage()
	 * @see #getProcessingStage()
	 * @generated
	 */
	EReference getProcessingStage_NextStage();

	/**
	 * Returns the meta object for class '{@link objectmapper.ObjectMapperGroup <em>Object Mapper Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Mapper Group</em>'.
	 * @see objectmapper.ObjectMapperGroup
	 * @generated
	 */
	EClass getObjectMapperGroup();

	/**
	 * Returns the meta object for the attribute '{@link objectmapper.ObjectMapperGroup#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see objectmapper.ObjectMapperGroup#getUid()
	 * @see #getObjectMapperGroup()
	 * @generated
	 */
	EAttribute getObjectMapperGroup_Uid();

	/**
	 * Returns the meta object for the attribute '{@link objectmapper.ObjectMapperGroup#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see objectmapper.ObjectMapperGroup#getName()
	 * @see #getObjectMapperGroup()
	 * @generated
	 */
	EAttribute getObjectMapperGroup_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link objectmapper.ObjectMapperGroup#getObjectMappers <em>Object Mappers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Object Mappers</em>'.
	 * @see objectmapper.ObjectMapperGroup#getObjectMappers()
	 * @see #getObjectMapperGroup()
	 * @generated
	 */
	EReference getObjectMapperGroup_ObjectMappers();

	/**
	 * Returns the meta object for the containment reference list '{@link objectmapper.ObjectMapperGroup#getStages <em>Stages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stages</em>'.
	 * @see objectmapper.ObjectMapperGroup#getStages()
	 * @see #getObjectMapperGroup()
	 * @generated
	 */
	EReference getObjectMapperGroup_Stages();

	/**
	 * Returns the meta object for the containment reference list '{@link objectmapper.ObjectMapperGroup#getAttributesConnector <em>Attributes Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes Connector</em>'.
	 * @see objectmapper.ObjectMapperGroup#getAttributesConnector()
	 * @see #getObjectMapperGroup()
	 * @generated
	 */
	EReference getObjectMapperGroup_AttributesConnector();

	/**
	 * Returns the meta object for the containment reference list '{@link objectmapper.ObjectMapperGroup#getOperationsConnector <em>Operations Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations Connector</em>'.
	 * @see objectmapper.ObjectMapperGroup#getOperationsConnector()
	 * @see #getObjectMapperGroup()
	 * @generated
	 */
	EReference getObjectMapperGroup_OperationsConnector();

	/**
	 * Returns the meta object for the containment reference list '{@link objectmapper.ObjectMapperGroup#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see objectmapper.ObjectMapperGroup#getVariables()
	 * @see #getObjectMapperGroup()
	 * @generated
	 */
	EReference getObjectMapperGroup_Variables();

	/**
	 * Returns the meta object for class '{@link objectmapper.ObjectMapper <em>Object Mapper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Mapper</em>'.
	 * @see objectmapper.ObjectMapper
	 * @generated
	 */
	EClass getObjectMapper();

	/**
	 * Returns the meta object for the attribute '{@link objectmapper.ObjectMapper#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see objectmapper.ObjectMapper#getUid()
	 * @see #getObjectMapper()
	 * @generated
	 */
	EAttribute getObjectMapper_Uid();

	/**
	 * Returns the meta object for the attribute '{@link objectmapper.ObjectMapper#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see objectmapper.ObjectMapper#getName()
	 * @see #getObjectMapper()
	 * @generated
	 */
	EAttribute getObjectMapper_Name();

	/**
	 * Returns the meta object for the reference '{@link objectmapper.ObjectMapper#getStage <em>Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Stage</em>'.
	 * @see objectmapper.ObjectMapper#getStage()
	 * @see #getObjectMapper()
	 * @generated
	 */
	EReference getObjectMapper_Stage();

	/**
	 * Returns the meta object for the containment reference '{@link objectmapper.ObjectMapper#getBaseType <em>Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Base Type</em>'.
	 * @see objectmapper.ObjectMapper#getBaseType()
	 * @see #getObjectMapper()
	 * @generated
	 */
	EReference getObjectMapper_BaseType();

	/**
	 * Returns the meta object for the containment reference list '{@link objectmapper.ObjectMapper#getRelations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relations</em>'.
	 * @see objectmapper.ObjectMapper#getRelations()
	 * @see #getObjectMapper()
	 * @generated
	 */
	EReference getObjectMapper_Relations();

	/**
	 * Returns the meta object for the containment reference list '{@link objectmapper.ObjectMapper#getCalculations <em>Calculations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Calculations</em>'.
	 * @see objectmapper.ObjectMapper#getCalculations()
	 * @see #getObjectMapper()
	 * @generated
	 */
	EReference getObjectMapper_Calculations();

	/**
	 * Returns the meta object for the containment reference list '{@link objectmapper.ObjectMapper#getAggrigations <em>Aggrigations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Aggrigations</em>'.
	 * @see objectmapper.ObjectMapper#getAggrigations()
	 * @see #getObjectMapper()
	 * @generated
	 */
	EReference getObjectMapper_Aggrigations();

	/**
	 * Returns the meta object for the containment reference list '{@link objectmapper.ObjectMapper#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see objectmapper.ObjectMapper#getAttributes()
	 * @see #getObjectMapper()
	 * @generated
	 */
	EReference getObjectMapper_Attributes();

	/**
	 * Returns the meta object for class '{@link objectmapper.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see objectmapper.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link objectmapper.Variable#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see objectmapper.Variable#getValue()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Value();

	/**
	 * Returns the meta object for class '{@link objectmapper.Aggregation <em>Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregation</em>'.
	 * @see objectmapper.Aggregation
	 * @generated
	 */
	EClass getAggregation();

	/**
	 * Returns the meta object for class '{@link objectmapper.OmRelation <em>Om Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Om Relation</em>'.
	 * @see objectmapper.OmRelation
	 * @generated
	 */
	EClass getOmRelation();

	/**
	 * Returns the meta object for the attribute '{@link objectmapper.OmRelation#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see objectmapper.OmRelation#getUid()
	 * @see #getOmRelation()
	 * @generated
	 */
	EAttribute getOmRelation_Uid();

	/**
	 * Returns the meta object for the attribute '{@link objectmapper.OmRelation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see objectmapper.OmRelation#getName()
	 * @see #getOmRelation()
	 * @generated
	 */
	EAttribute getOmRelation_Name();

	/**
	 * Returns the meta object for the reference '{@link objectmapper.OmRelation#getObjectMapperRef <em>Object Mapper Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Object Mapper Ref</em>'.
	 * @see objectmapper.OmRelation#getObjectMapperRef()
	 * @see #getOmRelation()
	 * @generated
	 */
	EReference getOmRelation_ObjectMapperRef();

	/**
	 * Returns the meta object for the reference '{@link objectmapper.OmRelation#getTypeRef <em>Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type Ref</em>'.
	 * @see objectmapper.OmRelation#getTypeRef()
	 * @see #getOmRelation()
	 * @generated
	 */
	EReference getOmRelation_TypeRef();

	/**
	 * Returns the meta object for the reference '{@link objectmapper.OmRelation#getAssosiationRef <em>Assosiation Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assosiation Ref</em>'.
	 * @see objectmapper.OmRelation#getAssosiationRef()
	 * @see #getOmRelation()
	 * @generated
	 */
	EReference getOmRelation_AssosiationRef();

	/**
	 * Returns the meta object for class '{@link objectmapper.OperationConnectorRef <em>Operation Connector Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Connector Ref</em>'.
	 * @see objectmapper.OperationConnectorRef
	 * @generated
	 */
	EClass getOperationConnectorRef();

	/**
	 * Returns the meta object for the reference '{@link objectmapper.OperationConnectorRef#getOperationRef <em>Operation Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operation Ref</em>'.
	 * @see objectmapper.OperationConnectorRef#getOperationRef()
	 * @see #getOperationConnectorRef()
	 * @generated
	 */
	EReference getOperationConnectorRef_OperationRef();

	/**
	 * Returns the meta object for class '{@link objectmapper.AttributeConnector <em>Attribute Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Connector</em>'.
	 * @see objectmapper.AttributeConnector
	 * @generated
	 */
	EClass getAttributeConnector();

	/**
	 * Returns the meta object for the attribute '{@link objectmapper.AttributeConnector#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see objectmapper.AttributeConnector#getUid()
	 * @see #getAttributeConnector()
	 * @generated
	 */
	EAttribute getAttributeConnector_Uid();

	/**
	 * Returns the meta object for the reference '{@link objectmapper.AttributeConnector#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see objectmapper.AttributeConnector#getSource()
	 * @see #getAttributeConnector()
	 * @generated
	 */
	EReference getAttributeConnector_Source();

	/**
	 * Returns the meta object for the reference '{@link objectmapper.AttributeConnector#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see objectmapper.AttributeConnector#getTarget()
	 * @see #getAttributeConnector()
	 * @generated
	 */
	EReference getAttributeConnector_Target();

	/**
	 * Returns the meta object for the attribute '{@link objectmapper.AttributeConnector#isMergeAttr <em>Merge Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Merge Attr</em>'.
	 * @see objectmapper.AttributeConnector#isMergeAttr()
	 * @see #getAttributeConnector()
	 * @generated
	 */
	EAttribute getAttributeConnector_MergeAttr();

	/**
	 * Returns the meta object for the containment reference '{@link objectmapper.AttributeConnector#getDefaultSearch <em>Default Search</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Search</em>'.
	 * @see objectmapper.AttributeConnector#getDefaultSearch()
	 * @see #getAttributeConnector()
	 * @generated
	 */
	EReference getAttributeConnector_DefaultSearch();

	/**
	 * Returns the meta object for class '{@link objectmapper.OperationConnector <em>Operation Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Connector</em>'.
	 * @see objectmapper.OperationConnector
	 * @generated
	 */
	EClass getOperationConnector();

	/**
	 * Returns the meta object for the attribute '{@link objectmapper.OperationConnector#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see objectmapper.OperationConnector#getUid()
	 * @see #getOperationConnector()
	 * @generated
	 */
	EAttribute getOperationConnector_Uid();

	/**
	 * Returns the meta object for the attribute '{@link objectmapper.OperationConnector#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see objectmapper.OperationConnector#getName()
	 * @see #getOperationConnector()
	 * @generated
	 */
	EAttribute getOperationConnector_Name();

	/**
	 * Returns the meta object for the reference '{@link objectmapper.OperationConnector#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see objectmapper.OperationConnector#getSource()
	 * @see #getOperationConnector()
	 * @generated
	 */
	EReference getOperationConnector_Source();

	/**
	 * Returns the meta object for the reference '{@link objectmapper.OperationConnector#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see objectmapper.OperationConnector#getTarget()
	 * @see #getOperationConnector()
	 * @generated
	 */
	EReference getOperationConnector_Target();

	/**
	 * Returns the meta object for the attribute '{@link objectmapper.OperationConnector#getOperationType <em>Operation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation Type</em>'.
	 * @see objectmapper.OperationConnector#getOperationType()
	 * @see #getOperationConnector()
	 * @generated
	 */
	EAttribute getOperationConnector_OperationType();

	/**
	 * Returns the meta object for the containment reference '{@link objectmapper.OperationConnector#getDefaultSearch <em>Default Search</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Search</em>'.
	 * @see objectmapper.OperationConnector#getDefaultSearch()
	 * @see #getOperationConnector()
	 * @generated
	 */
	EReference getOperationConnector_DefaultSearch();

	/**
	 * Returns the meta object for class '{@link objectmapper.CalculatedField <em>Calculated Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calculated Field</em>'.
	 * @see objectmapper.CalculatedField
	 * @generated
	 */
	EClass getCalculatedField();

	/**
	 * Returns the meta object for the attribute '{@link objectmapper.CalculatedField#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see objectmapper.CalculatedField#getUid()
	 * @see #getCalculatedField()
	 * @generated
	 */
	EAttribute getCalculatedField_Uid();

	/**
	 * Returns the meta object for the attribute '{@link objectmapper.CalculatedField#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see objectmapper.CalculatedField#getName()
	 * @see #getCalculatedField()
	 * @generated
	 */
	EAttribute getCalculatedField_Name();

	/**
	 * Returns the meta object for enum '{@link objectmapper.OperationType <em>Operation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operation Type</em>'.
	 * @see objectmapper.OperationType
	 * @generated
	 */
	EEnum getOperationType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ObjectmapperFactory getObjectmapperFactory();

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
		 * The meta object literal for the '{@link objectmapper.impl.ProcessingStageImpl <em>Processing Stage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see objectmapper.impl.ProcessingStageImpl
		 * @see objectmapper.impl.ObjectmapperPackageImpl#getProcessingStage()
		 * @generated
		 */
		EClass PROCESSING_STAGE = eINSTANCE.getProcessingStage();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSING_STAGE__UID = eINSTANCE.getProcessingStage_Uid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSING_STAGE__NAME = eINSTANCE.getProcessingStage_Name();

		/**
		 * The meta object literal for the '<em><b>Next Stage</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSING_STAGE__NEXT_STAGE = eINSTANCE.getProcessingStage_NextStage();

		/**
		 * The meta object literal for the '{@link objectmapper.impl.ObjectMapperGroupImpl <em>Object Mapper Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see objectmapper.impl.ObjectMapperGroupImpl
		 * @see objectmapper.impl.ObjectmapperPackageImpl#getObjectMapperGroup()
		 * @generated
		 */
		EClass OBJECT_MAPPER_GROUP = eINSTANCE.getObjectMapperGroup();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_MAPPER_GROUP__UID = eINSTANCE.getObjectMapperGroup_Uid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_MAPPER_GROUP__NAME = eINSTANCE.getObjectMapperGroup_Name();

		/**
		 * The meta object literal for the '<em><b>Object Mappers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_MAPPER_GROUP__OBJECT_MAPPERS = eINSTANCE.getObjectMapperGroup_ObjectMappers();

		/**
		 * The meta object literal for the '<em><b>Stages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_MAPPER_GROUP__STAGES = eINSTANCE.getObjectMapperGroup_Stages();

		/**
		 * The meta object literal for the '<em><b>Attributes Connector</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_MAPPER_GROUP__ATTRIBUTES_CONNECTOR = eINSTANCE.getObjectMapperGroup_AttributesConnector();

		/**
		 * The meta object literal for the '<em><b>Operations Connector</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_MAPPER_GROUP__OPERATIONS_CONNECTOR = eINSTANCE.getObjectMapperGroup_OperationsConnector();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_MAPPER_GROUP__VARIABLES = eINSTANCE.getObjectMapperGroup_Variables();

		/**
		 * The meta object literal for the '{@link objectmapper.impl.ObjectMapperImpl <em>Object Mapper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see objectmapper.impl.ObjectMapperImpl
		 * @see objectmapper.impl.ObjectmapperPackageImpl#getObjectMapper()
		 * @generated
		 */
		EClass OBJECT_MAPPER = eINSTANCE.getObjectMapper();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_MAPPER__UID = eINSTANCE.getObjectMapper_Uid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_MAPPER__NAME = eINSTANCE.getObjectMapper_Name();

		/**
		 * The meta object literal for the '<em><b>Stage</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_MAPPER__STAGE = eINSTANCE.getObjectMapper_Stage();

		/**
		 * The meta object literal for the '<em><b>Base Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_MAPPER__BASE_TYPE = eINSTANCE.getObjectMapper_BaseType();

		/**
		 * The meta object literal for the '<em><b>Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_MAPPER__RELATIONS = eINSTANCE.getObjectMapper_Relations();

		/**
		 * The meta object literal for the '<em><b>Calculations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_MAPPER__CALCULATIONS = eINSTANCE.getObjectMapper_Calculations();

		/**
		 * The meta object literal for the '<em><b>Aggrigations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_MAPPER__AGGRIGATIONS = eINSTANCE.getObjectMapper_Aggrigations();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_MAPPER__ATTRIBUTES = eINSTANCE.getObjectMapper_Attributes();

		/**
		 * The meta object literal for the '{@link objectmapper.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see objectmapper.impl.VariableImpl
		 * @see objectmapper.impl.ObjectmapperPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__VALUE = eINSTANCE.getVariable_Value();

		/**
		 * The meta object literal for the '{@link objectmapper.impl.AggregationImpl <em>Aggregation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see objectmapper.impl.AggregationImpl
		 * @see objectmapper.impl.ObjectmapperPackageImpl#getAggregation()
		 * @generated
		 */
		EClass AGGREGATION = eINSTANCE.getAggregation();

		/**
		 * The meta object literal for the '{@link objectmapper.impl.OmRelationImpl <em>Om Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see objectmapper.impl.OmRelationImpl
		 * @see objectmapper.impl.ObjectmapperPackageImpl#getOmRelation()
		 * @generated
		 */
		EClass OM_RELATION = eINSTANCE.getOmRelation();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OM_RELATION__UID = eINSTANCE.getOmRelation_Uid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OM_RELATION__NAME = eINSTANCE.getOmRelation_Name();

		/**
		 * The meta object literal for the '<em><b>Object Mapper Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OM_RELATION__OBJECT_MAPPER_REF = eINSTANCE.getOmRelation_ObjectMapperRef();

		/**
		 * The meta object literal for the '<em><b>Type Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OM_RELATION__TYPE_REF = eINSTANCE.getOmRelation_TypeRef();

		/**
		 * The meta object literal for the '<em><b>Assosiation Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OM_RELATION__ASSOSIATION_REF = eINSTANCE.getOmRelation_AssosiationRef();

		/**
		 * The meta object literal for the '{@link objectmapper.impl.OperationConnectorRefImpl <em>Operation Connector Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see objectmapper.impl.OperationConnectorRefImpl
		 * @see objectmapper.impl.ObjectmapperPackageImpl#getOperationConnectorRef()
		 * @generated
		 */
		EClass OPERATION_CONNECTOR_REF = eINSTANCE.getOperationConnectorRef();

		/**
		 * The meta object literal for the '<em><b>Operation Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_CONNECTOR_REF__OPERATION_REF = eINSTANCE.getOperationConnectorRef_OperationRef();

		/**
		 * The meta object literal for the '{@link objectmapper.impl.AttributeConnectorImpl <em>Attribute Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see objectmapper.impl.AttributeConnectorImpl
		 * @see objectmapper.impl.ObjectmapperPackageImpl#getAttributeConnector()
		 * @generated
		 */
		EClass ATTRIBUTE_CONNECTOR = eINSTANCE.getAttributeConnector();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_CONNECTOR__UID = eINSTANCE.getAttributeConnector_Uid();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_CONNECTOR__SOURCE = eINSTANCE.getAttributeConnector_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_CONNECTOR__TARGET = eINSTANCE.getAttributeConnector_Target();

		/**
		 * The meta object literal for the '<em><b>Merge Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_CONNECTOR__MERGE_ATTR = eINSTANCE.getAttributeConnector_MergeAttr();

		/**
		 * The meta object literal for the '<em><b>Default Search</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_CONNECTOR__DEFAULT_SEARCH = eINSTANCE.getAttributeConnector_DefaultSearch();

		/**
		 * The meta object literal for the '{@link objectmapper.impl.OperationConnectorImpl <em>Operation Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see objectmapper.impl.OperationConnectorImpl
		 * @see objectmapper.impl.ObjectmapperPackageImpl#getOperationConnector()
		 * @generated
		 */
		EClass OPERATION_CONNECTOR = eINSTANCE.getOperationConnector();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION_CONNECTOR__UID = eINSTANCE.getOperationConnector_Uid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION_CONNECTOR__NAME = eINSTANCE.getOperationConnector_Name();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_CONNECTOR__SOURCE = eINSTANCE.getOperationConnector_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_CONNECTOR__TARGET = eINSTANCE.getOperationConnector_Target();

		/**
		 * The meta object literal for the '<em><b>Operation Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION_CONNECTOR__OPERATION_TYPE = eINSTANCE.getOperationConnector_OperationType();

		/**
		 * The meta object literal for the '<em><b>Default Search</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_CONNECTOR__DEFAULT_SEARCH = eINSTANCE.getOperationConnector_DefaultSearch();

		/**
		 * The meta object literal for the '{@link objectmapper.impl.CalculatedFieldImpl <em>Calculated Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see objectmapper.impl.CalculatedFieldImpl
		 * @see objectmapper.impl.ObjectmapperPackageImpl#getCalculatedField()
		 * @generated
		 */
		EClass CALCULATED_FIELD = eINSTANCE.getCalculatedField();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALCULATED_FIELD__UID = eINSTANCE.getCalculatedField_Uid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALCULATED_FIELD__NAME = eINSTANCE.getCalculatedField_Name();

		/**
		 * The meta object literal for the '{@link objectmapper.OperationType <em>Operation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see objectmapper.OperationType
		 * @see objectmapper.impl.ObjectmapperPackageImpl#getOperationType()
		 * @generated
		 */
		EEnum OPERATION_TYPE = eINSTANCE.getOperationType();

	}

} //ObjectmapperPackage
