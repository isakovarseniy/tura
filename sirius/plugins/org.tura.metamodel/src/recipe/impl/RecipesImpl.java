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
package recipe.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import recipe.ConfigExtension;
import recipe.Configuration;
import recipe.Infrastructure;
import recipe.Infrastructure2Configuration;
import recipe.Recipe;
import recipe.Recipe2Infrastructure;
import recipe.RecipePackage;
import recipe.Recipes;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Recipes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link recipe.impl.RecipesImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link recipe.impl.RecipesImpl#getName <em>Name</em>}</li>
 *   <li>{@link recipe.impl.RecipesImpl#getRecipe <em>Recipe</em>}</li>
 *   <li>{@link recipe.impl.RecipesImpl#getConfigurations <em>Configurations</em>}</li>
 *   <li>{@link recipe.impl.RecipesImpl#getInfrastructures <em>Infrastructures</em>}</li>
 *   <li>{@link recipe.impl.RecipesImpl#getConfigExtensions <em>Config Extensions</em>}</li>
 *   <li>{@link recipe.impl.RecipesImpl#getRecipe2Infrastructures <em>Recipe2 Infrastructures</em>}</li>
 *   <li>{@link recipe.impl.RecipesImpl#getInfrastructure2Configurations <em>Infrastructure2 Configurations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RecipesImpl extends EObjectImpl implements Recipes {
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
	 * The cached value of the '{@link #getRecipe() <em>Recipe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecipe()
	 * @generated
	 * @ordered
	 */
	protected Recipe recipe;

	/**
	 * The cached value of the '{@link #getConfigurations() <em>Configurations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurations()
	 * @generated
	 * @ordered
	 */
	protected EList<Configuration> configurations;

	/**
	 * The cached value of the '{@link #getInfrastructures() <em>Infrastructures</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfrastructures()
	 * @generated
	 * @ordered
	 */
	protected EList<Infrastructure> infrastructures;

	/**
	 * The cached value of the '{@link #getConfigExtensions() <em>Config Extensions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigExtensions()
	 * @generated
	 * @ordered
	 */
	protected EList<ConfigExtension> configExtensions;

	/**
	 * The cached value of the '{@link #getRecipe2Infrastructures() <em>Recipe2 Infrastructures</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecipe2Infrastructures()
	 * @generated
	 * @ordered
	 */
	protected EList<Recipe2Infrastructure> recipe2Infrastructures;

	/**
	 * The cached value of the '{@link #getInfrastructure2Configurations() <em>Infrastructure2 Configurations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfrastructure2Configurations()
	 * @generated
	 * @ordered
	 */
	protected EList<Infrastructure2Configuration> infrastructure2Configurations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecipesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RecipePackage.Literals.RECIPES;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RecipePackage.RECIPES__UID, oldUid, uid));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RecipePackage.RECIPES__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Recipe getRecipe() {
		return recipe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRecipe(Recipe newRecipe, NotificationChain msgs) {
		Recipe oldRecipe = recipe;
		recipe = newRecipe;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RecipePackage.RECIPES__RECIPE, oldRecipe, newRecipe);
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
	public void setRecipe(Recipe newRecipe) {
		if (newRecipe != recipe) {
			NotificationChain msgs = null;
			if (recipe != null)
				msgs = ((InternalEObject)recipe).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RecipePackage.RECIPES__RECIPE, null, msgs);
			if (newRecipe != null)
				msgs = ((InternalEObject)newRecipe).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RecipePackage.RECIPES__RECIPE, null, msgs);
			msgs = basicSetRecipe(newRecipe, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecipePackage.RECIPES__RECIPE, newRecipe, newRecipe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Configuration> getConfigurations() {
		if (configurations == null) {
			configurations = new EObjectContainmentEList<Configuration>(Configuration.class, this, RecipePackage.RECIPES__CONFIGURATIONS);
		}
		return configurations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Infrastructure> getInfrastructures() {
		if (infrastructures == null) {
			infrastructures = new EObjectContainmentEList<Infrastructure>(Infrastructure.class, this, RecipePackage.RECIPES__INFRASTRUCTURES);
		}
		return infrastructures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConfigExtension> getConfigExtensions() {
		if (configExtensions == null) {
			configExtensions = new EObjectContainmentEList<ConfigExtension>(ConfigExtension.class, this, RecipePackage.RECIPES__CONFIG_EXTENSIONS);
		}
		return configExtensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Recipe2Infrastructure> getRecipe2Infrastructures() {
		if (recipe2Infrastructures == null) {
			recipe2Infrastructures = new EObjectContainmentEList<Recipe2Infrastructure>(Recipe2Infrastructure.class, this, RecipePackage.RECIPES__RECIPE2_INFRASTRUCTURES);
		}
		return recipe2Infrastructures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Infrastructure2Configuration> getInfrastructure2Configurations() {
		if (infrastructure2Configurations == null) {
			infrastructure2Configurations = new EObjectContainmentEList<Infrastructure2Configuration>(Infrastructure2Configuration.class, this, RecipePackage.RECIPES__INFRASTRUCTURE2_CONFIGURATIONS);
		}
		return infrastructure2Configurations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RecipePackage.RECIPES__RECIPE:
				return basicSetRecipe(null, msgs);
			case RecipePackage.RECIPES__CONFIGURATIONS:
				return ((InternalEList<?>)getConfigurations()).basicRemove(otherEnd, msgs);
			case RecipePackage.RECIPES__INFRASTRUCTURES:
				return ((InternalEList<?>)getInfrastructures()).basicRemove(otherEnd, msgs);
			case RecipePackage.RECIPES__CONFIG_EXTENSIONS:
				return ((InternalEList<?>)getConfigExtensions()).basicRemove(otherEnd, msgs);
			case RecipePackage.RECIPES__RECIPE2_INFRASTRUCTURES:
				return ((InternalEList<?>)getRecipe2Infrastructures()).basicRemove(otherEnd, msgs);
			case RecipePackage.RECIPES__INFRASTRUCTURE2_CONFIGURATIONS:
				return ((InternalEList<?>)getInfrastructure2Configurations()).basicRemove(otherEnd, msgs);
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
			case RecipePackage.RECIPES__UID:
				return getUid();
			case RecipePackage.RECIPES__NAME:
				return getName();
			case RecipePackage.RECIPES__RECIPE:
				return getRecipe();
			case RecipePackage.RECIPES__CONFIGURATIONS:
				return getConfigurations();
			case RecipePackage.RECIPES__INFRASTRUCTURES:
				return getInfrastructures();
			case RecipePackage.RECIPES__CONFIG_EXTENSIONS:
				return getConfigExtensions();
			case RecipePackage.RECIPES__RECIPE2_INFRASTRUCTURES:
				return getRecipe2Infrastructures();
			case RecipePackage.RECIPES__INFRASTRUCTURE2_CONFIGURATIONS:
				return getInfrastructure2Configurations();
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
			case RecipePackage.RECIPES__UID:
				setUid((String)newValue);
				return;
			case RecipePackage.RECIPES__NAME:
				setName((String)newValue);
				return;
			case RecipePackage.RECIPES__RECIPE:
				setRecipe((Recipe)newValue);
				return;
			case RecipePackage.RECIPES__CONFIGURATIONS:
				getConfigurations().clear();
				getConfigurations().addAll((Collection<? extends Configuration>)newValue);
				return;
			case RecipePackage.RECIPES__INFRASTRUCTURES:
				getInfrastructures().clear();
				getInfrastructures().addAll((Collection<? extends Infrastructure>)newValue);
				return;
			case RecipePackage.RECIPES__CONFIG_EXTENSIONS:
				getConfigExtensions().clear();
				getConfigExtensions().addAll((Collection<? extends ConfigExtension>)newValue);
				return;
			case RecipePackage.RECIPES__RECIPE2_INFRASTRUCTURES:
				getRecipe2Infrastructures().clear();
				getRecipe2Infrastructures().addAll((Collection<? extends Recipe2Infrastructure>)newValue);
				return;
			case RecipePackage.RECIPES__INFRASTRUCTURE2_CONFIGURATIONS:
				getInfrastructure2Configurations().clear();
				getInfrastructure2Configurations().addAll((Collection<? extends Infrastructure2Configuration>)newValue);
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
			case RecipePackage.RECIPES__UID:
				setUid(UID_EDEFAULT);
				return;
			case RecipePackage.RECIPES__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RecipePackage.RECIPES__RECIPE:
				setRecipe((Recipe)null);
				return;
			case RecipePackage.RECIPES__CONFIGURATIONS:
				getConfigurations().clear();
				return;
			case RecipePackage.RECIPES__INFRASTRUCTURES:
				getInfrastructures().clear();
				return;
			case RecipePackage.RECIPES__CONFIG_EXTENSIONS:
				getConfigExtensions().clear();
				return;
			case RecipePackage.RECIPES__RECIPE2_INFRASTRUCTURES:
				getRecipe2Infrastructures().clear();
				return;
			case RecipePackage.RECIPES__INFRASTRUCTURE2_CONFIGURATIONS:
				getInfrastructure2Configurations().clear();
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
			case RecipePackage.RECIPES__UID:
				return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
			case RecipePackage.RECIPES__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RecipePackage.RECIPES__RECIPE:
				return recipe != null;
			case RecipePackage.RECIPES__CONFIGURATIONS:
				return configurations != null && !configurations.isEmpty();
			case RecipePackage.RECIPES__INFRASTRUCTURES:
				return infrastructures != null && !infrastructures.isEmpty();
			case RecipePackage.RECIPES__CONFIG_EXTENSIONS:
				return configExtensions != null && !configExtensions.isEmpty();
			case RecipePackage.RECIPES__RECIPE2_INFRASTRUCTURES:
				return recipe2Infrastructures != null && !recipe2Infrastructures.isEmpty();
			case RecipePackage.RECIPES__INFRASTRUCTURE2_CONFIGURATIONS:
				return infrastructure2Configurations != null && !infrastructure2Configurations.isEmpty();
		}
		return super.eIsSet(featureID);
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
		result.append(" (uid: ");
		result.append(uid);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //RecipesImpl
