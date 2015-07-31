/**
 */
package domain.impl;

import domain.Domain;
import domain.DomainPackage;
import domain.DomainTypes;
import domain.TypesRepository;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Types</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link domain.impl.DomainTypesImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.impl.DomainTypesImpl#getName <em>Name</em>}</li>
 *   <li>{@link domain.impl.DomainTypesImpl#getTypesrepository <em>Typesrepository</em>}</li>
 *   <li>{@link domain.impl.DomainTypesImpl#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DomainTypesImpl extends EObjectImpl implements DomainTypes
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
	 * The cached value of the '{@link #getTypesrepository() <em>Typesrepository</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTypesrepository()
	 * @generated
	 * @ordered
	 */
  protected TypesRepository typesrepository;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected DomainTypesImpl()
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
		return DomainPackage.Literals.DOMAIN_TYPES;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN_TYPES__UID, oldUid, uid));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN_TYPES__NAME, oldName, name));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TypesRepository getTypesrepository()
  {
		if (typesrepository != null && typesrepository.eIsProxy()) {
			InternalEObject oldTypesrepository = (InternalEObject)typesrepository;
			typesrepository = (TypesRepository)eResolveProxy(oldTypesrepository);
			if (typesrepository != oldTypesrepository) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.DOMAIN_TYPES__TYPESREPOSITORY, oldTypesrepository, typesrepository));
			}
		}
		return typesrepository;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TypesRepository basicGetTypesrepository()
  {
		return typesrepository;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetTypesrepository(TypesRepository newTypesrepository, NotificationChain msgs)
  {
		TypesRepository oldTypesrepository = typesrepository;
		typesrepository = newTypesrepository;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN_TYPES__TYPESREPOSITORY, oldTypesrepository, newTypesrepository);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setTypesrepository(TypesRepository newTypesrepository)
  {
		if (newTypesrepository != typesrepository) {
			NotificationChain msgs = null;
			if (typesrepository != null)
				msgs = ((InternalEObject)typesrepository).eInverseRemove(this, DomainPackage.TYPES_REPOSITORY__PARENT, TypesRepository.class, msgs);
			if (newTypesrepository != null)
				msgs = ((InternalEObject)newTypesrepository).eInverseAdd(this, DomainPackage.TYPES_REPOSITORY__PARENT, TypesRepository.class, msgs);
			msgs = basicSetTypesrepository(newTypesrepository, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN_TYPES__TYPESREPOSITORY, newTypesrepository, newTypesrepository));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Domain getParent()
  {
		if (eContainerFeatureID() != DomainPackage.DOMAIN_TYPES__PARENT) return null;
		return (Domain)eInternalContainer();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetParent(Domain newParent, NotificationChain msgs)
  {
		msgs = eBasicSetContainer((InternalEObject)newParent, DomainPackage.DOMAIN_TYPES__PARENT, msgs);
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setParent(Domain newParent)
  {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != DomainPackage.DOMAIN_TYPES__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, DomainPackage.DOMAIN__DOMAIN_TYPES, Domain.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN_TYPES__PARENT, newParent, newParent));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case DomainPackage.DOMAIN_TYPES__TYPESREPOSITORY:
				if (typesrepository != null)
					msgs = ((InternalEObject)typesrepository).eInverseRemove(this, DomainPackage.TYPES_REPOSITORY__PARENT, TypesRepository.class, msgs);
				return basicSetTypesrepository((TypesRepository)otherEnd, msgs);
			case DomainPackage.DOMAIN_TYPES__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((Domain)otherEnd, msgs);
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
			case DomainPackage.DOMAIN_TYPES__TYPESREPOSITORY:
				return basicSetTypesrepository(null, msgs);
			case DomainPackage.DOMAIN_TYPES__PARENT:
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
  public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
  {
		switch (eContainerFeatureID()) {
			case DomainPackage.DOMAIN_TYPES__PARENT:
				return eInternalContainer().eInverseRemove(this, DomainPackage.DOMAIN__DOMAIN_TYPES, Domain.class, msgs);
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
			case DomainPackage.DOMAIN_TYPES__UID:
				return getUid();
			case DomainPackage.DOMAIN_TYPES__NAME:
				return getName();
			case DomainPackage.DOMAIN_TYPES__TYPESREPOSITORY:
				if (resolve) return getTypesrepository();
				return basicGetTypesrepository();
			case DomainPackage.DOMAIN_TYPES__PARENT:
				return getParent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case DomainPackage.DOMAIN_TYPES__UID:
				setUid((String)newValue);
				return;
			case DomainPackage.DOMAIN_TYPES__NAME:
				setName((String)newValue);
				return;
			case DomainPackage.DOMAIN_TYPES__TYPESREPOSITORY:
				setTypesrepository((TypesRepository)newValue);
				return;
			case DomainPackage.DOMAIN_TYPES__PARENT:
				setParent((Domain)newValue);
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
			case DomainPackage.DOMAIN_TYPES__UID:
				setUid(UID_EDEFAULT);
				return;
			case DomainPackage.DOMAIN_TYPES__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DomainPackage.DOMAIN_TYPES__TYPESREPOSITORY:
				setTypesrepository((TypesRepository)null);
				return;
			case DomainPackage.DOMAIN_TYPES__PARENT:
				setParent((Domain)null);
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
			case DomainPackage.DOMAIN_TYPES__UID:
				return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
			case DomainPackage.DOMAIN_TYPES__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DomainPackage.DOMAIN_TYPES__TYPESREPOSITORY:
				return typesrepository != null;
			case DomainPackage.DOMAIN_TYPES__PARENT:
				return getParent() != null;
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
		result.append(')');
		return result.toString();
	}

} //DomainTypesImpl
