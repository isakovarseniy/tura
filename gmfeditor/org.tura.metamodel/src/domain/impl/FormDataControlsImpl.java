/**
 */
package domain.impl;

import domain.Controls;
import domain.DomainPackage;
import domain.FormDataControls;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Form Data Controls</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link domain.impl.FormDataControlsImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.impl.FormDataControlsImpl#getName <em>Name</em>}</li>
 *   <li>{@link domain.impl.FormDataControlsImpl#getFormControl <em>Form Control</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FormDataControlsImpl extends EObjectImpl implements FormDataControls
{
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
	 * The cached value of the '{@link #getFormControl() <em>Form Control</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getFormControl()
	 * @generated
	 * @ordered
	 */
  protected Controls formControl;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected FormDataControlsImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass()
  {
		return DomainPackage.Literals.FORM_DATA_CONTROLS;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getUid()
  {
		return uid;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setUid(String newUid)
  {
		String oldUid = uid;
		uid = newUid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.FORM_DATA_CONTROLS__UID, oldUid, uid));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getName()
  {
		return name;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setName(String newName)
  {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.FORM_DATA_CONTROLS__NAME, oldName, name));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Controls getFormControl()
  {
		if (formControl != null && formControl.eIsProxy()) {
			InternalEObject oldFormControl = (InternalEObject)formControl;
			formControl = (Controls)eResolveProxy(oldFormControl);
			if (formControl != oldFormControl) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.FORM_DATA_CONTROLS__FORM_CONTROL, oldFormControl, formControl));
			}
		}
		return formControl;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Controls basicGetFormControl()
  {
		return formControl;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetFormControl(Controls newFormControl, NotificationChain msgs)
  {
		Controls oldFormControl = formControl;
		formControl = newFormControl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.FORM_DATA_CONTROLS__FORM_CONTROL, oldFormControl, newFormControl);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setFormControl(Controls newFormControl)
  {
		if (newFormControl != formControl) {
			NotificationChain msgs = null;
			if (formControl != null)
				msgs = ((InternalEObject)formControl).eInverseRemove(this, DomainPackage.CONTROLS__PARENT, Controls.class, msgs);
			if (newFormControl != null)
				msgs = ((InternalEObject)newFormControl).eInverseAdd(this, DomainPackage.CONTROLS__PARENT, Controls.class, msgs);
			msgs = basicSetFormControl(newFormControl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.FORM_DATA_CONTROLS__FORM_CONTROL, newFormControl, newFormControl));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case DomainPackage.FORM_DATA_CONTROLS__FORM_CONTROL:
				if (formControl != null)
					msgs = ((InternalEObject)formControl).eInverseRemove(this, DomainPackage.CONTROLS__PARENT, Controls.class, msgs);
				return basicSetFormControl((Controls)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case DomainPackage.FORM_DATA_CONTROLS__FORM_CONTROL:
				return basicSetFormControl(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
		switch (featureID) {
			case DomainPackage.FORM_DATA_CONTROLS__UID:
				return getUid();
			case DomainPackage.FORM_DATA_CONTROLS__NAME:
				return getName();
			case DomainPackage.FORM_DATA_CONTROLS__FORM_CONTROL:
				if (resolve) return getFormControl();
				return basicGetFormControl();
		}
		return super.eGet(featureID, resolve, coreType);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case DomainPackage.FORM_DATA_CONTROLS__UID:
				setUid((String)newValue);
				return;
			case DomainPackage.FORM_DATA_CONTROLS__NAME:
				setName((String)newValue);
				return;
			case DomainPackage.FORM_DATA_CONTROLS__FORM_CONTROL:
				setFormControl((Controls)newValue);
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
  public void eUnset(int featureID)
  {
		switch (featureID) {
			case DomainPackage.FORM_DATA_CONTROLS__UID:
				setUid(UID_EDEFAULT);
				return;
			case DomainPackage.FORM_DATA_CONTROLS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DomainPackage.FORM_DATA_CONTROLS__FORM_CONTROL:
				setFormControl((Controls)null);
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
  public boolean eIsSet(int featureID)
  {
		switch (featureID) {
			case DomainPackage.FORM_DATA_CONTROLS__UID:
				return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
			case DomainPackage.FORM_DATA_CONTROLS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DomainPackage.FORM_DATA_CONTROLS__FORM_CONTROL:
				return formControl != null;
		}
		return super.eIsSet(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String toString()
  {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (uid: ");
		result.append(uid);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //FormDataControlsImpl
