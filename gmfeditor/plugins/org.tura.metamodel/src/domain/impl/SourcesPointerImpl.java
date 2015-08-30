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

import domain.DataControl;
import domain.DomainPackage;
import domain.SourcesPointer;
import domain.Type;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sources Pointer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link domain.impl.SourcesPointerImpl#getSourcePointer <em>Source Pointer</em>}</li>
 *   <li>{@link domain.impl.SourcesPointerImpl#getValuePointer <em>Value Pointer</em>}</li>
 *   <li>{@link domain.impl.SourcesPointerImpl#getSourceCast <em>Source Cast</em>}</li>
 *   <li>{@link domain.impl.SourcesPointerImpl#getSourceCastDataControl <em>Source Cast Data Control</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SourcesPointerImpl extends UielementImpl implements SourcesPointer {
	/**
	 * The cached value of the '{@link #getSourcePointer() <em>Source Pointer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourcePointer()
	 * @generated
	 * @ordered
	 */
	protected DataControl sourcePointer;

	/**
	 * The cached value of the '{@link #getValuePointer() <em>Value Pointer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValuePointer()
	 * @generated
	 * @ordered
	 */
	protected EObject valuePointer;

	/**
	 * The cached value of the '{@link #getSourceCast() <em>Source Cast</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceCast()
	 * @generated
	 * @ordered
	 */
	protected Type sourceCast;

	/**
	 * The cached value of the '{@link #getSourceCastDataControl() <em>Source Cast Data Control</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceCastDataControl()
	 * @generated
	 * @ordered
	 */
	protected DataControl sourceCastDataControl;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SourcesPointerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.SOURCES_POINTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataControl getSourcePointer() {
		if (sourcePointer != null && sourcePointer.eIsProxy()) {
			InternalEObject oldSourcePointer = (InternalEObject)sourcePointer;
			sourcePointer = (DataControl)eResolveProxy(oldSourcePointer);
			if (sourcePointer != oldSourcePointer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.SOURCES_POINTER__SOURCE_POINTER, oldSourcePointer, sourcePointer));
			}
		}
		return sourcePointer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataControl basicGetSourcePointer() {
		return sourcePointer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourcePointer(DataControl newSourcePointer) {
		DataControl oldSourcePointer = sourcePointer;
		sourcePointer = newSourcePointer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.SOURCES_POINTER__SOURCE_POINTER, oldSourcePointer, sourcePointer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getValuePointer() {
		if (valuePointer != null && valuePointer.eIsProxy()) {
			InternalEObject oldValuePointer = (InternalEObject)valuePointer;
			valuePointer = eResolveProxy(oldValuePointer);
			if (valuePointer != oldValuePointer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.SOURCES_POINTER__VALUE_POINTER, oldValuePointer, valuePointer));
			}
		}
		return valuePointer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetValuePointer() {
		return valuePointer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValuePointer(EObject newValuePointer) {
		EObject oldValuePointer = valuePointer;
		valuePointer = newValuePointer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.SOURCES_POINTER__VALUE_POINTER, oldValuePointer, valuePointer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getSourceCast() {
		if (sourceCast != null && sourceCast.eIsProxy()) {
			InternalEObject oldSourceCast = (InternalEObject)sourceCast;
			sourceCast = (Type)eResolveProxy(oldSourceCast);
			if (sourceCast != oldSourceCast) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.SOURCES_POINTER__SOURCE_CAST, oldSourceCast, sourceCast));
			}
		}
		return sourceCast;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetSourceCast() {
		return sourceCast;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceCast(Type newSourceCast) {
		Type oldSourceCast = sourceCast;
		sourceCast = newSourceCast;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.SOURCES_POINTER__SOURCE_CAST, oldSourceCast, sourceCast));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataControl getSourceCastDataControl() {
		if (sourceCastDataControl != null && sourceCastDataControl.eIsProxy()) {
			InternalEObject oldSourceCastDataControl = (InternalEObject)sourceCastDataControl;
			sourceCastDataControl = (DataControl)eResolveProxy(oldSourceCastDataControl);
			if (sourceCastDataControl != oldSourceCastDataControl) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.SOURCES_POINTER__SOURCE_CAST_DATA_CONTROL, oldSourceCastDataControl, sourceCastDataControl));
			}
		}
		return sourceCastDataControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataControl basicGetSourceCastDataControl() {
		return sourceCastDataControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceCastDataControl(DataControl newSourceCastDataControl) {
		DataControl oldSourceCastDataControl = sourceCastDataControl;
		sourceCastDataControl = newSourceCastDataControl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.SOURCES_POINTER__SOURCE_CAST_DATA_CONTROL, oldSourceCastDataControl, sourceCastDataControl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DomainPackage.SOURCES_POINTER__SOURCE_POINTER:
				if (resolve) return getSourcePointer();
				return basicGetSourcePointer();
			case DomainPackage.SOURCES_POINTER__VALUE_POINTER:
				if (resolve) return getValuePointer();
				return basicGetValuePointer();
			case DomainPackage.SOURCES_POINTER__SOURCE_CAST:
				if (resolve) return getSourceCast();
				return basicGetSourceCast();
			case DomainPackage.SOURCES_POINTER__SOURCE_CAST_DATA_CONTROL:
				if (resolve) return getSourceCastDataControl();
				return basicGetSourceCastDataControl();
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
			case DomainPackage.SOURCES_POINTER__SOURCE_POINTER:
				setSourcePointer((DataControl)newValue);
				return;
			case DomainPackage.SOURCES_POINTER__VALUE_POINTER:
				setValuePointer((EObject)newValue);
				return;
			case DomainPackage.SOURCES_POINTER__SOURCE_CAST:
				setSourceCast((Type)newValue);
				return;
			case DomainPackage.SOURCES_POINTER__SOURCE_CAST_DATA_CONTROL:
				setSourceCastDataControl((DataControl)newValue);
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
			case DomainPackage.SOURCES_POINTER__SOURCE_POINTER:
				setSourcePointer((DataControl)null);
				return;
			case DomainPackage.SOURCES_POINTER__VALUE_POINTER:
				setValuePointer((EObject)null);
				return;
			case DomainPackage.SOURCES_POINTER__SOURCE_CAST:
				setSourceCast((Type)null);
				return;
			case DomainPackage.SOURCES_POINTER__SOURCE_CAST_DATA_CONTROL:
				setSourceCastDataControl((DataControl)null);
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
			case DomainPackage.SOURCES_POINTER__SOURCE_POINTER:
				return sourcePointer != null;
			case DomainPackage.SOURCES_POINTER__VALUE_POINTER:
				return valuePointer != null;
			case DomainPackage.SOURCES_POINTER__SOURCE_CAST:
				return sourceCast != null;
			case DomainPackage.SOURCES_POINTER__SOURCE_CAST_DATA_CONTROL:
				return sourceCastDataControl != null;
		}
		return super.eIsSet(featureID);
	}

} //SourcesPointerImpl
