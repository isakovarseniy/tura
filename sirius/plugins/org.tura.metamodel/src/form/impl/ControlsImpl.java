/**
 */
package form.impl;

import form.Controls;
import form.DataControl;
import form.Dependency;
import form.FormDataControls;
import form.FormPackage;
import form.Relation;
import form.Root;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Controls</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link form.impl.ControlsImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link form.impl.ControlsImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link form.impl.ControlsImpl#getRoot <em>Root</em>}</li>
 *   <li>{@link form.impl.ControlsImpl#getControls <em>Controls</em>}</li>
 *   <li>{@link form.impl.ControlsImpl#getRelations <em>Relations</em>}</li>
 *   <li>{@link form.impl.ControlsImpl#getDependencies <em>Dependencies</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlsImpl extends EObjectImpl implements Controls {
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
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected FormDataControls parent;

	/**
	 * The cached value of the '{@link #getRoot() <em>Root</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoot()
	 * @generated
	 * @ordered
	 */
	protected Root root;

	/**
	 * The cached value of the '{@link #getControls() <em>Controls</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControls()
	 * @generated
	 * @ordered
	 */
	protected EList<DataControl> controls;

	/**
	 * The cached value of the '{@link #getRelations() <em>Relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<Relation> relations;

	/**
	 * The cached value of the '{@link #getDependencies() <em>Dependencies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependencies()
	 * @generated
	 * @ordered
	 */
	protected EList<Dependency> dependencies;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FormPackage.Literals.CONTROLS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.CONTROLS__UID, oldUid, uid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormDataControls getParent() {
		if (parent != null && parent.eIsProxy()) {
			InternalEObject oldParent = (InternalEObject)parent;
			parent = (FormDataControls)eResolveProxy(oldParent);
			if (parent != oldParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FormPackage.CONTROLS__PARENT, oldParent, parent));
			}
		}
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormDataControls basicGetParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(FormDataControls newParent, NotificationChain msgs) {
		FormDataControls oldParent = parent;
		parent = newParent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FormPackage.CONTROLS__PARENT, oldParent, newParent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(FormDataControls newParent) {
		if (newParent != parent) {
			NotificationChain msgs = null;
			if (parent != null)
				msgs = ((InternalEObject)parent).eInverseRemove(this, FormPackage.FORM_DATA_CONTROLS__FORM_CONTROL, FormDataControls.class, msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, FormPackage.FORM_DATA_CONTROLS__FORM_CONTROL, FormDataControls.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.CONTROLS__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Root getRoot() {
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoot(Root newRoot, NotificationChain msgs) {
		Root oldRoot = root;
		root = newRoot;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FormPackage.CONTROLS__ROOT, oldRoot, newRoot);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoot(Root newRoot) {
		if (newRoot != root) {
			NotificationChain msgs = null;
			if (root != null)
				msgs = ((InternalEObject)root).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FormPackage.CONTROLS__ROOT, null, msgs);
			if (newRoot != null)
				msgs = ((InternalEObject)newRoot).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FormPackage.CONTROLS__ROOT, null, msgs);
			msgs = basicSetRoot(newRoot, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.CONTROLS__ROOT, newRoot, newRoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataControl> getControls() {
		if (controls == null) {
			controls = new EObjectContainmentWithInverseEList<DataControl>(DataControl.class, this, FormPackage.CONTROLS__CONTROLS, FormPackage.DATA_CONTROL__PARENT);
		}
		return controls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relation> getRelations() {
		if (relations == null) {
			relations = new EObjectContainmentEList<Relation>(Relation.class, this, FormPackage.CONTROLS__RELATIONS);
		}
		return relations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dependency> getDependencies() {
		if (dependencies == null) {
			dependencies = new EObjectContainmentEList<Dependency>(Dependency.class, this, FormPackage.CONTROLS__DEPENDENCIES);
		}
		return dependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FormPackage.CONTROLS__PARENT:
				if (parent != null)
					msgs = ((InternalEObject)parent).eInverseRemove(this, FormPackage.FORM_DATA_CONTROLS__FORM_CONTROL, FormDataControls.class, msgs);
				return basicSetParent((FormDataControls)otherEnd, msgs);
			case FormPackage.CONTROLS__CONTROLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getControls()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FormPackage.CONTROLS__PARENT:
				return basicSetParent(null, msgs);
			case FormPackage.CONTROLS__ROOT:
				return basicSetRoot(null, msgs);
			case FormPackage.CONTROLS__CONTROLS:
				return ((InternalEList<?>)getControls()).basicRemove(otherEnd, msgs);
			case FormPackage.CONTROLS__RELATIONS:
				return ((InternalEList<?>)getRelations()).basicRemove(otherEnd, msgs);
			case FormPackage.CONTROLS__DEPENDENCIES:
				return ((InternalEList<?>)getDependencies()).basicRemove(otherEnd, msgs);
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
			case FormPackage.CONTROLS__UID:
				return getUid();
			case FormPackage.CONTROLS__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case FormPackage.CONTROLS__ROOT:
				return getRoot();
			case FormPackage.CONTROLS__CONTROLS:
				return getControls();
			case FormPackage.CONTROLS__RELATIONS:
				return getRelations();
			case FormPackage.CONTROLS__DEPENDENCIES:
				return getDependencies();
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
			case FormPackage.CONTROLS__UID:
				setUid((String)newValue);
				return;
			case FormPackage.CONTROLS__PARENT:
				setParent((FormDataControls)newValue);
				return;
			case FormPackage.CONTROLS__ROOT:
				setRoot((Root)newValue);
				return;
			case FormPackage.CONTROLS__CONTROLS:
				getControls().clear();
				getControls().addAll((Collection<? extends DataControl>)newValue);
				return;
			case FormPackage.CONTROLS__RELATIONS:
				getRelations().clear();
				getRelations().addAll((Collection<? extends Relation>)newValue);
				return;
			case FormPackage.CONTROLS__DEPENDENCIES:
				getDependencies().clear();
				getDependencies().addAll((Collection<? extends Dependency>)newValue);
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
			case FormPackage.CONTROLS__UID:
				setUid(UID_EDEFAULT);
				return;
			case FormPackage.CONTROLS__PARENT:
				setParent((FormDataControls)null);
				return;
			case FormPackage.CONTROLS__ROOT:
				setRoot((Root)null);
				return;
			case FormPackage.CONTROLS__CONTROLS:
				getControls().clear();
				return;
			case FormPackage.CONTROLS__RELATIONS:
				getRelations().clear();
				return;
			case FormPackage.CONTROLS__DEPENDENCIES:
				getDependencies().clear();
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
			case FormPackage.CONTROLS__UID:
				return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
			case FormPackage.CONTROLS__PARENT:
				return parent != null;
			case FormPackage.CONTROLS__ROOT:
				return root != null;
			case FormPackage.CONTROLS__CONTROLS:
				return controls != null && !controls.isEmpty();
			case FormPackage.CONTROLS__RELATIONS:
				return relations != null && !relations.isEmpty();
			case FormPackage.CONTROLS__DEPENDENCIES:
				return dependencies != null && !dependencies.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //ControlsImpl
