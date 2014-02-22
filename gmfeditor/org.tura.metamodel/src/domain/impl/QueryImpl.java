/**
 */
package domain.impl;

import domain.DomainPackage;
import domain.ModelQuery;
import domain.Query;
import domain.QueryVariable;

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
 * An implementation of the model object '<em><b>Query</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link domain.impl.QueryImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.impl.QueryImpl#getModelQuery <em>Model Query</em>}</li>
 *   <li>{@link domain.impl.QueryImpl#getName <em>Name</em>}</li>
 *   <li>{@link domain.impl.QueryImpl#getQueryRef <em>Query Ref</em>}</li>
 *   <li>{@link domain.impl.QueryImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link domain.impl.QueryImpl#getGroupCode <em>Group Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QueryImpl extends EObjectImpl implements Query
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
   * The cached value of the '{@link #getModelQuery() <em>Model Query</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModelQuery()
   * @generated
   * @ordered
   */
  protected ModelQuery modelQuery;

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
   * The cached value of the '{@link #getQueryRef() <em>Query Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQueryRef()
   * @generated
   * @ordered
   */
  protected ModelQuery queryRef;

  /**
   * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariables()
   * @generated
   * @ordered
   */
  protected EList<QueryVariable> variables;

  /**
   * The default value of the '{@link #getGroupCode() <em>Group Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroupCode()
   * @generated
   * @ordered
   */
  protected static final String GROUP_CODE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getGroupCode() <em>Group Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroupCode()
   * @generated
   * @ordered
   */
  protected String groupCode = GROUP_CODE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected QueryImpl()
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
    return DomainPackage.Literals.QUERY;
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
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.QUERY__UID, oldUid, uid));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelQuery getModelQuery()
  {
    if (modelQuery != null && modelQuery.eIsProxy())
    {
      InternalEObject oldModelQuery = (InternalEObject)modelQuery;
      modelQuery = (ModelQuery)eResolveProxy(oldModelQuery);
      if (modelQuery != oldModelQuery)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.QUERY__MODEL_QUERY, oldModelQuery, modelQuery));
      }
    }
    return modelQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelQuery basicGetModelQuery()
  {
    return modelQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModelQuery(ModelQuery newModelQuery)
  {
    ModelQuery oldModelQuery = modelQuery;
    modelQuery = newModelQuery;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.QUERY__MODEL_QUERY, oldModelQuery, modelQuery));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.QUERY__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelQuery getQueryRef()
  {
    if (queryRef != null && queryRef.eIsProxy())
    {
      InternalEObject oldQueryRef = (InternalEObject)queryRef;
      queryRef = (ModelQuery)eResolveProxy(oldQueryRef);
      if (queryRef != oldQueryRef)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.QUERY__QUERY_REF, oldQueryRef, queryRef));
      }
    }
    return queryRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelQuery basicGetQueryRef()
  {
    return queryRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQueryRef(ModelQuery newQueryRef)
  {
    ModelQuery oldQueryRef = queryRef;
    queryRef = newQueryRef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.QUERY__QUERY_REF, oldQueryRef, queryRef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<QueryVariable> getVariables()
  {
    if (variables == null)
    {
      variables = new EObjectContainmentEList<QueryVariable>(QueryVariable.class, this, DomainPackage.QUERY__VARIABLES);
    }
    return variables;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getGroupCode()
  {
    return groupCode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGroupCode(String newGroupCode)
  {
    String oldGroupCode = groupCode;
    groupCode = newGroupCode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.QUERY__GROUP_CODE, oldGroupCode, groupCode));
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
      case DomainPackage.QUERY__VARIABLES:
        return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
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
      case DomainPackage.QUERY__UID:
        return getUid();
      case DomainPackage.QUERY__MODEL_QUERY:
        if (resolve) return getModelQuery();
        return basicGetModelQuery();
      case DomainPackage.QUERY__NAME:
        return getName();
      case DomainPackage.QUERY__QUERY_REF:
        if (resolve) return getQueryRef();
        return basicGetQueryRef();
      case DomainPackage.QUERY__VARIABLES:
        return getVariables();
      case DomainPackage.QUERY__GROUP_CODE:
        return getGroupCode();
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
      case DomainPackage.QUERY__UID:
        setUid((String)newValue);
        return;
      case DomainPackage.QUERY__MODEL_QUERY:
        setModelQuery((ModelQuery)newValue);
        return;
      case DomainPackage.QUERY__NAME:
        setName((String)newValue);
        return;
      case DomainPackage.QUERY__QUERY_REF:
        setQueryRef((ModelQuery)newValue);
        return;
      case DomainPackage.QUERY__VARIABLES:
        getVariables().clear();
        getVariables().addAll((Collection<? extends QueryVariable>)newValue);
        return;
      case DomainPackage.QUERY__GROUP_CODE:
        setGroupCode((String)newValue);
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
      case DomainPackage.QUERY__UID:
        setUid(UID_EDEFAULT);
        return;
      case DomainPackage.QUERY__MODEL_QUERY:
        setModelQuery((ModelQuery)null);
        return;
      case DomainPackage.QUERY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DomainPackage.QUERY__QUERY_REF:
        setQueryRef((ModelQuery)null);
        return;
      case DomainPackage.QUERY__VARIABLES:
        getVariables().clear();
        return;
      case DomainPackage.QUERY__GROUP_CODE:
        setGroupCode(GROUP_CODE_EDEFAULT);
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
      case DomainPackage.QUERY__UID:
        return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
      case DomainPackage.QUERY__MODEL_QUERY:
        return modelQuery != null;
      case DomainPackage.QUERY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DomainPackage.QUERY__QUERY_REF:
        return queryRef != null;
      case DomainPackage.QUERY__VARIABLES:
        return variables != null && !variables.isEmpty();
      case DomainPackage.QUERY__GROUP_CODE:
        return GROUP_CODE_EDEFAULT == null ? groupCode != null : !GROUP_CODE_EDEFAULT.equals(groupCode);
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
    result.append(", groupCode: ");
    result.append(groupCode);
    result.append(')');
    return result.toString();
  }

} //QueryImpl
