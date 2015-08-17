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
 * A representation of the model object '<em><b>Infrastructure Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link domain.InfrastructureLayer#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.InfrastructureLayer#getName <em>Name</em>}</li>
 *   <li>{@link domain.InfrastructureLayer#getParent <em>Parent</em>}</li>
 *   <li>{@link domain.InfrastructureLayer#getInfrastructureComponent <em>Infrastructure Component</em>}</li>
 * </ul>
 *
 * @see domain.DomainPackage#getInfrastructureLayer()
 * @model annotation="gmf.node label='name' tool.small.bundle='org.tura.metamodel.commons' tool.small.path='icons/infra.png'"
 * @generated
 */
public interface InfrastructureLayer extends EObject {
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
	 * @see domain.DomainPackage#getInfrastructureLayer_Uid()
	 * @model id="true"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link domain.InfrastructureLayer#getUid <em>Uid</em>}' attribute.
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
	 * @see domain.DomainPackage#getInfrastructureLayer_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link domain.InfrastructureLayer#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link domain.Subsystem#getInfrastructureLayer <em>Infrastructure Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(Subsystem)
	 * @see domain.DomainPackage#getInfrastructureLayer_Parent()
	 * @see domain.Subsystem#getInfrastructureLayer
	 * @model opposite="infrastructureLayer" transient="false"
	 * @generated
	 */
	Subsystem getParent();

	/**
	 * Sets the value of the '{@link domain.InfrastructureLayer#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Subsystem value);

	/**
	 * Returns the value of the '<em><b>Infrastructure Component</b></em>' containment reference list.
	 * The list contents are of type {@link domain.InfrastructureComponent}.
	 * It is bidirectional and its opposite is '{@link domain.InfrastructureComponent#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Infrastructure Component</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Infrastructure Component</em>' containment reference list.
	 * @see domain.DomainPackage#getInfrastructureLayer_InfrastructureComponent()
	 * @see domain.InfrastructureComponent#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<InfrastructureComponent> getInfrastructureComponent();

} // InfrastructureLayer