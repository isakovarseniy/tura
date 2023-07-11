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
package type;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link type.Link#getUid <em>Uid</em>}</li>
 *   <li>{@link type.Link#getKeyId <em>Key Id</em>}</li>
 *   <li>{@link type.Link#getMasterField <em>Master Field</em>}</li>
 *   <li>{@link type.Link#getDetailField <em>Detail Field</em>}</li>
 * </ul>
 *
 * @see type.TypePackage#getLink()
 * @model
 * @generated
 */
public interface Link extends EObject {
	/**
	 * Returns the value of the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uid</em>' attribute.
	 * @see #setUid(String)
	 * @see type.TypePackage#getLink_Uid()
	 * @model id="true"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link type.Link#getUid <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' attribute.
	 * @see #getUid()
	 * @generated
	 */
	void setUid(String value);

	/**
	 * Returns the value of the '<em><b>Key Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Id</em>' attribute.
	 * @see #setKeyId(String)
	 * @see type.TypePackage#getLink_KeyId()
	 * @model
	 * @generated
	 */
	String getKeyId();

	/**
	 * Sets the value of the '{@link type.Link#getKeyId <em>Key Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Id</em>' attribute.
	 * @see #getKeyId()
	 * @generated
	 */
	void setKeyId(String value);

	/**
	 * Returns the value of the '<em><b>Master Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Master Field</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Master Field</em>' reference.
	 * @see #setMasterField(Attribute)
	 * @see type.TypePackage#getLink_MasterField()
	 * @model
	 * @generated
	 */
	Attribute getMasterField();

	/**
	 * Sets the value of the '{@link type.Link#getMasterField <em>Master Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Master Field</em>' reference.
	 * @see #getMasterField()
	 * @generated
	 */
	void setMasterField(Attribute value);

	/**
	 * Returns the value of the '<em><b>Detail Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Detail Field</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Detail Field</em>' reference.
	 * @see #setDetailField(Attribute)
	 * @see type.TypePackage#getLink_DetailField()
	 * @model
	 * @generated
	 */
	Attribute getDetailField();

	/**
	 * Sets the value of the '{@link type.Link#getDetailField <em>Detail Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detail Field</em>' reference.
	 * @see #getDetailField()
	 * @generated
	 */
	void setDetailField(Attribute value);

} // Link
