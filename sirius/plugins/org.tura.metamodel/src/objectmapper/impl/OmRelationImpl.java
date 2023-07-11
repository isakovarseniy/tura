/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
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

import objectmapper.ObjectMapper;
import objectmapper.ObjectmapperPackage;
import objectmapper.OmRelation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import type.Assosiation;
import type.TypeElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Om Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link objectmapper.impl.OmRelationImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link objectmapper.impl.OmRelationImpl#getName <em>Name</em>}</li>
 *   <li>{@link objectmapper.impl.OmRelationImpl#getObjectMapperRef <em>Object Mapper Ref</em>}</li>
 *   <li>{@link objectmapper.impl.OmRelationImpl#getTypeRef <em>Type Ref</em>}</li>
 *   <li>{@link objectmapper.impl.OmRelationImpl#getAssosiationRef <em>Assosiation Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OmRelationImpl extends EObjectImpl implements OmRelation {
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
	 * The cached value of the '{@link #getObjectMapperRef() <em>Object Mapper Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectMapperRef()
	 * @generated
	 * @ordered
	 */
	protected ObjectMapper objectMapperRef;

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
	protected OmRelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ObjectmapperPackage.Literals.OM_RELATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ObjectmapperPackage.OM_RELATION__UID, oldUid, uid));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ObjectmapperPackage.OM_RELATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ObjectMapper getObjectMapperRef() {
		if (objectMapperRef != null && objectMapperRef.eIsProxy()) {
			InternalEObject oldObjectMapperRef = (InternalEObject)objectMapperRef;
			objectMapperRef = (ObjectMapper)eResolveProxy(oldObjectMapperRef);
			if (objectMapperRef != oldObjectMapperRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ObjectmapperPackage.OM_RELATION__OBJECT_MAPPER_REF, oldObjectMapperRef, objectMapperRef));
			}
		}
		return objectMapperRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectMapper basicGetObjectMapperRef() {
		return objectMapperRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setObjectMapperRef(ObjectMapper newObjectMapperRef) {
		ObjectMapper oldObjectMapperRef = objectMapperRef;
		objectMapperRef = newObjectMapperRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ObjectmapperPackage.OM_RELATION__OBJECT_MAPPER_REF, oldObjectMapperRef, objectMapperRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeElement getTypeRef() {
		if (typeRef != null && typeRef.eIsProxy()) {
			InternalEObject oldTypeRef = (InternalEObject)typeRef;
			typeRef = (TypeElement)eResolveProxy(oldTypeRef);
			if (typeRef != oldTypeRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ObjectmapperPackage.OM_RELATION__TYPE_REF, oldTypeRef, typeRef));
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
	@Override
	public void setTypeRef(TypeElement newTypeRef) {
		TypeElement oldTypeRef = typeRef;
		typeRef = newTypeRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ObjectmapperPackage.OM_RELATION__TYPE_REF, oldTypeRef, typeRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Assosiation getAssosiationRef() {
		if (assosiationRef != null && assosiationRef.eIsProxy()) {
			InternalEObject oldAssosiationRef = (InternalEObject)assosiationRef;
			assosiationRef = (Assosiation)eResolveProxy(oldAssosiationRef);
			if (assosiationRef != oldAssosiationRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ObjectmapperPackage.OM_RELATION__ASSOSIATION_REF, oldAssosiationRef, assosiationRef));
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
	@Override
	public void setAssosiationRef(Assosiation newAssosiationRef) {
		Assosiation oldAssosiationRef = assosiationRef;
		assosiationRef = newAssosiationRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ObjectmapperPackage.OM_RELATION__ASSOSIATION_REF, oldAssosiationRef, assosiationRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ObjectmapperPackage.OM_RELATION__UID:
				return getUid();
			case ObjectmapperPackage.OM_RELATION__NAME:
				return getName();
			case ObjectmapperPackage.OM_RELATION__OBJECT_MAPPER_REF:
				if (resolve) return getObjectMapperRef();
				return basicGetObjectMapperRef();
			case ObjectmapperPackage.OM_RELATION__TYPE_REF:
				if (resolve) return getTypeRef();
				return basicGetTypeRef();
			case ObjectmapperPackage.OM_RELATION__ASSOSIATION_REF:
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
			case ObjectmapperPackage.OM_RELATION__UID:
				setUid((String)newValue);
				return;
			case ObjectmapperPackage.OM_RELATION__NAME:
				setName((String)newValue);
				return;
			case ObjectmapperPackage.OM_RELATION__OBJECT_MAPPER_REF:
				setObjectMapperRef((ObjectMapper)newValue);
				return;
			case ObjectmapperPackage.OM_RELATION__TYPE_REF:
				setTypeRef((TypeElement)newValue);
				return;
			case ObjectmapperPackage.OM_RELATION__ASSOSIATION_REF:
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
			case ObjectmapperPackage.OM_RELATION__UID:
				setUid(UID_EDEFAULT);
				return;
			case ObjectmapperPackage.OM_RELATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ObjectmapperPackage.OM_RELATION__OBJECT_MAPPER_REF:
				setObjectMapperRef((ObjectMapper)null);
				return;
			case ObjectmapperPackage.OM_RELATION__TYPE_REF:
				setTypeRef((TypeElement)null);
				return;
			case ObjectmapperPackage.OM_RELATION__ASSOSIATION_REF:
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
			case ObjectmapperPackage.OM_RELATION__UID:
				return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
			case ObjectmapperPackage.OM_RELATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ObjectmapperPackage.OM_RELATION__OBJECT_MAPPER_REF:
				return objectMapperRef != null;
			case ObjectmapperPackage.OM_RELATION__TYPE_REF:
				return typeRef != null;
			case ObjectmapperPackage.OM_RELATION__ASSOSIATION_REF:
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
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //OmRelationImpl
