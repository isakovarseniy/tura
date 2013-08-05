/**
 */
package domain.impl;

import domain.Configuration;
import domain.DomainPackage;
import domain.Recipe;
import domain.Recipes;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Recipes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link domain.impl.RecipesImpl#getRecipe <em>Recipe</em>}</li>
 *   <li>{@link domain.impl.RecipesImpl#getConfigurations <em>Configurations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RecipesImpl extends EObjectImpl implements Recipes
{
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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RecipesImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return DomainPackage.Literals.RECIPES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Recipe getRecipe()
  {
    return recipe;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRecipe(Recipe newRecipe, NotificationChain msgs)
  {
    Recipe oldRecipe = recipe;
    recipe = newRecipe;
    if (eNotificationRequired())
    {
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
  public void setRecipe(Recipe newRecipe)
  {
    if (newRecipe != recipe)
    {
      NotificationChain msgs = null;
      if (recipe != null)
        msgs = ((InternalEObject)recipe).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.RECIPES__RECIPE, null, msgs);
      if (newRecipe != null)
        msgs = ((InternalEObject)newRecipe).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainPackage.RECIPES__RECIPE, null, msgs);
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
  public EList<Configuration> getConfigurations()
  {
    if (configurations == null)
    {
      configurations = new EObjectContainmentEList<Configuration>(Configuration.class, this, DomainPackage.RECIPES__CONFIGURATIONS);
    }
    return configurations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DomainPackage.RECIPES__RECIPE:
        return basicSetRecipe(null, msgs);
      case DomainPackage.RECIPES__CONFIGURATIONS:
        return ((InternalEList<?>)getConfigurations()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DomainPackage.RECIPES__RECIPE:
        return getRecipe();
      case DomainPackage.RECIPES__CONFIGURATIONS:
        return getConfigurations();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DomainPackage.RECIPES__RECIPE:
        setRecipe((Recipe)newValue);
        return;
      case DomainPackage.RECIPES__CONFIGURATIONS:
        getConfigurations().clear();
        getConfigurations().addAll((Collection<? extends Configuration>)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case DomainPackage.RECIPES__RECIPE:
        setRecipe((Recipe)null);
        return;
      case DomainPackage.RECIPES__CONFIGURATIONS:
        getConfigurations().clear();
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case DomainPackage.RECIPES__RECIPE:
        return recipe != null;
      case DomainPackage.RECIPES__CONFIGURATIONS:
        return configurations != null && !configurations.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //RecipesImpl
