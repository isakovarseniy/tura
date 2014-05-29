/**
 */
package domain.impl;

import domain.DomainPackage;
import domain.LanguageRef;
import domain.Translation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Translation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link domain.impl.TranslationImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.impl.TranslationImpl#getTranslation <em>Translation</em>}</li>
 *   <li>{@link domain.impl.TranslationImpl#getLang <em>Lang</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TranslationImpl extends EObjectImpl implements Translation
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
   * The default value of the '{@link #getTranslation() <em>Translation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTranslation()
   * @generated
   * @ordered
   */
  protected static final String TRANSLATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTranslation() <em>Translation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTranslation()
   * @generated
   * @ordered
   */
  protected String translation = TRANSLATION_EDEFAULT;

  /**
   * The cached value of the '{@link #getLang() <em>Lang</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLang()
   * @generated
   * @ordered
   */
  protected LanguageRef lang;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TranslationImpl()
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
    return DomainPackage.Literals.TRANSLATION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.TRANSLATION__UID, oldUid, uid));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTranslation()
  {
    return translation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTranslation(String newTranslation)
  {
    String oldTranslation = translation;
    translation = newTranslation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.TRANSLATION__TRANSLATION, oldTranslation, translation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LanguageRef getLang()
  {
    if (lang != null && lang.eIsProxy())
    {
      InternalEObject oldLang = (InternalEObject)lang;
      lang = (LanguageRef)eResolveProxy(oldLang);
      if (lang != oldLang)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.TRANSLATION__LANG, oldLang, lang));
      }
    }
    return lang;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LanguageRef basicGetLang()
  {
    return lang;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLang(LanguageRef newLang)
  {
    LanguageRef oldLang = lang;
    lang = newLang;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.TRANSLATION__LANG, oldLang, lang));
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
      case DomainPackage.TRANSLATION__UID:
        return getUid();
      case DomainPackage.TRANSLATION__TRANSLATION:
        return getTranslation();
      case DomainPackage.TRANSLATION__LANG:
        if (resolve) return getLang();
        return basicGetLang();
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
      case DomainPackage.TRANSLATION__UID:
        setUid((String)newValue);
        return;
      case DomainPackage.TRANSLATION__TRANSLATION:
        setTranslation((String)newValue);
        return;
      case DomainPackage.TRANSLATION__LANG:
        setLang((LanguageRef)newValue);
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
      case DomainPackage.TRANSLATION__UID:
        setUid(UID_EDEFAULT);
        return;
      case DomainPackage.TRANSLATION__TRANSLATION:
        setTranslation(TRANSLATION_EDEFAULT);
        return;
      case DomainPackage.TRANSLATION__LANG:
        setLang((LanguageRef)null);
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
      case DomainPackage.TRANSLATION__UID:
        return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
      case DomainPackage.TRANSLATION__TRANSLATION:
        return TRANSLATION_EDEFAULT == null ? translation != null : !TRANSLATION_EDEFAULT.equals(translation);
      case DomainPackage.TRANSLATION__LANG:
        return lang != null;
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
    result.append(", translation: ");
    result.append(translation);
    result.append(')');
    return result.toString();
  }

} //TranslationImpl
