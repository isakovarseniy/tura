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

import artifact.Artifact;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artifact Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link recipe.ArtifactRef#getArtifactRef <em>Artifact Ref</em>}</li>
 * </ul>
 *
 * @see recipe.RecipePackage#getArtifactRef()
 * @model
 * @generated
 */
public interface ArtifactRef extends EObject {
	/**
	 * Returns the value of the '<em><b>Artifact Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artifact Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifact Ref</em>' reference.
	 * @see #setArtifactRef(Artifact)
	 * @see recipe.RecipePackage#getArtifactRef_ArtifactRef()
	 * @model
	 * @generated
	 */
	Artifact getArtifactRef();

	/**
	 * Sets the value of the '{@link recipe.ArtifactRef#getArtifactRef <em>Artifact Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Artifact Ref</em>' reference.
	 * @see #getArtifactRef()
	 * @generated
	 */
	void setArtifactRef(Artifact value);

} // ArtifactRef
