/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2022 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
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
package recipe.impl;

import common.CommonPackage;
import common.HTMLLayerHolder;
import common.Orderable;

import java.util.Collection;

import mapper.MappingLayer;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import recipe.Component;
import recipe.Ingredient;
import recipe.RecipePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ingredient</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link recipe.impl.IngredientImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link recipe.impl.IngredientImpl#getOrder <em>Order</em>}</li>
 *   <li>{@link recipe.impl.IngredientImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link recipe.impl.IngredientImpl#getName <em>Name</em>}</li>
 *   <li>{@link recipe.impl.IngredientImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link recipe.impl.IngredientImpl#isSkip <em>Skip</em>}</li>
 *   <li>{@link recipe.impl.IngredientImpl#getVewLayer <em>Vew Layer</em>}</li>
 *   <li>{@link recipe.impl.IngredientImpl#getModelLayer <em>Model Layer</em>}</li>
 *   <li>{@link recipe.impl.IngredientImpl#getControllerLayer <em>Controller Layer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IngredientImpl extends UsingMappersImpl implements Ingredient {
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
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> components;

	/**
	 * The default value of the '{@link #isSkip() <em>Skip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSkip()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SKIP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSkip() <em>Skip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSkip()
	 * @generated
	 * @ordered
	 */
	protected boolean skip = SKIP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVewLayer() <em>Vew Layer</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVewLayer()
	 * @generated
	 * @ordered
	 */
	protected EList<MappingLayer> vewLayer;

	/**
	 * The cached value of the '{@link #getModelLayer() <em>Model Layer</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelLayer()
	 * @generated
	 * @ordered
	 */
	protected EList<MappingLayer> modelLayer;

	/**
	 * The cached value of the '{@link #getControllerLayer() <em>Controller Layer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControllerLayer()
	 * @generated
	 * @ordered
	 */
	protected MappingLayer controllerLayer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IngredientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RecipePackage.Literals.INGREDIENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RecipePackage.INGREDIENT__COLUMNS, oldColumns, columns));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RecipePackage.INGREDIENT__ORDER, oldOrder, order));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RecipePackage.INGREDIENT__UID, oldUid, uid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecipePackage.INGREDIENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Component> getComponents() {
		if (components == null) {
			components = new EObjectContainmentEList<Component>(Component.class, this, RecipePackage.INGREDIENT__COMPONENTS);
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSkip() {
		return skip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSkip(boolean newSkip) {
		boolean oldSkip = skip;
		skip = newSkip;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecipePackage.INGREDIENT__SKIP, oldSkip, skip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MappingLayer> getVewLayer() {
		if (vewLayer == null) {
			vewLayer = new EObjectResolvingEList<MappingLayer>(MappingLayer.class, this, RecipePackage.INGREDIENT__VEW_LAYER);
		}
		return vewLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MappingLayer> getModelLayer() {
		if (modelLayer == null) {
			modelLayer = new EObjectResolvingEList<MappingLayer>(MappingLayer.class, this, RecipePackage.INGREDIENT__MODEL_LAYER);
		}
		return modelLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MappingLayer getControllerLayer() {
		if (controllerLayer != null && controllerLayer.eIsProxy()) {
			InternalEObject oldControllerLayer = (InternalEObject)controllerLayer;
			controllerLayer = (MappingLayer)eResolveProxy(oldControllerLayer);
			if (controllerLayer != oldControllerLayer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RecipePackage.INGREDIENT__CONTROLLER_LAYER, oldControllerLayer, controllerLayer));
			}
		}
		return controllerLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingLayer basicGetControllerLayer() {
		return controllerLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setControllerLayer(MappingLayer newControllerLayer) {
		MappingLayer oldControllerLayer = controllerLayer;
		controllerLayer = newControllerLayer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecipePackage.INGREDIENT__CONTROLLER_LAYER, oldControllerLayer, controllerLayer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RecipePackage.INGREDIENT__COMPONENTS:
				return ((InternalEList<?>)getComponents()).basicRemove(otherEnd, msgs);
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
			case RecipePackage.INGREDIENT__COLUMNS:
				return getColumns();
			case RecipePackage.INGREDIENT__ORDER:
				return getOrder();
			case RecipePackage.INGREDIENT__UID:
				return getUid();
			case RecipePackage.INGREDIENT__NAME:
				return getName();
			case RecipePackage.INGREDIENT__COMPONENTS:
				return getComponents();
			case RecipePackage.INGREDIENT__SKIP:
				return isSkip();
			case RecipePackage.INGREDIENT__VEW_LAYER:
				return getVewLayer();
			case RecipePackage.INGREDIENT__MODEL_LAYER:
				return getModelLayer();
			case RecipePackage.INGREDIENT__CONTROLLER_LAYER:
				if (resolve) return getControllerLayer();
				return basicGetControllerLayer();
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
			case RecipePackage.INGREDIENT__COLUMNS:
				setColumns((Integer)newValue);
				return;
			case RecipePackage.INGREDIENT__ORDER:
				setOrder((Integer)newValue);
				return;
			case RecipePackage.INGREDIENT__UID:
				setUid((String)newValue);
				return;
			case RecipePackage.INGREDIENT__NAME:
				setName((String)newValue);
				return;
			case RecipePackage.INGREDIENT__COMPONENTS:
				getComponents().clear();
				getComponents().addAll((Collection<? extends Component>)newValue);
				return;
			case RecipePackage.INGREDIENT__SKIP:
				setSkip((Boolean)newValue);
				return;
			case RecipePackage.INGREDIENT__VEW_LAYER:
				getVewLayer().clear();
				getVewLayer().addAll((Collection<? extends MappingLayer>)newValue);
				return;
			case RecipePackage.INGREDIENT__MODEL_LAYER:
				getModelLayer().clear();
				getModelLayer().addAll((Collection<? extends MappingLayer>)newValue);
				return;
			case RecipePackage.INGREDIENT__CONTROLLER_LAYER:
				setControllerLayer((MappingLayer)newValue);
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
			case RecipePackage.INGREDIENT__COLUMNS:
				setColumns(COLUMNS_EDEFAULT);
				return;
			case RecipePackage.INGREDIENT__ORDER:
				setOrder(ORDER_EDEFAULT);
				return;
			case RecipePackage.INGREDIENT__UID:
				setUid(UID_EDEFAULT);
				return;
			case RecipePackage.INGREDIENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RecipePackage.INGREDIENT__COMPONENTS:
				getComponents().clear();
				return;
			case RecipePackage.INGREDIENT__SKIP:
				setSkip(SKIP_EDEFAULT);
				return;
			case RecipePackage.INGREDIENT__VEW_LAYER:
				getVewLayer().clear();
				return;
			case RecipePackage.INGREDIENT__MODEL_LAYER:
				getModelLayer().clear();
				return;
			case RecipePackage.INGREDIENT__CONTROLLER_LAYER:
				setControllerLayer((MappingLayer)null);
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
			case RecipePackage.INGREDIENT__COLUMNS:
				return columns != COLUMNS_EDEFAULT;
			case RecipePackage.INGREDIENT__ORDER:
				return order != ORDER_EDEFAULT;
			case RecipePackage.INGREDIENT__UID:
				return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
			case RecipePackage.INGREDIENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RecipePackage.INGREDIENT__COMPONENTS:
				return components != null && !components.isEmpty();
			case RecipePackage.INGREDIENT__SKIP:
				return skip != SKIP_EDEFAULT;
			case RecipePackage.INGREDIENT__VEW_LAYER:
				return vewLayer != null && !vewLayer.isEmpty();
			case RecipePackage.INGREDIENT__MODEL_LAYER:
				return modelLayer != null && !modelLayer.isEmpty();
			case RecipePackage.INGREDIENT__CONTROLLER_LAYER:
				return controllerLayer != null;
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
				case RecipePackage.INGREDIENT__COLUMNS: return CommonPackage.HTML_LAYER_HOLDER__COLUMNS;
				default: return -1;
			}
		}
		if (baseClass == Orderable.class) {
			switch (derivedFeatureID) {
				case RecipePackage.INGREDIENT__ORDER: return CommonPackage.ORDERABLE__ORDER;
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
				case CommonPackage.HTML_LAYER_HOLDER__COLUMNS: return RecipePackage.INGREDIENT__COLUMNS;
				default: return -1;
			}
		}
		if (baseClass == Orderable.class) {
			switch (baseFeatureID) {
				case CommonPackage.ORDERABLE__ORDER: return RecipePackage.INGREDIENT__ORDER;
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
		result.append(", uid: ");
		result.append(uid);
		result.append(", name: ");
		result.append(name);
		result.append(", skip: ");
		result.append(skip);
		result.append(')');
		return result.toString();
	}

} //IngredientImpl
