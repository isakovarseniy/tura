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
package recipe.impl;

import artifact.Option;
import artifact.Technology;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import recipe.MappingTecnologiy;
import recipe.RecipePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapping Tecnologiy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link recipe.impl.MappingTecnologiyImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link recipe.impl.MappingTecnologiyImpl#getTechRef <em>Tech Ref</em>}</li>
 *   <li>{@link recipe.impl.MappingTecnologiyImpl#getValueRef <em>Value Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MappingTecnologiyImpl extends EObjectImpl implements MappingTecnologiy {
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
	 * The cached value of the '{@link #getTechRef() <em>Tech Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechRef()
	 * @generated
	 * @ordered
	 */
	protected Technology techRef;

	/**
	 * The cached value of the '{@link #getValueRef() <em>Value Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueRef()
	 * @generated
	 * @ordered
	 */
	protected Option valueRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappingTecnologiyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RecipePackage.Literals.MAPPING_TECNOLOGIY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RecipePackage.MAPPING_TECNOLOGIY__UID, oldUid, uid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Technology getTechRef() {
		if (techRef != null && techRef.eIsProxy()) {
			InternalEObject oldTechRef = (InternalEObject)techRef;
			techRef = (Technology)eResolveProxy(oldTechRef);
			if (techRef != oldTechRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RecipePackage.MAPPING_TECNOLOGIY__TECH_REF, oldTechRef, techRef));
			}
		}
		return techRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Technology basicGetTechRef() {
		return techRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTechRef(Technology newTechRef) {
		Technology oldTechRef = techRef;
		techRef = newTechRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecipePackage.MAPPING_TECNOLOGIY__TECH_REF, oldTechRef, techRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Option getValueRef() {
		if (valueRef != null && valueRef.eIsProxy()) {
			InternalEObject oldValueRef = (InternalEObject)valueRef;
			valueRef = (Option)eResolveProxy(oldValueRef);
			if (valueRef != oldValueRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RecipePackage.MAPPING_TECNOLOGIY__VALUE_REF, oldValueRef, valueRef));
			}
		}
		return valueRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Option basicGetValueRef() {
		return valueRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueRef(Option newValueRef) {
		Option oldValueRef = valueRef;
		valueRef = newValueRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecipePackage.MAPPING_TECNOLOGIY__VALUE_REF, oldValueRef, valueRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RecipePackage.MAPPING_TECNOLOGIY__UID:
				return getUid();
			case RecipePackage.MAPPING_TECNOLOGIY__TECH_REF:
				if (resolve) return getTechRef();
				return basicGetTechRef();
			case RecipePackage.MAPPING_TECNOLOGIY__VALUE_REF:
				if (resolve) return getValueRef();
				return basicGetValueRef();
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
			case RecipePackage.MAPPING_TECNOLOGIY__UID:
				setUid((String)newValue);
				return;
			case RecipePackage.MAPPING_TECNOLOGIY__TECH_REF:
				setTechRef((Technology)newValue);
				return;
			case RecipePackage.MAPPING_TECNOLOGIY__VALUE_REF:
				setValueRef((Option)newValue);
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
			case RecipePackage.MAPPING_TECNOLOGIY__UID:
				setUid(UID_EDEFAULT);
				return;
			case RecipePackage.MAPPING_TECNOLOGIY__TECH_REF:
				setTechRef((Technology)null);
				return;
			case RecipePackage.MAPPING_TECNOLOGIY__VALUE_REF:
				setValueRef((Option)null);
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
			case RecipePackage.MAPPING_TECNOLOGIY__UID:
				return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
			case RecipePackage.MAPPING_TECNOLOGIY__TECH_REF:
				return techRef != null;
			case RecipePackage.MAPPING_TECNOLOGIY__VALUE_REF:
				return valueRef != null;
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

} //MappingTecnologiyImpl
