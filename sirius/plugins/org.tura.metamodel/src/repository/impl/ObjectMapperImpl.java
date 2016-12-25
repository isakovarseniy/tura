/**
 */
package repository.impl;

import form.ControlPointer;
import form.DataControl;
import form.FormPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import repository.AttributeMapper;
import repository.ObjectMapper;
import repository.RelationMapper;
import repository.RepositoryPackage;

import type.Type;

import type.impl.TypePointerImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Mapper</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link repository.impl.ObjectMapperImpl#getSourcePointer <em>Source Pointer</em>}</li>
 *   <li>{@link repository.impl.ObjectMapperImpl#getValuePointer <em>Value Pointer</em>}</li>
 *   <li>{@link repository.impl.ObjectMapperImpl#getSourceCast <em>Source Cast</em>}</li>
 *   <li>{@link repository.impl.ObjectMapperImpl#getSourceCastDataControl <em>Source Cast Data Control</em>}</li>
 *   <li>{@link repository.impl.ObjectMapperImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link repository.impl.ObjectMapperImpl#getAttributeMappers <em>Attribute Mappers</em>}</li>
 *   <li>{@link repository.impl.ObjectMapperImpl#getRelationMappers <em>Relation Mappers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectMapperImpl extends TypePointerImpl implements ObjectMapper {
	/**
	 * The cached value of the '{@link #getSourcePointer() <em>Source Pointer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourcePointer()
	 * @generated
	 * @ordered
	 */
	protected DataControl sourcePointer;

	/**
	 * The cached value of the '{@link #getValuePointer() <em>Value Pointer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValuePointer()
	 * @generated
	 * @ordered
	 */
	protected EObject valuePointer;

	/**
	 * The cached value of the '{@link #getSourceCast() <em>Source Cast</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceCast()
	 * @generated
	 * @ordered
	 */
	protected Type sourceCast;

	/**
	 * The cached value of the '{@link #getSourceCastDataControl() <em>Source Cast Data Control</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceCastDataControl()
	 * @generated
	 * @ordered
	 */
	protected DataControl sourceCastDataControl;

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
	public DataControl getSourcePointer() {
		if (sourcePointer != null && sourcePointer.eIsProxy()) {
			InternalEObject oldSourcePointer = (InternalEObject)sourcePointer;
			sourcePointer = (DataControl)eResolveProxy(oldSourcePointer);
			if (sourcePointer != oldSourcePointer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RepositoryPackage.OBJECT_MAPPER__SOURCE_POINTER, oldSourcePointer, sourcePointer));
			}
		}
		return sourcePointer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataControl basicGetSourcePointer() {
		return sourcePointer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourcePointer(DataControl newSourcePointer) {
		DataControl oldSourcePointer = sourcePointer;
		sourcePointer = newSourcePointer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.OBJECT_MAPPER__SOURCE_POINTER, oldSourcePointer, sourcePointer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getValuePointer() {
		if (valuePointer != null && valuePointer.eIsProxy()) {
			InternalEObject oldValuePointer = (InternalEObject)valuePointer;
			valuePointer = eResolveProxy(oldValuePointer);
			if (valuePointer != oldValuePointer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RepositoryPackage.OBJECT_MAPPER__VALUE_POINTER, oldValuePointer, valuePointer));
			}
		}
		return valuePointer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetValuePointer() {
		return valuePointer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValuePointer(EObject newValuePointer) {
		EObject oldValuePointer = valuePointer;
		valuePointer = newValuePointer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.OBJECT_MAPPER__VALUE_POINTER, oldValuePointer, valuePointer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getSourceCast() {
		if (sourceCast != null && sourceCast.eIsProxy()) {
			InternalEObject oldSourceCast = (InternalEObject)sourceCast;
			sourceCast = (Type)eResolveProxy(oldSourceCast);
			if (sourceCast != oldSourceCast) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RepositoryPackage.OBJECT_MAPPER__SOURCE_CAST, oldSourceCast, sourceCast));
			}
		}
		return sourceCast;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetSourceCast() {
		return sourceCast;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceCast(Type newSourceCast) {
		Type oldSourceCast = sourceCast;
		sourceCast = newSourceCast;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.OBJECT_MAPPER__SOURCE_CAST, oldSourceCast, sourceCast));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataControl getSourceCastDataControl() {
		if (sourceCastDataControl != null && sourceCastDataControl.eIsProxy()) {
			InternalEObject oldSourceCastDataControl = (InternalEObject)sourceCastDataControl;
			sourceCastDataControl = (DataControl)eResolveProxy(oldSourceCastDataControl);
			if (sourceCastDataControl != oldSourceCastDataControl) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RepositoryPackage.OBJECT_MAPPER__SOURCE_CAST_DATA_CONTROL, oldSourceCastDataControl, sourceCastDataControl));
			}
		}
		return sourceCastDataControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataControl basicGetSourceCastDataControl() {
		return sourceCastDataControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceCastDataControl(DataControl newSourceCastDataControl) {
		DataControl oldSourceCastDataControl = sourceCastDataControl;
		sourceCastDataControl = newSourceCastDataControl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.OBJECT_MAPPER__SOURCE_CAST_DATA_CONTROL, oldSourceCastDataControl, sourceCastDataControl));
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
			case RepositoryPackage.OBJECT_MAPPER__SOURCE_POINTER:
				if (resolve) return getSourcePointer();
				return basicGetSourcePointer();
			case RepositoryPackage.OBJECT_MAPPER__VALUE_POINTER:
				if (resolve) return getValuePointer();
				return basicGetValuePointer();
			case RepositoryPackage.OBJECT_MAPPER__SOURCE_CAST:
				if (resolve) return getSourceCast();
				return basicGetSourceCast();
			case RepositoryPackage.OBJECT_MAPPER__SOURCE_CAST_DATA_CONTROL:
				if (resolve) return getSourceCastDataControl();
				return basicGetSourceCastDataControl();
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
			case RepositoryPackage.OBJECT_MAPPER__SOURCE_POINTER:
				setSourcePointer((DataControl)newValue);
				return;
			case RepositoryPackage.OBJECT_MAPPER__VALUE_POINTER:
				setValuePointer((EObject)newValue);
				return;
			case RepositoryPackage.OBJECT_MAPPER__SOURCE_CAST:
				setSourceCast((Type)newValue);
				return;
			case RepositoryPackage.OBJECT_MAPPER__SOURCE_CAST_DATA_CONTROL:
				setSourceCastDataControl((DataControl)newValue);
				return;
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
			case RepositoryPackage.OBJECT_MAPPER__SOURCE_POINTER:
				setSourcePointer((DataControl)null);
				return;
			case RepositoryPackage.OBJECT_MAPPER__VALUE_POINTER:
				setValuePointer((EObject)null);
				return;
			case RepositoryPackage.OBJECT_MAPPER__SOURCE_CAST:
				setSourceCast((Type)null);
				return;
			case RepositoryPackage.OBJECT_MAPPER__SOURCE_CAST_DATA_CONTROL:
				setSourceCastDataControl((DataControl)null);
				return;
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
			case RepositoryPackage.OBJECT_MAPPER__SOURCE_POINTER:
				return sourcePointer != null;
			case RepositoryPackage.OBJECT_MAPPER__VALUE_POINTER:
				return valuePointer != null;
			case RepositoryPackage.OBJECT_MAPPER__SOURCE_CAST:
				return sourceCast != null;
			case RepositoryPackage.OBJECT_MAPPER__SOURCE_CAST_DATA_CONTROL:
				return sourceCastDataControl != null;
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
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ControlPointer.class) {
			switch (derivedFeatureID) {
				case RepositoryPackage.OBJECT_MAPPER__SOURCE_POINTER: return FormPackage.CONTROL_POINTER__SOURCE_POINTER;
				case RepositoryPackage.OBJECT_MAPPER__VALUE_POINTER: return FormPackage.CONTROL_POINTER__VALUE_POINTER;
				case RepositoryPackage.OBJECT_MAPPER__SOURCE_CAST: return FormPackage.CONTROL_POINTER__SOURCE_CAST;
				case RepositoryPackage.OBJECT_MAPPER__SOURCE_CAST_DATA_CONTROL: return FormPackage.CONTROL_POINTER__SOURCE_CAST_DATA_CONTROL;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ControlPointer.class) {
			switch (baseFeatureID) {
				case FormPackage.CONTROL_POINTER__SOURCE_POINTER: return RepositoryPackage.OBJECT_MAPPER__SOURCE_POINTER;
				case FormPackage.CONTROL_POINTER__VALUE_POINTER: return RepositoryPackage.OBJECT_MAPPER__VALUE_POINTER;
				case FormPackage.CONTROL_POINTER__SOURCE_CAST: return RepositoryPackage.OBJECT_MAPPER__SOURCE_CAST;
				case FormPackage.CONTROL_POINTER__SOURCE_CAST_DATA_CONTROL: return RepositoryPackage.OBJECT_MAPPER__SOURCE_CAST_DATA_CONTROL;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
