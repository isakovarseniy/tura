/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

/**
 */
package objectmapper.impl;

import form.ContextParameters;
import objectmapper.AttributeConnector;
import objectmapper.ObjectmapperPackage;

import objectmapper.OperationConnector;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import type.Attribute;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link objectmapper.impl.AttributeConnectorImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link objectmapper.impl.AttributeConnectorImpl#getSource <em>Source</em>}</li>
 *   <li>{@link objectmapper.impl.AttributeConnectorImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link objectmapper.impl.AttributeConnectorImpl#isMergeAttr <em>Merge Attr</em>}</li>
 *   <li>{@link objectmapper.impl.AttributeConnectorImpl#getDefaultSearch <em>Default Search</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeConnectorImpl extends OperationConnectorRefImpl implements AttributeConnector {
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
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected EObject source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected EObject target;

	/**
	 * The default value of the '{@link #isMergeAttr() <em>Merge Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMergeAttr()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MERGE_ATTR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMergeAttr() <em>Merge Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMergeAttr()
	 * @generated
	 * @ordered
	 */
	protected boolean mergeAttr = MERGE_ATTR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDefaultSearch() <em>Default Search</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultSearch()
	 * @generated
	 * @ordered
	 */
	protected ContextParameters defaultSearch;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ObjectmapperPackage.Literals.ATTRIBUTE_CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUid() {
		return uid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUid(String newUid) {
		String oldUid = uid;
		uid = newUid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ObjectmapperPackage.ATTRIBUTE_CONNECTOR__UID, oldUid, uid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ObjectmapperPackage.ATTRIBUTE_CONNECTOR__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(EObject newSource) {
		EObject oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ObjectmapperPackage.ATTRIBUTE_CONNECTOR__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ObjectmapperPackage.ATTRIBUTE_CONNECTOR__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(EObject newTarget) {
		EObject oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ObjectmapperPackage.ATTRIBUTE_CONNECTOR__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isMergeAttr() {
		return mergeAttr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMergeAttr(boolean newMergeAttr) {
		boolean oldMergeAttr = mergeAttr;
		mergeAttr = newMergeAttr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ObjectmapperPackage.ATTRIBUTE_CONNECTOR__MERGE_ATTR, oldMergeAttr, mergeAttr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContextParameters getDefaultSearch() {
		return defaultSearch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultSearch(ContextParameters newDefaultSearch, NotificationChain msgs) {
		ContextParameters oldDefaultSearch = defaultSearch;
		defaultSearch = newDefaultSearch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ObjectmapperPackage.ATTRIBUTE_CONNECTOR__DEFAULT_SEARCH, oldDefaultSearch, newDefaultSearch);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultSearch(ContextParameters newDefaultSearch) {
		if (newDefaultSearch != defaultSearch) {
			NotificationChain msgs = null;
			if (defaultSearch != null)
				msgs = ((InternalEObject)defaultSearch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ObjectmapperPackage.ATTRIBUTE_CONNECTOR__DEFAULT_SEARCH, null, msgs);
			if (newDefaultSearch != null)
				msgs = ((InternalEObject)newDefaultSearch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ObjectmapperPackage.ATTRIBUTE_CONNECTOR__DEFAULT_SEARCH, null, msgs);
			msgs = basicSetDefaultSearch(newDefaultSearch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ObjectmapperPackage.ATTRIBUTE_CONNECTOR__DEFAULT_SEARCH, newDefaultSearch, newDefaultSearch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ObjectmapperPackage.ATTRIBUTE_CONNECTOR__DEFAULT_SEARCH:
				return basicSetDefaultSearch(null, msgs);
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
			case ObjectmapperPackage.ATTRIBUTE_CONNECTOR__UID:
				return getUid();
			case ObjectmapperPackage.ATTRIBUTE_CONNECTOR__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case ObjectmapperPackage.ATTRIBUTE_CONNECTOR__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case ObjectmapperPackage.ATTRIBUTE_CONNECTOR__MERGE_ATTR:
				return isMergeAttr();
			case ObjectmapperPackage.ATTRIBUTE_CONNECTOR__DEFAULT_SEARCH:
				return getDefaultSearch();
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
			case ObjectmapperPackage.ATTRIBUTE_CONNECTOR__UID:
				setUid((String)newValue);
				return;
			case ObjectmapperPackage.ATTRIBUTE_CONNECTOR__SOURCE:
				setSource((EObject)newValue);
				return;
			case ObjectmapperPackage.ATTRIBUTE_CONNECTOR__TARGET:
				setTarget((EObject)newValue);
				return;
			case ObjectmapperPackage.ATTRIBUTE_CONNECTOR__MERGE_ATTR:
				setMergeAttr((Boolean)newValue);
				return;
			case ObjectmapperPackage.ATTRIBUTE_CONNECTOR__DEFAULT_SEARCH:
				setDefaultSearch((ContextParameters)newValue);
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
			case ObjectmapperPackage.ATTRIBUTE_CONNECTOR__UID:
				setUid(UID_EDEFAULT);
				return;
			case ObjectmapperPackage.ATTRIBUTE_CONNECTOR__SOURCE:
				setSource((EObject)null);
				return;
			case ObjectmapperPackage.ATTRIBUTE_CONNECTOR__TARGET:
				setTarget((EObject)null);
				return;
			case ObjectmapperPackage.ATTRIBUTE_CONNECTOR__MERGE_ATTR:
				setMergeAttr(MERGE_ATTR_EDEFAULT);
				return;
			case ObjectmapperPackage.ATTRIBUTE_CONNECTOR__DEFAULT_SEARCH:
				setDefaultSearch((ContextParameters)null);
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
			case ObjectmapperPackage.ATTRIBUTE_CONNECTOR__UID:
				return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
			case ObjectmapperPackage.ATTRIBUTE_CONNECTOR__SOURCE:
				return source != null;
			case ObjectmapperPackage.ATTRIBUTE_CONNECTOR__TARGET:
				return target != null;
			case ObjectmapperPackage.ATTRIBUTE_CONNECTOR__MERGE_ATTR:
				return mergeAttr != MERGE_ATTR_EDEFAULT;
			case ObjectmapperPackage.ATTRIBUTE_CONNECTOR__DEFAULT_SEARCH:
				return defaultSearch != null;
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (uid: ");
		result.append(uid);
		result.append(", mergeAttr: ");
		result.append(mergeAttr);
		result.append(')');
		return result.toString();
	}

} //AttributeConnectorImpl
