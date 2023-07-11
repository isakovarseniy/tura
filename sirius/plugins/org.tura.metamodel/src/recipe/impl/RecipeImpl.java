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
package recipe.impl;

import common.CommonPackage;
import common.HTMLLayerHolder;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import recipe.DeploymentComponent;
import recipe.DeploymentStarStep;
import recipe.Ingredient;
import recipe.Recipe;
import recipe.RecipePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Recipe</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link recipe.impl.RecipeImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link recipe.impl.RecipeImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link recipe.impl.RecipeImpl#getName <em>Name</em>}</li>
 *   <li>{@link recipe.impl.RecipeImpl#getIngredients <em>Ingredients</em>}</li>
 *   <li>{@link recipe.impl.RecipeImpl#getDeplymentStep <em>Deplyment Step</em>}</li>
 *   <li>{@link recipe.impl.RecipeImpl#getStartSeq <em>Start Seq</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RecipeImpl extends UsingMappersImpl implements Recipe {
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
	 * The cached value of the '{@link #getIngredients() <em>Ingredients</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIngredients()
	 * @generated
	 * @ordered
	 */
	protected EList<Ingredient> ingredients;

	/**
	 * The cached value of the '{@link #getDeplymentStep() <em>Deplyment Step</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeplymentStep()
	 * @generated
	 * @ordered
	 */
	protected EList<DeploymentComponent> deplymentStep;

	/**
	 * The cached value of the '{@link #getStartSeq() <em>Start Seq</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartSeq()
	 * @generated
	 * @ordered
	 */
	protected DeploymentStarStep startSeq;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecipeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RecipePackage.Literals.RECIPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RecipePackage.RECIPE__COLUMNS, oldColumns, columns));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RecipePackage.RECIPE__UID, oldUid, uid));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RecipePackage.RECIPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Ingredient> getIngredients() {
		if (ingredients == null) {
			ingredients = new EObjectContainmentEList<Ingredient>(Ingredient.class, this, RecipePackage.RECIPE__INGREDIENTS);
		}
		return ingredients;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DeploymentComponent> getDeplymentStep() {
		if (deplymentStep == null) {
			deplymentStep = new EObjectContainmentEList<DeploymentComponent>(DeploymentComponent.class, this, RecipePackage.RECIPE__DEPLYMENT_STEP);
		}
		return deplymentStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeploymentStarStep getStartSeq() {
		return startSeq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartSeq(DeploymentStarStep newStartSeq, NotificationChain msgs) {
		DeploymentStarStep oldStartSeq = startSeq;
		startSeq = newStartSeq;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RecipePackage.RECIPE__START_SEQ, oldStartSeq, newStartSeq);
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
	public void setStartSeq(DeploymentStarStep newStartSeq) {
		if (newStartSeq != startSeq) {
			NotificationChain msgs = null;
			if (startSeq != null)
				msgs = ((InternalEObject)startSeq).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RecipePackage.RECIPE__START_SEQ, null, msgs);
			if (newStartSeq != null)
				msgs = ((InternalEObject)newStartSeq).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RecipePackage.RECIPE__START_SEQ, null, msgs);
			msgs = basicSetStartSeq(newStartSeq, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecipePackage.RECIPE__START_SEQ, newStartSeq, newStartSeq));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RecipePackage.RECIPE__INGREDIENTS:
				return ((InternalEList<?>)getIngredients()).basicRemove(otherEnd, msgs);
			case RecipePackage.RECIPE__DEPLYMENT_STEP:
				return ((InternalEList<?>)getDeplymentStep()).basicRemove(otherEnd, msgs);
			case RecipePackage.RECIPE__START_SEQ:
				return basicSetStartSeq(null, msgs);
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
			case RecipePackage.RECIPE__COLUMNS:
				return getColumns();
			case RecipePackage.RECIPE__UID:
				return getUid();
			case RecipePackage.RECIPE__NAME:
				return getName();
			case RecipePackage.RECIPE__INGREDIENTS:
				return getIngredients();
			case RecipePackage.RECIPE__DEPLYMENT_STEP:
				return getDeplymentStep();
			case RecipePackage.RECIPE__START_SEQ:
				return getStartSeq();
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
			case RecipePackage.RECIPE__COLUMNS:
				setColumns((Integer)newValue);
				return;
			case RecipePackage.RECIPE__UID:
				setUid((String)newValue);
				return;
			case RecipePackage.RECIPE__NAME:
				setName((String)newValue);
				return;
			case RecipePackage.RECIPE__INGREDIENTS:
				getIngredients().clear();
				getIngredients().addAll((Collection<? extends Ingredient>)newValue);
				return;
			case RecipePackage.RECIPE__DEPLYMENT_STEP:
				getDeplymentStep().clear();
				getDeplymentStep().addAll((Collection<? extends DeploymentComponent>)newValue);
				return;
			case RecipePackage.RECIPE__START_SEQ:
				setStartSeq((DeploymentStarStep)newValue);
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
			case RecipePackage.RECIPE__COLUMNS:
				setColumns(COLUMNS_EDEFAULT);
				return;
			case RecipePackage.RECIPE__UID:
				setUid(UID_EDEFAULT);
				return;
			case RecipePackage.RECIPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RecipePackage.RECIPE__INGREDIENTS:
				getIngredients().clear();
				return;
			case RecipePackage.RECIPE__DEPLYMENT_STEP:
				getDeplymentStep().clear();
				return;
			case RecipePackage.RECIPE__START_SEQ:
				setStartSeq((DeploymentStarStep)null);
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
			case RecipePackage.RECIPE__COLUMNS:
				return columns != COLUMNS_EDEFAULT;
			case RecipePackage.RECIPE__UID:
				return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
			case RecipePackage.RECIPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RecipePackage.RECIPE__INGREDIENTS:
				return ingredients != null && !ingredients.isEmpty();
			case RecipePackage.RECIPE__DEPLYMENT_STEP:
				return deplymentStep != null && !deplymentStep.isEmpty();
			case RecipePackage.RECIPE__START_SEQ:
				return startSeq != null;
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
				case RecipePackage.RECIPE__COLUMNS: return CommonPackage.HTML_LAYER_HOLDER__COLUMNS;
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
				case CommonPackage.HTML_LAYER_HOLDER__COLUMNS: return RecipePackage.RECIPE__COLUMNS;
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
		result.append(", uid: ");
		result.append(uid);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //RecipeImpl
