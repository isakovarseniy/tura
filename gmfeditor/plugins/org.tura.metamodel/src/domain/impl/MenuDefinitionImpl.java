/**
 */
package domain.impl;

import domain.Categorized;
import domain.Classifier;
import domain.DomainPackage;
import domain.MenuDefinition;
import domain.MenuView;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Menu Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link domain.impl.MenuDefinitionImpl#getClassifiers <em>Classifiers</em>}</li>
 *   <li>{@link domain.impl.MenuDefinitionImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.impl.MenuDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link domain.impl.MenuDefinitionImpl#getMenuView <em>Menu View</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MenuDefinitionImpl extends StyleElementImpl implements MenuDefinition {
	/**
	 * The cached value of the '{@link #getClassifiers() <em>Classifiers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<Classifier> classifiers;

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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMenuView() <em>Menu View</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMenuView()
	 * @generated
	 * @ordered
	 */
	protected MenuView menuView;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MenuDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.MENU_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> getClassifiers() {
		if (classifiers == null) {
			classifiers = new EObjectContainmentEList<Classifier>(Classifier.class, this, DomainPackage.MENU_DEFINITION__CLASSIFIERS);
		}
		return classifiers;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.MENU_DEFINITION__UID, oldUid, uid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.MENU_DEFINITION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MenuView getMenuView() {
		if (menuView != null && menuView.eIsProxy()) {
			InternalEObject oldMenuView = (InternalEObject)menuView;
			menuView = (MenuView)eResolveProxy(oldMenuView);
			if (menuView != oldMenuView) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.MENU_DEFINITION__MENU_VIEW, oldMenuView, menuView));
			}
		}
		return menuView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MenuView basicGetMenuView() {
		return menuView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMenuView(MenuView newMenuView, NotificationChain msgs) {
		MenuView oldMenuView = menuView;
		menuView = newMenuView;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.MENU_DEFINITION__MENU_VIEW, oldMenuView, newMenuView);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMenuView(MenuView newMenuView) {
		if (newMenuView != menuView) {
			NotificationChain msgs = null;
			if (menuView != null)
				msgs = ((InternalEObject)menuView).eInverseRemove(this, DomainPackage.MENU_VIEW__PARENT, MenuView.class, msgs);
			if (newMenuView != null)
				msgs = ((InternalEObject)newMenuView).eInverseAdd(this, DomainPackage.MENU_VIEW__PARENT, MenuView.class, msgs);
			msgs = basicSetMenuView(newMenuView, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.MENU_DEFINITION__MENU_VIEW, newMenuView, newMenuView));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomainPackage.MENU_DEFINITION__MENU_VIEW:
				if (menuView != null)
					msgs = ((InternalEObject)menuView).eInverseRemove(this, DomainPackage.MENU_VIEW__PARENT, MenuView.class, msgs);
				return basicSetMenuView((MenuView)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomainPackage.MENU_DEFINITION__CLASSIFIERS:
				return ((InternalEList<?>)getClassifiers()).basicRemove(otherEnd, msgs);
			case DomainPackage.MENU_DEFINITION__MENU_VIEW:
				return basicSetMenuView(null, msgs);
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
			case DomainPackage.MENU_DEFINITION__CLASSIFIERS:
				return getClassifiers();
			case DomainPackage.MENU_DEFINITION__UID:
				return getUid();
			case DomainPackage.MENU_DEFINITION__NAME:
				return getName();
			case DomainPackage.MENU_DEFINITION__MENU_VIEW:
				if (resolve) return getMenuView();
				return basicGetMenuView();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DomainPackage.MENU_DEFINITION__CLASSIFIERS:
				getClassifiers().clear();
				getClassifiers().addAll((Collection<? extends Classifier>)newValue);
				return;
			case DomainPackage.MENU_DEFINITION__UID:
				setUid((String)newValue);
				return;
			case DomainPackage.MENU_DEFINITION__NAME:
				setName((String)newValue);
				return;
			case DomainPackage.MENU_DEFINITION__MENU_VIEW:
				setMenuView((MenuView)newValue);
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
			case DomainPackage.MENU_DEFINITION__CLASSIFIERS:
				getClassifiers().clear();
				return;
			case DomainPackage.MENU_DEFINITION__UID:
				setUid(UID_EDEFAULT);
				return;
			case DomainPackage.MENU_DEFINITION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DomainPackage.MENU_DEFINITION__MENU_VIEW:
				setMenuView((MenuView)null);
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
			case DomainPackage.MENU_DEFINITION__CLASSIFIERS:
				return classifiers != null && !classifiers.isEmpty();
			case DomainPackage.MENU_DEFINITION__UID:
				return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
			case DomainPackage.MENU_DEFINITION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DomainPackage.MENU_DEFINITION__MENU_VIEW:
				return menuView != null;
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
		if (baseClass == Categorized.class) {
			switch (derivedFeatureID) {
				case DomainPackage.MENU_DEFINITION__CLASSIFIERS: return DomainPackage.CATEGORIZED__CLASSIFIERS;
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
		if (baseClass == Categorized.class) {
			switch (baseFeatureID) {
				case DomainPackage.CATEGORIZED__CLASSIFIERS: return DomainPackage.MENU_DEFINITION__CLASSIFIERS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (uid: ");
		result.append(uid);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //MenuDefinitionImpl
