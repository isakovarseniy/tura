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

import domain.DomainPackage;
import domain.InfrastructureComponent;
import domain.InfrastructureLayer;
import domain.Subsystem;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Infrastructure Layer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link domain.impl.InfrastructureLayerImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.impl.InfrastructureLayerImpl#getName <em>Name</em>}</li>
 *   <li>{@link domain.impl.InfrastructureLayerImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link domain.impl.InfrastructureLayerImpl#getInfrastructureComponent <em>Infrastructure Component</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InfrastructureLayerImpl extends EObjectImpl implements InfrastructureLayer {
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
	 * The cached value of the '{@link #getInfrastructureComponent() <em>Infrastructure Component</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfrastructureComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<InfrastructureComponent> infrastructureComponent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfrastructureLayerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.INFRASTRUCTURE_LAYER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.INFRASTRUCTURE_LAYER__UID, oldUid, uid));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.INFRASTRUCTURE_LAYER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subsystem getParent() {
		if (eContainerFeatureID() != DomainPackage.INFRASTRUCTURE_LAYER__PARENT) return null;
		return (Subsystem)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(Subsystem newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, DomainPackage.INFRASTRUCTURE_LAYER__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(Subsystem newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != DomainPackage.INFRASTRUCTURE_LAYER__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, DomainPackage.SUBSYSTEM__INFRASTRUCTURE_LAYER, Subsystem.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.INFRASTRUCTURE_LAYER__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InfrastructureComponent> getInfrastructureComponent() {
		if (infrastructureComponent == null) {
			infrastructureComponent = new EObjectContainmentWithInverseEList<InfrastructureComponent>(InfrastructureComponent.class, this, DomainPackage.INFRASTRUCTURE_LAYER__INFRASTRUCTURE_COMPONENT, DomainPackage.INFRASTRUCTURE_COMPONENT__PARENT);
		}
		return infrastructureComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomainPackage.INFRASTRUCTURE_LAYER__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((Subsystem)otherEnd, msgs);
			case DomainPackage.INFRASTRUCTURE_LAYER__INFRASTRUCTURE_COMPONENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInfrastructureComponent()).basicAdd(otherEnd, msgs);
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
			case DomainPackage.INFRASTRUCTURE_LAYER__PARENT:
				return basicSetParent(null, msgs);
			case DomainPackage.INFRASTRUCTURE_LAYER__INFRASTRUCTURE_COMPONENT:
				return ((InternalEList<?>)getInfrastructureComponent()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case DomainPackage.INFRASTRUCTURE_LAYER__PARENT:
				return eInternalContainer().eInverseRemove(this, DomainPackage.SUBSYSTEM__INFRASTRUCTURE_LAYER, Subsystem.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DomainPackage.INFRASTRUCTURE_LAYER__UID:
				return getUid();
			case DomainPackage.INFRASTRUCTURE_LAYER__NAME:
				return getName();
			case DomainPackage.INFRASTRUCTURE_LAYER__PARENT:
				return getParent();
			case DomainPackage.INFRASTRUCTURE_LAYER__INFRASTRUCTURE_COMPONENT:
				return getInfrastructureComponent();
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
			case DomainPackage.INFRASTRUCTURE_LAYER__UID:
				setUid((String)newValue);
				return;
			case DomainPackage.INFRASTRUCTURE_LAYER__NAME:
				setName((String)newValue);
				return;
			case DomainPackage.INFRASTRUCTURE_LAYER__PARENT:
				setParent((Subsystem)newValue);
				return;
			case DomainPackage.INFRASTRUCTURE_LAYER__INFRASTRUCTURE_COMPONENT:
				getInfrastructureComponent().clear();
				getInfrastructureComponent().addAll((Collection<? extends InfrastructureComponent>)newValue);
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
			case DomainPackage.INFRASTRUCTURE_LAYER__UID:
				setUid(UID_EDEFAULT);
				return;
			case DomainPackage.INFRASTRUCTURE_LAYER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DomainPackage.INFRASTRUCTURE_LAYER__PARENT:
				setParent((Subsystem)null);
				return;
			case DomainPackage.INFRASTRUCTURE_LAYER__INFRASTRUCTURE_COMPONENT:
				getInfrastructureComponent().clear();
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
			case DomainPackage.INFRASTRUCTURE_LAYER__UID:
				return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
			case DomainPackage.INFRASTRUCTURE_LAYER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DomainPackage.INFRASTRUCTURE_LAYER__PARENT:
				return getParent() != null;
			case DomainPackage.INFRASTRUCTURE_LAYER__INFRASTRUCTURE_COMPONENT:
				return infrastructureComponent != null && !infrastructureComponent.isEmpty();
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
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //InfrastructureLayerImpl
