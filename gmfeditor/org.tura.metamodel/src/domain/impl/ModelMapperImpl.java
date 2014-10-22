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
 *   <li>{@link domain.impl.ModelMapperImpl#getArtifactRoot <em>Artifact Root</em>}</li>
 *   <li>{@link domain.impl.ModelMapperImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link domain.impl.ModelMapperImpl#getSpecifiers <em>Specifiers</em>}</li>
 *   <li>{@link domain.impl.ModelMapperImpl#getQueries <em>Queries</em>}</li>
 *   <li>{@link domain.impl.ModelMapperImpl#getArtifactExecutionString <em>Artifact Execution String</em>}</li>
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
   * The default value of the '{@link #getArtifactRoot() <em>Artifact Root</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArtifactRoot()
   * @generated
   * @ordered
   */
  protected static final String ARTIFACT_ROOT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getArtifactRoot() <em>Artifact Root</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArtifactRoot()
   * @generated
   * @ordered
   */
  protected String artifactRoot = ARTIFACT_ROOT_EDEFAULT;

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
   * The default value of the '{@link #getArtifactExecutionString() <em>Artifact Execution String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArtifactExecutionString()
   * @generated
   * @ordered
   */
  protected static final String ARTIFACT_EXECUTION_STRING_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getArtifactExecutionString() <em>Artifact Execution String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArtifactExecutionString()
   * @generated
   * @ordered
   */
  protected String artifactExecutionString = ARTIFACT_EXECUTION_STRING_EDEFAULT;

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
  public String getArtifactRoot()
  {
    return artifactRoot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArtifactRoot(String newArtifactRoot)
  {
    String oldArtifactRoot = artifactRoot;
    artifactRoot = newArtifactRoot;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.MODEL_MAPPER__ARTIFACT_ROOT, oldArtifactRoot, artifactRoot));
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
  public String getArtifactExecutionString()
  {
    return artifactExecutionString;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArtifactExecutionString(String newArtifactExecutionString)
  {
    String oldArtifactExecutionString = artifactExecutionString;
    artifactExecutionString = newArtifactExecutionString;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.MODEL_MAPPER__ARTIFACT_EXECUTION_STRING, oldArtifactExecutionString, artifactExecutionString));
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
      case DomainPackage.MODEL_MAPPER__ARTIFACT_ROOT:
        return getArtifactRoot();
      case DomainPackage.MODEL_MAPPER__PARENT:
        return getParent();
      case DomainPackage.MODEL_MAPPER__SPECIFIERS:
        return getSpecifiers();
      case DomainPackage.MODEL_MAPPER__QUERIES:
        return getQueries();
      case DomainPackage.MODEL_MAPPER__ARTIFACT_EXECUTION_STRING:
        return getArtifactExecutionString();
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
      case DomainPackage.MODEL_MAPPER__ARTIFACT_ROOT:
        setArtifactRoot((String)newValue);
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
      case DomainPackage.MODEL_MAPPER__ARTIFACT_EXECUTION_STRING:
        setArtifactExecutionString((String)newValue);
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
      case DomainPackage.MODEL_MAPPER__ARTIFACT_ROOT:
        setArtifactRoot(ARTIFACT_ROOT_EDEFAULT);
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
      case DomainPackage.MODEL_MAPPER__ARTIFACT_EXECUTION_STRING:
        setArtifactExecutionString(ARTIFACT_EXECUTION_STRING_EDEFAULT);
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
      case DomainPackage.MODEL_MAPPER__ARTIFACT_ROOT:
        return ARTIFACT_ROOT_EDEFAULT == null ? artifactRoot != null : !ARTIFACT_ROOT_EDEFAULT.equals(artifactRoot);
      case DomainPackage.MODEL_MAPPER__PARENT:
        return getParent() != null;
      case DomainPackage.MODEL_MAPPER__SPECIFIERS:
        return specifiers != null && !specifiers.isEmpty();
      case DomainPackage.MODEL_MAPPER__QUERIES:
        return queries != null && !queries.isEmpty();
      case DomainPackage.MODEL_MAPPER__ARTIFACT_EXECUTION_STRING:
        return ARTIFACT_EXECUTION_STRING_EDEFAULT == null ? artifactExecutionString != null : !ARTIFACT_EXECUTION_STRING_EDEFAULT.equals(artifactExecutionString);
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
    result.append(", artifactRoot: ");
    result.append(artifactRoot);
    result.append(", artifactExecutionString: ");
    result.append(artifactExecutionString);
    result.append(')');
    return result.toString();
  }

} //ModelMapperImpl
