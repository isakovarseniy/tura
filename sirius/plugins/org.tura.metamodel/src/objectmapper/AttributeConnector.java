/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2022 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
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

import form.ContextParameters;
import org.eclipse.emf.ecore.EObject;

import type.Attribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link objectmapper.AttributeConnector#getUid <em>Uid</em>}</li>
 *   <li>{@link objectmapper.AttributeConnector#getSource <em>Source</em>}</li>
 *   <li>{@link objectmapper.AttributeConnector#getTarget <em>Target</em>}</li>
 *   <li>{@link objectmapper.AttributeConnector#isMergeAttr <em>Merge Attr</em>}</li>
 *   <li>{@link objectmapper.AttributeConnector#getDefaultSearch <em>Default Search</em>}</li>
 * </ul>
 *
 * @see objectmapper.ObjectmapperPackage#getAttributeConnector()
 * @model
 * @generated
 */
public interface AttributeConnector extends OperationConnectorRef {
	/**
	 * Returns the value of the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uid</em>' attribute.
	 * @see #setUid(String)
	 * @see objectmapper.ObjectmapperPackage#getAttributeConnector_Uid()
	 * @model id="true"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link objectmapper.AttributeConnector#getUid <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' attribute.
	 * @see #getUid()
	 * @generated
	 */
	void setUid(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(EObject)
	 * @see objectmapper.ObjectmapperPackage#getAttributeConnector_Source()
	 * @model
	 * @generated
	 */
	EObject getSource();

	/**
	 * Sets the value of the '{@link objectmapper.AttributeConnector#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(EObject value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(EObject)
	 * @see objectmapper.ObjectmapperPackage#getAttributeConnector_Target()
	 * @model
	 * @generated
	 */
	EObject getTarget();

	/**
	 * Sets the value of the '{@link objectmapper.AttributeConnector#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(EObject value);

	/**
	 * Returns the value of the '<em><b>Merge Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Merge Attr</em>' attribute.
	 * @see #setMergeAttr(boolean)
	 * @see objectmapper.ObjectmapperPackage#getAttributeConnector_MergeAttr()
	 * @model
	 * @generated
	 */
	boolean isMergeAttr();

	/**
	 * Sets the value of the '{@link objectmapper.AttributeConnector#isMergeAttr <em>Merge Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Merge Attr</em>' attribute.
	 * @see #isMergeAttr()
	 * @generated
	 */
	void setMergeAttr(boolean value);

	/**
	 * Returns the value of the '<em><b>Default Search</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Search</em>' containment reference.
	 * @see #setDefaultSearch(ContextParameters)
	 * @see objectmapper.ObjectmapperPackage#getAttributeConnector_DefaultSearch()
	 * @model containment="true"
	 * @generated
	 */
	ContextParameters getDefaultSearch();

	/**
	 * Sets the value of the '{@link objectmapper.AttributeConnector#getDefaultSearch <em>Default Search</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Search</em>' containment reference.
	 * @see #getDefaultSearch()
	 * @generated
	 */
	void setDefaultSearch(ContextParameters value);

} // AttributeConnector
