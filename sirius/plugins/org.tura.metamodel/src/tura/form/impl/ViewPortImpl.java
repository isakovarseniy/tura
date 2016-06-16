/**
 */
package tura.form.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import tura.form.FormPackage;
import tura.form.Orderable;
import tura.form.ViewPort;
import tura.form.ViewPortTrigger;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tura.form.impl.ViewPortImpl#getOrder <em>Order</em>}</li>
 *   <li>{@link tura.form.impl.ViewPortImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link tura.form.impl.ViewPortImpl#getName <em>Name</em>}</li>
 *   <li>{@link tura.form.impl.ViewPortImpl#getViewPortTrigger <em>View Port Trigger</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ViewPortImpl extends ViewElementImpl implements ViewPort {
	/**
	 * The default value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected static final int ORDER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected int order = ORDER_EDEFAULT;

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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getViewPortTrigger() <em>View Port Trigger</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewPortTrigger()
	 * @generated
	 * @ordered
	 */
	protected ViewPortTrigger viewPortTrigger;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FormPackage.Literals.VIEW_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOrder() {
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrder(int newOrder) {
		int oldOrder = order;
		order = newOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.VIEW_PORT__ORDER, oldOrder, order));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.VIEW_PORT__UID, oldUid, uid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.VIEW_PORT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewPortTrigger getViewPortTrigger() {
		return viewPortTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetViewPortTrigger(ViewPortTrigger newViewPortTrigger, NotificationChain msgs) {
		ViewPortTrigger oldViewPortTrigger = viewPortTrigger;
		viewPortTrigger = newViewPortTrigger;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FormPackage.VIEW_PORT__VIEW_PORT_TRIGGER, oldViewPortTrigger, newViewPortTrigger);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setViewPortTrigger(ViewPortTrigger newViewPortTrigger) {
		if (newViewPortTrigger != viewPortTrigger) {
			NotificationChain msgs = null;
			if (viewPortTrigger != null)
				msgs = ((InternalEObject)viewPortTrigger).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FormPackage.VIEW_PORT__VIEW_PORT_TRIGGER, null, msgs);
			if (newViewPortTrigger != null)
				msgs = ((InternalEObject)newViewPortTrigger).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FormPackage.VIEW_PORT__VIEW_PORT_TRIGGER, null, msgs);
			msgs = basicSetViewPortTrigger(newViewPortTrigger, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.VIEW_PORT__VIEW_PORT_TRIGGER, newViewPortTrigger, newViewPortTrigger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FormPackage.VIEW_PORT__VIEW_PORT_TRIGGER:
				return basicSetViewPortTrigger(null, msgs);
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
			case FormPackage.VIEW_PORT__ORDER:
				return getOrder();
			case FormPackage.VIEW_PORT__UID:
				return getUid();
			case FormPackage.VIEW_PORT__NAME:
				return getName();
			case FormPackage.VIEW_PORT__VIEW_PORT_TRIGGER:
				return getViewPortTrigger();
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
			case FormPackage.VIEW_PORT__ORDER:
				setOrder((Integer)newValue);
				return;
			case FormPackage.VIEW_PORT__UID:
				setUid((String)newValue);
				return;
			case FormPackage.VIEW_PORT__NAME:
				setName((String)newValue);
				return;
			case FormPackage.VIEW_PORT__VIEW_PORT_TRIGGER:
				setViewPortTrigger((ViewPortTrigger)newValue);
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
			case FormPackage.VIEW_PORT__ORDER:
				setOrder(ORDER_EDEFAULT);
				return;
			case FormPackage.VIEW_PORT__UID:
				setUid(UID_EDEFAULT);
				return;
			case FormPackage.VIEW_PORT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FormPackage.VIEW_PORT__VIEW_PORT_TRIGGER:
				setViewPortTrigger((ViewPortTrigger)null);
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
			case FormPackage.VIEW_PORT__ORDER:
				return order != ORDER_EDEFAULT;
			case FormPackage.VIEW_PORT__UID:
				return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
			case FormPackage.VIEW_PORT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FormPackage.VIEW_PORT__VIEW_PORT_TRIGGER:
				return viewPortTrigger != null;
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
		if (baseClass == Orderable.class) {
			switch (derivedFeatureID) {
				case FormPackage.VIEW_PORT__ORDER: return FormPackage.ORDERABLE__ORDER;
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
		if (baseClass == Orderable.class) {
			switch (baseFeatureID) {
				case FormPackage.ORDERABLE__ORDER: return FormPackage.VIEW_PORT__ORDER;
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
		result.append(" (order: ");
		result.append(order);
		result.append(", uid: ");
		result.append(uid);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ViewPortImpl
