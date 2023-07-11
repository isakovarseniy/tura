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
package recipe;

import artifact.Option;
import artifact.Technology;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping Tecnologiy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link recipe.MappingTecnologiy#getUid <em>Uid</em>}</li>
 *   <li>{@link recipe.MappingTecnologiy#getTechRef <em>Tech Ref</em>}</li>
 *   <li>{@link recipe.MappingTecnologiy#getValueRef <em>Value Ref</em>}</li>
 * </ul>
 *
 * @see recipe.RecipePackage#getMappingTecnologiy()
 * @model
 * @generated
 */
public interface MappingTecnologiy extends EObject {
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
	 * @see recipe.RecipePackage#getMappingTecnologiy_Uid()
	 * @model id="true"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link recipe.MappingTecnologiy#getUid <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' attribute.
	 * @see #getUid()
	 * @generated
	 */
	void setUid(String value);

	/**
	 * Returns the value of the '<em><b>Tech Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tech Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tech Ref</em>' reference.
	 * @see #setTechRef(Technology)
	 * @see recipe.RecipePackage#getMappingTecnologiy_TechRef()
	 * @model
	 * @generated
	 */
	Technology getTechRef();

	/**
	 * Sets the value of the '{@link recipe.MappingTecnologiy#getTechRef <em>Tech Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tech Ref</em>' reference.
	 * @see #getTechRef()
	 * @generated
	 */
	void setTechRef(Technology value);

	/**
	 * Returns the value of the '<em><b>Value Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Ref</em>' reference.
	 * @see #setValueRef(Option)
	 * @see recipe.RecipePackage#getMappingTecnologiy_ValueRef()
	 * @model
	 * @generated
	 */
	Option getValueRef();

	/**
	 * Sets the value of the '{@link recipe.MappingTecnologiy#getValueRef <em>Value Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Ref</em>' reference.
	 * @see #getValueRef()
	 * @generated
	 */
	void setValueRef(Option value);

} // MappingTecnologiy
