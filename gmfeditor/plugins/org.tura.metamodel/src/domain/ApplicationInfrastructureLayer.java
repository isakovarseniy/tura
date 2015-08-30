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
 * A representation of the model object '<em><b>Application Infrastructure Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.ApplicationInfrastructureLayer#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.ApplicationInfrastructureLayer#getName <em>Name</em>}</li>
 *   <li>{@link domain.ApplicationInfrastructureLayer#getParent <em>Parent</em>}</li>
 *   <li>{@link domain.ApplicationInfrastructureLayer#getInfarastructure <em>Infarastructure</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getApplicationInfrastructureLayer()
 * @model annotation="gmf.node label='name' border.color='0,0,0' color='192,192,192'"
 * @generated
 */
public interface ApplicationInfrastructureLayer extends EObject {
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
	 * @see domain.DomainPackage#getApplicationInfrastructureLayer_Uid()
	 * @model id="true"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link domain.ApplicationInfrastructureLayer#getUid <em>Uid</em>}' attribute.
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
	 * @see domain.DomainPackage#getApplicationInfrastructureLayer_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link domain.ApplicationInfrastructureLayer#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link domain.Application#getApplicationInfrastructureLayer <em>Application Infrastructure Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(Application)
	 * @see domain.DomainPackage#getApplicationInfrastructureLayer_Parent()
	 * @see domain.Application#getApplicationInfrastructureLayer
	 * @model opposite="applicationInfrastructureLayer" transient="false"
	 * @generated
	 */
	Application getParent();

	/**
	 * Sets the value of the '{@link domain.ApplicationInfrastructureLayer#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Application value);

	/**
	 * Returns the value of the '<em><b>Infarastructure</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link domain.EnterpriseInfrastructure#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Infarastructure</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Infarastructure</em>' containment reference.
	 * @see #setInfarastructure(EnterpriseInfrastructure)
	 * @see domain.DomainPackage#getApplicationInfrastructureLayer_Infarastructure()
	 * @see domain.EnterpriseInfrastructure#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EnterpriseInfrastructure getInfarastructure();

	/**
	 * Sets the value of the '{@link domain.ApplicationInfrastructureLayer#getInfarastructure <em>Infarastructure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Infarastructure</em>' containment reference.
	 * @see #getInfarastructure()
	 * @generated
	 */
	void setInfarastructure(EnterpriseInfrastructure value);

} // ApplicationInfrastructureLayer
