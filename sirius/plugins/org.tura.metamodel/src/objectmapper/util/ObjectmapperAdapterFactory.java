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
package objectmapper.util;

import artifact.Categorized;
import objectmapper.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;
import type.Attribute;
import type.TypePointer;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see objectmapper.ObjectmapperPackage
 * @generated
 */
public class ObjectmapperAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ObjectmapperPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectmapperAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ObjectmapperPackage.eINSTANCE;
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
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
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
	protected ObjectmapperSwitch<Adapter> modelSwitch =
		new ObjectmapperSwitch<Adapter>() {
			@Override
			public Adapter caseProcessingStage(ProcessingStage object) {
				return createProcessingStageAdapter();
			}
			@Override
			public Adapter caseObjectMapperGroup(ObjectMapperGroup object) {
				return createObjectMapperGroupAdapter();
			}
			@Override
			public Adapter caseObjectMapper(ObjectMapper object) {
				return createObjectMapperAdapter();
			}
			@Override
			public Adapter caseVariable(Variable object) {
				return createVariableAdapter();
			}
			@Override
			public Adapter caseAggregation(Aggregation object) {
				return createAggregationAdapter();
			}
			@Override
			public Adapter caseOmRelation(OmRelation object) {
				return createOmRelationAdapter();
			}
			@Override
			public Adapter caseAttributeConnector(AttributeConnector object) {
				return createAttributeConnectorAdapter();
			}
			@Override
			public Adapter caseOperationConnector(OperationConnector object) {
				return createOperationConnectorAdapter();
			}
			@Override
			public Adapter caseCalculatedField(CalculatedField object) {
				return createCalculatedFieldAdapter();
			}
			@Override
			public Adapter caseTypePointer(TypePointer object) {
				return createTypePointerAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
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
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link objectmapper.ProcessingStage <em>Processing Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see objectmapper.ProcessingStage
	 * @generated
	 */
	public Adapter createProcessingStageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link objectmapper.ObjectMapperGroup <em>Object Mapper Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see objectmapper.ObjectMapperGroup
	 * @generated
	 */
	public Adapter createObjectMapperGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link objectmapper.ObjectMapper <em>Object Mapper</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see objectmapper.ObjectMapper
	 * @generated
	 */
	public Adapter createObjectMapperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link objectmapper.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see objectmapper.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link objectmapper.Aggregation <em>Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see objectmapper.Aggregation
	 * @generated
	 */
	public Adapter createAggregationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link objectmapper.OmRelation <em>Om Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see objectmapper.OmRelation
	 * @generated
	 */
	public Adapter createOmRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link objectmapper.AttributeConnector <em>Attribute Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see objectmapper.AttributeConnector
	 * @generated
	 */
	public Adapter createAttributeConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link objectmapper.OperationConnector <em>Operation Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see objectmapper.OperationConnector
	 * @generated
	 */
	public Adapter createOperationConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link objectmapper.CalculatedField <em>Calculated Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see objectmapper.CalculatedField
	 * @generated
	 */
	public Adapter createCalculatedFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link type.TypePointer <em>Pointer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see type.TypePointer
	 * @generated
	 */
	public Adapter createTypePointerAdapter() {
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
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ObjectmapperAdapterFactory
