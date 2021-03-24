/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   http://sourceforge.net/p/tura/wiki/Home/
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
import form.ControlPointer;
import form.DataControl;
import form.EnabledUIItem;
import form.FlexField;
import form.FlexFields;
import form.FormPackage;
import form.InputElement;
import form.MenuFolder;
import form.MenuHolder;
import form.NickNamed;
import form.RadioLayout;
import form.RadioSelection;
import form.SourcesPointer;
import form.StyleElement;
import form.Uielement;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import type.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Radio Selection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link form.impl.RadioSelectionImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link form.impl.RadioSelectionImpl#getNickname <em>Nickname</em>}</li>
 *   <li>{@link form.impl.RadioSelectionImpl#getClassifiers <em>Classifiers</em>}</li>
 *   <li>{@link form.impl.RadioSelectionImpl#getOrder <em>Order</em>}</li>
 *   <li>{@link form.impl.RadioSelectionImpl#getEnabled <em>Enabled</em>}</li>
 *   <li>{@link form.impl.RadioSelectionImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link form.impl.RadioSelectionImpl#getMenu <em>Menu</em>}</li>
 *   <li>{@link form.impl.RadioSelectionImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link form.impl.RadioSelectionImpl#getRequired <em>Required</em>}</li>
 *   <li>{@link form.impl.RadioSelectionImpl#getReadOnly <em>Read Only</em>}</li>
 *   <li>{@link form.impl.RadioSelectionImpl#getRefreshAreas <em>Refresh Areas</em>}</li>
 *   <li>{@link form.impl.RadioSelectionImpl#getSourcePointer <em>Source Pointer</em>}</li>
 *   <li>{@link form.impl.RadioSelectionImpl#getValuePointer <em>Value Pointer</em>}</li>
 *   <li>{@link form.impl.RadioSelectionImpl#getSourceCast <em>Source Cast</em>}</li>
 *   <li>{@link form.impl.RadioSelectionImpl#getSourceCastDataControl <em>Source Cast Data Control</em>}</li>
 *   <li>{@link form.impl.RadioSelectionImpl#getLayout <em>Layout</em>}</li>
 *   <li>{@link form.impl.RadioSelectionImpl#getColumns <em>Columns</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RadioSelectionImpl extends OptionSelectionImpl implements RadioSelection {
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
	 * The default value of the '{@link #getLayout() <em>Layout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayout()
	 * @generated
	 * @ordered
	 */
	protected static final RadioLayout LAYOUT_EDEFAULT = RadioLayout.LINE_DIRECTION;

	/**
	 * The cached value of the '{@link #getLayout() <em>Layout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayout()
	 * @generated
	 * @ordered
	 */
	protected RadioLayout layout = LAYOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getColumns() <em>Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected static final int COLUMNS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getColumns() <em>Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected int columns = COLUMNS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RadioSelectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FormPackage.Literals.RADIO_SELECTION;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FormPackage.RADIO_SELECTION__STYLE, oldStyle, newStyle);
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
				msgs = ((InternalEObject)style).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FormPackage.RADIO_SELECTION__STYLE, null, msgs);
			if (newStyle != null)
				msgs = ((InternalEObject)newStyle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FormPackage.RADIO_SELECTION__STYLE, null, msgs);
			msgs = basicSetStyle(newStyle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.RADIO_SELECTION__STYLE, newStyle, newStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNickname() {
		return nickname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNickname(String newNickname) {
		String oldNickname = nickname;
		nickname = newNickname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.RADIO_SELECTION__NICKNAME, oldNickname, nickname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> getClassifiers() {
		if (classifiers == null) {
			classifiers = new EObjectContainmentEList<Classifier>(Classifier.class, this, FormPackage.RADIO_SELECTION__CLASSIFIERS);
		}
		return classifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOrder() {
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrder(int newOrder) {
		int oldOrder = order;
		order = newOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.RADIO_SELECTION__ORDER, oldOrder, order));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FormPackage.RADIO_SELECTION__ENABLED, oldEnabled, newEnabled);
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
				msgs = ((InternalEObject)enabled).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FormPackage.RADIO_SELECTION__ENABLED, null, msgs);
			if (newEnabled != null)
				msgs = ((InternalEObject)newEnabled).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FormPackage.RADIO_SELECTION__ENABLED, null, msgs);
			msgs = basicSetEnabled(newEnabled, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.RADIO_SELECTION__ENABLED, newEnabled, newEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FlexField> getFields() {
		if (fields == null) {
			fields = new EObjectContainmentEList<FlexField>(FlexField.class, this, FormPackage.RADIO_SELECTION__FIELDS);
		}
		return fields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MenuFolder getMenu() {
		if (menu != null && menu.eIsProxy()) {
			InternalEObject oldMenu = (InternalEObject)menu;
			menu = (MenuFolder)eResolveProxy(oldMenu);
			if (menu != oldMenu) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FormPackage.RADIO_SELECTION__MENU, oldMenu, menu));
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
	public void setMenu(MenuFolder newMenu) {
		MenuFolder oldMenu = menu;
		menu = newMenu;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.RADIO_SELECTION__MENU, oldMenu, menu));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.RADIO_SELECTION__UID, oldUid, uid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FormPackage.RADIO_SELECTION__REQUIRED, oldRequired, newRequired);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequired(Context newRequired) {
		if (newRequired != required) {
			NotificationChain msgs = null;
			if (required != null)
				msgs = ((InternalEObject)required).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FormPackage.RADIO_SELECTION__REQUIRED, null, msgs);
			if (newRequired != null)
				msgs = ((InternalEObject)newRequired).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FormPackage.RADIO_SELECTION__REQUIRED, null, msgs);
			msgs = basicSetRequired(newRequired, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.RADIO_SELECTION__REQUIRED, newRequired, newRequired));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FormPackage.RADIO_SELECTION__READ_ONLY, oldReadOnly, newReadOnly);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadOnly(Context newReadOnly) {
		if (newReadOnly != readOnly) {
			NotificationChain msgs = null;
			if (readOnly != null)
				msgs = ((InternalEObject)readOnly).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FormPackage.RADIO_SELECTION__READ_ONLY, null, msgs);
			if (newReadOnly != null)
				msgs = ((InternalEObject)newReadOnly).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FormPackage.RADIO_SELECTION__READ_ONLY, null, msgs);
			msgs = basicSetReadOnly(newReadOnly, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.RADIO_SELECTION__READ_ONLY, newReadOnly, newReadOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AreaRef> getRefreshAreas() {
		if (refreshAreas == null) {
			refreshAreas = new EObjectContainmentEList<AreaRef>(AreaRef.class, this, FormPackage.RADIO_SELECTION__REFRESH_AREAS);
		}
		return refreshAreas;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FormPackage.RADIO_SELECTION__SOURCE_POINTER, oldSourcePointer, sourcePointer));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.RADIO_SELECTION__SOURCE_POINTER, oldSourcePointer, sourcePointer));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FormPackage.RADIO_SELECTION__VALUE_POINTER, oldValuePointer, valuePointer));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.RADIO_SELECTION__VALUE_POINTER, oldValuePointer, valuePointer));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FormPackage.RADIO_SELECTION__SOURCE_CAST, oldSourceCast, sourceCast));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.RADIO_SELECTION__SOURCE_CAST, oldSourceCast, sourceCast));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FormPackage.RADIO_SELECTION__SOURCE_CAST_DATA_CONTROL, oldSourceCastDataControl, sourceCastDataControl));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.RADIO_SELECTION__SOURCE_CAST_DATA_CONTROL, oldSourceCastDataControl, sourceCastDataControl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RadioLayout getLayout() {
		return layout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayout(RadioLayout newLayout) {
		RadioLayout oldLayout = layout;
		layout = newLayout == null ? LAYOUT_EDEFAULT : newLayout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.RADIO_SELECTION__LAYOUT, oldLayout, layout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getColumns() {
		return columns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumns(int newColumns) {
		int oldColumns = columns;
		columns = newColumns;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.RADIO_SELECTION__COLUMNS, oldColumns, columns));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FormPackage.RADIO_SELECTION__STYLE:
				return basicSetStyle(null, msgs);
			case FormPackage.RADIO_SELECTION__CLASSIFIERS:
				return ((InternalEList<?>)getClassifiers()).basicRemove(otherEnd, msgs);
			case FormPackage.RADIO_SELECTION__ENABLED:
				return basicSetEnabled(null, msgs);
			case FormPackage.RADIO_SELECTION__FIELDS:
				return ((InternalEList<?>)getFields()).basicRemove(otherEnd, msgs);
			case FormPackage.RADIO_SELECTION__REQUIRED:
				return basicSetRequired(null, msgs);
			case FormPackage.RADIO_SELECTION__READ_ONLY:
				return basicSetReadOnly(null, msgs);
			case FormPackage.RADIO_SELECTION__REFRESH_AREAS:
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
			case FormPackage.RADIO_SELECTION__STYLE:
				return getStyle();
			case FormPackage.RADIO_SELECTION__NICKNAME:
				return getNickname();
			case FormPackage.RADIO_SELECTION__CLASSIFIERS:
				return getClassifiers();
			case FormPackage.RADIO_SELECTION__ORDER:
				return getOrder();
			case FormPackage.RADIO_SELECTION__ENABLED:
				return getEnabled();
			case FormPackage.RADIO_SELECTION__FIELDS:
				return getFields();
			case FormPackage.RADIO_SELECTION__MENU:
				if (resolve) return getMenu();
				return basicGetMenu();
			case FormPackage.RADIO_SELECTION__UID:
				return getUid();
			case FormPackage.RADIO_SELECTION__REQUIRED:
				return getRequired();
			case FormPackage.RADIO_SELECTION__READ_ONLY:
				return getReadOnly();
			case FormPackage.RADIO_SELECTION__REFRESH_AREAS:
				return getRefreshAreas();
			case FormPackage.RADIO_SELECTION__SOURCE_POINTER:
				if (resolve) return getSourcePointer();
				return basicGetSourcePointer();
			case FormPackage.RADIO_SELECTION__VALUE_POINTER:
				if (resolve) return getValuePointer();
				return basicGetValuePointer();
			case FormPackage.RADIO_SELECTION__SOURCE_CAST:
				if (resolve) return getSourceCast();
				return basicGetSourceCast();
			case FormPackage.RADIO_SELECTION__SOURCE_CAST_DATA_CONTROL:
				if (resolve) return getSourceCastDataControl();
				return basicGetSourceCastDataControl();
			case FormPackage.RADIO_SELECTION__LAYOUT:
				return getLayout();
			case FormPackage.RADIO_SELECTION__COLUMNS:
				return getColumns();
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
			case FormPackage.RADIO_SELECTION__STYLE:
				setStyle((Context)newValue);
				return;
			case FormPackage.RADIO_SELECTION__NICKNAME:
				setNickname((String)newValue);
				return;
			case FormPackage.RADIO_SELECTION__CLASSIFIERS:
				getClassifiers().clear();
				getClassifiers().addAll((Collection<? extends Classifier>)newValue);
				return;
			case FormPackage.RADIO_SELECTION__ORDER:
				setOrder((Integer)newValue);
				return;
			case FormPackage.RADIO_SELECTION__ENABLED:
				setEnabled((Context)newValue);
				return;
			case FormPackage.RADIO_SELECTION__FIELDS:
				getFields().clear();
				getFields().addAll((Collection<? extends FlexField>)newValue);
				return;
			case FormPackage.RADIO_SELECTION__MENU:
				setMenu((MenuFolder)newValue);
				return;
			case FormPackage.RADIO_SELECTION__UID:
				setUid((String)newValue);
				return;
			case FormPackage.RADIO_SELECTION__REQUIRED:
				setRequired((Context)newValue);
				return;
			case FormPackage.RADIO_SELECTION__READ_ONLY:
				setReadOnly((Context)newValue);
				return;
			case FormPackage.RADIO_SELECTION__REFRESH_AREAS:
				getRefreshAreas().clear();
				getRefreshAreas().addAll((Collection<? extends AreaRef>)newValue);
				return;
			case FormPackage.RADIO_SELECTION__SOURCE_POINTER:
				setSourcePointer((DataControl)newValue);
				return;
			case FormPackage.RADIO_SELECTION__VALUE_POINTER:
				setValuePointer((EObject)newValue);
				return;
			case FormPackage.RADIO_SELECTION__SOURCE_CAST:
				setSourceCast((Type)newValue);
				return;
			case FormPackage.RADIO_SELECTION__SOURCE_CAST_DATA_CONTROL:
				setSourceCastDataControl((DataControl)newValue);
				return;
			case FormPackage.RADIO_SELECTION__LAYOUT:
				setLayout((RadioLayout)newValue);
				return;
			case FormPackage.RADIO_SELECTION__COLUMNS:
				setColumns((Integer)newValue);
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
			case FormPackage.RADIO_SELECTION__STYLE:
				setStyle((Context)null);
				return;
			case FormPackage.RADIO_SELECTION__NICKNAME:
				setNickname(NICKNAME_EDEFAULT);
				return;
			case FormPackage.RADIO_SELECTION__CLASSIFIERS:
				getClassifiers().clear();
				return;
			case FormPackage.RADIO_SELECTION__ORDER:
				setOrder(ORDER_EDEFAULT);
				return;
			case FormPackage.RADIO_SELECTION__ENABLED:
				setEnabled((Context)null);
				return;
			case FormPackage.RADIO_SELECTION__FIELDS:
				getFields().clear();
				return;
			case FormPackage.RADIO_SELECTION__MENU:
				setMenu((MenuFolder)null);
				return;
			case FormPackage.RADIO_SELECTION__UID:
				setUid(UID_EDEFAULT);
				return;
			case FormPackage.RADIO_SELECTION__REQUIRED:
				setRequired((Context)null);
				return;
			case FormPackage.RADIO_SELECTION__READ_ONLY:
				setReadOnly((Context)null);
				return;
			case FormPackage.RADIO_SELECTION__REFRESH_AREAS:
				getRefreshAreas().clear();
				return;
			case FormPackage.RADIO_SELECTION__SOURCE_POINTER:
				setSourcePointer((DataControl)null);
				return;
			case FormPackage.RADIO_SELECTION__VALUE_POINTER:
				setValuePointer((EObject)null);
				return;
			case FormPackage.RADIO_SELECTION__SOURCE_CAST:
				setSourceCast((Type)null);
				return;
			case FormPackage.RADIO_SELECTION__SOURCE_CAST_DATA_CONTROL:
				setSourceCastDataControl((DataControl)null);
				return;
			case FormPackage.RADIO_SELECTION__LAYOUT:
				setLayout(LAYOUT_EDEFAULT);
				return;
			case FormPackage.RADIO_SELECTION__COLUMNS:
				setColumns(COLUMNS_EDEFAULT);
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
			case FormPackage.RADIO_SELECTION__STYLE:
				return style != null;
			case FormPackage.RADIO_SELECTION__NICKNAME:
				return NICKNAME_EDEFAULT == null ? nickname != null : !NICKNAME_EDEFAULT.equals(nickname);
			case FormPackage.RADIO_SELECTION__CLASSIFIERS:
				return classifiers != null && !classifiers.isEmpty();
			case FormPackage.RADIO_SELECTION__ORDER:
				return order != ORDER_EDEFAULT;
			case FormPackage.RADIO_SELECTION__ENABLED:
				return enabled != null;
			case FormPackage.RADIO_SELECTION__FIELDS:
				return fields != null && !fields.isEmpty();
			case FormPackage.RADIO_SELECTION__MENU:
				return menu != null;
			case FormPackage.RADIO_SELECTION__UID:
				return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
			case FormPackage.RADIO_SELECTION__REQUIRED:
				return required != null;
			case FormPackage.RADIO_SELECTION__READ_ONLY:
				return readOnly != null;
			case FormPackage.RADIO_SELECTION__REFRESH_AREAS:
				return refreshAreas != null && !refreshAreas.isEmpty();
			case FormPackage.RADIO_SELECTION__SOURCE_POINTER:
				return sourcePointer != null;
			case FormPackage.RADIO_SELECTION__VALUE_POINTER:
				return valuePointer != null;
			case FormPackage.RADIO_SELECTION__SOURCE_CAST:
				return sourceCast != null;
			case FormPackage.RADIO_SELECTION__SOURCE_CAST_DATA_CONTROL:
				return sourceCastDataControl != null;
			case FormPackage.RADIO_SELECTION__LAYOUT:
				return layout != LAYOUT_EDEFAULT;
			case FormPackage.RADIO_SELECTION__COLUMNS:
				return columns != COLUMNS_EDEFAULT;
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
				case FormPackage.RADIO_SELECTION__STYLE: return FormPackage.STYLE_ELEMENT__STYLE;
				default: return -1;
			}
		}
		if (baseClass == NickNamed.class) {
			switch (derivedFeatureID) {
				case FormPackage.RADIO_SELECTION__NICKNAME: return FormPackage.NICK_NAMED__NICKNAME;
				default: return -1;
			}
		}
		if (baseClass == Categorized.class) {
			switch (derivedFeatureID) {
				case FormPackage.RADIO_SELECTION__CLASSIFIERS: return ArtifactPackage.CATEGORIZED__CLASSIFIERS;
				default: return -1;
			}
		}
		if (baseClass == Orderable.class) {
			switch (derivedFeatureID) {
				case FormPackage.RADIO_SELECTION__ORDER: return CommonPackage.ORDERABLE__ORDER;
				default: return -1;
			}
		}
		if (baseClass == EnabledUIItem.class) {
			switch (derivedFeatureID) {
				case FormPackage.RADIO_SELECTION__ENABLED: return FormPackage.ENABLED_UI_ITEM__ENABLED;
				default: return -1;
			}
		}
		if (baseClass == FlexFields.class) {
			switch (derivedFeatureID) {
				case FormPackage.RADIO_SELECTION__FIELDS: return FormPackage.FLEX_FIELDS__FIELDS;
				default: return -1;
			}
		}
		if (baseClass == MenuHolder.class) {
			switch (derivedFeatureID) {
				case FormPackage.RADIO_SELECTION__MENU: return FormPackage.MENU_HOLDER__MENU;
				default: return -1;
			}
		}
		if (baseClass == Uielement.class) {
			switch (derivedFeatureID) {
				case FormPackage.RADIO_SELECTION__UID: return FormPackage.UIELEMENT__UID;
				case FormPackage.RADIO_SELECTION__REQUIRED: return FormPackage.UIELEMENT__REQUIRED;
				case FormPackage.RADIO_SELECTION__READ_ONLY: return FormPackage.UIELEMENT__READ_ONLY;
				case FormPackage.RADIO_SELECTION__REFRESH_AREAS: return FormPackage.UIELEMENT__REFRESH_AREAS;
				default: return -1;
			}
		}
		if (baseClass == ControlPointer.class) {
			switch (derivedFeatureID) {
				case FormPackage.RADIO_SELECTION__SOURCE_POINTER: return FormPackage.CONTROL_POINTER__SOURCE_POINTER;
				case FormPackage.RADIO_SELECTION__VALUE_POINTER: return FormPackage.CONTROL_POINTER__VALUE_POINTER;
				case FormPackage.RADIO_SELECTION__SOURCE_CAST: return FormPackage.CONTROL_POINTER__SOURCE_CAST;
				case FormPackage.RADIO_SELECTION__SOURCE_CAST_DATA_CONTROL: return FormPackage.CONTROL_POINTER__SOURCE_CAST_DATA_CONTROL;
				default: return -1;
			}
		}
		if (baseClass == SourcesPointer.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == InputElement.class) {
			switch (derivedFeatureID) {
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
				case FormPackage.STYLE_ELEMENT__STYLE: return FormPackage.RADIO_SELECTION__STYLE;
				default: return -1;
			}
		}
		if (baseClass == NickNamed.class) {
			switch (baseFeatureID) {
				case FormPackage.NICK_NAMED__NICKNAME: return FormPackage.RADIO_SELECTION__NICKNAME;
				default: return -1;
			}
		}
		if (baseClass == Categorized.class) {
			switch (baseFeatureID) {
				case ArtifactPackage.CATEGORIZED__CLASSIFIERS: return FormPackage.RADIO_SELECTION__CLASSIFIERS;
				default: return -1;
			}
		}
		if (baseClass == Orderable.class) {
			switch (baseFeatureID) {
				case CommonPackage.ORDERABLE__ORDER: return FormPackage.RADIO_SELECTION__ORDER;
				default: return -1;
			}
		}
		if (baseClass == EnabledUIItem.class) {
			switch (baseFeatureID) {
				case FormPackage.ENABLED_UI_ITEM__ENABLED: return FormPackage.RADIO_SELECTION__ENABLED;
				default: return -1;
			}
		}
		if (baseClass == FlexFields.class) {
			switch (baseFeatureID) {
				case FormPackage.FLEX_FIELDS__FIELDS: return FormPackage.RADIO_SELECTION__FIELDS;
				default: return -1;
			}
		}
		if (baseClass == MenuHolder.class) {
			switch (baseFeatureID) {
				case FormPackage.MENU_HOLDER__MENU: return FormPackage.RADIO_SELECTION__MENU;
				default: return -1;
			}
		}
		if (baseClass == Uielement.class) {
			switch (baseFeatureID) {
				case FormPackage.UIELEMENT__UID: return FormPackage.RADIO_SELECTION__UID;
				case FormPackage.UIELEMENT__REQUIRED: return FormPackage.RADIO_SELECTION__REQUIRED;
				case FormPackage.UIELEMENT__READ_ONLY: return FormPackage.RADIO_SELECTION__READ_ONLY;
				case FormPackage.UIELEMENT__REFRESH_AREAS: return FormPackage.RADIO_SELECTION__REFRESH_AREAS;
				default: return -1;
			}
		}
		if (baseClass == ControlPointer.class) {
			switch (baseFeatureID) {
				case FormPackage.CONTROL_POINTER__SOURCE_POINTER: return FormPackage.RADIO_SELECTION__SOURCE_POINTER;
				case FormPackage.CONTROL_POINTER__VALUE_POINTER: return FormPackage.RADIO_SELECTION__VALUE_POINTER;
				case FormPackage.CONTROL_POINTER__SOURCE_CAST: return FormPackage.RADIO_SELECTION__SOURCE_CAST;
				case FormPackage.CONTROL_POINTER__SOURCE_CAST_DATA_CONTROL: return FormPackage.RADIO_SELECTION__SOURCE_CAST_DATA_CONTROL;
				default: return -1;
			}
		}
		if (baseClass == SourcesPointer.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == InputElement.class) {
			switch (baseFeatureID) {
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
		result.append(", layout: ");
		result.append(layout);
		result.append(", columns: ");
		result.append(columns);
		result.append(')');
		return result.toString();
	}

} //RadioSelectionImpl
