/**
 */
package form;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import type.TypePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see form.FormFactory
 * @model kind="package"
 * @generated
 */
public interface FormPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "form";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://tura.org/2016/v2/form";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tura.form";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FormPackage eINSTANCE = form.impl.FormPackageImpl.init();

	/**
	 * The meta object id for the '{@link form.impl.FormImpl <em>Form</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.impl.FormImpl
	 * @see form.impl.FormPackageImpl#getForm()
	 * @generated
	 */
	int FORM = 0;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__UID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__NAME = 1;

	/**
	 * The feature id for the '<em><b>View</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__VIEW = 2;

	/**
	 * The feature id for the '<em><b>Datacontrols</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__DATACONTROLS = 3;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__PARAMETERS = 4;

	/**
	 * The number of structural features of the '<em>Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link form.impl.FormParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.impl.FormParameterImpl
	 * @see form.impl.FormPackageImpl#getFormParameter()
	 * @generated
	 */
	int FORM_PARAMETER = 1;

	/**
	 * The feature id for the '<em><b>Type Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER__TYPE_REF = TypePackage.TYPE_POINTER__TYPE_REF;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER__UID = TypePackage.TYPE_POINTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER__NAME = TypePackage.TYPE_POINTER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER_FEATURE_COUNT = TypePackage.TYPE_POINTER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link form.impl.ViewsImpl <em>Views</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.impl.ViewsImpl
	 * @see form.impl.FormPackageImpl#getViews()
	 * @generated
	 */
	int VIEWS = 2;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWS__UID = 0;

	/**
	 * The feature id for the '<em><b>Canvases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWS__CANVASES = 1;

	/**
	 * The feature id for the '<em><b>View Inheritances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWS__VIEW_INHERITANCES = 2;

	/**
	 * The feature id for the '<em><b>Tab Pages Inheritances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWS__TAB_PAGES_INHERITANCES = 3;

	/**
	 * The feature id for the '<em><b>Menus</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWS__MENUS = 4;

	/**
	 * The number of structural features of the '<em>Views</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWS_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link form.impl.HTMLLayerHolderImpl <em>HTML Layer Holder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.impl.HTMLLayerHolderImpl
	 * @see form.impl.FormPackageImpl#getHTMLLayerHolder()
	 * @generated
	 */
	int HTML_LAYER_HOLDER = 3;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_LAYER_HOLDER__COLUMNS = 0;

	/**
	 * The number of structural features of the '<em>HTML Layer Holder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_LAYER_HOLDER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link form.impl.OrderableImpl <em>Orderable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.impl.OrderableImpl
	 * @see form.impl.FormPackageImpl#getOrderable()
	 * @generated
	 */
	int ORDERABLE = 4;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERABLE__ORDER = 0;

	/**
	 * The number of structural features of the '<em>Orderable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERABLE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link form.impl.MultiLangLabelImpl <em>Multi Lang Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.impl.MultiLangLabelImpl
	 * @see form.impl.FormPackageImpl#getMultiLangLabel()
	 * @generated
	 */
	int MULTI_LANG_LABEL = 5;

	/**
	 * The feature id for the '<em><b>Multi Lang Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LANG_LABEL__MULTI_LANG_LABEL = 0;

	/**
	 * The number of structural features of the '<em>Multi Lang Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LANG_LABEL_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link form.impl.StyleElementImpl <em>Style Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.impl.StyleElementImpl
	 * @see form.impl.FormPackageImpl#getStyleElement()
	 * @generated
	 */
	int STYLE_ELEMENT = 29;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_ELEMENT__STYLE = 0;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_ELEMENT__STYLE_CLASS = 1;

	/**
	 * The number of structural features of the '<em>Style Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link form.impl.CanvasFrameImpl <em>Canvas Frame</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.impl.CanvasFrameImpl
	 * @see form.impl.FormPackageImpl#getCanvasFrame()
	 * @generated
	 */
	int CANVAS_FRAME = 6;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS_FRAME__STYLE = STYLE_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS_FRAME__STYLE_CLASS = STYLE_ELEMENT__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS_FRAME__UID = STYLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS_FRAME__NAME = STYLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Canvas Frame</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS_FRAME_FEATURE_COUNT = STYLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link form.impl.ViewPortHolderImpl <em>View Port Holder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.impl.ViewPortHolderImpl
	 * @see form.impl.FormPackageImpl#getViewPortHolder()
	 * @generated
	 */
	int VIEW_PORT_HOLDER = 7;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_PORT_HOLDER__COLUMNS = HTML_LAYER_HOLDER__COLUMNS;

	/**
	 * The feature id for the '<em><b>View Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_PORT_HOLDER__VIEW_ELEMENT = HTML_LAYER_HOLDER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>View Port Holder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_PORT_HOLDER_FEATURE_COUNT = HTML_LAYER_HOLDER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link form.impl.DefaultCavasImpl <em>Default Cavas</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.impl.DefaultCavasImpl
	 * @see form.impl.FormPackageImpl#getDefaultCavas()
	 * @generated
	 */
	int DEFAULT_CAVAS = 8;

	/**
	 * The feature id for the '<em><b>Default Canvas</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_CAVAS__DEFAULT_CANVAS = 0;

	/**
	 * The number of structural features of the '<em>Default Cavas</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_CAVAS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link form.impl.ViewElementImpl <em>View Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.impl.ViewElementImpl
	 * @see form.impl.FormPackageImpl#getViewElement()
	 * @generated
	 */
	int VIEW_ELEMENT = 9;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT__STYLE = STYLE_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT__STYLE_CLASS = STYLE_ELEMENT__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Classifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT__CLASSIFIERS = STYLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nickname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT__NICKNAME = STYLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>View Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_FEATURE_COUNT = STYLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link form.impl.PopupCanvasImpl <em>Popup Canvas</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.impl.PopupCanvasImpl
	 * @see form.impl.FormPackageImpl#getPopupCanvas()
	 * @generated
	 */
	int POPUP_CANVAS = 10;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPUP_CANVAS__STYLE = CANVAS_FRAME__STYLE;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPUP_CANVAS__STYLE_CLASS = CANVAS_FRAME__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPUP_CANVAS__UID = CANVAS_FRAME__UID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPUP_CANVAS__NAME = CANVAS_FRAME__NAME;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPUP_CANVAS__COLUMNS = CANVAS_FRAME_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>View Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPUP_CANVAS__VIEW_ELEMENT = CANVAS_FRAME_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Default Canvas</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPUP_CANVAS__DEFAULT_CANVAS = CANVAS_FRAME_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Multi Lang Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPUP_CANVAS__MULTI_LANG_LABEL = CANVAS_FRAME_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Classifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPUP_CANVAS__CLASSIFIERS = CANVAS_FRAME_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPUP_CANVAS__FIELDS = CANVAS_FRAME_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Modal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPUP_CANVAS__MODAL = CANVAS_FRAME_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Popup Canvas</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPUP_CANVAS_FEATURE_COUNT = CANVAS_FRAME_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link form.impl.CanvasImpl <em>Canvas</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.impl.CanvasImpl
	 * @see form.impl.FormPackageImpl#getCanvas()
	 * @generated
	 */
	int CANVAS = 11;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS__STYLE = CANVAS_FRAME__STYLE;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS__STYLE_CLASS = CANVAS_FRAME__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS__UID = CANVAS_FRAME__UID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS__NAME = CANVAS_FRAME__NAME;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS__COLUMNS = CANVAS_FRAME_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>View Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS__VIEW_ELEMENT = CANVAS_FRAME_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Default Canvas</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS__DEFAULT_CANVAS = CANVAS_FRAME_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Multi Lang Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS__MULTI_LANG_LABEL = CANVAS_FRAME_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Classifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS__CLASSIFIERS = CANVAS_FRAME_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Canvas</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS_FEATURE_COUNT = CANVAS_FRAME_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link form.impl.WindowImpl <em>Window</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.impl.WindowImpl
	 * @see form.impl.FormPackageImpl#getWindow()
	 * @generated
	 */
	int WINDOW = 12;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__STYLE = CANVAS_FRAME__STYLE;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__STYLE_CLASS = CANVAS_FRAME__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__UID = CANVAS_FRAME__UID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__NAME = CANVAS_FRAME__NAME;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__COLUMNS = CANVAS_FRAME_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>View Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__VIEW_ELEMENT = CANVAS_FRAME_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Multi Lang Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__MULTI_LANG_LABEL = CANVAS_FRAME_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Classifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__CLASSIFIERS = CANVAS_FRAME_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Grants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__GRANTS = CANVAS_FRAME_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Window</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW_FEATURE_COUNT = CANVAS_FRAME_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link form.impl.MenuDefinitionImpl <em>Menu Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.impl.MenuDefinitionImpl
	 * @see form.impl.FormPackageImpl#getMenuDefinition()
	 * @generated
	 */
	int MENU_DEFINITION = 13;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_DEFINITION__STYLE = STYLE_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_DEFINITION__STYLE_CLASS = STYLE_ELEMENT__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Classifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_DEFINITION__CLASSIFIERS = STYLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_DEFINITION__UID = STYLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_DEFINITION__NAME = STYLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Menu View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_DEFINITION__MENU_VIEW = STYLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Menu Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_DEFINITION_FEATURE_COUNT = STYLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link form.impl.TabCanvasImpl <em>Tab Canvas</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.impl.TabCanvasImpl
	 * @see form.impl.FormPackageImpl#getTabCanvas()
	 * @generated
	 */
	int TAB_CANVAS = 14;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_CANVAS__STYLE = CANVAS_FRAME__STYLE;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_CANVAS__STYLE_CLASS = CANVAS_FRAME__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_CANVAS__UID = CANVAS_FRAME__UID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_CANVAS__NAME = CANVAS_FRAME__NAME;

	/**
	 * The feature id for the '<em><b>Default Canvas</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_CANVAS__DEFAULT_CANVAS = CANVAS_FRAME_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Multi Lang Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_CANVAS__MULTI_LANG_LABEL = CANVAS_FRAME_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Classifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_CANVAS__CLASSIFIERS = CANVAS_FRAME_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Orientation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_CANVAS__ORIENTATION = CANVAS_FRAME_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Tab Canvas</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_CANVAS_FEATURE_COUNT = CANVAS_FRAME_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link form.impl.TabPageImpl <em>Tab Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.impl.TabPageImpl
	 * @see form.impl.FormPackageImpl#getTabPage()
	 * @generated
	 */
	int TAB_PAGE = 15;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_PAGE__STYLE = CANVAS_FRAME__STYLE;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_PAGE__STYLE_CLASS = CANVAS_FRAME__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_PAGE__UID = CANVAS_FRAME__UID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_PAGE__NAME = CANVAS_FRAME__NAME;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_PAGE__COLUMNS = CANVAS_FRAME_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>View Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_PAGE__VIEW_ELEMENT = CANVAS_FRAME_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Multi Lang Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_PAGE__MULTI_LANG_LABEL = CANVAS_FRAME_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Classifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_PAGE__CLASSIFIERS = CANVAS_FRAME_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_PAGE__ORDER = CANVAS_FRAME_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Tab Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_PAGE_FEATURE_COUNT = CANVAS_FRAME_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link form.impl.ViewPortImpl <em>View Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.impl.ViewPortImpl
	 * @see form.impl.FormPackageImpl#getViewPort()
	 * @generated
	 */
	int VIEW_PORT = 16;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_PORT__STYLE = VIEW_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_PORT__STYLE_CLASS = VIEW_ELEMENT__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Classifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_PORT__CLASSIFIERS = VIEW_ELEMENT__CLASSIFIERS;

	/**
	 * The feature id for the '<em><b>Nickname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_PORT__NICKNAME = VIEW_ELEMENT__NICKNAME;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_PORT__ORDER = VIEW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_PORT__UID = VIEW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_PORT__NAME = VIEW_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>View Port Trigger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_PORT__VIEW_PORT_TRIGGER = VIEW_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>View Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_PORT_FEATURE_COUNT = VIEW_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link form.impl.ViewAreaImpl <em>View Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.impl.ViewAreaImpl
	 * @see form.impl.FormPackageImpl#getViewArea()
	 * @generated
	 */
	int VIEW_AREA = 17;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_AREA__STYLE = VIEW_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_AREA__STYLE_CLASS = VIEW_ELEMENT__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Classifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_AREA__CLASSIFIERS = VIEW_ELEMENT__CLASSIFIERS;

	/**
	 * The feature id for the '<em><b>Nickname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_AREA__NICKNAME = VIEW_ELEMENT__NICKNAME;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_AREA__ORDER = VIEW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_AREA__UID = VIEW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_AREA__NAME = VIEW_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Base Canvas</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_AREA__BASE_CANVAS = VIEW_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Link To Labels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_AREA__LINK_TO_LABELS = VIEW_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Link To Messages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_AREA__LINK_TO_MESSAGES = VIEW_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>View Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_AREA_FEATURE_COUNT = VIEW_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link form.impl.TriggerImpl <em>Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.impl.TriggerImpl
	 * @see form.impl.FormPackageImpl#getTrigger()
	 * @generated
	 */
	int TRIGGER = 68;

	/**
	 * The feature id for the '<em><b>Method Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__METHOD_REF = TypePackage.METHOD_POINTER__METHOD_REF;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__PARAMETERS = TypePackage.METHOD_POINTER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_FEATURE_COUNT = TypePackage.METHOD_POINTER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link form.impl.ViewPortTriggerImpl <em>View Port Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.impl.ViewPortTriggerImpl
	 * @see form.impl.FormPackageImpl#getViewPortTrigger()
	 * @generated
	 */
	int VIEW_PORT_TRIGGER = 18;

	/**
	 * The feature id for the '<em><b>Method Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_PORT_TRIGGER__METHOD_REF = TRIGGER__METHOD_REF;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_PORT_TRIGGER__PARAMETERS = TRIGGER__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_PORT_TRIGGER__UID = TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>View Port Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_PORT_TRIGGER_FEATURE_COUNT = TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link form.impl.ViewInheritanceImpl <em>View Inheritance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.impl.ViewInheritanceImpl
	 * @see form.impl.FormPackageImpl#getViewInheritance()
	 * @generated
	 */
	int VIEW_INHERITANCE = 19;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_INHERITANCE__UID = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_INHERITANCE__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_INHERITANCE__TARGET = 2;

	/**
	 * The number of structural features of the '<em>View Inheritance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_INHERITANCE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link form.impl.TabPagesInheritanceImpl <em>Tab Pages Inheritance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.impl.TabPagesInheritanceImpl
	 * @see form.impl.FormPackageImpl#getTabPagesInheritance()
	 * @generated
	 */
	int TAB_PAGES_INHERITANCE = 20;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_PAGES_INHERITANCE__UID = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_PAGES_INHERITANCE__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_PAGES_INHERITANCE__TARGET = 2;

	/**
	 * The number of structural features of the '<em>Tab Pages Inheritance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_PAGES_INHERITANCE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link form.impl.LinkToMessageImpl <em>Link To Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.impl.LinkToMessageImpl
	 * @see form.impl.FormPackageImpl#getLinkToMessage()
	 * @generated
	 */
	int LINK_TO_MESSAGE = 21;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TO_MESSAGE__UID = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TO_MESSAGE__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TO_MESSAGE__TARGET = 2;

	/**
	 * The number of structural features of the '<em>Link To Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TO_MESSAGE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link form.impl.LinkToLabelImpl <em>Link To Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.impl.LinkToLabelImpl
	 * @see form.impl.FormPackageImpl#getLinkToLabel()
	 * @generated
	 */
	int LINK_TO_LABEL = 22;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TO_LABEL__UID = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TO_LABEL__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TO_LABEL__TARGET = 2;

	/**
	 * The number of structural features of the '<em>Link To Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TO_LABEL_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link form.impl.ChildrenHolderImpl <em>Children Holder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.impl.ChildrenHolderImpl
	 * @see form.impl.FormPackageImpl#getChildrenHolder()
	 * @generated
	 */
	int CHILDREN_HOLDER = 23;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILDREN_HOLDER__CHILDREN = 0;

	/**
	 * The number of structural features of the '<em>Children Holder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILDREN_HOLDER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link form.impl.ContextParameterImpl <em>Context Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.impl.ContextParameterImpl
	 * @see form.impl.FormPackageImpl#getContextParameter()
	 * @generated
	 */
	int CONTEXT_PARAMETER = 24;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_PARAMETER__UID = 0;

	/**
	 * The feature id for the '<em><b>Ref Obj</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_PARAMETER__REF_OBJ = 1;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_PARAMETER__OPERATION = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_PARAMETER__VALUE = 3;

	/**
	 * The number of structural features of the '<em>Context Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_PARAMETER_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link form.impl.ContextValueImpl <em>Context Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.impl.ContextValueImpl
	 * @see form.impl.FormPackageImpl#getContextValue()
	 * @generated
	 */
	int CONTEXT_VALUE = 25;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_VALUE__UID = 0;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_VALUE__CONSTANT = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_VALUE__VALUE = 2;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_VALUE__EXPRESSION = 3;

	/**
	 * The number of structural features of the '<em>Context Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_VALUE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link form.impl.ExpressionPartImpl <em>Expression Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.impl.ExpressionPartImpl
	 * @see form.impl.FormPackageImpl#getExpressionPart()
	 * @generated
	 */
	int EXPRESSION_PART = 26;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_PART__UID = 0;

	/**
	 * The feature id for the '<em><b>Obj Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_PART__OBJ_REF = 1;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_PART__ORDER = 2;

	/**
	 * The feature id for the '<em><b>Expression Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_PART__EXPRESSION_TYPE = 3;

	/**
	 * The number of structural features of the '<em>Expression Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_PART_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link form.impl.ContextParametersImpl <em>Context Parameters</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.impl.ContextParametersImpl
	 * @see form.impl.FormPackageImpl#getContextParameters()
	 * @generated
	 */
	int CONTEXT_PARAMETERS = 27;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_PARAMETERS__PARAMETERS = 0;

	/**
	 * The number of structural features of the '<em>Context Parameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_PARAMETERS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link form.impl.ContextImpl <em>Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.impl.ContextImpl
	 * @see form.impl.FormPackageImpl#getContext()
	 * @generated
	 */
	int CONTEXT = 28;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__UID = CONTEXT_VALUE__UID;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__CONSTANT = CONTEXT_VALUE__CONSTANT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__VALUE = CONTEXT_VALUE__VALUE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__EXPRESSION = CONTEXT_VALUE__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__PARAMETERS = CONTEXT_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_FEATURE_COUNT = CONTEXT_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link form.impl.StyleClassImpl <em>Style Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.impl.StyleClassImpl
	 * @see form.impl.FormPackageImpl#getStyleClass()
	 * @generated
	 */
	int STYLE_CLASS = 30;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_CLASS__UID = CONTEXT_VALUE__UID;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_CLASS__CONSTANT = CONTEXT_VALUE__CONSTANT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_CLASS__VALUE = CONTEXT_VALUE__VALUE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_CLASS__EXPRESSION = CONTEXT_VALUE__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Classifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_CLASS__CLASSIFIER = CONTEXT_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Style Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_CLASS_FEATURE_COUNT = CONTEXT_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link form.impl.NickNamedImpl <em>Nick Named</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.impl.NickNamedImpl
	 * @see form.impl.FormPackageImpl#getNickNamed()
	 * @generated
	 */
	int NICK_NAMED = 31;

	/**
	 * The feature id for the '<em><b>Nickname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NICK_NAMED__NICKNAME = 0;

	/**
	 * The number of structural features of the '<em>Nick Named</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NICK_NAMED_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link form.impl.FlexFieldsImpl <em>Flex Fields</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.impl.FlexFieldsImpl
	 * @see form.impl.FormPackageImpl#getFlexFields()
	 * @generated
	 */
	int FLEX_FIELDS = 32;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEX_FIELDS__FIELDS = 0;

	/**
	 * The number of structural features of the '<em>Flex Fields</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEX_FIELDS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link form.impl.FlexFieldImpl <em>Flex Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.impl.FlexFieldImpl
	 * @see form.impl.FormPackageImpl#getFlexField()
	 * @generated
	 */
	int FLEX_FIELD = 33;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEX_FIELD__UID = CONTEXT__UID;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEX_FIELD__CONSTANT = CONTEXT__CONSTANT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEX_FIELD__VALUE = CONTEXT__VALUE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEX_FIELD__EXPRESSION = CONTEXT__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEX_FIELD__PARAMETERS = CONTEXT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Classifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEX_FIELD__CLASSIFIERS = CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Flex Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEX_FIELD_FEATURE_COUNT = CONTEXT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link form.impl.EnabledUIItemImpl <em>Enabled UI Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.impl.EnabledUIItemImpl
	 * @see form.impl.FormPackageImpl#getEnabledUIItem()
	 * @generated
	 */
	int ENABLED_UI_ITEM = 34;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLED_UI_ITEM__ENABLED = 0;

	/**
	 * The number of structural features of the '<em>Enabled UI Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLED_UI_ITEM_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link form.impl.UielementImpl <em>Uielement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.impl.UielementImpl
	 * @see form.impl.FormPackageImpl#getUielement()
	 * @generated
	 */
	int UIELEMENT = 35;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UIELEMENT__STYLE = STYLE_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UIELEMENT__STYLE_CLASS = STYLE_ELEMENT__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Nickname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UIELEMENT__NICKNAME = STYLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Classifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UIELEMENT__CLASSIFIERS = STYLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UIELEMENT__ORDER = STYLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UIELEMENT__ENABLED = STYLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UIELEMENT__FIELDS = STYLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Menu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UIELEMENT__MENU = STYLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UIELEMENT__UID = STYLE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Required</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UIELEMENT__REQUIRED = STYLE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UIELEMENT__READ_ONLY = STYLE_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Refresh Areas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UIELEMENT__REFRESH_AREAS = STYLE_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Uielement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UIELEMENT_FEATURE_COUNT = STYLE_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link form.impl.ItemIconImpl <em>Item Icon</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.impl.ItemIconImpl
	 * @see form.impl.FormPackageImpl#getItemIcon()
	 * @generated
	 */
	int ITEM_ICON = 36;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_ICON__ICON = 0;

	/**
	 * The number of structural features of the '<em>Item Icon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_ICON_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link form.impl.AreaRefImpl <em>Area Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.impl.AreaRefImpl
	 * @see form.impl.FormPackageImpl#getAreaRef()
	 * @generated
	 */
	int AREA_REF = 37;

	/**
	 * The feature id for the '<em><b>Area</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_REF__AREA = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_REF__GROUP = 1;

	/**
	 * The number of structural features of the '<em>Area Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_REF_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link form.impl.FormatableImpl <em>Formatable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.impl.FormatableImpl
	 * @see form.impl.FormPackageImpl#getFormatable()
	 * @generated
	 */
	int FORMATABLE = 38;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATABLE__FORMAT = 0;

	/**
	 * The number of structural features of the '<em>Formatable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATABLE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link form.impl.SourcesPointerImpl <em>Sources Pointer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.impl.SourcesPointerImpl
	 * @see form.impl.FormPackageImpl#getSourcesPointer()
	 * @generated
	 */
	int SOURCES_POINTER = 39;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCES_POINTER__STYLE = UIELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCES_POINTER__STYLE_CLASS = UIELEMENT__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Nickname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCES_POINTER__NICKNAME = UIELEMENT__NICKNAME;

	/**
	 * The feature id for the '<em><b>Classifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCES_POINTER__CLASSIFIERS = UIELEMENT__CLASSIFIERS;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCES_POINTER__ORDER = UIELEMENT__ORDER;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCES_POINTER__ENABLED = UIELEMENT__ENABLED;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCES_POINTER__FIELDS = UIELEMENT__FIELDS;

	/**
	 * The feature id for the '<em><b>Menu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCES_POINTER__MENU = UIELEMENT__MENU;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCES_POINTER__UID = UIELEMENT__UID;

	/**
	 * The feature id for the '<em><b>Required</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCES_POINTER__REQUIRED = UIELEMENT__REQUIRED;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCES_POINTER__READ_ONLY = UIELEMENT__READ_ONLY;

	/**
	 * The feature id for the '<em><b>Refresh Areas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCES_POINTER__REFRESH_AREAS = UIELEMENT__REFRESH_AREAS;

	/**
	 * The feature id for the '<em><b>Source Pointer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCES_POINTER__SOURCE_POINTER = UIELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value Pointer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCES_POINTER__VALUE_POINTER = UIELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source Cast</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCES_POINTER__SOURCE_CAST = UIELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source Cast Data Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCES_POINTER__SOURCE_CAST_DATA_CONTROL = UIELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Sources Pointer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCES_POINTER_FEATURE_COUNT = UIELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link form.impl.InputElementImpl <em>Input Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.impl.InputElementImpl
	 * @see form.impl.FormPackageImpl#getInputElement()
	 * @generated
	 */
	int INPUT_ELEMENT = 40;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ELEMENT__STYLE = SOURCES_POINTER__STYLE;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ELEMENT__STYLE_CLASS = SOURCES_POINTER__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Nickname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ELEMENT__NICKNAME = SOURCES_POINTER__NICKNAME;

	/**
	 * The feature id for the '<em><b>Classifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ELEMENT__CLASSIFIERS = SOURCES_POINTER__CLASSIFIERS;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ELEMENT__ORDER = SOURCES_POINTER__ORDER;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ELEMENT__ENABLED = SOURCES_POINTER__ENABLED;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ELEMENT__FIELDS = SOURCES_POINTER__FIELDS;

	/**
	 * The feature id for the '<em><b>Menu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ELEMENT__MENU = SOURCES_POINTER__MENU;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ELEMENT__UID = SOURCES_POINTER__UID;

	/**
	 * The feature id for the '<em><b>Required</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ELEMENT__REQUIRED = SOURCES_POINTER__REQUIRED;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ELEMENT__READ_ONLY = SOURCES_POINTER__READ_ONLY;

	/**
	 * The feature id for the '<em><b>Refresh Areas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ELEMENT__REFRESH_AREAS = SOURCES_POINTER__REFRESH_AREAS;

	/**
	 * The feature id for the '<em><b>Source Pointer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ELEMENT__SOURCE_POINTER = SOURCES_POINTER__SOURCE_POINTER;

	/**
	 * The feature id for the '<em><b>Value Pointer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ELEMENT__VALUE_POINTER = SOURCES_POINTER__VALUE_POINTER;

	/**
	 * The feature id for the '<em><b>Source Cast</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ELEMENT__SOURCE_CAST = SOURCES_POINTER__SOURCE_CAST;

	/**
	 * The feature id for the '<em><b>Source Cast Data Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ELEMENT__SOURCE_CAST_DATA_CONTROL = SOURCES_POINTER__SOURCE_CAST_DATA_CONTROL;

	/**
	 * The number of structural features of the '<em>Input Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ELEMENT_FEATURE_COUNT = SOURCES_POINTER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link form.impl.SelectionImpl <em>Selection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.impl.SelectionImpl
	 * @see form.impl.FormPackageImpl#getSelection()
	 * @generated
	 */
	int SELECTION = 41;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION__STYLE = STYLE_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION__STYLE_CLASS = STYLE_ELEMENT__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Display Option Pointer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION__DISPLAY_OPTION_POINTER = STYLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value Option Pointer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION__VALUE_OPTION_POINTER = STYLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Selection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FEATURE_COUNT = STYLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link form.impl.OptionSelectionImpl <em>Option Selection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.impl.OptionSelectionImpl
	 * @see form.impl.FormPackageImpl#getOptionSelection()
	 * @generated
	 */
	int OPTION_SELECTION = 42;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_SELECTION__STYLE = INPUT_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_SELECTION__STYLE_CLASS = INPUT_ELEMENT__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Nickname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_SELECTION__NICKNAME = INPUT_ELEMENT__NICKNAME;

	/**
	 * The feature id for the '<em><b>Classifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_SELECTION__CLASSIFIERS = INPUT_ELEMENT__CLASSIFIERS;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_SELECTION__ORDER = INPUT_ELEMENT__ORDER;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_SELECTION__ENABLED = INPUT_ELEMENT__ENABLED;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_SELECTION__FIELDS = INPUT_ELEMENT__FIELDS;

	/**
	 * The feature id for the '<em><b>Menu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_SELECTION__MENU = INPUT_ELEMENT__MENU;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_SELECTION__UID = INPUT_ELEMENT__UID;

	/**
	 * The feature id for the '<em><b>Required</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_SELECTION__REQUIRED = INPUT_ELEMENT__REQUIRED;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_SELECTION__READ_ONLY = INPUT_ELEMENT__READ_ONLY;

	/**
	 * The feature id for the '<em><b>Refresh Areas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_SELECTION__REFRESH_AREAS = INPUT_ELEMENT__REFRESH_AREAS;

	/**
	 * The feature id for the '<em><b>Source Pointer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_SELECTION__SOURCE_POINTER = INPUT_ELEMENT__SOURCE_POINTER;

	/**
	 * The feature id for the '<em><b>Value Pointer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_SELECTION__VALUE_POINTER = INPUT_ELEMENT__VALUE_POINTER;

	/**
	 * The feature id for the '<em><b>Source Cast</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_SELECTION__SOURCE_CAST = INPUT_ELEMENT__SOURCE_CAST;

	/**
	 * The feature id for the '<em><b>Source Cast Data Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_SELECTION__SOURCE_CAST_DATA_CONTROL = INPUT_ELEMENT__SOURCE_CAST_DATA_CONTROL;

	/**
	 * The feature id for the '<em><b>Option Pointer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_SELECTION__OPTION_POINTER = INPUT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Option Cast</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_SELECTION__OPTION_CAST = INPUT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Option Cast Data Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_SELECTION__OPTION_CAST_DATA_CONTROL = INPUT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Option Selection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_SELECTION_FEATURE_COUNT = INPUT_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link form.impl.LayerHolderImpl <em>Layer Holder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.impl.LayerHolderImpl
	 * @see form.impl.FormPackageImpl#getLayerHolder()
	 * @generated
	 */
	int LAYER_HOLDER = 43;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_HOLDER__STYLE = UIELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_HOLDER__STYLE_CLASS = UIELEMENT__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Nickname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_HOLDER__NICKNAME = UIELEMENT__NICKNAME;

	/**
	 * The feature id for the '<em><b>Classifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_HOLDER__CLASSIFIERS = UIELEMENT__CLASSIFIERS;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_HOLDER__ORDER = UIELEMENT__ORDER;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_HOLDER__ENABLED = UIELEMENT__ENABLED;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_HOLDER__FIELDS = UIELEMENT__FIELDS;

	/**
	 * The feature id for the '<em><b>Menu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_HOLDER__MENU = UIELEMENT__MENU;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_HOLDER__UID = UIELEMENT__UID;

	/**
	 * The feature id for the '<em><b>Required</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_HOLDER__REQUIRED = UIELEMENT__REQUIRED;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_HOLDER__READ_ONLY = UIELEMENT__READ_ONLY;

	/**
	 * The feature id for the '<em><b>Refresh Areas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_HOLDER__REFRESH_AREAS = UIELEMENT__REFRESH_AREAS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_HOLDER__CHILDREN = UIELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_HOLDER__COLUMNS = UIELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Layer Holder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_HOLDER_FEATURE_COUNT = UIELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link form.impl.InputTextImpl <em>Input Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.impl.InputTextImpl
	 * @see form.impl.FormPackageImpl#getInputText()
	 * @generated
	 */
	int INPUT_TEXT = 44;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_TEXT__STYLE = INPUT_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_TEXT__STYLE_CLASS = INPUT_ELEMENT__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Nickname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_TEXT__NICKNAME = INPUT_ELEMENT__NICKNAME;

	/**
	 * The feature id for the '<em><b>Classifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_TEXT__CLASSIFIERS = INPUT_ELEMENT__CLASSIFIERS;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_TEXT__ORDER = INPUT_ELEMENT__ORDER;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_TEXT__ENABLED = INPUT_ELEMENT__ENABLED;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_TEXT__FIELDS = INPUT_ELEMENT__FIELDS;

	/**
	 * The feature id for the '<em><b>Menu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_TEXT__MENU = INPUT_ELEMENT__MENU;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_TEXT__UID = INPUT_ELEMENT__UID;

	/**
	 * The feature id for the '<em><b>Required</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_TEXT__REQUIRED = INPUT_ELEMENT__REQUIRED;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_TEXT__READ_ONLY = INPUT_ELEMENT__READ_ONLY;

	/**
	 * The feature id for the '<em><b>Refresh Areas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_TEXT__REFRESH_AREAS = INPUT_ELEMENT__REFRESH_AREAS;

	/**
	 * The feature id for the '<em><b>Source Pointer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_TEXT__SOURCE_POINTER = INPUT_ELEMENT__SOURCE_POINTER;

	/**
	 * The feature id for the '<em><b>Value Pointer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_TEXT__VALUE_POINTER = INPUT_ELEMENT__VALUE_POINTER;

	/**
	 * The feature id for the '<em><b>Source Cast</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_TEXT__SOURCE_CAST = INPUT_ELEMENT__SOURCE_CAST;

	/**
	 * The feature id for the '<em><b>Source Cast Data Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_TEXT__SOURCE_CAST_DATA_CONTROL = INPUT_ELEMENT__SOURCE_CAST_DATA_CONTROL;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_TEXT__FORMAT = INPUT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Input Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_TEXT_FEATURE_COUNT = INPUT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link form.impl.PasswordImpl <em>Password</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.impl.PasswordImpl
	 * @see form.impl.FormPackageImpl#getPassword()
	 * @generated
	 */
	int PASSWORD = 45;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD__STYLE = INPUT_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD__STYLE_CLASS = INPUT_ELEMENT__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Nickname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD__NICKNAME = INPUT_ELEMENT__NICKNAME;

	/**
	 * The feature id for the '<em><b>Classifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD__CLASSIFIERS = INPUT_ELEMENT__CLASSIFIERS;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD__ORDER = INPUT_ELEMENT__ORDER;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD__ENABLED = INPUT_ELEMENT__ENABLED;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD__FIELDS = INPUT_ELEMENT__FIELDS;

	/**
	 * The feature id for the '<em><b>Menu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD__MENU = INPUT_ELEMENT__MENU;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD__UID = INPUT_ELEMENT__UID;

	/**
	 * The feature id for the '<em><b>Required</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD__REQUIRED = INPUT_ELEMENT__REQUIRED;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD__READ_ONLY = INPUT_ELEMENT__READ_ONLY;

	/**
	 * The feature id for the '<em><b>Refresh Areas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD__REFRESH_AREAS = INPUT_ELEMENT__REFRESH_AREAS;

	/**
	 * The feature id for the '<em><b>Source Pointer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD__SOURCE_POINTER = INPUT_ELEMENT__SOURCE_POINTER;

	/**
	 * The feature id for the '<em><b>Value Pointer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD__VALUE_POINTER = INPUT_ELEMENT__VALUE_POINTER;

	/**
	 * The feature id for the '<em><b>Source Cast</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD__SOURCE_CAST = INPUT_ELEMENT__SOURCE_CAST;

	/**
	 * The feature id for the '<em><b>Source Cast Data Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD__SOURCE_CAST_DATA_CONTROL = INPUT_ELEMENT__SOURCE_CAST_DATA_CONTROL;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD__FORMAT = INPUT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Password</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD_FEATURE_COUNT = INPUT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link form.impl.LabelImpl <em>Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.impl.LabelImpl
	 * @see form.impl.FormPackageImpl#getLabel()
	 * @generated
	 */
	int LABEL = 46;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__STYLE = UIELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__STYLE_CLASS = UIELEMENT__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Nickname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__NICKNAME = UIELEMENT__NICKNAME;

	/**
	 * The feature id for the '<em><b>Classifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__CLASSIFIERS = UIELEMENT__CLASSIFIERS;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__ORDER = UIELEMENT__ORDER;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__ENABLED = UIELEMENT__ENABLED;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__FIELDS = UIELEMENT__FIELDS;

	/**
	 * The feature id for the '<em><b>Menu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__MENU = UIELEMENT__MENU;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__UID = UIELEMENT__UID;

	/**
	 * The feature id for the '<em><b>Required</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__REQUIRED = UIELEMENT__REQUIRED;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__READ_ONLY = UIELEMENT__READ_ONLY;

	/**
	 * The feature id for the '<em><b>Refresh Areas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__REFRESH_AREAS = UIELEMENT__REFRESH_AREAS;

	/**
	 * The feature id for the '<em><b>Multi Lang Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__MULTI_LANG_LABEL = UIELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__LABEL = UIELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_FEATURE_COUNT = UIELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link form.impl.MessageElementImpl <em>Message Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.impl.MessageElementImpl
	 * @see form.impl.FormPackageImpl#getMessageElement()
	 * @generated
	 */
	int MESSAGE_ELEMENT = 47;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ELEMENT__STYLE = UIELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ELEMENT__STYLE_CLASS = UIELEMENT__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Nickname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ELEMENT__NICKNAME = UIELEMENT__NICKNAME;

	/**
	 * The feature id for the '<em><b>Classifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ELEMENT__CLASSIFIERS = UIELEMENT__CLASSIFIERS;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ELEMENT__ORDER = UIELEMENT__ORDER;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ELEMENT__ENABLED = UIELEMENT__ENABLED;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ELEMENT__FIELDS = UIELEMENT__FIELDS;

	/**
	 * The feature id for the '<em><b>Menu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ELEMENT__MENU = UIELEMENT__MENU;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ELEMENT__UID = UIELEMENT__UID;

	/**
	 * The feature id for the '<em><b>Required</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ELEMENT__REQUIRED = UIELEMENT__REQUIRED;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ELEMENT__READ_ONLY = UIELEMENT__READ_ONLY;

	/**
	 * The feature id for the '<em><b>Refresh Areas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ELEMENT__REFRESH_AREAS = UIELEMENT__REFRESH_AREAS;

	/**
	 * The feature id for the '<em><b>Multi Lang Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ELEMENT__MULTI_LANG_LABEL = UIELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ELEMENT__LABEL = UIELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Message Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ELEMENT_FEATURE_COUNT = UIELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link form.impl.OutputTextImpl <em>Output Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.impl.OutputTextImpl
	 * @see form.impl.FormPackageImpl#getOutputText()
	 * @generated
	 */
	int OUTPUT_TEXT = 48;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_TEXT__STYLE = INPUT_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_TEXT__STYLE_CLASS = INPUT_ELEMENT__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Nickname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_TEXT__NICKNAME = INPUT_ELEMENT__NICKNAME;

	/**
	 * The feature id for the '<em><b>Classifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_TEXT__CLASSIFIERS = INPUT_ELEMENT__CLASSIFIERS;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_TEXT__ORDER = INPUT_ELEMENT__ORDER;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_TEXT__ENABLED = INPUT_ELEMENT__ENABLED;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_TEXT__FIELDS = INPUT_ELEMENT__FIELDS;

	/**
	 * The feature id for the '<em><b>Menu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_TEXT__MENU = INPUT_ELEMENT__MENU;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_TEXT__UID = INPUT_ELEMENT__UID;

	/**
	 * The feature id for the '<em><b>Required</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_TEXT__REQUIRED = INPUT_ELEMENT__REQUIRED;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_TEXT__READ_ONLY = INPUT_ELEMENT__READ_ONLY;

	/**
	 * The feature id for the '<em><b>Refresh Areas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_TEXT__REFRESH_AREAS = INPUT_ELEMENT__REFRESH_AREAS;

	/**
	 * The feature id for the '<em><b>Source Pointer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_TEXT__SOURCE_POINTER = INPUT_ELEMENT__SOURCE_POINTER;

	/**
	 * The feature id for the '<em><b>Value Pointer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_TEXT__VALUE_POINTER = INPUT_ELEMENT__VALUE_POINTER;

	/**
	 * The feature id for the '<em><b>Source Cast</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_TEXT__SOURCE_CAST = INPUT_ELEMENT__SOURCE_CAST;

	/**
	 * The feature id for the '<em><b>Source Cast Data Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_TEXT__SOURCE_CAST_DATA_CONTROL = INPUT_ELEMENT__SOURCE_CAST_DATA_CONTROL;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_TEXT__FORMAT = INPUT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Output Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_TEXT_FEATURE_COUNT = INPUT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link form.impl.CheckBoxImpl <em>Check Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.impl.CheckBoxImpl
	 * @see form.impl.FormPackageImpl#getCheckBox()
	 * @generated
	 */
	int CHECK_BOX = 49;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__STYLE = INPUT_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__STYLE_CLASS = INPUT_ELEMENT__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Nickname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__NICKNAME = INPUT_ELEMENT__NICKNAME;

	/**
	 * The feature id for the '<em><b>Classifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__CLASSIFIERS = INPUT_ELEMENT__CLASSIFIERS;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__ORDER = INPUT_ELEMENT__ORDER;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__ENABLED = INPUT_ELEMENT__ENABLED;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__FIELDS = INPUT_ELEMENT__FIELDS;

	/**
	 * The feature id for the '<em><b>Menu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__MENU = INPUT_ELEMENT__MENU;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__UID = INPUT_ELEMENT__UID;

	/**
	 * The feature id for the '<em><b>Required</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__REQUIRED = INPUT_ELEMENT__REQUIRED;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__READ_ONLY = INPUT_ELEMENT__READ_ONLY;

	/**
	 * The feature id for the '<em><b>Refresh Areas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__REFRESH_AREAS = INPUT_ELEMENT__REFRESH_AREAS;

	/**
	 * The feature id for the '<em><b>Source Pointer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__SOURCE_POINTER = INPUT_ELEMENT__SOURCE_POINTER;

	/**
	 * The feature id for the '<em><b>Value Pointer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__VALUE_POINTER = INPUT_ELEMENT__VALUE_POINTER;

	/**
	 * The feature id for the '<em><b>Source Cast</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__SOURCE_CAST = INPUT_ELEMENT__SOURCE_CAST;

	/**
	 * The feature id for the '<em><b>Source Cast Data Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__SOURCE_CAST_DATA_CONTROL = INPUT_ELEMENT__SOURCE_CAST_DATA_CONTROL;

	/**
	 * The number of structural features of the '<em>Check Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX_FEATURE_COUNT = INPUT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link form.impl.DropDownSelectionImpl <em>Drop Down Selection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.impl.DropDownSelectionImpl
	 * @see form.impl.FormPackageImpl#getDropDownSelection()
	 * @generated
	 */
	int DROP_DOWN_SELECTION = 50;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_DOWN_SELECTION__STYLE = OPTION_SELECTION__STYLE;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_DOWN_SELECTION__STYLE_CLASS = OPTION_SELECTION__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Nickname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_DOWN_SELECTION__NICKNAME = OPTION_SELECTION__NICKNAME;

	/**
	 * The feature id for the '<em><b>Classifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_DOWN_SELECTION__CLASSIFIERS = OPTION_SELECTION__CLASSIFIERS;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_DOWN_SELECTION__ORDER = OPTION_SELECTION__ORDER;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_DOWN_SELECTION__ENABLED = OPTION_SELECTION__ENABLED;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_DOWN_SELECTION__FIELDS = OPTION_SELECTION__FIELDS;

	/**
	 * The feature id for the '<em><b>Menu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_DOWN_SELECTION__MENU = OPTION_SELECTION__MENU;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_DOWN_SELECTION__UID = OPTION_SELECTION__UID;

	/**
	 * The feature id for the '<em><b>Required</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_DOWN_SELECTION__REQUIRED = OPTION_SELECTION__REQUIRED;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_DOWN_SELECTION__READ_ONLY = OPTION_SELECTION__READ_ONLY;

	/**
	 * The feature id for the '<em><b>Refresh Areas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_DOWN_SELECTION__REFRESH_AREAS = OPTION_SELECTION__REFRESH_AREAS;

	/**
	 * The feature id for the '<em><b>Source Pointer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_DOWN_SELECTION__SOURCE_POINTER = OPTION_SELECTION__SOURCE_POINTER;

	/**
	 * The feature id for the '<em><b>Value Pointer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_DOWN_SELECTION__VALUE_POINTER = OPTION_SELECTION__VALUE_POINTER;

	/**
	 * The feature id for the '<em><b>Source Cast</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_DOWN_SELECTION__SOURCE_CAST = OPTION_SELECTION__SOURCE_CAST;

	/**
	 * The feature id for the '<em><b>Source Cast Data Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_DOWN_SELECTION__SOURCE_CAST_DATA_CONTROL = OPTION_SELECTION__SOURCE_CAST_DATA_CONTROL;

	/**
	 * The feature id for the '<em><b>Option Pointer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_DOWN_SELECTION__OPTION_POINTER = OPTION_SELECTION__OPTION_POINTER;

	/**
	 * The feature id for the '<em><b>Option Cast</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_DOWN_SELECTION__OPTION_CAST = OPTION_SELECTION__OPTION_CAST;

	/**
	 * The feature id for the '<em><b>Option Cast Data Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_DOWN_SELECTION__OPTION_CAST_DATA_CONTROL = OPTION_SELECTION__OPTION_CAST_DATA_CONTROL;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_DOWN_SELECTION__SELECTION = OPTION_SELECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Initial Option Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_DOWN_SELECTION__INITIAL_OPTION_MESSAGE = OPTION_SELECTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Initial Option Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_DOWN_SELECTION__INITIAL_OPTION_VALUE = OPTION_SELECTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Drop Down Selection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_DOWN_SELECTION_FEATURE_COUNT = OPTION_SELECTION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link form.impl.ImageImpl <em>Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.impl.ImageImpl
	 * @see form.impl.FormPackageImpl#getImage()
	 * @generated
	 */
	int IMAGE = 51;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__STYLE = INPUT_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__STYLE_CLASS = INPUT_ELEMENT__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Nickname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__NICKNAME = INPUT_ELEMENT__NICKNAME;

	/**
	 * The feature id for the '<em><b>Classifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__CLASSIFIERS = INPUT_ELEMENT__CLASSIFIERS;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__ORDER = INPUT_ELEMENT__ORDER;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__ENABLED = INPUT_ELEMENT__ENABLED;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__FIELDS = INPUT_ELEMENT__FIELDS;

	/**
	 * The feature id for the '<em><b>Menu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__MENU = INPUT_ELEMENT__MENU;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__UID = INPUT_ELEMENT__UID;

	/**
	 * The feature id for the '<em><b>Required</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__REQUIRED = INPUT_ELEMENT__REQUIRED;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__READ_ONLY = INPUT_ELEMENT__READ_ONLY;

	/**
	 * The feature id for the '<em><b>Refresh Areas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__REFRESH_AREAS = INPUT_ELEMENT__REFRESH_AREAS;

	/**
	 * The feature id for the '<em><b>Source Pointer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__SOURCE_POINTER = INPUT_ELEMENT__SOURCE_POINTER;

	/**
	 * The feature id for the '<em><b>Value Pointer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__VALUE_POINTER = INPUT_ELEMENT__VALUE_POINTER;

	/**
	 * The feature id for the '<em><b>Source Cast</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__SOURCE_CAST = INPUT_ELEMENT__SOURCE_CAST;

	/**
	 * The feature id for the '<em><b>Source Cast Data Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__SOURCE_CAST_DATA_CONTROL = INPUT_ELEMENT__SOURCE_CAST_DATA_CONTROL;

	/**
	 * The number of structural features of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FEATURE_COUNT = INPUT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link form.impl.DateImpl <em>Date</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.impl.DateImpl
	 * @see form.impl.FormPackageImpl#getDate()
	 * @generated
	 */
	int DATE = 52;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__STYLE = INPUT_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__STYLE_CLASS = INPUT_ELEMENT__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Nickname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__NICKNAME = INPUT_ELEMENT__NICKNAME;

	/**
	 * The feature id for the '<em><b>Classifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__CLASSIFIERS = INPUT_ELEMENT__CLASSIFIERS;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__ORDER = INPUT_ELEMENT__ORDER;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__ENABLED = INPUT_ELEMENT__ENABLED;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__FIELDS = INPUT_ELEMENT__FIELDS;

	/**
	 * The feature id for the '<em><b>Menu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__MENU = INPUT_ELEMENT__MENU;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__UID = INPUT_ELEMENT__UID;

	/**
	 * The feature id for the '<em><b>Required</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__REQUIRED = INPUT_ELEMENT__REQUIRED;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__READ_ONLY = INPUT_ELEMENT__READ_ONLY;

	/**
	 * The feature id for the '<em><b>Refresh Areas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__REFRESH_AREAS = INPUT_ELEMENT__REFRESH_AREAS;

	/**
	 * The feature id for the '<em><b>Source Pointer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__SOURCE_POINTER = INPUT_ELEMENT__SOURCE_POINTER;

	/**
	 * The feature id for the '<em><b>Value Pointer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__VALUE_POINTER = INPUT_ELEMENT__VALUE_POINTER;

	/**
	 * The feature id for the '<em><b>Source Cast</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__SOURCE_CAST = INPUT_ELEMENT__SOURCE_CAST;

	/**
	 * The feature id for the '<em><b>Source Cast Data Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__SOURCE_CAST_DATA_CONTROL = INPUT_ELEMENT__SOURCE_CAST_DATA_CONTROL;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__FORMAT = INPUT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FEATURE_COUNT = INPUT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link form.impl.ButtonImpl <em>Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.impl.ButtonImpl
	 * @see form.impl.FormPackageImpl#getButton()
	 * @generated
	 */
	int BUTTON = 53;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__STYLE = UIELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__STYLE_CLASS = UIELEMENT__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Nickname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__NICKNAME = UIELEMENT__NICKNAME;

	/**
	 * The feature id for the '<em><b>Classifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__CLASSIFIERS = UIELEMENT__CLASSIFIERS;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__ORDER = UIELEMENT__ORDER;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__ENABLED = UIELEMENT__ENABLED;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__FIELDS = UIELEMENT__FIELDS;

	/**
	 * The feature id for the '<em><b>Menu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__MENU = UIELEMENT__MENU;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__UID = UIELEMENT__UID;

	/**
	 * The feature id for the '<em><b>Required</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__REQUIRED = UIELEMENT__REQUIRED;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__READ_ONLY = UIELEMENT__READ_ONLY;

	/**
	 * The feature id for the '<em><b>Refresh Areas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__REFRESH_AREAS = UIELEMENT__REFRESH_AREAS;

	/**
	 * The feature id for the '<em><b>Multi Lang Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__MULTI_LANG_LABEL = UIELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__ICON = UIELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__LABEL = UIELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_FEATURE_COUNT = UIELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link form.impl.ColumnImpl <em>Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.impl.ColumnImpl
	 * @see form.impl.FormPackageImpl#getColumn()
	 * @generated
	 */
	int COLUMN = 54;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__STYLE = STYLE_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__STYLE_CLASS = STYLE_ELEMENT__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Multi Lang Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__MULTI_LANG_LABEL = STYLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Classifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__CLASSIFIERS = STYLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__COLUMNS = STYLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__ORDER = STYLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__UID = STYLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__LABEL = STYLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__ELEMENT = STYLE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_FEATURE_COUNT = STYLE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link form.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.impl.TableImpl
	 * @see form.impl.FormPackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 55;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__STYLE = SOURCES_POINTER__STYLE;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__STYLE_CLASS = SOURCES_POINTER__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Nickname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__NICKNAME = SOURCES_POINTER__NICKNAME;

	/**
	 * The feature id for the '<em><b>Classifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__CLASSIFIERS = SOURCES_POINTER__CLASSIFIERS;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__ORDER = SOURCES_POINTER__ORDER;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__ENABLED = SOURCES_POINTER__ENABLED;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__FIELDS = SOURCES_POINTER__FIELDS;

	/**
	 * The feature id for the '<em><b>Menu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__MENU = SOURCES_POINTER__MENU;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__UID = SOURCES_POINTER__UID;

	/**
	 * The feature id for the '<em><b>Required</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__REQUIRED = SOURCES_POINTER__REQUIRED;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__READ_ONLY = SOURCES_POINTER__READ_ONLY;

	/**
	 * The feature id for the '<em><b>Refresh Areas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__REFRESH_AREAS = SOURCES_POINTER__REFRESH_AREAS;

	/**
	 * The feature id for the '<em><b>Source Pointer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__SOURCE_POINTER = SOURCES_POINTER__SOURCE_POINTER;

	/**
	 * The feature id for the '<em><b>Value Pointer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__VALUE_POINTER = SOURCES_POINTER__VALUE_POINTER;

	/**
	 * The feature id for the '<em><b>Source Cast</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__SOURCE_CAST = SOURCES_POINTER__SOURCE_CAST;

	/**
	 * The feature id for the '<em><b>Source Cast Data Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__SOURCE_CAST_DATA_CONTROL = SOURCES_POINTER__SOURCE_CAST_DATA_CONTROL;

	/**
	 * The feature id for the '<em><b>Multi Lang Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__MULTI_LANG_LABEL = SOURCES_POINTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__LABEL = SOURCES_POINTER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Row Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__ROW_NUMBER = SOURCES_POINTER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Cols</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__COLS = SOURCES_POINTER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = SOURCES_POINTER_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link form.impl.MenuImpl <em>Menu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.impl.MenuImpl
	 * @see form.impl.FormPackageImpl#getMenu()
	 * @generated
	 */
	int MENU = 56;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__STYLE = UIELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__STYLE_CLASS = UIELEMENT__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Nickname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__NICKNAME = UIELEMENT__NICKNAME;

	/**
	 * The feature id for the '<em><b>Classifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__CLASSIFIERS = UIELEMENT__CLASSIFIERS;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__ORDER = UIELEMENT__ORDER;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__ENABLED = UIELEMENT__ENABLED;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__FIELDS = UIELEMENT__FIELDS;

	/**
	 * The feature id for the '<em><b>Menu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__MENU = UIELEMENT__MENU;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__UID = UIELEMENT__UID;

	/**
	 * The feature id for the '<em><b>Required</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__REQUIRED = UIELEMENT__REQUIRED;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__READ_ONLY = UIELEMENT__READ_ONLY;

	/**
	 * The feature id for the '<em><b>Refresh Areas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__REFRESH_AREAS = UIELEMENT__REFRESH_AREAS;

	/**
	 * The number of structural features of the '<em>Menu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_FEATURE_COUNT = UIELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link form.impl.MenuViewImpl <em>Menu View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.impl.MenuViewImpl
	 * @see form.impl.FormPackageImpl#getMenuView()
	 * @generated
	 */
	int MENU_VIEW = 57;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_VIEW__UID = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_VIEW__PARENT = 1;

	/**
	 * The feature id for the '<em><b>Menu Folders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_VIEW__MENU_FOLDERS = 2;

	/**
	 * The number of structural features of the '<em>Menu View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_VIEW_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link form.impl.MenuHolderImpl <em>Menu Holder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.impl.MenuHolderImpl
	 * @see form.impl.FormPackageImpl#getMenuHolder()
	 * @generated
	 */
	int MENU_HOLDER = 58;

	/**
	 * The feature id for the '<em><b>Menu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_HOLDER__MENU = 0;

	/**
	 * The number of structural features of the '<em>Menu Holder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_HOLDER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link form.impl.MenuExtensionRefImpl <em>Menu Extension Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.impl.MenuExtensionRefImpl
	 * @see form.impl.FormPackageImpl#getMenuExtensionRef()
	 * @generated
	 */
	int MENU_EXTENSION_REF = 59;

	/**
	 * The feature id for the '<em><b>Extension Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_EXTENSION_REF__EXTENSION_REF = 0;

	/**
	 * The number of structural features of the '<em>Menu Extension Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_EXTENSION_REF_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link form.impl.MenuElementImpl <em>Menu Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.impl.MenuElementImpl
	 * @see form.impl.FormPackageImpl#getMenuElement()
	 * @generated
	 */
	int MENU_ELEMENT = 60;

	/**
	 * The feature id for the '<em><b>Multi Lang Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ELEMENT__MULTI_LANG_LABEL = MULTI_LANG_LABEL__MULTI_LANG_LABEL;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ELEMENT__STYLE = MULTI_LANG_LABEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ELEMENT__STYLE_CLASS = MULTI_LANG_LABEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Classifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ELEMENT__CLASSIFIERS = MULTI_LANG_LABEL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ELEMENT__ENABLED = MULTI_LANG_LABEL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ELEMENT__ORDER = MULTI_LANG_LABEL_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ELEMENT__UID = MULTI_LANG_LABEL_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ELEMENT__NAME = MULTI_LANG_LABEL_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Menu Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ELEMENT_FEATURE_COUNT = MULTI_LANG_LABEL_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link form.impl.MenuFolderImpl <em>Menu Folder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.impl.MenuFolderImpl
	 * @see form.impl.FormPackageImpl#getMenuFolder()
	 * @generated
	 */
	int MENU_FOLDER = 61;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_FOLDER__COLUMNS = HTML_LAYER_HOLDER__COLUMNS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_FOLDER__ENABLED = HTML_LAYER_HOLDER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Classifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_FOLDER__CLASSIFIERS = HTML_LAYER_HOLDER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_FOLDER__STYLE = HTML_LAYER_HOLDER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_FOLDER__STYLE_CLASS = HTML_LAYER_HOLDER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Multi Lang Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_FOLDER__MULTI_LANG_LABEL = HTML_LAYER_HOLDER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_FOLDER__ICON = HTML_LAYER_HOLDER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_FOLDER__UID = HTML_LAYER_HOLDER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_FOLDER__NAME = HTML_LAYER_HOLDER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Extension Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_FOLDER__EXTENSION_POINT = HTML_LAYER_HOLDER_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Menu Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_FOLDER__MENU_ELEMENTS = HTML_LAYER_HOLDER_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Menu Folder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_FOLDER_FEATURE_COUNT = HTML_LAYER_HOLDER_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link form.impl.MenuItemImpl <em>Menu Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.impl.MenuItemImpl
	 * @see form.impl.FormPackageImpl#getMenuItem()
	 * @generated
	 */
	int MENU_ITEM = 62;

	/**
	 * The feature id for the '<em><b>Multi Lang Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ITEM__MULTI_LANG_LABEL = MENU_ELEMENT__MULTI_LANG_LABEL;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ITEM__STYLE = MENU_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ITEM__STYLE_CLASS = MENU_ELEMENT__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Classifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ITEM__CLASSIFIERS = MENU_ELEMENT__CLASSIFIERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ITEM__ENABLED = MENU_ELEMENT__ENABLED;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ITEM__ORDER = MENU_ELEMENT__ORDER;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ITEM__UID = MENU_ELEMENT__UID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ITEM__NAME = MENU_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ITEM__ICON = MENU_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ITEM__FIELDS = MENU_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ITEM__TRANSITION = MENU_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Refresh Areas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ITEM__REFRESH_AREAS = MENU_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Menu Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ITEM_FEATURE_COUNT = MENU_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link form.impl.MenuExtensionPointImpl <em>Menu Extension Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.impl.MenuExtensionPointImpl
	 * @see form.impl.FormPackageImpl#getMenuExtensionPoint()
	 * @generated
	 */
	int MENU_EXTENSION_POINT = 63;

	/**
	 * The feature id for the '<em><b>Multi Lang Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_EXTENSION_POINT__MULTI_LANG_LABEL = MENU_ELEMENT__MULTI_LANG_LABEL;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_EXTENSION_POINT__STYLE = MENU_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_EXTENSION_POINT__STYLE_CLASS = MENU_ELEMENT__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Classifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_EXTENSION_POINT__CLASSIFIERS = MENU_ELEMENT__CLASSIFIERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_EXTENSION_POINT__ENABLED = MENU_ELEMENT__ENABLED;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_EXTENSION_POINT__ORDER = MENU_ELEMENT__ORDER;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_EXTENSION_POINT__UID = MENU_ELEMENT__UID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_EXTENSION_POINT__NAME = MENU_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Extension Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_EXTENSION_POINT__EXTENSION_REF = MENU_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Menu Extension Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_EXTENSION_POINT_FEATURE_COUNT = MENU_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link form.impl.SubMenuImpl <em>Sub Menu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.impl.SubMenuImpl
	 * @see form.impl.FormPackageImpl#getSubMenu()
	 * @generated
	 */
	int SUB_MENU = 64;

	/**
	 * The feature id for the '<em><b>Multi Lang Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_MENU__MULTI_LANG_LABEL = MENU_ELEMENT__MULTI_LANG_LABEL;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_MENU__STYLE = MENU_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_MENU__STYLE_CLASS = MENU_ELEMENT__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Classifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_MENU__CLASSIFIERS = MENU_ELEMENT__CLASSIFIERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_MENU__ENABLED = MENU_ELEMENT__ENABLED;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_MENU__ORDER = MENU_ELEMENT__ORDER;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_MENU__UID = MENU_ELEMENT__UID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_MENU__NAME = MENU_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_MENU__ICON = MENU_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To Submenu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_MENU__TO_SUBMENU = MENU_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sub Menu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_MENU_FEATURE_COUNT = MENU_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link form.impl.MenuSeparatorImpl <em>Menu Separator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.impl.MenuSeparatorImpl
	 * @see form.impl.FormPackageImpl#getMenuSeparator()
	 * @generated
	 */
	int MENU_SEPARATOR = 65;

	/**
	 * The feature id for the '<em><b>Multi Lang Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_SEPARATOR__MULTI_LANG_LABEL = MENU_ELEMENT__MULTI_LANG_LABEL;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_SEPARATOR__STYLE = MENU_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_SEPARATOR__STYLE_CLASS = MENU_ELEMENT__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Classifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_SEPARATOR__CLASSIFIERS = MENU_ELEMENT__CLASSIFIERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_SEPARATOR__ENABLED = MENU_ELEMENT__ENABLED;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_SEPARATOR__ORDER = MENU_ELEMENT__ORDER;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_SEPARATOR__UID = MENU_ELEMENT__UID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_SEPARATOR__NAME = MENU_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Menu Separator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_SEPARATOR_FEATURE_COUNT = MENU_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link form.impl.TreeImpl <em>Tree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.impl.TreeImpl
	 * @see form.impl.FormPackageImpl#getTree()
	 * @generated
	 */
	int TREE = 66;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__STYLE = SOURCES_POINTER__STYLE;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__STYLE_CLASS = SOURCES_POINTER__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Nickname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__NICKNAME = SOURCES_POINTER__NICKNAME;

	/**
	 * The feature id for the '<em><b>Classifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__CLASSIFIERS = SOURCES_POINTER__CLASSIFIERS;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__ORDER = SOURCES_POINTER__ORDER;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__ENABLED = SOURCES_POINTER__ENABLED;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__FIELDS = SOURCES_POINTER__FIELDS;

	/**
	 * The feature id for the '<em><b>Menu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__MENU = SOURCES_POINTER__MENU;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__UID = SOURCES_POINTER__UID;

	/**
	 * The feature id for the '<em><b>Required</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__REQUIRED = SOURCES_POINTER__REQUIRED;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__READ_ONLY = SOURCES_POINTER__READ_ONLY;

	/**
	 * The feature id for the '<em><b>Refresh Areas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__REFRESH_AREAS = SOURCES_POINTER__REFRESH_AREAS;

	/**
	 * The feature id for the '<em><b>Source Pointer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__SOURCE_POINTER = SOURCES_POINTER__SOURCE_POINTER;

	/**
	 * The feature id for the '<em><b>Value Pointer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__VALUE_POINTER = SOURCES_POINTER__VALUE_POINTER;

	/**
	 * The feature id for the '<em><b>Source Cast</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__SOURCE_CAST = SOURCES_POINTER__SOURCE_CAST;

	/**
	 * The feature id for the '<em><b>Source Cast Data Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__SOURCE_CAST_DATA_CONTROL = SOURCES_POINTER__SOURCE_CAST_DATA_CONTROL;

	/**
	 * The feature id for the '<em><b>Multi Lang Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__MULTI_LANG_LABEL = SOURCES_POINTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__LABEL = SOURCES_POINTER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__IMAGE = SOURCES_POINTER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Cols</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__COLS = SOURCES_POINTER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Tree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_FEATURE_COUNT = SOURCES_POINTER_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link form.impl.ControlsImpl <em>Controls</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.impl.ControlsImpl
	 * @see form.impl.FormPackageImpl#getControls()
	 * @generated
	 */
	int CONTROLS = 67;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLS__UID = 0;

	/**
	 * The feature id for the '<em><b>Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLS__ROOT = 1;

	/**
	 * The feature id for the '<em><b>Controls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLS__CONTROLS = 2;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLS__RELATIONS = 3;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLS__DEPENDENCIES = 4;

	/**
	 * The number of structural features of the '<em>Controls</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLS_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link form.impl.PREFormTriggerImpl <em>PRE Form Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.impl.PREFormTriggerImpl
	 * @see form.impl.FormPackageImpl#getPREFormTrigger()
	 * @generated
	 */
	int PRE_FORM_TRIGGER = 69;

	/**
	 * The feature id for the '<em><b>Method Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_FORM_TRIGGER__METHOD_REF = TRIGGER__METHOD_REF;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_FORM_TRIGGER__PARAMETERS = TRIGGER__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_FORM_TRIGGER__UID = TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PRE Form Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_FORM_TRIGGER_FEATURE_COUNT = TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link form.impl.PREQueryTriggerImpl <em>PRE Query Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.impl.PREQueryTriggerImpl
	 * @see form.impl.FormPackageImpl#getPREQueryTrigger()
	 * @generated
	 */
	int PRE_QUERY_TRIGGER = 70;

	/**
	 * The feature id for the '<em><b>Method Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_QUERY_TRIGGER__METHOD_REF = TRIGGER__METHOD_REF;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_QUERY_TRIGGER__PARAMETERS = TRIGGER__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_QUERY_TRIGGER__UID = TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PRE Query Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_QUERY_TRIGGER_FEATURE_COUNT = TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link form.impl.POSTQueryTriggerImpl <em>POST Query Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.impl.POSTQueryTriggerImpl
	 * @see form.impl.FormPackageImpl#getPOSTQueryTrigger()
	 * @generated
	 */
	int POST_QUERY_TRIGGER = 71;

	/**
	 * The feature id for the '<em><b>Method Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_QUERY_TRIGGER__METHOD_REF = TRIGGER__METHOD_REF;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_QUERY_TRIGGER__PARAMETERS = TRIGGER__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_QUERY_TRIGGER__UID = TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>POST Query Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_QUERY_TRIGGER_FEATURE_COUNT = TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link form.impl.PREInsertTriggerImpl <em>PRE Insert Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.impl.PREInsertTriggerImpl
	 * @see form.impl.FormPackageImpl#getPREInsertTrigger()
	 * @generated
	 */
	int PRE_INSERT_TRIGGER = 72;

	/**
	 * The feature id for the '<em><b>Method Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_INSERT_TRIGGER__METHOD_REF = TRIGGER__METHOD_REF;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_INSERT_TRIGGER__PARAMETERS = TRIGGER__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_INSERT_TRIGGER__UID = TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PRE Insert Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_INSERT_TRIGGER_FEATURE_COUNT = TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link form.impl.PREDeleteTriggerImpl <em>PRE Delete Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.impl.PREDeleteTriggerImpl
	 * @see form.impl.FormPackageImpl#getPREDeleteTrigger()
	 * @generated
	 */
	int PRE_DELETE_TRIGGER = 73;

	/**
	 * The feature id for the '<em><b>Method Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_DELETE_TRIGGER__METHOD_REF = TRIGGER__METHOD_REF;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_DELETE_TRIGGER__PARAMETERS = TRIGGER__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_DELETE_TRIGGER__UID = TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PRE Delete Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_DELETE_TRIGGER_FEATURE_COUNT = TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link form.impl.POSTCreateTriggerImpl <em>POST Create Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.impl.POSTCreateTriggerImpl
	 * @see form.impl.FormPackageImpl#getPOSTCreateTrigger()
	 * @generated
	 */
	int POST_CREATE_TRIGGER = 74;

	/**
	 * The feature id for the '<em><b>Method Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_CREATE_TRIGGER__METHOD_REF = TRIGGER__METHOD_REF;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_CREATE_TRIGGER__PARAMETERS = TRIGGER__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_CREATE_TRIGGER__UID = TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>POST Create Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_CREATE_TRIGGER_FEATURE_COUNT = TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link form.impl.PREUpdateTriggerImpl <em>PRE Update Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.impl.PREUpdateTriggerImpl
	 * @see form.impl.FormPackageImpl#getPREUpdateTrigger()
	 * @generated
	 */
	int PRE_UPDATE_TRIGGER = 75;

	/**
	 * The feature id for the '<em><b>Method Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_UPDATE_TRIGGER__METHOD_REF = TRIGGER__METHOD_REF;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_UPDATE_TRIGGER__PARAMETERS = TRIGGER__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_UPDATE_TRIGGER__UID = TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PRE Update Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_UPDATE_TRIGGER_FEATURE_COUNT = TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link form.impl.ProxiesListImpl <em>Proxies List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.impl.ProxiesListImpl
	 * @see form.impl.FormPackageImpl#getProxiesList()
	 * @generated
	 */
	int PROXIES_LIST = 76;

	/**
	 * The feature id for the '<em><b>Type Pointers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXIES_LIST__TYPE_POINTERS = 0;

	/**
	 * The number of structural features of the '<em>Proxies List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXIES_LIST_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link form.impl.CreateTriggerImpl <em>Create Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.impl.CreateTriggerImpl
	 * @see form.impl.FormPackageImpl#getCreateTrigger()
	 * @generated
	 */
	int CREATE_TRIGGER = 77;

	/**
	 * The feature id for the '<em><b>Method Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TRIGGER__METHOD_REF = TRIGGER__METHOD_REF;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TRIGGER__PARAMETERS = TRIGGER__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Type Pointers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TRIGGER__TYPE_POINTERS = TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TRIGGER__UID = TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Create Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TRIGGER_FEATURE_COUNT = TRIGGER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link form.impl.InsertTriggerImpl <em>Insert Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.impl.InsertTriggerImpl
	 * @see form.impl.FormPackageImpl#getInsertTrigger()
	 * @generated
	 */
	int INSERT_TRIGGER = 78;

	/**
	 * The feature id for the '<em><b>Method Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_TRIGGER__METHOD_REF = TRIGGER__METHOD_REF;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_TRIGGER__PARAMETERS = TRIGGER__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Type Pointers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_TRIGGER__TYPE_POINTERS = TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_TRIGGER__UID = TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Insert Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_TRIGGER_FEATURE_COUNT = TRIGGER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link form.impl.UpdateTriggerImpl <em>Update Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.impl.UpdateTriggerImpl
	 * @see form.impl.FormPackageImpl#getUpdateTrigger()
	 * @generated
	 */
	int UPDATE_TRIGGER = 79;

	/**
	 * The feature id for the '<em><b>Method Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TRIGGER__METHOD_REF = TRIGGER__METHOD_REF;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TRIGGER__PARAMETERS = TRIGGER__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Type Pointers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TRIGGER__TYPE_POINTERS = TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TRIGGER__UID = TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Update Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TRIGGER_FEATURE_COUNT = TRIGGER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link form.impl.DeleteTriggerImpl <em>Delete Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.impl.DeleteTriggerImpl
	 * @see form.impl.FormPackageImpl#getDeleteTrigger()
	 * @generated
	 */
	int DELETE_TRIGGER = 80;

	/**
	 * The feature id for the '<em><b>Method Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_TRIGGER__METHOD_REF = TRIGGER__METHOD_REF;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_TRIGGER__PARAMETERS = TRIGGER__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Type Pointers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_TRIGGER__TYPE_POINTERS = TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_TRIGGER__UID = TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Delete Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_TRIGGER_FEATURE_COUNT = TRIGGER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link form.impl.SearchTriggerImpl <em>Search Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.impl.SearchTriggerImpl
	 * @see form.impl.FormPackageImpl#getSearchTrigger()
	 * @generated
	 */
	int SEARCH_TRIGGER = 81;

	/**
	 * The feature id for the '<em><b>Method Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_TRIGGER__METHOD_REF = TRIGGER__METHOD_REF;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_TRIGGER__PARAMETERS = TRIGGER__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Type Pointers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_TRIGGER__TYPE_POINTERS = TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_TRIGGER__UID = TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Search Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_TRIGGER_FEATURE_COUNT = TRIGGER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link form.impl.RootImpl <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.impl.RootImpl
	 * @see form.impl.FormPackageImpl#getRoot()
	 * @generated
	 */
	int ROOT = 82;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__UID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Pre Form Trigger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__PRE_FORM_TRIGGER = 2;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__VARIABLES = 3;

	/**
	 * The number of structural features of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link form.impl.FormVariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.impl.FormVariableImpl
	 * @see form.impl.FormPackageImpl#getFormVariable()
	 * @generated
	 */
	int FORM_VARIABLE = 83;

	/**
	 * The feature id for the '<em><b>Type Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_VARIABLE__TYPE_REF = TypePackage.TYPE_POINTER__TYPE_REF;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_VARIABLE__UID = TypePackage.TYPE_POINTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_VARIABLE__NAME = TypePackage.TYPE_POINTER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Param Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_VARIABLE__PARAM_REF = TypePackage.TYPE_POINTER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_VARIABLE_FEATURE_COUNT = TypePackage.TYPE_POINTER_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link form.impl.DataControlImpl <em>Data Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.impl.DataControlImpl
	 * @see form.impl.FormPackageImpl#getDataControl()
	 * @generated
	 */
	int DATA_CONTROL = 84;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTROL__UID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTROL__NAME = 1;

	/**
	 * The feature id for the '<em><b>Base Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTROL__BASE_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Pre Query Trigger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTROL__PRE_QUERY_TRIGGER = 3;

	/**
	 * The feature id for the '<em><b>Post Query Trigger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTROL__POST_QUERY_TRIGGER = 4;

	/**
	 * The feature id for the '<em><b>Pre Insert Trigger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTROL__PRE_INSERT_TRIGGER = 5;

	/**
	 * The feature id for the '<em><b>Pre Delete Trigger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTROL__PRE_DELETE_TRIGGER = 6;

	/**
	 * The feature id for the '<em><b>Post Create Trigger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTROL__POST_CREATE_TRIGGER = 7;

	/**
	 * The feature id for the '<em><b>Pre Update Trigger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTROL__PRE_UPDATE_TRIGGER = 8;

	/**
	 * The feature id for the '<em><b>Create</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTROL__CREATE = 9;

	/**
	 * The feature id for the '<em><b>Insert</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTROL__INSERT = 10;

	/**
	 * The feature id for the '<em><b>Update</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTROL__UPDATE = 11;

	/**
	 * The feature id for the '<em><b>Remove</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTROL__REMOVE = 12;

	/**
	 * The feature id for the '<em><b>Search</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTROL__SEARCH = 13;

	/**
	 * The feature id for the '<em><b>Artificial Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTROL__ARTIFICIAL_FIELDS = 14;

	/**
	 * The feature id for the '<em><b>Default Search</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTROL__DEFAULT_SEARCH = 15;

	/**
	 * The feature id for the '<em><b>Default Order By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTROL__DEFAULT_ORDER_BY = 16;

	/**
	 * The number of structural features of the '<em>Data Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTROL_FEATURE_COUNT = 17;

	/**
	 * The meta object id for the '{@link form.impl.OrdersImpl <em>Orders</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.impl.OrdersImpl
	 * @see form.impl.FormPackageImpl#getOrders()
	 * @generated
	 */
	int ORDERS = 85;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERS__UID = 0;

	/**
	 * The feature id for the '<em><b>Order Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERS__ORDER_RULES = 1;

	/**
	 * The number of structural features of the '<em>Orders</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERS_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link form.impl.OrderByImpl <em>Order By</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.impl.OrderByImpl
	 * @see form.impl.FormPackageImpl#getOrderBy()
	 * @generated
	 */
	int ORDER_BY = 86;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_BY__UID = 0;

	/**
	 * The feature id for the '<em><b>Ref Obj</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_BY__REF_OBJ = 1;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_BY__ORDER = 2;

	/**
	 * The number of structural features of the '<em>Order By</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_BY_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link form.impl.RelationImpl <em>Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.impl.RelationImpl
	 * @see form.impl.FormPackageImpl#getRelation()
	 * @generated
	 */
	int RELATION = 87;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__UID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__NAME = 1;

	/**
	 * The feature id for the '<em><b>Master</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__MASTER = 2;

	/**
	 * The feature id for the '<em><b>Detail</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__DETAIL = 3;

	/**
	 * The feature id for the '<em><b>Is Tree</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__IS_TREE = 4;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__LINKS = 5;

	/**
	 * The number of structural features of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link form.impl.DependencyImpl <em>Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.impl.DependencyImpl
	 * @see form.impl.FormPackageImpl#getDependency()
	 * @generated
	 */
	int DEPENDENCY = 88;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__UID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__NAME = 1;

	/**
	 * The feature id for the '<em><b>Master</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__MASTER = 2;

	/**
	 * The feature id for the '<em><b>Detail</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__DETAIL = 3;

	/**
	 * The number of structural features of the '<em>Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link form.impl.ArtificialFieldImpl <em>Artificial Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.impl.ArtificialFieldImpl
	 * @see form.impl.FormPackageImpl#getArtificialField()
	 * @generated
	 */
	int ARTIFICIAL_FIELD = 89;

	/**
	 * The feature id for the '<em><b>Type Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFICIAL_FIELD__TYPE_REF = TypePackage.TYPE_POINTER__TYPE_REF;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFICIAL_FIELD__UID = TypePackage.TYPE_POINTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFICIAL_FIELD__NAME = TypePackage.TYPE_POINTER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Artificial Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFICIAL_FIELD_FEATURE_COUNT = TypePackage.TYPE_POINTER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link form.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.impl.LinkImpl
	 * @see form.impl.FormPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 90;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__UID = 0;

	/**
	 * The feature id for the '<em><b>Master Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__MASTER_FIELD = 1;

	/**
	 * The feature id for the '<em><b>Detail Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__DETAIL_FIELD = 2;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link form.Comparator <em>Comparator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.Comparator
	 * @see form.impl.FormPackageImpl#getComparator()
	 * @generated
	 */
	int COMPARATOR = 91;

	/**
	 * The meta object id for the '{@link form.Order <em>Order</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.Order
	 * @see form.impl.FormPackageImpl#getOrder()
	 * @generated
	 */
	int ORDER = 92;

	/**
	 * The meta object id for the '{@link form.Orientation <em>Orientation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.Orientation
	 * @see form.impl.FormPackageImpl#getOrientation()
	 * @generated
	 */
	int ORIENTATION = 93;


	/**
	 * Returns the meta object for class '{@link form.Form <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form</em>'.
	 * @see form.Form
	 * @generated
	 */
	EClass getForm();

	/**
	 * Returns the meta object for the attribute '{@link form.Form#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see form.Form#getUid()
	 * @see #getForm()
	 * @generated
	 */
	EAttribute getForm_Uid();

	/**
	 * Returns the meta object for the attribute '{@link form.Form#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see form.Form#getName()
	 * @see #getForm()
	 * @generated
	 */
	EAttribute getForm_Name();

	/**
	 * Returns the meta object for the containment reference '{@link form.Form#getView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>View</em>'.
	 * @see form.Form#getView()
	 * @see #getForm()
	 * @generated
	 */
	EReference getForm_View();

	/**
	 * Returns the meta object for the containment reference '{@link form.Form#getDatacontrols <em>Datacontrols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Datacontrols</em>'.
	 * @see form.Form#getDatacontrols()
	 * @see #getForm()
	 * @generated
	 */
	EReference getForm_Datacontrols();

	/**
	 * Returns the meta object for the containment reference list '{@link form.Form#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see form.Form#getParameters()
	 * @see #getForm()
	 * @generated
	 */
	EReference getForm_Parameters();

	/**
	 * Returns the meta object for class '{@link form.FormParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see form.FormParameter
	 * @generated
	 */
	EClass getFormParameter();

	/**
	 * Returns the meta object for the attribute '{@link form.FormParameter#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see form.FormParameter#getUid()
	 * @see #getFormParameter()
	 * @generated
	 */
	EAttribute getFormParameter_Uid();

	/**
	 * Returns the meta object for the attribute '{@link form.FormParameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see form.FormParameter#getName()
	 * @see #getFormParameter()
	 * @generated
	 */
	EAttribute getFormParameter_Name();

	/**
	 * Returns the meta object for class '{@link form.Views <em>Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Views</em>'.
	 * @see form.Views
	 * @generated
	 */
	EClass getViews();

	/**
	 * Returns the meta object for the attribute '{@link form.Views#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see form.Views#getUid()
	 * @see #getViews()
	 * @generated
	 */
	EAttribute getViews_Uid();

	/**
	 * Returns the meta object for the containment reference list '{@link form.Views#getCanvases <em>Canvases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Canvases</em>'.
	 * @see form.Views#getCanvases()
	 * @see #getViews()
	 * @generated
	 */
	EReference getViews_Canvases();

	/**
	 * Returns the meta object for the containment reference list '{@link form.Views#getViewInheritances <em>View Inheritances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>View Inheritances</em>'.
	 * @see form.Views#getViewInheritances()
	 * @see #getViews()
	 * @generated
	 */
	EReference getViews_ViewInheritances();

	/**
	 * Returns the meta object for the containment reference list '{@link form.Views#getTabPagesInheritances <em>Tab Pages Inheritances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tab Pages Inheritances</em>'.
	 * @see form.Views#getTabPagesInheritances()
	 * @see #getViews()
	 * @generated
	 */
	EReference getViews_TabPagesInheritances();

	/**
	 * Returns the meta object for the containment reference list '{@link form.Views#getMenus <em>Menus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Menus</em>'.
	 * @see form.Views#getMenus()
	 * @see #getViews()
	 * @generated
	 */
	EReference getViews_Menus();

	/**
	 * Returns the meta object for class '{@link form.HTMLLayerHolder <em>HTML Layer Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HTML Layer Holder</em>'.
	 * @see form.HTMLLayerHolder
	 * @generated
	 */
	EClass getHTMLLayerHolder();

	/**
	 * Returns the meta object for the attribute '{@link form.HTMLLayerHolder#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Columns</em>'.
	 * @see form.HTMLLayerHolder#getColumns()
	 * @see #getHTMLLayerHolder()
	 * @generated
	 */
	EAttribute getHTMLLayerHolder_Columns();

	/**
	 * Returns the meta object for class '{@link form.Orderable <em>Orderable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orderable</em>'.
	 * @see form.Orderable
	 * @generated
	 */
	EClass getOrderable();

	/**
	 * Returns the meta object for the attribute '{@link form.Orderable#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order</em>'.
	 * @see form.Orderable#getOrder()
	 * @see #getOrderable()
	 * @generated
	 */
	EAttribute getOrderable_Order();

	/**
	 * Returns the meta object for class '{@link form.MultiLangLabel <em>Multi Lang Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Lang Label</em>'.
	 * @see form.MultiLangLabel
	 * @generated
	 */
	EClass getMultiLangLabel();

	/**
	 * Returns the meta object for the containment reference '{@link form.MultiLangLabel#getMultiLangLabel <em>Multi Lang Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Multi Lang Label</em>'.
	 * @see form.MultiLangLabel#getMultiLangLabel()
	 * @see #getMultiLangLabel()
	 * @generated
	 */
	EReference getMultiLangLabel_MultiLangLabel();

	/**
	 * Returns the meta object for class '{@link form.CanvasFrame <em>Canvas Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Canvas Frame</em>'.
	 * @see form.CanvasFrame
	 * @generated
	 */
	EClass getCanvasFrame();

	/**
	 * Returns the meta object for the attribute '{@link form.CanvasFrame#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see form.CanvasFrame#getUid()
	 * @see #getCanvasFrame()
	 * @generated
	 */
	EAttribute getCanvasFrame_Uid();

	/**
	 * Returns the meta object for the attribute '{@link form.CanvasFrame#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see form.CanvasFrame#getName()
	 * @see #getCanvasFrame()
	 * @generated
	 */
	EAttribute getCanvasFrame_Name();

	/**
	 * Returns the meta object for class '{@link form.ViewPortHolder <em>View Port Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Port Holder</em>'.
	 * @see form.ViewPortHolder
	 * @generated
	 */
	EClass getViewPortHolder();

	/**
	 * Returns the meta object for the containment reference list '{@link form.ViewPortHolder#getViewElement <em>View Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>View Element</em>'.
	 * @see form.ViewPortHolder#getViewElement()
	 * @see #getViewPortHolder()
	 * @generated
	 */
	EReference getViewPortHolder_ViewElement();

	/**
	 * Returns the meta object for class '{@link form.DefaultCavas <em>Default Cavas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default Cavas</em>'.
	 * @see form.DefaultCavas
	 * @generated
	 */
	EClass getDefaultCavas();

	/**
	 * Returns the meta object for the attribute '{@link form.DefaultCavas#isDefaultCanvas <em>Default Canvas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Canvas</em>'.
	 * @see form.DefaultCavas#isDefaultCanvas()
	 * @see #getDefaultCavas()
	 * @generated
	 */
	EAttribute getDefaultCavas_DefaultCanvas();

	/**
	 * Returns the meta object for class '{@link form.ViewElement <em>View Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Element</em>'.
	 * @see form.ViewElement
	 * @generated
	 */
	EClass getViewElement();

	/**
	 * Returns the meta object for class '{@link form.PopupCanvas <em>Popup Canvas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Popup Canvas</em>'.
	 * @see form.PopupCanvas
	 * @generated
	 */
	EClass getPopupCanvas();

	/**
	 * Returns the meta object for the attribute '{@link form.PopupCanvas#isModal <em>Modal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modal</em>'.
	 * @see form.PopupCanvas#isModal()
	 * @see #getPopupCanvas()
	 * @generated
	 */
	EAttribute getPopupCanvas_Modal();

	/**
	 * Returns the meta object for class '{@link form.Canvas <em>Canvas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Canvas</em>'.
	 * @see form.Canvas
	 * @generated
	 */
	EClass getCanvas();

	/**
	 * Returns the meta object for class '{@link form.Window <em>Window</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Window</em>'.
	 * @see form.Window
	 * @generated
	 */
	EClass getWindow();

	/**
	 * Returns the meta object for class '{@link form.MenuDefinition <em>Menu Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Menu Definition</em>'.
	 * @see form.MenuDefinition
	 * @generated
	 */
	EClass getMenuDefinition();

	/**
	 * Returns the meta object for the attribute '{@link form.MenuDefinition#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see form.MenuDefinition#getUid()
	 * @see #getMenuDefinition()
	 * @generated
	 */
	EAttribute getMenuDefinition_Uid();

	/**
	 * Returns the meta object for the attribute '{@link form.MenuDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see form.MenuDefinition#getName()
	 * @see #getMenuDefinition()
	 * @generated
	 */
	EAttribute getMenuDefinition_Name();

	/**
	 * Returns the meta object for the reference '{@link form.MenuDefinition#getMenuView <em>Menu View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Menu View</em>'.
	 * @see form.MenuDefinition#getMenuView()
	 * @see #getMenuDefinition()
	 * @generated
	 */
	EReference getMenuDefinition_MenuView();

	/**
	 * Returns the meta object for class '{@link form.TabCanvas <em>Tab Canvas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tab Canvas</em>'.
	 * @see form.TabCanvas
	 * @generated
	 */
	EClass getTabCanvas();

	/**
	 * Returns the meta object for the attribute '{@link form.TabCanvas#getOrientation <em>Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orientation</em>'.
	 * @see form.TabCanvas#getOrientation()
	 * @see #getTabCanvas()
	 * @generated
	 */
	EAttribute getTabCanvas_Orientation();

	/**
	 * Returns the meta object for class '{@link form.TabPage <em>Tab Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tab Page</em>'.
	 * @see form.TabPage
	 * @generated
	 */
	EClass getTabPage();

	/**
	 * Returns the meta object for class '{@link form.ViewPort <em>View Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Port</em>'.
	 * @see form.ViewPort
	 * @generated
	 */
	EClass getViewPort();

	/**
	 * Returns the meta object for the attribute '{@link form.ViewPort#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see form.ViewPort#getUid()
	 * @see #getViewPort()
	 * @generated
	 */
	EAttribute getViewPort_Uid();

	/**
	 * Returns the meta object for the attribute '{@link form.ViewPort#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see form.ViewPort#getName()
	 * @see #getViewPort()
	 * @generated
	 */
	EAttribute getViewPort_Name();

	/**
	 * Returns the meta object for the containment reference '{@link form.ViewPort#getViewPortTrigger <em>View Port Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>View Port Trigger</em>'.
	 * @see form.ViewPort#getViewPortTrigger()
	 * @see #getViewPort()
	 * @generated
	 */
	EReference getViewPort_ViewPortTrigger();

	/**
	 * Returns the meta object for class '{@link form.ViewArea <em>View Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Area</em>'.
	 * @see form.ViewArea
	 * @generated
	 */
	EClass getViewArea();

	/**
	 * Returns the meta object for the attribute '{@link form.ViewArea#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see form.ViewArea#getUid()
	 * @see #getViewArea()
	 * @generated
	 */
	EAttribute getViewArea_Uid();

	/**
	 * Returns the meta object for the attribute '{@link form.ViewArea#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see form.ViewArea#getName()
	 * @see #getViewArea()
	 * @generated
	 */
	EAttribute getViewArea_Name();

	/**
	 * Returns the meta object for the containment reference '{@link form.ViewArea#getBaseCanvas <em>Base Canvas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Base Canvas</em>'.
	 * @see form.ViewArea#getBaseCanvas()
	 * @see #getViewArea()
	 * @generated
	 */
	EReference getViewArea_BaseCanvas();

	/**
	 * Returns the meta object for the containment reference list '{@link form.ViewArea#getLinkToLabels <em>Link To Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link To Labels</em>'.
	 * @see form.ViewArea#getLinkToLabels()
	 * @see #getViewArea()
	 * @generated
	 */
	EReference getViewArea_LinkToLabels();

	/**
	 * Returns the meta object for the containment reference list '{@link form.ViewArea#getLinkToMessages <em>Link To Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link To Messages</em>'.
	 * @see form.ViewArea#getLinkToMessages()
	 * @see #getViewArea()
	 * @generated
	 */
	EReference getViewArea_LinkToMessages();

	/**
	 * Returns the meta object for class '{@link form.ViewPortTrigger <em>View Port Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Port Trigger</em>'.
	 * @see form.ViewPortTrigger
	 * @generated
	 */
	EClass getViewPortTrigger();

	/**
	 * Returns the meta object for the attribute '{@link form.ViewPortTrigger#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see form.ViewPortTrigger#getUid()
	 * @see #getViewPortTrigger()
	 * @generated
	 */
	EAttribute getViewPortTrigger_Uid();

	/**
	 * Returns the meta object for class '{@link form.ViewInheritance <em>View Inheritance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Inheritance</em>'.
	 * @see form.ViewInheritance
	 * @generated
	 */
	EClass getViewInheritance();

	/**
	 * Returns the meta object for the attribute '{@link form.ViewInheritance#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see form.ViewInheritance#getUid()
	 * @see #getViewInheritance()
	 * @generated
	 */
	EAttribute getViewInheritance_Uid();

	/**
	 * Returns the meta object for the reference '{@link form.ViewInheritance#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see form.ViewInheritance#getSource()
	 * @see #getViewInheritance()
	 * @generated
	 */
	EReference getViewInheritance_Source();

	/**
	 * Returns the meta object for the reference '{@link form.ViewInheritance#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see form.ViewInheritance#getTarget()
	 * @see #getViewInheritance()
	 * @generated
	 */
	EReference getViewInheritance_Target();

	/**
	 * Returns the meta object for class '{@link form.TabPagesInheritance <em>Tab Pages Inheritance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tab Pages Inheritance</em>'.
	 * @see form.TabPagesInheritance
	 * @generated
	 */
	EClass getTabPagesInheritance();

	/**
	 * Returns the meta object for the attribute '{@link form.TabPagesInheritance#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see form.TabPagesInheritance#getUid()
	 * @see #getTabPagesInheritance()
	 * @generated
	 */
	EAttribute getTabPagesInheritance_Uid();

	/**
	 * Returns the meta object for the reference '{@link form.TabPagesInheritance#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see form.TabPagesInheritance#getSource()
	 * @see #getTabPagesInheritance()
	 * @generated
	 */
	EReference getTabPagesInheritance_Source();

	/**
	 * Returns the meta object for the reference '{@link form.TabPagesInheritance#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see form.TabPagesInheritance#getTarget()
	 * @see #getTabPagesInheritance()
	 * @generated
	 */
	EReference getTabPagesInheritance_Target();

	/**
	 * Returns the meta object for class '{@link form.LinkToMessage <em>Link To Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link To Message</em>'.
	 * @see form.LinkToMessage
	 * @generated
	 */
	EClass getLinkToMessage();

	/**
	 * Returns the meta object for the attribute '{@link form.LinkToMessage#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see form.LinkToMessage#getUid()
	 * @see #getLinkToMessage()
	 * @generated
	 */
	EAttribute getLinkToMessage_Uid();

	/**
	 * Returns the meta object for the reference '{@link form.LinkToMessage#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see form.LinkToMessage#getSource()
	 * @see #getLinkToMessage()
	 * @generated
	 */
	EReference getLinkToMessage_Source();

	/**
	 * Returns the meta object for the reference '{@link form.LinkToMessage#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see form.LinkToMessage#getTarget()
	 * @see #getLinkToMessage()
	 * @generated
	 */
	EReference getLinkToMessage_Target();

	/**
	 * Returns the meta object for class '{@link form.LinkToLabel <em>Link To Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link To Label</em>'.
	 * @see form.LinkToLabel
	 * @generated
	 */
	EClass getLinkToLabel();

	/**
	 * Returns the meta object for the attribute '{@link form.LinkToLabel#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see form.LinkToLabel#getUid()
	 * @see #getLinkToLabel()
	 * @generated
	 */
	EAttribute getLinkToLabel_Uid();

	/**
	 * Returns the meta object for the reference '{@link form.LinkToLabel#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see form.LinkToLabel#getSource()
	 * @see #getLinkToLabel()
	 * @generated
	 */
	EReference getLinkToLabel_Source();

	/**
	 * Returns the meta object for the reference '{@link form.LinkToLabel#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see form.LinkToLabel#getTarget()
	 * @see #getLinkToLabel()
	 * @generated
	 */
	EReference getLinkToLabel_Target();

	/**
	 * Returns the meta object for class '{@link form.ChildrenHolder <em>Children Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Children Holder</em>'.
	 * @see form.ChildrenHolder
	 * @generated
	 */
	EClass getChildrenHolder();

	/**
	 * Returns the meta object for the containment reference list '{@link form.ChildrenHolder#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see form.ChildrenHolder#getChildren()
	 * @see #getChildrenHolder()
	 * @generated
	 */
	EReference getChildrenHolder_Children();

	/**
	 * Returns the meta object for class '{@link form.ContextParameter <em>Context Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context Parameter</em>'.
	 * @see form.ContextParameter
	 * @generated
	 */
	EClass getContextParameter();

	/**
	 * Returns the meta object for the attribute '{@link form.ContextParameter#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see form.ContextParameter#getUid()
	 * @see #getContextParameter()
	 * @generated
	 */
	EAttribute getContextParameter_Uid();

	/**
	 * Returns the meta object for the reference '{@link form.ContextParameter#getRefObj <em>Ref Obj</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref Obj</em>'.
	 * @see form.ContextParameter#getRefObj()
	 * @see #getContextParameter()
	 * @generated
	 */
	EReference getContextParameter_RefObj();

	/**
	 * Returns the meta object for the attribute '{@link form.ContextParameter#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see form.ContextParameter#getOperation()
	 * @see #getContextParameter()
	 * @generated
	 */
	EAttribute getContextParameter_Operation();

	/**
	 * Returns the meta object for the containment reference '{@link form.ContextParameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see form.ContextParameter#getValue()
	 * @see #getContextParameter()
	 * @generated
	 */
	EReference getContextParameter_Value();

	/**
	 * Returns the meta object for class '{@link form.ContextValue <em>Context Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context Value</em>'.
	 * @see form.ContextValue
	 * @generated
	 */
	EClass getContextValue();

	/**
	 * Returns the meta object for the attribute '{@link form.ContextValue#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see form.ContextValue#getUid()
	 * @see #getContextValue()
	 * @generated
	 */
	EAttribute getContextValue_Uid();

	/**
	 * Returns the meta object for the attribute '{@link form.ContextValue#isConstant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constant</em>'.
	 * @see form.ContextValue#isConstant()
	 * @see #getContextValue()
	 * @generated
	 */
	EAttribute getContextValue_Constant();

	/**
	 * Returns the meta object for the attribute '{@link form.ContextValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see form.ContextValue#getValue()
	 * @see #getContextValue()
	 * @generated
	 */
	EAttribute getContextValue_Value();

	/**
	 * Returns the meta object for the containment reference list '{@link form.ContextValue#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expression</em>'.
	 * @see form.ContextValue#getExpression()
	 * @see #getContextValue()
	 * @generated
	 */
	EReference getContextValue_Expression();

	/**
	 * Returns the meta object for class '{@link form.ExpressionPart <em>Expression Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Part</em>'.
	 * @see form.ExpressionPart
	 * @generated
	 */
	EClass getExpressionPart();

	/**
	 * Returns the meta object for the attribute '{@link form.ExpressionPart#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see form.ExpressionPart#getUid()
	 * @see #getExpressionPart()
	 * @generated
	 */
	EAttribute getExpressionPart_Uid();

	/**
	 * Returns the meta object for the reference '{@link form.ExpressionPart#getObjRef <em>Obj Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Obj Ref</em>'.
	 * @see form.ExpressionPart#getObjRef()
	 * @see #getExpressionPart()
	 * @generated
	 */
	EReference getExpressionPart_ObjRef();

	/**
	 * Returns the meta object for the attribute '{@link form.ExpressionPart#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order</em>'.
	 * @see form.ExpressionPart#getOrder()
	 * @see #getExpressionPart()
	 * @generated
	 */
	EAttribute getExpressionPart_Order();

	/**
	 * Returns the meta object for the attribute '{@link form.ExpressionPart#getExpressionType <em>Expression Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression Type</em>'.
	 * @see form.ExpressionPart#getExpressionType()
	 * @see #getExpressionPart()
	 * @generated
	 */
	EAttribute getExpressionPart_ExpressionType();

	/**
	 * Returns the meta object for class '{@link form.ContextParameters <em>Context Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context Parameters</em>'.
	 * @see form.ContextParameters
	 * @generated
	 */
	EClass getContextParameters();

	/**
	 * Returns the meta object for the containment reference list '{@link form.ContextParameters#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see form.ContextParameters#getParameters()
	 * @see #getContextParameters()
	 * @generated
	 */
	EReference getContextParameters_Parameters();

	/**
	 * Returns the meta object for class '{@link form.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context</em>'.
	 * @see form.Context
	 * @generated
	 */
	EClass getContext();

	/**
	 * Returns the meta object for class '{@link form.StyleElement <em>Style Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Style Element</em>'.
	 * @see form.StyleElement
	 * @generated
	 */
	EClass getStyleElement();

	/**
	 * Returns the meta object for the containment reference '{@link form.StyleElement#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Style</em>'.
	 * @see form.StyleElement#getStyle()
	 * @see #getStyleElement()
	 * @generated
	 */
	EReference getStyleElement_Style();

	/**
	 * Returns the meta object for the containment reference list '{@link form.StyleElement#getStyleClass <em>Style Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Style Class</em>'.
	 * @see form.StyleElement#getStyleClass()
	 * @see #getStyleElement()
	 * @generated
	 */
	EReference getStyleElement_StyleClass();

	/**
	 * Returns the meta object for class '{@link form.StyleClass <em>Style Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Style Class</em>'.
	 * @see form.StyleClass
	 * @generated
	 */
	EClass getStyleClass();

	/**
	 * Returns the meta object for the containment reference '{@link form.StyleClass#getClassifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Classifier</em>'.
	 * @see form.StyleClass#getClassifier()
	 * @see #getStyleClass()
	 * @generated
	 */
	EReference getStyleClass_Classifier();

	/**
	 * Returns the meta object for class '{@link form.NickNamed <em>Nick Named</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nick Named</em>'.
	 * @see form.NickNamed
	 * @generated
	 */
	EClass getNickNamed();

	/**
	 * Returns the meta object for the attribute '{@link form.NickNamed#getNickname <em>Nickname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nickname</em>'.
	 * @see form.NickNamed#getNickname()
	 * @see #getNickNamed()
	 * @generated
	 */
	EAttribute getNickNamed_Nickname();

	/**
	 * Returns the meta object for class '{@link form.FlexFields <em>Flex Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flex Fields</em>'.
	 * @see form.FlexFields
	 * @generated
	 */
	EClass getFlexFields();

	/**
	 * Returns the meta object for the containment reference list '{@link form.FlexFields#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see form.FlexFields#getFields()
	 * @see #getFlexFields()
	 * @generated
	 */
	EReference getFlexFields_Fields();

	/**
	 * Returns the meta object for class '{@link form.FlexField <em>Flex Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flex Field</em>'.
	 * @see form.FlexField
	 * @generated
	 */
	EClass getFlexField();

	/**
	 * Returns the meta object for class '{@link form.EnabledUIItem <em>Enabled UI Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enabled UI Item</em>'.
	 * @see form.EnabledUIItem
	 * @generated
	 */
	EClass getEnabledUIItem();

	/**
	 * Returns the meta object for the containment reference '{@link form.EnabledUIItem#getEnabled <em>Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Enabled</em>'.
	 * @see form.EnabledUIItem#getEnabled()
	 * @see #getEnabledUIItem()
	 * @generated
	 */
	EReference getEnabledUIItem_Enabled();

	/**
	 * Returns the meta object for class '{@link form.Uielement <em>Uielement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uielement</em>'.
	 * @see form.Uielement
	 * @generated
	 */
	EClass getUielement();

	/**
	 * Returns the meta object for the attribute '{@link form.Uielement#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see form.Uielement#getUid()
	 * @see #getUielement()
	 * @generated
	 */
	EAttribute getUielement_Uid();

	/**
	 * Returns the meta object for the containment reference '{@link form.Uielement#getRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Required</em>'.
	 * @see form.Uielement#getRequired()
	 * @see #getUielement()
	 * @generated
	 */
	EReference getUielement_Required();

	/**
	 * Returns the meta object for the containment reference '{@link form.Uielement#getReadOnly <em>Read Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Read Only</em>'.
	 * @see form.Uielement#getReadOnly()
	 * @see #getUielement()
	 * @generated
	 */
	EReference getUielement_ReadOnly();

	/**
	 * Returns the meta object for the containment reference list '{@link form.Uielement#getRefreshAreas <em>Refresh Areas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Refresh Areas</em>'.
	 * @see form.Uielement#getRefreshAreas()
	 * @see #getUielement()
	 * @generated
	 */
	EReference getUielement_RefreshAreas();

	/**
	 * Returns the meta object for class '{@link form.ItemIcon <em>Item Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Icon</em>'.
	 * @see form.ItemIcon
	 * @generated
	 */
	EClass getItemIcon();

	/**
	 * Returns the meta object for the containment reference '{@link form.ItemIcon#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Icon</em>'.
	 * @see form.ItemIcon#getIcon()
	 * @see #getItemIcon()
	 * @generated
	 */
	EReference getItemIcon_Icon();

	/**
	 * Returns the meta object for class '{@link form.AreaRef <em>Area Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Area Ref</em>'.
	 * @see form.AreaRef
	 * @generated
	 */
	EClass getAreaRef();

	/**
	 * Returns the meta object for the reference '{@link form.AreaRef#getArea <em>Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Area</em>'.
	 * @see form.AreaRef#getArea()
	 * @see #getAreaRef()
	 * @generated
	 */
	EReference getAreaRef_Area();

	/**
	 * Returns the meta object for the attribute '{@link form.AreaRef#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group</em>'.
	 * @see form.AreaRef#getGroup()
	 * @see #getAreaRef()
	 * @generated
	 */
	EAttribute getAreaRef_Group();

	/**
	 * Returns the meta object for class '{@link form.Formatable <em>Formatable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Formatable</em>'.
	 * @see form.Formatable
	 * @generated
	 */
	EClass getFormatable();

	/**
	 * Returns the meta object for the attribute '{@link form.Formatable#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see form.Formatable#getFormat()
	 * @see #getFormatable()
	 * @generated
	 */
	EAttribute getFormatable_Format();

	/**
	 * Returns the meta object for class '{@link form.SourcesPointer <em>Sources Pointer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sources Pointer</em>'.
	 * @see form.SourcesPointer
	 * @generated
	 */
	EClass getSourcesPointer();

	/**
	 * Returns the meta object for the reference '{@link form.SourcesPointer#getSourcePointer <em>Source Pointer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Pointer</em>'.
	 * @see form.SourcesPointer#getSourcePointer()
	 * @see #getSourcesPointer()
	 * @generated
	 */
	EReference getSourcesPointer_SourcePointer();

	/**
	 * Returns the meta object for the reference '{@link form.SourcesPointer#getValuePointer <em>Value Pointer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value Pointer</em>'.
	 * @see form.SourcesPointer#getValuePointer()
	 * @see #getSourcesPointer()
	 * @generated
	 */
	EReference getSourcesPointer_ValuePointer();

	/**
	 * Returns the meta object for the reference '{@link form.SourcesPointer#getSourceCast <em>Source Cast</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Cast</em>'.
	 * @see form.SourcesPointer#getSourceCast()
	 * @see #getSourcesPointer()
	 * @generated
	 */
	EReference getSourcesPointer_SourceCast();

	/**
	 * Returns the meta object for the reference '{@link form.SourcesPointer#getSourceCastDataControl <em>Source Cast Data Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Cast Data Control</em>'.
	 * @see form.SourcesPointer#getSourceCastDataControl()
	 * @see #getSourcesPointer()
	 * @generated
	 */
	EReference getSourcesPointer_SourceCastDataControl();

	/**
	 * Returns the meta object for class '{@link form.InputElement <em>Input Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Element</em>'.
	 * @see form.InputElement
	 * @generated
	 */
	EClass getInputElement();

	/**
	 * Returns the meta object for class '{@link form.Selection <em>Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selection</em>'.
	 * @see form.Selection
	 * @generated
	 */
	EClass getSelection();

	/**
	 * Returns the meta object for the reference '{@link form.Selection#getDisplayOptionPointer <em>Display Option Pointer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Display Option Pointer</em>'.
	 * @see form.Selection#getDisplayOptionPointer()
	 * @see #getSelection()
	 * @generated
	 */
	EReference getSelection_DisplayOptionPointer();

	/**
	 * Returns the meta object for the reference '{@link form.Selection#getValueOptionPointer <em>Value Option Pointer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value Option Pointer</em>'.
	 * @see form.Selection#getValueOptionPointer()
	 * @see #getSelection()
	 * @generated
	 */
	EReference getSelection_ValueOptionPointer();

	/**
	 * Returns the meta object for class '{@link form.OptionSelection <em>Option Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Option Selection</em>'.
	 * @see form.OptionSelection
	 * @generated
	 */
	EClass getOptionSelection();

	/**
	 * Returns the meta object for the reference '{@link form.OptionSelection#getOptionPointer <em>Option Pointer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Option Pointer</em>'.
	 * @see form.OptionSelection#getOptionPointer()
	 * @see #getOptionSelection()
	 * @generated
	 */
	EReference getOptionSelection_OptionPointer();

	/**
	 * Returns the meta object for the reference '{@link form.OptionSelection#getOptionCast <em>Option Cast</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Option Cast</em>'.
	 * @see form.OptionSelection#getOptionCast()
	 * @see #getOptionSelection()
	 * @generated
	 */
	EReference getOptionSelection_OptionCast();

	/**
	 * Returns the meta object for the reference '{@link form.OptionSelection#getOptionCastDataControl <em>Option Cast Data Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Option Cast Data Control</em>'.
	 * @see form.OptionSelection#getOptionCastDataControl()
	 * @see #getOptionSelection()
	 * @generated
	 */
	EReference getOptionSelection_OptionCastDataControl();

	/**
	 * Returns the meta object for class '{@link form.LayerHolder <em>Layer Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layer Holder</em>'.
	 * @see form.LayerHolder
	 * @generated
	 */
	EClass getLayerHolder();

	/**
	 * Returns the meta object for class '{@link form.InputText <em>Input Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Text</em>'.
	 * @see form.InputText
	 * @generated
	 */
	EClass getInputText();

	/**
	 * Returns the meta object for class '{@link form.Password <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Password</em>'.
	 * @see form.Password
	 * @generated
	 */
	EClass getPassword();

	/**
	 * Returns the meta object for class '{@link form.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label</em>'.
	 * @see form.Label
	 * @generated
	 */
	EClass getLabel();

	/**
	 * Returns the meta object for the attribute '{@link form.Label#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see form.Label#getLabel()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Label();

	/**
	 * Returns the meta object for class '{@link form.MessageElement <em>Message Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Element</em>'.
	 * @see form.MessageElement
	 * @generated
	 */
	EClass getMessageElement();

	/**
	 * Returns the meta object for the attribute '{@link form.MessageElement#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see form.MessageElement#getLabel()
	 * @see #getMessageElement()
	 * @generated
	 */
	EAttribute getMessageElement_Label();

	/**
	 * Returns the meta object for class '{@link form.OutputText <em>Output Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Text</em>'.
	 * @see form.OutputText
	 * @generated
	 */
	EClass getOutputText();

	/**
	 * Returns the meta object for class '{@link form.CheckBox <em>Check Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Check Box</em>'.
	 * @see form.CheckBox
	 * @generated
	 */
	EClass getCheckBox();

	/**
	 * Returns the meta object for class '{@link form.DropDownSelection <em>Drop Down Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drop Down Selection</em>'.
	 * @see form.DropDownSelection
	 * @generated
	 */
	EClass getDropDownSelection();

	/**
	 * Returns the meta object for the containment reference '{@link form.DropDownSelection#getSelection <em>Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Selection</em>'.
	 * @see form.DropDownSelection#getSelection()
	 * @see #getDropDownSelection()
	 * @generated
	 */
	EReference getDropDownSelection_Selection();

	/**
	 * Returns the meta object for the containment reference '{@link form.DropDownSelection#getInitialOptionMessage <em>Initial Option Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initial Option Message</em>'.
	 * @see form.DropDownSelection#getInitialOptionMessage()
	 * @see #getDropDownSelection()
	 * @generated
	 */
	EReference getDropDownSelection_InitialOptionMessage();

	/**
	 * Returns the meta object for the attribute '{@link form.DropDownSelection#getInitialOptionValue <em>Initial Option Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Option Value</em>'.
	 * @see form.DropDownSelection#getInitialOptionValue()
	 * @see #getDropDownSelection()
	 * @generated
	 */
	EAttribute getDropDownSelection_InitialOptionValue();

	/**
	 * Returns the meta object for class '{@link form.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image</em>'.
	 * @see form.Image
	 * @generated
	 */
	EClass getImage();

	/**
	 * Returns the meta object for class '{@link form.Date <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date</em>'.
	 * @see form.Date
	 * @generated
	 */
	EClass getDate();

	/**
	 * Returns the meta object for class '{@link form.Button <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button</em>'.
	 * @see form.Button
	 * @generated
	 */
	EClass getButton();

	/**
	 * Returns the meta object for the attribute '{@link form.Button#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see form.Button#getLabel()
	 * @see #getButton()
	 * @generated
	 */
	EAttribute getButton_Label();

	/**
	 * Returns the meta object for class '{@link form.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column</em>'.
	 * @see form.Column
	 * @generated
	 */
	EClass getColumn();

	/**
	 * Returns the meta object for the attribute '{@link form.Column#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see form.Column#getUid()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Uid();

	/**
	 * Returns the meta object for the attribute '{@link form.Column#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see form.Column#getLabel()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Label();

	/**
	 * Returns the meta object for the containment reference '{@link form.Column#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Element</em>'.
	 * @see form.Column#getElement()
	 * @see #getColumn()
	 * @generated
	 */
	EReference getColumn_Element();

	/**
	 * Returns the meta object for class '{@link form.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see form.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the attribute '{@link form.Table#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see form.Table#getLabel()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_Label();

	/**
	 * Returns the meta object for the attribute '{@link form.Table#getRowNumber <em>Row Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Row Number</em>'.
	 * @see form.Table#getRowNumber()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_RowNumber();

	/**
	 * Returns the meta object for the containment reference list '{@link form.Table#getCols <em>Cols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cols</em>'.
	 * @see form.Table#getCols()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Cols();

	/**
	 * Returns the meta object for class '{@link form.Menu <em>Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Menu</em>'.
	 * @see form.Menu
	 * @generated
	 */
	EClass getMenu();

	/**
	 * Returns the meta object for class '{@link form.MenuView <em>Menu View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Menu View</em>'.
	 * @see form.MenuView
	 * @generated
	 */
	EClass getMenuView();

	/**
	 * Returns the meta object for the attribute '{@link form.MenuView#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see form.MenuView#getUid()
	 * @see #getMenuView()
	 * @generated
	 */
	EAttribute getMenuView_Uid();

	/**
	 * Returns the meta object for the reference '{@link form.MenuView#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see form.MenuView#getParent()
	 * @see #getMenuView()
	 * @generated
	 */
	EReference getMenuView_Parent();

	/**
	 * Returns the meta object for the containment reference list '{@link form.MenuView#getMenuFolders <em>Menu Folders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Menu Folders</em>'.
	 * @see form.MenuView#getMenuFolders()
	 * @see #getMenuView()
	 * @generated
	 */
	EReference getMenuView_MenuFolders();

	/**
	 * Returns the meta object for class '{@link form.MenuHolder <em>Menu Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Menu Holder</em>'.
	 * @see form.MenuHolder
	 * @generated
	 */
	EClass getMenuHolder();

	/**
	 * Returns the meta object for the reference '{@link form.MenuHolder#getMenu <em>Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Menu</em>'.
	 * @see form.MenuHolder#getMenu()
	 * @see #getMenuHolder()
	 * @generated
	 */
	EReference getMenuHolder_Menu();

	/**
	 * Returns the meta object for class '{@link form.MenuExtensionRef <em>Menu Extension Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Menu Extension Ref</em>'.
	 * @see form.MenuExtensionRef
	 * @generated
	 */
	EClass getMenuExtensionRef();

	/**
	 * Returns the meta object for the reference '{@link form.MenuExtensionRef#getExtensionRef <em>Extension Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Extension Ref</em>'.
	 * @see form.MenuExtensionRef#getExtensionRef()
	 * @see #getMenuExtensionRef()
	 * @generated
	 */
	EReference getMenuExtensionRef_ExtensionRef();

	/**
	 * Returns the meta object for class '{@link form.MenuElement <em>Menu Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Menu Element</em>'.
	 * @see form.MenuElement
	 * @generated
	 */
	EClass getMenuElement();

	/**
	 * Returns the meta object for the attribute '{@link form.MenuElement#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see form.MenuElement#getUid()
	 * @see #getMenuElement()
	 * @generated
	 */
	EAttribute getMenuElement_Uid();

	/**
	 * Returns the meta object for the attribute '{@link form.MenuElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see form.MenuElement#getName()
	 * @see #getMenuElement()
	 * @generated
	 */
	EAttribute getMenuElement_Name();

	/**
	 * Returns the meta object for class '{@link form.MenuFolder <em>Menu Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Menu Folder</em>'.
	 * @see form.MenuFolder
	 * @generated
	 */
	EClass getMenuFolder();

	/**
	 * Returns the meta object for the attribute '{@link form.MenuFolder#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see form.MenuFolder#getUid()
	 * @see #getMenuFolder()
	 * @generated
	 */
	EAttribute getMenuFolder_Uid();

	/**
	 * Returns the meta object for the attribute '{@link form.MenuFolder#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see form.MenuFolder#getName()
	 * @see #getMenuFolder()
	 * @generated
	 */
	EAttribute getMenuFolder_Name();

	/**
	 * Returns the meta object for the attribute '{@link form.MenuFolder#isExtensionPoint <em>Extension Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extension Point</em>'.
	 * @see form.MenuFolder#isExtensionPoint()
	 * @see #getMenuFolder()
	 * @generated
	 */
	EAttribute getMenuFolder_ExtensionPoint();

	/**
	 * Returns the meta object for the containment reference list '{@link form.MenuFolder#getMenuElements <em>Menu Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Menu Elements</em>'.
	 * @see form.MenuFolder#getMenuElements()
	 * @see #getMenuFolder()
	 * @generated
	 */
	EReference getMenuFolder_MenuElements();

	/**
	 * Returns the meta object for class '{@link form.MenuItem <em>Menu Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Menu Item</em>'.
	 * @see form.MenuItem
	 * @generated
	 */
	EClass getMenuItem();

	/**
	 * Returns the meta object for the containment reference '{@link form.MenuItem#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transition</em>'.
	 * @see form.MenuItem#getTransition()
	 * @see #getMenuItem()
	 * @generated
	 */
	EReference getMenuItem_Transition();

	/**
	 * Returns the meta object for the containment reference list '{@link form.MenuItem#getRefreshAreas <em>Refresh Areas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Refresh Areas</em>'.
	 * @see form.MenuItem#getRefreshAreas()
	 * @see #getMenuItem()
	 * @generated
	 */
	EReference getMenuItem_RefreshAreas();

	/**
	 * Returns the meta object for class '{@link form.MenuExtensionPoint <em>Menu Extension Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Menu Extension Point</em>'.
	 * @see form.MenuExtensionPoint
	 * @generated
	 */
	EClass getMenuExtensionPoint();

	/**
	 * Returns the meta object for class '{@link form.SubMenu <em>Sub Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Menu</em>'.
	 * @see form.SubMenu
	 * @generated
	 */
	EClass getSubMenu();

	/**
	 * Returns the meta object for the reference '{@link form.SubMenu#getToSubmenu <em>To Submenu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Submenu</em>'.
	 * @see form.SubMenu#getToSubmenu()
	 * @see #getSubMenu()
	 * @generated
	 */
	EReference getSubMenu_ToSubmenu();

	/**
	 * Returns the meta object for class '{@link form.MenuSeparator <em>Menu Separator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Menu Separator</em>'.
	 * @see form.MenuSeparator
	 * @generated
	 */
	EClass getMenuSeparator();

	/**
	 * Returns the meta object for class '{@link form.Tree <em>Tree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tree</em>'.
	 * @see form.Tree
	 * @generated
	 */
	EClass getTree();

	/**
	 * Returns the meta object for the attribute '{@link form.Tree#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see form.Tree#getLabel()
	 * @see #getTree()
	 * @generated
	 */
	EAttribute getTree_Label();

	/**
	 * Returns the meta object for the containment reference '{@link form.Tree#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Image</em>'.
	 * @see form.Tree#getImage()
	 * @see #getTree()
	 * @generated
	 */
	EReference getTree_Image();

	/**
	 * Returns the meta object for the containment reference list '{@link form.Tree#getCols <em>Cols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cols</em>'.
	 * @see form.Tree#getCols()
	 * @see #getTree()
	 * @generated
	 */
	EReference getTree_Cols();

	/**
	 * Returns the meta object for class '{@link form.Controls <em>Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controls</em>'.
	 * @see form.Controls
	 * @generated
	 */
	EClass getControls();

	/**
	 * Returns the meta object for the attribute '{@link form.Controls#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see form.Controls#getUid()
	 * @see #getControls()
	 * @generated
	 */
	EAttribute getControls_Uid();

	/**
	 * Returns the meta object for the containment reference '{@link form.Controls#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Root</em>'.
	 * @see form.Controls#getRoot()
	 * @see #getControls()
	 * @generated
	 */
	EReference getControls_Root();

	/**
	 * Returns the meta object for the containment reference list '{@link form.Controls#getControls <em>Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Controls</em>'.
	 * @see form.Controls#getControls()
	 * @see #getControls()
	 * @generated
	 */
	EReference getControls_Controls();

	/**
	 * Returns the meta object for the containment reference list '{@link form.Controls#getRelations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relations</em>'.
	 * @see form.Controls#getRelations()
	 * @see #getControls()
	 * @generated
	 */
	EReference getControls_Relations();

	/**
	 * Returns the meta object for the containment reference list '{@link form.Controls#getDependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dependencies</em>'.
	 * @see form.Controls#getDependencies()
	 * @see #getControls()
	 * @generated
	 */
	EReference getControls_Dependencies();

	/**
	 * Returns the meta object for class '{@link form.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger</em>'.
	 * @see form.Trigger
	 * @generated
	 */
	EClass getTrigger();

	/**
	 * Returns the meta object for class '{@link form.PREFormTrigger <em>PRE Form Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PRE Form Trigger</em>'.
	 * @see form.PREFormTrigger
	 * @generated
	 */
	EClass getPREFormTrigger();

	/**
	 * Returns the meta object for the attribute '{@link form.PREFormTrigger#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see form.PREFormTrigger#getUid()
	 * @see #getPREFormTrigger()
	 * @generated
	 */
	EAttribute getPREFormTrigger_Uid();

	/**
	 * Returns the meta object for class '{@link form.PREQueryTrigger <em>PRE Query Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PRE Query Trigger</em>'.
	 * @see form.PREQueryTrigger
	 * @generated
	 */
	EClass getPREQueryTrigger();

	/**
	 * Returns the meta object for the attribute '{@link form.PREQueryTrigger#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see form.PREQueryTrigger#getUid()
	 * @see #getPREQueryTrigger()
	 * @generated
	 */
	EAttribute getPREQueryTrigger_Uid();

	/**
	 * Returns the meta object for class '{@link form.POSTQueryTrigger <em>POST Query Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>POST Query Trigger</em>'.
	 * @see form.POSTQueryTrigger
	 * @generated
	 */
	EClass getPOSTQueryTrigger();

	/**
	 * Returns the meta object for the attribute '{@link form.POSTQueryTrigger#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see form.POSTQueryTrigger#getUid()
	 * @see #getPOSTQueryTrigger()
	 * @generated
	 */
	EAttribute getPOSTQueryTrigger_Uid();

	/**
	 * Returns the meta object for class '{@link form.PREInsertTrigger <em>PRE Insert Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PRE Insert Trigger</em>'.
	 * @see form.PREInsertTrigger
	 * @generated
	 */
	EClass getPREInsertTrigger();

	/**
	 * Returns the meta object for the attribute '{@link form.PREInsertTrigger#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see form.PREInsertTrigger#getUid()
	 * @see #getPREInsertTrigger()
	 * @generated
	 */
	EAttribute getPREInsertTrigger_Uid();

	/**
	 * Returns the meta object for class '{@link form.PREDeleteTrigger <em>PRE Delete Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PRE Delete Trigger</em>'.
	 * @see form.PREDeleteTrigger
	 * @generated
	 */
	EClass getPREDeleteTrigger();

	/**
	 * Returns the meta object for the attribute '{@link form.PREDeleteTrigger#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see form.PREDeleteTrigger#getUid()
	 * @see #getPREDeleteTrigger()
	 * @generated
	 */
	EAttribute getPREDeleteTrigger_Uid();

	/**
	 * Returns the meta object for class '{@link form.POSTCreateTrigger <em>POST Create Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>POST Create Trigger</em>'.
	 * @see form.POSTCreateTrigger
	 * @generated
	 */
	EClass getPOSTCreateTrigger();

	/**
	 * Returns the meta object for the attribute '{@link form.POSTCreateTrigger#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see form.POSTCreateTrigger#getUid()
	 * @see #getPOSTCreateTrigger()
	 * @generated
	 */
	EAttribute getPOSTCreateTrigger_Uid();

	/**
	 * Returns the meta object for class '{@link form.PREUpdateTrigger <em>PRE Update Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PRE Update Trigger</em>'.
	 * @see form.PREUpdateTrigger
	 * @generated
	 */
	EClass getPREUpdateTrigger();

	/**
	 * Returns the meta object for the attribute '{@link form.PREUpdateTrigger#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see form.PREUpdateTrigger#getUid()
	 * @see #getPREUpdateTrigger()
	 * @generated
	 */
	EAttribute getPREUpdateTrigger_Uid();

	/**
	 * Returns the meta object for class '{@link form.ProxiesList <em>Proxies List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proxies List</em>'.
	 * @see form.ProxiesList
	 * @generated
	 */
	EClass getProxiesList();

	/**
	 * Returns the meta object for the containment reference list '{@link form.ProxiesList#getTypePointers <em>Type Pointers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type Pointers</em>'.
	 * @see form.ProxiesList#getTypePointers()
	 * @see #getProxiesList()
	 * @generated
	 */
	EReference getProxiesList_TypePointers();

	/**
	 * Returns the meta object for class '{@link form.CreateTrigger <em>Create Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Trigger</em>'.
	 * @see form.CreateTrigger
	 * @generated
	 */
	EClass getCreateTrigger();

	/**
	 * Returns the meta object for the attribute '{@link form.CreateTrigger#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see form.CreateTrigger#getUid()
	 * @see #getCreateTrigger()
	 * @generated
	 */
	EAttribute getCreateTrigger_Uid();

	/**
	 * Returns the meta object for class '{@link form.InsertTrigger <em>Insert Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Insert Trigger</em>'.
	 * @see form.InsertTrigger
	 * @generated
	 */
	EClass getInsertTrigger();

	/**
	 * Returns the meta object for the attribute '{@link form.InsertTrigger#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see form.InsertTrigger#getUid()
	 * @see #getInsertTrigger()
	 * @generated
	 */
	EAttribute getInsertTrigger_Uid();

	/**
	 * Returns the meta object for class '{@link form.UpdateTrigger <em>Update Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update Trigger</em>'.
	 * @see form.UpdateTrigger
	 * @generated
	 */
	EClass getUpdateTrigger();

	/**
	 * Returns the meta object for the attribute '{@link form.UpdateTrigger#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see form.UpdateTrigger#getUid()
	 * @see #getUpdateTrigger()
	 * @generated
	 */
	EAttribute getUpdateTrigger_Uid();

	/**
	 * Returns the meta object for class '{@link form.DeleteTrigger <em>Delete Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delete Trigger</em>'.
	 * @see form.DeleteTrigger
	 * @generated
	 */
	EClass getDeleteTrigger();

	/**
	 * Returns the meta object for the attribute '{@link form.DeleteTrigger#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see form.DeleteTrigger#getUid()
	 * @see #getDeleteTrigger()
	 * @generated
	 */
	EAttribute getDeleteTrigger_Uid();

	/**
	 * Returns the meta object for class '{@link form.SearchTrigger <em>Search Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Search Trigger</em>'.
	 * @see form.SearchTrigger
	 * @generated
	 */
	EClass getSearchTrigger();

	/**
	 * Returns the meta object for the attribute '{@link form.SearchTrigger#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see form.SearchTrigger#getUid()
	 * @see #getSearchTrigger()
	 * @generated
	 */
	EAttribute getSearchTrigger_Uid();

	/**
	 * Returns the meta object for class '{@link form.Root <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root</em>'.
	 * @see form.Root
	 * @generated
	 */
	EClass getRoot();

	/**
	 * Returns the meta object for the attribute '{@link form.Root#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see form.Root#getUid()
	 * @see #getRoot()
	 * @generated
	 */
	EAttribute getRoot_Uid();

	/**
	 * Returns the meta object for the attribute '{@link form.Root#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see form.Root#getName()
	 * @see #getRoot()
	 * @generated
	 */
	EAttribute getRoot_Name();

	/**
	 * Returns the meta object for the containment reference '{@link form.Root#getPreFormTrigger <em>Pre Form Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pre Form Trigger</em>'.
	 * @see form.Root#getPreFormTrigger()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_PreFormTrigger();

	/**
	 * Returns the meta object for the containment reference list '{@link form.Root#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see form.Root#getVariables()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Variables();

	/**
	 * Returns the meta object for class '{@link form.FormVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see form.FormVariable
	 * @generated
	 */
	EClass getFormVariable();

	/**
	 * Returns the meta object for the attribute '{@link form.FormVariable#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see form.FormVariable#getUid()
	 * @see #getFormVariable()
	 * @generated
	 */
	EAttribute getFormVariable_Uid();

	/**
	 * Returns the meta object for the attribute '{@link form.FormVariable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see form.FormVariable#getName()
	 * @see #getFormVariable()
	 * @generated
	 */
	EAttribute getFormVariable_Name();

	/**
	 * Returns the meta object for the reference '{@link form.FormVariable#getParamRef <em>Param Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Param Ref</em>'.
	 * @see form.FormVariable#getParamRef()
	 * @see #getFormVariable()
	 * @generated
	 */
	EReference getFormVariable_ParamRef();

	/**
	 * Returns the meta object for class '{@link form.DataControl <em>Data Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Control</em>'.
	 * @see form.DataControl
	 * @generated
	 */
	EClass getDataControl();

	/**
	 * Returns the meta object for the attribute '{@link form.DataControl#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see form.DataControl#getUid()
	 * @see #getDataControl()
	 * @generated
	 */
	EAttribute getDataControl_Uid();

	/**
	 * Returns the meta object for the attribute '{@link form.DataControl#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see form.DataControl#getName()
	 * @see #getDataControl()
	 * @generated
	 */
	EAttribute getDataControl_Name();

	/**
	 * Returns the meta object for the containment reference '{@link form.DataControl#getBaseType <em>Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Base Type</em>'.
	 * @see form.DataControl#getBaseType()
	 * @see #getDataControl()
	 * @generated
	 */
	EReference getDataControl_BaseType();

	/**
	 * Returns the meta object for the containment reference '{@link form.DataControl#getPreQueryTrigger <em>Pre Query Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pre Query Trigger</em>'.
	 * @see form.DataControl#getPreQueryTrigger()
	 * @see #getDataControl()
	 * @generated
	 */
	EReference getDataControl_PreQueryTrigger();

	/**
	 * Returns the meta object for the containment reference '{@link form.DataControl#getPostQueryTrigger <em>Post Query Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Query Trigger</em>'.
	 * @see form.DataControl#getPostQueryTrigger()
	 * @see #getDataControl()
	 * @generated
	 */
	EReference getDataControl_PostQueryTrigger();

	/**
	 * Returns the meta object for the containment reference '{@link form.DataControl#getPreInsertTrigger <em>Pre Insert Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pre Insert Trigger</em>'.
	 * @see form.DataControl#getPreInsertTrigger()
	 * @see #getDataControl()
	 * @generated
	 */
	EReference getDataControl_PreInsertTrigger();

	/**
	 * Returns the meta object for the containment reference '{@link form.DataControl#getPreDeleteTrigger <em>Pre Delete Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pre Delete Trigger</em>'.
	 * @see form.DataControl#getPreDeleteTrigger()
	 * @see #getDataControl()
	 * @generated
	 */
	EReference getDataControl_PreDeleteTrigger();

	/**
	 * Returns the meta object for the containment reference '{@link form.DataControl#getPostCreateTrigger <em>Post Create Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Create Trigger</em>'.
	 * @see form.DataControl#getPostCreateTrigger()
	 * @see #getDataControl()
	 * @generated
	 */
	EReference getDataControl_PostCreateTrigger();

	/**
	 * Returns the meta object for the containment reference '{@link form.DataControl#getPreUpdateTrigger <em>Pre Update Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pre Update Trigger</em>'.
	 * @see form.DataControl#getPreUpdateTrigger()
	 * @see #getDataControl()
	 * @generated
	 */
	EReference getDataControl_PreUpdateTrigger();

	/**
	 * Returns the meta object for the containment reference '{@link form.DataControl#getCreate <em>Create</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Create</em>'.
	 * @see form.DataControl#getCreate()
	 * @see #getDataControl()
	 * @generated
	 */
	EReference getDataControl_Create();

	/**
	 * Returns the meta object for the containment reference '{@link form.DataControl#getInsert <em>Insert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Insert</em>'.
	 * @see form.DataControl#getInsert()
	 * @see #getDataControl()
	 * @generated
	 */
	EReference getDataControl_Insert();

	/**
	 * Returns the meta object for the containment reference '{@link form.DataControl#getUpdate <em>Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Update</em>'.
	 * @see form.DataControl#getUpdate()
	 * @see #getDataControl()
	 * @generated
	 */
	EReference getDataControl_Update();

	/**
	 * Returns the meta object for the containment reference '{@link form.DataControl#getRemove <em>Remove</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remove</em>'.
	 * @see form.DataControl#getRemove()
	 * @see #getDataControl()
	 * @generated
	 */
	EReference getDataControl_Remove();

	/**
	 * Returns the meta object for the containment reference '{@link form.DataControl#getSearch <em>Search</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Search</em>'.
	 * @see form.DataControl#getSearch()
	 * @see #getDataControl()
	 * @generated
	 */
	EReference getDataControl_Search();

	/**
	 * Returns the meta object for the containment reference list '{@link form.DataControl#getArtificialFields <em>Artificial Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Artificial Fields</em>'.
	 * @see form.DataControl#getArtificialFields()
	 * @see #getDataControl()
	 * @generated
	 */
	EReference getDataControl_ArtificialFields();

	/**
	 * Returns the meta object for the containment reference '{@link form.DataControl#getDefaultSearch <em>Default Search</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Search</em>'.
	 * @see form.DataControl#getDefaultSearch()
	 * @see #getDataControl()
	 * @generated
	 */
	EReference getDataControl_DefaultSearch();

	/**
	 * Returns the meta object for the containment reference '{@link form.DataControl#getDefaultOrderBy <em>Default Order By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Order By</em>'.
	 * @see form.DataControl#getDefaultOrderBy()
	 * @see #getDataControl()
	 * @generated
	 */
	EReference getDataControl_DefaultOrderBy();

	/**
	 * Returns the meta object for class '{@link form.Orders <em>Orders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orders</em>'.
	 * @see form.Orders
	 * @generated
	 */
	EClass getOrders();

	/**
	 * Returns the meta object for the attribute '{@link form.Orders#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see form.Orders#getUid()
	 * @see #getOrders()
	 * @generated
	 */
	EAttribute getOrders_Uid();

	/**
	 * Returns the meta object for the containment reference list '{@link form.Orders#getOrderRules <em>Order Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Order Rules</em>'.
	 * @see form.Orders#getOrderRules()
	 * @see #getOrders()
	 * @generated
	 */
	EReference getOrders_OrderRules();

	/**
	 * Returns the meta object for class '{@link form.OrderBy <em>Order By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Order By</em>'.
	 * @see form.OrderBy
	 * @generated
	 */
	EClass getOrderBy();

	/**
	 * Returns the meta object for the attribute '{@link form.OrderBy#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see form.OrderBy#getUid()
	 * @see #getOrderBy()
	 * @generated
	 */
	EAttribute getOrderBy_Uid();

	/**
	 * Returns the meta object for the reference '{@link form.OrderBy#getRefObj <em>Ref Obj</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref Obj</em>'.
	 * @see form.OrderBy#getRefObj()
	 * @see #getOrderBy()
	 * @generated
	 */
	EReference getOrderBy_RefObj();

	/**
	 * Returns the meta object for the attribute '{@link form.OrderBy#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order</em>'.
	 * @see form.OrderBy#getOrder()
	 * @see #getOrderBy()
	 * @generated
	 */
	EAttribute getOrderBy_Order();

	/**
	 * Returns the meta object for class '{@link form.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation</em>'.
	 * @see form.Relation
	 * @generated
	 */
	EClass getRelation();

	/**
	 * Returns the meta object for the attribute '{@link form.Relation#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see form.Relation#getUid()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_Uid();

	/**
	 * Returns the meta object for the attribute '{@link form.Relation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see form.Relation#getName()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_Name();

	/**
	 * Returns the meta object for the reference '{@link form.Relation#getMaster <em>Master</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Master</em>'.
	 * @see form.Relation#getMaster()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_Master();

	/**
	 * Returns the meta object for the reference '{@link form.Relation#getDetail <em>Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Detail</em>'.
	 * @see form.Relation#getDetail()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_Detail();

	/**
	 * Returns the meta object for the attribute '{@link form.Relation#isIsTree <em>Is Tree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Tree</em>'.
	 * @see form.Relation#isIsTree()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_IsTree();

	/**
	 * Returns the meta object for the containment reference list '{@link form.Relation#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see form.Relation#getLinks()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_Links();

	/**
	 * Returns the meta object for class '{@link form.Dependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependency</em>'.
	 * @see form.Dependency
	 * @generated
	 */
	EClass getDependency();

	/**
	 * Returns the meta object for the attribute '{@link form.Dependency#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see form.Dependency#getUid()
	 * @see #getDependency()
	 * @generated
	 */
	EAttribute getDependency_Uid();

	/**
	 * Returns the meta object for the attribute '{@link form.Dependency#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see form.Dependency#getName()
	 * @see #getDependency()
	 * @generated
	 */
	EAttribute getDependency_Name();

	/**
	 * Returns the meta object for the reference '{@link form.Dependency#getMaster <em>Master</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Master</em>'.
	 * @see form.Dependency#getMaster()
	 * @see #getDependency()
	 * @generated
	 */
	EReference getDependency_Master();

	/**
	 * Returns the meta object for the reference '{@link form.Dependency#getDetail <em>Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Detail</em>'.
	 * @see form.Dependency#getDetail()
	 * @see #getDependency()
	 * @generated
	 */
	EReference getDependency_Detail();

	/**
	 * Returns the meta object for class '{@link form.ArtificialField <em>Artificial Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artificial Field</em>'.
	 * @see form.ArtificialField
	 * @generated
	 */
	EClass getArtificialField();

	/**
	 * Returns the meta object for the attribute '{@link form.ArtificialField#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see form.ArtificialField#getUid()
	 * @see #getArtificialField()
	 * @generated
	 */
	EAttribute getArtificialField_Uid();

	/**
	 * Returns the meta object for the attribute '{@link form.ArtificialField#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see form.ArtificialField#getName()
	 * @see #getArtificialField()
	 * @generated
	 */
	EAttribute getArtificialField_Name();

	/**
	 * Returns the meta object for class '{@link form.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see form.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the attribute '{@link form.Link#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see form.Link#getUid()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Uid();

	/**
	 * Returns the meta object for the reference '{@link form.Link#getMasterField <em>Master Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Master Field</em>'.
	 * @see form.Link#getMasterField()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_MasterField();

	/**
	 * Returns the meta object for the reference '{@link form.Link#getDetailField <em>Detail Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Detail Field</em>'.
	 * @see form.Link#getDetailField()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_DetailField();

	/**
	 * Returns the meta object for enum '{@link form.Comparator <em>Comparator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Comparator</em>'.
	 * @see form.Comparator
	 * @generated
	 */
	EEnum getComparator();

	/**
	 * Returns the meta object for enum '{@link form.Order <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Order</em>'.
	 * @see form.Order
	 * @generated
	 */
	EEnum getOrder();

	/**
	 * Returns the meta object for enum '{@link form.Orientation <em>Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Orientation</em>'.
	 * @see form.Orientation
	 * @generated
	 */
	EEnum getOrientation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FormFactory getFormFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link form.impl.FormImpl <em>Form</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.impl.FormImpl
		 * @see form.impl.FormPackageImpl#getForm()
		 * @generated
		 */
		EClass FORM = eINSTANCE.getForm();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM__UID = eINSTANCE.getForm_Uid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM__NAME = eINSTANCE.getForm_Name();

		/**
		 * The meta object literal for the '<em><b>View</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM__VIEW = eINSTANCE.getForm_View();

		/**
		 * The meta object literal for the '<em><b>Datacontrols</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM__DATACONTROLS = eINSTANCE.getForm_Datacontrols();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM__PARAMETERS = eINSTANCE.getForm_Parameters();

		/**
		 * The meta object literal for the '{@link form.impl.FormParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.impl.FormParameterImpl
		 * @see form.impl.FormPackageImpl#getFormParameter()
		 * @generated
		 */
		EClass FORM_PARAMETER = eINSTANCE.getFormParameter();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_PARAMETER__UID = eINSTANCE.getFormParameter_Uid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_PARAMETER__NAME = eINSTANCE.getFormParameter_Name();

		/**
		 * The meta object literal for the '{@link form.impl.ViewsImpl <em>Views</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.impl.ViewsImpl
		 * @see form.impl.FormPackageImpl#getViews()
		 * @generated
		 */
		EClass VIEWS = eINSTANCE.getViews();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEWS__UID = eINSTANCE.getViews_Uid();

		/**
		 * The meta object literal for the '<em><b>Canvases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEWS__CANVASES = eINSTANCE.getViews_Canvases();

		/**
		 * The meta object literal for the '<em><b>View Inheritances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEWS__VIEW_INHERITANCES = eINSTANCE.getViews_ViewInheritances();

		/**
		 * The meta object literal for the '<em><b>Tab Pages Inheritances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEWS__TAB_PAGES_INHERITANCES = eINSTANCE.getViews_TabPagesInheritances();

		/**
		 * The meta object literal for the '<em><b>Menus</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEWS__MENUS = eINSTANCE.getViews_Menus();

		/**
		 * The meta object literal for the '{@link form.impl.HTMLLayerHolderImpl <em>HTML Layer Holder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.impl.HTMLLayerHolderImpl
		 * @see form.impl.FormPackageImpl#getHTMLLayerHolder()
		 * @generated
		 */
		EClass HTML_LAYER_HOLDER = eINSTANCE.getHTMLLayerHolder();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTML_LAYER_HOLDER__COLUMNS = eINSTANCE.getHTMLLayerHolder_Columns();

		/**
		 * The meta object literal for the '{@link form.impl.OrderableImpl <em>Orderable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.impl.OrderableImpl
		 * @see form.impl.FormPackageImpl#getOrderable()
		 * @generated
		 */
		EClass ORDERABLE = eINSTANCE.getOrderable();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDERABLE__ORDER = eINSTANCE.getOrderable_Order();

		/**
		 * The meta object literal for the '{@link form.impl.MultiLangLabelImpl <em>Multi Lang Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.impl.MultiLangLabelImpl
		 * @see form.impl.FormPackageImpl#getMultiLangLabel()
		 * @generated
		 */
		EClass MULTI_LANG_LABEL = eINSTANCE.getMultiLangLabel();

		/**
		 * The meta object literal for the '<em><b>Multi Lang Label</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTI_LANG_LABEL__MULTI_LANG_LABEL = eINSTANCE.getMultiLangLabel_MultiLangLabel();

		/**
		 * The meta object literal for the '{@link form.impl.CanvasFrameImpl <em>Canvas Frame</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.impl.CanvasFrameImpl
		 * @see form.impl.FormPackageImpl#getCanvasFrame()
		 * @generated
		 */
		EClass CANVAS_FRAME = eINSTANCE.getCanvasFrame();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CANVAS_FRAME__UID = eINSTANCE.getCanvasFrame_Uid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CANVAS_FRAME__NAME = eINSTANCE.getCanvasFrame_Name();

		/**
		 * The meta object literal for the '{@link form.impl.ViewPortHolderImpl <em>View Port Holder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.impl.ViewPortHolderImpl
		 * @see form.impl.FormPackageImpl#getViewPortHolder()
		 * @generated
		 */
		EClass VIEW_PORT_HOLDER = eINSTANCE.getViewPortHolder();

		/**
		 * The meta object literal for the '<em><b>View Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_PORT_HOLDER__VIEW_ELEMENT = eINSTANCE.getViewPortHolder_ViewElement();

		/**
		 * The meta object literal for the '{@link form.impl.DefaultCavasImpl <em>Default Cavas</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.impl.DefaultCavasImpl
		 * @see form.impl.FormPackageImpl#getDefaultCavas()
		 * @generated
		 */
		EClass DEFAULT_CAVAS = eINSTANCE.getDefaultCavas();

		/**
		 * The meta object literal for the '<em><b>Default Canvas</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_CAVAS__DEFAULT_CANVAS = eINSTANCE.getDefaultCavas_DefaultCanvas();

		/**
		 * The meta object literal for the '{@link form.impl.ViewElementImpl <em>View Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.impl.ViewElementImpl
		 * @see form.impl.FormPackageImpl#getViewElement()
		 * @generated
		 */
		EClass VIEW_ELEMENT = eINSTANCE.getViewElement();

		/**
		 * The meta object literal for the '{@link form.impl.PopupCanvasImpl <em>Popup Canvas</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.impl.PopupCanvasImpl
		 * @see form.impl.FormPackageImpl#getPopupCanvas()
		 * @generated
		 */
		EClass POPUP_CANVAS = eINSTANCE.getPopupCanvas();

		/**
		 * The meta object literal for the '<em><b>Modal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POPUP_CANVAS__MODAL = eINSTANCE.getPopupCanvas_Modal();

		/**
		 * The meta object literal for the '{@link form.impl.CanvasImpl <em>Canvas</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.impl.CanvasImpl
		 * @see form.impl.FormPackageImpl#getCanvas()
		 * @generated
		 */
		EClass CANVAS = eINSTANCE.getCanvas();

		/**
		 * The meta object literal for the '{@link form.impl.WindowImpl <em>Window</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.impl.WindowImpl
		 * @see form.impl.FormPackageImpl#getWindow()
		 * @generated
		 */
		EClass WINDOW = eINSTANCE.getWindow();

		/**
		 * The meta object literal for the '{@link form.impl.MenuDefinitionImpl <em>Menu Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.impl.MenuDefinitionImpl
		 * @see form.impl.FormPackageImpl#getMenuDefinition()
		 * @generated
		 */
		EClass MENU_DEFINITION = eINSTANCE.getMenuDefinition();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MENU_DEFINITION__UID = eINSTANCE.getMenuDefinition_Uid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MENU_DEFINITION__NAME = eINSTANCE.getMenuDefinition_Name();

		/**
		 * The meta object literal for the '<em><b>Menu View</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MENU_DEFINITION__MENU_VIEW = eINSTANCE.getMenuDefinition_MenuView();

		/**
		 * The meta object literal for the '{@link form.impl.TabCanvasImpl <em>Tab Canvas</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.impl.TabCanvasImpl
		 * @see form.impl.FormPackageImpl#getTabCanvas()
		 * @generated
		 */
		EClass TAB_CANVAS = eINSTANCE.getTabCanvas();

		/**
		 * The meta object literal for the '<em><b>Orientation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAB_CANVAS__ORIENTATION = eINSTANCE.getTabCanvas_Orientation();

		/**
		 * The meta object literal for the '{@link form.impl.TabPageImpl <em>Tab Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.impl.TabPageImpl
		 * @see form.impl.FormPackageImpl#getTabPage()
		 * @generated
		 */
		EClass TAB_PAGE = eINSTANCE.getTabPage();

		/**
		 * The meta object literal for the '{@link form.impl.ViewPortImpl <em>View Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.impl.ViewPortImpl
		 * @see form.impl.FormPackageImpl#getViewPort()
		 * @generated
		 */
		EClass VIEW_PORT = eINSTANCE.getViewPort();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_PORT__UID = eINSTANCE.getViewPort_Uid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_PORT__NAME = eINSTANCE.getViewPort_Name();

		/**
		 * The meta object literal for the '<em><b>View Port Trigger</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_PORT__VIEW_PORT_TRIGGER = eINSTANCE.getViewPort_ViewPortTrigger();

		/**
		 * The meta object literal for the '{@link form.impl.ViewAreaImpl <em>View Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.impl.ViewAreaImpl
		 * @see form.impl.FormPackageImpl#getViewArea()
		 * @generated
		 */
		EClass VIEW_AREA = eINSTANCE.getViewArea();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_AREA__UID = eINSTANCE.getViewArea_Uid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_AREA__NAME = eINSTANCE.getViewArea_Name();

		/**
		 * The meta object literal for the '<em><b>Base Canvas</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_AREA__BASE_CANVAS = eINSTANCE.getViewArea_BaseCanvas();

		/**
		 * The meta object literal for the '<em><b>Link To Labels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_AREA__LINK_TO_LABELS = eINSTANCE.getViewArea_LinkToLabels();

		/**
		 * The meta object literal for the '<em><b>Link To Messages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_AREA__LINK_TO_MESSAGES = eINSTANCE.getViewArea_LinkToMessages();

		/**
		 * The meta object literal for the '{@link form.impl.ViewPortTriggerImpl <em>View Port Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.impl.ViewPortTriggerImpl
		 * @see form.impl.FormPackageImpl#getViewPortTrigger()
		 * @generated
		 */
		EClass VIEW_PORT_TRIGGER = eINSTANCE.getViewPortTrigger();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_PORT_TRIGGER__UID = eINSTANCE.getViewPortTrigger_Uid();

		/**
		 * The meta object literal for the '{@link form.impl.ViewInheritanceImpl <em>View Inheritance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.impl.ViewInheritanceImpl
		 * @see form.impl.FormPackageImpl#getViewInheritance()
		 * @generated
		 */
		EClass VIEW_INHERITANCE = eINSTANCE.getViewInheritance();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_INHERITANCE__UID = eINSTANCE.getViewInheritance_Uid();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_INHERITANCE__SOURCE = eINSTANCE.getViewInheritance_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_INHERITANCE__TARGET = eINSTANCE.getViewInheritance_Target();

		/**
		 * The meta object literal for the '{@link form.impl.TabPagesInheritanceImpl <em>Tab Pages Inheritance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.impl.TabPagesInheritanceImpl
		 * @see form.impl.FormPackageImpl#getTabPagesInheritance()
		 * @generated
		 */
		EClass TAB_PAGES_INHERITANCE = eINSTANCE.getTabPagesInheritance();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAB_PAGES_INHERITANCE__UID = eINSTANCE.getTabPagesInheritance_Uid();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAB_PAGES_INHERITANCE__SOURCE = eINSTANCE.getTabPagesInheritance_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAB_PAGES_INHERITANCE__TARGET = eINSTANCE.getTabPagesInheritance_Target();

		/**
		 * The meta object literal for the '{@link form.impl.LinkToMessageImpl <em>Link To Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.impl.LinkToMessageImpl
		 * @see form.impl.FormPackageImpl#getLinkToMessage()
		 * @generated
		 */
		EClass LINK_TO_MESSAGE = eINSTANCE.getLinkToMessage();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_TO_MESSAGE__UID = eINSTANCE.getLinkToMessage_Uid();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_TO_MESSAGE__SOURCE = eINSTANCE.getLinkToMessage_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_TO_MESSAGE__TARGET = eINSTANCE.getLinkToMessage_Target();

		/**
		 * The meta object literal for the '{@link form.impl.LinkToLabelImpl <em>Link To Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.impl.LinkToLabelImpl
		 * @see form.impl.FormPackageImpl#getLinkToLabel()
		 * @generated
		 */
		EClass LINK_TO_LABEL = eINSTANCE.getLinkToLabel();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_TO_LABEL__UID = eINSTANCE.getLinkToLabel_Uid();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_TO_LABEL__SOURCE = eINSTANCE.getLinkToLabel_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_TO_LABEL__TARGET = eINSTANCE.getLinkToLabel_Target();

		/**
		 * The meta object literal for the '{@link form.impl.ChildrenHolderImpl <em>Children Holder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.impl.ChildrenHolderImpl
		 * @see form.impl.FormPackageImpl#getChildrenHolder()
		 * @generated
		 */
		EClass CHILDREN_HOLDER = eINSTANCE.getChildrenHolder();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHILDREN_HOLDER__CHILDREN = eINSTANCE.getChildrenHolder_Children();

		/**
		 * The meta object literal for the '{@link form.impl.ContextParameterImpl <em>Context Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.impl.ContextParameterImpl
		 * @see form.impl.FormPackageImpl#getContextParameter()
		 * @generated
		 */
		EClass CONTEXT_PARAMETER = eINSTANCE.getContextParameter();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT_PARAMETER__UID = eINSTANCE.getContextParameter_Uid();

		/**
		 * The meta object literal for the '<em><b>Ref Obj</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_PARAMETER__REF_OBJ = eINSTANCE.getContextParameter_RefObj();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT_PARAMETER__OPERATION = eINSTANCE.getContextParameter_Operation();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_PARAMETER__VALUE = eINSTANCE.getContextParameter_Value();

		/**
		 * The meta object literal for the '{@link form.impl.ContextValueImpl <em>Context Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.impl.ContextValueImpl
		 * @see form.impl.FormPackageImpl#getContextValue()
		 * @generated
		 */
		EClass CONTEXT_VALUE = eINSTANCE.getContextValue();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT_VALUE__UID = eINSTANCE.getContextValue_Uid();

		/**
		 * The meta object literal for the '<em><b>Constant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT_VALUE__CONSTANT = eINSTANCE.getContextValue_Constant();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT_VALUE__VALUE = eINSTANCE.getContextValue_Value();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_VALUE__EXPRESSION = eINSTANCE.getContextValue_Expression();

		/**
		 * The meta object literal for the '{@link form.impl.ExpressionPartImpl <em>Expression Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.impl.ExpressionPartImpl
		 * @see form.impl.FormPackageImpl#getExpressionPart()
		 * @generated
		 */
		EClass EXPRESSION_PART = eINSTANCE.getExpressionPart();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION_PART__UID = eINSTANCE.getExpressionPart_Uid();

		/**
		 * The meta object literal for the '<em><b>Obj Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_PART__OBJ_REF = eINSTANCE.getExpressionPart_ObjRef();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION_PART__ORDER = eINSTANCE.getExpressionPart_Order();

		/**
		 * The meta object literal for the '<em><b>Expression Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION_PART__EXPRESSION_TYPE = eINSTANCE.getExpressionPart_ExpressionType();

		/**
		 * The meta object literal for the '{@link form.impl.ContextParametersImpl <em>Context Parameters</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.impl.ContextParametersImpl
		 * @see form.impl.FormPackageImpl#getContextParameters()
		 * @generated
		 */
		EClass CONTEXT_PARAMETERS = eINSTANCE.getContextParameters();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_PARAMETERS__PARAMETERS = eINSTANCE.getContextParameters_Parameters();

		/**
		 * The meta object literal for the '{@link form.impl.ContextImpl <em>Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.impl.ContextImpl
		 * @see form.impl.FormPackageImpl#getContext()
		 * @generated
		 */
		EClass CONTEXT = eINSTANCE.getContext();

		/**
		 * The meta object literal for the '{@link form.impl.StyleElementImpl <em>Style Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.impl.StyleElementImpl
		 * @see form.impl.FormPackageImpl#getStyleElement()
		 * @generated
		 */
		EClass STYLE_ELEMENT = eINSTANCE.getStyleElement();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STYLE_ELEMENT__STYLE = eINSTANCE.getStyleElement_Style();

		/**
		 * The meta object literal for the '<em><b>Style Class</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STYLE_ELEMENT__STYLE_CLASS = eINSTANCE.getStyleElement_StyleClass();

		/**
		 * The meta object literal for the '{@link form.impl.StyleClassImpl <em>Style Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.impl.StyleClassImpl
		 * @see form.impl.FormPackageImpl#getStyleClass()
		 * @generated
		 */
		EClass STYLE_CLASS = eINSTANCE.getStyleClass();

		/**
		 * The meta object literal for the '<em><b>Classifier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STYLE_CLASS__CLASSIFIER = eINSTANCE.getStyleClass_Classifier();

		/**
		 * The meta object literal for the '{@link form.impl.NickNamedImpl <em>Nick Named</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.impl.NickNamedImpl
		 * @see form.impl.FormPackageImpl#getNickNamed()
		 * @generated
		 */
		EClass NICK_NAMED = eINSTANCE.getNickNamed();

		/**
		 * The meta object literal for the '<em><b>Nickname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NICK_NAMED__NICKNAME = eINSTANCE.getNickNamed_Nickname();

		/**
		 * The meta object literal for the '{@link form.impl.FlexFieldsImpl <em>Flex Fields</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.impl.FlexFieldsImpl
		 * @see form.impl.FormPackageImpl#getFlexFields()
		 * @generated
		 */
		EClass FLEX_FIELDS = eINSTANCE.getFlexFields();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLEX_FIELDS__FIELDS = eINSTANCE.getFlexFields_Fields();

		/**
		 * The meta object literal for the '{@link form.impl.FlexFieldImpl <em>Flex Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.impl.FlexFieldImpl
		 * @see form.impl.FormPackageImpl#getFlexField()
		 * @generated
		 */
		EClass FLEX_FIELD = eINSTANCE.getFlexField();

		/**
		 * The meta object literal for the '{@link form.impl.EnabledUIItemImpl <em>Enabled UI Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.impl.EnabledUIItemImpl
		 * @see form.impl.FormPackageImpl#getEnabledUIItem()
		 * @generated
		 */
		EClass ENABLED_UI_ITEM = eINSTANCE.getEnabledUIItem();

		/**
		 * The meta object literal for the '<em><b>Enabled</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENABLED_UI_ITEM__ENABLED = eINSTANCE.getEnabledUIItem_Enabled();

		/**
		 * The meta object literal for the '{@link form.impl.UielementImpl <em>Uielement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.impl.UielementImpl
		 * @see form.impl.FormPackageImpl#getUielement()
		 * @generated
		 */
		EClass UIELEMENT = eINSTANCE.getUielement();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UIELEMENT__UID = eINSTANCE.getUielement_Uid();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UIELEMENT__REQUIRED = eINSTANCE.getUielement_Required();

		/**
		 * The meta object literal for the '<em><b>Read Only</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UIELEMENT__READ_ONLY = eINSTANCE.getUielement_ReadOnly();

		/**
		 * The meta object literal for the '<em><b>Refresh Areas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UIELEMENT__REFRESH_AREAS = eINSTANCE.getUielement_RefreshAreas();

		/**
		 * The meta object literal for the '{@link form.impl.ItemIconImpl <em>Item Icon</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.impl.ItemIconImpl
		 * @see form.impl.FormPackageImpl#getItemIcon()
		 * @generated
		 */
		EClass ITEM_ICON = eINSTANCE.getItemIcon();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM_ICON__ICON = eINSTANCE.getItemIcon_Icon();

		/**
		 * The meta object literal for the '{@link form.impl.AreaRefImpl <em>Area Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.impl.AreaRefImpl
		 * @see form.impl.FormPackageImpl#getAreaRef()
		 * @generated
		 */
		EClass AREA_REF = eINSTANCE.getAreaRef();

		/**
		 * The meta object literal for the '<em><b>Area</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AREA_REF__AREA = eINSTANCE.getAreaRef_Area();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AREA_REF__GROUP = eINSTANCE.getAreaRef_Group();

		/**
		 * The meta object literal for the '{@link form.impl.FormatableImpl <em>Formatable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.impl.FormatableImpl
		 * @see form.impl.FormPackageImpl#getFormatable()
		 * @generated
		 */
		EClass FORMATABLE = eINSTANCE.getFormatable();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMATABLE__FORMAT = eINSTANCE.getFormatable_Format();

		/**
		 * The meta object literal for the '{@link form.impl.SourcesPointerImpl <em>Sources Pointer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.impl.SourcesPointerImpl
		 * @see form.impl.FormPackageImpl#getSourcesPointer()
		 * @generated
		 */
		EClass SOURCES_POINTER = eINSTANCE.getSourcesPointer();

		/**
		 * The meta object literal for the '<em><b>Source Pointer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCES_POINTER__SOURCE_POINTER = eINSTANCE.getSourcesPointer_SourcePointer();

		/**
		 * The meta object literal for the '<em><b>Value Pointer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCES_POINTER__VALUE_POINTER = eINSTANCE.getSourcesPointer_ValuePointer();

		/**
		 * The meta object literal for the '<em><b>Source Cast</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCES_POINTER__SOURCE_CAST = eINSTANCE.getSourcesPointer_SourceCast();

		/**
		 * The meta object literal for the '<em><b>Source Cast Data Control</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCES_POINTER__SOURCE_CAST_DATA_CONTROL = eINSTANCE.getSourcesPointer_SourceCastDataControl();

		/**
		 * The meta object literal for the '{@link form.impl.InputElementImpl <em>Input Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.impl.InputElementImpl
		 * @see form.impl.FormPackageImpl#getInputElement()
		 * @generated
		 */
		EClass INPUT_ELEMENT = eINSTANCE.getInputElement();

		/**
		 * The meta object literal for the '{@link form.impl.SelectionImpl <em>Selection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.impl.SelectionImpl
		 * @see form.impl.FormPackageImpl#getSelection()
		 * @generated
		 */
		EClass SELECTION = eINSTANCE.getSelection();

		/**
		 * The meta object literal for the '<em><b>Display Option Pointer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECTION__DISPLAY_OPTION_POINTER = eINSTANCE.getSelection_DisplayOptionPointer();

		/**
		 * The meta object literal for the '<em><b>Value Option Pointer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECTION__VALUE_OPTION_POINTER = eINSTANCE.getSelection_ValueOptionPointer();

		/**
		 * The meta object literal for the '{@link form.impl.OptionSelectionImpl <em>Option Selection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.impl.OptionSelectionImpl
		 * @see form.impl.FormPackageImpl#getOptionSelection()
		 * @generated
		 */
		EClass OPTION_SELECTION = eINSTANCE.getOptionSelection();

		/**
		 * The meta object literal for the '<em><b>Option Pointer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPTION_SELECTION__OPTION_POINTER = eINSTANCE.getOptionSelection_OptionPointer();

		/**
		 * The meta object literal for the '<em><b>Option Cast</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPTION_SELECTION__OPTION_CAST = eINSTANCE.getOptionSelection_OptionCast();

		/**
		 * The meta object literal for the '<em><b>Option Cast Data Control</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPTION_SELECTION__OPTION_CAST_DATA_CONTROL = eINSTANCE.getOptionSelection_OptionCastDataControl();

		/**
		 * The meta object literal for the '{@link form.impl.LayerHolderImpl <em>Layer Holder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.impl.LayerHolderImpl
		 * @see form.impl.FormPackageImpl#getLayerHolder()
		 * @generated
		 */
		EClass LAYER_HOLDER = eINSTANCE.getLayerHolder();

		/**
		 * The meta object literal for the '{@link form.impl.InputTextImpl <em>Input Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.impl.InputTextImpl
		 * @see form.impl.FormPackageImpl#getInputText()
		 * @generated
		 */
		EClass INPUT_TEXT = eINSTANCE.getInputText();

		/**
		 * The meta object literal for the '{@link form.impl.PasswordImpl <em>Password</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.impl.PasswordImpl
		 * @see form.impl.FormPackageImpl#getPassword()
		 * @generated
		 */
		EClass PASSWORD = eINSTANCE.getPassword();

		/**
		 * The meta object literal for the '{@link form.impl.LabelImpl <em>Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.impl.LabelImpl
		 * @see form.impl.FormPackageImpl#getLabel()
		 * @generated
		 */
		EClass LABEL = eINSTANCE.getLabel();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__LABEL = eINSTANCE.getLabel_Label();

		/**
		 * The meta object literal for the '{@link form.impl.MessageElementImpl <em>Message Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.impl.MessageElementImpl
		 * @see form.impl.FormPackageImpl#getMessageElement()
		 * @generated
		 */
		EClass MESSAGE_ELEMENT = eINSTANCE.getMessageElement();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_ELEMENT__LABEL = eINSTANCE.getMessageElement_Label();

		/**
		 * The meta object literal for the '{@link form.impl.OutputTextImpl <em>Output Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.impl.OutputTextImpl
		 * @see form.impl.FormPackageImpl#getOutputText()
		 * @generated
		 */
		EClass OUTPUT_TEXT = eINSTANCE.getOutputText();

		/**
		 * The meta object literal for the '{@link form.impl.CheckBoxImpl <em>Check Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.impl.CheckBoxImpl
		 * @see form.impl.FormPackageImpl#getCheckBox()
		 * @generated
		 */
		EClass CHECK_BOX = eINSTANCE.getCheckBox();

		/**
		 * The meta object literal for the '{@link form.impl.DropDownSelectionImpl <em>Drop Down Selection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.impl.DropDownSelectionImpl
		 * @see form.impl.FormPackageImpl#getDropDownSelection()
		 * @generated
		 */
		EClass DROP_DOWN_SELECTION = eINSTANCE.getDropDownSelection();

		/**
		 * The meta object literal for the '<em><b>Selection</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DROP_DOWN_SELECTION__SELECTION = eINSTANCE.getDropDownSelection_Selection();

		/**
		 * The meta object literal for the '<em><b>Initial Option Message</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DROP_DOWN_SELECTION__INITIAL_OPTION_MESSAGE = eINSTANCE.getDropDownSelection_InitialOptionMessage();

		/**
		 * The meta object literal for the '<em><b>Initial Option Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DROP_DOWN_SELECTION__INITIAL_OPTION_VALUE = eINSTANCE.getDropDownSelection_InitialOptionValue();

		/**
		 * The meta object literal for the '{@link form.impl.ImageImpl <em>Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.impl.ImageImpl
		 * @see form.impl.FormPackageImpl#getImage()
		 * @generated
		 */
		EClass IMAGE = eINSTANCE.getImage();

		/**
		 * The meta object literal for the '{@link form.impl.DateImpl <em>Date</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.impl.DateImpl
		 * @see form.impl.FormPackageImpl#getDate()
		 * @generated
		 */
		EClass DATE = eINSTANCE.getDate();

		/**
		 * The meta object literal for the '{@link form.impl.ButtonImpl <em>Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.impl.ButtonImpl
		 * @see form.impl.FormPackageImpl#getButton()
		 * @generated
		 */
		EClass BUTTON = eINSTANCE.getButton();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUTTON__LABEL = eINSTANCE.getButton_Label();

		/**
		 * The meta object literal for the '{@link form.impl.ColumnImpl <em>Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.impl.ColumnImpl
		 * @see form.impl.FormPackageImpl#getColumn()
		 * @generated
		 */
		EClass COLUMN = eINSTANCE.getColumn();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__UID = eINSTANCE.getColumn_Uid();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__LABEL = eINSTANCE.getColumn_Label();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMN__ELEMENT = eINSTANCE.getColumn_Element();

		/**
		 * The meta object literal for the '{@link form.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.impl.TableImpl
		 * @see form.impl.FormPackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__LABEL = eINSTANCE.getTable_Label();

		/**
		 * The meta object literal for the '<em><b>Row Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__ROW_NUMBER = eINSTANCE.getTable_RowNumber();

		/**
		 * The meta object literal for the '<em><b>Cols</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__COLS = eINSTANCE.getTable_Cols();

		/**
		 * The meta object literal for the '{@link form.impl.MenuImpl <em>Menu</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.impl.MenuImpl
		 * @see form.impl.FormPackageImpl#getMenu()
		 * @generated
		 */
		EClass MENU = eINSTANCE.getMenu();

		/**
		 * The meta object literal for the '{@link form.impl.MenuViewImpl <em>Menu View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.impl.MenuViewImpl
		 * @see form.impl.FormPackageImpl#getMenuView()
		 * @generated
		 */
		EClass MENU_VIEW = eINSTANCE.getMenuView();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MENU_VIEW__UID = eINSTANCE.getMenuView_Uid();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MENU_VIEW__PARENT = eINSTANCE.getMenuView_Parent();

		/**
		 * The meta object literal for the '<em><b>Menu Folders</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MENU_VIEW__MENU_FOLDERS = eINSTANCE.getMenuView_MenuFolders();

		/**
		 * The meta object literal for the '{@link form.impl.MenuHolderImpl <em>Menu Holder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.impl.MenuHolderImpl
		 * @see form.impl.FormPackageImpl#getMenuHolder()
		 * @generated
		 */
		EClass MENU_HOLDER = eINSTANCE.getMenuHolder();

		/**
		 * The meta object literal for the '<em><b>Menu</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MENU_HOLDER__MENU = eINSTANCE.getMenuHolder_Menu();

		/**
		 * The meta object literal for the '{@link form.impl.MenuExtensionRefImpl <em>Menu Extension Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.impl.MenuExtensionRefImpl
		 * @see form.impl.FormPackageImpl#getMenuExtensionRef()
		 * @generated
		 */
		EClass MENU_EXTENSION_REF = eINSTANCE.getMenuExtensionRef();

		/**
		 * The meta object literal for the '<em><b>Extension Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MENU_EXTENSION_REF__EXTENSION_REF = eINSTANCE.getMenuExtensionRef_ExtensionRef();

		/**
		 * The meta object literal for the '{@link form.impl.MenuElementImpl <em>Menu Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.impl.MenuElementImpl
		 * @see form.impl.FormPackageImpl#getMenuElement()
		 * @generated
		 */
		EClass MENU_ELEMENT = eINSTANCE.getMenuElement();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MENU_ELEMENT__UID = eINSTANCE.getMenuElement_Uid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MENU_ELEMENT__NAME = eINSTANCE.getMenuElement_Name();

		/**
		 * The meta object literal for the '{@link form.impl.MenuFolderImpl <em>Menu Folder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.impl.MenuFolderImpl
		 * @see form.impl.FormPackageImpl#getMenuFolder()
		 * @generated
		 */
		EClass MENU_FOLDER = eINSTANCE.getMenuFolder();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MENU_FOLDER__UID = eINSTANCE.getMenuFolder_Uid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MENU_FOLDER__NAME = eINSTANCE.getMenuFolder_Name();

		/**
		 * The meta object literal for the '<em><b>Extension Point</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MENU_FOLDER__EXTENSION_POINT = eINSTANCE.getMenuFolder_ExtensionPoint();

		/**
		 * The meta object literal for the '<em><b>Menu Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MENU_FOLDER__MENU_ELEMENTS = eINSTANCE.getMenuFolder_MenuElements();

		/**
		 * The meta object literal for the '{@link form.impl.MenuItemImpl <em>Menu Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.impl.MenuItemImpl
		 * @see form.impl.FormPackageImpl#getMenuItem()
		 * @generated
		 */
		EClass MENU_ITEM = eINSTANCE.getMenuItem();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MENU_ITEM__TRANSITION = eINSTANCE.getMenuItem_Transition();

		/**
		 * The meta object literal for the '<em><b>Refresh Areas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MENU_ITEM__REFRESH_AREAS = eINSTANCE.getMenuItem_RefreshAreas();

		/**
		 * The meta object literal for the '{@link form.impl.MenuExtensionPointImpl <em>Menu Extension Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.impl.MenuExtensionPointImpl
		 * @see form.impl.FormPackageImpl#getMenuExtensionPoint()
		 * @generated
		 */
		EClass MENU_EXTENSION_POINT = eINSTANCE.getMenuExtensionPoint();

		/**
		 * The meta object literal for the '{@link form.impl.SubMenuImpl <em>Sub Menu</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.impl.SubMenuImpl
		 * @see form.impl.FormPackageImpl#getSubMenu()
		 * @generated
		 */
		EClass SUB_MENU = eINSTANCE.getSubMenu();

		/**
		 * The meta object literal for the '<em><b>To Submenu</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_MENU__TO_SUBMENU = eINSTANCE.getSubMenu_ToSubmenu();

		/**
		 * The meta object literal for the '{@link form.impl.MenuSeparatorImpl <em>Menu Separator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.impl.MenuSeparatorImpl
		 * @see form.impl.FormPackageImpl#getMenuSeparator()
		 * @generated
		 */
		EClass MENU_SEPARATOR = eINSTANCE.getMenuSeparator();

		/**
		 * The meta object literal for the '{@link form.impl.TreeImpl <em>Tree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.impl.TreeImpl
		 * @see form.impl.FormPackageImpl#getTree()
		 * @generated
		 */
		EClass TREE = eINSTANCE.getTree();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TREE__LABEL = eINSTANCE.getTree_Label();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TREE__IMAGE = eINSTANCE.getTree_Image();

		/**
		 * The meta object literal for the '<em><b>Cols</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TREE__COLS = eINSTANCE.getTree_Cols();

		/**
		 * The meta object literal for the '{@link form.impl.ControlsImpl <em>Controls</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.impl.ControlsImpl
		 * @see form.impl.FormPackageImpl#getControls()
		 * @generated
		 */
		EClass CONTROLS = eINSTANCE.getControls();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLS__UID = eINSTANCE.getControls_Uid();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLS__ROOT = eINSTANCE.getControls_Root();

		/**
		 * The meta object literal for the '<em><b>Controls</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLS__CONTROLS = eINSTANCE.getControls_Controls();

		/**
		 * The meta object literal for the '<em><b>Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLS__RELATIONS = eINSTANCE.getControls_Relations();

		/**
		 * The meta object literal for the '<em><b>Dependencies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLS__DEPENDENCIES = eINSTANCE.getControls_Dependencies();

		/**
		 * The meta object literal for the '{@link form.impl.TriggerImpl <em>Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.impl.TriggerImpl
		 * @see form.impl.FormPackageImpl#getTrigger()
		 * @generated
		 */
		EClass TRIGGER = eINSTANCE.getTrigger();

		/**
		 * The meta object literal for the '{@link form.impl.PREFormTriggerImpl <em>PRE Form Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.impl.PREFormTriggerImpl
		 * @see form.impl.FormPackageImpl#getPREFormTrigger()
		 * @generated
		 */
		EClass PRE_FORM_TRIGGER = eINSTANCE.getPREFormTrigger();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRE_FORM_TRIGGER__UID = eINSTANCE.getPREFormTrigger_Uid();

		/**
		 * The meta object literal for the '{@link form.impl.PREQueryTriggerImpl <em>PRE Query Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.impl.PREQueryTriggerImpl
		 * @see form.impl.FormPackageImpl#getPREQueryTrigger()
		 * @generated
		 */
		EClass PRE_QUERY_TRIGGER = eINSTANCE.getPREQueryTrigger();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRE_QUERY_TRIGGER__UID = eINSTANCE.getPREQueryTrigger_Uid();

		/**
		 * The meta object literal for the '{@link form.impl.POSTQueryTriggerImpl <em>POST Query Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.impl.POSTQueryTriggerImpl
		 * @see form.impl.FormPackageImpl#getPOSTQueryTrigger()
		 * @generated
		 */
		EClass POST_QUERY_TRIGGER = eINSTANCE.getPOSTQueryTrigger();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POST_QUERY_TRIGGER__UID = eINSTANCE.getPOSTQueryTrigger_Uid();

		/**
		 * The meta object literal for the '{@link form.impl.PREInsertTriggerImpl <em>PRE Insert Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.impl.PREInsertTriggerImpl
		 * @see form.impl.FormPackageImpl#getPREInsertTrigger()
		 * @generated
		 */
		EClass PRE_INSERT_TRIGGER = eINSTANCE.getPREInsertTrigger();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRE_INSERT_TRIGGER__UID = eINSTANCE.getPREInsertTrigger_Uid();

		/**
		 * The meta object literal for the '{@link form.impl.PREDeleteTriggerImpl <em>PRE Delete Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.impl.PREDeleteTriggerImpl
		 * @see form.impl.FormPackageImpl#getPREDeleteTrigger()
		 * @generated
		 */
		EClass PRE_DELETE_TRIGGER = eINSTANCE.getPREDeleteTrigger();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRE_DELETE_TRIGGER__UID = eINSTANCE.getPREDeleteTrigger_Uid();

		/**
		 * The meta object literal for the '{@link form.impl.POSTCreateTriggerImpl <em>POST Create Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.impl.POSTCreateTriggerImpl
		 * @see form.impl.FormPackageImpl#getPOSTCreateTrigger()
		 * @generated
		 */
		EClass POST_CREATE_TRIGGER = eINSTANCE.getPOSTCreateTrigger();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POST_CREATE_TRIGGER__UID = eINSTANCE.getPOSTCreateTrigger_Uid();

		/**
		 * The meta object literal for the '{@link form.impl.PREUpdateTriggerImpl <em>PRE Update Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.impl.PREUpdateTriggerImpl
		 * @see form.impl.FormPackageImpl#getPREUpdateTrigger()
		 * @generated
		 */
		EClass PRE_UPDATE_TRIGGER = eINSTANCE.getPREUpdateTrigger();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRE_UPDATE_TRIGGER__UID = eINSTANCE.getPREUpdateTrigger_Uid();

		/**
		 * The meta object literal for the '{@link form.impl.ProxiesListImpl <em>Proxies List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.impl.ProxiesListImpl
		 * @see form.impl.FormPackageImpl#getProxiesList()
		 * @generated
		 */
		EClass PROXIES_LIST = eINSTANCE.getProxiesList();

		/**
		 * The meta object literal for the '<em><b>Type Pointers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROXIES_LIST__TYPE_POINTERS = eINSTANCE.getProxiesList_TypePointers();

		/**
		 * The meta object literal for the '{@link form.impl.CreateTriggerImpl <em>Create Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.impl.CreateTriggerImpl
		 * @see form.impl.FormPackageImpl#getCreateTrigger()
		 * @generated
		 */
		EClass CREATE_TRIGGER = eINSTANCE.getCreateTrigger();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_TRIGGER__UID = eINSTANCE.getCreateTrigger_Uid();

		/**
		 * The meta object literal for the '{@link form.impl.InsertTriggerImpl <em>Insert Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.impl.InsertTriggerImpl
		 * @see form.impl.FormPackageImpl#getInsertTrigger()
		 * @generated
		 */
		EClass INSERT_TRIGGER = eINSTANCE.getInsertTrigger();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSERT_TRIGGER__UID = eINSTANCE.getInsertTrigger_Uid();

		/**
		 * The meta object literal for the '{@link form.impl.UpdateTriggerImpl <em>Update Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.impl.UpdateTriggerImpl
		 * @see form.impl.FormPackageImpl#getUpdateTrigger()
		 * @generated
		 */
		EClass UPDATE_TRIGGER = eINSTANCE.getUpdateTrigger();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATE_TRIGGER__UID = eINSTANCE.getUpdateTrigger_Uid();

		/**
		 * The meta object literal for the '{@link form.impl.DeleteTriggerImpl <em>Delete Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.impl.DeleteTriggerImpl
		 * @see form.impl.FormPackageImpl#getDeleteTrigger()
		 * @generated
		 */
		EClass DELETE_TRIGGER = eINSTANCE.getDeleteTrigger();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELETE_TRIGGER__UID = eINSTANCE.getDeleteTrigger_Uid();

		/**
		 * The meta object literal for the '{@link form.impl.SearchTriggerImpl <em>Search Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.impl.SearchTriggerImpl
		 * @see form.impl.FormPackageImpl#getSearchTrigger()
		 * @generated
		 */
		EClass SEARCH_TRIGGER = eINSTANCE.getSearchTrigger();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEARCH_TRIGGER__UID = eINSTANCE.getSearchTrigger_Uid();

		/**
		 * The meta object literal for the '{@link form.impl.RootImpl <em>Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.impl.RootImpl
		 * @see form.impl.FormPackageImpl#getRoot()
		 * @generated
		 */
		EClass ROOT = eINSTANCE.getRoot();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOT__UID = eINSTANCE.getRoot_Uid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOT__NAME = eINSTANCE.getRoot_Name();

		/**
		 * The meta object literal for the '<em><b>Pre Form Trigger</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__PRE_FORM_TRIGGER = eINSTANCE.getRoot_PreFormTrigger();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__VARIABLES = eINSTANCE.getRoot_Variables();

		/**
		 * The meta object literal for the '{@link form.impl.FormVariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.impl.FormVariableImpl
		 * @see form.impl.FormPackageImpl#getFormVariable()
		 * @generated
		 */
		EClass FORM_VARIABLE = eINSTANCE.getFormVariable();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_VARIABLE__UID = eINSTANCE.getFormVariable_Uid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_VARIABLE__NAME = eINSTANCE.getFormVariable_Name();

		/**
		 * The meta object literal for the '<em><b>Param Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM_VARIABLE__PARAM_REF = eINSTANCE.getFormVariable_ParamRef();

		/**
		 * The meta object literal for the '{@link form.impl.DataControlImpl <em>Data Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.impl.DataControlImpl
		 * @see form.impl.FormPackageImpl#getDataControl()
		 * @generated
		 */
		EClass DATA_CONTROL = eINSTANCE.getDataControl();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_CONTROL__UID = eINSTANCE.getDataControl_Uid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_CONTROL__NAME = eINSTANCE.getDataControl_Name();

		/**
		 * The meta object literal for the '<em><b>Base Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_CONTROL__BASE_TYPE = eINSTANCE.getDataControl_BaseType();

		/**
		 * The meta object literal for the '<em><b>Pre Query Trigger</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_CONTROL__PRE_QUERY_TRIGGER = eINSTANCE.getDataControl_PreQueryTrigger();

		/**
		 * The meta object literal for the '<em><b>Post Query Trigger</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_CONTROL__POST_QUERY_TRIGGER = eINSTANCE.getDataControl_PostQueryTrigger();

		/**
		 * The meta object literal for the '<em><b>Pre Insert Trigger</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_CONTROL__PRE_INSERT_TRIGGER = eINSTANCE.getDataControl_PreInsertTrigger();

		/**
		 * The meta object literal for the '<em><b>Pre Delete Trigger</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_CONTROL__PRE_DELETE_TRIGGER = eINSTANCE.getDataControl_PreDeleteTrigger();

		/**
		 * The meta object literal for the '<em><b>Post Create Trigger</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_CONTROL__POST_CREATE_TRIGGER = eINSTANCE.getDataControl_PostCreateTrigger();

		/**
		 * The meta object literal for the '<em><b>Pre Update Trigger</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_CONTROL__PRE_UPDATE_TRIGGER = eINSTANCE.getDataControl_PreUpdateTrigger();

		/**
		 * The meta object literal for the '<em><b>Create</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_CONTROL__CREATE = eINSTANCE.getDataControl_Create();

		/**
		 * The meta object literal for the '<em><b>Insert</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_CONTROL__INSERT = eINSTANCE.getDataControl_Insert();

		/**
		 * The meta object literal for the '<em><b>Update</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_CONTROL__UPDATE = eINSTANCE.getDataControl_Update();

		/**
		 * The meta object literal for the '<em><b>Remove</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_CONTROL__REMOVE = eINSTANCE.getDataControl_Remove();

		/**
		 * The meta object literal for the '<em><b>Search</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_CONTROL__SEARCH = eINSTANCE.getDataControl_Search();

		/**
		 * The meta object literal for the '<em><b>Artificial Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_CONTROL__ARTIFICIAL_FIELDS = eINSTANCE.getDataControl_ArtificialFields();

		/**
		 * The meta object literal for the '<em><b>Default Search</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_CONTROL__DEFAULT_SEARCH = eINSTANCE.getDataControl_DefaultSearch();

		/**
		 * The meta object literal for the '<em><b>Default Order By</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_CONTROL__DEFAULT_ORDER_BY = eINSTANCE.getDataControl_DefaultOrderBy();

		/**
		 * The meta object literal for the '{@link form.impl.OrdersImpl <em>Orders</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.impl.OrdersImpl
		 * @see form.impl.FormPackageImpl#getOrders()
		 * @generated
		 */
		EClass ORDERS = eINSTANCE.getOrders();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDERS__UID = eINSTANCE.getOrders_Uid();

		/**
		 * The meta object literal for the '<em><b>Order Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDERS__ORDER_RULES = eINSTANCE.getOrders_OrderRules();

		/**
		 * The meta object literal for the '{@link form.impl.OrderByImpl <em>Order By</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.impl.OrderByImpl
		 * @see form.impl.FormPackageImpl#getOrderBy()
		 * @generated
		 */
		EClass ORDER_BY = eINSTANCE.getOrderBy();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_BY__UID = eINSTANCE.getOrderBy_Uid();

		/**
		 * The meta object literal for the '<em><b>Ref Obj</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_BY__REF_OBJ = eINSTANCE.getOrderBy_RefObj();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_BY__ORDER = eINSTANCE.getOrderBy_Order();

		/**
		 * The meta object literal for the '{@link form.impl.RelationImpl <em>Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.impl.RelationImpl
		 * @see form.impl.FormPackageImpl#getRelation()
		 * @generated
		 */
		EClass RELATION = eINSTANCE.getRelation();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__UID = eINSTANCE.getRelation_Uid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__NAME = eINSTANCE.getRelation_Name();

		/**
		 * The meta object literal for the '<em><b>Master</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__MASTER = eINSTANCE.getRelation_Master();

		/**
		 * The meta object literal for the '<em><b>Detail</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__DETAIL = eINSTANCE.getRelation_Detail();

		/**
		 * The meta object literal for the '<em><b>Is Tree</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__IS_TREE = eINSTANCE.getRelation_IsTree();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__LINKS = eINSTANCE.getRelation_Links();

		/**
		 * The meta object literal for the '{@link form.impl.DependencyImpl <em>Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.impl.DependencyImpl
		 * @see form.impl.FormPackageImpl#getDependency()
		 * @generated
		 */
		EClass DEPENDENCY = eINSTANCE.getDependency();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDENCY__UID = eINSTANCE.getDependency_Uid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDENCY__NAME = eINSTANCE.getDependency_Name();

		/**
		 * The meta object literal for the '<em><b>Master</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCY__MASTER = eINSTANCE.getDependency_Master();

		/**
		 * The meta object literal for the '<em><b>Detail</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCY__DETAIL = eINSTANCE.getDependency_Detail();

		/**
		 * The meta object literal for the '{@link form.impl.ArtificialFieldImpl <em>Artificial Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.impl.ArtificialFieldImpl
		 * @see form.impl.FormPackageImpl#getArtificialField()
		 * @generated
		 */
		EClass ARTIFICIAL_FIELD = eINSTANCE.getArtificialField();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFICIAL_FIELD__UID = eINSTANCE.getArtificialField_Uid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFICIAL_FIELD__NAME = eINSTANCE.getArtificialField_Name();

		/**
		 * The meta object literal for the '{@link form.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.impl.LinkImpl
		 * @see form.impl.FormPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__UID = eINSTANCE.getLink_Uid();

		/**
		 * The meta object literal for the '<em><b>Master Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__MASTER_FIELD = eINSTANCE.getLink_MasterField();

		/**
		 * The meta object literal for the '<em><b>Detail Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__DETAIL_FIELD = eINSTANCE.getLink_DetailField();

		/**
		 * The meta object literal for the '{@link form.Comparator <em>Comparator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.Comparator
		 * @see form.impl.FormPackageImpl#getComparator()
		 * @generated
		 */
		EEnum COMPARATOR = eINSTANCE.getComparator();

		/**
		 * The meta object literal for the '{@link form.Order <em>Order</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.Order
		 * @see form.impl.FormPackageImpl#getOrder()
		 * @generated
		 */
		EEnum ORDER = eINSTANCE.getOrder();

		/**
		 * The meta object literal for the '{@link form.Orientation <em>Orientation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.Orientation
		 * @see form.impl.FormPackageImpl#getOrientation()
		 * @generated
		 */
		EEnum ORIENTATION = eINSTANCE.getOrientation();

	}

} //FormPackage
