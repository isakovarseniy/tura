/**
 */
package application.impl;

import application.Application;
import application.ApplicationMappers;
import application.ApplicationPackage;

import application.ApplicationRecipes;
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
 *   <li>{@link application.impl.ApplicationImpl#getApplicationRecipes <em>Application Recipes</em>}</li>
 *   <li>{@link application.impl.ApplicationImpl#getApplicationMappers <em>Application Mappers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApplicationImpl extends EObjectImpl implements Application
{
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
    return ApplicationPackage.Literals.APPLICATION;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApplicationPackage.APPLICATION__APPLICATION_RECIPES, oldApplicationRecipes, newApplicationRecipes);
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
        msgs = ((InternalEObject)applicationRecipes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApplicationPackage.APPLICATION__APPLICATION_RECIPES, null, msgs);
      if (newApplicationRecipes != null)
        msgs = ((InternalEObject)newApplicationRecipes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApplicationPackage.APPLICATION__APPLICATION_RECIPES, null, msgs);
      msgs = basicSetApplicationRecipes(newApplicationRecipes, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.APPLICATION__APPLICATION_RECIPES, newApplicationRecipes, newApplicationRecipes));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApplicationPackage.APPLICATION__APPLICATION_MAPPERS, oldApplicationMappers, newApplicationMappers);
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
        msgs = ((InternalEObject)applicationMappers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApplicationPackage.APPLICATION__APPLICATION_MAPPERS, null, msgs);
      if (newApplicationMappers != null)
        msgs = ((InternalEObject)newApplicationMappers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApplicationPackage.APPLICATION__APPLICATION_MAPPERS, null, msgs);
      msgs = basicSetApplicationMappers(newApplicationMappers, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.APPLICATION__APPLICATION_MAPPERS, newApplicationMappers, newApplicationMappers));
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
      case ApplicationPackage.APPLICATION__APPLICATION_RECIPES:
        return basicSetApplicationRecipes(null, msgs);
      case ApplicationPackage.APPLICATION__APPLICATION_MAPPERS:
        return basicSetApplicationMappers(null, msgs);
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
      case ApplicationPackage.APPLICATION__APPLICATION_RECIPES:
        return getApplicationRecipes();
      case ApplicationPackage.APPLICATION__APPLICATION_MAPPERS:
        return getApplicationMappers();
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
      case ApplicationPackage.APPLICATION__APPLICATION_RECIPES:
        setApplicationRecipes((ApplicationRecipes)newValue);
        return;
      case ApplicationPackage.APPLICATION__APPLICATION_MAPPERS:
        setApplicationMappers((ApplicationMappers)newValue);
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
      case ApplicationPackage.APPLICATION__APPLICATION_RECIPES:
        setApplicationRecipes((ApplicationRecipes)null);
        return;
      case ApplicationPackage.APPLICATION__APPLICATION_MAPPERS:
        setApplicationMappers((ApplicationMappers)null);
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
      case ApplicationPackage.APPLICATION__APPLICATION_RECIPES:
        return applicationRecipes != null;
      case ApplicationPackage.APPLICATION__APPLICATION_MAPPERS:
        return applicationMappers != null;
    }
    return super.eIsSet(featureID);
  }

} //ApplicationImpl
