/**
 */
package domain.impl;

import domain.Attribute;
import domain.AttributeConnection;
import domain.DomainPackage;
import domain.Many2Many;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Many2 Many</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link domain.impl.Many2ManyImpl#getSourceAttribute <em>Source Attribute</em>}</li>
 *   <li>{@link domain.impl.Many2ManyImpl#getTargetAttribute <em>Target Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Many2ManyImpl extends RelationShipImpl implements Many2Many {
	/**
	 * The cached value of the '{@link #getSourceAttribute() <em>Source Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceAttribute()
	 * @generated
	 * @ordered
	 */
	protected Attribute sourceAttribute;

	/**
	 * The cached value of the '{@link #getTargetAttribute() <em>Target Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetAttribute()
	 * @generated
	 * @ordered
	 */
	protected Attribute targetAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Many2ManyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.MANY2_MANY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getSourceAttribute() {
		if (sourceAttribute != null && sourceAttribute.eIsProxy()) {
			InternalEObject oldSourceAttribute = (InternalEObject)sourceAttribute;
			sourceAttribute = (Attribute)eResolveProxy(oldSourceAttribute);
			if (sourceAttribute != oldSourceAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.MANY2_MANY__SOURCE_ATTRIBUTE, oldSourceAttribute, sourceAttribute));
			}
		}
		return sourceAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetSourceAttribute() {
		return sourceAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceAttribute(Attribute newSourceAttribute) {
		Attribute oldSourceAttribute = sourceAttribute;
		sourceAttribute = newSourceAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.MANY2_MANY__SOURCE_ATTRIBUTE, oldSourceAttribute, sourceAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getTargetAttribute() {
		if (targetAttribute != null && targetAttribute.eIsProxy()) {
			InternalEObject oldTargetAttribute = (InternalEObject)targetAttribute;
			targetAttribute = (Attribute)eResolveProxy(oldTargetAttribute);
			if (targetAttribute != oldTargetAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.MANY2_MANY__TARGET_ATTRIBUTE, oldTargetAttribute, targetAttribute));
			}
		}
		return targetAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetTargetAttribute() {
		return targetAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetAttribute(Attribute newTargetAttribute) {
		Attribute oldTargetAttribute = targetAttribute;
		targetAttribute = newTargetAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.MANY2_MANY__TARGET_ATTRIBUTE, oldTargetAttribute, targetAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DomainPackage.MANY2_MANY__SOURCE_ATTRIBUTE:
				if (resolve) return getSourceAttribute();
				return basicGetSourceAttribute();
			case DomainPackage.MANY2_MANY__TARGET_ATTRIBUTE:
				if (resolve) return getTargetAttribute();
				return basicGetTargetAttribute();
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
			case DomainPackage.MANY2_MANY__SOURCE_ATTRIBUTE:
				setSourceAttribute((Attribute)newValue);
				return;
			case DomainPackage.MANY2_MANY__TARGET_ATTRIBUTE:
				setTargetAttribute((Attribute)newValue);
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
			case DomainPackage.MANY2_MANY__SOURCE_ATTRIBUTE:
				setSourceAttribute((Attribute)null);
				return;
			case DomainPackage.MANY2_MANY__TARGET_ATTRIBUTE:
				setTargetAttribute((Attribute)null);
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
			case DomainPackage.MANY2_MANY__SOURCE_ATTRIBUTE:
				return sourceAttribute != null;
			case DomainPackage.MANY2_MANY__TARGET_ATTRIBUTE:
				return targetAttribute != null;
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
		if (baseClass == AttributeConnection.class) {
			switch (derivedFeatureID) {
				case DomainPackage.MANY2_MANY__SOURCE_ATTRIBUTE: return DomainPackage.ATTRIBUTE_CONNECTION__SOURCE_ATTRIBUTE;
				case DomainPackage.MANY2_MANY__TARGET_ATTRIBUTE: return DomainPackage.ATTRIBUTE_CONNECTION__TARGET_ATTRIBUTE;
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
		if (baseClass == AttributeConnection.class) {
			switch (baseFeatureID) {
				case DomainPackage.ATTRIBUTE_CONNECTION__SOURCE_ATTRIBUTE: return DomainPackage.MANY2_MANY__SOURCE_ATTRIBUTE;
				case DomainPackage.ATTRIBUTE_CONNECTION__TARGET_ATTRIBUTE: return DomainPackage.MANY2_MANY__TARGET_ATTRIBUTE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //Many2ManyImpl
