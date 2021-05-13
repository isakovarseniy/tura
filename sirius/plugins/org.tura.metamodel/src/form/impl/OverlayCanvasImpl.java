/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
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
import common.HTMLLayerHolder;

import form.AreaRef;
import form.Context;
import form.DefaultCavas;
import form.FlexField;
import form.FlexFields;
import form.FormPackage;
import form.MultiLangLabel;
import form.NickNamed;
import form.OverlayCanvas;
import form.ViewElement;
import form.ViewPortHolder;

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
 * An implementation of the model object '<em><b>Overlay Canvas</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link form.impl.OverlayCanvasImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link form.impl.OverlayCanvasImpl#getViewElement <em>View Element</em>}</li>
 *   <li>{@link form.impl.OverlayCanvasImpl#isDefaultCanvas <em>Default Canvas</em>}</li>
 *   <li>{@link form.impl.OverlayCanvasImpl#getMultiLangLabel <em>Multi Lang Label</em>}</li>
 *   <li>{@link form.impl.OverlayCanvasImpl#getClassifiers <em>Classifiers</em>}</li>
 *   <li>{@link form.impl.OverlayCanvasImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link form.impl.OverlayCanvasImpl#getNickname <em>Nickname</em>}</li>
 *   <li>{@link form.impl.OverlayCanvasImpl#isModal <em>Modal</em>}</li>
 *   <li>{@link form.impl.OverlayCanvasImpl#getSourceTarget <em>Source Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OverlayCanvasImpl extends CanvasFrameImpl implements OverlayCanvas {
	/**
	 * The default value of the '{@link #getColumns() <em>Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected static final int COLUMNS_EDEFAULT = 1;

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
	 * The cached value of the '{@link #getViewElement() <em>View Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewElement()
	 * @generated
	 * @ordered
	 */
	protected EList<ViewElement> viewElement;

	/**
	 * The default value of the '{@link #isDefaultCanvas() <em>Default Canvas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDefaultCanvas()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DEFAULT_CANVAS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDefaultCanvas() <em>Default Canvas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDefaultCanvas()
	 * @generated
	 * @ordered
	 */
	protected boolean defaultCanvas = DEFAULT_CANVAS_EDEFAULT;

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
	 * The cached value of the '{@link #getClassifiers() <em>Classifiers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<Classifier> classifiers;

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
	 * The default value of the '{@link #isModal() <em>Modal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isModal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MODAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isModal() <em>Modal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isModal()
	 * @generated
	 * @ordered
	 */
	protected boolean modal = MODAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSourceTarget() <em>Source Target</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<AreaRef> sourceTarget;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OverlayCanvasImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FormPackage.Literals.OVERLAY_CANVAS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getColumns() {
		return columns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColumns(int newColumns) {
		int oldColumns = columns;
		columns = newColumns;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.OVERLAY_CANVAS__COLUMNS, oldColumns, columns));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ViewElement> getViewElement() {
		if (viewElement == null) {
			viewElement = new EObjectContainmentEList<ViewElement>(ViewElement.class, this, FormPackage.OVERLAY_CANVAS__VIEW_ELEMENT);
		}
		return viewElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDefaultCanvas() {
		return defaultCanvas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultCanvas(boolean newDefaultCanvas) {
		boolean oldDefaultCanvas = defaultCanvas;
		defaultCanvas = newDefaultCanvas;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.OVERLAY_CANVAS__DEFAULT_CANVAS, oldDefaultCanvas, defaultCanvas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FormPackage.OVERLAY_CANVAS__MULTI_LANG_LABEL, oldMultiLangLabel, newMultiLangLabel);
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
	public void setMultiLangLabel(Context newMultiLangLabel) {
		if (newMultiLangLabel != multiLangLabel) {
			NotificationChain msgs = null;
			if (multiLangLabel != null)
				msgs = ((InternalEObject)multiLangLabel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FormPackage.OVERLAY_CANVAS__MULTI_LANG_LABEL, null, msgs);
			if (newMultiLangLabel != null)
				msgs = ((InternalEObject)newMultiLangLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FormPackage.OVERLAY_CANVAS__MULTI_LANG_LABEL, null, msgs);
			msgs = basicSetMultiLangLabel(newMultiLangLabel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.OVERLAY_CANVAS__MULTI_LANG_LABEL, newMultiLangLabel, newMultiLangLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Classifier> getClassifiers() {
		if (classifiers == null) {
			classifiers = new EObjectContainmentEList<Classifier>(Classifier.class, this, FormPackage.OVERLAY_CANVAS__CLASSIFIERS);
		}
		return classifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FlexField> getFields() {
		if (fields == null) {
			fields = new EObjectContainmentEList<FlexField>(FlexField.class, this, FormPackage.OVERLAY_CANVAS__FIELDS);
		}
		return fields;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.OVERLAY_CANVAS__NICKNAME, oldNickname, nickname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isModal() {
		return modal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModal(boolean newModal) {
		boolean oldModal = modal;
		modal = newModal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.OVERLAY_CANVAS__MODAL, oldModal, modal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AreaRef> getSourceTarget() {
		if (sourceTarget == null) {
			sourceTarget = new EObjectContainmentEList<AreaRef>(AreaRef.class, this, FormPackage.OVERLAY_CANVAS__SOURCE_TARGET);
		}
		return sourceTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FormPackage.OVERLAY_CANVAS__VIEW_ELEMENT:
				return ((InternalEList<?>)getViewElement()).basicRemove(otherEnd, msgs);
			case FormPackage.OVERLAY_CANVAS__MULTI_LANG_LABEL:
				return basicSetMultiLangLabel(null, msgs);
			case FormPackage.OVERLAY_CANVAS__CLASSIFIERS:
				return ((InternalEList<?>)getClassifiers()).basicRemove(otherEnd, msgs);
			case FormPackage.OVERLAY_CANVAS__FIELDS:
				return ((InternalEList<?>)getFields()).basicRemove(otherEnd, msgs);
			case FormPackage.OVERLAY_CANVAS__SOURCE_TARGET:
				return ((InternalEList<?>)getSourceTarget()).basicRemove(otherEnd, msgs);
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
			case FormPackage.OVERLAY_CANVAS__COLUMNS:
				return getColumns();
			case FormPackage.OVERLAY_CANVAS__VIEW_ELEMENT:
				return getViewElement();
			case FormPackage.OVERLAY_CANVAS__DEFAULT_CANVAS:
				return isDefaultCanvas();
			case FormPackage.OVERLAY_CANVAS__MULTI_LANG_LABEL:
				return getMultiLangLabel();
			case FormPackage.OVERLAY_CANVAS__CLASSIFIERS:
				return getClassifiers();
			case FormPackage.OVERLAY_CANVAS__FIELDS:
				return getFields();
			case FormPackage.OVERLAY_CANVAS__NICKNAME:
				return getNickname();
			case FormPackage.OVERLAY_CANVAS__MODAL:
				return isModal();
			case FormPackage.OVERLAY_CANVAS__SOURCE_TARGET:
				return getSourceTarget();
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
			case FormPackage.OVERLAY_CANVAS__COLUMNS:
				setColumns((Integer)newValue);
				return;
			case FormPackage.OVERLAY_CANVAS__VIEW_ELEMENT:
				getViewElement().clear();
				getViewElement().addAll((Collection<? extends ViewElement>)newValue);
				return;
			case FormPackage.OVERLAY_CANVAS__DEFAULT_CANVAS:
				setDefaultCanvas((Boolean)newValue);
				return;
			case FormPackage.OVERLAY_CANVAS__MULTI_LANG_LABEL:
				setMultiLangLabel((Context)newValue);
				return;
			case FormPackage.OVERLAY_CANVAS__CLASSIFIERS:
				getClassifiers().clear();
				getClassifiers().addAll((Collection<? extends Classifier>)newValue);
				return;
			case FormPackage.OVERLAY_CANVAS__FIELDS:
				getFields().clear();
				getFields().addAll((Collection<? extends FlexField>)newValue);
				return;
			case FormPackage.OVERLAY_CANVAS__NICKNAME:
				setNickname((String)newValue);
				return;
			case FormPackage.OVERLAY_CANVAS__MODAL:
				setModal((Boolean)newValue);
				return;
			case FormPackage.OVERLAY_CANVAS__SOURCE_TARGET:
				getSourceTarget().clear();
				getSourceTarget().addAll((Collection<? extends AreaRef>)newValue);
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
			case FormPackage.OVERLAY_CANVAS__COLUMNS:
				setColumns(COLUMNS_EDEFAULT);
				return;
			case FormPackage.OVERLAY_CANVAS__VIEW_ELEMENT:
				getViewElement().clear();
				return;
			case FormPackage.OVERLAY_CANVAS__DEFAULT_CANVAS:
				setDefaultCanvas(DEFAULT_CANVAS_EDEFAULT);
				return;
			case FormPackage.OVERLAY_CANVAS__MULTI_LANG_LABEL:
				setMultiLangLabel((Context)null);
				return;
			case FormPackage.OVERLAY_CANVAS__CLASSIFIERS:
				getClassifiers().clear();
				return;
			case FormPackage.OVERLAY_CANVAS__FIELDS:
				getFields().clear();
				return;
			case FormPackage.OVERLAY_CANVAS__NICKNAME:
				setNickname(NICKNAME_EDEFAULT);
				return;
			case FormPackage.OVERLAY_CANVAS__MODAL:
				setModal(MODAL_EDEFAULT);
				return;
			case FormPackage.OVERLAY_CANVAS__SOURCE_TARGET:
				getSourceTarget().clear();
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
			case FormPackage.OVERLAY_CANVAS__COLUMNS:
				return columns != COLUMNS_EDEFAULT;
			case FormPackage.OVERLAY_CANVAS__VIEW_ELEMENT:
				return viewElement != null && !viewElement.isEmpty();
			case FormPackage.OVERLAY_CANVAS__DEFAULT_CANVAS:
				return defaultCanvas != DEFAULT_CANVAS_EDEFAULT;
			case FormPackage.OVERLAY_CANVAS__MULTI_LANG_LABEL:
				return multiLangLabel != null;
			case FormPackage.OVERLAY_CANVAS__CLASSIFIERS:
				return classifiers != null && !classifiers.isEmpty();
			case FormPackage.OVERLAY_CANVAS__FIELDS:
				return fields != null && !fields.isEmpty();
			case FormPackage.OVERLAY_CANVAS__NICKNAME:
				return NICKNAME_EDEFAULT == null ? nickname != null : !NICKNAME_EDEFAULT.equals(nickname);
			case FormPackage.OVERLAY_CANVAS__MODAL:
				return modal != MODAL_EDEFAULT;
			case FormPackage.OVERLAY_CANVAS__SOURCE_TARGET:
				return sourceTarget != null && !sourceTarget.isEmpty();
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
		if (baseClass == HTMLLayerHolder.class) {
			switch (derivedFeatureID) {
				case FormPackage.OVERLAY_CANVAS__COLUMNS: return CommonPackage.HTML_LAYER_HOLDER__COLUMNS;
				default: return -1;
			}
		}
		if (baseClass == ViewPortHolder.class) {
			switch (derivedFeatureID) {
				case FormPackage.OVERLAY_CANVAS__VIEW_ELEMENT: return FormPackage.VIEW_PORT_HOLDER__VIEW_ELEMENT;
				default: return -1;
			}
		}
		if (baseClass == DefaultCavas.class) {
			switch (derivedFeatureID) {
				case FormPackage.OVERLAY_CANVAS__DEFAULT_CANVAS: return FormPackage.DEFAULT_CAVAS__DEFAULT_CANVAS;
				default: return -1;
			}
		}
		if (baseClass == MultiLangLabel.class) {
			switch (derivedFeatureID) {
				case FormPackage.OVERLAY_CANVAS__MULTI_LANG_LABEL: return FormPackage.MULTI_LANG_LABEL__MULTI_LANG_LABEL;
				default: return -1;
			}
		}
		if (baseClass == Categorized.class) {
			switch (derivedFeatureID) {
				case FormPackage.OVERLAY_CANVAS__CLASSIFIERS: return ArtifactPackage.CATEGORIZED__CLASSIFIERS;
				default: return -1;
			}
		}
		if (baseClass == FlexFields.class) {
			switch (derivedFeatureID) {
				case FormPackage.OVERLAY_CANVAS__FIELDS: return FormPackage.FLEX_FIELDS__FIELDS;
				default: return -1;
			}
		}
		if (baseClass == NickNamed.class) {
			switch (derivedFeatureID) {
				case FormPackage.OVERLAY_CANVAS__NICKNAME: return FormPackage.NICK_NAMED__NICKNAME;
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
		if (baseClass == HTMLLayerHolder.class) {
			switch (baseFeatureID) {
				case CommonPackage.HTML_LAYER_HOLDER__COLUMNS: return FormPackage.OVERLAY_CANVAS__COLUMNS;
				default: return -1;
			}
		}
		if (baseClass == ViewPortHolder.class) {
			switch (baseFeatureID) {
				case FormPackage.VIEW_PORT_HOLDER__VIEW_ELEMENT: return FormPackage.OVERLAY_CANVAS__VIEW_ELEMENT;
				default: return -1;
			}
		}
		if (baseClass == DefaultCavas.class) {
			switch (baseFeatureID) {
				case FormPackage.DEFAULT_CAVAS__DEFAULT_CANVAS: return FormPackage.OVERLAY_CANVAS__DEFAULT_CANVAS;
				default: return -1;
			}
		}
		if (baseClass == MultiLangLabel.class) {
			switch (baseFeatureID) {
				case FormPackage.MULTI_LANG_LABEL__MULTI_LANG_LABEL: return FormPackage.OVERLAY_CANVAS__MULTI_LANG_LABEL;
				default: return -1;
			}
		}
		if (baseClass == Categorized.class) {
			switch (baseFeatureID) {
				case ArtifactPackage.CATEGORIZED__CLASSIFIERS: return FormPackage.OVERLAY_CANVAS__CLASSIFIERS;
				default: return -1;
			}
		}
		if (baseClass == FlexFields.class) {
			switch (baseFeatureID) {
				case FormPackage.FLEX_FIELDS__FIELDS: return FormPackage.OVERLAY_CANVAS__FIELDS;
				default: return -1;
			}
		}
		if (baseClass == NickNamed.class) {
			switch (baseFeatureID) {
				case FormPackage.NICK_NAMED__NICKNAME: return FormPackage.OVERLAY_CANVAS__NICKNAME;
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
		result.append(" (columns: ");
		result.append(columns);
		result.append(", defaultCanvas: ");
		result.append(defaultCanvas);
		result.append(", nickname: ");
		result.append(nickname);
		result.append(", modal: ");
		result.append(modal);
		result.append(')');
		return result.toString();
	}

} //OverlayCanvasImpl
