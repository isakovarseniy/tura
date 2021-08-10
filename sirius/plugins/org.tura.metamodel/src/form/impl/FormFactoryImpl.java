/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

/**
 */
package form.impl;

import form.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FormFactoryImpl extends EFactoryImpl implements FormFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FormFactory init() {
		try {
			FormFactory theFormFactory = (FormFactory)EPackage.Registry.INSTANCE.getEFactory(FormPackage.eNS_URI);
			if (theFormFactory != null) {
				return theFormFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FormFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case FormPackage.FORM: return createForm();
			case FormPackage.FORM_PARAMETER: return createFormParameter();
			case FormPackage.VIEWS: return createViews();
			case FormPackage.MULTI_LANG_LABEL: return createMultiLangLabel();
			case FormPackage.CANVAS_FRAME: return createCanvasFrame();
			case FormPackage.VIEW_PORT_HOLDER: return createViewPortHolder();
			case FormPackage.DEFAULT_CAVAS: return createDefaultCavas();
			case FormPackage.VIEW_ELEMENT: return createViewElement();
			case FormPackage.POPUP_CANVAS: return createPopupCanvas();
			case FormPackage.OVERLAY_CANVAS: return createOverlayCanvas();
			case FormPackage.CANVAS: return createCanvas();
			case FormPackage.WINDOW: return createWindow();
			case FormPackage.MENU_DEFINITION: return createMenuDefinition();
			case FormPackage.TAB_CANVAS: return createTabCanvas();
			case FormPackage.TAB_PAGE: return createTabPage();
			case FormPackage.VIEW_PORT: return createViewPort();
			case FormPackage.VIEW_AREA: return createViewArea();
			case FormPackage.VIEW_PORT_TRIGGER: return createViewPortTrigger();
			case FormPackage.VIEW_INHERITANCE: return createViewInheritance();
			case FormPackage.TAB_PAGES_INHERITANCE: return createTabPagesInheritance();
			case FormPackage.LINK_TO_MESSAGE: return createLinkToMessage();
			case FormPackage.LINK_TO_LABEL: return createLinkToLabel();
			case FormPackage.CHILDREN_HOLDER: return createChildrenHolder();
			case FormPackage.CONTEXT_PARAMETER: return createContextParameter();
			case FormPackage.CONTEXT_VALUE: return createContextValue();
			case FormPackage.EXPRESSION_PART: return createExpressionPart();
			case FormPackage.CONTEXT_PARAMETERS: return createContextParameters();
			case FormPackage.CONTEXT: return createContext();
			case FormPackage.STYLE_ELEMENT: return createStyleElement();
			case FormPackage.NICK_NAMED: return createNickNamed();
			case FormPackage.FLEX_FIELDS: return createFlexFields();
			case FormPackage.FLEX_FIELD: return createFlexField();
			case FormPackage.ENABLED_UI_ITEM: return createEnabledUIItem();
			case FormPackage.UIELEMENT: return createUielement();
			case FormPackage.ITEM_ICON: return createItemIcon();
			case FormPackage.AREA_REF: return createAreaRef();
			case FormPackage.FORMATABLE: return createFormatable();
			case FormPackage.CONTROL_POINTER: return createControlPointer();
			case FormPackage.SOURCES_POINTER: return createSourcesPointer();
			case FormPackage.INPUT_ELEMENT: return createInputElement();
			case FormPackage.SELECTION: return createSelection();
			case FormPackage.BLOCKABLE: return createBlockable();
			case FormPackage.LAYER_HOLDER: return createLayerHolder();
			case FormPackage.INPUT_TEXT: return createInputText();
			case FormPackage.PASSWORD: return createPassword();
			case FormPackage.LABEL: return createLabel();
			case FormPackage.MESSAGE_ELEMENT: return createMessageElement();
			case FormPackage.OUTPUT_TEXT: return createOutputText();
			case FormPackage.CHECK_BOX: return createCheckBox();
			case FormPackage.OPTION_SELECTION: return createOptionSelection();
			case FormPackage.DROP_DOWN_SELECTION: return createDropDownSelection();
			case FormPackage.SELECT_MANY_MENU: return createSelectManyMenu();
			case FormPackage.RADIO_SELECTION: return createRadioSelection();
			case FormPackage.IMAGE: return createImage();
			case FormPackage.DATE: return createDate();
			case FormPackage.BUTTON: return createButton();
			case FormPackage.DATA_EXPORTER: return createDataExporter();
			case FormPackage.COLUMN: return createColumn();
			case FormPackage.TABLE: return createTable();
			case FormPackage.MENU: return createMenu();
			case FormPackage.BLOCK_UI: return createBlockUI();
			case FormPackage.FILE_UPLOAD: return createFileUpload();
			case FormPackage.FILE_DOWNLOAD: return createFileDownload();
			case FormPackage.DATA_SCROLLER: return createDataScroller();
			case FormPackage.TIME_LINE: return createTimeLine();
			case FormPackage.FULL_CALENDAR: return createFullCalendar();
			case FormPackage.POLL: return createPoll();
			case FormPackage.DATA_TEMPLATE: return createDataTemplate();
			case FormPackage.WINDOW_REF: return createWindowRef();
			case FormPackage.MENU_HOLDER: return createMenuHolder();
			case FormPackage.MENU_EXTENSION_REF: return createMenuExtensionRef();
			case FormPackage.MENU_ELEMENT: return createMenuElement();
			case FormPackage.MENU_FOLDER: return createMenuFolder();
			case FormPackage.MENU_ITEM: return createMenuItem();
			case FormPackage.MENU_EXTENSION_POINT: return createMenuExtensionPoint();
			case FormPackage.SUB_MENU: return createSubMenu();
			case FormPackage.TO_SUBMENU: return createToSubmenu();
			case FormPackage.MENU_SEPARATOR: return createMenuSeparator();
			case FormPackage.TREE: return createTree();
			case FormPackage.CONTROLS: return createControls();
			case FormPackage.TRIGGER: return createTrigger();
			case FormPackage.PRE_FORM_TRIGGER: return createPREFormTrigger();
			case FormPackage.PRE_QUERY_TRIGGER: return createPREQueryTrigger();
			case FormPackage.POST_QUERY_TRIGGER: return createPOSTQueryTrigger();
			case FormPackage.PRE_INSERT_TRIGGER: return createPREInsertTrigger();
			case FormPackage.PRE_DELETE_TRIGGER: return createPREDeleteTrigger();
			case FormPackage.POST_CREATE_TRIGGER: return createPOSTCreateTrigger();
			case FormPackage.PRE_UPDATE_TRIGGER: return createPREUpdateTrigger();
			case FormPackage.CREATE_TRIGGER: return createCreateTrigger();
			case FormPackage.INSERT_TRIGGER: return createInsertTrigger();
			case FormPackage.UPDATE_TRIGGER: return createUpdateTrigger();
			case FormPackage.DELETE_TRIGGER: return createDeleteTrigger();
			case FormPackage.SEARCH_TRIGGER: return createSearchTrigger();
			case FormPackage.ROOT: return createRoot();
			case FormPackage.FORM_VARIABLE: return createFormVariable();
			case FormPackage.DATA_CONTROL: return createDataControl();
			case FormPackage.RELATION_MAPPER: return createRelationMapper();
			case FormPackage.ORDERS: return createOrders();
			case FormPackage.ORDER_BY: return createOrderBy();
			case FormPackage.RELATION: return createRelation();
			case FormPackage.INTERNAL_RELATION: return createInternalRelation();
			case FormPackage.DEPENDENCY: return createDependency();
			case FormPackage.ARTIFICIAL_FIELD: return createArtificialField();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case FormPackage.COMPARATOR:
				return createComparatorFromString(eDataType, initialValue);
			case FormPackage.ORDER:
				return createOrderFromString(eDataType, initialValue);
			case FormPackage.ORIENTATION:
				return createOrientationFromString(eDataType, initialValue);
			case FormPackage.RADIO_LAYOUT:
				return createRadioLayoutFromString(eDataType, initialValue);
			case FormPackage.DATA_EXPORTER_TYPE:
				return createDataExporterTypeFromString(eDataType, initialValue);
			case FormPackage.SORTABLE:
				return createSortableFromString(eDataType, initialValue);
			case FormPackage.SELECTION_MODE:
				return createSelectionModeFromString(eDataType, initialValue);
			case FormPackage.TIME_LINE_LAYOUT:
				return createTimeLineLayoutFromString(eDataType, initialValue);
			case FormPackage.TIME_LINE_ALIGN:
				return createTimeLineAlignFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case FormPackage.COMPARATOR:
				return convertComparatorToString(eDataType, instanceValue);
			case FormPackage.ORDER:
				return convertOrderToString(eDataType, instanceValue);
			case FormPackage.ORIENTATION:
				return convertOrientationToString(eDataType, instanceValue);
			case FormPackage.RADIO_LAYOUT:
				return convertRadioLayoutToString(eDataType, instanceValue);
			case FormPackage.DATA_EXPORTER_TYPE:
				return convertDataExporterTypeToString(eDataType, instanceValue);
			case FormPackage.SORTABLE:
				return convertSortableToString(eDataType, instanceValue);
			case FormPackage.SELECTION_MODE:
				return convertSelectionModeToString(eDataType, instanceValue);
			case FormPackage.TIME_LINE_LAYOUT:
				return convertTimeLineLayoutToString(eDataType, instanceValue);
			case FormPackage.TIME_LINE_ALIGN:
				return convertTimeLineAlignToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Form createForm() {
		FormImpl form = new FormImpl();
		return form;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FormParameter createFormParameter() {
		FormParameterImpl formParameter = new FormParameterImpl();
		return formParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Views createViews() {
		ViewsImpl views = new ViewsImpl();
		return views;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiLangLabel createMultiLangLabel() {
		MultiLangLabelImpl multiLangLabel = new MultiLangLabelImpl();
		return multiLangLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CanvasFrame createCanvasFrame() {
		CanvasFrameImpl canvasFrame = new CanvasFrameImpl();
		return canvasFrame;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ViewPortHolder createViewPortHolder() {
		ViewPortHolderImpl viewPortHolder = new ViewPortHolderImpl();
		return viewPortHolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DefaultCavas createDefaultCavas() {
		DefaultCavasImpl defaultCavas = new DefaultCavasImpl();
		return defaultCavas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ViewElement createViewElement() {
		ViewElementImpl viewElement = new ViewElementImpl();
		return viewElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PopupCanvas createPopupCanvas() {
		PopupCanvasImpl popupCanvas = new PopupCanvasImpl();
		return popupCanvas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OverlayCanvas createOverlayCanvas() {
		OverlayCanvasImpl overlayCanvas = new OverlayCanvasImpl();
		return overlayCanvas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Canvas createCanvas() {
		CanvasImpl canvas = new CanvasImpl();
		return canvas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Window createWindow() {
		WindowImpl window = new WindowImpl();
		return window;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MenuDefinition createMenuDefinition() {
		MenuDefinitionImpl menuDefinition = new MenuDefinitionImpl();
		return menuDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TabCanvas createTabCanvas() {
		TabCanvasImpl tabCanvas = new TabCanvasImpl();
		return tabCanvas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TabPage createTabPage() {
		TabPageImpl tabPage = new TabPageImpl();
		return tabPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ViewPort createViewPort() {
		ViewPortImpl viewPort = new ViewPortImpl();
		return viewPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ViewArea createViewArea() {
		ViewAreaImpl viewArea = new ViewAreaImpl();
		return viewArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ViewPortTrigger createViewPortTrigger() {
		ViewPortTriggerImpl viewPortTrigger = new ViewPortTriggerImpl();
		return viewPortTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ViewInheritance createViewInheritance() {
		ViewInheritanceImpl viewInheritance = new ViewInheritanceImpl();
		return viewInheritance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TabPagesInheritance createTabPagesInheritance() {
		TabPagesInheritanceImpl tabPagesInheritance = new TabPagesInheritanceImpl();
		return tabPagesInheritance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LinkToMessage createLinkToMessage() {
		LinkToMessageImpl linkToMessage = new LinkToMessageImpl();
		return linkToMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LinkToLabel createLinkToLabel() {
		LinkToLabelImpl linkToLabel = new LinkToLabelImpl();
		return linkToLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChildrenHolder createChildrenHolder() {
		ChildrenHolderImpl childrenHolder = new ChildrenHolderImpl();
		return childrenHolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContextParameter createContextParameter() {
		ContextParameterImpl contextParameter = new ContextParameterImpl();
		return contextParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContextValue createContextValue() {
		ContextValueImpl contextValue = new ContextValueImpl();
		return contextValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExpressionPart createExpressionPart() {
		ExpressionPartImpl expressionPart = new ExpressionPartImpl();
		return expressionPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContextParameters createContextParameters() {
		ContextParametersImpl contextParameters = new ContextParametersImpl();
		return contextParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Context createContext() {
		ContextImpl context = new ContextImpl();
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StyleElement createStyleElement() {
		StyleElementImpl styleElement = new StyleElementImpl();
		return styleElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NickNamed createNickNamed() {
		NickNamedImpl nickNamed = new NickNamedImpl();
		return nickNamed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FlexFields createFlexFields() {
		FlexFieldsImpl flexFields = new FlexFieldsImpl();
		return flexFields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FlexField createFlexField() {
		FlexFieldImpl flexField = new FlexFieldImpl();
		return flexField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnabledUIItem createEnabledUIItem() {
		EnabledUIItemImpl enabledUIItem = new EnabledUIItemImpl();
		return enabledUIItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uielement createUielement() {
		UielementImpl uielement = new UielementImpl();
		return uielement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ItemIcon createItemIcon() {
		ItemIconImpl itemIcon = new ItemIconImpl();
		return itemIcon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AreaRef createAreaRef() {
		AreaRefImpl areaRef = new AreaRefImpl();
		return areaRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Formatable createFormatable() {
		FormatableImpl formatable = new FormatableImpl();
		return formatable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlPointer createControlPointer() {
		ControlPointerImpl controlPointer = new ControlPointerImpl();
		return controlPointer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SourcesPointer createSourcesPointer() {
		SourcesPointerImpl sourcesPointer = new SourcesPointerImpl();
		return sourcesPointer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InputElement createInputElement() {
		InputElementImpl inputElement = new InputElementImpl();
		return inputElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Selection createSelection() {
		SelectionImpl selection = new SelectionImpl();
		return selection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Blockable createBlockable() {
		BlockableImpl blockable = new BlockableImpl();
		return blockable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LayerHolder createLayerHolder() {
		LayerHolderImpl layerHolder = new LayerHolderImpl();
		return layerHolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InputText createInputText() {
		InputTextImpl inputText = new InputTextImpl();
		return inputText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Password createPassword() {
		PasswordImpl password = new PasswordImpl();
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Label createLabel() {
		LabelImpl label = new LabelImpl();
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MessageElement createMessageElement() {
		MessageElementImpl messageElement = new MessageElementImpl();
		return messageElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OutputText createOutputText() {
		OutputTextImpl outputText = new OutputTextImpl();
		return outputText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CheckBox createCheckBox() {
		CheckBoxImpl checkBox = new CheckBoxImpl();
		return checkBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OptionSelection createOptionSelection() {
		OptionSelectionImpl optionSelection = new OptionSelectionImpl();
		return optionSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DropDownSelection createDropDownSelection() {
		DropDownSelectionImpl dropDownSelection = new DropDownSelectionImpl();
		return dropDownSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SelectManyMenu createSelectManyMenu() {
		SelectManyMenuImpl selectManyMenu = new SelectManyMenuImpl();
		return selectManyMenu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RadioSelection createRadioSelection() {
		RadioSelectionImpl radioSelection = new RadioSelectionImpl();
		return radioSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Image createImage() {
		ImageImpl image = new ImageImpl();
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date createDate() {
		DateImpl date = new DateImpl();
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Button createButton() {
		ButtonImpl button = new ButtonImpl();
		return button;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataExporter createDataExporter() {
		DataExporterImpl dataExporter = new DataExporterImpl();
		return dataExporter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Column createColumn() {
		ColumnImpl column = new ColumnImpl();
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Table createTable() {
		TableImpl table = new TableImpl();
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Menu createMenu() {
		MenuImpl menu = new MenuImpl();
		return menu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BlockUI createBlockUI() {
		BlockUIImpl blockUI = new BlockUIImpl();
		return blockUI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FileUpload createFileUpload() {
		FileUploadImpl fileUpload = new FileUploadImpl();
		return fileUpload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FileDownload createFileDownload() {
		FileDownloadImpl fileDownload = new FileDownloadImpl();
		return fileDownload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataScroller createDataScroller() {
		DataScrollerImpl dataScroller = new DataScrollerImpl();
		return dataScroller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeLine createTimeLine() {
		TimeLineImpl timeLine = new TimeLineImpl();
		return timeLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FullCalendar createFullCalendar() {
		FullCalendarImpl fullCalendar = new FullCalendarImpl();
		return fullCalendar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Poll createPoll() {
		PollImpl poll = new PollImpl();
		return poll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataTemplate createDataTemplate() {
		DataTemplateImpl dataTemplate = new DataTemplateImpl();
		return dataTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WindowRef createWindowRef() {
		WindowRefImpl windowRef = new WindowRefImpl();
		return windowRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MenuHolder createMenuHolder() {
		MenuHolderImpl menuHolder = new MenuHolderImpl();
		return menuHolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MenuExtensionRef createMenuExtensionRef() {
		MenuExtensionRefImpl menuExtensionRef = new MenuExtensionRefImpl();
		return menuExtensionRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MenuElement createMenuElement() {
		MenuElementImpl menuElement = new MenuElementImpl();
		return menuElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MenuFolder createMenuFolder() {
		MenuFolderImpl menuFolder = new MenuFolderImpl();
		return menuFolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MenuItem createMenuItem() {
		MenuItemImpl menuItem = new MenuItemImpl();
		return menuItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MenuExtensionPoint createMenuExtensionPoint() {
		MenuExtensionPointImpl menuExtensionPoint = new MenuExtensionPointImpl();
		return menuExtensionPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubMenu createSubMenu() {
		SubMenuImpl subMenu = new SubMenuImpl();
		return subMenu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ToSubmenu createToSubmenu() {
		ToSubmenuImpl toSubmenu = new ToSubmenuImpl();
		return toSubmenu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MenuSeparator createMenuSeparator() {
		MenuSeparatorImpl menuSeparator = new MenuSeparatorImpl();
		return menuSeparator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tree createTree() {
		TreeImpl tree = new TreeImpl();
		return tree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Controls createControls() {
		ControlsImpl controls = new ControlsImpl();
		return controls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Trigger createTrigger() {
		TriggerImpl trigger = new TriggerImpl();
		return trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PREFormTrigger createPREFormTrigger() {
		PREFormTriggerImpl preFormTrigger = new PREFormTriggerImpl();
		return preFormTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PREQueryTrigger createPREQueryTrigger() {
		PREQueryTriggerImpl preQueryTrigger = new PREQueryTriggerImpl();
		return preQueryTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public POSTQueryTrigger createPOSTQueryTrigger() {
		POSTQueryTriggerImpl postQueryTrigger = new POSTQueryTriggerImpl();
		return postQueryTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PREInsertTrigger createPREInsertTrigger() {
		PREInsertTriggerImpl preInsertTrigger = new PREInsertTriggerImpl();
		return preInsertTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PREDeleteTrigger createPREDeleteTrigger() {
		PREDeleteTriggerImpl preDeleteTrigger = new PREDeleteTriggerImpl();
		return preDeleteTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public POSTCreateTrigger createPOSTCreateTrigger() {
		POSTCreateTriggerImpl postCreateTrigger = new POSTCreateTriggerImpl();
		return postCreateTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PREUpdateTrigger createPREUpdateTrigger() {
		PREUpdateTriggerImpl preUpdateTrigger = new PREUpdateTriggerImpl();
		return preUpdateTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CreateTrigger createCreateTrigger() {
		CreateTriggerImpl createTrigger = new CreateTriggerImpl();
		return createTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InsertTrigger createInsertTrigger() {
		InsertTriggerImpl insertTrigger = new InsertTriggerImpl();
		return insertTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UpdateTrigger createUpdateTrigger() {
		UpdateTriggerImpl updateTrigger = new UpdateTriggerImpl();
		return updateTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeleteTrigger createDeleteTrigger() {
		DeleteTriggerImpl deleteTrigger = new DeleteTriggerImpl();
		return deleteTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SearchTrigger createSearchTrigger() {
		SearchTriggerImpl searchTrigger = new SearchTriggerImpl();
		return searchTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Root createRoot() {
		RootImpl root = new RootImpl();
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FormVariable createFormVariable() {
		FormVariableImpl formVariable = new FormVariableImpl();
		return formVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataControl createDataControl() {
		DataControlImpl dataControl = new DataControlImpl();
		return dataControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelationMapper createRelationMapper() {
		RelationMapperImpl relationMapper = new RelationMapperImpl();
		return relationMapper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Orders createOrders() {
		OrdersImpl orders = new OrdersImpl();
		return orders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderBy createOrderBy() {
		OrderByImpl orderBy = new OrderByImpl();
		return orderBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Relation createRelation() {
		RelationImpl relation = new RelationImpl();
		return relation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalRelation createInternalRelation() {
		InternalRelationImpl internalRelation = new InternalRelationImpl();
		return internalRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Dependency createDependency() {
		DependencyImpl dependency = new DependencyImpl();
		return dependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArtificialField createArtificialField() {
		ArtificialFieldImpl artificialField = new ArtificialFieldImpl();
		return artificialField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comparator createComparatorFromString(EDataType eDataType, String initialValue) {
		Comparator result = Comparator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComparatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Order createOrderFromString(EDataType eDataType, String initialValue) {
		Order result = Order.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrderToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Orientation createOrientationFromString(EDataType eDataType, String initialValue) {
		Orientation result = Orientation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrientationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RadioLayout createRadioLayoutFromString(EDataType eDataType, String initialValue) {
		RadioLayout result = RadioLayout.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRadioLayoutToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataExporterType createDataExporterTypeFromString(EDataType eDataType, String initialValue) {
		DataExporterType result = DataExporterType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataExporterTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sortable createSortableFromString(EDataType eDataType, String initialValue) {
		Sortable result = Sortable.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSortableToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectionMode createSelectionModeFromString(EDataType eDataType, String initialValue) {
		SelectionMode result = SelectionMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSelectionModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeLineLayout createTimeLineLayoutFromString(EDataType eDataType, String initialValue) {
		TimeLineLayout result = TimeLineLayout.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeLineLayoutToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeLineAlign createTimeLineAlignFromString(EDataType eDataType, String initialValue) {
		TimeLineAlign result = TimeLineAlign.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeLineAlignToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FormPackage getFormPackage() {
		return (FormPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FormPackage getPackage() {
		return FormPackage.eINSTANCE;
	}

} //FormFactoryImpl
