/**
 */
package domain.impl;

import domain.DomainPackage;
import domain.StyleClass;
import domain.StyleLibrary;
import domain.StyleSet;
import domain.StylesPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Style Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link domain.impl.StyleClassImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.impl.StyleClassImpl#getStylesPackage <em>Styles Package</em>}</li>
 *   <li>{@link domain.impl.StyleClassImpl#getLibrary <em>Library</em>}</li>
 *   <li>{@link domain.impl.StyleClassImpl#getStyleSet <em>Style Set</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StyleClassImpl extends EObjectImpl implements StyleClass
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
   * The cached value of the '{@link #getStylesPackage() <em>Styles Package</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStylesPackage()
   * @generated
   * @ordered
   */
  protected StylesPackage stylesPackage;

  /**
   * The cached value of the '{@link #getLibrary() <em>Library</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLibrary()
   * @generated
   * @ordered
   */
  protected StyleLibrary library;

  /**
   * The cached value of the '{@link #getStyleSet() <em>Style Set</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStyleSet()
   * @generated
   * @ordered
   */
  protected StyleSet styleSet;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StyleClassImpl()
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
    return DomainPackage.Literals.STYLE_CLASS;
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
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.STYLE_CLASS__UID, oldUid, uid));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StylesPackage getStylesPackage()
  {
    if (stylesPackage != null && stylesPackage.eIsProxy())
    {
      InternalEObject oldStylesPackage = (InternalEObject)stylesPackage;
      stylesPackage = (StylesPackage)eResolveProxy(oldStylesPackage);
      if (stylesPackage != oldStylesPackage)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.STYLE_CLASS__STYLES_PACKAGE, oldStylesPackage, stylesPackage));
      }
    }
    return stylesPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StylesPackage basicGetStylesPackage()
  {
    return stylesPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStylesPackage(StylesPackage newStylesPackage)
  {
    StylesPackage oldStylesPackage = stylesPackage;
    stylesPackage = newStylesPackage;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.STYLE_CLASS__STYLES_PACKAGE, oldStylesPackage, stylesPackage));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StyleLibrary getLibrary()
  {
    if (library != null && library.eIsProxy())
    {
      InternalEObject oldLibrary = (InternalEObject)library;
      library = (StyleLibrary)eResolveProxy(oldLibrary);
      if (library != oldLibrary)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.STYLE_CLASS__LIBRARY, oldLibrary, library));
      }
    }
    return library;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StyleLibrary basicGetLibrary()
  {
    return library;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLibrary(StyleLibrary newLibrary)
  {
    StyleLibrary oldLibrary = library;
    library = newLibrary;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.STYLE_CLASS__LIBRARY, oldLibrary, library));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StyleSet getStyleSet()
  {
    if (styleSet != null && styleSet.eIsProxy())
    {
      InternalEObject oldStyleSet = (InternalEObject)styleSet;
      styleSet = (StyleSet)eResolveProxy(oldStyleSet);
      if (styleSet != oldStyleSet)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.STYLE_CLASS__STYLE_SET, oldStyleSet, styleSet));
      }
    }
    return styleSet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StyleSet basicGetStyleSet()
  {
    return styleSet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStyleSet(StyleSet newStyleSet)
  {
    StyleSet oldStyleSet = styleSet;
    styleSet = newStyleSet;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.STYLE_CLASS__STYLE_SET, oldStyleSet, styleSet));
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
      case DomainPackage.STYLE_CLASS__UID:
        return getUid();
      case DomainPackage.STYLE_CLASS__STYLES_PACKAGE:
        if (resolve) return getStylesPackage();
        return basicGetStylesPackage();
      case DomainPackage.STYLE_CLASS__LIBRARY:
        if (resolve) return getLibrary();
        return basicGetLibrary();
      case DomainPackage.STYLE_CLASS__STYLE_SET:
        if (resolve) return getStyleSet();
        return basicGetStyleSet();
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
      case DomainPackage.STYLE_CLASS__UID:
        setUid((String)newValue);
        return;
      case DomainPackage.STYLE_CLASS__STYLES_PACKAGE:
        setStylesPackage((StylesPackage)newValue);
        return;
      case DomainPackage.STYLE_CLASS__LIBRARY:
        setLibrary((StyleLibrary)newValue);
        return;
      case DomainPackage.STYLE_CLASS__STYLE_SET:
        setStyleSet((StyleSet)newValue);
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
      case DomainPackage.STYLE_CLASS__UID:
        setUid(UID_EDEFAULT);
        return;
      case DomainPackage.STYLE_CLASS__STYLES_PACKAGE:
        setStylesPackage((StylesPackage)null);
        return;
      case DomainPackage.STYLE_CLASS__LIBRARY:
        setLibrary((StyleLibrary)null);
        return;
      case DomainPackage.STYLE_CLASS__STYLE_SET:
        setStyleSet((StyleSet)null);
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
      case DomainPackage.STYLE_CLASS__UID:
        return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
      case DomainPackage.STYLE_CLASS__STYLES_PACKAGE:
        return stylesPackage != null;
      case DomainPackage.STYLE_CLASS__LIBRARY:
        return library != null;
      case DomainPackage.STYLE_CLASS__STYLE_SET:
        return styleSet != null;
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
    result.append(')');
    return result.toString();
  }

} //StyleClassImpl
