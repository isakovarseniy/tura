/**
 */
package domain.impl;

import domain.DomainPackage;
import domain.ExpressionPart;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link domain.impl.ExpressionPartImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.impl.ExpressionPartImpl#getObjRef <em>Obj Ref</em>}</li>
 *   <li>{@link domain.impl.ExpressionPartImpl#getOrder <em>Order</em>}</li>
 *   <li>{@link domain.impl.ExpressionPartImpl#getExpressionType <em>Expression Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExpressionPartImpl extends EObjectImpl implements ExpressionPart {
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
	 * The cached value of the '{@link #getObjRef() <em>Obj Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjRef()
	 * @generated
	 * @ordered
	 */
	protected EObject objRef;

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
	 * The default value of the '{@link #getExpressionType() <em>Expression Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressionType()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPRESSION_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpressionType() <em>Expression Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressionType()
	 * @generated
	 * @ordered
	 */
	protected String expressionType = EXPRESSION_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpressionPartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.EXPRESSION_PART;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.EXPRESSION_PART__UID, oldUid, uid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getObjRef() {
		if (objRef != null && objRef.eIsProxy()) {
			InternalEObject oldObjRef = (InternalEObject)objRef;
			objRef = eResolveProxy(oldObjRef);
			if (objRef != oldObjRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.EXPRESSION_PART__OBJ_REF, oldObjRef, objRef));
			}
		}
		return objRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetObjRef() {
		return objRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjRef(EObject newObjRef) {
		EObject oldObjRef = objRef;
		objRef = newObjRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.EXPRESSION_PART__OBJ_REF, oldObjRef, objRef));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.EXPRESSION_PART__ORDER, oldOrder, order));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExpressionType() {
		return expressionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpressionType(String newExpressionType) {
		String oldExpressionType = expressionType;
		expressionType = newExpressionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.EXPRESSION_PART__EXPRESSION_TYPE, oldExpressionType, expressionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DomainPackage.EXPRESSION_PART__UID:
				return getUid();
			case DomainPackage.EXPRESSION_PART__OBJ_REF:
				if (resolve) return getObjRef();
				return basicGetObjRef();
			case DomainPackage.EXPRESSION_PART__ORDER:
				return getOrder();
			case DomainPackage.EXPRESSION_PART__EXPRESSION_TYPE:
				return getExpressionType();
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
			case DomainPackage.EXPRESSION_PART__UID:
				setUid((String)newValue);
				return;
			case DomainPackage.EXPRESSION_PART__OBJ_REF:
				setObjRef((EObject)newValue);
				return;
			case DomainPackage.EXPRESSION_PART__ORDER:
				setOrder((Integer)newValue);
				return;
			case DomainPackage.EXPRESSION_PART__EXPRESSION_TYPE:
				setExpressionType((String)newValue);
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
			case DomainPackage.EXPRESSION_PART__UID:
				setUid(UID_EDEFAULT);
				return;
			case DomainPackage.EXPRESSION_PART__OBJ_REF:
				setObjRef((EObject)null);
				return;
			case DomainPackage.EXPRESSION_PART__ORDER:
				setOrder(ORDER_EDEFAULT);
				return;
			case DomainPackage.EXPRESSION_PART__EXPRESSION_TYPE:
				setExpressionType(EXPRESSION_TYPE_EDEFAULT);
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
			case DomainPackage.EXPRESSION_PART__UID:
				return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
			case DomainPackage.EXPRESSION_PART__OBJ_REF:
				return objRef != null;
			case DomainPackage.EXPRESSION_PART__ORDER:
				return order != ORDER_EDEFAULT;
			case DomainPackage.EXPRESSION_PART__EXPRESSION_TYPE:
				return EXPRESSION_TYPE_EDEFAULT == null ? expressionType != null : !EXPRESSION_TYPE_EDEFAULT.equals(expressionType);
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
		result.append(", order: ");
		result.append(order);
		result.append(", expressionType: ");
		result.append(expressionType);
		result.append(')');
		return result.toString();
	}

} //ExpressionPartImpl
