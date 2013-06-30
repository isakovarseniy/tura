/**
 */
package typesrepository.impl;

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

import typesrepository.Primitive;
import typesrepository.Types;
import typesrepository.TypesrepositoryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Types</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link typesrepository.impl.TypesImpl#getName <em>Name</em>}</li>
 *   <li>{@link typesrepository.impl.TypesImpl#getPrimitives <em>Primitives</em>}</li>
 *   <li>{@link typesrepository.impl.TypesImpl#getPackages <em>Packages</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypesImpl extends EObjectImpl implements Types
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
   * The cached value of the '{@link #getPrimitives() <em>Primitives</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrimitives()
   * @generated
   * @ordered
   */
  protected EList<Primitive> primitives;

  /**
   * The cached value of the '{@link #getPackages() <em>Packages</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPackages()
   * @generated
   * @ordered
   */
  protected EList<typesrepository.Package> packages;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypesImpl()
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
    return TypesrepositoryPackage.Literals.TYPES;
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
      eNotify(new ENotificationImpl(this, Notification.SET, TypesrepositoryPackage.TYPES__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Primitive> getPrimitives()
  {
    if (primitives == null)
    {
      primitives = new EObjectContainmentEList<Primitive>(Primitive.class, this, TypesrepositoryPackage.TYPES__PRIMITIVES);
    }
    return primitives;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<typesrepository.Package> getPackages()
  {
    if (packages == null)
    {
      packages = new EObjectContainmentEList<typesrepository.Package>(typesrepository.Package.class, this, TypesrepositoryPackage.TYPES__PACKAGES);
    }
    return packages;
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
      case TypesrepositoryPackage.TYPES__PRIMITIVES:
        return ((InternalEList<?>)getPrimitives()).basicRemove(otherEnd, msgs);
      case TypesrepositoryPackage.TYPES__PACKAGES:
        return ((InternalEList<?>)getPackages()).basicRemove(otherEnd, msgs);
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
      case TypesrepositoryPackage.TYPES__NAME:
        return getName();
      case TypesrepositoryPackage.TYPES__PRIMITIVES:
        return getPrimitives();
      case TypesrepositoryPackage.TYPES__PACKAGES:
        return getPackages();
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
      case TypesrepositoryPackage.TYPES__NAME:
        setName((String)newValue);
        return;
      case TypesrepositoryPackage.TYPES__PRIMITIVES:
        getPrimitives().clear();
        getPrimitives().addAll((Collection<? extends Primitive>)newValue);
        return;
      case TypesrepositoryPackage.TYPES__PACKAGES:
        getPackages().clear();
        getPackages().addAll((Collection<? extends typesrepository.Package>)newValue);
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
      case TypesrepositoryPackage.TYPES__NAME:
        setName(NAME_EDEFAULT);
        return;
      case TypesrepositoryPackage.TYPES__PRIMITIVES:
        getPrimitives().clear();
        return;
      case TypesrepositoryPackage.TYPES__PACKAGES:
        getPackages().clear();
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
      case TypesrepositoryPackage.TYPES__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case TypesrepositoryPackage.TYPES__PRIMITIVES:
        return primitives != null && !primitives.isEmpty();
      case TypesrepositoryPackage.TYPES__PACKAGES:
        return packages != null && !packages.isEmpty();
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

} //TypesImpl
