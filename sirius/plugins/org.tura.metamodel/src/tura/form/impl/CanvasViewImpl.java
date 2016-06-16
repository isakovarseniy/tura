/**
 */
package tura.form.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tura.form.CanvasView;
import tura.form.FormPackage;
import tura.form.LayerHolder;
import tura.form.LinkToLabel;
import tura.form.LinkToMessage;
import tura.form.ViewArea;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Canvas View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tura.form.impl.CanvasViewImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link tura.form.impl.CanvasViewImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link tura.form.impl.CanvasViewImpl#getBaseCanvas <em>Base Canvas</em>}</li>
 *   <li>{@link tura.form.impl.CanvasViewImpl#getLinkToLabels <em>Link To Labels</em>}</li>
 *   <li>{@link tura.form.impl.CanvasViewImpl#getLinkToMessages <em>Link To Messages</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CanvasViewImpl extends MinimalEObjectImpl.Container implements CanvasView {
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
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected ViewArea parent;

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
	protected CanvasViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FormPackage.Literals.CANVAS_VIEW;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.CANVAS_VIEW__UID, oldUid, uid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewArea getParent() {
		if (parent != null && parent.eIsProxy()) {
			InternalEObject oldParent = (InternalEObject)parent;
			parent = (ViewArea)eResolveProxy(oldParent);
			if (parent != oldParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FormPackage.CANVAS_VIEW__PARENT, oldParent, parent));
			}
		}
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewArea basicGetParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(ViewArea newParent, NotificationChain msgs) {
		ViewArea oldParent = parent;
		parent = newParent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FormPackage.CANVAS_VIEW__PARENT, oldParent, newParent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(ViewArea newParent) {
		if (newParent != parent) {
			NotificationChain msgs = null;
			if (parent != null)
				msgs = ((InternalEObject)parent).eInverseRemove(this, FormPackage.VIEW_AREA__CANVAS_VIEW, ViewArea.class, msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, FormPackage.VIEW_AREA__CANVAS_VIEW, ViewArea.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.CANVAS_VIEW__PARENT, newParent, newParent));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FormPackage.CANVAS_VIEW__BASE_CANVAS, oldBaseCanvas, newBaseCanvas);
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
				msgs = ((InternalEObject)baseCanvas).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FormPackage.CANVAS_VIEW__BASE_CANVAS, null, msgs);
			if (newBaseCanvas != null)
				msgs = ((InternalEObject)newBaseCanvas).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FormPackage.CANVAS_VIEW__BASE_CANVAS, null, msgs);
			msgs = basicSetBaseCanvas(newBaseCanvas, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.CANVAS_VIEW__BASE_CANVAS, newBaseCanvas, newBaseCanvas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LinkToLabel> getLinkToLabels() {
		if (linkToLabels == null) {
			linkToLabels = new EObjectContainmentEList<LinkToLabel>(LinkToLabel.class, this, FormPackage.CANVAS_VIEW__LINK_TO_LABELS);
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
			linkToMessages = new EObjectContainmentEList<LinkToMessage>(LinkToMessage.class, this, FormPackage.CANVAS_VIEW__LINK_TO_MESSAGES);
		}
		return linkToMessages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FormPackage.CANVAS_VIEW__PARENT:
				if (parent != null)
					msgs = ((InternalEObject)parent).eInverseRemove(this, FormPackage.VIEW_AREA__CANVAS_VIEW, ViewArea.class, msgs);
				return basicSetParent((ViewArea)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FormPackage.CANVAS_VIEW__PARENT:
				return basicSetParent(null, msgs);
			case FormPackage.CANVAS_VIEW__BASE_CANVAS:
				return basicSetBaseCanvas(null, msgs);
			case FormPackage.CANVAS_VIEW__LINK_TO_LABELS:
				return ((InternalEList<?>)getLinkToLabels()).basicRemove(otherEnd, msgs);
			case FormPackage.CANVAS_VIEW__LINK_TO_MESSAGES:
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
			case FormPackage.CANVAS_VIEW__UID:
				return getUid();
			case FormPackage.CANVAS_VIEW__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case FormPackage.CANVAS_VIEW__BASE_CANVAS:
				return getBaseCanvas();
			case FormPackage.CANVAS_VIEW__LINK_TO_LABELS:
				return getLinkToLabels();
			case FormPackage.CANVAS_VIEW__LINK_TO_MESSAGES:
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
			case FormPackage.CANVAS_VIEW__UID:
				setUid((String)newValue);
				return;
			case FormPackage.CANVAS_VIEW__PARENT:
				setParent((ViewArea)newValue);
				return;
			case FormPackage.CANVAS_VIEW__BASE_CANVAS:
				setBaseCanvas((LayerHolder)newValue);
				return;
			case FormPackage.CANVAS_VIEW__LINK_TO_LABELS:
				getLinkToLabels().clear();
				getLinkToLabels().addAll((Collection<? extends LinkToLabel>)newValue);
				return;
			case FormPackage.CANVAS_VIEW__LINK_TO_MESSAGES:
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
			case FormPackage.CANVAS_VIEW__UID:
				setUid(UID_EDEFAULT);
				return;
			case FormPackage.CANVAS_VIEW__PARENT:
				setParent((ViewArea)null);
				return;
			case FormPackage.CANVAS_VIEW__BASE_CANVAS:
				setBaseCanvas((LayerHolder)null);
				return;
			case FormPackage.CANVAS_VIEW__LINK_TO_LABELS:
				getLinkToLabels().clear();
				return;
			case FormPackage.CANVAS_VIEW__LINK_TO_MESSAGES:
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
			case FormPackage.CANVAS_VIEW__UID:
				return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
			case FormPackage.CANVAS_VIEW__PARENT:
				return parent != null;
			case FormPackage.CANVAS_VIEW__BASE_CANVAS:
				return baseCanvas != null;
			case FormPackage.CANVAS_VIEW__LINK_TO_LABELS:
				return linkToLabels != null && !linkToLabels.isEmpty();
			case FormPackage.CANVAS_VIEW__LINK_TO_MESSAGES:
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (uid: ");
		result.append(uid);
		result.append(')');
		return result.toString();
	}

} //CanvasViewImpl
