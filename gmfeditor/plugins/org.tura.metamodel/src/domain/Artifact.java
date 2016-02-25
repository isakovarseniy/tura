/*******************************************************************************
 * Tura - application generation platform
 *
 * Copyright (c) 2012, 2015, Arseniy Isakov
 *  
 * This project includes software developed by Arseniy Isakov
 * http://sourceforge.net/p/tura/wiki/Home/
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
/**
 */
package domain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artifact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.Artifact#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.Artifact#getName <em>Name</em>}</li>
 *   <li>{@link domain.Artifact#getDescription <em>Description</em>}</li>
 *   <li>{@link domain.Artifact#getParent <em>Parent</em>}</li>
 *   <li>{@link domain.Artifact#getConfigVariables <em>Config Variables</em>}</li>
 *   <li>{@link domain.Artifact#getConfigHashes <em>Config Hashes</em>}</li>
 *   <li>{@link domain.Artifact#getModelQuery <em>Model Query</em>}</li>
 *   <li>{@link domain.Artifact#getSpecifiers <em>Specifiers</em>}</li>
 *   <li>{@link domain.Artifact#getHints <em>Hints</em>}</li>
 *   <li>{@link domain.Artifact#getTemplate <em>Template</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getArtifact()
 * @model annotation="gmf.node label='name' border.color='0,0,0' color='255,239,222'"
 * @generated
 */
public interface Artifact extends EObject {
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
	 * @see domain.DomainPackage#getArtifact_Uid()
	 * @model id="true"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link domain.Artifact#getUid <em>Uid</em>}' attribute.
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
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see domain.DomainPackage#getArtifact_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link domain.Artifact#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see domain.DomainPackage#getArtifact_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link domain.Artifact#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link domain.Artifacts#getArtifacts <em>Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(Artifacts)
	 * @see domain.DomainPackage#getArtifact_Parent()
	 * @see domain.Artifacts#getArtifacts
	 * @model opposite="artifacts" transient="false"
	 * @generated
	 */
	Artifacts getParent();

	/**
	 * Sets the value of the '{@link domain.Artifact#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Artifacts value);

	/**
	 * Returns the value of the '<em><b>Config Variables</b></em>' containment reference list.
	 * The list contents are of type {@link domain.ConfigVariable}.
	 * It is bidirectional and its opposite is '{@link domain.ConfigVariable#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Config Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config Variables</em>' containment reference list.
	 * @see domain.DomainPackage#getArtifact_ConfigVariables()
	 * @see domain.ConfigVariable#getParent
	 * @model opposite="parent" containment="true"
	 *        annotation="gmf.compartment layout='list'"
	 * @generated
	 */
	EList<ConfigVariable> getConfigVariables();

	/**
	 * Returns the value of the '<em><b>Config Hashes</b></em>' containment reference list.
	 * The list contents are of type {@link domain.ConfigHash}.
	 * It is bidirectional and its opposite is '{@link domain.ConfigHash#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Config Hashes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config Hashes</em>' containment reference list.
	 * @see domain.DomainPackage#getArtifact_ConfigHashes()
	 * @see domain.ConfigHash#getParent
	 * @model opposite="parent" containment="true"
	 *        annotation="gmf.compartment layout='list'"
	 * @generated
	 */
	EList<ConfigHash> getConfigHashes();

	/**
	 * Returns the value of the '<em><b>Model Query</b></em>' containment reference list.
	 * The list contents are of type {@link domain.ModelQuery}.
	 * It is bidirectional and its opposite is '{@link domain.ModelQuery#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Query</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Query</em>' containment reference list.
	 * @see domain.DomainPackage#getArtifact_ModelQuery()
	 * @see domain.ModelQuery#getParent
	 * @model opposite="parent" containment="true"
	 *        annotation="gmf.compartment layout='list'"
	 * @generated
	 */
	EList<ModelQuery> getModelQuery();

	/**
	 * Returns the value of the '<em><b>Specifiers</b></em>' containment reference list.
	 * The list contents are of type {@link domain.Specifier}.
	 * It is bidirectional and its opposite is '{@link domain.Specifier#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specifiers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specifiers</em>' containment reference list.
	 * @see domain.DomainPackage#getArtifact_Specifiers()
	 * @see domain.Specifier#getParent
	 * @model opposite="parent" containment="true"
	 *        annotation="gmf.compartment layout='list'"
	 * @generated
	 */
	EList<Specifier> getSpecifiers();

	/**
	 * Returns the value of the '<em><b>Hints</b></em>' containment reference list.
	 * The list contents are of type {@link domain.GenerationHint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hints</em>' containment reference list.
	 * @see domain.DomainPackage#getArtifact_Hints()
	 * @model containment="true"
	 *        annotation="gmf.compartment layout='list'"
	 * @generated
	 */
	EList<GenerationHint> getHints();

	/**
	 * Returns the value of the '<em><b>Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template</em>' attribute.
	 * @see #setTemplate(String)
	 * @see domain.DomainPackage#getArtifact_Template()
	 * @model
	 * @generated
	 */
	String getTemplate();

	/**
	 * Sets the value of the '{@link domain.Artifact#getTemplate <em>Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template</em>' attribute.
	 * @see #getTemplate()
	 * @generated
	 */
	void setTemplate(String value);

} // Artifact
