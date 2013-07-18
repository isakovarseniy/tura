/**
 */
package recipe.impl;

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

import recipe.ArtifactRef;
import recipe.ModelMapper;
import recipe.RecipePackage;
import recipe.Specifier;
import recipe.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Mapper</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link recipe.impl.ModelMapperImpl#getName <em>Name</em>}</li>
 *   <li>{@link recipe.impl.ModelMapperImpl#getArtifactRef <em>Artifact Ref</em>}</li>
 *   <li>{@link recipe.impl.ModelMapperImpl#getSpecifiers <em>Specifiers</em>}</li>
 *   <li>{@link recipe.impl.ModelMapperImpl#getVariables <em>Variables</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelMapperImpl extends EObjectImpl implements ModelMapper
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
   * The cached value of the '{@link #getArtifactRef() <em>Artifact Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArtifactRef()
   * @generated
   * @ordered
   */
  protected ArtifactRef artifactRef;

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
   * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariables()
   * @generated
   * @ordered
   */
  protected EList<Variable> variables;

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
    return RecipePackage.Literals.MODEL_MAPPER;
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
      eNotify(new ENotificationImpl(this, Notification.SET, RecipePackage.MODEL_MAPPER__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArtifactRef getArtifactRef()
  {
    return artifactRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArtifactRef(ArtifactRef newArtifactRef, NotificationChain msgs)
  {
    ArtifactRef oldArtifactRef = artifactRef;
    artifactRef = newArtifactRef;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RecipePackage.MODEL_MAPPER__ARTIFACT_REF, oldArtifactRef, newArtifactRef);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArtifactRef(ArtifactRef newArtifactRef)
  {
    if (newArtifactRef != artifactRef)
    {
      NotificationChain msgs = null;
      if (artifactRef != null)
        msgs = ((InternalEObject)artifactRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RecipePackage.MODEL_MAPPER__ARTIFACT_REF, null, msgs);
      if (newArtifactRef != null)
        msgs = ((InternalEObject)newArtifactRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RecipePackage.MODEL_MAPPER__ARTIFACT_REF, null, msgs);
      msgs = basicSetArtifactRef(newArtifactRef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RecipePackage.MODEL_MAPPER__ARTIFACT_REF, newArtifactRef, newArtifactRef));
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
      specifiers = new EObjectContainmentEList<Specifier>(Specifier.class, this, RecipePackage.MODEL_MAPPER__SPECIFIERS);
    }
    return specifiers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Variable> getVariables()
  {
    if (variables == null)
    {
      variables = new EObjectContainmentEList<Variable>(Variable.class, this, RecipePackage.MODEL_MAPPER__VARIABLES);
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
      case RecipePackage.MODEL_MAPPER__ARTIFACT_REF:
        return basicSetArtifactRef(null, msgs);
      case RecipePackage.MODEL_MAPPER__SPECIFIERS:
        return ((InternalEList<?>)getSpecifiers()).basicRemove(otherEnd, msgs);
      case RecipePackage.MODEL_MAPPER__VARIABLES:
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
      case RecipePackage.MODEL_MAPPER__NAME:
        return getName();
      case RecipePackage.MODEL_MAPPER__ARTIFACT_REF:
        return getArtifactRef();
      case RecipePackage.MODEL_MAPPER__SPECIFIERS:
        return getSpecifiers();
      case RecipePackage.MODEL_MAPPER__VARIABLES:
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
      case RecipePackage.MODEL_MAPPER__NAME:
        setName((String)newValue);
        return;
      case RecipePackage.MODEL_MAPPER__ARTIFACT_REF:
        setArtifactRef((ArtifactRef)newValue);
        return;
      case RecipePackage.MODEL_MAPPER__SPECIFIERS:
        getSpecifiers().clear();
        getSpecifiers().addAll((Collection<? extends Specifier>)newValue);
        return;
      case RecipePackage.MODEL_MAPPER__VARIABLES:
        getVariables().clear();
        getVariables().addAll((Collection<? extends Variable>)newValue);
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
      case RecipePackage.MODEL_MAPPER__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RecipePackage.MODEL_MAPPER__ARTIFACT_REF:
        setArtifactRef((ArtifactRef)null);
        return;
      case RecipePackage.MODEL_MAPPER__SPECIFIERS:
        getSpecifiers().clear();
        return;
      case RecipePackage.MODEL_MAPPER__VARIABLES:
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
      case RecipePackage.MODEL_MAPPER__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RecipePackage.MODEL_MAPPER__ARTIFACT_REF:
        return artifactRef != null;
      case RecipePackage.MODEL_MAPPER__SPECIFIERS:
        return specifiers != null && !specifiers.isEmpty();
      case RecipePackage.MODEL_MAPPER__VARIABLES:
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
