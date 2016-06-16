/**
 */
package tura.form.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import tura.form.DataControl;
import tura.form.FormPackage;
import tura.form.OptionSelection;

import tura.type.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Option Selection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tura.form.impl.OptionSelectionImpl#getOptionPointer <em>Option Pointer</em>}</li>
 *   <li>{@link tura.form.impl.OptionSelectionImpl#getOptionCast <em>Option Cast</em>}</li>
 *   <li>{@link tura.form.impl.OptionSelectionImpl#getOptionCastDataControl <em>Option Cast Data Control</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OptionSelectionImpl extends InputElementImpl implements OptionSelection {
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
		}
		return super.eIsSet(featureID);
	}

} //OptionSelectionImpl
