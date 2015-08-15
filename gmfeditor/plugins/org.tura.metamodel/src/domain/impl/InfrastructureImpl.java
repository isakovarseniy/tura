/**
 */
package domain.impl;

import domain.Configuration;
import domain.DomainPackage;
import domain.Infrastructure;
import domain.Recipe;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Infrastructure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link domain.impl.InfrastructureImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.impl.InfrastructureImpl#getRecipe <em>Recipe</em>}</li>
 *   <li>{@link domain.impl.InfrastructureImpl#getName <em>Name</em>}</li>
 *   <li>{@link domain.impl.InfrastructureImpl#getRecipeConfig <em>Recipe Config</em>}</li>
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
		return DomainPackage.Literals.INFRASTRUCTURE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.INFRASTRUCTURE__UID, oldUid, uid));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.INFRASTRUCTURE__RECIPE, oldRecipe, recipe));
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
	public NotificationChain basicSetRecipe(Recipe newRecipe, NotificationChain msgs) {
		Recipe oldRecipe = recipe;
		recipe = newRecipe;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.INFRASTRUCTURE__RECIPE, oldRecipe, newRecipe);
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
				msgs = ((InternalEObject)recipe).eInverseRemove(this, DomainPackage.RECIPE__INFRASTRUCTURES, Recipe.class, msgs);
			if (newRecipe != null)
				msgs = ((InternalEObject)newRecipe).eInverseAdd(this, DomainPackage.RECIPE__INFRASTRUCTURES, Recipe.class, msgs);
			msgs = basicSetRecipe(newRecipe, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.INFRASTRUCTURE__RECIPE, newRecipe, newRecipe));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.INFRASTRUCTURE__NAME, oldName, name));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.INFRASTRUCTURE__RECIPE_CONFIG, oldRecipeConfig, recipeConfig));
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
	public NotificationChain basicSetRecipeConfig(Configuration newRecipeConfig, NotificationChain msgs) {
		Configuration oldRecipeConfig = recipeConfig;
		recipeConfig = newRecipeConfig;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.INFRASTRUCTURE__RECIPE_CONFIG, oldRecipeConfig, newRecipeConfig);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecipeConfig(Configuration newRecipeConfig) {
		if (newRecipeConfig != recipeConfig) {
			NotificationChain msgs = null;
			if (recipeConfig != null)
				msgs = ((InternalEObject)recipeConfig).eInverseRemove(this, DomainPackage.CONFIGURATION__INFRASTRUCTURE, Configuration.class, msgs);
			if (newRecipeConfig != null)
				msgs = ((InternalEObject)newRecipeConfig).eInverseAdd(this, DomainPackage.CONFIGURATION__INFRASTRUCTURE, Configuration.class, msgs);
			msgs = basicSetRecipeConfig(newRecipeConfig, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.INFRASTRUCTURE__RECIPE_CONFIG, newRecipeConfig, newRecipeConfig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomainPackage.INFRASTRUCTURE__RECIPE:
				if (recipe != null)
					msgs = ((InternalEObject)recipe).eInverseRemove(this, DomainPackage.RECIPE__INFRASTRUCTURES, Recipe.class, msgs);
				return basicSetRecipe((Recipe)otherEnd, msgs);
			case DomainPackage.INFRASTRUCTURE__RECIPE_CONFIG:
				if (recipeConfig != null)
					msgs = ((InternalEObject)recipeConfig).eInverseRemove(this, DomainPackage.CONFIGURATION__INFRASTRUCTURE, Configuration.class, msgs);
				return basicSetRecipeConfig((Configuration)otherEnd, msgs);
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
			case DomainPackage.INFRASTRUCTURE__RECIPE:
				return basicSetRecipe(null, msgs);
			case DomainPackage.INFRASTRUCTURE__RECIPE_CONFIG:
				return basicSetRecipeConfig(null, msgs);
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
			case DomainPackage.INFRASTRUCTURE__UID:
				return getUid();
			case DomainPackage.INFRASTRUCTURE__RECIPE:
				if (resolve) return getRecipe();
				return basicGetRecipe();
			case DomainPackage.INFRASTRUCTURE__NAME:
				return getName();
			case DomainPackage.INFRASTRUCTURE__RECIPE_CONFIG:
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
			case DomainPackage.INFRASTRUCTURE__UID:
				setUid((String)newValue);
				return;
			case DomainPackage.INFRASTRUCTURE__RECIPE:
				setRecipe((Recipe)newValue);
				return;
			case DomainPackage.INFRASTRUCTURE__NAME:
				setName((String)newValue);
				return;
			case DomainPackage.INFRASTRUCTURE__RECIPE_CONFIG:
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
			case DomainPackage.INFRASTRUCTURE__UID:
				setUid(UID_EDEFAULT);
				return;
			case DomainPackage.INFRASTRUCTURE__RECIPE:
				setRecipe((Recipe)null);
				return;
			case DomainPackage.INFRASTRUCTURE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DomainPackage.INFRASTRUCTURE__RECIPE_CONFIG:
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
			case DomainPackage.INFRASTRUCTURE__UID:
				return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
			case DomainPackage.INFRASTRUCTURE__RECIPE:
				return recipe != null;
			case DomainPackage.INFRASTRUCTURE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DomainPackage.INFRASTRUCTURE__RECIPE_CONFIG:
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
