/**
 */
package form.impl;

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

import form.DataControl;
import form.FormPackage;
import form.Relation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link form.impl.RelationImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link form.impl.RelationImpl#getName <em>Name</em>}</li>
 *   <li>{@link form.impl.RelationImpl#getMaster <em>Master</em>}</li>
 *   <li>{@link form.impl.RelationImpl#getDetail <em>Detail</em>}</li>
 *   <li>{@link form.impl.RelationImpl#isIsTree <em>Is Tree</em>}</li>
 *   <li>{@link form.impl.RelationImpl#getLinks <em>Links</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationImpl extends EObjectImpl implements Relation {
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
	 * The cached value of the '{@link #getMaster() <em>Master</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaster()
	 * @generated
	 * @ordered
	 */
	protected DataControl master;

	/**
	 * The cached value of the '{@link #getDetail() <em>Detail</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetail()
	 * @generated
	 * @ordered
	 */
	protected DataControl detail;

	/**
	 * The default value of the '{@link #isIsTree() <em>Is Tree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsTree()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_TREE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsTree() <em>Is Tree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsTree()
	 * @generated
	 * @ordered
	 */
	protected boolean isTree = IS_TREE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLinks() <em>Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<type.Link> links;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FormPackage.Literals.RELATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.RELATION__UID, oldUid, uid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.RELATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataControl getMaster() {
		if (master != null && master.eIsProxy()) {
			InternalEObject oldMaster = (InternalEObject)master;
			master = (DataControl)eResolveProxy(oldMaster);
			if (master != oldMaster) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FormPackage.RELATION__MASTER, oldMaster, master));
			}
		}
		return master;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataControl basicGetMaster() {
		return master;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaster(DataControl newMaster) {
		DataControl oldMaster = master;
		master = newMaster;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.RELATION__MASTER, oldMaster, master));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataControl getDetail() {
		if (detail != null && detail.eIsProxy()) {
			InternalEObject oldDetail = (InternalEObject)detail;
			detail = (DataControl)eResolveProxy(oldDetail);
			if (detail != oldDetail) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FormPackage.RELATION__DETAIL, oldDetail, detail));
			}
		}
		return detail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataControl basicGetDetail() {
		return detail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDetail(DataControl newDetail) {
		DataControl oldDetail = detail;
		detail = newDetail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.RELATION__DETAIL, oldDetail, detail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsTree() {
		return isTree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsTree(boolean newIsTree) {
		boolean oldIsTree = isTree;
		isTree = newIsTree;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.RELATION__IS_TREE, oldIsTree, isTree));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<type.Link> getLinks() {
		if (links == null) {
			links = new EObjectContainmentEList<type.Link>(type.Link.class, this, FormPackage.RELATION__LINKS);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FormPackage.RELATION__LINKS:
				return ((InternalEList<?>)getLinks()).basicRemove(otherEnd, msgs);
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
			case FormPackage.RELATION__UID:
				return getUid();
			case FormPackage.RELATION__NAME:
				return getName();
			case FormPackage.RELATION__MASTER:
				if (resolve) return getMaster();
				return basicGetMaster();
			case FormPackage.RELATION__DETAIL:
				if (resolve) return getDetail();
				return basicGetDetail();
			case FormPackage.RELATION__IS_TREE:
				return isIsTree();
			case FormPackage.RELATION__LINKS:
				return getLinks();
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
			case FormPackage.RELATION__UID:
				setUid((String)newValue);
				return;
			case FormPackage.RELATION__NAME:
				setName((String)newValue);
				return;
			case FormPackage.RELATION__MASTER:
				setMaster((DataControl)newValue);
				return;
			case FormPackage.RELATION__DETAIL:
				setDetail((DataControl)newValue);
				return;
			case FormPackage.RELATION__IS_TREE:
				setIsTree((Boolean)newValue);
				return;
			case FormPackage.RELATION__LINKS:
				getLinks().clear();
				getLinks().addAll((Collection<? extends type.Link>)newValue);
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
			case FormPackage.RELATION__UID:
				setUid(UID_EDEFAULT);
				return;
			case FormPackage.RELATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FormPackage.RELATION__MASTER:
				setMaster((DataControl)null);
				return;
			case FormPackage.RELATION__DETAIL:
				setDetail((DataControl)null);
				return;
			case FormPackage.RELATION__IS_TREE:
				setIsTree(IS_TREE_EDEFAULT);
				return;
			case FormPackage.RELATION__LINKS:
				getLinks().clear();
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
			case FormPackage.RELATION__UID:
				return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
			case FormPackage.RELATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FormPackage.RELATION__MASTER:
				return master != null;
			case FormPackage.RELATION__DETAIL:
				return detail != null;
			case FormPackage.RELATION__IS_TREE:
				return isTree != IS_TREE_EDEFAULT;
			case FormPackage.RELATION__LINKS:
				return links != null && !links.isEmpty();
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
		result.append(", name: ");
		result.append(name);
		result.append(", isTree: ");
		result.append(isTree);
		result.append(')');
		return result.toString();
	}

} //RelationImpl
