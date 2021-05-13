/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
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

import objectmapper.Aggregation;
import objectmapper.CalculatedField;
import objectmapper.ObjectMapper;
import objectmapper.ObjectmapperPackage;
import objectmapper.OmRelation;

import objectmapper.ProcessingStage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import type.AttributePointer;
import type.TypePointer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Mapper</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link objectmapper.impl.ObjectMapperImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link objectmapper.impl.ObjectMapperImpl#getName <em>Name</em>}</li>
 *   <li>{@link objectmapper.impl.ObjectMapperImpl#getStage <em>Stage</em>}</li>
 *   <li>{@link objectmapper.impl.ObjectMapperImpl#getBaseType <em>Base Type</em>}</li>
 *   <li>{@link objectmapper.impl.ObjectMapperImpl#getRelations <em>Relations</em>}</li>
 *   <li>{@link objectmapper.impl.ObjectMapperImpl#getCalculations <em>Calculations</em>}</li>
 *   <li>{@link objectmapper.impl.ObjectMapperImpl#getAggrigations <em>Aggrigations</em>}</li>
 *   <li>{@link objectmapper.impl.ObjectMapperImpl#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectMapperImpl extends EObjectImpl implements ObjectMapper {
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
	 * The cached value of the '{@link #getStage() <em>Stage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStage()
	 * @generated
	 * @ordered
	 */
	protected ProcessingStage stage;

	/**
	 * The cached value of the '{@link #getBaseType() <em>Base Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseType()
	 * @generated
	 * @ordered
	 */
	protected TypePointer baseType;

	/**
	 * The cached value of the '{@link #getRelations() <em>Relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<OmRelation> relations;

	/**
	 * The cached value of the '{@link #getCalculations() <em>Calculations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalculations()
	 * @generated
	 * @ordered
	 */
	protected EList<CalculatedField> calculations;

	/**
	 * The cached value of the '{@link #getAggrigations() <em>Aggrigations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggrigations()
	 * @generated
	 * @ordered
	 */
	protected EList<Aggregation> aggrigations;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributePointer> attributes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectMapperImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ObjectmapperPackage.Literals.OBJECT_MAPPER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ObjectmapperPackage.OBJECT_MAPPER__UID, oldUid, uid));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ObjectmapperPackage.OBJECT_MAPPER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcessingStage getStage() {
		if (stage != null && stage.eIsProxy()) {
			InternalEObject oldStage = (InternalEObject)stage;
			stage = (ProcessingStage)eResolveProxy(oldStage);
			if (stage != oldStage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ObjectmapperPackage.OBJECT_MAPPER__STAGE, oldStage, stage));
			}
		}
		return stage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingStage basicGetStage() {
		return stage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStage(ProcessingStage newStage) {
		ProcessingStage oldStage = stage;
		stage = newStage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ObjectmapperPackage.OBJECT_MAPPER__STAGE, oldStage, stage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypePointer getBaseType() {
		return baseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBaseType(TypePointer newBaseType, NotificationChain msgs) {
		TypePointer oldBaseType = baseType;
		baseType = newBaseType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ObjectmapperPackage.OBJECT_MAPPER__BASE_TYPE, oldBaseType, newBaseType);
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
	public void setBaseType(TypePointer newBaseType) {
		if (newBaseType != baseType) {
			NotificationChain msgs = null;
			if (baseType != null)
				msgs = ((InternalEObject)baseType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ObjectmapperPackage.OBJECT_MAPPER__BASE_TYPE, null, msgs);
			if (newBaseType != null)
				msgs = ((InternalEObject)newBaseType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ObjectmapperPackage.OBJECT_MAPPER__BASE_TYPE, null, msgs);
			msgs = basicSetBaseType(newBaseType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ObjectmapperPackage.OBJECT_MAPPER__BASE_TYPE, newBaseType, newBaseType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OmRelation> getRelations() {
		if (relations == null) {
			relations = new EObjectContainmentEList<OmRelation>(OmRelation.class, this, ObjectmapperPackage.OBJECT_MAPPER__RELATIONS);
		}
		return relations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CalculatedField> getCalculations() {
		if (calculations == null) {
			calculations = new EObjectContainmentEList<CalculatedField>(CalculatedField.class, this, ObjectmapperPackage.OBJECT_MAPPER__CALCULATIONS);
		}
		return calculations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Aggregation> getAggrigations() {
		if (aggrigations == null) {
			aggrigations = new EObjectContainmentEList<Aggregation>(Aggregation.class, this, ObjectmapperPackage.OBJECT_MAPPER__AGGRIGATIONS);
		}
		return aggrigations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AttributePointer> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<AttributePointer>(AttributePointer.class, this, ObjectmapperPackage.OBJECT_MAPPER__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ObjectmapperPackage.OBJECT_MAPPER__BASE_TYPE:
				return basicSetBaseType(null, msgs);
			case ObjectmapperPackage.OBJECT_MAPPER__RELATIONS:
				return ((InternalEList<?>)getRelations()).basicRemove(otherEnd, msgs);
			case ObjectmapperPackage.OBJECT_MAPPER__CALCULATIONS:
				return ((InternalEList<?>)getCalculations()).basicRemove(otherEnd, msgs);
			case ObjectmapperPackage.OBJECT_MAPPER__AGGRIGATIONS:
				return ((InternalEList<?>)getAggrigations()).basicRemove(otherEnd, msgs);
			case ObjectmapperPackage.OBJECT_MAPPER__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
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
			case ObjectmapperPackage.OBJECT_MAPPER__UID:
				return getUid();
			case ObjectmapperPackage.OBJECT_MAPPER__NAME:
				return getName();
			case ObjectmapperPackage.OBJECT_MAPPER__STAGE:
				if (resolve) return getStage();
				return basicGetStage();
			case ObjectmapperPackage.OBJECT_MAPPER__BASE_TYPE:
				return getBaseType();
			case ObjectmapperPackage.OBJECT_MAPPER__RELATIONS:
				return getRelations();
			case ObjectmapperPackage.OBJECT_MAPPER__CALCULATIONS:
				return getCalculations();
			case ObjectmapperPackage.OBJECT_MAPPER__AGGRIGATIONS:
				return getAggrigations();
			case ObjectmapperPackage.OBJECT_MAPPER__ATTRIBUTES:
				return getAttributes();
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
			case ObjectmapperPackage.OBJECT_MAPPER__UID:
				setUid((String)newValue);
				return;
			case ObjectmapperPackage.OBJECT_MAPPER__NAME:
				setName((String)newValue);
				return;
			case ObjectmapperPackage.OBJECT_MAPPER__STAGE:
				setStage((ProcessingStage)newValue);
				return;
			case ObjectmapperPackage.OBJECT_MAPPER__BASE_TYPE:
				setBaseType((TypePointer)newValue);
				return;
			case ObjectmapperPackage.OBJECT_MAPPER__RELATIONS:
				getRelations().clear();
				getRelations().addAll((Collection<? extends OmRelation>)newValue);
				return;
			case ObjectmapperPackage.OBJECT_MAPPER__CALCULATIONS:
				getCalculations().clear();
				getCalculations().addAll((Collection<? extends CalculatedField>)newValue);
				return;
			case ObjectmapperPackage.OBJECT_MAPPER__AGGRIGATIONS:
				getAggrigations().clear();
				getAggrigations().addAll((Collection<? extends Aggregation>)newValue);
				return;
			case ObjectmapperPackage.OBJECT_MAPPER__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends AttributePointer>)newValue);
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
			case ObjectmapperPackage.OBJECT_MAPPER__UID:
				setUid(UID_EDEFAULT);
				return;
			case ObjectmapperPackage.OBJECT_MAPPER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ObjectmapperPackage.OBJECT_MAPPER__STAGE:
				setStage((ProcessingStage)null);
				return;
			case ObjectmapperPackage.OBJECT_MAPPER__BASE_TYPE:
				setBaseType((TypePointer)null);
				return;
			case ObjectmapperPackage.OBJECT_MAPPER__RELATIONS:
				getRelations().clear();
				return;
			case ObjectmapperPackage.OBJECT_MAPPER__CALCULATIONS:
				getCalculations().clear();
				return;
			case ObjectmapperPackage.OBJECT_MAPPER__AGGRIGATIONS:
				getAggrigations().clear();
				return;
			case ObjectmapperPackage.OBJECT_MAPPER__ATTRIBUTES:
				getAttributes().clear();
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
			case ObjectmapperPackage.OBJECT_MAPPER__UID:
				return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
			case ObjectmapperPackage.OBJECT_MAPPER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ObjectmapperPackage.OBJECT_MAPPER__STAGE:
				return stage != null;
			case ObjectmapperPackage.OBJECT_MAPPER__BASE_TYPE:
				return baseType != null;
			case ObjectmapperPackage.OBJECT_MAPPER__RELATIONS:
				return relations != null && !relations.isEmpty();
			case ObjectmapperPackage.OBJECT_MAPPER__CALCULATIONS:
				return calculations != null && !calculations.isEmpty();
			case ObjectmapperPackage.OBJECT_MAPPER__AGGRIGATIONS:
				return aggrigations != null && !aggrigations.isEmpty();
			case ObjectmapperPackage.OBJECT_MAPPER__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
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

} //ObjectMapperImpl
