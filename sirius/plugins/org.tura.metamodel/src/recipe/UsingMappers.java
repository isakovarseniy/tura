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

import mapper.Mappers;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Using Mappers</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link recipe.UsingMappers#getMappers <em>Mappers</em>}</li>
 * </ul>
 *
 * @see recipe.RecipePackage#getUsingMappers()
 * @model
 * @generated
 */
public interface UsingMappers extends EObject {
	/**
	 * Returns the value of the '<em><b>Mappers</b></em>' reference list.
	 * The list contents are of type {@link mapper.Mappers}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mappers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mappers</em>' reference list.
	 * @see recipe.RecipePackage#getUsingMappers_Mappers()
	 * @model
	 * @generated
	 */
	EList<Mappers> getMappers();

} // UsingMappers
