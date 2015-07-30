/**
 */
package domain.impl;

import domain.DomainPackage;
import domain.FormVariable;
import domain.PREFormTrigger;
import domain.Root;

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
 * An implementation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link domain.impl.RootImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.impl.RootImpl#getName <em>Name</em>}</li>
 *   <li>{@link domain.impl.RootImpl#getPreFormTrigger <em>Pre Form Trigger</em>}</li>
 *   <li>{@link domain.impl.RootImpl#getVariables <em>Variables</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RootImpl extends EObjectImpl implements Root
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
	 * The cached value of the '{@link #getPreFormTrigger() <em>Pre Form Trigger</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getPreFormTrigger()
	 * @generated
	 * @ordered
	 */
  protected PREFormTrigger preFormTrigger;

  /**
	 * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getVariables()
	 * @generated
	 * @ordered
	 */
  protected EList<FormVariable> variables;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected RootImpl()
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
		return DomainPackage.Literals.ROOT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.ROOT__UID, oldUid, uid));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.ROOT__NAME, oldName, name));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public PREFormTrigger getPreFormTrigger()
  {
		return preFormTrigger;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetPreFormTrigger(PREFormTrigger newPreFormTrigger, NotificationChain msgs)
  {
		PREFormTrigger oldPreFormTrigger = preFormTrigger;
		preFormTrigger = newPreFormTrigger;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.ROOT__PRE_FORM_TRIGGER, oldPreFormTrigger, newPreFormTrigger);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setPreFormTrigger(PREFormTrigger newPreFormTrigger)
  {
		if (newPreFormTrigger != preFormTrigger) {
			NotificationChain msgs = null;
			if (preFormTrigger != null)
				msgs = ((InternalEObject)preFormTrigger).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.ROOT__PRE_FORM_TRIGGER, null, msgs);
			if (newPreFormTrigger != null)
				msgs = ((InternalEObject)newPreFormTrigger).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainPackage.ROOT__PRE_FORM_TRIGGER, null, msgs);
			msgs = basicSetPreFormTrigger(newPreFormTrigger, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.ROOT__PRE_FORM_TRIGGER, newPreFormTrigger, newPreFormTrigger));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<FormVariable> getVariables()
  {
		if (variables == null) {
			variables = new EObjectContainmentEList<FormVariable>(FormVariable.class, this, DomainPackage.ROOT__VARIABLES);
		}
		return variables;
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
			case DomainPackage.ROOT__PRE_FORM_TRIGGER:
				return basicSetPreFormTrigger(null, msgs);
			case DomainPackage.ROOT__VARIABLES:
				return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
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
			case DomainPackage.ROOT__UID:
				return getUid();
			case DomainPackage.ROOT__NAME:
				return getName();
			case DomainPackage.ROOT__PRE_FORM_TRIGGER:
				return getPreFormTrigger();
			case DomainPackage.ROOT__VARIABLES:
				return getVariables();
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
			case DomainPackage.ROOT__UID:
				setUid((String)newValue);
				return;
			case DomainPackage.ROOT__NAME:
				setName((String)newValue);
				return;
			case DomainPackage.ROOT__PRE_FORM_TRIGGER:
				setPreFormTrigger((PREFormTrigger)newValue);
				return;
			case DomainPackage.ROOT__VARIABLES:
				getVariables().clear();
				getVariables().addAll((Collection<? extends FormVariable>)newValue);
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
			case DomainPackage.ROOT__UID:
				setUid(UID_EDEFAULT);
				return;
			case DomainPackage.ROOT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DomainPackage.ROOT__PRE_FORM_TRIGGER:
				setPreFormTrigger((PREFormTrigger)null);
				return;
			case DomainPackage.ROOT__VARIABLES:
				getVariables().clear();
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
			case DomainPackage.ROOT__UID:
				return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
			case DomainPackage.ROOT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DomainPackage.ROOT__PRE_FORM_TRIGGER:
				return preFormTrigger != null;
			case DomainPackage.ROOT__VARIABLES:
				return variables != null && !variables.isEmpty();
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

} //RootImpl
