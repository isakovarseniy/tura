/**
 */
package form.impl;

import form.Context;
import form.DropDownSelection;
import form.FormPackage;
import form.Selection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Drop Down Selection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link form.impl.DropDownSelectionImpl#getSelection <em>Selection</em>}</li>
 *   <li>{@link form.impl.DropDownSelectionImpl#getInitialOptionMessage <em>Initial Option Message</em>}</li>
 *   <li>{@link form.impl.DropDownSelectionImpl#getInitialOptionValue <em>Initial Option Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DropDownSelectionImpl extends OptionSelectionImpl implements DropDownSelection {
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
	protected DropDownSelectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FormPackage.Literals.DROP_DOWN_SELECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FormPackage.DROP_DOWN_SELECTION__SELECTION, oldSelection, newSelection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelection(Selection newSelection) {
		if (newSelection != selection) {
			NotificationChain msgs = null;
			if (selection != null)
				msgs = ((InternalEObject)selection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FormPackage.DROP_DOWN_SELECTION__SELECTION, null, msgs);
			if (newSelection != null)
				msgs = ((InternalEObject)newSelection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FormPackage.DROP_DOWN_SELECTION__SELECTION, null, msgs);
			msgs = basicSetSelection(newSelection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.DROP_DOWN_SELECTION__SELECTION, newSelection, newSelection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FormPackage.DROP_DOWN_SELECTION__INITIAL_OPTION_MESSAGE, oldInitialOptionMessage, newInitialOptionMessage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialOptionMessage(Context newInitialOptionMessage) {
		if (newInitialOptionMessage != initialOptionMessage) {
			NotificationChain msgs = null;
			if (initialOptionMessage != null)
				msgs = ((InternalEObject)initialOptionMessage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FormPackage.DROP_DOWN_SELECTION__INITIAL_OPTION_MESSAGE, null, msgs);
			if (newInitialOptionMessage != null)
				msgs = ((InternalEObject)newInitialOptionMessage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FormPackage.DROP_DOWN_SELECTION__INITIAL_OPTION_MESSAGE, null, msgs);
			msgs = basicSetInitialOptionMessage(newInitialOptionMessage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.DROP_DOWN_SELECTION__INITIAL_OPTION_MESSAGE, newInitialOptionMessage, newInitialOptionMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInitialOptionValue() {
		return initialOptionValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialOptionValue(String newInitialOptionValue) {
		String oldInitialOptionValue = initialOptionValue;
		initialOptionValue = newInitialOptionValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.DROP_DOWN_SELECTION__INITIAL_OPTION_VALUE, oldInitialOptionValue, initialOptionValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FormPackage.DROP_DOWN_SELECTION__SELECTION:
				return basicSetSelection(null, msgs);
			case FormPackage.DROP_DOWN_SELECTION__INITIAL_OPTION_MESSAGE:
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
			case FormPackage.DROP_DOWN_SELECTION__SELECTION:
				return getSelection();
			case FormPackage.DROP_DOWN_SELECTION__INITIAL_OPTION_MESSAGE:
				return getInitialOptionMessage();
			case FormPackage.DROP_DOWN_SELECTION__INITIAL_OPTION_VALUE:
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
			case FormPackage.DROP_DOWN_SELECTION__SELECTION:
				setSelection((Selection)newValue);
				return;
			case FormPackage.DROP_DOWN_SELECTION__INITIAL_OPTION_MESSAGE:
				setInitialOptionMessage((Context)newValue);
				return;
			case FormPackage.DROP_DOWN_SELECTION__INITIAL_OPTION_VALUE:
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
			case FormPackage.DROP_DOWN_SELECTION__SELECTION:
				setSelection((Selection)null);
				return;
			case FormPackage.DROP_DOWN_SELECTION__INITIAL_OPTION_MESSAGE:
				setInitialOptionMessage((Context)null);
				return;
			case FormPackage.DROP_DOWN_SELECTION__INITIAL_OPTION_VALUE:
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
			case FormPackage.DROP_DOWN_SELECTION__SELECTION:
				return selection != null;
			case FormPackage.DROP_DOWN_SELECTION__INITIAL_OPTION_MESSAGE:
				return initialOptionMessage != null;
			case FormPackage.DROP_DOWN_SELECTION__INITIAL_OPTION_VALUE:
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (initialOptionValue: ");
		result.append(initialOptionValue);
		result.append(')');
		return result.toString();
	}

} //DropDownSelectionImpl
