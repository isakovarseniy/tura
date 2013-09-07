/**
 */
package domain.impl;

import domain.Configuration;
import domain.DomainPackage;
import domain.Property;

import domain.Recipe;
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
 * An implementation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link domain.impl.ConfigurationImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.impl.ConfigurationImpl#getName <em>Name</em>}</li>
 *   <li>{@link domain.impl.ConfigurationImpl#getRecipe <em>Recipe</em>}</li>
 *   <li>{@link domain.impl.ConfigurationImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link domain.impl.ConfigurationImpl#getConfigExtension <em>Config Extension</em>}</li>
 *   <li>{@link domain.impl.ConfigurationImpl#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConfigurationImpl extends EObjectImpl implements Configuration
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
   * The cached value of the '{@link #getRecipe() <em>Recipe</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRecipe()
   * @generated
   * @ordered
   */
  protected Recipe recipe;

  /**
   * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperties()
   * @generated
   * @ordered
   */
  protected EList<Property> properties;

  /**
   * The cached value of the '{@link #getConfigExtension() <em>Config Extension</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConfigExtension()
   * @generated
   * @ordered
   */
  protected Configuration configExtension;

  /**
   * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParent()
   * @generated
   * @ordered
   */
  protected Configuration parent;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConfigurationImpl()
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
    return DomainPackage.Literals.CONFIGURATION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.CONFIGURATION__UID, oldUid, uid));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.CONFIGURATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Recipe getRecipe()
  {
    if (recipe != null && recipe.eIsProxy())
    {
      InternalEObject oldRecipe = (InternalEObject)recipe;
      recipe = (Recipe)eResolveProxy(oldRecipe);
      if (recipe != oldRecipe)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.CONFIGURATION__RECIPE, oldRecipe, recipe));
      }
    }
    return recipe;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Recipe basicGetRecipe()
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.CONFIGURATION__RECIPE, oldRecipe, newRecipe);
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
        msgs = ((InternalEObject)recipe).eInverseRemove(this, DomainPackage.RECIPE__RECIPE_CONFIG, Recipe.class, msgs);
      if (newRecipe != null)
        msgs = ((InternalEObject)newRecipe).eInverseAdd(this, DomainPackage.RECIPE__RECIPE_CONFIG, Recipe.class, msgs);
      msgs = basicSetRecipe(newRecipe, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.CONFIGURATION__RECIPE, newRecipe, newRecipe));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Property> getProperties()
  {
    if (properties == null)
    {
      properties = new EObjectContainmentEList<Property>(Property.class, this, DomainPackage.CONFIGURATION__PROPERTIES);
    }
    return properties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Configuration getConfigExtension()
  {
    if (configExtension != null && configExtension.eIsProxy())
    {
      InternalEObject oldConfigExtension = (InternalEObject)configExtension;
      configExtension = (Configuration)eResolveProxy(oldConfigExtension);
      if (configExtension != oldConfigExtension)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.CONFIGURATION__CONFIG_EXTENSION, oldConfigExtension, configExtension));
      }
    }
    return configExtension;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Configuration basicGetConfigExtension()
  {
    return configExtension;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConfigExtension(Configuration newConfigExtension, NotificationChain msgs)
  {
    Configuration oldConfigExtension = configExtension;
    configExtension = newConfigExtension;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.CONFIGURATION__CONFIG_EXTENSION, oldConfigExtension, newConfigExtension);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConfigExtension(Configuration newConfigExtension)
  {
    if (newConfigExtension != configExtension)
    {
      NotificationChain msgs = null;
      if (configExtension != null)
        msgs = ((InternalEObject)configExtension).eInverseRemove(this, DomainPackage.CONFIGURATION__PARENT, Configuration.class, msgs);
      if (newConfigExtension != null)
        msgs = ((InternalEObject)newConfigExtension).eInverseAdd(this, DomainPackage.CONFIGURATION__PARENT, Configuration.class, msgs);
      msgs = basicSetConfigExtension(newConfigExtension, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.CONFIGURATION__CONFIG_EXTENSION, newConfigExtension, newConfigExtension));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Configuration getParent()
  {
    if (parent != null && parent.eIsProxy())
    {
      InternalEObject oldParent = (InternalEObject)parent;
      parent = (Configuration)eResolveProxy(oldParent);
      if (parent != oldParent)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.CONFIGURATION__PARENT, oldParent, parent));
      }
    }
    return parent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Configuration basicGetParent()
  {
    return parent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParent(Configuration newParent, NotificationChain msgs)
  {
    Configuration oldParent = parent;
    parent = newParent;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.CONFIGURATION__PARENT, oldParent, newParent);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParent(Configuration newParent)
  {
    if (newParent != parent)
    {
      NotificationChain msgs = null;
      if (parent != null)
        msgs = ((InternalEObject)parent).eInverseRemove(this, DomainPackage.CONFIGURATION__CONFIG_EXTENSION, Configuration.class, msgs);
      if (newParent != null)
        msgs = ((InternalEObject)newParent).eInverseAdd(this, DomainPackage.CONFIGURATION__CONFIG_EXTENSION, Configuration.class, msgs);
      msgs = basicSetParent(newParent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.CONFIGURATION__PARENT, newParent, newParent));
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
      case DomainPackage.CONFIGURATION__RECIPE:
        if (recipe != null)
          msgs = ((InternalEObject)recipe).eInverseRemove(this, DomainPackage.RECIPE__RECIPE_CONFIG, Recipe.class, msgs);
        return basicSetRecipe((Recipe)otherEnd, msgs);
      case DomainPackage.CONFIGURATION__CONFIG_EXTENSION:
        if (configExtension != null)
          msgs = ((InternalEObject)configExtension).eInverseRemove(this, DomainPackage.CONFIGURATION__PARENT, Configuration.class, msgs);
        return basicSetConfigExtension((Configuration)otherEnd, msgs);
      case DomainPackage.CONFIGURATION__PARENT:
        if (parent != null)
          msgs = ((InternalEObject)parent).eInverseRemove(this, DomainPackage.CONFIGURATION__CONFIG_EXTENSION, Configuration.class, msgs);
        return basicSetParent((Configuration)otherEnd, msgs);
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
      case DomainPackage.CONFIGURATION__RECIPE:
        return basicSetRecipe(null, msgs);
      case DomainPackage.CONFIGURATION__PROPERTIES:
        return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
      case DomainPackage.CONFIGURATION__CONFIG_EXTENSION:
        return basicSetConfigExtension(null, msgs);
      case DomainPackage.CONFIGURATION__PARENT:
        return basicSetParent(null, msgs);
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
      case DomainPackage.CONFIGURATION__UID:
        return getUid();
      case DomainPackage.CONFIGURATION__NAME:
        return getName();
      case DomainPackage.CONFIGURATION__RECIPE:
        if (resolve) return getRecipe();
        return basicGetRecipe();
      case DomainPackage.CONFIGURATION__PROPERTIES:
        return getProperties();
      case DomainPackage.CONFIGURATION__CONFIG_EXTENSION:
        if (resolve) return getConfigExtension();
        return basicGetConfigExtension();
      case DomainPackage.CONFIGURATION__PARENT:
        if (resolve) return getParent();
        return basicGetParent();
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
      case DomainPackage.CONFIGURATION__UID:
        setUid((String)newValue);
        return;
      case DomainPackage.CONFIGURATION__NAME:
        setName((String)newValue);
        return;
      case DomainPackage.CONFIGURATION__RECIPE:
        setRecipe((Recipe)newValue);
        return;
      case DomainPackage.CONFIGURATION__PROPERTIES:
        getProperties().clear();
        getProperties().addAll((Collection<? extends Property>)newValue);
        return;
      case DomainPackage.CONFIGURATION__CONFIG_EXTENSION:
        setConfigExtension((Configuration)newValue);
        return;
      case DomainPackage.CONFIGURATION__PARENT:
        setParent((Configuration)newValue);
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
      case DomainPackage.CONFIGURATION__UID:
        setUid(UID_EDEFAULT);
        return;
      case DomainPackage.CONFIGURATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DomainPackage.CONFIGURATION__RECIPE:
        setRecipe((Recipe)null);
        return;
      case DomainPackage.CONFIGURATION__PROPERTIES:
        getProperties().clear();
        return;
      case DomainPackage.CONFIGURATION__CONFIG_EXTENSION:
        setConfigExtension((Configuration)null);
        return;
      case DomainPackage.CONFIGURATION__PARENT:
        setParent((Configuration)null);
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
      case DomainPackage.CONFIGURATION__UID:
        return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
      case DomainPackage.CONFIGURATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DomainPackage.CONFIGURATION__RECIPE:
        return recipe != null;
      case DomainPackage.CONFIGURATION__PROPERTIES:
        return properties != null && !properties.isEmpty();
      case DomainPackage.CONFIGURATION__CONFIG_EXTENSION:
        return configExtension != null;
      case DomainPackage.CONFIGURATION__PARENT:
        return parent != null;
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

} //ConfigurationImpl
