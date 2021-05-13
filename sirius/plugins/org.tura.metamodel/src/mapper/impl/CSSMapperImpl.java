/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
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

import mapper.CSSMapper;
import mapper.MapperPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import style.StyleLibrary;
import style.StylePackage;
import style.StylePointer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CSS Mapper</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mapper.impl.CSSMapperImpl#getStyleLibrary <em>Style Library</em>}</li>
 *   <li>{@link mapper.impl.CSSMapperImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link mapper.impl.CSSMapperImpl#getLibraryUrl <em>Library Url</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CSSMapperImpl extends MapperImpl implements CSSMapper {
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
		return MapperPackage.Literals.CSS_MAPPER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StyleLibrary getStyleLibrary() {
		if (styleLibrary != null && styleLibrary.eIsProxy()) {
			InternalEObject oldStyleLibrary = (InternalEObject)styleLibrary;
			styleLibrary = (StyleLibrary)eResolveProxy(oldStyleLibrary);
			if (styleLibrary != oldStyleLibrary) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MapperPackage.CSS_MAPPER__STYLE_LIBRARY, oldStyleLibrary, styleLibrary));
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
	@Override
	public void setStyleLibrary(StyleLibrary newStyleLibrary) {
		StyleLibrary oldStyleLibrary = styleLibrary;
		styleLibrary = newStyleLibrary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MapperPackage.CSS_MAPPER__STYLE_LIBRARY, oldStyleLibrary, styleLibrary));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MapperPackage.CSS_MAPPER__UID, oldUid, uid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLibraryUrl() {
		return libraryUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLibraryUrl(String newLibraryUrl) {
		String oldLibraryUrl = libraryUrl;
		libraryUrl = newLibraryUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MapperPackage.CSS_MAPPER__LIBRARY_URL, oldLibraryUrl, libraryUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MapperPackage.CSS_MAPPER__STYLE_LIBRARY:
				if (resolve) return getStyleLibrary();
				return basicGetStyleLibrary();
			case MapperPackage.CSS_MAPPER__UID:
				return getUid();
			case MapperPackage.CSS_MAPPER__LIBRARY_URL:
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
			case MapperPackage.CSS_MAPPER__STYLE_LIBRARY:
				setStyleLibrary((StyleLibrary)newValue);
				return;
			case MapperPackage.CSS_MAPPER__UID:
				setUid((String)newValue);
				return;
			case MapperPackage.CSS_MAPPER__LIBRARY_URL:
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
			case MapperPackage.CSS_MAPPER__STYLE_LIBRARY:
				setStyleLibrary((StyleLibrary)null);
				return;
			case MapperPackage.CSS_MAPPER__UID:
				setUid(UID_EDEFAULT);
				return;
			case MapperPackage.CSS_MAPPER__LIBRARY_URL:
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
			case MapperPackage.CSS_MAPPER__STYLE_LIBRARY:
				return styleLibrary != null;
			case MapperPackage.CSS_MAPPER__UID:
				return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
			case MapperPackage.CSS_MAPPER__LIBRARY_URL:
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
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == StylePointer.class) {
			switch (derivedFeatureID) {
				case MapperPackage.CSS_MAPPER__STYLE_LIBRARY: return StylePackage.STYLE_POINTER__STYLE_LIBRARY;
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
		if (baseClass == StylePointer.class) {
			switch (baseFeatureID) {
				case StylePackage.STYLE_POINTER__STYLE_LIBRARY: return MapperPackage.CSS_MAPPER__STYLE_LIBRARY;
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
		result.append(')');
		return result.toString();
	}

} //CSSMapperImpl
