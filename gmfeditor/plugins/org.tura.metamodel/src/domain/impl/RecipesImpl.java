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
import domain.ConfigExtension;
import domain.Configuration;
import domain.DeploymentSequence;
import domain.DomainPackage;
import domain.Infrastructure;
import domain.Recipe;
import domain.Recipes;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Recipes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link domain.impl.RecipesImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.impl.RecipesImpl#getRecipe <em>Recipe</em>}</li>
 *   <li>{@link domain.impl.RecipesImpl#getConfigurations <em>Configurations</em>}</li>
 *   <li>{@link domain.impl.RecipesImpl#getInfrastructures <em>Infrastructures</em>}</li>
 *   <li>{@link domain.impl.RecipesImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link domain.impl.RecipesImpl#getDeployment <em>Deployment</em>}</li>
 *   <li>{@link domain.impl.RecipesImpl#getConfigExtension <em>Config Extension</em>}</li>
 *   <li>{@link domain.impl.RecipesImpl#getAny <em>Any</em>}</li>
 * </ul>
 * </p>
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
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected ApplicationRecipe parent;

	/**
	 * The cached value of the '{@link #getDeployment() <em>Deployment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployment()
	 * @generated
	 * @ordered
	 */
	protected DeploymentSequence deployment;

	/**
	 * The cached value of the '{@link #getConfigExtension() <em>Config Extension</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigExtension()
	 * @generated
	 * @ordered
	 */
	protected EList<ConfigExtension> configExtension;

	/**
	 * The cached value of the '{@link #getAny() <em>Any</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAny()
	 * @generated
	 * @ordered
	 */
	protected EObject any;

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
		return DomainPackage.Literals.RECIPES;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.RECIPES__UID, oldUid, uid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.RECIPES__RECIPE, oldRecipe, newRecipe);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecipe(Recipe newRecipe) {
		if (newRecipe != recipe) {
			NotificationChain msgs = null;
			if (recipe != null)
				msgs = ((InternalEObject)recipe).eInverseRemove(this, DomainPackage.RECIPE__PARENT, Recipe.class, msgs);
			if (newRecipe != null)
				msgs = ((InternalEObject)newRecipe).eInverseAdd(this, DomainPackage.RECIPE__PARENT, Recipe.class, msgs);
			msgs = basicSetRecipe(newRecipe, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.RECIPES__RECIPE, newRecipe, newRecipe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Configuration> getConfigurations() {
		if (configurations == null) {
			configurations = new EObjectContainmentEList<Configuration>(Configuration.class, this, DomainPackage.RECIPES__CONFIGURATIONS);
		}
		return configurations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Infrastructure> getInfrastructures() {
		if (infrastructures == null) {
			infrastructures = new EObjectContainmentEList<Infrastructure>(Infrastructure.class, this, DomainPackage.RECIPES__INFRASTRUCTURES);
		}
		return infrastructures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationRecipe getParent() {
		if (parent != null && parent.eIsProxy()) {
			InternalEObject oldParent = (InternalEObject)parent;
			parent = (ApplicationRecipe)eResolveProxy(oldParent);
			if (parent != oldParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.RECIPES__PARENT, oldParent, parent));
			}
		}
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationRecipe basicGetParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(ApplicationRecipe newParent, NotificationChain msgs) {
		ApplicationRecipe oldParent = parent;
		parent = newParent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.RECIPES__PARENT, oldParent, newParent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(ApplicationRecipe newParent) {
		if (newParent != parent) {
			NotificationChain msgs = null;
			if (parent != null)
				msgs = ((InternalEObject)parent).eInverseRemove(this, DomainPackage.APPLICATION_RECIPE__RECIPES, ApplicationRecipe.class, msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, DomainPackage.APPLICATION_RECIPE__RECIPES, ApplicationRecipe.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.RECIPES__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentSequence getDeployment() {
		return deployment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeployment(DeploymentSequence newDeployment, NotificationChain msgs) {
		DeploymentSequence oldDeployment = deployment;
		deployment = newDeployment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.RECIPES__DEPLOYMENT, oldDeployment, newDeployment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeployment(DeploymentSequence newDeployment) {
		if (newDeployment != deployment) {
			NotificationChain msgs = null;
			if (deployment != null)
				msgs = ((InternalEObject)deployment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.RECIPES__DEPLOYMENT, null, msgs);
			if (newDeployment != null)
				msgs = ((InternalEObject)newDeployment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainPackage.RECIPES__DEPLOYMENT, null, msgs);
			msgs = basicSetDeployment(newDeployment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.RECIPES__DEPLOYMENT, newDeployment, newDeployment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConfigExtension> getConfigExtension() {
		if (configExtension == null) {
			configExtension = new EObjectContainmentEList<ConfigExtension>(ConfigExtension.class, this, DomainPackage.RECIPES__CONFIG_EXTENSION);
		}
		return configExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getAny() {
		return any;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAny(EObject newAny, NotificationChain msgs) {
		EObject oldAny = any;
		any = newAny;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.RECIPES__ANY, oldAny, newAny);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAny(EObject newAny) {
		if (newAny != any) {
			NotificationChain msgs = null;
			if (any != null)
				msgs = ((InternalEObject)any).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.RECIPES__ANY, null, msgs);
			if (newAny != null)
				msgs = ((InternalEObject)newAny).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainPackage.RECIPES__ANY, null, msgs);
			msgs = basicSetAny(newAny, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.RECIPES__ANY, newAny, newAny));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomainPackage.RECIPES__RECIPE:
				if (recipe != null)
					msgs = ((InternalEObject)recipe).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.RECIPES__RECIPE, null, msgs);
				return basicSetRecipe((Recipe)otherEnd, msgs);
			case DomainPackage.RECIPES__PARENT:
				if (parent != null)
					msgs = ((InternalEObject)parent).eInverseRemove(this, DomainPackage.APPLICATION_RECIPE__RECIPES, ApplicationRecipe.class, msgs);
				return basicSetParent((ApplicationRecipe)otherEnd, msgs);
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
			case DomainPackage.RECIPES__RECIPE:
				return basicSetRecipe(null, msgs);
			case DomainPackage.RECIPES__CONFIGURATIONS:
				return ((InternalEList<?>)getConfigurations()).basicRemove(otherEnd, msgs);
			case DomainPackage.RECIPES__INFRASTRUCTURES:
				return ((InternalEList<?>)getInfrastructures()).basicRemove(otherEnd, msgs);
			case DomainPackage.RECIPES__PARENT:
				return basicSetParent(null, msgs);
			case DomainPackage.RECIPES__DEPLOYMENT:
				return basicSetDeployment(null, msgs);
			case DomainPackage.RECIPES__CONFIG_EXTENSION:
				return ((InternalEList<?>)getConfigExtension()).basicRemove(otherEnd, msgs);
			case DomainPackage.RECIPES__ANY:
				return basicSetAny(null, msgs);
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
			case DomainPackage.RECIPES__UID:
				return getUid();
			case DomainPackage.RECIPES__RECIPE:
				return getRecipe();
			case DomainPackage.RECIPES__CONFIGURATIONS:
				return getConfigurations();
			case DomainPackage.RECIPES__INFRASTRUCTURES:
				return getInfrastructures();
			case DomainPackage.RECIPES__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case DomainPackage.RECIPES__DEPLOYMENT:
				return getDeployment();
			case DomainPackage.RECIPES__CONFIG_EXTENSION:
				return getConfigExtension();
			case DomainPackage.RECIPES__ANY:
				return getAny();
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
			case DomainPackage.RECIPES__UID:
				setUid((String)newValue);
				return;
			case DomainPackage.RECIPES__RECIPE:
				setRecipe((Recipe)newValue);
				return;
			case DomainPackage.RECIPES__CONFIGURATIONS:
				getConfigurations().clear();
				getConfigurations().addAll((Collection<? extends Configuration>)newValue);
				return;
			case DomainPackage.RECIPES__INFRASTRUCTURES:
				getInfrastructures().clear();
				getInfrastructures().addAll((Collection<? extends Infrastructure>)newValue);
				return;
			case DomainPackage.RECIPES__PARENT:
				setParent((ApplicationRecipe)newValue);
				return;
			case DomainPackage.RECIPES__DEPLOYMENT:
				setDeployment((DeploymentSequence)newValue);
				return;
			case DomainPackage.RECIPES__CONFIG_EXTENSION:
				getConfigExtension().clear();
				getConfigExtension().addAll((Collection<? extends ConfigExtension>)newValue);
				return;
			case DomainPackage.RECIPES__ANY:
				setAny((EObject)newValue);
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
			case DomainPackage.RECIPES__UID:
				setUid(UID_EDEFAULT);
				return;
			case DomainPackage.RECIPES__RECIPE:
				setRecipe((Recipe)null);
				return;
			case DomainPackage.RECIPES__CONFIGURATIONS:
				getConfigurations().clear();
				return;
			case DomainPackage.RECIPES__INFRASTRUCTURES:
				getInfrastructures().clear();
				return;
			case DomainPackage.RECIPES__PARENT:
				setParent((ApplicationRecipe)null);
				return;
			case DomainPackage.RECIPES__DEPLOYMENT:
				setDeployment((DeploymentSequence)null);
				return;
			case DomainPackage.RECIPES__CONFIG_EXTENSION:
				getConfigExtension().clear();
				return;
			case DomainPackage.RECIPES__ANY:
				setAny((EObject)null);
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
			case DomainPackage.RECIPES__UID:
				return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
			case DomainPackage.RECIPES__RECIPE:
				return recipe != null;
			case DomainPackage.RECIPES__CONFIGURATIONS:
				return configurations != null && !configurations.isEmpty();
			case DomainPackage.RECIPES__INFRASTRUCTURES:
				return infrastructures != null && !infrastructures.isEmpty();
			case DomainPackage.RECIPES__PARENT:
				return parent != null;
			case DomainPackage.RECIPES__DEPLOYMENT:
				return deployment != null;
			case DomainPackage.RECIPES__CONFIG_EXTENSION:
				return configExtension != null && !configExtension.isEmpty();
			case DomainPackage.RECIPES__ANY:
				return any != null;
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
		result.append(')');
		return result.toString();
	}

} //RecipesImpl
