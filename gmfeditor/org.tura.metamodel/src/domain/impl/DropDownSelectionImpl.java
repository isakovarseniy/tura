/**
 */
package domain.impl;

import domain.DomainPackage;
import domain.DropDownSelection;
import domain.Selection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Drop Down Selection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link domain.impl.DropDownSelectionImpl#getSelection <em>Selection</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DropDownSelectionImpl extends OptionSelectionImpl implements DropDownSelection
{
  /**
	 * The cached value of the '{@link #getSelection() <em>Selection</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getSelection()
	 * @generated
	 * @ordered
	 */
  protected Selection selection;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected DropDownSelectionImpl()
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
		return DomainPackage.Literals.DROP_DOWN_SELECTION;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Selection getSelection()
  {
		return selection;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetSelection(Selection newSelection, NotificationChain msgs)
  {
		Selection oldSelection = selection;
		selection = newSelection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.DROP_DOWN_SELECTION__SELECTION, oldSelection, newSelection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setSelection(Selection newSelection)
  {
		if (newSelection != selection) {
			NotificationChain msgs = null;
			if (selection != null)
				msgs = ((InternalEObject)selection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.DROP_DOWN_SELECTION__SELECTION, null, msgs);
			if (newSelection != null)
				msgs = ((InternalEObject)newSelection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainPackage.DROP_DOWN_SELECTION__SELECTION, null, msgs);
			msgs = basicSetSelection(newSelection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DROP_DOWN_SELECTION__SELECTION, newSelection, newSelection));
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
			case DomainPackage.DROP_DOWN_SELECTION__SELECTION:
				return basicSetSelection(null, msgs);
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
			case DomainPackage.DROP_DOWN_SELECTION__SELECTION:
				return getSelection();
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
			case DomainPackage.DROP_DOWN_SELECTION__SELECTION:
				setSelection((Selection)newValue);
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
			case DomainPackage.DROP_DOWN_SELECTION__SELECTION:
				setSelection((Selection)null);
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
			case DomainPackage.DROP_DOWN_SELECTION__SELECTION:
				return selection != null;
		}
		return super.eIsSet(featureID);
	}

} //DropDownSelectionImpl
