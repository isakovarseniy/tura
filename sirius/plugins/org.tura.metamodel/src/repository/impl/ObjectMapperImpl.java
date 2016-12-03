/**
 */
package repository.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import repository.AttributeMapper;
import repository.ObjectMapper;
import repository.RelationMapper;
import repository.RepositoryPackage;

import type.impl.TypePointerImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Mapper</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link repository.impl.ObjectMapperImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link repository.impl.ObjectMapperImpl#getAttributeMappers <em>Attribute Mappers</em>}</li>
 *   <li>{@link repository.impl.ObjectMapperImpl#getRelationMappers <em>Relation Mappers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectMapperImpl extends TypePointerImpl implements ObjectMapper {
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
	 * The cached value of the '{@link #getAttributeMappers() <em>Attribute Mappers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeMappers()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeMapper> attributeMappers;

	/**
	 * The cached value of the '{@link #getRelationMappers() <em>Relation Mappers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationMappers()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationMapper> relationMappers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectMapperImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RepositoryPackage.Literals.OBJECT_MAPPER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.OBJECT_MAPPER__UID, oldUid, uid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeMapper> getAttributeMappers() {
		if (attributeMappers == null) {
			attributeMappers = new EObjectContainmentEList<AttributeMapper>(AttributeMapper.class, this, RepositoryPackage.OBJECT_MAPPER__ATTRIBUTE_MAPPERS);
		}
		return attributeMappers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RelationMapper> getRelationMappers() {
		if (relationMappers == null) {
			relationMappers = new EObjectContainmentEList<RelationMapper>(RelationMapper.class, this, RepositoryPackage.OBJECT_MAPPER__RELATION_MAPPERS);
		}
		return relationMappers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RepositoryPackage.OBJECT_MAPPER__ATTRIBUTE_MAPPERS:
				return ((InternalEList<?>)getAttributeMappers()).basicRemove(otherEnd, msgs);
			case RepositoryPackage.OBJECT_MAPPER__RELATION_MAPPERS:
				return ((InternalEList<?>)getRelationMappers()).basicRemove(otherEnd, msgs);
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
			case RepositoryPackage.OBJECT_MAPPER__UID:
				return getUid();
			case RepositoryPackage.OBJECT_MAPPER__ATTRIBUTE_MAPPERS:
				return getAttributeMappers();
			case RepositoryPackage.OBJECT_MAPPER__RELATION_MAPPERS:
				return getRelationMappers();
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
			case RepositoryPackage.OBJECT_MAPPER__UID:
				setUid((String)newValue);
				return;
			case RepositoryPackage.OBJECT_MAPPER__ATTRIBUTE_MAPPERS:
				getAttributeMappers().clear();
				getAttributeMappers().addAll((Collection<? extends AttributeMapper>)newValue);
				return;
			case RepositoryPackage.OBJECT_MAPPER__RELATION_MAPPERS:
				getRelationMappers().clear();
				getRelationMappers().addAll((Collection<? extends RelationMapper>)newValue);
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
			case RepositoryPackage.OBJECT_MAPPER__UID:
				setUid(UID_EDEFAULT);
				return;
			case RepositoryPackage.OBJECT_MAPPER__ATTRIBUTE_MAPPERS:
				getAttributeMappers().clear();
				return;
			case RepositoryPackage.OBJECT_MAPPER__RELATION_MAPPERS:
				getRelationMappers().clear();
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
			case RepositoryPackage.OBJECT_MAPPER__UID:
				return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
			case RepositoryPackage.OBJECT_MAPPER__ATTRIBUTE_MAPPERS:
				return attributeMappers != null && !attributeMappers.isEmpty();
			case RepositoryPackage.OBJECT_MAPPER__RELATION_MAPPERS:
				return relationMappers != null && !relationMappers.isEmpty();
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

} //ObjectMapperImpl
