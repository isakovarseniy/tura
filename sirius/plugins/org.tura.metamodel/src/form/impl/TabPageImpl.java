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
import common.Orderable;

import form.Context;
import form.FlexField;
import form.FlexFields;
import form.FormPackage;
import form.MultiLangLabel;
import form.TabPage;
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
 * An implementation of the model object '<em><b>Tab Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link form.impl.TabPageImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link form.impl.TabPageImpl#getViewElement <em>View Element</em>}</li>
 *   <li>{@link form.impl.TabPageImpl#getMultiLangLabel <em>Multi Lang Label</em>}</li>
 *   <li>{@link form.impl.TabPageImpl#getClassifiers <em>Classifiers</em>}</li>
 *   <li>{@link form.impl.TabPageImpl#getOrder <em>Order</em>}</li>
 *   <li>{@link form.impl.TabPageImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link form.impl.TabPageImpl#getTabSequence <em>Tab Sequence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TabPageImpl extends CanvasFrameImpl implements TabPage {
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
	 * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFields()
	 * @generated
	 * @ordered
	 */
	protected EList<FlexField> fields;

	/**
	 * The default value of the '{@link #getTabSequence() <em>Tab Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTabSequence()
	 * @generated
	 * @ordered
	 */
	protected static final int TAB_SEQUENCE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTabSequence() <em>Tab Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTabSequence()
	 * @generated
	 * @ordered
	 */
	protected int tabSequence = TAB_SEQUENCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TabPageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FormPackage.Literals.TAB_PAGE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.TAB_PAGE__COLUMNS, oldColumns, columns));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ViewElement> getViewElement() {
		if (viewElement == null) {
			viewElement = new EObjectContainmentEList<ViewElement>(ViewElement.class, this, FormPackage.TAB_PAGE__VIEW_ELEMENT);
		}
		return viewElement;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FormPackage.TAB_PAGE__MULTI_LANG_LABEL, oldMultiLangLabel, newMultiLangLabel);
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
				msgs = ((InternalEObject)multiLangLabel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FormPackage.TAB_PAGE__MULTI_LANG_LABEL, null, msgs);
			if (newMultiLangLabel != null)
				msgs = ((InternalEObject)newMultiLangLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FormPackage.TAB_PAGE__MULTI_LANG_LABEL, null, msgs);
			msgs = basicSetMultiLangLabel(newMultiLangLabel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.TAB_PAGE__MULTI_LANG_LABEL, newMultiLangLabel, newMultiLangLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Classifier> getClassifiers() {
		if (classifiers == null) {
			classifiers = new EObjectContainmentEList<Classifier>(Classifier.class, this, FormPackage.TAB_PAGE__CLASSIFIERS);
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.TAB_PAGE__ORDER, oldOrder, order));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FlexField> getFields() {
		if (fields == null) {
			fields = new EObjectContainmentEList<FlexField>(FlexField.class, this, FormPackage.TAB_PAGE__FIELDS);
		}
		return fields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTabSequence() {
		return tabSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTabSequence(int newTabSequence) {
		int oldTabSequence = tabSequence;
		tabSequence = newTabSequence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.TAB_PAGE__TAB_SEQUENCE, oldTabSequence, tabSequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FormPackage.TAB_PAGE__VIEW_ELEMENT:
				return ((InternalEList<?>)getViewElement()).basicRemove(otherEnd, msgs);
			case FormPackage.TAB_PAGE__MULTI_LANG_LABEL:
				return basicSetMultiLangLabel(null, msgs);
			case FormPackage.TAB_PAGE__CLASSIFIERS:
				return ((InternalEList<?>)getClassifiers()).basicRemove(otherEnd, msgs);
			case FormPackage.TAB_PAGE__FIELDS:
				return ((InternalEList<?>)getFields()).basicRemove(otherEnd, msgs);
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
			case FormPackage.TAB_PAGE__COLUMNS:
				return getColumns();
			case FormPackage.TAB_PAGE__VIEW_ELEMENT:
				return getViewElement();
			case FormPackage.TAB_PAGE__MULTI_LANG_LABEL:
				return getMultiLangLabel();
			case FormPackage.TAB_PAGE__CLASSIFIERS:
				return getClassifiers();
			case FormPackage.TAB_PAGE__ORDER:
				return getOrder();
			case FormPackage.TAB_PAGE__FIELDS:
				return getFields();
			case FormPackage.TAB_PAGE__TAB_SEQUENCE:
				return getTabSequence();
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
			case FormPackage.TAB_PAGE__COLUMNS:
				setColumns((Integer)newValue);
				return;
			case FormPackage.TAB_PAGE__VIEW_ELEMENT:
				getViewElement().clear();
				getViewElement().addAll((Collection<? extends ViewElement>)newValue);
				return;
			case FormPackage.TAB_PAGE__MULTI_LANG_LABEL:
				setMultiLangLabel((Context)newValue);
				return;
			case FormPackage.TAB_PAGE__CLASSIFIERS:
				getClassifiers().clear();
				getClassifiers().addAll((Collection<? extends Classifier>)newValue);
				return;
			case FormPackage.TAB_PAGE__ORDER:
				setOrder((Integer)newValue);
				return;
			case FormPackage.TAB_PAGE__FIELDS:
				getFields().clear();
				getFields().addAll((Collection<? extends FlexField>)newValue);
				return;
			case FormPackage.TAB_PAGE__TAB_SEQUENCE:
				setTabSequence((Integer)newValue);
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
			case FormPackage.TAB_PAGE__COLUMNS:
				setColumns(COLUMNS_EDEFAULT);
				return;
			case FormPackage.TAB_PAGE__VIEW_ELEMENT:
				getViewElement().clear();
				return;
			case FormPackage.TAB_PAGE__MULTI_LANG_LABEL:
				setMultiLangLabel((Context)null);
				return;
			case FormPackage.TAB_PAGE__CLASSIFIERS:
				getClassifiers().clear();
				return;
			case FormPackage.TAB_PAGE__ORDER:
				setOrder(ORDER_EDEFAULT);
				return;
			case FormPackage.TAB_PAGE__FIELDS:
				getFields().clear();
				return;
			case FormPackage.TAB_PAGE__TAB_SEQUENCE:
				setTabSequence(TAB_SEQUENCE_EDEFAULT);
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
			case FormPackage.TAB_PAGE__COLUMNS:
				return columns != COLUMNS_EDEFAULT;
			case FormPackage.TAB_PAGE__VIEW_ELEMENT:
				return viewElement != null && !viewElement.isEmpty();
			case FormPackage.TAB_PAGE__MULTI_LANG_LABEL:
				return multiLangLabel != null;
			case FormPackage.TAB_PAGE__CLASSIFIERS:
				return classifiers != null && !classifiers.isEmpty();
			case FormPackage.TAB_PAGE__ORDER:
				return order != ORDER_EDEFAULT;
			case FormPackage.TAB_PAGE__FIELDS:
				return fields != null && !fields.isEmpty();
			case FormPackage.TAB_PAGE__TAB_SEQUENCE:
				return tabSequence != TAB_SEQUENCE_EDEFAULT;
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
				case FormPackage.TAB_PAGE__COLUMNS: return CommonPackage.HTML_LAYER_HOLDER__COLUMNS;
				default: return -1;
			}
		}
		if (baseClass == ViewPortHolder.class) {
			switch (derivedFeatureID) {
				case FormPackage.TAB_PAGE__VIEW_ELEMENT: return FormPackage.VIEW_PORT_HOLDER__VIEW_ELEMENT;
				default: return -1;
			}
		}
		if (baseClass == MultiLangLabel.class) {
			switch (derivedFeatureID) {
				case FormPackage.TAB_PAGE__MULTI_LANG_LABEL: return FormPackage.MULTI_LANG_LABEL__MULTI_LANG_LABEL;
				default: return -1;
			}
		}
		if (baseClass == Categorized.class) {
			switch (derivedFeatureID) {
				case FormPackage.TAB_PAGE__CLASSIFIERS: return ArtifactPackage.CATEGORIZED__CLASSIFIERS;
				default: return -1;
			}
		}
		if (baseClass == Orderable.class) {
			switch (derivedFeatureID) {
				case FormPackage.TAB_PAGE__ORDER: return CommonPackage.ORDERABLE__ORDER;
				default: return -1;
			}
		}
		if (baseClass == FlexFields.class) {
			switch (derivedFeatureID) {
				case FormPackage.TAB_PAGE__FIELDS: return FormPackage.FLEX_FIELDS__FIELDS;
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
				case CommonPackage.HTML_LAYER_HOLDER__COLUMNS: return FormPackage.TAB_PAGE__COLUMNS;
				default: return -1;
			}
		}
		if (baseClass == ViewPortHolder.class) {
			switch (baseFeatureID) {
				case FormPackage.VIEW_PORT_HOLDER__VIEW_ELEMENT: return FormPackage.TAB_PAGE__VIEW_ELEMENT;
				default: return -1;
			}
		}
		if (baseClass == MultiLangLabel.class) {
			switch (baseFeatureID) {
				case FormPackage.MULTI_LANG_LABEL__MULTI_LANG_LABEL: return FormPackage.TAB_PAGE__MULTI_LANG_LABEL;
				default: return -1;
			}
		}
		if (baseClass == Categorized.class) {
			switch (baseFeatureID) {
				case ArtifactPackage.CATEGORIZED__CLASSIFIERS: return FormPackage.TAB_PAGE__CLASSIFIERS;
				default: return -1;
			}
		}
		if (baseClass == Orderable.class) {
			switch (baseFeatureID) {
				case CommonPackage.ORDERABLE__ORDER: return FormPackage.TAB_PAGE__ORDER;
				default: return -1;
			}
		}
		if (baseClass == FlexFields.class) {
			switch (baseFeatureID) {
				case FormPackage.FLEX_FIELDS__FIELDS: return FormPackage.TAB_PAGE__FIELDS;
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
		result.append(", order: ");
		result.append(order);
		result.append(", tabSequence: ");
		result.append(tabSequence);
		result.append(')');
		return result.toString();
	}

} //TabPageImpl
