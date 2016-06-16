/**
 */
package tura.mapper.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import tura.mapper.JavaPackageMapper;
import tura.mapper.MapperPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Java Package Mapper</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tura.mapper.impl.JavaPackageMapperImpl#getMappedToPackageName <em>Mapped To Package Name</em>}</li>
 *   <li>{@link tura.mapper.impl.JavaPackageMapperImpl#getArtifactId <em>Artifact Id</em>}</li>
 *   <li>{@link tura.mapper.impl.JavaPackageMapperImpl#getGroupId <em>Group Id</em>}</li>
 *   <li>{@link tura.mapper.impl.JavaPackageMapperImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link tura.mapper.impl.JavaPackageMapperImpl#getLibraryName <em>Library Name</em>}</li>
 *   <li>{@link tura.mapper.impl.JavaPackageMapperImpl#getArtifactType <em>Artifact Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JavaPackageMapperImpl extends PackageMapperImpl implements JavaPackageMapper {
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
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

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
	protected static final String ARTIFACT_TYPE_EDEFAULT = "jar";

	/**
	 * The cached value of the '{@link #getArtifactType() <em>Artifact Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifactType()
	 * @generated
	 * @ordered
	 */
	protected String artifactType = ARTIFACT_TYPE_EDEFAULT;

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
	public String getMappedToPackageName() {
		return mappedToPackageName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			eNotify(new ENotificationImpl(this, Notification.SET, MapperPackage.JAVA_PACKAGE_MAPPER__ARTIFACT_ID, oldArtifactId, artifactId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MapperPackage.JAVA_PACKAGE_MAPPER__GROUP_ID, oldGroupId, groupId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MapperPackage.JAVA_PACKAGE_MAPPER__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLibraryName() {
		return libraryName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	public String getArtifactType() {
		return artifactType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArtifactType(String newArtifactType) {
		String oldArtifactType = artifactType;
		artifactType = newArtifactType;
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
			case MapperPackage.JAVA_PACKAGE_MAPPER__MAPPED_TO_PACKAGE_NAME:
				return getMappedToPackageName();
			case MapperPackage.JAVA_PACKAGE_MAPPER__ARTIFACT_ID:
				return getArtifactId();
			case MapperPackage.JAVA_PACKAGE_MAPPER__GROUP_ID:
				return getGroupId();
			case MapperPackage.JAVA_PACKAGE_MAPPER__VERSION:
				return getVersion();
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
			case MapperPackage.JAVA_PACKAGE_MAPPER__MAPPED_TO_PACKAGE_NAME:
				setMappedToPackageName((String)newValue);
				return;
			case MapperPackage.JAVA_PACKAGE_MAPPER__ARTIFACT_ID:
				setArtifactId((String)newValue);
				return;
			case MapperPackage.JAVA_PACKAGE_MAPPER__GROUP_ID:
				setGroupId((String)newValue);
				return;
			case MapperPackage.JAVA_PACKAGE_MAPPER__VERSION:
				setVersion((String)newValue);
				return;
			case MapperPackage.JAVA_PACKAGE_MAPPER__LIBRARY_NAME:
				setLibraryName((String)newValue);
				return;
			case MapperPackage.JAVA_PACKAGE_MAPPER__ARTIFACT_TYPE:
				setArtifactType((String)newValue);
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
			case MapperPackage.JAVA_PACKAGE_MAPPER__MAPPED_TO_PACKAGE_NAME:
				setMappedToPackageName(MAPPED_TO_PACKAGE_NAME_EDEFAULT);
				return;
			case MapperPackage.JAVA_PACKAGE_MAPPER__ARTIFACT_ID:
				setArtifactId(ARTIFACT_ID_EDEFAULT);
				return;
			case MapperPackage.JAVA_PACKAGE_MAPPER__GROUP_ID:
				setGroupId(GROUP_ID_EDEFAULT);
				return;
			case MapperPackage.JAVA_PACKAGE_MAPPER__VERSION:
				setVersion(VERSION_EDEFAULT);
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
			case MapperPackage.JAVA_PACKAGE_MAPPER__MAPPED_TO_PACKAGE_NAME:
				return MAPPED_TO_PACKAGE_NAME_EDEFAULT == null ? mappedToPackageName != null : !MAPPED_TO_PACKAGE_NAME_EDEFAULT.equals(mappedToPackageName);
			case MapperPackage.JAVA_PACKAGE_MAPPER__ARTIFACT_ID:
				return ARTIFACT_ID_EDEFAULT == null ? artifactId != null : !ARTIFACT_ID_EDEFAULT.equals(artifactId);
			case MapperPackage.JAVA_PACKAGE_MAPPER__GROUP_ID:
				return GROUP_ID_EDEFAULT == null ? groupId != null : !GROUP_ID_EDEFAULT.equals(groupId);
			case MapperPackage.JAVA_PACKAGE_MAPPER__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case MapperPackage.JAVA_PACKAGE_MAPPER__LIBRARY_NAME:
				return LIBRARY_NAME_EDEFAULT == null ? libraryName != null : !LIBRARY_NAME_EDEFAULT.equals(libraryName);
			case MapperPackage.JAVA_PACKAGE_MAPPER__ARTIFACT_TYPE:
				return ARTIFACT_TYPE_EDEFAULT == null ? artifactType != null : !ARTIFACT_TYPE_EDEFAULT.equals(artifactType);
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
		result.append(" (mappedToPackageName: ");
		result.append(mappedToPackageName);
		result.append(", artifactId: ");
		result.append(artifactId);
		result.append(", groupId: ");
		result.append(groupId);
		result.append(", version: ");
		result.append(version);
		result.append(", libraryName: ");
		result.append(libraryName);
		result.append(", artifactType: ");
		result.append(artifactType);
		result.append(')');
		return result.toString();
	}

} //JavaPackageMapperImpl
