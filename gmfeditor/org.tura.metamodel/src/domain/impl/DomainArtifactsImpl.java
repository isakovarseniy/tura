/**
 */
package domain.impl;

import domain.Domain;
import domain.DomainArtifact;
import domain.DomainArtifacts;
import domain.DomainPackage;

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
 * An implementation of the model object '<em><b>Artifacts</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link domain.impl.DomainArtifactsImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.impl.DomainArtifactsImpl#getName <em>Name</em>}</li>
 *   <li>{@link domain.impl.DomainArtifactsImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link domain.impl.DomainArtifactsImpl#getDomainArtifact <em>Domain Artifact</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DomainArtifactsImpl extends HTMLLayerHolderImpl implements DomainArtifacts
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
	 * The cached value of the '{@link #getDomainArtifact() <em>Domain Artifact</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDomainArtifact()
	 * @generated
	 * @ordered
	 */
  protected EList<DomainArtifact> domainArtifact;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected DomainArtifactsImpl()
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
		return DomainPackage.Literals.DOMAIN_ARTIFACTS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN_ARTIFACTS__UID, oldUid, uid));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN_ARTIFACTS__NAME, oldName, name));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Domain getParent()
  {
		if (eContainerFeatureID() != DomainPackage.DOMAIN_ARTIFACTS__PARENT) return null;
		return (Domain)eInternalContainer();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetParent(Domain newParent, NotificationChain msgs)
  {
		msgs = eBasicSetContainer((InternalEObject)newParent, DomainPackage.DOMAIN_ARTIFACTS__PARENT, msgs);
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setParent(Domain newParent)
  {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != DomainPackage.DOMAIN_ARTIFACTS__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, DomainPackage.DOMAIN__DOMAIN_ARTIFACTS, Domain.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN_ARTIFACTS__PARENT, newParent, newParent));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<DomainArtifact> getDomainArtifact()
  {
		if (domainArtifact == null) {
			domainArtifact = new EObjectContainmentWithInverseEList<DomainArtifact>(DomainArtifact.class, this, DomainPackage.DOMAIN_ARTIFACTS__DOMAIN_ARTIFACT, DomainPackage.DOMAIN_ARTIFACT__PARENT);
		}
		return domainArtifact;
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
			case DomainPackage.DOMAIN_ARTIFACTS__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((Domain)otherEnd, msgs);
			case DomainPackage.DOMAIN_ARTIFACTS__DOMAIN_ARTIFACT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDomainArtifact()).basicAdd(otherEnd, msgs);
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
			case DomainPackage.DOMAIN_ARTIFACTS__PARENT:
				return basicSetParent(null, msgs);
			case DomainPackage.DOMAIN_ARTIFACTS__DOMAIN_ARTIFACT:
				return ((InternalEList<?>)getDomainArtifact()).basicRemove(otherEnd, msgs);
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
			case DomainPackage.DOMAIN_ARTIFACTS__PARENT:
				return eInternalContainer().eInverseRemove(this, DomainPackage.DOMAIN__DOMAIN_ARTIFACTS, Domain.class, msgs);
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
			case DomainPackage.DOMAIN_ARTIFACTS__UID:
				return getUid();
			case DomainPackage.DOMAIN_ARTIFACTS__NAME:
				return getName();
			case DomainPackage.DOMAIN_ARTIFACTS__PARENT:
				return getParent();
			case DomainPackage.DOMAIN_ARTIFACTS__DOMAIN_ARTIFACT:
				return getDomainArtifact();
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
			case DomainPackage.DOMAIN_ARTIFACTS__UID:
				setUid((String)newValue);
				return;
			case DomainPackage.DOMAIN_ARTIFACTS__NAME:
				setName((String)newValue);
				return;
			case DomainPackage.DOMAIN_ARTIFACTS__PARENT:
				setParent((Domain)newValue);
				return;
			case DomainPackage.DOMAIN_ARTIFACTS__DOMAIN_ARTIFACT:
				getDomainArtifact().clear();
				getDomainArtifact().addAll((Collection<? extends DomainArtifact>)newValue);
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
			case DomainPackage.DOMAIN_ARTIFACTS__UID:
				setUid(UID_EDEFAULT);
				return;
			case DomainPackage.DOMAIN_ARTIFACTS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DomainPackage.DOMAIN_ARTIFACTS__PARENT:
				setParent((Domain)null);
				return;
			case DomainPackage.DOMAIN_ARTIFACTS__DOMAIN_ARTIFACT:
				getDomainArtifact().clear();
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
			case DomainPackage.DOMAIN_ARTIFACTS__UID:
				return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
			case DomainPackage.DOMAIN_ARTIFACTS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DomainPackage.DOMAIN_ARTIFACTS__PARENT:
				return getParent() != null;
			case DomainPackage.DOMAIN_ARTIFACTS__DOMAIN_ARTIFACT:
				return domainArtifact != null && !domainArtifact.isEmpty();
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

} //DomainArtifactsImpl
