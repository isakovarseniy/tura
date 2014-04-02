/**
 */
package domain.impl;

import domain.DomainPackage;
import domain.HTMLLayerHolder;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HTML Layer Holder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link domain.impl.HTMLLayerHolderImpl#getColumns <em>Columns</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HTMLLayerHolderImpl extends EObjectImpl implements HTMLLayerHolder
{
  /**
   * The default value of the '{@link #getColumns() <em>Columns</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColumns()
   * @generated
   * @ordered
   */
  protected static final int COLUMNS_EDEFAULT = 1;

  /**
   * The cached value of the '{@link #getColumns() <em>Columns</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColumns()
   * @generated
   * @ordered
   */
  protected int columns = COLUMNS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HTMLLayerHolderImpl()
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
    return DomainPackage.Literals.HTML_LAYER_HOLDER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getColumns()
  {
    return columns;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setColumns(int newColumns)
  {
    int oldColumns = columns;
    columns = newColumns;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.HTML_LAYER_HOLDER__COLUMNS, oldColumns, columns));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DomainPackage.HTML_LAYER_HOLDER__COLUMNS:
        return getColumns();
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
    switch (featureID)
    {
      case DomainPackage.HTML_LAYER_HOLDER__COLUMNS:
        setColumns((Integer)newValue);
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
    switch (featureID)
    {
      case DomainPackage.HTML_LAYER_HOLDER__COLUMNS:
        setColumns(COLUMNS_EDEFAULT);
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
    switch (featureID)
    {
      case DomainPackage.HTML_LAYER_HOLDER__COLUMNS:
        return columns != COLUMNS_EDEFAULT;
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
    result.append(" (columns: ");
    result.append(columns);
    result.append(')');
    return result.toString();
  }

} //HTMLLayerHolderImpl
