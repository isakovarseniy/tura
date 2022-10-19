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
package form.impl;

import artifact.impl.CategorizedImpl;

import form.ArtificialField;
import form.ContextParameters;
import form.CreateTrigger;
import form.DataControl;
import form.FormPackage;
import form.Orders;
import form.POSTCreateTrigger;
import form.POSTQueryTrigger;
import form.PREDeleteTrigger;
import form.PREInsertTrigger;
import form.PREQueryTrigger;
import form.PREUpdateTrigger;
import form.RelationMapper;
import form.SearchTrigger;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import type.TypePointer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link form.impl.DataControlImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link form.impl.DataControlImpl#getName <em>Name</em>}</li>
 *   <li>{@link form.impl.DataControlImpl#getBaseType <em>Base Type</em>}</li>
 *   <li>{@link form.impl.DataControlImpl#getPreQueryTrigger <em>Pre Query Trigger</em>}</li>
 *   <li>{@link form.impl.DataControlImpl#getPostQueryTrigger <em>Post Query Trigger</em>}</li>
 *   <li>{@link form.impl.DataControlImpl#getPreInsertTrigger <em>Pre Insert Trigger</em>}</li>
 *   <li>{@link form.impl.DataControlImpl#getPreDeleteTrigger <em>Pre Delete Trigger</em>}</li>
 *   <li>{@link form.impl.DataControlImpl#getPostCreateTrigger <em>Post Create Trigger</em>}</li>
 *   <li>{@link form.impl.DataControlImpl#getPreUpdateTrigger <em>Pre Update Trigger</em>}</li>
 *   <li>{@link form.impl.DataControlImpl#getCreate <em>Create</em>}</li>
 *   <li>{@link form.impl.DataControlImpl#getSearch <em>Search</em>}</li>
 *   <li>{@link form.impl.DataControlImpl#getArtificialFields <em>Artificial Fields</em>}</li>
 *   <li>{@link form.impl.DataControlImpl#getDefaultSearch <em>Default Search</em>}</li>
 *   <li>{@link form.impl.DataControlImpl#getDefaultOrderBy <em>Default Order By</em>}</li>
 *   <li>{@link form.impl.DataControlImpl#getRelationMappers <em>Relation Mappers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataControlImpl extends CategorizedImpl implements DataControl {
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
	 * The cached value of the '{@link #getBaseType() <em>Base Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseType()
	 * @generated
	 * @ordered
	 */
	protected TypePointer baseType;

	/**
	 * The cached value of the '{@link #getPreQueryTrigger() <em>Pre Query Trigger</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreQueryTrigger()
	 * @generated
	 * @ordered
	 */
	protected PREQueryTrigger preQueryTrigger;

	/**
	 * The cached value of the '{@link #getPostQueryTrigger() <em>Post Query Trigger</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostQueryTrigger()
	 * @generated
	 * @ordered
	 */
	protected POSTQueryTrigger postQueryTrigger;

	/**
	 * The cached value of the '{@link #getPreInsertTrigger() <em>Pre Insert Trigger</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreInsertTrigger()
	 * @generated
	 * @ordered
	 */
	protected PREInsertTrigger preInsertTrigger;

	/**
	 * The cached value of the '{@link #getPreDeleteTrigger() <em>Pre Delete Trigger</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreDeleteTrigger()
	 * @generated
	 * @ordered
	 */
	protected PREDeleteTrigger preDeleteTrigger;

	/**
	 * The cached value of the '{@link #getPostCreateTrigger() <em>Post Create Trigger</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostCreateTrigger()
	 * @generated
	 * @ordered
	 */
	protected POSTCreateTrigger postCreateTrigger;

	/**
	 * The cached value of the '{@link #getPreUpdateTrigger() <em>Pre Update Trigger</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreUpdateTrigger()
	 * @generated
	 * @ordered
	 */
	protected PREUpdateTrigger preUpdateTrigger;

	/**
	 * The cached value of the '{@link #getCreate() <em>Create</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreate()
	 * @generated
	 * @ordered
	 */
	protected CreateTrigger create;

	/**
	 * The cached value of the '{@link #getSearch() <em>Search</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSearch()
	 * @generated
	 * @ordered
	 */
	protected SearchTrigger search;

	/**
	 * The cached value of the '{@link #getArtificialFields() <em>Artificial Fields</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtificialFields()
	 * @generated
	 * @ordered
	 */
	protected EList<ArtificialField> artificialFields;

	/**
	 * The cached value of the '{@link #getDefaultSearch() <em>Default Search</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultSearch()
	 * @generated
	 * @ordered
	 */
	protected ContextParameters defaultSearch;

	/**
	 * The cached value of the '{@link #getDefaultOrderBy() <em>Default Order By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultOrderBy()
	 * @generated
	 * @ordered
	 */
	protected Orders defaultOrderBy;

	/**
	 * The cached value of the '{@link #getRelationMappers() <em>Relation Mappers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationMappers()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationMapper> relationMappers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataControlImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FormPackage.Literals.DATA_CONTROL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.DATA_CONTROL__UID, oldUid, uid));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.DATA_CONTROL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypePointer getBaseType() {
		return baseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBaseType(TypePointer newBaseType, NotificationChain msgs) {
		TypePointer oldBaseType = baseType;
		baseType = newBaseType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FormPackage.DATA_CONTROL__BASE_TYPE, oldBaseType, newBaseType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBaseType(TypePointer newBaseType) {
		if (newBaseType != baseType) {
			NotificationChain msgs = null;
			if (baseType != null)
				msgs = ((InternalEObject)baseType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FormPackage.DATA_CONTROL__BASE_TYPE, null, msgs);
			if (newBaseType != null)
				msgs = ((InternalEObject)newBaseType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FormPackage.DATA_CONTROL__BASE_TYPE, null, msgs);
			msgs = basicSetBaseType(newBaseType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.DATA_CONTROL__BASE_TYPE, newBaseType, newBaseType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PREQueryTrigger getPreQueryTrigger() {
		return preQueryTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreQueryTrigger(PREQueryTrigger newPreQueryTrigger, NotificationChain msgs) {
		PREQueryTrigger oldPreQueryTrigger = preQueryTrigger;
		preQueryTrigger = newPreQueryTrigger;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FormPackage.DATA_CONTROL__PRE_QUERY_TRIGGER, oldPreQueryTrigger, newPreQueryTrigger);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPreQueryTrigger(PREQueryTrigger newPreQueryTrigger) {
		if (newPreQueryTrigger != preQueryTrigger) {
			NotificationChain msgs = null;
			if (preQueryTrigger != null)
				msgs = ((InternalEObject)preQueryTrigger).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FormPackage.DATA_CONTROL__PRE_QUERY_TRIGGER, null, msgs);
			if (newPreQueryTrigger != null)
				msgs = ((InternalEObject)newPreQueryTrigger).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FormPackage.DATA_CONTROL__PRE_QUERY_TRIGGER, null, msgs);
			msgs = basicSetPreQueryTrigger(newPreQueryTrigger, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.DATA_CONTROL__PRE_QUERY_TRIGGER, newPreQueryTrigger, newPreQueryTrigger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public POSTQueryTrigger getPostQueryTrigger() {
		return postQueryTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostQueryTrigger(POSTQueryTrigger newPostQueryTrigger, NotificationChain msgs) {
		POSTQueryTrigger oldPostQueryTrigger = postQueryTrigger;
		postQueryTrigger = newPostQueryTrigger;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FormPackage.DATA_CONTROL__POST_QUERY_TRIGGER, oldPostQueryTrigger, newPostQueryTrigger);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPostQueryTrigger(POSTQueryTrigger newPostQueryTrigger) {
		if (newPostQueryTrigger != postQueryTrigger) {
			NotificationChain msgs = null;
			if (postQueryTrigger != null)
				msgs = ((InternalEObject)postQueryTrigger).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FormPackage.DATA_CONTROL__POST_QUERY_TRIGGER, null, msgs);
			if (newPostQueryTrigger != null)
				msgs = ((InternalEObject)newPostQueryTrigger).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FormPackage.DATA_CONTROL__POST_QUERY_TRIGGER, null, msgs);
			msgs = basicSetPostQueryTrigger(newPostQueryTrigger, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.DATA_CONTROL__POST_QUERY_TRIGGER, newPostQueryTrigger, newPostQueryTrigger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PREInsertTrigger getPreInsertTrigger() {
		return preInsertTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreInsertTrigger(PREInsertTrigger newPreInsertTrigger, NotificationChain msgs) {
		PREInsertTrigger oldPreInsertTrigger = preInsertTrigger;
		preInsertTrigger = newPreInsertTrigger;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FormPackage.DATA_CONTROL__PRE_INSERT_TRIGGER, oldPreInsertTrigger, newPreInsertTrigger);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPreInsertTrigger(PREInsertTrigger newPreInsertTrigger) {
		if (newPreInsertTrigger != preInsertTrigger) {
			NotificationChain msgs = null;
			if (preInsertTrigger != null)
				msgs = ((InternalEObject)preInsertTrigger).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FormPackage.DATA_CONTROL__PRE_INSERT_TRIGGER, null, msgs);
			if (newPreInsertTrigger != null)
				msgs = ((InternalEObject)newPreInsertTrigger).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FormPackage.DATA_CONTROL__PRE_INSERT_TRIGGER, null, msgs);
			msgs = basicSetPreInsertTrigger(newPreInsertTrigger, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.DATA_CONTROL__PRE_INSERT_TRIGGER, newPreInsertTrigger, newPreInsertTrigger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PREDeleteTrigger getPreDeleteTrigger() {
		return preDeleteTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreDeleteTrigger(PREDeleteTrigger newPreDeleteTrigger, NotificationChain msgs) {
		PREDeleteTrigger oldPreDeleteTrigger = preDeleteTrigger;
		preDeleteTrigger = newPreDeleteTrigger;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FormPackage.DATA_CONTROL__PRE_DELETE_TRIGGER, oldPreDeleteTrigger, newPreDeleteTrigger);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPreDeleteTrigger(PREDeleteTrigger newPreDeleteTrigger) {
		if (newPreDeleteTrigger != preDeleteTrigger) {
			NotificationChain msgs = null;
			if (preDeleteTrigger != null)
				msgs = ((InternalEObject)preDeleteTrigger).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FormPackage.DATA_CONTROL__PRE_DELETE_TRIGGER, null, msgs);
			if (newPreDeleteTrigger != null)
				msgs = ((InternalEObject)newPreDeleteTrigger).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FormPackage.DATA_CONTROL__PRE_DELETE_TRIGGER, null, msgs);
			msgs = basicSetPreDeleteTrigger(newPreDeleteTrigger, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.DATA_CONTROL__PRE_DELETE_TRIGGER, newPreDeleteTrigger, newPreDeleteTrigger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public POSTCreateTrigger getPostCreateTrigger() {
		return postCreateTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostCreateTrigger(POSTCreateTrigger newPostCreateTrigger, NotificationChain msgs) {
		POSTCreateTrigger oldPostCreateTrigger = postCreateTrigger;
		postCreateTrigger = newPostCreateTrigger;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FormPackage.DATA_CONTROL__POST_CREATE_TRIGGER, oldPostCreateTrigger, newPostCreateTrigger);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPostCreateTrigger(POSTCreateTrigger newPostCreateTrigger) {
		if (newPostCreateTrigger != postCreateTrigger) {
			NotificationChain msgs = null;
			if (postCreateTrigger != null)
				msgs = ((InternalEObject)postCreateTrigger).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FormPackage.DATA_CONTROL__POST_CREATE_TRIGGER, null, msgs);
			if (newPostCreateTrigger != null)
				msgs = ((InternalEObject)newPostCreateTrigger).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FormPackage.DATA_CONTROL__POST_CREATE_TRIGGER, null, msgs);
			msgs = basicSetPostCreateTrigger(newPostCreateTrigger, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.DATA_CONTROL__POST_CREATE_TRIGGER, newPostCreateTrigger, newPostCreateTrigger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PREUpdateTrigger getPreUpdateTrigger() {
		return preUpdateTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreUpdateTrigger(PREUpdateTrigger newPreUpdateTrigger, NotificationChain msgs) {
		PREUpdateTrigger oldPreUpdateTrigger = preUpdateTrigger;
		preUpdateTrigger = newPreUpdateTrigger;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FormPackage.DATA_CONTROL__PRE_UPDATE_TRIGGER, oldPreUpdateTrigger, newPreUpdateTrigger);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPreUpdateTrigger(PREUpdateTrigger newPreUpdateTrigger) {
		if (newPreUpdateTrigger != preUpdateTrigger) {
			NotificationChain msgs = null;
			if (preUpdateTrigger != null)
				msgs = ((InternalEObject)preUpdateTrigger).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FormPackage.DATA_CONTROL__PRE_UPDATE_TRIGGER, null, msgs);
			if (newPreUpdateTrigger != null)
				msgs = ((InternalEObject)newPreUpdateTrigger).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FormPackage.DATA_CONTROL__PRE_UPDATE_TRIGGER, null, msgs);
			msgs = basicSetPreUpdateTrigger(newPreUpdateTrigger, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.DATA_CONTROL__PRE_UPDATE_TRIGGER, newPreUpdateTrigger, newPreUpdateTrigger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CreateTrigger getCreate() {
		return create;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreate(CreateTrigger newCreate, NotificationChain msgs) {
		CreateTrigger oldCreate = create;
		create = newCreate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FormPackage.DATA_CONTROL__CREATE, oldCreate, newCreate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreate(CreateTrigger newCreate) {
		if (newCreate != create) {
			NotificationChain msgs = null;
			if (create != null)
				msgs = ((InternalEObject)create).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FormPackage.DATA_CONTROL__CREATE, null, msgs);
			if (newCreate != null)
				msgs = ((InternalEObject)newCreate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FormPackage.DATA_CONTROL__CREATE, null, msgs);
			msgs = basicSetCreate(newCreate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.DATA_CONTROL__CREATE, newCreate, newCreate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SearchTrigger getSearch() {
		return search;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSearch(SearchTrigger newSearch, NotificationChain msgs) {
		SearchTrigger oldSearch = search;
		search = newSearch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FormPackage.DATA_CONTROL__SEARCH, oldSearch, newSearch);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSearch(SearchTrigger newSearch) {
		if (newSearch != search) {
			NotificationChain msgs = null;
			if (search != null)
				msgs = ((InternalEObject)search).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FormPackage.DATA_CONTROL__SEARCH, null, msgs);
			if (newSearch != null)
				msgs = ((InternalEObject)newSearch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FormPackage.DATA_CONTROL__SEARCH, null, msgs);
			msgs = basicSetSearch(newSearch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.DATA_CONTROL__SEARCH, newSearch, newSearch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ArtificialField> getArtificialFields() {
		if (artificialFields == null) {
			artificialFields = new EObjectContainmentEList<ArtificialField>(ArtificialField.class, this, FormPackage.DATA_CONTROL__ARTIFICIAL_FIELDS);
		}
		return artificialFields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContextParameters getDefaultSearch() {
		return defaultSearch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultSearch(ContextParameters newDefaultSearch, NotificationChain msgs) {
		ContextParameters oldDefaultSearch = defaultSearch;
		defaultSearch = newDefaultSearch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FormPackage.DATA_CONTROL__DEFAULT_SEARCH, oldDefaultSearch, newDefaultSearch);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultSearch(ContextParameters newDefaultSearch) {
		if (newDefaultSearch != defaultSearch) {
			NotificationChain msgs = null;
			if (defaultSearch != null)
				msgs = ((InternalEObject)defaultSearch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FormPackage.DATA_CONTROL__DEFAULT_SEARCH, null, msgs);
			if (newDefaultSearch != null)
				msgs = ((InternalEObject)newDefaultSearch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FormPackage.DATA_CONTROL__DEFAULT_SEARCH, null, msgs);
			msgs = basicSetDefaultSearch(newDefaultSearch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.DATA_CONTROL__DEFAULT_SEARCH, newDefaultSearch, newDefaultSearch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Orders getDefaultOrderBy() {
		return defaultOrderBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultOrderBy(Orders newDefaultOrderBy, NotificationChain msgs) {
		Orders oldDefaultOrderBy = defaultOrderBy;
		defaultOrderBy = newDefaultOrderBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FormPackage.DATA_CONTROL__DEFAULT_ORDER_BY, oldDefaultOrderBy, newDefaultOrderBy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultOrderBy(Orders newDefaultOrderBy) {
		if (newDefaultOrderBy != defaultOrderBy) {
			NotificationChain msgs = null;
			if (defaultOrderBy != null)
				msgs = ((InternalEObject)defaultOrderBy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FormPackage.DATA_CONTROL__DEFAULT_ORDER_BY, null, msgs);
			if (newDefaultOrderBy != null)
				msgs = ((InternalEObject)newDefaultOrderBy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FormPackage.DATA_CONTROL__DEFAULT_ORDER_BY, null, msgs);
			msgs = basicSetDefaultOrderBy(newDefaultOrderBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.DATA_CONTROL__DEFAULT_ORDER_BY, newDefaultOrderBy, newDefaultOrderBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RelationMapper> getRelationMappers() {
		if (relationMappers == null) {
			relationMappers = new EObjectContainmentEList<RelationMapper>(RelationMapper.class, this, FormPackage.DATA_CONTROL__RELATION_MAPPERS);
		}
		return relationMappers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FormPackage.DATA_CONTROL__BASE_TYPE:
				return basicSetBaseType(null, msgs);
			case FormPackage.DATA_CONTROL__PRE_QUERY_TRIGGER:
				return basicSetPreQueryTrigger(null, msgs);
			case FormPackage.DATA_CONTROL__POST_QUERY_TRIGGER:
				return basicSetPostQueryTrigger(null, msgs);
			case FormPackage.DATA_CONTROL__PRE_INSERT_TRIGGER:
				return basicSetPreInsertTrigger(null, msgs);
			case FormPackage.DATA_CONTROL__PRE_DELETE_TRIGGER:
				return basicSetPreDeleteTrigger(null, msgs);
			case FormPackage.DATA_CONTROL__POST_CREATE_TRIGGER:
				return basicSetPostCreateTrigger(null, msgs);
			case FormPackage.DATA_CONTROL__PRE_UPDATE_TRIGGER:
				return basicSetPreUpdateTrigger(null, msgs);
			case FormPackage.DATA_CONTROL__CREATE:
				return basicSetCreate(null, msgs);
			case FormPackage.DATA_CONTROL__SEARCH:
				return basicSetSearch(null, msgs);
			case FormPackage.DATA_CONTROL__ARTIFICIAL_FIELDS:
				return ((InternalEList<?>)getArtificialFields()).basicRemove(otherEnd, msgs);
			case FormPackage.DATA_CONTROL__DEFAULT_SEARCH:
				return basicSetDefaultSearch(null, msgs);
			case FormPackage.DATA_CONTROL__DEFAULT_ORDER_BY:
				return basicSetDefaultOrderBy(null, msgs);
			case FormPackage.DATA_CONTROL__RELATION_MAPPERS:
				return ((InternalEList<?>)getRelationMappers()).basicRemove(otherEnd, msgs);
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
			case FormPackage.DATA_CONTROL__UID:
				return getUid();
			case FormPackage.DATA_CONTROL__NAME:
				return getName();
			case FormPackage.DATA_CONTROL__BASE_TYPE:
				return getBaseType();
			case FormPackage.DATA_CONTROL__PRE_QUERY_TRIGGER:
				return getPreQueryTrigger();
			case FormPackage.DATA_CONTROL__POST_QUERY_TRIGGER:
				return getPostQueryTrigger();
			case FormPackage.DATA_CONTROL__PRE_INSERT_TRIGGER:
				return getPreInsertTrigger();
			case FormPackage.DATA_CONTROL__PRE_DELETE_TRIGGER:
				return getPreDeleteTrigger();
			case FormPackage.DATA_CONTROL__POST_CREATE_TRIGGER:
				return getPostCreateTrigger();
			case FormPackage.DATA_CONTROL__PRE_UPDATE_TRIGGER:
				return getPreUpdateTrigger();
			case FormPackage.DATA_CONTROL__CREATE:
				return getCreate();
			case FormPackage.DATA_CONTROL__SEARCH:
				return getSearch();
			case FormPackage.DATA_CONTROL__ARTIFICIAL_FIELDS:
				return getArtificialFields();
			case FormPackage.DATA_CONTROL__DEFAULT_SEARCH:
				return getDefaultSearch();
			case FormPackage.DATA_CONTROL__DEFAULT_ORDER_BY:
				return getDefaultOrderBy();
			case FormPackage.DATA_CONTROL__RELATION_MAPPERS:
				return getRelationMappers();
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
			case FormPackage.DATA_CONTROL__UID:
				setUid((String)newValue);
				return;
			case FormPackage.DATA_CONTROL__NAME:
				setName((String)newValue);
				return;
			case FormPackage.DATA_CONTROL__BASE_TYPE:
				setBaseType((TypePointer)newValue);
				return;
			case FormPackage.DATA_CONTROL__PRE_QUERY_TRIGGER:
				setPreQueryTrigger((PREQueryTrigger)newValue);
				return;
			case FormPackage.DATA_CONTROL__POST_QUERY_TRIGGER:
				setPostQueryTrigger((POSTQueryTrigger)newValue);
				return;
			case FormPackage.DATA_CONTROL__PRE_INSERT_TRIGGER:
				setPreInsertTrigger((PREInsertTrigger)newValue);
				return;
			case FormPackage.DATA_CONTROL__PRE_DELETE_TRIGGER:
				setPreDeleteTrigger((PREDeleteTrigger)newValue);
				return;
			case FormPackage.DATA_CONTROL__POST_CREATE_TRIGGER:
				setPostCreateTrigger((POSTCreateTrigger)newValue);
				return;
			case FormPackage.DATA_CONTROL__PRE_UPDATE_TRIGGER:
				setPreUpdateTrigger((PREUpdateTrigger)newValue);
				return;
			case FormPackage.DATA_CONTROL__CREATE:
				setCreate((CreateTrigger)newValue);
				return;
			case FormPackage.DATA_CONTROL__SEARCH:
				setSearch((SearchTrigger)newValue);
				return;
			case FormPackage.DATA_CONTROL__ARTIFICIAL_FIELDS:
				getArtificialFields().clear();
				getArtificialFields().addAll((Collection<? extends ArtificialField>)newValue);
				return;
			case FormPackage.DATA_CONTROL__DEFAULT_SEARCH:
				setDefaultSearch((ContextParameters)newValue);
				return;
			case FormPackage.DATA_CONTROL__DEFAULT_ORDER_BY:
				setDefaultOrderBy((Orders)newValue);
				return;
			case FormPackage.DATA_CONTROL__RELATION_MAPPERS:
				getRelationMappers().clear();
				getRelationMappers().addAll((Collection<? extends RelationMapper>)newValue);
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
			case FormPackage.DATA_CONTROL__UID:
				setUid(UID_EDEFAULT);
				return;
			case FormPackage.DATA_CONTROL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FormPackage.DATA_CONTROL__BASE_TYPE:
				setBaseType((TypePointer)null);
				return;
			case FormPackage.DATA_CONTROL__PRE_QUERY_TRIGGER:
				setPreQueryTrigger((PREQueryTrigger)null);
				return;
			case FormPackage.DATA_CONTROL__POST_QUERY_TRIGGER:
				setPostQueryTrigger((POSTQueryTrigger)null);
				return;
			case FormPackage.DATA_CONTROL__PRE_INSERT_TRIGGER:
				setPreInsertTrigger((PREInsertTrigger)null);
				return;
			case FormPackage.DATA_CONTROL__PRE_DELETE_TRIGGER:
				setPreDeleteTrigger((PREDeleteTrigger)null);
				return;
			case FormPackage.DATA_CONTROL__POST_CREATE_TRIGGER:
				setPostCreateTrigger((POSTCreateTrigger)null);
				return;
			case FormPackage.DATA_CONTROL__PRE_UPDATE_TRIGGER:
				setPreUpdateTrigger((PREUpdateTrigger)null);
				return;
			case FormPackage.DATA_CONTROL__CREATE:
				setCreate((CreateTrigger)null);
				return;
			case FormPackage.DATA_CONTROL__SEARCH:
				setSearch((SearchTrigger)null);
				return;
			case FormPackage.DATA_CONTROL__ARTIFICIAL_FIELDS:
				getArtificialFields().clear();
				return;
			case FormPackage.DATA_CONTROL__DEFAULT_SEARCH:
				setDefaultSearch((ContextParameters)null);
				return;
			case FormPackage.DATA_CONTROL__DEFAULT_ORDER_BY:
				setDefaultOrderBy((Orders)null);
				return;
			case FormPackage.DATA_CONTROL__RELATION_MAPPERS:
				getRelationMappers().clear();
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
			case FormPackage.DATA_CONTROL__UID:
				return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
			case FormPackage.DATA_CONTROL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FormPackage.DATA_CONTROL__BASE_TYPE:
				return baseType != null;
			case FormPackage.DATA_CONTROL__PRE_QUERY_TRIGGER:
				return preQueryTrigger != null;
			case FormPackage.DATA_CONTROL__POST_QUERY_TRIGGER:
				return postQueryTrigger != null;
			case FormPackage.DATA_CONTROL__PRE_INSERT_TRIGGER:
				return preInsertTrigger != null;
			case FormPackage.DATA_CONTROL__PRE_DELETE_TRIGGER:
				return preDeleteTrigger != null;
			case FormPackage.DATA_CONTROL__POST_CREATE_TRIGGER:
				return postCreateTrigger != null;
			case FormPackage.DATA_CONTROL__PRE_UPDATE_TRIGGER:
				return preUpdateTrigger != null;
			case FormPackage.DATA_CONTROL__CREATE:
				return create != null;
			case FormPackage.DATA_CONTROL__SEARCH:
				return search != null;
			case FormPackage.DATA_CONTROL__ARTIFICIAL_FIELDS:
				return artificialFields != null && !artificialFields.isEmpty();
			case FormPackage.DATA_CONTROL__DEFAULT_SEARCH:
				return defaultSearch != null;
			case FormPackage.DATA_CONTROL__DEFAULT_ORDER_BY:
				return defaultOrderBy != null;
			case FormPackage.DATA_CONTROL__RELATION_MAPPERS:
				return relationMappers != null && !relationMappers.isEmpty();
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
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //DataControlImpl
