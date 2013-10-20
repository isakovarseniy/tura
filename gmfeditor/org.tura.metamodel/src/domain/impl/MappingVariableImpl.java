/**
 */
package domain.impl;

import domain.DomainPackage;
import domain.MappingVariable;

import domain.Variable;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapping Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link domain.impl.MappingVariableImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.impl.MappingVariableImpl#getVariableRef <em>Variable Ref</em>}</li>
 *   <li>{@link domain.impl.MappingVariableImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MappingVariableImpl extends EObjectImpl implements MappingVariable
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
   * The cached value of the '{@link #getVariableRef() <em>Variable Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariableRef()
   * @generated
   * @ordered
   */
  protected Variable variableRef;

  /**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected static final String VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected String value = VALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MappingVariableImpl()
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
    return DomainPackage.Literals.MAPPING_VARIABLE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.MAPPING_VARIABLE__UID, oldUid, uid));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable getVariableRef()
  {
    if (variableRef != null && variableRef.eIsProxy())
    {
      InternalEObject oldVariableRef = (InternalEObject)variableRef;
      variableRef = (Variable)eResolveProxy(oldVariableRef);
      if (variableRef != oldVariableRef)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.MAPPING_VARIABLE__VARIABLE_REF, oldVariableRef, variableRef));
      }
    }
    return variableRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable basicGetVariableRef()
  {
    return variableRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariableRef(Variable newVariableRef)
  {
    Variable oldVariableRef = variableRef;
    variableRef = newVariableRef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.MAPPING_VARIABLE__VARIABLE_REF, oldVariableRef, variableRef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(String newValue)
  {
    String oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.MAPPING_VARIABLE__VALUE, oldValue, value));
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
      case DomainPackage.MAPPING_VARIABLE__UID:
        return getUid();
      case DomainPackage.MAPPING_VARIABLE__VARIABLE_REF:
        if (resolve) return getVariableRef();
        return basicGetVariableRef();
      case DomainPackage.MAPPING_VARIABLE__VALUE:
        return getValue();
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
      case DomainPackage.MAPPING_VARIABLE__UID:
        setUid((String)newValue);
        return;
      case DomainPackage.MAPPING_VARIABLE__VARIABLE_REF:
        setVariableRef((Variable)newValue);
        return;
      case DomainPackage.MAPPING_VARIABLE__VALUE:
        setValue((String)newValue);
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
      case DomainPackage.MAPPING_VARIABLE__UID:
        setUid(UID_EDEFAULT);
        return;
      case DomainPackage.MAPPING_VARIABLE__VARIABLE_REF:
        setVariableRef((Variable)null);
        return;
      case DomainPackage.MAPPING_VARIABLE__VALUE:
        setValue(VALUE_EDEFAULT);
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
      case DomainPackage.MAPPING_VARIABLE__UID:
        return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
      case DomainPackage.MAPPING_VARIABLE__VARIABLE_REF:
        return variableRef != null;
      case DomainPackage.MAPPING_VARIABLE__VALUE:
        return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
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
    result.append(", value: ");
    result.append(value);
    result.append(')');
    return result.toString();
  }

} //MappingVariableImpl
