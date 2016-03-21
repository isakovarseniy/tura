/**
 */
package domain.impl;

import domain.DomainPackage;
import domain.ProxiesList;
import domain.TypePointer;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Proxies List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link domain.impl.ProxiesListImpl#getTypePointers <em>Type Pointers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProxiesListImpl extends EObjectImpl implements ProxiesList {
	/**
	 * The cached value of the '{@link #getTypePointers() <em>Type Pointers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypePointers()
	 * @generated
	 * @ordered
	 */
	protected EList<TypePointer> typePointers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProxiesListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.PROXIES_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypePointer> getTypePointers() {
		if (typePointers == null) {
			typePointers = new EObjectContainmentEList<TypePointer>(TypePointer.class, this, DomainPackage.PROXIES_LIST__TYPE_POINTERS);
		}
		return typePointers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomainPackage.PROXIES_LIST__TYPE_POINTERS:
				return ((InternalEList<?>)getTypePointers()).basicRemove(otherEnd, msgs);
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
			case DomainPackage.PROXIES_LIST__TYPE_POINTERS:
				return getTypePointers();
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
			case DomainPackage.PROXIES_LIST__TYPE_POINTERS:
				getTypePointers().clear();
				getTypePointers().addAll((Collection<? extends TypePointer>)newValue);
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
			case DomainPackage.PROXIES_LIST__TYPE_POINTERS:
				getTypePointers().clear();
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
			case DomainPackage.PROXIES_LIST__TYPE_POINTERS:
				return typePointers != null && !typePointers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProxiesListImpl
