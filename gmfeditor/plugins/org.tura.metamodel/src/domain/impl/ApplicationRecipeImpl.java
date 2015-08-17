/*******************************************************************************
 * Tura - application generation platform
 *
 * Copyright (c) 2012, 2015, Arseniy Isakov
 *  
 * This project includes software developed by Arseniy Isakov
 * http://sourceforge.net/p/tura/wiki/Home/
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
/**
 */
package domain.impl;

import domain.ApplicationRecipe;
import domain.ApplicationRecipes;
import domain.DomainPackage;
import domain.Recipes;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application Recipe</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link domain.impl.ApplicationRecipeImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.impl.ApplicationRecipeImpl#getName <em>Name</em>}</li>
 *   <li>{@link domain.impl.ApplicationRecipeImpl#getRecipes <em>Recipes</em>}</li>
 *   <li>{@link domain.impl.ApplicationRecipeImpl#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApplicationRecipeImpl extends EObjectImpl implements ApplicationRecipe {
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
	 * The cached value of the '{@link #getRecipes() <em>Recipes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecipes()
	 * @generated
	 * @ordered
	 */
	protected Recipes recipes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationRecipeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.APPLICATION_RECIPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.APPLICATION_RECIPE__UID, oldUid, uid));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.APPLICATION_RECIPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Recipes getRecipes() {
		if (recipes != null && recipes.eIsProxy()) {
			InternalEObject oldRecipes = (InternalEObject)recipes;
			recipes = (Recipes)eResolveProxy(oldRecipes);
			if (recipes != oldRecipes) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.APPLICATION_RECIPE__RECIPES, oldRecipes, recipes));
			}
		}
		return recipes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Recipes basicGetRecipes() {
		return recipes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRecipes(Recipes newRecipes, NotificationChain msgs) {
		Recipes oldRecipes = recipes;
		recipes = newRecipes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.APPLICATION_RECIPE__RECIPES, oldRecipes, newRecipes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecipes(Recipes newRecipes) {
		if (newRecipes != recipes) {
			NotificationChain msgs = null;
			if (recipes != null)
				msgs = ((InternalEObject)recipes).eInverseRemove(this, DomainPackage.RECIPES__PARENT, Recipes.class, msgs);
			if (newRecipes != null)
				msgs = ((InternalEObject)newRecipes).eInverseAdd(this, DomainPackage.RECIPES__PARENT, Recipes.class, msgs);
			msgs = basicSetRecipes(newRecipes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.APPLICATION_RECIPE__RECIPES, newRecipes, newRecipes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationRecipes getParent() {
		if (eContainerFeatureID() != DomainPackage.APPLICATION_RECIPE__PARENT) return null;
		return (ApplicationRecipes)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(ApplicationRecipes newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, DomainPackage.APPLICATION_RECIPE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(ApplicationRecipes newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != DomainPackage.APPLICATION_RECIPE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, DomainPackage.APPLICATION_RECIPES__RECIPES, ApplicationRecipes.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.APPLICATION_RECIPE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomainPackage.APPLICATION_RECIPE__RECIPES:
				if (recipes != null)
					msgs = ((InternalEObject)recipes).eInverseRemove(this, DomainPackage.RECIPES__PARENT, Recipes.class, msgs);
				return basicSetRecipes((Recipes)otherEnd, msgs);
			case DomainPackage.APPLICATION_RECIPE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((ApplicationRecipes)otherEnd, msgs);
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
			case DomainPackage.APPLICATION_RECIPE__RECIPES:
				return basicSetRecipes(null, msgs);
			case DomainPackage.APPLICATION_RECIPE__PARENT:
				return basicSetParent(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case DomainPackage.APPLICATION_RECIPE__PARENT:
				return eInternalContainer().eInverseRemove(this, DomainPackage.APPLICATION_RECIPES__RECIPES, ApplicationRecipes.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DomainPackage.APPLICATION_RECIPE__UID:
				return getUid();
			case DomainPackage.APPLICATION_RECIPE__NAME:
				return getName();
			case DomainPackage.APPLICATION_RECIPE__RECIPES:
				if (resolve) return getRecipes();
				return basicGetRecipes();
			case DomainPackage.APPLICATION_RECIPE__PARENT:
				return getParent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DomainPackage.APPLICATION_RECIPE__UID:
				setUid((String)newValue);
				return;
			case DomainPackage.APPLICATION_RECIPE__NAME:
				setName((String)newValue);
				return;
			case DomainPackage.APPLICATION_RECIPE__RECIPES:
				setRecipes((Recipes)newValue);
				return;
			case DomainPackage.APPLICATION_RECIPE__PARENT:
				setParent((ApplicationRecipes)newValue);
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
			case DomainPackage.APPLICATION_RECIPE__UID:
				setUid(UID_EDEFAULT);
				return;
			case DomainPackage.APPLICATION_RECIPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DomainPackage.APPLICATION_RECIPE__RECIPES:
				setRecipes((Recipes)null);
				return;
			case DomainPackage.APPLICATION_RECIPE__PARENT:
				setParent((ApplicationRecipes)null);
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
			case DomainPackage.APPLICATION_RECIPE__UID:
				return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
			case DomainPackage.APPLICATION_RECIPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DomainPackage.APPLICATION_RECIPE__RECIPES:
				return recipes != null;
			case DomainPackage.APPLICATION_RECIPE__PARENT:
				return getParent() != null;
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (uid: ");
		result.append(uid);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ApplicationRecipeImpl
