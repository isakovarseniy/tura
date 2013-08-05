/**
 */
package domain.impl;

import domain.Artifact;
import domain.DomainPackage;
import domain.Specifier;
import domain.Variable;

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
 * An implementation of the model object '<em><b>Artifact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link domain.impl.ArtifactImpl#getName <em>Name</em>}</li>
 *   <li>{@link domain.impl.ArtifactImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link domain.impl.ArtifactImpl#getConfigVariables <em>Config Variables</em>}</li>
 *   <li>{@link domain.impl.ArtifactImpl#getModelQuery <em>Model Query</em>}</li>
 *   <li>{@link domain.impl.ArtifactImpl#getSpecifiers <em>Specifiers</em>}</li>
 *   <li>{@link domain.impl.ArtifactImpl#getTemplate <em>Template</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArtifactImpl extends EObjectImpl implements Artifact
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
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
   * The cached value of the '{@link #getConfigVariables() <em>Config Variables</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConfigVariables()
   * @generated
   * @ordered
   */
  protected EList<Variable> configVariables;

  /**
   * The cached value of the '{@link #getModelQuery() <em>Model Query</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModelQuery()
   * @generated
   * @ordered
   */
  protected EList<Variable> modelQuery;

  /**
   * The cached value of the '{@link #getSpecifiers() <em>Specifiers</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpecifiers()
   * @generated
   * @ordered
   */
  protected EList<Specifier> specifiers;

  /**
   * The default value of the '{@link #getTemplate() <em>Template</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTemplate()
   * @generated
   * @ordered
   */
  protected static final String TEMPLATE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTemplate() <em>Template</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTemplate()
   * @generated
   * @ordered
   */
  protected String template = TEMPLATE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ArtifactImpl()
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
    return DomainPackage.Literals.ARTIFACT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.ARTIFACT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescription(String newDescription)
  {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.ARTIFACT__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Variable> getConfigVariables()
  {
    if (configVariables == null)
    {
      configVariables = new EObjectContainmentEList<Variable>(Variable.class, this, DomainPackage.ARTIFACT__CONFIG_VARIABLES);
    }
    return configVariables;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Variable> getModelQuery()
  {
    if (modelQuery == null)
    {
      modelQuery = new EObjectContainmentEList<Variable>(Variable.class, this, DomainPackage.ARTIFACT__MODEL_QUERY);
    }
    return modelQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Specifier> getSpecifiers()
  {
    if (specifiers == null)
    {
      specifiers = new EObjectContainmentEList<Specifier>(Specifier.class, this, DomainPackage.ARTIFACT__SPECIFIERS);
    }
    return specifiers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTemplate()
  {
    return template;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTemplate(String newTemplate)
  {
    String oldTemplate = template;
    template = newTemplate;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.ARTIFACT__TEMPLATE, oldTemplate, template));
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
      case DomainPackage.ARTIFACT__CONFIG_VARIABLES:
        return ((InternalEList<?>)getConfigVariables()).basicRemove(otherEnd, msgs);
      case DomainPackage.ARTIFACT__MODEL_QUERY:
        return ((InternalEList<?>)getModelQuery()).basicRemove(otherEnd, msgs);
      case DomainPackage.ARTIFACT__SPECIFIERS:
        return ((InternalEList<?>)getSpecifiers()).basicRemove(otherEnd, msgs);
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
      case DomainPackage.ARTIFACT__NAME:
        return getName();
      case DomainPackage.ARTIFACT__DESCRIPTION:
        return getDescription();
      case DomainPackage.ARTIFACT__CONFIG_VARIABLES:
        return getConfigVariables();
      case DomainPackage.ARTIFACT__MODEL_QUERY:
        return getModelQuery();
      case DomainPackage.ARTIFACT__SPECIFIERS:
        return getSpecifiers();
      case DomainPackage.ARTIFACT__TEMPLATE:
        return getTemplate();
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
      case DomainPackage.ARTIFACT__NAME:
        setName((String)newValue);
        return;
      case DomainPackage.ARTIFACT__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case DomainPackage.ARTIFACT__CONFIG_VARIABLES:
        getConfigVariables().clear();
        getConfigVariables().addAll((Collection<? extends Variable>)newValue);
        return;
      case DomainPackage.ARTIFACT__MODEL_QUERY:
        getModelQuery().clear();
        getModelQuery().addAll((Collection<? extends Variable>)newValue);
        return;
      case DomainPackage.ARTIFACT__SPECIFIERS:
        getSpecifiers().clear();
        getSpecifiers().addAll((Collection<? extends Specifier>)newValue);
        return;
      case DomainPackage.ARTIFACT__TEMPLATE:
        setTemplate((String)newValue);
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
      case DomainPackage.ARTIFACT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DomainPackage.ARTIFACT__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case DomainPackage.ARTIFACT__CONFIG_VARIABLES:
        getConfigVariables().clear();
        return;
      case DomainPackage.ARTIFACT__MODEL_QUERY:
        getModelQuery().clear();
        return;
      case DomainPackage.ARTIFACT__SPECIFIERS:
        getSpecifiers().clear();
        return;
      case DomainPackage.ARTIFACT__TEMPLATE:
        setTemplate(TEMPLATE_EDEFAULT);
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
      case DomainPackage.ARTIFACT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DomainPackage.ARTIFACT__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case DomainPackage.ARTIFACT__CONFIG_VARIABLES:
        return configVariables != null && !configVariables.isEmpty();
      case DomainPackage.ARTIFACT__MODEL_QUERY:
        return modelQuery != null && !modelQuery.isEmpty();
      case DomainPackage.ARTIFACT__SPECIFIERS:
        return specifiers != null && !specifiers.isEmpty();
      case DomainPackage.ARTIFACT__TEMPLATE:
        return TEMPLATE_EDEFAULT == null ? template != null : !TEMPLATE_EDEFAULT.equals(template);
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
    result.append(", description: ");
    result.append(description);
    result.append(", template: ");
    result.append(template);
    result.append(')');
    return result.toString();
  }

} //ArtifactImpl
