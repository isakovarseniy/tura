/*******************************************************************************
 * Tura - application generation platform
 *
 * Copyright (c) 2012, 2015, Arseniy Isakov
 *  
 * This project includes software developed by Arseniy Isakov
 * http://sourceforge.net/p/tura/wiki/Home/
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
/**
 */
package domain.impl;

import domain.ActioinTriggers;
import domain.ActionTrigger;
import domain.Application;
import domain.ApplicationInfrastructureLayer;
import domain.ApplicationMapper;
import domain.ApplicationMappers;
import domain.ApplicationMessages;
import domain.ApplicationRecipe;
import domain.ApplicationRecipes;
import domain.ApplicationRole;
import domain.ApplicationStyle;
import domain.ApplicationUILayer;
import domain.ApplicationUIPackage;
import domain.Artifact;
import domain.ArtifactRef;
import domain.Artifacts;
import domain.ArtificialField;
import domain.Attribute;
import domain.Button;
import domain.CSSMapper;
import domain.Canvas;
import domain.CanvasFrame;
import domain.CanvasView;
import domain.Categorized;
import domain.CheckBox;
import domain.ChildrenHolder;
import domain.Classifier;
import domain.Column;
import domain.Comparator;
import domain.Component;
import domain.ConfigExtension;
import domain.ConfigVariable;
import domain.Configuration;
import domain.Context;
import domain.ContextParameter;
import domain.ContextParameters;
import domain.ContextValue;
import domain.ContinuousIintegration;
import domain.Controls;
import domain.CreateTrigger;
import domain.DataControl;
import domain.Datacenter;
import domain.Date;
import domain.DefaultCavas;
import domain.DeleteTrigger;
import domain.Dependency;
import domain.DeploymentComponent;
import domain.DeploymentComponents;
import domain.DeploymentSequence;
import domain.DeploymentStarStep;
import domain.Domain;
import domain.DomainApplication;
import domain.DomainApplications;
import domain.DomainArtifact;
import domain.DomainArtifacts;
import domain.DomainFactory;
import domain.DomainPackage;
import domain.DomainTypes;
import domain.DropDownSelection;
import domain.EJBService;
import domain.EnterpriseInfrastructure;
import domain.EnumAttribute;
import domain.Enumarator;
import domain.ExpressionPart;
import domain.Form;
import domain.FormDataControls;
import domain.FormParameter;
import domain.FormVariable;
import domain.FormView;
import domain.Formatable;
import domain.GenerationHint;
import domain.GrantAccess;
import domain.Group;
import domain.HTMLLayerHolder;
import domain.Hub;
import domain.Image;
import domain.Infrastructure;
import domain.InfrastructureComponent;
import domain.InfrastructureConnection;
import domain.InfrastructureLayer;
import domain.Ingredient;
import domain.InputElement;
import domain.InputText;
import domain.InsertTrigger;
import domain.JPAService;
import domain.JavaComponent;
import domain.JavaMapper;
import domain.JavaScriptMapper;
import domain.Label;
import domain.Language;
import domain.LanguageRef;
import domain.LayerHolder;
import domain.Link;
import domain.Mapper;
import domain.Mappers;
import domain.MappingSpecifier;
import domain.Message;
import domain.MessageElement;
import domain.MessageLibrary;
import domain.Messages;
import domain.MethodPointer;
import domain.ModelMapper;
import domain.ModelQuery;
import domain.MultiLangLabel;
import domain.NickNamed;
import domain.ORMEntity;
import domain.Operation;
import domain.Option;
import domain.OptionSelection;
import domain.Order;
import domain.OrderBy;
import domain.Orderable;
import domain.Orders;
import domain.Orientation;
import domain.OutputText;
import domain.POSTCreateTrigger;
import domain.POSTQueryTrigger;
import domain.PREDeleteTrigger;
import domain.PREFormTrigger;
import domain.PREInsertTrigger;
import domain.PREQueryTrigger;
import domain.PREUpdateTrigger;
import domain.Parameter;
import domain.Password;
import domain.PlatformLayers;
import domain.PopupCanvas;
import domain.Primitive;
import domain.Property;
import domain.Query;
import domain.QueryParameter;
import domain.QueryVariable;
import domain.Recipe;
import domain.Recipes;
import domain.Relation;
import domain.ReturnValue;
import domain.Role;
import domain.RoleMapper;
import domain.Roles;
import domain.Root;
import domain.Router;
import domain.SearchTrigger;
import domain.Secured;
import domain.Selection;
import domain.Server;
import domain.ServerClaster;
import domain.SourcesPointer;
import domain.Specifier;
import domain.Storage;
import domain.StyleClass;
import domain.StyleElement;
import domain.StyleLibrary;
import domain.StyleSet;
import domain.Styles;
import domain.StylesPackage;
import domain.Subsystem;
import domain.TabCanvas;
import domain.TabPage;
import domain.TabPagesInheritance;
import domain.Table;
import domain.Translation;
import domain.Tree;
import domain.Trigger;
import domain.Type;
import domain.TypeDefinition;
import domain.TypeElement;
import domain.TypeExtension;
import domain.TypeMapper;
import domain.TypePointer;
import domain.TypeReference;
import domain.Types;
import domain.TypesRepository;
import domain.UIPackage;
import domain.Uielement;
import domain.UpdateTrigger;
import domain.UsingMappers;
import domain.ViewArea;
import domain.ViewElement;
import domain.ViewInheritance;
import domain.ViewPort;
import domain.ViewPortHolder;
import domain.ViewPortTrigger;
import domain.Views;
import domain.Window;

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
public class DomainFactoryImpl extends EFactoryImpl implements DomainFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DomainFactory init() {
		try {
			DomainFactory theDomainFactory = (DomainFactory)EPackage.Registry.INSTANCE.getEFactory(DomainPackage.eNS_URI);
			if (theDomainFactory != null) {
				return theDomainFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DomainFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainFactoryImpl() {
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
			case DomainPackage.DOMAIN: return createDomain();
			case DomainPackage.HTML_LAYER_HOLDER: return createHTMLLayerHolder();
			case DomainPackage.CATEGORIZED: return createCategorized();
			case DomainPackage.CLASSIFIER: return createClassifier();
			case DomainPackage.SECURED: return createSecured();
			case DomainPackage.GRANT_ACCESS: return createGrantAccess();
			case DomainPackage.DOMAIN_ARTIFACTS: return createDomainArtifacts();
			case DomainPackage.DOMAIN_TYPES: return createDomainTypes();
			case DomainPackage.DOMAIN_APPLICATIONS: return createDomainApplications();
			case DomainPackage.DOMAIN_APPLICATION: return createDomainApplication();
			case DomainPackage.DOMAIN_ARTIFACT: return createDomainArtifact();
			case DomainPackage.ORM_ENTITY: return createORMEntity();
			case DomainPackage.JPA_SERVICE: return createJPAService();
			case DomainPackage.EJB_SERVICE: return createEJBService();
			case DomainPackage.CONTINUOUS_IINTEGRATION: return createContinuousIintegration();
			case DomainPackage.ARTIFACTS: return createArtifacts();
			case DomainPackage.ARTIFACT: return createArtifact();
			case DomainPackage.GENERATION_HINT: return createGenerationHint();
			case DomainPackage.CONFIG_VARIABLE: return createConfigVariable();
			case DomainPackage.MODEL_QUERY: return createModelQuery();
			case DomainPackage.QUERY_PARAMETER: return createQueryParameter();
			case DomainPackage.SPECIFIER: return createSpecifier();
			case DomainPackage.OPTION: return createOption();
			case DomainPackage.APPLICATION: return createApplication();
			case DomainPackage.APPLICATION_MESSAGES: return createApplicationMessages();
			case DomainPackage.APPLICATION_ROLE: return createApplicationRole();
			case DomainPackage.APPLICATION_STYLE: return createApplicationStyle();
			case DomainPackage.STYLES_PACKAGE: return createStylesPackage();
			case DomainPackage.APPLICATION_UI_LAYER: return createApplicationUILayer();
			case DomainPackage.APPLICATION_UI_PACKAGE: return createApplicationUIPackage();
			case DomainPackage.APPLICATION_RECIPES: return createApplicationRecipes();
			case DomainPackage.APPLICATION_RECIPE: return createApplicationRecipe();
			case DomainPackage.APPLICATION_MAPPERS: return createApplicationMappers();
			case DomainPackage.APPLICATION_MAPPER: return createApplicationMapper();
			case DomainPackage.METHOD_POINTER: return createMethodPointer();
			case DomainPackage.MESSAGES: return createMessages();
			case DomainPackage.MESSAGE_LIBRARY: return createMessageLibrary();
			case DomainPackage.LANGUAGE_REF: return createLanguageRef();
			case DomainPackage.MESSAGE: return createMessage();
			case DomainPackage.TRANSLATION: return createTranslation();
			case DomainPackage.LANGUAGE: return createLanguage();
			case DomainPackage.ROLES: return createRoles();
			case DomainPackage.ROLE: return createRole();
			case DomainPackage.GROUP: return createGroup();
			case DomainPackage.STYLES: return createStyles();
			case DomainPackage.STYLE_LIBRARY: return createStyleLibrary();
			case DomainPackage.STYLE_SET: return createStyleSet();
			case DomainPackage.MAPPERS: return createMappers();
			case DomainPackage.MAPPER: return createMapper();
			case DomainPackage.TYPE_MAPPER: return createTypeMapper();
			case DomainPackage.JAVA_MAPPER: return createJavaMapper();
			case DomainPackage.JAVA_SCRIPT_MAPPER: return createJavaScriptMapper();
			case DomainPackage.CSS_MAPPER: return createCSSMapper();
			case DomainPackage.ROLE_MAPPER: return createRoleMapper();
			case DomainPackage.RECIPES: return createRecipes();
			case DomainPackage.DEPLOYMENT_SEQUENCE: return createDeploymentSequence();
			case DomainPackage.DEPLOYMENT_COMPONENTS: return createDeploymentComponents();
			case DomainPackage.DEPLOYMENT_COMPONENT: return createDeploymentComponent();
			case DomainPackage.DEPLOYMENT_STAR_STEP: return createDeploymentStarStep();
			case DomainPackage.USING_MAPPERS: return createUsingMappers();
			case DomainPackage.RECIPE: return createRecipe();
			case DomainPackage.CONFIG_EXTENSION: return createConfigExtension();
			case DomainPackage.INGREDIENT: return createIngredient();
			case DomainPackage.COMPONENT: return createComponent();
			case DomainPackage.JAVA_COMPONENT: return createJavaComponent();
			case DomainPackage.INFRASTRUCTURE: return createInfrastructure();
			case DomainPackage.CONFIGURATION: return createConfiguration();
			case DomainPackage.MODEL_MAPPER: return createModelMapper();
			case DomainPackage.PROPERTY: return createProperty();
			case DomainPackage.MAPPING_SPECIFIER: return createMappingSpecifier();
			case DomainPackage.QUERY: return createQuery();
			case DomainPackage.QUERY_VARIABLE: return createQueryVariable();
			case DomainPackage.ARTIFACT_REF: return createArtifactRef();
			case DomainPackage.TYPE_POINTER: return createTypePointer();
			case DomainPackage.TYPE_DEFINITION: return createTypeDefinition();
			case DomainPackage.TYPE_ELEMENT: return createTypeElement();
			case DomainPackage.PRIMITIVE: return createPrimitive();
			case DomainPackage.TYPE: return createType();
			case DomainPackage.TYPE_REFERENCE: return createTypeReference();
			case DomainPackage.TYPE_EXTENSION: return createTypeExtension();
			case DomainPackage.ATTRIBUTE: return createAttribute();
			case DomainPackage.OPERATION: return createOperation();
			case DomainPackage.PARAMETER: return createParameter();
			case DomainPackage.RETURN_VALUE: return createReturnValue();
			case DomainPackage.ENUMARATOR: return createEnumarator();
			case DomainPackage.ENUM_ATTRIBUTE: return createEnumAttribute();
			case DomainPackage.TYPES_REPOSITORY: return createTypesRepository();
			case DomainPackage.TYPES: return createTypes();
			case DomainPackage.PACKAGE: return createPackage();
			case DomainPackage.UI_PACKAGE: return createUIPackage();
			case DomainPackage.FORM: return createForm();
			case DomainPackage.FORM_PARAMETER: return createFormParameter();
			case DomainPackage.FORM_VIEW: return createFormView();
			case DomainPackage.VIEWS: return createViews();
			case DomainPackage.ORDERABLE: return createOrderable();
			case DomainPackage.MULTI_LANG_LABEL: return createMultiLangLabel();
			case DomainPackage.CANVAS_FRAME: return createCanvasFrame();
			case DomainPackage.VIEW_PORT_HOLDER: return createViewPortHolder();
			case DomainPackage.DEFAULT_CAVAS: return createDefaultCavas();
			case DomainPackage.VIEW_ELEMENT: return createViewElement();
			case DomainPackage.POPUP_CANVAS: return createPopupCanvas();
			case DomainPackage.CANVAS: return createCanvas();
			case DomainPackage.WINDOW: return createWindow();
			case DomainPackage.TAB_CANVAS: return createTabCanvas();
			case DomainPackage.TAB_PAGE: return createTabPage();
			case DomainPackage.VIEW_PORT: return createViewPort();
			case DomainPackage.VIEW_AREA: return createViewArea();
			case DomainPackage.VIEW_PORT_TRIGGER: return createViewPortTrigger();
			case DomainPackage.VIEW_INHERITANCE: return createViewInheritance();
			case DomainPackage.TAB_PAGES_INHERITANCE: return createTabPagesInheritance();
			case DomainPackage.FORM_DATA_CONTROLS: return createFormDataControls();
			case DomainPackage.CANVAS_VIEW: return createCanvasView();
			case DomainPackage.CHILDREN_HOLDER: return createChildrenHolder();
			case DomainPackage.CONTEXT_PARAMETER: return createContextParameter();
			case DomainPackage.CONTEXT_VALUE: return createContextValue();
			case DomainPackage.EXPRESSION_PART: return createExpressionPart();
			case DomainPackage.CONTEXT_PARAMETERS: return createContextParameters();
			case DomainPackage.CONTEXT: return createContext();
			case DomainPackage.STYLE_ELEMENT: return createStyleElement();
			case DomainPackage.STYLE_CLASS: return createStyleClass();
			case DomainPackage.NICK_NAMED: return createNickNamed();
			case DomainPackage.ACTIOIN_TRIGGERS: return createActioinTriggers();
			case DomainPackage.ACTION_TRIGGER: return createActionTrigger();
			case DomainPackage.UIELEMENT: return createUielement();
			case DomainPackage.FORMATABLE: return createFormatable();
			case DomainPackage.SOURCES_POINTER: return createSourcesPointer();
			case DomainPackage.INPUT_ELEMENT: return createInputElement();
			case DomainPackage.SELECTION: return createSelection();
			case DomainPackage.OPTION_SELECTION: return createOptionSelection();
			case DomainPackage.LAYER_HOLDER: return createLayerHolder();
			case DomainPackage.INPUT_TEXT: return createInputText();
			case DomainPackage.PASSWORD: return createPassword();
			case DomainPackage.LABEL: return createLabel();
			case DomainPackage.MESSAGE_ELEMENT: return createMessageElement();
			case DomainPackage.OUTPUT_TEXT: return createOutputText();
			case DomainPackage.CHECK_BOX: return createCheckBox();
			case DomainPackage.DROP_DOWN_SELECTION: return createDropDownSelection();
			case DomainPackage.IMAGE: return createImage();
			case DomainPackage.DATE: return createDate();
			case DomainPackage.BUTTON: return createButton();
			case DomainPackage.COLUMN: return createColumn();
			case DomainPackage.TABLE: return createTable();
			case DomainPackage.TREE: return createTree();
			case DomainPackage.CONTROLS: return createControls();
			case DomainPackage.TRIGGER: return createTrigger();
			case DomainPackage.PRE_FORM_TRIGGER: return createPREFormTrigger();
			case DomainPackage.PRE_QUERY_TRIGGER: return createPREQueryTrigger();
			case DomainPackage.POST_QUERY_TRIGGER: return createPOSTQueryTrigger();
			case DomainPackage.PRE_INSERT_TRIGGER: return createPREInsertTrigger();
			case DomainPackage.PRE_DELETE_TRIGGER: return createPREDeleteTrigger();
			case DomainPackage.POST_CREATE_TRIGGER: return createPOSTCreateTrigger();
			case DomainPackage.PRE_UPDATE_TRIGGER: return createPREUpdateTrigger();
			case DomainPackage.CREATE_TRIGGER: return createCreateTrigger();
			case DomainPackage.INSERT_TRIGGER: return createInsertTrigger();
			case DomainPackage.UPDATE_TRIGGER: return createUpdateTrigger();
			case DomainPackage.DELETE_TRIGGER: return createDeleteTrigger();
			case DomainPackage.SEARCH_TRIGGER: return createSearchTrigger();
			case DomainPackage.ROOT: return createRoot();
			case DomainPackage.FORM_VARIABLE: return createFormVariable();
			case DomainPackage.DATA_CONTROL: return createDataControl();
			case DomainPackage.ORDERS: return createOrders();
			case DomainPackage.ORDER_BY: return createOrderBy();
			case DomainPackage.RELATION: return createRelation();
			case DomainPackage.DEPENDENCY: return createDependency();
			case DomainPackage.ARTIFICIAL_FIELD: return createArtificialField();
			case DomainPackage.LINK: return createLink();
			case DomainPackage.APPLICATION_INFRASTRUCTURE_LAYER: return createApplicationInfrastructureLayer();
			case DomainPackage.ENTERPRISE_INFRASTRUCTURE: return createEnterpriseInfrastructure();
			case DomainPackage.DATACENTER: return createDatacenter();
			case DomainPackage.SUBSYSTEM: return createSubsystem();
			case DomainPackage.INFRASTRUCTURE_LAYER: return createInfrastructureLayer();
			case DomainPackage.INFRASTRUCTURE_CONNECTION: return createInfrastructureConnection();
			case DomainPackage.INFRASTRUCTURE_COMPONENT: return createInfrastructureComponent();
			case DomainPackage.SERVER: return createServer();
			case DomainPackage.ROUTER: return createRouter();
			case DomainPackage.HUB: return createHub();
			case DomainPackage.STORAGE: return createStorage();
			case DomainPackage.SERVER_CLASTER: return createServerClaster();
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
			case DomainPackage.PLATFORM_LAYERS:
				return createPlatformLayersFromString(eDataType, initialValue);
			case DomainPackage.COMPARATOR:
				return createComparatorFromString(eDataType, initialValue);
			case DomainPackage.ORDER:
				return createOrderFromString(eDataType, initialValue);
			case DomainPackage.ORIENTATION:
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
			case DomainPackage.PLATFORM_LAYERS:
				return convertPlatformLayersToString(eDataType, instanceValue);
			case DomainPackage.COMPARATOR:
				return convertComparatorToString(eDataType, instanceValue);
			case DomainPackage.ORDER:
				return convertOrderToString(eDataType, instanceValue);
			case DomainPackage.ORIENTATION:
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
	public Domain createDomain() {
		DomainImpl domain = new DomainImpl();
		return domain;
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
	public Categorized createCategorized() {
		CategorizedImpl categorized = new CategorizedImpl();
		return categorized;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier createClassifier() {
		ClassifierImpl classifier = new ClassifierImpl();
		return classifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Secured createSecured() {
		SecuredImpl secured = new SecuredImpl();
		return secured;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GrantAccess createGrantAccess() {
		GrantAccessImpl grantAccess = new GrantAccessImpl();
		return grantAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainArtifacts createDomainArtifacts() {
		DomainArtifactsImpl domainArtifacts = new DomainArtifactsImpl();
		return domainArtifacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainTypes createDomainTypes() {
		DomainTypesImpl domainTypes = new DomainTypesImpl();
		return domainTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainApplications createDomainApplications() {
		DomainApplicationsImpl domainApplications = new DomainApplicationsImpl();
		return domainApplications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainApplication createDomainApplication() {
		DomainApplicationImpl domainApplication = new DomainApplicationImpl();
		return domainApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainArtifact createDomainArtifact() {
		DomainArtifactImpl domainArtifact = new DomainArtifactImpl();
		return domainArtifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ORMEntity createORMEntity() {
		ORMEntityImpl ormEntity = new ORMEntityImpl();
		return ormEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JPAService createJPAService() {
		JPAServiceImpl jpaService = new JPAServiceImpl();
		return jpaService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EJBService createEJBService() {
		EJBServiceImpl ejbService = new EJBServiceImpl();
		return ejbService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContinuousIintegration createContinuousIintegration() {
		ContinuousIintegrationImpl continuousIintegration = new ContinuousIintegrationImpl();
		return continuousIintegration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Artifacts createArtifacts() {
		ArtifactsImpl artifacts = new ArtifactsImpl();
		return artifacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Artifact createArtifact() {
		ArtifactImpl artifact = new ArtifactImpl();
		return artifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenerationHint createGenerationHint() {
		GenerationHintImpl generationHint = new GenerationHintImpl();
		return generationHint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigVariable createConfigVariable() {
		ConfigVariableImpl configVariable = new ConfigVariableImpl();
		return configVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelQuery createModelQuery() {
		ModelQueryImpl modelQuery = new ModelQueryImpl();
		return modelQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryParameter createQueryParameter() {
		QueryParameterImpl queryParameter = new QueryParameterImpl();
		return queryParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specifier createSpecifier() {
		SpecifierImpl specifier = new SpecifierImpl();
		return specifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Option createOption() {
		OptionImpl option = new OptionImpl();
		return option;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Application createApplication() {
		ApplicationImpl application = new ApplicationImpl();
		return application;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationMessages createApplicationMessages() {
		ApplicationMessagesImpl applicationMessages = new ApplicationMessagesImpl();
		return applicationMessages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationRole createApplicationRole() {
		ApplicationRoleImpl applicationRole = new ApplicationRoleImpl();
		return applicationRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationStyle createApplicationStyle() {
		ApplicationStyleImpl applicationStyle = new ApplicationStyleImpl();
		return applicationStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StylesPackage createStylesPackage() {
		StylesPackageImpl stylesPackage = new StylesPackageImpl();
		return stylesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationUILayer createApplicationUILayer() {
		ApplicationUILayerImpl applicationUILayer = new ApplicationUILayerImpl();
		return applicationUILayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationUIPackage createApplicationUIPackage() {
		ApplicationUIPackageImpl applicationUIPackage = new ApplicationUIPackageImpl();
		return applicationUIPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationRecipes createApplicationRecipes() {
		ApplicationRecipesImpl applicationRecipes = new ApplicationRecipesImpl();
		return applicationRecipes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationRecipe createApplicationRecipe() {
		ApplicationRecipeImpl applicationRecipe = new ApplicationRecipeImpl();
		return applicationRecipe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationMappers createApplicationMappers() {
		ApplicationMappersImpl applicationMappers = new ApplicationMappersImpl();
		return applicationMappers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationMapper createApplicationMapper() {
		ApplicationMapperImpl applicationMapper = new ApplicationMapperImpl();
		return applicationMapper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodPointer createMethodPointer() {
		MethodPointerImpl methodPointer = new MethodPointerImpl();
		return methodPointer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Messages createMessages() {
		MessagesImpl messages = new MessagesImpl();
		return messages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageLibrary createMessageLibrary() {
		MessageLibraryImpl messageLibrary = new MessageLibraryImpl();
		return messageLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanguageRef createLanguageRef() {
		LanguageRefImpl languageRef = new LanguageRefImpl();
		return languageRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message createMessage() {
		MessageImpl message = new MessageImpl();
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Translation createTranslation() {
		TranslationImpl translation = new TranslationImpl();
		return translation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Language createLanguage() {
		LanguageImpl language = new LanguageImpl();
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Roles createRoles() {
		RolesImpl roles = new RolesImpl();
		return roles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role createRole() {
		RoleImpl role = new RoleImpl();
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group createGroup() {
		GroupImpl group = new GroupImpl();
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Styles createStyles() {
		StylesImpl styles = new StylesImpl();
		return styles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleLibrary createStyleLibrary() {
		StyleLibraryImpl styleLibrary = new StyleLibraryImpl();
		return styleLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleSet createStyleSet() {
		StyleSetImpl styleSet = new StyleSetImpl();
		return styleSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mappers createMappers() {
		MappersImpl mappers = new MappersImpl();
		return mappers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mapper createMapper() {
		MapperImpl mapper = new MapperImpl();
		return mapper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeMapper createTypeMapper() {
		TypeMapperImpl typeMapper = new TypeMapperImpl();
		return typeMapper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaMapper createJavaMapper() {
		JavaMapperImpl javaMapper = new JavaMapperImpl();
		return javaMapper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaScriptMapper createJavaScriptMapper() {
		JavaScriptMapperImpl javaScriptMapper = new JavaScriptMapperImpl();
		return javaScriptMapper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSSMapper createCSSMapper() {
		CSSMapperImpl cssMapper = new CSSMapperImpl();
		return cssMapper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleMapper createRoleMapper() {
		RoleMapperImpl roleMapper = new RoleMapperImpl();
		return roleMapper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Recipes createRecipes() {
		RecipesImpl recipes = new RecipesImpl();
		return recipes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentSequence createDeploymentSequence() {
		DeploymentSequenceImpl deploymentSequence = new DeploymentSequenceImpl();
		return deploymentSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentComponents createDeploymentComponents() {
		DeploymentComponentsImpl deploymentComponents = new DeploymentComponentsImpl();
		return deploymentComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentComponent createDeploymentComponent() {
		DeploymentComponentImpl deploymentComponent = new DeploymentComponentImpl();
		return deploymentComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentStarStep createDeploymentStarStep() {
		DeploymentStarStepImpl deploymentStarStep = new DeploymentStarStepImpl();
		return deploymentStarStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsingMappers createUsingMappers() {
		UsingMappersImpl usingMappers = new UsingMappersImpl();
		return usingMappers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Recipe createRecipe() {
		RecipeImpl recipe = new RecipeImpl();
		return recipe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigExtension createConfigExtension() {
		ConfigExtensionImpl configExtension = new ConfigExtensionImpl();
		return configExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ingredient createIngredient() {
		IngredientImpl ingredient = new IngredientImpl();
		return ingredient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component createComponent() {
		ComponentImpl component = new ComponentImpl();
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaComponent createJavaComponent() {
		JavaComponentImpl javaComponent = new JavaComponentImpl();
		return javaComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Infrastructure createInfrastructure() {
		InfrastructureImpl infrastructure = new InfrastructureImpl();
		return infrastructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration createConfiguration() {
		ConfigurationImpl configuration = new ConfigurationImpl();
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelMapper createModelMapper() {
		ModelMapperImpl modelMapper = new ModelMapperImpl();
		return modelMapper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingSpecifier createMappingSpecifier() {
		MappingSpecifierImpl mappingSpecifier = new MappingSpecifierImpl();
		return mappingSpecifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Query createQuery() {
		QueryImpl query = new QueryImpl();
		return query;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryVariable createQueryVariable() {
		QueryVariableImpl queryVariable = new QueryVariableImpl();
		return queryVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactRef createArtifactRef() {
		ArtifactRefImpl artifactRef = new ArtifactRefImpl();
		return artifactRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypePointer createTypePointer() {
		TypePointerImpl typePointer = new TypePointerImpl();
		return typePointer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDefinition createTypeDefinition() {
		TypeDefinitionImpl typeDefinition = new TypeDefinitionImpl();
		return typeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeElement createTypeElement() {
		TypeElementImpl typeElement = new TypeElementImpl();
		return typeElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Primitive createPrimitive() {
		PrimitiveImpl primitive = new PrimitiveImpl();
		return primitive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type createType() {
		TypeImpl type = new TypeImpl();
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeReference createTypeReference() {
		TypeReferenceImpl typeReference = new TypeReferenceImpl();
		return typeReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeExtension createTypeExtension() {
		TypeExtensionImpl typeExtension = new TypeExtensionImpl();
		return typeExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOperation() {
		OperationImpl operation = new OperationImpl();
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnValue createReturnValue() {
		ReturnValueImpl returnValue = new ReturnValueImpl();
		return returnValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumarator createEnumarator() {
		EnumaratorImpl enumarator = new EnumaratorImpl();
		return enumarator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumAttribute createEnumAttribute() {
		EnumAttributeImpl enumAttribute = new EnumAttributeImpl();
		return enumAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypesRepository createTypesRepository() {
		TypesRepositoryImpl typesRepository = new TypesRepositoryImpl();
		return typesRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Types createTypes() {
		TypesImpl types = new TypesImpl();
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public domain.Package createPackage() {
		PackageImpl package_ = new PackageImpl();
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIPackage createUIPackage() {
		UIPackageImpl uiPackage = new UIPackageImpl();
		return uiPackage;
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
	public FormView createFormView() {
		FormViewImpl formView = new FormViewImpl();
		return formView;
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
	public FormDataControls createFormDataControls() {
		FormDataControlsImpl formDataControls = new FormDataControlsImpl();
		return formDataControls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CanvasView createCanvasView() {
		CanvasViewImpl canvasView = new CanvasViewImpl();
		return canvasView;
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
	public ActioinTriggers createActioinTriggers() {
		ActioinTriggersImpl actioinTriggers = new ActioinTriggersImpl();
		return actioinTriggers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionTrigger createActionTrigger() {
		ActionTriggerImpl actionTrigger = new ActionTriggerImpl();
		return actionTrigger;
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
	public ApplicationInfrastructureLayer createApplicationInfrastructureLayer() {
		ApplicationInfrastructureLayerImpl applicationInfrastructureLayer = new ApplicationInfrastructureLayerImpl();
		return applicationInfrastructureLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnterpriseInfrastructure createEnterpriseInfrastructure() {
		EnterpriseInfrastructureImpl enterpriseInfrastructure = new EnterpriseInfrastructureImpl();
		return enterpriseInfrastructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Datacenter createDatacenter() {
		DatacenterImpl datacenter = new DatacenterImpl();
		return datacenter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subsystem createSubsystem() {
		SubsystemImpl subsystem = new SubsystemImpl();
		return subsystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfrastructureLayer createInfrastructureLayer() {
		InfrastructureLayerImpl infrastructureLayer = new InfrastructureLayerImpl();
		return infrastructureLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfrastructureConnection createInfrastructureConnection() {
		InfrastructureConnectionImpl infrastructureConnection = new InfrastructureConnectionImpl();
		return infrastructureConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfrastructureComponent createInfrastructureComponent() {
		InfrastructureComponentImpl infrastructureComponent = new InfrastructureComponentImpl();
		return infrastructureComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Server createServer() {
		ServerImpl server = new ServerImpl();
		return server;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Router createRouter() {
		RouterImpl router = new RouterImpl();
		return router;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hub createHub() {
		HubImpl hub = new HubImpl();
		return hub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Storage createStorage() {
		StorageImpl storage = new StorageImpl();
		return storage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerClaster createServerClaster() {
		ServerClasterImpl serverClaster = new ServerClasterImpl();
		return serverClaster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatformLayers createPlatformLayersFromString(EDataType eDataType, String initialValue) {
		PlatformLayers result = PlatformLayers.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPlatformLayersToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
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
	public DomainPackage getDomainPackage() {
		return (DomainPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DomainPackage getPackage() {
		return DomainPackage.eINSTANCE;
	}

} //DomainFactoryImpl
