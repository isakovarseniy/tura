/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2020 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   http://sourceforge.net/p/tura/wiki/Home/
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

/**
 */
package form.impl;

import form.DataControl;
import form.FormPackage;
import form.RelationMapper;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import type.Assosiation;
import type.TypeElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation Mapper</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link form.impl.RelationMapperImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link form.impl.RelationMapperImpl#getDataControlRef <em>Data Control Ref</em>}</li>
 *   <li>{@link form.impl.RelationMapperImpl#getTypeRef <em>Type Ref</em>}</li>
 *   <li>{@link form.impl.RelationMapperImpl#getAssosiationRef <em>Assosiation Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationMapperImpl extends EObjectImpl implements RelationMapper {
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
	 * The cached value of the '{@link #getDataControlRef() <em>Data Control Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataControlRef()
	 * @generated
	 * @ordered
	 */
	protected DataControl dataControlRef;

	/**
	 * The cached value of the '{@link #getTypeRef() <em>Type Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeRef()
	 * @generated
	 * @ordered
	 */
	protected TypeElement typeRef;

	/**
	 * The cached value of the '{@link #getAssosiationRef() <em>Assosiation Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssosiationRef()
	 * @generated
	 * @ordered
	 */
	protected Assosiation assosiationRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationMapperImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FormPackage.Literals.RELATION_MAPPER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUid() {
		return uid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUid(String newUid) {
		String oldUid = uid;
		uid = newUid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.RELATION_MAPPER__UID, oldUid, uid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataControl getDataControlRef() {
		if (dataControlRef != null && dataControlRef.eIsProxy()) {
			InternalEObject oldDataControlRef = (InternalEObject)dataControlRef;
			dataControlRef = (DataControl)eResolveProxy(oldDataControlRef);
			if (dataControlRef != oldDataControlRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FormPackage.RELATION_MAPPER__DATA_CONTROL_REF, oldDataControlRef, dataControlRef));
			}
		}
		return dataControlRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataControl basicGetDataControlRef() {
		return dataControlRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataControlRef(DataControl newDataControlRef) {
		DataControl oldDataControlRef = dataControlRef;
		dataControlRef = newDataControlRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.RELATION_MAPPER__DATA_CONTROL_REF, oldDataControlRef, dataControlRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeElement getTypeRef() {
		if (typeRef != null && typeRef.eIsProxy()) {
			InternalEObject oldTypeRef = (InternalEObject)typeRef;
			typeRef = (TypeElement)eResolveProxy(oldTypeRef);
			if (typeRef != oldTypeRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FormPackage.RELATION_MAPPER__TYPE_REF, oldTypeRef, typeRef));
			}
		}
		return typeRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeElement basicGetTypeRef() {
		return typeRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeRef(TypeElement newTypeRef) {
		TypeElement oldTypeRef = typeRef;
		typeRef = newTypeRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.RELATION_MAPPER__TYPE_REF, oldTypeRef, typeRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assosiation getAssosiationRef() {
		if (assosiationRef != null && assosiationRef.eIsProxy()) {
			InternalEObject oldAssosiationRef = (InternalEObject)assosiationRef;
			assosiationRef = (Assosiation)eResolveProxy(oldAssosiationRef);
			if (assosiationRef != oldAssosiationRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FormPackage.RELATION_MAPPER__ASSOSIATION_REF, oldAssosiationRef, assosiationRef));
			}
		}
		return assosiationRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assosiation basicGetAssosiationRef() {
		return assosiationRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssosiationRef(Assosiation newAssosiationRef) {
		Assosiation oldAssosiationRef = assosiationRef;
		assosiationRef = newAssosiationRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.RELATION_MAPPER__ASSOSIATION_REF, oldAssosiationRef, assosiationRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FormPackage.RELATION_MAPPER__UID:
				return getUid();
			case FormPackage.RELATION_MAPPER__DATA_CONTROL_REF:
				if (resolve) return getDataControlRef();
				return basicGetDataControlRef();
			case FormPackage.RELATION_MAPPER__TYPE_REF:
				if (resolve) return getTypeRef();
				return basicGetTypeRef();
			case FormPackage.RELATION_MAPPER__ASSOSIATION_REF:
				if (resolve) return getAssosiationRef();
				return basicGetAssosiationRef();
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
			case FormPackage.RELATION_MAPPER__UID:
				setUid((String)newValue);
				return;
			case FormPackage.RELATION_MAPPER__DATA_CONTROL_REF:
				setDataControlRef((DataControl)newValue);
				return;
			case FormPackage.RELATION_MAPPER__TYPE_REF:
				setTypeRef((TypeElement)newValue);
				return;
			case FormPackage.RELATION_MAPPER__ASSOSIATION_REF:
				setAssosiationRef((Assosiation)newValue);
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
			case FormPackage.RELATION_MAPPER__UID:
				setUid(UID_EDEFAULT);
				return;
			case FormPackage.RELATION_MAPPER__DATA_CONTROL_REF:
				setDataControlRef((DataControl)null);
				return;
			case FormPackage.RELATION_MAPPER__TYPE_REF:
				setTypeRef((TypeElement)null);
				return;
			case FormPackage.RELATION_MAPPER__ASSOSIATION_REF:
				setAssosiationRef((Assosiation)null);
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
			case FormPackage.RELATION_MAPPER__UID:
				return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
			case FormPackage.RELATION_MAPPER__DATA_CONTROL_REF:
				return dataControlRef != null;
			case FormPackage.RELATION_MAPPER__TYPE_REF:
				return typeRef != null;
			case FormPackage.RELATION_MAPPER__ASSOSIATION_REF:
				return assosiationRef != null;
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
		result.append(')');
		return result.toString();
	}

} //RelationMapperImpl
