/**
 */
package domain.impl;

import domain.Assosiation;
import domain.Attribute;
import domain.DomainPackage;
import domain.Link;
import domain.RelationType;
import domain.TypeElement;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assosiation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link domain.impl.AssosiationImpl#getType <em>Type</em>}</li>
 *   <li>{@link domain.impl.AssosiationImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link domain.impl.AssosiationImpl#getSourceProperty <em>Source Property</em>}</li>
 *   <li>{@link domain.impl.AssosiationImpl#getTargetProperty <em>Target Property</em>}</li>
 *   <li>{@link domain.impl.AssosiationImpl#getMany2manyHelper <em>Many2many Helper</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssosiationImpl extends RelationShipImpl implements Assosiation {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final RelationType TYPE_EDEFAULT = RelationType.ONE2_ONE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected RelationType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLinks() <em>Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> links;

	/**
	 * The cached value of the '{@link #getSourceProperty() <em>Source Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceProperty()
	 * @generated
	 * @ordered
	 */
	protected Attribute sourceProperty;

	/**
	 * The cached value of the '{@link #getTargetProperty() <em>Target Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetProperty()
	 * @generated
	 * @ordered
	 */
	protected Attribute targetProperty;

	/**
	 * The cached value of the '{@link #getMany2manyHelper() <em>Many2many Helper</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMany2manyHelper()
	 * @generated
	 * @ordered
	 */
	protected TypeElement many2manyHelper;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssosiationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.ASSOSIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(RelationType newType) {
		RelationType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.ASSOSIATION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Link> getLinks() {
		if (links == null) {
			links = new EObjectContainmentEList<Link>(Link.class, this, DomainPackage.ASSOSIATION__LINKS);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getSourceProperty() {
		if (sourceProperty != null && sourceProperty.eIsProxy()) {
			InternalEObject oldSourceProperty = (InternalEObject)sourceProperty;
			sourceProperty = (Attribute)eResolveProxy(oldSourceProperty);
			if (sourceProperty != oldSourceProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.ASSOSIATION__SOURCE_PROPERTY, oldSourceProperty, sourceProperty));
			}
		}
		return sourceProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetSourceProperty() {
		return sourceProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceProperty(Attribute newSourceProperty) {
		Attribute oldSourceProperty = sourceProperty;
		sourceProperty = newSourceProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.ASSOSIATION__SOURCE_PROPERTY, oldSourceProperty, sourceProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getTargetProperty() {
		if (targetProperty != null && targetProperty.eIsProxy()) {
			InternalEObject oldTargetProperty = (InternalEObject)targetProperty;
			targetProperty = (Attribute)eResolveProxy(oldTargetProperty);
			if (targetProperty != oldTargetProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.ASSOSIATION__TARGET_PROPERTY, oldTargetProperty, targetProperty));
			}
		}
		return targetProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetTargetProperty() {
		return targetProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetProperty(Attribute newTargetProperty) {
		Attribute oldTargetProperty = targetProperty;
		targetProperty = newTargetProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.ASSOSIATION__TARGET_PROPERTY, oldTargetProperty, targetProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeElement getMany2manyHelper() {
		if (many2manyHelper != null && many2manyHelper.eIsProxy()) {
			InternalEObject oldMany2manyHelper = (InternalEObject)many2manyHelper;
			many2manyHelper = (TypeElement)eResolveProxy(oldMany2manyHelper);
			if (many2manyHelper != oldMany2manyHelper) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.ASSOSIATION__MANY2MANY_HELPER, oldMany2manyHelper, many2manyHelper));
			}
		}
		return many2manyHelper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeElement basicGetMany2manyHelper() {
		return many2manyHelper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMany2manyHelper(TypeElement newMany2manyHelper) {
		TypeElement oldMany2manyHelper = many2manyHelper;
		many2manyHelper = newMany2manyHelper;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.ASSOSIATION__MANY2MANY_HELPER, oldMany2manyHelper, many2manyHelper));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomainPackage.ASSOSIATION__LINKS:
				return ((InternalEList<?>)getLinks()).basicRemove(otherEnd, msgs);
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
			case DomainPackage.ASSOSIATION__TYPE:
				return getType();
			case DomainPackage.ASSOSIATION__LINKS:
				return getLinks();
			case DomainPackage.ASSOSIATION__SOURCE_PROPERTY:
				if (resolve) return getSourceProperty();
				return basicGetSourceProperty();
			case DomainPackage.ASSOSIATION__TARGET_PROPERTY:
				if (resolve) return getTargetProperty();
				return basicGetTargetProperty();
			case DomainPackage.ASSOSIATION__MANY2MANY_HELPER:
				if (resolve) return getMany2manyHelper();
				return basicGetMany2manyHelper();
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
			case DomainPackage.ASSOSIATION__TYPE:
				setType((RelationType)newValue);
				return;
			case DomainPackage.ASSOSIATION__LINKS:
				getLinks().clear();
				getLinks().addAll((Collection<? extends Link>)newValue);
				return;
			case DomainPackage.ASSOSIATION__SOURCE_PROPERTY:
				setSourceProperty((Attribute)newValue);
				return;
			case DomainPackage.ASSOSIATION__TARGET_PROPERTY:
				setTargetProperty((Attribute)newValue);
				return;
			case DomainPackage.ASSOSIATION__MANY2MANY_HELPER:
				setMany2manyHelper((TypeElement)newValue);
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
			case DomainPackage.ASSOSIATION__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case DomainPackage.ASSOSIATION__LINKS:
				getLinks().clear();
				return;
			case DomainPackage.ASSOSIATION__SOURCE_PROPERTY:
				setSourceProperty((Attribute)null);
				return;
			case DomainPackage.ASSOSIATION__TARGET_PROPERTY:
				setTargetProperty((Attribute)null);
				return;
			case DomainPackage.ASSOSIATION__MANY2MANY_HELPER:
				setMany2manyHelper((TypeElement)null);
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
			case DomainPackage.ASSOSIATION__TYPE:
				return type != TYPE_EDEFAULT;
			case DomainPackage.ASSOSIATION__LINKS:
				return links != null && !links.isEmpty();
			case DomainPackage.ASSOSIATION__SOURCE_PROPERTY:
				return sourceProperty != null;
			case DomainPackage.ASSOSIATION__TARGET_PROPERTY:
				return targetProperty != null;
			case DomainPackage.ASSOSIATION__MANY2MANY_HELPER:
				return many2manyHelper != null;
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
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //AssosiationImpl
