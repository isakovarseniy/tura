/**
 */
package businessobjects.impl;

import businessobjects.BusinessObject;
import businessobjects.BusinessobjectsPackage;
import businessobjects.CreateMethod;
import businessobjects.InsertMethod;
import businessobjects.OtherMethod;
import businessobjects.RemoveMethod;
import businessobjects.SearchMethod;
import businessobjects.UpdateMethod;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import typedefinition.impl.TypePointerImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Business Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link businessobjects.impl.BusinessObjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link businessobjects.impl.BusinessObjectImpl#getCreateMethods <em>Create Methods</em>}</li>
 *   <li>{@link businessobjects.impl.BusinessObjectImpl#getInsertMethods <em>Insert Methods</em>}</li>
 *   <li>{@link businessobjects.impl.BusinessObjectImpl#getUpdaeteMethods <em>Updaete Methods</em>}</li>
 *   <li>{@link businessobjects.impl.BusinessObjectImpl#getRemovetMethods <em>Removet Methods</em>}</li>
 *   <li>{@link businessobjects.impl.BusinessObjectImpl#getSearchtMethods <em>Searcht Methods</em>}</li>
 *   <li>{@link businessobjects.impl.BusinessObjectImpl#getOthersMethods <em>Others Methods</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BusinessObjectImpl extends TypePointerImpl implements BusinessObject
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
   * The cached value of the '{@link #getCreateMethods() <em>Create Methods</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCreateMethods()
   * @generated
   * @ordered
   */
  protected EList<CreateMethod> createMethods;

  /**
   * The cached value of the '{@link #getInsertMethods() <em>Insert Methods</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInsertMethods()
   * @generated
   * @ordered
   */
  protected EList<InsertMethod> insertMethods;

  /**
   * The cached value of the '{@link #getUpdaeteMethods() <em>Updaete Methods</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUpdaeteMethods()
   * @generated
   * @ordered
   */
  protected EList<UpdateMethod> updaeteMethods;

  /**
   * The cached value of the '{@link #getRemovetMethods() <em>Removet Methods</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRemovetMethods()
   * @generated
   * @ordered
   */
  protected EList<RemoveMethod> removetMethods;

  /**
   * The cached value of the '{@link #getSearchtMethods() <em>Searcht Methods</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSearchtMethods()
   * @generated
   * @ordered
   */
  protected EList<SearchMethod> searchtMethods;

  /**
   * The cached value of the '{@link #getOthersMethods() <em>Others Methods</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOthersMethods()
   * @generated
   * @ordered
   */
  protected EList<OtherMethod> othersMethods;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BusinessObjectImpl()
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
    return BusinessobjectsPackage.Literals.BUSINESS_OBJECT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, BusinessobjectsPackage.BUSINESS_OBJECT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<CreateMethod> getCreateMethods()
  {
    if (createMethods == null)
    {
      createMethods = new EObjectContainmentEList<CreateMethod>(CreateMethod.class, this, BusinessobjectsPackage.BUSINESS_OBJECT__CREATE_METHODS);
    }
    return createMethods;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<InsertMethod> getInsertMethods()
  {
    if (insertMethods == null)
    {
      insertMethods = new EObjectContainmentEList<InsertMethod>(InsertMethod.class, this, BusinessobjectsPackage.BUSINESS_OBJECT__INSERT_METHODS);
    }
    return insertMethods;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<UpdateMethod> getUpdaeteMethods()
  {
    if (updaeteMethods == null)
    {
      updaeteMethods = new EObjectContainmentEList<UpdateMethod>(UpdateMethod.class, this, BusinessobjectsPackage.BUSINESS_OBJECT__UPDAETE_METHODS);
    }
    return updaeteMethods;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<RemoveMethod> getRemovetMethods()
  {
    if (removetMethods == null)
    {
      removetMethods = new EObjectContainmentEList<RemoveMethod>(RemoveMethod.class, this, BusinessobjectsPackage.BUSINESS_OBJECT__REMOVET_METHODS);
    }
    return removetMethods;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SearchMethod> getSearchtMethods()
  {
    if (searchtMethods == null)
    {
      searchtMethods = new EObjectContainmentEList<SearchMethod>(SearchMethod.class, this, BusinessobjectsPackage.BUSINESS_OBJECT__SEARCHT_METHODS);
    }
    return searchtMethods;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<OtherMethod> getOthersMethods()
  {
    if (othersMethods == null)
    {
      othersMethods = new EObjectContainmentEList<OtherMethod>(OtherMethod.class, this, BusinessobjectsPackage.BUSINESS_OBJECT__OTHERS_METHODS);
    }
    return othersMethods;
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
      case BusinessobjectsPackage.BUSINESS_OBJECT__CREATE_METHODS:
        return ((InternalEList<?>)getCreateMethods()).basicRemove(otherEnd, msgs);
      case BusinessobjectsPackage.BUSINESS_OBJECT__INSERT_METHODS:
        return ((InternalEList<?>)getInsertMethods()).basicRemove(otherEnd, msgs);
      case BusinessobjectsPackage.BUSINESS_OBJECT__UPDAETE_METHODS:
        return ((InternalEList<?>)getUpdaeteMethods()).basicRemove(otherEnd, msgs);
      case BusinessobjectsPackage.BUSINESS_OBJECT__REMOVET_METHODS:
        return ((InternalEList<?>)getRemovetMethods()).basicRemove(otherEnd, msgs);
      case BusinessobjectsPackage.BUSINESS_OBJECT__SEARCHT_METHODS:
        return ((InternalEList<?>)getSearchtMethods()).basicRemove(otherEnd, msgs);
      case BusinessobjectsPackage.BUSINESS_OBJECT__OTHERS_METHODS:
        return ((InternalEList<?>)getOthersMethods()).basicRemove(otherEnd, msgs);
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
      case BusinessobjectsPackage.BUSINESS_OBJECT__NAME:
        return getName();
      case BusinessobjectsPackage.BUSINESS_OBJECT__CREATE_METHODS:
        return getCreateMethods();
      case BusinessobjectsPackage.BUSINESS_OBJECT__INSERT_METHODS:
        return getInsertMethods();
      case BusinessobjectsPackage.BUSINESS_OBJECT__UPDAETE_METHODS:
        return getUpdaeteMethods();
      case BusinessobjectsPackage.BUSINESS_OBJECT__REMOVET_METHODS:
        return getRemovetMethods();
      case BusinessobjectsPackage.BUSINESS_OBJECT__SEARCHT_METHODS:
        return getSearchtMethods();
      case BusinessobjectsPackage.BUSINESS_OBJECT__OTHERS_METHODS:
        return getOthersMethods();
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
      case BusinessobjectsPackage.BUSINESS_OBJECT__NAME:
        setName((String)newValue);
        return;
      case BusinessobjectsPackage.BUSINESS_OBJECT__CREATE_METHODS:
        getCreateMethods().clear();
        getCreateMethods().addAll((Collection<? extends CreateMethod>)newValue);
        return;
      case BusinessobjectsPackage.BUSINESS_OBJECT__INSERT_METHODS:
        getInsertMethods().clear();
        getInsertMethods().addAll((Collection<? extends InsertMethod>)newValue);
        return;
      case BusinessobjectsPackage.BUSINESS_OBJECT__UPDAETE_METHODS:
        getUpdaeteMethods().clear();
        getUpdaeteMethods().addAll((Collection<? extends UpdateMethod>)newValue);
        return;
      case BusinessobjectsPackage.BUSINESS_OBJECT__REMOVET_METHODS:
        getRemovetMethods().clear();
        getRemovetMethods().addAll((Collection<? extends RemoveMethod>)newValue);
        return;
      case BusinessobjectsPackage.BUSINESS_OBJECT__SEARCHT_METHODS:
        getSearchtMethods().clear();
        getSearchtMethods().addAll((Collection<? extends SearchMethod>)newValue);
        return;
      case BusinessobjectsPackage.BUSINESS_OBJECT__OTHERS_METHODS:
        getOthersMethods().clear();
        getOthersMethods().addAll((Collection<? extends OtherMethod>)newValue);
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
      case BusinessobjectsPackage.BUSINESS_OBJECT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case BusinessobjectsPackage.BUSINESS_OBJECT__CREATE_METHODS:
        getCreateMethods().clear();
        return;
      case BusinessobjectsPackage.BUSINESS_OBJECT__INSERT_METHODS:
        getInsertMethods().clear();
        return;
      case BusinessobjectsPackage.BUSINESS_OBJECT__UPDAETE_METHODS:
        getUpdaeteMethods().clear();
        return;
      case BusinessobjectsPackage.BUSINESS_OBJECT__REMOVET_METHODS:
        getRemovetMethods().clear();
        return;
      case BusinessobjectsPackage.BUSINESS_OBJECT__SEARCHT_METHODS:
        getSearchtMethods().clear();
        return;
      case BusinessobjectsPackage.BUSINESS_OBJECT__OTHERS_METHODS:
        getOthersMethods().clear();
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
      case BusinessobjectsPackage.BUSINESS_OBJECT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case BusinessobjectsPackage.BUSINESS_OBJECT__CREATE_METHODS:
        return createMethods != null && !createMethods.isEmpty();
      case BusinessobjectsPackage.BUSINESS_OBJECT__INSERT_METHODS:
        return insertMethods != null && !insertMethods.isEmpty();
      case BusinessobjectsPackage.BUSINESS_OBJECT__UPDAETE_METHODS:
        return updaeteMethods != null && !updaeteMethods.isEmpty();
      case BusinessobjectsPackage.BUSINESS_OBJECT__REMOVET_METHODS:
        return removetMethods != null && !removetMethods.isEmpty();
      case BusinessobjectsPackage.BUSINESS_OBJECT__SEARCHT_METHODS:
        return searchtMethods != null && !searchtMethods.isEmpty();
      case BusinessobjectsPackage.BUSINESS_OBJECT__OTHERS_METHODS:
        return othersMethods != null && !othersMethods.isEmpty();
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

} //BusinessObjectImpl
