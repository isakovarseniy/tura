/**
 */
package domain.impl;

import domain.DomainPackage;
import domain.InfrastructureComponent;
import domain.InfrastructureConnection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Infrastructure Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link domain.impl.InfrastructureConnectionImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.impl.InfrastructureConnectionImpl#getMaster <em>Master</em>}</li>
 *   <li>{@link domain.impl.InfrastructureConnectionImpl#getDetail <em>Detail</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InfrastructureConnectionImpl extends EObjectImpl implements InfrastructureConnection {
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
	 * The cached value of the '{@link #getMaster() <em>Master</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaster()
	 * @generated
	 * @ordered
	 */
	protected InfrastructureComponent master;

	/**
	 * The cached value of the '{@link #getDetail() <em>Detail</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetail()
	 * @generated
	 * @ordered
	 */
	protected InfrastructureComponent detail;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfrastructureConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.INFRASTRUCTURE_CONNECTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.INFRASTRUCTURE_CONNECTION__UID, oldUid, uid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfrastructureComponent getMaster() {
		if (master != null && master.eIsProxy()) {
			InternalEObject oldMaster = (InternalEObject)master;
			master = (InfrastructureComponent)eResolveProxy(oldMaster);
			if (master != oldMaster) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.INFRASTRUCTURE_CONNECTION__MASTER, oldMaster, master));
			}
		}
		return master;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfrastructureComponent basicGetMaster() {
		return master;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaster(InfrastructureComponent newMaster) {
		InfrastructureComponent oldMaster = master;
		master = newMaster;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.INFRASTRUCTURE_CONNECTION__MASTER, oldMaster, master));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfrastructureComponent getDetail() {
		if (detail != null && detail.eIsProxy()) {
			InternalEObject oldDetail = (InternalEObject)detail;
			detail = (InfrastructureComponent)eResolveProxy(oldDetail);
			if (detail != oldDetail) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.INFRASTRUCTURE_CONNECTION__DETAIL, oldDetail, detail));
			}
		}
		return detail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfrastructureComponent basicGetDetail() {
		return detail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDetail(InfrastructureComponent newDetail) {
		InfrastructureComponent oldDetail = detail;
		detail = newDetail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.INFRASTRUCTURE_CONNECTION__DETAIL, oldDetail, detail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DomainPackage.INFRASTRUCTURE_CONNECTION__UID:
				return getUid();
			case DomainPackage.INFRASTRUCTURE_CONNECTION__MASTER:
				if (resolve) return getMaster();
				return basicGetMaster();
			case DomainPackage.INFRASTRUCTURE_CONNECTION__DETAIL:
				if (resolve) return getDetail();
				return basicGetDetail();
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
			case DomainPackage.INFRASTRUCTURE_CONNECTION__UID:
				setUid((String)newValue);
				return;
			case DomainPackage.INFRASTRUCTURE_CONNECTION__MASTER:
				setMaster((InfrastructureComponent)newValue);
				return;
			case DomainPackage.INFRASTRUCTURE_CONNECTION__DETAIL:
				setDetail((InfrastructureComponent)newValue);
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
			case DomainPackage.INFRASTRUCTURE_CONNECTION__UID:
				setUid(UID_EDEFAULT);
				return;
			case DomainPackage.INFRASTRUCTURE_CONNECTION__MASTER:
				setMaster((InfrastructureComponent)null);
				return;
			case DomainPackage.INFRASTRUCTURE_CONNECTION__DETAIL:
				setDetail((InfrastructureComponent)null);
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
			case DomainPackage.INFRASTRUCTURE_CONNECTION__UID:
				return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
			case DomainPackage.INFRASTRUCTURE_CONNECTION__MASTER:
				return master != null;
			case DomainPackage.INFRASTRUCTURE_CONNECTION__DETAIL:
				return detail != null;
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

} //InfrastructureConnectionImpl
