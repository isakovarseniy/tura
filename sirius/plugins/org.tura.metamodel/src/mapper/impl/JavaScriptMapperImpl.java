/**
 */
package mapper.impl;

import mapper.JavaScriptMapper;
import mapper.MapperPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Java Script Mapper</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mapper.impl.JavaScriptMapperImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link mapper.impl.JavaScriptMapperImpl#getLibraryUrl <em>Library Url</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JavaScriptMapperImpl extends TypeMapperImpl implements JavaScriptMapper {
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MapperPackage.JAVA_SCRIPT_MAPPER__UID:
				return getUid();
			case MapperPackage.JAVA_SCRIPT_MAPPER__LIBRARY_URL:
				return getLibraryUrl();
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
			case MapperPackage.JAVA_SCRIPT_MAPPER__UID:
				setUid((String)newValue);
				return;
			case MapperPackage.JAVA_SCRIPT_MAPPER__LIBRARY_URL:
				setLibraryUrl((String)newValue);
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
			case MapperPackage.JAVA_SCRIPT_MAPPER__UID:
				setUid(UID_EDEFAULT);
				return;
			case MapperPackage.JAVA_SCRIPT_MAPPER__LIBRARY_URL:
				setLibraryUrl(LIBRARY_URL_EDEFAULT);
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
			case MapperPackage.JAVA_SCRIPT_MAPPER__UID:
				return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
			case MapperPackage.JAVA_SCRIPT_MAPPER__LIBRARY_URL:
				return LIBRARY_URL_EDEFAULT == null ? libraryUrl != null : !LIBRARY_URL_EDEFAULT.equals(libraryUrl);
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
		result.append(", libraryUrl: ");
		result.append(libraryUrl);
		result.append(')');
		return result.toString();
	}

} //JavaScriptMapperImpl
