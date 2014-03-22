/**
 */
package domain.impl;

import domain.DomainPackage;
import domain.Link;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link domain.impl.LinkImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.impl.LinkImpl#getMasterField <em>Master Field</em>}</li>
 *   <li>{@link domain.impl.LinkImpl#getDetailField <em>Detail Field</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinkImpl extends EObjectImpl implements Link
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
   * The default value of the '{@link #getMasterField() <em>Master Field</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMasterField()
   * @generated
   * @ordered
   */
  protected static final String MASTER_FIELD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMasterField() <em>Master Field</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMasterField()
   * @generated
   * @ordered
   */
  protected String masterField = MASTER_FIELD_EDEFAULT;

  /**
   * The default value of the '{@link #getDetailField() <em>Detail Field</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDetailField()
   * @generated
   * @ordered
   */
  protected static final String DETAIL_FIELD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDetailField() <em>Detail Field</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDetailField()
   * @generated
   * @ordered
   */
  protected String detailField = DETAIL_FIELD_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LinkImpl()
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
    return DomainPackage.Literals.LINK;
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
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.LINK__UID, oldUid, uid));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMasterField()
  {
    return masterField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMasterField(String newMasterField)
  {
    String oldMasterField = masterField;
    masterField = newMasterField;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.LINK__MASTER_FIELD, oldMasterField, masterField));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDetailField()
  {
    return detailField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDetailField(String newDetailField)
  {
    String oldDetailField = detailField;
    detailField = newDetailField;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.LINK__DETAIL_FIELD, oldDetailField, detailField));
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
      case DomainPackage.LINK__UID:
        return getUid();
      case DomainPackage.LINK__MASTER_FIELD:
        return getMasterField();
      case DomainPackage.LINK__DETAIL_FIELD:
        return getDetailField();
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
      case DomainPackage.LINK__UID:
        setUid((String)newValue);
        return;
      case DomainPackage.LINK__MASTER_FIELD:
        setMasterField((String)newValue);
        return;
      case DomainPackage.LINK__DETAIL_FIELD:
        setDetailField((String)newValue);
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
      case DomainPackage.LINK__UID:
        setUid(UID_EDEFAULT);
        return;
      case DomainPackage.LINK__MASTER_FIELD:
        setMasterField(MASTER_FIELD_EDEFAULT);
        return;
      case DomainPackage.LINK__DETAIL_FIELD:
        setDetailField(DETAIL_FIELD_EDEFAULT);
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
      case DomainPackage.LINK__UID:
        return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
      case DomainPackage.LINK__MASTER_FIELD:
        return MASTER_FIELD_EDEFAULT == null ? masterField != null : !MASTER_FIELD_EDEFAULT.equals(masterField);
      case DomainPackage.LINK__DETAIL_FIELD:
        return DETAIL_FIELD_EDEFAULT == null ? detailField != null : !DETAIL_FIELD_EDEFAULT.equals(detailField);
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
    result.append(", masterField: ");
    result.append(masterField);
    result.append(", detailField: ");
    result.append(detailField);
    result.append(')');
    return result.toString();
  }

} //LinkImpl
