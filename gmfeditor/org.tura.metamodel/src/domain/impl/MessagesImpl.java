/**
 */
package domain.impl;

import domain.ApplicationMessages;
import domain.DomainPackage;
import domain.MessageLibrary;
import domain.Messages;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Messages</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link domain.impl.MessagesImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.impl.MessagesImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link domain.impl.MessagesImpl#getMessageLibraries <em>Message Libraries</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MessagesImpl extends EObjectImpl implements Messages
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
   * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParent()
   * @generated
   * @ordered
   */
  protected ApplicationMessages parent;

  /**
   * The cached value of the '{@link #getMessageLibraries() <em>Message Libraries</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMessageLibraries()
   * @generated
   * @ordered
   */
  protected MessageLibrary messageLibraries;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MessagesImpl()
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
    return DomainPackage.Literals.MESSAGES;
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
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.MESSAGES__UID, oldUid, uid));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ApplicationMessages getParent()
  {
    if (parent != null && parent.eIsProxy())
    {
      InternalEObject oldParent = (InternalEObject)parent;
      parent = (ApplicationMessages)eResolveProxy(oldParent);
      if (parent != oldParent)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.MESSAGES__PARENT, oldParent, parent));
      }
    }
    return parent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ApplicationMessages basicGetParent()
  {
    return parent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParent(ApplicationMessages newParent, NotificationChain msgs)
  {
    ApplicationMessages oldParent = parent;
    parent = newParent;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.MESSAGES__PARENT, oldParent, newParent);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParent(ApplicationMessages newParent)
  {
    if (newParent != parent)
    {
      NotificationChain msgs = null;
      if (parent != null)
        msgs = ((InternalEObject)parent).eInverseRemove(this, DomainPackage.APPLICATION_MESSAGES__MESSAGES, ApplicationMessages.class, msgs);
      if (newParent != null)
        msgs = ((InternalEObject)newParent).eInverseAdd(this, DomainPackage.APPLICATION_MESSAGES__MESSAGES, ApplicationMessages.class, msgs);
      msgs = basicSetParent(newParent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.MESSAGES__PARENT, newParent, newParent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MessageLibrary getMessageLibraries()
  {
    return messageLibraries;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMessageLibraries(MessageLibrary newMessageLibraries, NotificationChain msgs)
  {
    MessageLibrary oldMessageLibraries = messageLibraries;
    messageLibraries = newMessageLibraries;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.MESSAGES__MESSAGE_LIBRARIES, oldMessageLibraries, newMessageLibraries);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMessageLibraries(MessageLibrary newMessageLibraries)
  {
    if (newMessageLibraries != messageLibraries)
    {
      NotificationChain msgs = null;
      if (messageLibraries != null)
        msgs = ((InternalEObject)messageLibraries).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.MESSAGES__MESSAGE_LIBRARIES, null, msgs);
      if (newMessageLibraries != null)
        msgs = ((InternalEObject)newMessageLibraries).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainPackage.MESSAGES__MESSAGE_LIBRARIES, null, msgs);
      msgs = basicSetMessageLibraries(newMessageLibraries, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.MESSAGES__MESSAGE_LIBRARIES, newMessageLibraries, newMessageLibraries));
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
      case DomainPackage.MESSAGES__PARENT:
        if (parent != null)
          msgs = ((InternalEObject)parent).eInverseRemove(this, DomainPackage.APPLICATION_MESSAGES__MESSAGES, ApplicationMessages.class, msgs);
        return basicSetParent((ApplicationMessages)otherEnd, msgs);
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
      case DomainPackage.MESSAGES__PARENT:
        return basicSetParent(null, msgs);
      case DomainPackage.MESSAGES__MESSAGE_LIBRARIES:
        return basicSetMessageLibraries(null, msgs);
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
      case DomainPackage.MESSAGES__UID:
        return getUid();
      case DomainPackage.MESSAGES__PARENT:
        if (resolve) return getParent();
        return basicGetParent();
      case DomainPackage.MESSAGES__MESSAGE_LIBRARIES:
        return getMessageLibraries();
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
      case DomainPackage.MESSAGES__UID:
        setUid((String)newValue);
        return;
      case DomainPackage.MESSAGES__PARENT:
        setParent((ApplicationMessages)newValue);
        return;
      case DomainPackage.MESSAGES__MESSAGE_LIBRARIES:
        setMessageLibraries((MessageLibrary)newValue);
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
      case DomainPackage.MESSAGES__UID:
        setUid(UID_EDEFAULT);
        return;
      case DomainPackage.MESSAGES__PARENT:
        setParent((ApplicationMessages)null);
        return;
      case DomainPackage.MESSAGES__MESSAGE_LIBRARIES:
        setMessageLibraries((MessageLibrary)null);
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
      case DomainPackage.MESSAGES__UID:
        return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
      case DomainPackage.MESSAGES__PARENT:
        return parent != null;
      case DomainPackage.MESSAGES__MESSAGE_LIBRARIES:
        return messageLibraries != null;
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

} //MessagesImpl
