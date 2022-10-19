/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2022 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
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
package type.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import type.Assosiation;
import type.Containment;
import type.Link;
import type.RelationType;
import type.TypePackage;
import type.TypePointer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assosiation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link type.impl.AssosiationImpl#getType <em>Type</em>}</li>
 *   <li>{@link type.impl.AssosiationImpl#getContainment <em>Containment</em>}</li>
 *   <li>{@link type.impl.AssosiationImpl#isInternal <em>Internal</em>}</li>
 *   <li>{@link type.impl.AssosiationImpl#isLazy <em>Lazy</em>}</li>
 *   <li>{@link type.impl.AssosiationImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link type.impl.AssosiationImpl#getSourceOperation <em>Source Operation</em>}</li>
 *   <li>{@link type.impl.AssosiationImpl#getTargetOperation <em>Target Operation</em>}</li>
 *   <li>{@link type.impl.AssosiationImpl#getMany2manyHelper <em>Many2many Helper</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssosiationImpl extends RelationshipImpl implements Assosiation {
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
	 * The default value of the '{@link #getContainment() <em>Containment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainment()
	 * @generated
	 * @ordered
	 */
	protected static final Containment CONTAINMENT_EDEFAULT = Containment.SOURCE;

	/**
	 * The cached value of the '{@link #getContainment() <em>Containment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainment()
	 * @generated
	 * @ordered
	 */
	protected Containment containment = CONTAINMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #isInternal() <em>Internal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInternal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INTERNAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInternal() <em>Internal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInternal()
	 * @generated
	 * @ordered
	 */
	protected boolean internal = INTERNAL_EDEFAULT;

	/**
	 * The default value of the '{@link #isLazy() <em>Lazy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLazy()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LAZY_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isLazy() <em>Lazy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLazy()
	 * @generated
	 * @ordered
	 */
	protected boolean lazy = LAZY_EDEFAULT;

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
	 * The default value of the '{@link #getSourceOperation() <em>Source Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceOperation()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_OPERATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceOperation() <em>Source Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceOperation()
	 * @generated
	 * @ordered
	 */
	protected String sourceOperation = SOURCE_OPERATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetOperation() <em>Target Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetOperation()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_OPERATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetOperation() <em>Target Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetOperation()
	 * @generated
	 * @ordered
	 */
	protected String targetOperation = TARGET_OPERATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMany2manyHelper() <em>Many2many Helper</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMany2manyHelper()
	 * @generated
	 * @ordered
	 */
	protected TypePointer many2manyHelper;

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
		return TypePackage.Literals.ASSOSIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelationType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(RelationType newType) {
		RelationType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.ASSOSIATION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Containment getContainment() {
		return containment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContainment(Containment newContainment) {
		Containment oldContainment = containment;
		containment = newContainment == null ? CONTAINMENT_EDEFAULT : newContainment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.ASSOSIATION__CONTAINMENT, oldContainment, containment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isInternal() {
		return internal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternal(boolean newInternal) {
		boolean oldInternal = internal;
		internal = newInternal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.ASSOSIATION__INTERNAL, oldInternal, internal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isLazy() {
		return lazy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLazy(boolean newLazy) {
		boolean oldLazy = lazy;
		lazy = newLazy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.ASSOSIATION__LAZY, oldLazy, lazy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Link> getLinks() {
		if (links == null) {
			links = new EObjectContainmentEList<Link>(Link.class, this, TypePackage.ASSOSIATION__LINKS);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSourceOperation() {
		return sourceOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceOperation(String newSourceOperation) {
		String oldSourceOperation = sourceOperation;
		sourceOperation = newSourceOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.ASSOSIATION__SOURCE_OPERATION, oldSourceOperation, sourceOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTargetOperation() {
		return targetOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetOperation(String newTargetOperation) {
		String oldTargetOperation = targetOperation;
		targetOperation = newTargetOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.ASSOSIATION__TARGET_OPERATION, oldTargetOperation, targetOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypePointer getMany2manyHelper() {
		return many2manyHelper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMany2manyHelper(TypePointer newMany2manyHelper, NotificationChain msgs) {
		TypePointer oldMany2manyHelper = many2manyHelper;
		many2manyHelper = newMany2manyHelper;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypePackage.ASSOSIATION__MANY2MANY_HELPER, oldMany2manyHelper, newMany2manyHelper);
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
	public void setMany2manyHelper(TypePointer newMany2manyHelper) {
		if (newMany2manyHelper != many2manyHelper) {
			NotificationChain msgs = null;
			if (many2manyHelper != null)
				msgs = ((InternalEObject)many2manyHelper).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypePackage.ASSOSIATION__MANY2MANY_HELPER, null, msgs);
			if (newMany2manyHelper != null)
				msgs = ((InternalEObject)newMany2manyHelper).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypePackage.ASSOSIATION__MANY2MANY_HELPER, null, msgs);
			msgs = basicSetMany2manyHelper(newMany2manyHelper, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.ASSOSIATION__MANY2MANY_HELPER, newMany2manyHelper, newMany2manyHelper));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypePackage.ASSOSIATION__LINKS:
				return ((InternalEList<?>)getLinks()).basicRemove(otherEnd, msgs);
			case TypePackage.ASSOSIATION__MANY2MANY_HELPER:
				return basicSetMany2manyHelper(null, msgs);
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
			case TypePackage.ASSOSIATION__TYPE:
				return getType();
			case TypePackage.ASSOSIATION__CONTAINMENT:
				return getContainment();
			case TypePackage.ASSOSIATION__INTERNAL:
				return isInternal();
			case TypePackage.ASSOSIATION__LAZY:
				return isLazy();
			case TypePackage.ASSOSIATION__LINKS:
				return getLinks();
			case TypePackage.ASSOSIATION__SOURCE_OPERATION:
				return getSourceOperation();
			case TypePackage.ASSOSIATION__TARGET_OPERATION:
				return getTargetOperation();
			case TypePackage.ASSOSIATION__MANY2MANY_HELPER:
				return getMany2manyHelper();
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
			case TypePackage.ASSOSIATION__TYPE:
				setType((RelationType)newValue);
				return;
			case TypePackage.ASSOSIATION__CONTAINMENT:
				setContainment((Containment)newValue);
				return;
			case TypePackage.ASSOSIATION__INTERNAL:
				setInternal((Boolean)newValue);
				return;
			case TypePackage.ASSOSIATION__LAZY:
				setLazy((Boolean)newValue);
				return;
			case TypePackage.ASSOSIATION__LINKS:
				getLinks().clear();
				getLinks().addAll((Collection<? extends Link>)newValue);
				return;
			case TypePackage.ASSOSIATION__SOURCE_OPERATION:
				setSourceOperation((String)newValue);
				return;
			case TypePackage.ASSOSIATION__TARGET_OPERATION:
				setTargetOperation((String)newValue);
				return;
			case TypePackage.ASSOSIATION__MANY2MANY_HELPER:
				setMany2manyHelper((TypePointer)newValue);
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
			case TypePackage.ASSOSIATION__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case TypePackage.ASSOSIATION__CONTAINMENT:
				setContainment(CONTAINMENT_EDEFAULT);
				return;
			case TypePackage.ASSOSIATION__INTERNAL:
				setInternal(INTERNAL_EDEFAULT);
				return;
			case TypePackage.ASSOSIATION__LAZY:
				setLazy(LAZY_EDEFAULT);
				return;
			case TypePackage.ASSOSIATION__LINKS:
				getLinks().clear();
				return;
			case TypePackage.ASSOSIATION__SOURCE_OPERATION:
				setSourceOperation(SOURCE_OPERATION_EDEFAULT);
				return;
			case TypePackage.ASSOSIATION__TARGET_OPERATION:
				setTargetOperation(TARGET_OPERATION_EDEFAULT);
				return;
			case TypePackage.ASSOSIATION__MANY2MANY_HELPER:
				setMany2manyHelper((TypePointer)null);
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
			case TypePackage.ASSOSIATION__TYPE:
				return type != TYPE_EDEFAULT;
			case TypePackage.ASSOSIATION__CONTAINMENT:
				return containment != CONTAINMENT_EDEFAULT;
			case TypePackage.ASSOSIATION__INTERNAL:
				return internal != INTERNAL_EDEFAULT;
			case TypePackage.ASSOSIATION__LAZY:
				return lazy != LAZY_EDEFAULT;
			case TypePackage.ASSOSIATION__LINKS:
				return links != null && !links.isEmpty();
			case TypePackage.ASSOSIATION__SOURCE_OPERATION:
				return SOURCE_OPERATION_EDEFAULT == null ? sourceOperation != null : !SOURCE_OPERATION_EDEFAULT.equals(sourceOperation);
			case TypePackage.ASSOSIATION__TARGET_OPERATION:
				return TARGET_OPERATION_EDEFAULT == null ? targetOperation != null : !TARGET_OPERATION_EDEFAULT.equals(targetOperation);
			case TypePackage.ASSOSIATION__MANY2MANY_HELPER:
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (type: ");
		result.append(type);
		result.append(", containment: ");
		result.append(containment);
		result.append(", internal: ");
		result.append(internal);
		result.append(", lazy: ");
		result.append(lazy);
		result.append(", sourceOperation: ");
		result.append(sourceOperation);
		result.append(", targetOperation: ");
		result.append(targetOperation);
		result.append(')');
		return result.toString();
	}

} //AssosiationImpl
