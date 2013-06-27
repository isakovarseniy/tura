/**
 */
package typedefinition.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import typedefinition.Enumarator;
import typedefinition.TypeDefinition;
import typedefinition.TypeElement;
import typedefinition.TypedefinitionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link typedefinition.impl.TypeDefinitionImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link typedefinition.impl.TypeDefinitionImpl#getEnums <em>Enums</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeDefinitionImpl extends EObjectImpl implements TypeDefinition
{
  /**
   * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypes()
   * @generated
   * @ordered
   */
  protected EList<TypeElement> types;

  /**
   * The cached value of the '{@link #getEnums() <em>Enums</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnums()
   * @generated
   * @ordered
   */
  protected EList<Enumarator> enums;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypeDefinitionImpl()
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
    return TypedefinitionPackage.Literals.TYPE_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TypeElement> getTypes()
  {
    if (types == null)
    {
      types = new EObjectContainmentEList<TypeElement>(TypeElement.class, this, TypedefinitionPackage.TYPE_DEFINITION__TYPES);
    }
    return types;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Enumarator> getEnums()
  {
    if (enums == null)
    {
      enums = new EObjectContainmentEList<Enumarator>(Enumarator.class, this, TypedefinitionPackage.TYPE_DEFINITION__ENUMS);
    }
    return enums;
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
      case TypedefinitionPackage.TYPE_DEFINITION__TYPES:
        return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
      case TypedefinitionPackage.TYPE_DEFINITION__ENUMS:
        return ((InternalEList<?>)getEnums()).basicRemove(otherEnd, msgs);
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
      case TypedefinitionPackage.TYPE_DEFINITION__TYPES:
        return getTypes();
      case TypedefinitionPackage.TYPE_DEFINITION__ENUMS:
        return getEnums();
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
      case TypedefinitionPackage.TYPE_DEFINITION__TYPES:
        getTypes().clear();
        getTypes().addAll((Collection<? extends TypeElement>)newValue);
        return;
      case TypedefinitionPackage.TYPE_DEFINITION__ENUMS:
        getEnums().clear();
        getEnums().addAll((Collection<? extends Enumarator>)newValue);
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
      case TypedefinitionPackage.TYPE_DEFINITION__TYPES:
        getTypes().clear();
        return;
      case TypedefinitionPackage.TYPE_DEFINITION__ENUMS:
        getEnums().clear();
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
      case TypedefinitionPackage.TYPE_DEFINITION__TYPES:
        return types != null && !types.isEmpty();
      case TypedefinitionPackage.TYPE_DEFINITION__ENUMS:
        return enums != null && !enums.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //TypeDefinitionImpl
