/**
 */
package application.impl;

import application.ApplicationPackage;
import application.ApplicationRecipe;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import recipe.Recipe;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Recipe</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link application.impl.ApplicationRecipeImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link application.impl.ApplicationRecipeImpl#getName <em>Name</em>}</li>
 *   <li>{@link application.impl.ApplicationRecipeImpl#getRecipes <em>Recipes</em>}</li>
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
	 * The cached value of the '{@link #getRecipes() <em>Recipes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecipes()
	 * @generated
	 * @ordered
	 */
	protected Recipe recipes;

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
		return ApplicationPackage.Literals.APPLICATION_RECIPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.APPLICATION_RECIPE__UID, oldUid, uid));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.APPLICATION_RECIPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Recipe getRecipes() {
		return recipes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRecipes(Recipe newRecipes, NotificationChain msgs) {
		Recipe oldRecipes = recipes;
		recipes = newRecipes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApplicationPackage.APPLICATION_RECIPE__RECIPES, oldRecipes, newRecipes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecipes(Recipe newRecipes) {
		if (newRecipes != recipes) {
			NotificationChain msgs = null;
			if (recipes != null)
				msgs = ((InternalEObject)recipes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApplicationPackage.APPLICATION_RECIPE__RECIPES, null, msgs);
			if (newRecipes != null)
				msgs = ((InternalEObject)newRecipes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApplicationPackage.APPLICATION_RECIPE__RECIPES, null, msgs);
			msgs = basicSetRecipes(newRecipes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.APPLICATION_RECIPE__RECIPES, newRecipes, newRecipes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApplicationPackage.APPLICATION_RECIPE__RECIPES:
				return basicSetRecipes(null, msgs);
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
			case ApplicationPackage.APPLICATION_RECIPE__UID:
				return getUid();
			case ApplicationPackage.APPLICATION_RECIPE__NAME:
				return getName();
			case ApplicationPackage.APPLICATION_RECIPE__RECIPES:
				return getRecipes();
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
			case ApplicationPackage.APPLICATION_RECIPE__UID:
				setUid((String)newValue);
				return;
			case ApplicationPackage.APPLICATION_RECIPE__NAME:
				setName((String)newValue);
				return;
			case ApplicationPackage.APPLICATION_RECIPE__RECIPES:
				setRecipes((Recipe)newValue);
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
			case ApplicationPackage.APPLICATION_RECIPE__UID:
				setUid(UID_EDEFAULT);
				return;
			case ApplicationPackage.APPLICATION_RECIPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ApplicationPackage.APPLICATION_RECIPE__RECIPES:
				setRecipes((Recipe)null);
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
			case ApplicationPackage.APPLICATION_RECIPE__UID:
				return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
			case ApplicationPackage.APPLICATION_RECIPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ApplicationPackage.APPLICATION_RECIPE__RECIPES:
				return recipes != null;
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
