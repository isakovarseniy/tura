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

import common.CommonPackage;
import common.HTMLLayerHolder;

import form.AreaRef;
import form.Blockable;
import form.ChildrenHolder;
import form.FormPackage;
import form.LayerHolder;
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
 * An implementation of the model object '<em><b>Layer Holder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link form.impl.LayerHolderImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link form.impl.LayerHolderImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link form.impl.LayerHolderImpl#getBlock <em>Block</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LayerHolderImpl extends UielementImpl implements LayerHolder {
	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<Uielement> children;

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
	 * The cached value of the '{@link #getBlock() <em>Block</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlock()
	 * @generated
	 * @ordered
	 */
	protected EList<AreaRef> block;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LayerHolderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FormPackage.Literals.LAYER_HOLDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Uielement> getChildren() {
		if (children == null) {
			children = new EObjectContainmentEList<Uielement>(Uielement.class, this, FormPackage.LAYER_HOLDER__CHILDREN);
		}
		return children;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.LAYER_HOLDER__COLUMNS, oldColumns, columns));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AreaRef> getBlock() {
		if (block == null) {
			block = new EObjectContainmentEList<AreaRef>(AreaRef.class, this, FormPackage.LAYER_HOLDER__BLOCK);
		}
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FormPackage.LAYER_HOLDER__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
			case FormPackage.LAYER_HOLDER__BLOCK:
				return ((InternalEList<?>)getBlock()).basicRemove(otherEnd, msgs);
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
			case FormPackage.LAYER_HOLDER__CHILDREN:
				return getChildren();
			case FormPackage.LAYER_HOLDER__COLUMNS:
				return getColumns();
			case FormPackage.LAYER_HOLDER__BLOCK:
				return getBlock();
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
			case FormPackage.LAYER_HOLDER__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends Uielement>)newValue);
				return;
			case FormPackage.LAYER_HOLDER__COLUMNS:
				setColumns((Integer)newValue);
				return;
			case FormPackage.LAYER_HOLDER__BLOCK:
				getBlock().clear();
				getBlock().addAll((Collection<? extends AreaRef>)newValue);
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
			case FormPackage.LAYER_HOLDER__CHILDREN:
				getChildren().clear();
				return;
			case FormPackage.LAYER_HOLDER__COLUMNS:
				setColumns(COLUMNS_EDEFAULT);
				return;
			case FormPackage.LAYER_HOLDER__BLOCK:
				getBlock().clear();
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
			case FormPackage.LAYER_HOLDER__CHILDREN:
				return children != null && !children.isEmpty();
			case FormPackage.LAYER_HOLDER__COLUMNS:
				return columns != COLUMNS_EDEFAULT;
			case FormPackage.LAYER_HOLDER__BLOCK:
				return block != null && !block.isEmpty();
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
		if (baseClass == ChildrenHolder.class) {
			switch (derivedFeatureID) {
				case FormPackage.LAYER_HOLDER__CHILDREN: return FormPackage.CHILDREN_HOLDER__CHILDREN;
				default: return -1;
			}
		}
		if (baseClass == HTMLLayerHolder.class) {
			switch (derivedFeatureID) {
				case FormPackage.LAYER_HOLDER__COLUMNS: return CommonPackage.HTML_LAYER_HOLDER__COLUMNS;
				default: return -1;
			}
		}
		if (baseClass == Blockable.class) {
			switch (derivedFeatureID) {
				case FormPackage.LAYER_HOLDER__BLOCK: return FormPackage.BLOCKABLE__BLOCK;
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
		if (baseClass == ChildrenHolder.class) {
			switch (baseFeatureID) {
				case FormPackage.CHILDREN_HOLDER__CHILDREN: return FormPackage.LAYER_HOLDER__CHILDREN;
				default: return -1;
			}
		}
		if (baseClass == HTMLLayerHolder.class) {
			switch (baseFeatureID) {
				case CommonPackage.HTML_LAYER_HOLDER__COLUMNS: return FormPackage.LAYER_HOLDER__COLUMNS;
				default: return -1;
			}
		}
		if (baseClass == Blockable.class) {
			switch (baseFeatureID) {
				case FormPackage.BLOCKABLE__BLOCK: return FormPackage.LAYER_HOLDER__BLOCK;
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
		result.append(')');
		return result.toString();
	}

} //LayerHolderImpl
