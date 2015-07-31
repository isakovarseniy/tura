/**
 */
package domain.impl;

import domain.ConfigVariable;
import domain.DomainPackage;
import domain.Property;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link domain.impl.PropertyImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.impl.PropertyImpl#getConfVarRef <em>Conf Var Ref</em>}</li>
 *   <li>{@link domain.impl.PropertyImpl#getValue <em>Value</em>}</li>
 *   <li>{@link domain.impl.PropertyImpl#getFakeName <em>Fake Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyImpl extends EObjectImpl implements Property
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
	 * The cached value of the '{@link #getConfVarRef() <em>Conf Var Ref</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getConfVarRef()
	 * @generated
	 * @ordered
	 */
  protected ConfigVariable confVarRef;

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
	 * The default value of the '{@link #getFakeName() <em>Fake Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getFakeName()
	 * @generated
	 * @ordered
	 */
  protected static final String FAKE_NAME_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getFakeName() <em>Fake Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getFakeName()
	 * @generated
	 * @ordered
	 */
  protected String fakeName = FAKE_NAME_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected PropertyImpl()
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
		return DomainPackage.Literals.PROPERTY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.PROPERTY__UID, oldUid, uid));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ConfigVariable getConfVarRef()
  {
		if (confVarRef != null && confVarRef.eIsProxy()) {
			InternalEObject oldConfVarRef = (InternalEObject)confVarRef;
			confVarRef = (ConfigVariable)eResolveProxy(oldConfVarRef);
			if (confVarRef != oldConfVarRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.PROPERTY__CONF_VAR_REF, oldConfVarRef, confVarRef));
			}
		}
		return confVarRef;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ConfigVariable basicGetConfVarRef()
  {
		return confVarRef;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setConfVarRef(ConfigVariable newConfVarRef)
  {
		ConfigVariable oldConfVarRef = confVarRef;
		confVarRef = newConfVarRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.PROPERTY__CONF_VAR_REF, oldConfVarRef, confVarRef));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.PROPERTY__VALUE, oldValue, value));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getFakeName()
  {
		return fakeName;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setFakeName(String newFakeName)
  {
		String oldFakeName = fakeName;
		fakeName = newFakeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.PROPERTY__FAKE_NAME, oldFakeName, fakeName));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
		switch (featureID) {
			case DomainPackage.PROPERTY__UID:
				return getUid();
			case DomainPackage.PROPERTY__CONF_VAR_REF:
				if (resolve) return getConfVarRef();
				return basicGetConfVarRef();
			case DomainPackage.PROPERTY__VALUE:
				return getValue();
			case DomainPackage.PROPERTY__FAKE_NAME:
				return getFakeName();
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
		switch (featureID) {
			case DomainPackage.PROPERTY__UID:
				setUid((String)newValue);
				return;
			case DomainPackage.PROPERTY__CONF_VAR_REF:
				setConfVarRef((ConfigVariable)newValue);
				return;
			case DomainPackage.PROPERTY__VALUE:
				setValue((String)newValue);
				return;
			case DomainPackage.PROPERTY__FAKE_NAME:
				setFakeName((String)newValue);
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
		switch (featureID) {
			case DomainPackage.PROPERTY__UID:
				setUid(UID_EDEFAULT);
				return;
			case DomainPackage.PROPERTY__CONF_VAR_REF:
				setConfVarRef((ConfigVariable)null);
				return;
			case DomainPackage.PROPERTY__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case DomainPackage.PROPERTY__FAKE_NAME:
				setFakeName(FAKE_NAME_EDEFAULT);
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
		switch (featureID) {
			case DomainPackage.PROPERTY__UID:
				return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
			case DomainPackage.PROPERTY__CONF_VAR_REF:
				return confVarRef != null;
			case DomainPackage.PROPERTY__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case DomainPackage.PROPERTY__FAKE_NAME:
				return FAKE_NAME_EDEFAULT == null ? fakeName != null : !FAKE_NAME_EDEFAULT.equals(fakeName);
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
		result.append(", fakeName: ");
		result.append(fakeName);
		result.append(')');
		return result.toString();
	}

} //PropertyImpl
