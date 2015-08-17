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
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link domain.Component#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.Component#getName <em>Name</em>}</li>
 *   <li>{@link domain.Component#getParent <em>Parent</em>}</li>
 *   <li>{@link domain.Component#getMappers <em>Mappers</em>}</li>
 *   <li>{@link domain.Component#getComponentRoot <em>Component Root</em>}</li>
 * </ul>
 *
 * @see domain.DomainPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends HTMLLayerHolder {
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
	 * @see domain.DomainPackage#getComponent_Uid()
	 * @model id="true"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link domain.Component#getUid <em>Uid</em>}' attribute.
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
	 * @see domain.DomainPackage#getComponent_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link domain.Component#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link domain.Ingredient#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(Ingredient)
	 * @see domain.DomainPackage#getComponent_Parent()
	 * @see domain.Ingredient#getComponents
	 * @model opposite="components" transient="false"
	 * @generated
	 */
	Ingredient getParent();

	/**
	 * Sets the value of the '{@link domain.Component#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Ingredient value);

	/**
	 * Returns the value of the '<em><b>Mappers</b></em>' containment reference list.
	 * The list contents are of type {@link domain.ModelMapper}.
	 * It is bidirectional and its opposite is '{@link domain.ModelMapper#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mappers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mappers</em>' containment reference list.
	 * @see domain.DomainPackage#getComponent_Mappers()
	 * @see domain.ModelMapper#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ModelMapper> getMappers();

	/**
	 * Returns the value of the '<em><b>Component Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Root</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Root</em>' attribute.
	 * @see #setComponentRoot(String)
	 * @see domain.DomainPackage#getComponent_ComponentRoot()
	 * @model
	 * @generated
	 */
	String getComponentRoot();

	/**
	 * Sets the value of the '{@link domain.Component#getComponentRoot <em>Component Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Root</em>' attribute.
	 * @see #getComponentRoot()
	 * @generated
	 */
	void setComponentRoot(String value);

} // Component
