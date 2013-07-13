/**
 */
package recipe.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import recipe.Configuration;
import recipe.Recipe;
import recipe.RecipePackage;
import recipe.Recipes;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Recipes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link recipe.impl.RecipesImpl#getRecipe <em>Recipe</em>}</li>
 *   <li>{@link recipe.impl.RecipesImpl#getConfigurations <em>Configurations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RecipesImpl extends EObjectImpl implements Recipes
{
  /**
   * The cached value of the '{@link #getRecipe() <em>Recipe</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRecipe()
   * @generated
   * @ordered
   */
  protected EList<Recipe> recipe;

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
    return RecipePackage.Literals.RECIPES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Recipe> getRecipe()
  {
    if (recipe == null)
    {
      recipe = new EObjectContainmentEList<Recipe>(Recipe.class, this, RecipePackage.RECIPES__RECIPE);
    }
    return recipe;
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
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case RecipePackage.RECIPES__RECIPE:
        return ((InternalEList<?>)getRecipe()).basicRemove(otherEnd, msgs);
      case RecipePackage.RECIPES__CONFIGURATIONS:
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
      case RecipePackage.RECIPES__RECIPE:
        return getRecipe();
      case RecipePackage.RECIPES__CONFIGURATIONS:
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
      case RecipePackage.RECIPES__RECIPE:
        getRecipe().clear();
        getRecipe().addAll((Collection<? extends Recipe>)newValue);
        return;
      case RecipePackage.RECIPES__CONFIGURATIONS:
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
      case RecipePackage.RECIPES__RECIPE:
        getRecipe().clear();
        return;
      case RecipePackage.RECIPES__CONFIGURATIONS:
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
      case RecipePackage.RECIPES__RECIPE:
        return recipe != null && !recipe.isEmpty();
      case RecipePackage.RECIPES__CONFIGURATIONS:
        return configurations != null && !configurations.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //RecipesImpl
