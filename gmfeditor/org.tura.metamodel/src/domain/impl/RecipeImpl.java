/**
 */
package domain.impl;

import domain.Component;
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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Recipe</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link domain.impl.RecipeImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.impl.RecipeImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link domain.impl.RecipeImpl#getName <em>Name</em>}</li>
 *   <li>{@link domain.impl.RecipeImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link domain.impl.RecipeImpl#getRecipeConfig <em>Recipe Config</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RecipeImpl extends EObjectImpl implements Recipe
{
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
   * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComponents()
   * @generated
   * @ordered
   */
  protected EList<Component> components;

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
  protected RecipeImpl()
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
    return DomainPackage.Literals.RECIPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getUid()
  {
    return uid;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUid(String newUid)
  {
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
  public Recipes getParent()
  {
    if (eContainerFeatureID() != DomainPackage.RECIPE__PARENT) return null;
    return (Recipes)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParent(Recipes newParent, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newParent, DomainPackage.RECIPE__PARENT, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParent(Recipes newParent)
  {
    if (newParent != eInternalContainer() || (eContainerFeatureID() != DomainPackage.RECIPE__PARENT && newParent != null))
    {
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
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.RECIPE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Component> getComponents()
  {
    if (components == null)
    {
      components = new EObjectContainmentEList<Component>(Component.class, this, DomainPackage.RECIPE__COMPONENTS);
    }
    return components;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Configuration getRecipeConfig()
  {
    if (recipeConfig != null && recipeConfig.eIsProxy())
    {
      InternalEObject oldRecipeConfig = (InternalEObject)recipeConfig;
      recipeConfig = (Configuration)eResolveProxy(oldRecipeConfig);
      if (recipeConfig != oldRecipeConfig)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.RECIPE__RECIPE_CONFIG, oldRecipeConfig, recipeConfig));
      }
    }
    return recipeConfig;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Configuration basicGetRecipeConfig()
  {
    return recipeConfig;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRecipeConfig(Configuration newRecipeConfig, NotificationChain msgs)
  {
    Configuration oldRecipeConfig = recipeConfig;
    recipeConfig = newRecipeConfig;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.RECIPE__RECIPE_CONFIG, oldRecipeConfig, newRecipeConfig);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRecipeConfig(Configuration newRecipeConfig)
  {
    if (newRecipeConfig != recipeConfig)
    {
      NotificationChain msgs = null;
      if (recipeConfig != null)
        msgs = ((InternalEObject)recipeConfig).eInverseRemove(this, DomainPackage.CONFIGURATION__RECIPE, Configuration.class, msgs);
      if (newRecipeConfig != null)
        msgs = ((InternalEObject)newRecipeConfig).eInverseAdd(this, DomainPackage.CONFIGURATION__RECIPE, Configuration.class, msgs);
      msgs = basicSetRecipeConfig(newRecipeConfig, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.RECIPE__RECIPE_CONFIG, newRecipeConfig, newRecipeConfig));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DomainPackage.RECIPE__PARENT:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetParent((Recipes)otherEnd, msgs);
      case DomainPackage.RECIPE__RECIPE_CONFIG:
        if (recipeConfig != null)
          msgs = ((InternalEObject)recipeConfig).eInverseRemove(this, DomainPackage.CONFIGURATION__RECIPE, Configuration.class, msgs);
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
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DomainPackage.RECIPE__PARENT:
        return basicSetParent(null, msgs);
      case DomainPackage.RECIPE__COMPONENTS:
        return ((InternalEList<?>)getComponents()).basicRemove(otherEnd, msgs);
      case DomainPackage.RECIPE__RECIPE_CONFIG:
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
  public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
  {
    switch (eContainerFeatureID())
    {
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
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DomainPackage.RECIPE__UID:
        return getUid();
      case DomainPackage.RECIPE__PARENT:
        return getParent();
      case DomainPackage.RECIPE__NAME:
        return getName();
      case DomainPackage.RECIPE__COMPONENTS:
        return getComponents();
      case DomainPackage.RECIPE__RECIPE_CONFIG:
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
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DomainPackage.RECIPE__UID:
        setUid((String)newValue);
        return;
      case DomainPackage.RECIPE__PARENT:
        setParent((Recipes)newValue);
        return;
      case DomainPackage.RECIPE__NAME:
        setName((String)newValue);
        return;
      case DomainPackage.RECIPE__COMPONENTS:
        getComponents().clear();
        getComponents().addAll((Collection<? extends Component>)newValue);
        return;
      case DomainPackage.RECIPE__RECIPE_CONFIG:
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case DomainPackage.RECIPE__UID:
        setUid(UID_EDEFAULT);
        return;
      case DomainPackage.RECIPE__PARENT:
        setParent((Recipes)null);
        return;
      case DomainPackage.RECIPE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DomainPackage.RECIPE__COMPONENTS:
        getComponents().clear();
        return;
      case DomainPackage.RECIPE__RECIPE_CONFIG:
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case DomainPackage.RECIPE__UID:
        return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
      case DomainPackage.RECIPE__PARENT:
        return getParent() != null;
      case DomainPackage.RECIPE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DomainPackage.RECIPE__COMPONENTS:
        return components != null && !components.isEmpty();
      case DomainPackage.RECIPE__RECIPE_CONFIG:
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
  public String toString()
  {
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
