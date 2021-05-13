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
package recipe.impl;

import mapper.Mapper;
import mapper.MapperPackage;
import mapper.Version;
import mapper.VersionRef;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import recipe.JavaScriptComponent;
import recipe.RecipePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Java Script Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link recipe.impl.JavaScriptComponentImpl#getVersionRef <em>Version Ref</em>}</li>
 *   <li>{@link recipe.impl.JavaScriptComponentImpl#getPackageName <em>Package Name</em>}</li>
 *   <li>{@link recipe.impl.JavaScriptComponentImpl#getMapperRef <em>Mapper Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JavaScriptComponentImpl extends ComponentImpl implements JavaScriptComponent {
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
	 * The default value of the '{@link #getPackageName() <em>Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageName()
	 * @generated
	 * @ordered
	 */
	protected static final String PACKAGE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPackageName() <em>Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageName()
	 * @generated
	 * @ordered
	 */
	protected String packageName = PACKAGE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMapperRef() <em>Mapper Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapperRef()
	 * @generated
	 * @ordered
	 */
	protected Mapper mapperRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaScriptComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RecipePackage.Literals.JAVA_SCRIPT_COMPONENT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RecipePackage.JAVA_SCRIPT_COMPONENT__VERSION_REF, oldVersionRef, versionRef));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RecipePackage.JAVA_SCRIPT_COMPONENT__VERSION_REF, oldVersionRef, versionRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPackageName() {
		return packageName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPackageName(String newPackageName) {
		String oldPackageName = packageName;
		packageName = newPackageName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecipePackage.JAVA_SCRIPT_COMPONENT__PACKAGE_NAME, oldPackageName, packageName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Mapper getMapperRef() {
		if (mapperRef != null && mapperRef.eIsProxy()) {
			InternalEObject oldMapperRef = (InternalEObject)mapperRef;
			mapperRef = (Mapper)eResolveProxy(oldMapperRef);
			if (mapperRef != oldMapperRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RecipePackage.JAVA_SCRIPT_COMPONENT__MAPPER_REF, oldMapperRef, mapperRef));
			}
		}
		return mapperRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mapper basicGetMapperRef() {
		return mapperRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMapperRef(Mapper newMapperRef) {
		Mapper oldMapperRef = mapperRef;
		mapperRef = newMapperRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecipePackage.JAVA_SCRIPT_COMPONENT__MAPPER_REF, oldMapperRef, mapperRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RecipePackage.JAVA_SCRIPT_COMPONENT__VERSION_REF:
				if (resolve) return getVersionRef();
				return basicGetVersionRef();
			case RecipePackage.JAVA_SCRIPT_COMPONENT__PACKAGE_NAME:
				return getPackageName();
			case RecipePackage.JAVA_SCRIPT_COMPONENT__MAPPER_REF:
				if (resolve) return getMapperRef();
				return basicGetMapperRef();
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
			case RecipePackage.JAVA_SCRIPT_COMPONENT__VERSION_REF:
				setVersionRef((Version)newValue);
				return;
			case RecipePackage.JAVA_SCRIPT_COMPONENT__PACKAGE_NAME:
				setPackageName((String)newValue);
				return;
			case RecipePackage.JAVA_SCRIPT_COMPONENT__MAPPER_REF:
				setMapperRef((Mapper)newValue);
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
			case RecipePackage.JAVA_SCRIPT_COMPONENT__VERSION_REF:
				setVersionRef((Version)null);
				return;
			case RecipePackage.JAVA_SCRIPT_COMPONENT__PACKAGE_NAME:
				setPackageName(PACKAGE_NAME_EDEFAULT);
				return;
			case RecipePackage.JAVA_SCRIPT_COMPONENT__MAPPER_REF:
				setMapperRef((Mapper)null);
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
			case RecipePackage.JAVA_SCRIPT_COMPONENT__VERSION_REF:
				return versionRef != null;
			case RecipePackage.JAVA_SCRIPT_COMPONENT__PACKAGE_NAME:
				return PACKAGE_NAME_EDEFAULT == null ? packageName != null : !PACKAGE_NAME_EDEFAULT.equals(packageName);
			case RecipePackage.JAVA_SCRIPT_COMPONENT__MAPPER_REF:
				return mapperRef != null;
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
				case RecipePackage.JAVA_SCRIPT_COMPONENT__VERSION_REF: return MapperPackage.VERSION_REF__VERSION_REF;
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
				case MapperPackage.VERSION_REF__VERSION_REF: return RecipePackage.JAVA_SCRIPT_COMPONENT__VERSION_REF;
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
		result.append(" (packageName: ");
		result.append(packageName);
		result.append(')');
		return result.toString();
	}

} //JavaScriptComponentImpl
