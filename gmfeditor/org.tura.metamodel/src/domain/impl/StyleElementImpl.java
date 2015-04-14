/**
 */
package domain.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import domain.Context;
import domain.ContextParameters;
import domain.DomainPackage;
import domain.StyleClass;
import domain.StyleElement;
import java.util.Collection;

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
  protected Context style;

  /**
   * The cached value of the '{@link #getStyleClass() <em>Style Class</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStyleClass()
   * @generated
   * @ordered
   */
  protected EList<StyleClass> styleClass;

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
  public Context getStyle()
  {
    return style;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStyle(Context newStyle, NotificationChain msgs)
  {
    Context oldStyle = style;
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
  public void setStyle(Context newStyle)
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
  public EList<StyleClass> getStyleClass()
  {
    if (styleClass == null)
    {
      styleClass = new EObjectContainmentEList<StyleClass>(StyleClass.class, this, DomainPackage.STYLE_ELEMENT__STYLE_CLASS);
    }
    return styleClass;
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
        return ((InternalEList<?>)getStyleClass()).basicRemove(otherEnd, msgs);
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
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DomainPackage.STYLE_ELEMENT__STYLE:
        setStyle((Context)newValue);
        return;
      case DomainPackage.STYLE_ELEMENT__STYLE_CLASS:
        getStyleClass().clear();
        getStyleClass().addAll((Collection<? extends StyleClass>)newValue);
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
        setStyle((Context)null);
        return;
      case DomainPackage.STYLE_ELEMENT__STYLE_CLASS:
        getStyleClass().clear();
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
        return styleClass != null && !styleClass.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //StyleElementImpl
