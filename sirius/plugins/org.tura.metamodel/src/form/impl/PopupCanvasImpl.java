/**
 */
package form.impl;

import common.Categorized;
import common.Classifier;
import common.CommonPackage;

import form.Context;
import form.DefaultCavas;
import form.FlexField;
import form.FlexFields;
import form.FormPackage;
import form.HTMLLayerHolder;
import form.MultiLangLabel;
import form.PopupCanvas;
import form.ViewElement;
import form.ViewPortHolder;

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
 * An implementation of the model object '<em><b>Popup Canvas</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link form.impl.PopupCanvasImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link form.impl.PopupCanvasImpl#getViewElement <em>View Element</em>}</li>
 *   <li>{@link form.impl.PopupCanvasImpl#isDefaultCanvas <em>Default Canvas</em>}</li>
 *   <li>{@link form.impl.PopupCanvasImpl#getMultiLangLabel <em>Multi Lang Label</em>}</li>
 *   <li>{@link form.impl.PopupCanvasImpl#getClassifiers <em>Classifiers</em>}</li>
 *   <li>{@link form.impl.PopupCanvasImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link form.impl.PopupCanvasImpl#isModal <em>Modal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PopupCanvasImpl extends CanvasFrameImpl implements PopupCanvas {
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
	 * The default value of the '{@link #isDefaultCanvas() <em>Default Canvas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDefaultCanvas()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DEFAULT_CANVAS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDefaultCanvas() <em>Default Canvas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDefaultCanvas()
	 * @generated
	 * @ordered
	 */
	protected boolean defaultCanvas = DEFAULT_CANVAS_EDEFAULT;

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
	 * The cached value of the '{@link #getClassifiers() <em>Classifiers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<Classifier> classifiers;

	/**
	 * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFields()
	 * @generated
	 * @ordered
	 */
	protected EList<FlexField> fields;

	/**
	 * The default value of the '{@link #isModal() <em>Modal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isModal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MODAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isModal() <em>Modal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isModal()
	 * @generated
	 * @ordered
	 */
	protected boolean modal = MODAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PopupCanvasImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FormPackage.Literals.POPUP_CANVAS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getColumns() {
		return columns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumns(int newColumns) {
		int oldColumns = columns;
		columns = newColumns;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.POPUP_CANVAS__COLUMNS, oldColumns, columns));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ViewElement> getViewElement() {
		if (viewElement == null) {
			viewElement = new EObjectContainmentEList<ViewElement>(ViewElement.class, this, FormPackage.POPUP_CANVAS__VIEW_ELEMENT);
		}
		return viewElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDefaultCanvas() {
		return defaultCanvas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultCanvas(boolean newDefaultCanvas) {
		boolean oldDefaultCanvas = defaultCanvas;
		defaultCanvas = newDefaultCanvas;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.POPUP_CANVAS__DEFAULT_CANVAS, oldDefaultCanvas, defaultCanvas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Context getMultiLangLabel() {
		return multiLangLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultiLangLabel(Context newMultiLangLabel, NotificationChain msgs) {
		Context oldMultiLangLabel = multiLangLabel;
		multiLangLabel = newMultiLangLabel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FormPackage.POPUP_CANVAS__MULTI_LANG_LABEL, oldMultiLangLabel, newMultiLangLabel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiLangLabel(Context newMultiLangLabel) {
		if (newMultiLangLabel != multiLangLabel) {
			NotificationChain msgs = null;
			if (multiLangLabel != null)
				msgs = ((InternalEObject)multiLangLabel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FormPackage.POPUP_CANVAS__MULTI_LANG_LABEL, null, msgs);
			if (newMultiLangLabel != null)
				msgs = ((InternalEObject)newMultiLangLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FormPackage.POPUP_CANVAS__MULTI_LANG_LABEL, null, msgs);
			msgs = basicSetMultiLangLabel(newMultiLangLabel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.POPUP_CANVAS__MULTI_LANG_LABEL, newMultiLangLabel, newMultiLangLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> getClassifiers() {
		if (classifiers == null) {
			classifiers = new EObjectContainmentEList<Classifier>(Classifier.class, this, FormPackage.POPUP_CANVAS__CLASSIFIERS);
		}
		return classifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FlexField> getFields() {
		if (fields == null) {
			fields = new EObjectContainmentEList<FlexField>(FlexField.class, this, FormPackage.POPUP_CANVAS__FIELDS);
		}
		return fields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isModal() {
		return modal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModal(boolean newModal) {
		boolean oldModal = modal;
		modal = newModal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.POPUP_CANVAS__MODAL, oldModal, modal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FormPackage.POPUP_CANVAS__VIEW_ELEMENT:
				return ((InternalEList<?>)getViewElement()).basicRemove(otherEnd, msgs);
			case FormPackage.POPUP_CANVAS__MULTI_LANG_LABEL:
				return basicSetMultiLangLabel(null, msgs);
			case FormPackage.POPUP_CANVAS__CLASSIFIERS:
				return ((InternalEList<?>)getClassifiers()).basicRemove(otherEnd, msgs);
			case FormPackage.POPUP_CANVAS__FIELDS:
				return ((InternalEList<?>)getFields()).basicRemove(otherEnd, msgs);
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
		switch (featureID) {
			case FormPackage.POPUP_CANVAS__COLUMNS:
				return getColumns();
			case FormPackage.POPUP_CANVAS__VIEW_ELEMENT:
				return getViewElement();
			case FormPackage.POPUP_CANVAS__DEFAULT_CANVAS:
				return isDefaultCanvas();
			case FormPackage.POPUP_CANVAS__MULTI_LANG_LABEL:
				return getMultiLangLabel();
			case FormPackage.POPUP_CANVAS__CLASSIFIERS:
				return getClassifiers();
			case FormPackage.POPUP_CANVAS__FIELDS:
				return getFields();
			case FormPackage.POPUP_CANVAS__MODAL:
				return isModal();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FormPackage.POPUP_CANVAS__COLUMNS:
				setColumns((Integer)newValue);
				return;
			case FormPackage.POPUP_CANVAS__VIEW_ELEMENT:
				getViewElement().clear();
				getViewElement().addAll((Collection<? extends ViewElement>)newValue);
				return;
			case FormPackage.POPUP_CANVAS__DEFAULT_CANVAS:
				setDefaultCanvas((Boolean)newValue);
				return;
			case FormPackage.POPUP_CANVAS__MULTI_LANG_LABEL:
				setMultiLangLabel((Context)newValue);
				return;
			case FormPackage.POPUP_CANVAS__CLASSIFIERS:
				getClassifiers().clear();
				getClassifiers().addAll((Collection<? extends Classifier>)newValue);
				return;
			case FormPackage.POPUP_CANVAS__FIELDS:
				getFields().clear();
				getFields().addAll((Collection<? extends FlexField>)newValue);
				return;
			case FormPackage.POPUP_CANVAS__MODAL:
				setModal((Boolean)newValue);
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
		switch (featureID) {
			case FormPackage.POPUP_CANVAS__COLUMNS:
				setColumns(COLUMNS_EDEFAULT);
				return;
			case FormPackage.POPUP_CANVAS__VIEW_ELEMENT:
				getViewElement().clear();
				return;
			case FormPackage.POPUP_CANVAS__DEFAULT_CANVAS:
				setDefaultCanvas(DEFAULT_CANVAS_EDEFAULT);
				return;
			case FormPackage.POPUP_CANVAS__MULTI_LANG_LABEL:
				setMultiLangLabel((Context)null);
				return;
			case FormPackage.POPUP_CANVAS__CLASSIFIERS:
				getClassifiers().clear();
				return;
			case FormPackage.POPUP_CANVAS__FIELDS:
				getFields().clear();
				return;
			case FormPackage.POPUP_CANVAS__MODAL:
				setModal(MODAL_EDEFAULT);
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
		switch (featureID) {
			case FormPackage.POPUP_CANVAS__COLUMNS:
				return columns != COLUMNS_EDEFAULT;
			case FormPackage.POPUP_CANVAS__VIEW_ELEMENT:
				return viewElement != null && !viewElement.isEmpty();
			case FormPackage.POPUP_CANVAS__DEFAULT_CANVAS:
				return defaultCanvas != DEFAULT_CANVAS_EDEFAULT;
			case FormPackage.POPUP_CANVAS__MULTI_LANG_LABEL:
				return multiLangLabel != null;
			case FormPackage.POPUP_CANVAS__CLASSIFIERS:
				return classifiers != null && !classifiers.isEmpty();
			case FormPackage.POPUP_CANVAS__FIELDS:
				return fields != null && !fields.isEmpty();
			case FormPackage.POPUP_CANVAS__MODAL:
				return modal != MODAL_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == HTMLLayerHolder.class) {
			switch (derivedFeatureID) {
				case FormPackage.POPUP_CANVAS__COLUMNS: return FormPackage.HTML_LAYER_HOLDER__COLUMNS;
				default: return -1;
			}
		}
		if (baseClass == ViewPortHolder.class) {
			switch (derivedFeatureID) {
				case FormPackage.POPUP_CANVAS__VIEW_ELEMENT: return FormPackage.VIEW_PORT_HOLDER__VIEW_ELEMENT;
				default: return -1;
			}
		}
		if (baseClass == DefaultCavas.class) {
			switch (derivedFeatureID) {
				case FormPackage.POPUP_CANVAS__DEFAULT_CANVAS: return FormPackage.DEFAULT_CAVAS__DEFAULT_CANVAS;
				default: return -1;
			}
		}
		if (baseClass == MultiLangLabel.class) {
			switch (derivedFeatureID) {
				case FormPackage.POPUP_CANVAS__MULTI_LANG_LABEL: return FormPackage.MULTI_LANG_LABEL__MULTI_LANG_LABEL;
				default: return -1;
			}
		}
		if (baseClass == Categorized.class) {
			switch (derivedFeatureID) {
				case FormPackage.POPUP_CANVAS__CLASSIFIERS: return CommonPackage.CATEGORIZED__CLASSIFIERS;
				default: return -1;
			}
		}
		if (baseClass == FlexFields.class) {
			switch (derivedFeatureID) {
				case FormPackage.POPUP_CANVAS__FIELDS: return FormPackage.FLEX_FIELDS__FIELDS;
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
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == HTMLLayerHolder.class) {
			switch (baseFeatureID) {
				case FormPackage.HTML_LAYER_HOLDER__COLUMNS: return FormPackage.POPUP_CANVAS__COLUMNS;
				default: return -1;
			}
		}
		if (baseClass == ViewPortHolder.class) {
			switch (baseFeatureID) {
				case FormPackage.VIEW_PORT_HOLDER__VIEW_ELEMENT: return FormPackage.POPUP_CANVAS__VIEW_ELEMENT;
				default: return -1;
			}
		}
		if (baseClass == DefaultCavas.class) {
			switch (baseFeatureID) {
				case FormPackage.DEFAULT_CAVAS__DEFAULT_CANVAS: return FormPackage.POPUP_CANVAS__DEFAULT_CANVAS;
				default: return -1;
			}
		}
		if (baseClass == MultiLangLabel.class) {
			switch (baseFeatureID) {
				case FormPackage.MULTI_LANG_LABEL__MULTI_LANG_LABEL: return FormPackage.POPUP_CANVAS__MULTI_LANG_LABEL;
				default: return -1;
			}
		}
		if (baseClass == Categorized.class) {
			switch (baseFeatureID) {
				case CommonPackage.CATEGORIZED__CLASSIFIERS: return FormPackage.POPUP_CANVAS__CLASSIFIERS;
				default: return -1;
			}
		}
		if (baseClass == FlexFields.class) {
			switch (baseFeatureID) {
				case FormPackage.FLEX_FIELDS__FIELDS: return FormPackage.POPUP_CANVAS__FIELDS;
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (columns: ");
		result.append(columns);
		result.append(", defaultCanvas: ");
		result.append(defaultCanvas);
		result.append(", modal: ");
		result.append(modal);
		result.append(')');
		return result.toString();
	}

} //PopupCanvasImpl
