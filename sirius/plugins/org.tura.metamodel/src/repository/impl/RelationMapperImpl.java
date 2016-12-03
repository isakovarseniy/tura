/**
 */
package repository.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import repository.ObjectMapper;
import repository.RelationMapper;
import repository.RepositoryPackage;

import type.impl.TypePointerImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation Mapper</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link repository.impl.RelationMapperImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link repository.impl.RelationMapperImpl#getObjectMapperRef <em>Object Mapper Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationMapperImpl extends TypePointerImpl implements RelationMapper {
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
	 * The cached value of the '{@link #getObjectMapperRef() <em>Object Mapper Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectMapperRef()
	 * @generated
	 * @ordered
	 */
	protected ObjectMapper objectMapperRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationMapperImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RepositoryPackage.Literals.RELATION_MAPPER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.RELATION_MAPPER__UID, oldUid, uid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectMapper getObjectMapperRef() {
		if (objectMapperRef != null && objectMapperRef.eIsProxy()) {
			InternalEObject oldObjectMapperRef = (InternalEObject)objectMapperRef;
			objectMapperRef = (ObjectMapper)eResolveProxy(oldObjectMapperRef);
			if (objectMapperRef != oldObjectMapperRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RepositoryPackage.RELATION_MAPPER__OBJECT_MAPPER_REF, oldObjectMapperRef, objectMapperRef));
			}
		}
		return objectMapperRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectMapper basicGetObjectMapperRef() {
		return objectMapperRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectMapperRef(ObjectMapper newObjectMapperRef) {
		ObjectMapper oldObjectMapperRef = objectMapperRef;
		objectMapperRef = newObjectMapperRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.RELATION_MAPPER__OBJECT_MAPPER_REF, oldObjectMapperRef, objectMapperRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RepositoryPackage.RELATION_MAPPER__UID:
				return getUid();
			case RepositoryPackage.RELATION_MAPPER__OBJECT_MAPPER_REF:
				if (resolve) return getObjectMapperRef();
				return basicGetObjectMapperRef();
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
			case RepositoryPackage.RELATION_MAPPER__UID:
				setUid((String)newValue);
				return;
			case RepositoryPackage.RELATION_MAPPER__OBJECT_MAPPER_REF:
				setObjectMapperRef((ObjectMapper)newValue);
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
			case RepositoryPackage.RELATION_MAPPER__UID:
				setUid(UID_EDEFAULT);
				return;
			case RepositoryPackage.RELATION_MAPPER__OBJECT_MAPPER_REF:
				setObjectMapperRef((ObjectMapper)null);
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
			case RepositoryPackage.RELATION_MAPPER__UID:
				return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
			case RepositoryPackage.RELATION_MAPPER__OBJECT_MAPPER_REF:
				return objectMapperRef != null;
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

} //RelationMapperImpl
