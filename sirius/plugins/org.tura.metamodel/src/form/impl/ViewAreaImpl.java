/**
 */
package form.impl;

import form.FormPackage;
import form.LayerHolder;
import form.LinkToLabel;
import form.LinkToMessage;
import form.Orderable;
import form.ViewArea;

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
 * An implementation of the model object '<em><b>View Area</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link form.impl.ViewAreaImpl#getOrder <em>Order</em>}</li>
 *   <li>{@link form.impl.ViewAreaImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link form.impl.ViewAreaImpl#getName <em>Name</em>}</li>
 *   <li>{@link form.impl.ViewAreaImpl#getBaseCanvas <em>Base Canvas</em>}</li>
 *   <li>{@link form.impl.ViewAreaImpl#getLinkToLabels <em>Link To Labels</em>}</li>
 *   <li>{@link form.impl.ViewAreaImpl#getLinkToMessages <em>Link To Messages</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ViewAreaImpl extends ViewElementImpl implements ViewArea {
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
	 * The cached value of the '{@link #getBaseCanvas() <em>Base Canvas</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseCanvas()
	 * @generated
	 * @ordered
	 */
	protected LayerHolder baseCanvas;

	/**
	 * The cached value of the '{@link #getLinkToLabels() <em>Link To Labels</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkToLabels()
	 * @generated
	 * @ordered
	 */
	protected EList<LinkToLabel> linkToLabels;

	/**
	 * The cached value of the '{@link #getLinkToMessages() <em>Link To Messages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkToMessages()
	 * @generated
	 * @ordered
	 */
	protected EList<LinkToMessage> linkToMessages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewAreaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FormPackage.Literals.VIEW_AREA;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.VIEW_AREA__ORDER, oldOrder, order));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.VIEW_AREA__UID, oldUid, uid));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.VIEW_AREA__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayerHolder getBaseCanvas() {
		return baseCanvas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBaseCanvas(LayerHolder newBaseCanvas, NotificationChain msgs) {
		LayerHolder oldBaseCanvas = baseCanvas;
		baseCanvas = newBaseCanvas;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FormPackage.VIEW_AREA__BASE_CANVAS, oldBaseCanvas, newBaseCanvas);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseCanvas(LayerHolder newBaseCanvas) {
		if (newBaseCanvas != baseCanvas) {
			NotificationChain msgs = null;
			if (baseCanvas != null)
				msgs = ((InternalEObject)baseCanvas).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FormPackage.VIEW_AREA__BASE_CANVAS, null, msgs);
			if (newBaseCanvas != null)
				msgs = ((InternalEObject)newBaseCanvas).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FormPackage.VIEW_AREA__BASE_CANVAS, null, msgs);
			msgs = basicSetBaseCanvas(newBaseCanvas, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.VIEW_AREA__BASE_CANVAS, newBaseCanvas, newBaseCanvas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LinkToLabel> getLinkToLabels() {
		if (linkToLabels == null) {
			linkToLabels = new EObjectContainmentEList<LinkToLabel>(LinkToLabel.class, this, FormPackage.VIEW_AREA__LINK_TO_LABELS);
		}
		return linkToLabels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LinkToMessage> getLinkToMessages() {
		if (linkToMessages == null) {
			linkToMessages = new EObjectContainmentEList<LinkToMessage>(LinkToMessage.class, this, FormPackage.VIEW_AREA__LINK_TO_MESSAGES);
		}
		return linkToMessages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FormPackage.VIEW_AREA__BASE_CANVAS:
				return basicSetBaseCanvas(null, msgs);
			case FormPackage.VIEW_AREA__LINK_TO_LABELS:
				return ((InternalEList<?>)getLinkToLabels()).basicRemove(otherEnd, msgs);
			case FormPackage.VIEW_AREA__LINK_TO_MESSAGES:
				return ((InternalEList<?>)getLinkToMessages()).basicRemove(otherEnd, msgs);
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
			case FormPackage.VIEW_AREA__ORDER:
				return getOrder();
			case FormPackage.VIEW_AREA__UID:
				return getUid();
			case FormPackage.VIEW_AREA__NAME:
				return getName();
			case FormPackage.VIEW_AREA__BASE_CANVAS:
				return getBaseCanvas();
			case FormPackage.VIEW_AREA__LINK_TO_LABELS:
				return getLinkToLabels();
			case FormPackage.VIEW_AREA__LINK_TO_MESSAGES:
				return getLinkToMessages();
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
			case FormPackage.VIEW_AREA__ORDER:
				setOrder((Integer)newValue);
				return;
			case FormPackage.VIEW_AREA__UID:
				setUid((String)newValue);
				return;
			case FormPackage.VIEW_AREA__NAME:
				setName((String)newValue);
				return;
			case FormPackage.VIEW_AREA__BASE_CANVAS:
				setBaseCanvas((LayerHolder)newValue);
				return;
			case FormPackage.VIEW_AREA__LINK_TO_LABELS:
				getLinkToLabels().clear();
				getLinkToLabels().addAll((Collection<? extends LinkToLabel>)newValue);
				return;
			case FormPackage.VIEW_AREA__LINK_TO_MESSAGES:
				getLinkToMessages().clear();
				getLinkToMessages().addAll((Collection<? extends LinkToMessage>)newValue);
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
			case FormPackage.VIEW_AREA__ORDER:
				setOrder(ORDER_EDEFAULT);
				return;
			case FormPackage.VIEW_AREA__UID:
				setUid(UID_EDEFAULT);
				return;
			case FormPackage.VIEW_AREA__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FormPackage.VIEW_AREA__BASE_CANVAS:
				setBaseCanvas((LayerHolder)null);
				return;
			case FormPackage.VIEW_AREA__LINK_TO_LABELS:
				getLinkToLabels().clear();
				return;
			case FormPackage.VIEW_AREA__LINK_TO_MESSAGES:
				getLinkToMessages().clear();
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
			case FormPackage.VIEW_AREA__ORDER:
				return order != ORDER_EDEFAULT;
			case FormPackage.VIEW_AREA__UID:
				return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
			case FormPackage.VIEW_AREA__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FormPackage.VIEW_AREA__BASE_CANVAS:
				return baseCanvas != null;
			case FormPackage.VIEW_AREA__LINK_TO_LABELS:
				return linkToLabels != null && !linkToLabels.isEmpty();
			case FormPackage.VIEW_AREA__LINK_TO_MESSAGES:
				return linkToMessages != null && !linkToMessages.isEmpty();
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
				case FormPackage.VIEW_AREA__ORDER: return FormPackage.ORDERABLE__ORDER;
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
				case FormPackage.ORDERABLE__ORDER: return FormPackage.VIEW_AREA__ORDER;
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

} //ViewAreaImpl
