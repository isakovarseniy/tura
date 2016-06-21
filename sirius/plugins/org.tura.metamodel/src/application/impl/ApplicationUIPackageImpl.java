/**
 */
package application.impl;

import application.ApplicationPackage;
import application.ApplicationUIPackage;

import form.UIPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UI Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link application.impl.ApplicationUIPackageImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link application.impl.ApplicationUIPackageImpl#getName <em>Name</em>}</li>
 *   <li>{@link application.impl.ApplicationUIPackageImpl#getUipackage <em>Uipackage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApplicationUIPackageImpl extends EObjectImpl implements ApplicationUIPackage {
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
	 * The cached value of the '{@link #getUipackage() <em>Uipackage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUipackage()
	 * @generated
	 * @ordered
	 */
	protected UIPackage uipackage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationUIPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApplicationPackage.Literals.APPLICATION_UI_PACKAGE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.APPLICATION_UI_PACKAGE__UID, oldUid, uid));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.APPLICATION_UI_PACKAGE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIPackage getUipackage() {
		return uipackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUipackage(UIPackage newUipackage, NotificationChain msgs) {
		UIPackage oldUipackage = uipackage;
		uipackage = newUipackage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApplicationPackage.APPLICATION_UI_PACKAGE__UIPACKAGE, oldUipackage, newUipackage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUipackage(UIPackage newUipackage) {
		if (newUipackage != uipackage) {
			NotificationChain msgs = null;
			if (uipackage != null)
				msgs = ((InternalEObject)uipackage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApplicationPackage.APPLICATION_UI_PACKAGE__UIPACKAGE, null, msgs);
			if (newUipackage != null)
				msgs = ((InternalEObject)newUipackage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApplicationPackage.APPLICATION_UI_PACKAGE__UIPACKAGE, null, msgs);
			msgs = basicSetUipackage(newUipackage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.APPLICATION_UI_PACKAGE__UIPACKAGE, newUipackage, newUipackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApplicationPackage.APPLICATION_UI_PACKAGE__UIPACKAGE:
				return basicSetUipackage(null, msgs);
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
			case ApplicationPackage.APPLICATION_UI_PACKAGE__UID:
				return getUid();
			case ApplicationPackage.APPLICATION_UI_PACKAGE__NAME:
				return getName();
			case ApplicationPackage.APPLICATION_UI_PACKAGE__UIPACKAGE:
				return getUipackage();
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
			case ApplicationPackage.APPLICATION_UI_PACKAGE__UID:
				setUid((String)newValue);
				return;
			case ApplicationPackage.APPLICATION_UI_PACKAGE__NAME:
				setName((String)newValue);
				return;
			case ApplicationPackage.APPLICATION_UI_PACKAGE__UIPACKAGE:
				setUipackage((UIPackage)newValue);
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
			case ApplicationPackage.APPLICATION_UI_PACKAGE__UID:
				setUid(UID_EDEFAULT);
				return;
			case ApplicationPackage.APPLICATION_UI_PACKAGE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ApplicationPackage.APPLICATION_UI_PACKAGE__UIPACKAGE:
				setUipackage((UIPackage)null);
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
			case ApplicationPackage.APPLICATION_UI_PACKAGE__UID:
				return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
			case ApplicationPackage.APPLICATION_UI_PACKAGE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ApplicationPackage.APPLICATION_UI_PACKAGE__UIPACKAGE:
				return uipackage != null;
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

} //ApplicationUIPackageImpl
