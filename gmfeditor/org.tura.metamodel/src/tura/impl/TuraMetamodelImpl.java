/**
 */
package tura.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import tura.TuraMetamodel;
import tura.TuraPackage;
import tura.Types;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Metamodel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tura.impl.TuraMetamodelImpl#getTypeDefinition <em>Type Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TuraMetamodelImpl extends EObjectImpl implements TuraMetamodel {
	/**
   * The cached value of the '{@link #getTypeDefinition() <em>Type Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTypeDefinition()
   * @generated
   * @ordered
   */
	protected Types typeDefinition;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected TuraMetamodelImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return TuraPackage.Literals.TURA_METAMODEL;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Types getTypeDefinition() {
    return typeDefinition;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetTypeDefinition(Types newTypeDefinition, NotificationChain msgs) {
    Types oldTypeDefinition = typeDefinition;
    typeDefinition = newTypeDefinition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TuraPackage.TURA_METAMODEL__TYPE_DEFINITION, oldTypeDefinition, newTypeDefinition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setTypeDefinition(Types newTypeDefinition) {
    if (newTypeDefinition != typeDefinition)
    {
      NotificationChain msgs = null;
      if (typeDefinition != null)
        msgs = ((InternalEObject)typeDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TuraPackage.TURA_METAMODEL__TYPE_DEFINITION, null, msgs);
      if (newTypeDefinition != null)
        msgs = ((InternalEObject)newTypeDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TuraPackage.TURA_METAMODEL__TYPE_DEFINITION, null, msgs);
      msgs = basicSetTypeDefinition(newTypeDefinition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TuraPackage.TURA_METAMODEL__TYPE_DEFINITION, newTypeDefinition, newTypeDefinition));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID)
    {
      case TuraPackage.TURA_METAMODEL__TYPE_DEFINITION:
        return basicSetTypeDefinition(null, msgs);
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
    switch (featureID)
    {
      case TuraPackage.TURA_METAMODEL__TYPE_DEFINITION:
        return getTypeDefinition();
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
    switch (featureID)
    {
      case TuraPackage.TURA_METAMODEL__TYPE_DEFINITION:
        setTypeDefinition((Types)newValue);
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
    switch (featureID)
    {
      case TuraPackage.TURA_METAMODEL__TYPE_DEFINITION:
        setTypeDefinition((Types)null);
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
    switch (featureID)
    {
      case TuraPackage.TURA_METAMODEL__TYPE_DEFINITION:
        return typeDefinition != null;
    }
    return super.eIsSet(featureID);
  }

} //TuraMetamodelImpl