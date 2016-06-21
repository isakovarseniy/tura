/**
 */
package recipe.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import recipe.Configuration;
import recipe.Infrastructure;
import recipe.Recipe;
import recipe.RecipePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Infrastructure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link recipe.impl.InfrastructureImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link recipe.impl.InfrastructureImpl#getRecipe <em>Recipe</em>}</li>
 *   <li>{@link recipe.impl.InfrastructureImpl#getName <em>Name</em>}</li>
 *   <li>{@link recipe.impl.InfrastructureImpl#getRecipeConfig <em>Recipe Config</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InfrastructureImpl extends EObjectImpl implements Infrastructure {
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
	 * The cached value of the '{@link #getRecipe() <em>Recipe</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecipe()
	 * @generated
	 * @ordered
	 */
	protected Recipe recipe;

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
	 * The cached value of the '{@link #getRecipeConfig() <em>Recipe Config</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecipeConfig()
	 * @generated
	 * @ordered
	 */
	protected Configuration recipeConfig;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfrastructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RecipePackage.Literals.INFRASTRUCTURE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RecipePackage.INFRASTRUCTURE__UID, oldUid, uid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Recipe getRecipe() {
		if (recipe != null && recipe.eIsProxy()) {
			InternalEObject oldRecipe = (InternalEObject)recipe;
			recipe = (Recipe)eResolveProxy(oldRecipe);
			if (recipe != oldRecipe) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RecipePackage.INFRASTRUCTURE__RECIPE, oldRecipe, recipe));
			}
		}
		return recipe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Recipe basicGetRecipe() {
		return recipe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecipe(Recipe newRecipe) {
		Recipe oldRecipe = recipe;
		recipe = newRecipe;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecipePackage.INFRASTRUCTURE__RECIPE, oldRecipe, recipe));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RecipePackage.INFRASTRUCTURE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration getRecipeConfig() {
		if (recipeConfig != null && recipeConfig.eIsProxy()) {
			InternalEObject oldRecipeConfig = (InternalEObject)recipeConfig;
			recipeConfig = (Configuration)eResolveProxy(oldRecipeConfig);
			if (recipeConfig != oldRecipeConfig) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RecipePackage.INFRASTRUCTURE__RECIPE_CONFIG, oldRecipeConfig, recipeConfig));
			}
		}
		return recipeConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration basicGetRecipeConfig() {
		return recipeConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecipeConfig(Configuration newRecipeConfig) {
		Configuration oldRecipeConfig = recipeConfig;
		recipeConfig = newRecipeConfig;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecipePackage.INFRASTRUCTURE__RECIPE_CONFIG, oldRecipeConfig, recipeConfig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RecipePackage.INFRASTRUCTURE__UID:
				return getUid();
			case RecipePackage.INFRASTRUCTURE__RECIPE:
				if (resolve) return getRecipe();
				return basicGetRecipe();
			case RecipePackage.INFRASTRUCTURE__NAME:
				return getName();
			case RecipePackage.INFRASTRUCTURE__RECIPE_CONFIG:
				if (resolve) return getRecipeConfig();
				return basicGetRecipeConfig();
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
			case RecipePackage.INFRASTRUCTURE__UID:
				setUid((String)newValue);
				return;
			case RecipePackage.INFRASTRUCTURE__RECIPE:
				setRecipe((Recipe)newValue);
				return;
			case RecipePackage.INFRASTRUCTURE__NAME:
				setName((String)newValue);
				return;
			case RecipePackage.INFRASTRUCTURE__RECIPE_CONFIG:
				setRecipeConfig((Configuration)newValue);
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
			case RecipePackage.INFRASTRUCTURE__UID:
				setUid(UID_EDEFAULT);
				return;
			case RecipePackage.INFRASTRUCTURE__RECIPE:
				setRecipe((Recipe)null);
				return;
			case RecipePackage.INFRASTRUCTURE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RecipePackage.INFRASTRUCTURE__RECIPE_CONFIG:
				setRecipeConfig((Configuration)null);
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
			case RecipePackage.INFRASTRUCTURE__UID:
				return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
			case RecipePackage.INFRASTRUCTURE__RECIPE:
				return recipe != null;
			case RecipePackage.INFRASTRUCTURE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RecipePackage.INFRASTRUCTURE__RECIPE_CONFIG:
				return recipeConfig != null;
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

} //InfrastructureImpl
