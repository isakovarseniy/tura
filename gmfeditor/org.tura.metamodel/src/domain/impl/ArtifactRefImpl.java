/**
 */
package domain.impl;

import domain.Artifact;
import domain.ArtifactRef;
import domain.DomainArtifact;
import domain.DomainPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Artifact Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link domain.impl.ArtifactRefImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.impl.ArtifactRefImpl#getDomainArtifactRef <em>Domain Artifact Ref</em>}</li>
 *   <li>{@link domain.impl.ArtifactRefImpl#getArtifactRef <em>Artifact Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArtifactRefImpl extends EObjectImpl implements ArtifactRef {
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
	 * The cached value of the '{@link #getDomainArtifactRef() <em>Domain Artifact Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainArtifactRef()
	 * @generated
	 * @ordered
	 */
	protected DomainArtifact domainArtifactRef;

	/**
	 * The cached value of the '{@link #getArtifactRef() <em>Artifact Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifactRef()
	 * @generated
	 * @ordered
	 */
	protected Artifact artifactRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArtifactRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.ARTIFACT_REF;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.ARTIFACT_REF__UID, oldUid, uid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainArtifact getDomainArtifactRef() {
		if (domainArtifactRef != null && domainArtifactRef.eIsProxy()) {
			InternalEObject oldDomainArtifactRef = (InternalEObject)domainArtifactRef;
			domainArtifactRef = (DomainArtifact)eResolveProxy(oldDomainArtifactRef);
			if (domainArtifactRef != oldDomainArtifactRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.ARTIFACT_REF__DOMAIN_ARTIFACT_REF, oldDomainArtifactRef, domainArtifactRef));
			}
		}
		return domainArtifactRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainArtifact basicGetDomainArtifactRef() {
		return domainArtifactRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainArtifactRef(DomainArtifact newDomainArtifactRef) {
		DomainArtifact oldDomainArtifactRef = domainArtifactRef;
		domainArtifactRef = newDomainArtifactRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.ARTIFACT_REF__DOMAIN_ARTIFACT_REF, oldDomainArtifactRef, domainArtifactRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Artifact getArtifactRef() {
		if (artifactRef != null && artifactRef.eIsProxy()) {
			InternalEObject oldArtifactRef = (InternalEObject)artifactRef;
			artifactRef = (Artifact)eResolveProxy(oldArtifactRef);
			if (artifactRef != oldArtifactRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.ARTIFACT_REF__ARTIFACT_REF, oldArtifactRef, artifactRef));
			}
		}
		return artifactRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Artifact basicGetArtifactRef() {
		return artifactRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArtifactRef(Artifact newArtifactRef) {
		Artifact oldArtifactRef = artifactRef;
		artifactRef = newArtifactRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.ARTIFACT_REF__ARTIFACT_REF, oldArtifactRef, artifactRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DomainPackage.ARTIFACT_REF__UID:
				return getUid();
			case DomainPackage.ARTIFACT_REF__DOMAIN_ARTIFACT_REF:
				if (resolve) return getDomainArtifactRef();
				return basicGetDomainArtifactRef();
			case DomainPackage.ARTIFACT_REF__ARTIFACT_REF:
				if (resolve) return getArtifactRef();
				return basicGetArtifactRef();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DomainPackage.ARTIFACT_REF__UID:
				setUid((String)newValue);
				return;
			case DomainPackage.ARTIFACT_REF__DOMAIN_ARTIFACT_REF:
				setDomainArtifactRef((DomainArtifact)newValue);
				return;
			case DomainPackage.ARTIFACT_REF__ARTIFACT_REF:
				setArtifactRef((Artifact)newValue);
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
			case DomainPackage.ARTIFACT_REF__UID:
				setUid(UID_EDEFAULT);
				return;
			case DomainPackage.ARTIFACT_REF__DOMAIN_ARTIFACT_REF:
				setDomainArtifactRef((DomainArtifact)null);
				return;
			case DomainPackage.ARTIFACT_REF__ARTIFACT_REF:
				setArtifactRef((Artifact)null);
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
			case DomainPackage.ARTIFACT_REF__UID:
				return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
			case DomainPackage.ARTIFACT_REF__DOMAIN_ARTIFACT_REF:
				return domainArtifactRef != null;
			case DomainPackage.ARTIFACT_REF__ARTIFACT_REF:
				return artifactRef != null;
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
		result.append(')');
		return result.toString();
	}

} //ArtifactRefImpl
