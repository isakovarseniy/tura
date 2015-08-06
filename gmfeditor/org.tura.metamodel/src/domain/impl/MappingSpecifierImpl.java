/**
 */
package domain.impl;

import domain.DomainPackage;
import domain.MappingSpecifier;
import domain.Option;
import domain.Specifier;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapping Specifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link domain.impl.MappingSpecifierImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.impl.MappingSpecifierImpl#getSpecifierRef <em>Specifier Ref</em>}</li>
 *   <li>{@link domain.impl.MappingSpecifierImpl#getValueRef <em>Value Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MappingSpecifierImpl extends EObjectImpl implements MappingSpecifier
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
	 * The cached value of the '{@link #getSpecifierRef() <em>Specifier Ref</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getSpecifierRef()
	 * @generated
	 * @ordered
	 */
  protected Specifier specifierRef;

  /**
	 * The cached value of the '{@link #getValueRef() <em>Value Ref</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getValueRef()
	 * @generated
	 * @ordered
	 */
  protected Option valueRef;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected MappingSpecifierImpl()
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
		return DomainPackage.Literals.MAPPING_SPECIFIER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.MAPPING_SPECIFIER__UID, oldUid, uid));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Specifier getSpecifierRef()
  {
		if (specifierRef != null && specifierRef.eIsProxy()) {
			InternalEObject oldSpecifierRef = (InternalEObject)specifierRef;
			specifierRef = (Specifier)eResolveProxy(oldSpecifierRef);
			if (specifierRef != oldSpecifierRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.MAPPING_SPECIFIER__SPECIFIER_REF, oldSpecifierRef, specifierRef));
			}
		}
		return specifierRef;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Specifier basicGetSpecifierRef()
  {
		return specifierRef;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setSpecifierRef(Specifier newSpecifierRef)
  {
		Specifier oldSpecifierRef = specifierRef;
		specifierRef = newSpecifierRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.MAPPING_SPECIFIER__SPECIFIER_REF, oldSpecifierRef, specifierRef));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Option getValueRef()
  {
		if (valueRef != null && valueRef.eIsProxy()) {
			InternalEObject oldValueRef = (InternalEObject)valueRef;
			valueRef = (Option)eResolveProxy(oldValueRef);
			if (valueRef != oldValueRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.MAPPING_SPECIFIER__VALUE_REF, oldValueRef, valueRef));
			}
		}
		return valueRef;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Option basicGetValueRef()
  {
		return valueRef;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setValueRef(Option newValueRef)
  {
		Option oldValueRef = valueRef;
		valueRef = newValueRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.MAPPING_SPECIFIER__VALUE_REF, oldValueRef, valueRef));
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
			case DomainPackage.MAPPING_SPECIFIER__UID:
				return getUid();
			case DomainPackage.MAPPING_SPECIFIER__SPECIFIER_REF:
				if (resolve) return getSpecifierRef();
				return basicGetSpecifierRef();
			case DomainPackage.MAPPING_SPECIFIER__VALUE_REF:
				if (resolve) return getValueRef();
				return basicGetValueRef();
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
			case DomainPackage.MAPPING_SPECIFIER__UID:
				setUid((String)newValue);
				return;
			case DomainPackage.MAPPING_SPECIFIER__SPECIFIER_REF:
				setSpecifierRef((Specifier)newValue);
				return;
			case DomainPackage.MAPPING_SPECIFIER__VALUE_REF:
				setValueRef((Option)newValue);
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
			case DomainPackage.MAPPING_SPECIFIER__UID:
				setUid(UID_EDEFAULT);
				return;
			case DomainPackage.MAPPING_SPECIFIER__SPECIFIER_REF:
				setSpecifierRef((Specifier)null);
				return;
			case DomainPackage.MAPPING_SPECIFIER__VALUE_REF:
				setValueRef((Option)null);
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
			case DomainPackage.MAPPING_SPECIFIER__UID:
				return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
			case DomainPackage.MAPPING_SPECIFIER__SPECIFIER_REF:
				return specifierRef != null;
			case DomainPackage.MAPPING_SPECIFIER__VALUE_REF:
				return valueRef != null;
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

} //MappingSpecifierImpl
