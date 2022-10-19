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
package mapper.impl;

import mapper.ArtifactType;
import mapper.JavaPackageMapper;
import mapper.MapperPackage;

import mapper.Version;
import mapper.VersionRef;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Java Package Mapper</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mapper.impl.JavaPackageMapperImpl#getVersionRef <em>Version Ref</em>}</li>
 *   <li>{@link mapper.impl.JavaPackageMapperImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link mapper.impl.JavaPackageMapperImpl#getMappedToPackageName <em>Mapped To Package Name</em>}</li>
 *   <li>{@link mapper.impl.JavaPackageMapperImpl#getArtifactId <em>Artifact Id</em>}</li>
 *   <li>{@link mapper.impl.JavaPackageMapperImpl#getGroupId <em>Group Id</em>}</li>
 *   <li>{@link mapper.impl.JavaPackageMapperImpl#getLibraryName <em>Library Name</em>}</li>
 *   <li>{@link mapper.impl.JavaPackageMapperImpl#getArtifactType <em>Artifact Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JavaPackageMapperImpl extends PackageMapperImpl implements JavaPackageMapper {
	/**
	 * The cached value of the '{@link #getVersionRef() <em>Version Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionRef()
	 * @generated
	 * @ordered
	 */
	protected Version versionRef;

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
	 * The default value of the '{@link #getArtifactId() <em>Artifact Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifactId()
	 * @generated
	 * @ordered
	 */
	protected static final String ARTIFACT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArtifactId() <em>Artifact Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifactId()
	 * @generated
	 * @ordered
	 */
	protected String artifactId = ARTIFACT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getGroupId() <em>Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupId()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUP_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroupId() <em>Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupId()
	 * @generated
	 * @ordered
	 */
	protected String groupId = GROUP_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getLibraryName() <em>Library Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibraryName()
	 * @generated
	 * @ordered
	 */
	protected static final String LIBRARY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLibraryName() <em>Library Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibraryName()
	 * @generated
	 * @ordered
	 */
	protected String libraryName = LIBRARY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getArtifactType() <em>Artifact Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifactType()
	 * @generated
	 * @ordered
	 */
	protected static final ArtifactType ARTIFACT_TYPE_EDEFAULT = ArtifactType.JAR;

	/**
	 * The cached value of the '{@link #getArtifactType() <em>Artifact Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifactType()
	 * @generated
	 * @ordered
	 */
	protected ArtifactType artifactType = ARTIFACT_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaPackageMapperImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MapperPackage.Literals.JAVA_PACKAGE_MAPPER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Version getVersionRef() {
		if (versionRef != null && versionRef.eIsProxy()) {
			InternalEObject oldVersionRef = (InternalEObject)versionRef;
			versionRef = (Version)eResolveProxy(oldVersionRef);
			if (versionRef != oldVersionRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MapperPackage.JAVA_PACKAGE_MAPPER__VERSION_REF, oldVersionRef, versionRef));
			}
		}
		return versionRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Version basicGetVersionRef() {
		return versionRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersionRef(Version newVersionRef) {
		Version oldVersionRef = versionRef;
		versionRef = newVersionRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MapperPackage.JAVA_PACKAGE_MAPPER__VERSION_REF, oldVersionRef, versionRef));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MapperPackage.JAVA_PACKAGE_MAPPER__UID, oldUid, uid));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MapperPackage.JAVA_PACKAGE_MAPPER__MAPPED_TO_PACKAGE_NAME, oldMappedToPackageName, mappedToPackageName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getArtifactId() {
		return artifactId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArtifactId(String newArtifactId) {
		String oldArtifactId = artifactId;
		artifactId = newArtifactId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MapperPackage.JAVA_PACKAGE_MAPPER__ARTIFACT_ID, oldArtifactId, artifactId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGroupId() {
		return groupId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGroupId(String newGroupId) {
		String oldGroupId = groupId;
		groupId = newGroupId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MapperPackage.JAVA_PACKAGE_MAPPER__GROUP_ID, oldGroupId, groupId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLibraryName() {
		return libraryName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLibraryName(String newLibraryName) {
		String oldLibraryName = libraryName;
		libraryName = newLibraryName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MapperPackage.JAVA_PACKAGE_MAPPER__LIBRARY_NAME, oldLibraryName, libraryName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArtifactType getArtifactType() {
		return artifactType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArtifactType(ArtifactType newArtifactType) {
		ArtifactType oldArtifactType = artifactType;
		artifactType = newArtifactType == null ? ARTIFACT_TYPE_EDEFAULT : newArtifactType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MapperPackage.JAVA_PACKAGE_MAPPER__ARTIFACT_TYPE, oldArtifactType, artifactType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MapperPackage.JAVA_PACKAGE_MAPPER__VERSION_REF:
				if (resolve) return getVersionRef();
				return basicGetVersionRef();
			case MapperPackage.JAVA_PACKAGE_MAPPER__UID:
				return getUid();
			case MapperPackage.JAVA_PACKAGE_MAPPER__MAPPED_TO_PACKAGE_NAME:
				return getMappedToPackageName();
			case MapperPackage.JAVA_PACKAGE_MAPPER__ARTIFACT_ID:
				return getArtifactId();
			case MapperPackage.JAVA_PACKAGE_MAPPER__GROUP_ID:
				return getGroupId();
			case MapperPackage.JAVA_PACKAGE_MAPPER__LIBRARY_NAME:
				return getLibraryName();
			case MapperPackage.JAVA_PACKAGE_MAPPER__ARTIFACT_TYPE:
				return getArtifactType();
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
			case MapperPackage.JAVA_PACKAGE_MAPPER__VERSION_REF:
				setVersionRef((Version)newValue);
				return;
			case MapperPackage.JAVA_PACKAGE_MAPPER__UID:
				setUid((String)newValue);
				return;
			case MapperPackage.JAVA_PACKAGE_MAPPER__MAPPED_TO_PACKAGE_NAME:
				setMappedToPackageName((String)newValue);
				return;
			case MapperPackage.JAVA_PACKAGE_MAPPER__ARTIFACT_ID:
				setArtifactId((String)newValue);
				return;
			case MapperPackage.JAVA_PACKAGE_MAPPER__GROUP_ID:
				setGroupId((String)newValue);
				return;
			case MapperPackage.JAVA_PACKAGE_MAPPER__LIBRARY_NAME:
				setLibraryName((String)newValue);
				return;
			case MapperPackage.JAVA_PACKAGE_MAPPER__ARTIFACT_TYPE:
				setArtifactType((ArtifactType)newValue);
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
			case MapperPackage.JAVA_PACKAGE_MAPPER__VERSION_REF:
				setVersionRef((Version)null);
				return;
			case MapperPackage.JAVA_PACKAGE_MAPPER__UID:
				setUid(UID_EDEFAULT);
				return;
			case MapperPackage.JAVA_PACKAGE_MAPPER__MAPPED_TO_PACKAGE_NAME:
				setMappedToPackageName(MAPPED_TO_PACKAGE_NAME_EDEFAULT);
				return;
			case MapperPackage.JAVA_PACKAGE_MAPPER__ARTIFACT_ID:
				setArtifactId(ARTIFACT_ID_EDEFAULT);
				return;
			case MapperPackage.JAVA_PACKAGE_MAPPER__GROUP_ID:
				setGroupId(GROUP_ID_EDEFAULT);
				return;
			case MapperPackage.JAVA_PACKAGE_MAPPER__LIBRARY_NAME:
				setLibraryName(LIBRARY_NAME_EDEFAULT);
				return;
			case MapperPackage.JAVA_PACKAGE_MAPPER__ARTIFACT_TYPE:
				setArtifactType(ARTIFACT_TYPE_EDEFAULT);
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
			case MapperPackage.JAVA_PACKAGE_MAPPER__VERSION_REF:
				return versionRef != null;
			case MapperPackage.JAVA_PACKAGE_MAPPER__UID:
				return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
			case MapperPackage.JAVA_PACKAGE_MAPPER__MAPPED_TO_PACKAGE_NAME:
				return MAPPED_TO_PACKAGE_NAME_EDEFAULT == null ? mappedToPackageName != null : !MAPPED_TO_PACKAGE_NAME_EDEFAULT.equals(mappedToPackageName);
			case MapperPackage.JAVA_PACKAGE_MAPPER__ARTIFACT_ID:
				return ARTIFACT_ID_EDEFAULT == null ? artifactId != null : !ARTIFACT_ID_EDEFAULT.equals(artifactId);
			case MapperPackage.JAVA_PACKAGE_MAPPER__GROUP_ID:
				return GROUP_ID_EDEFAULT == null ? groupId != null : !GROUP_ID_EDEFAULT.equals(groupId);
			case MapperPackage.JAVA_PACKAGE_MAPPER__LIBRARY_NAME:
				return LIBRARY_NAME_EDEFAULT == null ? libraryName != null : !LIBRARY_NAME_EDEFAULT.equals(libraryName);
			case MapperPackage.JAVA_PACKAGE_MAPPER__ARTIFACT_TYPE:
				return artifactType != ARTIFACT_TYPE_EDEFAULT;
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
		if (baseClass == VersionRef.class) {
			switch (derivedFeatureID) {
				case MapperPackage.JAVA_PACKAGE_MAPPER__VERSION_REF: return MapperPackage.VERSION_REF__VERSION_REF;
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
		if (baseClass == VersionRef.class) {
			switch (baseFeatureID) {
				case MapperPackage.VERSION_REF__VERSION_REF: return MapperPackage.JAVA_PACKAGE_MAPPER__VERSION_REF;
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
		result.append(", mappedToPackageName: ");
		result.append(mappedToPackageName);
		result.append(", artifactId: ");
		result.append(artifactId);
		result.append(", groupId: ");
		result.append(groupId);
		result.append(", libraryName: ");
		result.append(libraryName);
		result.append(", artifactType: ");
		result.append(artifactType);
		result.append(')');
		return result.toString();
	}

} //JavaPackageMapperImpl
