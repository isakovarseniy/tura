/**
 */
package domain.impl;

import domain.DeploymentSequence;
import domain.DomainPackage;
import domain.Infrastructure;
import domain.Ingredient;
import domain.Recipe;
import domain.Recipes;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Recipe</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link domain.impl.RecipeImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.impl.RecipeImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link domain.impl.RecipeImpl#getName <em>Name</em>}</li>
 *   <li>{@link domain.impl.RecipeImpl#getIngredients <em>Ingredients</em>}</li>
 *   <li>{@link domain.impl.RecipeImpl#getInfrastructures <em>Infrastructures</em>}</li>
 *   <li>{@link domain.impl.RecipeImpl#getDeployment <em>Deployment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RecipeImpl extends UsingMappersImpl implements Recipe {
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
	 * The cached value of the '{@link #getInfrastructures() <em>Infrastructures</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfrastructures()
	 * @generated
	 * @ordered
	 */
	protected EList<Infrastructure> infrastructures;

	/**
	 * The cached value of the '{@link #getDeployment() <em>Deployment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployment()
	 * @generated
	 * @ordered
	 */
	protected DeploymentSequence deployment;

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
		return DomainPackage.Literals.RECIPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.RECIPE__UID, oldUid, uid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Recipes getParent() {
		if (eContainerFeatureID() != DomainPackage.RECIPE__PARENT) return null;
		return (Recipes)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(Recipes newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, DomainPackage.RECIPE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(Recipes newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != DomainPackage.RECIPE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, DomainPackage.RECIPES__RECIPE, Recipes.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.RECIPE__PARENT, newParent, newParent));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.RECIPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Ingredient> getIngredients() {
		if (ingredients == null) {
			ingredients = new EObjectContainmentWithInverseEList<Ingredient>(Ingredient.class, this, DomainPackage.RECIPE__INGREDIENTS, DomainPackage.INGREDIENT__PARENT);
		}
		return ingredients;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Infrastructure> getInfrastructures() {
		if (infrastructures == null) {
			infrastructures = new EObjectWithInverseResolvingEList<Infrastructure>(Infrastructure.class, this, DomainPackage.RECIPE__INFRASTRUCTURES, DomainPackage.INFRASTRUCTURE__RECIPE);
		}
		return infrastructures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentSequence getDeployment() {
		if (deployment != null && deployment.eIsProxy()) {
			InternalEObject oldDeployment = (InternalEObject)deployment;
			deployment = (DeploymentSequence)eResolveProxy(oldDeployment);
			if (deployment != oldDeployment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.RECIPE__DEPLOYMENT, oldDeployment, deployment));
			}
		}
		return deployment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentSequence basicGetDeployment() {
		return deployment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeployment(DeploymentSequence newDeployment) {
		DeploymentSequence oldDeployment = deployment;
		deployment = newDeployment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.RECIPE__DEPLOYMENT, oldDeployment, deployment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomainPackage.RECIPE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((Recipes)otherEnd, msgs);
			case DomainPackage.RECIPE__INGREDIENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIngredients()).basicAdd(otherEnd, msgs);
			case DomainPackage.RECIPE__INFRASTRUCTURES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInfrastructures()).basicAdd(otherEnd, msgs);
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
			case DomainPackage.RECIPE__PARENT:
				return basicSetParent(null, msgs);
			case DomainPackage.RECIPE__INGREDIENTS:
				return ((InternalEList<?>)getIngredients()).basicRemove(otherEnd, msgs);
			case DomainPackage.RECIPE__INFRASTRUCTURES:
				return ((InternalEList<?>)getInfrastructures()).basicRemove(otherEnd, msgs);
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
			case DomainPackage.RECIPE__PARENT:
				return eInternalContainer().eInverseRemove(this, DomainPackage.RECIPES__RECIPE, Recipes.class, msgs);
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
			case DomainPackage.RECIPE__UID:
				return getUid();
			case DomainPackage.RECIPE__PARENT:
				return getParent();
			case DomainPackage.RECIPE__NAME:
				return getName();
			case DomainPackage.RECIPE__INGREDIENTS:
				return getIngredients();
			case DomainPackage.RECIPE__INFRASTRUCTURES:
				return getInfrastructures();
			case DomainPackage.RECIPE__DEPLOYMENT:
				if (resolve) return getDeployment();
				return basicGetDeployment();
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
			case DomainPackage.RECIPE__UID:
				setUid((String)newValue);
				return;
			case DomainPackage.RECIPE__PARENT:
				setParent((Recipes)newValue);
				return;
			case DomainPackage.RECIPE__NAME:
				setName((String)newValue);
				return;
			case DomainPackage.RECIPE__INGREDIENTS:
				getIngredients().clear();
				getIngredients().addAll((Collection<? extends Ingredient>)newValue);
				return;
			case DomainPackage.RECIPE__INFRASTRUCTURES:
				getInfrastructures().clear();
				getInfrastructures().addAll((Collection<? extends Infrastructure>)newValue);
				return;
			case DomainPackage.RECIPE__DEPLOYMENT:
				setDeployment((DeploymentSequence)newValue);
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
			case DomainPackage.RECIPE__UID:
				setUid(UID_EDEFAULT);
				return;
			case DomainPackage.RECIPE__PARENT:
				setParent((Recipes)null);
				return;
			case DomainPackage.RECIPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DomainPackage.RECIPE__INGREDIENTS:
				getIngredients().clear();
				return;
			case DomainPackage.RECIPE__INFRASTRUCTURES:
				getInfrastructures().clear();
				return;
			case DomainPackage.RECIPE__DEPLOYMENT:
				setDeployment((DeploymentSequence)null);
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
			case DomainPackage.RECIPE__UID:
				return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
			case DomainPackage.RECIPE__PARENT:
				return getParent() != null;
			case DomainPackage.RECIPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DomainPackage.RECIPE__INGREDIENTS:
				return ingredients != null && !ingredients.isEmpty();
			case DomainPackage.RECIPE__INFRASTRUCTURES:
				return infrastructures != null && !infrastructures.isEmpty();
			case DomainPackage.RECIPE__DEPLOYMENT:
				return deployment != null;
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

} //RecipeImpl
