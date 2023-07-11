/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
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
package mapper.impl;

import mapper.MapperPackage;
import mapper.MetamodelPackageMapper;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Metamodel Package Mapper</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mapper.impl.MetamodelPackageMapperImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link mapper.impl.MetamodelPackageMapperImpl#getMappedToPackageName <em>Mapped To Package Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MetamodelPackageMapperImpl extends PackageMapperImpl implements MetamodelPackageMapper {
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
	 * The default value of the '{@link #getMappedToPackageName() <em>Mapped To Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappedToPackageName()
	 * @generated
	 * @ordered
	 */
	protected static final String MAPPED_TO_PACKAGE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMappedToPackageName() <em>Mapped To Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappedToPackageName()
	 * @generated
	 * @ordered
	 */
	protected String mappedToPackageName = MAPPED_TO_PACKAGE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetamodelPackageMapperImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MapperPackage.Literals.METAMODEL_PACKAGE_MAPPER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MapperPackage.METAMODEL_PACKAGE_MAPPER__UID, oldUid, uid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMappedToPackageName() {
		return mappedToPackageName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMappedToPackageName(String newMappedToPackageName) {
		String oldMappedToPackageName = mappedToPackageName;
		mappedToPackageName = newMappedToPackageName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MapperPackage.METAMODEL_PACKAGE_MAPPER__MAPPED_TO_PACKAGE_NAME, oldMappedToPackageName, mappedToPackageName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MapperPackage.METAMODEL_PACKAGE_MAPPER__UID:
				return getUid();
			case MapperPackage.METAMODEL_PACKAGE_MAPPER__MAPPED_TO_PACKAGE_NAME:
				return getMappedToPackageName();
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
			case MapperPackage.METAMODEL_PACKAGE_MAPPER__UID:
				setUid((String)newValue);
				return;
			case MapperPackage.METAMODEL_PACKAGE_MAPPER__MAPPED_TO_PACKAGE_NAME:
				setMappedToPackageName((String)newValue);
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
			case MapperPackage.METAMODEL_PACKAGE_MAPPER__UID:
				setUid(UID_EDEFAULT);
				return;
			case MapperPackage.METAMODEL_PACKAGE_MAPPER__MAPPED_TO_PACKAGE_NAME:
				setMappedToPackageName(MAPPED_TO_PACKAGE_NAME_EDEFAULT);
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
			case MapperPackage.METAMODEL_PACKAGE_MAPPER__UID:
				return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
			case MapperPackage.METAMODEL_PACKAGE_MAPPER__MAPPED_TO_PACKAGE_NAME:
				return MAPPED_TO_PACKAGE_NAME_EDEFAULT == null ? mappedToPackageName != null : !MAPPED_TO_PACKAGE_NAME_EDEFAULT.equals(mappedToPackageName);
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
		result.append(", mappedToPackageName: ");
		result.append(mappedToPackageName);
		result.append(')');
		return result.toString();
	}

} //MetamodelPackageMapperImpl
