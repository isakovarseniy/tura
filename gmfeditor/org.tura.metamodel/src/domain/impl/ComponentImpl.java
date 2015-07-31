/**
 */
package domain.impl;

import domain.Component;
import domain.DomainPackage;
import domain.Ingredient;
import domain.ModelMapper;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link domain.impl.ComponentImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.impl.ComponentImpl#getName <em>Name</em>}</li>
 *   <li>{@link domain.impl.ComponentImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link domain.impl.ComponentImpl#getMappers <em>Mappers</em>}</li>
 *   <li>{@link domain.impl.ComponentImpl#getComponentRoot <em>Component Root</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentImpl extends HTMLLayerHolderImpl implements Component
{
  /**
	 * The default value of the '{@link #getUid() <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getUid()
	 * @generated
	 * @ordered
	 */
  protected static final String UID_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getUid() <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getUid()
	 * @generated
	 * @ordered
	 */
  protected String uid = UID_EDEFAULT;

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
	 * The cached value of the '{@link #getMappers() <em>Mappers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getMappers()
	 * @generated
	 * @ordered
	 */
  protected EList<ModelMapper> mappers;

  /**
	 * The default value of the '{@link #getComponentRoot() <em>Component Root</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getComponentRoot()
	 * @generated
	 * @ordered
	 */
  protected static final String COMPONENT_ROOT_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getComponentRoot() <em>Component Root</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getComponentRoot()
	 * @generated
	 * @ordered
	 */
  protected String componentRoot = COMPONENT_ROOT_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ComponentImpl()
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
		return DomainPackage.Literals.COMPONENT;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getUid()
  {
		return uid;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setUid(String newUid)
  {
		String oldUid = uid;
		uid = newUid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.COMPONENT__UID, oldUid, uid));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.COMPONENT__NAME, oldName, name));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Ingredient getParent()
  {
		if (eContainerFeatureID() != DomainPackage.COMPONENT__PARENT) return null;
		return (Ingredient)eInternalContainer();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetParent(Ingredient newParent, NotificationChain msgs)
  {
		msgs = eBasicSetContainer((InternalEObject)newParent, DomainPackage.COMPONENT__PARENT, msgs);
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setParent(Ingredient newParent)
  {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != DomainPackage.COMPONENT__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, DomainPackage.INGREDIENT__COMPONENTS, Ingredient.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.COMPONENT__PARENT, newParent, newParent));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<ModelMapper> getMappers()
  {
		if (mappers == null) {
			mappers = new EObjectContainmentWithInverseEList<ModelMapper>(ModelMapper.class, this, DomainPackage.COMPONENT__MAPPERS, DomainPackage.MODEL_MAPPER__PARENT);
		}
		return mappers;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getComponentRoot()
  {
		return componentRoot;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setComponentRoot(String newComponentRoot)
  {
		String oldComponentRoot = componentRoot;
		componentRoot = newComponentRoot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.COMPONENT__COMPONENT_ROOT, oldComponentRoot, componentRoot));
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
		switch (featureID) {
			case DomainPackage.COMPONENT__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((Ingredient)otherEnd, msgs);
			case DomainPackage.COMPONENT__MAPPERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMappers()).basicAdd(otherEnd, msgs);
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
		switch (featureID) {
			case DomainPackage.COMPONENT__PARENT:
				return basicSetParent(null, msgs);
			case DomainPackage.COMPONENT__MAPPERS:
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
  public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
  {
		switch (eContainerFeatureID()) {
			case DomainPackage.COMPONENT__PARENT:
				return eInternalContainer().eInverseRemove(this, DomainPackage.INGREDIENT__COMPONENTS, Ingredient.class, msgs);
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
		switch (featureID) {
			case DomainPackage.COMPONENT__UID:
				return getUid();
			case DomainPackage.COMPONENT__NAME:
				return getName();
			case DomainPackage.COMPONENT__PARENT:
				return getParent();
			case DomainPackage.COMPONENT__MAPPERS:
				return getMappers();
			case DomainPackage.COMPONENT__COMPONENT_ROOT:
				return getComponentRoot();
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
		switch (featureID) {
			case DomainPackage.COMPONENT__UID:
				setUid((String)newValue);
				return;
			case DomainPackage.COMPONENT__NAME:
				setName((String)newValue);
				return;
			case DomainPackage.COMPONENT__PARENT:
				setParent((Ingredient)newValue);
				return;
			case DomainPackage.COMPONENT__MAPPERS:
				getMappers().clear();
				getMappers().addAll((Collection<? extends ModelMapper>)newValue);
				return;
			case DomainPackage.COMPONENT__COMPONENT_ROOT:
				setComponentRoot((String)newValue);
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
		switch (featureID) {
			case DomainPackage.COMPONENT__UID:
				setUid(UID_EDEFAULT);
				return;
			case DomainPackage.COMPONENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DomainPackage.COMPONENT__PARENT:
				setParent((Ingredient)null);
				return;
			case DomainPackage.COMPONENT__MAPPERS:
				getMappers().clear();
				return;
			case DomainPackage.COMPONENT__COMPONENT_ROOT:
				setComponentRoot(COMPONENT_ROOT_EDEFAULT);
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
		switch (featureID) {
			case DomainPackage.COMPONENT__UID:
				return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
			case DomainPackage.COMPONENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DomainPackage.COMPONENT__PARENT:
				return getParent() != null;
			case DomainPackage.COMPONENT__MAPPERS:
				return mappers != null && !mappers.isEmpty();
			case DomainPackage.COMPONENT__COMPONENT_ROOT:
				return COMPONENT_ROOT_EDEFAULT == null ? componentRoot != null : !COMPONENT_ROOT_EDEFAULT.equals(componentRoot);
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
		result.append(" (uid: ");
		result.append(uid);
		result.append(", name: ");
		result.append(name);
		result.append(", componentRoot: ");
		result.append(componentRoot);
		result.append(')');
		return result.toString();
	}

} //ComponentImpl
