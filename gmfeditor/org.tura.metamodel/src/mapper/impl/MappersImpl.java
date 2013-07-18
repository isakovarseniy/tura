/**
 */
package mapper.impl;

import java.util.Collection;

import mapper.Mapper;
import mapper.MapperPackage;
import mapper.Mappers;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mappers</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mapper.impl.MappersImpl#getMappers <em>Mappers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MappersImpl extends EObjectImpl implements Mappers
{
  /**
   * The cached value of the '{@link #getMappers() <em>Mappers</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMappers()
   * @generated
   * @ordered
   */
  protected EList<Mapper> mappers;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MappersImpl()
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
    return MapperPackage.Literals.MAPPERS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Mapper> getMappers()
  {
    if (mappers == null)
    {
      mappers = new EObjectContainmentEList<Mapper>(Mapper.class, this, MapperPackage.MAPPERS__MAPPERS);
    }
    return mappers;
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
      case MapperPackage.MAPPERS__MAPPERS:
        return ((InternalEList<?>)getMappers()).basicRemove(otherEnd, msgs);
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
      case MapperPackage.MAPPERS__MAPPERS:
        return getMappers();
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
      case MapperPackage.MAPPERS__MAPPERS:
        getMappers().clear();
        getMappers().addAll((Collection<? extends Mapper>)newValue);
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
      case MapperPackage.MAPPERS__MAPPERS:
        getMappers().clear();
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
      case MapperPackage.MAPPERS__MAPPERS:
        return mappers != null && !mappers.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //MappersImpl
