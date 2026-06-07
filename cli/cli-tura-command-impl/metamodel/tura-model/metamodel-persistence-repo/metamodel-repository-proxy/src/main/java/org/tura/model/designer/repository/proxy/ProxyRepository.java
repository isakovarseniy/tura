/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2026 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.tura.model.designer.repository.proxy;

import org.tura.platform.repository.cpa.CpaRepositoryImpl;
import java.util.List;
import org.tura.model.designer.repository.serialized.domain.Domain;
import org.tura.model.designer.repository.serialized.domain.DomainProxy;
import org.tura.model.designer.repository.serialized.domain.DomainArtifacts;
import org.tura.model.designer.repository.serialized.domain.DomainArtifactsProxy;
import org.tura.model.designer.repository.serialized.domain.DomainArtifact;
import org.tura.model.designer.repository.serialized.domain.DomainArtifactProxy;
import org.tura.model.designer.repository.serialized.artifact.ArtifactGroup;
import org.tura.model.designer.repository.serialized.artifact.ArtifactGroupProxy;
import org.tura.model.designer.repository.serialized.artifact.Artifact;
import org.tura.model.designer.repository.serialized.artifact.ArtifactProxy;
import org.tura.model.designer.repository.serialized.artifact.ConfigVariableWithNickName;
import org.tura.model.designer.repository.serialized.artifact.ConfigVariableWithNickNameProxy;
import org.tura.model.designer.repository.serialized.artifact.ConfigVariable;
import org.tura.model.designer.repository.serialized.artifact.ConfigVariableProxy;
import org.tura.model.designer.repository.serialized.recipe.Property;
import org.tura.model.designer.repository.serialized.recipe.PropertyProxy;
import org.tura.model.designer.repository.serialized.recipe.Configuration;
import org.tura.model.designer.repository.serialized.recipe.ConfigurationProxy;
import org.tura.model.designer.repository.serialized.recipe.ConfigExtension;
import org.tura.model.designer.repository.serialized.recipe.ConfigExtensionProxy;
import org.tura.model.designer.repository.serialized.recipe.Recipes;
import org.tura.model.designer.repository.serialized.recipe.RecipesProxy;
import org.tura.model.designer.repository.serialized.recipe.Recipe;
import org.tura.model.designer.repository.serialized.recipe.RecipeProxy;
import org.tura.model.designer.repository.serialized.recipe.Ingredient;
import org.tura.model.designer.repository.serialized.recipe.IngredientProxy;
import org.tura.model.designer.repository.serialized.recipe.Component;
import org.tura.model.designer.repository.serialized.recipe.ComponentProxy;
import org.tura.model.designer.repository.serialized.recipe.ModelMapper;
import org.tura.model.designer.repository.serialized.recipe.ModelMapperProxy;
import org.tura.model.designer.repository.serialized.recipe.DeploymentComponent;
import org.tura.model.designer.repository.serialized.recipe.DeploymentComponentProxy;
import org.tura.model.designer.repository.serialized.recipe.DeploymentStarStep;
import org.tura.model.designer.repository.serialized.recipe.DeploymentStarStepProxy;
import org.tura.model.designer.repository.serialized.objectmapper.AttributeConnector;
import org.tura.model.designer.repository.serialized.objectmapper.AttributeConnectorProxy;
import org.tura.model.designer.repository.serialized.form.ContextParametersObj;
import org.tura.model.designer.repository.serialized.form.ContextParametersObjProxy;
import org.tura.model.designer.repository.serialized.objectmapper.OperationConnector;
import org.tura.model.designer.repository.serialized.objectmapper.OperationConnectorProxy;
import org.tura.model.designer.repository.serialized.objectmapper.ObjectMapperGroup;
import org.tura.model.designer.repository.serialized.objectmapper.ObjectMapperGroupProxy;
import org.tura.model.designer.repository.serialized.objectmapper.ObjectMapper;
import org.tura.model.designer.repository.serialized.objectmapper.ObjectMapperProxy;
import org.tura.model.designer.repository.serialized.type.TypePointerObj;
import org.tura.model.designer.repository.serialized.type.TypePointerObjProxy;
import org.tura.model.designer.repository.serialized.form.DataControl;
import org.tura.model.designer.repository.serialized.form.DataControlProxy;
import org.tura.model.designer.repository.serialized.type.Type;
import org.tura.model.designer.repository.serialized.type.TypeProxy;
import org.tura.model.designer.repository.serialized.type.Attribute;
import org.tura.model.designer.repository.serialized.type.AttributeProxy;
import org.tura.model.designer.repository.serialized.type.Link;
import org.tura.model.designer.repository.serialized.type.LinkProxy;
import org.tura.model.designer.repository.serialized.type.Assosiation;
import org.tura.model.designer.repository.serialized.type.AssosiationProxy;
import org.tura.model.designer.repository.serialized.type.TypeElement;
import org.tura.model.designer.repository.serialized.type.TypeElementProxy;
import org.tura.model.designer.repository.serialized.type.Relationship;
import org.tura.model.designer.repository.serialized.type.RelationshipProxy;
import org.tura.model.designer.repository.serialized.type.TypeGroup;
import org.tura.model.designer.repository.serialized.type.TypeGroupProxy;
import org.tura.model.designer.repository.serialized.domain.DomainTypesRepository;
import org.tura.model.designer.repository.serialized.domain.DomainTypesRepositoryProxy;
import org.tura.model.designer.repository.serialized.domain.DomainTypes;
import org.tura.model.designer.repository.serialized.domain.DomainTypesProxy;
import org.tura.model.designer.repository.serialized.type.PrimitivesGroup;
import org.tura.model.designer.repository.serialized.type.PrimitivesGroupProxy;
import org.tura.model.designer.repository.serialized.type.Primitive;
import org.tura.model.designer.repository.serialized.type.PrimitiveProxy;
import org.tura.model.designer.repository.serialized.objectmapper.OmRelation;
import org.tura.model.designer.repository.serialized.objectmapper.OmRelationProxy;
import org.tura.model.designer.repository.serialized.form.ContextParameter;
import org.tura.model.designer.repository.serialized.form.ContextParameterProxy;
import org.tura.model.designer.repository.serialized.form.ContextValue;
import org.tura.model.designer.repository.serialized.form.ContextValueProxy;
import org.tura.model.designer.repository.serialized.form.ExpressionPart;
import org.tura.model.designer.repository.serialized.form.ExpressionPartProxy;
import org.tura.model.designer.repository.serialized.form.Selection;
import org.tura.model.designer.repository.serialized.form.SelectionProxy;
import org.tura.model.designer.repository.serialized.form.Context;
import org.tura.model.designer.repository.serialized.form.ContextProxy;
import org.tura.model.designer.repository.serialized.form.Uielement;
import org.tura.model.designer.repository.serialized.form.UielementProxy;
import org.tura.model.designer.repository.serialized.form.AreaRef;
import org.tura.model.designer.repository.serialized.form.AreaRefProxy;
import org.tura.model.designer.repository.serialized.form.OverlayCanvas;
import org.tura.model.designer.repository.serialized.form.OverlayCanvasProxy;
import org.tura.model.designer.repository.serialized.form.CanvasFrame;
import org.tura.model.designer.repository.serialized.form.CanvasFrameProxy;
import org.tura.model.designer.repository.serialized.form.ViewInheritance;
import org.tura.model.designer.repository.serialized.form.ViewInheritanceProxy;
import org.tura.model.designer.repository.serialized.form.Views;
import org.tura.model.designer.repository.serialized.form.ViewsProxy;
import org.tura.model.designer.repository.serialized.form.TabPagesInheritance;
import org.tura.model.designer.repository.serialized.form.TabPagesInheritanceProxy;
import org.tura.model.designer.repository.serialized.form.TabCanvas;
import org.tura.model.designer.repository.serialized.form.TabCanvasProxy;
import org.tura.model.designer.repository.serialized.artifact.Classifier;
import org.tura.model.designer.repository.serialized.artifact.ClassifierProxy;
import org.tura.model.designer.repository.serialized.artifact.GenerationHint;
import org.tura.model.designer.repository.serialized.artifact.GenerationHintProxy;
import org.tura.model.designer.repository.serialized.artifact.GenerationHintWithNickName;
import org.tura.model.designer.repository.serialized.artifact.GenerationHintWithNickNameProxy;
import org.tura.model.designer.repository.serialized.form.OrderBy;
import org.tura.model.designer.repository.serialized.form.OrderByProxy;
import org.tura.model.designer.repository.serialized.form.Orders;
import org.tura.model.designer.repository.serialized.form.OrdersProxy;
import org.tura.model.designer.repository.serialized.artifact.TechLeaf;
import org.tura.model.designer.repository.serialized.artifact.TechLeafProxy;
import org.tura.model.designer.repository.serialized.artifact.ConfigHash;
import org.tura.model.designer.repository.serialized.artifact.ConfigHashProxy;
import org.tura.model.designer.repository.serialized.artifact.ConfigHashWithNickName;
import org.tura.model.designer.repository.serialized.artifact.ConfigHashWithNickNameProxy;
import org.tura.model.designer.repository.serialized.recipe.HashProperty;
import org.tura.model.designer.repository.serialized.recipe.HashPropertyProxy;
import org.tura.model.designer.repository.serialized.recipe.KeyValuePair;
import org.tura.model.designer.repository.serialized.recipe.KeyValuePairProxy;
import org.tura.model.designer.repository.serialized.artifact.Option;
import org.tura.model.designer.repository.serialized.artifact.OptionProxy;
import org.tura.model.designer.repository.serialized.recipe.MappingTecnologiy;
import org.tura.model.designer.repository.serialized.recipe.MappingTecnologiyProxy;
import org.tura.model.designer.repository.serialized.artifact.Technology;
import org.tura.model.designer.repository.serialized.artifact.TechnologyProxy;
import org.tura.model.designer.repository.serialized.form.FlexField;
import org.tura.model.designer.repository.serialized.form.FlexFieldProxy;
import org.tura.model.designer.repository.serialized.form.MenuItem;
import org.tura.model.designer.repository.serialized.form.MenuItemProxy;
import org.tura.model.designer.repository.serialized.form.MenuElement;
import org.tura.model.designer.repository.serialized.form.MenuElementProxy;
import org.tura.model.designer.repository.serialized.form.MenuFolder;
import org.tura.model.designer.repository.serialized.form.MenuFolderProxy;
import org.tura.model.designer.repository.serialized.form.ToSubmenu;
import org.tura.model.designer.repository.serialized.form.ToSubmenuProxy;
import org.tura.model.designer.repository.serialized.form.MenuDefinition;
import org.tura.model.designer.repository.serialized.form.MenuDefinitionProxy;
import org.tura.model.designer.repository.serialized.form.SubMenu;
import org.tura.model.designer.repository.serialized.form.SubMenuProxy;
import org.tura.model.designer.repository.serialized.form.Tree;
import org.tura.model.designer.repository.serialized.form.TreeProxy;
import org.tura.model.designer.repository.serialized.form.Column;
import org.tura.model.designer.repository.serialized.form.ColumnProxy;
import org.tura.model.designer.repository.serialized.form.Table;
import org.tura.model.designer.repository.serialized.form.TableProxy;
import org.tura.model.designer.repository.serialized.form.SourcesPointer;
import org.tura.model.designer.repository.serialized.form.SourcesPointerProxy;
import org.tura.model.designer.repository.serialized.form.TabPage;
import org.tura.model.designer.repository.serialized.form.TabPageProxy;
import org.tura.model.designer.repository.serialized.form.Form;
import org.tura.model.designer.repository.serialized.form.FormProxy;
import org.tura.model.designer.repository.serialized.form.Controls;
import org.tura.model.designer.repository.serialized.form.ControlsProxy;
import org.tura.model.designer.repository.serialized.form.Root;
import org.tura.model.designer.repository.serialized.form.RootProxy;
import org.tura.model.designer.repository.serialized.form.PREFormTrigger;
import org.tura.model.designer.repository.serialized.form.PREFormTriggerProxy;
import org.tura.model.designer.repository.serialized.type.Operation;
import org.tura.model.designer.repository.serialized.type.OperationProxy;
import org.tura.model.designer.repository.serialized.type.Parameter;
import org.tura.model.designer.repository.serialized.type.ParameterProxy;
import org.tura.model.designer.repository.serialized.type.ReturnValue;
import org.tura.model.designer.repository.serialized.type.ReturnValueProxy;
import org.tura.model.designer.repository.serialized.permission.GrantAccess;
import org.tura.model.designer.repository.serialized.permission.GrantAccessProxy;
import org.tura.model.designer.repository.serialized.form.FormVariable;
import org.tura.model.designer.repository.serialized.form.FormVariableProxy;
import org.tura.model.designer.repository.serialized.form.FormParameter;
import org.tura.model.designer.repository.serialized.form.FormParameterProxy;
import org.tura.model.designer.repository.serialized.form.Relation;
import org.tura.model.designer.repository.serialized.form.RelationProxy;
import org.tura.model.designer.repository.serialized.form.Dependency;
import org.tura.model.designer.repository.serialized.form.DependencyProxy;
import org.tura.model.designer.repository.serialized.application.ApplicationUIPackage;
import org.tura.model.designer.repository.serialized.application.ApplicationUIPackageProxy;
import org.tura.model.designer.repository.serialized.application.ApplicationUILayer;
import org.tura.model.designer.repository.serialized.application.ApplicationUILayerProxy;
import org.tura.model.designer.repository.serialized.application.Application;
import org.tura.model.designer.repository.serialized.application.ApplicationProxy;
import org.tura.model.designer.repository.serialized.application.ApplicationRecipes;
import org.tura.model.designer.repository.serialized.application.ApplicationRecipesProxy;
import org.tura.model.designer.repository.serialized.application.ApplicationRecipe;
import org.tura.model.designer.repository.serialized.application.ApplicationRecipeProxy;
import org.tura.model.designer.repository.serialized.application.ApplicationMappers;
import org.tura.model.designer.repository.serialized.application.ApplicationMappersProxy;
import org.tura.model.designer.repository.serialized.application.ApplicationMapper;
import org.tura.model.designer.repository.serialized.application.ApplicationMapperProxy;
import org.tura.model.designer.repository.serialized.mapper.Mappers;
import org.tura.model.designer.repository.serialized.mapper.MappersProxy;
import org.tura.model.designer.repository.serialized.recipe.JavaComponent;
import org.tura.model.designer.repository.serialized.recipe.JavaComponentProxy;
import org.tura.model.designer.repository.serialized.mapper.Version;
import org.tura.model.designer.repository.serialized.mapper.VersionProxy;
import org.tura.model.designer.repository.serialized.recipe.JavaScriptComponent;
import org.tura.model.designer.repository.serialized.recipe.JavaScriptComponentProxy;
import org.tura.model.designer.repository.serialized.mapper.MappingLayer;
import org.tura.model.designer.repository.serialized.mapper.MappingLayerProxy;
import org.tura.model.designer.repository.serialized.application.ApplicationInfrastructureLayers;
import org.tura.model.designer.repository.serialized.application.ApplicationInfrastructureLayersProxy;
import org.tura.model.designer.repository.serialized.application.ApplicationInfrastructureLayer;
import org.tura.model.designer.repository.serialized.application.ApplicationInfrastructureLayerProxy;
import org.tura.model.designer.repository.serialized.infra.EnterpriseInfrastructure;
import org.tura.model.designer.repository.serialized.infra.EnterpriseInfrastructureProxy;
import org.tura.model.designer.repository.serialized.infra.Datacenter;
import org.tura.model.designer.repository.serialized.infra.DatacenterProxy;
import org.tura.model.designer.repository.serialized.infra.Subsystem;
import org.tura.model.designer.repository.serialized.infra.SubsystemProxy;
import org.tura.model.designer.repository.serialized.infra.InfrastructureLayer;
import org.tura.model.designer.repository.serialized.infra.InfrastructureLayerProxy;
import org.tura.model.designer.repository.serialized.infra.InfrastructureComponent;
import org.tura.model.designer.repository.serialized.infra.InfrastructureComponentProxy;
import org.tura.model.designer.repository.serialized.infra.InfrastructureConnection;
import org.tura.model.designer.repository.serialized.infra.InfrastructureConnectionProxy;
import org.tura.model.designer.repository.serialized.application.ApplicationStyleLibraries;
import org.tura.model.designer.repository.serialized.application.ApplicationStyleLibrariesProxy;
import org.tura.model.designer.repository.serialized.application.ApplicationStyle;
import org.tura.model.designer.repository.serialized.application.ApplicationStyleProxy;
import org.tura.model.designer.repository.serialized.style.StyleLibrary;
import org.tura.model.designer.repository.serialized.style.StyleLibraryProxy;
import org.tura.model.designer.repository.serialized.style.StyleSet;
import org.tura.model.designer.repository.serialized.style.StyleSetProxy;
import org.tura.model.designer.repository.serialized.application.ApplicationRealms;
import org.tura.model.designer.repository.serialized.application.ApplicationRealmsProxy;
import org.tura.model.designer.repository.serialized.application.ApplicationRealm;
import org.tura.model.designer.repository.serialized.application.ApplicationRealmProxy;
import org.tura.model.designer.repository.serialized.permission.Roles;
import org.tura.model.designer.repository.serialized.permission.RolesProxy;
import org.tura.model.designer.repository.serialized.permission.Role;
import org.tura.model.designer.repository.serialized.permission.RoleProxy;
import org.tura.model.designer.repository.serialized.permission.Group2Role;
import org.tura.model.designer.repository.serialized.permission.Group2RoleProxy;
import org.tura.model.designer.repository.serialized.permission.Group;
import org.tura.model.designer.repository.serialized.permission.GroupProxy;
import org.tura.model.designer.repository.serialized.permission.Group2Group;
import org.tura.model.designer.repository.serialized.permission.Group2GroupProxy;
import org.tura.model.designer.repository.serialized.application.ApplicationMessageLibraries;
import org.tura.model.designer.repository.serialized.application.ApplicationMessageLibrariesProxy;
import org.tura.model.designer.repository.serialized.application.ApplicationMessageLibrary;
import org.tura.model.designer.repository.serialized.application.ApplicationMessageLibraryProxy;
import org.tura.model.designer.repository.serialized.message.MessageLibrary;
import org.tura.model.designer.repository.serialized.message.MessageLibraryProxy;
import org.tura.model.designer.repository.serialized.message.Message;
import org.tura.model.designer.repository.serialized.message.MessageProxy;
import org.tura.model.designer.repository.serialized.message.Translation;
import org.tura.model.designer.repository.serialized.message.TranslationProxy;
import org.tura.model.designer.repository.serialized.message.Language;
import org.tura.model.designer.repository.serialized.message.LanguageProxy;
import org.tura.model.designer.repository.serialized.application.ApplicationLanguages;
import org.tura.model.designer.repository.serialized.application.ApplicationLanguagesProxy;
import org.tura.model.designer.repository.serialized.application.ApplicationGroup;
import org.tura.model.designer.repository.serialized.application.ApplicationGroupProxy;
import org.tura.model.designer.repository.serialized.domain.DomainApplication;
import org.tura.model.designer.repository.serialized.domain.DomainApplicationProxy;
import org.tura.model.designer.repository.serialized.domain.DomainApplications;
import org.tura.model.designer.repository.serialized.domain.DomainApplicationsProxy;
import org.tura.model.designer.repository.serialized.form.ViewPort;
import org.tura.model.designer.repository.serialized.form.ViewPortProxy;
import org.tura.model.designer.repository.serialized.form.ViewPortTrigger;
import org.tura.model.designer.repository.serialized.form.ViewPortTriggerProxy;
import org.tura.model.designer.repository.serialized.form.DataExporter;
import org.tura.model.designer.repository.serialized.form.DataExporterProxy;
import org.tura.model.designer.repository.serialized.form.InputElement;
import org.tura.model.designer.repository.serialized.form.InputElementProxy;
import org.tura.model.designer.repository.serialized.form.LinkToMessage;
import org.tura.model.designer.repository.serialized.form.LinkToMessageProxy;
import org.tura.model.designer.repository.serialized.form.ViewArea;
import org.tura.model.designer.repository.serialized.form.ViewAreaProxy;
import org.tura.model.designer.repository.serialized.form.LayerHolder;
import org.tura.model.designer.repository.serialized.form.LayerHolderProxy;
import org.tura.model.designer.repository.serialized.form.LinkToLabel;
import org.tura.model.designer.repository.serialized.form.LinkToLabelProxy;
import org.tura.model.designer.repository.serialized.form.Label;
import org.tura.model.designer.repository.serialized.form.LabelProxy;
import org.tura.model.designer.repository.serialized.form.MessageElement;
import org.tura.model.designer.repository.serialized.form.MessageElementProxy;
import org.tura.model.designer.repository.serialized.form.RelationMapper;
import org.tura.model.designer.repository.serialized.form.RelationMapperProxy;
import org.tura.model.designer.repository.serialized.form.InternalRelation;
import org.tura.model.designer.repository.serialized.form.InternalRelationProxy;
import org.tura.model.designer.repository.serialized.type.AttributePointer;
import org.tura.model.designer.repository.serialized.type.AttributePointerProxy;
import org.tura.model.designer.repository.serialized.form.PREQueryTrigger;
import org.tura.model.designer.repository.serialized.form.PREQueryTriggerProxy;
import org.tura.model.designer.repository.serialized.form.POSTQueryTrigger;
import org.tura.model.designer.repository.serialized.form.POSTQueryTriggerProxy;
import org.tura.model.designer.repository.serialized.form.PREInsertTrigger;
import org.tura.model.designer.repository.serialized.form.PREInsertTriggerProxy;
import org.tura.model.designer.repository.serialized.form.PREDeleteTrigger;
import org.tura.model.designer.repository.serialized.form.PREDeleteTriggerProxy;
import org.tura.model.designer.repository.serialized.form.POSTCreateTrigger;
import org.tura.model.designer.repository.serialized.form.POSTCreateTriggerProxy;
import org.tura.model.designer.repository.serialized.form.PREUpdateTrigger;
import org.tura.model.designer.repository.serialized.form.PREUpdateTriggerProxy;
import org.tura.model.designer.repository.serialized.form.CreateTrigger;
import org.tura.model.designer.repository.serialized.form.CreateTriggerProxy;
import org.tura.model.designer.repository.serialized.form.SearchTrigger;
import org.tura.model.designer.repository.serialized.form.SearchTriggerProxy;
import org.tura.model.designer.repository.serialized.form.ArtificialField;
import org.tura.model.designer.repository.serialized.form.ArtificialFieldProxy;
import org.tura.model.designer.repository.serialized.objectmapper.CalculatedField;
import org.tura.model.designer.repository.serialized.objectmapper.CalculatedFieldProxy;
import org.tura.model.designer.repository.serialized.objectmapper.Aggregation;
import org.tura.model.designer.repository.serialized.objectmapper.AggregationProxy;
import org.tura.model.designer.repository.serialized.objectmapper.ProcessingStage;
import org.tura.model.designer.repository.serialized.objectmapper.ProcessingStageProxy;
import org.tura.model.designer.repository.serialized.objectmapper.Variable;
import org.tura.model.designer.repository.serialized.objectmapper.VariableProxy;
import org.tura.model.designer.repository.serialized.domain.DomainMapper;
import org.tura.model.designer.repository.serialized.domain.DomainMapperProxy;
import org.tura.model.designer.repository.serialized.domain.DomainMappers;
import org.tura.model.designer.repository.serialized.domain.DomainMappersProxy;
import org.tura.model.designer.repository.serialized.recipe.Query;
import org.tura.model.designer.repository.serialized.recipe.QueryProxy;
import org.tura.model.designer.repository.serialized.recipe.QueryVariable;
import org.tura.model.designer.repository.serialized.recipe.QueryVariableProxy;
import org.tura.model.designer.repository.serialized.artifact.QueryParameter;
import org.tura.model.designer.repository.serialized.artifact.QueryParameterProxy;
import org.tura.model.designer.repository.serialized.artifact.ModelQuery;
import org.tura.model.designer.repository.serialized.artifact.ModelQueryProxy;
import org.tura.model.designer.repository.serialized.recipe.Recipe2Infrastructure;
import org.tura.model.designer.repository.serialized.recipe.Recipe2InfrastructureProxy;
import org.tura.model.designer.repository.serialized.recipe.Infrastructure;
import org.tura.model.designer.repository.serialized.recipe.InfrastructureProxy;
import org.tura.model.designer.repository.serialized.recipe.Infrastructure2Configuration;
import org.tura.model.designer.repository.serialized.recipe.Infrastructure2ConfigurationProxy;
import org.tura.model.designer.repository.serialized.type.References;
import org.tura.model.designer.repository.serialized.type.ReferencesProxy;
import org.tura.model.designer.repository.serialized.type.Generalization;
import org.tura.model.designer.repository.serialized.type.GeneralizationProxy;
import org.tura.model.designer.repository.serialized.type.TypeReference;
import org.tura.model.designer.repository.serialized.type.TypeReferenceProxy;
import org.tura.model.designer.repository.serialized.type.Enumerator;
import org.tura.model.designer.repository.serialized.type.EnumeratorProxy;
import org.tura.model.designer.repository.serialized.type.EnumAttribute;
import org.tura.model.designer.repository.serialized.type.EnumAttributeProxy;
import org.tura.model.designer.repository.serialized.infra.Server;
import org.tura.model.designer.repository.serialized.infra.ServerProxy;
import org.tura.model.designer.repository.serialized.infra.ServerClaster;
import org.tura.model.designer.repository.serialized.infra.ServerClasterProxy;
import org.tura.model.designer.repository.serialized.infra.Router;
import org.tura.model.designer.repository.serialized.infra.RouterProxy;
import org.tura.model.designer.repository.serialized.infra.Hub;
import org.tura.model.designer.repository.serialized.infra.HubProxy;
import org.tura.model.designer.repository.serialized.infra.Storage;
import org.tura.model.designer.repository.serialized.infra.StorageProxy;
import org.tura.model.designer.repository.serialized.form.PopupCanvas;
import org.tura.model.designer.repository.serialized.form.PopupCanvasProxy;
import org.tura.model.designer.repository.serialized.form.Canvas;
import org.tura.model.designer.repository.serialized.form.CanvasProxy;
import org.tura.model.designer.repository.serialized.form.Window;
import org.tura.model.designer.repository.serialized.form.WindowProxy;
import org.tura.model.designer.repository.serialized.form.InputText;
import org.tura.model.designer.repository.serialized.form.InputTextProxy;
import org.tura.model.designer.repository.serialized.form.Password;
import org.tura.model.designer.repository.serialized.form.PasswordProxy;
import org.tura.model.designer.repository.serialized.form.OutputText;
import org.tura.model.designer.repository.serialized.form.OutputTextProxy;
import org.tura.model.designer.repository.serialized.form.CheckBox;
import org.tura.model.designer.repository.serialized.form.CheckBoxProxy;
import org.tura.model.designer.repository.serialized.form.DropDownSelection;
import org.tura.model.designer.repository.serialized.form.DropDownSelectionProxy;
import org.tura.model.designer.repository.serialized.form.SelectManyMenu;
import org.tura.model.designer.repository.serialized.form.SelectManyMenuProxy;
import org.tura.model.designer.repository.serialized.form.RadioSelection;
import org.tura.model.designer.repository.serialized.form.RadioSelectionProxy;
import org.tura.model.designer.repository.serialized.form.Image;
import org.tura.model.designer.repository.serialized.form.ImageProxy;
import org.tura.model.designer.repository.serialized.form.Date;
import org.tura.model.designer.repository.serialized.form.DateProxy;
import org.tura.model.designer.repository.serialized.form.Button;
import org.tura.model.designer.repository.serialized.form.ButtonProxy;
import org.tura.model.designer.repository.serialized.form.Menu;
import org.tura.model.designer.repository.serialized.form.MenuProxy;
import org.tura.model.designer.repository.serialized.form.BlockUI;
import org.tura.model.designer.repository.serialized.form.BlockUIProxy;
import org.tura.model.designer.repository.serialized.form.FileUpload;
import org.tura.model.designer.repository.serialized.form.FileUploadProxy;
import org.tura.model.designer.repository.serialized.form.FileDownload;
import org.tura.model.designer.repository.serialized.form.FileDownloadProxy;
import org.tura.model.designer.repository.serialized.form.DataScroller;
import org.tura.model.designer.repository.serialized.form.DataScrollerProxy;
import org.tura.model.designer.repository.serialized.form.TimeLine;
import org.tura.model.designer.repository.serialized.form.TimeLineProxy;
import org.tura.model.designer.repository.serialized.form.FullCalendar;
import org.tura.model.designer.repository.serialized.form.FullCalendarProxy;
import org.tura.model.designer.repository.serialized.form.Poll;
import org.tura.model.designer.repository.serialized.form.PollProxy;
import org.tura.model.designer.repository.serialized.form.DataTemplate;
import org.tura.model.designer.repository.serialized.form.DataTemplateProxy;
import org.tura.model.designer.repository.serialized.form.WindowRef;
import org.tura.model.designer.repository.serialized.form.WindowRefProxy;
import org.tura.model.designer.repository.serialized.form.MenuExtensionPoint;
import org.tura.model.designer.repository.serialized.form.MenuExtensionPointProxy;
import org.tura.model.designer.repository.serialized.form.MenuSeparator;
import org.tura.model.designer.repository.serialized.form.MenuSeparatorProxy;
import org.tura.model.designer.repository.serialized.form.InsertTrigger;
import org.tura.model.designer.repository.serialized.form.InsertTriggerProxy;
import org.tura.model.designer.repository.serialized.form.UpdateTrigger;
import org.tura.model.designer.repository.serialized.form.UpdateTriggerProxy;
import org.tura.model.designer.repository.serialized.form.DeleteTrigger;
import org.tura.model.designer.repository.serialized.form.DeleteTriggerProxy;
import org.tura.model.designer.repository.serialized.mapper.JavaMapper;
import org.tura.model.designer.repository.serialized.mapper.JavaMapperProxy;
import org.tura.model.designer.repository.serialized.mapper.JavaPackageMapper;
import org.tura.model.designer.repository.serialized.mapper.JavaPackageMapperProxy;
import org.tura.model.designer.repository.serialized.mapper.JavaScriptMapper;
import org.tura.model.designer.repository.serialized.mapper.JavaScriptMapperProxy;
import org.tura.model.designer.repository.serialized.mapper.CSSMapper;
import org.tura.model.designer.repository.serialized.mapper.CSSMapperProxy;
import org.tura.model.designer.repository.serialized.mapper.RoleMapper;
import org.tura.model.designer.repository.serialized.mapper.RoleMapperProxy;
import org.tura.model.designer.repository.serialized.mapper.XMLPackageMapper;
import org.tura.model.designer.repository.serialized.mapper.XMLPackageMapperProxy;
import org.tura.model.designer.repository.serialized.mapper.XMLTypeMapper;
import org.tura.model.designer.repository.serialized.mapper.XMLTypeMapperProxy;
import org.tura.model.designer.repository.serialized.mapper.MetamodelPackageMapper;
import org.tura.model.designer.repository.serialized.mapper.MetamodelPackageMapperProxy;
import org.tura.model.designer.repository.serialized.dictionary.ListOfLanguages;
import org.tura.model.designer.repository.serialized.dictionary.ListOfLanguagesProxy;
import org.tura.model.designer.repository.serialized.dictionary.ConfigHashAggregator;
import org.tura.model.designer.repository.serialized.dictionary.ConfigHashAggregatorProxy;
import org.tura.model.designer.repository.serialized.dictionary.ConfigVariableAggregator;
import org.tura.model.designer.repository.serialized.dictionary.ConfigVariableAggregatorProxy;
import org.tura.model.designer.repository.serialized.dictionary.GenerationHintAggregator;
import org.tura.model.designer.repository.serialized.dictionary.GenerationHintAggregatorProxy;
import org.tura.model.designer.repository.serialized.dictionary.RootST;
import org.tura.model.designer.repository.serialized.dictionary.RootSTProxy;
import org.tura.model.designer.repository.serialized.dictionary.TypesAggregator;
import org.tura.model.designer.repository.serialized.dictionary.TypesAggregatorProxy;
import org.tura.model.designer.repository.serialized.dictionary.OptionsSet;
import org.tura.model.designer.repository.serialized.dictionary.OptionsSetProxy;
import org.tura.platform.repository.core.RepositoryException;
import java.util.ArrayList;

public class ProxyRepository extends CpaRepositoryImpl {

  private static final long serialVersionUID = 1L;

  private static List<String> topObjects;

  private static List<String> instantiable;

  private static List<String> notInstantiable;

  public ProxyRepository() {}

  public List<String> getTopObjects() {
    return topObjects;
  }

  public List<String> getInstantiable() {
    return instantiable;
  }

  public List<String> getNotInstantiable() {
    return notInstantiable;
  }

  public Object factory(Object obj, String objectClass) throws RepositoryException {
    switch (objectClass) {
      case "org.tura.model.designer.repository.serialized.domain.Domain":
        return new DomainProxy((Domain) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.domain.DomainArtifacts":
        return new DomainArtifactsProxy((DomainArtifacts) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.domain.DomainArtifact":
        return new DomainArtifactProxy((DomainArtifact) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.artifact.ArtifactGroup":
        return new ArtifactGroupProxy((ArtifactGroup) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.artifact.Artifact":
        return new ArtifactProxy((Artifact) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.artifact.ConfigVariableWithNickName":
        return new ConfigVariableWithNickNameProxy(
            (ConfigVariableWithNickName) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.artifact.ConfigVariable":
        return new ConfigVariableProxy((ConfigVariable) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.recipe.Property":
        return new PropertyProxy((Property) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.recipe.Configuration":
        return new ConfigurationProxy((Configuration) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.recipe.ConfigExtension":
        return new ConfigExtensionProxy((ConfigExtension) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.recipe.Recipes":
        return new RecipesProxy((Recipes) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.recipe.Recipe":
        return new RecipeProxy((Recipe) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.recipe.Ingredient":
        return new IngredientProxy((Ingredient) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.recipe.Component":
        return new ComponentProxy((Component) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.recipe.ModelMapper":
        return new ModelMapperProxy((ModelMapper) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.recipe.DeploymentComponent":
        return new DeploymentComponentProxy((DeploymentComponent) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.recipe.DeploymentStarStep":
        return new DeploymentStarStepProxy((DeploymentStarStep) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.objectmapper.AttributeConnector":
        return new AttributeConnectorProxy((AttributeConnector) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.form.ContextParametersObj":
        return new ContextParametersObjProxy(
            (ContextParametersObj) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.objectmapper.OperationConnector":
        return new OperationConnectorProxy((OperationConnector) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.objectmapper.ObjectMapperGroup":
        return new ObjectMapperGroupProxy((ObjectMapperGroup) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.objectmapper.ObjectMapper":
        return new ObjectMapperProxy((ObjectMapper) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.type.TypePointerObj":
        return new TypePointerObjProxy((TypePointerObj) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.form.DataControl":
        return new DataControlProxy((DataControl) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.type.Type":
        return new TypeProxy((Type) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.type.Attribute":
        return new AttributeProxy((Attribute) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.type.Link":
        return new LinkProxy((Link) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.type.Assosiation":
        return new AssosiationProxy((Assosiation) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.type.TypeElement":
        return new TypeElementProxy((TypeElement) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.type.Relationship":
        return new RelationshipProxy((Relationship) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.type.TypeGroup":
        return new TypeGroupProxy((TypeGroup) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.domain.DomainTypesRepository":
        return new DomainTypesRepositoryProxy(
            (DomainTypesRepository) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.domain.DomainTypes":
        return new DomainTypesProxy((DomainTypes) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.type.PrimitivesGroup":
        return new PrimitivesGroupProxy((PrimitivesGroup) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.type.Primitive":
        return new PrimitiveProxy((Primitive) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.objectmapper.OmRelation":
        return new OmRelationProxy((OmRelation) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.form.ContextParameter":
        return new ContextParameterProxy((ContextParameter) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.form.ContextValue":
        return new ContextValueProxy((ContextValue) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.form.ExpressionPart":
        return new ExpressionPartProxy((ExpressionPart) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.form.Selection":
        return new SelectionProxy((Selection) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.form.Context":
        return new ContextProxy((Context) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.form.Uielement":
        return new UielementProxy((Uielement) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.form.AreaRef":
        return new AreaRefProxy((AreaRef) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.form.OverlayCanvas":
        return new OverlayCanvasProxy((OverlayCanvas) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.form.CanvasFrame":
        return new CanvasFrameProxy((CanvasFrame) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.form.ViewInheritance":
        return new ViewInheritanceProxy((ViewInheritance) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.form.Views":
        return new ViewsProxy((Views) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.form.TabPagesInheritance":
        return new TabPagesInheritanceProxy((TabPagesInheritance) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.form.TabCanvas":
        return new TabCanvasProxy((TabCanvas) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.artifact.Classifier":
        return new ClassifierProxy((Classifier) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.artifact.GenerationHint":
        return new GenerationHintProxy((GenerationHint) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.artifact.GenerationHintWithNickName":
        return new GenerationHintWithNickNameProxy(
            (GenerationHintWithNickName) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.form.OrderBy":
        return new OrderByProxy((OrderBy) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.form.Orders":
        return new OrdersProxy((Orders) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.artifact.TechLeaf":
        return new TechLeafProxy((TechLeaf) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.artifact.ConfigHash":
        return new ConfigHashProxy((ConfigHash) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.artifact.ConfigHashWithNickName":
        return new ConfigHashWithNickNameProxy(
            (ConfigHashWithNickName) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.recipe.HashProperty":
        return new HashPropertyProxy((HashProperty) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.recipe.KeyValuePair":
        return new KeyValuePairProxy((KeyValuePair) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.artifact.Option":
        return new OptionProxy((Option) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.recipe.MappingTecnologiy":
        return new MappingTecnologiyProxy((MappingTecnologiy) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.artifact.Technology":
        return new TechnologyProxy((Technology) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.form.FlexField":
        return new FlexFieldProxy((FlexField) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.form.MenuItem":
        return new MenuItemProxy((MenuItem) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.form.MenuElement":
        return new MenuElementProxy((MenuElement) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.form.MenuFolder":
        return new MenuFolderProxy((MenuFolder) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.form.ToSubmenu":
        return new ToSubmenuProxy((ToSubmenu) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.form.MenuDefinition":
        return new MenuDefinitionProxy((MenuDefinition) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.form.SubMenu":
        return new SubMenuProxy((SubMenu) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.form.Tree":
        return new TreeProxy((Tree) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.form.Column":
        return new ColumnProxy((Column) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.form.Table":
        return new TableProxy((Table) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.form.SourcesPointer":
        return new SourcesPointerProxy((SourcesPointer) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.form.TabPage":
        return new TabPageProxy((TabPage) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.form.Form":
        return new FormProxy((Form) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.form.Controls":
        return new ControlsProxy((Controls) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.form.Root":
        return new RootProxy((Root) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.form.PREFormTrigger":
        return new PREFormTriggerProxy((PREFormTrigger) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.type.Operation":
        return new OperationProxy((Operation) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.type.Parameter":
        return new ParameterProxy((Parameter) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.type.ReturnValue":
        return new ReturnValueProxy((ReturnValue) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.permission.GrantAccess":
        return new GrantAccessProxy((GrantAccess) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.form.FormVariable":
        return new FormVariableProxy((FormVariable) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.form.FormParameter":
        return new FormParameterProxy((FormParameter) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.form.Relation":
        return new RelationProxy((Relation) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.form.Dependency":
        return new DependencyProxy((Dependency) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.application.ApplicationUIPackage":
        return new ApplicationUIPackageProxy(
            (ApplicationUIPackage) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.application.ApplicationUILayer":
        return new ApplicationUILayerProxy((ApplicationUILayer) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.application.Application":
        return new ApplicationProxy((Application) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.application.ApplicationRecipes":
        return new ApplicationRecipesProxy((ApplicationRecipes) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.application.ApplicationRecipe":
        return new ApplicationRecipeProxy((ApplicationRecipe) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.application.ApplicationMappers":
        return new ApplicationMappersProxy((ApplicationMappers) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.application.ApplicationMapper":
        return new ApplicationMapperProxy((ApplicationMapper) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.mapper.Mappers":
        return new MappersProxy((Mappers) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.recipe.JavaComponent":
        return new JavaComponentProxy((JavaComponent) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.mapper.Version":
        return new VersionProxy((Version) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.recipe.JavaScriptComponent":
        return new JavaScriptComponentProxy((JavaScriptComponent) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.mapper.MappingLayer":
        return new MappingLayerProxy((MappingLayer) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.application.ApplicationInfrastructureLayers":
        return new ApplicationInfrastructureLayersProxy(
            (ApplicationInfrastructureLayers) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.application.ApplicationInfrastructureLayer":
        return new ApplicationInfrastructureLayerProxy(
            (ApplicationInfrastructureLayer) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.infra.EnterpriseInfrastructure":
        return new EnterpriseInfrastructureProxy(
            (EnterpriseInfrastructure) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.infra.Datacenter":
        return new DatacenterProxy((Datacenter) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.infra.Subsystem":
        return new SubsystemProxy((Subsystem) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.infra.InfrastructureLayer":
        return new InfrastructureLayerProxy((InfrastructureLayer) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.infra.InfrastructureComponent":
        return new InfrastructureComponentProxy(
            (InfrastructureComponent) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.infra.InfrastructureConnection":
        return new InfrastructureConnectionProxy(
            (InfrastructureConnection) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.application.ApplicationStyleLibraries":
        return new ApplicationStyleLibrariesProxy(
            (ApplicationStyleLibraries) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.application.ApplicationStyle":
        return new ApplicationStyleProxy((ApplicationStyle) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.style.StyleLibrary":
        return new StyleLibraryProxy((StyleLibrary) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.style.StyleSet":
        return new StyleSetProxy((StyleSet) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.application.ApplicationRealms":
        return new ApplicationRealmsProxy((ApplicationRealms) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.application.ApplicationRealm":
        return new ApplicationRealmProxy((ApplicationRealm) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.permission.Roles":
        return new RolesProxy((Roles) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.permission.Role":
        return new RoleProxy((Role) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.permission.Group2Role":
        return new Group2RoleProxy((Group2Role) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.permission.Group":
        return new GroupProxy((Group) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.permission.Group2Group":
        return new Group2GroupProxy((Group2Group) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.application.ApplicationMessageLibraries":
        return new ApplicationMessageLibrariesProxy(
            (ApplicationMessageLibraries) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.application.ApplicationMessageLibrary":
        return new ApplicationMessageLibraryProxy(
            (ApplicationMessageLibrary) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.message.MessageLibrary":
        return new MessageLibraryProxy((MessageLibrary) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.message.Message":
        return new MessageProxy((Message) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.message.Translation":
        return new TranslationProxy((Translation) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.message.Language":
        return new LanguageProxy((Language) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.application.ApplicationLanguages":
        return new ApplicationLanguagesProxy(
            (ApplicationLanguages) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.application.ApplicationGroup":
        return new ApplicationGroupProxy((ApplicationGroup) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.domain.DomainApplication":
        return new DomainApplicationProxy((DomainApplication) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.domain.DomainApplications":
        return new DomainApplicationsProxy((DomainApplications) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.form.ViewPort":
        return new ViewPortProxy((ViewPort) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.form.ViewPortTrigger":
        return new ViewPortTriggerProxy((ViewPortTrigger) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.form.DataExporter":
        return new DataExporterProxy((DataExporter) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.form.InputElement":
        return new InputElementProxy((InputElement) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.form.LinkToMessage":
        return new LinkToMessageProxy((LinkToMessage) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.form.ViewArea":
        return new ViewAreaProxy((ViewArea) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.form.LayerHolder":
        return new LayerHolderProxy((LayerHolder) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.form.LinkToLabel":
        return new LinkToLabelProxy((LinkToLabel) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.form.Label":
        return new LabelProxy((Label) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.form.MessageElement":
        return new MessageElementProxy((MessageElement) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.form.RelationMapper":
        return new RelationMapperProxy((RelationMapper) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.form.InternalRelation":
        return new InternalRelationProxy((InternalRelation) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.type.AttributePointer":
        return new AttributePointerProxy((AttributePointer) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.form.PREQueryTrigger":
        return new PREQueryTriggerProxy((PREQueryTrigger) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.form.POSTQueryTrigger":
        return new POSTQueryTriggerProxy((POSTQueryTrigger) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.form.PREInsertTrigger":
        return new PREInsertTriggerProxy((PREInsertTrigger) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.form.PREDeleteTrigger":
        return new PREDeleteTriggerProxy((PREDeleteTrigger) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.form.POSTCreateTrigger":
        return new POSTCreateTriggerProxy((POSTCreateTrigger) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.form.PREUpdateTrigger":
        return new PREUpdateTriggerProxy((PREUpdateTrigger) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.form.CreateTrigger":
        return new CreateTriggerProxy((CreateTrigger) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.form.SearchTrigger":
        return new SearchTriggerProxy((SearchTrigger) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.form.ArtificialField":
        return new ArtificialFieldProxy((ArtificialField) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.objectmapper.CalculatedField":
        return new CalculatedFieldProxy((CalculatedField) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.objectmapper.Aggregation":
        return new AggregationProxy((Aggregation) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.objectmapper.ProcessingStage":
        return new ProcessingStageProxy((ProcessingStage) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.objectmapper.Variable":
        return new VariableProxy((Variable) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.domain.DomainMapper":
        return new DomainMapperProxy((DomainMapper) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.domain.DomainMappers":
        return new DomainMappersProxy((DomainMappers) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.recipe.Query":
        return new QueryProxy((Query) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.recipe.QueryVariable":
        return new QueryVariableProxy((QueryVariable) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.artifact.QueryParameter":
        return new QueryParameterProxy((QueryParameter) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.artifact.ModelQuery":
        return new ModelQueryProxy((ModelQuery) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.recipe.Recipe2Infrastructure":
        return new Recipe2InfrastructureProxy(
            (Recipe2Infrastructure) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.recipe.Infrastructure":
        return new InfrastructureProxy((Infrastructure) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.recipe.Infrastructure2Configuration":
        return new Infrastructure2ConfigurationProxy(
            (Infrastructure2Configuration) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.type.References":
        return new ReferencesProxy((References) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.type.Generalization":
        return new GeneralizationProxy((Generalization) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.type.TypeReference":
        return new TypeReferenceProxy((TypeReference) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.type.Enumerator":
        return new EnumeratorProxy((Enumerator) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.type.EnumAttribute":
        return new EnumAttributeProxy((EnumAttribute) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.infra.Server":
        return new ServerProxy((Server) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.infra.ServerClaster":
        return new ServerClasterProxy((ServerClaster) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.infra.Router":
        return new RouterProxy((Router) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.infra.Hub":
        return new HubProxy((Hub) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.infra.Storage":
        return new StorageProxy((Storage) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.form.PopupCanvas":
        return new PopupCanvasProxy((PopupCanvas) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.form.Canvas":
        return new CanvasProxy((Canvas) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.form.Window":
        return new WindowProxy((Window) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.form.InputText":
        return new InputTextProxy((InputText) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.form.Password":
        return new PasswordProxy((Password) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.form.OutputText":
        return new OutputTextProxy((OutputText) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.form.CheckBox":
        return new CheckBoxProxy((CheckBox) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.form.DropDownSelection":
        return new DropDownSelectionProxy((DropDownSelection) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.form.SelectManyMenu":
        return new SelectManyMenuProxy((SelectManyMenu) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.form.RadioSelection":
        return new RadioSelectionProxy((RadioSelection) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.form.Image":
        return new ImageProxy((Image) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.form.Date":
        return new DateProxy((Date) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.form.Button":
        return new ButtonProxy((Button) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.form.Menu":
        return new MenuProxy((Menu) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.form.BlockUI":
        return new BlockUIProxy((BlockUI) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.form.FileUpload":
        return new FileUploadProxy((FileUpload) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.form.FileDownload":
        return new FileDownloadProxy((FileDownload) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.form.DataScroller":
        return new DataScrollerProxy((DataScroller) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.form.TimeLine":
        return new TimeLineProxy((TimeLine) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.form.FullCalendar":
        return new FullCalendarProxy((FullCalendar) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.form.Poll":
        return new PollProxy((Poll) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.form.DataTemplate":
        return new DataTemplateProxy((DataTemplate) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.form.WindowRef":
        return new WindowRefProxy((WindowRef) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.form.MenuExtensionPoint":
        return new MenuExtensionPointProxy((MenuExtensionPoint) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.form.MenuSeparator":
        return new MenuSeparatorProxy((MenuSeparator) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.form.InsertTrigger":
        return new InsertTriggerProxy((InsertTrigger) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.form.UpdateTrigger":
        return new UpdateTriggerProxy((UpdateTrigger) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.form.DeleteTrigger":
        return new DeleteTriggerProxy((DeleteTrigger) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.mapper.JavaMapper":
        return new JavaMapperProxy((JavaMapper) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.mapper.JavaPackageMapper":
        return new JavaPackageMapperProxy((JavaPackageMapper) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.mapper.JavaScriptMapper":
        return new JavaScriptMapperProxy((JavaScriptMapper) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.mapper.CSSMapper":
        return new CSSMapperProxy((CSSMapper) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.mapper.RoleMapper":
        return new RoleMapperProxy((RoleMapper) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.mapper.XMLPackageMapper":
        return new XMLPackageMapperProxy((XMLPackageMapper) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.mapper.XMLTypeMapper":
        return new XMLTypeMapperProxy((XMLTypeMapper) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.mapper.MetamodelPackageMapper":
        return new MetamodelPackageMapperProxy(
            (MetamodelPackageMapper) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.dictionary.ListOfLanguages":
        return new ListOfLanguagesProxy((ListOfLanguages) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.dictionary.ConfigHashAggregator":
        return new ConfigHashAggregatorProxy(
            (ConfigHashAggregator) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.dictionary.ConfigVariableAggregator":
        return new ConfigVariableAggregatorProxy(
            (ConfigVariableAggregator) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.dictionary.GenerationHintAggregator":
        return new GenerationHintAggregatorProxy(
            (GenerationHintAggregator) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.dictionary.RootST":
        return new RootSTProxy((RootST) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.dictionary.TypesAggregator":
        return new TypesAggregatorProxy((TypesAggregator) obj, this, getStorageProvider());
      case "org.tura.model.designer.repository.serialized.dictionary.OptionsSet":
        return new OptionsSetProxy((OptionsSet) obj, this, getStorageProvider());
    }
    throw new RepositoryException("Class is not supported");
  }

  static {
    topObjects = new ArrayList<String>();
    instantiable = new ArrayList<String>();
    notInstantiable = new ArrayList<String>();
    instantiable.add("org.tura.model.designer.repository.serialized.domain.Domain");
    topObjects.add("org.tura.model.designer.repository.serialized.domain.Domain");
    instantiable.add("org.tura.model.designer.repository.serialized.domain.DomainArtifacts");
    instantiable.add("org.tura.model.designer.repository.serialized.domain.DomainArtifact");
    instantiable.add("org.tura.model.designer.repository.serialized.artifact.ArtifactGroup");
    instantiable.add("org.tura.model.designer.repository.serialized.artifact.Artifact");
    instantiable.add(
        "org.tura.model.designer.repository.serialized.artifact.ConfigVariableWithNickName");
    instantiable.add("org.tura.model.designer.repository.serialized.artifact.ConfigVariable");
    instantiable.add("org.tura.model.designer.repository.serialized.recipe.Property");
    instantiable.add("org.tura.model.designer.repository.serialized.recipe.Configuration");
    instantiable.add("org.tura.model.designer.repository.serialized.recipe.ConfigExtension");
    instantiable.add("org.tura.model.designer.repository.serialized.recipe.Recipes");
    instantiable.add("org.tura.model.designer.repository.serialized.recipe.Recipe");
    instantiable.add("org.tura.model.designer.repository.serialized.recipe.Ingredient");
    instantiable.add("org.tura.model.designer.repository.serialized.recipe.Component");
    instantiable.add("org.tura.model.designer.repository.serialized.recipe.ModelMapper");
    instantiable.add("org.tura.model.designer.repository.serialized.recipe.DeploymentComponent");
    instantiable.add("org.tura.model.designer.repository.serialized.recipe.DeploymentStarStep");
    instantiable.add(
        "org.tura.model.designer.repository.serialized.objectmapper.AttributeConnector");
    instantiable.add("org.tura.model.designer.repository.serialized.form.ContextParametersObj");
    instantiable.add(
        "org.tura.model.designer.repository.serialized.objectmapper.OperationConnector");
    notInstantiable.add(
        "org.tura.model.designer.repository.serialized.objectmapper.OperationConnectorRef");
    instantiable.add(
        "org.tura.model.designer.repository.serialized.objectmapper.ObjectMapperGroup");
    instantiable.add("org.tura.model.designer.repository.serialized.objectmapper.ObjectMapper");
    instantiable.add("org.tura.model.designer.repository.serialized.type.TypePointerObj");
    instantiable.add("org.tura.model.designer.repository.serialized.form.DataControl");
    notInstantiable.add("org.tura.model.designer.repository.serialized.form.ControlPointer");
    instantiable.add("org.tura.model.designer.repository.serialized.type.Type");
    instantiable.add("org.tura.model.designer.repository.serialized.type.Attribute");
    instantiable.add("org.tura.model.designer.repository.serialized.type.Link");
    instantiable.add("org.tura.model.designer.repository.serialized.type.Assosiation");
    notInstantiable.add("org.tura.model.designer.repository.serialized.type.TypePointer");
    instantiable.add("org.tura.model.designer.repository.serialized.type.TypeElement");
    instantiable.add("org.tura.model.designer.repository.serialized.type.Relationship");
    instantiable.add("org.tura.model.designer.repository.serialized.type.TypeGroup");
    notInstantiable.add("org.tura.model.designer.repository.serialized.type.PackagePointer");
    instantiable.add("org.tura.model.designer.repository.serialized.domain.DomainTypesRepository");
    instantiable.add("org.tura.model.designer.repository.serialized.domain.DomainTypes");
    instantiable.add("org.tura.model.designer.repository.serialized.type.PrimitivesGroup");
    instantiable.add("org.tura.model.designer.repository.serialized.type.Primitive");
    instantiable.add("org.tura.model.designer.repository.serialized.objectmapper.OmRelation");
    instantiable.add("org.tura.model.designer.repository.serialized.form.ContextParameter");
    instantiable.add("org.tura.model.designer.repository.serialized.form.ContextValue");
    instantiable.add("org.tura.model.designer.repository.serialized.form.ExpressionPart");
    instantiable.add("org.tura.model.designer.repository.serialized.form.Selection");
    notInstantiable.add("org.tura.model.designer.repository.serialized.form.OptionSelection");
    instantiable.add("org.tura.model.designer.repository.serialized.form.Context");
    notInstantiable.add("org.tura.model.designer.repository.serialized.form.MultiLangLabel");
    notInstantiable.add("org.tura.model.designer.repository.serialized.form.StyleElement");
    notInstantiable.add("org.tura.model.designer.repository.serialized.form.EnabledUIItem");
    instantiable.add("org.tura.model.designer.repository.serialized.form.Uielement");
    instantiable.add("org.tura.model.designer.repository.serialized.form.AreaRef");
    instantiable.add("org.tura.model.designer.repository.serialized.form.OverlayCanvas");
    instantiable.add("org.tura.model.designer.repository.serialized.form.CanvasFrame");
    instantiable.add("org.tura.model.designer.repository.serialized.form.ViewInheritance");
    instantiable.add("org.tura.model.designer.repository.serialized.form.Views");
    instantiable.add("org.tura.model.designer.repository.serialized.form.TabPagesInheritance");
    instantiable.add("org.tura.model.designer.repository.serialized.form.TabCanvas");
    instantiable.add("org.tura.model.designer.repository.serialized.artifact.Classifier");
    instantiable.add("org.tura.model.designer.repository.serialized.artifact.GenerationHint");
    instantiable.add(
        "org.tura.model.designer.repository.serialized.artifact.GenerationHintWithNickName");
    instantiable.add("org.tura.model.designer.repository.serialized.form.OrderBy");
    instantiable.add("org.tura.model.designer.repository.serialized.form.Orders");
    instantiable.add("org.tura.model.designer.repository.serialized.artifact.TechLeaf");
    instantiable.add("org.tura.model.designer.repository.serialized.artifact.ConfigHash");
    instantiable.add(
        "org.tura.model.designer.repository.serialized.artifact.ConfigHashWithNickName");
    instantiable.add("org.tura.model.designer.repository.serialized.recipe.HashProperty");
    instantiable.add("org.tura.model.designer.repository.serialized.recipe.KeyValuePair");
    instantiable.add("org.tura.model.designer.repository.serialized.artifact.Option");
    instantiable.add("org.tura.model.designer.repository.serialized.recipe.MappingTecnologiy");
    instantiable.add("org.tura.model.designer.repository.serialized.artifact.Technology");
    instantiable.add("org.tura.model.designer.repository.serialized.form.FlexField");
    notInstantiable.add("org.tura.model.designer.repository.serialized.form.ItemIcon");
    instantiable.add("org.tura.model.designer.repository.serialized.form.MenuItem");
    instantiable.add("org.tura.model.designer.repository.serialized.form.MenuElement");
    instantiable.add("org.tura.model.designer.repository.serialized.form.MenuFolder");
    notInstantiable.add("org.tura.model.designer.repository.serialized.form.MenuHolder");
    notInstantiable.add("org.tura.model.designer.repository.serialized.form.MenuExtensionRef");
    instantiable.add("org.tura.model.designer.repository.serialized.form.ToSubmenu");
    instantiable.add("org.tura.model.designer.repository.serialized.form.MenuDefinition");
    instantiable.add("org.tura.model.designer.repository.serialized.form.SubMenu");
    instantiable.add("org.tura.model.designer.repository.serialized.form.Tree");
    instantiable.add("org.tura.model.designer.repository.serialized.form.Column");
    instantiable.add("org.tura.model.designer.repository.serialized.form.Table");
    instantiable.add("org.tura.model.designer.repository.serialized.form.SourcesPointer");
    notInstantiable.add("org.tura.model.designer.repository.serialized.form.ChildrenHolder");
    instantiable.add("org.tura.model.designer.repository.serialized.form.TabPage");
    notInstantiable.add("org.tura.model.designer.repository.serialized.form.ViewElement");
    instantiable.add("org.tura.model.designer.repository.serialized.form.Form");
    instantiable.add("org.tura.model.designer.repository.serialized.form.Controls");
    instantiable.add("org.tura.model.designer.repository.serialized.form.Root");
    instantiable.add("org.tura.model.designer.repository.serialized.form.PREFormTrigger");
    instantiable.add("org.tura.model.designer.repository.serialized.type.Operation");
    instantiable.add("org.tura.model.designer.repository.serialized.type.Parameter");
    instantiable.add("org.tura.model.designer.repository.serialized.type.ReturnValue");
    instantiable.add("org.tura.model.designer.repository.serialized.permission.GrantAccess");
    notInstantiable.add("org.tura.model.designer.repository.serialized.permission.SecurityEntity");
    instantiable.add("org.tura.model.designer.repository.serialized.form.FormVariable");
    instantiable.add("org.tura.model.designer.repository.serialized.form.FormParameter");
    instantiable.add("org.tura.model.designer.repository.serialized.form.Relation");
    instantiable.add("org.tura.model.designer.repository.serialized.form.Dependency");
    instantiable.add(
        "org.tura.model.designer.repository.serialized.application.ApplicationUIPackage");
    instantiable.add(
        "org.tura.model.designer.repository.serialized.application.ApplicationUILayer");
    instantiable.add("org.tura.model.designer.repository.serialized.application.Application");
    instantiable.add(
        "org.tura.model.designer.repository.serialized.application.ApplicationRecipes");
    instantiable.add("org.tura.model.designer.repository.serialized.application.ApplicationRecipe");
    instantiable.add(
        "org.tura.model.designer.repository.serialized.application.ApplicationMappers");
    instantiable.add("org.tura.model.designer.repository.serialized.application.ApplicationMapper");
    instantiable.add("org.tura.model.designer.repository.serialized.mapper.Mappers");
    notInstantiable.add("org.tura.model.designer.repository.serialized.mapper.Mapper");
    instantiable.add("org.tura.model.designer.repository.serialized.recipe.JavaComponent");
    instantiable.add("org.tura.model.designer.repository.serialized.mapper.Version");
    instantiable.add("org.tura.model.designer.repository.serialized.recipe.JavaScriptComponent");
    instantiable.add("org.tura.model.designer.repository.serialized.mapper.MappingLayer");
    notInstantiable.add("org.tura.model.designer.repository.serialized.recipe.UsingMappers");
    instantiable.add(
        "org.tura.model.designer.repository.serialized.application.ApplicationInfrastructureLayers");
    instantiable.add(
        "org.tura.model.designer.repository.serialized.application.ApplicationInfrastructureLayer");
    instantiable.add(
        "org.tura.model.designer.repository.serialized.infra.EnterpriseInfrastructure");
    instantiable.add("org.tura.model.designer.repository.serialized.infra.Datacenter");
    instantiable.add("org.tura.model.designer.repository.serialized.infra.Subsystem");
    instantiable.add("org.tura.model.designer.repository.serialized.infra.InfrastructureLayer");
    instantiable.add("org.tura.model.designer.repository.serialized.infra.InfrastructureComponent");
    instantiable.add(
        "org.tura.model.designer.repository.serialized.infra.InfrastructureConnection");
    instantiable.add(
        "org.tura.model.designer.repository.serialized.application.ApplicationStyleLibraries");
    instantiable.add("org.tura.model.designer.repository.serialized.application.ApplicationStyle");
    instantiable.add("org.tura.model.designer.repository.serialized.style.StyleLibrary");
    instantiable.add("org.tura.model.designer.repository.serialized.style.StyleSet");
    notInstantiable.add("org.tura.model.designer.repository.serialized.style.StylePointer");
    instantiable.add("org.tura.model.designer.repository.serialized.application.ApplicationRealms");
    instantiable.add("org.tura.model.designer.repository.serialized.application.ApplicationRealm");
    instantiable.add("org.tura.model.designer.repository.serialized.permission.Roles");
    instantiable.add("org.tura.model.designer.repository.serialized.permission.Role");
    instantiable.add("org.tura.model.designer.repository.serialized.permission.Group2Role");
    instantiable.add("org.tura.model.designer.repository.serialized.permission.Group");
    instantiable.add("org.tura.model.designer.repository.serialized.permission.Group2Group");
    instantiable.add(
        "org.tura.model.designer.repository.serialized.application.ApplicationMessageLibraries");
    instantiable.add(
        "org.tura.model.designer.repository.serialized.application.ApplicationMessageLibrary");
    instantiable.add("org.tura.model.designer.repository.serialized.message.MessageLibrary");
    instantiable.add("org.tura.model.designer.repository.serialized.message.Message");
    instantiable.add("org.tura.model.designer.repository.serialized.message.Translation");
    instantiable.add("org.tura.model.designer.repository.serialized.message.Language");
    instantiable.add(
        "org.tura.model.designer.repository.serialized.application.ApplicationLanguages");
    instantiable.add("org.tura.model.designer.repository.serialized.application.ApplicationGroup");
    instantiable.add("org.tura.model.designer.repository.serialized.domain.DomainApplication");
    instantiable.add("org.tura.model.designer.repository.serialized.domain.DomainApplications");
    instantiable.add("org.tura.model.designer.repository.serialized.form.ViewPort");
    instantiable.add("org.tura.model.designer.repository.serialized.form.ViewPortTrigger");
    notInstantiable.add("org.tura.model.designer.repository.serialized.form.Blockable");
    instantiable.add("org.tura.model.designer.repository.serialized.form.DataExporter");
    instantiable.add("org.tura.model.designer.repository.serialized.form.InputElement");
    instantiable.add("org.tura.model.designer.repository.serialized.form.LinkToMessage");
    instantiable.add("org.tura.model.designer.repository.serialized.form.ViewArea");
    instantiable.add("org.tura.model.designer.repository.serialized.form.LayerHolder");
    instantiable.add("org.tura.model.designer.repository.serialized.form.LinkToLabel");
    instantiable.add("org.tura.model.designer.repository.serialized.form.Label");
    instantiable.add("org.tura.model.designer.repository.serialized.form.MessageElement");
    instantiable.add("org.tura.model.designer.repository.serialized.form.RelationMapper");
    instantiable.add("org.tura.model.designer.repository.serialized.form.InternalRelation");
    instantiable.add("org.tura.model.designer.repository.serialized.type.AttributePointer");
    instantiable.add("org.tura.model.designer.repository.serialized.form.PREQueryTrigger");
    instantiable.add("org.tura.model.designer.repository.serialized.form.POSTQueryTrigger");
    instantiable.add("org.tura.model.designer.repository.serialized.form.PREInsertTrigger");
    instantiable.add("org.tura.model.designer.repository.serialized.form.PREDeleteTrigger");
    instantiable.add("org.tura.model.designer.repository.serialized.form.POSTCreateTrigger");
    instantiable.add("org.tura.model.designer.repository.serialized.form.PREUpdateTrigger");
    instantiable.add("org.tura.model.designer.repository.serialized.form.CreateTrigger");
    instantiable.add("org.tura.model.designer.repository.serialized.form.SearchTrigger");
    instantiable.add("org.tura.model.designer.repository.serialized.form.ArtificialField");
    instantiable.add("org.tura.model.designer.repository.serialized.objectmapper.CalculatedField");
    instantiable.add("org.tura.model.designer.repository.serialized.objectmapper.Aggregation");
    instantiable.add("org.tura.model.designer.repository.serialized.objectmapper.ProcessingStage");
    instantiable.add("org.tura.model.designer.repository.serialized.objectmapper.Variable");
    instantiable.add("org.tura.model.designer.repository.serialized.domain.DomainMapper");
    instantiable.add("org.tura.model.designer.repository.serialized.domain.DomainMappers");
    instantiable.add("org.tura.model.designer.repository.serialized.recipe.Query");
    instantiable.add("org.tura.model.designer.repository.serialized.recipe.QueryVariable");
    instantiable.add("org.tura.model.designer.repository.serialized.artifact.QueryParameter");
    instantiable.add("org.tura.model.designer.repository.serialized.artifact.ModelQuery");
    instantiable.add("org.tura.model.designer.repository.serialized.recipe.Recipe2Infrastructure");
    instantiable.add("org.tura.model.designer.repository.serialized.recipe.Infrastructure");
    instantiable.add(
        "org.tura.model.designer.repository.serialized.recipe.Infrastructure2Configuration");
    instantiable.add("org.tura.model.designer.repository.serialized.type.References");
    instantiable.add("org.tura.model.designer.repository.serialized.type.Generalization");
    instantiable.add("org.tura.model.designer.repository.serialized.type.TypeReference");
    instantiable.add("org.tura.model.designer.repository.serialized.type.Enumerator");
    instantiable.add("org.tura.model.designer.repository.serialized.type.EnumAttribute");
    instantiable.add("org.tura.model.designer.repository.serialized.infra.Server");
    instantiable.add("org.tura.model.designer.repository.serialized.infra.ServerClaster");
    instantiable.add("org.tura.model.designer.repository.serialized.infra.Router");
    instantiable.add("org.tura.model.designer.repository.serialized.infra.Hub");
    instantiable.add("org.tura.model.designer.repository.serialized.infra.Storage");
    instantiable.add("org.tura.model.designer.repository.serialized.form.PopupCanvas");
    instantiable.add("org.tura.model.designer.repository.serialized.form.Canvas");
    instantiable.add("org.tura.model.designer.repository.serialized.form.Window");
    instantiable.add("org.tura.model.designer.repository.serialized.form.InputText");
    instantiable.add("org.tura.model.designer.repository.serialized.form.Password");
    instantiable.add("org.tura.model.designer.repository.serialized.form.OutputText");
    instantiable.add("org.tura.model.designer.repository.serialized.form.CheckBox");
    instantiable.add("org.tura.model.designer.repository.serialized.form.DropDownSelection");
    instantiable.add("org.tura.model.designer.repository.serialized.form.SelectManyMenu");
    instantiable.add("org.tura.model.designer.repository.serialized.form.RadioSelection");
    instantiable.add("org.tura.model.designer.repository.serialized.form.Image");
    instantiable.add("org.tura.model.designer.repository.serialized.form.Date");
    instantiable.add("org.tura.model.designer.repository.serialized.form.Button");
    instantiable.add("org.tura.model.designer.repository.serialized.form.Menu");
    instantiable.add("org.tura.model.designer.repository.serialized.form.BlockUI");
    instantiable.add("org.tura.model.designer.repository.serialized.form.FileUpload");
    instantiable.add("org.tura.model.designer.repository.serialized.form.FileDownload");
    instantiable.add("org.tura.model.designer.repository.serialized.form.DataScroller");
    instantiable.add("org.tura.model.designer.repository.serialized.form.TimeLine");
    instantiable.add("org.tura.model.designer.repository.serialized.form.FullCalendar");
    instantiable.add("org.tura.model.designer.repository.serialized.form.Poll");
    instantiable.add("org.tura.model.designer.repository.serialized.form.DataTemplate");
    instantiable.add("org.tura.model.designer.repository.serialized.form.WindowRef");
    instantiable.add("org.tura.model.designer.repository.serialized.form.MenuExtensionPoint");
    instantiable.add("org.tura.model.designer.repository.serialized.form.MenuSeparator");
    instantiable.add("org.tura.model.designer.repository.serialized.form.InsertTrigger");
    topObjects.add("org.tura.model.designer.repository.serialized.form.InsertTrigger");
    instantiable.add("org.tura.model.designer.repository.serialized.form.UpdateTrigger");
    topObjects.add("org.tura.model.designer.repository.serialized.form.UpdateTrigger");
    instantiable.add("org.tura.model.designer.repository.serialized.form.DeleteTrigger");
    topObjects.add("org.tura.model.designer.repository.serialized.form.DeleteTrigger");
    instantiable.add("org.tura.model.designer.repository.serialized.mapper.JavaMapper");
    instantiable.add("org.tura.model.designer.repository.serialized.mapper.JavaPackageMapper");
    instantiable.add("org.tura.model.designer.repository.serialized.mapper.JavaScriptMapper");
    instantiable.add("org.tura.model.designer.repository.serialized.mapper.CSSMapper");
    instantiable.add("org.tura.model.designer.repository.serialized.mapper.RoleMapper");
    instantiable.add("org.tura.model.designer.repository.serialized.mapper.XMLPackageMapper");
    instantiable.add("org.tura.model.designer.repository.serialized.mapper.XMLTypeMapper");
    instantiable.add("org.tura.model.designer.repository.serialized.mapper.MetamodelPackageMapper");
    instantiable.add("org.tura.model.designer.repository.serialized.dictionary.ListOfLanguages");
    topObjects.add("org.tura.model.designer.repository.serialized.dictionary.ListOfLanguages");
    instantiable.add(
        "org.tura.model.designer.repository.serialized.dictionary.ConfigHashAggregator");
    topObjects.add("org.tura.model.designer.repository.serialized.dictionary.ConfigHashAggregator");
    instantiable.add(
        "org.tura.model.designer.repository.serialized.dictionary.ConfigVariableAggregator");
    topObjects.add(
        "org.tura.model.designer.repository.serialized.dictionary.ConfigVariableAggregator");
    instantiable.add(
        "org.tura.model.designer.repository.serialized.dictionary.GenerationHintAggregator");
    topObjects.add(
        "org.tura.model.designer.repository.serialized.dictionary.GenerationHintAggregator");
    instantiable.add("org.tura.model.designer.repository.serialized.dictionary.RootST");
    topObjects.add("org.tura.model.designer.repository.serialized.dictionary.RootST");
    instantiable.add("org.tura.model.designer.repository.serialized.dictionary.TypesAggregator");
    topObjects.add("org.tura.model.designer.repository.serialized.dictionary.TypesAggregator");
    instantiable.add("org.tura.model.designer.repository.serialized.dictionary.OptionsSet");
    topObjects.add("org.tura.model.designer.repository.serialized.dictionary.OptionsSet");
  }
}
