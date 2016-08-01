/**
 */
package type.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import type.Attribute;
import type.Link;
import type.TypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link type.impl.LinkImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link type.impl.LinkImpl#getMasterField <em>Master Field</em>}</li>
 *   <li>{@link type.impl.LinkImpl#getDetailField <em>Detail Field</em>}</li>
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
		return TypePackage.Literals.LINK;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.LINK__UID, oldUid, uid));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypePackage.LINK__MASTER_FIELD, oldMasterField, masterField));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.LINK__MASTER_FIELD, oldMasterField, masterField));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypePackage.LINK__DETAIL_FIELD, oldDetailField, detailField));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.LINK__DETAIL_FIELD, oldDetailField, detailField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TypePackage.LINK__UID:
				return getUid();
			case TypePackage.LINK__MASTER_FIELD:
				if (resolve) return getMasterField();
				return basicGetMasterField();
			case TypePackage.LINK__DETAIL_FIELD:
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
			case TypePackage.LINK__UID:
				setUid((String)newValue);
				return;
			case TypePackage.LINK__MASTER_FIELD:
				setMasterField((Attribute)newValue);
				return;
			case TypePackage.LINK__DETAIL_FIELD:
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
			case TypePackage.LINK__UID:
				setUid(UID_EDEFAULT);
				return;
			case TypePackage.LINK__MASTER_FIELD:
				setMasterField((Attribute)null);
				return;
			case TypePackage.LINK__DETAIL_FIELD:
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
			case TypePackage.LINK__UID:
				return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
			case TypePackage.LINK__MASTER_FIELD:
				return masterField != null;
			case TypePackage.LINK__DETAIL_FIELD:
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
