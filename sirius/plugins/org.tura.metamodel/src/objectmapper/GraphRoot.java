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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graph Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link objectmapper.GraphRoot#getUid <em>Uid</em>}</li>
 *   <li>{@link objectmapper.GraphRoot#getRefMapper <em>Ref Mapper</em>}</li>
 * </ul>
 *
 * @see objectmapper.ObjectmapperPackage#getGraphRoot()
 * @model
 * @generated
 */
public interface GraphRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uid</em>' attribute.
	 * @see #setUid(String)
	 * @see objectmapper.ObjectmapperPackage#getGraphRoot_Uid()
	 * @model id="true"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link objectmapper.GraphRoot#getUid <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' attribute.
	 * @see #getUid()
	 * @generated
	 */
	void setUid(String value);

	/**
	 * Returns the value of the '<em><b>Ref Mapper</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Mapper</em>' reference.
	 * @see #setRefMapper(ObjectMapper)
	 * @see objectmapper.ObjectmapperPackage#getGraphRoot_RefMapper()
	 * @model
	 * @generated
	 */
	ObjectMapper getRefMapper();

	/**
	 * Sets the value of the '{@link objectmapper.GraphRoot#getRefMapper <em>Ref Mapper</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Mapper</em>' reference.
	 * @see #getRefMapper()
	 * @generated
	 */
	void setRefMapper(ObjectMapper value);

} // GraphRoot
