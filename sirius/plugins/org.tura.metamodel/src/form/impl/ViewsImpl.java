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
package form.impl;

import form.CanvasFrame;
import form.FormPackage;
import form.MenuDefinition;
import form.TabPagesInheritance;
import form.ViewInheritance;
import form.Views;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Views</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link form.impl.ViewsImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link form.impl.ViewsImpl#getCanvases <em>Canvases</em>}</li>
 *   <li>{@link form.impl.ViewsImpl#getViewInheritances <em>View Inheritances</em>}</li>
 *   <li>{@link form.impl.ViewsImpl#getTabPagesInheritances <em>Tab Pages Inheritances</em>}</li>
 *   <li>{@link form.impl.ViewsImpl#getMenus <em>Menus</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ViewsImpl extends EObjectImpl implements Views {
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
	 * The cached value of the '{@link #getCanvases() <em>Canvases</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCanvases()
	 * @generated
	 * @ordered
	 */
	protected EList<CanvasFrame> canvases;

	/**
	 * The cached value of the '{@link #getViewInheritances() <em>View Inheritances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewInheritances()
	 * @generated
	 * @ordered
	 */
	protected EList<ViewInheritance> viewInheritances;

	/**
	 * The cached value of the '{@link #getTabPagesInheritances() <em>Tab Pages Inheritances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTabPagesInheritances()
	 * @generated
	 * @ordered
	 */
	protected EList<TabPagesInheritance> tabPagesInheritances;

	/**
	 * The cached value of the '{@link #getMenus() <em>Menus</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMenus()
	 * @generated
	 * @ordered
	 */
	protected EList<MenuDefinition> menus;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FormPackage.Literals.VIEWS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.VIEWS__UID, oldUid, uid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CanvasFrame> getCanvases() {
		if (canvases == null) {
			canvases = new EObjectContainmentEList<CanvasFrame>(CanvasFrame.class, this, FormPackage.VIEWS__CANVASES);
		}
		return canvases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ViewInheritance> getViewInheritances() {
		if (viewInheritances == null) {
			viewInheritances = new EObjectContainmentEList<ViewInheritance>(ViewInheritance.class, this, FormPackage.VIEWS__VIEW_INHERITANCES);
		}
		return viewInheritances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TabPagesInheritance> getTabPagesInheritances() {
		if (tabPagesInheritances == null) {
			tabPagesInheritances = new EObjectContainmentEList<TabPagesInheritance>(TabPagesInheritance.class, this, FormPackage.VIEWS__TAB_PAGES_INHERITANCES);
		}
		return tabPagesInheritances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MenuDefinition> getMenus() {
		if (menus == null) {
			menus = new EObjectContainmentEList<MenuDefinition>(MenuDefinition.class, this, FormPackage.VIEWS__MENUS);
		}
		return menus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FormPackage.VIEWS__CANVASES:
				return ((InternalEList<?>)getCanvases()).basicRemove(otherEnd, msgs);
			case FormPackage.VIEWS__VIEW_INHERITANCES:
				return ((InternalEList<?>)getViewInheritances()).basicRemove(otherEnd, msgs);
			case FormPackage.VIEWS__TAB_PAGES_INHERITANCES:
				return ((InternalEList<?>)getTabPagesInheritances()).basicRemove(otherEnd, msgs);
			case FormPackage.VIEWS__MENUS:
				return ((InternalEList<?>)getMenus()).basicRemove(otherEnd, msgs);
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
			case FormPackage.VIEWS__UID:
				return getUid();
			case FormPackage.VIEWS__CANVASES:
				return getCanvases();
			case FormPackage.VIEWS__VIEW_INHERITANCES:
				return getViewInheritances();
			case FormPackage.VIEWS__TAB_PAGES_INHERITANCES:
				return getTabPagesInheritances();
			case FormPackage.VIEWS__MENUS:
				return getMenus();
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
			case FormPackage.VIEWS__UID:
				setUid((String)newValue);
				return;
			case FormPackage.VIEWS__CANVASES:
				getCanvases().clear();
				getCanvases().addAll((Collection<? extends CanvasFrame>)newValue);
				return;
			case FormPackage.VIEWS__VIEW_INHERITANCES:
				getViewInheritances().clear();
				getViewInheritances().addAll((Collection<? extends ViewInheritance>)newValue);
				return;
			case FormPackage.VIEWS__TAB_PAGES_INHERITANCES:
				getTabPagesInheritances().clear();
				getTabPagesInheritances().addAll((Collection<? extends TabPagesInheritance>)newValue);
				return;
			case FormPackage.VIEWS__MENUS:
				getMenus().clear();
				getMenus().addAll((Collection<? extends MenuDefinition>)newValue);
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
			case FormPackage.VIEWS__UID:
				setUid(UID_EDEFAULT);
				return;
			case FormPackage.VIEWS__CANVASES:
				getCanvases().clear();
				return;
			case FormPackage.VIEWS__VIEW_INHERITANCES:
				getViewInheritances().clear();
				return;
			case FormPackage.VIEWS__TAB_PAGES_INHERITANCES:
				getTabPagesInheritances().clear();
				return;
			case FormPackage.VIEWS__MENUS:
				getMenus().clear();
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
			case FormPackage.VIEWS__UID:
				return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
			case FormPackage.VIEWS__CANVASES:
				return canvases != null && !canvases.isEmpty();
			case FormPackage.VIEWS__VIEW_INHERITANCES:
				return viewInheritances != null && !viewInheritances.isEmpty();
			case FormPackage.VIEWS__TAB_PAGES_INHERITANCES:
				return tabPagesInheritances != null && !tabPagesInheritances.isEmpty();
			case FormPackage.VIEWS__MENUS:
				return menus != null && !menus.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //ViewsImpl
