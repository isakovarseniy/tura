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
package mapper;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Version Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mapper.VersionRef#getVersionRef <em>Version Ref</em>}</li>
 * </ul>
 *
 * @see mapper.MapperPackage#getVersionRef()
 * @model
 * @generated
 */
public interface VersionRef extends EObject {
	/**
	 * Returns the value of the '<em><b>Version Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version Ref</em>' reference.
	 * @see #setVersionRef(Version)
	 * @see mapper.MapperPackage#getVersionRef_VersionRef()
	 * @model
	 * @generated
	 */
	Version getVersionRef();

	/**
	 * Sets the value of the '{@link mapper.VersionRef#getVersionRef <em>Version Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version Ref</em>' reference.
	 * @see #getVersionRef()
	 * @generated
	 */
	void setVersionRef(Version value);

} // VersionRef
