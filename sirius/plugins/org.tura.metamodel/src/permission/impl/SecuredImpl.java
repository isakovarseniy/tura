/**
 */
package permission.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import permission.GrantAccess;
import permission.PermissionPackage;
import permission.Secured;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Secured</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link permission.impl.SecuredImpl#getGrants <em>Grants</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecuredImpl extends EObjectImpl implements Secured {
	/**
	 * The cached value of the '{@link #getGrants() <em>Grants</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrants()
	 * @generated
	 * @ordered
	 */
	protected EList<GrantAccess> grants;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecuredImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PermissionPackage.Literals.SECURED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GrantAccess> getGrants() {
		if (grants == null) {
			grants = new EObjectContainmentEList<GrantAccess>(GrantAccess.class, this, PermissionPackage.SECURED__GRANTS);
		}
		return grants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PermissionPackage.SECURED__GRANTS:
				return ((InternalEList<?>)getGrants()).basicRemove(otherEnd, msgs);
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
			case PermissionPackage.SECURED__GRANTS:
				return getGrants();
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
			case PermissionPackage.SECURED__GRANTS:
				getGrants().clear();
				getGrants().addAll((Collection<? extends GrantAccess>)newValue);
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
			case PermissionPackage.SECURED__GRANTS:
				getGrants().clear();
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
			case PermissionPackage.SECURED__GRANTS:
				return grants != null && !grants.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SecuredImpl
