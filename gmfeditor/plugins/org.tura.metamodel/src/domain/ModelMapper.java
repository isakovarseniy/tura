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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Mapper</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.ModelMapper#getName <em>Name</em>}</li>
 *   <li>{@link domain.ModelMapper#getArtifactRoot <em>Artifact Root</em>}</li>
 *   <li>{@link domain.ModelMapper#getParent <em>Parent</em>}</li>
 *   <li>{@link domain.ModelMapper#getSpecifiers <em>Specifiers</em>}</li>
 *   <li>{@link domain.ModelMapper#getQueries <em>Queries</em>}</li>
 *   <li>{@link domain.ModelMapper#getArtifactExecutionString <em>Artifact Execution String</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getModelMapper()
 * @model annotation="gmf.node label='name' border.color='0,0,0' color='192,192,192'"
 * @generated
 */
public interface ModelMapper extends ArtifactRef {
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
	 * @see domain.DomainPackage#getModelMapper_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link domain.ModelMapper#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Artifact Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artifact Root</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifact Root</em>' attribute.
	 * @see #setArtifactRoot(String)
	 * @see domain.DomainPackage#getModelMapper_ArtifactRoot()
	 * @model
	 * @generated
	 */
	String getArtifactRoot();

	/**
	 * Sets the value of the '{@link domain.ModelMapper#getArtifactRoot <em>Artifact Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Artifact Root</em>' attribute.
	 * @see #getArtifactRoot()
	 * @generated
	 */
	void setArtifactRoot(String value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link domain.Component#getMappers <em>Mappers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(Component)
	 * @see domain.DomainPackage#getModelMapper_Parent()
	 * @see domain.Component#getMappers
	 * @model opposite="mappers" transient="false"
	 * @generated
	 */
	Component getParent();

	/**
	 * Sets the value of the '{@link domain.ModelMapper#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Component value);

	/**
	 * Returns the value of the '<em><b>Specifiers</b></em>' containment reference list.
	 * The list contents are of type {@link domain.MappingSpecifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specifiers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specifiers</em>' containment reference list.
	 * @see domain.DomainPackage#getModelMapper_Specifiers()
	 * @model containment="true"
	 * @generated
	 */
	EList<MappingSpecifier> getSpecifiers();

	/**
	 * Returns the value of the '<em><b>Queries</b></em>' containment reference list.
	 * The list contents are of type {@link domain.Query}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Queries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Queries</em>' containment reference list.
	 * @see domain.DomainPackage#getModelMapper_Queries()
	 * @model containment="true"
	 *        annotation="gmf.compartment layout='list'"
	 * @generated
	 */
	EList<Query> getQueries();

	/**
	 * Returns the value of the '<em><b>Artifact Execution String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artifact Execution String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifact Execution String</em>' attribute.
	 * @see #setArtifactExecutionString(String)
	 * @see domain.DomainPackage#getModelMapper_ArtifactExecutionString()
	 * @model
	 * @generated
	 */
	String getArtifactExecutionString();

	/**
	 * Sets the value of the '{@link domain.ModelMapper#getArtifactExecutionString <em>Artifact Execution String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Artifact Execution String</em>' attribute.
	 * @see #getArtifactExecutionString()
	 * @generated
	 */
	void setArtifactExecutionString(String value);

} // ModelMapper
