/**
 */
package domain.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import domain.Attribute;
import domain.Categorized;
import domain.Classifier;
import domain.DomainPackage;
import domain.Operation;
import domain.Type;
import domain.TypeExtension;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link domain.impl.TypeImpl#getClassifiers <em>Classifiers</em>}</li>
 *   <li>{@link domain.impl.TypeImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link domain.impl.TypeImpl#getOperations <em>Operations</em>}</li>
 *   <li>{@link domain.impl.TypeImpl#getExtension <em>Extension</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeImpl extends TypeElementImpl implements Type
{
  /**
   * The cached value of the '{@link #getClassifiers() <em>Classifiers</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassifiers()
   * @generated
   * @ordered
   */
  protected EList<Classifier> classifiers;

  /**
   * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributes()
   * @generated
   * @ordered
   */
  protected EList<Attribute> attributes;

  /**
   * The cached value of the '{@link #getOperations() <em>Operations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperations()
   * @generated
   * @ordered
   */
  protected EList<Operation> operations;

  /**
   * The cached value of the '{@link #getExtension() <em>Extension</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtension()
   * @generated
   * @ordered
   */
  protected EList<TypeExtension> extension;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypeImpl()
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
    return DomainPackage.Literals.TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Classifier> getClassifiers()
  {
    if (classifiers == null)
    {
      classifiers = new EObjectContainmentEList<Classifier>(Classifier.class, this, DomainPackage.TYPE__CLASSIFIERS);
    }
    return classifiers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Attribute> getAttributes()
  {
    if (attributes == null)
    {
      attributes = new EObjectContainmentWithInverseEList<Attribute>(Attribute.class, this, DomainPackage.TYPE__ATTRIBUTES, DomainPackage.ATTRIBUTE__PARENT);
    }
    return attributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Operation> getOperations()
  {
    if (operations == null)
    {
      operations = new EObjectContainmentWithInverseEList<Operation>(Operation.class, this, DomainPackage.TYPE__OPERATIONS, DomainPackage.OPERATION__PARENT);
    }
    return operations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TypeExtension> getExtension()
  {
    if (extension == null)
    {
      extension = new EObjectContainmentEList<TypeExtension>(TypeExtension.class, this, DomainPackage.TYPE__EXTENSION);
    }
    return extension;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DomainPackage.TYPE__ATTRIBUTES:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getAttributes()).basicAdd(otherEnd, msgs);
      case DomainPackage.TYPE__OPERATIONS:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getOperations()).basicAdd(otherEnd, msgs);
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
      case DomainPackage.TYPE__CLASSIFIERS:
        return ((InternalEList<?>)getClassifiers()).basicRemove(otherEnd, msgs);
      case DomainPackage.TYPE__ATTRIBUTES:
        return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
      case DomainPackage.TYPE__OPERATIONS:
        return ((InternalEList<?>)getOperations()).basicRemove(otherEnd, msgs);
      case DomainPackage.TYPE__EXTENSION:
        return ((InternalEList<?>)getExtension()).basicRemove(otherEnd, msgs);
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
      case DomainPackage.TYPE__CLASSIFIERS:
        return getClassifiers();
      case DomainPackage.TYPE__ATTRIBUTES:
        return getAttributes();
      case DomainPackage.TYPE__OPERATIONS:
        return getOperations();
      case DomainPackage.TYPE__EXTENSION:
        return getExtension();
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
      case DomainPackage.TYPE__CLASSIFIERS:
        getClassifiers().clear();
        getClassifiers().addAll((Collection<? extends Classifier>)newValue);
        return;
      case DomainPackage.TYPE__ATTRIBUTES:
        getAttributes().clear();
        getAttributes().addAll((Collection<? extends Attribute>)newValue);
        return;
      case DomainPackage.TYPE__OPERATIONS:
        getOperations().clear();
        getOperations().addAll((Collection<? extends Operation>)newValue);
        return;
      case DomainPackage.TYPE__EXTENSION:
        getExtension().clear();
        getExtension().addAll((Collection<? extends TypeExtension>)newValue);
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
      case DomainPackage.TYPE__CLASSIFIERS:
        getClassifiers().clear();
        return;
      case DomainPackage.TYPE__ATTRIBUTES:
        getAttributes().clear();
        return;
      case DomainPackage.TYPE__OPERATIONS:
        getOperations().clear();
        return;
      case DomainPackage.TYPE__EXTENSION:
        getExtension().clear();
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
      case DomainPackage.TYPE__CLASSIFIERS:
        return classifiers != null && !classifiers.isEmpty();
      case DomainPackage.TYPE__ATTRIBUTES:
        return attributes != null && !attributes.isEmpty();
      case DomainPackage.TYPE__OPERATIONS:
        return operations != null && !operations.isEmpty();
      case DomainPackage.TYPE__EXTENSION:
        return extension != null && !extension.isEmpty();
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
    if (baseClass == Categorized.class)
    {
      switch (derivedFeatureID)
      {
        case DomainPackage.TYPE__CLASSIFIERS: return DomainPackage.CATEGORIZED__CLASSIFIERS;
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
    if (baseClass == Categorized.class)
    {
      switch (baseFeatureID)
      {
        case DomainPackage.CATEGORIZED__CLASSIFIERS: return DomainPackage.TYPE__CLASSIFIERS;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

} //TypeImpl
