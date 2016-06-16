/**
 */
package tura.mapper.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import tura.mapper.MapperPackage;
import tura.mapper.TypeMapper;

import tura.type.TypeElement;
import tura.type.TypePackage;
import tura.type.TypePointer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Mapper</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tura.mapper.impl.TypeMapperImpl#getTypeRef <em>Type Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeMapperImpl extends MapperImpl implements TypeMapper {
	/**
	 * The cached value of the '{@link #getTypeRef() <em>Type Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeRef()
	 * @generated
	 * @ordered
	 */
	protected TypeElement typeRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeMapperImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MapperPackage.Literals.TYPE_MAPPER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeElement getTypeRef() {
		if (typeRef != null && typeRef.eIsProxy()) {
			InternalEObject oldTypeRef = (InternalEObject)typeRef;
			typeRef = (TypeElement)eResolveProxy(oldTypeRef);
			if (typeRef != oldTypeRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MapperPackage.TYPE_MAPPER__TYPE_REF, oldTypeRef, typeRef));
			}
		}
		return typeRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeElement basicGetTypeRef() {
		return typeRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeRef(TypeElement newTypeRef) {
		TypeElement oldTypeRef = typeRef;
		typeRef = newTypeRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MapperPackage.TYPE_MAPPER__TYPE_REF, oldTypeRef, typeRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MapperPackage.TYPE_MAPPER__TYPE_REF:
				if (resolve) return getTypeRef();
				return basicGetTypeRef();
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
			case MapperPackage.TYPE_MAPPER__TYPE_REF:
				setTypeRef((TypeElement)newValue);
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
			case MapperPackage.TYPE_MAPPER__TYPE_REF:
				setTypeRef((TypeElement)null);
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
			case MapperPackage.TYPE_MAPPER__TYPE_REF:
				return typeRef != null;
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
		if (baseClass == TypePointer.class) {
			switch (derivedFeatureID) {
				case MapperPackage.TYPE_MAPPER__TYPE_REF: return TypePackage.TYPE_POINTER__TYPE_REF;
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
		if (baseClass == TypePointer.class) {
			switch (baseFeatureID) {
				case TypePackage.TYPE_POINTER__TYPE_REF: return MapperPackage.TYPE_MAPPER__TYPE_REF;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //TypeMapperImpl
