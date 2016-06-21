/**
 */
package form.impl;

import form.Context;
import form.FormPackage;
import form.ItemIcon;
import form.MenuFolder;
import form.SubMenu;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub Menu</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link form.impl.SubMenuImpl#getIcon <em>Icon</em>}</li>
 *   <li>{@link form.impl.SubMenuImpl#getToSubmenu <em>To Submenu</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubMenuImpl extends MenuElementImpl implements SubMenu {
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
	 * The cached value of the '{@link #getToSubmenu() <em>To Submenu</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToSubmenu()
	 * @generated
	 * @ordered
	 */
	protected MenuFolder toSubmenu;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubMenuImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FormPackage.Literals.SUB_MENU;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FormPackage.SUB_MENU__ICON, oldIcon, newIcon);
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
				msgs = ((InternalEObject)icon).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FormPackage.SUB_MENU__ICON, null, msgs);
			if (newIcon != null)
				msgs = ((InternalEObject)newIcon).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FormPackage.SUB_MENU__ICON, null, msgs);
			msgs = basicSetIcon(newIcon, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.SUB_MENU__ICON, newIcon, newIcon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MenuFolder getToSubmenu() {
		if (toSubmenu != null && toSubmenu.eIsProxy()) {
			InternalEObject oldToSubmenu = (InternalEObject)toSubmenu;
			toSubmenu = (MenuFolder)eResolveProxy(oldToSubmenu);
			if (toSubmenu != oldToSubmenu) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FormPackage.SUB_MENU__TO_SUBMENU, oldToSubmenu, toSubmenu));
			}
		}
		return toSubmenu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MenuFolder basicGetToSubmenu() {
		return toSubmenu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToSubmenu(MenuFolder newToSubmenu) {
		MenuFolder oldToSubmenu = toSubmenu;
		toSubmenu = newToSubmenu;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.SUB_MENU__TO_SUBMENU, oldToSubmenu, toSubmenu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FormPackage.SUB_MENU__ICON:
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
			case FormPackage.SUB_MENU__ICON:
				return getIcon();
			case FormPackage.SUB_MENU__TO_SUBMENU:
				if (resolve) return getToSubmenu();
				return basicGetToSubmenu();
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
			case FormPackage.SUB_MENU__ICON:
				setIcon((Context)newValue);
				return;
			case FormPackage.SUB_MENU__TO_SUBMENU:
				setToSubmenu((MenuFolder)newValue);
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
			case FormPackage.SUB_MENU__ICON:
				setIcon((Context)null);
				return;
			case FormPackage.SUB_MENU__TO_SUBMENU:
				setToSubmenu((MenuFolder)null);
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
			case FormPackage.SUB_MENU__ICON:
				return icon != null;
			case FormPackage.SUB_MENU__TO_SUBMENU:
				return toSubmenu != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ItemIcon.class) {
			switch (derivedFeatureID) {
				case FormPackage.SUB_MENU__ICON: return FormPackage.ITEM_ICON__ICON;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ItemIcon.class) {
			switch (baseFeatureID) {
				case FormPackage.ITEM_ICON__ICON: return FormPackage.SUB_MENU__ICON;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //SubMenuImpl
