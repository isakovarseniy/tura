/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see objectmapper.ObjectmapperPackage
 * @generated
 */
public interface ObjectmapperFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ObjectmapperFactory eINSTANCE = objectmapper.impl.ObjectmapperFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Processing Stage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Processing Stage</em>'.
	 * @generated
	 */
	ProcessingStage createProcessingStage();

	/**
	 * Returns a new object of class '<em>Object Mapper Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Mapper Group</em>'.
	 * @generated
	 */
	ObjectMapperGroup createObjectMapperGroup();

	/**
	 * Returns a new object of class '<em>Object Mapper</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Mapper</em>'.
	 * @generated
	 */
	ObjectMapper createObjectMapper();

	/**
	 * Returns a new object of class '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable</em>'.
	 * @generated
	 */
	Variable createVariable();

	/**
	 * Returns a new object of class '<em>Aggregation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aggregation</em>'.
	 * @generated
	 */
	Aggregation createAggregation();

	/**
	 * Returns a new object of class '<em>Om Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Om Relation</em>'.
	 * @generated
	 */
	OmRelation createOmRelation();

	/**
	 * Returns a new object of class '<em>Operation Connector Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation Connector Ref</em>'.
	 * @generated
	 */
	OperationConnectorRef createOperationConnectorRef();

	/**
	 * Returns a new object of class '<em>Attribute Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Connector</em>'.
	 * @generated
	 */
	AttributeConnector createAttributeConnector();

	/**
	 * Returns a new object of class '<em>Operation Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation Connector</em>'.
	 * @generated
	 */
	OperationConnector createOperationConnector();

	/**
	 * Returns a new object of class '<em>Calculated Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Calculated Field</em>'.
	 * @generated
	 */
	CalculatedField createCalculatedField();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ObjectmapperPackage getObjectmapperPackage();

} //ObjectmapperFactory
