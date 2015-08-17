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

import domain.DeploymentComponents;
import domain.DeploymentSequence;
import domain.DomainPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deployment Sequence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link domain.impl.DeploymentSequenceImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.impl.DeploymentSequenceImpl#getName <em>Name</em>}</li>
 *   <li>{@link domain.impl.DeploymentSequenceImpl#getDeploymentComponents <em>Deployment Components</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeploymentSequenceImpl extends EObjectImpl implements DeploymentSequence {
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
	 * The cached value of the '{@link #getDeploymentComponents() <em>Deployment Components</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeploymentComponents()
	 * @generated
	 * @ordered
	 */
	protected DeploymentComponents deploymentComponents;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeploymentSequenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.DEPLOYMENT_SEQUENCE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DEPLOYMENT_SEQUENCE__UID, oldUid, uid));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DEPLOYMENT_SEQUENCE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentComponents getDeploymentComponents() {
		return deploymentComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeploymentComponents(DeploymentComponents newDeploymentComponents, NotificationChain msgs) {
		DeploymentComponents oldDeploymentComponents = deploymentComponents;
		deploymentComponents = newDeploymentComponents;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.DEPLOYMENT_SEQUENCE__DEPLOYMENT_COMPONENTS, oldDeploymentComponents, newDeploymentComponents);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeploymentComponents(DeploymentComponents newDeploymentComponents) {
		if (newDeploymentComponents != deploymentComponents) {
			NotificationChain msgs = null;
			if (deploymentComponents != null)
				msgs = ((InternalEObject)deploymentComponents).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.DEPLOYMENT_SEQUENCE__DEPLOYMENT_COMPONENTS, null, msgs);
			if (newDeploymentComponents != null)
				msgs = ((InternalEObject)newDeploymentComponents).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainPackage.DEPLOYMENT_SEQUENCE__DEPLOYMENT_COMPONENTS, null, msgs);
			msgs = basicSetDeploymentComponents(newDeploymentComponents, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DEPLOYMENT_SEQUENCE__DEPLOYMENT_COMPONENTS, newDeploymentComponents, newDeploymentComponents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomainPackage.DEPLOYMENT_SEQUENCE__DEPLOYMENT_COMPONENTS:
				return basicSetDeploymentComponents(null, msgs);
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
			case DomainPackage.DEPLOYMENT_SEQUENCE__UID:
				return getUid();
			case DomainPackage.DEPLOYMENT_SEQUENCE__NAME:
				return getName();
			case DomainPackage.DEPLOYMENT_SEQUENCE__DEPLOYMENT_COMPONENTS:
				return getDeploymentComponents();
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
			case DomainPackage.DEPLOYMENT_SEQUENCE__UID:
				setUid((String)newValue);
				return;
			case DomainPackage.DEPLOYMENT_SEQUENCE__NAME:
				setName((String)newValue);
				return;
			case DomainPackage.DEPLOYMENT_SEQUENCE__DEPLOYMENT_COMPONENTS:
				setDeploymentComponents((DeploymentComponents)newValue);
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
			case DomainPackage.DEPLOYMENT_SEQUENCE__UID:
				setUid(UID_EDEFAULT);
				return;
			case DomainPackage.DEPLOYMENT_SEQUENCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DomainPackage.DEPLOYMENT_SEQUENCE__DEPLOYMENT_COMPONENTS:
				setDeploymentComponents((DeploymentComponents)null);
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
			case DomainPackage.DEPLOYMENT_SEQUENCE__UID:
				return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
			case DomainPackage.DEPLOYMENT_SEQUENCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DomainPackage.DEPLOYMENT_SEQUENCE__DEPLOYMENT_COMPONENTS:
				return deploymentComponents != null;
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

} //DeploymentSequenceImpl
