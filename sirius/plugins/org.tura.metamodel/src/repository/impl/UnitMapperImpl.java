/**
 */
package repository.impl;

import form.Controls;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import repository.RepositoryPackage;
import repository.UnitMapper;
import repository.Units;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unit Mapper</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link repository.impl.UnitMapperImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link repository.impl.UnitMapperImpl#getName <em>Name</em>}</li>
 *   <li>{@link repository.impl.UnitMapperImpl#getUnits <em>Units</em>}</li>
 *   <li>{@link repository.impl.UnitMapperImpl#getDatacontrols <em>Datacontrols</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnitMapperImpl extends EObjectImpl implements UnitMapper {
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
	 * The cached value of the '{@link #getUnits() <em>Units</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnits()
	 * @generated
	 * @ordered
	 */
	protected Units units;

	/**
	 * The cached value of the '{@link #getDatacontrols() <em>Datacontrols</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatacontrols()
	 * @generated
	 * @ordered
	 */
	protected Controls datacontrols;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnitMapperImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RepositoryPackage.Literals.UNIT_MAPPER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.UNIT_MAPPER__UID, oldUid, uid));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.UNIT_MAPPER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Units getUnits() {
		return units;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnits(Units newUnits, NotificationChain msgs) {
		Units oldUnits = units;
		units = newUnits;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RepositoryPackage.UNIT_MAPPER__UNITS, oldUnits, newUnits);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnits(Units newUnits) {
		if (newUnits != units) {
			NotificationChain msgs = null;
			if (units != null)
				msgs = ((InternalEObject)units).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RepositoryPackage.UNIT_MAPPER__UNITS, null, msgs);
			if (newUnits != null)
				msgs = ((InternalEObject)newUnits).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RepositoryPackage.UNIT_MAPPER__UNITS, null, msgs);
			msgs = basicSetUnits(newUnits, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.UNIT_MAPPER__UNITS, newUnits, newUnits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Controls getDatacontrols() {
		return datacontrols;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatacontrols(Controls newDatacontrols, NotificationChain msgs) {
		Controls oldDatacontrols = datacontrols;
		datacontrols = newDatacontrols;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RepositoryPackage.UNIT_MAPPER__DATACONTROLS, oldDatacontrols, newDatacontrols);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatacontrols(Controls newDatacontrols) {
		if (newDatacontrols != datacontrols) {
			NotificationChain msgs = null;
			if (datacontrols != null)
				msgs = ((InternalEObject)datacontrols).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RepositoryPackage.UNIT_MAPPER__DATACONTROLS, null, msgs);
			if (newDatacontrols != null)
				msgs = ((InternalEObject)newDatacontrols).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RepositoryPackage.UNIT_MAPPER__DATACONTROLS, null, msgs);
			msgs = basicSetDatacontrols(newDatacontrols, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.UNIT_MAPPER__DATACONTROLS, newDatacontrols, newDatacontrols));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RepositoryPackage.UNIT_MAPPER__UNITS:
				return basicSetUnits(null, msgs);
			case RepositoryPackage.UNIT_MAPPER__DATACONTROLS:
				return basicSetDatacontrols(null, msgs);
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
			case RepositoryPackage.UNIT_MAPPER__UID:
				return getUid();
			case RepositoryPackage.UNIT_MAPPER__NAME:
				return getName();
			case RepositoryPackage.UNIT_MAPPER__UNITS:
				return getUnits();
			case RepositoryPackage.UNIT_MAPPER__DATACONTROLS:
				return getDatacontrols();
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
			case RepositoryPackage.UNIT_MAPPER__UID:
				setUid((String)newValue);
				return;
			case RepositoryPackage.UNIT_MAPPER__NAME:
				setName((String)newValue);
				return;
			case RepositoryPackage.UNIT_MAPPER__UNITS:
				setUnits((Units)newValue);
				return;
			case RepositoryPackage.UNIT_MAPPER__DATACONTROLS:
				setDatacontrols((Controls)newValue);
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
			case RepositoryPackage.UNIT_MAPPER__UID:
				setUid(UID_EDEFAULT);
				return;
			case RepositoryPackage.UNIT_MAPPER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RepositoryPackage.UNIT_MAPPER__UNITS:
				setUnits((Units)null);
				return;
			case RepositoryPackage.UNIT_MAPPER__DATACONTROLS:
				setDatacontrols((Controls)null);
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
			case RepositoryPackage.UNIT_MAPPER__UID:
				return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
			case RepositoryPackage.UNIT_MAPPER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RepositoryPackage.UNIT_MAPPER__UNITS:
				return units != null;
			case RepositoryPackage.UNIT_MAPPER__DATACONTROLS:
				return datacontrols != null;
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

} //UnitMapperImpl
