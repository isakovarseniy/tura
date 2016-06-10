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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import recipe.ConfigExtension;
import recipe.Configuration;
import recipe.DeploymentSequence;
import recipe.Infrastructure;
import recipe.Recipe;
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
 *   <li>{@link recipe.impl.RecipesImpl#getRecipe <em>Recipe</em>}</li>
 *   <li>{@link recipe.impl.RecipesImpl#getConfigurations <em>Configurations</em>}</li>
 *   <li>{@link recipe.impl.RecipesImpl#getInfrastructures <em>Infrastructures</em>}</li>
 *   <li>{@link recipe.impl.RecipesImpl#getDeployment <em>Deployment</em>}</li>
 *   <li>{@link recipe.impl.RecipesImpl#getConfigExtension <em>Config Extension</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RecipesImpl extends MinimalEObjectImpl.Container implements Recipes {
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
			eNotify(new ENotificationImpl(this, Notification.SET, RecipePackage.RECIPES__UID, oldUid, uid));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RecipePackage.RECIPES__DEPLOYMENT, oldDeployment, newDeployment);
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
				msgs = ((InternalEObject)deployment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RecipePackage.RECIPES__DEPLOYMENT, null, msgs);
			if (newDeployment != null)
				msgs = ((InternalEObject)newDeployment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RecipePackage.RECIPES__DEPLOYMENT, null, msgs);
			msgs = basicSetDeployment(newDeployment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecipePackage.RECIPES__DEPLOYMENT, newDeployment, newDeployment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConfigExtension> getConfigExtension() {
		if (configExtension == null) {
			configExtension = new EObjectContainmentEList<ConfigExtension>(ConfigExtension.class, this, RecipePackage.RECIPES__CONFIG_EXTENSION);
		}
		return configExtension;
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
			case RecipePackage.RECIPES__DEPLOYMENT:
				return basicSetDeployment(null, msgs);
			case RecipePackage.RECIPES__CONFIG_EXTENSION:
				return ((InternalEList<?>)getConfigExtension()).basicRemove(otherEnd, msgs);
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
			case RecipePackage.RECIPES__RECIPE:
				return getRecipe();
			case RecipePackage.RECIPES__CONFIGURATIONS:
				return getConfigurations();
			case RecipePackage.RECIPES__INFRASTRUCTURES:
				return getInfrastructures();
			case RecipePackage.RECIPES__DEPLOYMENT:
				return getDeployment();
			case RecipePackage.RECIPES__CONFIG_EXTENSION:
				return getConfigExtension();
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
			case RecipePackage.RECIPES__DEPLOYMENT:
				setDeployment((DeploymentSequence)newValue);
				return;
			case RecipePackage.RECIPES__CONFIG_EXTENSION:
				getConfigExtension().clear();
				getConfigExtension().addAll((Collection<? extends ConfigExtension>)newValue);
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
			case RecipePackage.RECIPES__RECIPE:
				setRecipe((Recipe)null);
				return;
			case RecipePackage.RECIPES__CONFIGURATIONS:
				getConfigurations().clear();
				return;
			case RecipePackage.RECIPES__INFRASTRUCTURES:
				getInfrastructures().clear();
				return;
			case RecipePackage.RECIPES__DEPLOYMENT:
				setDeployment((DeploymentSequence)null);
				return;
			case RecipePackage.RECIPES__CONFIG_EXTENSION:
				getConfigExtension().clear();
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
			case RecipePackage.RECIPES__RECIPE:
				return recipe != null;
			case RecipePackage.RECIPES__CONFIGURATIONS:
				return configurations != null && !configurations.isEmpty();
			case RecipePackage.RECIPES__INFRASTRUCTURES:
				return infrastructures != null && !infrastructures.isEmpty();
			case RecipePackage.RECIPES__DEPLOYMENT:
				return deployment != null;
			case RecipePackage.RECIPES__CONFIG_EXTENSION:
				return configExtension != null && !configExtension.isEmpty();
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
