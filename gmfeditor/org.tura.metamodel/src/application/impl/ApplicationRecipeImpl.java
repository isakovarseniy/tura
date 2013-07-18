/**
 */
package application.impl;

import application.ApplicationPackage;
import application.ApplicationRecipe;

import org.eclipse.emf.common.notify.Notification;

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
 * <ul>
 *   <li>{@link application.impl.ApplicationRecipeImpl#getName <em>Name</em>}</li>
 *   <li>{@link application.impl.ApplicationRecipeImpl#getRecipes <em>Recipes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApplicationRecipeImpl extends EObjectImpl implements ApplicationRecipe
{
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
  protected Recipe recipes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ApplicationRecipeImpl()
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
    return ApplicationPackage.Literals.APPLICATION_RECIPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
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
  public Recipe getRecipes()
  {
    if (recipes != null && recipes.eIsProxy())
    {
      InternalEObject oldRecipes = (InternalEObject)recipes;
      recipes = (Recipe)eResolveProxy(oldRecipes);
      if (recipes != oldRecipes)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApplicationPackage.APPLICATION_RECIPE__RECIPES, oldRecipes, recipes));
      }
    }
    return recipes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Recipe basicGetRecipes()
  {
    return recipes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRecipes(Recipe newRecipes)
  {
    Recipe oldRecipes = recipes;
    recipes = newRecipes;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.APPLICATION_RECIPE__RECIPES, oldRecipes, recipes));
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
      case ApplicationPackage.APPLICATION_RECIPE__NAME:
        return getName();
      case ApplicationPackage.APPLICATION_RECIPE__RECIPES:
        if (resolve) return getRecipes();
        return basicGetRecipes();
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
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
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ApplicationRecipeImpl
