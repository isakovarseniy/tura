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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployment Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.DeploymentComponent#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.DeploymentComponent#getName <em>Name</em>}</li>
 *   <li>{@link domain.DeploymentComponent#getMapper <em>Mapper</em>}</li>
 *   <li>{@link domain.DeploymentComponent#getDeploymentComponentLink <em>Deployment Component Link</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getDeploymentComponent()
 * @model annotation="gmf.node label='name' border.color='0,0,0' color='177,201,236'"
 * @generated
 */
public interface DeploymentComponent extends EObject {
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
	 * @see domain.DomainPackage#getDeploymentComponent_Uid()
	 * @model id="true"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link domain.DeploymentComponent#getUid <em>Uid</em>}' attribute.
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
	 * @see domain.DomainPackage#getDeploymentComponent_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link domain.DeploymentComponent#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Mapper</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapper</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapper</em>' reference.
	 * @see #setMapper(ModelMapper)
	 * @see domain.DomainPackage#getDeploymentComponent_Mapper()
	 * @model
	 * @generated
	 */
	ModelMapper getMapper();

	/**
	 * Sets the value of the '{@link domain.DeploymentComponent#getMapper <em>Mapper</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapper</em>' reference.
	 * @see #getMapper()
	 * @generated
	 */
	void setMapper(ModelMapper value);

	/**
	 * Returns the value of the '<em><b>Deployment Component Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deployment Component Link</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployment Component Link</em>' reference.
	 * @see #setDeploymentComponentLink(DeploymentComponent)
	 * @see domain.DomainPackage#getDeploymentComponent_DeploymentComponentLink()
	 * @model annotation="gmf.link target.decoration='arrow' style='dash'"
	 * @generated
	 */
	DeploymentComponent getDeploymentComponentLink();

	/**
	 * Sets the value of the '{@link domain.DeploymentComponent#getDeploymentComponentLink <em>Deployment Component Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deployment Component Link</em>' reference.
	 * @see #getDeploymentComponentLink()
	 * @generated
	 */
	void setDeploymentComponentLink(DeploymentComponent value);

} // DeploymentComponent
