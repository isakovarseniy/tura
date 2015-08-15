/**
 */
package domain.impl;

import domain.CSSMapper;
import domain.DomainPackage;
import domain.StyleLibrary;
import domain.StylesPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CSS Mapper</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link domain.impl.CSSMapperImpl#getLibraryUrl <em>Library Url</em>}</li>
 *   <li>{@link domain.impl.CSSMapperImpl#getStylePackage <em>Style Package</em>}</li>
 *   <li>{@link domain.impl.CSSMapperImpl#getStyleLibrary <em>Style Library</em>}</li>
 *   <li>{@link domain.impl.CSSMapperImpl#getFakePackageName <em>Fake Package Name</em>}</li>
 *   <li>{@link domain.impl.CSSMapperImpl#getFakeTypeName <em>Fake Type Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CSSMapperImpl extends MapperImpl implements CSSMapper {
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
	 * The cached value of the '{@link #getStylePackage() <em>Style Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStylePackage()
	 * @generated
	 * @ordered
	 */
	protected StylesPackage stylePackage;

	/**
	 * The cached value of the '{@link #getStyleLibrary() <em>Style Library</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleLibrary()
	 * @generated
	 * @ordered
	 */
	protected StyleLibrary styleLibrary;

	/**
	 * The default value of the '{@link #getFakePackageName() <em>Fake Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFakePackageName()
	 * @generated
	 * @ordered
	 */
	protected static final String FAKE_PACKAGE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFakePackageName() <em>Fake Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFakePackageName()
	 * @generated
	 * @ordered
	 */
	protected String fakePackageName = FAKE_PACKAGE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFakeTypeName() <em>Fake Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFakeTypeName()
	 * @generated
	 * @ordered
	 */
	protected static final String FAKE_TYPE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFakeTypeName() <em>Fake Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFakeTypeName()
	 * @generated
	 * @ordered
	 */
	protected String fakeTypeName = FAKE_TYPE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CSSMapperImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.CSS_MAPPER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.CSS_MAPPER__LIBRARY_URL, oldLibraryUrl, libraryUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StylesPackage getStylePackage() {
		if (stylePackage != null && stylePackage.eIsProxy()) {
			InternalEObject oldStylePackage = (InternalEObject)stylePackage;
			stylePackage = (StylesPackage)eResolveProxy(oldStylePackage);
			if (stylePackage != oldStylePackage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.CSS_MAPPER__STYLE_PACKAGE, oldStylePackage, stylePackage));
			}
		}
		return stylePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StylesPackage basicGetStylePackage() {
		return stylePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStylePackage(StylesPackage newStylePackage) {
		StylesPackage oldStylePackage = stylePackage;
		stylePackage = newStylePackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.CSS_MAPPER__STYLE_PACKAGE, oldStylePackage, stylePackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleLibrary getStyleLibrary() {
		if (styleLibrary != null && styleLibrary.eIsProxy()) {
			InternalEObject oldStyleLibrary = (InternalEObject)styleLibrary;
			styleLibrary = (StyleLibrary)eResolveProxy(oldStyleLibrary);
			if (styleLibrary != oldStyleLibrary) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.CSS_MAPPER__STYLE_LIBRARY, oldStyleLibrary, styleLibrary));
			}
		}
		return styleLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleLibrary basicGetStyleLibrary() {
		return styleLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyleLibrary(StyleLibrary newStyleLibrary) {
		StyleLibrary oldStyleLibrary = styleLibrary;
		styleLibrary = newStyleLibrary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.CSS_MAPPER__STYLE_LIBRARY, oldStyleLibrary, styleLibrary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFakePackageName() {
		return fakePackageName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFakePackageName(String newFakePackageName) {
		String oldFakePackageName = fakePackageName;
		fakePackageName = newFakePackageName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.CSS_MAPPER__FAKE_PACKAGE_NAME, oldFakePackageName, fakePackageName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFakeTypeName() {
		return fakeTypeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFakeTypeName(String newFakeTypeName) {
		String oldFakeTypeName = fakeTypeName;
		fakeTypeName = newFakeTypeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.CSS_MAPPER__FAKE_TYPE_NAME, oldFakeTypeName, fakeTypeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DomainPackage.CSS_MAPPER__LIBRARY_URL:
				return getLibraryUrl();
			case DomainPackage.CSS_MAPPER__STYLE_PACKAGE:
				if (resolve) return getStylePackage();
				return basicGetStylePackage();
			case DomainPackage.CSS_MAPPER__STYLE_LIBRARY:
				if (resolve) return getStyleLibrary();
				return basicGetStyleLibrary();
			case DomainPackage.CSS_MAPPER__FAKE_PACKAGE_NAME:
				return getFakePackageName();
			case DomainPackage.CSS_MAPPER__FAKE_TYPE_NAME:
				return getFakeTypeName();
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
			case DomainPackage.CSS_MAPPER__LIBRARY_URL:
				setLibraryUrl((String)newValue);
				return;
			case DomainPackage.CSS_MAPPER__STYLE_PACKAGE:
				setStylePackage((StylesPackage)newValue);
				return;
			case DomainPackage.CSS_MAPPER__STYLE_LIBRARY:
				setStyleLibrary((StyleLibrary)newValue);
				return;
			case DomainPackage.CSS_MAPPER__FAKE_PACKAGE_NAME:
				setFakePackageName((String)newValue);
				return;
			case DomainPackage.CSS_MAPPER__FAKE_TYPE_NAME:
				setFakeTypeName((String)newValue);
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
			case DomainPackage.CSS_MAPPER__LIBRARY_URL:
				setLibraryUrl(LIBRARY_URL_EDEFAULT);
				return;
			case DomainPackage.CSS_MAPPER__STYLE_PACKAGE:
				setStylePackage((StylesPackage)null);
				return;
			case DomainPackage.CSS_MAPPER__STYLE_LIBRARY:
				setStyleLibrary((StyleLibrary)null);
				return;
			case DomainPackage.CSS_MAPPER__FAKE_PACKAGE_NAME:
				setFakePackageName(FAKE_PACKAGE_NAME_EDEFAULT);
				return;
			case DomainPackage.CSS_MAPPER__FAKE_TYPE_NAME:
				setFakeTypeName(FAKE_TYPE_NAME_EDEFAULT);
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
			case DomainPackage.CSS_MAPPER__LIBRARY_URL:
				return LIBRARY_URL_EDEFAULT == null ? libraryUrl != null : !LIBRARY_URL_EDEFAULT.equals(libraryUrl);
			case DomainPackage.CSS_MAPPER__STYLE_PACKAGE:
				return stylePackage != null;
			case DomainPackage.CSS_MAPPER__STYLE_LIBRARY:
				return styleLibrary != null;
			case DomainPackage.CSS_MAPPER__FAKE_PACKAGE_NAME:
				return FAKE_PACKAGE_NAME_EDEFAULT == null ? fakePackageName != null : !FAKE_PACKAGE_NAME_EDEFAULT.equals(fakePackageName);
			case DomainPackage.CSS_MAPPER__FAKE_TYPE_NAME:
				return FAKE_TYPE_NAME_EDEFAULT == null ? fakeTypeName != null : !FAKE_TYPE_NAME_EDEFAULT.equals(fakeTypeName);
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
		result.append(" (libraryUrl: ");
		result.append(libraryUrl);
		result.append(", fakePackageName: ");
		result.append(fakePackageName);
		result.append(", fakeTypeName: ");
		result.append(fakeTypeName);
		result.append(')');
		return result.toString();
	}

} //CSSMapperImpl
