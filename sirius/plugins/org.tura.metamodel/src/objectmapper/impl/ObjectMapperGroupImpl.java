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

import java.util.Collection;

import objectmapper.AttributeConnector;
import objectmapper.CalculatedField;
import objectmapper.Connector;
import objectmapper.GraphRoot;
import objectmapper.ObjectMapper;
import objectmapper.ObjectMapperGroup;
import objectmapper.ObjectmapperPackage;

import objectmapper.OperationConnector;
import objectmapper.ProcessingStage;
import objectmapper.Variable;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Mapper Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link objectmapper.impl.ObjectMapperGroupImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link objectmapper.impl.ObjectMapperGroupImpl#getName <em>Name</em>}</li>
 *   <li>{@link objectmapper.impl.ObjectMapperGroupImpl#getObjectMappers <em>Object Mappers</em>}</li>
 *   <li>{@link objectmapper.impl.ObjectMapperGroupImpl#getStages <em>Stages</em>}</li>
 *   <li>{@link objectmapper.impl.ObjectMapperGroupImpl#getAttributesConnector <em>Attributes Connector</em>}</li>
 *   <li>{@link objectmapper.impl.ObjectMapperGroupImpl#getOperationsConnector <em>Operations Connector</em>}</li>
 *   <li>{@link objectmapper.impl.ObjectMapperGroupImpl#getVariables <em>Variables</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectMapperGroupImpl extends EObjectImpl implements ObjectMapperGroup {
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
	 * The cached value of the '{@link #getObjectMappers() <em>Object Mappers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectMappers()
	 * @generated
	 * @ordered
	 */
	protected EList<ObjectMapper> objectMappers;

	/**
	 * The cached value of the '{@link #getStages() <em>Stages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStages()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcessingStage> stages;

	/**
	 * The cached value of the '{@link #getAttributesConnector() <em>Attributes Connector</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributesConnector()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeConnector> attributesConnector;

	/**
	 * The cached value of the '{@link #getOperationsConnector() <em>Operations Connector</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationsConnector()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationConnector> operationsConnector;

	/**
	 * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> variables;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectMapperGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ObjectmapperPackage.Literals.OBJECT_MAPPER_GROUP;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ObjectmapperPackage.OBJECT_MAPPER_GROUP__UID, oldUid, uid));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ObjectmapperPackage.OBJECT_MAPPER_GROUP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ObjectMapper> getObjectMappers() {
		if (objectMappers == null) {
			objectMappers = new EObjectContainmentEList<ObjectMapper>(ObjectMapper.class, this, ObjectmapperPackage.OBJECT_MAPPER_GROUP__OBJECT_MAPPERS);
		}
		return objectMappers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProcessingStage> getStages() {
		if (stages == null) {
			stages = new EObjectContainmentEList<ProcessingStage>(ProcessingStage.class, this, ObjectmapperPackage.OBJECT_MAPPER_GROUP__STAGES);
		}
		return stages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AttributeConnector> getAttributesConnector() {
		if (attributesConnector == null) {
			attributesConnector = new EObjectContainmentEList<AttributeConnector>(AttributeConnector.class, this, ObjectmapperPackage.OBJECT_MAPPER_GROUP__ATTRIBUTES_CONNECTOR);
		}
		return attributesConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OperationConnector> getOperationsConnector() {
		if (operationsConnector == null) {
			operationsConnector = new EObjectContainmentEList<OperationConnector>(OperationConnector.class, this, ObjectmapperPackage.OBJECT_MAPPER_GROUP__OPERATIONS_CONNECTOR);
		}
		return operationsConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Variable> getVariables() {
		if (variables == null) {
			variables = new EObjectContainmentEList<Variable>(Variable.class, this, ObjectmapperPackage.OBJECT_MAPPER_GROUP__VARIABLES);
		}
		return variables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ObjectmapperPackage.OBJECT_MAPPER_GROUP__OBJECT_MAPPERS:
				return ((InternalEList<?>)getObjectMappers()).basicRemove(otherEnd, msgs);
			case ObjectmapperPackage.OBJECT_MAPPER_GROUP__STAGES:
				return ((InternalEList<?>)getStages()).basicRemove(otherEnd, msgs);
			case ObjectmapperPackage.OBJECT_MAPPER_GROUP__ATTRIBUTES_CONNECTOR:
				return ((InternalEList<?>)getAttributesConnector()).basicRemove(otherEnd, msgs);
			case ObjectmapperPackage.OBJECT_MAPPER_GROUP__OPERATIONS_CONNECTOR:
				return ((InternalEList<?>)getOperationsConnector()).basicRemove(otherEnd, msgs);
			case ObjectmapperPackage.OBJECT_MAPPER_GROUP__VARIABLES:
				return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
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
			case ObjectmapperPackage.OBJECT_MAPPER_GROUP__UID:
				return getUid();
			case ObjectmapperPackage.OBJECT_MAPPER_GROUP__NAME:
				return getName();
			case ObjectmapperPackage.OBJECT_MAPPER_GROUP__OBJECT_MAPPERS:
				return getObjectMappers();
			case ObjectmapperPackage.OBJECT_MAPPER_GROUP__STAGES:
				return getStages();
			case ObjectmapperPackage.OBJECT_MAPPER_GROUP__ATTRIBUTES_CONNECTOR:
				return getAttributesConnector();
			case ObjectmapperPackage.OBJECT_MAPPER_GROUP__OPERATIONS_CONNECTOR:
				return getOperationsConnector();
			case ObjectmapperPackage.OBJECT_MAPPER_GROUP__VARIABLES:
				return getVariables();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ObjectmapperPackage.OBJECT_MAPPER_GROUP__UID:
				setUid((String)newValue);
				return;
			case ObjectmapperPackage.OBJECT_MAPPER_GROUP__NAME:
				setName((String)newValue);
				return;
			case ObjectmapperPackage.OBJECT_MAPPER_GROUP__OBJECT_MAPPERS:
				getObjectMappers().clear();
				getObjectMappers().addAll((Collection<? extends ObjectMapper>)newValue);
				return;
			case ObjectmapperPackage.OBJECT_MAPPER_GROUP__STAGES:
				getStages().clear();
				getStages().addAll((Collection<? extends ProcessingStage>)newValue);
				return;
			case ObjectmapperPackage.OBJECT_MAPPER_GROUP__ATTRIBUTES_CONNECTOR:
				getAttributesConnector().clear();
				getAttributesConnector().addAll((Collection<? extends AttributeConnector>)newValue);
				return;
			case ObjectmapperPackage.OBJECT_MAPPER_GROUP__OPERATIONS_CONNECTOR:
				getOperationsConnector().clear();
				getOperationsConnector().addAll((Collection<? extends OperationConnector>)newValue);
				return;
			case ObjectmapperPackage.OBJECT_MAPPER_GROUP__VARIABLES:
				getVariables().clear();
				getVariables().addAll((Collection<? extends Variable>)newValue);
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
			case ObjectmapperPackage.OBJECT_MAPPER_GROUP__UID:
				setUid(UID_EDEFAULT);
				return;
			case ObjectmapperPackage.OBJECT_MAPPER_GROUP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ObjectmapperPackage.OBJECT_MAPPER_GROUP__OBJECT_MAPPERS:
				getObjectMappers().clear();
				return;
			case ObjectmapperPackage.OBJECT_MAPPER_GROUP__STAGES:
				getStages().clear();
				return;
			case ObjectmapperPackage.OBJECT_MAPPER_GROUP__ATTRIBUTES_CONNECTOR:
				getAttributesConnector().clear();
				return;
			case ObjectmapperPackage.OBJECT_MAPPER_GROUP__OPERATIONS_CONNECTOR:
				getOperationsConnector().clear();
				return;
			case ObjectmapperPackage.OBJECT_MAPPER_GROUP__VARIABLES:
				getVariables().clear();
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
			case ObjectmapperPackage.OBJECT_MAPPER_GROUP__UID:
				return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
			case ObjectmapperPackage.OBJECT_MAPPER_GROUP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ObjectmapperPackage.OBJECT_MAPPER_GROUP__OBJECT_MAPPERS:
				return objectMappers != null && !objectMappers.isEmpty();
			case ObjectmapperPackage.OBJECT_MAPPER_GROUP__STAGES:
				return stages != null && !stages.isEmpty();
			case ObjectmapperPackage.OBJECT_MAPPER_GROUP__ATTRIBUTES_CONNECTOR:
				return attributesConnector != null && !attributesConnector.isEmpty();
			case ObjectmapperPackage.OBJECT_MAPPER_GROUP__OPERATIONS_CONNECTOR:
				return operationsConnector != null && !operationsConnector.isEmpty();
			case ObjectmapperPackage.OBJECT_MAPPER_GROUP__VARIABLES:
				return variables != null && !variables.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //ObjectMapperGroupImpl
