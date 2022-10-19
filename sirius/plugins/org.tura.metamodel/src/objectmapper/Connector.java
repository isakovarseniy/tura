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

import org.eclipse.emf.ecore.EObject;

import type.Attribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link objectmapper.Connector#getUid <em>Uid</em>}</li>
 *   <li>{@link objectmapper.Connector#getSrcRefAttr <em>Src Ref Attr</em>}</li>
 *   <li>{@link objectmapper.Connector#getSrcOwner <em>Src Owner</em>}</li>
 *   <li>{@link objectmapper.Connector#getTrgRefAttr <em>Trg Ref Attr</em>}</li>
 *   <li>{@link objectmapper.Connector#getTrgOwner <em>Trg Owner</em>}</li>
 * </ul>
 *
 * @see objectmapper.ObjectmapperPackage#getConnector()
 * @model
 * @generated
 */
public interface Connector extends EObject {
	/**
	 * Returns the value of the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uid</em>' attribute.
	 * @see #setUid(String)
	 * @see objectmapper.ObjectmapperPackage#getConnector_Uid()
	 * @model id="true"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link objectmapper.Connector#getUid <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' attribute.
	 * @see #getUid()
	 * @generated
	 */
	void setUid(String value);

	/**
	 * Returns the value of the '<em><b>Src Ref Attr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Src Ref Attr</em>' reference.
	 * @see #setSrcRefAttr(Attribute)
	 * @see objectmapper.ObjectmapperPackage#getConnector_SrcRefAttr()
	 * @model
	 * @generated
	 */
	Attribute getSrcRefAttr();

	/**
	 * Sets the value of the '{@link objectmapper.Connector#getSrcRefAttr <em>Src Ref Attr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Src Ref Attr</em>' reference.
	 * @see #getSrcRefAttr()
	 * @generated
	 */
	void setSrcRefAttr(Attribute value);

	/**
	 * Returns the value of the '<em><b>Src Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Src Owner</em>' reference.
	 * @see #setSrcOwner(EObject)
	 * @see objectmapper.ObjectmapperPackage#getConnector_SrcOwner()
	 * @model
	 * @generated
	 */
	EObject getSrcOwner();

	/**
	 * Sets the value of the '{@link objectmapper.Connector#getSrcOwner <em>Src Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Src Owner</em>' reference.
	 * @see #getSrcOwner()
	 * @generated
	 */
	void setSrcOwner(EObject value);

	/**
	 * Returns the value of the '<em><b>Trg Ref Attr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trg Ref Attr</em>' reference.
	 * @see #setTrgRefAttr(Attribute)
	 * @see objectmapper.ObjectmapperPackage#getConnector_TrgRefAttr()
	 * @model
	 * @generated
	 */
	Attribute getTrgRefAttr();

	/**
	 * Sets the value of the '{@link objectmapper.Connector#getTrgRefAttr <em>Trg Ref Attr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trg Ref Attr</em>' reference.
	 * @see #getTrgRefAttr()
	 * @generated
	 */
	void setTrgRefAttr(Attribute value);

	/**
	 * Returns the value of the '<em><b>Trg Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trg Owner</em>' reference.
	 * @see #setTrgOwner(EObject)
	 * @see objectmapper.ObjectmapperPackage#getConnector_TrgOwner()
	 * @model
	 * @generated
	 */
	EObject getTrgOwner();

	/**
	 * Sets the value of the '{@link objectmapper.Connector#getTrgOwner <em>Trg Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trg Owner</em>' reference.
	 * @see #getTrgOwner()
	 * @generated
	 */
	void setTrgOwner(EObject value);

} // Connector
