/**
 */
package domain.impl;

import domain.DomainPackage;
import domain.Types;
import domain.TypesRepository;

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
 * An implementation of the model object '<em><b>Types</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link domain.impl.TypesImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.impl.TypesImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link domain.impl.TypesImpl#getName <em>Name</em>}</li>
 *   <li>{@link domain.impl.TypesImpl#getPackages <em>Packages</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypesImpl extends HTMLLayerHolderImpl implements Types
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
	 * The cached value of the '{@link #getPackages() <em>Packages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getPackages()
	 * @generated
	 * @ordered
	 */
  protected EList<domain.Package> packages;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected TypesImpl()
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
		return DomainPackage.Literals.TYPES;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.TYPES__UID, oldUid, uid));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TypesRepository getParent()
  {
		if (eContainerFeatureID() != DomainPackage.TYPES__PARENT) return null;
		return (TypesRepository)eInternalContainer();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetParent(TypesRepository newParent, NotificationChain msgs)
  {
		msgs = eBasicSetContainer((InternalEObject)newParent, DomainPackage.TYPES__PARENT, msgs);
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setParent(TypesRepository newParent)
  {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != DomainPackage.TYPES__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, DomainPackage.TYPES_REPOSITORY__TYPE_DEFINITION, TypesRepository.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.TYPES__PARENT, newParent, newParent));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.TYPES__NAME, oldName, name));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<domain.Package> getPackages()
  {
		if (packages == null) {
			packages = new EObjectContainmentWithInverseEList<domain.Package>(domain.Package.class, this, DomainPackage.TYPES__PACKAGES, DomainPackage.PACKAGE__PARENT);
		}
		return packages;
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
			case DomainPackage.TYPES__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((TypesRepository)otherEnd, msgs);
			case DomainPackage.TYPES__PACKAGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPackages()).basicAdd(otherEnd, msgs);
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
			case DomainPackage.TYPES__PARENT:
				return basicSetParent(null, msgs);
			case DomainPackage.TYPES__PACKAGES:
				return ((InternalEList<?>)getPackages()).basicRemove(otherEnd, msgs);
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
			case DomainPackage.TYPES__PARENT:
				return eInternalContainer().eInverseRemove(this, DomainPackage.TYPES_REPOSITORY__TYPE_DEFINITION, TypesRepository.class, msgs);
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
			case DomainPackage.TYPES__UID:
				return getUid();
			case DomainPackage.TYPES__PARENT:
				return getParent();
			case DomainPackage.TYPES__NAME:
				return getName();
			case DomainPackage.TYPES__PACKAGES:
				return getPackages();
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
			case DomainPackage.TYPES__UID:
				setUid((String)newValue);
				return;
			case DomainPackage.TYPES__PARENT:
				setParent((TypesRepository)newValue);
				return;
			case DomainPackage.TYPES__NAME:
				setName((String)newValue);
				return;
			case DomainPackage.TYPES__PACKAGES:
				getPackages().clear();
				getPackages().addAll((Collection<? extends domain.Package>)newValue);
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
			case DomainPackage.TYPES__UID:
				setUid(UID_EDEFAULT);
				return;
			case DomainPackage.TYPES__PARENT:
				setParent((TypesRepository)null);
				return;
			case DomainPackage.TYPES__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DomainPackage.TYPES__PACKAGES:
				getPackages().clear();
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
			case DomainPackage.TYPES__UID:
				return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
			case DomainPackage.TYPES__PARENT:
				return getParent() != null;
			case DomainPackage.TYPES__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DomainPackage.TYPES__PACKAGES:
				return packages != null && !packages.isEmpty();
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

} //TypesImpl
