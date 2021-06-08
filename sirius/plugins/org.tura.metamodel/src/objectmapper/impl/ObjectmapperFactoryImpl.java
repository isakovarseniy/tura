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
package objectmapper.impl;

import objectmapper.*;

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
public class ObjectmapperFactoryImpl extends EFactoryImpl implements ObjectmapperFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ObjectmapperFactory init() {
		try {
			ObjectmapperFactory theObjectmapperFactory = (ObjectmapperFactory)EPackage.Registry.INSTANCE.getEFactory(ObjectmapperPackage.eNS_URI);
			if (theObjectmapperFactory != null) {
				return theObjectmapperFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ObjectmapperFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectmapperFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ObjectmapperPackage.PROCESSING_STAGE: return createProcessingStage();
			case ObjectmapperPackage.OBJECT_MAPPER_GROUP: return createObjectMapperGroup();
			case ObjectmapperPackage.OBJECT_MAPPER: return createObjectMapper();
			case ObjectmapperPackage.VARIABLE: return createVariable();
			case ObjectmapperPackage.AGGREGATION: return createAggregation();
			case ObjectmapperPackage.OM_RELATION: return createOmRelation();
			case ObjectmapperPackage.OPERATION_CONNECTOR_REF: return createOperationConnectorRef();
			case ObjectmapperPackage.ATTRIBUTE_CONNECTOR: return createAttributeConnector();
			case ObjectmapperPackage.OPERATION_CONNECTOR: return createOperationConnector();
			case ObjectmapperPackage.CALCULATED_FIELD: return createCalculatedField();
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
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ObjectmapperPackage.OPERATION_TYPE:
				return createOperationTypeFromString(eDataType, initialValue);
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
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ObjectmapperPackage.OPERATION_TYPE:
				return convertOperationTypeToString(eDataType, instanceValue);
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
	public ProcessingStage createProcessingStage() {
		ProcessingStageImpl processingStage = new ProcessingStageImpl();
		return processingStage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ObjectMapperGroup createObjectMapperGroup() {
		ObjectMapperGroupImpl objectMapperGroup = new ObjectMapperGroupImpl();
		return objectMapperGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ObjectMapper createObjectMapper() {
		ObjectMapperImpl objectMapper = new ObjectMapperImpl();
		return objectMapper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Aggregation createAggregation() {
		AggregationImpl aggregation = new AggregationImpl();
		return aggregation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OmRelation createOmRelation() {
		OmRelationImpl omRelation = new OmRelationImpl();
		return omRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationConnectorRef createOperationConnectorRef() {
		OperationConnectorRefImpl operationConnectorRef = new OperationConnectorRefImpl();
		return operationConnectorRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AttributeConnector createAttributeConnector() {
		AttributeConnectorImpl attributeConnector = new AttributeConnectorImpl();
		return attributeConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationConnector createOperationConnector() {
		OperationConnectorImpl operationConnector = new OperationConnectorImpl();
		return operationConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CalculatedField createCalculatedField() {
		CalculatedFieldImpl calculatedField = new CalculatedFieldImpl();
		return calculatedField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationType createOperationTypeFromString(EDataType eDataType, String initialValue) {
		OperationType result = OperationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ObjectmapperPackage getObjectmapperPackage() {
		return (ObjectmapperPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ObjectmapperPackage getPackage() {
		return ObjectmapperPackage.eINSTANCE;
	}

} //ObjectmapperFactoryImpl
