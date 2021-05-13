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
package form.util;

import artifact.Categorized;

import common.HTMLLayerHolder;
import common.Orderable;

import form.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import permission.Secured;

import type.MethodPointer;
import type.TypePointer;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see form.FormPackage
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
			public Adapter caseForm(Form object) {
				return createFormAdapter();
			}
			@Override
			public Adapter caseFormParameter(FormParameter object) {
				return createFormParameterAdapter();
			}
			@Override
			public Adapter caseViews(Views object) {
				return createViewsAdapter();
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
			public Adapter caseOverlayCanvas(OverlayCanvas object) {
				return createOverlayCanvasAdapter();
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
			public Adapter caseControlPointer(ControlPointer object) {
				return createControlPointerAdapter();
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
			public Adapter caseOptionSelection(OptionSelection object) {
				return createOptionSelectionAdapter();
			}
			@Override
			public Adapter caseDropDownSelection(DropDownSelection object) {
				return createDropDownSelectionAdapter();
			}
			@Override
			public Adapter caseSelectManyMenu(SelectManyMenu object) {
				return createSelectManyMenuAdapter();
			}
			@Override
			public Adapter caseRadioSelection(RadioSelection object) {
				return createRadioSelectionAdapter();
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
			public Adapter caseDataExporter(DataExporter object) {
				return createDataExporterAdapter();
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
			public Adapter caseBlockUI(BlockUI object) {
				return createBlockUIAdapter();
			}
			@Override
			public Adapter caseFileUpload(FileUpload object) {
				return createFileUploadAdapter();
			}
			@Override
			public Adapter caseFileDownload(FileDownload object) {
				return createFileDownloadAdapter();
			}
			@Override
			public Adapter caseDataScroller(DataScroller object) {
				return createDataScrollerAdapter();
			}
			@Override
			public Adapter caseTimeLine(TimeLine object) {
				return createTimeLineAdapter();
			}
			@Override
			public Adapter caseFullCalendar(FullCalendar object) {
				return createFullCalendarAdapter();
			}
			@Override
			public Adapter casePoll(Poll object) {
				return createPollAdapter();
			}
			@Override
			public Adapter caseDataTemplate(DataTemplate object) {
				return createDataTemplateAdapter();
			}
			@Override
			public Adapter caseWindowRef(WindowRef object) {
				return createWindowRefAdapter();
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
			public Adapter caseToSubmenu(ToSubmenu object) {
				return createToSubmenuAdapter();
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
			public Adapter caseRelationMapper(RelationMapper object) {
				return createRelationMapperAdapter();
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
			public Adapter caseInternalRelation(InternalRelation object) {
				return createInternalRelationAdapter();
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
			public Adapter caseTypePointer(TypePointer object) {
				return createTypePointerAdapter();
			}
			@Override
			public Adapter caseHTMLLayerHolder(HTMLLayerHolder object) {
				return createHTMLLayerHolderAdapter();
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
			public Adapter caseOrderable(Orderable object) {
				return createOrderableAdapter();
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
	 * Creates a new adapter for an object of class '{@link form.Form <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.Form
	 * @generated
	 */
	public Adapter createFormAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.FormParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.FormParameter
	 * @generated
	 */
	public Adapter createFormParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.Views <em>Views</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.Views
	 * @generated
	 */
	public Adapter createViewsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.MultiLangLabel <em>Multi Lang Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.MultiLangLabel
	 * @generated
	 */
	public Adapter createMultiLangLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.CanvasFrame <em>Canvas Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.CanvasFrame
	 * @generated
	 */
	public Adapter createCanvasFrameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.ViewPortHolder <em>View Port Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.ViewPortHolder
	 * @generated
	 */
	public Adapter createViewPortHolderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.DefaultCavas <em>Default Cavas</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.DefaultCavas
	 * @generated
	 */
	public Adapter createDefaultCavasAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.ViewElement <em>View Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.ViewElement
	 * @generated
	 */
	public Adapter createViewElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.PopupCanvas <em>Popup Canvas</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.PopupCanvas
	 * @generated
	 */
	public Adapter createPopupCanvasAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.OverlayCanvas <em>Overlay Canvas</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.OverlayCanvas
	 * @generated
	 */
	public Adapter createOverlayCanvasAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.Canvas <em>Canvas</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.Canvas
	 * @generated
	 */
	public Adapter createCanvasAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.Window <em>Window</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.Window
	 * @generated
	 */
	public Adapter createWindowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.MenuDefinition <em>Menu Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.MenuDefinition
	 * @generated
	 */
	public Adapter createMenuDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.TabCanvas <em>Tab Canvas</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.TabCanvas
	 * @generated
	 */
	public Adapter createTabCanvasAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.TabPage <em>Tab Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.TabPage
	 * @generated
	 */
	public Adapter createTabPageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.ViewPort <em>View Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.ViewPort
	 * @generated
	 */
	public Adapter createViewPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.ViewArea <em>View Area</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.ViewArea
	 * @generated
	 */
	public Adapter createViewAreaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.ViewPortTrigger <em>View Port Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.ViewPortTrigger
	 * @generated
	 */
	public Adapter createViewPortTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.ViewInheritance <em>View Inheritance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.ViewInheritance
	 * @generated
	 */
	public Adapter createViewInheritanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.TabPagesInheritance <em>Tab Pages Inheritance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.TabPagesInheritance
	 * @generated
	 */
	public Adapter createTabPagesInheritanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.LinkToMessage <em>Link To Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.LinkToMessage
	 * @generated
	 */
	public Adapter createLinkToMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.LinkToLabel <em>Link To Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.LinkToLabel
	 * @generated
	 */
	public Adapter createLinkToLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.ChildrenHolder <em>Children Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.ChildrenHolder
	 * @generated
	 */
	public Adapter createChildrenHolderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.ContextParameter <em>Context Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.ContextParameter
	 * @generated
	 */
	public Adapter createContextParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.ContextValue <em>Context Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.ContextValue
	 * @generated
	 */
	public Adapter createContextValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.ExpressionPart <em>Expression Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.ExpressionPart
	 * @generated
	 */
	public Adapter createExpressionPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.ContextParameters <em>Context Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.ContextParameters
	 * @generated
	 */
	public Adapter createContextParametersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.Context
	 * @generated
	 */
	public Adapter createContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.StyleElement <em>Style Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.StyleElement
	 * @generated
	 */
	public Adapter createStyleElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.NickNamed <em>Nick Named</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.NickNamed
	 * @generated
	 */
	public Adapter createNickNamedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.FlexFields <em>Flex Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.FlexFields
	 * @generated
	 */
	public Adapter createFlexFieldsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.FlexField <em>Flex Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.FlexField
	 * @generated
	 */
	public Adapter createFlexFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.EnabledUIItem <em>Enabled UI Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.EnabledUIItem
	 * @generated
	 */
	public Adapter createEnabledUIItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.Uielement <em>Uielement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.Uielement
	 * @generated
	 */
	public Adapter createUielementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.ItemIcon <em>Item Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.ItemIcon
	 * @generated
	 */
	public Adapter createItemIconAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.AreaRef <em>Area Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.AreaRef
	 * @generated
	 */
	public Adapter createAreaRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.Formatable <em>Formatable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.Formatable
	 * @generated
	 */
	public Adapter createFormatableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.ControlPointer <em>Control Pointer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.ControlPointer
	 * @generated
	 */
	public Adapter createControlPointerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.SourcesPointer <em>Sources Pointer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.SourcesPointer
	 * @generated
	 */
	public Adapter createSourcesPointerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.InputElement <em>Input Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.InputElement
	 * @generated
	 */
	public Adapter createInputElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.Selection <em>Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.Selection
	 * @generated
	 */
	public Adapter createSelectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.LayerHolder <em>Layer Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.LayerHolder
	 * @generated
	 */
	public Adapter createLayerHolderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.InputText <em>Input Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.InputText
	 * @generated
	 */
	public Adapter createInputTextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.Password <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.Password
	 * @generated
	 */
	public Adapter createPasswordAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.Label
	 * @generated
	 */
	public Adapter createLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.MessageElement <em>Message Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.MessageElement
	 * @generated
	 */
	public Adapter createMessageElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.OutputText <em>Output Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.OutputText
	 * @generated
	 */
	public Adapter createOutputTextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.CheckBox <em>Check Box</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.CheckBox
	 * @generated
	 */
	public Adapter createCheckBoxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.OptionSelection <em>Option Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.OptionSelection
	 * @generated
	 */
	public Adapter createOptionSelectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.DropDownSelection <em>Drop Down Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.DropDownSelection
	 * @generated
	 */
	public Adapter createDropDownSelectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.SelectManyMenu <em>Select Many Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.SelectManyMenu
	 * @generated
	 */
	public Adapter createSelectManyMenuAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.RadioSelection <em>Radio Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.RadioSelection
	 * @generated
	 */
	public Adapter createRadioSelectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.Image
	 * @generated
	 */
	public Adapter createImageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.Date <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.Date
	 * @generated
	 */
	public Adapter createDateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.Button <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.Button
	 * @generated
	 */
	public Adapter createButtonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.DataExporter <em>Data Exporter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.DataExporter
	 * @generated
	 */
	public Adapter createDataExporterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.Column
	 * @generated
	 */
	public Adapter createColumnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.Table
	 * @generated
	 */
	public Adapter createTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.Menu <em>Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.Menu
	 * @generated
	 */
	public Adapter createMenuAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.BlockUI <em>Block UI</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.BlockUI
	 * @generated
	 */
	public Adapter createBlockUIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.FileUpload <em>File Upload</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.FileUpload
	 * @generated
	 */
	public Adapter createFileUploadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.FileDownload <em>File Download</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.FileDownload
	 * @generated
	 */
	public Adapter createFileDownloadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.DataScroller <em>Data Scroller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.DataScroller
	 * @generated
	 */
	public Adapter createDataScrollerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.TimeLine <em>Time Line</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.TimeLine
	 * @generated
	 */
	public Adapter createTimeLineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.FullCalendar <em>Full Calendar</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.FullCalendar
	 * @generated
	 */
	public Adapter createFullCalendarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.Poll <em>Poll</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.Poll
	 * @generated
	 */
	public Adapter createPollAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.DataTemplate <em>Data Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.DataTemplate
	 * @generated
	 */
	public Adapter createDataTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.WindowRef <em>Window Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.WindowRef
	 * @generated
	 */
	public Adapter createWindowRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.MenuHolder <em>Menu Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.MenuHolder
	 * @generated
	 */
	public Adapter createMenuHolderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.MenuExtensionRef <em>Menu Extension Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.MenuExtensionRef
	 * @generated
	 */
	public Adapter createMenuExtensionRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.MenuElement <em>Menu Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.MenuElement
	 * @generated
	 */
	public Adapter createMenuElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.MenuFolder <em>Menu Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.MenuFolder
	 * @generated
	 */
	public Adapter createMenuFolderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.MenuItem <em>Menu Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.MenuItem
	 * @generated
	 */
	public Adapter createMenuItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.MenuExtensionPoint <em>Menu Extension Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.MenuExtensionPoint
	 * @generated
	 */
	public Adapter createMenuExtensionPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.SubMenu <em>Sub Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.SubMenu
	 * @generated
	 */
	public Adapter createSubMenuAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.ToSubmenu <em>To Submenu</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.ToSubmenu
	 * @generated
	 */
	public Adapter createToSubmenuAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.MenuSeparator <em>Menu Separator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.MenuSeparator
	 * @generated
	 */
	public Adapter createMenuSeparatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.Tree <em>Tree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.Tree
	 * @generated
	 */
	public Adapter createTreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.Controls <em>Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.Controls
	 * @generated
	 */
	public Adapter createControlsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.Trigger
	 * @generated
	 */
	public Adapter createTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.PREFormTrigger <em>PRE Form Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.PREFormTrigger
	 * @generated
	 */
	public Adapter createPREFormTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.PREQueryTrigger <em>PRE Query Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.PREQueryTrigger
	 * @generated
	 */
	public Adapter createPREQueryTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.POSTQueryTrigger <em>POST Query Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.POSTQueryTrigger
	 * @generated
	 */
	public Adapter createPOSTQueryTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.PREInsertTrigger <em>PRE Insert Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.PREInsertTrigger
	 * @generated
	 */
	public Adapter createPREInsertTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.PREDeleteTrigger <em>PRE Delete Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.PREDeleteTrigger
	 * @generated
	 */
	public Adapter createPREDeleteTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.POSTCreateTrigger <em>POST Create Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.POSTCreateTrigger
	 * @generated
	 */
	public Adapter createPOSTCreateTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.PREUpdateTrigger <em>PRE Update Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.PREUpdateTrigger
	 * @generated
	 */
	public Adapter createPREUpdateTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.CreateTrigger <em>Create Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.CreateTrigger
	 * @generated
	 */
	public Adapter createCreateTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.InsertTrigger <em>Insert Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.InsertTrigger
	 * @generated
	 */
	public Adapter createInsertTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.UpdateTrigger <em>Update Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.UpdateTrigger
	 * @generated
	 */
	public Adapter createUpdateTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.DeleteTrigger <em>Delete Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.DeleteTrigger
	 * @generated
	 */
	public Adapter createDeleteTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.SearchTrigger <em>Search Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.SearchTrigger
	 * @generated
	 */
	public Adapter createSearchTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.Root <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.Root
	 * @generated
	 */
	public Adapter createRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.FormVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.FormVariable
	 * @generated
	 */
	public Adapter createFormVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.DataControl <em>Data Control</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.DataControl
	 * @generated
	 */
	public Adapter createDataControlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.RelationMapper <em>Relation Mapper</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.RelationMapper
	 * @generated
	 */
	public Adapter createRelationMapperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.Orders <em>Orders</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.Orders
	 * @generated
	 */
	public Adapter createOrdersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.OrderBy <em>Order By</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.OrderBy
	 * @generated
	 */
	public Adapter createOrderByAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.Relation
	 * @generated
	 */
	public Adapter createRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.InternalRelation <em>Internal Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.InternalRelation
	 * @generated
	 */
	public Adapter createInternalRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.Dependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.Dependency
	 * @generated
	 */
	public Adapter createDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link form.ArtificialField <em>Artificial Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see form.ArtificialField
	 * @generated
	 */
	public Adapter createArtificialFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link type.TypePointer <em>Pointer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see type.TypePointer
	 * @generated
	 */
	public Adapter createTypePointerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link common.HTMLLayerHolder <em>HTML Layer Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see common.HTMLLayerHolder
	 * @generated
	 */
	public Adapter createHTMLLayerHolderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link artifact.Categorized <em>Categorized</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see artifact.Categorized
	 * @generated
	 */
	public Adapter createCategorizedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link permission.Secured <em>Secured</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see permission.Secured
	 * @generated
	 */
	public Adapter createSecuredAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link common.Orderable <em>Orderable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see common.Orderable
	 * @generated
	 */
	public Adapter createOrderableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link type.MethodPointer <em>Method Pointer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see type.MethodPointer
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
