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
package domain.impl;

import domain.DomainPackage;
import domain.MethodPointer;
import domain.Operation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Pointer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link domain.impl.MethodPointerImpl#getMethodRef <em>Method Ref</em>}</li>
 *   <li>{@link domain.impl.MethodPointerImpl#getFakeMethod <em>Fake Method</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MethodPointerImpl extends TypePointerImpl implements MethodPointer {
	/**
	 * The cached value of the '{@link #getMethodRef() <em>Method Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodRef()
	 * @generated
	 * @ordered
	 */
	protected Operation methodRef;

	/**
	 * The default value of the '{@link #getFakeMethod() <em>Fake Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFakeMethod()
	 * @generated
	 * @ordered
	 */
	protected static final String FAKE_METHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFakeMethod() <em>Fake Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFakeMethod()
	 * @generated
	 * @ordered
	 */
	protected String fakeMethod = FAKE_METHOD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodPointerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.METHOD_POINTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getMethodRef() {
		if (methodRef != null && methodRef.eIsProxy()) {
			InternalEObject oldMethodRef = (InternalEObject)methodRef;
			methodRef = (Operation)eResolveProxy(oldMethodRef);
			if (methodRef != oldMethodRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.METHOD_POINTER__METHOD_REF, oldMethodRef, methodRef));
			}
		}
		return methodRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation basicGetMethodRef() {
		return methodRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodRef(Operation newMethodRef) {
		Operation oldMethodRef = methodRef;
		methodRef = newMethodRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.METHOD_POINTER__METHOD_REF, oldMethodRef, methodRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFakeMethod() {
		return fakeMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFakeMethod(String newFakeMethod) {
		String oldFakeMethod = fakeMethod;
		fakeMethod = newFakeMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.METHOD_POINTER__FAKE_METHOD, oldFakeMethod, fakeMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DomainPackage.METHOD_POINTER__METHOD_REF:
				if (resolve) return getMethodRef();
				return basicGetMethodRef();
			case DomainPackage.METHOD_POINTER__FAKE_METHOD:
				return getFakeMethod();
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
			case DomainPackage.METHOD_POINTER__METHOD_REF:
				setMethodRef((Operation)newValue);
				return;
			case DomainPackage.METHOD_POINTER__FAKE_METHOD:
				setFakeMethod((String)newValue);
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
			case DomainPackage.METHOD_POINTER__METHOD_REF:
				setMethodRef((Operation)null);
				return;
			case DomainPackage.METHOD_POINTER__FAKE_METHOD:
				setFakeMethod(FAKE_METHOD_EDEFAULT);
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
			case DomainPackage.METHOD_POINTER__METHOD_REF:
				return methodRef != null;
			case DomainPackage.METHOD_POINTER__FAKE_METHOD:
				return FAKE_METHOD_EDEFAULT == null ? fakeMethod != null : !FAKE_METHOD_EDEFAULT.equals(fakeMethod);
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (fakeMethod: ");
		result.append(fakeMethod);
		result.append(')');
		return result.toString();
	}

} //MethodPointerImpl
