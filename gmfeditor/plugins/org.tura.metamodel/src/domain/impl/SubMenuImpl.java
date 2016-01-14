/**
 */
package domain.impl;

import domain.DomainPackage;
import domain.MenuFolder;
import domain.SubMenu;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub Menu</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link domain.impl.SubMenuImpl#getToSubmenu <em>To Submenu</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubMenuImpl extends MenuElementImpl implements SubMenu {
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
		return DomainPackage.Literals.SUB_MENU;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.SUB_MENU__TO_SUBMENU, oldToSubmenu, toSubmenu));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.SUB_MENU__TO_SUBMENU, oldToSubmenu, toSubmenu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DomainPackage.SUB_MENU__TO_SUBMENU:
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
			case DomainPackage.SUB_MENU__TO_SUBMENU:
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
			case DomainPackage.SUB_MENU__TO_SUBMENU:
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
			case DomainPackage.SUB_MENU__TO_SUBMENU:
				return toSubmenu != null;
		}
		return super.eIsSet(featureID);
	}

} //SubMenuImpl
