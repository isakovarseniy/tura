/**
 */
package domain.impl;

import domain.Component;
import domain.DomainPackage;
import domain.MappingSpecifier;
import domain.ModelMapper;
import domain.Query;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Mapper</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link domain.impl.ModelMapperImpl#getName <em>Name</em>}</li>
 *   <li>{@link domain.impl.ModelMapperImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link domain.impl.ModelMapperImpl#getSpecifiers <em>Specifiers</em>}</li>
 *   <li>{@link domain.impl.ModelMapperImpl#getQueries <em>Queries</em>}</li>
 *   <li>{@link domain.impl.ModelMapperImpl#getGeneratedArtifactLocation <em>Generated Artifact Location</em>}</li>
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
   * The cached value of the '{@link #getQueries() <em>Queries</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQueries()
   * @generated
   * @ordered
   */
  protected EList<Query> queries;

  /**
   * The default value of the '{@link #getGeneratedArtifactLocation() <em>Generated Artifact Location</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGeneratedArtifactLocation()
   * @generated
   * @ordered
   */
  protected static final String GENERATED_ARTIFACT_LOCATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getGeneratedArtifactLocation() <em>Generated Artifact Location</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGeneratedArtifactLocation()
   * @generated
   * @ordered
   */
  protected String generatedArtifactLocation = GENERATED_ARTIFACT_LOCATION_EDEFAULT;

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
  public Component getParent()
  {
    if (eContainerFeatureID() != DomainPackage.MODEL_MAPPER__PARENT) return null;
    return (Component)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParent(Component newParent, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newParent, DomainPackage.MODEL_MAPPER__PARENT, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParent(Component newParent)
  {
    if (newParent != eInternalContainer() || (eContainerFeatureID() != DomainPackage.MODEL_MAPPER__PARENT && newParent != null))
    {
      if (EcoreUtil.isAncestor(this, newParent))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newParent != null)
        msgs = ((InternalEObject)newParent).eInverseAdd(this, DomainPackage.COMPONENT__MAPPERS, Component.class, msgs);
      msgs = basicSetParent(newParent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.MODEL_MAPPER__PARENT, newParent, newParent));
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
  public EList<Query> getQueries()
  {
    if (queries == null)
    {
      queries = new EObjectContainmentEList<Query>(Query.class, this, DomainPackage.MODEL_MAPPER__QUERIES);
    }
    return queries;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getGeneratedArtifactLocation()
  {
    return generatedArtifactLocation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGeneratedArtifactLocation(String newGeneratedArtifactLocation)
  {
    String oldGeneratedArtifactLocation = generatedArtifactLocation;
    generatedArtifactLocation = newGeneratedArtifactLocation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.MODEL_MAPPER__GENERATED_ARTIFACT_LOCATION, oldGeneratedArtifactLocation, generatedArtifactLocation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DomainPackage.MODEL_MAPPER__PARENT:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetParent((Component)otherEnd, msgs);
    }
    return super.eInverseAdd(otherEnd, featureID, msgs);
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
      case DomainPackage.MODEL_MAPPER__PARENT:
        return basicSetParent(null, msgs);
      case DomainPackage.MODEL_MAPPER__SPECIFIERS:
        return ((InternalEList<?>)getSpecifiers()).basicRemove(otherEnd, msgs);
      case DomainPackage.MODEL_MAPPER__QUERIES:
        return ((InternalEList<?>)getQueries()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
  {
    switch (eContainerFeatureID())
    {
      case DomainPackage.MODEL_MAPPER__PARENT:
        return eInternalContainer().eInverseRemove(this, DomainPackage.COMPONENT__MAPPERS, Component.class, msgs);
    }
    return super.eBasicRemoveFromContainerFeature(msgs);
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
      case DomainPackage.MODEL_MAPPER__PARENT:
        return getParent();
      case DomainPackage.MODEL_MAPPER__SPECIFIERS:
        return getSpecifiers();
      case DomainPackage.MODEL_MAPPER__QUERIES:
        return getQueries();
      case DomainPackage.MODEL_MAPPER__GENERATED_ARTIFACT_LOCATION:
        return getGeneratedArtifactLocation();
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
      case DomainPackage.MODEL_MAPPER__PARENT:
        setParent((Component)newValue);
        return;
      case DomainPackage.MODEL_MAPPER__SPECIFIERS:
        getSpecifiers().clear();
        getSpecifiers().addAll((Collection<? extends MappingSpecifier>)newValue);
        return;
      case DomainPackage.MODEL_MAPPER__QUERIES:
        getQueries().clear();
        getQueries().addAll((Collection<? extends Query>)newValue);
        return;
      case DomainPackage.MODEL_MAPPER__GENERATED_ARTIFACT_LOCATION:
        setGeneratedArtifactLocation((String)newValue);
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
      case DomainPackage.MODEL_MAPPER__PARENT:
        setParent((Component)null);
        return;
      case DomainPackage.MODEL_MAPPER__SPECIFIERS:
        getSpecifiers().clear();
        return;
      case DomainPackage.MODEL_MAPPER__QUERIES:
        getQueries().clear();
        return;
      case DomainPackage.MODEL_MAPPER__GENERATED_ARTIFACT_LOCATION:
        setGeneratedArtifactLocation(GENERATED_ARTIFACT_LOCATION_EDEFAULT);
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
      case DomainPackage.MODEL_MAPPER__PARENT:
        return getParent() != null;
      case DomainPackage.MODEL_MAPPER__SPECIFIERS:
        return specifiers != null && !specifiers.isEmpty();
      case DomainPackage.MODEL_MAPPER__QUERIES:
        return queries != null && !queries.isEmpty();
      case DomainPackage.MODEL_MAPPER__GENERATED_ARTIFACT_LOCATION:
        return GENERATED_ARTIFACT_LOCATION_EDEFAULT == null ? generatedArtifactLocation != null : !GENERATED_ARTIFACT_LOCATION_EDEFAULT.equals(generatedArtifactLocation);
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
    result.append(", generatedArtifactLocation: ");
    result.append(generatedArtifactLocation);
    result.append(')');
    return result.toString();
  }

} //ModelMapperImpl
