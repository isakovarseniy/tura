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
			case FormPackage.HTML_LAYER_HOLDER: return createHTMLLayerHolder();
			case FormPackage.ORDERABLE: return createOrderable();
			case FormPackage.MULTI_LANG_LABEL: return createMultiLangLabel();
			case FormPackage.CANVAS_FRAME: return createCanvasFrame();
			case FormPackage.VIEW_PORT_HOLDER: return createViewPortHolder();
			case FormPackage.DEFAULT_CAVAS: return createDefaultCavas();
			case FormPackage.VIEW_ELEMENT: return createViewElement();
			case FormPackage.POPUP_CANVAS: return createPopupCanvas();
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
			case FormPackage.STYLE_CLASS: return createStyleClass();
			case FormPackage.NICK_NAMED: return createNickNamed();
			case FormPackage.FLEX_FIELDS: return createFlexFields();
			case FormPackage.FLEX_FIELD: return createFlexField();
			case FormPackage.ENABLED_UI_ITEM: return createEnabledUIItem();
			case FormPackage.UIELEMENT: return createUielement();
			case FormPackage.ITEM_ICON: return createItemIcon();
			case FormPackage.AREA_REF: return createAreaRef();
			case FormPackage.FORMATABLE: return createFormatable();
			case FormPackage.SOURCES_POINTER: return createSourcesPointer();
			case FormPackage.INPUT_ELEMENT: return createInputElement();
			case FormPackage.SELECTION: return createSelection();
			case FormPackage.OPTION_SELECTION: return createOptionSelection();
			case FormPackage.LAYER_HOLDER: return createLayerHolder();
			case FormPackage.INPUT_TEXT: return createInputText();
			case FormPackage.PASSWORD: return createPassword();
			case FormPackage.LABEL: return createLabel();
			case FormPackage.MESSAGE_ELEMENT: return createMessageElement();
			case FormPackage.OUTPUT_TEXT: return createOutputText();
			case FormPackage.CHECK_BOX: return createCheckBox();
			case FormPackage.DROP_DOWN_SELECTION: return createDropDownSelection();
			case FormPackage.IMAGE: return createImage();
			case FormPackage.DATE: return createDate();
			case FormPackage.BUTTON: return createButton();
			case FormPackage.COLUMN: return createColumn();
			case FormPackage.TABLE: return createTable();
			case FormPackage.MENU: return createMenu();
			case FormPackage.MENU_VIEW: return createMenuView();
			case FormPackage.MENU_HOLDER: return createMenuHolder();
			case FormPackage.MENU_EXTENSION_REF: return createMenuExtensionRef();
			case FormPackage.MENU_ELEMENT: return createMenuElement();
			case FormPackage.MENU_FOLDER: return createMenuFolder();
			case FormPackage.MENU_ITEM: return createMenuItem();
			case FormPackage.MENU_EXTENSION_POINT: return createMenuExtensionPoint();
			case FormPackage.SUB_MENU: return createSubMenu();
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
			case FormPackage.PROXIES_LIST: return createProxiesList();
			case FormPackage.CREATE_TRIGGER: return createCreateTrigger();
			case FormPackage.INSERT_TRIGGER: return createInsertTrigger();
			case FormPackage.UPDATE_TRIGGER: return createUpdateTrigger();
			case FormPackage.DELETE_TRIGGER: return createDeleteTrigger();
			case FormPackage.SEARCH_TRIGGER: return createSearchTrigger();
			case FormPackage.ROOT: return createRoot();
			case FormPackage.FORM_VARIABLE: return createFormVariable();
			case FormPackage.DATA_CONTROL: return createDataControl();
			case FormPackage.ORDERS: return createOrders();
			case FormPackage.ORDER_BY: return createOrderBy();
			case FormPackage.RELATION: return createRelation();
			case FormPackage.DEPENDENCY: return createDependency();
			case FormPackage.ARTIFICIAL_FIELD: return createArtificialField();
			case FormPackage.LINK: return createLink();
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
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Form createForm() {
		FormImpl form = new FormImpl();
		return form;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormParameter createFormParameter() {
		FormParameterImpl formParameter = new FormParameterImpl();
		return formParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Views createViews() {
		ViewsImpl views = new ViewsImpl();
		return views;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HTMLLayerHolder createHTMLLayerHolder() {
		HTMLLayerHolderImpl htmlLayerHolder = new HTMLLayerHolderImpl();
		return htmlLayerHolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Orderable createOrderable() {
		OrderableImpl orderable = new OrderableImpl();
		return orderable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiLangLabel createMultiLangLabel() {
		MultiLangLabelImpl multiLangLabel = new MultiLangLabelImpl();
		return multiLangLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CanvasFrame createCanvasFrame() {
		CanvasFrameImpl canvasFrame = new CanvasFrameImpl();
		return canvasFrame;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewPortHolder createViewPortHolder() {
		ViewPortHolderImpl viewPortHolder = new ViewPortHolderImpl();
		return viewPortHolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultCavas createDefaultCavas() {
		DefaultCavasImpl defaultCavas = new DefaultCavasImpl();
		return defaultCavas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewElement createViewElement() {
		ViewElementImpl viewElement = new ViewElementImpl();
		return viewElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PopupCanvas createPopupCanvas() {
		PopupCanvasImpl popupCanvas = new PopupCanvasImpl();
		return popupCanvas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Canvas createCanvas() {
		CanvasImpl canvas = new CanvasImpl();
		return canvas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Window createWindow() {
		WindowImpl window = new WindowImpl();
		return window;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MenuDefinition createMenuDefinition() {
		MenuDefinitionImpl menuDefinition = new MenuDefinitionImpl();
		return menuDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TabCanvas createTabCanvas() {
		TabCanvasImpl tabCanvas = new TabCanvasImpl();
		return tabCanvas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TabPage createTabPage() {
		TabPageImpl tabPage = new TabPageImpl();
		return tabPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewPort createViewPort() {
		ViewPortImpl viewPort = new ViewPortImpl();
		return viewPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewArea createViewArea() {
		ViewAreaImpl viewArea = new ViewAreaImpl();
		return viewArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewPortTrigger createViewPortTrigger() {
		ViewPortTriggerImpl viewPortTrigger = new ViewPortTriggerImpl();
		return viewPortTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewInheritance createViewInheritance() {
		ViewInheritanceImpl viewInheritance = new ViewInheritanceImpl();
		return viewInheritance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TabPagesInheritance createTabPagesInheritance() {
		TabPagesInheritanceImpl tabPagesInheritance = new TabPagesInheritanceImpl();
		return tabPagesInheritance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkToMessage createLinkToMessage() {
		LinkToMessageImpl linkToMessage = new LinkToMessageImpl();
		return linkToMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkToLabel createLinkToLabel() {
		LinkToLabelImpl linkToLabel = new LinkToLabelImpl();
		return linkToLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChildrenHolder createChildrenHolder() {
		ChildrenHolderImpl childrenHolder = new ChildrenHolderImpl();
		return childrenHolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextParameter createContextParameter() {
		ContextParameterImpl contextParameter = new ContextParameterImpl();
		return contextParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextValue createContextValue() {
		ContextValueImpl contextValue = new ContextValueImpl();
		return contextValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionPart createExpressionPart() {
		ExpressionPartImpl expressionPart = new ExpressionPartImpl();
		return expressionPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextParameters createContextParameters() {
		ContextParametersImpl contextParameters = new ContextParametersImpl();
		return contextParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Context createContext() {
		ContextImpl context = new ContextImpl();
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleElement createStyleElement() {
		StyleElementImpl styleElement = new StyleElementImpl();
		return styleElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleClass createStyleClass() {
		StyleClassImpl styleClass = new StyleClassImpl();
		return styleClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NickNamed createNickNamed() {
		NickNamedImpl nickNamed = new NickNamedImpl();
		return nickNamed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlexFields createFlexFields() {
		FlexFieldsImpl flexFields = new FlexFieldsImpl();
		return flexFields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlexField createFlexField() {
		FlexFieldImpl flexField = new FlexFieldImpl();
		return flexField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnabledUIItem createEnabledUIItem() {
		EnabledUIItemImpl enabledUIItem = new EnabledUIItemImpl();
		return enabledUIItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uielement createUielement() {
		UielementImpl uielement = new UielementImpl();
		return uielement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemIcon createItemIcon() {
		ItemIconImpl itemIcon = new ItemIconImpl();
		return itemIcon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AreaRef createAreaRef() {
		AreaRefImpl areaRef = new AreaRefImpl();
		return areaRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Formatable createFormatable() {
		FormatableImpl formatable = new FormatableImpl();
		return formatable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourcesPointer createSourcesPointer() {
		SourcesPointerImpl sourcesPointer = new SourcesPointerImpl();
		return sourcesPointer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputElement createInputElement() {
		InputElementImpl inputElement = new InputElementImpl();
		return inputElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Selection createSelection() {
		SelectionImpl selection = new SelectionImpl();
		return selection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptionSelection createOptionSelection() {
		OptionSelectionImpl optionSelection = new OptionSelectionImpl();
		return optionSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayerHolder createLayerHolder() {
		LayerHolderImpl layerHolder = new LayerHolderImpl();
		return layerHolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputText createInputText() {
		InputTextImpl inputText = new InputTextImpl();
		return inputText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Password createPassword() {
		PasswordImpl password = new PasswordImpl();
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Label createLabel() {
		LabelImpl label = new LabelImpl();
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageElement createMessageElement() {
		MessageElementImpl messageElement = new MessageElementImpl();
		return messageElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputText createOutputText() {
		OutputTextImpl outputText = new OutputTextImpl();
		return outputText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CheckBox createCheckBox() {
		CheckBoxImpl checkBox = new CheckBoxImpl();
		return checkBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DropDownSelection createDropDownSelection() {
		DropDownSelectionImpl dropDownSelection = new DropDownSelectionImpl();
		return dropDownSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Image createImage() {
		ImageImpl image = new ImageImpl();
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date createDate() {
		DateImpl date = new DateImpl();
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Button createButton() {
		ButtonImpl button = new ButtonImpl();
		return button;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Column createColumn() {
		ColumnImpl column = new ColumnImpl();
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table createTable() {
		TableImpl table = new TableImpl();
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Menu createMenu() {
		MenuImpl menu = new MenuImpl();
		return menu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MenuView createMenuView() {
		MenuViewImpl menuView = new MenuViewImpl();
		return menuView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MenuHolder createMenuHolder() {
		MenuHolderImpl menuHolder = new MenuHolderImpl();
		return menuHolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MenuExtensionRef createMenuExtensionRef() {
		MenuExtensionRefImpl menuExtensionRef = new MenuExtensionRefImpl();
		return menuExtensionRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MenuElement createMenuElement() {
		MenuElementImpl menuElement = new MenuElementImpl();
		return menuElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MenuFolder createMenuFolder() {
		MenuFolderImpl menuFolder = new MenuFolderImpl();
		return menuFolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MenuItem createMenuItem() {
		MenuItemImpl menuItem = new MenuItemImpl();
		return menuItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MenuExtensionPoint createMenuExtensionPoint() {
		MenuExtensionPointImpl menuExtensionPoint = new MenuExtensionPointImpl();
		return menuExtensionPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubMenu createSubMenu() {
		SubMenuImpl subMenu = new SubMenuImpl();
		return subMenu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MenuSeparator createMenuSeparator() {
		MenuSeparatorImpl menuSeparator = new MenuSeparatorImpl();
		return menuSeparator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tree createTree() {
		TreeImpl tree = new TreeImpl();
		return tree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Controls createControls() {
		ControlsImpl controls = new ControlsImpl();
		return controls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trigger createTrigger() {
		TriggerImpl trigger = new TriggerImpl();
		return trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PREFormTrigger createPREFormTrigger() {
		PREFormTriggerImpl preFormTrigger = new PREFormTriggerImpl();
		return preFormTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PREQueryTrigger createPREQueryTrigger() {
		PREQueryTriggerImpl preQueryTrigger = new PREQueryTriggerImpl();
		return preQueryTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public POSTQueryTrigger createPOSTQueryTrigger() {
		POSTQueryTriggerImpl postQueryTrigger = new POSTQueryTriggerImpl();
		return postQueryTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PREInsertTrigger createPREInsertTrigger() {
		PREInsertTriggerImpl preInsertTrigger = new PREInsertTriggerImpl();
		return preInsertTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PREDeleteTrigger createPREDeleteTrigger() {
		PREDeleteTriggerImpl preDeleteTrigger = new PREDeleteTriggerImpl();
		return preDeleteTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public POSTCreateTrigger createPOSTCreateTrigger() {
		POSTCreateTriggerImpl postCreateTrigger = new POSTCreateTriggerImpl();
		return postCreateTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PREUpdateTrigger createPREUpdateTrigger() {
		PREUpdateTriggerImpl preUpdateTrigger = new PREUpdateTriggerImpl();
		return preUpdateTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProxiesList createProxiesList() {
		ProxiesListImpl proxiesList = new ProxiesListImpl();
		return proxiesList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateTrigger createCreateTrigger() {
		CreateTriggerImpl createTrigger = new CreateTriggerImpl();
		return createTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InsertTrigger createInsertTrigger() {
		InsertTriggerImpl insertTrigger = new InsertTriggerImpl();
		return insertTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateTrigger createUpdateTrigger() {
		UpdateTriggerImpl updateTrigger = new UpdateTriggerImpl();
		return updateTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeleteTrigger createDeleteTrigger() {
		DeleteTriggerImpl deleteTrigger = new DeleteTriggerImpl();
		return deleteTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchTrigger createSearchTrigger() {
		SearchTriggerImpl searchTrigger = new SearchTriggerImpl();
		return searchTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Root createRoot() {
		RootImpl root = new RootImpl();
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormVariable createFormVariable() {
		FormVariableImpl formVariable = new FormVariableImpl();
		return formVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataControl createDataControl() {
		DataControlImpl dataControl = new DataControlImpl();
		return dataControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Orders createOrders() {
		OrdersImpl orders = new OrdersImpl();
		return orders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderBy createOrderBy() {
		OrderByImpl orderBy = new OrderByImpl();
		return orderBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relation createRelation() {
		RelationImpl relation = new RelationImpl();
		return relation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dependency createDependency() {
		DependencyImpl dependency = new DependencyImpl();
		return dependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtificialField createArtificialField() {
		ArtificialFieldImpl artificialField = new ArtificialFieldImpl();
		return artificialField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link createLink() {
		LinkImpl link = new LinkImpl();
		return link;
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
