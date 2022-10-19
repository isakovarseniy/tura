/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2022 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
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
package application;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link application.Application#getUid <em>Uid</em>}</li>
 *   <li>{@link application.Application#getName <em>Name</em>}</li>
 *   <li>{@link application.Application#getApplicationRecipes <em>Application Recipes</em>}</li>
 *   <li>{@link application.Application#getApplicationMappers <em>Application Mappers</em>}</li>
 *   <li>{@link application.Application#getApplicationUILayer <em>Application UI Layer</em>}</li>
 *   <li>{@link application.Application#getApplicationInfrastructureLayer <em>Application Infrastructure Layer</em>}</li>
 *   <li>{@link application.Application#getApplicationStyle <em>Application Style</em>}</li>
 *   <li>{@link application.Application#getApplicationRole <em>Application Role</em>}</li>
 *   <li>{@link application.Application#getApplicationMessages <em>Application Messages</em>}</li>
 * </ul>
 *
 * @see application.ApplicationPackage#getApplication()
 * @model
 * @generated
 */
public interface Application extends EObject {
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
	 * @see application.ApplicationPackage#getApplication_Uid()
	 * @model id="true"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link application.Application#getUid <em>Uid</em>}' attribute.
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
	 * @see application.ApplicationPackage#getApplication_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link application.Application#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Application Recipes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application Recipes</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application Recipes</em>' containment reference.
	 * @see #setApplicationRecipes(ApplicationRecipes)
	 * @see application.ApplicationPackage#getApplication_ApplicationRecipes()
	 * @model containment="true"
	 * @generated
	 */
	ApplicationRecipes getApplicationRecipes();

	/**
	 * Sets the value of the '{@link application.Application#getApplicationRecipes <em>Application Recipes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application Recipes</em>' containment reference.
	 * @see #getApplicationRecipes()
	 * @generated
	 */
	void setApplicationRecipes(ApplicationRecipes value);

	/**
	 * Returns the value of the '<em><b>Application Mappers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application Mappers</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application Mappers</em>' containment reference.
	 * @see #setApplicationMappers(ApplicationMappers)
	 * @see application.ApplicationPackage#getApplication_ApplicationMappers()
	 * @model containment="true"
	 * @generated
	 */
	ApplicationMappers getApplicationMappers();

	/**
	 * Sets the value of the '{@link application.Application#getApplicationMappers <em>Application Mappers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application Mappers</em>' containment reference.
	 * @see #getApplicationMappers()
	 * @generated
	 */
	void setApplicationMappers(ApplicationMappers value);

	/**
	 * Returns the value of the '<em><b>Application UI Layer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application UI Layer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application UI Layer</em>' containment reference.
	 * @see #setApplicationUILayer(ApplicationUILayer)
	 * @see application.ApplicationPackage#getApplication_ApplicationUILayer()
	 * @model containment="true"
	 * @generated
	 */
	ApplicationUILayer getApplicationUILayer();

	/**
	 * Sets the value of the '{@link application.Application#getApplicationUILayer <em>Application UI Layer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application UI Layer</em>' containment reference.
	 * @see #getApplicationUILayer()
	 * @generated
	 */
	void setApplicationUILayer(ApplicationUILayer value);

	/**
	 * Returns the value of the '<em><b>Application Infrastructure Layer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application Infrastructure Layer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application Infrastructure Layer</em>' containment reference.
	 * @see #setApplicationInfrastructureLayer(ApplicationInfrastructureLayers)
	 * @see application.ApplicationPackage#getApplication_ApplicationInfrastructureLayer()
	 * @model containment="true"
	 * @generated
	 */
	ApplicationInfrastructureLayers getApplicationInfrastructureLayer();

	/**
	 * Sets the value of the '{@link application.Application#getApplicationInfrastructureLayer <em>Application Infrastructure Layer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application Infrastructure Layer</em>' containment reference.
	 * @see #getApplicationInfrastructureLayer()
	 * @generated
	 */
	void setApplicationInfrastructureLayer(ApplicationInfrastructureLayers value);

	/**
	 * Returns the value of the '<em><b>Application Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application Style</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application Style</em>' containment reference.
	 * @see #setApplicationStyle(ApplicationStyleLibraries)
	 * @see application.ApplicationPackage#getApplication_ApplicationStyle()
	 * @model containment="true"
	 * @generated
	 */
	ApplicationStyleLibraries getApplicationStyle();

	/**
	 * Sets the value of the '{@link application.Application#getApplicationStyle <em>Application Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application Style</em>' containment reference.
	 * @see #getApplicationStyle()
	 * @generated
	 */
	void setApplicationStyle(ApplicationStyleLibraries value);

	/**
	 * Returns the value of the '<em><b>Application Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application Role</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application Role</em>' containment reference.
	 * @see #setApplicationRole(ApplicationRealms)
	 * @see application.ApplicationPackage#getApplication_ApplicationRole()
	 * @model containment="true"
	 * @generated
	 */
	ApplicationRealms getApplicationRole();

	/**
	 * Sets the value of the '{@link application.Application#getApplicationRole <em>Application Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application Role</em>' containment reference.
	 * @see #getApplicationRole()
	 * @generated
	 */
	void setApplicationRole(ApplicationRealms value);

	/**
	 * Returns the value of the '<em><b>Application Messages</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application Messages</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application Messages</em>' containment reference.
	 * @see #setApplicationMessages(ApplicationMessageLibraries)
	 * @see application.ApplicationPackage#getApplication_ApplicationMessages()
	 * @model containment="true"
	 * @generated
	 */
	ApplicationMessageLibraries getApplicationMessages();

	/**
	 * Sets the value of the '{@link application.Application#getApplicationMessages <em>Application Messages</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application Messages</em>' containment reference.
	 * @see #getApplicationMessages()
	 * @generated
	 */
	void setApplicationMessages(ApplicationMessageLibraries value);

} // Application
