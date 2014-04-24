/**
 */
package domain.impl;

import domain.DomainPackage;
import domain.Style;
import domain.StyleClass;
import domain.StyleElement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Style Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link domain.impl.StyleElementImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link domain.impl.StyleElementImpl#getStyleClass <em>Style Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StyleElementImpl extends EObjectImpl implements StyleElement
{
  /**
   * The cached value of the '{@link #getStyle() <em>Style</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStyle()
   * @generated
   * @ordered
   */
  protected Style style;

  /**
   * The cached value of the '{@link #getStyleClass() <em>Style Class</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStyleClass()
   * @generated
   * @ordered
   */
  protected StyleClass styleClass;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StyleElementImpl()
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
    return DomainPackage.Literals.STYLE_ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Style getStyle()
  {
    return style;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStyle(Style newStyle, NotificationChain msgs)
  {
    Style oldStyle = style;
    style = newStyle;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.STYLE_ELEMENT__STYLE, oldStyle, newStyle);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStyle(Style newStyle)
  {
    if (newStyle != style)
    {
      NotificationChain msgs = null;
      if (style != null)
        msgs = ((InternalEObject)style).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.STYLE_ELEMENT__STYLE, null, msgs);
      if (newStyle != null)
        msgs = ((InternalEObject)newStyle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainPackage.STYLE_ELEMENT__STYLE, null, msgs);
      msgs = basicSetStyle(newStyle, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.STYLE_ELEMENT__STYLE, newStyle, newStyle));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StyleClass getStyleClass()
  {
    return styleClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStyleClass(StyleClass newStyleClass, NotificationChain msgs)
  {
    StyleClass oldStyleClass = styleClass;
    styleClass = newStyleClass;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.STYLE_ELEMENT__STYLE_CLASS, oldStyleClass, newStyleClass);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStyleClass(StyleClass newStyleClass)
  {
    if (newStyleClass != styleClass)
    {
      NotificationChain msgs = null;
      if (styleClass != null)
        msgs = ((InternalEObject)styleClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.STYLE_ELEMENT__STYLE_CLASS, null, msgs);
      if (newStyleClass != null)
        msgs = ((InternalEObject)newStyleClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainPackage.STYLE_ELEMENT__STYLE_CLASS, null, msgs);
      msgs = basicSetStyleClass(newStyleClass, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.STYLE_ELEMENT__STYLE_CLASS, newStyleClass, newStyleClass));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DomainPackage.STYLE_ELEMENT__STYLE:
        return basicSetStyle(null, msgs);
      case DomainPackage.STYLE_ELEMENT__STYLE_CLASS:
        return basicSetStyleClass(null, msgs);
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
    switch (featureID)
    {
      case DomainPackage.STYLE_ELEMENT__STYLE:
        return getStyle();
      case DomainPackage.STYLE_ELEMENT__STYLE_CLASS:
        return getStyleClass();
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
      case DomainPackage.STYLE_ELEMENT__STYLE:
        setStyle((Style)newValue);
        return;
      case DomainPackage.STYLE_ELEMENT__STYLE_CLASS:
        setStyleClass((StyleClass)newValue);
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
      case DomainPackage.STYLE_ELEMENT__STYLE:
        setStyle((Style)null);
        return;
      case DomainPackage.STYLE_ELEMENT__STYLE_CLASS:
        setStyleClass((StyleClass)null);
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
      case DomainPackage.STYLE_ELEMENT__STYLE:
        return style != null;
      case DomainPackage.STYLE_ELEMENT__STYLE_CLASS:
        return styleClass != null;
    }
    return super.eIsSet(featureID);
  }

} //StyleElementImpl
