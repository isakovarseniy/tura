/**
 */
package domain.impl;

import domain.Application;
import domain.ApplicationInfrastructureLayer;
import domain.ApplicationMappers;
import domain.ApplicationRecipes;
import domain.ApplicationUILayer;
import domain.DomainApplication;
import domain.DomainPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link domain.impl.ApplicationImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.impl.ApplicationImpl#getApplicationRecipes <em>Application Recipes</em>}</li>
 *   <li>{@link domain.impl.ApplicationImpl#getApplicationMappers <em>Application Mappers</em>}</li>
 *   <li>{@link domain.impl.ApplicationImpl#getApplicationUILayer <em>Application UI Layer</em>}</li>
 *   <li>{@link domain.impl.ApplicationImpl#getApplicationInfrastructureLayer <em>Application Infrastructure Layer</em>}</li>
 *   <li>{@link domain.impl.ApplicationImpl#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApplicationImpl extends EObjectImpl implements Application
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
   * The cached value of the '{@link #getApplicationRecipes() <em>Application Recipes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getApplicationRecipes()
   * @generated
   * @ordered
   */
  protected ApplicationRecipes applicationRecipes;

  /**
   * The cached value of the '{@link #getApplicationMappers() <em>Application Mappers</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getApplicationMappers()
   * @generated
   * @ordered
   */
  protected ApplicationMappers applicationMappers;

  /**
   * The cached value of the '{@link #getApplicationUILayer() <em>Application UI Layer</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getApplicationUILayer()
   * @generated
   * @ordered
   */
  protected ApplicationUILayer applicationUILayer;

  /**
   * The cached value of the '{@link #getApplicationInfrastructureLayer() <em>Application Infrastructure Layer</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getApplicationInfrastructureLayer()
   * @generated
   * @ordered
   */
  protected ApplicationInfrastructureLayer applicationInfrastructureLayer;

  /**
   * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParent()
   * @generated
   * @ordered
   */
  protected DomainApplication parent;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ApplicationImpl()
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
    return DomainPackage.Literals.APPLICATION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.APPLICATION__UID, oldUid, uid));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ApplicationRecipes getApplicationRecipes()
  {
    return applicationRecipes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetApplicationRecipes(ApplicationRecipes newApplicationRecipes, NotificationChain msgs)
  {
    ApplicationRecipes oldApplicationRecipes = applicationRecipes;
    applicationRecipes = newApplicationRecipes;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.APPLICATION__APPLICATION_RECIPES, oldApplicationRecipes, newApplicationRecipes);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setApplicationRecipes(ApplicationRecipes newApplicationRecipes)
  {
    if (newApplicationRecipes != applicationRecipes)
    {
      NotificationChain msgs = null;
      if (applicationRecipes != null)
        msgs = ((InternalEObject)applicationRecipes).eInverseRemove(this, DomainPackage.APPLICATION_RECIPES__PARENT, ApplicationRecipes.class, msgs);
      if (newApplicationRecipes != null)
        msgs = ((InternalEObject)newApplicationRecipes).eInverseAdd(this, DomainPackage.APPLICATION_RECIPES__PARENT, ApplicationRecipes.class, msgs);
      msgs = basicSetApplicationRecipes(newApplicationRecipes, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.APPLICATION__APPLICATION_RECIPES, newApplicationRecipes, newApplicationRecipes));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ApplicationMappers getApplicationMappers()
  {
    return applicationMappers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetApplicationMappers(ApplicationMappers newApplicationMappers, NotificationChain msgs)
  {
    ApplicationMappers oldApplicationMappers = applicationMappers;
    applicationMappers = newApplicationMappers;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.APPLICATION__APPLICATION_MAPPERS, oldApplicationMappers, newApplicationMappers);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setApplicationMappers(ApplicationMappers newApplicationMappers)
  {
    if (newApplicationMappers != applicationMappers)
    {
      NotificationChain msgs = null;
      if (applicationMappers != null)
        msgs = ((InternalEObject)applicationMappers).eInverseRemove(this, DomainPackage.APPLICATION_MAPPERS__PARENT, ApplicationMappers.class, msgs);
      if (newApplicationMappers != null)
        msgs = ((InternalEObject)newApplicationMappers).eInverseAdd(this, DomainPackage.APPLICATION_MAPPERS__PARENT, ApplicationMappers.class, msgs);
      msgs = basicSetApplicationMappers(newApplicationMappers, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.APPLICATION__APPLICATION_MAPPERS, newApplicationMappers, newApplicationMappers));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ApplicationUILayer getApplicationUILayer()
  {
    return applicationUILayer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetApplicationUILayer(ApplicationUILayer newApplicationUILayer, NotificationChain msgs)
  {
    ApplicationUILayer oldApplicationUILayer = applicationUILayer;
    applicationUILayer = newApplicationUILayer;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.APPLICATION__APPLICATION_UI_LAYER, oldApplicationUILayer, newApplicationUILayer);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setApplicationUILayer(ApplicationUILayer newApplicationUILayer)
  {
    if (newApplicationUILayer != applicationUILayer)
    {
      NotificationChain msgs = null;
      if (applicationUILayer != null)
        msgs = ((InternalEObject)applicationUILayer).eInverseRemove(this, DomainPackage.APPLICATION_UI_LAYER__PARENT, ApplicationUILayer.class, msgs);
      if (newApplicationUILayer != null)
        msgs = ((InternalEObject)newApplicationUILayer).eInverseAdd(this, DomainPackage.APPLICATION_UI_LAYER__PARENT, ApplicationUILayer.class, msgs);
      msgs = basicSetApplicationUILayer(newApplicationUILayer, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.APPLICATION__APPLICATION_UI_LAYER, newApplicationUILayer, newApplicationUILayer));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ApplicationInfrastructureLayer getApplicationInfrastructureLayer()
  {
    return applicationInfrastructureLayer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetApplicationInfrastructureLayer(ApplicationInfrastructureLayer newApplicationInfrastructureLayer, NotificationChain msgs)
  {
    ApplicationInfrastructureLayer oldApplicationInfrastructureLayer = applicationInfrastructureLayer;
    applicationInfrastructureLayer = newApplicationInfrastructureLayer;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.APPLICATION__APPLICATION_INFRASTRUCTURE_LAYER, oldApplicationInfrastructureLayer, newApplicationInfrastructureLayer);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setApplicationInfrastructureLayer(ApplicationInfrastructureLayer newApplicationInfrastructureLayer)
  {
    if (newApplicationInfrastructureLayer != applicationInfrastructureLayer)
    {
      NotificationChain msgs = null;
      if (applicationInfrastructureLayer != null)
        msgs = ((InternalEObject)applicationInfrastructureLayer).eInverseRemove(this, DomainPackage.APPLICATION_INFRASTRUCTURE_LAYER__PARENT, ApplicationInfrastructureLayer.class, msgs);
      if (newApplicationInfrastructureLayer != null)
        msgs = ((InternalEObject)newApplicationInfrastructureLayer).eInverseAdd(this, DomainPackage.APPLICATION_INFRASTRUCTURE_LAYER__PARENT, ApplicationInfrastructureLayer.class, msgs);
      msgs = basicSetApplicationInfrastructureLayer(newApplicationInfrastructureLayer, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.APPLICATION__APPLICATION_INFRASTRUCTURE_LAYER, newApplicationInfrastructureLayer, newApplicationInfrastructureLayer));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomainApplication getParent()
  {
    if (parent != null && parent.eIsProxy())
    {
      InternalEObject oldParent = (InternalEObject)parent;
      parent = (DomainApplication)eResolveProxy(oldParent);
      if (parent != oldParent)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.APPLICATION__PARENT, oldParent, parent));
      }
    }
    return parent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomainApplication basicGetParent()
  {
    return parent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParent(DomainApplication newParent, NotificationChain msgs)
  {
    DomainApplication oldParent = parent;
    parent = newParent;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.APPLICATION__PARENT, oldParent, newParent);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParent(DomainApplication newParent)
  {
    if (newParent != parent)
    {
      NotificationChain msgs = null;
      if (parent != null)
        msgs = ((InternalEObject)parent).eInverseRemove(this, DomainPackage.DOMAIN_APPLICATION__APPLICATION, DomainApplication.class, msgs);
      if (newParent != null)
        msgs = ((InternalEObject)newParent).eInverseAdd(this, DomainPackage.DOMAIN_APPLICATION__APPLICATION, DomainApplication.class, msgs);
      msgs = basicSetParent(newParent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.APPLICATION__PARENT, newParent, newParent));
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
      case DomainPackage.APPLICATION__APPLICATION_RECIPES:
        if (applicationRecipes != null)
          msgs = ((InternalEObject)applicationRecipes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.APPLICATION__APPLICATION_RECIPES, null, msgs);
        return basicSetApplicationRecipes((ApplicationRecipes)otherEnd, msgs);
      case DomainPackage.APPLICATION__APPLICATION_MAPPERS:
        if (applicationMappers != null)
          msgs = ((InternalEObject)applicationMappers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.APPLICATION__APPLICATION_MAPPERS, null, msgs);
        return basicSetApplicationMappers((ApplicationMappers)otherEnd, msgs);
      case DomainPackage.APPLICATION__APPLICATION_UI_LAYER:
        if (applicationUILayer != null)
          msgs = ((InternalEObject)applicationUILayer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.APPLICATION__APPLICATION_UI_LAYER, null, msgs);
        return basicSetApplicationUILayer((ApplicationUILayer)otherEnd, msgs);
      case DomainPackage.APPLICATION__APPLICATION_INFRASTRUCTURE_LAYER:
        if (applicationInfrastructureLayer != null)
          msgs = ((InternalEObject)applicationInfrastructureLayer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.APPLICATION__APPLICATION_INFRASTRUCTURE_LAYER, null, msgs);
        return basicSetApplicationInfrastructureLayer((ApplicationInfrastructureLayer)otherEnd, msgs);
      case DomainPackage.APPLICATION__PARENT:
        if (parent != null)
          msgs = ((InternalEObject)parent).eInverseRemove(this, DomainPackage.DOMAIN_APPLICATION__APPLICATION, DomainApplication.class, msgs);
        return basicSetParent((DomainApplication)otherEnd, msgs);
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
      case DomainPackage.APPLICATION__APPLICATION_RECIPES:
        return basicSetApplicationRecipes(null, msgs);
      case DomainPackage.APPLICATION__APPLICATION_MAPPERS:
        return basicSetApplicationMappers(null, msgs);
      case DomainPackage.APPLICATION__APPLICATION_UI_LAYER:
        return basicSetApplicationUILayer(null, msgs);
      case DomainPackage.APPLICATION__APPLICATION_INFRASTRUCTURE_LAYER:
        return basicSetApplicationInfrastructureLayer(null, msgs);
      case DomainPackage.APPLICATION__PARENT:
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
      case DomainPackage.APPLICATION__UID:
        return getUid();
      case DomainPackage.APPLICATION__APPLICATION_RECIPES:
        return getApplicationRecipes();
      case DomainPackage.APPLICATION__APPLICATION_MAPPERS:
        return getApplicationMappers();
      case DomainPackage.APPLICATION__APPLICATION_UI_LAYER:
        return getApplicationUILayer();
      case DomainPackage.APPLICATION__APPLICATION_INFRASTRUCTURE_LAYER:
        return getApplicationInfrastructureLayer();
      case DomainPackage.APPLICATION__PARENT:
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
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DomainPackage.APPLICATION__UID:
        setUid((String)newValue);
        return;
      case DomainPackage.APPLICATION__APPLICATION_RECIPES:
        setApplicationRecipes((ApplicationRecipes)newValue);
        return;
      case DomainPackage.APPLICATION__APPLICATION_MAPPERS:
        setApplicationMappers((ApplicationMappers)newValue);
        return;
      case DomainPackage.APPLICATION__APPLICATION_UI_LAYER:
        setApplicationUILayer((ApplicationUILayer)newValue);
        return;
      case DomainPackage.APPLICATION__APPLICATION_INFRASTRUCTURE_LAYER:
        setApplicationInfrastructureLayer((ApplicationInfrastructureLayer)newValue);
        return;
      case DomainPackage.APPLICATION__PARENT:
        setParent((DomainApplication)newValue);
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
      case DomainPackage.APPLICATION__UID:
        setUid(UID_EDEFAULT);
        return;
      case DomainPackage.APPLICATION__APPLICATION_RECIPES:
        setApplicationRecipes((ApplicationRecipes)null);
        return;
      case DomainPackage.APPLICATION__APPLICATION_MAPPERS:
        setApplicationMappers((ApplicationMappers)null);
        return;
      case DomainPackage.APPLICATION__APPLICATION_UI_LAYER:
        setApplicationUILayer((ApplicationUILayer)null);
        return;
      case DomainPackage.APPLICATION__APPLICATION_INFRASTRUCTURE_LAYER:
        setApplicationInfrastructureLayer((ApplicationInfrastructureLayer)null);
        return;
      case DomainPackage.APPLICATION__PARENT:
        setParent((DomainApplication)null);
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
      case DomainPackage.APPLICATION__UID:
        return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
      case DomainPackage.APPLICATION__APPLICATION_RECIPES:
        return applicationRecipes != null;
      case DomainPackage.APPLICATION__APPLICATION_MAPPERS:
        return applicationMappers != null;
      case DomainPackage.APPLICATION__APPLICATION_UI_LAYER:
        return applicationUILayer != null;
      case DomainPackage.APPLICATION__APPLICATION_INFRASTRUCTURE_LAYER:
        return applicationInfrastructureLayer != null;
      case DomainPackage.APPLICATION__PARENT:
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
    result.append(')');
    return result.toString();
  }

} //ApplicationImpl
