/**
 */
package domain.impl;

import domain.Datacenter;
import domain.DomainPackage;
import domain.InfrastructureLayer;
import domain.Subsystem;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subsystem</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link domain.impl.SubsystemImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.impl.SubsystemImpl#getName <em>Name</em>}</li>
 *   <li>{@link domain.impl.SubsystemImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link domain.impl.SubsystemImpl#getInfrastructureLayer <em>Infrastructure Layer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubsystemImpl extends EObjectImpl implements Subsystem {
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
	 * The cached value of the '{@link #getInfrastructureLayer() <em>Infrastructure Layer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfrastructureLayer()
	 * @generated
	 * @ordered
	 */
	protected EList<InfrastructureLayer> infrastructureLayer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubsystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.SUBSYSTEM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.SUBSYSTEM__UID, oldUid, uid));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.SUBSYSTEM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Datacenter getParent() {
		if (eContainerFeatureID() != DomainPackage.SUBSYSTEM__PARENT) return null;
		return (Datacenter)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(Datacenter newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, DomainPackage.SUBSYSTEM__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(Datacenter newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != DomainPackage.SUBSYSTEM__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, DomainPackage.DATACENTER__SUBSYSTEMS, Datacenter.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.SUBSYSTEM__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InfrastructureLayer> getInfrastructureLayer() {
		if (infrastructureLayer == null) {
			infrastructureLayer = new EObjectContainmentWithInverseEList<InfrastructureLayer>(InfrastructureLayer.class, this, DomainPackage.SUBSYSTEM__INFRASTRUCTURE_LAYER, DomainPackage.INFRASTRUCTURE_LAYER__PARENT);
		}
		return infrastructureLayer;
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
			case DomainPackage.SUBSYSTEM__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((Datacenter)otherEnd, msgs);
			case DomainPackage.SUBSYSTEM__INFRASTRUCTURE_LAYER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInfrastructureLayer()).basicAdd(otherEnd, msgs);
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
			case DomainPackage.SUBSYSTEM__PARENT:
				return basicSetParent(null, msgs);
			case DomainPackage.SUBSYSTEM__INFRASTRUCTURE_LAYER:
				return ((InternalEList<?>)getInfrastructureLayer()).basicRemove(otherEnd, msgs);
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
			case DomainPackage.SUBSYSTEM__PARENT:
				return eInternalContainer().eInverseRemove(this, DomainPackage.DATACENTER__SUBSYSTEMS, Datacenter.class, msgs);
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
			case DomainPackage.SUBSYSTEM__UID:
				return getUid();
			case DomainPackage.SUBSYSTEM__NAME:
				return getName();
			case DomainPackage.SUBSYSTEM__PARENT:
				return getParent();
			case DomainPackage.SUBSYSTEM__INFRASTRUCTURE_LAYER:
				return getInfrastructureLayer();
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
			case DomainPackage.SUBSYSTEM__UID:
				setUid((String)newValue);
				return;
			case DomainPackage.SUBSYSTEM__NAME:
				setName((String)newValue);
				return;
			case DomainPackage.SUBSYSTEM__PARENT:
				setParent((Datacenter)newValue);
				return;
			case DomainPackage.SUBSYSTEM__INFRASTRUCTURE_LAYER:
				getInfrastructureLayer().clear();
				getInfrastructureLayer().addAll((Collection<? extends InfrastructureLayer>)newValue);
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
			case DomainPackage.SUBSYSTEM__UID:
				setUid(UID_EDEFAULT);
				return;
			case DomainPackage.SUBSYSTEM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DomainPackage.SUBSYSTEM__PARENT:
				setParent((Datacenter)null);
				return;
			case DomainPackage.SUBSYSTEM__INFRASTRUCTURE_LAYER:
				getInfrastructureLayer().clear();
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
			case DomainPackage.SUBSYSTEM__UID:
				return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
			case DomainPackage.SUBSYSTEM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DomainPackage.SUBSYSTEM__PARENT:
				return getParent() != null;
			case DomainPackage.SUBSYSTEM__INFRASTRUCTURE_LAYER:
				return infrastructureLayer != null && !infrastructureLayer.isEmpty();
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

} //SubsystemImpl
