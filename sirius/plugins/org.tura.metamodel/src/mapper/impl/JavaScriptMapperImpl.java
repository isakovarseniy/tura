/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   http://sourceforge.net/p/tura/wiki/Home/
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

/**
 */
package mapper.impl;

import mapper.ArtifactType;
import mapper.JavaScriptMapper;
import mapper.MapperPackage;

import mapper.Version;
import mapper.VersionRef;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Java Script Mapper</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mapper.impl.JavaScriptMapperImpl#getVersionRef <em>Version Ref</em>}</li>
 *   <li>{@link mapper.impl.JavaScriptMapperImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link mapper.impl.JavaScriptMapperImpl#getLibraryUrl <em>Library Url</em>}</li>
 *   <li>{@link mapper.impl.JavaScriptMapperImpl#getArtifactId <em>Artifact Id</em>}</li>
 *   <li>{@link mapper.impl.JavaScriptMapperImpl#getGroupId <em>Group Id</em>}</li>
 *   <li>{@link mapper.impl.JavaScriptMapperImpl#getMappedToInternalLocation <em>Mapped To Internal Location</em>}</li>
 *   <li>{@link mapper.impl.JavaScriptMapperImpl#getMappedToClassName <em>Mapped To Class Name</em>}</li>
 *   <li>{@link mapper.impl.JavaScriptMapperImpl#getJsPackageName <em>Js Package Name</em>}</li>
 *   <li>{@link mapper.impl.JavaScriptMapperImpl#isLocal <em>Local</em>}</li>
 *   <li>{@link mapper.impl.JavaScriptMapperImpl#getArtifactType <em>Artifact Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JavaScriptMapperImpl extends TypeMapperImpl implements JavaScriptMapper {
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
	 * The default value of the '{@link #getLibraryUrl() <em>Library Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibraryUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String LIBRARY_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLibraryUrl() <em>Library Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibraryUrl()
	 * @generated
	 * @ordered
	 */
	protected String libraryUrl = LIBRARY_URL_EDEFAULT;

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
	 * The default value of the '{@link #getMappedToInternalLocation() <em>Mapped To Internal Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappedToInternalLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String MAPPED_TO_INTERNAL_LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMappedToInternalLocation() <em>Mapped To Internal Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappedToInternalLocation()
	 * @generated
	 * @ordered
	 */
	protected String mappedToInternalLocation = MAPPED_TO_INTERNAL_LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMappedToClassName() <em>Mapped To Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappedToClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String MAPPED_TO_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMappedToClassName() <em>Mapped To Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappedToClassName()
	 * @generated
	 * @ordered
	 */
	protected String mappedToClassName = MAPPED_TO_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getJsPackageName() <em>Js Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJsPackageName()
	 * @generated
	 * @ordered
	 */
	protected static final String JS_PACKAGE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJsPackageName() <em>Js Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJsPackageName()
	 * @generated
	 * @ordered
	 */
	protected String jsPackageName = JS_PACKAGE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isLocal() <em>Local</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLocal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LOCAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLocal() <em>Local</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLocal()
	 * @generated
	 * @ordered
	 */
	protected boolean local = LOCAL_EDEFAULT;

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
	protected JavaScriptMapperImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MapperPackage.Literals.JAVA_SCRIPT_MAPPER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Version getVersionRef() {
		if (versionRef != null && versionRef.eIsProxy()) {
			InternalEObject oldVersionRef = (InternalEObject)versionRef;
			versionRef = (Version)eResolveProxy(oldVersionRef);
			if (versionRef != oldVersionRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MapperPackage.JAVA_SCRIPT_MAPPER__VERSION_REF, oldVersionRef, versionRef));
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
	public void setVersionRef(Version newVersionRef) {
		Version oldVersionRef = versionRef;
		versionRef = newVersionRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MapperPackage.JAVA_SCRIPT_MAPPER__VERSION_REF, oldVersionRef, versionRef));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MapperPackage.JAVA_SCRIPT_MAPPER__UID, oldUid, uid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLibraryUrl() {
		return libraryUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLibraryUrl(String newLibraryUrl) {
		String oldLibraryUrl = libraryUrl;
		libraryUrl = newLibraryUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MapperPackage.JAVA_SCRIPT_MAPPER__LIBRARY_URL, oldLibraryUrl, libraryUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getArtifactId() {
		return artifactId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArtifactId(String newArtifactId) {
		String oldArtifactId = artifactId;
		artifactId = newArtifactId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MapperPackage.JAVA_SCRIPT_MAPPER__ARTIFACT_ID, oldArtifactId, artifactId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGroupId() {
		return groupId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupId(String newGroupId) {
		String oldGroupId = groupId;
		groupId = newGroupId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MapperPackage.JAVA_SCRIPT_MAPPER__GROUP_ID, oldGroupId, groupId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMappedToInternalLocation() {
		return mappedToInternalLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMappedToInternalLocation(String newMappedToInternalLocation) {
		String oldMappedToInternalLocation = mappedToInternalLocation;
		mappedToInternalLocation = newMappedToInternalLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MapperPackage.JAVA_SCRIPT_MAPPER__MAPPED_TO_INTERNAL_LOCATION, oldMappedToInternalLocation, mappedToInternalLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMappedToClassName() {
		return mappedToClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMappedToClassName(String newMappedToClassName) {
		String oldMappedToClassName = mappedToClassName;
		mappedToClassName = newMappedToClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MapperPackage.JAVA_SCRIPT_MAPPER__MAPPED_TO_CLASS_NAME, oldMappedToClassName, mappedToClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJsPackageName() {
		return jsPackageName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJsPackageName(String newJsPackageName) {
		String oldJsPackageName = jsPackageName;
		jsPackageName = newJsPackageName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MapperPackage.JAVA_SCRIPT_MAPPER__JS_PACKAGE_NAME, oldJsPackageName, jsPackageName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLocal() {
		return local;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocal(boolean newLocal) {
		boolean oldLocal = local;
		local = newLocal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MapperPackage.JAVA_SCRIPT_MAPPER__LOCAL, oldLocal, local));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactType getArtifactType() {
		return artifactType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArtifactType(ArtifactType newArtifactType) {
		ArtifactType oldArtifactType = artifactType;
		artifactType = newArtifactType == null ? ARTIFACT_TYPE_EDEFAULT : newArtifactType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MapperPackage.JAVA_SCRIPT_MAPPER__ARTIFACT_TYPE, oldArtifactType, artifactType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MapperPackage.JAVA_SCRIPT_MAPPER__VERSION_REF:
				if (resolve) return getVersionRef();
				return basicGetVersionRef();
			case MapperPackage.JAVA_SCRIPT_MAPPER__UID:
				return getUid();
			case MapperPackage.JAVA_SCRIPT_MAPPER__LIBRARY_URL:
				return getLibraryUrl();
			case MapperPackage.JAVA_SCRIPT_MAPPER__ARTIFACT_ID:
				return getArtifactId();
			case MapperPackage.JAVA_SCRIPT_MAPPER__GROUP_ID:
				return getGroupId();
			case MapperPackage.JAVA_SCRIPT_MAPPER__MAPPED_TO_INTERNAL_LOCATION:
				return getMappedToInternalLocation();
			case MapperPackage.JAVA_SCRIPT_MAPPER__MAPPED_TO_CLASS_NAME:
				return getMappedToClassName();
			case MapperPackage.JAVA_SCRIPT_MAPPER__JS_PACKAGE_NAME:
				return getJsPackageName();
			case MapperPackage.JAVA_SCRIPT_MAPPER__LOCAL:
				return isLocal();
			case MapperPackage.JAVA_SCRIPT_MAPPER__ARTIFACT_TYPE:
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
			case MapperPackage.JAVA_SCRIPT_MAPPER__VERSION_REF:
				setVersionRef((Version)newValue);
				return;
			case MapperPackage.JAVA_SCRIPT_MAPPER__UID:
				setUid((String)newValue);
				return;
			case MapperPackage.JAVA_SCRIPT_MAPPER__LIBRARY_URL:
				setLibraryUrl((String)newValue);
				return;
			case MapperPackage.JAVA_SCRIPT_MAPPER__ARTIFACT_ID:
				setArtifactId((String)newValue);
				return;
			case MapperPackage.JAVA_SCRIPT_MAPPER__GROUP_ID:
				setGroupId((String)newValue);
				return;
			case MapperPackage.JAVA_SCRIPT_MAPPER__MAPPED_TO_INTERNAL_LOCATION:
				setMappedToInternalLocation((String)newValue);
				return;
			case MapperPackage.JAVA_SCRIPT_MAPPER__MAPPED_TO_CLASS_NAME:
				setMappedToClassName((String)newValue);
				return;
			case MapperPackage.JAVA_SCRIPT_MAPPER__JS_PACKAGE_NAME:
				setJsPackageName((String)newValue);
				return;
			case MapperPackage.JAVA_SCRIPT_MAPPER__LOCAL:
				setLocal((Boolean)newValue);
				return;
			case MapperPackage.JAVA_SCRIPT_MAPPER__ARTIFACT_TYPE:
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
			case MapperPackage.JAVA_SCRIPT_MAPPER__VERSION_REF:
				setVersionRef((Version)null);
				return;
			case MapperPackage.JAVA_SCRIPT_MAPPER__UID:
				setUid(UID_EDEFAULT);
				return;
			case MapperPackage.JAVA_SCRIPT_MAPPER__LIBRARY_URL:
				setLibraryUrl(LIBRARY_URL_EDEFAULT);
				return;
			case MapperPackage.JAVA_SCRIPT_MAPPER__ARTIFACT_ID:
				setArtifactId(ARTIFACT_ID_EDEFAULT);
				return;
			case MapperPackage.JAVA_SCRIPT_MAPPER__GROUP_ID:
				setGroupId(GROUP_ID_EDEFAULT);
				return;
			case MapperPackage.JAVA_SCRIPT_MAPPER__MAPPED_TO_INTERNAL_LOCATION:
				setMappedToInternalLocation(MAPPED_TO_INTERNAL_LOCATION_EDEFAULT);
				return;
			case MapperPackage.JAVA_SCRIPT_MAPPER__MAPPED_TO_CLASS_NAME:
				setMappedToClassName(MAPPED_TO_CLASS_NAME_EDEFAULT);
				return;
			case MapperPackage.JAVA_SCRIPT_MAPPER__JS_PACKAGE_NAME:
				setJsPackageName(JS_PACKAGE_NAME_EDEFAULT);
				return;
			case MapperPackage.JAVA_SCRIPT_MAPPER__LOCAL:
				setLocal(LOCAL_EDEFAULT);
				return;
			case MapperPackage.JAVA_SCRIPT_MAPPER__ARTIFACT_TYPE:
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
			case MapperPackage.JAVA_SCRIPT_MAPPER__VERSION_REF:
				return versionRef != null;
			case MapperPackage.JAVA_SCRIPT_MAPPER__UID:
				return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
			case MapperPackage.JAVA_SCRIPT_MAPPER__LIBRARY_URL:
				return LIBRARY_URL_EDEFAULT == null ? libraryUrl != null : !LIBRARY_URL_EDEFAULT.equals(libraryUrl);
			case MapperPackage.JAVA_SCRIPT_MAPPER__ARTIFACT_ID:
				return ARTIFACT_ID_EDEFAULT == null ? artifactId != null : !ARTIFACT_ID_EDEFAULT.equals(artifactId);
			case MapperPackage.JAVA_SCRIPT_MAPPER__GROUP_ID:
				return GROUP_ID_EDEFAULT == null ? groupId != null : !GROUP_ID_EDEFAULT.equals(groupId);
			case MapperPackage.JAVA_SCRIPT_MAPPER__MAPPED_TO_INTERNAL_LOCATION:
				return MAPPED_TO_INTERNAL_LOCATION_EDEFAULT == null ? mappedToInternalLocation != null : !MAPPED_TO_INTERNAL_LOCATION_EDEFAULT.equals(mappedToInternalLocation);
			case MapperPackage.JAVA_SCRIPT_MAPPER__MAPPED_TO_CLASS_NAME:
				return MAPPED_TO_CLASS_NAME_EDEFAULT == null ? mappedToClassName != null : !MAPPED_TO_CLASS_NAME_EDEFAULT.equals(mappedToClassName);
			case MapperPackage.JAVA_SCRIPT_MAPPER__JS_PACKAGE_NAME:
				return JS_PACKAGE_NAME_EDEFAULT == null ? jsPackageName != null : !JS_PACKAGE_NAME_EDEFAULT.equals(jsPackageName);
			case MapperPackage.JAVA_SCRIPT_MAPPER__LOCAL:
				return local != LOCAL_EDEFAULT;
			case MapperPackage.JAVA_SCRIPT_MAPPER__ARTIFACT_TYPE:
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
				case MapperPackage.JAVA_SCRIPT_MAPPER__VERSION_REF: return MapperPackage.VERSION_REF__VERSION_REF;
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
				case MapperPackage.VERSION_REF__VERSION_REF: return MapperPackage.JAVA_SCRIPT_MAPPER__VERSION_REF;
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
		result.append(", libraryUrl: ");
		result.append(libraryUrl);
		result.append(", artifactId: ");
		result.append(artifactId);
		result.append(", groupId: ");
		result.append(groupId);
		result.append(", mappedToInternalLocation: ");
		result.append(mappedToInternalLocation);
		result.append(", mappedToClassName: ");
		result.append(mappedToClassName);
		result.append(", jsPackageName: ");
		result.append(jsPackageName);
		result.append(", local: ");
		result.append(local);
		result.append(", artifactType: ");
		result.append(artifactType);
		result.append(')');
		return result.toString();
	}

} //JavaScriptMapperImpl
