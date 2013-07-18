/**
 */
package recipe.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

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
  public void setRecipe(Recipe newRecipe)
  {
    if (newRecipe != recipe)
    {
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
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case RecipePackage.RECIPES__RECIPE:
        return basicSetRecipe(null, msgs);
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
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RecipePackage.RECIPES__RECIPE:
        setRecipe((Recipe)newValue);
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
        setRecipe((Recipe)null);
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
        return recipe != null;
    }
    return super.eIsSet(featureID);
  }

} //RecipesImpl
