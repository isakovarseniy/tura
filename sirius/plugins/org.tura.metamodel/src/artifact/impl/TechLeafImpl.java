/**
 */
package artifact.impl;

import artifact.ArtifactPackage;
import artifact.ConfigVariable;
import artifact.GenerationHint;
import artifact.TechLeaf;

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
 * An implementation of the model object '<em><b>Tech Leaf</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link artifact.impl.TechLeafImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link artifact.impl.TechLeafImpl#getName <em>Name</em>}</li>
 *   <li>{@link artifact.impl.TechLeafImpl#getHints <em>Hints</em>}</li>
 *   <li>{@link artifact.impl.TechLeafImpl#getConfigVariables <em>Config Variables</em>}</li>
 *   <li>{@link artifact.impl.TechLeafImpl#getTechLeafs <em>Tech Leafs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TechLeafImpl extends EObjectImpl implements TechLeaf {
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
	 * The cached value of the '{@link #getHints() <em>Hints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHints()
	 * @generated
	 * @ordered
	 */
	protected EList<GenerationHint> hints;

	/**
	 * The cached value of the '{@link #getConfigVariables() <em>Config Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<ConfigVariable> configVariables;

	/**
	 * The cached value of the '{@link #getTechLeafs() <em>Tech Leafs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechLeafs()
	 * @generated
	 * @ordered
	 */
	protected EList<TechLeaf> techLeafs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TechLeafImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArtifactPackage.Literals.TECH_LEAF;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArtifactPackage.TECH_LEAF__UID, oldUid, uid));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArtifactPackage.TECH_LEAF__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenerationHint> getHints() {
		if (hints == null) {
			hints = new EObjectContainmentEList<GenerationHint>(GenerationHint.class, this, ArtifactPackage.TECH_LEAF__HINTS);
		}
		return hints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConfigVariable> getConfigVariables() {
		if (configVariables == null) {
			configVariables = new EObjectContainmentEList<ConfigVariable>(ConfigVariable.class, this, ArtifactPackage.TECH_LEAF__CONFIG_VARIABLES);
		}
		return configVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TechLeaf> getTechLeafs() {
		if (techLeafs == null) {
			techLeafs = new EObjectContainmentEList<TechLeaf>(TechLeaf.class, this, ArtifactPackage.TECH_LEAF__TECH_LEAFS);
		}
		return techLeafs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArtifactPackage.TECH_LEAF__HINTS:
				return ((InternalEList<?>)getHints()).basicRemove(otherEnd, msgs);
			case ArtifactPackage.TECH_LEAF__CONFIG_VARIABLES:
				return ((InternalEList<?>)getConfigVariables()).basicRemove(otherEnd, msgs);
			case ArtifactPackage.TECH_LEAF__TECH_LEAFS:
				return ((InternalEList<?>)getTechLeafs()).basicRemove(otherEnd, msgs);
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
			case ArtifactPackage.TECH_LEAF__UID:
				return getUid();
			case ArtifactPackage.TECH_LEAF__NAME:
				return getName();
			case ArtifactPackage.TECH_LEAF__HINTS:
				return getHints();
			case ArtifactPackage.TECH_LEAF__CONFIG_VARIABLES:
				return getConfigVariables();
			case ArtifactPackage.TECH_LEAF__TECH_LEAFS:
				return getTechLeafs();
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
			case ArtifactPackage.TECH_LEAF__UID:
				setUid((String)newValue);
				return;
			case ArtifactPackage.TECH_LEAF__NAME:
				setName((String)newValue);
				return;
			case ArtifactPackage.TECH_LEAF__HINTS:
				getHints().clear();
				getHints().addAll((Collection<? extends GenerationHint>)newValue);
				return;
			case ArtifactPackage.TECH_LEAF__CONFIG_VARIABLES:
				getConfigVariables().clear();
				getConfigVariables().addAll((Collection<? extends ConfigVariable>)newValue);
				return;
			case ArtifactPackage.TECH_LEAF__TECH_LEAFS:
				getTechLeafs().clear();
				getTechLeafs().addAll((Collection<? extends TechLeaf>)newValue);
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
			case ArtifactPackage.TECH_LEAF__UID:
				setUid(UID_EDEFAULT);
				return;
			case ArtifactPackage.TECH_LEAF__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ArtifactPackage.TECH_LEAF__HINTS:
				getHints().clear();
				return;
			case ArtifactPackage.TECH_LEAF__CONFIG_VARIABLES:
				getConfigVariables().clear();
				return;
			case ArtifactPackage.TECH_LEAF__TECH_LEAFS:
				getTechLeafs().clear();
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
			case ArtifactPackage.TECH_LEAF__UID:
				return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
			case ArtifactPackage.TECH_LEAF__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ArtifactPackage.TECH_LEAF__HINTS:
				return hints != null && !hints.isEmpty();
			case ArtifactPackage.TECH_LEAF__CONFIG_VARIABLES:
				return configVariables != null && !configVariables.isEmpty();
			case ArtifactPackage.TECH_LEAF__TECH_LEAFS:
				return techLeafs != null && !techLeafs.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //TechLeafImpl
