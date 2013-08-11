/**
 */
package domain.impl;

import domain.Domain;
import domain.DomainApplications;
import domain.DomainArtifacts;
import domain.DomainPackage;
import domain.DomainTypes;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link domain.impl.DomainImpl#getDomainArtifacts <em>Domain Artifacts</em>}</li>
 *   <li>{@link domain.impl.DomainImpl#getDomainTypes <em>Domain Types</em>}</li>
 *   <li>{@link domain.impl.DomainImpl#getDomainApplications <em>Domain Applications</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DomainImpl extends EObjectImpl implements Domain
{
  /**
   * The cached value of the '{@link #getDomainArtifacts() <em>Domain Artifacts</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDomainArtifacts()
   * @generated
   * @ordered
   */
  protected DomainArtifacts domainArtifacts;

  /**
   * The cached value of the '{@link #getDomainTypes() <em>Domain Types</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDomainTypes()
   * @generated
   * @ordered
   */
  protected DomainTypes domainTypes;

  /**
   * The cached value of the '{@link #getDomainApplications() <em>Domain Applications</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDomainApplications()
   * @generated
   * @ordered
   */
  protected DomainApplications domainApplications;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DomainImpl()
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
    return DomainPackage.Literals.DOMAIN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomainArtifacts getDomainArtifacts()
  {
    return domainArtifacts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDomainArtifacts(DomainArtifacts newDomainArtifacts, NotificationChain msgs)
  {
    DomainArtifacts oldDomainArtifacts = domainArtifacts;
    domainArtifacts = newDomainArtifacts;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__DOMAIN_ARTIFACTS, oldDomainArtifacts, newDomainArtifacts);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDomainArtifacts(DomainArtifacts newDomainArtifacts)
  {
    if (newDomainArtifacts != domainArtifacts)
    {
      NotificationChain msgs = null;
      if (domainArtifacts != null)
        msgs = ((InternalEObject)domainArtifacts).eInverseRemove(this, DomainPackage.DOMAIN_ARTIFACTS__PARENT, DomainArtifacts.class, msgs);
      if (newDomainArtifacts != null)
        msgs = ((InternalEObject)newDomainArtifacts).eInverseAdd(this, DomainPackage.DOMAIN_ARTIFACTS__PARENT, DomainArtifacts.class, msgs);
      msgs = basicSetDomainArtifacts(newDomainArtifacts, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__DOMAIN_ARTIFACTS, newDomainArtifacts, newDomainArtifacts));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomainTypes getDomainTypes()
  {
    return domainTypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDomainTypes(DomainTypes newDomainTypes, NotificationChain msgs)
  {
    DomainTypes oldDomainTypes = domainTypes;
    domainTypes = newDomainTypes;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__DOMAIN_TYPES, oldDomainTypes, newDomainTypes);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDomainTypes(DomainTypes newDomainTypes)
  {
    if (newDomainTypes != domainTypes)
    {
      NotificationChain msgs = null;
      if (domainTypes != null)
        msgs = ((InternalEObject)domainTypes).eInverseRemove(this, DomainPackage.DOMAIN_TYPES__PARENT, DomainTypes.class, msgs);
      if (newDomainTypes != null)
        msgs = ((InternalEObject)newDomainTypes).eInverseAdd(this, DomainPackage.DOMAIN_TYPES__PARENT, DomainTypes.class, msgs);
      msgs = basicSetDomainTypes(newDomainTypes, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__DOMAIN_TYPES, newDomainTypes, newDomainTypes));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomainApplications getDomainApplications()
  {
    return domainApplications;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDomainApplications(DomainApplications newDomainApplications, NotificationChain msgs)
  {
    DomainApplications oldDomainApplications = domainApplications;
    domainApplications = newDomainApplications;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__DOMAIN_APPLICATIONS, oldDomainApplications, newDomainApplications);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDomainApplications(DomainApplications newDomainApplications)
  {
    if (newDomainApplications != domainApplications)
    {
      NotificationChain msgs = null;
      if (domainApplications != null)
        msgs = ((InternalEObject)domainApplications).eInverseRemove(this, DomainPackage.DOMAIN_APPLICATIONS__PARENT, DomainApplications.class, msgs);
      if (newDomainApplications != null)
        msgs = ((InternalEObject)newDomainApplications).eInverseAdd(this, DomainPackage.DOMAIN_APPLICATIONS__PARENT, DomainApplications.class, msgs);
      msgs = basicSetDomainApplications(newDomainApplications, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__DOMAIN_APPLICATIONS, newDomainApplications, newDomainApplications));
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
      case DomainPackage.DOMAIN__DOMAIN_ARTIFACTS:
        if (domainArtifacts != null)
          msgs = ((InternalEObject)domainArtifacts).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.DOMAIN__DOMAIN_ARTIFACTS, null, msgs);
        return basicSetDomainArtifacts((DomainArtifacts)otherEnd, msgs);
      case DomainPackage.DOMAIN__DOMAIN_TYPES:
        if (domainTypes != null)
          msgs = ((InternalEObject)domainTypes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.DOMAIN__DOMAIN_TYPES, null, msgs);
        return basicSetDomainTypes((DomainTypes)otherEnd, msgs);
      case DomainPackage.DOMAIN__DOMAIN_APPLICATIONS:
        if (domainApplications != null)
          msgs = ((InternalEObject)domainApplications).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.DOMAIN__DOMAIN_APPLICATIONS, null, msgs);
        return basicSetDomainApplications((DomainApplications)otherEnd, msgs);
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
      case DomainPackage.DOMAIN__DOMAIN_ARTIFACTS:
        return basicSetDomainArtifacts(null, msgs);
      case DomainPackage.DOMAIN__DOMAIN_TYPES:
        return basicSetDomainTypes(null, msgs);
      case DomainPackage.DOMAIN__DOMAIN_APPLICATIONS:
        return basicSetDomainApplications(null, msgs);
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
      case DomainPackage.DOMAIN__DOMAIN_ARTIFACTS:
        return getDomainArtifacts();
      case DomainPackage.DOMAIN__DOMAIN_TYPES:
        return getDomainTypes();
      case DomainPackage.DOMAIN__DOMAIN_APPLICATIONS:
        return getDomainApplications();
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
      case DomainPackage.DOMAIN__DOMAIN_ARTIFACTS:
        setDomainArtifacts((DomainArtifacts)newValue);
        return;
      case DomainPackage.DOMAIN__DOMAIN_TYPES:
        setDomainTypes((DomainTypes)newValue);
        return;
      case DomainPackage.DOMAIN__DOMAIN_APPLICATIONS:
        setDomainApplications((DomainApplications)newValue);
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
      case DomainPackage.DOMAIN__DOMAIN_ARTIFACTS:
        setDomainArtifacts((DomainArtifacts)null);
        return;
      case DomainPackage.DOMAIN__DOMAIN_TYPES:
        setDomainTypes((DomainTypes)null);
        return;
      case DomainPackage.DOMAIN__DOMAIN_APPLICATIONS:
        setDomainApplications((DomainApplications)null);
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
      case DomainPackage.DOMAIN__DOMAIN_ARTIFACTS:
        return domainArtifacts != null;
      case DomainPackage.DOMAIN__DOMAIN_TYPES:
        return domainTypes != null;
      case DomainPackage.DOMAIN__DOMAIN_APPLICATIONS:
        return domainApplications != null;
    }
    return super.eIsSet(featureID);
  }

} //DomainImpl
