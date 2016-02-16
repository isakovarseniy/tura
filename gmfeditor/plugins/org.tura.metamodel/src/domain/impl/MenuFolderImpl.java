/**
 */
package domain.impl;

import domain.Categorized;
import domain.Classifier;
import domain.Context;
import domain.DomainPackage;
import domain.EnabledUIItem;
import domain.HTMLLayerHolder;
import domain.ItemIcon;
import domain.MenuElement;
import domain.MenuExtensionPoint;
import domain.MenuExtensionRef;
import domain.MenuFolder;

import domain.MultiLangLabel;
import domain.StyleClass;
import domain.StyleElement;
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
 * An implementation of the model object '<em><b>Menu Folder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link domain.impl.MenuFolderImpl#getEnabled <em>Enabled</em>}</li>
 *   <li>{@link domain.impl.MenuFolderImpl#getClassifiers <em>Classifiers</em>}</li>
 *   <li>{@link domain.impl.MenuFolderImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link domain.impl.MenuFolderImpl#getStyleClass <em>Style Class</em>}</li>
 *   <li>{@link domain.impl.MenuFolderImpl#getMultiLangLabel <em>Multi Lang Label</em>}</li>
 *   <li>{@link domain.impl.MenuFolderImpl#getIcon <em>Icon</em>}</li>
 *   <li>{@link domain.impl.MenuFolderImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.impl.MenuFolderImpl#getName <em>Name</em>}</li>
 *   <li>{@link domain.impl.MenuFolderImpl#isExtensionPoint <em>Extension Point</em>}</li>
 *   <li>{@link domain.impl.MenuFolderImpl#getMenuElements <em>Menu Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MenuFolderImpl extends HTMLLayerHolderImpl implements MenuFolder {
	/**
	 * The cached value of the '{@link #getEnabled() <em>Enabled</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnabled()
	 * @generated
	 * @ordered
	 */
	protected Context enabled;

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
	 * The cached value of the '{@link #getStyle() <em>Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected Context style;

	/**
	 * The cached value of the '{@link #getStyleClass() <em>Style Class</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleClass()
	 * @generated
	 * @ordered
	 */
	protected EList<StyleClass> styleClass;

	/**
	 * The cached value of the '{@link #getMultiLangLabel() <em>Multi Lang Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiLangLabel()
	 * @generated
	 * @ordered
	 */
	protected Context multiLangLabel;

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
	 * The default value of the '{@link #isExtensionPoint() <em>Extension Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExtensionPoint()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXTENSION_POINT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExtensionPoint() <em>Extension Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExtensionPoint()
	 * @generated
	 * @ordered
	 */
	protected boolean extensionPoint = EXTENSION_POINT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMenuElements() <em>Menu Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMenuElements()
	 * @generated
	 * @ordered
	 */
	protected EList<MenuElement> menuElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MenuFolderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.MENU_FOLDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Context getEnabled() {
		return enabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnabled(Context newEnabled, NotificationChain msgs) {
		Context oldEnabled = enabled;
		enabled = newEnabled;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.MENU_FOLDER__ENABLED, oldEnabled, newEnabled);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnabled(Context newEnabled) {
		if (newEnabled != enabled) {
			NotificationChain msgs = null;
			if (enabled != null)
				msgs = ((InternalEObject)enabled).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.MENU_FOLDER__ENABLED, null, msgs);
			if (newEnabled != null)
				msgs = ((InternalEObject)newEnabled).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainPackage.MENU_FOLDER__ENABLED, null, msgs);
			msgs = basicSetEnabled(newEnabled, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.MENU_FOLDER__ENABLED, newEnabled, newEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> getClassifiers() {
		if (classifiers == null) {
			classifiers = new EObjectContainmentEList<Classifier>(Classifier.class, this, DomainPackage.MENU_FOLDER__CLASSIFIERS);
		}
		return classifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Context getStyle() {
		return style;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStyle(Context newStyle, NotificationChain msgs) {
		Context oldStyle = style;
		style = newStyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.MENU_FOLDER__STYLE, oldStyle, newStyle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyle(Context newStyle) {
		if (newStyle != style) {
			NotificationChain msgs = null;
			if (style != null)
				msgs = ((InternalEObject)style).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.MENU_FOLDER__STYLE, null, msgs);
			if (newStyle != null)
				msgs = ((InternalEObject)newStyle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainPackage.MENU_FOLDER__STYLE, null, msgs);
			msgs = basicSetStyle(newStyle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.MENU_FOLDER__STYLE, newStyle, newStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StyleClass> getStyleClass() {
		if (styleClass == null) {
			styleClass = new EObjectContainmentEList<StyleClass>(StyleClass.class, this, DomainPackage.MENU_FOLDER__STYLE_CLASS);
		}
		return styleClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Context getMultiLangLabel() {
		return multiLangLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultiLangLabel(Context newMultiLangLabel, NotificationChain msgs) {
		Context oldMultiLangLabel = multiLangLabel;
		multiLangLabel = newMultiLangLabel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.MENU_FOLDER__MULTI_LANG_LABEL, oldMultiLangLabel, newMultiLangLabel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiLangLabel(Context newMultiLangLabel) {
		if (newMultiLangLabel != multiLangLabel) {
			NotificationChain msgs = null;
			if (multiLangLabel != null)
				msgs = ((InternalEObject)multiLangLabel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.MENU_FOLDER__MULTI_LANG_LABEL, null, msgs);
			if (newMultiLangLabel != null)
				msgs = ((InternalEObject)newMultiLangLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainPackage.MENU_FOLDER__MULTI_LANG_LABEL, null, msgs);
			msgs = basicSetMultiLangLabel(newMultiLangLabel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.MENU_FOLDER__MULTI_LANG_LABEL, newMultiLangLabel, newMultiLangLabel));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.MENU_FOLDER__ICON, oldIcon, newIcon);
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
				msgs = ((InternalEObject)icon).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.MENU_FOLDER__ICON, null, msgs);
			if (newIcon != null)
				msgs = ((InternalEObject)newIcon).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainPackage.MENU_FOLDER__ICON, null, msgs);
			msgs = basicSetIcon(newIcon, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.MENU_FOLDER__ICON, newIcon, newIcon));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.MENU_FOLDER__UID, oldUid, uid));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.MENU_FOLDER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isExtensionPoint() {
		return extensionPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtensionPoint(boolean newExtensionPoint) {
		boolean oldExtensionPoint = extensionPoint;
		extensionPoint = newExtensionPoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.MENU_FOLDER__EXTENSION_POINT, oldExtensionPoint, extensionPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MenuElement> getMenuElements() {
		if (menuElements == null) {
			menuElements = new EObjectContainmentEList<MenuElement>(MenuElement.class, this, DomainPackage.MENU_FOLDER__MENU_ELEMENTS);
		}
		return menuElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomainPackage.MENU_FOLDER__ENABLED:
				return basicSetEnabled(null, msgs);
			case DomainPackage.MENU_FOLDER__CLASSIFIERS:
				return ((InternalEList<?>)getClassifiers()).basicRemove(otherEnd, msgs);
			case DomainPackage.MENU_FOLDER__STYLE:
				return basicSetStyle(null, msgs);
			case DomainPackage.MENU_FOLDER__STYLE_CLASS:
				return ((InternalEList<?>)getStyleClass()).basicRemove(otherEnd, msgs);
			case DomainPackage.MENU_FOLDER__MULTI_LANG_LABEL:
				return basicSetMultiLangLabel(null, msgs);
			case DomainPackage.MENU_FOLDER__ICON:
				return basicSetIcon(null, msgs);
			case DomainPackage.MENU_FOLDER__MENU_ELEMENTS:
				return ((InternalEList<?>)getMenuElements()).basicRemove(otherEnd, msgs);
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
			case DomainPackage.MENU_FOLDER__ENABLED:
				return getEnabled();
			case DomainPackage.MENU_FOLDER__CLASSIFIERS:
				return getClassifiers();
			case DomainPackage.MENU_FOLDER__STYLE:
				return getStyle();
			case DomainPackage.MENU_FOLDER__STYLE_CLASS:
				return getStyleClass();
			case DomainPackage.MENU_FOLDER__MULTI_LANG_LABEL:
				return getMultiLangLabel();
			case DomainPackage.MENU_FOLDER__ICON:
				return getIcon();
			case DomainPackage.MENU_FOLDER__UID:
				return getUid();
			case DomainPackage.MENU_FOLDER__NAME:
				return getName();
			case DomainPackage.MENU_FOLDER__EXTENSION_POINT:
				return isExtensionPoint();
			case DomainPackage.MENU_FOLDER__MENU_ELEMENTS:
				return getMenuElements();
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
			case DomainPackage.MENU_FOLDER__ENABLED:
				setEnabled((Context)newValue);
				return;
			case DomainPackage.MENU_FOLDER__CLASSIFIERS:
				getClassifiers().clear();
				getClassifiers().addAll((Collection<? extends Classifier>)newValue);
				return;
			case DomainPackage.MENU_FOLDER__STYLE:
				setStyle((Context)newValue);
				return;
			case DomainPackage.MENU_FOLDER__STYLE_CLASS:
				getStyleClass().clear();
				getStyleClass().addAll((Collection<? extends StyleClass>)newValue);
				return;
			case DomainPackage.MENU_FOLDER__MULTI_LANG_LABEL:
				setMultiLangLabel((Context)newValue);
				return;
			case DomainPackage.MENU_FOLDER__ICON:
				setIcon((Context)newValue);
				return;
			case DomainPackage.MENU_FOLDER__UID:
				setUid((String)newValue);
				return;
			case DomainPackage.MENU_FOLDER__NAME:
				setName((String)newValue);
				return;
			case DomainPackage.MENU_FOLDER__EXTENSION_POINT:
				setExtensionPoint((Boolean)newValue);
				return;
			case DomainPackage.MENU_FOLDER__MENU_ELEMENTS:
				getMenuElements().clear();
				getMenuElements().addAll((Collection<? extends MenuElement>)newValue);
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
			case DomainPackage.MENU_FOLDER__ENABLED:
				setEnabled((Context)null);
				return;
			case DomainPackage.MENU_FOLDER__CLASSIFIERS:
				getClassifiers().clear();
				return;
			case DomainPackage.MENU_FOLDER__STYLE:
				setStyle((Context)null);
				return;
			case DomainPackage.MENU_FOLDER__STYLE_CLASS:
				getStyleClass().clear();
				return;
			case DomainPackage.MENU_FOLDER__MULTI_LANG_LABEL:
				setMultiLangLabel((Context)null);
				return;
			case DomainPackage.MENU_FOLDER__ICON:
				setIcon((Context)null);
				return;
			case DomainPackage.MENU_FOLDER__UID:
				setUid(UID_EDEFAULT);
				return;
			case DomainPackage.MENU_FOLDER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DomainPackage.MENU_FOLDER__EXTENSION_POINT:
				setExtensionPoint(EXTENSION_POINT_EDEFAULT);
				return;
			case DomainPackage.MENU_FOLDER__MENU_ELEMENTS:
				getMenuElements().clear();
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
			case DomainPackage.MENU_FOLDER__ENABLED:
				return enabled != null;
			case DomainPackage.MENU_FOLDER__CLASSIFIERS:
				return classifiers != null && !classifiers.isEmpty();
			case DomainPackage.MENU_FOLDER__STYLE:
				return style != null;
			case DomainPackage.MENU_FOLDER__STYLE_CLASS:
				return styleClass != null && !styleClass.isEmpty();
			case DomainPackage.MENU_FOLDER__MULTI_LANG_LABEL:
				return multiLangLabel != null;
			case DomainPackage.MENU_FOLDER__ICON:
				return icon != null;
			case DomainPackage.MENU_FOLDER__UID:
				return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
			case DomainPackage.MENU_FOLDER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DomainPackage.MENU_FOLDER__EXTENSION_POINT:
				return extensionPoint != EXTENSION_POINT_EDEFAULT;
			case DomainPackage.MENU_FOLDER__MENU_ELEMENTS:
				return menuElements != null && !menuElements.isEmpty();
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
		if (baseClass == EnabledUIItem.class) {
			switch (derivedFeatureID) {
				case DomainPackage.MENU_FOLDER__ENABLED: return DomainPackage.ENABLED_UI_ITEM__ENABLED;
				default: return -1;
			}
		}
		if (baseClass == Categorized.class) {
			switch (derivedFeatureID) {
				case DomainPackage.MENU_FOLDER__CLASSIFIERS: return DomainPackage.CATEGORIZED__CLASSIFIERS;
				default: return -1;
			}
		}
		if (baseClass == StyleElement.class) {
			switch (derivedFeatureID) {
				case DomainPackage.MENU_FOLDER__STYLE: return DomainPackage.STYLE_ELEMENT__STYLE;
				case DomainPackage.MENU_FOLDER__STYLE_CLASS: return DomainPackage.STYLE_ELEMENT__STYLE_CLASS;
				default: return -1;
			}
		}
		if (baseClass == MultiLangLabel.class) {
			switch (derivedFeatureID) {
				case DomainPackage.MENU_FOLDER__MULTI_LANG_LABEL: return DomainPackage.MULTI_LANG_LABEL__MULTI_LANG_LABEL;
				default: return -1;
			}
		}
		if (baseClass == ItemIcon.class) {
			switch (derivedFeatureID) {
				case DomainPackage.MENU_FOLDER__ICON: return DomainPackage.ITEM_ICON__ICON;
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
		if (baseClass == EnabledUIItem.class) {
			switch (baseFeatureID) {
				case DomainPackage.ENABLED_UI_ITEM__ENABLED: return DomainPackage.MENU_FOLDER__ENABLED;
				default: return -1;
			}
		}
		if (baseClass == Categorized.class) {
			switch (baseFeatureID) {
				case DomainPackage.CATEGORIZED__CLASSIFIERS: return DomainPackage.MENU_FOLDER__CLASSIFIERS;
				default: return -1;
			}
		}
		if (baseClass == StyleElement.class) {
			switch (baseFeatureID) {
				case DomainPackage.STYLE_ELEMENT__STYLE: return DomainPackage.MENU_FOLDER__STYLE;
				case DomainPackage.STYLE_ELEMENT__STYLE_CLASS: return DomainPackage.MENU_FOLDER__STYLE_CLASS;
				default: return -1;
			}
		}
		if (baseClass == MultiLangLabel.class) {
			switch (baseFeatureID) {
				case DomainPackage.MULTI_LANG_LABEL__MULTI_LANG_LABEL: return DomainPackage.MENU_FOLDER__MULTI_LANG_LABEL;
				default: return -1;
			}
		}
		if (baseClass == ItemIcon.class) {
			switch (baseFeatureID) {
				case DomainPackage.ITEM_ICON__ICON: return DomainPackage.MENU_FOLDER__ICON;
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
		result.append(", extensionPoint: ");
		result.append(extensionPoint);
		result.append(')');
		return result.toString();
	}

} //MenuFolderImpl
