/**
 */
package domain.impl;

import domain.DomainPackage;
import domain.Enumarator;
import domain.TypeDefinition;
import domain.TypeElement;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link domain.impl.TypeDefinitionImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link domain.impl.TypeDefinitionImpl#getEnums <em>Enums</em>}</li>
 *   <li>{@link domain.impl.TypeDefinitionImpl#getParent <em>Parent</em>}</li>
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
   * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParent()
   * @generated
   * @ordered
   */
  protected domain.Package parent;

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
    return DomainPackage.Literals.TYPE_DEFINITION;
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
      types = new EObjectContainmentWithInverseEList<TypeElement>(TypeElement.class, this, DomainPackage.TYPE_DEFINITION__TYPES, DomainPackage.TYPE_ELEMENT__PARENT);
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
      enums = new EObjectContainmentWithInverseEList<Enumarator>(Enumarator.class, this, DomainPackage.TYPE_DEFINITION__ENUMS, DomainPackage.ENUMARATOR__PARENT);
    }
    return enums;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public domain.Package getParent()
  {
    if (parent != null && parent.eIsProxy())
    {
      InternalEObject oldParent = (InternalEObject)parent;
      parent = (domain.Package)eResolveProxy(oldParent);
      if (parent != oldParent)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.TYPE_DEFINITION__PARENT, oldParent, parent));
      }
    }
    return parent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public domain.Package basicGetParent()
  {
    return parent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParent(domain.Package newParent, NotificationChain msgs)
  {
    domain.Package oldParent = parent;
    parent = newParent;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.TYPE_DEFINITION__PARENT, oldParent, newParent);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParent(domain.Package newParent)
  {
    if (newParent != parent)
    {
      NotificationChain msgs = null;
      if (parent != null)
        msgs = ((InternalEObject)parent).eInverseRemove(this, DomainPackage.PACKAGE__TYPEDEFINITION, domain.Package.class, msgs);
      if (newParent != null)
        msgs = ((InternalEObject)newParent).eInverseAdd(this, DomainPackage.PACKAGE__TYPEDEFINITION, domain.Package.class, msgs);
      msgs = basicSetParent(newParent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.TYPE_DEFINITION__PARENT, newParent, newParent));
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
      case DomainPackage.TYPE_DEFINITION__TYPES:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getTypes()).basicAdd(otherEnd, msgs);
      case DomainPackage.TYPE_DEFINITION__ENUMS:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getEnums()).basicAdd(otherEnd, msgs);
      case DomainPackage.TYPE_DEFINITION__PARENT:
        if (parent != null)
          msgs = ((InternalEObject)parent).eInverseRemove(this, DomainPackage.PACKAGE__TYPEDEFINITION, domain.Package.class, msgs);
        return basicSetParent((domain.Package)otherEnd, msgs);
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
      case DomainPackage.TYPE_DEFINITION__TYPES:
        return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
      case DomainPackage.TYPE_DEFINITION__ENUMS:
        return ((InternalEList<?>)getEnums()).basicRemove(otherEnd, msgs);
      case DomainPackage.TYPE_DEFINITION__PARENT:
        return basicSetParent(null, msgs);
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
      case DomainPackage.TYPE_DEFINITION__TYPES:
        return getTypes();
      case DomainPackage.TYPE_DEFINITION__ENUMS:
        return getEnums();
      case DomainPackage.TYPE_DEFINITION__PARENT:
        if (resolve) return getParent();
        return basicGetParent();
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
      case DomainPackage.TYPE_DEFINITION__TYPES:
        getTypes().clear();
        getTypes().addAll((Collection<? extends TypeElement>)newValue);
        return;
      case DomainPackage.TYPE_DEFINITION__ENUMS:
        getEnums().clear();
        getEnums().addAll((Collection<? extends Enumarator>)newValue);
        return;
      case DomainPackage.TYPE_DEFINITION__PARENT:
        setParent((domain.Package)newValue);
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
      case DomainPackage.TYPE_DEFINITION__TYPES:
        getTypes().clear();
        return;
      case DomainPackage.TYPE_DEFINITION__ENUMS:
        getEnums().clear();
        return;
      case DomainPackage.TYPE_DEFINITION__PARENT:
        setParent((domain.Package)null);
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
      case DomainPackage.TYPE_DEFINITION__TYPES:
        return types != null && !types.isEmpty();
      case DomainPackage.TYPE_DEFINITION__ENUMS:
        return enums != null && !enums.isEmpty();
      case DomainPackage.TYPE_DEFINITION__PARENT:
        return parent != null;
    }
    return super.eIsSet(featureID);
  }

} //TypeDefinitionImpl
