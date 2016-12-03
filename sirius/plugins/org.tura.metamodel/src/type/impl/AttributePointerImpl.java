/**
 */
package type.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import type.Attribute;
import type.AttributePointer;
import type.TypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Pointer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link type.impl.AttributePointerImpl#getAttributeRef <em>Attribute Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributePointerImpl extends EObjectImpl implements AttributePointer {
	/**
	 * The cached value of the '{@link #getAttributeRef() <em>Attribute Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeRef()
	 * @generated
	 * @ordered
	 */
	protected Attribute attributeRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributePointerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypePackage.Literals.ATTRIBUTE_POINTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getAttributeRef() {
		if (attributeRef != null && attributeRef.eIsProxy()) {
			InternalEObject oldAttributeRef = (InternalEObject)attributeRef;
			attributeRef = (Attribute)eResolveProxy(oldAttributeRef);
			if (attributeRef != oldAttributeRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypePackage.ATTRIBUTE_POINTER__ATTRIBUTE_REF, oldAttributeRef, attributeRef));
			}
		}
		return attributeRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetAttributeRef() {
		return attributeRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeRef(Attribute newAttributeRef) {
		Attribute oldAttributeRef = attributeRef;
		attributeRef = newAttributeRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.ATTRIBUTE_POINTER__ATTRIBUTE_REF, oldAttributeRef, attributeRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TypePackage.ATTRIBUTE_POINTER__ATTRIBUTE_REF:
				if (resolve) return getAttributeRef();
				return basicGetAttributeRef();
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
			case TypePackage.ATTRIBUTE_POINTER__ATTRIBUTE_REF:
				setAttributeRef((Attribute)newValue);
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
			case TypePackage.ATTRIBUTE_POINTER__ATTRIBUTE_REF:
				setAttributeRef((Attribute)null);
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
			case TypePackage.ATTRIBUTE_POINTER__ATTRIBUTE_REF:
				return attributeRef != null;
		}
		return super.eIsSet(featureID);
	}

} //AttributePointerImpl
