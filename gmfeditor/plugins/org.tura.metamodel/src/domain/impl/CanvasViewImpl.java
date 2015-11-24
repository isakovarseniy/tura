/*******************************************************************************
 * Tura - application generation platform
 *
 * Copyright (c) 2012, 2015, Arseniy Isakov
 *  
 * This project includes software developed by Arseniy Isakov
 * http://sourceforge.net/p/tura/wiki/Home/
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
/**
 */
package domain.impl;

import domain.CanvasView;
import domain.DomainPackage;
import domain.LayerHolder;
import domain.LinkToLabel;
import domain.LinkToMessage;
import domain.ViewArea;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Canvas View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link domain.impl.CanvasViewImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.impl.CanvasViewImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link domain.impl.CanvasViewImpl#getBaseCanvas <em>Base Canvas</em>}</li>
 *   <li>{@link domain.impl.CanvasViewImpl#getLinkToLabels <em>Link To Labels</em>}</li>
 *   <li>{@link domain.impl.CanvasViewImpl#getLinkToMessages <em>Link To Messages</em>}</li>
 *   <li>{@link domain.impl.CanvasViewImpl#getAny <em>Any</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CanvasViewImpl extends EObjectImpl implements CanvasView {
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
	 * The cached value of the '{@link #getAny() <em>Any</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAny()
	 * @generated
	 * @ordered
	 */
	protected EObject any;

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
		return DomainPackage.Literals.CANVAS_VIEW;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.CANVAS_VIEW__UID, oldUid, uid));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.CANVAS_VIEW__PARENT, oldParent, parent));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.CANVAS_VIEW__PARENT, oldParent, newParent);
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
				msgs = ((InternalEObject)parent).eInverseRemove(this, DomainPackage.VIEW_AREA__CANVAS_VIEW, ViewArea.class, msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, DomainPackage.VIEW_AREA__CANVAS_VIEW, ViewArea.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.CANVAS_VIEW__PARENT, newParent, newParent));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.CANVAS_VIEW__BASE_CANVAS, oldBaseCanvas, newBaseCanvas);
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
				msgs = ((InternalEObject)baseCanvas).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.CANVAS_VIEW__BASE_CANVAS, null, msgs);
			if (newBaseCanvas != null)
				msgs = ((InternalEObject)newBaseCanvas).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainPackage.CANVAS_VIEW__BASE_CANVAS, null, msgs);
			msgs = basicSetBaseCanvas(newBaseCanvas, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.CANVAS_VIEW__BASE_CANVAS, newBaseCanvas, newBaseCanvas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LinkToLabel> getLinkToLabels() {
		if (linkToLabels == null) {
			linkToLabels = new EObjectContainmentEList<LinkToLabel>(LinkToLabel.class, this, DomainPackage.CANVAS_VIEW__LINK_TO_LABELS);
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
			linkToMessages = new EObjectContainmentEList<LinkToMessage>(LinkToMessage.class, this, DomainPackage.CANVAS_VIEW__LINK_TO_MESSAGES);
		}
		return linkToMessages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getAny() {
		return any;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAny(EObject newAny, NotificationChain msgs) {
		EObject oldAny = any;
		any = newAny;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.CANVAS_VIEW__ANY, oldAny, newAny);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAny(EObject newAny) {
		if (newAny != any) {
			NotificationChain msgs = null;
			if (any != null)
				msgs = ((InternalEObject)any).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.CANVAS_VIEW__ANY, null, msgs);
			if (newAny != null)
				msgs = ((InternalEObject)newAny).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainPackage.CANVAS_VIEW__ANY, null, msgs);
			msgs = basicSetAny(newAny, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.CANVAS_VIEW__ANY, newAny, newAny));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomainPackage.CANVAS_VIEW__PARENT:
				if (parent != null)
					msgs = ((InternalEObject)parent).eInverseRemove(this, DomainPackage.VIEW_AREA__CANVAS_VIEW, ViewArea.class, msgs);
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
			case DomainPackage.CANVAS_VIEW__PARENT:
				return basicSetParent(null, msgs);
			case DomainPackage.CANVAS_VIEW__BASE_CANVAS:
				return basicSetBaseCanvas(null, msgs);
			case DomainPackage.CANVAS_VIEW__LINK_TO_LABELS:
				return ((InternalEList<?>)getLinkToLabels()).basicRemove(otherEnd, msgs);
			case DomainPackage.CANVAS_VIEW__LINK_TO_MESSAGES:
				return ((InternalEList<?>)getLinkToMessages()).basicRemove(otherEnd, msgs);
			case DomainPackage.CANVAS_VIEW__ANY:
				return basicSetAny(null, msgs);
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
			case DomainPackage.CANVAS_VIEW__UID:
				return getUid();
			case DomainPackage.CANVAS_VIEW__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case DomainPackage.CANVAS_VIEW__BASE_CANVAS:
				return getBaseCanvas();
			case DomainPackage.CANVAS_VIEW__LINK_TO_LABELS:
				return getLinkToLabels();
			case DomainPackage.CANVAS_VIEW__LINK_TO_MESSAGES:
				return getLinkToMessages();
			case DomainPackage.CANVAS_VIEW__ANY:
				return getAny();
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
			case DomainPackage.CANVAS_VIEW__UID:
				setUid((String)newValue);
				return;
			case DomainPackage.CANVAS_VIEW__PARENT:
				setParent((ViewArea)newValue);
				return;
			case DomainPackage.CANVAS_VIEW__BASE_CANVAS:
				setBaseCanvas((LayerHolder)newValue);
				return;
			case DomainPackage.CANVAS_VIEW__LINK_TO_LABELS:
				getLinkToLabels().clear();
				getLinkToLabels().addAll((Collection<? extends LinkToLabel>)newValue);
				return;
			case DomainPackage.CANVAS_VIEW__LINK_TO_MESSAGES:
				getLinkToMessages().clear();
				getLinkToMessages().addAll((Collection<? extends LinkToMessage>)newValue);
				return;
			case DomainPackage.CANVAS_VIEW__ANY:
				setAny((EObject)newValue);
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
			case DomainPackage.CANVAS_VIEW__UID:
				setUid(UID_EDEFAULT);
				return;
			case DomainPackage.CANVAS_VIEW__PARENT:
				setParent((ViewArea)null);
				return;
			case DomainPackage.CANVAS_VIEW__BASE_CANVAS:
				setBaseCanvas((LayerHolder)null);
				return;
			case DomainPackage.CANVAS_VIEW__LINK_TO_LABELS:
				getLinkToLabels().clear();
				return;
			case DomainPackage.CANVAS_VIEW__LINK_TO_MESSAGES:
				getLinkToMessages().clear();
				return;
			case DomainPackage.CANVAS_VIEW__ANY:
				setAny((EObject)null);
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
			case DomainPackage.CANVAS_VIEW__UID:
				return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
			case DomainPackage.CANVAS_VIEW__PARENT:
				return parent != null;
			case DomainPackage.CANVAS_VIEW__BASE_CANVAS:
				return baseCanvas != null;
			case DomainPackage.CANVAS_VIEW__LINK_TO_LABELS:
				return linkToLabels != null && !linkToLabels.isEmpty();
			case DomainPackage.CANVAS_VIEW__LINK_TO_MESSAGES:
				return linkToMessages != null && !linkToMessages.isEmpty();
			case DomainPackage.CANVAS_VIEW__ANY:
				return any != null;
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
