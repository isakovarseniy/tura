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
package form.impl;

import form.Context;
import form.DataControl;
import form.FormPackage;
import form.OptionSelection;
import form.Selection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import type.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Option Selection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link form.impl.OptionSelectionImpl#getOptionPointer <em>Option Pointer</em>}</li>
 *   <li>{@link form.impl.OptionSelectionImpl#getOptionCast <em>Option Cast</em>}</li>
 *   <li>{@link form.impl.OptionSelectionImpl#getOptionCastDataControl <em>Option Cast Data Control</em>}</li>
 *   <li>{@link form.impl.OptionSelectionImpl#getSelection <em>Selection</em>}</li>
 *   <li>{@link form.impl.OptionSelectionImpl#getInitialOptionMessage <em>Initial Option Message</em>}</li>
 *   <li>{@link form.impl.OptionSelectionImpl#getInitialOptionValue <em>Initial Option Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OptionSelectionImpl extends EObjectImpl implements OptionSelection {
	/**
	 * The cached value of the '{@link #getOptionPointer() <em>Option Pointer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionPointer()
	 * @generated
	 * @ordered
	 */
	protected DataControl optionPointer;

	/**
	 * The cached value of the '{@link #getOptionCast() <em>Option Cast</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionCast()
	 * @generated
	 * @ordered
	 */
	protected Type optionCast;

	/**
	 * The cached value of the '{@link #getOptionCastDataControl() <em>Option Cast Data Control</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionCastDataControl()
	 * @generated
	 * @ordered
	 */
	protected DataControl optionCastDataControl;

	/**
	 * The cached value of the '{@link #getSelection() <em>Selection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelection()
	 * @generated
	 * @ordered
	 */
	protected Selection selection;

	/**
	 * The cached value of the '{@link #getInitialOptionMessage() <em>Initial Option Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialOptionMessage()
	 * @generated
	 * @ordered
	 */
	protected Context initialOptionMessage;

	/**
	 * The default value of the '{@link #getInitialOptionValue() <em>Initial Option Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialOptionValue()
	 * @generated
	 * @ordered
	 */
	protected static final String INITIAL_OPTION_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInitialOptionValue() <em>Initial Option Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialOptionValue()
	 * @generated
	 * @ordered
	 */
	protected String initialOptionValue = INITIAL_OPTION_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OptionSelectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FormPackage.Literals.OPTION_SELECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataControl getOptionPointer() {
		if (optionPointer != null && optionPointer.eIsProxy()) {
			InternalEObject oldOptionPointer = (InternalEObject)optionPointer;
			optionPointer = (DataControl)eResolveProxy(oldOptionPointer);
			if (optionPointer != oldOptionPointer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FormPackage.OPTION_SELECTION__OPTION_POINTER, oldOptionPointer, optionPointer));
			}
		}
		return optionPointer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataControl basicGetOptionPointer() {
		return optionPointer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOptionPointer(DataControl newOptionPointer) {
		DataControl oldOptionPointer = optionPointer;
		optionPointer = newOptionPointer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.OPTION_SELECTION__OPTION_POINTER, oldOptionPointer, optionPointer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getOptionCast() {
		if (optionCast != null && optionCast.eIsProxy()) {
			InternalEObject oldOptionCast = (InternalEObject)optionCast;
			optionCast = (Type)eResolveProxy(oldOptionCast);
			if (optionCast != oldOptionCast) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FormPackage.OPTION_SELECTION__OPTION_CAST, oldOptionCast, optionCast));
			}
		}
		return optionCast;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetOptionCast() {
		return optionCast;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOptionCast(Type newOptionCast) {
		Type oldOptionCast = optionCast;
		optionCast = newOptionCast;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.OPTION_SELECTION__OPTION_CAST, oldOptionCast, optionCast));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataControl getOptionCastDataControl() {
		if (optionCastDataControl != null && optionCastDataControl.eIsProxy()) {
			InternalEObject oldOptionCastDataControl = (InternalEObject)optionCastDataControl;
			optionCastDataControl = (DataControl)eResolveProxy(oldOptionCastDataControl);
			if (optionCastDataControl != oldOptionCastDataControl) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FormPackage.OPTION_SELECTION__OPTION_CAST_DATA_CONTROL, oldOptionCastDataControl, optionCastDataControl));
			}
		}
		return optionCastDataControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataControl basicGetOptionCastDataControl() {
		return optionCastDataControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOptionCastDataControl(DataControl newOptionCastDataControl) {
		DataControl oldOptionCastDataControl = optionCastDataControl;
		optionCastDataControl = newOptionCastDataControl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.OPTION_SELECTION__OPTION_CAST_DATA_CONTROL, oldOptionCastDataControl, optionCastDataControl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Selection getSelection() {
		return selection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSelection(Selection newSelection, NotificationChain msgs) {
		Selection oldSelection = selection;
		selection = newSelection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FormPackage.OPTION_SELECTION__SELECTION, oldSelection, newSelection);
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
	public void setSelection(Selection newSelection) {
		if (newSelection != selection) {
			NotificationChain msgs = null;
			if (selection != null)
				msgs = ((InternalEObject)selection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FormPackage.OPTION_SELECTION__SELECTION, null, msgs);
			if (newSelection != null)
				msgs = ((InternalEObject)newSelection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FormPackage.OPTION_SELECTION__SELECTION, null, msgs);
			msgs = basicSetSelection(newSelection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.OPTION_SELECTION__SELECTION, newSelection, newSelection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Context getInitialOptionMessage() {
		return initialOptionMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitialOptionMessage(Context newInitialOptionMessage, NotificationChain msgs) {
		Context oldInitialOptionMessage = initialOptionMessage;
		initialOptionMessage = newInitialOptionMessage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FormPackage.OPTION_SELECTION__INITIAL_OPTION_MESSAGE, oldInitialOptionMessage, newInitialOptionMessage);
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
	public void setInitialOptionMessage(Context newInitialOptionMessage) {
		if (newInitialOptionMessage != initialOptionMessage) {
			NotificationChain msgs = null;
			if (initialOptionMessage != null)
				msgs = ((InternalEObject)initialOptionMessage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FormPackage.OPTION_SELECTION__INITIAL_OPTION_MESSAGE, null, msgs);
			if (newInitialOptionMessage != null)
				msgs = ((InternalEObject)newInitialOptionMessage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FormPackage.OPTION_SELECTION__INITIAL_OPTION_MESSAGE, null, msgs);
			msgs = basicSetInitialOptionMessage(newInitialOptionMessage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.OPTION_SELECTION__INITIAL_OPTION_MESSAGE, newInitialOptionMessage, newInitialOptionMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInitialOptionValue() {
		return initialOptionValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInitialOptionValue(String newInitialOptionValue) {
		String oldInitialOptionValue = initialOptionValue;
		initialOptionValue = newInitialOptionValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.OPTION_SELECTION__INITIAL_OPTION_VALUE, oldInitialOptionValue, initialOptionValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FormPackage.OPTION_SELECTION__SELECTION:
				return basicSetSelection(null, msgs);
			case FormPackage.OPTION_SELECTION__INITIAL_OPTION_MESSAGE:
				return basicSetInitialOptionMessage(null, msgs);
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
			case FormPackage.OPTION_SELECTION__OPTION_POINTER:
				if (resolve) return getOptionPointer();
				return basicGetOptionPointer();
			case FormPackage.OPTION_SELECTION__OPTION_CAST:
				if (resolve) return getOptionCast();
				return basicGetOptionCast();
			case FormPackage.OPTION_SELECTION__OPTION_CAST_DATA_CONTROL:
				if (resolve) return getOptionCastDataControl();
				return basicGetOptionCastDataControl();
			case FormPackage.OPTION_SELECTION__SELECTION:
				return getSelection();
			case FormPackage.OPTION_SELECTION__INITIAL_OPTION_MESSAGE:
				return getInitialOptionMessage();
			case FormPackage.OPTION_SELECTION__INITIAL_OPTION_VALUE:
				return getInitialOptionValue();
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
			case FormPackage.OPTION_SELECTION__OPTION_POINTER:
				setOptionPointer((DataControl)newValue);
				return;
			case FormPackage.OPTION_SELECTION__OPTION_CAST:
				setOptionCast((Type)newValue);
				return;
			case FormPackage.OPTION_SELECTION__OPTION_CAST_DATA_CONTROL:
				setOptionCastDataControl((DataControl)newValue);
				return;
			case FormPackage.OPTION_SELECTION__SELECTION:
				setSelection((Selection)newValue);
				return;
			case FormPackage.OPTION_SELECTION__INITIAL_OPTION_MESSAGE:
				setInitialOptionMessage((Context)newValue);
				return;
			case FormPackage.OPTION_SELECTION__INITIAL_OPTION_VALUE:
				setInitialOptionValue((String)newValue);
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
			case FormPackage.OPTION_SELECTION__OPTION_POINTER:
				setOptionPointer((DataControl)null);
				return;
			case FormPackage.OPTION_SELECTION__OPTION_CAST:
				setOptionCast((Type)null);
				return;
			case FormPackage.OPTION_SELECTION__OPTION_CAST_DATA_CONTROL:
				setOptionCastDataControl((DataControl)null);
				return;
			case FormPackage.OPTION_SELECTION__SELECTION:
				setSelection((Selection)null);
				return;
			case FormPackage.OPTION_SELECTION__INITIAL_OPTION_MESSAGE:
				setInitialOptionMessage((Context)null);
				return;
			case FormPackage.OPTION_SELECTION__INITIAL_OPTION_VALUE:
				setInitialOptionValue(INITIAL_OPTION_VALUE_EDEFAULT);
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
			case FormPackage.OPTION_SELECTION__OPTION_POINTER:
				return optionPointer != null;
			case FormPackage.OPTION_SELECTION__OPTION_CAST:
				return optionCast != null;
			case FormPackage.OPTION_SELECTION__OPTION_CAST_DATA_CONTROL:
				return optionCastDataControl != null;
			case FormPackage.OPTION_SELECTION__SELECTION:
				return selection != null;
			case FormPackage.OPTION_SELECTION__INITIAL_OPTION_MESSAGE:
				return initialOptionMessage != null;
			case FormPackage.OPTION_SELECTION__INITIAL_OPTION_VALUE:
				return INITIAL_OPTION_VALUE_EDEFAULT == null ? initialOptionValue != null : !INITIAL_OPTION_VALUE_EDEFAULT.equals(initialOptionValue);
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
		result.append(" (initialOptionValue: ");
		result.append(initialOptionValue);
		result.append(')');
		return result.toString();
	}

} //OptionSelectionImpl
