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
package artifact;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Config Variable With Nick Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link artifact.ConfigVariableWithNickName#getUid <em>Uid</em>}</li>
 *   <li>{@link artifact.ConfigVariableWithNickName#getKeyId <em>Key Id</em>}</li>
 *   <li>{@link artifact.ConfigVariableWithNickName#getName <em>Name</em>}</li>
 *   <li>{@link artifact.ConfigVariableWithNickName#getVarRef <em>Var Ref</em>}</li>
 * </ul>
 *
 * @see artifact.ArtifactPackage#getConfigVariableWithNickName()
 * @model
 * @generated
 */
public interface ConfigVariableWithNickName extends EObject {
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
	 * @see artifact.ArtifactPackage#getConfigVariableWithNickName_Uid()
	 * @model id="true"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link artifact.ConfigVariableWithNickName#getUid <em>Uid</em>}' attribute.
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
	 * @see artifact.ArtifactPackage#getConfigVariableWithNickName_KeyId()
	 * @model
	 * @generated
	 */
	String getKeyId();

	/**
	 * Sets the value of the '{@link artifact.ConfigVariableWithNickName#getKeyId <em>Key Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Id</em>' attribute.
	 * @see #getKeyId()
	 * @generated
	 */
	void setKeyId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see artifact.ArtifactPackage#getConfigVariableWithNickName_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link artifact.ConfigVariableWithNickName#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Var Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Ref</em>' reference.
	 * @see #setVarRef(ConfigVariable)
	 * @see artifact.ArtifactPackage#getConfigVariableWithNickName_VarRef()
	 * @model
	 * @generated
	 */
	ConfigVariable getVarRef();

	/**
	 * Sets the value of the '{@link artifact.ConfigVariableWithNickName#getVarRef <em>Var Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var Ref</em>' reference.
	 * @see #getVarRef()
	 * @generated
	 */
	void setVarRef(ConfigVariable value);

} // ConfigVariableWithNickName
