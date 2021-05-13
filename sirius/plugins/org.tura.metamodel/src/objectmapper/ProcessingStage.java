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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Processing Stage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link objectmapper.ProcessingStage#getUid <em>Uid</em>}</li>
 *   <li>{@link objectmapper.ProcessingStage#getName <em>Name</em>}</li>
 *   <li>{@link objectmapper.ProcessingStage#getNextStage <em>Next Stage</em>}</li>
 * </ul>
 *
 * @see objectmapper.ObjectmapperPackage#getProcessingStage()
 * @model
 * @generated
 */
public interface ProcessingStage extends EObject {
	/**
	 * Returns the value of the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uid</em>' attribute.
	 * @see #setUid(String)
	 * @see objectmapper.ObjectmapperPackage#getProcessingStage_Uid()
	 * @model id="true"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link objectmapper.ProcessingStage#getUid <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' attribute.
	 * @see #getUid()
	 * @generated
	 */
	void setUid(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see objectmapper.ObjectmapperPackage#getProcessingStage_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link objectmapper.ProcessingStage#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Next Stage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Stage</em>' reference.
	 * @see #setNextStage(ProcessingStage)
	 * @see objectmapper.ObjectmapperPackage#getProcessingStage_NextStage()
	 * @model
	 * @generated
	 */
	ProcessingStage getNextStage();

	/**
	 * Sets the value of the '{@link objectmapper.ProcessingStage#getNextStage <em>Next Stage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Stage</em>' reference.
	 * @see #getNextStage()
	 * @generated
	 */
	void setNextStage(ProcessingStage value);

} // ProcessingStage
