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
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.Type#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link domain.Type#getOperations <em>Operations</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getType()
 * @model annotation="gmf.node label='name' border.color='0,0,0' color='255,239,222'"
 * @generated
 */
public interface Type extends TypeElement, Categorized {
	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link domain.Attribute}.
	 * It is bidirectional and its opposite is '{@link domain.Attribute#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see domain.DomainPackage#getType_Attributes()
	 * @see domain.Attribute#getParent
	 * @model opposite="parent" containment="true"
	 *        annotation="gmf.compartment layout='list'"
	 * @generated
	 */
	EList<Attribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
	 * The list contents are of type {@link domain.Operation}.
	 * It is bidirectional and its opposite is '{@link domain.Operation#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see domain.DomainPackage#getType_Operations()
	 * @see domain.Operation#getParent
	 * @model opposite="parent" containment="true"
	 *        annotation="gmf.compartment layout='list'"
	 * @generated
	 */
	EList<Operation> getOperations();

} // Type
