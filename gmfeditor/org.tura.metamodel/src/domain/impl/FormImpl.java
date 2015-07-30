/**
 */
package domain.impl;

import domain.DomainPackage;
import domain.Form;
import domain.FormDataControls;
import domain.FormParameter;
import domain.FormView;

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
 * An implementation of the model object '<em><b>Form</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link domain.impl.FormImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.impl.FormImpl#getName <em>Name</em>}</li>
 *   <li>{@link domain.impl.FormImpl#getView <em>View</em>}</li>
 *   <li>{@link domain.impl.FormImpl#getDatacontrols <em>Datacontrols</em>}</li>
 *   <li>{@link domain.impl.FormImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FormImpl extends EObjectImpl implements Form
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
	 * The cached value of the '{@link #getView() <em>View</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getView()
	 * @generated
	 * @ordered
	 */
  protected FormView view;

  /**
	 * The cached value of the '{@link #getDatacontrols() <em>Datacontrols</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDatacontrols()
	 * @generated
	 * @ordered
	 */
  protected FormDataControls datacontrols;

  /**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
  protected EList<FormParameter> parameters;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected FormImpl()
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
		return DomainPackage.Literals.FORM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.FORM__UID, oldUid, uid));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.FORM__NAME, oldName, name));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public FormView getView()
  {
		return view;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetView(FormView newView, NotificationChain msgs)
  {
		FormView oldView = view;
		view = newView;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.FORM__VIEW, oldView, newView);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setView(FormView newView)
  {
		if (newView != view) {
			NotificationChain msgs = null;
			if (view != null)
				msgs = ((InternalEObject)view).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.FORM__VIEW, null, msgs);
			if (newView != null)
				msgs = ((InternalEObject)newView).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainPackage.FORM__VIEW, null, msgs);
			msgs = basicSetView(newView, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.FORM__VIEW, newView, newView));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public FormDataControls getDatacontrols()
  {
		return datacontrols;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetDatacontrols(FormDataControls newDatacontrols, NotificationChain msgs)
  {
		FormDataControls oldDatacontrols = datacontrols;
		datacontrols = newDatacontrols;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.FORM__DATACONTROLS, oldDatacontrols, newDatacontrols);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setDatacontrols(FormDataControls newDatacontrols)
  {
		if (newDatacontrols != datacontrols) {
			NotificationChain msgs = null;
			if (datacontrols != null)
				msgs = ((InternalEObject)datacontrols).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.FORM__DATACONTROLS, null, msgs);
			if (newDatacontrols != null)
				msgs = ((InternalEObject)newDatacontrols).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainPackage.FORM__DATACONTROLS, null, msgs);
			msgs = basicSetDatacontrols(newDatacontrols, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.FORM__DATACONTROLS, newDatacontrols, newDatacontrols));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<FormParameter> getParameters()
  {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<FormParameter>(FormParameter.class, this, DomainPackage.FORM__PARAMETERS);
		}
		return parameters;
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
			case DomainPackage.FORM__VIEW:
				return basicSetView(null, msgs);
			case DomainPackage.FORM__DATACONTROLS:
				return basicSetDatacontrols(null, msgs);
			case DomainPackage.FORM__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
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
			case DomainPackage.FORM__UID:
				return getUid();
			case DomainPackage.FORM__NAME:
				return getName();
			case DomainPackage.FORM__VIEW:
				return getView();
			case DomainPackage.FORM__DATACONTROLS:
				return getDatacontrols();
			case DomainPackage.FORM__PARAMETERS:
				return getParameters();
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
			case DomainPackage.FORM__UID:
				setUid((String)newValue);
				return;
			case DomainPackage.FORM__NAME:
				setName((String)newValue);
				return;
			case DomainPackage.FORM__VIEW:
				setView((FormView)newValue);
				return;
			case DomainPackage.FORM__DATACONTROLS:
				setDatacontrols((FormDataControls)newValue);
				return;
			case DomainPackage.FORM__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends FormParameter>)newValue);
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
			case DomainPackage.FORM__UID:
				setUid(UID_EDEFAULT);
				return;
			case DomainPackage.FORM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DomainPackage.FORM__VIEW:
				setView((FormView)null);
				return;
			case DomainPackage.FORM__DATACONTROLS:
				setDatacontrols((FormDataControls)null);
				return;
			case DomainPackage.FORM__PARAMETERS:
				getParameters().clear();
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
			case DomainPackage.FORM__UID:
				return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
			case DomainPackage.FORM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DomainPackage.FORM__VIEW:
				return view != null;
			case DomainPackage.FORM__DATACONTROLS:
				return datacontrols != null;
			case DomainPackage.FORM__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
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

} //FormImpl
