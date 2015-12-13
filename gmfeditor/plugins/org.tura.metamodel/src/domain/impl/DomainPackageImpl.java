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
import domain.AreaRef;
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
import domain.LinkToLabel;
import domain.LinkToMessage;
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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DomainPackageImpl extends EPackageImpl implements DomainPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainEClass = null;

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
	private EClass categorizedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass grantAccessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainArtifactsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainTypesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainApplicationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainApplicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainArtifactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ormEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jpaServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ejbServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass continuousIintegrationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass artifactsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass artifactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generationHintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelQueryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationMessagesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stylesPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationUILayerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationUIPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationRecipesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationRecipeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationMappersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationMapperEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodPointerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messagesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageLibraryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass languageRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass translationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass languageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rolesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stylesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass styleLibraryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass styleSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mapperEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeMapperEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaMapperEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaScriptMapperEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cssMapperEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleMapperEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recipesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deploymentSequenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deploymentComponentsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deploymentComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deploymentStarStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usingMappersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recipeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configExtensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ingredientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass infrastructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelMapperEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappingSpecifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass artifactRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typePointerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeExtensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumaratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typesRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiPackageEClass = null;

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
	private EClass formViewEClass = null;

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
	private EClass formDataControlsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass canvasViewEClass = null;

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
	private EClass actioinTriggersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionTriggerEClass = null;

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
	private EClass applicationInfrastructureLayerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enterpriseInfrastructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datacenterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subsystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass infrastructureLayerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass infrastructureConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass infrastructureComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serverEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass routerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hubEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serverClasterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum platformLayersEEnum = null;

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
	 * @see domain.DomainPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DomainPackageImpl() {
		super(eNS_URI, DomainFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DomainPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DomainPackage init() {
		if (isInited) return (DomainPackage)EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI);

		// Obtain or create and register package
		DomainPackageImpl theDomainPackage = (DomainPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DomainPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DomainPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theDomainPackage.createPackageContents();

		// Initialize created meta-data
		theDomainPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDomainPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DomainPackage.eNS_URI, theDomainPackage);
		return theDomainPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomain() {
		return domainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomain_Uid() {
		return (EAttribute)domainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_DomainArtifacts() {
		return (EReference)domainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_DomainTypes() {
		return (EReference)domainEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_DomainApplications() {
		return (EReference)domainEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_Any() {
		return (EReference)domainEClass.getEStructuralFeatures().get(4);
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
	public EClass getCategorized() {
		return categorizedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCategorized_Classifiers() {
		return (EReference)categorizedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassifier() {
		return classifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassifier_Uid() {
		return (EAttribute)classifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifier_Hint() {
		return (EReference)classifierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassifier_Details() {
		return (EAttribute)classifierEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecured() {
		return securedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecured_Grants() {
		return (EReference)securedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGrantAccess() {
		return grantAccessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGrantAccess_Uid() {
		return (EAttribute)grantAccessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGrantAccess_ApplicationRef() {
		return (EReference)grantAccessEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGrantAccess_RoleRef() {
		return (EReference)grantAccessEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainArtifacts() {
		return domainArtifactsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainArtifacts_Uid() {
		return (EAttribute)domainArtifactsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainArtifacts_Name() {
		return (EAttribute)domainArtifactsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainArtifacts_Parent() {
		return (EReference)domainArtifactsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainArtifacts_DomainArtifact() {
		return (EReference)domainArtifactsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainTypes() {
		return domainTypesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainTypes_Uid() {
		return (EAttribute)domainTypesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainTypes_Name() {
		return (EAttribute)domainTypesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainTypes_Typesrepository() {
		return (EReference)domainTypesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainTypes_Parent() {
		return (EReference)domainTypesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainApplications() {
		return domainApplicationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainApplications_Uid() {
		return (EAttribute)domainApplicationsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainApplications_Name() {
		return (EAttribute)domainApplicationsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainApplications_Applications() {
		return (EReference)domainApplicationsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainApplications_Parent() {
		return (EReference)domainApplicationsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainApplication() {
		return domainApplicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainApplication_Uid() {
		return (EAttribute)domainApplicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainApplication_Name() {
		return (EAttribute)domainApplicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainApplication_Application() {
		return (EReference)domainApplicationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainApplication_Parent() {
		return (EReference)domainApplicationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainArtifact() {
		return domainArtifactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainArtifact_Uid() {
		return (EAttribute)domainArtifactEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainArtifact_Name() {
		return (EAttribute)domainArtifactEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainArtifact_Parent() {
		return (EReference)domainArtifactEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainArtifact_Artifact() {
		return (EReference)domainArtifactEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getORMEntity() {
		return ormEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJPAService() {
		return jpaServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEJBService() {
		return ejbServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContinuousIintegration() {
		return continuousIintegrationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArtifacts() {
		return artifactsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArtifacts_Uid() {
		return (EAttribute)artifactsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArtifacts_Artifacts() {
		return (EReference)artifactsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArtifacts_Parent() {
		return (EReference)artifactsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArtifacts_Any() {
		return (EReference)artifactsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArtifact() {
		return artifactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArtifact_Uid() {
		return (EAttribute)artifactEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArtifact_Name() {
		return (EAttribute)artifactEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArtifact_Description() {
		return (EAttribute)artifactEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArtifact_Parent() {
		return (EReference)artifactEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArtifact_ConfigVariables() {
		return (EReference)artifactEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArtifact_ModelQuery() {
		return (EReference)artifactEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArtifact_Specifiers() {
		return (EReference)artifactEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArtifact_Hints() {
		return (EReference)artifactEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArtifact_Template() {
		return (EAttribute)artifactEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenerationHint() {
		return generationHintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenerationHint_Uid() {
		return (EAttribute)generationHintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenerationHint_Name() {
		return (EAttribute)generationHintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenerationHint_ApplyedClass() {
		return (EAttribute)generationHintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigVariable() {
		return configVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigVariable_Uid() {
		return (EAttribute)configVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigVariable_Name() {
		return (EAttribute)configVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigVariable_Parent() {
		return (EReference)configVariableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelQuery() {
		return modelQueryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelQuery_Uid() {
		return (EAttribute)modelQueryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelQuery_Name() {
		return (EAttribute)modelQueryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelQuery_Query() {
		return (EAttribute)modelQueryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelQuery_Parent() {
		return (EReference)modelQueryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelQuery_Parameters() {
		return (EReference)modelQueryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryParameter() {
		return queryParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryParameter_Uid() {
		return (EAttribute)queryParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQueryParameter_Parent() {
		return (EReference)queryParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryParameter_Name() {
		return (EAttribute)queryParameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecifier() {
		return specifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecifier_Uid() {
		return (EAttribute)specifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecifier_Name() {
		return (EAttribute)specifierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecifier_Parent() {
		return (EReference)specifierEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecifier_Options() {
		return (EReference)specifierEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOption() {
		return optionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOption_Uid() {
		return (EAttribute)optionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOption_Parent() {
		return (EReference)optionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOption_Value() {
		return (EAttribute)optionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplication() {
		return applicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplication_Uid() {
		return (EAttribute)applicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplication_ApplicationRecipes() {
		return (EReference)applicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplication_ApplicationMappers() {
		return (EReference)applicationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplication_ApplicationUILayer() {
		return (EReference)applicationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplication_ApplicationInfrastructureLayer() {
		return (EReference)applicationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplication_ApplicationStyle() {
		return (EReference)applicationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplication_ApplicationRole() {
		return (EReference)applicationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplication_ApplicationMessages() {
		return (EReference)applicationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplication_Parent() {
		return (EReference)applicationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplication_Any() {
		return (EReference)applicationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplicationMessages() {
		return applicationMessagesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplicationMessages_Uid() {
		return (EAttribute)applicationMessagesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplicationMessages_Name() {
		return (EAttribute)applicationMessagesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicationMessages_Parent() {
		return (EReference)applicationMessagesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicationMessages_Messages() {
		return (EReference)applicationMessagesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplicationRole() {
		return applicationRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplicationRole_Uid() {
		return (EAttribute)applicationRoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplicationRole_Name() {
		return (EAttribute)applicationRoleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicationRole_Parent() {
		return (EReference)applicationRoleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicationRole_Roles() {
		return (EReference)applicationRoleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplicationStyle() {
		return applicationStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplicationStyle_Uid() {
		return (EAttribute)applicationStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplicationStyle_Name() {
		return (EAttribute)applicationStyleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicationStyle_Parent() {
		return (EReference)applicationStyleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicationStyle_StylesPackage() {
		return (EReference)applicationStyleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStylesPackage() {
		return stylesPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStylesPackage_Uid() {
		return (EAttribute)stylesPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStylesPackage_Name() {
		return (EAttribute)stylesPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStylesPackage_Parent() {
		return (EReference)stylesPackageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStylesPackage_Styles() {
		return (EReference)stylesPackageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplicationUILayer() {
		return applicationUILayerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplicationUILayer_Uid() {
		return (EAttribute)applicationUILayerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplicationUILayer_Name() {
		return (EAttribute)applicationUILayerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicationUILayer_Parent() {
		return (EReference)applicationUILayerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicationUILayer_ApplicationUIPackages() {
		return (EReference)applicationUILayerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplicationUIPackage() {
		return applicationUIPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplicationUIPackage_Uid() {
		return (EAttribute)applicationUIPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplicationUIPackage_Name() {
		return (EAttribute)applicationUIPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicationUIPackage_Parent() {
		return (EReference)applicationUIPackageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicationUIPackage_Uipackage() {
		return (EReference)applicationUIPackageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplicationRecipes() {
		return applicationRecipesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplicationRecipes_Uid() {
		return (EAttribute)applicationRecipesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplicationRecipes_Name() {
		return (EAttribute)applicationRecipesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicationRecipes_Parent() {
		return (EReference)applicationRecipesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicationRecipes_Recipes() {
		return (EReference)applicationRecipesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplicationRecipe() {
		return applicationRecipeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplicationRecipe_Uid() {
		return (EAttribute)applicationRecipeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplicationRecipe_Name() {
		return (EAttribute)applicationRecipeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicationRecipe_Recipes() {
		return (EReference)applicationRecipeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicationRecipe_Parent() {
		return (EReference)applicationRecipeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplicationMappers() {
		return applicationMappersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplicationMappers_Uid() {
		return (EAttribute)applicationMappersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplicationMappers_Name() {
		return (EAttribute)applicationMappersEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicationMappers_Parent() {
		return (EReference)applicationMappersEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicationMappers_Mappers() {
		return (EReference)applicationMappersEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplicationMapper() {
		return applicationMapperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplicationMapper_Uid() {
		return (EAttribute)applicationMapperEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplicationMapper_Name() {
		return (EAttribute)applicationMapperEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicationMapper_Mapper() {
		return (EReference)applicationMapperEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicationMapper_Parent() {
		return (EReference)applicationMapperEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethodPointer() {
		return methodPointerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodPointer_MethodRef() {
		return (EReference)methodPointerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethodPointer_FakeMethod() {
		return (EAttribute)methodPointerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessages() {
		return messagesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessages_Uid() {
		return (EAttribute)messagesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessages_Parent() {
		return (EReference)messagesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessages_MessageLibraries() {
		return (EReference)messagesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessages_Languages() {
		return (EReference)messagesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessages_Any() {
		return (EReference)messagesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageLibrary() {
		return messageLibraryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageLibrary_Uid() {
		return (EAttribute)messageLibraryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageLibrary_Name() {
		return (EAttribute)messageLibraryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageLibrary_LibLanguages() {
		return (EReference)messageLibraryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageLibrary_Messages() {
		return (EReference)messageLibraryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLanguageRef() {
		return languageRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLanguageRef_Uid() {
		return (EAttribute)languageRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLanguageRef_Lang() {
		return (EReference)languageRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessage() {
		return messageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessage_Uid() {
		return (EAttribute)messageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessage_Name() {
		return (EAttribute)messageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessage_Translatioins() {
		return (EReference)messageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTranslation() {
		return translationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTranslation_Uid() {
		return (EAttribute)translationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTranslation_Translation() {
		return (EAttribute)translationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTranslation_Lang() {
		return (EReference)translationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLanguage() {
		return languageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLanguage_Uid() {
		return (EAttribute)languageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLanguage_Lang() {
		return (EAttribute)languageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLanguage_Code() {
		return (EAttribute)languageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLanguage_DefaultLang() {
		return (EAttribute)languageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoles() {
		return rolesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoles_Uid() {
		return (EAttribute)rolesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoles_Parent() {
		return (EReference)rolesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoles_Roles() {
		return (EReference)rolesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoles_Groups() {
		return (EReference)rolesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoles_Any() {
		return (EReference)rolesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRole() {
		return roleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRole_Uid() {
		return (EAttribute)roleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRole_Name() {
		return (EAttribute)roleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroup() {
		return groupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroup_Uid() {
		return (EAttribute)groupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroup_Name() {
		return (EAttribute)groupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroup_Group2Group() {
		return (EReference)groupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroup_Group2Role() {
		return (EReference)groupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStyles() {
		return stylesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStyles_Uid() {
		return (EAttribute)stylesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStyles_Parent() {
		return (EReference)stylesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStyles_Libraries() {
		return (EReference)stylesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStyles_Any() {
		return (EReference)stylesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStyleLibrary() {
		return styleLibraryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStyleLibrary_Uid() {
		return (EAttribute)styleLibraryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStyleLibrary_Name() {
		return (EAttribute)styleLibraryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStyleLibrary_Styles() {
		return (EReference)styleLibraryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStyleSet() {
		return styleSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStyleSet_Uid() {
		return (EAttribute)styleSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStyleSet_Name() {
		return (EAttribute)styleSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMappers() {
		return mappersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMappers_Uid() {
		return (EAttribute)mappersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappers_Mappers() {
		return (EReference)mappersEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappers_Parent() {
		return (EReference)mappersEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappers_Any() {
		return (EReference)mappersEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMapper() {
		return mapperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMapper_Uid() {
		return (EAttribute)mapperEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapper_Parent() {
		return (EReference)mapperEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMapper_ServiceLayer() {
		return (EAttribute)mapperEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMapper_UiLayer() {
		return (EAttribute)mapperEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeMapper() {
		return typeMapperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJavaMapper() {
		return javaMapperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJavaMapper_MappedToPackageName() {
		return (EAttribute)javaMapperEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJavaMapper_MappedToClassName() {
		return (EAttribute)javaMapperEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJavaMapper_ArtifactId() {
		return (EAttribute)javaMapperEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJavaMapper_GroupId() {
		return (EAttribute)javaMapperEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJavaMapper_Version() {
		return (EAttribute)javaMapperEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJavaMapper_LibraryName() {
		return (EAttribute)javaMapperEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJavaMapper_ArtifactType() {
		return (EAttribute)javaMapperEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJavaScriptMapper() {
		return javaScriptMapperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJavaScriptMapper_LibraryUrl() {
		return (EAttribute)javaScriptMapperEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCSSMapper() {
		return cssMapperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSSMapper_LibraryUrl() {
		return (EAttribute)cssMapperEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSSMapper_StylePackage() {
		return (EReference)cssMapperEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSSMapper_StyleLibrary() {
		return (EReference)cssMapperEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSSMapper_FakePackageName() {
		return (EAttribute)cssMapperEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSSMapper_FakeTypeName() {
		return (EAttribute)cssMapperEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleMapper() {
		return roleMapperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleMapper_Role() {
		return (EReference)roleMapperEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoleMapper_LocalRoleName() {
		return (EAttribute)roleMapperEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoleMapper_GlobalRoleName() {
		return (EAttribute)roleMapperEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoleMapper_FakeRoleName() {
		return (EAttribute)roleMapperEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRecipes() {
		return recipesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecipes_Uid() {
		return (EAttribute)recipesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRecipes_Recipe() {
		return (EReference)recipesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRecipes_Configurations() {
		return (EReference)recipesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRecipes_Infrastructures() {
		return (EReference)recipesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRecipes_Parent() {
		return (EReference)recipesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRecipes_Deployment() {
		return (EReference)recipesEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRecipes_ConfigExtension() {
		return (EReference)recipesEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRecipes_Any() {
		return (EReference)recipesEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeploymentSequence() {
		return deploymentSequenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeploymentSequence_Uid() {
		return (EAttribute)deploymentSequenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeploymentSequence_Name() {
		return (EAttribute)deploymentSequenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeploymentSequence_DeploymentComponents() {
		return (EReference)deploymentSequenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeploymentComponents() {
		return deploymentComponentsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeploymentComponents_Uid() {
		return (EAttribute)deploymentComponentsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeploymentComponents_DeplymentStep() {
		return (EReference)deploymentComponentsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeploymentComponents_StartSeq() {
		return (EReference)deploymentComponentsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeploymentComponents_Any() {
		return (EReference)deploymentComponentsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeploymentComponent() {
		return deploymentComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeploymentComponent_Uid() {
		return (EAttribute)deploymentComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeploymentComponent_Name() {
		return (EAttribute)deploymentComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeploymentComponent_Mapper() {
		return (EReference)deploymentComponentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeploymentComponent_DeploymentComponentLink() {
		return (EReference)deploymentComponentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeploymentStarStep() {
		return deploymentStarStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeploymentStarStep_Uid() {
		return (EAttribute)deploymentStarStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeploymentStarStep_Name() {
		return (EAttribute)deploymentStarStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeploymentStarStep_FirstStep() {
		return (EReference)deploymentStarStepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUsingMappers() {
		return usingMappersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUsingMappers_Mappers() {
		return (EReference)usingMappersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRecipe() {
		return recipeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecipe_Uid() {
		return (EAttribute)recipeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRecipe_Parent() {
		return (EReference)recipeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecipe_Name() {
		return (EAttribute)recipeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRecipe_Ingredients() {
		return (EReference)recipeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRecipe_Infrastructures() {
		return (EReference)recipeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRecipe_Deployment() {
		return (EReference)recipeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigExtension() {
		return configExtensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigExtension_Uid() {
		return (EAttribute)configExtensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigExtension_Source() {
		return (EReference)configExtensionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigExtension_Target() {
		return (EReference)configExtensionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIngredient() {
		return ingredientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIngredient_Uid() {
		return (EAttribute)ingredientEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIngredient_Name() {
		return (EAttribute)ingredientEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIngredient_Parent() {
		return (EReference)ingredientEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIngredient_Components() {
		return (EReference)ingredientEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIngredient_Layer() {
		return (EAttribute)ingredientEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponent() {
		return componentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_Uid() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_Name() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_Parent() {
		return (EReference)componentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_Mappers() {
		return (EReference)componentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_ComponentRoot() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJavaComponent() {
		return javaComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJavaComponent_ArtifactId() {
		return (EAttribute)javaComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJavaComponent_GroupId() {
		return (EAttribute)javaComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJavaComponent_Version() {
		return (EAttribute)javaComponentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJavaComponent_BasePackage() {
		return (EAttribute)javaComponentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInfrastructure() {
		return infrastructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInfrastructure_Uid() {
		return (EAttribute)infrastructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInfrastructure_Recipe() {
		return (EReference)infrastructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInfrastructure_Name() {
		return (EAttribute)infrastructureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInfrastructure_RecipeConfig() {
		return (EReference)infrastructureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfiguration() {
		return configurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfiguration_Uid() {
		return (EAttribute)configurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfiguration_Name() {
		return (EAttribute)configurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfiguration_Infrastructure() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfiguration_Properties() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelMapper() {
		return modelMapperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelMapper_Name() {
		return (EAttribute)modelMapperEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelMapper_ArtifactRoot() {
		return (EAttribute)modelMapperEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelMapper_Parent() {
		return (EReference)modelMapperEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelMapper_Specifiers() {
		return (EReference)modelMapperEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelMapper_Queries() {
		return (EReference)modelMapperEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelMapper_ArtifactExecutionString() {
		return (EAttribute)modelMapperEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Uid() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_ConfVarRef() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Value() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_FakeName() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMappingSpecifier() {
		return mappingSpecifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMappingSpecifier_Uid() {
		return (EAttribute)mappingSpecifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingSpecifier_SpecifierRef() {
		return (EReference)mappingSpecifierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingSpecifier_ValueRef() {
		return (EReference)mappingSpecifierEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuery() {
		return queryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuery_Uid() {
		return (EAttribute)queryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuery_ModelQuery() {
		return (EReference)queryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuery_Name() {
		return (EAttribute)queryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuery_QueryRef() {
		return (EReference)queryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuery_Variables() {
		return (EReference)queryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryVariable() {
		return queryVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryVariable_Uid() {
		return (EAttribute)queryVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQueryVariable_QueryParamRef() {
		return (EReference)queryVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryVariable_Value() {
		return (EAttribute)queryVariableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArtifactRef() {
		return artifactRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArtifactRef_Uid() {
		return (EAttribute)artifactRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArtifactRef_DomainArtifactRef() {
		return (EReference)artifactRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArtifactRef_ArtifactRef() {
		return (EReference)artifactRefEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypePointer() {
		return typePointerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypePointer_PackageRef() {
		return (EReference)typePointerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypePointer_TypeRef() {
		return (EReference)typePointerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypePointer_FakePackageName() {
		return (EAttribute)typePointerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypePointer_FakeTypeName() {
		return (EAttribute)typePointerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeDefinition() {
		return typeDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeDefinition_Uid() {
		return (EAttribute)typeDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeDefinition_Types() {
		return (EReference)typeDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeDefinition_Parent() {
		return (EReference)typeDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeDefinition_Any() {
		return (EReference)typeDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeElement() {
		return typeElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeElement_Uid() {
		return (EAttribute)typeElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeElement_Name() {
		return (EAttribute)typeElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeElement_Parent() {
		return (EReference)typeElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitive() {
		return primitiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getType() {
		return typeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getType_Attributes() {
		return (EReference)typeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getType_Operations() {
		return (EReference)typeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getType_Extension() {
		return (EReference)typeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeReference() {
		return typeReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeExtension() {
		return typeExtensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeExtension_Uid() {
		return (EAttribute)typeExtensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeExtension_Source() {
		return (EReference)typeExtensionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeExtension_Target() {
		return (EReference)typeExtensionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Uid() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Name() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Pk() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_Parent() {
		return (EReference)attributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperation() {
		return operationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_Uid() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_Name() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_Parent() {
		return (EReference)operationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_Parameters() {
		return (EReference)operationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_ReturnValue() {
		return (EReference)operationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Uid() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Name() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Order() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameter_Parent() {
		return (EReference)parameterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReturnValue() {
		return returnValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReturnValue_Uid() {
		return (EAttribute)returnValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumarator() {
		return enumaratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumarator_Values() {
		return (EReference)enumaratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumAttribute() {
		return enumAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumAttribute_Uid() {
		return (EAttribute)enumAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumAttribute_Parent() {
		return (EReference)enumAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumAttribute_Name() {
		return (EAttribute)enumAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumAttribute_Value() {
		return (EAttribute)enumAttributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypesRepository() {
		return typesRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypesRepository_Uid() {
		return (EAttribute)typesRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypesRepository_TypeDefinition() {
		return (EReference)typesRepositoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypesRepository_Parent() {
		return (EReference)typesRepositoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypesRepository_Any() {
		return (EReference)typesRepositoryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypes() {
		return typesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypes_Uid() {
		return (EAttribute)typesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypes_Parent() {
		return (EReference)typesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypes_Name() {
		return (EAttribute)typesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypes_Packages() {
		return (EReference)typesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackage() {
		return packageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackage_Uid() {
		return (EAttribute)packageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackage_Name() {
		return (EAttribute)packageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_Typedefinition() {
		return (EReference)packageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_Parent() {
		return (EReference)packageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUIPackage() {
		return uiPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUIPackage_Uid() {
		return (EAttribute)uiPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUIPackage_Parent() {
		return (EReference)uiPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUIPackage_Forms() {
		return (EReference)uiPackageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUIPackage_Any() {
		return (EReference)uiPackageEClass.getEStructuralFeatures().get(3);
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
	public EClass getFormView() {
		return formViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormView_Uid() {
		return (EAttribute)formViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormView_Name() {
		return (EAttribute)formViewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormView_View() {
		return (EReference)formViewEClass.getEStructuralFeatures().get(2);
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
	public EReference getViews_Parent() {
		return (EReference)viewsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViews_Canvases() {
		return (EReference)viewsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViews_ViewInheritances() {
		return (EReference)viewsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViews_TabPagesInheritances() {
		return (EReference)viewsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViews_Any() {
		return (EReference)viewsEClass.getEStructuralFeatures().get(5);
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
	public EReference getViewArea_CanvasView() {
		return (EReference)viewAreaEClass.getEStructuralFeatures().get(2);
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
	public EClass getFormDataControls() {
		return formDataControlsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormDataControls_Uid() {
		return (EAttribute)formDataControlsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormDataControls_Name() {
		return (EAttribute)formDataControlsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormDataControls_FormControl() {
		return (EReference)formDataControlsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCanvasView() {
		return canvasViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCanvasView_Uid() {
		return (EAttribute)canvasViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCanvasView_Parent() {
		return (EReference)canvasViewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCanvasView_BaseCanvas() {
		return (EReference)canvasViewEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCanvasView_LinkToLabels() {
		return (EReference)canvasViewEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCanvasView_LinkToMessages() {
		return (EReference)canvasViewEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCanvasView_Any() {
		return (EReference)canvasViewEClass.getEStructuralFeatures().get(5);
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
	public EClass getActioinTriggers() {
		return actioinTriggersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActioinTriggers_Triggers() {
		return (EReference)actioinTriggersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionTrigger() {
		return actionTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActionTrigger_Uid() {
		return (EAttribute)actionTriggerEClass.getEStructuralFeatures().get(0);
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
	public EReference getUielement_Enabled() {
		return (EReference)uielementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUielement_Required() {
		return (EReference)uielementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUielement_ReadOnly() {
		return (EReference)uielementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUielement_RefreshAreas() {
		return (EReference)uielementEClass.getEStructuralFeatures().get(4);
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
	public EReference getButton_Icon() {
		return (EReference)buttonEClass.getEStructuralFeatures().get(1);
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
	public EReference getControls_Parent() {
		return (EReference)controlsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControls_Root() {
		return (EReference)controlsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControls_Controls() {
		return (EReference)controlsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControls_Relations() {
		return (EReference)controlsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControls_Dependencies() {
		return (EReference)controlsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControls_Any() {
		return (EReference)controlsEClass.getEStructuralFeatures().get(6);
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
	public EReference getDataControl_Parent() {
		return (EReference)dataControlEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataControl_PreQueryTrigger() {
		return (EReference)dataControlEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataControl_PostQueryTrigger() {
		return (EReference)dataControlEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataControl_PreInsertTrigger() {
		return (EReference)dataControlEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataControl_PreDeleteTrigger() {
		return (EReference)dataControlEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataControl_PostCreateTrigger() {
		return (EReference)dataControlEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataControl_PreUpdateTrigger() {
		return (EReference)dataControlEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataControl_Create() {
		return (EReference)dataControlEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataControl_Insert() {
		return (EReference)dataControlEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataControl_Update() {
		return (EReference)dataControlEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataControl_Remove() {
		return (EReference)dataControlEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataControl_Search() {
		return (EReference)dataControlEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataControl_ArtificialFields() {
		return (EReference)dataControlEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataControl_DefaultSearch() {
		return (EReference)dataControlEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataControl_DefaultOrderBy() {
		return (EReference)dataControlEClass.getEStructuralFeatures().get(17);
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
	public EReference getArtificialField_Parent() {
		return (EReference)artificialFieldEClass.getEStructuralFeatures().get(2);
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
	public EReference getLink_Parent() {
		return (EReference)linkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLink_MasterField() {
		return (EReference)linkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLink_DetailField() {
		return (EReference)linkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplicationInfrastructureLayer() {
		return applicationInfrastructureLayerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplicationInfrastructureLayer_Uid() {
		return (EAttribute)applicationInfrastructureLayerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplicationInfrastructureLayer_Name() {
		return (EAttribute)applicationInfrastructureLayerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicationInfrastructureLayer_Parent() {
		return (EReference)applicationInfrastructureLayerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicationInfrastructureLayer_Infarastructure() {
		return (EReference)applicationInfrastructureLayerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnterpriseInfrastructure() {
		return enterpriseInfrastructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnterpriseInfrastructure_Uid() {
		return (EAttribute)enterpriseInfrastructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnterpriseInfrastructure_Parent() {
		return (EReference)enterpriseInfrastructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnterpriseInfrastructure_Datacenters() {
		return (EReference)enterpriseInfrastructureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnterpriseInfrastructure_InfrastructureConnections() {
		return (EReference)enterpriseInfrastructureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnterpriseInfrastructure_Any() {
		return (EReference)enterpriseInfrastructureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatacenter() {
		return datacenterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatacenter_Uid() {
		return (EAttribute)datacenterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatacenter_Parent() {
		return (EReference)datacenterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatacenter_Subsystems() {
		return (EReference)datacenterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatacenter_Name() {
		return (EAttribute)datacenterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubsystem() {
		return subsystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubsystem_Uid() {
		return (EAttribute)subsystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubsystem_Name() {
		return (EAttribute)subsystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubsystem_Parent() {
		return (EReference)subsystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubsystem_InfrastructureLayer() {
		return (EReference)subsystemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInfrastructureLayer() {
		return infrastructureLayerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInfrastructureLayer_Uid() {
		return (EAttribute)infrastructureLayerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInfrastructureLayer_Name() {
		return (EAttribute)infrastructureLayerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInfrastructureLayer_Parent() {
		return (EReference)infrastructureLayerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInfrastructureLayer_InfrastructureComponent() {
		return (EReference)infrastructureLayerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInfrastructureConnection() {
		return infrastructureConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInfrastructureConnection_Uid() {
		return (EAttribute)infrastructureConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInfrastructureConnection_Master() {
		return (EReference)infrastructureConnectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInfrastructureConnection_Detail() {
		return (EReference)infrastructureConnectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInfrastructureComponent() {
		return infrastructureComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInfrastructureComponent_Uid() {
		return (EAttribute)infrastructureComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInfrastructureComponent_Name() {
		return (EAttribute)infrastructureComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInfrastructureComponent_Parent() {
		return (EReference)infrastructureComponentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServer() {
		return serverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRouter() {
		return routerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHub() {
		return hubEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStorage() {
		return storageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServerClaster() {
		return serverClasterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServerClaster_Servers() {
		return (EReference)serverClasterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPlatformLayers() {
		return platformLayersEEnum;
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
	public DomainFactory getDomainFactory() {
		return (DomainFactory)getEFactoryInstance();
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
		domainEClass = createEClass(DOMAIN);
		createEAttribute(domainEClass, DOMAIN__UID);
		createEReference(domainEClass, DOMAIN__DOMAIN_ARTIFACTS);
		createEReference(domainEClass, DOMAIN__DOMAIN_TYPES);
		createEReference(domainEClass, DOMAIN__DOMAIN_APPLICATIONS);
		createEReference(domainEClass, DOMAIN__ANY);

		htmlLayerHolderEClass = createEClass(HTML_LAYER_HOLDER);
		createEAttribute(htmlLayerHolderEClass, HTML_LAYER_HOLDER__COLUMNS);

		categorizedEClass = createEClass(CATEGORIZED);
		createEReference(categorizedEClass, CATEGORIZED__CLASSIFIERS);

		classifierEClass = createEClass(CLASSIFIER);
		createEAttribute(classifierEClass, CLASSIFIER__UID);
		createEReference(classifierEClass, CLASSIFIER__HINT);
		createEAttribute(classifierEClass, CLASSIFIER__DETAILS);

		securedEClass = createEClass(SECURED);
		createEReference(securedEClass, SECURED__GRANTS);

		grantAccessEClass = createEClass(GRANT_ACCESS);
		createEAttribute(grantAccessEClass, GRANT_ACCESS__UID);
		createEReference(grantAccessEClass, GRANT_ACCESS__APPLICATION_REF);
		createEReference(grantAccessEClass, GRANT_ACCESS__ROLE_REF);

		domainArtifactsEClass = createEClass(DOMAIN_ARTIFACTS);
		createEAttribute(domainArtifactsEClass, DOMAIN_ARTIFACTS__UID);
		createEAttribute(domainArtifactsEClass, DOMAIN_ARTIFACTS__NAME);
		createEReference(domainArtifactsEClass, DOMAIN_ARTIFACTS__PARENT);
		createEReference(domainArtifactsEClass, DOMAIN_ARTIFACTS__DOMAIN_ARTIFACT);

		domainTypesEClass = createEClass(DOMAIN_TYPES);
		createEAttribute(domainTypesEClass, DOMAIN_TYPES__UID);
		createEAttribute(domainTypesEClass, DOMAIN_TYPES__NAME);
		createEReference(domainTypesEClass, DOMAIN_TYPES__TYPESREPOSITORY);
		createEReference(domainTypesEClass, DOMAIN_TYPES__PARENT);

		domainApplicationsEClass = createEClass(DOMAIN_APPLICATIONS);
		createEAttribute(domainApplicationsEClass, DOMAIN_APPLICATIONS__UID);
		createEAttribute(domainApplicationsEClass, DOMAIN_APPLICATIONS__NAME);
		createEReference(domainApplicationsEClass, DOMAIN_APPLICATIONS__APPLICATIONS);
		createEReference(domainApplicationsEClass, DOMAIN_APPLICATIONS__PARENT);

		domainApplicationEClass = createEClass(DOMAIN_APPLICATION);
		createEAttribute(domainApplicationEClass, DOMAIN_APPLICATION__UID);
		createEAttribute(domainApplicationEClass, DOMAIN_APPLICATION__NAME);
		createEReference(domainApplicationEClass, DOMAIN_APPLICATION__APPLICATION);
		createEReference(domainApplicationEClass, DOMAIN_APPLICATION__PARENT);

		domainArtifactEClass = createEClass(DOMAIN_ARTIFACT);
		createEAttribute(domainArtifactEClass, DOMAIN_ARTIFACT__UID);
		createEAttribute(domainArtifactEClass, DOMAIN_ARTIFACT__NAME);
		createEReference(domainArtifactEClass, DOMAIN_ARTIFACT__PARENT);
		createEReference(domainArtifactEClass, DOMAIN_ARTIFACT__ARTIFACT);

		ormEntityEClass = createEClass(ORM_ENTITY);

		jpaServiceEClass = createEClass(JPA_SERVICE);

		ejbServiceEClass = createEClass(EJB_SERVICE);

		continuousIintegrationEClass = createEClass(CONTINUOUS_IINTEGRATION);

		artifactsEClass = createEClass(ARTIFACTS);
		createEAttribute(artifactsEClass, ARTIFACTS__UID);
		createEReference(artifactsEClass, ARTIFACTS__ARTIFACTS);
		createEReference(artifactsEClass, ARTIFACTS__PARENT);
		createEReference(artifactsEClass, ARTIFACTS__ANY);

		artifactEClass = createEClass(ARTIFACT);
		createEAttribute(artifactEClass, ARTIFACT__UID);
		createEAttribute(artifactEClass, ARTIFACT__NAME);
		createEAttribute(artifactEClass, ARTIFACT__DESCRIPTION);
		createEReference(artifactEClass, ARTIFACT__PARENT);
		createEReference(artifactEClass, ARTIFACT__CONFIG_VARIABLES);
		createEReference(artifactEClass, ARTIFACT__MODEL_QUERY);
		createEReference(artifactEClass, ARTIFACT__SPECIFIERS);
		createEReference(artifactEClass, ARTIFACT__HINTS);
		createEAttribute(artifactEClass, ARTIFACT__TEMPLATE);

		generationHintEClass = createEClass(GENERATION_HINT);
		createEAttribute(generationHintEClass, GENERATION_HINT__UID);
		createEAttribute(generationHintEClass, GENERATION_HINT__NAME);
		createEAttribute(generationHintEClass, GENERATION_HINT__APPLYED_CLASS);

		configVariableEClass = createEClass(CONFIG_VARIABLE);
		createEAttribute(configVariableEClass, CONFIG_VARIABLE__UID);
		createEAttribute(configVariableEClass, CONFIG_VARIABLE__NAME);
		createEReference(configVariableEClass, CONFIG_VARIABLE__PARENT);

		modelQueryEClass = createEClass(MODEL_QUERY);
		createEAttribute(modelQueryEClass, MODEL_QUERY__UID);
		createEAttribute(modelQueryEClass, MODEL_QUERY__NAME);
		createEAttribute(modelQueryEClass, MODEL_QUERY__QUERY);
		createEReference(modelQueryEClass, MODEL_QUERY__PARENT);
		createEReference(modelQueryEClass, MODEL_QUERY__PARAMETERS);

		queryParameterEClass = createEClass(QUERY_PARAMETER);
		createEAttribute(queryParameterEClass, QUERY_PARAMETER__UID);
		createEReference(queryParameterEClass, QUERY_PARAMETER__PARENT);
		createEAttribute(queryParameterEClass, QUERY_PARAMETER__NAME);

		specifierEClass = createEClass(SPECIFIER);
		createEAttribute(specifierEClass, SPECIFIER__UID);
		createEAttribute(specifierEClass, SPECIFIER__NAME);
		createEReference(specifierEClass, SPECIFIER__PARENT);
		createEReference(specifierEClass, SPECIFIER__OPTIONS);

		optionEClass = createEClass(OPTION);
		createEAttribute(optionEClass, OPTION__UID);
		createEReference(optionEClass, OPTION__PARENT);
		createEAttribute(optionEClass, OPTION__VALUE);

		applicationEClass = createEClass(APPLICATION);
		createEAttribute(applicationEClass, APPLICATION__UID);
		createEReference(applicationEClass, APPLICATION__APPLICATION_RECIPES);
		createEReference(applicationEClass, APPLICATION__APPLICATION_MAPPERS);
		createEReference(applicationEClass, APPLICATION__APPLICATION_UI_LAYER);
		createEReference(applicationEClass, APPLICATION__APPLICATION_INFRASTRUCTURE_LAYER);
		createEReference(applicationEClass, APPLICATION__APPLICATION_STYLE);
		createEReference(applicationEClass, APPLICATION__APPLICATION_ROLE);
		createEReference(applicationEClass, APPLICATION__APPLICATION_MESSAGES);
		createEReference(applicationEClass, APPLICATION__PARENT);
		createEReference(applicationEClass, APPLICATION__ANY);

		applicationMessagesEClass = createEClass(APPLICATION_MESSAGES);
		createEAttribute(applicationMessagesEClass, APPLICATION_MESSAGES__UID);
		createEAttribute(applicationMessagesEClass, APPLICATION_MESSAGES__NAME);
		createEReference(applicationMessagesEClass, APPLICATION_MESSAGES__PARENT);
		createEReference(applicationMessagesEClass, APPLICATION_MESSAGES__MESSAGES);

		applicationRoleEClass = createEClass(APPLICATION_ROLE);
		createEAttribute(applicationRoleEClass, APPLICATION_ROLE__UID);
		createEAttribute(applicationRoleEClass, APPLICATION_ROLE__NAME);
		createEReference(applicationRoleEClass, APPLICATION_ROLE__PARENT);
		createEReference(applicationRoleEClass, APPLICATION_ROLE__ROLES);

		applicationStyleEClass = createEClass(APPLICATION_STYLE);
		createEAttribute(applicationStyleEClass, APPLICATION_STYLE__UID);
		createEAttribute(applicationStyleEClass, APPLICATION_STYLE__NAME);
		createEReference(applicationStyleEClass, APPLICATION_STYLE__PARENT);
		createEReference(applicationStyleEClass, APPLICATION_STYLE__STYLES_PACKAGE);

		stylesPackageEClass = createEClass(STYLES_PACKAGE);
		createEAttribute(stylesPackageEClass, STYLES_PACKAGE__UID);
		createEAttribute(stylesPackageEClass, STYLES_PACKAGE__NAME);
		createEReference(stylesPackageEClass, STYLES_PACKAGE__PARENT);
		createEReference(stylesPackageEClass, STYLES_PACKAGE__STYLES);

		applicationUILayerEClass = createEClass(APPLICATION_UI_LAYER);
		createEAttribute(applicationUILayerEClass, APPLICATION_UI_LAYER__UID);
		createEAttribute(applicationUILayerEClass, APPLICATION_UI_LAYER__NAME);
		createEReference(applicationUILayerEClass, APPLICATION_UI_LAYER__PARENT);
		createEReference(applicationUILayerEClass, APPLICATION_UI_LAYER__APPLICATION_UI_PACKAGES);

		applicationUIPackageEClass = createEClass(APPLICATION_UI_PACKAGE);
		createEAttribute(applicationUIPackageEClass, APPLICATION_UI_PACKAGE__UID);
		createEAttribute(applicationUIPackageEClass, APPLICATION_UI_PACKAGE__NAME);
		createEReference(applicationUIPackageEClass, APPLICATION_UI_PACKAGE__PARENT);
		createEReference(applicationUIPackageEClass, APPLICATION_UI_PACKAGE__UIPACKAGE);

		applicationRecipesEClass = createEClass(APPLICATION_RECIPES);
		createEAttribute(applicationRecipesEClass, APPLICATION_RECIPES__UID);
		createEAttribute(applicationRecipesEClass, APPLICATION_RECIPES__NAME);
		createEReference(applicationRecipesEClass, APPLICATION_RECIPES__PARENT);
		createEReference(applicationRecipesEClass, APPLICATION_RECIPES__RECIPES);

		applicationRecipeEClass = createEClass(APPLICATION_RECIPE);
		createEAttribute(applicationRecipeEClass, APPLICATION_RECIPE__UID);
		createEAttribute(applicationRecipeEClass, APPLICATION_RECIPE__NAME);
		createEReference(applicationRecipeEClass, APPLICATION_RECIPE__RECIPES);
		createEReference(applicationRecipeEClass, APPLICATION_RECIPE__PARENT);

		applicationMappersEClass = createEClass(APPLICATION_MAPPERS);
		createEAttribute(applicationMappersEClass, APPLICATION_MAPPERS__UID);
		createEAttribute(applicationMappersEClass, APPLICATION_MAPPERS__NAME);
		createEReference(applicationMappersEClass, APPLICATION_MAPPERS__PARENT);
		createEReference(applicationMappersEClass, APPLICATION_MAPPERS__MAPPERS);

		applicationMapperEClass = createEClass(APPLICATION_MAPPER);
		createEAttribute(applicationMapperEClass, APPLICATION_MAPPER__UID);
		createEAttribute(applicationMapperEClass, APPLICATION_MAPPER__NAME);
		createEReference(applicationMapperEClass, APPLICATION_MAPPER__MAPPER);
		createEReference(applicationMapperEClass, APPLICATION_MAPPER__PARENT);

		methodPointerEClass = createEClass(METHOD_POINTER);
		createEReference(methodPointerEClass, METHOD_POINTER__METHOD_REF);
		createEAttribute(methodPointerEClass, METHOD_POINTER__FAKE_METHOD);

		messagesEClass = createEClass(MESSAGES);
		createEAttribute(messagesEClass, MESSAGES__UID);
		createEReference(messagesEClass, MESSAGES__PARENT);
		createEReference(messagesEClass, MESSAGES__MESSAGE_LIBRARIES);
		createEReference(messagesEClass, MESSAGES__LANGUAGES);
		createEReference(messagesEClass, MESSAGES__ANY);

		messageLibraryEClass = createEClass(MESSAGE_LIBRARY);
		createEAttribute(messageLibraryEClass, MESSAGE_LIBRARY__UID);
		createEAttribute(messageLibraryEClass, MESSAGE_LIBRARY__NAME);
		createEReference(messageLibraryEClass, MESSAGE_LIBRARY__LIB_LANGUAGES);
		createEReference(messageLibraryEClass, MESSAGE_LIBRARY__MESSAGES);

		languageRefEClass = createEClass(LANGUAGE_REF);
		createEAttribute(languageRefEClass, LANGUAGE_REF__UID);
		createEReference(languageRefEClass, LANGUAGE_REF__LANG);

		messageEClass = createEClass(MESSAGE);
		createEAttribute(messageEClass, MESSAGE__UID);
		createEAttribute(messageEClass, MESSAGE__NAME);
		createEReference(messageEClass, MESSAGE__TRANSLATIOINS);

		translationEClass = createEClass(TRANSLATION);
		createEAttribute(translationEClass, TRANSLATION__UID);
		createEAttribute(translationEClass, TRANSLATION__TRANSLATION);
		createEReference(translationEClass, TRANSLATION__LANG);

		languageEClass = createEClass(LANGUAGE);
		createEAttribute(languageEClass, LANGUAGE__UID);
		createEAttribute(languageEClass, LANGUAGE__LANG);
		createEAttribute(languageEClass, LANGUAGE__CODE);
		createEAttribute(languageEClass, LANGUAGE__DEFAULT_LANG);

		rolesEClass = createEClass(ROLES);
		createEAttribute(rolesEClass, ROLES__UID);
		createEReference(rolesEClass, ROLES__PARENT);
		createEReference(rolesEClass, ROLES__ROLES);
		createEReference(rolesEClass, ROLES__GROUPS);
		createEReference(rolesEClass, ROLES__ANY);

		roleEClass = createEClass(ROLE);
		createEAttribute(roleEClass, ROLE__UID);
		createEAttribute(roleEClass, ROLE__NAME);

		groupEClass = createEClass(GROUP);
		createEAttribute(groupEClass, GROUP__UID);
		createEAttribute(groupEClass, GROUP__NAME);
		createEReference(groupEClass, GROUP__GROUP2_GROUP);
		createEReference(groupEClass, GROUP__GROUP2_ROLE);

		stylesEClass = createEClass(STYLES);
		createEAttribute(stylesEClass, STYLES__UID);
		createEReference(stylesEClass, STYLES__PARENT);
		createEReference(stylesEClass, STYLES__LIBRARIES);
		createEReference(stylesEClass, STYLES__ANY);

		styleLibraryEClass = createEClass(STYLE_LIBRARY);
		createEAttribute(styleLibraryEClass, STYLE_LIBRARY__UID);
		createEAttribute(styleLibraryEClass, STYLE_LIBRARY__NAME);
		createEReference(styleLibraryEClass, STYLE_LIBRARY__STYLES);

		styleSetEClass = createEClass(STYLE_SET);
		createEAttribute(styleSetEClass, STYLE_SET__UID);
		createEAttribute(styleSetEClass, STYLE_SET__NAME);

		mappersEClass = createEClass(MAPPERS);
		createEAttribute(mappersEClass, MAPPERS__UID);
		createEReference(mappersEClass, MAPPERS__MAPPERS);
		createEReference(mappersEClass, MAPPERS__PARENT);
		createEReference(mappersEClass, MAPPERS__ANY);

		mapperEClass = createEClass(MAPPER);
		createEAttribute(mapperEClass, MAPPER__UID);
		createEReference(mapperEClass, MAPPER__PARENT);
		createEAttribute(mapperEClass, MAPPER__SERVICE_LAYER);
		createEAttribute(mapperEClass, MAPPER__UI_LAYER);

		typeMapperEClass = createEClass(TYPE_MAPPER);

		javaMapperEClass = createEClass(JAVA_MAPPER);
		createEAttribute(javaMapperEClass, JAVA_MAPPER__MAPPED_TO_PACKAGE_NAME);
		createEAttribute(javaMapperEClass, JAVA_MAPPER__MAPPED_TO_CLASS_NAME);
		createEAttribute(javaMapperEClass, JAVA_MAPPER__ARTIFACT_ID);
		createEAttribute(javaMapperEClass, JAVA_MAPPER__GROUP_ID);
		createEAttribute(javaMapperEClass, JAVA_MAPPER__VERSION);
		createEAttribute(javaMapperEClass, JAVA_MAPPER__LIBRARY_NAME);
		createEAttribute(javaMapperEClass, JAVA_MAPPER__ARTIFACT_TYPE);

		javaScriptMapperEClass = createEClass(JAVA_SCRIPT_MAPPER);
		createEAttribute(javaScriptMapperEClass, JAVA_SCRIPT_MAPPER__LIBRARY_URL);

		cssMapperEClass = createEClass(CSS_MAPPER);
		createEAttribute(cssMapperEClass, CSS_MAPPER__LIBRARY_URL);
		createEReference(cssMapperEClass, CSS_MAPPER__STYLE_PACKAGE);
		createEReference(cssMapperEClass, CSS_MAPPER__STYLE_LIBRARY);
		createEAttribute(cssMapperEClass, CSS_MAPPER__FAKE_PACKAGE_NAME);
		createEAttribute(cssMapperEClass, CSS_MAPPER__FAKE_TYPE_NAME);

		roleMapperEClass = createEClass(ROLE_MAPPER);
		createEReference(roleMapperEClass, ROLE_MAPPER__ROLE);
		createEAttribute(roleMapperEClass, ROLE_MAPPER__LOCAL_ROLE_NAME);
		createEAttribute(roleMapperEClass, ROLE_MAPPER__GLOBAL_ROLE_NAME);
		createEAttribute(roleMapperEClass, ROLE_MAPPER__FAKE_ROLE_NAME);

		recipesEClass = createEClass(RECIPES);
		createEAttribute(recipesEClass, RECIPES__UID);
		createEReference(recipesEClass, RECIPES__RECIPE);
		createEReference(recipesEClass, RECIPES__CONFIGURATIONS);
		createEReference(recipesEClass, RECIPES__INFRASTRUCTURES);
		createEReference(recipesEClass, RECIPES__PARENT);
		createEReference(recipesEClass, RECIPES__DEPLOYMENT);
		createEReference(recipesEClass, RECIPES__CONFIG_EXTENSION);
		createEReference(recipesEClass, RECIPES__ANY);

		deploymentSequenceEClass = createEClass(DEPLOYMENT_SEQUENCE);
		createEAttribute(deploymentSequenceEClass, DEPLOYMENT_SEQUENCE__UID);
		createEAttribute(deploymentSequenceEClass, DEPLOYMENT_SEQUENCE__NAME);
		createEReference(deploymentSequenceEClass, DEPLOYMENT_SEQUENCE__DEPLOYMENT_COMPONENTS);

		deploymentComponentsEClass = createEClass(DEPLOYMENT_COMPONENTS);
		createEAttribute(deploymentComponentsEClass, DEPLOYMENT_COMPONENTS__UID);
		createEReference(deploymentComponentsEClass, DEPLOYMENT_COMPONENTS__DEPLYMENT_STEP);
		createEReference(deploymentComponentsEClass, DEPLOYMENT_COMPONENTS__START_SEQ);
		createEReference(deploymentComponentsEClass, DEPLOYMENT_COMPONENTS__ANY);

		deploymentComponentEClass = createEClass(DEPLOYMENT_COMPONENT);
		createEAttribute(deploymentComponentEClass, DEPLOYMENT_COMPONENT__UID);
		createEAttribute(deploymentComponentEClass, DEPLOYMENT_COMPONENT__NAME);
		createEReference(deploymentComponentEClass, DEPLOYMENT_COMPONENT__MAPPER);
		createEReference(deploymentComponentEClass, DEPLOYMENT_COMPONENT__DEPLOYMENT_COMPONENT_LINK);

		deploymentStarStepEClass = createEClass(DEPLOYMENT_STAR_STEP);
		createEAttribute(deploymentStarStepEClass, DEPLOYMENT_STAR_STEP__UID);
		createEAttribute(deploymentStarStepEClass, DEPLOYMENT_STAR_STEP__NAME);
		createEReference(deploymentStarStepEClass, DEPLOYMENT_STAR_STEP__FIRST_STEP);

		usingMappersEClass = createEClass(USING_MAPPERS);
		createEReference(usingMappersEClass, USING_MAPPERS__MAPPERS);

		recipeEClass = createEClass(RECIPE);
		createEAttribute(recipeEClass, RECIPE__UID);
		createEReference(recipeEClass, RECIPE__PARENT);
		createEAttribute(recipeEClass, RECIPE__NAME);
		createEReference(recipeEClass, RECIPE__INGREDIENTS);
		createEReference(recipeEClass, RECIPE__INFRASTRUCTURES);
		createEReference(recipeEClass, RECIPE__DEPLOYMENT);

		configExtensionEClass = createEClass(CONFIG_EXTENSION);
		createEAttribute(configExtensionEClass, CONFIG_EXTENSION__UID);
		createEReference(configExtensionEClass, CONFIG_EXTENSION__SOURCE);
		createEReference(configExtensionEClass, CONFIG_EXTENSION__TARGET);

		ingredientEClass = createEClass(INGREDIENT);
		createEAttribute(ingredientEClass, INGREDIENT__UID);
		createEAttribute(ingredientEClass, INGREDIENT__NAME);
		createEReference(ingredientEClass, INGREDIENT__PARENT);
		createEReference(ingredientEClass, INGREDIENT__COMPONENTS);
		createEAttribute(ingredientEClass, INGREDIENT__LAYER);

		componentEClass = createEClass(COMPONENT);
		createEAttribute(componentEClass, COMPONENT__UID);
		createEAttribute(componentEClass, COMPONENT__NAME);
		createEReference(componentEClass, COMPONENT__PARENT);
		createEReference(componentEClass, COMPONENT__MAPPERS);
		createEAttribute(componentEClass, COMPONENT__COMPONENT_ROOT);

		javaComponentEClass = createEClass(JAVA_COMPONENT);
		createEAttribute(javaComponentEClass, JAVA_COMPONENT__ARTIFACT_ID);
		createEAttribute(javaComponentEClass, JAVA_COMPONENT__GROUP_ID);
		createEAttribute(javaComponentEClass, JAVA_COMPONENT__VERSION);
		createEAttribute(javaComponentEClass, JAVA_COMPONENT__BASE_PACKAGE);

		infrastructureEClass = createEClass(INFRASTRUCTURE);
		createEAttribute(infrastructureEClass, INFRASTRUCTURE__UID);
		createEReference(infrastructureEClass, INFRASTRUCTURE__RECIPE);
		createEAttribute(infrastructureEClass, INFRASTRUCTURE__NAME);
		createEReference(infrastructureEClass, INFRASTRUCTURE__RECIPE_CONFIG);

		configurationEClass = createEClass(CONFIGURATION);
		createEAttribute(configurationEClass, CONFIGURATION__UID);
		createEAttribute(configurationEClass, CONFIGURATION__NAME);
		createEReference(configurationEClass, CONFIGURATION__INFRASTRUCTURE);
		createEReference(configurationEClass, CONFIGURATION__PROPERTIES);

		modelMapperEClass = createEClass(MODEL_MAPPER);
		createEAttribute(modelMapperEClass, MODEL_MAPPER__NAME);
		createEAttribute(modelMapperEClass, MODEL_MAPPER__ARTIFACT_ROOT);
		createEReference(modelMapperEClass, MODEL_MAPPER__PARENT);
		createEReference(modelMapperEClass, MODEL_MAPPER__SPECIFIERS);
		createEReference(modelMapperEClass, MODEL_MAPPER__QUERIES);
		createEAttribute(modelMapperEClass, MODEL_MAPPER__ARTIFACT_EXECUTION_STRING);

		propertyEClass = createEClass(PROPERTY);
		createEAttribute(propertyEClass, PROPERTY__UID);
		createEReference(propertyEClass, PROPERTY__CONF_VAR_REF);
		createEAttribute(propertyEClass, PROPERTY__VALUE);
		createEAttribute(propertyEClass, PROPERTY__FAKE_NAME);

		mappingSpecifierEClass = createEClass(MAPPING_SPECIFIER);
		createEAttribute(mappingSpecifierEClass, MAPPING_SPECIFIER__UID);
		createEReference(mappingSpecifierEClass, MAPPING_SPECIFIER__SPECIFIER_REF);
		createEReference(mappingSpecifierEClass, MAPPING_SPECIFIER__VALUE_REF);

		queryEClass = createEClass(QUERY);
		createEAttribute(queryEClass, QUERY__UID);
		createEReference(queryEClass, QUERY__MODEL_QUERY);
		createEAttribute(queryEClass, QUERY__NAME);
		createEReference(queryEClass, QUERY__QUERY_REF);
		createEReference(queryEClass, QUERY__VARIABLES);

		queryVariableEClass = createEClass(QUERY_VARIABLE);
		createEAttribute(queryVariableEClass, QUERY_VARIABLE__UID);
		createEReference(queryVariableEClass, QUERY_VARIABLE__QUERY_PARAM_REF);
		createEAttribute(queryVariableEClass, QUERY_VARIABLE__VALUE);

		artifactRefEClass = createEClass(ARTIFACT_REF);
		createEAttribute(artifactRefEClass, ARTIFACT_REF__UID);
		createEReference(artifactRefEClass, ARTIFACT_REF__DOMAIN_ARTIFACT_REF);
		createEReference(artifactRefEClass, ARTIFACT_REF__ARTIFACT_REF);

		typePointerEClass = createEClass(TYPE_POINTER);
		createEReference(typePointerEClass, TYPE_POINTER__PACKAGE_REF);
		createEReference(typePointerEClass, TYPE_POINTER__TYPE_REF);
		createEAttribute(typePointerEClass, TYPE_POINTER__FAKE_PACKAGE_NAME);
		createEAttribute(typePointerEClass, TYPE_POINTER__FAKE_TYPE_NAME);

		typeDefinitionEClass = createEClass(TYPE_DEFINITION);
		createEAttribute(typeDefinitionEClass, TYPE_DEFINITION__UID);
		createEReference(typeDefinitionEClass, TYPE_DEFINITION__TYPES);
		createEReference(typeDefinitionEClass, TYPE_DEFINITION__PARENT);
		createEReference(typeDefinitionEClass, TYPE_DEFINITION__ANY);

		typeElementEClass = createEClass(TYPE_ELEMENT);
		createEAttribute(typeElementEClass, TYPE_ELEMENT__UID);
		createEAttribute(typeElementEClass, TYPE_ELEMENT__NAME);
		createEReference(typeElementEClass, TYPE_ELEMENT__PARENT);

		primitiveEClass = createEClass(PRIMITIVE);

		typeEClass = createEClass(TYPE);
		createEReference(typeEClass, TYPE__ATTRIBUTES);
		createEReference(typeEClass, TYPE__OPERATIONS);
		createEReference(typeEClass, TYPE__EXTENSION);

		typeReferenceEClass = createEClass(TYPE_REFERENCE);

		typeExtensionEClass = createEClass(TYPE_EXTENSION);
		createEAttribute(typeExtensionEClass, TYPE_EXTENSION__UID);
		createEReference(typeExtensionEClass, TYPE_EXTENSION__SOURCE);
		createEReference(typeExtensionEClass, TYPE_EXTENSION__TARGET);

		attributeEClass = createEClass(ATTRIBUTE);
		createEAttribute(attributeEClass, ATTRIBUTE__UID);
		createEAttribute(attributeEClass, ATTRIBUTE__NAME);
		createEAttribute(attributeEClass, ATTRIBUTE__PK);
		createEReference(attributeEClass, ATTRIBUTE__PARENT);

		operationEClass = createEClass(OPERATION);
		createEAttribute(operationEClass, OPERATION__UID);
		createEAttribute(operationEClass, OPERATION__NAME);
		createEReference(operationEClass, OPERATION__PARENT);
		createEReference(operationEClass, OPERATION__PARAMETERS);
		createEReference(operationEClass, OPERATION__RETURN_VALUE);

		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__UID);
		createEAttribute(parameterEClass, PARAMETER__NAME);
		createEAttribute(parameterEClass, PARAMETER__ORDER);
		createEReference(parameterEClass, PARAMETER__PARENT);

		returnValueEClass = createEClass(RETURN_VALUE);
		createEAttribute(returnValueEClass, RETURN_VALUE__UID);

		enumaratorEClass = createEClass(ENUMARATOR);
		createEReference(enumaratorEClass, ENUMARATOR__VALUES);

		enumAttributeEClass = createEClass(ENUM_ATTRIBUTE);
		createEAttribute(enumAttributeEClass, ENUM_ATTRIBUTE__UID);
		createEReference(enumAttributeEClass, ENUM_ATTRIBUTE__PARENT);
		createEAttribute(enumAttributeEClass, ENUM_ATTRIBUTE__NAME);
		createEAttribute(enumAttributeEClass, ENUM_ATTRIBUTE__VALUE);

		typesRepositoryEClass = createEClass(TYPES_REPOSITORY);
		createEAttribute(typesRepositoryEClass, TYPES_REPOSITORY__UID);
		createEReference(typesRepositoryEClass, TYPES_REPOSITORY__TYPE_DEFINITION);
		createEReference(typesRepositoryEClass, TYPES_REPOSITORY__PARENT);
		createEReference(typesRepositoryEClass, TYPES_REPOSITORY__ANY);

		typesEClass = createEClass(TYPES);
		createEAttribute(typesEClass, TYPES__UID);
		createEReference(typesEClass, TYPES__PARENT);
		createEAttribute(typesEClass, TYPES__NAME);
		createEReference(typesEClass, TYPES__PACKAGES);

		packageEClass = createEClass(PACKAGE);
		createEAttribute(packageEClass, PACKAGE__UID);
		createEAttribute(packageEClass, PACKAGE__NAME);
		createEReference(packageEClass, PACKAGE__TYPEDEFINITION);
		createEReference(packageEClass, PACKAGE__PARENT);

		uiPackageEClass = createEClass(UI_PACKAGE);
		createEAttribute(uiPackageEClass, UI_PACKAGE__UID);
		createEReference(uiPackageEClass, UI_PACKAGE__PARENT);
		createEReference(uiPackageEClass, UI_PACKAGE__FORMS);
		createEReference(uiPackageEClass, UI_PACKAGE__ANY);

		formEClass = createEClass(FORM);
		createEAttribute(formEClass, FORM__UID);
		createEAttribute(formEClass, FORM__NAME);
		createEReference(formEClass, FORM__VIEW);
		createEReference(formEClass, FORM__DATACONTROLS);
		createEReference(formEClass, FORM__PARAMETERS);

		formParameterEClass = createEClass(FORM_PARAMETER);
		createEAttribute(formParameterEClass, FORM_PARAMETER__UID);
		createEAttribute(formParameterEClass, FORM_PARAMETER__NAME);

		formViewEClass = createEClass(FORM_VIEW);
		createEAttribute(formViewEClass, FORM_VIEW__UID);
		createEAttribute(formViewEClass, FORM_VIEW__NAME);
		createEReference(formViewEClass, FORM_VIEW__VIEW);

		viewsEClass = createEClass(VIEWS);
		createEAttribute(viewsEClass, VIEWS__UID);
		createEReference(viewsEClass, VIEWS__PARENT);
		createEReference(viewsEClass, VIEWS__CANVASES);
		createEReference(viewsEClass, VIEWS__VIEW_INHERITANCES);
		createEReference(viewsEClass, VIEWS__TAB_PAGES_INHERITANCES);
		createEReference(viewsEClass, VIEWS__ANY);

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
		createEReference(viewAreaEClass, VIEW_AREA__CANVAS_VIEW);

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

		formDataControlsEClass = createEClass(FORM_DATA_CONTROLS);
		createEAttribute(formDataControlsEClass, FORM_DATA_CONTROLS__UID);
		createEAttribute(formDataControlsEClass, FORM_DATA_CONTROLS__NAME);
		createEReference(formDataControlsEClass, FORM_DATA_CONTROLS__FORM_CONTROL);

		canvasViewEClass = createEClass(CANVAS_VIEW);
		createEAttribute(canvasViewEClass, CANVAS_VIEW__UID);
		createEReference(canvasViewEClass, CANVAS_VIEW__PARENT);
		createEReference(canvasViewEClass, CANVAS_VIEW__BASE_CANVAS);
		createEReference(canvasViewEClass, CANVAS_VIEW__LINK_TO_LABELS);
		createEReference(canvasViewEClass, CANVAS_VIEW__LINK_TO_MESSAGES);
		createEReference(canvasViewEClass, CANVAS_VIEW__ANY);

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

		actioinTriggersEClass = createEClass(ACTIOIN_TRIGGERS);
		createEReference(actioinTriggersEClass, ACTIOIN_TRIGGERS__TRIGGERS);

		actionTriggerEClass = createEClass(ACTION_TRIGGER);
		createEAttribute(actionTriggerEClass, ACTION_TRIGGER__UID);

		uielementEClass = createEClass(UIELEMENT);
		createEAttribute(uielementEClass, UIELEMENT__UID);
		createEReference(uielementEClass, UIELEMENT__ENABLED);
		createEReference(uielementEClass, UIELEMENT__REQUIRED);
		createEReference(uielementEClass, UIELEMENT__READ_ONLY);
		createEReference(uielementEClass, UIELEMENT__REFRESH_AREAS);

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
		createEReference(buttonEClass, BUTTON__ICON);

		columnEClass = createEClass(COLUMN);
		createEAttribute(columnEClass, COLUMN__UID);
		createEAttribute(columnEClass, COLUMN__LABEL);
		createEReference(columnEClass, COLUMN__ELEMENT);

		tableEClass = createEClass(TABLE);
		createEAttribute(tableEClass, TABLE__LABEL);
		createEAttribute(tableEClass, TABLE__ROW_NUMBER);
		createEReference(tableEClass, TABLE__COLS);

		treeEClass = createEClass(TREE);
		createEAttribute(treeEClass, TREE__LABEL);
		createEReference(treeEClass, TREE__IMAGE);
		createEReference(treeEClass, TREE__COLS);

		controlsEClass = createEClass(CONTROLS);
		createEAttribute(controlsEClass, CONTROLS__UID);
		createEReference(controlsEClass, CONTROLS__PARENT);
		createEReference(controlsEClass, CONTROLS__ROOT);
		createEReference(controlsEClass, CONTROLS__CONTROLS);
		createEReference(controlsEClass, CONTROLS__RELATIONS);
		createEReference(controlsEClass, CONTROLS__DEPENDENCIES);
		createEReference(controlsEClass, CONTROLS__ANY);

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
		createEReference(dataControlEClass, DATA_CONTROL__PARENT);
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
		createEReference(artificialFieldEClass, ARTIFICIAL_FIELD__PARENT);

		linkEClass = createEClass(LINK);
		createEAttribute(linkEClass, LINK__UID);
		createEReference(linkEClass, LINK__PARENT);
		createEReference(linkEClass, LINK__MASTER_FIELD);
		createEReference(linkEClass, LINK__DETAIL_FIELD);

		applicationInfrastructureLayerEClass = createEClass(APPLICATION_INFRASTRUCTURE_LAYER);
		createEAttribute(applicationInfrastructureLayerEClass, APPLICATION_INFRASTRUCTURE_LAYER__UID);
		createEAttribute(applicationInfrastructureLayerEClass, APPLICATION_INFRASTRUCTURE_LAYER__NAME);
		createEReference(applicationInfrastructureLayerEClass, APPLICATION_INFRASTRUCTURE_LAYER__PARENT);
		createEReference(applicationInfrastructureLayerEClass, APPLICATION_INFRASTRUCTURE_LAYER__INFARASTRUCTURE);

		enterpriseInfrastructureEClass = createEClass(ENTERPRISE_INFRASTRUCTURE);
		createEAttribute(enterpriseInfrastructureEClass, ENTERPRISE_INFRASTRUCTURE__UID);
		createEReference(enterpriseInfrastructureEClass, ENTERPRISE_INFRASTRUCTURE__PARENT);
		createEReference(enterpriseInfrastructureEClass, ENTERPRISE_INFRASTRUCTURE__DATACENTERS);
		createEReference(enterpriseInfrastructureEClass, ENTERPRISE_INFRASTRUCTURE__INFRASTRUCTURE_CONNECTIONS);
		createEReference(enterpriseInfrastructureEClass, ENTERPRISE_INFRASTRUCTURE__ANY);

		datacenterEClass = createEClass(DATACENTER);
		createEAttribute(datacenterEClass, DATACENTER__UID);
		createEReference(datacenterEClass, DATACENTER__PARENT);
		createEReference(datacenterEClass, DATACENTER__SUBSYSTEMS);
		createEAttribute(datacenterEClass, DATACENTER__NAME);

		subsystemEClass = createEClass(SUBSYSTEM);
		createEAttribute(subsystemEClass, SUBSYSTEM__UID);
		createEAttribute(subsystemEClass, SUBSYSTEM__NAME);
		createEReference(subsystemEClass, SUBSYSTEM__PARENT);
		createEReference(subsystemEClass, SUBSYSTEM__INFRASTRUCTURE_LAYER);

		infrastructureLayerEClass = createEClass(INFRASTRUCTURE_LAYER);
		createEAttribute(infrastructureLayerEClass, INFRASTRUCTURE_LAYER__UID);
		createEAttribute(infrastructureLayerEClass, INFRASTRUCTURE_LAYER__NAME);
		createEReference(infrastructureLayerEClass, INFRASTRUCTURE_LAYER__PARENT);
		createEReference(infrastructureLayerEClass, INFRASTRUCTURE_LAYER__INFRASTRUCTURE_COMPONENT);

		infrastructureConnectionEClass = createEClass(INFRASTRUCTURE_CONNECTION);
		createEAttribute(infrastructureConnectionEClass, INFRASTRUCTURE_CONNECTION__UID);
		createEReference(infrastructureConnectionEClass, INFRASTRUCTURE_CONNECTION__MASTER);
		createEReference(infrastructureConnectionEClass, INFRASTRUCTURE_CONNECTION__DETAIL);

		infrastructureComponentEClass = createEClass(INFRASTRUCTURE_COMPONENT);
		createEAttribute(infrastructureComponentEClass, INFRASTRUCTURE_COMPONENT__UID);
		createEAttribute(infrastructureComponentEClass, INFRASTRUCTURE_COMPONENT__NAME);
		createEReference(infrastructureComponentEClass, INFRASTRUCTURE_COMPONENT__PARENT);

		serverEClass = createEClass(SERVER);

		routerEClass = createEClass(ROUTER);

		hubEClass = createEClass(HUB);

		storageEClass = createEClass(STORAGE);

		serverClasterEClass = createEClass(SERVER_CLASTER);
		createEReference(serverClasterEClass, SERVER_CLASTER__SERVERS);

		// Create enums
		platformLayersEEnum = createEEnum(PLATFORM_LAYERS);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		domainArtifactsEClass.getESuperTypes().add(this.getHTMLLayerHolder());
		domainApplicationsEClass.getESuperTypes().add(this.getHTMLLayerHolder());
		ormEntityEClass.getESuperTypes().add(this.getDomainArtifact());
		jpaServiceEClass.getESuperTypes().add(this.getDomainArtifact());
		ejbServiceEClass.getESuperTypes().add(this.getDomainArtifact());
		continuousIintegrationEClass.getESuperTypes().add(this.getDomainArtifact());
		applicationStyleEClass.getESuperTypes().add(this.getHTMLLayerHolder());
		applicationUILayerEClass.getESuperTypes().add(this.getHTMLLayerHolder());
		applicationRecipesEClass.getESuperTypes().add(this.getHTMLLayerHolder());
		applicationMappersEClass.getESuperTypes().add(this.getHTMLLayerHolder());
		methodPointerEClass.getESuperTypes().add(this.getTypePointer());
		messageLibraryEClass.getESuperTypes().add(this.getCategorized());
		typeMapperEClass.getESuperTypes().add(this.getMapper());
		typeMapperEClass.getESuperTypes().add(this.getTypePointer());
		javaMapperEClass.getESuperTypes().add(this.getTypeMapper());
		javaScriptMapperEClass.getESuperTypes().add(this.getTypeMapper());
		cssMapperEClass.getESuperTypes().add(this.getMapper());
		roleMapperEClass.getESuperTypes().add(this.getMapper());
		recipeEClass.getESuperTypes().add(this.getUsingMappers());
		ingredientEClass.getESuperTypes().add(this.getUsingMappers());
		ingredientEClass.getESuperTypes().add(this.getHTMLLayerHolder());
		componentEClass.getESuperTypes().add(this.getHTMLLayerHolder());
		javaComponentEClass.getESuperTypes().add(this.getComponent());
		modelMapperEClass.getESuperTypes().add(this.getArtifactRef());
		primitiveEClass.getESuperTypes().add(this.getTypeElement());
		typeEClass.getESuperTypes().add(this.getTypeElement());
		typeEClass.getESuperTypes().add(this.getCategorized());
		typeReferenceEClass.getESuperTypes().add(this.getTypeElement());
		typeReferenceEClass.getESuperTypes().add(this.getTypePointer());
		typeExtensionEClass.getESuperTypes().add(this.getCategorized());
		attributeEClass.getESuperTypes().add(this.getTypePointer());
		attributeEClass.getESuperTypes().add(this.getCategorized());
		operationEClass.getESuperTypes().add(this.getSecured());
		parameterEClass.getESuperTypes().add(this.getTypePointer());
		returnValueEClass.getESuperTypes().add(this.getTypePointer());
		enumaratorEClass.getESuperTypes().add(this.getTypeElement());
		typesEClass.getESuperTypes().add(this.getHTMLLayerHolder());
		formParameterEClass.getESuperTypes().add(this.getTypePointer());
		canvasFrameEClass.getESuperTypes().add(this.getStyleElement());
		viewPortHolderEClass.getESuperTypes().add(this.getHTMLLayerHolder());
		viewElementEClass.getESuperTypes().add(this.getStyleElement());
		viewElementEClass.getESuperTypes().add(this.getCategorized());
		viewElementEClass.getESuperTypes().add(this.getNickNamed());
		popupCanvasEClass.getESuperTypes().add(this.getCanvasFrame());
		popupCanvasEClass.getESuperTypes().add(this.getViewPortHolder());
		popupCanvasEClass.getESuperTypes().add(this.getDefaultCavas());
		popupCanvasEClass.getESuperTypes().add(this.getMultiLangLabel());
		popupCanvasEClass.getESuperTypes().add(this.getCategorized());
		popupCanvasEClass.getESuperTypes().add(this.getActioinTriggers());
		canvasEClass.getESuperTypes().add(this.getCanvasFrame());
		canvasEClass.getESuperTypes().add(this.getViewPortHolder());
		canvasEClass.getESuperTypes().add(this.getDefaultCavas());
		canvasEClass.getESuperTypes().add(this.getMultiLangLabel());
		canvasEClass.getESuperTypes().add(this.getCategorized());
		windowEClass.getESuperTypes().add(this.getCanvasFrame());
		windowEClass.getESuperTypes().add(this.getViewPortHolder());
		windowEClass.getESuperTypes().add(this.getMultiLangLabel());
		windowEClass.getESuperTypes().add(this.getCategorized());
		windowEClass.getESuperTypes().add(this.getSecured());
		tabCanvasEClass.getESuperTypes().add(this.getCanvasFrame());
		tabCanvasEClass.getESuperTypes().add(this.getDefaultCavas());
		tabCanvasEClass.getESuperTypes().add(this.getMultiLangLabel());
		tabCanvasEClass.getESuperTypes().add(this.getCategorized());
		tabPageEClass.getESuperTypes().add(this.getCanvasFrame());
		tabPageEClass.getESuperTypes().add(this.getViewPortHolder());
		tabPageEClass.getESuperTypes().add(this.getMultiLangLabel());
		tabPageEClass.getESuperTypes().add(this.getCategorized());
		tabPageEClass.getESuperTypes().add(this.getOrderable());
		viewPortEClass.getESuperTypes().add(this.getViewElement());
		viewPortEClass.getESuperTypes().add(this.getOrderable());
		viewAreaEClass.getESuperTypes().add(this.getViewElement());
		viewAreaEClass.getESuperTypes().add(this.getOrderable());
		viewPortTriggerEClass.getESuperTypes().add(this.getTrigger());
		contextEClass.getESuperTypes().add(this.getContextValue());
		contextEClass.getESuperTypes().add(this.getContextParameters());
		styleClassEClass.getESuperTypes().add(this.getContextValue());
		actionTriggerEClass.getESuperTypes().add(this.getTrigger());
		actionTriggerEClass.getESuperTypes().add(this.getCategorized());
		uielementEClass.getESuperTypes().add(this.getStyleElement());
		uielementEClass.getESuperTypes().add(this.getNickNamed());
		uielementEClass.getESuperTypes().add(this.getCategorized());
		uielementEClass.getESuperTypes().add(this.getOrderable());
		uielementEClass.getESuperTypes().add(this.getActioinTriggers());
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
		columnEClass.getESuperTypes().add(this.getStyleElement());
		columnEClass.getESuperTypes().add(this.getMultiLangLabel());
		columnEClass.getESuperTypes().add(this.getCategorized());
		columnEClass.getESuperTypes().add(this.getHTMLLayerHolder());
		columnEClass.getESuperTypes().add(this.getOrderable());
		tableEClass.getESuperTypes().add(this.getSourcesPointer());
		tableEClass.getESuperTypes().add(this.getHTMLLayerHolder());
		tableEClass.getESuperTypes().add(this.getMultiLangLabel());
		treeEClass.getESuperTypes().add(this.getSourcesPointer());
		treeEClass.getESuperTypes().add(this.getHTMLLayerHolder());
		treeEClass.getESuperTypes().add(this.getMultiLangLabel());
		triggerEClass.getESuperTypes().add(this.getMethodPointer());
		triggerEClass.getESuperTypes().add(this.getContextParameters());
		preFormTriggerEClass.getESuperTypes().add(this.getTrigger());
		preQueryTriggerEClass.getESuperTypes().add(this.getTrigger());
		postQueryTriggerEClass.getESuperTypes().add(this.getTrigger());
		preInsertTriggerEClass.getESuperTypes().add(this.getTrigger());
		preDeleteTriggerEClass.getESuperTypes().add(this.getTrigger());
		postCreateTriggerEClass.getESuperTypes().add(this.getTrigger());
		preUpdateTriggerEClass.getESuperTypes().add(this.getTrigger());
		createTriggerEClass.getESuperTypes().add(this.getTrigger());
		insertTriggerEClass.getESuperTypes().add(this.getTrigger());
		updateTriggerEClass.getESuperTypes().add(this.getTrigger());
		deleteTriggerEClass.getESuperTypes().add(this.getTrigger());
		searchTriggerEClass.getESuperTypes().add(this.getTrigger());
		formVariableEClass.getESuperTypes().add(this.getTypePointer());
		artificialFieldEClass.getESuperTypes().add(this.getTypePointer());
		datacenterEClass.getESuperTypes().add(this.getHTMLLayerHolder());
		serverEClass.getESuperTypes().add(this.getInfrastructureComponent());
		routerEClass.getESuperTypes().add(this.getInfrastructureComponent());
		hubEClass.getESuperTypes().add(this.getInfrastructureComponent());
		storageEClass.getESuperTypes().add(this.getInfrastructureComponent());
		serverClasterEClass.getESuperTypes().add(this.getInfrastructureComponent());

		// Initialize classes and features; add operations and parameters
		initEClass(domainEClass, Domain.class, "Domain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDomain_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_DomainArtifacts(), this.getDomainArtifacts(), this.getDomainArtifacts_Parent(), "domainArtifacts", null, 1, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_DomainTypes(), this.getDomainTypes(), this.getDomainTypes_Parent(), "domainTypes", null, 1, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_DomainApplications(), this.getDomainApplications(), this.getDomainApplications_Parent(), "domainApplications", null, 1, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_Any(), ecorePackage.getEObject(), null, "any", null, 0, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(htmlLayerHolderEClass, HTMLLayerHolder.class, "HTMLLayerHolder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHTMLLayerHolder_Columns(), ecorePackage.getEInt(), "columns", "1", 0, 1, HTMLLayerHolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(categorizedEClass, Categorized.class, "Categorized", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCategorized_Classifiers(), this.getClassifier(), null, "classifiers", null, 0, -1, Categorized.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classifierEClass, Classifier.class, "Classifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClassifier_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Classifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassifier_Hint(), this.getGenerationHint(), null, "hint", null, 0, 1, Classifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassifier_Details(), ecorePackage.getEString(), "details", null, 0, 1, Classifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(securedEClass, Secured.class, "Secured", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSecured_Grants(), this.getGrantAccess(), null, "grants", null, 0, -1, Secured.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(grantAccessEClass, GrantAccess.class, "GrantAccess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGrantAccess_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, GrantAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGrantAccess_ApplicationRef(), this.getDomainApplication(), null, "applicationRef", null, 0, 1, GrantAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGrantAccess_RoleRef(), this.getRole(), null, "roleRef", null, 0, 1, GrantAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domainArtifactsEClass, DomainArtifacts.class, "DomainArtifacts", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDomainArtifacts_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, DomainArtifacts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomainArtifacts_Name(), ecorePackage.getEString(), "name", null, 0, 1, DomainArtifacts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainArtifacts_Parent(), this.getDomain(), this.getDomain_DomainArtifacts(), "parent", null, 0, 1, DomainArtifacts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainArtifacts_DomainArtifact(), this.getDomainArtifact(), this.getDomainArtifact_Parent(), "domainArtifact", null, 0, -1, DomainArtifacts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domainTypesEClass, DomainTypes.class, "DomainTypes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDomainTypes_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, DomainTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomainTypes_Name(), ecorePackage.getEString(), "name", null, 0, 1, DomainTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainTypes_Typesrepository(), this.getTypesRepository(), this.getTypesRepository_Parent(), "typesrepository", null, 0, 1, DomainTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainTypes_Parent(), this.getDomain(), this.getDomain_DomainTypes(), "parent", null, 0, 1, DomainTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domainApplicationsEClass, DomainApplications.class, "DomainApplications", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDomainApplications_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, DomainApplications.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomainApplications_Name(), ecorePackage.getEString(), "name", null, 0, 1, DomainApplications.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainApplications_Applications(), this.getDomainApplication(), this.getDomainApplication_Parent(), "applications", null, 0, -1, DomainApplications.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainApplications_Parent(), this.getDomain(), this.getDomain_DomainApplications(), "parent", null, 0, 1, DomainApplications.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domainApplicationEClass, DomainApplication.class, "DomainApplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDomainApplication_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, DomainApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomainApplication_Name(), ecorePackage.getEString(), "name", null, 0, 1, DomainApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainApplication_Application(), this.getApplication(), this.getApplication_Parent(), "application", null, 0, 1, DomainApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainApplication_Parent(), this.getDomainApplications(), this.getDomainApplications_Applications(), "parent", null, 0, 1, DomainApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domainArtifactEClass, DomainArtifact.class, "DomainArtifact", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDomainArtifact_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, DomainArtifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomainArtifact_Name(), ecorePackage.getEString(), "name", null, 0, 1, DomainArtifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainArtifact_Parent(), this.getDomainArtifacts(), this.getDomainArtifacts_DomainArtifact(), "parent", null, 0, 1, DomainArtifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainArtifact_Artifact(), this.getArtifacts(), this.getArtifacts_Parent(), "artifact", null, 0, 1, DomainArtifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ormEntityEClass, ORMEntity.class, "ORMEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(jpaServiceEClass, JPAService.class, "JPAService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ejbServiceEClass, EJBService.class, "EJBService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(continuousIintegrationEClass, ContinuousIintegration.class, "ContinuousIintegration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(artifactsEClass, Artifacts.class, "Artifacts", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArtifacts_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Artifacts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArtifacts_Artifacts(), this.getArtifact(), this.getArtifact_Parent(), "artifacts", null, 0, -1, Artifacts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArtifacts_Parent(), this.getDomainArtifact(), this.getDomainArtifact_Artifact(), "parent", null, 0, 1, Artifacts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArtifacts_Any(), ecorePackage.getEObject(), null, "any", null, 0, 1, Artifacts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(artifactEClass, Artifact.class, "Artifact", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArtifact_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArtifact_Name(), ecorePackage.getEString(), "name", null, 0, 1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArtifact_Description(), ecorePackage.getEString(), "description", null, 0, 1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArtifact_Parent(), this.getArtifacts(), this.getArtifacts_Artifacts(), "parent", null, 0, 1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArtifact_ConfigVariables(), this.getConfigVariable(), this.getConfigVariable_Parent(), "configVariables", null, 0, -1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArtifact_ModelQuery(), this.getModelQuery(), this.getModelQuery_Parent(), "modelQuery", null, 0, -1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArtifact_Specifiers(), this.getSpecifier(), this.getSpecifier_Parent(), "specifiers", null, 0, -1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArtifact_Hints(), this.getGenerationHint(), null, "hints", null, 0, -1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArtifact_Template(), ecorePackage.getEString(), "template", null, 0, 1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(generationHintEClass, GenerationHint.class, "GenerationHint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGenerationHint_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, GenerationHint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenerationHint_Name(), ecorePackage.getEString(), "name", null, 0, 1, GenerationHint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenerationHint_ApplyedClass(), ecorePackage.getEString(), "applyedClass", null, 0, 1, GenerationHint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configVariableEClass, ConfigVariable.class, "ConfigVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConfigVariable_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, ConfigVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfigVariable_Name(), ecorePackage.getEString(), "name", null, 0, 1, ConfigVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfigVariable_Parent(), this.getArtifact(), this.getArtifact_ConfigVariables(), "parent", null, 0, 1, ConfigVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelQueryEClass, ModelQuery.class, "ModelQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelQuery_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, ModelQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelQuery_Name(), ecorePackage.getEString(), "name", null, 0, 1, ModelQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelQuery_Query(), ecorePackage.getEString(), "query", null, 0, 1, ModelQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelQuery_Parent(), this.getArtifact(), this.getArtifact_ModelQuery(), "parent", null, 0, 1, ModelQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelQuery_Parameters(), this.getQueryParameter(), this.getQueryParameter_Parent(), "parameters", null, 0, -1, ModelQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(queryParameterEClass, QueryParameter.class, "QueryParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQueryParameter_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, QueryParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQueryParameter_Parent(), this.getModelQuery(), this.getModelQuery_Parameters(), "parent", null, 0, 1, QueryParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueryParameter_Name(), ecorePackage.getEString(), "name", null, 0, 1, QueryParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(specifierEClass, Specifier.class, "Specifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpecifier_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Specifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecifier_Name(), ecorePackage.getEString(), "name", null, 0, 1, Specifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecifier_Parent(), this.getArtifact(), this.getArtifact_Specifiers(), "parent", null, 0, 1, Specifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecifier_Options(), this.getOption(), this.getOption_Parent(), "options", null, 1, -1, Specifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(optionEClass, Option.class, "Option", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOption_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOption_Parent(), this.getSpecifier(), this.getSpecifier_Options(), "parent", null, 0, 1, Option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOption_Value(), ecorePackage.getEString(), "value", null, 0, 1, Option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(applicationEClass, Application.class, "Application", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getApplication_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplication_ApplicationRecipes(), this.getApplicationRecipes(), this.getApplicationRecipes_Parent(), "applicationRecipes", null, 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplication_ApplicationMappers(), this.getApplicationMappers(), this.getApplicationMappers_Parent(), "applicationMappers", null, 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplication_ApplicationUILayer(), this.getApplicationUILayer(), this.getApplicationUILayer_Parent(), "applicationUILayer", null, 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplication_ApplicationInfrastructureLayer(), this.getApplicationInfrastructureLayer(), this.getApplicationInfrastructureLayer_Parent(), "applicationInfrastructureLayer", null, 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplication_ApplicationStyle(), this.getApplicationStyle(), this.getApplicationStyle_Parent(), "applicationStyle", null, 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplication_ApplicationRole(), this.getApplicationRole(), this.getApplicationRole_Parent(), "applicationRole", null, 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplication_ApplicationMessages(), this.getApplicationMessages(), this.getApplicationMessages_Parent(), "applicationMessages", null, 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplication_Parent(), this.getDomainApplication(), this.getDomainApplication_Application(), "parent", null, 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplication_Any(), ecorePackage.getEObject(), null, "any", null, 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(applicationMessagesEClass, ApplicationMessages.class, "ApplicationMessages", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getApplicationMessages_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, ApplicationMessages.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplicationMessages_Name(), ecorePackage.getEString(), "name", null, 0, 1, ApplicationMessages.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplicationMessages_Parent(), this.getApplication(), this.getApplication_ApplicationMessages(), "parent", null, 0, 1, ApplicationMessages.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplicationMessages_Messages(), this.getMessages(), this.getMessages_Parent(), "messages", null, 0, 1, ApplicationMessages.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(applicationRoleEClass, ApplicationRole.class, "ApplicationRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getApplicationRole_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, ApplicationRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplicationRole_Name(), ecorePackage.getEString(), "name", null, 0, 1, ApplicationRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplicationRole_Parent(), this.getApplication(), this.getApplication_ApplicationRole(), "parent", null, 0, 1, ApplicationRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplicationRole_Roles(), this.getRoles(), this.getRoles_Parent(), "roles", null, 0, 1, ApplicationRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(applicationStyleEClass, ApplicationStyle.class, "ApplicationStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getApplicationStyle_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, ApplicationStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplicationStyle_Name(), ecorePackage.getEString(), "name", null, 0, 1, ApplicationStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplicationStyle_Parent(), this.getApplication(), this.getApplication_ApplicationStyle(), "parent", null, 0, 1, ApplicationStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplicationStyle_StylesPackage(), this.getStylesPackage(), this.getStylesPackage_Parent(), "stylesPackage", null, 0, -1, ApplicationStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stylesPackageEClass, StylesPackage.class, "StylesPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStylesPackage_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, StylesPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStylesPackage_Name(), ecorePackage.getEString(), "name", null, 0, 1, StylesPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStylesPackage_Parent(), this.getApplicationStyle(), this.getApplicationStyle_StylesPackage(), "parent", null, 0, 1, StylesPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStylesPackage_Styles(), this.getStyles(), this.getStyles_Parent(), "styles", null, 0, 1, StylesPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(applicationUILayerEClass, ApplicationUILayer.class, "ApplicationUILayer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getApplicationUILayer_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, ApplicationUILayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplicationUILayer_Name(), ecorePackage.getEString(), "name", null, 0, 1, ApplicationUILayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplicationUILayer_Parent(), this.getApplication(), this.getApplication_ApplicationUILayer(), "parent", null, 0, 1, ApplicationUILayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplicationUILayer_ApplicationUIPackages(), this.getApplicationUIPackage(), this.getApplicationUIPackage_Parent(), "applicationUIPackages", null, 0, -1, ApplicationUILayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(applicationUIPackageEClass, ApplicationUIPackage.class, "ApplicationUIPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getApplicationUIPackage_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, ApplicationUIPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplicationUIPackage_Name(), ecorePackage.getEString(), "name", null, 0, 1, ApplicationUIPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplicationUIPackage_Parent(), this.getApplicationUILayer(), this.getApplicationUILayer_ApplicationUIPackages(), "parent", null, 0, 1, ApplicationUIPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplicationUIPackage_Uipackage(), this.getUIPackage(), this.getUIPackage_Parent(), "uipackage", null, 0, 1, ApplicationUIPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(applicationRecipesEClass, ApplicationRecipes.class, "ApplicationRecipes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getApplicationRecipes_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, ApplicationRecipes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplicationRecipes_Name(), ecorePackage.getEString(), "name", null, 0, 1, ApplicationRecipes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplicationRecipes_Parent(), this.getApplication(), this.getApplication_ApplicationRecipes(), "parent", null, 0, 1, ApplicationRecipes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplicationRecipes_Recipes(), this.getApplicationRecipe(), this.getApplicationRecipe_Parent(), "recipes", null, 0, -1, ApplicationRecipes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(applicationRecipeEClass, ApplicationRecipe.class, "ApplicationRecipe", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getApplicationRecipe_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, ApplicationRecipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplicationRecipe_Name(), ecorePackage.getEString(), "name", null, 0, 1, ApplicationRecipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplicationRecipe_Recipes(), this.getRecipes(), this.getRecipes_Parent(), "recipes", null, 0, 1, ApplicationRecipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplicationRecipe_Parent(), this.getApplicationRecipes(), this.getApplicationRecipes_Recipes(), "parent", null, 0, 1, ApplicationRecipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(applicationMappersEClass, ApplicationMappers.class, "ApplicationMappers", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getApplicationMappers_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, ApplicationMappers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplicationMappers_Name(), ecorePackage.getEString(), "name", null, 0, 1, ApplicationMappers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplicationMappers_Parent(), this.getApplication(), this.getApplication_ApplicationMappers(), "parent", null, 0, 1, ApplicationMappers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplicationMappers_Mappers(), this.getApplicationMapper(), this.getApplicationMapper_Parent(), "mappers", null, 0, -1, ApplicationMappers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(applicationMapperEClass, ApplicationMapper.class, "ApplicationMapper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getApplicationMapper_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, ApplicationMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplicationMapper_Name(), ecorePackage.getEString(), "name", null, 0, 1, ApplicationMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplicationMapper_Mapper(), this.getMappers(), this.getMappers_Parent(), "mapper", null, 0, 1, ApplicationMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplicationMapper_Parent(), this.getApplicationMappers(), this.getApplicationMappers_Mappers(), "parent", null, 0, 1, ApplicationMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(methodPointerEClass, MethodPointer.class, "MethodPointer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMethodPointer_MethodRef(), this.getOperation(), null, "methodRef", null, 0, 1, MethodPointer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethodPointer_FakeMethod(), ecorePackage.getEString(), "fakeMethod", null, 0, 1, MethodPointer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(messagesEClass, Messages.class, "Messages", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMessages_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Messages.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessages_Parent(), this.getApplicationMessages(), this.getApplicationMessages_Messages(), "parent", null, 0, 1, Messages.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessages_MessageLibraries(), this.getMessageLibrary(), null, "messageLibraries", null, 0, -1, Messages.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessages_Languages(), this.getLanguage(), null, "languages", null, 0, -1, Messages.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessages_Any(), ecorePackage.getEObject(), null, "any", null, 0, 1, Messages.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(messageLibraryEClass, MessageLibrary.class, "MessageLibrary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMessageLibrary_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, MessageLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessageLibrary_Name(), ecorePackage.getEString(), "name", null, 0, 1, MessageLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessageLibrary_LibLanguages(), this.getLanguageRef(), null, "libLanguages", null, 0, -1, MessageLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessageLibrary_Messages(), this.getMessage(), null, "messages", null, 0, -1, MessageLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(languageRefEClass, LanguageRef.class, "LanguageRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLanguageRef_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, LanguageRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLanguageRef_Lang(), this.getLanguage(), null, "lang", null, 0, 1, LanguageRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(messageEClass, Message.class, "Message", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMessage_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessage_Name(), ecorePackage.getEString(), "name", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessage_Translatioins(), this.getTranslation(), null, "translatioins", null, 0, -1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(translationEClass, Translation.class, "Translation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTranslation_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Translation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTranslation_Translation(), ecorePackage.getEString(), "translation", null, 0, 1, Translation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTranslation_Lang(), this.getLanguageRef(), null, "lang", null, 0, 1, Translation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(languageEClass, Language.class, "Language", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLanguage_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Language.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLanguage_Lang(), ecorePackage.getEString(), "lang", null, 0, 1, Language.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLanguage_Code(), ecorePackage.getEString(), "code", null, 0, 1, Language.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLanguage_DefaultLang(), ecorePackage.getEBoolean(), "defaultLang", null, 0, 1, Language.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rolesEClass, Roles.class, "Roles", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoles_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Roles.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoles_Parent(), this.getApplicationRole(), this.getApplicationRole_Roles(), "parent", null, 0, 1, Roles.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoles_Roles(), this.getRole(), null, "roles", null, 0, -1, Roles.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoles_Groups(), this.getGroup(), null, "groups", null, 0, -1, Roles.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoles_Any(), ecorePackage.getEObject(), null, "any", null, 0, 1, Roles.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleEClass, Role.class, "Role", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRole_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRole_Name(), ecorePackage.getEString(), "name", null, 0, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(groupEClass, Group.class, "Group", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGroup_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroup_Name(), ecorePackage.getEString(), "name", null, 0, 1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGroup_Group2Group(), this.getGroup(), null, "group2Group", null, 0, -1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGroup_Group2Role(), this.getRole(), null, "group2Role", null, 0, -1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stylesEClass, Styles.class, "Styles", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStyles_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Styles.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStyles_Parent(), this.getStylesPackage(), this.getStylesPackage_Styles(), "parent", null, 0, 1, Styles.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStyles_Libraries(), this.getStyleLibrary(), null, "libraries", null, 0, -1, Styles.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStyles_Any(), ecorePackage.getEObject(), null, "any", null, 0, 1, Styles.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(styleLibraryEClass, StyleLibrary.class, "StyleLibrary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStyleLibrary_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, StyleLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStyleLibrary_Name(), ecorePackage.getEString(), "name", null, 0, 1, StyleLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStyleLibrary_Styles(), this.getStyleSet(), null, "styles", null, 0, -1, StyleLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(styleSetEClass, StyleSet.class, "StyleSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStyleSet_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, StyleSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStyleSet_Name(), ecorePackage.getEString(), "name", null, 0, 1, StyleSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mappersEClass, Mappers.class, "Mappers", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMappers_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Mappers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMappers_Mappers(), this.getMapper(), this.getMapper_Parent(), "mappers", null, 0, -1, Mappers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMappers_Parent(), this.getApplicationMapper(), this.getApplicationMapper_Mapper(), "parent", null, 0, 1, Mappers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMappers_Any(), ecorePackage.getEObject(), null, "any", null, 0, 1, Mappers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mapperEClass, Mapper.class, "Mapper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMapper_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Mapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMapper_Parent(), this.getMappers(), this.getMappers_Mappers(), "parent", null, 0, 1, Mapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMapper_ServiceLayer(), ecorePackage.getEBoolean(), "serviceLayer", null, 0, 1, Mapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMapper_UiLayer(), ecorePackage.getEBoolean(), "uiLayer", null, 0, 1, Mapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeMapperEClass, TypeMapper.class, "TypeMapper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(javaMapperEClass, JavaMapper.class, "JavaMapper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJavaMapper_MappedToPackageName(), ecorePackage.getEString(), "mappedToPackageName", null, 0, 1, JavaMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaMapper_MappedToClassName(), ecorePackage.getEString(), "mappedToClassName", null, 0, 1, JavaMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaMapper_ArtifactId(), ecorePackage.getEString(), "artifactId", null, 0, 1, JavaMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaMapper_GroupId(), ecorePackage.getEString(), "groupId", null, 0, 1, JavaMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaMapper_Version(), ecorePackage.getEString(), "version", null, 0, 1, JavaMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaMapper_LibraryName(), ecorePackage.getEString(), "libraryName", null, 0, 1, JavaMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaMapper_ArtifactType(), ecorePackage.getEString(), "artifactType", "jar", 0, 1, JavaMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(javaScriptMapperEClass, JavaScriptMapper.class, "JavaScriptMapper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJavaScriptMapper_LibraryUrl(), ecorePackage.getEString(), "libraryUrl", null, 0, 1, JavaScriptMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cssMapperEClass, CSSMapper.class, "CSSMapper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCSSMapper_LibraryUrl(), ecorePackage.getEString(), "libraryUrl", null, 0, 1, CSSMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSSMapper_StylePackage(), this.getStylesPackage(), null, "stylePackage", null, 0, 1, CSSMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSSMapper_StyleLibrary(), this.getStyleLibrary(), null, "styleLibrary", null, 0, 1, CSSMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSSMapper_FakePackageName(), ecorePackage.getEString(), "fakePackageName", null, 0, 1, CSSMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSSMapper_FakeTypeName(), ecorePackage.getEString(), "fakeTypeName", null, 0, 1, CSSMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleMapperEClass, RoleMapper.class, "RoleMapper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoleMapper_Role(), ecorePackage.getEObject(), null, "role", null, 0, 1, RoleMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoleMapper_LocalRoleName(), ecorePackage.getEString(), "localRoleName", null, 0, 1, RoleMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoleMapper_GlobalRoleName(), ecorePackage.getEString(), "globalRoleName", null, 0, 1, RoleMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoleMapper_FakeRoleName(), ecorePackage.getEString(), "fakeRoleName", null, 0, 1, RoleMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(recipesEClass, Recipes.class, "Recipes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRecipes_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Recipes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRecipes_Recipe(), this.getRecipe(), this.getRecipe_Parent(), "recipe", null, 0, 1, Recipes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRecipes_Configurations(), this.getConfiguration(), null, "configurations", null, 0, -1, Recipes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRecipes_Infrastructures(), this.getInfrastructure(), null, "infrastructures", null, 0, -1, Recipes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRecipes_Parent(), this.getApplicationRecipe(), this.getApplicationRecipe_Recipes(), "parent", null, 0, 1, Recipes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRecipes_Deployment(), this.getDeploymentSequence(), null, "deployment", null, 0, 1, Recipes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRecipes_ConfigExtension(), this.getConfigExtension(), null, "configExtension", null, 0, -1, Recipes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRecipes_Any(), ecorePackage.getEObject(), null, "any", null, 0, 1, Recipes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deploymentSequenceEClass, DeploymentSequence.class, "DeploymentSequence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeploymentSequence_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, DeploymentSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeploymentSequence_Name(), ecorePackage.getEString(), "name", null, 0, 1, DeploymentSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeploymentSequence_DeploymentComponents(), this.getDeploymentComponents(), null, "deploymentComponents", null, 0, 1, DeploymentSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deploymentComponentsEClass, DeploymentComponents.class, "DeploymentComponents", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeploymentComponents_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, DeploymentComponents.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeploymentComponents_DeplymentStep(), this.getDeploymentComponent(), null, "deplymentStep", null, 0, -1, DeploymentComponents.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeploymentComponents_StartSeq(), this.getDeploymentStarStep(), null, "startSeq", null, 0, 1, DeploymentComponents.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeploymentComponents_Any(), ecorePackage.getEObject(), null, "any", null, 0, 1, DeploymentComponents.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deploymentComponentEClass, DeploymentComponent.class, "DeploymentComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeploymentComponent_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, DeploymentComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeploymentComponent_Name(), ecorePackage.getEString(), "name", null, 0, 1, DeploymentComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeploymentComponent_Mapper(), this.getModelMapper(), null, "mapper", null, 0, 1, DeploymentComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeploymentComponent_DeploymentComponentLink(), this.getDeploymentComponent(), null, "deploymentComponentLink", null, 0, 1, DeploymentComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deploymentStarStepEClass, DeploymentStarStep.class, "DeploymentStarStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeploymentStarStep_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, DeploymentStarStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeploymentStarStep_Name(), ecorePackage.getEString(), "name", null, 0, 1, DeploymentStarStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeploymentStarStep_FirstStep(), this.getDeploymentComponent(), null, "firstStep", null, 0, 1, DeploymentStarStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(usingMappersEClass, UsingMappers.class, "UsingMappers", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUsingMappers_Mappers(), this.getApplicationMapper(), null, "mappers", null, 0, -1, UsingMappers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(recipeEClass, Recipe.class, "Recipe", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRecipe_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Recipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRecipe_Parent(), this.getRecipes(), this.getRecipes_Recipe(), "parent", null, 0, 1, Recipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecipe_Name(), ecorePackage.getEString(), "name", null, 0, 1, Recipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRecipe_Ingredients(), this.getIngredient(), this.getIngredient_Parent(), "ingredients", null, 0, -1, Recipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRecipe_Infrastructures(), this.getInfrastructure(), this.getInfrastructure_Recipe(), "infrastructures", null, 0, -1, Recipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRecipe_Deployment(), this.getDeploymentSequence(), null, "deployment", null, 0, 1, Recipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configExtensionEClass, ConfigExtension.class, "ConfigExtension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConfigExtension_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, ConfigExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfigExtension_Source(), this.getConfiguration(), null, "source", null, 0, 1, ConfigExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfigExtension_Target(), this.getConfiguration(), null, "target", null, 0, 1, ConfigExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ingredientEClass, Ingredient.class, "Ingredient", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIngredient_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Ingredient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIngredient_Name(), ecorePackage.getEString(), "name", null, 0, 1, Ingredient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIngredient_Parent(), this.getRecipe(), this.getRecipe_Ingredients(), "parent", null, 0, 1, Ingredient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIngredient_Components(), this.getComponent(), this.getComponent_Parent(), "components", null, 0, -1, Ingredient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIngredient_Layer(), this.getPlatformLayers(), "layer", null, 0, 1, Ingredient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentEClass, Component.class, "Component", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponent_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_Name(), ecorePackage.getEString(), "name", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_Parent(), this.getIngredient(), this.getIngredient_Components(), "parent", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_Mappers(), this.getModelMapper(), this.getModelMapper_Parent(), "mappers", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_ComponentRoot(), ecorePackage.getEString(), "componentRoot", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(javaComponentEClass, JavaComponent.class, "JavaComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJavaComponent_ArtifactId(), ecorePackage.getEString(), "artifactId", null, 0, 1, JavaComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaComponent_GroupId(), ecorePackage.getEString(), "groupId", null, 0, 1, JavaComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaComponent_Version(), ecorePackage.getEString(), "version", null, 0, 1, JavaComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaComponent_BasePackage(), ecorePackage.getEString(), "basePackage", null, 0, 1, JavaComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(infrastructureEClass, Infrastructure.class, "Infrastructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInfrastructure_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Infrastructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInfrastructure_Recipe(), this.getRecipe(), this.getRecipe_Infrastructures(), "recipe", null, 0, 1, Infrastructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInfrastructure_Name(), ecorePackage.getEString(), "name", null, 0, 1, Infrastructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInfrastructure_RecipeConfig(), this.getConfiguration(), this.getConfiguration_Infrastructure(), "recipeConfig", null, 0, 1, Infrastructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configurationEClass, Configuration.class, "Configuration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConfiguration_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfiguration_Name(), ecorePackage.getEString(), "name", null, 0, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfiguration_Infrastructure(), this.getInfrastructure(), this.getInfrastructure_RecipeConfig(), "infrastructure", null, 0, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfiguration_Properties(), this.getProperty(), null, "properties", null, 0, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelMapperEClass, ModelMapper.class, "ModelMapper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelMapper_Name(), ecorePackage.getEString(), "name", null, 0, 1, ModelMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelMapper_ArtifactRoot(), ecorePackage.getEString(), "artifactRoot", null, 0, 1, ModelMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelMapper_Parent(), this.getComponent(), this.getComponent_Mappers(), "parent", null, 0, 1, ModelMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelMapper_Specifiers(), this.getMappingSpecifier(), null, "specifiers", null, 0, -1, ModelMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelMapper_Queries(), this.getQuery(), null, "queries", null, 0, -1, ModelMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelMapper_ArtifactExecutionString(), ecorePackage.getEString(), "artifactExecutionString", null, 0, 1, ModelMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProperty_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProperty_ConfVarRef(), this.getConfigVariable(), null, "confVarRef", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Value(), ecorePackage.getEString(), "value", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_FakeName(), ecorePackage.getEString(), "fakeName", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mappingSpecifierEClass, MappingSpecifier.class, "MappingSpecifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMappingSpecifier_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, MappingSpecifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMappingSpecifier_SpecifierRef(), this.getSpecifier(), null, "specifierRef", null, 0, 1, MappingSpecifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMappingSpecifier_ValueRef(), this.getOption(), null, "valueRef", null, 0, 1, MappingSpecifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(queryEClass, Query.class, "Query", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQuery_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Query.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuery_ModelQuery(), this.getModelQuery(), null, "modelQuery", null, 0, 1, Query.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuery_Name(), ecorePackage.getEString(), "name", null, 0, 1, Query.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuery_QueryRef(), this.getModelQuery(), null, "queryRef", null, 0, 1, Query.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuery_Variables(), this.getQueryVariable(), null, "variables", null, 0, -1, Query.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(queryVariableEClass, QueryVariable.class, "QueryVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQueryVariable_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, QueryVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQueryVariable_QueryParamRef(), this.getQueryParameter(), null, "queryParamRef", null, 0, 1, QueryVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueryVariable_Value(), ecorePackage.getEString(), "value", null, 0, 1, QueryVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(artifactRefEClass, ArtifactRef.class, "ArtifactRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArtifactRef_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, ArtifactRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArtifactRef_DomainArtifactRef(), this.getDomainArtifact(), null, "domainArtifactRef", null, 0, 1, ArtifactRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArtifactRef_ArtifactRef(), this.getArtifact(), null, "artifactRef", null, 0, 1, ArtifactRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typePointerEClass, TypePointer.class, "TypePointer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypePointer_PackageRef(), this.getPackage(), null, "packageRef", null, 0, 1, TypePointer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypePointer_TypeRef(), this.getTypeElement(), null, "typeRef", null, 0, 1, TypePointer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypePointer_FakePackageName(), ecorePackage.getEString(), "fakePackageName", null, 0, 1, TypePointer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypePointer_FakeTypeName(), ecorePackage.getEString(), "fakeTypeName", null, 0, 1, TypePointer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeDefinitionEClass, TypeDefinition.class, "TypeDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypeDefinition_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, TypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeDefinition_Types(), this.getTypeElement(), this.getTypeElement_Parent(), "types", null, 0, -1, TypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeDefinition_Parent(), this.getPackage(), this.getPackage_Typedefinition(), "parent", null, 0, 1, TypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeDefinition_Any(), ecorePackage.getEObject(), null, "any", null, 0, 1, TypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeElementEClass, TypeElement.class, "TypeElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypeElement_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, TypeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypeElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, TypeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeElement_Parent(), this.getTypeDefinition(), this.getTypeDefinition_Types(), "parent", null, 0, 1, TypeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(primitiveEClass, Primitive.class, "Primitive", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(typeEClass, Type.class, "Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getType_Attributes(), this.getAttribute(), this.getAttribute_Parent(), "attributes", null, 0, -1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getType_Operations(), this.getOperation(), this.getOperation_Parent(), "operations", null, 0, -1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getType_Extension(), this.getTypeExtension(), null, "extension", null, 0, -1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeReferenceEClass, TypeReference.class, "TypeReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(typeExtensionEClass, TypeExtension.class, "TypeExtension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypeExtension_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, TypeExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeExtension_Source(), this.getTypeElement(), null, "source", null, 0, 1, TypeExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeExtension_Target(), this.getTypeElement(), null, "target", null, 0, 1, TypeExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttribute_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_Name(), ecorePackage.getEString(), "name", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_Pk(), ecorePackage.getEBoolean(), "pk", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttribute_Parent(), this.getType(), this.getType_Attributes(), "parent", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperation_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperation_Name(), ecorePackage.getEString(), "name", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_Parent(), this.getType(), this.getType_Operations(), "parent", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_Parameters(), this.getParameter(), this.getParameter_Parent(), "parameters", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_ReturnValue(), this.getReturnValue(), null, "returnValue", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Name(), ecorePackage.getEString(), "name", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Order(), ecorePackage.getEInt(), "order", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameter_Parent(), this.getOperation(), this.getOperation_Parameters(), "parent", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(returnValueEClass, ReturnValue.class, "ReturnValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReturnValue_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, ReturnValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumaratorEClass, Enumarator.class, "Enumarator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumarator_Values(), this.getEnumAttribute(), this.getEnumAttribute_Parent(), "values", null, 0, -1, Enumarator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumAttributeEClass, EnumAttribute.class, "EnumAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnumAttribute_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, EnumAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnumAttribute_Parent(), this.getEnumarator(), this.getEnumarator_Values(), "parent", null, 0, 1, EnumAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnumAttribute_Name(), ecorePackage.getEString(), "name", null, 0, 1, EnumAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnumAttribute_Value(), ecorePackage.getEString(), "value", null, 0, 1, EnumAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typesRepositoryEClass, TypesRepository.class, "TypesRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypesRepository_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, TypesRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypesRepository_TypeDefinition(), this.getTypes(), this.getTypes_Parent(), "typeDefinition", null, 1, 1, TypesRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypesRepository_Parent(), this.getDomainTypes(), this.getDomainTypes_Typesrepository(), "parent", null, 0, 1, TypesRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypesRepository_Any(), ecorePackage.getEObject(), null, "any", null, 0, 1, TypesRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typesEClass, Types.class, "Types", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypes_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Types.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypes_Parent(), this.getTypesRepository(), this.getTypesRepository_TypeDefinition(), "parent", null, 0, 1, Types.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypes_Name(), ecorePackage.getEString(), "name", null, 0, 1, Types.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypes_Packages(), this.getPackage(), this.getPackage_Parent(), "packages", null, 0, -1, Types.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(packageEClass, domain.Package.class, "Package", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPackage_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, domain.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackage_Name(), ecorePackage.getEString(), "name", null, 0, 1, domain.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackage_Typedefinition(), this.getTypeDefinition(), this.getTypeDefinition_Parent(), "typedefinition", null, 0, 1, domain.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackage_Parent(), this.getTypes(), this.getTypes_Packages(), "parent", null, 0, 1, domain.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiPackageEClass, UIPackage.class, "UIPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUIPackage_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, UIPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUIPackage_Parent(), this.getApplicationUIPackage(), this.getApplicationUIPackage_Uipackage(), "parent", null, 0, 1, UIPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUIPackage_Forms(), this.getForm(), null, "forms", null, 0, -1, UIPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUIPackage_Any(), ecorePackage.getEObject(), null, "any", null, 0, 1, UIPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formEClass, Form.class, "Form", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getForm_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Form.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForm_Name(), ecorePackage.getEString(), "name", null, 0, 1, Form.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForm_View(), this.getFormView(), null, "view", null, 0, 1, Form.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForm_Datacontrols(), this.getFormDataControls(), null, "datacontrols", null, 0, 1, Form.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForm_Parameters(), this.getFormParameter(), null, "parameters", null, 0, -1, Form.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formParameterEClass, FormParameter.class, "FormParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFormParameter_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, FormParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormParameter_Name(), ecorePackage.getEString(), "name", null, 0, 1, FormParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formViewEClass, FormView.class, "FormView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFormView_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, FormView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormView_Name(), ecorePackage.getEString(), "name", null, 0, 1, FormView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFormView_View(), this.getViews(), this.getViews_Parent(), "view", null, 0, 1, FormView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewsEClass, Views.class, "Views", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getViews_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Views.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getViews_Parent(), this.getFormView(), this.getFormView_View(), "parent", null, 0, 1, Views.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getViews_Canvases(), this.getCanvasFrame(), null, "canvases", null, 0, -1, Views.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getViews_ViewInheritances(), this.getViewInheritance(), null, "viewInheritances", null, 0, -1, Views.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getViews_TabPagesInheritances(), this.getTabPagesInheritance(), null, "tabPagesInheritances", null, 0, -1, Views.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getViews_Any(), ecorePackage.getEObject(), null, "any", null, 0, 1, Views.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		initEReference(getViewArea_CanvasView(), this.getCanvasView(), this.getCanvasView_Parent(), "canvasView", null, 0, 1, ViewArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		initEClass(formDataControlsEClass, FormDataControls.class, "FormDataControls", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFormDataControls_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, FormDataControls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormDataControls_Name(), ecorePackage.getEString(), "name", null, 0, 1, FormDataControls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFormDataControls_FormControl(), this.getControls(), this.getControls_Parent(), "formControl", null, 0, 1, FormDataControls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(canvasViewEClass, CanvasView.class, "CanvasView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCanvasView_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, CanvasView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCanvasView_Parent(), this.getViewArea(), this.getViewArea_CanvasView(), "parent", null, 0, 1, CanvasView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCanvasView_BaseCanvas(), this.getLayerHolder(), null, "baseCanvas", null, 0, 1, CanvasView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCanvasView_LinkToLabels(), this.getLinkToLabel(), null, "linkToLabels", null, 0, -1, CanvasView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCanvasView_LinkToMessages(), this.getLinkToMessage(), null, "linkToMessages", null, 0, -1, CanvasView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCanvasView_Any(), ecorePackage.getEObject(), null, "any", null, 0, 1, CanvasView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		initEReference(getStyleClass_Classifier(), this.getClassifier(), null, "classifier", null, 0, 1, StyleClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nickNamedEClass, NickNamed.class, "NickNamed", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNickNamed_Nickname(), ecorePackage.getEString(), "nickname", null, 0, 1, NickNamed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actioinTriggersEClass, ActioinTriggers.class, "ActioinTriggers", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActioinTriggers_Triggers(), this.getActionTrigger(), null, "triggers", null, 0, -1, ActioinTriggers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionTriggerEClass, ActionTrigger.class, "ActionTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActionTrigger_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, ActionTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uielementEClass, Uielement.class, "Uielement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUielement_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Uielement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUielement_Enabled(), this.getContext(), null, "enabled", null, 0, 1, Uielement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUielement_Required(), this.getContext(), null, "required", null, 0, 1, Uielement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUielement_ReadOnly(), this.getContext(), null, "readOnly", null, 0, 1, Uielement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUielement_RefreshAreas(), this.getAreaRef(), null, "refreshAreas", null, 0, -1, Uielement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(areaRefEClass, AreaRef.class, "AreaRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAreaRef_Area(), this.getNickNamed(), null, "area", null, 0, 1, AreaRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAreaRef_Group(), ecorePackage.getEInt(), "group", null, 0, 1, AreaRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formatableEClass, Formatable.class, "Formatable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFormatable_Format(), ecorePackage.getEString(), "format", null, 0, 1, Formatable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sourcesPointerEClass, SourcesPointer.class, "SourcesPointer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSourcesPointer_SourcePointer(), this.getDataControl(), null, "sourcePointer", null, 0, 1, SourcesPointer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSourcesPointer_ValuePointer(), ecorePackage.getEObject(), null, "valuePointer", null, 0, 1, SourcesPointer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSourcesPointer_SourceCast(), this.getType(), null, "sourceCast", null, 0, 1, SourcesPointer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSourcesPointer_SourceCastDataControl(), this.getDataControl(), null, "sourceCastDataControl", null, 0, 1, SourcesPointer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputElementEClass, InputElement.class, "InputElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(selectionEClass, Selection.class, "Selection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSelection_DisplayOptionPointer(), ecorePackage.getEObject(), null, "displayOptionPointer", null, 0, 1, Selection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSelection_ValueOptionPointer(), ecorePackage.getEObject(), null, "valueOptionPointer", null, 0, 1, Selection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(optionSelectionEClass, OptionSelection.class, "OptionSelection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOptionSelection_OptionPointer(), this.getDataControl(), null, "optionPointer", null, 0, 1, OptionSelection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOptionSelection_OptionCast(), this.getType(), null, "optionCast", null, 0, 1, OptionSelection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
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
		initEReference(getButton_Icon(), this.getContext(), null, "icon", null, 0, 1, Button.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(columnEClass, Column.class, "Column", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColumn_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumn_Label(), ecorePackage.getEString(), "label", null, 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getColumn_Element(), this.getUielement(), null, "element", null, 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableEClass, Table.class, "Table", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTable_Label(), ecorePackage.getEString(), "label", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_RowNumber(), ecorePackage.getEInt(), "rowNumber", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTable_Cols(), this.getColumn(), null, "cols", null, 0, -1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(treeEClass, Tree.class, "Tree", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTree_Label(), ecorePackage.getEString(), "label", null, 0, 1, Tree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTree_Image(), this.getContext(), null, "image", null, 0, 1, Tree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTree_Cols(), this.getColumn(), null, "cols", null, 0, -1, Tree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controlsEClass, Controls.class, "Controls", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getControls_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Controls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControls_Parent(), this.getFormDataControls(), this.getFormDataControls_FormControl(), "parent", null, 0, 1, Controls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControls_Root(), this.getRoot(), null, "root", null, 0, 1, Controls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControls_Controls(), this.getDataControl(), this.getDataControl_Parent(), "controls", null, 0, -1, Controls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControls_Relations(), this.getRelation(), null, "relations", null, 0, -1, Controls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControls_Dependencies(), this.getDependency(), null, "dependencies", null, 0, -1, Controls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControls_Any(), ecorePackage.getEObject(), null, "any", null, 0, 1, Controls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		initEReference(getDataControl_BaseType(), this.getType(), null, "baseType", null, 0, 1, DataControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataControl_Parent(), this.getControls(), this.getControls_Controls(), "parent", null, 0, 1, DataControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
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
		initEReference(getDataControl_ArtificialFields(), this.getArtificialField(), this.getArtificialField_Parent(), "artificialFields", null, 0, -1, DataControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
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
		initEReference(getRelation_Links(), this.getLink(), this.getLink_Parent(), "links", null, 0, -1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dependencyEClass, Dependency.class, "Dependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDependency_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Dependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDependency_Name(), ecorePackage.getEString(), "name", null, 0, 1, Dependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDependency_Master(), this.getDataControl(), null, "master", null, 0, 1, Dependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDependency_Detail(), this.getDataControl(), null, "detail", null, 0, 1, Dependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(artificialFieldEClass, ArtificialField.class, "ArtificialField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArtificialField_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, ArtificialField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArtificialField_Name(), ecorePackage.getEString(), "name", null, 0, 1, ArtificialField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArtificialField_Parent(), this.getDataControl(), this.getDataControl_ArtificialFields(), "parent", null, 0, 1, ArtificialField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkEClass, Link.class, "Link", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLink_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLink_Parent(), this.getRelation(), this.getRelation_Links(), "parent", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLink_MasterField(), this.getAttribute(), null, "masterField", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLink_DetailField(), this.getAttribute(), null, "detailField", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(applicationInfrastructureLayerEClass, ApplicationInfrastructureLayer.class, "ApplicationInfrastructureLayer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getApplicationInfrastructureLayer_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, ApplicationInfrastructureLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplicationInfrastructureLayer_Name(), ecorePackage.getEString(), "name", null, 0, 1, ApplicationInfrastructureLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplicationInfrastructureLayer_Parent(), this.getApplication(), this.getApplication_ApplicationInfrastructureLayer(), "parent", null, 0, 1, ApplicationInfrastructureLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplicationInfrastructureLayer_Infarastructure(), this.getEnterpriseInfrastructure(), this.getEnterpriseInfrastructure_Parent(), "infarastructure", null, 0, 1, ApplicationInfrastructureLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enterpriseInfrastructureEClass, EnterpriseInfrastructure.class, "EnterpriseInfrastructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnterpriseInfrastructure_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, EnterpriseInfrastructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnterpriseInfrastructure_Parent(), this.getApplicationInfrastructureLayer(), this.getApplicationInfrastructureLayer_Infarastructure(), "parent", null, 0, 1, EnterpriseInfrastructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnterpriseInfrastructure_Datacenters(), this.getDatacenter(), this.getDatacenter_Parent(), "datacenters", null, 0, -1, EnterpriseInfrastructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnterpriseInfrastructure_InfrastructureConnections(), this.getInfrastructureConnection(), null, "infrastructureConnections", null, 0, -1, EnterpriseInfrastructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnterpriseInfrastructure_Any(), ecorePackage.getEObject(), null, "any", null, 0, 1, EnterpriseInfrastructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(datacenterEClass, Datacenter.class, "Datacenter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDatacenter_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Datacenter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDatacenter_Parent(), this.getEnterpriseInfrastructure(), this.getEnterpriseInfrastructure_Datacenters(), "parent", null, 0, 1, Datacenter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDatacenter_Subsystems(), this.getSubsystem(), this.getSubsystem_Parent(), "subsystems", null, 0, -1, Datacenter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatacenter_Name(), ecorePackage.getEString(), "name", null, 0, 1, Datacenter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subsystemEClass, Subsystem.class, "Subsystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubsystem_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Subsystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubsystem_Name(), ecorePackage.getEString(), "name", null, 0, 1, Subsystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubsystem_Parent(), this.getDatacenter(), this.getDatacenter_Subsystems(), "parent", null, 0, 1, Subsystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubsystem_InfrastructureLayer(), this.getInfrastructureLayer(), this.getInfrastructureLayer_Parent(), "infrastructureLayer", null, 0, -1, Subsystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(infrastructureLayerEClass, InfrastructureLayer.class, "InfrastructureLayer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInfrastructureLayer_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, InfrastructureLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInfrastructureLayer_Name(), ecorePackage.getEString(), "name", null, 0, 1, InfrastructureLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInfrastructureLayer_Parent(), this.getSubsystem(), this.getSubsystem_InfrastructureLayer(), "parent", null, 0, 1, InfrastructureLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInfrastructureLayer_InfrastructureComponent(), this.getInfrastructureComponent(), this.getInfrastructureComponent_Parent(), "infrastructureComponent", null, 0, -1, InfrastructureLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(infrastructureConnectionEClass, InfrastructureConnection.class, "InfrastructureConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInfrastructureConnection_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, InfrastructureConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInfrastructureConnection_Master(), this.getInfrastructureComponent(), null, "master", null, 0, 1, InfrastructureConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInfrastructureConnection_Detail(), this.getInfrastructureComponent(), null, "detail", null, 0, 1, InfrastructureConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(infrastructureComponentEClass, InfrastructureComponent.class, "InfrastructureComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInfrastructureComponent_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, InfrastructureComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInfrastructureComponent_Name(), ecorePackage.getEString(), "name", null, 0, 1, InfrastructureComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInfrastructureComponent_Parent(), this.getInfrastructureLayer(), this.getInfrastructureLayer_InfrastructureComponent(), "parent", null, 0, 1, InfrastructureComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serverEClass, Server.class, "Server", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(routerEClass, Router.class, "Router", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hubEClass, Hub.class, "Hub", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(storageEClass, Storage.class, "Storage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(serverClasterEClass, ServerClaster.class, "ServerClaster", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServerClaster_Servers(), this.getServer(), null, "servers", null, 0, -1, ServerClaster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(platformLayersEEnum, PlatformLayers.class, "PlatformLayers");
		addEEnumLiteral(platformLayersEEnum, PlatformLayers.SERVICE_LAYER);
		addEEnumLiteral(platformLayersEEnum, PlatformLayers.UI_LAYER);

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
		// gmf
		createGmfAnnotations();
		// gmf.diagram
		createGmf_1Annotations();
		// gmf.node
		createGmf_2Annotations();
		// gmf.compartment
		createGmf_3Annotations();
		// gmf.diagram.artifact
		createGmf_4Annotations();
		// gmf.diagram.application
		createGmf_5Annotations();
		// gmf.diagram.messages
		createGmf_6Annotations();
		// gmf.diagram.roles
		createGmf_7Annotations();
		// gmf.link
		createGmf_8Annotations();
		// gmf.diagram.style
		createGmf_9Annotations();
		// gmf.diagram.mapper
		createGmf_10Annotations();
		// gmf.diagram.recipe
		createGmf_11Annotations();
		// gmf.diagram.deployment
		createGmf_12Annotations();
		// gmf.diagram.typedefinition
		createGmf_13Annotations();
		// gmf.diagram.typesrepository
		createGmf_14Annotations();
		// gmf.diagram.uipackage
		createGmf_15Annotations();
		// gmf.diagram.view
		createGmf_16Annotations();
		// gmf.diagram.canvas
		createGmf_17Annotations();
		// gmf.diagram.control
		createGmf_18Annotations();
		// gmf.diagram.infarastructure
		createGmf_19Annotations();
	}

	/**
	 * Initializes the annotations for <b>gmf</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations() {
		String source = "gmf";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations() {
		String source = "gmf.diagram";	
		addAnnotation
		  (domainEClass, 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations() {
		String source = "gmf.node";	
		addAnnotation
		  (domainArtifactsEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "border.color", "0,0,0",
			 "color", "255,239,222"
		   });	
		addAnnotation
		  (domainTypesEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "border.color", "0,0,0",
			 "color", "255,239,222"
		   });	
		addAnnotation
		  (domainApplicationsEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "border.color", "0,0,0",
			 "color", "255,239,222"
		   });	
		addAnnotation
		  (domainApplicationEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "border.color", "0,0,0",
			 "color", "241,238,203"
		   });	
		addAnnotation
		  (domainArtifactEClass, 
		   source, 
		   new String[] {
			 "label", "name"
		   });	
		addAnnotation
		  (ormEntityEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "border.color", "0,0,0",
			 "color", "241,238,203"
		   });	
		addAnnotation
		  (jpaServiceEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "border.color", "0,0,0",
			 "color", "241,238,203"
		   });	
		addAnnotation
		  (ejbServiceEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "border.color", "0,0,0",
			 "color", "241,238,203"
		   });	
		addAnnotation
		  (continuousIintegrationEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "border.color", "0,0,0",
			 "color", "241,238,203"
		   });	
		addAnnotation
		  (artifactEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "border.color", "0,0,0",
			 "color", "255,239,222"
		   });	
		addAnnotation
		  (generationHintEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "border.color", "0,0,0",
			 "color", "255,239,222"
		   });	
		addAnnotation
		  (configVariableEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "border.color", "0,0,0",
			 "color", "255,239,222"
		   });	
		addAnnotation
		  (modelQueryEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "border.color", "0,0,0",
			 "color", "255,239,222"
		   });	
		addAnnotation
		  (specifierEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "border.color", "0,0,0",
			 "color", "255,239,222"
		   });	
		addAnnotation
		  (optionEClass, 
		   source, 
		   new String[] {
			 "label", "value"
		   });	
		addAnnotation
		  (applicationMessagesEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "border.color", "0,0,0",
			 "color", "192,192,192"
		   });	
		addAnnotation
		  (applicationRoleEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "border.color", "0,0,0",
			 "color", "192,192,192"
		   });	
		addAnnotation
		  (applicationStyleEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "border.color", "0,0,0",
			 "color", "192,192,192"
		   });	
		addAnnotation
		  (stylesPackageEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "border.color", "0,0,0",
			 "color", "255,196,176"
		   });	
		addAnnotation
		  (applicationUILayerEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "border.color", "0,0,0",
			 "color", "192,192,192"
		   });	
		addAnnotation
		  (applicationUIPackageEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "border.color", "0,0,0",
			 "color", "255,196,176"
		   });	
		addAnnotation
		  (applicationRecipesEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "border.color", "0,0,0",
			 "color", "192,192,192"
		   });	
		addAnnotation
		  (applicationRecipeEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "border.color", "0,0,0",
			 "color", "255,196,176"
		   });	
		addAnnotation
		  (applicationMappersEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "border.color", "0,0,0",
			 "color", "164,230,255"
		   });	
		addAnnotation
		  (applicationMapperEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "border.color", "0,0,0",
			 "color", "255,237,85"
		   });	
		addAnnotation
		  (messageLibraryEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "border.color", "0,0,0",
			 "color", "255,237,85"
		   });	
		addAnnotation
		  (messageEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "border.color", "0,0,0",
			 "color", "255,237,85"
		   });	
		addAnnotation
		  (languageEClass, 
		   source, 
		   new String[] {
			 "label", "lang",
			 "border.color", "0,0,0",
			 "color", "255,239,222"
		   });	
		addAnnotation
		  (roleEClass, 
		   source, 
		   new String[] {
			 "figure", "org.tura.metamodel.commons.figures.RoleFigure",
			 "label.icon", "false",
			 "label", "name",
			 "label.placement", "external",
			 "tool.small.bundle", "org.tura.metamodel.commons",
			 "tool.small.path", "icons/role.png"
		   });	
		addAnnotation
		  (groupEClass, 
		   source, 
		   new String[] {
			 "figure", "org.tura.metamodel.commons.figures.GroupFigure",
			 "label.icon", "false",
			 "label", "name",
			 "label.placement", "external",
			 "tool.small.bundle", "org.tura.metamodel.commons",
			 "tool.small.path", "icons/group.png"
		   });	
		addAnnotation
		  (styleLibraryEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "border.color", "0,0,0",
			 "color", "255,237,85"
		   });	
		addAnnotation
		  (styleSetEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "border.color", "0,0,0",
			 "color", "255,237,85"
		   });	
		addAnnotation
		  (javaMapperEClass, 
		   source, 
		   new String[] {
			 "label", "fakePackageName,fakeTypeName",
			 "border.color", "0,0,0",
			 "color", "255,237,85"
		   });	
		addAnnotation
		  (javaScriptMapperEClass, 
		   source, 
		   new String[] {
			 "label", "fakePackageName,fakeTypeName",
			 "border.color", "0,0,0",
			 "color", "47,180,155"
		   });	
		addAnnotation
		  (cssMapperEClass, 
		   source, 
		   new String[] {
			 "label", "fakePackageName,fakeTypeName",
			 "border.color", "0,0,0",
			 "color", "47,180,155"
		   });	
		addAnnotation
		  (roleMapperEClass, 
		   source, 
		   new String[] {
			 "label", "fakeRoleName",
			 "border.color", "0,0,0",
			 "color", "246,148,52"
		   });	
		addAnnotation
		  (deploymentSequenceEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "border.color", "0,0,0",
			 "color", "177,201,236"
		   });	
		addAnnotation
		  (deploymentComponentEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "border.color", "0,0,0",
			 "color", "177,201,236"
		   });	
		addAnnotation
		  (deploymentStarStepEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "border.color", "0,0,0",
			 "color", "255,69,0"
		   });	
		addAnnotation
		  (recipeEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "border.color", "0,0,0",
			 "color", "255,239,222"
		   });	
		addAnnotation
		  (ingredientEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "border.color", "0,0,0",
			 "color", "255,222,32"
		   });	
		addAnnotation
		  (javaComponentEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "border.color", "0,0,0",
			 "color", "128,128,128"
		   });	
		addAnnotation
		  (infrastructureEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "border.color", "0,0,0",
			 "color", "255,239,222"
		   });	
		addAnnotation
		  (configurationEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "border.color", "0,0,0",
			 "color", "255,239,222"
		   });	
		addAnnotation
		  (modelMapperEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "border.color", "0,0,0",
			 "color", "192,192,192"
		   });	
		addAnnotation
		  (propertyEClass, 
		   source, 
		   new String[] {
			 "label", "fakeName",
			 "border.color", "0,0,0",
			 "color", "255,239,222"
		   });	
		addAnnotation
		  (queryEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "border.color", "0,0,0",
			 "color", "241,238,203"
		   });	
		addAnnotation
		  (primitiveEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "border.color", "0,0,0",
			 "color", "255,239,222"
		   });	
		addAnnotation
		  (typeEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "border.color", "0,0,0",
			 "color", "255,239,222"
		   });	
		addAnnotation
		  (typeReferenceEClass, 
		   source, 
		   new String[] {
			 "label", "fakePackageName,fakeTypeName",
			 "border.color", "0,0,0",
			 "color", "255,239,222"
		   });	
		addAnnotation
		  (attributeEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "border.color", "0,0,0",
			 "color", "255,239,222"
		   });	
		addAnnotation
		  (operationEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "border.color", "0,0,0",
			 "color", "255,239,222"
		   });	
		addAnnotation
		  (enumaratorEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "border.color", "0,0,0",
			 "color", "255,239,222"
		   });	
		addAnnotation
		  (enumAttributeEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "border.color", "0,0,0",
			 "color", "255,239,222"
		   });	
		addAnnotation
		  (typesEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "border.color", "0,0,0",
			 "color", "255,239,222"
		   });	
		addAnnotation
		  (packageEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "border.color", "0,0,0",
			 "color", "241,238,203"
		   });	
		addAnnotation
		  (formEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "border.color", "0,0,0",
			 "color", "241,238,203"
		   });	
		addAnnotation
		  (formParameterEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "border.color", "0,0,0",
			 "color", "241,238,203"
		   });	
		addAnnotation
		  (formViewEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "border.color", "0,0,0",
			 "color", "241,238,203"
		   });	
		addAnnotation
		  (popupCanvasEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "border.color", "0,0,0",
			 "color", "192,192,192"
		   });	
		addAnnotation
		  (canvasEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "border.color", "0,0,0",
			 "color", "192,192,192"
		   });	
		addAnnotation
		  (windowEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "border.color", "0,0,0",
			 "color", "192,192,192"
		   });	
		addAnnotation
		  (tabCanvasEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "border.color", "0,0,0",
			 "color", "192,192,192"
		   });	
		addAnnotation
		  (tabPageEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "border.color", "0,0,0",
			 "color", "192,192,192"
		   });	
		addAnnotation
		  (viewPortEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "border.color", "0,0,0",
			 "color", "192,192,192"
		   });	
		addAnnotation
		  (viewAreaEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "border.color", "0,0,0",
			 "color", "192,192,192"
		   });	
		addAnnotation
		  (viewPortTriggerEClass, 
		   source, 
		   new String[] {
			 "label", "fakeMethod",
			 "border.color", "0,0,0",
			 "color", "241,238,203"
		   });	
		addAnnotation
		  (formDataControlsEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "border.color", "0,0,0",
			 "color", "241,238,203"
		   });	
		addAnnotation
		  (layerHolderEClass, 
		   source, 
		   new String[] {
			 "label.placement", "none",
			 "tool.small.bundle", "org.tura.metamodel.commons",
			 "tool.small.path", "icons/layerholder.png"
		   });	
		addAnnotation
		  (inputTextEClass, 
		   source, 
		   new String[] {
			 "figure", "org.tura.metamodel.commons.figures.InputTextFigure",
			 "label.placement", "none",
			 "tool.small.bundle", "org.tura.metamodel.commons",
			 "tool.small.path", "icons/inputtext.png"
		   });	
		addAnnotation
		  (passwordEClass, 
		   source, 
		   new String[] {
			 "figure", "org.tura.metamodel.commons.figures.InputTextFigure",
			 "label.placement", "none",
			 "tool.small.bundle", "org.tura.metamodel.commons",
			 "tool.small.path", "icons/inputtext.png"
		   });	
		addAnnotation
		  (labelEClass, 
		   source, 
		   new String[] {
			 "label", "label",
			 "tool.small.bundle", "org.tura.metamodel.commons",
			 "label.icon", "false",
			 "tool.small.path", "icons/label.png"
		   });	
		addAnnotation
		  (messageElementEClass, 
		   source, 
		   new String[] {
			 "label", "label",
			 "tool.small.bundle", "org.tura.metamodel.commons",
			 "label.icon", "false",
			 "tool.small.path", "icons/label.png"
		   });	
		addAnnotation
		  (outputTextEClass, 
		   source, 
		   new String[] {
			 "figure", "org.tura.metamodel.commons.figures.OutputTextFigure",
			 "label.placement", "none",
			 "tool.small.bundle", "org.tura.metamodel.commons",
			 "tool.small.path", "icons/outputtext.png"
		   });	
		addAnnotation
		  (checkBoxEClass, 
		   source, 
		   new String[] {
			 "figure", "org.tura.metamodel.commons.figures.CheckBoxFigure",
			 "label.placement", "none",
			 "tool.small.bundle", "org.tura.metamodel.commons",
			 "tool.small.path", "icons/checkbox.png"
		   });	
		addAnnotation
		  (dropDownSelectionEClass, 
		   source, 
		   new String[] {
			 "figure", "org.tura.metamodel.commons.figures.DropDownFigure",
			 "label.placement", "none",
			 "tool.small.bundle", "org.tura.metamodel.commons",
			 "tool.small.path", "icons/dropdownselection.png"
		   });	
		addAnnotation
		  (imageEClass, 
		   source, 
		   new String[] {
			 "figure", "org.tura.metamodel.commons.figures.MetaImageFigure",
			 "label.placement", "none",
			 "tool.small.bundle", "org.tura.metamodel.commons",
			 "tool.small.path", "icons/image.png"
		   });	
		addAnnotation
		  (dateEClass, 
		   source, 
		   new String[] {
			 "figure", "org.tura.metamodel.commons.figures.DateFigure",
			 "label.placement", "none",
			 "tool.small.bundle", "org.tura.metamodel.commons",
			 "tool.small.path", "icons/date.png"
		   });	
		addAnnotation
		  (buttonEClass, 
		   source, 
		   new String[] {
			 "figure", "org.tura.metamodel.commons.figures.ButtonFigure",
			 "label", "label",
			 "label.icon", "false",
			 "tool.small.bundle", "org.tura.metamodel.commons",
			 "tool.small.path", "icons/button.png"
		   });	
		addAnnotation
		  (columnEClass, 
		   source, 
		   new String[] {
			 "label", "label",
			 "tool.small.bundle", "org.tura.metamodel.commons",
			 "tool.small.path", "icons/column.png"
		   });	
		addAnnotation
		  (tableEClass, 
		   source, 
		   new String[] {
			 "label", "label",
			 "tool.small.bundle", "org.tura.metamodel.commons",
			 "tool.small.path", "icons/table.png"
		   });	
		addAnnotation
		  (treeEClass, 
		   source, 
		   new String[] {
			 "label", "label",
			 "tool.small.bundle", "org.tura.metamodel.commons",
			 "tool.small.path", "icons/tree.png"
		   });	
		addAnnotation
		  (preFormTriggerEClass, 
		   source, 
		   new String[] {
			 "label", "fakeMethod",
			 "border.color", "0,0,0",
			 "color", "241,238,203"
		   });	
		addAnnotation
		  (preQueryTriggerEClass, 
		   source, 
		   new String[] {
			 "label", "fakeMethod",
			 "border.color", "0,0,0",
			 "color", "241,238,203"
		   });	
		addAnnotation
		  (postQueryTriggerEClass, 
		   source, 
		   new String[] {
			 "label", "fakeMethod",
			 "border.color", "0,0,0",
			 "color", "241,238,203"
		   });	
		addAnnotation
		  (preInsertTriggerEClass, 
		   source, 
		   new String[] {
			 "label", "fakeMethod",
			 "border.color", "0,0,0",
			 "color", "241,238,203"
		   });	
		addAnnotation
		  (preDeleteTriggerEClass, 
		   source, 
		   new String[] {
			 "label", "fakeMethod",
			 "border.color", "0,0,0",
			 "color", "241,238,203"
		   });	
		addAnnotation
		  (postCreateTriggerEClass, 
		   source, 
		   new String[] {
			 "label", "fakeMethod",
			 "border.color", "0,0,0",
			 "color", "241,238,203"
		   });	
		addAnnotation
		  (preUpdateTriggerEClass, 
		   source, 
		   new String[] {
			 "label", "fakeMethod",
			 "border.color", "0,0,0",
			 "color", "241,238,203"
		   });	
		addAnnotation
		  (createTriggerEClass, 
		   source, 
		   new String[] {
			 "label", "fakeMethod",
			 "border.color", "0,0,0",
			 "color", "241,238,203"
		   });	
		addAnnotation
		  (insertTriggerEClass, 
		   source, 
		   new String[] {
			 "label", "fakeMethod",
			 "border.color", "0,0,0",
			 "color", "241,238,203"
		   });	
		addAnnotation
		  (updateTriggerEClass, 
		   source, 
		   new String[] {
			 "label", "fakeMethod",
			 "border.color", "0,0,0",
			 "color", "241,238,203"
		   });	
		addAnnotation
		  (deleteTriggerEClass, 
		   source, 
		   new String[] {
			 "label", "fakeMethod",
			 "border.color", "0,0,0",
			 "color", "241,238,203"
		   });	
		addAnnotation
		  (searchTriggerEClass, 
		   source, 
		   new String[] {
			 "label", "fakeMethod",
			 "border.color", "0,0,0",
			 "color", "241,238,203"
		   });	
		addAnnotation
		  (rootEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "border.color", "0,0,0",
			 "color", "241,238,203"
		   });	
		addAnnotation
		  (formVariableEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "border.color", "0,0,0",
			 "color", "241,238,203"
		   });	
		addAnnotation
		  (dataControlEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "border.color", "0,0,0",
			 "color", "241,238,203"
		   });	
		addAnnotation
		  (artificialFieldEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "border.color", "0,0,0",
			 "color", "241,238,203"
		   });	
		addAnnotation
		  (applicationInfrastructureLayerEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "border.color", "0,0,0",
			 "color", "192,192,192"
		   });	
		addAnnotation
		  (datacenterEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "tool.small.bundle", "org.tura.metamodel.commons",
			 "tool.small.path", "icons/datacenter.png"
		   });	
		addAnnotation
		  (subsystemEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "tool.small.bundle", "org.tura.metamodel.commons",
			 "tool.small.path", "icons/subsystem.png"
		   });	
		addAnnotation
		  (infrastructureLayerEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "tool.small.bundle", "org.tura.metamodel.commons",
			 "tool.small.path", "icons/infra.png"
		   });	
		addAnnotation
		  (serverEClass, 
		   source, 
		   new String[] {
			 "figure", "org.tura.metamodel.commons.figures.ServerFigure",
			 "label.icon", "false",
			 "label", "name",
			 "label.placement", "external",
			 "tool.small.bundle", "org.tura.metamodel.commons",
			 "tool.small.path", "icons/server.png"
		   });	
		addAnnotation
		  (routerEClass, 
		   source, 
		   new String[] {
			 "figure", "org.tura.metamodel.commons.figures.RouterFigure",
			 "label.icon", "false",
			 "label", "name",
			 "label.placement", "external",
			 "tool.small.bundle", "org.tura.metamodel.commons",
			 "tool.small.path", "icons/router.png"
		   });	
		addAnnotation
		  (hubEClass, 
		   source, 
		   new String[] {
			 "figure", "org.tura.metamodel.commons.figures.HubFigure",
			 "label.icon", "false",
			 "label", "name",
			 "label.placement", "external",
			 "tool.small.bundle", "org.tura.metamodel.commons",
			 "tool.small.path", "icons/hub.png"
		   });	
		addAnnotation
		  (storageEClass, 
		   source, 
		   new String[] {
			 "figure", "org.tura.metamodel.commons.figures.StorageFigure",
			 "label.icon", "false",
			 "label", "name",
			 "label.placement", "external",
			 "tool.small.bundle", "org.tura.metamodel.commons",
			 "tool.small.path", "icons/storage.png"
		   });	
		addAnnotation
		  (serverClasterEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "tool.small.bundle", "org.tura.metamodel.commons",
			 "tool.small.path", "icons/serverclaster.png"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations() {
		String source = "gmf.compartment";	
		addAnnotation
		  (getDomainArtifacts_DomainArtifact(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getDomainApplications_Applications(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getArtifact_ConfigVariables(), 
		   source, 
		   new String[] {
			 "layout", "list"
		   });	
		addAnnotation
		  (getArtifact_ModelQuery(), 
		   source, 
		   new String[] {
			 "layout", "list"
		   });	
		addAnnotation
		  (getArtifact_Specifiers(), 
		   source, 
		   new String[] {
			 "layout", "list"
		   });	
		addAnnotation
		  (getArtifact_Hints(), 
		   source, 
		   new String[] {
			 "layout", "list"
		   });	
		addAnnotation
		  (getApplicationStyle_StylesPackage(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getApplicationUILayer_ApplicationUIPackages(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getApplicationRecipes_Recipes(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getApplicationMappers_Mappers(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getMessageLibrary_Messages(), 
		   source, 
		   new String[] {
			 "layout", "list"
		   });	
		addAnnotation
		  (getStyleLibrary_Styles(), 
		   source, 
		   new String[] {
			 "layout", "list"
		   });	
		addAnnotation
		  (getRecipe_Ingredients(), 
		   source, 
		   new String[] {
			 "layout", "list"
		   });	
		addAnnotation
		  (getIngredient_Components(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getComponent_Mappers(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getConfiguration_Properties(), 
		   source, 
		   new String[] {
			 "layout", "list"
		   });	
		addAnnotation
		  (getModelMapper_Queries(), 
		   source, 
		   new String[] {
			 "layout", "list"
		   });	
		addAnnotation
		  (getType_Attributes(), 
		   source, 
		   new String[] {
			 "layout", "list"
		   });	
		addAnnotation
		  (getType_Operations(), 
		   source, 
		   new String[] {
			 "layout", "list"
		   });	
		addAnnotation
		  (getEnumarator_Values(), 
		   source, 
		   new String[] {
			 "layout", "list"
		   });	
		addAnnotation
		  (getTypes_Packages(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getForm_View(), 
		   source, 
		   new String[] {
			 "layout", "list"
		   });	
		addAnnotation
		  (getForm_Datacontrols(), 
		   source, 
		   new String[] {
			 "layout", "list"
		   });	
		addAnnotation
		  (getForm_Parameters(), 
		   source, 
		   new String[] {
			 "layout", "list"
		   });	
		addAnnotation
		  (getViewPortHolder_ViewElement(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getViewPort_ViewPortTrigger(), 
		   source, 
		   new String[] {
			 "layout", "list"
		   });	
		addAnnotation
		  (getChildrenHolder_Children(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getColumn_Element(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getTable_Cols(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getTree_Cols(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getRoot_PreFormTrigger(), 
		   source, 
		   new String[] {
			 "layout", "list"
		   });	
		addAnnotation
		  (getRoot_Variables(), 
		   source, 
		   new String[] {
			 "layout", "list"
		   });	
		addAnnotation
		  (getDataControl_PreQueryTrigger(), 
		   source, 
		   new String[] {
			 "layout", "list"
		   });	
		addAnnotation
		  (getDataControl_PostQueryTrigger(), 
		   source, 
		   new String[] {
			 "layout", "list"
		   });	
		addAnnotation
		  (getDataControl_PreInsertTrigger(), 
		   source, 
		   new String[] {
			 "layout", "list"
		   });	
		addAnnotation
		  (getDataControl_PreDeleteTrigger(), 
		   source, 
		   new String[] {
			 "layout", "list"
		   });	
		addAnnotation
		  (getDataControl_PostCreateTrigger(), 
		   source, 
		   new String[] {
			 "layout", "list"
		   });	
		addAnnotation
		  (getDataControl_PreUpdateTrigger(), 
		   source, 
		   new String[] {
			 "layout", "list"
		   });	
		addAnnotation
		  (getDataControl_Create(), 
		   source, 
		   new String[] {
			 "layout", "list"
		   });	
		addAnnotation
		  (getDataControl_Insert(), 
		   source, 
		   new String[] {
			 "layout", "list"
		   });	
		addAnnotation
		  (getDataControl_Update(), 
		   source, 
		   new String[] {
			 "layout", "list"
		   });	
		addAnnotation
		  (getDataControl_Remove(), 
		   source, 
		   new String[] {
			 "layout", "list"
		   });	
		addAnnotation
		  (getDataControl_Search(), 
		   source, 
		   new String[] {
			 "layout", "list"
		   });	
		addAnnotation
		  (getDataControl_ArtificialFields(), 
		   source, 
		   new String[] {
			 "layout", "list"
		   });	
		addAnnotation
		  (getDatacenter_Subsystems(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getSubsystem_InfrastructureLayer(), 
		   source, 
		   new String[] {
			 "layout", "list"
		   });	
		addAnnotation
		  (getInfrastructureLayer_InfrastructureComponent(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getServerClaster_Servers(), 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram.artifact</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_4Annotations() {
		String source = "gmf.diagram.artifact";	
		addAnnotation
		  (artifactsEClass, 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram.application</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_5Annotations() {
		String source = "gmf.diagram.application";	
		addAnnotation
		  (applicationEClass, 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram.messages</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_6Annotations() {
		String source = "gmf.diagram.messages";	
		addAnnotation
		  (messagesEClass, 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram.roles</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_7Annotations() {
		String source = "gmf.diagram.roles";	
		addAnnotation
		  (rolesEClass, 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_8Annotations() {
		String source = "gmf.link";	
		addAnnotation
		  (getGroup_Group2Group(), 
		   source, 
		   new String[] {
			 "target.decoration", "arrow",
			 "style", "dash"
		   });	
		addAnnotation
		  (getGroup_Group2Role(), 
		   source, 
		   new String[] {
			 "target.decoration", "arrow",
			 "style", "dash"
		   });	
		addAnnotation
		  (getDeploymentComponent_DeploymentComponentLink(), 
		   source, 
		   new String[] {
			 "target.decoration", "arrow",
			 "style", "dash"
		   });	
		addAnnotation
		  (getDeploymentStarStep_FirstStep(), 
		   source, 
		   new String[] {
			 "target.decoration", "arrow",
			 "style", "dash"
		   });	
		addAnnotation
		  (getRecipe_Infrastructures(), 
		   source, 
		   new String[] {
			 "target.decoration", "arrow",
			 "style", "dash"
		   });	
		addAnnotation
		  (getRecipe_Deployment(), 
		   source, 
		   new String[] {
			 "target.decoration", "arrow",
			 "style", "dash"
		   });	
		addAnnotation
		  (configExtensionEClass, 
		   source, 
		   new String[] {
			 "source", "source",
			 "target", "target",
			 "style", "dot",
			 "width", "2",
			 "target.decoration", "closedarrow"
		   });	
		addAnnotation
		  (getInfrastructure_RecipeConfig(), 
		   source, 
		   new String[] {
			 "target.decoration", "arrow",
			 "style", "dash"
		   });	
		addAnnotation
		  (typeExtensionEClass, 
		   source, 
		   new String[] {
			 "source", "source",
			 "target", "target",
			 "style", "dot",
			 "width", "2",
			 "target.decoration", "closedarrow"
		   });	
		addAnnotation
		  (viewInheritanceEClass, 
		   source, 
		   new String[] {
			 "source", "source",
			 "target", "target",
			 "color", "80,195,63",
			 "style", "dot",
			 "width", "2",
			 "target.decoration", "closedarrow"
		   });	
		addAnnotation
		  (tabPagesInheritanceEClass, 
		   source, 
		   new String[] {
			 "source", "source",
			 "target", "target",
			 "style", "dash",
			 "color", "238,16,16",
			 "width", "2",
			 "target.decoration", "arrow"
		   });	
		addAnnotation
		  (linkToMessageEClass, 
		   source, 
		   new String[] {
			 "source", "source",
			 "target", "target",
			 "style", "dot",
			 "width", "2",
			 "target.decoration", "closedarrow"
		   });	
		addAnnotation
		  (linkToLabelEClass, 
		   source, 
		   new String[] {
			 "source", "source",
			 "target", "target",
			 "style", "dot",
			 "width", "2",
			 "target.decoration", "closedarrow"
		   });	
		addAnnotation
		  (relationEClass, 
		   source, 
		   new String[] {
			 "source", "master",
			 "target", "detail",
			 "style", "dash",
			 "target.decoration", "arrow"
		   });	
		addAnnotation
		  (dependencyEClass, 
		   source, 
		   new String[] {
			 "source", "master",
			 "target", "detail",
			 "style", "dash",
			 "color", "238,16,16",
			 "width", "2",
			 "target.decoration", "arrow"
		   });	
		addAnnotation
		  (infrastructureConnectionEClass, 
		   source, 
		   new String[] {
			 "source", "master",
			 "target", "detail",
			 "width", "2"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram.style</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_9Annotations() {
		String source = "gmf.diagram.style";	
		addAnnotation
		  (stylesEClass, 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram.mapper</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_10Annotations() {
		String source = "gmf.diagram.mapper";	
		addAnnotation
		  (mappersEClass, 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram.recipe</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_11Annotations() {
		String source = "gmf.diagram.recipe";	
		addAnnotation
		  (recipesEClass, 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram.deployment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_12Annotations() {
		String source = "gmf.diagram.deployment";	
		addAnnotation
		  (deploymentComponentsEClass, 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram.typedefinition</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_13Annotations() {
		String source = "gmf.diagram.typedefinition";	
		addAnnotation
		  (typeDefinitionEClass, 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram.typesrepository</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_14Annotations() {
		String source = "gmf.diagram.typesrepository";	
		addAnnotation
		  (typesRepositoryEClass, 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram.uipackage</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_15Annotations() {
		String source = "gmf.diagram.uipackage";	
		addAnnotation
		  (uiPackageEClass, 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram.view</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_16Annotations() {
		String source = "gmf.diagram.view";	
		addAnnotation
		  (viewsEClass, 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram.canvas</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_17Annotations() {
		String source = "gmf.diagram.canvas";	
		addAnnotation
		  (canvasViewEClass, 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram.control</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_18Annotations() {
		String source = "gmf.diagram.control";	
		addAnnotation
		  (controlsEClass, 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram.infarastructure</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_19Annotations() {
		String source = "gmf.diagram.infarastructure";	
		addAnnotation
		  (enterpriseInfrastructureEClass, 
		   source, 
		   new String[] {
		   });
	}

} //DomainPackageImpl
