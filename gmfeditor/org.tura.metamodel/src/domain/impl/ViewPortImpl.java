/**
 */
package domain.impl;

import domain.DomainPackage;
import domain.NickNamed;
import domain.ViewPort;
import domain.ViewPortTrigger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link domain.impl.ViewPortImpl#getNickname <em>Nickname</em>}</li>
 *   <li>{@link domain.impl.ViewPortImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.impl.ViewPortImpl#getName <em>Name</em>}</li>
 *   <li>{@link domain.impl.ViewPortImpl#getViewPortTrigger <em>View Port Trigger</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ViewPortImpl extends ViewElementImpl implements ViewPort
{
  /**
	 * The default value of the '{@link #getNickname() <em>Nickname</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getNickname()
	 * @generated
	 * @ordered
	 */
  protected static final String NICKNAME_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getNickname() <em>Nickname</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getNickname()
	 * @generated
	 * @ordered
	 */
  protected String nickname = NICKNAME_EDEFAULT;

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
	 * The cached value of the '{@link #getViewPortTrigger() <em>View Port Trigger</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getViewPortTrigger()
	 * @generated
	 * @ordered
	 */
  protected ViewPortTrigger viewPortTrigger;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ViewPortImpl()
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
		return DomainPackage.Literals.VIEW_PORT;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getNickname()
  {
		return nickname;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setNickname(String newNickname)
  {
		String oldNickname = nickname;
		nickname = newNickname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.VIEW_PORT__NICKNAME, oldNickname, nickname));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.VIEW_PORT__UID, oldUid, uid));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.VIEW_PORT__NAME, oldName, name));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ViewPortTrigger getViewPortTrigger()
  {
		return viewPortTrigger;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetViewPortTrigger(ViewPortTrigger newViewPortTrigger, NotificationChain msgs)
  {
		ViewPortTrigger oldViewPortTrigger = viewPortTrigger;
		viewPortTrigger = newViewPortTrigger;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.VIEW_PORT__VIEW_PORT_TRIGGER, oldViewPortTrigger, newViewPortTrigger);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setViewPortTrigger(ViewPortTrigger newViewPortTrigger)
  {
		if (newViewPortTrigger != viewPortTrigger) {
			NotificationChain msgs = null;
			if (viewPortTrigger != null)
				msgs = ((InternalEObject)viewPortTrigger).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.VIEW_PORT__VIEW_PORT_TRIGGER, null, msgs);
			if (newViewPortTrigger != null)
				msgs = ((InternalEObject)newViewPortTrigger).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainPackage.VIEW_PORT__VIEW_PORT_TRIGGER, null, msgs);
			msgs = basicSetViewPortTrigger(newViewPortTrigger, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.VIEW_PORT__VIEW_PORT_TRIGGER, newViewPortTrigger, newViewPortTrigger));
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
			case DomainPackage.VIEW_PORT__VIEW_PORT_TRIGGER:
				return basicSetViewPortTrigger(null, msgs);
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
			case DomainPackage.VIEW_PORT__NICKNAME:
				return getNickname();
			case DomainPackage.VIEW_PORT__UID:
				return getUid();
			case DomainPackage.VIEW_PORT__NAME:
				return getName();
			case DomainPackage.VIEW_PORT__VIEW_PORT_TRIGGER:
				return getViewPortTrigger();
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
			case DomainPackage.VIEW_PORT__NICKNAME:
				setNickname((String)newValue);
				return;
			case DomainPackage.VIEW_PORT__UID:
				setUid((String)newValue);
				return;
			case DomainPackage.VIEW_PORT__NAME:
				setName((String)newValue);
				return;
			case DomainPackage.VIEW_PORT__VIEW_PORT_TRIGGER:
				setViewPortTrigger((ViewPortTrigger)newValue);
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
			case DomainPackage.VIEW_PORT__NICKNAME:
				setNickname(NICKNAME_EDEFAULT);
				return;
			case DomainPackage.VIEW_PORT__UID:
				setUid(UID_EDEFAULT);
				return;
			case DomainPackage.VIEW_PORT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DomainPackage.VIEW_PORT__VIEW_PORT_TRIGGER:
				setViewPortTrigger((ViewPortTrigger)null);
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
			case DomainPackage.VIEW_PORT__NICKNAME:
				return NICKNAME_EDEFAULT == null ? nickname != null : !NICKNAME_EDEFAULT.equals(nickname);
			case DomainPackage.VIEW_PORT__UID:
				return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
			case DomainPackage.VIEW_PORT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DomainPackage.VIEW_PORT__VIEW_PORT_TRIGGER:
				return viewPortTrigger != null;
		}
		return super.eIsSet(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
		if (baseClass == NickNamed.class) {
			switch (derivedFeatureID) {
				case DomainPackage.VIEW_PORT__NICKNAME: return DomainPackage.NICK_NAMED__NICKNAME;
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
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
		if (baseClass == NickNamed.class) {
			switch (baseFeatureID) {
				case DomainPackage.NICK_NAMED__NICKNAME: return DomainPackage.VIEW_PORT__NICKNAME;
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
  public String toString()
  {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (nickname: ");
		result.append(nickname);
		result.append(", uid: ");
		result.append(uid);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ViewPortImpl
