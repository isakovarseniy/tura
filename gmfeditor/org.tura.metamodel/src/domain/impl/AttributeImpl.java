/**
 */
package domain.impl;

import domain.Attribute;
import domain.Categorized;
import domain.Classifier;
import domain.DomainPackage;
import domain.Type;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link domain.impl.AttributeImpl#getClassifiers <em>Classifiers</em>}</li>
 *   <li>{@link domain.impl.AttributeImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.impl.AttributeImpl#getName <em>Name</em>}</li>
 *   <li>{@link domain.impl.AttributeImpl#isPk <em>Pk</em>}</li>
 *   <li>{@link domain.impl.AttributeImpl#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeImpl extends TypePointerImpl implements Attribute
{
  /**
   * The cached value of the '{@link #getClassifiers() <em>Classifiers</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassifiers()
   * @generated
   * @ordered
   */
  protected EList<Classifier> classifiers;

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
   * The default value of the '{@link #isPk() <em>Pk</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPk()
   * @generated
   * @ordered
   */
  protected static final boolean PK_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isPk() <em>Pk</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPk()
   * @generated
   * @ordered
   */
  protected boolean pk = PK_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AttributeImpl()
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
    return DomainPackage.Literals.ATTRIBUTE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Classifier> getClassifiers()
  {
    if (classifiers == null)
    {
      classifiers = new EObjectContainmentEList<Classifier>(Classifier.class, this, DomainPackage.ATTRIBUTE__CLASSIFIERS);
    }
    return classifiers;
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
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.ATTRIBUTE__UID, oldUid, uid));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.ATTRIBUTE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isPk()
  {
    return pk;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPk(boolean newPk)
  {
    boolean oldPk = pk;
    pk = newPk;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.ATTRIBUTE__PK, oldPk, pk));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type getParent()
  {
    if (eContainerFeatureID() != DomainPackage.ATTRIBUTE__PARENT) return null;
    return (Type)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParent(Type newParent, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newParent, DomainPackage.ATTRIBUTE__PARENT, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParent(Type newParent)
  {
    if (newParent != eInternalContainer() || (eContainerFeatureID() != DomainPackage.ATTRIBUTE__PARENT && newParent != null))
    {
      if (EcoreUtil.isAncestor(this, newParent))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newParent != null)
        msgs = ((InternalEObject)newParent).eInverseAdd(this, DomainPackage.TYPE__ATTRIBUTES, Type.class, msgs);
      msgs = basicSetParent(newParent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.ATTRIBUTE__PARENT, newParent, newParent));
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
      case DomainPackage.ATTRIBUTE__PARENT:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetParent((Type)otherEnd, msgs);
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
      case DomainPackage.ATTRIBUTE__CLASSIFIERS:
        return ((InternalEList<?>)getClassifiers()).basicRemove(otherEnd, msgs);
      case DomainPackage.ATTRIBUTE__PARENT:
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
  public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
  {
    switch (eContainerFeatureID())
    {
      case DomainPackage.ATTRIBUTE__PARENT:
        return eInternalContainer().eInverseRemove(this, DomainPackage.TYPE__ATTRIBUTES, Type.class, msgs);
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
      case DomainPackage.ATTRIBUTE__CLASSIFIERS:
        return getClassifiers();
      case DomainPackage.ATTRIBUTE__UID:
        return getUid();
      case DomainPackage.ATTRIBUTE__NAME:
        return getName();
      case DomainPackage.ATTRIBUTE__PK:
        return isPk();
      case DomainPackage.ATTRIBUTE__PARENT:
        return getParent();
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
      case DomainPackage.ATTRIBUTE__CLASSIFIERS:
        getClassifiers().clear();
        getClassifiers().addAll((Collection<? extends Classifier>)newValue);
        return;
      case DomainPackage.ATTRIBUTE__UID:
        setUid((String)newValue);
        return;
      case DomainPackage.ATTRIBUTE__NAME:
        setName((String)newValue);
        return;
      case DomainPackage.ATTRIBUTE__PK:
        setPk((Boolean)newValue);
        return;
      case DomainPackage.ATTRIBUTE__PARENT:
        setParent((Type)newValue);
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
      case DomainPackage.ATTRIBUTE__CLASSIFIERS:
        getClassifiers().clear();
        return;
      case DomainPackage.ATTRIBUTE__UID:
        setUid(UID_EDEFAULT);
        return;
      case DomainPackage.ATTRIBUTE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DomainPackage.ATTRIBUTE__PK:
        setPk(PK_EDEFAULT);
        return;
      case DomainPackage.ATTRIBUTE__PARENT:
        setParent((Type)null);
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
      case DomainPackage.ATTRIBUTE__CLASSIFIERS:
        return classifiers != null && !classifiers.isEmpty();
      case DomainPackage.ATTRIBUTE__UID:
        return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
      case DomainPackage.ATTRIBUTE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DomainPackage.ATTRIBUTE__PK:
        return pk != PK_EDEFAULT;
      case DomainPackage.ATTRIBUTE__PARENT:
        return getParent() != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == Categorized.class)
    {
      switch (derivedFeatureID)
      {
        case DomainPackage.ATTRIBUTE__CLASSIFIERS: return DomainPackage.CATEGORIZED__CLASSIFIERS;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == Categorized.class)
    {
      switch (baseFeatureID)
      {
        case DomainPackage.CATEGORIZED__CLASSIFIERS: return DomainPackage.ATTRIBUTE__CLASSIFIERS;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
    result.append(", pk: ");
    result.append(pk);
    result.append(')');
    return result.toString();
  }

} //AttributeImpl
