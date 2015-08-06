/**
 */
package domain.impl;

import domain.ActioinTriggers;
import domain.ActionTrigger;
import domain.DomainPackage;

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
 * An implementation of the model object '<em><b>Actioin Triggers</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link domain.impl.ActioinTriggersImpl#getTriggers <em>Triggers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActioinTriggersImpl extends EObjectImpl implements ActioinTriggers {
	/**
	 * The cached value of the '{@link #getTriggers() <em>Triggers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggers()
	 * @generated
	 * @ordered
	 */
	protected EList<ActionTrigger> triggers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActioinTriggersImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.ACTIOIN_TRIGGERS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActionTrigger> getTriggers() {
		if (triggers == null) {
			triggers = new EObjectContainmentEList<ActionTrigger>(ActionTrigger.class, this, DomainPackage.ACTIOIN_TRIGGERS__TRIGGERS);
		}
		return triggers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomainPackage.ACTIOIN_TRIGGERS__TRIGGERS:
				return ((InternalEList<?>)getTriggers()).basicRemove(otherEnd, msgs);
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
			case DomainPackage.ACTIOIN_TRIGGERS__TRIGGERS:
				return getTriggers();
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
			case DomainPackage.ACTIOIN_TRIGGERS__TRIGGERS:
				getTriggers().clear();
				getTriggers().addAll((Collection<? extends ActionTrigger>)newValue);
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
			case DomainPackage.ACTIOIN_TRIGGERS__TRIGGERS:
				getTriggers().clear();
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
			case DomainPackage.ACTIOIN_TRIGGERS__TRIGGERS:
				return triggers != null && !triggers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ActioinTriggersImpl
