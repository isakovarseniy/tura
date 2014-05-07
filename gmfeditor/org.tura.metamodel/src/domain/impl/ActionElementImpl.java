/**
 */
package domain.impl;

import domain.ActionElement;
import domain.ContextParameter;
import domain.DomainPackage;
import domain.MethodPointer;
import domain.Operation;
import domain.Trigger;
import domain.TypeElement;
import domain.TypePointer;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link domain.impl.ActionElementImpl#getPackageRef <em>Package Ref</em>}</li>
 *   <li>{@link domain.impl.ActionElementImpl#getTypeRef <em>Type Ref</em>}</li>
 *   <li>{@link domain.impl.ActionElementImpl#getFakePackageName <em>Fake Package Name</em>}</li>
 *   <li>{@link domain.impl.ActionElementImpl#getFakeTypeName <em>Fake Type Name</em>}</li>
 *   <li>{@link domain.impl.ActionElementImpl#getMethodRef <em>Method Ref</em>}</li>
 *   <li>{@link domain.impl.ActionElementImpl#getFakeMethod <em>Fake Method</em>}</li>
 *   <li>{@link domain.impl.ActionElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link domain.impl.ActionElementImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActionElementImpl extends UielementImpl implements ActionElement
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
   * The cached value of the '{@link #getMethodRef() <em>Method Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethodRef()
   * @generated
   * @ordered
   */
  protected Operation methodRef;

  /**
   * The default value of the '{@link #getFakeMethod() <em>Fake Method</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFakeMethod()
   * @generated
   * @ordered
   */
  protected static final String FAKE_METHOD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFakeMethod() <em>Fake Method</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFakeMethod()
   * @generated
   * @ordered
   */
  protected String fakeMethod = FAKE_METHOD_EDEFAULT;

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
   * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameters()
   * @generated
   * @ordered
   */
  protected EList<ContextParameter> parameters;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ActionElementImpl()
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
    return DomainPackage.Literals.ACTION_ELEMENT;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.ACTION_ELEMENT__PACKAGE_REF, oldPackageRef, packageRef));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.ACTION_ELEMENT__PACKAGE_REF, oldPackageRef, packageRef));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.ACTION_ELEMENT__TYPE_REF, oldTypeRef, typeRef));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.ACTION_ELEMENT__TYPE_REF, oldTypeRef, typeRef));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.ACTION_ELEMENT__FAKE_PACKAGE_NAME, oldFakePackageName, fakePackageName));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.ACTION_ELEMENT__FAKE_TYPE_NAME, oldFakeTypeName, fakeTypeName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operation getMethodRef()
  {
    if (methodRef != null && methodRef.eIsProxy())
    {
      InternalEObject oldMethodRef = (InternalEObject)methodRef;
      methodRef = (Operation)eResolveProxy(oldMethodRef);
      if (methodRef != oldMethodRef)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.ACTION_ELEMENT__METHOD_REF, oldMethodRef, methodRef));
      }
    }
    return methodRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operation basicGetMethodRef()
  {
    return methodRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMethodRef(Operation newMethodRef)
  {
    Operation oldMethodRef = methodRef;
    methodRef = newMethodRef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.ACTION_ELEMENT__METHOD_REF, oldMethodRef, methodRef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFakeMethod()
  {
    return fakeMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFakeMethod(String newFakeMethod)
  {
    String oldFakeMethod = fakeMethod;
    fakeMethod = newFakeMethod;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.ACTION_ELEMENT__FAKE_METHOD, oldFakeMethod, fakeMethod));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.ACTION_ELEMENT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ContextParameter> getParameters()
  {
    if (parameters == null)
    {
      parameters = new EObjectContainmentEList<ContextParameter>(ContextParameter.class, this, DomainPackage.ACTION_ELEMENT__PARAMETERS);
    }
    return parameters;
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
      case DomainPackage.ACTION_ELEMENT__PARAMETERS:
        return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
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
      case DomainPackage.ACTION_ELEMENT__PACKAGE_REF:
        if (resolve) return getPackageRef();
        return basicGetPackageRef();
      case DomainPackage.ACTION_ELEMENT__TYPE_REF:
        if (resolve) return getTypeRef();
        return basicGetTypeRef();
      case DomainPackage.ACTION_ELEMENT__FAKE_PACKAGE_NAME:
        return getFakePackageName();
      case DomainPackage.ACTION_ELEMENT__FAKE_TYPE_NAME:
        return getFakeTypeName();
      case DomainPackage.ACTION_ELEMENT__METHOD_REF:
        if (resolve) return getMethodRef();
        return basicGetMethodRef();
      case DomainPackage.ACTION_ELEMENT__FAKE_METHOD:
        return getFakeMethod();
      case DomainPackage.ACTION_ELEMENT__NAME:
        return getName();
      case DomainPackage.ACTION_ELEMENT__PARAMETERS:
        return getParameters();
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
      case DomainPackage.ACTION_ELEMENT__PACKAGE_REF:
        setPackageRef((domain.Package)newValue);
        return;
      case DomainPackage.ACTION_ELEMENT__TYPE_REF:
        setTypeRef((TypeElement)newValue);
        return;
      case DomainPackage.ACTION_ELEMENT__FAKE_PACKAGE_NAME:
        setFakePackageName((String)newValue);
        return;
      case DomainPackage.ACTION_ELEMENT__FAKE_TYPE_NAME:
        setFakeTypeName((String)newValue);
        return;
      case DomainPackage.ACTION_ELEMENT__METHOD_REF:
        setMethodRef((Operation)newValue);
        return;
      case DomainPackage.ACTION_ELEMENT__FAKE_METHOD:
        setFakeMethod((String)newValue);
        return;
      case DomainPackage.ACTION_ELEMENT__NAME:
        setName((String)newValue);
        return;
      case DomainPackage.ACTION_ELEMENT__PARAMETERS:
        getParameters().clear();
        getParameters().addAll((Collection<? extends ContextParameter>)newValue);
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
      case DomainPackage.ACTION_ELEMENT__PACKAGE_REF:
        setPackageRef((domain.Package)null);
        return;
      case DomainPackage.ACTION_ELEMENT__TYPE_REF:
        setTypeRef((TypeElement)null);
        return;
      case DomainPackage.ACTION_ELEMENT__FAKE_PACKAGE_NAME:
        setFakePackageName(FAKE_PACKAGE_NAME_EDEFAULT);
        return;
      case DomainPackage.ACTION_ELEMENT__FAKE_TYPE_NAME:
        setFakeTypeName(FAKE_TYPE_NAME_EDEFAULT);
        return;
      case DomainPackage.ACTION_ELEMENT__METHOD_REF:
        setMethodRef((Operation)null);
        return;
      case DomainPackage.ACTION_ELEMENT__FAKE_METHOD:
        setFakeMethod(FAKE_METHOD_EDEFAULT);
        return;
      case DomainPackage.ACTION_ELEMENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DomainPackage.ACTION_ELEMENT__PARAMETERS:
        getParameters().clear();
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
      case DomainPackage.ACTION_ELEMENT__PACKAGE_REF:
        return packageRef != null;
      case DomainPackage.ACTION_ELEMENT__TYPE_REF:
        return typeRef != null;
      case DomainPackage.ACTION_ELEMENT__FAKE_PACKAGE_NAME:
        return FAKE_PACKAGE_NAME_EDEFAULT == null ? fakePackageName != null : !FAKE_PACKAGE_NAME_EDEFAULT.equals(fakePackageName);
      case DomainPackage.ACTION_ELEMENT__FAKE_TYPE_NAME:
        return FAKE_TYPE_NAME_EDEFAULT == null ? fakeTypeName != null : !FAKE_TYPE_NAME_EDEFAULT.equals(fakeTypeName);
      case DomainPackage.ACTION_ELEMENT__METHOD_REF:
        return methodRef != null;
      case DomainPackage.ACTION_ELEMENT__FAKE_METHOD:
        return FAKE_METHOD_EDEFAULT == null ? fakeMethod != null : !FAKE_METHOD_EDEFAULT.equals(fakeMethod);
      case DomainPackage.ACTION_ELEMENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DomainPackage.ACTION_ELEMENT__PARAMETERS:
        return parameters != null && !parameters.isEmpty();
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
        case DomainPackage.ACTION_ELEMENT__PACKAGE_REF: return DomainPackage.TYPE_POINTER__PACKAGE_REF;
        case DomainPackage.ACTION_ELEMENT__TYPE_REF: return DomainPackage.TYPE_POINTER__TYPE_REF;
        case DomainPackage.ACTION_ELEMENT__FAKE_PACKAGE_NAME: return DomainPackage.TYPE_POINTER__FAKE_PACKAGE_NAME;
        case DomainPackage.ACTION_ELEMENT__FAKE_TYPE_NAME: return DomainPackage.TYPE_POINTER__FAKE_TYPE_NAME;
        default: return -1;
      }
    }
    if (baseClass == MethodPointer.class)
    {
      switch (derivedFeatureID)
      {
        case DomainPackage.ACTION_ELEMENT__METHOD_REF: return DomainPackage.METHOD_POINTER__METHOD_REF;
        case DomainPackage.ACTION_ELEMENT__FAKE_METHOD: return DomainPackage.METHOD_POINTER__FAKE_METHOD;
        default: return -1;
      }
    }
    if (baseClass == Trigger.class)
    {
      switch (derivedFeatureID)
      {
        case DomainPackage.ACTION_ELEMENT__NAME: return DomainPackage.TRIGGER__NAME;
        case DomainPackage.ACTION_ELEMENT__PARAMETERS: return DomainPackage.TRIGGER__PARAMETERS;
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
        case DomainPackage.TYPE_POINTER__PACKAGE_REF: return DomainPackage.ACTION_ELEMENT__PACKAGE_REF;
        case DomainPackage.TYPE_POINTER__TYPE_REF: return DomainPackage.ACTION_ELEMENT__TYPE_REF;
        case DomainPackage.TYPE_POINTER__FAKE_PACKAGE_NAME: return DomainPackage.ACTION_ELEMENT__FAKE_PACKAGE_NAME;
        case DomainPackage.TYPE_POINTER__FAKE_TYPE_NAME: return DomainPackage.ACTION_ELEMENT__FAKE_TYPE_NAME;
        default: return -1;
      }
    }
    if (baseClass == MethodPointer.class)
    {
      switch (baseFeatureID)
      {
        case DomainPackage.METHOD_POINTER__METHOD_REF: return DomainPackage.ACTION_ELEMENT__METHOD_REF;
        case DomainPackage.METHOD_POINTER__FAKE_METHOD: return DomainPackage.ACTION_ELEMENT__FAKE_METHOD;
        default: return -1;
      }
    }
    if (baseClass == Trigger.class)
    {
      switch (baseFeatureID)
      {
        case DomainPackage.TRIGGER__NAME: return DomainPackage.ACTION_ELEMENT__NAME;
        case DomainPackage.TRIGGER__PARAMETERS: return DomainPackage.ACTION_ELEMENT__PARAMETERS;
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
    result.append(", fakeMethod: ");
    result.append(fakeMethod);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ActionElementImpl
