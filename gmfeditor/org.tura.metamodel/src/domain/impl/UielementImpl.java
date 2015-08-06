/**
 */
package domain.impl;

import domain.ActionTrigger;
import domain.Categorized;
import domain.Classifier;
import domain.Context;
import domain.DomainPackage;
import domain.NickNamed;
import domain.Orderable;
import domain.Uielement;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Uielement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link domain.impl.UielementImpl#getNickname <em>Nickname</em>}</li>
 *   <li>{@link domain.impl.UielementImpl#getClassifiers <em>Classifiers</em>}</li>
 *   <li>{@link domain.impl.UielementImpl#getOrder <em>Order</em>}</li>
 *   <li>{@link domain.impl.UielementImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.impl.UielementImpl#getEnabled <em>Enabled</em>}</li>
 *   <li>{@link domain.impl.UielementImpl#getRequired <em>Required</em>}</li>
 *   <li>{@link domain.impl.UielementImpl#getReadOnly <em>Read Only</em>}</li>
 *   <li>{@link domain.impl.UielementImpl#getOnEventRefreshArea <em>On Event Refresh Area</em>}</li>
 *   <li>{@link domain.impl.UielementImpl#getTriggers <em>Triggers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UielementImpl extends StyleElementImpl implements Uielement
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
	 * The cached value of the '{@link #getClassifiers() <em>Classifiers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getClassifiers()
	 * @generated
	 * @ordered
	 */
  protected EList<Classifier> classifiers;

  /**
	 * The default value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
  protected static final int ORDER_EDEFAULT = 0;

  /**
	 * The cached value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
  protected int order = ORDER_EDEFAULT;

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
	 * The cached value of the '{@link #getEnabled() <em>Enabled</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getEnabled()
	 * @generated
	 * @ordered
	 */
  protected Context enabled;

  /**
	 * The cached value of the '{@link #getRequired() <em>Required</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getRequired()
	 * @generated
	 * @ordered
	 */
  protected Context required;

  /**
	 * The cached value of the '{@link #getReadOnly() <em>Read Only</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getReadOnly()
	 * @generated
	 * @ordered
	 */
  protected Context readOnly;

  /**
	 * The cached value of the '{@link #getOnEventRefreshArea() <em>On Event Refresh Area</em>}' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getOnEventRefreshArea()
	 * @generated
	 * @ordered
	 */
  protected EList<NickNamed> onEventRefreshArea;

  /**
	 * The cached value of the '{@link #getTriggers() <em>Triggers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggers()
	 * @generated
	 * @ordered
	 */
	protected EList<ActionTrigger> triggers;

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected UielementImpl()
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
		return DomainPackage.Literals.UIELEMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.UIELEMENT__UID, oldUid, uid));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.UIELEMENT__NICKNAME, oldNickname, nickname));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Classifier> getClassifiers()
  {
		if (classifiers == null) {
			classifiers = new EObjectContainmentEList<Classifier>(Classifier.class, this, DomainPackage.UIELEMENT__CLASSIFIERS);
		}
		return classifiers;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public int getOrder()
  {
		return order;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setOrder(int newOrder)
  {
		int oldOrder = order;
		order = newOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.UIELEMENT__ORDER, oldOrder, order));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Context getEnabled()
  {
		return enabled;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetEnabled(Context newEnabled, NotificationChain msgs)
  {
		Context oldEnabled = enabled;
		enabled = newEnabled;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.UIELEMENT__ENABLED, oldEnabled, newEnabled);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setEnabled(Context newEnabled)
  {
		if (newEnabled != enabled) {
			NotificationChain msgs = null;
			if (enabled != null)
				msgs = ((InternalEObject)enabled).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.UIELEMENT__ENABLED, null, msgs);
			if (newEnabled != null)
				msgs = ((InternalEObject)newEnabled).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainPackage.UIELEMENT__ENABLED, null, msgs);
			msgs = basicSetEnabled(newEnabled, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.UIELEMENT__ENABLED, newEnabled, newEnabled));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Context getRequired()
  {
		return required;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetRequired(Context newRequired, NotificationChain msgs)
  {
		Context oldRequired = required;
		required = newRequired;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.UIELEMENT__REQUIRED, oldRequired, newRequired);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setRequired(Context newRequired)
  {
		if (newRequired != required) {
			NotificationChain msgs = null;
			if (required != null)
				msgs = ((InternalEObject)required).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.UIELEMENT__REQUIRED, null, msgs);
			if (newRequired != null)
				msgs = ((InternalEObject)newRequired).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainPackage.UIELEMENT__REQUIRED, null, msgs);
			msgs = basicSetRequired(newRequired, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.UIELEMENT__REQUIRED, newRequired, newRequired));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Context getReadOnly()
  {
		return readOnly;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetReadOnly(Context newReadOnly, NotificationChain msgs)
  {
		Context oldReadOnly = readOnly;
		readOnly = newReadOnly;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.UIELEMENT__READ_ONLY, oldReadOnly, newReadOnly);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setReadOnly(Context newReadOnly)
  {
		if (newReadOnly != readOnly) {
			NotificationChain msgs = null;
			if (readOnly != null)
				msgs = ((InternalEObject)readOnly).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.UIELEMENT__READ_ONLY, null, msgs);
			if (newReadOnly != null)
				msgs = ((InternalEObject)newReadOnly).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainPackage.UIELEMENT__READ_ONLY, null, msgs);
			msgs = basicSetReadOnly(newReadOnly, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.UIELEMENT__READ_ONLY, newReadOnly, newReadOnly));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<NickNamed> getOnEventRefreshArea()
  {
		if (onEventRefreshArea == null) {
			onEventRefreshArea = new EObjectResolvingEList<NickNamed>(NickNamed.class, this, DomainPackage.UIELEMENT__ON_EVENT_REFRESH_AREA);
		}
		return onEventRefreshArea;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActionTrigger> getTriggers() {
		if (triggers == null) {
			triggers = new EObjectContainmentEList<ActionTrigger>(ActionTrigger.class, this, DomainPackage.UIELEMENT__TRIGGERS);
		}
		return triggers;
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
			case DomainPackage.UIELEMENT__CLASSIFIERS:
				return ((InternalEList<?>)getClassifiers()).basicRemove(otherEnd, msgs);
			case DomainPackage.UIELEMENT__ENABLED:
				return basicSetEnabled(null, msgs);
			case DomainPackage.UIELEMENT__REQUIRED:
				return basicSetRequired(null, msgs);
			case DomainPackage.UIELEMENT__READ_ONLY:
				return basicSetReadOnly(null, msgs);
			case DomainPackage.UIELEMENT__TRIGGERS:
				return ((InternalEList<?>)getTriggers()).basicRemove(otherEnd, msgs);
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
			case DomainPackage.UIELEMENT__NICKNAME:
				return getNickname();
			case DomainPackage.UIELEMENT__CLASSIFIERS:
				return getClassifiers();
			case DomainPackage.UIELEMENT__ORDER:
				return getOrder();
			case DomainPackage.UIELEMENT__UID:
				return getUid();
			case DomainPackage.UIELEMENT__ENABLED:
				return getEnabled();
			case DomainPackage.UIELEMENT__REQUIRED:
				return getRequired();
			case DomainPackage.UIELEMENT__READ_ONLY:
				return getReadOnly();
			case DomainPackage.UIELEMENT__ON_EVENT_REFRESH_AREA:
				return getOnEventRefreshArea();
			case DomainPackage.UIELEMENT__TRIGGERS:
				return getTriggers();
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
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case DomainPackage.UIELEMENT__NICKNAME:
				setNickname((String)newValue);
				return;
			case DomainPackage.UIELEMENT__CLASSIFIERS:
				getClassifiers().clear();
				getClassifiers().addAll((Collection<? extends Classifier>)newValue);
				return;
			case DomainPackage.UIELEMENT__ORDER:
				setOrder((Integer)newValue);
				return;
			case DomainPackage.UIELEMENT__UID:
				setUid((String)newValue);
				return;
			case DomainPackage.UIELEMENT__ENABLED:
				setEnabled((Context)newValue);
				return;
			case DomainPackage.UIELEMENT__REQUIRED:
				setRequired((Context)newValue);
				return;
			case DomainPackage.UIELEMENT__READ_ONLY:
				setReadOnly((Context)newValue);
				return;
			case DomainPackage.UIELEMENT__ON_EVENT_REFRESH_AREA:
				getOnEventRefreshArea().clear();
				getOnEventRefreshArea().addAll((Collection<? extends NickNamed>)newValue);
				return;
			case DomainPackage.UIELEMENT__TRIGGERS:
				getTriggers().clear();
				getTriggers().addAll((Collection<? extends ActionTrigger>)newValue);
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
			case DomainPackage.UIELEMENT__NICKNAME:
				setNickname(NICKNAME_EDEFAULT);
				return;
			case DomainPackage.UIELEMENT__CLASSIFIERS:
				getClassifiers().clear();
				return;
			case DomainPackage.UIELEMENT__ORDER:
				setOrder(ORDER_EDEFAULT);
				return;
			case DomainPackage.UIELEMENT__UID:
				setUid(UID_EDEFAULT);
				return;
			case DomainPackage.UIELEMENT__ENABLED:
				setEnabled((Context)null);
				return;
			case DomainPackage.UIELEMENT__REQUIRED:
				setRequired((Context)null);
				return;
			case DomainPackage.UIELEMENT__READ_ONLY:
				setReadOnly((Context)null);
				return;
			case DomainPackage.UIELEMENT__ON_EVENT_REFRESH_AREA:
				getOnEventRefreshArea().clear();
				return;
			case DomainPackage.UIELEMENT__TRIGGERS:
				getTriggers().clear();
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
			case DomainPackage.UIELEMENT__NICKNAME:
				return NICKNAME_EDEFAULT == null ? nickname != null : !NICKNAME_EDEFAULT.equals(nickname);
			case DomainPackage.UIELEMENT__CLASSIFIERS:
				return classifiers != null && !classifiers.isEmpty();
			case DomainPackage.UIELEMENT__ORDER:
				return order != ORDER_EDEFAULT;
			case DomainPackage.UIELEMENT__UID:
				return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
			case DomainPackage.UIELEMENT__ENABLED:
				return enabled != null;
			case DomainPackage.UIELEMENT__REQUIRED:
				return required != null;
			case DomainPackage.UIELEMENT__READ_ONLY:
				return readOnly != null;
			case DomainPackage.UIELEMENT__ON_EVENT_REFRESH_AREA:
				return onEventRefreshArea != null && !onEventRefreshArea.isEmpty();
			case DomainPackage.UIELEMENT__TRIGGERS:
				return triggers != null && !triggers.isEmpty();
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
				case DomainPackage.UIELEMENT__NICKNAME: return DomainPackage.NICK_NAMED__NICKNAME;
				default: return -1;
			}
		}
		if (baseClass == Categorized.class) {
			switch (derivedFeatureID) {
				case DomainPackage.UIELEMENT__CLASSIFIERS: return DomainPackage.CATEGORIZED__CLASSIFIERS;
				default: return -1;
			}
		}
		if (baseClass == Orderable.class) {
			switch (derivedFeatureID) {
				case DomainPackage.UIELEMENT__ORDER: return DomainPackage.ORDERABLE__ORDER;
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
				case DomainPackage.NICK_NAMED__NICKNAME: return DomainPackage.UIELEMENT__NICKNAME;
				default: return -1;
			}
		}
		if (baseClass == Categorized.class) {
			switch (baseFeatureID) {
				case DomainPackage.CATEGORIZED__CLASSIFIERS: return DomainPackage.UIELEMENT__CLASSIFIERS;
				default: return -1;
			}
		}
		if (baseClass == Orderable.class) {
			switch (baseFeatureID) {
				case DomainPackage.ORDERABLE__ORDER: return DomainPackage.UIELEMENT__ORDER;
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
		result.append(", order: ");
		result.append(order);
		result.append(", uid: ");
		result.append(uid);
		result.append(')');
		return result.toString();
	}

} //UielementImpl
