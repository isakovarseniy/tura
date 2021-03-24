/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
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

import form.FormPackage;
import form.InternalRelation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import type.Assosiation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Internal Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link form.impl.InternalRelationImpl#getAssosiationRef <em>Assosiation Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InternalRelationImpl extends RelationImpl implements InternalRelation {
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
	protected InternalRelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FormPackage.Literals.INTERNAL_RELATION;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FormPackage.INTERNAL_RELATION__ASSOSIATION_REF, oldAssosiationRef, assosiationRef));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.INTERNAL_RELATION__ASSOSIATION_REF, oldAssosiationRef, assosiationRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FormPackage.INTERNAL_RELATION__ASSOSIATION_REF:
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
			case FormPackage.INTERNAL_RELATION__ASSOSIATION_REF:
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
			case FormPackage.INTERNAL_RELATION__ASSOSIATION_REF:
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
			case FormPackage.INTERNAL_RELATION__ASSOSIATION_REF:
				return assosiationRef != null;
		}
		return super.eIsSet(featureID);
	}

} //InternalRelationImpl
