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

import artifact.ArtifactPackage;
import artifact.Categorized;
import artifact.Classifier;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import type.Attribute;
import type.TypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link type.impl.AttributeImpl#getClassifiers <em>Classifiers</em>}</li>
 *   <li>{@link type.impl.AttributeImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link type.impl.AttributeImpl#getKeyId <em>Key Id</em>}</li>
 *   <li>{@link type.impl.AttributeImpl#getName <em>Name</em>}</li>
 *   <li>{@link type.impl.AttributeImpl#isPk <em>Pk</em>}</li>
 *   <li>{@link type.impl.AttributeImpl#isUk <em>Uk</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeImpl extends TypePointerImpl implements Attribute {
	/**
	 * The cached value of the '{@link #getClassifiers() <em>Classifiers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<Classifier> classifiers;

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
	 * The default value of the '{@link #getKeyId() <em>Key Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyId()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKeyId() <em>Key Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyId()
	 * @generated
	 * @ordered
	 */
	protected String keyId = KEY_ID_EDEFAULT;

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
	 * The default value of the '{@link #isPk() <em>Pk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPk()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PK_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPk() <em>Pk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPk()
	 * @generated
	 * @ordered
	 */
	protected boolean pk = PK_EDEFAULT;

	/**
	 * The default value of the '{@link #isUk() <em>Uk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUk()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UK_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUk() <em>Uk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUk()
	 * @generated
	 * @ordered
	 */
	protected boolean uk = UK_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypePackage.Literals.ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Classifier> getClassifiers() {
		if (classifiers == null) {
			classifiers = new EObjectContainmentEList<Classifier>(Classifier.class, this, TypePackage.ATTRIBUTE__CLASSIFIERS);
		}
		return classifiers;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.ATTRIBUTE__UID, oldUid, uid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getKeyId() {
		return keyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKeyId(String newKeyId) {
		String oldKeyId = keyId;
		keyId = newKeyId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.ATTRIBUTE__KEY_ID, oldKeyId, keyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.ATTRIBUTE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isPk() {
		return pk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPk(boolean newPk) {
		boolean oldPk = pk;
		pk = newPk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.ATTRIBUTE__PK, oldPk, pk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isUk() {
		return uk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUk(boolean newUk) {
		boolean oldUk = uk;
		uk = newUk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.ATTRIBUTE__UK, oldUk, uk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypePackage.ATTRIBUTE__CLASSIFIERS:
				return ((InternalEList<?>)getClassifiers()).basicRemove(otherEnd, msgs);
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
			case TypePackage.ATTRIBUTE__CLASSIFIERS:
				return getClassifiers();
			case TypePackage.ATTRIBUTE__UID:
				return getUid();
			case TypePackage.ATTRIBUTE__KEY_ID:
				return getKeyId();
			case TypePackage.ATTRIBUTE__NAME:
				return getName();
			case TypePackage.ATTRIBUTE__PK:
				return isPk();
			case TypePackage.ATTRIBUTE__UK:
				return isUk();
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
			case TypePackage.ATTRIBUTE__CLASSIFIERS:
				getClassifiers().clear();
				getClassifiers().addAll((Collection<? extends Classifier>)newValue);
				return;
			case TypePackage.ATTRIBUTE__UID:
				setUid((String)newValue);
				return;
			case TypePackage.ATTRIBUTE__KEY_ID:
				setKeyId((String)newValue);
				return;
			case TypePackage.ATTRIBUTE__NAME:
				setName((String)newValue);
				return;
			case TypePackage.ATTRIBUTE__PK:
				setPk((Boolean)newValue);
				return;
			case TypePackage.ATTRIBUTE__UK:
				setUk((Boolean)newValue);
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
			case TypePackage.ATTRIBUTE__CLASSIFIERS:
				getClassifiers().clear();
				return;
			case TypePackage.ATTRIBUTE__UID:
				setUid(UID_EDEFAULT);
				return;
			case TypePackage.ATTRIBUTE__KEY_ID:
				setKeyId(KEY_ID_EDEFAULT);
				return;
			case TypePackage.ATTRIBUTE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TypePackage.ATTRIBUTE__PK:
				setPk(PK_EDEFAULT);
				return;
			case TypePackage.ATTRIBUTE__UK:
				setUk(UK_EDEFAULT);
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
			case TypePackage.ATTRIBUTE__CLASSIFIERS:
				return classifiers != null && !classifiers.isEmpty();
			case TypePackage.ATTRIBUTE__UID:
				return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
			case TypePackage.ATTRIBUTE__KEY_ID:
				return KEY_ID_EDEFAULT == null ? keyId != null : !KEY_ID_EDEFAULT.equals(keyId);
			case TypePackage.ATTRIBUTE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TypePackage.ATTRIBUTE__PK:
				return pk != PK_EDEFAULT;
			case TypePackage.ATTRIBUTE__UK:
				return uk != UK_EDEFAULT;
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
		if (baseClass == Categorized.class) {
			switch (derivedFeatureID) {
				case TypePackage.ATTRIBUTE__CLASSIFIERS: return ArtifactPackage.CATEGORIZED__CLASSIFIERS;
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
		if (baseClass == Categorized.class) {
			switch (baseFeatureID) {
				case ArtifactPackage.CATEGORIZED__CLASSIFIERS: return TypePackage.ATTRIBUTE__CLASSIFIERS;
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (uid: ");
		result.append(uid);
		result.append(", keyId: ");
		result.append(keyId);
		result.append(", name: ");
		result.append(name);
		result.append(", pk: ");
		result.append(pk);
		result.append(", uk: ");
		result.append(uk);
		result.append(')');
		return result.toString();
	}

} //AttributeImpl
