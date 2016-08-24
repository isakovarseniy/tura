/**
 */
package domain.impl;

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

import artifact.TechLeaf;
import domain.DomainArtifact;
import domain.DomainArtifacts;
import domain.DomainPackage;

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
 *   <li>{@link domain.impl.DomainArtifactsImpl#getDomainArtifact <em>Domain Artifact</em>}</li>
 *   <li>{@link domain.impl.DomainArtifactsImpl#getTechLeafs <em>Tech Leafs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DomainArtifactsImpl extends EObjectImpl implements DomainArtifacts {
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
	 * The cached value of the '{@link #getTechLeafs() <em>Tech Leafs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechLeafs()
	 * @generated
	 * @ordered
	 */
	protected EList<TechLeaf> techLeafs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainArtifactsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.DOMAIN_ARTIFACTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUid() {
		return uid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUid(String newUid) {
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
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
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
	public EList<DomainArtifact> getDomainArtifact() {
		if (domainArtifact == null) {
			domainArtifact = new EObjectContainmentEList<DomainArtifact>(DomainArtifact.class, this, DomainPackage.DOMAIN_ARTIFACTS__DOMAIN_ARTIFACT);
		}
		return domainArtifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TechLeaf> getTechLeafs() {
		if (techLeafs == null) {
			techLeafs = new EObjectContainmentEList<TechLeaf>(TechLeaf.class, this, DomainPackage.DOMAIN_ARTIFACTS__TECH_LEAFS);
		}
		return techLeafs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomainPackage.DOMAIN_ARTIFACTS__DOMAIN_ARTIFACT:
				return ((InternalEList<?>)getDomainArtifact()).basicRemove(otherEnd, msgs);
			case DomainPackage.DOMAIN_ARTIFACTS__TECH_LEAFS:
				return ((InternalEList<?>)getTechLeafs()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DomainPackage.DOMAIN_ARTIFACTS__UID:
				return getUid();
			case DomainPackage.DOMAIN_ARTIFACTS__NAME:
				return getName();
			case DomainPackage.DOMAIN_ARTIFACTS__DOMAIN_ARTIFACT:
				return getDomainArtifact();
			case DomainPackage.DOMAIN_ARTIFACTS__TECH_LEAFS:
				return getTechLeafs();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DomainPackage.DOMAIN_ARTIFACTS__UID:
				setUid((String)newValue);
				return;
			case DomainPackage.DOMAIN_ARTIFACTS__NAME:
				setName((String)newValue);
				return;
			case DomainPackage.DOMAIN_ARTIFACTS__DOMAIN_ARTIFACT:
				getDomainArtifact().clear();
				getDomainArtifact().addAll((Collection<? extends DomainArtifact>)newValue);
				return;
			case DomainPackage.DOMAIN_ARTIFACTS__TECH_LEAFS:
				getTechLeafs().clear();
				getTechLeafs().addAll((Collection<? extends TechLeaf>)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case DomainPackage.DOMAIN_ARTIFACTS__UID:
				setUid(UID_EDEFAULT);
				return;
			case DomainPackage.DOMAIN_ARTIFACTS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DomainPackage.DOMAIN_ARTIFACTS__DOMAIN_ARTIFACT:
				getDomainArtifact().clear();
				return;
			case DomainPackage.DOMAIN_ARTIFACTS__TECH_LEAFS:
				getTechLeafs().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DomainPackage.DOMAIN_ARTIFACTS__UID:
				return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
			case DomainPackage.DOMAIN_ARTIFACTS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DomainPackage.DOMAIN_ARTIFACTS__DOMAIN_ARTIFACT:
				return domainArtifact != null && !domainArtifact.isEmpty();
			case DomainPackage.DOMAIN_ARTIFACTS__TECH_LEAFS:
				return techLeafs != null && !techLeafs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
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
