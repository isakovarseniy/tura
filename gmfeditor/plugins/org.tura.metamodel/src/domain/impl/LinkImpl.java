/**
 */
package domain.impl;

import domain.Attribute;
import domain.DomainPackage;
import domain.Link;
import domain.Relation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link domain.impl.LinkImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.impl.LinkImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link domain.impl.LinkImpl#getMasterField <em>Master Field</em>}</li>
 *   <li>{@link domain.impl.LinkImpl#getDetailField <em>Detail Field</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LinkImpl extends EObjectImpl implements Link {
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
	 * The cached value of the '{@link #getMasterField() <em>Master Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMasterField()
	 * @generated
	 * @ordered
	 */
	protected Attribute masterField;

	/**
	 * The cached value of the '{@link #getDetailField() <em>Detail Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetailField()
	 * @generated
	 * @ordered
	 */
	protected Attribute detailField;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.LINK;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.LINK__UID, oldUid, uid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relation getParent() {
		if (eContainerFeatureID() != DomainPackage.LINK__PARENT) return null;
		return (Relation)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(Relation newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, DomainPackage.LINK__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(Relation newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != DomainPackage.LINK__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, DomainPackage.RELATION__LINKS, Relation.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.LINK__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getMasterField() {
		if (masterField != null && masterField.eIsProxy()) {
			InternalEObject oldMasterField = (InternalEObject)masterField;
			masterField = (Attribute)eResolveProxy(oldMasterField);
			if (masterField != oldMasterField) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.LINK__MASTER_FIELD, oldMasterField, masterField));
			}
		}
		return masterField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetMasterField() {
		return masterField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMasterField(Attribute newMasterField) {
		Attribute oldMasterField = masterField;
		masterField = newMasterField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.LINK__MASTER_FIELD, oldMasterField, masterField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getDetailField() {
		if (detailField != null && detailField.eIsProxy()) {
			InternalEObject oldDetailField = (InternalEObject)detailField;
			detailField = (Attribute)eResolveProxy(oldDetailField);
			if (detailField != oldDetailField) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.LINK__DETAIL_FIELD, oldDetailField, detailField));
			}
		}
		return detailField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetDetailField() {
		return detailField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDetailField(Attribute newDetailField) {
		Attribute oldDetailField = detailField;
		detailField = newDetailField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.LINK__DETAIL_FIELD, oldDetailField, detailField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomainPackage.LINK__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((Relation)otherEnd, msgs);
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
			case DomainPackage.LINK__PARENT:
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
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case DomainPackage.LINK__PARENT:
				return eInternalContainer().eInverseRemove(this, DomainPackage.RELATION__LINKS, Relation.class, msgs);
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
			case DomainPackage.LINK__UID:
				return getUid();
			case DomainPackage.LINK__PARENT:
				return getParent();
			case DomainPackage.LINK__MASTER_FIELD:
				if (resolve) return getMasterField();
				return basicGetMasterField();
			case DomainPackage.LINK__DETAIL_FIELD:
				if (resolve) return getDetailField();
				return basicGetDetailField();
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
			case DomainPackage.LINK__UID:
				setUid((String)newValue);
				return;
			case DomainPackage.LINK__PARENT:
				setParent((Relation)newValue);
				return;
			case DomainPackage.LINK__MASTER_FIELD:
				setMasterField((Attribute)newValue);
				return;
			case DomainPackage.LINK__DETAIL_FIELD:
				setDetailField((Attribute)newValue);
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
			case DomainPackage.LINK__UID:
				setUid(UID_EDEFAULT);
				return;
			case DomainPackage.LINK__PARENT:
				setParent((Relation)null);
				return;
			case DomainPackage.LINK__MASTER_FIELD:
				setMasterField((Attribute)null);
				return;
			case DomainPackage.LINK__DETAIL_FIELD:
				setDetailField((Attribute)null);
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
			case DomainPackage.LINK__UID:
				return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
			case DomainPackage.LINK__PARENT:
				return getParent() != null;
			case DomainPackage.LINK__MASTER_FIELD:
				return masterField != null;
			case DomainPackage.LINK__DETAIL_FIELD:
				return detailField != null;
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

} //LinkImpl
