/**
 */
package domain.impl;

import domain.Domain;
import domain.DomainApplications;
import domain.DomainArtifacts;
import domain.DomainPackage;
import domain.DomainTypes;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link domain.impl.DomainImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.impl.DomainImpl#getDomainArtifacts <em>Domain Artifacts</em>}</li>
 *   <li>{@link domain.impl.DomainImpl#getDomainTypes <em>Domain Types</em>}</li>
 *   <li>{@link domain.impl.DomainImpl#getDomainApplications <em>Domain Applications</em>}</li>
 *   <li>{@link domain.impl.DomainImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DomainImpl extends EObjectImpl implements Domain {
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
	 * The cached value of the '{@link #getDomainArtifacts() <em>Domain Artifacts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainArtifacts()
	 * @generated
	 * @ordered
	 */
	protected DomainArtifacts domainArtifacts;

	/**
	 * The cached value of the '{@link #getDomainTypes() <em>Domain Types</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainTypes()
	 * @generated
	 * @ordered
	 */
	protected DomainTypes domainTypes;

	/**
	 * The cached value of the '{@link #getDomainApplications() <em>Domain Applications</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainApplications()
	 * @generated
	 * @ordered
	 */
	protected DomainApplications domainApplications;

	/**
	 * The cached value of the '{@link #getAny() <em>Any</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAny()
	 * @generated
	 * @ordered
	 */
	protected EObject any;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.DOMAIN;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__UID, oldUid, uid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainArtifacts getDomainArtifacts() {
		return domainArtifacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomainArtifacts(DomainArtifacts newDomainArtifacts, NotificationChain msgs) {
		DomainArtifacts oldDomainArtifacts = domainArtifacts;
		domainArtifacts = newDomainArtifacts;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__DOMAIN_ARTIFACTS, oldDomainArtifacts, newDomainArtifacts);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainArtifacts(DomainArtifacts newDomainArtifacts) {
		if (newDomainArtifacts != domainArtifacts) {
			NotificationChain msgs = null;
			if (domainArtifacts != null)
				msgs = ((InternalEObject)domainArtifacts).eInverseRemove(this, DomainPackage.DOMAIN_ARTIFACTS__PARENT, DomainArtifacts.class, msgs);
			if (newDomainArtifacts != null)
				msgs = ((InternalEObject)newDomainArtifacts).eInverseAdd(this, DomainPackage.DOMAIN_ARTIFACTS__PARENT, DomainArtifacts.class, msgs);
			msgs = basicSetDomainArtifacts(newDomainArtifacts, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__DOMAIN_ARTIFACTS, newDomainArtifacts, newDomainArtifacts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainTypes getDomainTypes() {
		return domainTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomainTypes(DomainTypes newDomainTypes, NotificationChain msgs) {
		DomainTypes oldDomainTypes = domainTypes;
		domainTypes = newDomainTypes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__DOMAIN_TYPES, oldDomainTypes, newDomainTypes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainTypes(DomainTypes newDomainTypes) {
		if (newDomainTypes != domainTypes) {
			NotificationChain msgs = null;
			if (domainTypes != null)
				msgs = ((InternalEObject)domainTypes).eInverseRemove(this, DomainPackage.DOMAIN_TYPES__PARENT, DomainTypes.class, msgs);
			if (newDomainTypes != null)
				msgs = ((InternalEObject)newDomainTypes).eInverseAdd(this, DomainPackage.DOMAIN_TYPES__PARENT, DomainTypes.class, msgs);
			msgs = basicSetDomainTypes(newDomainTypes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__DOMAIN_TYPES, newDomainTypes, newDomainTypes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainApplications getDomainApplications() {
		return domainApplications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomainApplications(DomainApplications newDomainApplications, NotificationChain msgs) {
		DomainApplications oldDomainApplications = domainApplications;
		domainApplications = newDomainApplications;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__DOMAIN_APPLICATIONS, oldDomainApplications, newDomainApplications);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainApplications(DomainApplications newDomainApplications) {
		if (newDomainApplications != domainApplications) {
			NotificationChain msgs = null;
			if (domainApplications != null)
				msgs = ((InternalEObject)domainApplications).eInverseRemove(this, DomainPackage.DOMAIN_APPLICATIONS__PARENT, DomainApplications.class, msgs);
			if (newDomainApplications != null)
				msgs = ((InternalEObject)newDomainApplications).eInverseAdd(this, DomainPackage.DOMAIN_APPLICATIONS__PARENT, DomainApplications.class, msgs);
			msgs = basicSetDomainApplications(newDomainApplications, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__DOMAIN_APPLICATIONS, newDomainApplications, newDomainApplications));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getAny() {
		return any;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAny(EObject newAny, NotificationChain msgs) {
		EObject oldAny = any;
		any = newAny;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__ANY, oldAny, newAny);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAny(EObject newAny) {
		if (newAny != any) {
			NotificationChain msgs = null;
			if (any != null)
				msgs = ((InternalEObject)any).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.DOMAIN__ANY, null, msgs);
			if (newAny != null)
				msgs = ((InternalEObject)newAny).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainPackage.DOMAIN__ANY, null, msgs);
			msgs = basicSetAny(newAny, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__ANY, newAny, newAny));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomainPackage.DOMAIN__DOMAIN_ARTIFACTS:
				if (domainArtifacts != null)
					msgs = ((InternalEObject)domainArtifacts).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.DOMAIN__DOMAIN_ARTIFACTS, null, msgs);
				return basicSetDomainArtifacts((DomainArtifacts)otherEnd, msgs);
			case DomainPackage.DOMAIN__DOMAIN_TYPES:
				if (domainTypes != null)
					msgs = ((InternalEObject)domainTypes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.DOMAIN__DOMAIN_TYPES, null, msgs);
				return basicSetDomainTypes((DomainTypes)otherEnd, msgs);
			case DomainPackage.DOMAIN__DOMAIN_APPLICATIONS:
				if (domainApplications != null)
					msgs = ((InternalEObject)domainApplications).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.DOMAIN__DOMAIN_APPLICATIONS, null, msgs);
				return basicSetDomainApplications((DomainApplications)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomainPackage.DOMAIN__DOMAIN_ARTIFACTS:
				return basicSetDomainArtifacts(null, msgs);
			case DomainPackage.DOMAIN__DOMAIN_TYPES:
				return basicSetDomainTypes(null, msgs);
			case DomainPackage.DOMAIN__DOMAIN_APPLICATIONS:
				return basicSetDomainApplications(null, msgs);
			case DomainPackage.DOMAIN__ANY:
				return basicSetAny(null, msgs);
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
			case DomainPackage.DOMAIN__UID:
				return getUid();
			case DomainPackage.DOMAIN__DOMAIN_ARTIFACTS:
				return getDomainArtifacts();
			case DomainPackage.DOMAIN__DOMAIN_TYPES:
				return getDomainTypes();
			case DomainPackage.DOMAIN__DOMAIN_APPLICATIONS:
				return getDomainApplications();
			case DomainPackage.DOMAIN__ANY:
				return getAny();
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
			case DomainPackage.DOMAIN__UID:
				setUid((String)newValue);
				return;
			case DomainPackage.DOMAIN__DOMAIN_ARTIFACTS:
				setDomainArtifacts((DomainArtifacts)newValue);
				return;
			case DomainPackage.DOMAIN__DOMAIN_TYPES:
				setDomainTypes((DomainTypes)newValue);
				return;
			case DomainPackage.DOMAIN__DOMAIN_APPLICATIONS:
				setDomainApplications((DomainApplications)newValue);
				return;
			case DomainPackage.DOMAIN__ANY:
				setAny((EObject)newValue);
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
			case DomainPackage.DOMAIN__UID:
				setUid(UID_EDEFAULT);
				return;
			case DomainPackage.DOMAIN__DOMAIN_ARTIFACTS:
				setDomainArtifacts((DomainArtifacts)null);
				return;
			case DomainPackage.DOMAIN__DOMAIN_TYPES:
				setDomainTypes((DomainTypes)null);
				return;
			case DomainPackage.DOMAIN__DOMAIN_APPLICATIONS:
				setDomainApplications((DomainApplications)null);
				return;
			case DomainPackage.DOMAIN__ANY:
				setAny((EObject)null);
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
			case DomainPackage.DOMAIN__UID:
				return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
			case DomainPackage.DOMAIN__DOMAIN_ARTIFACTS:
				return domainArtifacts != null;
			case DomainPackage.DOMAIN__DOMAIN_TYPES:
				return domainTypes != null;
			case DomainPackage.DOMAIN__DOMAIN_APPLICATIONS:
				return domainApplications != null;
			case DomainPackage.DOMAIN__ANY:
				return any != null;
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

} //DomainImpl
