/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
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

import artifact.ArtifactPackage;
import artifact.Categorized;
import artifact.Classifier;

import common.CommonPackage;
import common.Orderable;

import form.AreaRef;
import form.Context;
import form.EnabledUIItem;
import form.FlexField;
import form.FlexFields;
import form.FormPackage;
import form.MenuFolder;
import form.MenuHolder;
import form.NickNamed;
import form.SelectManyMenu;
import form.StyleElement;
import form.Uielement;

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
 * An implementation of the model object '<em><b>Select Many Menu</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link form.impl.SelectManyMenuImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link form.impl.SelectManyMenuImpl#getNickname <em>Nickname</em>}</li>
 *   <li>{@link form.impl.SelectManyMenuImpl#getClassifiers <em>Classifiers</em>}</li>
 *   <li>{@link form.impl.SelectManyMenuImpl#getOrder <em>Order</em>}</li>
 *   <li>{@link form.impl.SelectManyMenuImpl#getEnabled <em>Enabled</em>}</li>
 *   <li>{@link form.impl.SelectManyMenuImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link form.impl.SelectManyMenuImpl#getMenu <em>Menu</em>}</li>
 *   <li>{@link form.impl.SelectManyMenuImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link form.impl.SelectManyMenuImpl#getRequired <em>Required</em>}</li>
 *   <li>{@link form.impl.SelectManyMenuImpl#getReadOnly <em>Read Only</em>}</li>
 *   <li>{@link form.impl.SelectManyMenuImpl#getRefreshAreas <em>Refresh Areas</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SelectManyMenuImpl extends OptionSelectionImpl implements SelectManyMenu {
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
	 * The default value of the '{@link #getNickname() <em>Nickname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNickname()
	 * @generated
	 * @ordered
	 */
	protected static final String NICKNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNickname() <em>Nickname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNickname()
	 * @generated
	 * @ordered
	 */
	protected String nickname = NICKNAME_EDEFAULT;

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
	 * The default value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected static final int ORDER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected int order = ORDER_EDEFAULT;

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
	 * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFields()
	 * @generated
	 * @ordered
	 */
	protected EList<FlexField> fields;

	/**
	 * The cached value of the '{@link #getMenu() <em>Menu</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMenu()
	 * @generated
	 * @ordered
	 */
	protected MenuFolder menu;

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
	 * The cached value of the '{@link #getRequired() <em>Required</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequired()
	 * @generated
	 * @ordered
	 */
	protected Context required;

	/**
	 * The cached value of the '{@link #getReadOnly() <em>Read Only</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadOnly()
	 * @generated
	 * @ordered
	 */
	protected Context readOnly;

	/**
	 * The cached value of the '{@link #getRefreshAreas() <em>Refresh Areas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefreshAreas()
	 * @generated
	 * @ordered
	 */
	protected EList<AreaRef> refreshAreas;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelectManyMenuImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FormPackage.Literals.SELECT_MANY_MENU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FormPackage.SELECT_MANY_MENU__STYLE, oldStyle, newStyle);
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
	public void setStyle(Context newStyle) {
		if (newStyle != style) {
			NotificationChain msgs = null;
			if (style != null)
				msgs = ((InternalEObject)style).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FormPackage.SELECT_MANY_MENU__STYLE, null, msgs);
			if (newStyle != null)
				msgs = ((InternalEObject)newStyle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FormPackage.SELECT_MANY_MENU__STYLE, null, msgs);
			msgs = basicSetStyle(newStyle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.SELECT_MANY_MENU__STYLE, newStyle, newStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNickname() {
		return nickname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNickname(String newNickname) {
		String oldNickname = nickname;
		nickname = newNickname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.SELECT_MANY_MENU__NICKNAME, oldNickname, nickname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Classifier> getClassifiers() {
		if (classifiers == null) {
			classifiers = new EObjectContainmentEList<Classifier>(Classifier.class, this, FormPackage.SELECT_MANY_MENU__CLASSIFIERS);
		}
		return classifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getOrder() {
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrder(int newOrder) {
		int oldOrder = order;
		order = newOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.SELECT_MANY_MENU__ORDER, oldOrder, order));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FormPackage.SELECT_MANY_MENU__ENABLED, oldEnabled, newEnabled);
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
	public void setEnabled(Context newEnabled) {
		if (newEnabled != enabled) {
			NotificationChain msgs = null;
			if (enabled != null)
				msgs = ((InternalEObject)enabled).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FormPackage.SELECT_MANY_MENU__ENABLED, null, msgs);
			if (newEnabled != null)
				msgs = ((InternalEObject)newEnabled).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FormPackage.SELECT_MANY_MENU__ENABLED, null, msgs);
			msgs = basicSetEnabled(newEnabled, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.SELECT_MANY_MENU__ENABLED, newEnabled, newEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FlexField> getFields() {
		if (fields == null) {
			fields = new EObjectContainmentEList<FlexField>(FlexField.class, this, FormPackage.SELECT_MANY_MENU__FIELDS);
		}
		return fields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MenuFolder getMenu() {
		if (menu != null && menu.eIsProxy()) {
			InternalEObject oldMenu = (InternalEObject)menu;
			menu = (MenuFolder)eResolveProxy(oldMenu);
			if (menu != oldMenu) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FormPackage.SELECT_MANY_MENU__MENU, oldMenu, menu));
			}
		}
		return menu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MenuFolder basicGetMenu() {
		return menu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMenu(MenuFolder newMenu) {
		MenuFolder oldMenu = menu;
		menu = newMenu;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.SELECT_MANY_MENU__MENU, oldMenu, menu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUid() {
		return uid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUid(String newUid) {
		String oldUid = uid;
		uid = newUid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.SELECT_MANY_MENU__UID, oldUid, uid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Context getRequired() {
		return required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequired(Context newRequired, NotificationChain msgs) {
		Context oldRequired = required;
		required = newRequired;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FormPackage.SELECT_MANY_MENU__REQUIRED, oldRequired, newRequired);
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
	public void setRequired(Context newRequired) {
		if (newRequired != required) {
			NotificationChain msgs = null;
			if (required != null)
				msgs = ((InternalEObject)required).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FormPackage.SELECT_MANY_MENU__REQUIRED, null, msgs);
			if (newRequired != null)
				msgs = ((InternalEObject)newRequired).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FormPackage.SELECT_MANY_MENU__REQUIRED, null, msgs);
			msgs = basicSetRequired(newRequired, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.SELECT_MANY_MENU__REQUIRED, newRequired, newRequired));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Context getReadOnly() {
		return readOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReadOnly(Context newReadOnly, NotificationChain msgs) {
		Context oldReadOnly = readOnly;
		readOnly = newReadOnly;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FormPackage.SELECT_MANY_MENU__READ_ONLY, oldReadOnly, newReadOnly);
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
	public void setReadOnly(Context newReadOnly) {
		if (newReadOnly != readOnly) {
			NotificationChain msgs = null;
			if (readOnly != null)
				msgs = ((InternalEObject)readOnly).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FormPackage.SELECT_MANY_MENU__READ_ONLY, null, msgs);
			if (newReadOnly != null)
				msgs = ((InternalEObject)newReadOnly).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FormPackage.SELECT_MANY_MENU__READ_ONLY, null, msgs);
			msgs = basicSetReadOnly(newReadOnly, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.SELECT_MANY_MENU__READ_ONLY, newReadOnly, newReadOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AreaRef> getRefreshAreas() {
		if (refreshAreas == null) {
			refreshAreas = new EObjectContainmentEList<AreaRef>(AreaRef.class, this, FormPackage.SELECT_MANY_MENU__REFRESH_AREAS);
		}
		return refreshAreas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FormPackage.SELECT_MANY_MENU__STYLE:
				return basicSetStyle(null, msgs);
			case FormPackage.SELECT_MANY_MENU__CLASSIFIERS:
				return ((InternalEList<?>)getClassifiers()).basicRemove(otherEnd, msgs);
			case FormPackage.SELECT_MANY_MENU__ENABLED:
				return basicSetEnabled(null, msgs);
			case FormPackage.SELECT_MANY_MENU__FIELDS:
				return ((InternalEList<?>)getFields()).basicRemove(otherEnd, msgs);
			case FormPackage.SELECT_MANY_MENU__REQUIRED:
				return basicSetRequired(null, msgs);
			case FormPackage.SELECT_MANY_MENU__READ_ONLY:
				return basicSetReadOnly(null, msgs);
			case FormPackage.SELECT_MANY_MENU__REFRESH_AREAS:
				return ((InternalEList<?>)getRefreshAreas()).basicRemove(otherEnd, msgs);
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
			case FormPackage.SELECT_MANY_MENU__STYLE:
				return getStyle();
			case FormPackage.SELECT_MANY_MENU__NICKNAME:
				return getNickname();
			case FormPackage.SELECT_MANY_MENU__CLASSIFIERS:
				return getClassifiers();
			case FormPackage.SELECT_MANY_MENU__ORDER:
				return getOrder();
			case FormPackage.SELECT_MANY_MENU__ENABLED:
				return getEnabled();
			case FormPackage.SELECT_MANY_MENU__FIELDS:
				return getFields();
			case FormPackage.SELECT_MANY_MENU__MENU:
				if (resolve) return getMenu();
				return basicGetMenu();
			case FormPackage.SELECT_MANY_MENU__UID:
				return getUid();
			case FormPackage.SELECT_MANY_MENU__REQUIRED:
				return getRequired();
			case FormPackage.SELECT_MANY_MENU__READ_ONLY:
				return getReadOnly();
			case FormPackage.SELECT_MANY_MENU__REFRESH_AREAS:
				return getRefreshAreas();
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
			case FormPackage.SELECT_MANY_MENU__STYLE:
				setStyle((Context)newValue);
				return;
			case FormPackage.SELECT_MANY_MENU__NICKNAME:
				setNickname((String)newValue);
				return;
			case FormPackage.SELECT_MANY_MENU__CLASSIFIERS:
				getClassifiers().clear();
				getClassifiers().addAll((Collection<? extends Classifier>)newValue);
				return;
			case FormPackage.SELECT_MANY_MENU__ORDER:
				setOrder((Integer)newValue);
				return;
			case FormPackage.SELECT_MANY_MENU__ENABLED:
				setEnabled((Context)newValue);
				return;
			case FormPackage.SELECT_MANY_MENU__FIELDS:
				getFields().clear();
				getFields().addAll((Collection<? extends FlexField>)newValue);
				return;
			case FormPackage.SELECT_MANY_MENU__MENU:
				setMenu((MenuFolder)newValue);
				return;
			case FormPackage.SELECT_MANY_MENU__UID:
				setUid((String)newValue);
				return;
			case FormPackage.SELECT_MANY_MENU__REQUIRED:
				setRequired((Context)newValue);
				return;
			case FormPackage.SELECT_MANY_MENU__READ_ONLY:
				setReadOnly((Context)newValue);
				return;
			case FormPackage.SELECT_MANY_MENU__REFRESH_AREAS:
				getRefreshAreas().clear();
				getRefreshAreas().addAll((Collection<? extends AreaRef>)newValue);
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
			case FormPackage.SELECT_MANY_MENU__STYLE:
				setStyle((Context)null);
				return;
			case FormPackage.SELECT_MANY_MENU__NICKNAME:
				setNickname(NICKNAME_EDEFAULT);
				return;
			case FormPackage.SELECT_MANY_MENU__CLASSIFIERS:
				getClassifiers().clear();
				return;
			case FormPackage.SELECT_MANY_MENU__ORDER:
				setOrder(ORDER_EDEFAULT);
				return;
			case FormPackage.SELECT_MANY_MENU__ENABLED:
				setEnabled((Context)null);
				return;
			case FormPackage.SELECT_MANY_MENU__FIELDS:
				getFields().clear();
				return;
			case FormPackage.SELECT_MANY_MENU__MENU:
				setMenu((MenuFolder)null);
				return;
			case FormPackage.SELECT_MANY_MENU__UID:
				setUid(UID_EDEFAULT);
				return;
			case FormPackage.SELECT_MANY_MENU__REQUIRED:
				setRequired((Context)null);
				return;
			case FormPackage.SELECT_MANY_MENU__READ_ONLY:
				setReadOnly((Context)null);
				return;
			case FormPackage.SELECT_MANY_MENU__REFRESH_AREAS:
				getRefreshAreas().clear();
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
			case FormPackage.SELECT_MANY_MENU__STYLE:
				return style != null;
			case FormPackage.SELECT_MANY_MENU__NICKNAME:
				return NICKNAME_EDEFAULT == null ? nickname != null : !NICKNAME_EDEFAULT.equals(nickname);
			case FormPackage.SELECT_MANY_MENU__CLASSIFIERS:
				return classifiers != null && !classifiers.isEmpty();
			case FormPackage.SELECT_MANY_MENU__ORDER:
				return order != ORDER_EDEFAULT;
			case FormPackage.SELECT_MANY_MENU__ENABLED:
				return enabled != null;
			case FormPackage.SELECT_MANY_MENU__FIELDS:
				return fields != null && !fields.isEmpty();
			case FormPackage.SELECT_MANY_MENU__MENU:
				return menu != null;
			case FormPackage.SELECT_MANY_MENU__UID:
				return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
			case FormPackage.SELECT_MANY_MENU__REQUIRED:
				return required != null;
			case FormPackage.SELECT_MANY_MENU__READ_ONLY:
				return readOnly != null;
			case FormPackage.SELECT_MANY_MENU__REFRESH_AREAS:
				return refreshAreas != null && !refreshAreas.isEmpty();
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
		if (baseClass == StyleElement.class) {
			switch (derivedFeatureID) {
				case FormPackage.SELECT_MANY_MENU__STYLE: return FormPackage.STYLE_ELEMENT__STYLE;
				default: return -1;
			}
		}
		if (baseClass == NickNamed.class) {
			switch (derivedFeatureID) {
				case FormPackage.SELECT_MANY_MENU__NICKNAME: return FormPackage.NICK_NAMED__NICKNAME;
				default: return -1;
			}
		}
		if (baseClass == Categorized.class) {
			switch (derivedFeatureID) {
				case FormPackage.SELECT_MANY_MENU__CLASSIFIERS: return ArtifactPackage.CATEGORIZED__CLASSIFIERS;
				default: return -1;
			}
		}
		if (baseClass == Orderable.class) {
			switch (derivedFeatureID) {
				case FormPackage.SELECT_MANY_MENU__ORDER: return CommonPackage.ORDERABLE__ORDER;
				default: return -1;
			}
		}
		if (baseClass == EnabledUIItem.class) {
			switch (derivedFeatureID) {
				case FormPackage.SELECT_MANY_MENU__ENABLED: return FormPackage.ENABLED_UI_ITEM__ENABLED;
				default: return -1;
			}
		}
		if (baseClass == FlexFields.class) {
			switch (derivedFeatureID) {
				case FormPackage.SELECT_MANY_MENU__FIELDS: return FormPackage.FLEX_FIELDS__FIELDS;
				default: return -1;
			}
		}
		if (baseClass == MenuHolder.class) {
			switch (derivedFeatureID) {
				case FormPackage.SELECT_MANY_MENU__MENU: return FormPackage.MENU_HOLDER__MENU;
				default: return -1;
			}
		}
		if (baseClass == Uielement.class) {
			switch (derivedFeatureID) {
				case FormPackage.SELECT_MANY_MENU__UID: return FormPackage.UIELEMENT__UID;
				case FormPackage.SELECT_MANY_MENU__REQUIRED: return FormPackage.UIELEMENT__REQUIRED;
				case FormPackage.SELECT_MANY_MENU__READ_ONLY: return FormPackage.UIELEMENT__READ_ONLY;
				case FormPackage.SELECT_MANY_MENU__REFRESH_AREAS: return FormPackage.UIELEMENT__REFRESH_AREAS;
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
		if (baseClass == StyleElement.class) {
			switch (baseFeatureID) {
				case FormPackage.STYLE_ELEMENT__STYLE: return FormPackage.SELECT_MANY_MENU__STYLE;
				default: return -1;
			}
		}
		if (baseClass == NickNamed.class) {
			switch (baseFeatureID) {
				case FormPackage.NICK_NAMED__NICKNAME: return FormPackage.SELECT_MANY_MENU__NICKNAME;
				default: return -1;
			}
		}
		if (baseClass == Categorized.class) {
			switch (baseFeatureID) {
				case ArtifactPackage.CATEGORIZED__CLASSIFIERS: return FormPackage.SELECT_MANY_MENU__CLASSIFIERS;
				default: return -1;
			}
		}
		if (baseClass == Orderable.class) {
			switch (baseFeatureID) {
				case CommonPackage.ORDERABLE__ORDER: return FormPackage.SELECT_MANY_MENU__ORDER;
				default: return -1;
			}
		}
		if (baseClass == EnabledUIItem.class) {
			switch (baseFeatureID) {
				case FormPackage.ENABLED_UI_ITEM__ENABLED: return FormPackage.SELECT_MANY_MENU__ENABLED;
				default: return -1;
			}
		}
		if (baseClass == FlexFields.class) {
			switch (baseFeatureID) {
				case FormPackage.FLEX_FIELDS__FIELDS: return FormPackage.SELECT_MANY_MENU__FIELDS;
				default: return -1;
			}
		}
		if (baseClass == MenuHolder.class) {
			switch (baseFeatureID) {
				case FormPackage.MENU_HOLDER__MENU: return FormPackage.SELECT_MANY_MENU__MENU;
				default: return -1;
			}
		}
		if (baseClass == Uielement.class) {
			switch (baseFeatureID) {
				case FormPackage.UIELEMENT__UID: return FormPackage.SELECT_MANY_MENU__UID;
				case FormPackage.UIELEMENT__REQUIRED: return FormPackage.SELECT_MANY_MENU__REQUIRED;
				case FormPackage.UIELEMENT__READ_ONLY: return FormPackage.SELECT_MANY_MENU__READ_ONLY;
				case FormPackage.UIELEMENT__REFRESH_AREAS: return FormPackage.SELECT_MANY_MENU__REFRESH_AREAS;
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (nickname: ");
		result.append(nickname);
		result.append(", order: ");
		result.append(order);
		result.append(", uid: ");
		result.append(uid);
		result.append(')');
		return result.toString();
	}

} //SelectManyMenuImpl
