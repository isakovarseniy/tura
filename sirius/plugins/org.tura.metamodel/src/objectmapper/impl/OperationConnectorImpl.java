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

import form.ContextParameters;
import objectmapper.ObjectMapper;
import objectmapper.ObjectmapperPackage;
import objectmapper.OperationConnector;
import objectmapper.OperationType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link objectmapper.impl.OperationConnectorImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link objectmapper.impl.OperationConnectorImpl#getName <em>Name</em>}</li>
 *   <li>{@link objectmapper.impl.OperationConnectorImpl#getSource <em>Source</em>}</li>
 *   <li>{@link objectmapper.impl.OperationConnectorImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link objectmapper.impl.OperationConnectorImpl#getOperationType <em>Operation Type</em>}</li>
 *   <li>{@link objectmapper.impl.OperationConnectorImpl#getDefaultSearch <em>Default Search</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationConnectorImpl extends OperationConnectorRefImpl implements OperationConnector {
	/**
	 * The default value of the '{@link #getUid() <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUid()
	 * @generated
	 * @ordered
	 */
	protected static final String UID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUid() <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUid()
	 * @generated
	 * @ordered
	 */
	protected String uid = UID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected ObjectMapper source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected ObjectMapper target;

	/**
	 * The default value of the '{@link #getOperationType() <em>Operation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationType()
	 * @generated
	 * @ordered
	 */
	protected static final OperationType OPERATION_TYPE_EDEFAULT = OperationType.MERGE_OR_ADD;

	/**
	 * The cached value of the '{@link #getOperationType() <em>Operation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationType()
	 * @generated
	 * @ordered
	 */
	protected OperationType operationType = OPERATION_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDefaultSearch() <em>Default Search</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultSearch()
	 * @generated
	 * @ordered
	 */
	protected ContextParameters defaultSearch;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ObjectmapperPackage.Literals.OPERATION_CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUid() {
		return uid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUid(String newUid) {
		String oldUid = uid;
		uid = newUid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ObjectmapperPackage.OPERATION_CONNECTOR__UID, oldUid, uid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ObjectmapperPackage.OPERATION_CONNECTOR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ObjectMapper getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (ObjectMapper)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ObjectmapperPackage.OPERATION_CONNECTOR__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectMapper basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(ObjectMapper newSource) {
		ObjectMapper oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ObjectmapperPackage.OPERATION_CONNECTOR__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ObjectMapper getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (ObjectMapper)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ObjectmapperPackage.OPERATION_CONNECTOR__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectMapper basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(ObjectMapper newTarget) {
		ObjectMapper oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ObjectmapperPackage.OPERATION_CONNECTOR__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationType getOperationType() {
		return operationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperationType(OperationType newOperationType) {
		OperationType oldOperationType = operationType;
		operationType = newOperationType == null ? OPERATION_TYPE_EDEFAULT : newOperationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ObjectmapperPackage.OPERATION_CONNECTOR__OPERATION_TYPE, oldOperationType, operationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContextParameters getDefaultSearch() {
		return defaultSearch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultSearch(ContextParameters newDefaultSearch, NotificationChain msgs) {
		ContextParameters oldDefaultSearch = defaultSearch;
		defaultSearch = newDefaultSearch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ObjectmapperPackage.OPERATION_CONNECTOR__DEFAULT_SEARCH, oldDefaultSearch, newDefaultSearch);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultSearch(ContextParameters newDefaultSearch) {
		if (newDefaultSearch != defaultSearch) {
			NotificationChain msgs = null;
			if (defaultSearch != null)
				msgs = ((InternalEObject)defaultSearch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ObjectmapperPackage.OPERATION_CONNECTOR__DEFAULT_SEARCH, null, msgs);
			if (newDefaultSearch != null)
				msgs = ((InternalEObject)newDefaultSearch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ObjectmapperPackage.OPERATION_CONNECTOR__DEFAULT_SEARCH, null, msgs);
			msgs = basicSetDefaultSearch(newDefaultSearch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ObjectmapperPackage.OPERATION_CONNECTOR__DEFAULT_SEARCH, newDefaultSearch, newDefaultSearch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ObjectmapperPackage.OPERATION_CONNECTOR__DEFAULT_SEARCH:
				return basicSetDefaultSearch(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ObjectmapperPackage.OPERATION_CONNECTOR__UID:
				return getUid();
			case ObjectmapperPackage.OPERATION_CONNECTOR__NAME:
				return getName();
			case ObjectmapperPackage.OPERATION_CONNECTOR__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case ObjectmapperPackage.OPERATION_CONNECTOR__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case ObjectmapperPackage.OPERATION_CONNECTOR__OPERATION_TYPE:
				return getOperationType();
			case ObjectmapperPackage.OPERATION_CONNECTOR__DEFAULT_SEARCH:
				return getDefaultSearch();
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
			case ObjectmapperPackage.OPERATION_CONNECTOR__UID:
				setUid((String)newValue);
				return;
			case ObjectmapperPackage.OPERATION_CONNECTOR__NAME:
				setName((String)newValue);
				return;
			case ObjectmapperPackage.OPERATION_CONNECTOR__SOURCE:
				setSource((ObjectMapper)newValue);
				return;
			case ObjectmapperPackage.OPERATION_CONNECTOR__TARGET:
				setTarget((ObjectMapper)newValue);
				return;
			case ObjectmapperPackage.OPERATION_CONNECTOR__OPERATION_TYPE:
				setOperationType((OperationType)newValue);
				return;
			case ObjectmapperPackage.OPERATION_CONNECTOR__DEFAULT_SEARCH:
				setDefaultSearch((ContextParameters)newValue);
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
			case ObjectmapperPackage.OPERATION_CONNECTOR__UID:
				setUid(UID_EDEFAULT);
				return;
			case ObjectmapperPackage.OPERATION_CONNECTOR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ObjectmapperPackage.OPERATION_CONNECTOR__SOURCE:
				setSource((ObjectMapper)null);
				return;
			case ObjectmapperPackage.OPERATION_CONNECTOR__TARGET:
				setTarget((ObjectMapper)null);
				return;
			case ObjectmapperPackage.OPERATION_CONNECTOR__OPERATION_TYPE:
				setOperationType(OPERATION_TYPE_EDEFAULT);
				return;
			case ObjectmapperPackage.OPERATION_CONNECTOR__DEFAULT_SEARCH:
				setDefaultSearch((ContextParameters)null);
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
			case ObjectmapperPackage.OPERATION_CONNECTOR__UID:
				return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
			case ObjectmapperPackage.OPERATION_CONNECTOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ObjectmapperPackage.OPERATION_CONNECTOR__SOURCE:
				return source != null;
			case ObjectmapperPackage.OPERATION_CONNECTOR__TARGET:
				return target != null;
			case ObjectmapperPackage.OPERATION_CONNECTOR__OPERATION_TYPE:
				return operationType != OPERATION_TYPE_EDEFAULT;
			case ObjectmapperPackage.OPERATION_CONNECTOR__DEFAULT_SEARCH:
				return defaultSearch != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (uid: ");
		result.append(uid);
		result.append(", name: ");
		result.append(name);
		result.append(", operationType: ");
		result.append(operationType);
		result.append(')');
		return result.toString();
	}

} //OperationConnectorImpl
