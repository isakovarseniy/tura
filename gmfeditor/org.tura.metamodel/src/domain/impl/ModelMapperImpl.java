/**
 */
package domain.impl;

import domain.ArtifactRef;
import domain.DomainPackage;
import domain.MappingSpecifier;
import domain.MappingVariable;
import domain.ModelMapper;

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
 * An implementation of the model object '<em><b>Model Mapper</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link domain.impl.ModelMapperImpl#getName <em>Name</em>}</li>
 *   <li>{@link domain.impl.ModelMapperImpl#getSpecifiers <em>Specifiers</em>}</li>
 *   <li>{@link domain.impl.ModelMapperImpl#getVariables <em>Variables</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelMapperImpl extends ArtifactRefImpl implements ModelMapper
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
   * The cached value of the '{@link #getSpecifiers() <em>Specifiers</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpecifiers()
   * @generated
   * @ordered
   */
  protected EList<MappingSpecifier> specifiers;

  /**
   * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariables()
   * @generated
   * @ordered
   */
  protected EList<MappingVariable> variables;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelMapperImpl()
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
    return DomainPackage.Literals.MODEL_MAPPER;
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
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.MODEL_MAPPER__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MappingSpecifier> getSpecifiers()
  {
    if (specifiers == null)
    {
      specifiers = new EObjectContainmentEList<MappingSpecifier>(MappingSpecifier.class, this, DomainPackage.MODEL_MAPPER__SPECIFIERS);
    }
    return specifiers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MappingVariable> getVariables()
  {
    if (variables == null)
    {
      variables = new EObjectContainmentEList<MappingVariable>(MappingVariable.class, this, DomainPackage.MODEL_MAPPER__VARIABLES);
    }
    return variables;
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
      case DomainPackage.MODEL_MAPPER__SPECIFIERS:
        return ((InternalEList<?>)getSpecifiers()).basicRemove(otherEnd, msgs);
      case DomainPackage.MODEL_MAPPER__VARIABLES:
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
      case DomainPackage.MODEL_MAPPER__NAME:
        return getName();
      case DomainPackage.MODEL_MAPPER__SPECIFIERS:
        return getSpecifiers();
      case DomainPackage.MODEL_MAPPER__VARIABLES:
        return getVariables();
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
      case DomainPackage.MODEL_MAPPER__NAME:
        setName((String)newValue);
        return;
      case DomainPackage.MODEL_MAPPER__SPECIFIERS:
        getSpecifiers().clear();
        getSpecifiers().addAll((Collection<? extends MappingSpecifier>)newValue);
        return;
      case DomainPackage.MODEL_MAPPER__VARIABLES:
        getVariables().clear();
        getVariables().addAll((Collection<? extends MappingVariable>)newValue);
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
      case DomainPackage.MODEL_MAPPER__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DomainPackage.MODEL_MAPPER__SPECIFIERS:
        getSpecifiers().clear();
        return;
      case DomainPackage.MODEL_MAPPER__VARIABLES:
        getVariables().clear();
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
      case DomainPackage.MODEL_MAPPER__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DomainPackage.MODEL_MAPPER__SPECIFIERS:
        return specifiers != null && !specifiers.isEmpty();
      case DomainPackage.MODEL_MAPPER__VARIABLES:
        return variables != null && !variables.isEmpty();
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

} //ModelMapperImpl
