/**
 */
package form;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see form.FormPackage
 * @generated
 */
public interface FormFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FormFactory eINSTANCE = form.impl.FormFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Form</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Form</em>'.
	 * @generated
	 */
	Form createForm();

	/**
	 * Returns a new object of class '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
	FormParameter createFormParameter();

	/**
	 * Returns a new object of class '<em>Views</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Views</em>'.
	 * @generated
	 */
	Views createViews();

	/**
	 * Returns a new object of class '<em>Multi Lang Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multi Lang Label</em>'.
	 * @generated
	 */
	MultiLangLabel createMultiLangLabel();

	/**
	 * Returns a new object of class '<em>Canvas Frame</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Canvas Frame</em>'.
	 * @generated
	 */
	CanvasFrame createCanvasFrame();

	/**
	 * Returns a new object of class '<em>View Port Holder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>View Port Holder</em>'.
	 * @generated
	 */
	ViewPortHolder createViewPortHolder();

	/**
	 * Returns a new object of class '<em>Default Cavas</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Default Cavas</em>'.
	 * @generated
	 */
	DefaultCavas createDefaultCavas();

	/**
	 * Returns a new object of class '<em>View Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>View Element</em>'.
	 * @generated
	 */
	ViewElement createViewElement();

	/**
	 * Returns a new object of class '<em>Popup Canvas</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Popup Canvas</em>'.
	 * @generated
	 */
	PopupCanvas createPopupCanvas();

	/**
	 * Returns a new object of class '<em>Canvas</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Canvas</em>'.
	 * @generated
	 */
	Canvas createCanvas();

	/**
	 * Returns a new object of class '<em>Window</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Window</em>'.
	 * @generated
	 */
	Window createWindow();

	/**
	 * Returns a new object of class '<em>Menu Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Menu Definition</em>'.
	 * @generated
	 */
	MenuDefinition createMenuDefinition();

	/**
	 * Returns a new object of class '<em>Tab Canvas</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tab Canvas</em>'.
	 * @generated
	 */
	TabCanvas createTabCanvas();

	/**
	 * Returns a new object of class '<em>Tab Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tab Page</em>'.
	 * @generated
	 */
	TabPage createTabPage();

	/**
	 * Returns a new object of class '<em>View Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>View Port</em>'.
	 * @generated
	 */
	ViewPort createViewPort();

	/**
	 * Returns a new object of class '<em>View Area</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>View Area</em>'.
	 * @generated
	 */
	ViewArea createViewArea();

	/**
	 * Returns a new object of class '<em>View Port Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>View Port Trigger</em>'.
	 * @generated
	 */
	ViewPortTrigger createViewPortTrigger();

	/**
	 * Returns a new object of class '<em>View Inheritance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>View Inheritance</em>'.
	 * @generated
	 */
	ViewInheritance createViewInheritance();

	/**
	 * Returns a new object of class '<em>Tab Pages Inheritance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tab Pages Inheritance</em>'.
	 * @generated
	 */
	TabPagesInheritance createTabPagesInheritance();

	/**
	 * Returns a new object of class '<em>Link To Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link To Message</em>'.
	 * @generated
	 */
	LinkToMessage createLinkToMessage();

	/**
	 * Returns a new object of class '<em>Link To Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link To Label</em>'.
	 * @generated
	 */
	LinkToLabel createLinkToLabel();

	/**
	 * Returns a new object of class '<em>Children Holder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Children Holder</em>'.
	 * @generated
	 */
	ChildrenHolder createChildrenHolder();

	/**
	 * Returns a new object of class '<em>Context Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Context Parameter</em>'.
	 * @generated
	 */
	ContextParameter createContextParameter();

	/**
	 * Returns a new object of class '<em>Context Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Context Value</em>'.
	 * @generated
	 */
	ContextValue createContextValue();

	/**
	 * Returns a new object of class '<em>Expression Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression Part</em>'.
	 * @generated
	 */
	ExpressionPart createExpressionPart();

	/**
	 * Returns a new object of class '<em>Context Parameters</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Context Parameters</em>'.
	 * @generated
	 */
	ContextParameters createContextParameters();

	/**
	 * Returns a new object of class '<em>Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Context</em>'.
	 * @generated
	 */
	Context createContext();

	/**
	 * Returns a new object of class '<em>Style Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Style Element</em>'.
	 * @generated
	 */
	StyleElement createStyleElement();

	/**
	 * Returns a new object of class '<em>Nick Named</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nick Named</em>'.
	 * @generated
	 */
	NickNamed createNickNamed();

	/**
	 * Returns a new object of class '<em>Flex Fields</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Flex Fields</em>'.
	 * @generated
	 */
	FlexFields createFlexFields();

	/**
	 * Returns a new object of class '<em>Flex Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Flex Field</em>'.
	 * @generated
	 */
	FlexField createFlexField();

	/**
	 * Returns a new object of class '<em>Enabled UI Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enabled UI Item</em>'.
	 * @generated
	 */
	EnabledUIItem createEnabledUIItem();

	/**
	 * Returns a new object of class '<em>Uielement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Uielement</em>'.
	 * @generated
	 */
	Uielement createUielement();

	/**
	 * Returns a new object of class '<em>Item Icon</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item Icon</em>'.
	 * @generated
	 */
	ItemIcon createItemIcon();

	/**
	 * Returns a new object of class '<em>Area Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Area Ref</em>'.
	 * @generated
	 */
	AreaRef createAreaRef();

	/**
	 * Returns a new object of class '<em>Formatable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Formatable</em>'.
	 * @generated
	 */
	Formatable createFormatable();

	/**
	 * Returns a new object of class '<em>Control Pointer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Control Pointer</em>'.
	 * @generated
	 */
	ControlPointer createControlPointer();

	/**
	 * Returns a new object of class '<em>Sources Pointer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sources Pointer</em>'.
	 * @generated
	 */
	SourcesPointer createSourcesPointer();

	/**
	 * Returns a new object of class '<em>Input Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Element</em>'.
	 * @generated
	 */
	InputElement createInputElement();

	/**
	 * Returns a new object of class '<em>Selection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Selection</em>'.
	 * @generated
	 */
	Selection createSelection();

	/**
	 * Returns a new object of class '<em>Option Selection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Option Selection</em>'.
	 * @generated
	 */
	OptionSelection createOptionSelection();

	/**
	 * Returns a new object of class '<em>Layer Holder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Layer Holder</em>'.
	 * @generated
	 */
	LayerHolder createLayerHolder();

	/**
	 * Returns a new object of class '<em>Input Text</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Text</em>'.
	 * @generated
	 */
	InputText createInputText();

	/**
	 * Returns a new object of class '<em>Password</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Password</em>'.
	 * @generated
	 */
	Password createPassword();

	/**
	 * Returns a new object of class '<em>Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Label</em>'.
	 * @generated
	 */
	Label createLabel();

	/**
	 * Returns a new object of class '<em>Message Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message Element</em>'.
	 * @generated
	 */
	MessageElement createMessageElement();

	/**
	 * Returns a new object of class '<em>Output Text</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output Text</em>'.
	 * @generated
	 */
	OutputText createOutputText();

	/**
	 * Returns a new object of class '<em>Check Box</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Check Box</em>'.
	 * @generated
	 */
	CheckBox createCheckBox();

	/**
	 * Returns a new object of class '<em>Drop Down Selection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Drop Down Selection</em>'.
	 * @generated
	 */
	DropDownSelection createDropDownSelection();

	/**
	 * Returns a new object of class '<em>Image</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Image</em>'.
	 * @generated
	 */
	Image createImage();

	/**
	 * Returns a new object of class '<em>Date</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Date</em>'.
	 * @generated
	 */
	Date createDate();

	/**
	 * Returns a new object of class '<em>Button</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Button</em>'.
	 * @generated
	 */
	Button createButton();

	/**
	 * Returns a new object of class '<em>Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Column</em>'.
	 * @generated
	 */
	Column createColumn();

	/**
	 * Returns a new object of class '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table</em>'.
	 * @generated
	 */
	Table createTable();

	/**
	 * Returns a new object of class '<em>Menu</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Menu</em>'.
	 * @generated
	 */
	Menu createMenu();

	/**
	 * Returns a new object of class '<em>Block UI</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Block UI</em>'.
	 * @generated
	 */
	BlockUI createBlockUI();

	/**
	 * Returns a new object of class '<em>Poll</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Poll</em>'.
	 * @generated
	 */
	Poll createPoll();

	/**
	 * Returns a new object of class '<em>Menu Holder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Menu Holder</em>'.
	 * @generated
	 */
	MenuHolder createMenuHolder();

	/**
	 * Returns a new object of class '<em>Menu Extension Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Menu Extension Ref</em>'.
	 * @generated
	 */
	MenuExtensionRef createMenuExtensionRef();

	/**
	 * Returns a new object of class '<em>Menu Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Menu Element</em>'.
	 * @generated
	 */
	MenuElement createMenuElement();

	/**
	 * Returns a new object of class '<em>Menu Folder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Menu Folder</em>'.
	 * @generated
	 */
	MenuFolder createMenuFolder();

	/**
	 * Returns a new object of class '<em>Menu Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Menu Item</em>'.
	 * @generated
	 */
	MenuItem createMenuItem();

	/**
	 * Returns a new object of class '<em>Menu Extension Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Menu Extension Point</em>'.
	 * @generated
	 */
	MenuExtensionPoint createMenuExtensionPoint();

	/**
	 * Returns a new object of class '<em>Sub Menu</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sub Menu</em>'.
	 * @generated
	 */
	SubMenu createSubMenu();

	/**
	 * Returns a new object of class '<em>To Submenu</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>To Submenu</em>'.
	 * @generated
	 */
	ToSubmenu createToSubmenu();

	/**
	 * Returns a new object of class '<em>Menu Separator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Menu Separator</em>'.
	 * @generated
	 */
	MenuSeparator createMenuSeparator();

	/**
	 * Returns a new object of class '<em>Tree</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tree</em>'.
	 * @generated
	 */
	Tree createTree();

	/**
	 * Returns a new object of class '<em>Controls</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Controls</em>'.
	 * @generated
	 */
	Controls createControls();

	/**
	 * Returns a new object of class '<em>Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trigger</em>'.
	 * @generated
	 */
	Trigger createTrigger();

	/**
	 * Returns a new object of class '<em>PRE Form Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PRE Form Trigger</em>'.
	 * @generated
	 */
	PREFormTrigger createPREFormTrigger();

	/**
	 * Returns a new object of class '<em>PRE Query Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PRE Query Trigger</em>'.
	 * @generated
	 */
	PREQueryTrigger createPREQueryTrigger();

	/**
	 * Returns a new object of class '<em>POST Query Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>POST Query Trigger</em>'.
	 * @generated
	 */
	POSTQueryTrigger createPOSTQueryTrigger();

	/**
	 * Returns a new object of class '<em>PRE Insert Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PRE Insert Trigger</em>'.
	 * @generated
	 */
	PREInsertTrigger createPREInsertTrigger();

	/**
	 * Returns a new object of class '<em>PRE Delete Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PRE Delete Trigger</em>'.
	 * @generated
	 */
	PREDeleteTrigger createPREDeleteTrigger();

	/**
	 * Returns a new object of class '<em>POST Create Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>POST Create Trigger</em>'.
	 * @generated
	 */
	POSTCreateTrigger createPOSTCreateTrigger();

	/**
	 * Returns a new object of class '<em>PRE Update Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PRE Update Trigger</em>'.
	 * @generated
	 */
	PREUpdateTrigger createPREUpdateTrigger();

	/**
	 * Returns a new object of class '<em>Create Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create Trigger</em>'.
	 * @generated
	 */
	CreateTrigger createCreateTrigger();

	/**
	 * Returns a new object of class '<em>Insert Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Insert Trigger</em>'.
	 * @generated
	 */
	InsertTrigger createInsertTrigger();

	/**
	 * Returns a new object of class '<em>Update Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Update Trigger</em>'.
	 * @generated
	 */
	UpdateTrigger createUpdateTrigger();

	/**
	 * Returns a new object of class '<em>Delete Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delete Trigger</em>'.
	 * @generated
	 */
	DeleteTrigger createDeleteTrigger();

	/**
	 * Returns a new object of class '<em>Search Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Search Trigger</em>'.
	 * @generated
	 */
	SearchTrigger createSearchTrigger();

	/**
	 * Returns a new object of class '<em>Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Root</em>'.
	 * @generated
	 */
	Root createRoot();

	/**
	 * Returns a new object of class '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable</em>'.
	 * @generated
	 */
	FormVariable createFormVariable();

	/**
	 * Returns a new object of class '<em>Data Control</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Control</em>'.
	 * @generated
	 */
	DataControl createDataControl();

	/**
	 * Returns a new object of class '<em>Relation Mapper</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relation Mapper</em>'.
	 * @generated
	 */
	RelationMapper createRelationMapper();

	/**
	 * Returns a new object of class '<em>Orders</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Orders</em>'.
	 * @generated
	 */
	Orders createOrders();

	/**
	 * Returns a new object of class '<em>Order By</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Order By</em>'.
	 * @generated
	 */
	OrderBy createOrderBy();

	/**
	 * Returns a new object of class '<em>Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relation</em>'.
	 * @generated
	 */
	Relation createRelation();

	/**
	 * Returns a new object of class '<em>Internal Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Internal Relation</em>'.
	 * @generated
	 */
	InternalRelation createInternalRelation();

	/**
	 * Returns a new object of class '<em>Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dependency</em>'.
	 * @generated
	 */
	Dependency createDependency();

	/**
	 * Returns a new object of class '<em>Artificial Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Artificial Field</em>'.
	 * @generated
	 */
	ArtificialField createArtificialField();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FormPackage getFormPackage();

} //FormFactory
