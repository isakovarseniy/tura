/**
 */
package tura.form.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tura.form.Context;
import tura.form.FormPackage;
import tura.form.ItemIcon;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item Icon</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tura.form.impl.ItemIconImpl#getIcon <em>Icon</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ItemIconImpl extends MinimalEObjectImpl.Container implements ItemIcon {
	/**
	 * The cached value of the '{@link #getIcon() <em>Icon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcon()
	 * @generated
	 * @ordered
	 */
	protected Context icon;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemIconImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FormPackage.Literals.ITEM_ICON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Context getIcon() {
		return icon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIcon(Context newIcon, NotificationChain msgs) {
		Context oldIcon = icon;
		icon = newIcon;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FormPackage.ITEM_ICON__ICON, oldIcon, newIcon);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIcon(Context newIcon) {
		if (newIcon != icon) {
			NotificationChain msgs = null;
			if (icon != null)
				msgs = ((InternalEObject)icon).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FormPackage.ITEM_ICON__ICON, null, msgs);
			if (newIcon != null)
				msgs = ((InternalEObject)newIcon).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FormPackage.ITEM_ICON__ICON, null, msgs);
			msgs = basicSetIcon(newIcon, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.ITEM_ICON__ICON, newIcon, newIcon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FormPackage.ITEM_ICON__ICON:
				return basicSetIcon(null, msgs);
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
			case FormPackage.ITEM_ICON__ICON:
				return getIcon();
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
			case FormPackage.ITEM_ICON__ICON:
				setIcon((Context)newValue);
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
			case FormPackage.ITEM_ICON__ICON:
				setIcon((Context)null);
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
			case FormPackage.ITEM_ICON__ICON:
				return icon != null;
		}
		return super.eIsSet(featureID);
	}

} //ItemIconImpl
