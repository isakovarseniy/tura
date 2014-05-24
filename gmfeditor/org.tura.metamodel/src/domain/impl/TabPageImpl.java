/**
 */
package domain.impl;

import domain.Context;
import domain.DomainPackage;
import domain.HTMLLayerHolder;
import domain.MultiLangLabel;
import domain.TabPage;
import domain.ViewElement;
import domain.ViewPortHolder;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tab Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link domain.impl.TabPageImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link domain.impl.TabPageImpl#getViewElement <em>View Element</em>}</li>
 *   <li>{@link domain.impl.TabPageImpl#getMultiLangLabel <em>Multi Lang Label</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TabPageImpl extends CanvasFrameImpl implements TabPage
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
   * The cached value of the '{@link #getViewElement() <em>View Element</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getViewElement()
   * @generated
   * @ordered
   */
  protected EList<ViewElement> viewElement;

  /**
   * The cached value of the '{@link #getMultiLangLabel() <em>Multi Lang Label</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMultiLangLabel()
   * @generated
   * @ordered
   */
  protected Context multiLangLabel;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TabPageImpl()
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
    return DomainPackage.Literals.TAB_PAGE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.TAB_PAGE__COLUMNS, oldColumns, columns));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ViewElement> getViewElement()
  {
    if (viewElement == null)
    {
      viewElement = new EObjectContainmentEList<ViewElement>(ViewElement.class, this, DomainPackage.TAB_PAGE__VIEW_ELEMENT);
    }
    return viewElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Context getMultiLangLabel()
  {
    return multiLangLabel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMultiLangLabel(Context newMultiLangLabel, NotificationChain msgs)
  {
    Context oldMultiLangLabel = multiLangLabel;
    multiLangLabel = newMultiLangLabel;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.TAB_PAGE__MULTI_LANG_LABEL, oldMultiLangLabel, newMultiLangLabel);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMultiLangLabel(Context newMultiLangLabel)
  {
    if (newMultiLangLabel != multiLangLabel)
    {
      NotificationChain msgs = null;
      if (multiLangLabel != null)
        msgs = ((InternalEObject)multiLangLabel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.TAB_PAGE__MULTI_LANG_LABEL, null, msgs);
      if (newMultiLangLabel != null)
        msgs = ((InternalEObject)newMultiLangLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainPackage.TAB_PAGE__MULTI_LANG_LABEL, null, msgs);
      msgs = basicSetMultiLangLabel(newMultiLangLabel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.TAB_PAGE__MULTI_LANG_LABEL, newMultiLangLabel, newMultiLangLabel));
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
      case DomainPackage.TAB_PAGE__VIEW_ELEMENT:
        return ((InternalEList<?>)getViewElement()).basicRemove(otherEnd, msgs);
      case DomainPackage.TAB_PAGE__MULTI_LANG_LABEL:
        return basicSetMultiLangLabel(null, msgs);
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
      case DomainPackage.TAB_PAGE__COLUMNS:
        return getColumns();
      case DomainPackage.TAB_PAGE__VIEW_ELEMENT:
        return getViewElement();
      case DomainPackage.TAB_PAGE__MULTI_LANG_LABEL:
        return getMultiLangLabel();
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
      case DomainPackage.TAB_PAGE__COLUMNS:
        setColumns((Integer)newValue);
        return;
      case DomainPackage.TAB_PAGE__VIEW_ELEMENT:
        getViewElement().clear();
        getViewElement().addAll((Collection<? extends ViewElement>)newValue);
        return;
      case DomainPackage.TAB_PAGE__MULTI_LANG_LABEL:
        setMultiLangLabel((Context)newValue);
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
      case DomainPackage.TAB_PAGE__COLUMNS:
        setColumns(COLUMNS_EDEFAULT);
        return;
      case DomainPackage.TAB_PAGE__VIEW_ELEMENT:
        getViewElement().clear();
        return;
      case DomainPackage.TAB_PAGE__MULTI_LANG_LABEL:
        setMultiLangLabel((Context)null);
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
      case DomainPackage.TAB_PAGE__COLUMNS:
        return columns != COLUMNS_EDEFAULT;
      case DomainPackage.TAB_PAGE__VIEW_ELEMENT:
        return viewElement != null && !viewElement.isEmpty();
      case DomainPackage.TAB_PAGE__MULTI_LANG_LABEL:
        return multiLangLabel != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == HTMLLayerHolder.class)
    {
      switch (derivedFeatureID)
      {
        case DomainPackage.TAB_PAGE__COLUMNS: return DomainPackage.HTML_LAYER_HOLDER__COLUMNS;
        default: return -1;
      }
    }
    if (baseClass == ViewPortHolder.class)
    {
      switch (derivedFeatureID)
      {
        case DomainPackage.TAB_PAGE__VIEW_ELEMENT: return DomainPackage.VIEW_PORT_HOLDER__VIEW_ELEMENT;
        default: return -1;
      }
    }
    if (baseClass == MultiLangLabel.class)
    {
      switch (derivedFeatureID)
      {
        case DomainPackage.TAB_PAGE__MULTI_LANG_LABEL: return DomainPackage.MULTI_LANG_LABEL__MULTI_LANG_LABEL;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == HTMLLayerHolder.class)
    {
      switch (baseFeatureID)
      {
        case DomainPackage.HTML_LAYER_HOLDER__COLUMNS: return DomainPackage.TAB_PAGE__COLUMNS;
        default: return -1;
      }
    }
    if (baseClass == ViewPortHolder.class)
    {
      switch (baseFeatureID)
      {
        case DomainPackage.VIEW_PORT_HOLDER__VIEW_ELEMENT: return DomainPackage.TAB_PAGE__VIEW_ELEMENT;
        default: return -1;
      }
    }
    if (baseClass == MultiLangLabel.class)
    {
      switch (baseFeatureID)
      {
        case DomainPackage.MULTI_LANG_LABEL__MULTI_LANG_LABEL: return DomainPackage.TAB_PAGE__MULTI_LANG_LABEL;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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

} //TabPageImpl
