/**
 */
package tura.form.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import tura.common.Categorized;

import tura.form.*;

import tura.permission.Secured;

import tura.type.MethodPointer;
import tura.type.TypePointer;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see tura.form.FormPackage
 * @generated
 */
public class FormAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FormPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = FormPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormSwitch<Adapter> modelSwitch =
		new FormSwitch<Adapter>() {
			@Override
			public Adapter caseUIPackage(UIPackage object) {
				return createUIPackageAdapter();
			}
			@Override
			public Adapter caseForm(Form object) {
				return createFormAdapter();
			}
			@Override
			public Adapter caseFormParameter(FormParameter object) {
				return createFormParameterAdapter();
			}
			@Override
			public Adapter caseFormView(FormView object) {
				return createFormViewAdapter();
			}
			@Override
			public Adapter caseViews(Views object) {
				return createViewsAdapter();
			}
			@Override
			public Adapter caseHTMLLayerHolder(HTMLLayerHolder object) {
				return createHTMLLayerHolderAdapter();
			}
			@Override
			public Adapter caseOrderable(Orderable object) {
				return createOrderableAdapter();
			}
			@Override
			public Adapter caseMultiLangLabel(MultiLangLabel object) {
				return createMultiLangLabelAdapter();
			}
			@Override
			public Adapter caseCanvasFrame(CanvasFrame object) {
				return createCanvasFrameAdapter();
			}
			@Override
			public Adapter caseViewPortHolder(ViewPortHolder object) {
				return createViewPortHolderAdapter();
			}
			@Override
			public Adapter caseDefaultCavas(DefaultCavas object) {
				return createDefaultCavasAdapter();
			}
			@Override
			public Adapter caseViewElement(ViewElement object) {
				return createViewElementAdapter();
			}
			@Override
			public Adapter casePopupCanvas(PopupCanvas object) {
				return createPopupCanvasAdapter();
			}
			@Override
			public Adapter caseCanvas(Canvas object) {
				return createCanvasAdapter();
			}
			@Override
			public Adapter caseWindow(Window object) {
				return createWindowAdapter();
			}
			@Override
			public Adapter caseMenuDefinition(MenuDefinition object) {
				return createMenuDefinitionAdapter();
			}
			@Override
			public Adapter caseTabCanvas(TabCanvas object) {
				return createTabCanvasAdapter();
			}
			@Override
			public Adapter caseTabPage(TabPage object) {
				return createTabPageAdapter();
			}
			@Override
			public Adapter caseViewPort(ViewPort object) {
				return createViewPortAdapter();
			}
			@Override
			public Adapter caseViewArea(ViewArea object) {
				return createViewAreaAdapter();
			}
			@Override
			public Adapter caseViewPortTrigger(ViewPortTrigger object) {
				return createViewPortTriggerAdapter();
			}
			@Override
			public Adapter caseViewInheritance(ViewInheritance object) {
				return createViewInheritanceAdapter();
			}
			@Override
			public Adapter caseTabPagesInheritance(TabPagesInheritance object) {
				return createTabPagesInheritanceAdapter();
			}
			@Override
			public Adapter caseFormDataControls(FormDataControls object) {
				return createFormDataControlsAdapter();
			}
			@Override
			public Adapter caseCanvasView(CanvasView object) {
				return createCanvasViewAdapter();
			}
			@Override
			public Adapter caseLinkToMessage(LinkToMessage object) {
				return createLinkToMessageAdapter();
			}
			@Override
			public Adapter caseLinkToLabel(LinkToLabel object) {
				return createLinkToLabelAdapter();
			}
			@Override
			public Adapter caseChildrenHolder(ChildrenHolder object) {
				return createChildrenHolderAdapter();
			}
			@Override
			public Adapter caseContextParameter(ContextParameter object) {
				return createContextParameterAdapter();
			}
			@Override
			public Adapter caseContextValue(ContextValue object) {
				return createContextValueAdapter();
			}
			@Override
			public Adapter caseExpressionPart(ExpressionPart object) {
				return createExpressionPartAdapter();
			}
			@Override
			public Adapter caseContextParameters(ContextParameters object) {
				return createContextParametersAdapter();
			}
			@Override
			public Adapter caseContext(Context object) {
				return createContextAdapter();
			}
			@Override
			public Adapter caseStyleElement(StyleElement object) {
				return createStyleElementAdapter();
			}
			@Override
			public Adapter caseStyleClass(StyleClass object) {
				return createStyleClassAdapter();
			}
			@Override
			public Adapter caseNickNamed(NickNamed object) {
				return createNickNamedAdapter();
			}
			@Override
			public Adapter caseFlexFields(FlexFields object) {
				return createFlexFieldsAdapter();
			}
			@Override
			public Adapter caseFlexField(FlexField object) {
				return createFlexFieldAdapter();
			}
			@Override
			public Adapter caseEnabledUIItem(EnabledUIItem object) {
				return createEnabledUIItemAdapter();
			}
			@Override
			public Adapter caseUielement(Uielement object) {
				return createUielementAdapter();
			}
			@Override
			public Adapter caseItemIcon(ItemIcon object) {
				return createItemIconAdapter();
			}
			@Override
			public Adapter caseAreaRef(AreaRef object) {
				return createAreaRefAdapter();
			}
			@Override
			public Adapter caseFormatable(Formatable object) {
				return createFormatableAdapter();
			}
			@Override
			public Adapter caseSourcesPointer(SourcesPointer object) {
				return createSourcesPointerAdapter();
			}
			@Override
			public Adapter caseInputElement(InputElement object) {
				return createInputElementAdapter();
			}
			@Override
			public Adapter caseSelection(Selection object) {
				return createSelectionAdapter();
			}
			@Override
			public Adapter caseOptionSelection(OptionSelection object) {
				return createOptionSelectionAdapter();
			}
			@Override
			public Adapter caseLayerHolder(LayerHolder object) {
				return createLayerHolderAdapter();
			}
			@Override
			public Adapter caseInputText(InputText object) {
				return createInputTextAdapter();
			}
			@Override
			public Adapter casePassword(Password object) {
				return createPasswordAdapter();
			}
			@Override
			public Adapter caseLabel(Label object) {
				return createLabelAdapter();
			}
			@Override
			public Adapter caseMessageElement(MessageElement object) {
				return createMessageElementAdapter();
			}
			@Override
			public Adapter caseOutputText(OutputText object) {
				return createOutputTextAdapter();
			}
			@Override
			public Adapter caseCheckBox(CheckBox object) {
				return createCheckBoxAdapter();
			}
			@Override
			public Adapter caseDropDownSelection(DropDownSelection object) {
				return createDropDownSelectionAdapter();
			}
			@Override
			public Adapter caseImage(Image object) {
				return createImageAdapter();
			}
			@Override
			public Adapter caseDate(Date object) {
				return createDateAdapter();
			}
			@Override
			public Adapter caseButton(Button object) {
				return createButtonAdapter();
			}
			@Override
			public Adapter caseColumn(Column object) {
				return createColumnAdapter();
			}
			@Override
			public Adapter caseTable(Table object) {
				return createTableAdapter();
			}
			@Override
			public Adapter caseMenu(Menu object) {
				return createMenuAdapter();
			}
			@Override
			public Adapter caseMenuView(MenuView object) {
				return createMenuViewAdapter();
			}
			@Override
			public Adapter caseMenuHolder(MenuHolder object) {
				return createMenuHolderAdapter();
			}
			@Override
			public Adapter caseMenuExtensionRef(MenuExtensionRef object) {
				return createMenuExtensionRefAdapter();
			}
			@Override
			public Adapter caseMenuElement(MenuElement object) {
				return createMenuElementAdapter();
			}
			@Override
			public Adapter caseMenuFolder(MenuFolder object) {
				return createMenuFolderAdapter();
			}
			@Override
			public Adapter caseMenuItem(MenuItem object) {
				return createMenuItemAdapter();
			}
			@Override
			public Adapter caseMenuExtensionPoint(MenuExtensionPoint object) {
				return createMenuExtensionPointAdapter();
			}
			@Override
			public Adapter caseSubMenu(SubMenu object) {
				return createSubMenuAdapter();
			}
			@Override
			public Adapter caseMenuSeparator(MenuSeparator object) {
				return createMenuSeparatorAdapter();
			}
			@Override
			public Adapter caseTree(Tree object) {
				return createTreeAdapter();
			}
			@Override
			public Adapter caseControls(Controls object) {
				return createControlsAdapter();
			}
			@Override
			public Adapter caseTrigger(Trigger object) {
				return createTriggerAdapter();
			}
			@Override
			public Adapter casePREFormTrigger(PREFormTrigger object) {
				return createPREFormTriggerAdapter();
			}
			@Override
			public Adapter casePREQueryTrigger(PREQueryTrigger object) {
				return createPREQueryTriggerAdapter();
			}
			@Override
			public Adapter casePOSTQueryTrigger(POSTQueryTrigger object) {
				return createPOSTQueryTriggerAdapter();
			}
			@Override
			public Adapter casePREInsertTrigger(PREInsertTrigger object) {
				return createPREInsertTriggerAdapter();
			}
			@Override
			public Adapter casePREDeleteTrigger(PREDeleteTrigger object) {
				return createPREDeleteTriggerAdapter();
			}
			@Override
			public Adapter casePOSTCreateTrigger(POSTCreateTrigger object) {
				return createPOSTCreateTriggerAdapter();
			}
			@Override
			public Adapter casePREUpdateTrigger(PREUpdateTrigger object) {
				return createPREUpdateTriggerAdapter();
			}
			@Override
			public Adapter caseProxiesList(ProxiesList object) {
				return createProxiesListAdapter();
			}
			@Override
			public Adapter caseCreateTrigger(CreateTrigger object) {
				return createCreateTriggerAdapter();
			}
			@Override
			public Adapter caseInsertTrigger(InsertTrigger object) {
				return createInsertTriggerAdapter();
			}
			@Override
			public Adapter caseUpdateTrigger(UpdateTrigger object) {
				return createUpdateTriggerAdapter();
			}
			@Override
			public Adapter caseDeleteTrigger(DeleteTrigger object) {
				return createDeleteTriggerAdapter();
			}
			@Override
			public Adapter caseSearchTrigger(SearchTrigger object) {
				return createSearchTriggerAdapter();
			}
			@Override
			public Adapter caseRoot(Root object) {
				return createRootAdapter();
			}
			@Override
			public Adapter caseFormVariable(FormVariable object) {
				return createFormVariableAdapter();
			}
			@Override
			public Adapter caseDataControl(DataControl object) {
				return createDataControlAdapter();
			}
			@Override
			public Adapter caseOrders(Orders object) {
				return createOrdersAdapter();
			}
			@Override
			public Adapter caseOrderBy(OrderBy object) {
				return createOrderByAdapter();
			}
			@Override
			public Adapter caseRelation(Relation object) {
				return createRelationAdapter();
			}
			@Override
			public Adapter caseDependency(Dependency object) {
				return createDependencyAdapter();
			}
			@Override
			public Adapter caseArtificialField(ArtificialField object) {
				return createArtificialFieldAdapter();
			}
			@Override
			public Adapter caseLink(Link object) {
				return createLinkAdapter();
			}
			@Override
			public Adapter caseTypePointer(TypePointer object) {
				return createTypePointerAdapter();
			}
			@Override
			public Adapter caseCategorized(Categorized object) {
				return createCategorizedAdapter();
			}
			@Override
			public Adapter caseSecured(Secured object) {
				return createSecuredAdapter();
			}
			@Override
			public Adapter caseMethodPointer(MethodPointer object) {
				return createMethodPointerAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link tura.form.UIPackage <em>UI Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.form.UIPackage
	 * @generated
	 */
	public Adapter createUIPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.form.Form <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.form.Form
	 * @generated
	 */
	public Adapter createFormAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.form.FormParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.form.FormParameter
	 * @generated
	 */
	public Adapter createFormParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.form.FormView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.form.FormView
	 * @generated
	 */
	public Adapter createFormViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.form.Views <em>Views</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.form.Views
	 * @generated
	 */
	public Adapter createViewsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.form.HTMLLayerHolder <em>HTML Layer Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.form.HTMLLayerHolder
	 * @generated
	 */
	public Adapter createHTMLLayerHolderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.form.Orderable <em>Orderable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.form.Orderable
	 * @generated
	 */
	public Adapter createOrderableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.form.MultiLangLabel <em>Multi Lang Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.form.MultiLangLabel
	 * @generated
	 */
	public Adapter createMultiLangLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.form.CanvasFrame <em>Canvas Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.form.CanvasFrame
	 * @generated
	 */
	public Adapter createCanvasFrameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.form.ViewPortHolder <em>View Port Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.form.ViewPortHolder
	 * @generated
	 */
	public Adapter createViewPortHolderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.form.DefaultCavas <em>Default Cavas</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.form.DefaultCavas
	 * @generated
	 */
	public Adapter createDefaultCavasAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.form.ViewElement <em>View Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.form.ViewElement
	 * @generated
	 */
	public Adapter createViewElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.form.PopupCanvas <em>Popup Canvas</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.form.PopupCanvas
	 * @generated
	 */
	public Adapter createPopupCanvasAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.form.Canvas <em>Canvas</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.form.Canvas
	 * @generated
	 */
	public Adapter createCanvasAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.form.Window <em>Window</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.form.Window
	 * @generated
	 */
	public Adapter createWindowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.form.MenuDefinition <em>Menu Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.form.MenuDefinition
	 * @generated
	 */
	public Adapter createMenuDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.form.TabCanvas <em>Tab Canvas</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.form.TabCanvas
	 * @generated
	 */
	public Adapter createTabCanvasAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.form.TabPage <em>Tab Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.form.TabPage
	 * @generated
	 */
	public Adapter createTabPageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.form.ViewPort <em>View Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.form.ViewPort
	 * @generated
	 */
	public Adapter createViewPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.form.ViewArea <em>View Area</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.form.ViewArea
	 * @generated
	 */
	public Adapter createViewAreaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.form.ViewPortTrigger <em>View Port Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.form.ViewPortTrigger
	 * @generated
	 */
	public Adapter createViewPortTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.form.ViewInheritance <em>View Inheritance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.form.ViewInheritance
	 * @generated
	 */
	public Adapter createViewInheritanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.form.TabPagesInheritance <em>Tab Pages Inheritance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.form.TabPagesInheritance
	 * @generated
	 */
	public Adapter createTabPagesInheritanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.form.FormDataControls <em>Data Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.form.FormDataControls
	 * @generated
	 */
	public Adapter createFormDataControlsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.form.CanvasView <em>Canvas View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.form.CanvasView
	 * @generated
	 */
	public Adapter createCanvasViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.form.LinkToMessage <em>Link To Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.form.LinkToMessage
	 * @generated
	 */
	public Adapter createLinkToMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.form.LinkToLabel <em>Link To Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.form.LinkToLabel
	 * @generated
	 */
	public Adapter createLinkToLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.form.ChildrenHolder <em>Children Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.form.ChildrenHolder
	 * @generated
	 */
	public Adapter createChildrenHolderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.form.ContextParameter <em>Context Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.form.ContextParameter
	 * @generated
	 */
	public Adapter createContextParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.form.ContextValue <em>Context Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.form.ContextValue
	 * @generated
	 */
	public Adapter createContextValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.form.ExpressionPart <em>Expression Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.form.ExpressionPart
	 * @generated
	 */
	public Adapter createExpressionPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.form.ContextParameters <em>Context Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.form.ContextParameters
	 * @generated
	 */
	public Adapter createContextParametersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.form.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.form.Context
	 * @generated
	 */
	public Adapter createContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.form.StyleElement <em>Style Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.form.StyleElement
	 * @generated
	 */
	public Adapter createStyleElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.form.StyleClass <em>Style Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.form.StyleClass
	 * @generated
	 */
	public Adapter createStyleClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.form.NickNamed <em>Nick Named</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.form.NickNamed
	 * @generated
	 */
	public Adapter createNickNamedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.form.FlexFields <em>Flex Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.form.FlexFields
	 * @generated
	 */
	public Adapter createFlexFieldsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.form.FlexField <em>Flex Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.form.FlexField
	 * @generated
	 */
	public Adapter createFlexFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.form.EnabledUIItem <em>Enabled UI Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.form.EnabledUIItem
	 * @generated
	 */
	public Adapter createEnabledUIItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.form.Uielement <em>Uielement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.form.Uielement
	 * @generated
	 */
	public Adapter createUielementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.form.ItemIcon <em>Item Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.form.ItemIcon
	 * @generated
	 */
	public Adapter createItemIconAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.form.AreaRef <em>Area Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.form.AreaRef
	 * @generated
	 */
	public Adapter createAreaRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.form.Formatable <em>Formatable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.form.Formatable
	 * @generated
	 */
	public Adapter createFormatableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.form.SourcesPointer <em>Sources Pointer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.form.SourcesPointer
	 * @generated
	 */
	public Adapter createSourcesPointerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.form.InputElement <em>Input Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.form.InputElement
	 * @generated
	 */
	public Adapter createInputElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.form.Selection <em>Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.form.Selection
	 * @generated
	 */
	public Adapter createSelectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.form.OptionSelection <em>Option Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.form.OptionSelection
	 * @generated
	 */
	public Adapter createOptionSelectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.form.LayerHolder <em>Layer Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.form.LayerHolder
	 * @generated
	 */
	public Adapter createLayerHolderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.form.InputText <em>Input Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.form.InputText
	 * @generated
	 */
	public Adapter createInputTextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.form.Password <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.form.Password
	 * @generated
	 */
	public Adapter createPasswordAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.form.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.form.Label
	 * @generated
	 */
	public Adapter createLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.form.MessageElement <em>Message Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.form.MessageElement
	 * @generated
	 */
	public Adapter createMessageElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.form.OutputText <em>Output Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.form.OutputText
	 * @generated
	 */
	public Adapter createOutputTextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.form.CheckBox <em>Check Box</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.form.CheckBox
	 * @generated
	 */
	public Adapter createCheckBoxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.form.DropDownSelection <em>Drop Down Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.form.DropDownSelection
	 * @generated
	 */
	public Adapter createDropDownSelectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.form.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.form.Image
	 * @generated
	 */
	public Adapter createImageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.form.Date <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.form.Date
	 * @generated
	 */
	public Adapter createDateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.form.Button <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.form.Button
	 * @generated
	 */
	public Adapter createButtonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.form.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.form.Column
	 * @generated
	 */
	public Adapter createColumnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.form.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.form.Table
	 * @generated
	 */
	public Adapter createTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.form.Menu <em>Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.form.Menu
	 * @generated
	 */
	public Adapter createMenuAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.form.MenuView <em>Menu View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.form.MenuView
	 * @generated
	 */
	public Adapter createMenuViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.form.MenuHolder <em>Menu Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.form.MenuHolder
	 * @generated
	 */
	public Adapter createMenuHolderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.form.MenuExtensionRef <em>Menu Extension Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.form.MenuExtensionRef
	 * @generated
	 */
	public Adapter createMenuExtensionRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.form.MenuElement <em>Menu Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.form.MenuElement
	 * @generated
	 */
	public Adapter createMenuElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.form.MenuFolder <em>Menu Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.form.MenuFolder
	 * @generated
	 */
	public Adapter createMenuFolderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.form.MenuItem <em>Menu Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.form.MenuItem
	 * @generated
	 */
	public Adapter createMenuItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.form.MenuExtensionPoint <em>Menu Extension Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.form.MenuExtensionPoint
	 * @generated
	 */
	public Adapter createMenuExtensionPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.form.SubMenu <em>Sub Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.form.SubMenu
	 * @generated
	 */
	public Adapter createSubMenuAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.form.MenuSeparator <em>Menu Separator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.form.MenuSeparator
	 * @generated
	 */
	public Adapter createMenuSeparatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.form.Tree <em>Tree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.form.Tree
	 * @generated
	 */
	public Adapter createTreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.form.Controls <em>Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.form.Controls
	 * @generated
	 */
	public Adapter createControlsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.form.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.form.Trigger
	 * @generated
	 */
	public Adapter createTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.form.PREFormTrigger <em>PRE Form Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.form.PREFormTrigger
	 * @generated
	 */
	public Adapter createPREFormTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.form.PREQueryTrigger <em>PRE Query Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.form.PREQueryTrigger
	 * @generated
	 */
	public Adapter createPREQueryTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.form.POSTQueryTrigger <em>POST Query Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.form.POSTQueryTrigger
	 * @generated
	 */
	public Adapter createPOSTQueryTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.form.PREInsertTrigger <em>PRE Insert Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.form.PREInsertTrigger
	 * @generated
	 */
	public Adapter createPREInsertTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.form.PREDeleteTrigger <em>PRE Delete Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.form.PREDeleteTrigger
	 * @generated
	 */
	public Adapter createPREDeleteTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.form.POSTCreateTrigger <em>POST Create Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.form.POSTCreateTrigger
	 * @generated
	 */
	public Adapter createPOSTCreateTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.form.PREUpdateTrigger <em>PRE Update Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.form.PREUpdateTrigger
	 * @generated
	 */
	public Adapter createPREUpdateTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.form.ProxiesList <em>Proxies List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.form.ProxiesList
	 * @generated
	 */
	public Adapter createProxiesListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.form.CreateTrigger <em>Create Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.form.CreateTrigger
	 * @generated
	 */
	public Adapter createCreateTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.form.InsertTrigger <em>Insert Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.form.InsertTrigger
	 * @generated
	 */
	public Adapter createInsertTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.form.UpdateTrigger <em>Update Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.form.UpdateTrigger
	 * @generated
	 */
	public Adapter createUpdateTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.form.DeleteTrigger <em>Delete Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.form.DeleteTrigger
	 * @generated
	 */
	public Adapter createDeleteTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.form.SearchTrigger <em>Search Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.form.SearchTrigger
	 * @generated
	 */
	public Adapter createSearchTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.form.Root <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.form.Root
	 * @generated
	 */
	public Adapter createRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.form.FormVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.form.FormVariable
	 * @generated
	 */
	public Adapter createFormVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.form.DataControl <em>Data Control</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.form.DataControl
	 * @generated
	 */
	public Adapter createDataControlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.form.Orders <em>Orders</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.form.Orders
	 * @generated
	 */
	public Adapter createOrdersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.form.OrderBy <em>Order By</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.form.OrderBy
	 * @generated
	 */
	public Adapter createOrderByAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.form.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.form.Relation
	 * @generated
	 */
	public Adapter createRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.form.Dependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.form.Dependency
	 * @generated
	 */
	public Adapter createDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.form.ArtificialField <em>Artificial Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.form.ArtificialField
	 * @generated
	 */
	public Adapter createArtificialFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.form.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.form.Link
	 * @generated
	 */
	public Adapter createLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.type.TypePointer <em>Pointer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.type.TypePointer
	 * @generated
	 */
	public Adapter createTypePointerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.common.Categorized <em>Categorized</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.common.Categorized
	 * @generated
	 */
	public Adapter createCategorizedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.permission.Secured <em>Secured</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.permission.Secured
	 * @generated
	 */
	public Adapter createSecuredAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.type.MethodPointer <em>Method Pointer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.type.MethodPointer
	 * @generated
	 */
	public Adapter createMethodPointerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //FormAdapterFactory
