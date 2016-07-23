/**
 */
package form.impl;

import application.ApplicationPackage;

import application.impl.ApplicationPackageImpl;

import artifact.ArtifactPackage;

import artifact.impl.ArtifactPackageImpl;

import common.CommonPackage;

import common.impl.CommonPackageImpl;

import domain.DomainPackage;

import domain.impl.DomainPackageImpl;

import form.AreaRef;
import form.ArtificialField;
import form.Button;
import form.Canvas;
import form.CanvasFrame;
import form.CanvasView;
import form.CheckBox;
import form.ChildrenHolder;
import form.Column;
import form.Comparator;
import form.Context;
import form.ContextParameter;
import form.ContextParameters;
import form.ContextValue;
import form.Controls;
import form.CreateTrigger;
import form.DataControl;
import form.Date;
import form.DefaultCavas;
import form.DeleteTrigger;
import form.Dependency;
import form.DropDownSelection;
import form.EnabledUIItem;
import form.ExpressionPart;
import form.FlexField;
import form.FlexFields;
import form.Form;
import form.FormDataControls;
import form.FormFactory;
import form.FormPackage;
import form.FormParameter;
import form.FormVariable;
import form.FormView;
import form.Formatable;
import form.HTMLLayerHolder;
import form.Image;
import form.InputElement;
import form.InputText;
import form.InsertTrigger;
import form.ItemIcon;
import form.Label;
import form.LayerHolder;
import form.Link;
import form.LinkToLabel;
import form.LinkToMessage;
import form.Menu;
import form.MenuDefinition;
import form.MenuElement;
import form.MenuExtensionPoint;
import form.MenuExtensionRef;
import form.MenuFolder;
import form.MenuHolder;
import form.MenuItem;
import form.MenuSeparator;
import form.MenuView;
import form.MessageElement;
import form.MultiLangLabel;
import form.NickNamed;
import form.OptionSelection;
import form.Order;
import form.OrderBy;
import form.Orderable;
import form.Orders;
import form.Orientation;
import form.OutputText;
import form.POSTCreateTrigger;
import form.POSTQueryTrigger;
import form.PREDeleteTrigger;
import form.PREFormTrigger;
import form.PREInsertTrigger;
import form.PREQueryTrigger;
import form.PREUpdateTrigger;
import form.Password;
import form.PopupCanvas;
import form.ProxiesList;
import form.Relation;
import form.Root;
import form.SearchTrigger;
import form.Selection;
import form.SourcesPointer;
import form.StyleClass;
import form.StyleElement;
import form.SubMenu;
import form.TabCanvas;
import form.TabPage;
import form.TabPagesInheritance;
import form.Table;
import form.ToSubmenu;
import form.Tree;
import form.Trigger;
import form.UIPackage;
import form.Uielement;
import form.UpdateTrigger;
import form.ViewArea;
import form.ViewElement;
import form.ViewInheritance;
import form.ViewPort;
import form.ViewPortHolder;
import form.ViewPortTrigger;
import form.Views;
import form.Window;

import infrastructure.InfrastructurePackage;

import infrastructure.impl.InfrastructurePackageImpl;

import mapper.MapperPackage;

import mapper.impl.MapperPackageImpl;

import message.MessagePackage;

import message.impl.MessagePackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import permission.PermissionPackage;

import permission.impl.PermissionPackageImpl;

import recipe.RecipePackage;

import recipe.impl.RecipePackageImpl;

import style.StylePackage;

import style.impl.StylePackageImpl;

import type.TypePackage;

import type.impl.TypePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FormPackageImpl extends EPackageImpl implements FormPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass htmlLayerHolderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiLangLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass canvasFrameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewPortHolderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defaultCavasEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass popupCanvasEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass canvasEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass windowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass menuDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tabCanvasEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tabPageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewAreaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewPortTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewInheritanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tabPagesInheritanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkToMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkToLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass childrenHolderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionPartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextParametersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass styleElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass styleClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nickNamedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flexFieldsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flexFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enabledUIItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uielementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemIconEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass areaRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formatableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourcesPointerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optionSelectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass layerHolderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputTextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass passwordEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputTextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass checkBoxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dropDownSelectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buttonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass columnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass menuEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass menuHolderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass menuExtensionRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass menuElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass menuFolderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass menuItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass menuExtensionPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subMenuEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toSubmenuEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass menuSeparatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass treeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preFormTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preQueryTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postQueryTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preInsertTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preDeleteTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postCreateTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preUpdateTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass proxiesListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass insertTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deleteTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass searchTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataControlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ordersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderByEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass artificialFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum comparatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum orderEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum orientationEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see form.FormPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FormPackageImpl() {
		super(eNS_URI, FormFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link FormPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FormPackage init() {
		if (isInited) return (FormPackage)EPackage.Registry.INSTANCE.getEPackage(FormPackage.eNS_URI);

		// Obtain or create and register package
		FormPackageImpl theFormPackage = (FormPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FormPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FormPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		DomainPackageImpl theDomainPackage = (DomainPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) instanceof DomainPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) : DomainPackage.eINSTANCE);
		ArtifactPackageImpl theArtifactPackage = (ArtifactPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ArtifactPackage.eNS_URI) instanceof ArtifactPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ArtifactPackage.eNS_URI) : ArtifactPackage.eINSTANCE);
		TypePackageImpl theTypePackage = (TypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) instanceof TypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) : TypePackage.eINSTANCE);
		ApplicationPackageImpl theApplicationPackage = (ApplicationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ApplicationPackage.eNS_URI) instanceof ApplicationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ApplicationPackage.eNS_URI) : ApplicationPackage.eINSTANCE);
		CommonPackageImpl theCommonPackage = (CommonPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) instanceof CommonPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) : CommonPackage.eINSTANCE);
		PermissionPackageImpl thePermissionPackage = (PermissionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PermissionPackage.eNS_URI) instanceof PermissionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PermissionPackage.eNS_URI) : PermissionPackage.eINSTANCE);
		InfrastructurePackageImpl theInfrastructurePackage = (InfrastructurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InfrastructurePackage.eNS_URI) instanceof InfrastructurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InfrastructurePackage.eNS_URI) : InfrastructurePackage.eINSTANCE);
		MessagePackageImpl theMessagePackage = (MessagePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MessagePackage.eNS_URI) instanceof MessagePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MessagePackage.eNS_URI) : MessagePackage.eINSTANCE);
		StylePackageImpl theStylePackage = (StylePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI) instanceof StylePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI) : StylePackage.eINSTANCE);
		RecipePackageImpl theRecipePackage = (RecipePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RecipePackage.eNS_URI) instanceof RecipePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RecipePackage.eNS_URI) : RecipePackage.eINSTANCE);
		MapperPackageImpl theMapperPackage = (MapperPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MapperPackage.eNS_URI) instanceof MapperPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MapperPackage.eNS_URI) : MapperPackage.eINSTANCE);

		// Create package meta-data objects
		theFormPackage.createPackageContents();
		theDomainPackage.createPackageContents();
		theArtifactPackage.createPackageContents();
		theTypePackage.createPackageContents();
		theApplicationPackage.createPackageContents();
		theCommonPackage.createPackageContents();
		thePermissionPackage.createPackageContents();
		theInfrastructurePackage.createPackageContents();
		theMessagePackage.createPackageContents();
		theStylePackage.createPackageContents();
		theRecipePackage.createPackageContents();
		theMapperPackage.createPackageContents();

		// Initialize created meta-data
		theFormPackage.initializePackageContents();
		theDomainPackage.initializePackageContents();
		theArtifactPackage.initializePackageContents();
		theTypePackage.initializePackageContents();
		theApplicationPackage.initializePackageContents();
		theCommonPackage.initializePackageContents();
		thePermissionPackage.initializePackageContents();
		theInfrastructurePackage.initializePackageContents();
		theMessagePackage.initializePackageContents();
		theStylePackage.initializePackageContents();
		theRecipePackage.initializePackageContents();
		theMapperPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFormPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FormPackage.eNS_URI, theFormPackage);
		return theFormPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForm() {
		return formEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForm_Uid() {
		return (EAttribute)formEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForm_Name() {
		return (EAttribute)formEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForm_View() {
		return (EReference)formEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForm_Datacontrols() {
		return (EReference)formEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForm_Parameters() {
		return (EReference)formEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormParameter() {
		return formParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormParameter_Uid() {
		return (EAttribute)formParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormParameter_Name() {
		return (EAttribute)formParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViews() {
		return viewsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViews_Uid() {
		return (EAttribute)viewsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViews_Canvases() {
		return (EReference)viewsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViews_ViewInheritances() {
		return (EReference)viewsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViews_TabPagesInheritances() {
		return (EReference)viewsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViews_Menus() {
		return (EReference)viewsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHTMLLayerHolder() {
		return htmlLayerHolderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHTMLLayerHolder_Columns() {
		return (EAttribute)htmlLayerHolderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrderable() {
		return orderableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrderable_Order() {
		return (EAttribute)orderableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiLangLabel() {
		return multiLangLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiLangLabel_MultiLangLabel() {
		return (EReference)multiLangLabelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCanvasFrame() {
		return canvasFrameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCanvasFrame_Uid() {
		return (EAttribute)canvasFrameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCanvasFrame_Name() {
		return (EAttribute)canvasFrameEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViewPortHolder() {
		return viewPortHolderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewPortHolder_ViewElement() {
		return (EReference)viewPortHolderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefaultCavas() {
		return defaultCavasEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDefaultCavas_DefaultCanvas() {
		return (EAttribute)defaultCavasEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViewElement() {
		return viewElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPopupCanvas() {
		return popupCanvasEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPopupCanvas_Modal() {
		return (EAttribute)popupCanvasEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCanvas() {
		return canvasEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWindow() {
		return windowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMenuDefinition() {
		return menuDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMenuDefinition_Uid() {
		return (EAttribute)menuDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMenuDefinition_Name() {
		return (EAttribute)menuDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMenuDefinition_MenuFolders() {
		return (EReference)menuDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMenuDefinition_ToSubMenu() {
		return (EReference)menuDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTabCanvas() {
		return tabCanvasEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTabCanvas_Orientation() {
		return (EAttribute)tabCanvasEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTabPage() {
		return tabPageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViewPort() {
		return viewPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViewPort_Uid() {
		return (EAttribute)viewPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViewPort_Name() {
		return (EAttribute)viewPortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewPort_ViewPortTrigger() {
		return (EReference)viewPortEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViewArea() {
		return viewAreaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViewArea_Uid() {
		return (EAttribute)viewAreaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViewArea_Name() {
		return (EAttribute)viewAreaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewArea_BaseCanvas() {
		return (EReference)viewAreaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewArea_LinkToLabels() {
		return (EReference)viewAreaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewArea_LinkToMessages() {
		return (EReference)viewAreaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViewPortTrigger() {
		return viewPortTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViewPortTrigger_Uid() {
		return (EAttribute)viewPortTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViewInheritance() {
		return viewInheritanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViewInheritance_Uid() {
		return (EAttribute)viewInheritanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewInheritance_Source() {
		return (EReference)viewInheritanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewInheritance_Target() {
		return (EReference)viewInheritanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTabPagesInheritance() {
		return tabPagesInheritanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTabPagesInheritance_Uid() {
		return (EAttribute)tabPagesInheritanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTabPagesInheritance_Source() {
		return (EReference)tabPagesInheritanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTabPagesInheritance_Target() {
		return (EReference)tabPagesInheritanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkToMessage() {
		return linkToMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkToMessage_Uid() {
		return (EAttribute)linkToMessageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkToMessage_Source() {
		return (EReference)linkToMessageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkToMessage_Target() {
		return (EReference)linkToMessageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkToLabel() {
		return linkToLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkToLabel_Uid() {
		return (EAttribute)linkToLabelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkToLabel_Source() {
		return (EReference)linkToLabelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkToLabel_Target() {
		return (EReference)linkToLabelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChildrenHolder() {
		return childrenHolderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChildrenHolder_Children() {
		return (EReference)childrenHolderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContextParameter() {
		return contextParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContextParameter_Uid() {
		return (EAttribute)contextParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextParameter_RefObj() {
		return (EReference)contextParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContextParameter_Operation() {
		return (EAttribute)contextParameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextParameter_Value() {
		return (EReference)contextParameterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContextValue() {
		return contextValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContextValue_Uid() {
		return (EAttribute)contextValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContextValue_Constant() {
		return (EAttribute)contextValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContextValue_Value() {
		return (EAttribute)contextValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextValue_Expression() {
		return (EReference)contextValueEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpressionPart() {
		return expressionPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpressionPart_Uid() {
		return (EAttribute)expressionPartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpressionPart_ObjRef() {
		return (EReference)expressionPartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpressionPart_Order() {
		return (EAttribute)expressionPartEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpressionPart_ExpressionType() {
		return (EAttribute)expressionPartEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContextParameters() {
		return contextParametersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextParameters_Parameters() {
		return (EReference)contextParametersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContext() {
		return contextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStyleElement() {
		return styleElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStyleElement_Style() {
		return (EReference)styleElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStyleElement_StyleClass() {
		return (EReference)styleElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStyleClass() {
		return styleClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStyleClass_Classifier() {
		return (EReference)styleClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNickNamed() {
		return nickNamedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNickNamed_Nickname() {
		return (EAttribute)nickNamedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlexFields() {
		return flexFieldsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlexFields_Fields() {
		return (EReference)flexFieldsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlexField() {
		return flexFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnabledUIItem() {
		return enabledUIItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnabledUIItem_Enabled() {
		return (EReference)enabledUIItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUielement() {
		return uielementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUielement_Uid() {
		return (EAttribute)uielementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUielement_Required() {
		return (EReference)uielementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUielement_ReadOnly() {
		return (EReference)uielementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUielement_RefreshAreas() {
		return (EReference)uielementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItemIcon() {
		return itemIconEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemIcon_Icon() {
		return (EReference)itemIconEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAreaRef() {
		return areaRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAreaRef_Area() {
		return (EReference)areaRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAreaRef_Group() {
		return (EAttribute)areaRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormatable() {
		return formatableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormatable_Format() {
		return (EAttribute)formatableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSourcesPointer() {
		return sourcesPointerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSourcesPointer_SourcePointer() {
		return (EReference)sourcesPointerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSourcesPointer_ValuePointer() {
		return (EReference)sourcesPointerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSourcesPointer_SourceCast() {
		return (EReference)sourcesPointerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSourcesPointer_SourceCastDataControl() {
		return (EReference)sourcesPointerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputElement() {
		return inputElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelection() {
		return selectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelection_DisplayOptionPointer() {
		return (EReference)selectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelection_ValueOptionPointer() {
		return (EReference)selectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOptionSelection() {
		return optionSelectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOptionSelection_OptionPointer() {
		return (EReference)optionSelectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOptionSelection_OptionCast() {
		return (EReference)optionSelectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOptionSelection_OptionCastDataControl() {
		return (EReference)optionSelectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLayerHolder() {
		return layerHolderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputText() {
		return inputTextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPassword() {
		return passwordEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLabel() {
		return labelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabel_Label() {
		return (EAttribute)labelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageElement() {
		return messageElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageElement_Label() {
		return (EAttribute)messageElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputText() {
		return outputTextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCheckBox() {
		return checkBoxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDropDownSelection() {
		return dropDownSelectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDropDownSelection_Selection() {
		return (EReference)dropDownSelectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDropDownSelection_InitialOptionMessage() {
		return (EReference)dropDownSelectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDropDownSelection_InitialOptionValue() {
		return (EAttribute)dropDownSelectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImage() {
		return imageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDate() {
		return dateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getButton() {
		return buttonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getButton_Label() {
		return (EAttribute)buttonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColumn() {
		return columnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumn_Uid() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumn_Label() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getColumn_Element() {
		return (EReference)columnEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTable() {
		return tableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_Label() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_RowNumber() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTable_Cols() {
		return (EReference)tableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMenu() {
		return menuEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMenuHolder() {
		return menuHolderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMenuHolder_Menu() {
		return (EReference)menuHolderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMenuExtensionRef() {
		return menuExtensionRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMenuExtensionRef_ExtensionRef() {
		return (EReference)menuExtensionRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMenuElement() {
		return menuElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMenuElement_Uid() {
		return (EAttribute)menuElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMenuElement_Name() {
		return (EAttribute)menuElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMenuFolder() {
		return menuFolderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMenuFolder_Uid() {
		return (EAttribute)menuFolderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMenuFolder_Name() {
		return (EAttribute)menuFolderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMenuFolder_ExtensionPoint() {
		return (EAttribute)menuFolderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMenuFolder_MenuElements() {
		return (EReference)menuFolderEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMenuItem() {
		return menuItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMenuItem_Transition() {
		return (EReference)menuItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMenuItem_RefreshAreas() {
		return (EReference)menuItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMenuExtensionPoint() {
		return menuExtensionPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubMenu() {
		return subMenuEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToSubmenu() {
		return toSubmenuEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToSubmenu_Uid() {
		return (EAttribute)toSubmenuEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToSubmenu_Source() {
		return (EReference)toSubmenuEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToSubmenu_Target() {
		return (EReference)toSubmenuEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMenuSeparator() {
		return menuSeparatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTree() {
		return treeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTree_Label() {
		return (EAttribute)treeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTree_Image() {
		return (EReference)treeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTree_Cols() {
		return (EReference)treeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControls() {
		return controlsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControls_Uid() {
		return (EAttribute)controlsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControls_Root() {
		return (EReference)controlsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControls_Controls() {
		return (EReference)controlsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControls_Relations() {
		return (EReference)controlsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControls_Dependencies() {
		return (EReference)controlsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrigger() {
		return triggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPREFormTrigger() {
		return preFormTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPREFormTrigger_Uid() {
		return (EAttribute)preFormTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPREQueryTrigger() {
		return preQueryTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPREQueryTrigger_Uid() {
		return (EAttribute)preQueryTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPOSTQueryTrigger() {
		return postQueryTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPOSTQueryTrigger_Uid() {
		return (EAttribute)postQueryTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPREInsertTrigger() {
		return preInsertTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPREInsertTrigger_Uid() {
		return (EAttribute)preInsertTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPREDeleteTrigger() {
		return preDeleteTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPREDeleteTrigger_Uid() {
		return (EAttribute)preDeleteTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPOSTCreateTrigger() {
		return postCreateTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPOSTCreateTrigger_Uid() {
		return (EAttribute)postCreateTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPREUpdateTrigger() {
		return preUpdateTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPREUpdateTrigger_Uid() {
		return (EAttribute)preUpdateTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProxiesList() {
		return proxiesListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProxiesList_TypePointers() {
		return (EReference)proxiesListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateTrigger() {
		return createTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateTrigger_Uid() {
		return (EAttribute)createTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInsertTrigger() {
		return insertTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInsertTrigger_Uid() {
		return (EAttribute)insertTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpdateTrigger() {
		return updateTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdateTrigger_Uid() {
		return (EAttribute)updateTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeleteTrigger() {
		return deleteTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeleteTrigger_Uid() {
		return (EAttribute)deleteTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSearchTrigger() {
		return searchTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSearchTrigger_Uid() {
		return (EAttribute)searchTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoot() {
		return rootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoot_Uid() {
		return (EAttribute)rootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoot_Name() {
		return (EAttribute)rootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoot_PreFormTrigger() {
		return (EReference)rootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoot_Variables() {
		return (EReference)rootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormVariable() {
		return formVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormVariable_Uid() {
		return (EAttribute)formVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormVariable_Name() {
		return (EAttribute)formVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormVariable_ParamRef() {
		return (EReference)formVariableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataControl() {
		return dataControlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataControl_Uid() {
		return (EAttribute)dataControlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataControl_Name() {
		return (EAttribute)dataControlEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataControl_BaseType() {
		return (EReference)dataControlEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataControl_PreQueryTrigger() {
		return (EReference)dataControlEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataControl_PostQueryTrigger() {
		return (EReference)dataControlEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataControl_PreInsertTrigger() {
		return (EReference)dataControlEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataControl_PreDeleteTrigger() {
		return (EReference)dataControlEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataControl_PostCreateTrigger() {
		return (EReference)dataControlEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataControl_PreUpdateTrigger() {
		return (EReference)dataControlEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataControl_Create() {
		return (EReference)dataControlEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataControl_Insert() {
		return (EReference)dataControlEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataControl_Update() {
		return (EReference)dataControlEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataControl_Remove() {
		return (EReference)dataControlEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataControl_Search() {
		return (EReference)dataControlEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataControl_ArtificialFields() {
		return (EReference)dataControlEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataControl_DefaultSearch() {
		return (EReference)dataControlEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataControl_DefaultOrderBy() {
		return (EReference)dataControlEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrders() {
		return ordersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrders_Uid() {
		return (EAttribute)ordersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrders_OrderRules() {
		return (EReference)ordersEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrderBy() {
		return orderByEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrderBy_Uid() {
		return (EAttribute)orderByEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrderBy_RefObj() {
		return (EReference)orderByEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrderBy_Order() {
		return (EAttribute)orderByEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelation() {
		return relationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelation_Uid() {
		return (EAttribute)relationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelation_Name() {
		return (EAttribute)relationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelation_Master() {
		return (EReference)relationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelation_Detail() {
		return (EReference)relationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelation_IsTree() {
		return (EAttribute)relationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelation_Links() {
		return (EReference)relationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDependency() {
		return dependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDependency_Uid() {
		return (EAttribute)dependencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDependency_Name() {
		return (EAttribute)dependencyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependency_Master() {
		return (EReference)dependencyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependency_Detail() {
		return (EReference)dependencyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArtificialField() {
		return artificialFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArtificialField_Uid() {
		return (EAttribute)artificialFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArtificialField_Name() {
		return (EAttribute)artificialFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLink() {
		return linkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLink_Uid() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLink_MasterField() {
		return (EReference)linkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLink_DetailField() {
		return (EReference)linkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getComparator() {
		return comparatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOrder() {
		return orderEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOrientation() {
		return orientationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormFactory getFormFactory() {
		return (FormFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		formEClass = createEClass(FORM);
		createEAttribute(formEClass, FORM__UID);
		createEAttribute(formEClass, FORM__NAME);
		createEReference(formEClass, FORM__VIEW);
		createEReference(formEClass, FORM__DATACONTROLS);
		createEReference(formEClass, FORM__PARAMETERS);

		formParameterEClass = createEClass(FORM_PARAMETER);
		createEAttribute(formParameterEClass, FORM_PARAMETER__UID);
		createEAttribute(formParameterEClass, FORM_PARAMETER__NAME);

		viewsEClass = createEClass(VIEWS);
		createEAttribute(viewsEClass, VIEWS__UID);
		createEReference(viewsEClass, VIEWS__CANVASES);
		createEReference(viewsEClass, VIEWS__VIEW_INHERITANCES);
		createEReference(viewsEClass, VIEWS__TAB_PAGES_INHERITANCES);
		createEReference(viewsEClass, VIEWS__MENUS);

		htmlLayerHolderEClass = createEClass(HTML_LAYER_HOLDER);
		createEAttribute(htmlLayerHolderEClass, HTML_LAYER_HOLDER__COLUMNS);

		orderableEClass = createEClass(ORDERABLE);
		createEAttribute(orderableEClass, ORDERABLE__ORDER);

		multiLangLabelEClass = createEClass(MULTI_LANG_LABEL);
		createEReference(multiLangLabelEClass, MULTI_LANG_LABEL__MULTI_LANG_LABEL);

		canvasFrameEClass = createEClass(CANVAS_FRAME);
		createEAttribute(canvasFrameEClass, CANVAS_FRAME__UID);
		createEAttribute(canvasFrameEClass, CANVAS_FRAME__NAME);

		viewPortHolderEClass = createEClass(VIEW_PORT_HOLDER);
		createEReference(viewPortHolderEClass, VIEW_PORT_HOLDER__VIEW_ELEMENT);

		defaultCavasEClass = createEClass(DEFAULT_CAVAS);
		createEAttribute(defaultCavasEClass, DEFAULT_CAVAS__DEFAULT_CANVAS);

		viewElementEClass = createEClass(VIEW_ELEMENT);

		popupCanvasEClass = createEClass(POPUP_CANVAS);
		createEAttribute(popupCanvasEClass, POPUP_CANVAS__MODAL);

		canvasEClass = createEClass(CANVAS);

		windowEClass = createEClass(WINDOW);

		menuDefinitionEClass = createEClass(MENU_DEFINITION);
		createEAttribute(menuDefinitionEClass, MENU_DEFINITION__UID);
		createEAttribute(menuDefinitionEClass, MENU_DEFINITION__NAME);
		createEReference(menuDefinitionEClass, MENU_DEFINITION__MENU_FOLDERS);
		createEReference(menuDefinitionEClass, MENU_DEFINITION__TO_SUB_MENU);

		tabCanvasEClass = createEClass(TAB_CANVAS);
		createEAttribute(tabCanvasEClass, TAB_CANVAS__ORIENTATION);

		tabPageEClass = createEClass(TAB_PAGE);

		viewPortEClass = createEClass(VIEW_PORT);
		createEAttribute(viewPortEClass, VIEW_PORT__UID);
		createEAttribute(viewPortEClass, VIEW_PORT__NAME);
		createEReference(viewPortEClass, VIEW_PORT__VIEW_PORT_TRIGGER);

		viewAreaEClass = createEClass(VIEW_AREA);
		createEAttribute(viewAreaEClass, VIEW_AREA__UID);
		createEAttribute(viewAreaEClass, VIEW_AREA__NAME);
		createEReference(viewAreaEClass, VIEW_AREA__BASE_CANVAS);
		createEReference(viewAreaEClass, VIEW_AREA__LINK_TO_LABELS);
		createEReference(viewAreaEClass, VIEW_AREA__LINK_TO_MESSAGES);

		viewPortTriggerEClass = createEClass(VIEW_PORT_TRIGGER);
		createEAttribute(viewPortTriggerEClass, VIEW_PORT_TRIGGER__UID);

		viewInheritanceEClass = createEClass(VIEW_INHERITANCE);
		createEAttribute(viewInheritanceEClass, VIEW_INHERITANCE__UID);
		createEReference(viewInheritanceEClass, VIEW_INHERITANCE__SOURCE);
		createEReference(viewInheritanceEClass, VIEW_INHERITANCE__TARGET);

		tabPagesInheritanceEClass = createEClass(TAB_PAGES_INHERITANCE);
		createEAttribute(tabPagesInheritanceEClass, TAB_PAGES_INHERITANCE__UID);
		createEReference(tabPagesInheritanceEClass, TAB_PAGES_INHERITANCE__SOURCE);
		createEReference(tabPagesInheritanceEClass, TAB_PAGES_INHERITANCE__TARGET);

		linkToMessageEClass = createEClass(LINK_TO_MESSAGE);
		createEAttribute(linkToMessageEClass, LINK_TO_MESSAGE__UID);
		createEReference(linkToMessageEClass, LINK_TO_MESSAGE__SOURCE);
		createEReference(linkToMessageEClass, LINK_TO_MESSAGE__TARGET);

		linkToLabelEClass = createEClass(LINK_TO_LABEL);
		createEAttribute(linkToLabelEClass, LINK_TO_LABEL__UID);
		createEReference(linkToLabelEClass, LINK_TO_LABEL__SOURCE);
		createEReference(linkToLabelEClass, LINK_TO_LABEL__TARGET);

		childrenHolderEClass = createEClass(CHILDREN_HOLDER);
		createEReference(childrenHolderEClass, CHILDREN_HOLDER__CHILDREN);

		contextParameterEClass = createEClass(CONTEXT_PARAMETER);
		createEAttribute(contextParameterEClass, CONTEXT_PARAMETER__UID);
		createEReference(contextParameterEClass, CONTEXT_PARAMETER__REF_OBJ);
		createEAttribute(contextParameterEClass, CONTEXT_PARAMETER__OPERATION);
		createEReference(contextParameterEClass, CONTEXT_PARAMETER__VALUE);

		contextValueEClass = createEClass(CONTEXT_VALUE);
		createEAttribute(contextValueEClass, CONTEXT_VALUE__UID);
		createEAttribute(contextValueEClass, CONTEXT_VALUE__CONSTANT);
		createEAttribute(contextValueEClass, CONTEXT_VALUE__VALUE);
		createEReference(contextValueEClass, CONTEXT_VALUE__EXPRESSION);

		expressionPartEClass = createEClass(EXPRESSION_PART);
		createEAttribute(expressionPartEClass, EXPRESSION_PART__UID);
		createEReference(expressionPartEClass, EXPRESSION_PART__OBJ_REF);
		createEAttribute(expressionPartEClass, EXPRESSION_PART__ORDER);
		createEAttribute(expressionPartEClass, EXPRESSION_PART__EXPRESSION_TYPE);

		contextParametersEClass = createEClass(CONTEXT_PARAMETERS);
		createEReference(contextParametersEClass, CONTEXT_PARAMETERS__PARAMETERS);

		contextEClass = createEClass(CONTEXT);

		styleElementEClass = createEClass(STYLE_ELEMENT);
		createEReference(styleElementEClass, STYLE_ELEMENT__STYLE);
		createEReference(styleElementEClass, STYLE_ELEMENT__STYLE_CLASS);

		styleClassEClass = createEClass(STYLE_CLASS);
		createEReference(styleClassEClass, STYLE_CLASS__CLASSIFIER);

		nickNamedEClass = createEClass(NICK_NAMED);
		createEAttribute(nickNamedEClass, NICK_NAMED__NICKNAME);

		flexFieldsEClass = createEClass(FLEX_FIELDS);
		createEReference(flexFieldsEClass, FLEX_FIELDS__FIELDS);

		flexFieldEClass = createEClass(FLEX_FIELD);

		enabledUIItemEClass = createEClass(ENABLED_UI_ITEM);
		createEReference(enabledUIItemEClass, ENABLED_UI_ITEM__ENABLED);

		uielementEClass = createEClass(UIELEMENT);
		createEAttribute(uielementEClass, UIELEMENT__UID);
		createEReference(uielementEClass, UIELEMENT__REQUIRED);
		createEReference(uielementEClass, UIELEMENT__READ_ONLY);
		createEReference(uielementEClass, UIELEMENT__REFRESH_AREAS);

		itemIconEClass = createEClass(ITEM_ICON);
		createEReference(itemIconEClass, ITEM_ICON__ICON);

		areaRefEClass = createEClass(AREA_REF);
		createEReference(areaRefEClass, AREA_REF__AREA);
		createEAttribute(areaRefEClass, AREA_REF__GROUP);

		formatableEClass = createEClass(FORMATABLE);
		createEAttribute(formatableEClass, FORMATABLE__FORMAT);

		sourcesPointerEClass = createEClass(SOURCES_POINTER);
		createEReference(sourcesPointerEClass, SOURCES_POINTER__SOURCE_POINTER);
		createEReference(sourcesPointerEClass, SOURCES_POINTER__VALUE_POINTER);
		createEReference(sourcesPointerEClass, SOURCES_POINTER__SOURCE_CAST);
		createEReference(sourcesPointerEClass, SOURCES_POINTER__SOURCE_CAST_DATA_CONTROL);

		inputElementEClass = createEClass(INPUT_ELEMENT);

		selectionEClass = createEClass(SELECTION);
		createEReference(selectionEClass, SELECTION__DISPLAY_OPTION_POINTER);
		createEReference(selectionEClass, SELECTION__VALUE_OPTION_POINTER);

		optionSelectionEClass = createEClass(OPTION_SELECTION);
		createEReference(optionSelectionEClass, OPTION_SELECTION__OPTION_POINTER);
		createEReference(optionSelectionEClass, OPTION_SELECTION__OPTION_CAST);
		createEReference(optionSelectionEClass, OPTION_SELECTION__OPTION_CAST_DATA_CONTROL);

		layerHolderEClass = createEClass(LAYER_HOLDER);

		inputTextEClass = createEClass(INPUT_TEXT);

		passwordEClass = createEClass(PASSWORD);

		labelEClass = createEClass(LABEL);
		createEAttribute(labelEClass, LABEL__LABEL);

		messageElementEClass = createEClass(MESSAGE_ELEMENT);
		createEAttribute(messageElementEClass, MESSAGE_ELEMENT__LABEL);

		outputTextEClass = createEClass(OUTPUT_TEXT);

		checkBoxEClass = createEClass(CHECK_BOX);

		dropDownSelectionEClass = createEClass(DROP_DOWN_SELECTION);
		createEReference(dropDownSelectionEClass, DROP_DOWN_SELECTION__SELECTION);
		createEReference(dropDownSelectionEClass, DROP_DOWN_SELECTION__INITIAL_OPTION_MESSAGE);
		createEAttribute(dropDownSelectionEClass, DROP_DOWN_SELECTION__INITIAL_OPTION_VALUE);

		imageEClass = createEClass(IMAGE);

		dateEClass = createEClass(DATE);

		buttonEClass = createEClass(BUTTON);
		createEAttribute(buttonEClass, BUTTON__LABEL);

		columnEClass = createEClass(COLUMN);
		createEAttribute(columnEClass, COLUMN__UID);
		createEAttribute(columnEClass, COLUMN__LABEL);
		createEReference(columnEClass, COLUMN__ELEMENT);

		tableEClass = createEClass(TABLE);
		createEAttribute(tableEClass, TABLE__LABEL);
		createEAttribute(tableEClass, TABLE__ROW_NUMBER);
		createEReference(tableEClass, TABLE__COLS);

		menuEClass = createEClass(MENU);

		menuHolderEClass = createEClass(MENU_HOLDER);
		createEReference(menuHolderEClass, MENU_HOLDER__MENU);

		menuExtensionRefEClass = createEClass(MENU_EXTENSION_REF);
		createEReference(menuExtensionRefEClass, MENU_EXTENSION_REF__EXTENSION_REF);

		menuElementEClass = createEClass(MENU_ELEMENT);
		createEAttribute(menuElementEClass, MENU_ELEMENT__UID);
		createEAttribute(menuElementEClass, MENU_ELEMENT__NAME);

		menuFolderEClass = createEClass(MENU_FOLDER);
		createEAttribute(menuFolderEClass, MENU_FOLDER__UID);
		createEAttribute(menuFolderEClass, MENU_FOLDER__NAME);
		createEAttribute(menuFolderEClass, MENU_FOLDER__EXTENSION_POINT);
		createEReference(menuFolderEClass, MENU_FOLDER__MENU_ELEMENTS);

		menuItemEClass = createEClass(MENU_ITEM);
		createEReference(menuItemEClass, MENU_ITEM__TRANSITION);
		createEReference(menuItemEClass, MENU_ITEM__REFRESH_AREAS);

		menuExtensionPointEClass = createEClass(MENU_EXTENSION_POINT);

		subMenuEClass = createEClass(SUB_MENU);

		toSubmenuEClass = createEClass(TO_SUBMENU);
		createEAttribute(toSubmenuEClass, TO_SUBMENU__UID);
		createEReference(toSubmenuEClass, TO_SUBMENU__SOURCE);
		createEReference(toSubmenuEClass, TO_SUBMENU__TARGET);

		menuSeparatorEClass = createEClass(MENU_SEPARATOR);

		treeEClass = createEClass(TREE);
		createEAttribute(treeEClass, TREE__LABEL);
		createEReference(treeEClass, TREE__IMAGE);
		createEReference(treeEClass, TREE__COLS);

		controlsEClass = createEClass(CONTROLS);
		createEAttribute(controlsEClass, CONTROLS__UID);
		createEReference(controlsEClass, CONTROLS__ROOT);
		createEReference(controlsEClass, CONTROLS__CONTROLS);
		createEReference(controlsEClass, CONTROLS__RELATIONS);
		createEReference(controlsEClass, CONTROLS__DEPENDENCIES);

		triggerEClass = createEClass(TRIGGER);

		preFormTriggerEClass = createEClass(PRE_FORM_TRIGGER);
		createEAttribute(preFormTriggerEClass, PRE_FORM_TRIGGER__UID);

		preQueryTriggerEClass = createEClass(PRE_QUERY_TRIGGER);
		createEAttribute(preQueryTriggerEClass, PRE_QUERY_TRIGGER__UID);

		postQueryTriggerEClass = createEClass(POST_QUERY_TRIGGER);
		createEAttribute(postQueryTriggerEClass, POST_QUERY_TRIGGER__UID);

		preInsertTriggerEClass = createEClass(PRE_INSERT_TRIGGER);
		createEAttribute(preInsertTriggerEClass, PRE_INSERT_TRIGGER__UID);

		preDeleteTriggerEClass = createEClass(PRE_DELETE_TRIGGER);
		createEAttribute(preDeleteTriggerEClass, PRE_DELETE_TRIGGER__UID);

		postCreateTriggerEClass = createEClass(POST_CREATE_TRIGGER);
		createEAttribute(postCreateTriggerEClass, POST_CREATE_TRIGGER__UID);

		preUpdateTriggerEClass = createEClass(PRE_UPDATE_TRIGGER);
		createEAttribute(preUpdateTriggerEClass, PRE_UPDATE_TRIGGER__UID);

		proxiesListEClass = createEClass(PROXIES_LIST);
		createEReference(proxiesListEClass, PROXIES_LIST__TYPE_POINTERS);

		createTriggerEClass = createEClass(CREATE_TRIGGER);
		createEAttribute(createTriggerEClass, CREATE_TRIGGER__UID);

		insertTriggerEClass = createEClass(INSERT_TRIGGER);
		createEAttribute(insertTriggerEClass, INSERT_TRIGGER__UID);

		updateTriggerEClass = createEClass(UPDATE_TRIGGER);
		createEAttribute(updateTriggerEClass, UPDATE_TRIGGER__UID);

		deleteTriggerEClass = createEClass(DELETE_TRIGGER);
		createEAttribute(deleteTriggerEClass, DELETE_TRIGGER__UID);

		searchTriggerEClass = createEClass(SEARCH_TRIGGER);
		createEAttribute(searchTriggerEClass, SEARCH_TRIGGER__UID);

		rootEClass = createEClass(ROOT);
		createEAttribute(rootEClass, ROOT__UID);
		createEAttribute(rootEClass, ROOT__NAME);
		createEReference(rootEClass, ROOT__PRE_FORM_TRIGGER);
		createEReference(rootEClass, ROOT__VARIABLES);

		formVariableEClass = createEClass(FORM_VARIABLE);
		createEAttribute(formVariableEClass, FORM_VARIABLE__UID);
		createEAttribute(formVariableEClass, FORM_VARIABLE__NAME);
		createEReference(formVariableEClass, FORM_VARIABLE__PARAM_REF);

		dataControlEClass = createEClass(DATA_CONTROL);
		createEAttribute(dataControlEClass, DATA_CONTROL__UID);
		createEAttribute(dataControlEClass, DATA_CONTROL__NAME);
		createEReference(dataControlEClass, DATA_CONTROL__BASE_TYPE);
		createEReference(dataControlEClass, DATA_CONTROL__PRE_QUERY_TRIGGER);
		createEReference(dataControlEClass, DATA_CONTROL__POST_QUERY_TRIGGER);
		createEReference(dataControlEClass, DATA_CONTROL__PRE_INSERT_TRIGGER);
		createEReference(dataControlEClass, DATA_CONTROL__PRE_DELETE_TRIGGER);
		createEReference(dataControlEClass, DATA_CONTROL__POST_CREATE_TRIGGER);
		createEReference(dataControlEClass, DATA_CONTROL__PRE_UPDATE_TRIGGER);
		createEReference(dataControlEClass, DATA_CONTROL__CREATE);
		createEReference(dataControlEClass, DATA_CONTROL__INSERT);
		createEReference(dataControlEClass, DATA_CONTROL__UPDATE);
		createEReference(dataControlEClass, DATA_CONTROL__REMOVE);
		createEReference(dataControlEClass, DATA_CONTROL__SEARCH);
		createEReference(dataControlEClass, DATA_CONTROL__ARTIFICIAL_FIELDS);
		createEReference(dataControlEClass, DATA_CONTROL__DEFAULT_SEARCH);
		createEReference(dataControlEClass, DATA_CONTROL__DEFAULT_ORDER_BY);

		ordersEClass = createEClass(ORDERS);
		createEAttribute(ordersEClass, ORDERS__UID);
		createEReference(ordersEClass, ORDERS__ORDER_RULES);

		orderByEClass = createEClass(ORDER_BY);
		createEAttribute(orderByEClass, ORDER_BY__UID);
		createEReference(orderByEClass, ORDER_BY__REF_OBJ);
		createEAttribute(orderByEClass, ORDER_BY__ORDER);

		relationEClass = createEClass(RELATION);
		createEAttribute(relationEClass, RELATION__UID);
		createEAttribute(relationEClass, RELATION__NAME);
		createEReference(relationEClass, RELATION__MASTER);
		createEReference(relationEClass, RELATION__DETAIL);
		createEAttribute(relationEClass, RELATION__IS_TREE);
		createEReference(relationEClass, RELATION__LINKS);

		dependencyEClass = createEClass(DEPENDENCY);
		createEAttribute(dependencyEClass, DEPENDENCY__UID);
		createEAttribute(dependencyEClass, DEPENDENCY__NAME);
		createEReference(dependencyEClass, DEPENDENCY__MASTER);
		createEReference(dependencyEClass, DEPENDENCY__DETAIL);

		artificialFieldEClass = createEClass(ARTIFICIAL_FIELD);
		createEAttribute(artificialFieldEClass, ARTIFICIAL_FIELD__UID);
		createEAttribute(artificialFieldEClass, ARTIFICIAL_FIELD__NAME);

		linkEClass = createEClass(LINK);
		createEAttribute(linkEClass, LINK__UID);
		createEReference(linkEClass, LINK__MASTER_FIELD);
		createEReference(linkEClass, LINK__DETAIL_FIELD);

		// Create enums
		comparatorEEnum = createEEnum(COMPARATOR);
		orderEEnum = createEEnum(ORDER);
		orientationEEnum = createEEnum(ORIENTATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		TypePackage theTypePackage = (TypePackage)EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI);
		CommonPackage theCommonPackage = (CommonPackage)EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI);
		PermissionPackage thePermissionPackage = (PermissionPackage)EPackage.Registry.INSTANCE.getEPackage(PermissionPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		formParameterEClass.getESuperTypes().add(theTypePackage.getTypePointer());
		canvasFrameEClass.getESuperTypes().add(this.getStyleElement());
		viewPortHolderEClass.getESuperTypes().add(this.getHTMLLayerHolder());
		viewElementEClass.getESuperTypes().add(this.getStyleElement());
		viewElementEClass.getESuperTypes().add(theCommonPackage.getCategorized());
		viewElementEClass.getESuperTypes().add(this.getNickNamed());
		popupCanvasEClass.getESuperTypes().add(this.getCanvasFrame());
		popupCanvasEClass.getESuperTypes().add(this.getViewPortHolder());
		popupCanvasEClass.getESuperTypes().add(this.getDefaultCavas());
		popupCanvasEClass.getESuperTypes().add(this.getMultiLangLabel());
		popupCanvasEClass.getESuperTypes().add(theCommonPackage.getCategorized());
		popupCanvasEClass.getESuperTypes().add(this.getFlexFields());
		canvasEClass.getESuperTypes().add(this.getCanvasFrame());
		canvasEClass.getESuperTypes().add(this.getViewPortHolder());
		canvasEClass.getESuperTypes().add(this.getDefaultCavas());
		canvasEClass.getESuperTypes().add(this.getMultiLangLabel());
		canvasEClass.getESuperTypes().add(theCommonPackage.getCategorized());
		windowEClass.getESuperTypes().add(this.getCanvasFrame());
		windowEClass.getESuperTypes().add(this.getViewPortHolder());
		windowEClass.getESuperTypes().add(this.getMultiLangLabel());
		windowEClass.getESuperTypes().add(theCommonPackage.getCategorized());
		windowEClass.getESuperTypes().add(thePermissionPackage.getSecured());
		menuDefinitionEClass.getESuperTypes().add(this.getStyleElement());
		menuDefinitionEClass.getESuperTypes().add(theCommonPackage.getCategorized());
		tabCanvasEClass.getESuperTypes().add(this.getCanvasFrame());
		tabCanvasEClass.getESuperTypes().add(this.getDefaultCavas());
		tabCanvasEClass.getESuperTypes().add(this.getMultiLangLabel());
		tabCanvasEClass.getESuperTypes().add(theCommonPackage.getCategorized());
		tabPageEClass.getESuperTypes().add(this.getCanvasFrame());
		tabPageEClass.getESuperTypes().add(this.getViewPortHolder());
		tabPageEClass.getESuperTypes().add(this.getMultiLangLabel());
		tabPageEClass.getESuperTypes().add(theCommonPackage.getCategorized());
		tabPageEClass.getESuperTypes().add(this.getOrderable());
		viewPortEClass.getESuperTypes().add(this.getViewElement());
		viewPortEClass.getESuperTypes().add(this.getOrderable());
		viewAreaEClass.getESuperTypes().add(this.getViewElement());
		viewAreaEClass.getESuperTypes().add(this.getOrderable());
		viewPortTriggerEClass.getESuperTypes().add(this.getTrigger());
		contextEClass.getESuperTypes().add(this.getContextValue());
		contextEClass.getESuperTypes().add(this.getContextParameters());
		styleClassEClass.getESuperTypes().add(this.getContextValue());
		flexFieldEClass.getESuperTypes().add(this.getContext());
		flexFieldEClass.getESuperTypes().add(theCommonPackage.getCategorized());
		uielementEClass.getESuperTypes().add(this.getStyleElement());
		uielementEClass.getESuperTypes().add(this.getNickNamed());
		uielementEClass.getESuperTypes().add(theCommonPackage.getCategorized());
		uielementEClass.getESuperTypes().add(this.getOrderable());
		uielementEClass.getESuperTypes().add(this.getEnabledUIItem());
		uielementEClass.getESuperTypes().add(this.getFlexFields());
		uielementEClass.getESuperTypes().add(this.getMenuHolder());
		sourcesPointerEClass.getESuperTypes().add(this.getUielement());
		inputElementEClass.getESuperTypes().add(this.getSourcesPointer());
		selectionEClass.getESuperTypes().add(this.getStyleElement());
		optionSelectionEClass.getESuperTypes().add(this.getInputElement());
		layerHolderEClass.getESuperTypes().add(this.getUielement());
		layerHolderEClass.getESuperTypes().add(this.getChildrenHolder());
		layerHolderEClass.getESuperTypes().add(this.getHTMLLayerHolder());
		inputTextEClass.getESuperTypes().add(this.getInputElement());
		inputTextEClass.getESuperTypes().add(this.getFormatable());
		passwordEClass.getESuperTypes().add(this.getInputElement());
		passwordEClass.getESuperTypes().add(this.getFormatable());
		labelEClass.getESuperTypes().add(this.getUielement());
		labelEClass.getESuperTypes().add(this.getMultiLangLabel());
		messageElementEClass.getESuperTypes().add(this.getUielement());
		messageElementEClass.getESuperTypes().add(this.getMultiLangLabel());
		outputTextEClass.getESuperTypes().add(this.getInputElement());
		outputTextEClass.getESuperTypes().add(this.getFormatable());
		checkBoxEClass.getESuperTypes().add(this.getInputElement());
		dropDownSelectionEClass.getESuperTypes().add(this.getOptionSelection());
		imageEClass.getESuperTypes().add(this.getInputElement());
		dateEClass.getESuperTypes().add(this.getInputElement());
		dateEClass.getESuperTypes().add(this.getFormatable());
		buttonEClass.getESuperTypes().add(this.getUielement());
		buttonEClass.getESuperTypes().add(this.getMultiLangLabel());
		buttonEClass.getESuperTypes().add(this.getItemIcon());
		columnEClass.getESuperTypes().add(this.getStyleElement());
		columnEClass.getESuperTypes().add(this.getMultiLangLabel());
		columnEClass.getESuperTypes().add(theCommonPackage.getCategorized());
		columnEClass.getESuperTypes().add(this.getHTMLLayerHolder());
		columnEClass.getESuperTypes().add(this.getOrderable());
		tableEClass.getESuperTypes().add(this.getSourcesPointer());
		tableEClass.getESuperTypes().add(this.getMultiLangLabel());
		menuEClass.getESuperTypes().add(this.getUielement());
		menuElementEClass.getESuperTypes().add(this.getMultiLangLabel());
		menuElementEClass.getESuperTypes().add(this.getStyleElement());
		menuElementEClass.getESuperTypes().add(theCommonPackage.getCategorized());
		menuElementEClass.getESuperTypes().add(this.getEnabledUIItem());
		menuElementEClass.getESuperTypes().add(this.getOrderable());
		menuFolderEClass.getESuperTypes().add(this.getHTMLLayerHolder());
		menuFolderEClass.getESuperTypes().add(this.getEnabledUIItem());
		menuFolderEClass.getESuperTypes().add(theCommonPackage.getCategorized());
		menuFolderEClass.getESuperTypes().add(this.getStyleElement());
		menuFolderEClass.getESuperTypes().add(this.getMultiLangLabel());
		menuFolderEClass.getESuperTypes().add(this.getItemIcon());
		menuItemEClass.getESuperTypes().add(this.getMenuElement());
		menuItemEClass.getESuperTypes().add(this.getItemIcon());
		menuItemEClass.getESuperTypes().add(this.getFlexFields());
		menuExtensionPointEClass.getESuperTypes().add(this.getMenuElement());
		menuExtensionPointEClass.getESuperTypes().add(this.getMenuExtensionRef());
		subMenuEClass.getESuperTypes().add(this.getMenuElement());
		subMenuEClass.getESuperTypes().add(this.getItemIcon());
		menuSeparatorEClass.getESuperTypes().add(this.getMenuElement());
		treeEClass.getESuperTypes().add(this.getSourcesPointer());
		treeEClass.getESuperTypes().add(this.getMultiLangLabel());
		triggerEClass.getESuperTypes().add(theTypePackage.getMethodPointer());
		triggerEClass.getESuperTypes().add(this.getContextParameters());
		preFormTriggerEClass.getESuperTypes().add(this.getTrigger());
		preQueryTriggerEClass.getESuperTypes().add(this.getTrigger());
		postQueryTriggerEClass.getESuperTypes().add(this.getTrigger());
		preInsertTriggerEClass.getESuperTypes().add(this.getTrigger());
		preDeleteTriggerEClass.getESuperTypes().add(this.getTrigger());
		postCreateTriggerEClass.getESuperTypes().add(this.getTrigger());
		preUpdateTriggerEClass.getESuperTypes().add(this.getTrigger());
		createTriggerEClass.getESuperTypes().add(this.getTrigger());
		createTriggerEClass.getESuperTypes().add(this.getProxiesList());
		insertTriggerEClass.getESuperTypes().add(this.getTrigger());
		insertTriggerEClass.getESuperTypes().add(this.getProxiesList());
		updateTriggerEClass.getESuperTypes().add(this.getTrigger());
		updateTriggerEClass.getESuperTypes().add(this.getProxiesList());
		deleteTriggerEClass.getESuperTypes().add(this.getTrigger());
		deleteTriggerEClass.getESuperTypes().add(this.getProxiesList());
		searchTriggerEClass.getESuperTypes().add(this.getTrigger());
		searchTriggerEClass.getESuperTypes().add(this.getProxiesList());
		formVariableEClass.getESuperTypes().add(theTypePackage.getTypePointer());
		artificialFieldEClass.getESuperTypes().add(theTypePackage.getTypePointer());

		// Initialize classes and features; add operations and parameters
		initEClass(formEClass, Form.class, "Form", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getForm_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Form.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForm_Name(), ecorePackage.getEString(), "name", null, 0, 1, Form.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForm_View(), this.getViews(), null, "view", null, 0, 1, Form.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForm_Datacontrols(), this.getControls(), null, "datacontrols", null, 0, 1, Form.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForm_Parameters(), this.getFormParameter(), null, "parameters", null, 0, -1, Form.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formParameterEClass, FormParameter.class, "FormParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFormParameter_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, FormParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormParameter_Name(), ecorePackage.getEString(), "name", null, 0, 1, FormParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewsEClass, Views.class, "Views", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getViews_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Views.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getViews_Canvases(), this.getCanvasFrame(), null, "canvases", null, 0, -1, Views.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getViews_ViewInheritances(), this.getViewInheritance(), null, "viewInheritances", null, 0, -1, Views.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getViews_TabPagesInheritances(), this.getTabPagesInheritance(), null, "tabPagesInheritances", null, 0, -1, Views.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getViews_Menus(), this.getMenuDefinition(), null, "menus", null, 0, -1, Views.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(htmlLayerHolderEClass, HTMLLayerHolder.class, "HTMLLayerHolder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHTMLLayerHolder_Columns(), ecorePackage.getEInt(), "columns", "1", 0, 1, HTMLLayerHolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderableEClass, Orderable.class, "Orderable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderable_Order(), ecorePackage.getEInt(), "order", null, 0, 1, Orderable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multiLangLabelEClass, MultiLangLabel.class, "MultiLangLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMultiLangLabel_MultiLangLabel(), this.getContext(), null, "multiLangLabel", null, 0, 1, MultiLangLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(canvasFrameEClass, CanvasFrame.class, "CanvasFrame", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCanvasFrame_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, CanvasFrame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCanvasFrame_Name(), ecorePackage.getEString(), "name", null, 0, 1, CanvasFrame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewPortHolderEClass, ViewPortHolder.class, "ViewPortHolder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getViewPortHolder_ViewElement(), this.getViewElement(), null, "viewElement", null, 0, -1, ViewPortHolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(defaultCavasEClass, DefaultCavas.class, "DefaultCavas", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDefaultCavas_DefaultCanvas(), ecorePackage.getEBoolean(), "defaultCanvas", null, 0, 1, DefaultCavas.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewElementEClass, ViewElement.class, "ViewElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(popupCanvasEClass, PopupCanvas.class, "PopupCanvas", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPopupCanvas_Modal(), ecorePackage.getEBoolean(), "modal", null, 0, 1, PopupCanvas.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(canvasEClass, Canvas.class, "Canvas", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(windowEClass, Window.class, "Window", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(menuDefinitionEClass, MenuDefinition.class, "MenuDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMenuDefinition_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, MenuDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMenuDefinition_Name(), ecorePackage.getEString(), "name", null, 0, 1, MenuDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMenuDefinition_MenuFolders(), this.getMenuFolder(), null, "menuFolders", null, 0, -1, MenuDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMenuDefinition_ToSubMenu(), this.getToSubmenu(), null, "toSubMenu", null, 0, -1, MenuDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tabCanvasEClass, TabCanvas.class, "TabCanvas", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTabCanvas_Orientation(), this.getOrientation(), "orientation", null, 0, 1, TabCanvas.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tabPageEClass, TabPage.class, "TabPage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(viewPortEClass, ViewPort.class, "ViewPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getViewPort_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, ViewPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getViewPort_Name(), ecorePackage.getEString(), "name", null, 0, 1, ViewPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getViewPort_ViewPortTrigger(), this.getViewPortTrigger(), null, "viewPortTrigger", null, 0, 1, ViewPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewAreaEClass, ViewArea.class, "ViewArea", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getViewArea_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, ViewArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getViewArea_Name(), ecorePackage.getEString(), "name", null, 0, 1, ViewArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getViewArea_BaseCanvas(), this.getLayerHolder(), null, "baseCanvas", null, 0, 1, ViewArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getViewArea_LinkToLabels(), this.getLinkToLabel(), null, "linkToLabels", null, 0, -1, ViewArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getViewArea_LinkToMessages(), this.getLinkToMessage(), null, "linkToMessages", null, 0, -1, ViewArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewPortTriggerEClass, ViewPortTrigger.class, "ViewPortTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getViewPortTrigger_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, ViewPortTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewInheritanceEClass, ViewInheritance.class, "ViewInheritance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getViewInheritance_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, ViewInheritance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getViewInheritance_Source(), this.getViewPort(), null, "source", null, 0, 1, ViewInheritance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getViewInheritance_Target(), this.getCanvasFrame(), null, "target", null, 0, 1, ViewInheritance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tabPagesInheritanceEClass, TabPagesInheritance.class, "TabPagesInheritance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTabPagesInheritance_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, TabPagesInheritance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTabPagesInheritance_Source(), this.getTabCanvas(), null, "source", null, 0, 1, TabPagesInheritance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTabPagesInheritance_Target(), this.getTabPage(), null, "target", null, 0, 1, TabPagesInheritance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkToMessageEClass, LinkToMessage.class, "LinkToMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLinkToMessage_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, LinkToMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLinkToMessage_Source(), this.getInputElement(), null, "source", null, 0, 1, LinkToMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLinkToMessage_Target(), this.getMessageElement(), null, "target", null, 0, 1, LinkToMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkToLabelEClass, LinkToLabel.class, "LinkToLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLinkToLabel_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, LinkToLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLinkToLabel_Source(), this.getInputElement(), null, "source", null, 0, 1, LinkToLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLinkToLabel_Target(), this.getLabel(), null, "target", null, 0, 1, LinkToLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(childrenHolderEClass, ChildrenHolder.class, "ChildrenHolder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChildrenHolder_Children(), this.getUielement(), null, "children", null, 0, -1, ChildrenHolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contextParameterEClass, ContextParameter.class, "ContextParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContextParameter_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, ContextParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContextParameter_RefObj(), ecorePackage.getEObject(), null, "refObj", null, 0, 1, ContextParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContextParameter_Operation(), this.getComparator(), "operation", null, 0, 1, ContextParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContextParameter_Value(), this.getContextValue(), null, "value", null, 0, 1, ContextParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contextValueEClass, ContextValue.class, "ContextValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContextValue_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, ContextValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContextValue_Constant(), ecorePackage.getEBoolean(), "constant", null, 0, 1, ContextValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContextValue_Value(), ecorePackage.getEString(), "value", null, 0, 1, ContextValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContextValue_Expression(), this.getExpressionPart(), null, "expression", null, 0, -1, ContextValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionPartEClass, ExpressionPart.class, "ExpressionPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExpressionPart_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, ExpressionPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExpressionPart_ObjRef(), ecorePackage.getEObject(), null, "objRef", null, 0, 1, ExpressionPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExpressionPart_Order(), ecorePackage.getEInt(), "order", null, 0, 1, ExpressionPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExpressionPart_ExpressionType(), ecorePackage.getEString(), "expressionType", null, 0, 1, ExpressionPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contextParametersEClass, ContextParameters.class, "ContextParameters", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContextParameters_Parameters(), this.getContextParameter(), null, "parameters", null, 0, -1, ContextParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contextEClass, Context.class, "Context", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(styleElementEClass, StyleElement.class, "StyleElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStyleElement_Style(), this.getContext(), null, "style", null, 0, 1, StyleElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStyleElement_StyleClass(), this.getStyleClass(), null, "styleClass", null, 0, -1, StyleElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(styleClassEClass, StyleClass.class, "StyleClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStyleClass_Classifier(), theCommonPackage.getClassifier(), null, "classifier", null, 0, 1, StyleClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nickNamedEClass, NickNamed.class, "NickNamed", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNickNamed_Nickname(), ecorePackage.getEString(), "nickname", null, 0, 1, NickNamed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(flexFieldsEClass, FlexFields.class, "FlexFields", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFlexFields_Fields(), this.getFlexField(), null, "fields", null, 0, -1, FlexFields.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(flexFieldEClass, FlexField.class, "FlexField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(enabledUIItemEClass, EnabledUIItem.class, "EnabledUIItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnabledUIItem_Enabled(), this.getContext(), null, "enabled", null, 0, 1, EnabledUIItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uielementEClass, Uielement.class, "Uielement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUielement_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Uielement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUielement_Required(), this.getContext(), null, "required", null, 0, 1, Uielement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUielement_ReadOnly(), this.getContext(), null, "readOnly", null, 0, 1, Uielement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUielement_RefreshAreas(), this.getAreaRef(), null, "refreshAreas", null, 0, -1, Uielement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(itemIconEClass, ItemIcon.class, "ItemIcon", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getItemIcon_Icon(), this.getContext(), null, "icon", null, 0, 1, ItemIcon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(areaRefEClass, AreaRef.class, "AreaRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAreaRef_Area(), this.getNickNamed(), null, "area", null, 0, 1, AreaRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAreaRef_Group(), ecorePackage.getEInt(), "group", null, 0, 1, AreaRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formatableEClass, Formatable.class, "Formatable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFormatable_Format(), ecorePackage.getEString(), "format", null, 0, 1, Formatable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sourcesPointerEClass, SourcesPointer.class, "SourcesPointer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSourcesPointer_SourcePointer(), this.getDataControl(), null, "sourcePointer", null, 0, 1, SourcesPointer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSourcesPointer_ValuePointer(), ecorePackage.getEObject(), null, "valuePointer", null, 0, 1, SourcesPointer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSourcesPointer_SourceCast(), theTypePackage.getType(), null, "sourceCast", null, 0, 1, SourcesPointer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSourcesPointer_SourceCastDataControl(), this.getDataControl(), null, "sourceCastDataControl", null, 0, 1, SourcesPointer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputElementEClass, InputElement.class, "InputElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(selectionEClass, Selection.class, "Selection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSelection_DisplayOptionPointer(), ecorePackage.getEObject(), null, "displayOptionPointer", null, 0, 1, Selection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSelection_ValueOptionPointer(), ecorePackage.getEObject(), null, "valueOptionPointer", null, 0, 1, Selection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(optionSelectionEClass, OptionSelection.class, "OptionSelection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOptionSelection_OptionPointer(), this.getDataControl(), null, "optionPointer", null, 0, 1, OptionSelection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOptionSelection_OptionCast(), theTypePackage.getType(), null, "optionCast", null, 0, 1, OptionSelection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOptionSelection_OptionCastDataControl(), this.getDataControl(), null, "optionCastDataControl", null, 0, 1, OptionSelection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(layerHolderEClass, LayerHolder.class, "LayerHolder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(inputTextEClass, InputText.class, "InputText", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(passwordEClass, Password.class, "Password", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(labelEClass, Label.class, "Label", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLabel_Label(), ecorePackage.getEString(), "label", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(messageElementEClass, MessageElement.class, "MessageElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMessageElement_Label(), ecorePackage.getEString(), "label", null, 0, 1, MessageElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputTextEClass, OutputText.class, "OutputText", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(checkBoxEClass, CheckBox.class, "CheckBox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dropDownSelectionEClass, DropDownSelection.class, "DropDownSelection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDropDownSelection_Selection(), this.getSelection(), null, "selection", null, 0, 1, DropDownSelection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDropDownSelection_InitialOptionMessage(), this.getContext(), null, "initialOptionMessage", null, 0, 1, DropDownSelection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDropDownSelection_InitialOptionValue(), ecorePackage.getEString(), "initialOptionValue", null, 0, 1, DropDownSelection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(imageEClass, Image.class, "Image", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dateEClass, Date.class, "Date", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(buttonEClass, Button.class, "Button", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getButton_Label(), ecorePackage.getEString(), "label", null, 0, 1, Button.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(columnEClass, Column.class, "Column", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColumn_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumn_Label(), ecorePackage.getEString(), "label", null, 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getColumn_Element(), this.getUielement(), null, "element", null, 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableEClass, Table.class, "Table", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTable_Label(), ecorePackage.getEString(), "label", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_RowNumber(), ecorePackage.getEInt(), "rowNumber", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTable_Cols(), this.getColumn(), null, "cols", null, 0, -1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(menuEClass, Menu.class, "Menu", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(menuHolderEClass, MenuHolder.class, "MenuHolder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMenuHolder_Menu(), this.getMenuFolder(), null, "menu", null, 0, 1, MenuHolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(menuExtensionRefEClass, MenuExtensionRef.class, "MenuExtensionRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMenuExtensionRef_ExtensionRef(), this.getMenuFolder(), null, "extensionRef", null, 0, 1, MenuExtensionRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(menuElementEClass, MenuElement.class, "MenuElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMenuElement_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, MenuElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMenuElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, MenuElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(menuFolderEClass, MenuFolder.class, "MenuFolder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMenuFolder_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, MenuFolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMenuFolder_Name(), ecorePackage.getEString(), "name", null, 0, 1, MenuFolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMenuFolder_ExtensionPoint(), ecorePackage.getEBoolean(), "extensionPoint", null, 0, 1, MenuFolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMenuFolder_MenuElements(), this.getMenuElement(), null, "menuElements", null, 0, -1, MenuFolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(menuItemEClass, MenuItem.class, "MenuItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMenuItem_Transition(), this.getContext(), null, "transition", null, 0, 1, MenuItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMenuItem_RefreshAreas(), this.getAreaRef(), null, "refreshAreas", null, 0, -1, MenuItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(menuExtensionPointEClass, MenuExtensionPoint.class, "MenuExtensionPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(subMenuEClass, SubMenu.class, "SubMenu", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(toSubmenuEClass, ToSubmenu.class, "ToSubmenu", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getToSubmenu_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, ToSubmenu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getToSubmenu_Source(), this.getSubMenu(), null, "source", null, 0, 1, ToSubmenu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getToSubmenu_Target(), this.getMenuFolder(), null, "target", null, 0, 1, ToSubmenu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(menuSeparatorEClass, MenuSeparator.class, "MenuSeparator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(treeEClass, Tree.class, "Tree", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTree_Label(), ecorePackage.getEString(), "label", null, 0, 1, Tree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTree_Image(), this.getContext(), null, "image", null, 0, 1, Tree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTree_Cols(), this.getColumn(), null, "cols", null, 0, -1, Tree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controlsEClass, Controls.class, "Controls", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getControls_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Controls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControls_Root(), this.getRoot(), null, "root", null, 0, 1, Controls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControls_Controls(), this.getDataControl(), null, "controls", null, 0, -1, Controls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControls_Relations(), this.getRelation(), null, "relations", null, 0, -1, Controls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControls_Dependencies(), this.getDependency(), null, "dependencies", null, 0, -1, Controls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(triggerEClass, Trigger.class, "Trigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(preFormTriggerEClass, PREFormTrigger.class, "PREFormTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPREFormTrigger_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, PREFormTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(preQueryTriggerEClass, PREQueryTrigger.class, "PREQueryTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPREQueryTrigger_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, PREQueryTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(postQueryTriggerEClass, POSTQueryTrigger.class, "POSTQueryTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPOSTQueryTrigger_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, POSTQueryTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(preInsertTriggerEClass, PREInsertTrigger.class, "PREInsertTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPREInsertTrigger_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, PREInsertTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(preDeleteTriggerEClass, PREDeleteTrigger.class, "PREDeleteTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPREDeleteTrigger_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, PREDeleteTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(postCreateTriggerEClass, POSTCreateTrigger.class, "POSTCreateTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPOSTCreateTrigger_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, POSTCreateTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(preUpdateTriggerEClass, PREUpdateTrigger.class, "PREUpdateTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPREUpdateTrigger_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, PREUpdateTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(proxiesListEClass, ProxiesList.class, "ProxiesList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProxiesList_TypePointers(), theTypePackage.getTypePointer(), null, "typePointers", null, 0, -1, ProxiesList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(createTriggerEClass, CreateTrigger.class, "CreateTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCreateTrigger_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, CreateTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(insertTriggerEClass, InsertTrigger.class, "InsertTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInsertTrigger_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, InsertTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(updateTriggerEClass, UpdateTrigger.class, "UpdateTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUpdateTrigger_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, UpdateTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deleteTriggerEClass, DeleteTrigger.class, "DeleteTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeleteTrigger_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, DeleteTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(searchTriggerEClass, SearchTrigger.class, "SearchTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSearchTrigger_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, SearchTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rootEClass, Root.class, "Root", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoot_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoot_Name(), ecorePackage.getEString(), "name", null, 0, 1, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoot_PreFormTrigger(), this.getPREFormTrigger(), null, "preFormTrigger", null, 0, 1, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoot_Variables(), this.getFormVariable(), null, "variables", null, 0, -1, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formVariableEClass, FormVariable.class, "FormVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFormVariable_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, FormVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormVariable_Name(), ecorePackage.getEString(), "name", null, 0, 1, FormVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFormVariable_ParamRef(), this.getFormParameter(), null, "paramRef", null, 0, 1, FormVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataControlEClass, DataControl.class, "DataControl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataControl_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, DataControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataControl_Name(), ecorePackage.getEString(), "name", null, 0, 1, DataControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataControl_BaseType(), theTypePackage.getTypePointer(), null, "baseType", null, 0, 1, DataControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataControl_PreQueryTrigger(), this.getPREQueryTrigger(), null, "preQueryTrigger", null, 0, 1, DataControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataControl_PostQueryTrigger(), this.getPOSTQueryTrigger(), null, "postQueryTrigger", null, 0, 1, DataControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataControl_PreInsertTrigger(), this.getPREInsertTrigger(), null, "preInsertTrigger", null, 0, 1, DataControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataControl_PreDeleteTrigger(), this.getPREDeleteTrigger(), null, "preDeleteTrigger", null, 0, 1, DataControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataControl_PostCreateTrigger(), this.getPOSTCreateTrigger(), null, "postCreateTrigger", null, 0, 1, DataControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataControl_PreUpdateTrigger(), this.getPREUpdateTrigger(), null, "preUpdateTrigger", null, 0, 1, DataControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataControl_Create(), this.getCreateTrigger(), null, "create", null, 0, 1, DataControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataControl_Insert(), this.getInsertTrigger(), null, "insert", null, 0, 1, DataControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataControl_Update(), this.getUpdateTrigger(), null, "update", null, 0, 1, DataControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataControl_Remove(), this.getDeleteTrigger(), null, "remove", null, 0, 1, DataControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataControl_Search(), this.getSearchTrigger(), null, "search", null, 0, 1, DataControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataControl_ArtificialFields(), this.getArtificialField(), null, "artificialFields", null, 0, -1, DataControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataControl_DefaultSearch(), this.getContextParameters(), null, "defaultSearch", null, 0, 1, DataControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataControl_DefaultOrderBy(), this.getOrders(), null, "defaultOrderBy", null, 0, 1, DataControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ordersEClass, Orders.class, "Orders", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrders_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Orders.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrders_OrderRules(), this.getOrderBy(), null, "orderRules", null, 0, -1, Orders.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderByEClass, OrderBy.class, "OrderBy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderBy_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, OrderBy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderBy_RefObj(), ecorePackage.getEObject(), null, "refObj", null, 0, 1, OrderBy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderBy_Order(), this.getOrder(), "order", null, 0, 1, OrderBy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationEClass, Relation.class, "Relation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelation_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelation_Name(), ecorePackage.getEString(), "name", null, 0, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelation_Master(), this.getDataControl(), null, "master", null, 0, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelation_Detail(), this.getDataControl(), null, "detail", null, 0, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelation_IsTree(), ecorePackage.getEBoolean(), "isTree", null, 0, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelation_Links(), this.getLink(), null, "links", null, 0, -1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dependencyEClass, Dependency.class, "Dependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDependency_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Dependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDependency_Name(), ecorePackage.getEString(), "name", null, 0, 1, Dependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDependency_Master(), this.getDataControl(), null, "master", null, 0, 1, Dependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDependency_Detail(), this.getDataControl(), null, "detail", null, 0, 1, Dependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(artificialFieldEClass, ArtificialField.class, "ArtificialField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArtificialField_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, ArtificialField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArtificialField_Name(), ecorePackage.getEString(), "name", null, 0, 1, ArtificialField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkEClass, Link.class, "Link", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLink_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLink_MasterField(), theTypePackage.getAttribute(), null, "masterField", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLink_DetailField(), theTypePackage.getAttribute(), null, "detailField", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(comparatorEEnum, Comparator.class, "Comparator");
		addEEnumLiteral(comparatorEEnum, Comparator.EQ);
		addEEnumLiteral(comparatorEEnum, Comparator.NEQ);
		addEEnumLiteral(comparatorEEnum, Comparator.GT);
		addEEnumLiteral(comparatorEEnum, Comparator.GEQ);
		addEEnumLiteral(comparatorEEnum, Comparator.LT);
		addEEnumLiteral(comparatorEEnum, Comparator.LEQ);

		initEEnum(orderEEnum, Order.class, "Order");
		addEEnumLiteral(orderEEnum, Order.ASC);
		addEEnumLiteral(orderEEnum, Order.DESC);

		initEEnum(orientationEEnum, Orientation.class, "Orientation");
		addEEnumLiteral(orientationEEnum, Orientation.TOP);
		addEEnumLiteral(orientationEEnum, Orientation.BOTTOM);
		addEEnumLiteral(orientationEEnum, Orientation.LEFT);
		addEEnumLiteral(orientationEEnum, Orientation.RIGHT);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf.compartment
		createGmfAnnotations();
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations() {
		String source = "gmf.compartment";	
		addAnnotation
		  (getViewPortHolder_ViewElement(), 
		   source, 
		   new String[] {
		   });
	}

} //FormPackageImpl
