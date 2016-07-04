/**
 */
package form.util;

import common.Categorized;
import common.HTMLLayerHolder;

import form.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import permission.Secured;

import type.MethodPointer;
import type.TypePointer;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see form.FormPackage
 * @generated
 */
public class FormSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FormPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormSwitch() {
		if (modelPackage == null) {
			modelPackage = FormPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case FormPackage.UI_PACKAGE: {
				UIPackage uiPackage = (UIPackage)theEObject;
				T result = caseUIPackage(uiPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.FORM: {
				Form form = (Form)theEObject;
				T result = caseForm(form);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.FORM_PARAMETER: {
				FormParameter formParameter = (FormParameter)theEObject;
				T result = caseFormParameter(formParameter);
				if (result == null) result = caseTypePointer(formParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.FORM_VIEW: {
				FormView formView = (FormView)theEObject;
				T result = caseFormView(formView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.VIEWS: {
				Views views = (Views)theEObject;
				T result = caseViews(views);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.ORDERABLE: {
				Orderable orderable = (Orderable)theEObject;
				T result = caseOrderable(orderable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.MULTI_LANG_LABEL: {
				MultiLangLabel multiLangLabel = (MultiLangLabel)theEObject;
				T result = caseMultiLangLabel(multiLangLabel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.CANVAS_FRAME: {
				CanvasFrame canvasFrame = (CanvasFrame)theEObject;
				T result = caseCanvasFrame(canvasFrame);
				if (result == null) result = caseStyleElement(canvasFrame);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.VIEW_PORT_HOLDER: {
				ViewPortHolder viewPortHolder = (ViewPortHolder)theEObject;
				T result = caseViewPortHolder(viewPortHolder);
				if (result == null) result = caseHTMLLayerHolder(viewPortHolder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.DEFAULT_CAVAS: {
				DefaultCavas defaultCavas = (DefaultCavas)theEObject;
				T result = caseDefaultCavas(defaultCavas);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.VIEW_ELEMENT: {
				ViewElement viewElement = (ViewElement)theEObject;
				T result = caseViewElement(viewElement);
				if (result == null) result = caseStyleElement(viewElement);
				if (result == null) result = caseCategorized(viewElement);
				if (result == null) result = caseNickNamed(viewElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.POPUP_CANVAS: {
				PopupCanvas popupCanvas = (PopupCanvas)theEObject;
				T result = casePopupCanvas(popupCanvas);
				if (result == null) result = caseCanvasFrame(popupCanvas);
				if (result == null) result = caseViewPortHolder(popupCanvas);
				if (result == null) result = caseDefaultCavas(popupCanvas);
				if (result == null) result = caseMultiLangLabel(popupCanvas);
				if (result == null) result = caseCategorized(popupCanvas);
				if (result == null) result = caseFlexFields(popupCanvas);
				if (result == null) result = caseStyleElement(popupCanvas);
				if (result == null) result = caseHTMLLayerHolder(popupCanvas);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.CANVAS: {
				Canvas canvas = (Canvas)theEObject;
				T result = caseCanvas(canvas);
				if (result == null) result = caseCanvasFrame(canvas);
				if (result == null) result = caseViewPortHolder(canvas);
				if (result == null) result = caseDefaultCavas(canvas);
				if (result == null) result = caseMultiLangLabel(canvas);
				if (result == null) result = caseCategorized(canvas);
				if (result == null) result = caseStyleElement(canvas);
				if (result == null) result = caseHTMLLayerHolder(canvas);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.WINDOW: {
				Window window = (Window)theEObject;
				T result = caseWindow(window);
				if (result == null) result = caseCanvasFrame(window);
				if (result == null) result = caseViewPortHolder(window);
				if (result == null) result = caseMultiLangLabel(window);
				if (result == null) result = caseCategorized(window);
				if (result == null) result = caseSecured(window);
				if (result == null) result = caseStyleElement(window);
				if (result == null) result = caseHTMLLayerHolder(window);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.MENU_DEFINITION: {
				MenuDefinition menuDefinition = (MenuDefinition)theEObject;
				T result = caseMenuDefinition(menuDefinition);
				if (result == null) result = caseStyleElement(menuDefinition);
				if (result == null) result = caseCategorized(menuDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.TAB_CANVAS: {
				TabCanvas tabCanvas = (TabCanvas)theEObject;
				T result = caseTabCanvas(tabCanvas);
				if (result == null) result = caseCanvasFrame(tabCanvas);
				if (result == null) result = caseDefaultCavas(tabCanvas);
				if (result == null) result = caseMultiLangLabel(tabCanvas);
				if (result == null) result = caseCategorized(tabCanvas);
				if (result == null) result = caseStyleElement(tabCanvas);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.TAB_PAGE: {
				TabPage tabPage = (TabPage)theEObject;
				T result = caseTabPage(tabPage);
				if (result == null) result = caseCanvasFrame(tabPage);
				if (result == null) result = caseViewPortHolder(tabPage);
				if (result == null) result = caseMultiLangLabel(tabPage);
				if (result == null) result = caseCategorized(tabPage);
				if (result == null) result = caseOrderable(tabPage);
				if (result == null) result = caseStyleElement(tabPage);
				if (result == null) result = caseHTMLLayerHolder(tabPage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.VIEW_PORT: {
				ViewPort viewPort = (ViewPort)theEObject;
				T result = caseViewPort(viewPort);
				if (result == null) result = caseViewElement(viewPort);
				if (result == null) result = caseOrderable(viewPort);
				if (result == null) result = caseStyleElement(viewPort);
				if (result == null) result = caseCategorized(viewPort);
				if (result == null) result = caseNickNamed(viewPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.VIEW_AREA: {
				ViewArea viewArea = (ViewArea)theEObject;
				T result = caseViewArea(viewArea);
				if (result == null) result = caseViewElement(viewArea);
				if (result == null) result = caseOrderable(viewArea);
				if (result == null) result = caseStyleElement(viewArea);
				if (result == null) result = caseCategorized(viewArea);
				if (result == null) result = caseNickNamed(viewArea);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.VIEW_PORT_TRIGGER: {
				ViewPortTrigger viewPortTrigger = (ViewPortTrigger)theEObject;
				T result = caseViewPortTrigger(viewPortTrigger);
				if (result == null) result = caseTrigger(viewPortTrigger);
				if (result == null) result = caseMethodPointer(viewPortTrigger);
				if (result == null) result = caseContextParameters(viewPortTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.VIEW_INHERITANCE: {
				ViewInheritance viewInheritance = (ViewInheritance)theEObject;
				T result = caseViewInheritance(viewInheritance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.TAB_PAGES_INHERITANCE: {
				TabPagesInheritance tabPagesInheritance = (TabPagesInheritance)theEObject;
				T result = caseTabPagesInheritance(tabPagesInheritance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.FORM_DATA_CONTROLS: {
				FormDataControls formDataControls = (FormDataControls)theEObject;
				T result = caseFormDataControls(formDataControls);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.CANVAS_VIEW: {
				CanvasView canvasView = (CanvasView)theEObject;
				T result = caseCanvasView(canvasView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.LINK_TO_MESSAGE: {
				LinkToMessage linkToMessage = (LinkToMessage)theEObject;
				T result = caseLinkToMessage(linkToMessage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.LINK_TO_LABEL: {
				LinkToLabel linkToLabel = (LinkToLabel)theEObject;
				T result = caseLinkToLabel(linkToLabel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.CHILDREN_HOLDER: {
				ChildrenHolder childrenHolder = (ChildrenHolder)theEObject;
				T result = caseChildrenHolder(childrenHolder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.CONTEXT_PARAMETER: {
				ContextParameter contextParameter = (ContextParameter)theEObject;
				T result = caseContextParameter(contextParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.CONTEXT_VALUE: {
				ContextValue contextValue = (ContextValue)theEObject;
				T result = caseContextValue(contextValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.EXPRESSION_PART: {
				ExpressionPart expressionPart = (ExpressionPart)theEObject;
				T result = caseExpressionPart(expressionPart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.CONTEXT_PARAMETERS: {
				ContextParameters contextParameters = (ContextParameters)theEObject;
				T result = caseContextParameters(contextParameters);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.CONTEXT: {
				Context context = (Context)theEObject;
				T result = caseContext(context);
				if (result == null) result = caseContextValue(context);
				if (result == null) result = caseContextParameters(context);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.STYLE_ELEMENT: {
				StyleElement styleElement = (StyleElement)theEObject;
				T result = caseStyleElement(styleElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.STYLE_CLASS: {
				StyleClass styleClass = (StyleClass)theEObject;
				T result = caseStyleClass(styleClass);
				if (result == null) result = caseContextValue(styleClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.NICK_NAMED: {
				NickNamed nickNamed = (NickNamed)theEObject;
				T result = caseNickNamed(nickNamed);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.FLEX_FIELDS: {
				FlexFields flexFields = (FlexFields)theEObject;
				T result = caseFlexFields(flexFields);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.FLEX_FIELD: {
				FlexField flexField = (FlexField)theEObject;
				T result = caseFlexField(flexField);
				if (result == null) result = caseContext(flexField);
				if (result == null) result = caseCategorized(flexField);
				if (result == null) result = caseContextValue(flexField);
				if (result == null) result = caseContextParameters(flexField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.ENABLED_UI_ITEM: {
				EnabledUIItem enabledUIItem = (EnabledUIItem)theEObject;
				T result = caseEnabledUIItem(enabledUIItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.UIELEMENT: {
				Uielement uielement = (Uielement)theEObject;
				T result = caseUielement(uielement);
				if (result == null) result = caseStyleElement(uielement);
				if (result == null) result = caseNickNamed(uielement);
				if (result == null) result = caseCategorized(uielement);
				if (result == null) result = caseOrderable(uielement);
				if (result == null) result = caseEnabledUIItem(uielement);
				if (result == null) result = caseFlexFields(uielement);
				if (result == null) result = caseMenuHolder(uielement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.ITEM_ICON: {
				ItemIcon itemIcon = (ItemIcon)theEObject;
				T result = caseItemIcon(itemIcon);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.AREA_REF: {
				AreaRef areaRef = (AreaRef)theEObject;
				T result = caseAreaRef(areaRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.FORMATABLE: {
				Formatable formatable = (Formatable)theEObject;
				T result = caseFormatable(formatable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.SOURCES_POINTER: {
				SourcesPointer sourcesPointer = (SourcesPointer)theEObject;
				T result = caseSourcesPointer(sourcesPointer);
				if (result == null) result = caseUielement(sourcesPointer);
				if (result == null) result = caseStyleElement(sourcesPointer);
				if (result == null) result = caseNickNamed(sourcesPointer);
				if (result == null) result = caseCategorized(sourcesPointer);
				if (result == null) result = caseOrderable(sourcesPointer);
				if (result == null) result = caseEnabledUIItem(sourcesPointer);
				if (result == null) result = caseFlexFields(sourcesPointer);
				if (result == null) result = caseMenuHolder(sourcesPointer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.INPUT_ELEMENT: {
				InputElement inputElement = (InputElement)theEObject;
				T result = caseInputElement(inputElement);
				if (result == null) result = caseSourcesPointer(inputElement);
				if (result == null) result = caseUielement(inputElement);
				if (result == null) result = caseStyleElement(inputElement);
				if (result == null) result = caseNickNamed(inputElement);
				if (result == null) result = caseCategorized(inputElement);
				if (result == null) result = caseOrderable(inputElement);
				if (result == null) result = caseEnabledUIItem(inputElement);
				if (result == null) result = caseFlexFields(inputElement);
				if (result == null) result = caseMenuHolder(inputElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.SELECTION: {
				Selection selection = (Selection)theEObject;
				T result = caseSelection(selection);
				if (result == null) result = caseStyleElement(selection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.OPTION_SELECTION: {
				OptionSelection optionSelection = (OptionSelection)theEObject;
				T result = caseOptionSelection(optionSelection);
				if (result == null) result = caseInputElement(optionSelection);
				if (result == null) result = caseSourcesPointer(optionSelection);
				if (result == null) result = caseUielement(optionSelection);
				if (result == null) result = caseStyleElement(optionSelection);
				if (result == null) result = caseNickNamed(optionSelection);
				if (result == null) result = caseCategorized(optionSelection);
				if (result == null) result = caseOrderable(optionSelection);
				if (result == null) result = caseEnabledUIItem(optionSelection);
				if (result == null) result = caseFlexFields(optionSelection);
				if (result == null) result = caseMenuHolder(optionSelection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.LAYER_HOLDER: {
				LayerHolder layerHolder = (LayerHolder)theEObject;
				T result = caseLayerHolder(layerHolder);
				if (result == null) result = caseUielement(layerHolder);
				if (result == null) result = caseChildrenHolder(layerHolder);
				if (result == null) result = caseHTMLLayerHolder(layerHolder);
				if (result == null) result = caseStyleElement(layerHolder);
				if (result == null) result = caseNickNamed(layerHolder);
				if (result == null) result = caseCategorized(layerHolder);
				if (result == null) result = caseOrderable(layerHolder);
				if (result == null) result = caseEnabledUIItem(layerHolder);
				if (result == null) result = caseFlexFields(layerHolder);
				if (result == null) result = caseMenuHolder(layerHolder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.INPUT_TEXT: {
				InputText inputText = (InputText)theEObject;
				T result = caseInputText(inputText);
				if (result == null) result = caseInputElement(inputText);
				if (result == null) result = caseFormatable(inputText);
				if (result == null) result = caseSourcesPointer(inputText);
				if (result == null) result = caseUielement(inputText);
				if (result == null) result = caseStyleElement(inputText);
				if (result == null) result = caseNickNamed(inputText);
				if (result == null) result = caseCategorized(inputText);
				if (result == null) result = caseOrderable(inputText);
				if (result == null) result = caseEnabledUIItem(inputText);
				if (result == null) result = caseFlexFields(inputText);
				if (result == null) result = caseMenuHolder(inputText);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.PASSWORD: {
				Password password = (Password)theEObject;
				T result = casePassword(password);
				if (result == null) result = caseInputElement(password);
				if (result == null) result = caseFormatable(password);
				if (result == null) result = caseSourcesPointer(password);
				if (result == null) result = caseUielement(password);
				if (result == null) result = caseStyleElement(password);
				if (result == null) result = caseNickNamed(password);
				if (result == null) result = caseCategorized(password);
				if (result == null) result = caseOrderable(password);
				if (result == null) result = caseEnabledUIItem(password);
				if (result == null) result = caseFlexFields(password);
				if (result == null) result = caseMenuHolder(password);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.LABEL: {
				Label label = (Label)theEObject;
				T result = caseLabel(label);
				if (result == null) result = caseUielement(label);
				if (result == null) result = caseMultiLangLabel(label);
				if (result == null) result = caseStyleElement(label);
				if (result == null) result = caseNickNamed(label);
				if (result == null) result = caseCategorized(label);
				if (result == null) result = caseOrderable(label);
				if (result == null) result = caseEnabledUIItem(label);
				if (result == null) result = caseFlexFields(label);
				if (result == null) result = caseMenuHolder(label);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.MESSAGE_ELEMENT: {
				MessageElement messageElement = (MessageElement)theEObject;
				T result = caseMessageElement(messageElement);
				if (result == null) result = caseUielement(messageElement);
				if (result == null) result = caseMultiLangLabel(messageElement);
				if (result == null) result = caseStyleElement(messageElement);
				if (result == null) result = caseNickNamed(messageElement);
				if (result == null) result = caseCategorized(messageElement);
				if (result == null) result = caseOrderable(messageElement);
				if (result == null) result = caseEnabledUIItem(messageElement);
				if (result == null) result = caseFlexFields(messageElement);
				if (result == null) result = caseMenuHolder(messageElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.OUTPUT_TEXT: {
				OutputText outputText = (OutputText)theEObject;
				T result = caseOutputText(outputText);
				if (result == null) result = caseInputElement(outputText);
				if (result == null) result = caseFormatable(outputText);
				if (result == null) result = caseSourcesPointer(outputText);
				if (result == null) result = caseUielement(outputText);
				if (result == null) result = caseStyleElement(outputText);
				if (result == null) result = caseNickNamed(outputText);
				if (result == null) result = caseCategorized(outputText);
				if (result == null) result = caseOrderable(outputText);
				if (result == null) result = caseEnabledUIItem(outputText);
				if (result == null) result = caseFlexFields(outputText);
				if (result == null) result = caseMenuHolder(outputText);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.CHECK_BOX: {
				CheckBox checkBox = (CheckBox)theEObject;
				T result = caseCheckBox(checkBox);
				if (result == null) result = caseInputElement(checkBox);
				if (result == null) result = caseSourcesPointer(checkBox);
				if (result == null) result = caseUielement(checkBox);
				if (result == null) result = caseStyleElement(checkBox);
				if (result == null) result = caseNickNamed(checkBox);
				if (result == null) result = caseCategorized(checkBox);
				if (result == null) result = caseOrderable(checkBox);
				if (result == null) result = caseEnabledUIItem(checkBox);
				if (result == null) result = caseFlexFields(checkBox);
				if (result == null) result = caseMenuHolder(checkBox);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.DROP_DOWN_SELECTION: {
				DropDownSelection dropDownSelection = (DropDownSelection)theEObject;
				T result = caseDropDownSelection(dropDownSelection);
				if (result == null) result = caseOptionSelection(dropDownSelection);
				if (result == null) result = caseInputElement(dropDownSelection);
				if (result == null) result = caseSourcesPointer(dropDownSelection);
				if (result == null) result = caseUielement(dropDownSelection);
				if (result == null) result = caseStyleElement(dropDownSelection);
				if (result == null) result = caseNickNamed(dropDownSelection);
				if (result == null) result = caseCategorized(dropDownSelection);
				if (result == null) result = caseOrderable(dropDownSelection);
				if (result == null) result = caseEnabledUIItem(dropDownSelection);
				if (result == null) result = caseFlexFields(dropDownSelection);
				if (result == null) result = caseMenuHolder(dropDownSelection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.IMAGE: {
				Image image = (Image)theEObject;
				T result = caseImage(image);
				if (result == null) result = caseInputElement(image);
				if (result == null) result = caseSourcesPointer(image);
				if (result == null) result = caseUielement(image);
				if (result == null) result = caseStyleElement(image);
				if (result == null) result = caseNickNamed(image);
				if (result == null) result = caseCategorized(image);
				if (result == null) result = caseOrderable(image);
				if (result == null) result = caseEnabledUIItem(image);
				if (result == null) result = caseFlexFields(image);
				if (result == null) result = caseMenuHolder(image);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.DATE: {
				Date date = (Date)theEObject;
				T result = caseDate(date);
				if (result == null) result = caseInputElement(date);
				if (result == null) result = caseFormatable(date);
				if (result == null) result = caseSourcesPointer(date);
				if (result == null) result = caseUielement(date);
				if (result == null) result = caseStyleElement(date);
				if (result == null) result = caseNickNamed(date);
				if (result == null) result = caseCategorized(date);
				if (result == null) result = caseOrderable(date);
				if (result == null) result = caseEnabledUIItem(date);
				if (result == null) result = caseFlexFields(date);
				if (result == null) result = caseMenuHolder(date);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.BUTTON: {
				Button button = (Button)theEObject;
				T result = caseButton(button);
				if (result == null) result = caseUielement(button);
				if (result == null) result = caseMultiLangLabel(button);
				if (result == null) result = caseItemIcon(button);
				if (result == null) result = caseStyleElement(button);
				if (result == null) result = caseNickNamed(button);
				if (result == null) result = caseCategorized(button);
				if (result == null) result = caseOrderable(button);
				if (result == null) result = caseEnabledUIItem(button);
				if (result == null) result = caseFlexFields(button);
				if (result == null) result = caseMenuHolder(button);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.COLUMN: {
				Column column = (Column)theEObject;
				T result = caseColumn(column);
				if (result == null) result = caseStyleElement(column);
				if (result == null) result = caseMultiLangLabel(column);
				if (result == null) result = caseCategorized(column);
				if (result == null) result = caseHTMLLayerHolder(column);
				if (result == null) result = caseOrderable(column);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.TABLE: {
				Table table = (Table)theEObject;
				T result = caseTable(table);
				if (result == null) result = caseSourcesPointer(table);
				if (result == null) result = caseHTMLLayerHolder(table);
				if (result == null) result = caseMultiLangLabel(table);
				if (result == null) result = caseUielement(table);
				if (result == null) result = caseStyleElement(table);
				if (result == null) result = caseNickNamed(table);
				if (result == null) result = caseCategorized(table);
				if (result == null) result = caseOrderable(table);
				if (result == null) result = caseEnabledUIItem(table);
				if (result == null) result = caseFlexFields(table);
				if (result == null) result = caseMenuHolder(table);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.MENU: {
				Menu menu = (Menu)theEObject;
				T result = caseMenu(menu);
				if (result == null) result = caseUielement(menu);
				if (result == null) result = caseStyleElement(menu);
				if (result == null) result = caseNickNamed(menu);
				if (result == null) result = caseCategorized(menu);
				if (result == null) result = caseOrderable(menu);
				if (result == null) result = caseEnabledUIItem(menu);
				if (result == null) result = caseFlexFields(menu);
				if (result == null) result = caseMenuHolder(menu);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.MENU_VIEW: {
				MenuView menuView = (MenuView)theEObject;
				T result = caseMenuView(menuView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.MENU_HOLDER: {
				MenuHolder menuHolder = (MenuHolder)theEObject;
				T result = caseMenuHolder(menuHolder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.MENU_EXTENSION_REF: {
				MenuExtensionRef menuExtensionRef = (MenuExtensionRef)theEObject;
				T result = caseMenuExtensionRef(menuExtensionRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.MENU_ELEMENT: {
				MenuElement menuElement = (MenuElement)theEObject;
				T result = caseMenuElement(menuElement);
				if (result == null) result = caseMultiLangLabel(menuElement);
				if (result == null) result = caseStyleElement(menuElement);
				if (result == null) result = caseCategorized(menuElement);
				if (result == null) result = caseEnabledUIItem(menuElement);
				if (result == null) result = caseOrderable(menuElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.MENU_FOLDER: {
				MenuFolder menuFolder = (MenuFolder)theEObject;
				T result = caseMenuFolder(menuFolder);
				if (result == null) result = caseHTMLLayerHolder(menuFolder);
				if (result == null) result = caseEnabledUIItem(menuFolder);
				if (result == null) result = caseCategorized(menuFolder);
				if (result == null) result = caseStyleElement(menuFolder);
				if (result == null) result = caseMultiLangLabel(menuFolder);
				if (result == null) result = caseItemIcon(menuFolder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.MENU_ITEM: {
				MenuItem menuItem = (MenuItem)theEObject;
				T result = caseMenuItem(menuItem);
				if (result == null) result = caseMenuElement(menuItem);
				if (result == null) result = caseItemIcon(menuItem);
				if (result == null) result = caseFlexFields(menuItem);
				if (result == null) result = caseMultiLangLabel(menuItem);
				if (result == null) result = caseStyleElement(menuItem);
				if (result == null) result = caseCategorized(menuItem);
				if (result == null) result = caseEnabledUIItem(menuItem);
				if (result == null) result = caseOrderable(menuItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.MENU_EXTENSION_POINT: {
				MenuExtensionPoint menuExtensionPoint = (MenuExtensionPoint)theEObject;
				T result = caseMenuExtensionPoint(menuExtensionPoint);
				if (result == null) result = caseMenuElement(menuExtensionPoint);
				if (result == null) result = caseMenuExtensionRef(menuExtensionPoint);
				if (result == null) result = caseMultiLangLabel(menuExtensionPoint);
				if (result == null) result = caseStyleElement(menuExtensionPoint);
				if (result == null) result = caseCategorized(menuExtensionPoint);
				if (result == null) result = caseEnabledUIItem(menuExtensionPoint);
				if (result == null) result = caseOrderable(menuExtensionPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.SUB_MENU: {
				SubMenu subMenu = (SubMenu)theEObject;
				T result = caseSubMenu(subMenu);
				if (result == null) result = caseMenuElement(subMenu);
				if (result == null) result = caseItemIcon(subMenu);
				if (result == null) result = caseMultiLangLabel(subMenu);
				if (result == null) result = caseStyleElement(subMenu);
				if (result == null) result = caseCategorized(subMenu);
				if (result == null) result = caseEnabledUIItem(subMenu);
				if (result == null) result = caseOrderable(subMenu);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.MENU_SEPARATOR: {
				MenuSeparator menuSeparator = (MenuSeparator)theEObject;
				T result = caseMenuSeparator(menuSeparator);
				if (result == null) result = caseMenuElement(menuSeparator);
				if (result == null) result = caseMultiLangLabel(menuSeparator);
				if (result == null) result = caseStyleElement(menuSeparator);
				if (result == null) result = caseCategorized(menuSeparator);
				if (result == null) result = caseEnabledUIItem(menuSeparator);
				if (result == null) result = caseOrderable(menuSeparator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.TREE: {
				Tree tree = (Tree)theEObject;
				T result = caseTree(tree);
				if (result == null) result = caseSourcesPointer(tree);
				if (result == null) result = caseHTMLLayerHolder(tree);
				if (result == null) result = caseMultiLangLabel(tree);
				if (result == null) result = caseUielement(tree);
				if (result == null) result = caseStyleElement(tree);
				if (result == null) result = caseNickNamed(tree);
				if (result == null) result = caseCategorized(tree);
				if (result == null) result = caseOrderable(tree);
				if (result == null) result = caseEnabledUIItem(tree);
				if (result == null) result = caseFlexFields(tree);
				if (result == null) result = caseMenuHolder(tree);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.CONTROLS: {
				Controls controls = (Controls)theEObject;
				T result = caseControls(controls);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.TRIGGER: {
				Trigger trigger = (Trigger)theEObject;
				T result = caseTrigger(trigger);
				if (result == null) result = caseMethodPointer(trigger);
				if (result == null) result = caseContextParameters(trigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.PRE_FORM_TRIGGER: {
				PREFormTrigger preFormTrigger = (PREFormTrigger)theEObject;
				T result = casePREFormTrigger(preFormTrigger);
				if (result == null) result = caseTrigger(preFormTrigger);
				if (result == null) result = caseMethodPointer(preFormTrigger);
				if (result == null) result = caseContextParameters(preFormTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.PRE_QUERY_TRIGGER: {
				PREQueryTrigger preQueryTrigger = (PREQueryTrigger)theEObject;
				T result = casePREQueryTrigger(preQueryTrigger);
				if (result == null) result = caseTrigger(preQueryTrigger);
				if (result == null) result = caseMethodPointer(preQueryTrigger);
				if (result == null) result = caseContextParameters(preQueryTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.POST_QUERY_TRIGGER: {
				POSTQueryTrigger postQueryTrigger = (POSTQueryTrigger)theEObject;
				T result = casePOSTQueryTrigger(postQueryTrigger);
				if (result == null) result = caseTrigger(postQueryTrigger);
				if (result == null) result = caseMethodPointer(postQueryTrigger);
				if (result == null) result = caseContextParameters(postQueryTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.PRE_INSERT_TRIGGER: {
				PREInsertTrigger preInsertTrigger = (PREInsertTrigger)theEObject;
				T result = casePREInsertTrigger(preInsertTrigger);
				if (result == null) result = caseTrigger(preInsertTrigger);
				if (result == null) result = caseMethodPointer(preInsertTrigger);
				if (result == null) result = caseContextParameters(preInsertTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.PRE_DELETE_TRIGGER: {
				PREDeleteTrigger preDeleteTrigger = (PREDeleteTrigger)theEObject;
				T result = casePREDeleteTrigger(preDeleteTrigger);
				if (result == null) result = caseTrigger(preDeleteTrigger);
				if (result == null) result = caseMethodPointer(preDeleteTrigger);
				if (result == null) result = caseContextParameters(preDeleteTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.POST_CREATE_TRIGGER: {
				POSTCreateTrigger postCreateTrigger = (POSTCreateTrigger)theEObject;
				T result = casePOSTCreateTrigger(postCreateTrigger);
				if (result == null) result = caseTrigger(postCreateTrigger);
				if (result == null) result = caseMethodPointer(postCreateTrigger);
				if (result == null) result = caseContextParameters(postCreateTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.PRE_UPDATE_TRIGGER: {
				PREUpdateTrigger preUpdateTrigger = (PREUpdateTrigger)theEObject;
				T result = casePREUpdateTrigger(preUpdateTrigger);
				if (result == null) result = caseTrigger(preUpdateTrigger);
				if (result == null) result = caseMethodPointer(preUpdateTrigger);
				if (result == null) result = caseContextParameters(preUpdateTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.PROXIES_LIST: {
				ProxiesList proxiesList = (ProxiesList)theEObject;
				T result = caseProxiesList(proxiesList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.CREATE_TRIGGER: {
				CreateTrigger createTrigger = (CreateTrigger)theEObject;
				T result = caseCreateTrigger(createTrigger);
				if (result == null) result = caseTrigger(createTrigger);
				if (result == null) result = caseProxiesList(createTrigger);
				if (result == null) result = caseMethodPointer(createTrigger);
				if (result == null) result = caseContextParameters(createTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.INSERT_TRIGGER: {
				InsertTrigger insertTrigger = (InsertTrigger)theEObject;
				T result = caseInsertTrigger(insertTrigger);
				if (result == null) result = caseTrigger(insertTrigger);
				if (result == null) result = caseProxiesList(insertTrigger);
				if (result == null) result = caseMethodPointer(insertTrigger);
				if (result == null) result = caseContextParameters(insertTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.UPDATE_TRIGGER: {
				UpdateTrigger updateTrigger = (UpdateTrigger)theEObject;
				T result = caseUpdateTrigger(updateTrigger);
				if (result == null) result = caseTrigger(updateTrigger);
				if (result == null) result = caseProxiesList(updateTrigger);
				if (result == null) result = caseMethodPointer(updateTrigger);
				if (result == null) result = caseContextParameters(updateTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.DELETE_TRIGGER: {
				DeleteTrigger deleteTrigger = (DeleteTrigger)theEObject;
				T result = caseDeleteTrigger(deleteTrigger);
				if (result == null) result = caseTrigger(deleteTrigger);
				if (result == null) result = caseProxiesList(deleteTrigger);
				if (result == null) result = caseMethodPointer(deleteTrigger);
				if (result == null) result = caseContextParameters(deleteTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.SEARCH_TRIGGER: {
				SearchTrigger searchTrigger = (SearchTrigger)theEObject;
				T result = caseSearchTrigger(searchTrigger);
				if (result == null) result = caseTrigger(searchTrigger);
				if (result == null) result = caseProxiesList(searchTrigger);
				if (result == null) result = caseMethodPointer(searchTrigger);
				if (result == null) result = caseContextParameters(searchTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.ROOT: {
				Root root = (Root)theEObject;
				T result = caseRoot(root);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.FORM_VARIABLE: {
				FormVariable formVariable = (FormVariable)theEObject;
				T result = caseFormVariable(formVariable);
				if (result == null) result = caseTypePointer(formVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.DATA_CONTROL: {
				DataControl dataControl = (DataControl)theEObject;
				T result = caseDataControl(dataControl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.ORDERS: {
				Orders orders = (Orders)theEObject;
				T result = caseOrders(orders);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.ORDER_BY: {
				OrderBy orderBy = (OrderBy)theEObject;
				T result = caseOrderBy(orderBy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.RELATION: {
				Relation relation = (Relation)theEObject;
				T result = caseRelation(relation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.DEPENDENCY: {
				Dependency dependency = (Dependency)theEObject;
				T result = caseDependency(dependency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.ARTIFICIAL_FIELD: {
				ArtificialField artificialField = (ArtificialField)theEObject;
				T result = caseArtificialField(artificialField);
				if (result == null) result = caseTypePointer(artificialField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.LINK: {
				Link link = (Link)theEObject;
				T result = caseLink(link);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UI Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UI Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUIPackage(UIPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Form</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Form</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForm(Form object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormParameter(FormParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormView(FormView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Views</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Views</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViews(Views object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Orderable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Orderable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrderable(Orderable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Lang Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Lang Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiLangLabel(MultiLangLabel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Canvas Frame</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Canvas Frame</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCanvasFrame(CanvasFrame object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View Port Holder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View Port Holder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViewPortHolder(ViewPortHolder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Default Cavas</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Default Cavas</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefaultCavas(DefaultCavas object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViewElement(ViewElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Popup Canvas</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Popup Canvas</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePopupCanvas(PopupCanvas object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Canvas</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Canvas</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCanvas(Canvas object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Window</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Window</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWindow(Window object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Menu Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Menu Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMenuDefinition(MenuDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tab Canvas</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tab Canvas</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTabCanvas(TabCanvas object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tab Page</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tab Page</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTabPage(TabPage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViewPort(ViewPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View Area</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View Area</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViewArea(ViewArea object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View Port Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View Port Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViewPortTrigger(ViewPortTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View Inheritance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View Inheritance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViewInheritance(ViewInheritance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tab Pages Inheritance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tab Pages Inheritance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTabPagesInheritance(TabPagesInheritance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Controls</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Controls</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormDataControls(FormDataControls object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Canvas View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Canvas View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCanvasView(CanvasView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link To Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link To Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkToMessage(LinkToMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link To Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link To Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkToLabel(LinkToLabel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Children Holder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Children Holder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChildrenHolder(ChildrenHolder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Context Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContextParameter(ContextParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Context Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContextValue(ContextValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpressionPart(ExpressionPart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Context Parameters</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context Parameters</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContextParameters(ContextParameters object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContext(Context object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Style Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Style Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStyleElement(StyleElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Style Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Style Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStyleClass(StyleClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nick Named</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nick Named</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNickNamed(NickNamed object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flex Fields</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flex Fields</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlexFields(FlexFields object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flex Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flex Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlexField(FlexField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enabled UI Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enabled UI Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnabledUIItem(EnabledUIItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uielement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uielement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUielement(Uielement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item Icon</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item Icon</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItemIcon(ItemIcon object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Area Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Area Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAreaRef(AreaRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Formatable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Formatable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormatable(Formatable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sources Pointer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sources Pointer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSourcesPointer(SourcesPointer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputElement(InputElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Selection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Selection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelection(Selection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Option Selection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Option Selection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOptionSelection(OptionSelection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Layer Holder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Layer Holder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLayerHolder(LayerHolder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputText(InputText object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Password</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Password</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePassword(Password object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabel(Label object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageElement(MessageElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputText(OutputText object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Check Box</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Check Box</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCheckBox(CheckBox object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Drop Down Selection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Drop Down Selection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDropDownSelection(DropDownSelection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImage(Image object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDate(Date object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Button</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Button</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseButton(Button object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Column</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Column</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColumn(Column object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTable(Table object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Menu</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Menu</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMenu(Menu object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Menu View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Menu View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMenuView(MenuView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Menu Holder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Menu Holder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMenuHolder(MenuHolder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Menu Extension Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Menu Extension Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMenuExtensionRef(MenuExtensionRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Menu Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Menu Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMenuElement(MenuElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Menu Folder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Menu Folder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMenuFolder(MenuFolder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Menu Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Menu Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMenuItem(MenuItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Menu Extension Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Menu Extension Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMenuExtensionPoint(MenuExtensionPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub Menu</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub Menu</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubMenu(SubMenu object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Menu Separator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Menu Separator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMenuSeparator(MenuSeparator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tree</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTree(Tree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Controls</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Controls</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControls(Controls object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrigger(Trigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PRE Form Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PRE Form Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePREFormTrigger(PREFormTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PRE Query Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PRE Query Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePREQueryTrigger(PREQueryTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>POST Query Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>POST Query Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePOSTQueryTrigger(POSTQueryTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PRE Insert Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PRE Insert Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePREInsertTrigger(PREInsertTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PRE Delete Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PRE Delete Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePREDeleteTrigger(PREDeleteTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>POST Create Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>POST Create Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePOSTCreateTrigger(POSTCreateTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PRE Update Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PRE Update Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePREUpdateTrigger(PREUpdateTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Proxies List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Proxies List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProxiesList(ProxiesList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateTrigger(CreateTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Insert Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Insert Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInsertTrigger(InsertTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdateTrigger(UpdateTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delete Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delete Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeleteTrigger(DeleteTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Search Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Search Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSearchTrigger(SearchTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoot(Root object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormVariable(FormVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Control</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Control</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataControl(DataControl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Orders</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Orders</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrders(Orders object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Order By</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Order By</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrderBy(OrderBy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelation(Relation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dependency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDependency(Dependency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Artificial Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Artificial Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArtificialField(ArtificialField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLink(Link object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pointer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pointer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypePointer(TypePointer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HTML Layer Holder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HTML Layer Holder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHTMLLayerHolder(HTMLLayerHolder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Categorized</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Categorized</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCategorized(Categorized object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Secured</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Secured</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecured(Secured object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Pointer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Pointer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodPointer(MethodPointer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //FormSwitch
