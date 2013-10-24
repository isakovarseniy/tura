/**
 */
package domain.impl;

import domain.DomainPackage;
import domain.TypeElement;
import domain.Type;
import domain.TypePointer;
import domain.TypeReference;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link domain.impl.TypeReferenceImpl#getPackageRef <em>Package Ref</em>}</li>
 *   <li>{@link domain.impl.TypeReferenceImpl#getTypeRef <em>Type Ref</em>}</li>
 *   <li>{@link domain.impl.TypeReferenceImpl#getFakePackageName <em>Fake Package Name</em>}</li>
 *   <li>{@link domain.impl.TypeReferenceImpl#getFakeTypeName <em>Fake Type Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeReferenceImpl extends TypeElementImpl implements TypeReference
{
  /**
   * The cached value of the '{@link #getPackageRef() <em>Package Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPackageRef()
   * @generated
   * @ordered
   */
  protected domain.Package packageRef;

  /**
   * The cached value of the '{@link #getTypeRef() <em>Type Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeRef()
   * @generated
   * @ordered
   */
  protected TypeElement typeRef;

  /**
   * The default value of the '{@link #getFakePackageName() <em>Fake Package Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFakePackageName()
   * @generated
   * @ordered
   */
  protected static final String FAKE_PACKAGE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFakePackageName() <em>Fake Package Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFakePackageName()
   * @generated
   * @ordered
   */
  protected String fakePackageName = FAKE_PACKAGE_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getFakeTypeName() <em>Fake Type Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFakeTypeName()
   * @generated
   * @ordered
   */
  protected static final String FAKE_TYPE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFakeTypeName() <em>Fake Type Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFakeTypeName()
   * @generated
   * @ordered
   */
  protected String fakeTypeName = FAKE_TYPE_NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypeReferenceImpl()
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
    return DomainPackage.Literals.TYPE_REFERENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public domain.Package getPackageRef()
  {
    if (packageRef != null && packageRef.eIsProxy())
    {
      InternalEObject oldPackageRef = (InternalEObject)packageRef;
      packageRef = (domain.Package)eResolveProxy(oldPackageRef);
      if (packageRef != oldPackageRef)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.TYPE_REFERENCE__PACKAGE_REF, oldPackageRef, packageRef));
      }
    }
    return packageRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public domain.Package basicGetPackageRef()
  {
    return packageRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPackageRef(domain.Package newPackageRef)
  {
    domain.Package oldPackageRef = packageRef;
    packageRef = newPackageRef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.TYPE_REFERENCE__PACKAGE_REF, oldPackageRef, packageRef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeElement getTypeRef()
  {
    if (typeRef != null && typeRef.eIsProxy())
    {
      InternalEObject oldTypeRef = (InternalEObject)typeRef;
      typeRef = (TypeElement)eResolveProxy(oldTypeRef);
      if (typeRef != oldTypeRef)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.TYPE_REFERENCE__TYPE_REF, oldTypeRef, typeRef));
      }
    }
    return typeRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeElement basicGetTypeRef()
  {
    return typeRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypeRef(TypeElement newTypeRef)
  {
    TypeElement oldTypeRef = typeRef;
    typeRef = newTypeRef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.TYPE_REFERENCE__TYPE_REF, oldTypeRef, typeRef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFakePackageName()
  {
    return fakePackageName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFakePackageName(String newFakePackageName)
  {
    String oldFakePackageName = fakePackageName;
    fakePackageName = newFakePackageName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.TYPE_REFERENCE__FAKE_PACKAGE_NAME, oldFakePackageName, fakePackageName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFakeTypeName()
  {
    return fakeTypeName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFakeTypeName(String newFakeTypeName)
  {
    String oldFakeTypeName = fakeTypeName;
    fakeTypeName = newFakeTypeName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.TYPE_REFERENCE__FAKE_TYPE_NAME, oldFakeTypeName, fakeTypeName));
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
      case DomainPackage.TYPE_REFERENCE__PACKAGE_REF:
        if (resolve) return getPackageRef();
        return basicGetPackageRef();
      case DomainPackage.TYPE_REFERENCE__TYPE_REF:
        if (resolve) return getTypeRef();
        return basicGetTypeRef();
      case DomainPackage.TYPE_REFERENCE__FAKE_PACKAGE_NAME:
        return getFakePackageName();
      case DomainPackage.TYPE_REFERENCE__FAKE_TYPE_NAME:
        return getFakeTypeName();
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
      case DomainPackage.TYPE_REFERENCE__PACKAGE_REF:
        setPackageRef((domain.Package)newValue);
        return;
      case DomainPackage.TYPE_REFERENCE__TYPE_REF:
        setTypeRef((TypeElement)newValue);
        return;
      case DomainPackage.TYPE_REFERENCE__FAKE_PACKAGE_NAME:
        setFakePackageName((String)newValue);
        return;
      case DomainPackage.TYPE_REFERENCE__FAKE_TYPE_NAME:
        setFakeTypeName((String)newValue);
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
      case DomainPackage.TYPE_REFERENCE__PACKAGE_REF:
        setPackageRef((domain.Package)null);
        return;
      case DomainPackage.TYPE_REFERENCE__TYPE_REF:
        setTypeRef((TypeElement)null);
        return;
      case DomainPackage.TYPE_REFERENCE__FAKE_PACKAGE_NAME:
        setFakePackageName(FAKE_PACKAGE_NAME_EDEFAULT);
        return;
      case DomainPackage.TYPE_REFERENCE__FAKE_TYPE_NAME:
        setFakeTypeName(FAKE_TYPE_NAME_EDEFAULT);
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
      case DomainPackage.TYPE_REFERENCE__PACKAGE_REF:
        return packageRef != null;
      case DomainPackage.TYPE_REFERENCE__TYPE_REF:
        return typeRef != null;
      case DomainPackage.TYPE_REFERENCE__FAKE_PACKAGE_NAME:
        return FAKE_PACKAGE_NAME_EDEFAULT == null ? fakePackageName != null : !FAKE_PACKAGE_NAME_EDEFAULT.equals(fakePackageName);
      case DomainPackage.TYPE_REFERENCE__FAKE_TYPE_NAME:
        return FAKE_TYPE_NAME_EDEFAULT == null ? fakeTypeName != null : !FAKE_TYPE_NAME_EDEFAULT.equals(fakeTypeName);
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
    if (baseClass == TypePointer.class)
    {
      switch (derivedFeatureID)
      {
        case DomainPackage.TYPE_REFERENCE__PACKAGE_REF: return DomainPackage.TYPE_POINTER__PACKAGE_REF;
        case DomainPackage.TYPE_REFERENCE__TYPE_REF: return DomainPackage.TYPE_POINTER__TYPE_REF;
        case DomainPackage.TYPE_REFERENCE__FAKE_PACKAGE_NAME: return DomainPackage.TYPE_POINTER__FAKE_PACKAGE_NAME;
        case DomainPackage.TYPE_REFERENCE__FAKE_TYPE_NAME: return DomainPackage.TYPE_POINTER__FAKE_TYPE_NAME;
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
    if (baseClass == TypePointer.class)
    {
      switch (baseFeatureID)
      {
        case DomainPackage.TYPE_POINTER__PACKAGE_REF: return DomainPackage.TYPE_REFERENCE__PACKAGE_REF;
        case DomainPackage.TYPE_POINTER__TYPE_REF: return DomainPackage.TYPE_REFERENCE__TYPE_REF;
        case DomainPackage.TYPE_POINTER__FAKE_PACKAGE_NAME: return DomainPackage.TYPE_REFERENCE__FAKE_PACKAGE_NAME;
        case DomainPackage.TYPE_POINTER__FAKE_TYPE_NAME: return DomainPackage.TYPE_REFERENCE__FAKE_TYPE_NAME;
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
    result.append(" (fakePackageName: ");
    result.append(fakePackageName);
    result.append(", fakeTypeName: ");
    result.append(fakeTypeName);
    result.append(')');
    return result.toString();
  }

} //TypeReferenceImpl
