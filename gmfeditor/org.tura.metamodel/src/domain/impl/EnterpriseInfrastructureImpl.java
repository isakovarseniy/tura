/**
 */
package domain.impl;

import domain.ApplicationInfrastructureLayer;
import domain.Datacenter;
import domain.DomainPackage;
import domain.EnterpriseInfrastructure;
import domain.InfrastructureConnection;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enterprise Infrastructure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link domain.impl.EnterpriseInfrastructureImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.impl.EnterpriseInfrastructureImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link domain.impl.EnterpriseInfrastructureImpl#getDatacenters <em>Datacenters</em>}</li>
 *   <li>{@link domain.impl.EnterpriseInfrastructureImpl#getInfrastructureConnections <em>Infrastructure Connections</em>}</li>
 *   <li>{@link domain.impl.EnterpriseInfrastructureImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnterpriseInfrastructureImpl extends EObjectImpl implements EnterpriseInfrastructure {
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
	 * The cached value of the '{@link #getDatacenters() <em>Datacenters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatacenters()
	 * @generated
	 * @ordered
	 */
	protected EList<Datacenter> datacenters;

	/**
	 * The cached value of the '{@link #getInfrastructureConnections() <em>Infrastructure Connections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfrastructureConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<InfrastructureConnection> infrastructureConnections;

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
	protected EnterpriseInfrastructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.ENTERPRISE_INFRASTRUCTURE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.ENTERPRISE_INFRASTRUCTURE__UID, oldUid, uid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationInfrastructureLayer getParent() {
		if (eContainerFeatureID() != DomainPackage.ENTERPRISE_INFRASTRUCTURE__PARENT) return null;
		return (ApplicationInfrastructureLayer)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(ApplicationInfrastructureLayer newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, DomainPackage.ENTERPRISE_INFRASTRUCTURE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(ApplicationInfrastructureLayer newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != DomainPackage.ENTERPRISE_INFRASTRUCTURE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, DomainPackage.APPLICATION_INFRASTRUCTURE_LAYER__INFARASTRUCTURE, ApplicationInfrastructureLayer.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.ENTERPRISE_INFRASTRUCTURE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Datacenter> getDatacenters() {
		if (datacenters == null) {
			datacenters = new EObjectContainmentWithInverseEList<Datacenter>(Datacenter.class, this, DomainPackage.ENTERPRISE_INFRASTRUCTURE__DATACENTERS, DomainPackage.DATACENTER__PARENT);
		}
		return datacenters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InfrastructureConnection> getInfrastructureConnections() {
		if (infrastructureConnections == null) {
			infrastructureConnections = new EObjectContainmentEList<InfrastructureConnection>(InfrastructureConnection.class, this, DomainPackage.ENTERPRISE_INFRASTRUCTURE__INFRASTRUCTURE_CONNECTIONS);
		}
		return infrastructureConnections;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.ENTERPRISE_INFRASTRUCTURE__ANY, oldAny, newAny);
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
				msgs = ((InternalEObject)any).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.ENTERPRISE_INFRASTRUCTURE__ANY, null, msgs);
			if (newAny != null)
				msgs = ((InternalEObject)newAny).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainPackage.ENTERPRISE_INFRASTRUCTURE__ANY, null, msgs);
			msgs = basicSetAny(newAny, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.ENTERPRISE_INFRASTRUCTURE__ANY, newAny, newAny));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomainPackage.ENTERPRISE_INFRASTRUCTURE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((ApplicationInfrastructureLayer)otherEnd, msgs);
			case DomainPackage.ENTERPRISE_INFRASTRUCTURE__DATACENTERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDatacenters()).basicAdd(otherEnd, msgs);
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
			case DomainPackage.ENTERPRISE_INFRASTRUCTURE__PARENT:
				return basicSetParent(null, msgs);
			case DomainPackage.ENTERPRISE_INFRASTRUCTURE__DATACENTERS:
				return ((InternalEList<?>)getDatacenters()).basicRemove(otherEnd, msgs);
			case DomainPackage.ENTERPRISE_INFRASTRUCTURE__INFRASTRUCTURE_CONNECTIONS:
				return ((InternalEList<?>)getInfrastructureConnections()).basicRemove(otherEnd, msgs);
			case DomainPackage.ENTERPRISE_INFRASTRUCTURE__ANY:
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
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case DomainPackage.ENTERPRISE_INFRASTRUCTURE__PARENT:
				return eInternalContainer().eInverseRemove(this, DomainPackage.APPLICATION_INFRASTRUCTURE_LAYER__INFARASTRUCTURE, ApplicationInfrastructureLayer.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DomainPackage.ENTERPRISE_INFRASTRUCTURE__UID:
				return getUid();
			case DomainPackage.ENTERPRISE_INFRASTRUCTURE__PARENT:
				return getParent();
			case DomainPackage.ENTERPRISE_INFRASTRUCTURE__DATACENTERS:
				return getDatacenters();
			case DomainPackage.ENTERPRISE_INFRASTRUCTURE__INFRASTRUCTURE_CONNECTIONS:
				return getInfrastructureConnections();
			case DomainPackage.ENTERPRISE_INFRASTRUCTURE__ANY:
				return getAny();
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
			case DomainPackage.ENTERPRISE_INFRASTRUCTURE__UID:
				setUid((String)newValue);
				return;
			case DomainPackage.ENTERPRISE_INFRASTRUCTURE__PARENT:
				setParent((ApplicationInfrastructureLayer)newValue);
				return;
			case DomainPackage.ENTERPRISE_INFRASTRUCTURE__DATACENTERS:
				getDatacenters().clear();
				getDatacenters().addAll((Collection<? extends Datacenter>)newValue);
				return;
			case DomainPackage.ENTERPRISE_INFRASTRUCTURE__INFRASTRUCTURE_CONNECTIONS:
				getInfrastructureConnections().clear();
				getInfrastructureConnections().addAll((Collection<? extends InfrastructureConnection>)newValue);
				return;
			case DomainPackage.ENTERPRISE_INFRASTRUCTURE__ANY:
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
			case DomainPackage.ENTERPRISE_INFRASTRUCTURE__UID:
				setUid(UID_EDEFAULT);
				return;
			case DomainPackage.ENTERPRISE_INFRASTRUCTURE__PARENT:
				setParent((ApplicationInfrastructureLayer)null);
				return;
			case DomainPackage.ENTERPRISE_INFRASTRUCTURE__DATACENTERS:
				getDatacenters().clear();
				return;
			case DomainPackage.ENTERPRISE_INFRASTRUCTURE__INFRASTRUCTURE_CONNECTIONS:
				getInfrastructureConnections().clear();
				return;
			case DomainPackage.ENTERPRISE_INFRASTRUCTURE__ANY:
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
			case DomainPackage.ENTERPRISE_INFRASTRUCTURE__UID:
				return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
			case DomainPackage.ENTERPRISE_INFRASTRUCTURE__PARENT:
				return getParent() != null;
			case DomainPackage.ENTERPRISE_INFRASTRUCTURE__DATACENTERS:
				return datacenters != null && !datacenters.isEmpty();
			case DomainPackage.ENTERPRISE_INFRASTRUCTURE__INFRASTRUCTURE_CONNECTIONS:
				return infrastructureConnections != null && !infrastructureConnections.isEmpty();
			case DomainPackage.ENTERPRISE_INFRASTRUCTURE__ANY:
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

} //EnterpriseInfrastructureImpl
