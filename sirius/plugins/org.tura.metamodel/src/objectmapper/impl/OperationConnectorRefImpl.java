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
package objectmapper.impl;

import objectmapper.ObjectmapperPackage;
import objectmapper.OperationConnector;
import objectmapper.OperationConnectorRef;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Connector Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link objectmapper.impl.OperationConnectorRefImpl#getOperationRef <em>Operation Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationConnectorRefImpl extends EObjectImpl implements OperationConnectorRef {
	/**
	 * The cached value of the '{@link #getOperationRef() <em>Operation Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationRef()
	 * @generated
	 * @ordered
	 */
	protected OperationConnector operationRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationConnectorRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ObjectmapperPackage.Literals.OPERATION_CONNECTOR_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationConnector getOperationRef() {
		if (operationRef != null && operationRef.eIsProxy()) {
			InternalEObject oldOperationRef = (InternalEObject)operationRef;
			operationRef = (OperationConnector)eResolveProxy(oldOperationRef);
			if (operationRef != oldOperationRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ObjectmapperPackage.OPERATION_CONNECTOR_REF__OPERATION_REF, oldOperationRef, operationRef));
			}
		}
		return operationRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationConnector basicGetOperationRef() {
		return operationRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperationRef(OperationConnector newOperationRef) {
		OperationConnector oldOperationRef = operationRef;
		operationRef = newOperationRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ObjectmapperPackage.OPERATION_CONNECTOR_REF__OPERATION_REF, oldOperationRef, operationRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ObjectmapperPackage.OPERATION_CONNECTOR_REF__OPERATION_REF:
				if (resolve) return getOperationRef();
				return basicGetOperationRef();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ObjectmapperPackage.OPERATION_CONNECTOR_REF__OPERATION_REF:
				setOperationRef((OperationConnector)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ObjectmapperPackage.OPERATION_CONNECTOR_REF__OPERATION_REF:
				setOperationRef((OperationConnector)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ObjectmapperPackage.OPERATION_CONNECTOR_REF__OPERATION_REF:
				return operationRef != null;
		}
		return super.eIsSet(featureID);
	}

} //OperationConnectorRefImpl
