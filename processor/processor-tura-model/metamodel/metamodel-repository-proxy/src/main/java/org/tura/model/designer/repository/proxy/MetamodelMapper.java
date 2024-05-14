/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2024 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
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

import java.util.HashMap;
import java.util.Map;

public class MetamodelMapper {

  private Map<String, String> data = new HashMap<>();

  public void init() {
    data.put("domain::Domain", "org.tura.model.designer.repository.serialized.domain.Domain");
    data.put("Domain", "org.tura.model.designer.repository.serialized.domain.Domain");
    data.put(
        "domain::DomainArtifacts",
        "org.tura.model.designer.repository.serialized.domain.DomainArtifacts");
    data.put(
        "DomainArtifacts", "org.tura.model.designer.repository.serialized.domain.DomainArtifacts");
    data.put(
        "domain::DomainArtifact",
        "org.tura.model.designer.repository.serialized.domain.DomainArtifact");
    data.put(
        "DomainArtifact", "org.tura.model.designer.repository.serialized.domain.DomainArtifact");
    data.put(
        "artifact::ArtifactGroup",
        "org.tura.model.designer.repository.serialized.artifact.ArtifactGroup");
    data.put(
        "ArtifactGroup", "org.tura.model.designer.repository.serialized.artifact.ArtifactGroup");
    data.put(
        "artifact::Artifact", "org.tura.model.designer.repository.serialized.artifact.Artifact");
    data.put("Artifact", "org.tura.model.designer.repository.serialized.artifact.Artifact");
    data.put(
        "artifact::ConfigVariableWithNickName",
        "org.tura.model.designer.repository.serialized.artifact.ConfigVariableWithNickName");
    data.put(
        "ConfigVariableWithNickName",
        "org.tura.model.designer.repository.serialized.artifact.ConfigVariableWithNickName");
    data.put(
        "artifact::ConfigVariable",
        "org.tura.model.designer.repository.serialized.artifact.ConfigVariable");
    data.put(
        "ConfigVariable", "org.tura.model.designer.repository.serialized.artifact.ConfigVariable");
    data.put("recipe::Property", "org.tura.model.designer.repository.serialized.recipe.Property");
    data.put("Property", "org.tura.model.designer.repository.serialized.recipe.Property");
    data.put(
        "recipe::Configuration",
        "org.tura.model.designer.repository.serialized.recipe.Configuration");
    data.put("Configuration", "org.tura.model.designer.repository.serialized.recipe.Configuration");
    data.put(
        "recipe::ConfigExtension",
        "org.tura.model.designer.repository.serialized.recipe.ConfigExtension");
    data.put(
        "ConfigExtension", "org.tura.model.designer.repository.serialized.recipe.ConfigExtension");
    data.put("recipe::Recipes", "org.tura.model.designer.repository.serialized.recipe.Recipes");
    data.put("Recipes", "org.tura.model.designer.repository.serialized.recipe.Recipes");
    data.put("recipe::Recipe", "org.tura.model.designer.repository.serialized.recipe.Recipe");
    data.put("Recipe", "org.tura.model.designer.repository.serialized.recipe.Recipe");
    data.put(
        "recipe::Ingredient", "org.tura.model.designer.repository.serialized.recipe.Ingredient");
    data.put("Ingredient", "org.tura.model.designer.repository.serialized.recipe.Ingredient");
    data.put("recipe::Component", "org.tura.model.designer.repository.serialized.recipe.Component");
    data.put("Component", "org.tura.model.designer.repository.serialized.recipe.Component");
    data.put(
        "recipe::ModelMapper", "org.tura.model.designer.repository.serialized.recipe.ModelMapper");
    data.put("ModelMapper", "org.tura.model.designer.repository.serialized.recipe.ModelMapper");
    data.put(
        "recipe::DeploymentComponent",
        "org.tura.model.designer.repository.serialized.recipe.DeploymentComponent");
    data.put(
        "DeploymentComponent",
        "org.tura.model.designer.repository.serialized.recipe.DeploymentComponent");
    data.put(
        "recipe::DeploymentStarStep",
        "org.tura.model.designer.repository.serialized.recipe.DeploymentStarStep");
    data.put(
        "DeploymentStarStep",
        "org.tura.model.designer.repository.serialized.recipe.DeploymentStarStep");
    data.put(
        "metabase::MetaObject",
        "org.tura.model.designer.repository.serialized.metabase.MetaObject");
    data.put("MetaObject", "org.tura.model.designer.repository.serialized.metabase.MetaObject");
    data.put(
        "objectmapper::AttributeConnector",
        "org.tura.model.designer.repository.serialized.objectmapper.AttributeConnector");
    data.put(
        "AttributeConnector",
        "org.tura.model.designer.repository.serialized.objectmapper.AttributeConnector");
    data.put(
        "form::ContextParametersObj",
        "org.tura.model.designer.repository.serialized.form.ContextParametersObj");
    data.put(
        "ContextParametersObj",
        "org.tura.model.designer.repository.serialized.form.ContextParametersObj");
    data.put(
        "objectmapper::OperationConnector",
        "org.tura.model.designer.repository.serialized.objectmapper.OperationConnector");
    data.put(
        "OperationConnector",
        "org.tura.model.designer.repository.serialized.objectmapper.OperationConnector");
    data.put(
        "objectmapper::OperationConnectorRef",
        "org.tura.model.designer.repository.serialized.objectmapper.OperationConnectorRef");
    data.put(
        "OperationConnectorRef",
        "org.tura.model.designer.repository.serialized.objectmapper.OperationConnectorRef");
    data.put(
        "objectmapper::ObjectMapperGroup",
        "org.tura.model.designer.repository.serialized.objectmapper.ObjectMapperGroup");
    data.put(
        "ObjectMapperGroup",
        "org.tura.model.designer.repository.serialized.objectmapper.ObjectMapperGroup");
    data.put(
        "objectmapper::ObjectMapper",
        "org.tura.model.designer.repository.serialized.objectmapper.ObjectMapper");
    data.put(
        "ObjectMapper", "org.tura.model.designer.repository.serialized.objectmapper.ObjectMapper");
    data.put(
        "type::TypePointerObj",
        "org.tura.model.designer.repository.serialized.type.TypePointerObj");
    data.put("TypePointerObj", "org.tura.model.designer.repository.serialized.type.TypePointerObj");
    data.put("form::DataControl", "org.tura.model.designer.repository.serialized.form.DataControl");
    data.put("DataControl", "org.tura.model.designer.repository.serialized.form.DataControl");
    data.put(
        "form::ControlPointer",
        "org.tura.model.designer.repository.serialized.form.ControlPointer");
    data.put("ControlPointer", "org.tura.model.designer.repository.serialized.form.ControlPointer");
    data.put("type::Type", "org.tura.model.designer.repository.serialized.type.Type");
    data.put("Type", "org.tura.model.designer.repository.serialized.type.Type");
    data.put("type::Attribute", "org.tura.model.designer.repository.serialized.type.Attribute");
    data.put("Attribute", "org.tura.model.designer.repository.serialized.type.Attribute");
    data.put("type::Link", "org.tura.model.designer.repository.serialized.type.Link");
    data.put("Link", "org.tura.model.designer.repository.serialized.type.Link");
    data.put("type::Assosiation", "org.tura.model.designer.repository.serialized.type.Assosiation");
    data.put("Assosiation", "org.tura.model.designer.repository.serialized.type.Assosiation");
    data.put("type::TypePointer", "org.tura.model.designer.repository.serialized.type.TypePointer");
    data.put("TypePointer", "org.tura.model.designer.repository.serialized.type.TypePointer");
    data.put("type::TypeElement", "org.tura.model.designer.repository.serialized.type.TypeElement");
    data.put("TypeElement", "org.tura.model.designer.repository.serialized.type.TypeElement");
    data.put(
        "type::Relationship", "org.tura.model.designer.repository.serialized.type.Relationship");
    data.put("Relationship", "org.tura.model.designer.repository.serialized.type.Relationship");
    data.put("type::TypeGroup", "org.tura.model.designer.repository.serialized.type.TypeGroup");
    data.put("TypeGroup", "org.tura.model.designer.repository.serialized.type.TypeGroup");
    data.put(
        "type::PackagePointer",
        "org.tura.model.designer.repository.serialized.type.PackagePointer");
    data.put("PackagePointer", "org.tura.model.designer.repository.serialized.type.PackagePointer");
    data.put(
        "domain::DomainTypesRepository",
        "org.tura.model.designer.repository.serialized.domain.DomainTypesRepository");
    data.put(
        "DomainTypesRepository",
        "org.tura.model.designer.repository.serialized.domain.DomainTypesRepository");
    data.put(
        "domain::DomainTypes", "org.tura.model.designer.repository.serialized.domain.DomainTypes");
    data.put("DomainTypes", "org.tura.model.designer.repository.serialized.domain.DomainTypes");
    data.put(
        "type::PrimitivesGroup",
        "org.tura.model.designer.repository.serialized.type.PrimitivesGroup");
    data.put(
        "PrimitivesGroup", "org.tura.model.designer.repository.serialized.type.PrimitivesGroup");
    data.put("type::Primitive", "org.tura.model.designer.repository.serialized.type.Primitive");
    data.put("Primitive", "org.tura.model.designer.repository.serialized.type.Primitive");
    data.put(
        "objectmapper::OmRelation",
        "org.tura.model.designer.repository.serialized.objectmapper.OmRelation");
    data.put("OmRelation", "org.tura.model.designer.repository.serialized.objectmapper.OmRelation");
    data.put(
        "form::ContextParameter",
        "org.tura.model.designer.repository.serialized.form.ContextParameter");
    data.put(
        "ContextParameter", "org.tura.model.designer.repository.serialized.form.ContextParameter");
    data.put(
        "form::ContextValue", "org.tura.model.designer.repository.serialized.form.ContextValue");
    data.put("ContextValue", "org.tura.model.designer.repository.serialized.form.ContextValue");
    data.put(
        "form::ExpressionPart",
        "org.tura.model.designer.repository.serialized.form.ExpressionPart");
    data.put("ExpressionPart", "org.tura.model.designer.repository.serialized.form.ExpressionPart");
    data.put("form::Selection", "org.tura.model.designer.repository.serialized.form.Selection");
    data.put("Selection", "org.tura.model.designer.repository.serialized.form.Selection");
    data.put(
        "form::OptionSelection",
        "org.tura.model.designer.repository.serialized.form.OptionSelection");
    data.put(
        "OptionSelection", "org.tura.model.designer.repository.serialized.form.OptionSelection");
    data.put("form::Context", "org.tura.model.designer.repository.serialized.form.Context");
    data.put("Context", "org.tura.model.designer.repository.serialized.form.Context");
    data.put(
        "form::MultiLangLabel",
        "org.tura.model.designer.repository.serialized.form.MultiLangLabel");
    data.put("MultiLangLabel", "org.tura.model.designer.repository.serialized.form.MultiLangLabel");
    data.put(
        "form::StyleElement", "org.tura.model.designer.repository.serialized.form.StyleElement");
    data.put("StyleElement", "org.tura.model.designer.repository.serialized.form.StyleElement");
    data.put(
        "form::EnabledUIItem", "org.tura.model.designer.repository.serialized.form.EnabledUIItem");
    data.put("EnabledUIItem", "org.tura.model.designer.repository.serialized.form.EnabledUIItem");
    data.put("form::Uielement", "org.tura.model.designer.repository.serialized.form.Uielement");
    data.put("Uielement", "org.tura.model.designer.repository.serialized.form.Uielement");
    data.put("form::AreaRef", "org.tura.model.designer.repository.serialized.form.AreaRef");
    data.put("AreaRef", "org.tura.model.designer.repository.serialized.form.AreaRef");
    data.put(
        "form::OverlayCanvas", "org.tura.model.designer.repository.serialized.form.OverlayCanvas");
    data.put("OverlayCanvas", "org.tura.model.designer.repository.serialized.form.OverlayCanvas");
    data.put("form::CanvasFrame", "org.tura.model.designer.repository.serialized.form.CanvasFrame");
    data.put("CanvasFrame", "org.tura.model.designer.repository.serialized.form.CanvasFrame");
    data.put(
        "form::ViewInheritance",
        "org.tura.model.designer.repository.serialized.form.ViewInheritance");
    data.put(
        "ViewInheritance", "org.tura.model.designer.repository.serialized.form.ViewInheritance");
    data.put("form::Views", "org.tura.model.designer.repository.serialized.form.Views");
    data.put("Views", "org.tura.model.designer.repository.serialized.form.Views");
    data.put(
        "form::TabPagesInheritance",
        "org.tura.model.designer.repository.serialized.form.TabPagesInheritance");
    data.put(
        "TabPagesInheritance",
        "org.tura.model.designer.repository.serialized.form.TabPagesInheritance");
    data.put("form::TabCanvas", "org.tura.model.designer.repository.serialized.form.TabCanvas");
    data.put("TabCanvas", "org.tura.model.designer.repository.serialized.form.TabCanvas");
    data.put(
        "form::DefaultCavas", "org.tura.model.designer.repository.serialized.form.DefaultCavas");
    data.put("DefaultCavas", "org.tura.model.designer.repository.serialized.form.DefaultCavas");
    data.put(
        "artifact::Categorized",
        "org.tura.model.designer.repository.serialized.artifact.Categorized");
    data.put("Categorized", "org.tura.model.designer.repository.serialized.artifact.Categorized");
    data.put(
        "artifact::Classifier",
        "org.tura.model.designer.repository.serialized.artifact.Classifier");
    data.put("Classifier", "org.tura.model.designer.repository.serialized.artifact.Classifier");
    data.put(
        "artifact::GenerationHint",
        "org.tura.model.designer.repository.serialized.artifact.GenerationHint");
    data.put(
        "GenerationHint", "org.tura.model.designer.repository.serialized.artifact.GenerationHint");
    data.put(
        "artifact::GenerationHintWithNickName",
        "org.tura.model.designer.repository.serialized.artifact.GenerationHintWithNickName");
    data.put(
        "GenerationHintWithNickName",
        "org.tura.model.designer.repository.serialized.artifact.GenerationHintWithNickName");
    data.put("form::OrderBy", "org.tura.model.designer.repository.serialized.form.OrderBy");
    data.put("OrderBy", "org.tura.model.designer.repository.serialized.form.OrderBy");
    data.put("form::Orders", "org.tura.model.designer.repository.serialized.form.Orders");
    data.put("Orders", "org.tura.model.designer.repository.serialized.form.Orders");
    data.put(
        "artifact::TechLeaf", "org.tura.model.designer.repository.serialized.artifact.TechLeaf");
    data.put("TechLeaf", "org.tura.model.designer.repository.serialized.artifact.TechLeaf");
    data.put(
        "artifact::ConfigHash",
        "org.tura.model.designer.repository.serialized.artifact.ConfigHash");
    data.put("ConfigHash", "org.tura.model.designer.repository.serialized.artifact.ConfigHash");
    data.put(
        "artifact::ConfigHashWithNickName",
        "org.tura.model.designer.repository.serialized.artifact.ConfigHashWithNickName");
    data.put(
        "ConfigHashWithNickName",
        "org.tura.model.designer.repository.serialized.artifact.ConfigHashWithNickName");
    data.put(
        "recipe::HashProperty",
        "org.tura.model.designer.repository.serialized.recipe.HashProperty");
    data.put("HashProperty", "org.tura.model.designer.repository.serialized.recipe.HashProperty");
    data.put(
        "recipe::KeyValuePair",
        "org.tura.model.designer.repository.serialized.recipe.KeyValuePair");
    data.put("KeyValuePair", "org.tura.model.designer.repository.serialized.recipe.KeyValuePair");
    data.put("artifact::Option", "org.tura.model.designer.repository.serialized.artifact.Option");
    data.put("Option", "org.tura.model.designer.repository.serialized.artifact.Option");
    data.put(
        "recipe::MappingTecnologiy",
        "org.tura.model.designer.repository.serialized.recipe.MappingTecnologiy");
    data.put(
        "MappingTecnologiy",
        "org.tura.model.designer.repository.serialized.recipe.MappingTecnologiy");
    data.put(
        "artifact::Technology",
        "org.tura.model.designer.repository.serialized.artifact.Technology");
    data.put("Technology", "org.tura.model.designer.repository.serialized.artifact.Technology");
    data.put("form::FlexFields", "org.tura.model.designer.repository.serialized.form.FlexFields");
    data.put("FlexFields", "org.tura.model.designer.repository.serialized.form.FlexFields");
    data.put("form::FlexField", "org.tura.model.designer.repository.serialized.form.FlexField");
    data.put("FlexField", "org.tura.model.designer.repository.serialized.form.FlexField");
    data.put("form::ItemIcon", "org.tura.model.designer.repository.serialized.form.ItemIcon");
    data.put("ItemIcon", "org.tura.model.designer.repository.serialized.form.ItemIcon");
    data.put("form::MenuItem", "org.tura.model.designer.repository.serialized.form.MenuItem");
    data.put("MenuItem", "org.tura.model.designer.repository.serialized.form.MenuItem");
    data.put("form::MenuElement", "org.tura.model.designer.repository.serialized.form.MenuElement");
    data.put("MenuElement", "org.tura.model.designer.repository.serialized.form.MenuElement");
    data.put("form::MenuFolder", "org.tura.model.designer.repository.serialized.form.MenuFolder");
    data.put("MenuFolder", "org.tura.model.designer.repository.serialized.form.MenuFolder");
    data.put("form::MenuHolder", "org.tura.model.designer.repository.serialized.form.MenuHolder");
    data.put("MenuHolder", "org.tura.model.designer.repository.serialized.form.MenuHolder");
    data.put(
        "form::MenuExtensionRef",
        "org.tura.model.designer.repository.serialized.form.MenuExtensionRef");
    data.put(
        "MenuExtensionRef", "org.tura.model.designer.repository.serialized.form.MenuExtensionRef");
    data.put("form::ToSubmenu", "org.tura.model.designer.repository.serialized.form.ToSubmenu");
    data.put("ToSubmenu", "org.tura.model.designer.repository.serialized.form.ToSubmenu");
    data.put(
        "form::MenuDefinition",
        "org.tura.model.designer.repository.serialized.form.MenuDefinition");
    data.put("MenuDefinition", "org.tura.model.designer.repository.serialized.form.MenuDefinition");
    data.put("form::SubMenu", "org.tura.model.designer.repository.serialized.form.SubMenu");
    data.put("SubMenu", "org.tura.model.designer.repository.serialized.form.SubMenu");
    data.put("common::Orderable", "org.tura.model.designer.repository.serialized.common.Orderable");
    data.put("Orderable", "org.tura.model.designer.repository.serialized.common.Orderable");
    data.put(
        "common::HTMLLayerHolder",
        "org.tura.model.designer.repository.serialized.common.HTMLLayerHolder");
    data.put(
        "HTMLLayerHolder", "org.tura.model.designer.repository.serialized.common.HTMLLayerHolder");
    data.put("form::Tree", "org.tura.model.designer.repository.serialized.form.Tree");
    data.put("Tree", "org.tura.model.designer.repository.serialized.form.Tree");
    data.put("form::Column", "org.tura.model.designer.repository.serialized.form.Column");
    data.put("Column", "org.tura.model.designer.repository.serialized.form.Column");
    data.put("form::Table", "org.tura.model.designer.repository.serialized.form.Table");
    data.put("Table", "org.tura.model.designer.repository.serialized.form.Table");
    data.put(
        "form::SourcesPointer",
        "org.tura.model.designer.repository.serialized.form.SourcesPointer");
    data.put("SourcesPointer", "org.tura.model.designer.repository.serialized.form.SourcesPointer");
    data.put(
        "form::ChildrenHolder",
        "org.tura.model.designer.repository.serialized.form.ChildrenHolder");
    data.put("ChildrenHolder", "org.tura.model.designer.repository.serialized.form.ChildrenHolder");
    data.put("form::NickNamed", "org.tura.model.designer.repository.serialized.form.NickNamed");
    data.put("NickNamed", "org.tura.model.designer.repository.serialized.form.NickNamed");
    data.put(
        "form::ContextParameters",
        "org.tura.model.designer.repository.serialized.form.ContextParameters");
    data.put(
        "ContextParameters",
        "org.tura.model.designer.repository.serialized.form.ContextParameters");
    data.put("form::TabPage", "org.tura.model.designer.repository.serialized.form.TabPage");
    data.put("TabPage", "org.tura.model.designer.repository.serialized.form.TabPage");
    data.put(
        "form::ViewPortHolder",
        "org.tura.model.designer.repository.serialized.form.ViewPortHolder");
    data.put("ViewPortHolder", "org.tura.model.designer.repository.serialized.form.ViewPortHolder");
    data.put("form::ViewElement", "org.tura.model.designer.repository.serialized.form.ViewElement");
    data.put("ViewElement", "org.tura.model.designer.repository.serialized.form.ViewElement");
    data.put("form::Form", "org.tura.model.designer.repository.serialized.form.Form");
    data.put("Form", "org.tura.model.designer.repository.serialized.form.Form");
    data.put("form::Controls", "org.tura.model.designer.repository.serialized.form.Controls");
    data.put("Controls", "org.tura.model.designer.repository.serialized.form.Controls");
    data.put("form::Root", "org.tura.model.designer.repository.serialized.form.Root");
    data.put("Root", "org.tura.model.designer.repository.serialized.form.Root");
    data.put(
        "form::PREFormTrigger",
        "org.tura.model.designer.repository.serialized.form.PREFormTrigger");
    data.put("PREFormTrigger", "org.tura.model.designer.repository.serialized.form.PREFormTrigger");
    data.put("form::Trigger", "org.tura.model.designer.repository.serialized.form.Trigger");
    data.put("Trigger", "org.tura.model.designer.repository.serialized.form.Trigger");
    data.put(
        "type::MethodPointer", "org.tura.model.designer.repository.serialized.type.MethodPointer");
    data.put("MethodPointer", "org.tura.model.designer.repository.serialized.type.MethodPointer");
    data.put("type::Operation", "org.tura.model.designer.repository.serialized.type.Operation");
    data.put("Operation", "org.tura.model.designer.repository.serialized.type.Operation");
    data.put("type::Parameter", "org.tura.model.designer.repository.serialized.type.Parameter");
    data.put("Parameter", "org.tura.model.designer.repository.serialized.type.Parameter");
    data.put("type::ReturnValue", "org.tura.model.designer.repository.serialized.type.ReturnValue");
    data.put("ReturnValue", "org.tura.model.designer.repository.serialized.type.ReturnValue");
    data.put(
        "permission::Secured", "org.tura.model.designer.repository.serialized.permission.Secured");
    data.put("Secured", "org.tura.model.designer.repository.serialized.permission.Secured");
    data.put(
        "permission::GrantAccess",
        "org.tura.model.designer.repository.serialized.permission.GrantAccess");
    data.put("GrantAccess", "org.tura.model.designer.repository.serialized.permission.GrantAccess");
    data.put(
        "permission::SecurityEntityPointer",
        "org.tura.model.designer.repository.serialized.permission.SecurityEntityPointer");
    data.put(
        "SecurityEntityPointer",
        "org.tura.model.designer.repository.serialized.permission.SecurityEntityPointer");
    data.put(
        "permission::SecurityEntity",
        "org.tura.model.designer.repository.serialized.permission.SecurityEntity");
    data.put(
        "SecurityEntity",
        "org.tura.model.designer.repository.serialized.permission.SecurityEntity");
    data.put(
        "form::FormVariable", "org.tura.model.designer.repository.serialized.form.FormVariable");
    data.put("FormVariable", "org.tura.model.designer.repository.serialized.form.FormVariable");
    data.put(
        "form::FormParameter", "org.tura.model.designer.repository.serialized.form.FormParameter");
    data.put("FormParameter", "org.tura.model.designer.repository.serialized.form.FormParameter");
    data.put("form::Relation", "org.tura.model.designer.repository.serialized.form.Relation");
    data.put("Relation", "org.tura.model.designer.repository.serialized.form.Relation");
    data.put("form::Dependency", "org.tura.model.designer.repository.serialized.form.Dependency");
    data.put("Dependency", "org.tura.model.designer.repository.serialized.form.Dependency");
    data.put(
        "application::ApplicationUIPackage",
        "org.tura.model.designer.repository.serialized.application.ApplicationUIPackage");
    data.put(
        "ApplicationUIPackage",
        "org.tura.model.designer.repository.serialized.application.ApplicationUIPackage");
    data.put(
        "application::ApplicationUILayer",
        "org.tura.model.designer.repository.serialized.application.ApplicationUILayer");
    data.put(
        "ApplicationUILayer",
        "org.tura.model.designer.repository.serialized.application.ApplicationUILayer");
    data.put(
        "application::Application",
        "org.tura.model.designer.repository.serialized.application.Application");
    data.put(
        "Application", "org.tura.model.designer.repository.serialized.application.Application");
    data.put(
        "application::ApplicationRecipes",
        "org.tura.model.designer.repository.serialized.application.ApplicationRecipes");
    data.put(
        "ApplicationRecipes",
        "org.tura.model.designer.repository.serialized.application.ApplicationRecipes");
    data.put(
        "application::ApplicationRecipe",
        "org.tura.model.designer.repository.serialized.application.ApplicationRecipe");
    data.put(
        "ApplicationRecipe",
        "org.tura.model.designer.repository.serialized.application.ApplicationRecipe");
    data.put(
        "application::ApplicationMappers",
        "org.tura.model.designer.repository.serialized.application.ApplicationMappers");
    data.put(
        "ApplicationMappers",
        "org.tura.model.designer.repository.serialized.application.ApplicationMappers");
    data.put(
        "application::ApplicationMapper",
        "org.tura.model.designer.repository.serialized.application.ApplicationMapper");
    data.put(
        "ApplicationMapper",
        "org.tura.model.designer.repository.serialized.application.ApplicationMapper");
    data.put("mapper::Mappers", "org.tura.model.designer.repository.serialized.mapper.Mappers");
    data.put("Mappers", "org.tura.model.designer.repository.serialized.mapper.Mappers");
    data.put("mapper::Mapper", "org.tura.model.designer.repository.serialized.mapper.Mapper");
    data.put("Mapper", "org.tura.model.designer.repository.serialized.mapper.Mapper");
    data.put(
        "recipe::JavaComponent",
        "org.tura.model.designer.repository.serialized.recipe.JavaComponent");
    data.put("JavaComponent", "org.tura.model.designer.repository.serialized.recipe.JavaComponent");
    data.put(
        "mapper::VersionRef", "org.tura.model.designer.repository.serialized.mapper.VersionRef");
    data.put("VersionRef", "org.tura.model.designer.repository.serialized.mapper.VersionRef");
    data.put("mapper::Version", "org.tura.model.designer.repository.serialized.mapper.Version");
    data.put("Version", "org.tura.model.designer.repository.serialized.mapper.Version");
    data.put(
        "recipe::JavaScriptComponent",
        "org.tura.model.designer.repository.serialized.recipe.JavaScriptComponent");
    data.put(
        "JavaScriptComponent",
        "org.tura.model.designer.repository.serialized.recipe.JavaScriptComponent");
    data.put(
        "mapper::MappingLayer",
        "org.tura.model.designer.repository.serialized.mapper.MappingLayer");
    data.put("MappingLayer", "org.tura.model.designer.repository.serialized.mapper.MappingLayer");
    data.put(
        "recipe::UsingMappers",
        "org.tura.model.designer.repository.serialized.recipe.UsingMappers");
    data.put("UsingMappers", "org.tura.model.designer.repository.serialized.recipe.UsingMappers");
    data.put(
        "application::ApplicationInfrastructureLayers",
        "org.tura.model.designer.repository.serialized.application.ApplicationInfrastructureLayers");
    data.put(
        "ApplicationInfrastructureLayers",
        "org.tura.model.designer.repository.serialized.application.ApplicationInfrastructureLayers");
    data.put(
        "application::ApplicationInfrastructureLayer",
        "org.tura.model.designer.repository.serialized.application.ApplicationInfrastructureLayer");
    data.put(
        "ApplicationInfrastructureLayer",
        "org.tura.model.designer.repository.serialized.application.ApplicationInfrastructureLayer");
    data.put(
        "infrastructure::EnterpriseInfrastructure",
        "org.tura.model.designer.repository.serialized.infra.EnterpriseInfrastructure");
    data.put(
        "EnterpriseInfrastructure",
        "org.tura.model.designer.repository.serialized.infra.EnterpriseInfrastructure");
    data.put(
        "infrastructure::Datacenter",
        "org.tura.model.designer.repository.serialized.infra.Datacenter");
    data.put("Datacenter", "org.tura.model.designer.repository.serialized.infra.Datacenter");
    data.put(
        "infrastructure::Subsystem",
        "org.tura.model.designer.repository.serialized.infra.Subsystem");
    data.put("Subsystem", "org.tura.model.designer.repository.serialized.infra.Subsystem");
    data.put(
        "infrastructure::InfrastructureLayer",
        "org.tura.model.designer.repository.serialized.infra.InfrastructureLayer");
    data.put(
        "InfrastructureLayer",
        "org.tura.model.designer.repository.serialized.infra.InfrastructureLayer");
    data.put(
        "infrastructure::InfrastructureComponent",
        "org.tura.model.designer.repository.serialized.infra.InfrastructureComponent");
    data.put(
        "InfrastructureComponent",
        "org.tura.model.designer.repository.serialized.infra.InfrastructureComponent");
    data.put(
        "infrastructure::InfrastructureConnection",
        "org.tura.model.designer.repository.serialized.infra.InfrastructureConnection");
    data.put(
        "InfrastructureConnection",
        "org.tura.model.designer.repository.serialized.infra.InfrastructureConnection");
    data.put(
        "application::ApplicationStyleLibraries",
        "org.tura.model.designer.repository.serialized.application.ApplicationStyleLibraries");
    data.put(
        "ApplicationStyleLibraries",
        "org.tura.model.designer.repository.serialized.application.ApplicationStyleLibraries");
    data.put(
        "application::ApplicationStyle",
        "org.tura.model.designer.repository.serialized.application.ApplicationStyle");
    data.put(
        "ApplicationStyle",
        "org.tura.model.designer.repository.serialized.application.ApplicationStyle");
    data.put(
        "style::StyleLibrary", "org.tura.model.designer.repository.serialized.style.StyleLibrary");
    data.put("StyleLibrary", "org.tura.model.designer.repository.serialized.style.StyleLibrary");
    data.put("style::StyleSet", "org.tura.model.designer.repository.serialized.style.StyleSet");
    data.put("StyleSet", "org.tura.model.designer.repository.serialized.style.StyleSet");
    data.put(
        "style::StylePointer", "org.tura.model.designer.repository.serialized.style.StylePointer");
    data.put("StylePointer", "org.tura.model.designer.repository.serialized.style.StylePointer");
    data.put(
        "application::ApplicationRealms",
        "org.tura.model.designer.repository.serialized.application.ApplicationRealms");
    data.put(
        "ApplicationRealms",
        "org.tura.model.designer.repository.serialized.application.ApplicationRealms");
    data.put(
        "application::ApplicationRealm",
        "org.tura.model.designer.repository.serialized.application.ApplicationRealm");
    data.put(
        "ApplicationRealm",
        "org.tura.model.designer.repository.serialized.application.ApplicationRealm");
    data.put("permission::Roles", "org.tura.model.designer.repository.serialized.permission.Roles");
    data.put("Roles", "org.tura.model.designer.repository.serialized.permission.Roles");
    data.put("permission::Role", "org.tura.model.designer.repository.serialized.permission.Role");
    data.put("Role", "org.tura.model.designer.repository.serialized.permission.Role");
    data.put(
        "permission::Group2Role",
        "org.tura.model.designer.repository.serialized.permission.Group2Role");
    data.put("Group2Role", "org.tura.model.designer.repository.serialized.permission.Group2Role");
    data.put("permission::Group", "org.tura.model.designer.repository.serialized.permission.Group");
    data.put("Group", "org.tura.model.designer.repository.serialized.permission.Group");
    data.put(
        "permission::Group2Group",
        "org.tura.model.designer.repository.serialized.permission.Group2Group");
    data.put("Group2Group", "org.tura.model.designer.repository.serialized.permission.Group2Group");
    data.put(
        "application::ApplicationMessageLibraries",
        "org.tura.model.designer.repository.serialized.application.ApplicationMessageLibraries");
    data.put(
        "ApplicationMessageLibraries",
        "org.tura.model.designer.repository.serialized.application.ApplicationMessageLibraries");
    data.put(
        "application::ApplicationMessageLibrary",
        "org.tura.model.designer.repository.serialized.application.ApplicationMessageLibrary");
    data.put(
        "ApplicationMessageLibrary",
        "org.tura.model.designer.repository.serialized.application.ApplicationMessageLibrary");
    data.put(
        "message::MessageLibrary",
        "org.tura.model.designer.repository.serialized.message.MessageLibrary");
    data.put(
        "MessageLibrary", "org.tura.model.designer.repository.serialized.message.MessageLibrary");
    data.put("message::Message", "org.tura.model.designer.repository.serialized.message.Message");
    data.put("Message", "org.tura.model.designer.repository.serialized.message.Message");
    data.put(
        "message::Translation",
        "org.tura.model.designer.repository.serialized.message.Translation");
    data.put("Translation", "org.tura.model.designer.repository.serialized.message.Translation");
    data.put("message::Language", "org.tura.model.designer.repository.serialized.message.Language");
    data.put("Language", "org.tura.model.designer.repository.serialized.message.Language");
    data.put(
        "application::ApplicationLanguages",
        "org.tura.model.designer.repository.serialized.application.ApplicationLanguages");
    data.put(
        "ApplicationLanguages",
        "org.tura.model.designer.repository.serialized.application.ApplicationLanguages");
    data.put(
        "application::ApplicationGroup",
        "org.tura.model.designer.repository.serialized.application.ApplicationGroup");
    data.put(
        "ApplicationGroup",
        "org.tura.model.designer.repository.serialized.application.ApplicationGroup");
    data.put(
        "domain::DomainApplication",
        "org.tura.model.designer.repository.serialized.domain.DomainApplication");
    data.put(
        "DomainApplication",
        "org.tura.model.designer.repository.serialized.domain.DomainApplication");
    data.put(
        "domain::DomainApplications",
        "org.tura.model.designer.repository.serialized.domain.DomainApplications");
    data.put(
        "DomainApplications",
        "org.tura.model.designer.repository.serialized.domain.DomainApplications");
    data.put("form::ViewPort", "org.tura.model.designer.repository.serialized.form.ViewPort");
    data.put("ViewPort", "org.tura.model.designer.repository.serialized.form.ViewPort");
    data.put(
        "form::ViewPortTrigger",
        "org.tura.model.designer.repository.serialized.form.ViewPortTrigger");
    data.put(
        "ViewPortTrigger", "org.tura.model.designer.repository.serialized.form.ViewPortTrigger");
    data.put("form::Blockable", "org.tura.model.designer.repository.serialized.form.Blockable");
    data.put("Blockable", "org.tura.model.designer.repository.serialized.form.Blockable");
    data.put(
        "form::DataExporter", "org.tura.model.designer.repository.serialized.form.DataExporter");
    data.put("DataExporter", "org.tura.model.designer.repository.serialized.form.DataExporter");
    data.put(
        "form::InputElement", "org.tura.model.designer.repository.serialized.form.InputElement");
    data.put("InputElement", "org.tura.model.designer.repository.serialized.form.InputElement");
    data.put(
        "form::LinkToMessage", "org.tura.model.designer.repository.serialized.form.LinkToMessage");
    data.put("LinkToMessage", "org.tura.model.designer.repository.serialized.form.LinkToMessage");
    data.put("form::ViewArea", "org.tura.model.designer.repository.serialized.form.ViewArea");
    data.put("ViewArea", "org.tura.model.designer.repository.serialized.form.ViewArea");
    data.put("form::LayerHolder", "org.tura.model.designer.repository.serialized.form.LayerHolder");
    data.put("LayerHolder", "org.tura.model.designer.repository.serialized.form.LayerHolder");
    data.put("form::LinkToLabel", "org.tura.model.designer.repository.serialized.form.LinkToLabel");
    data.put("LinkToLabel", "org.tura.model.designer.repository.serialized.form.LinkToLabel");
    data.put("form::Label", "org.tura.model.designer.repository.serialized.form.Label");
    data.put("Label", "org.tura.model.designer.repository.serialized.form.Label");
    data.put(
        "form::MessageElement",
        "org.tura.model.designer.repository.serialized.form.MessageElement");
    data.put("MessageElement", "org.tura.model.designer.repository.serialized.form.MessageElement");
    data.put(
        "form::RelationMapper",
        "org.tura.model.designer.repository.serialized.form.RelationMapper");
    data.put("RelationMapper", "org.tura.model.designer.repository.serialized.form.RelationMapper");
    data.put(
        "form::InternalRelation",
        "org.tura.model.designer.repository.serialized.form.InternalRelation");
    data.put(
        "InternalRelation", "org.tura.model.designer.repository.serialized.form.InternalRelation");
    data.put(
        "type::AttributePointer",
        "org.tura.model.designer.repository.serialized.type.AttributePointer");
    data.put(
        "AttributePointer", "org.tura.model.designer.repository.serialized.type.AttributePointer");
    data.put(
        "form::PREQueryTrigger",
        "org.tura.model.designer.repository.serialized.form.PREQueryTrigger");
    data.put(
        "PREQueryTrigger", "org.tura.model.designer.repository.serialized.form.PREQueryTrigger");
    data.put(
        "form::POSTQueryTrigger",
        "org.tura.model.designer.repository.serialized.form.POSTQueryTrigger");
    data.put(
        "POSTQueryTrigger", "org.tura.model.designer.repository.serialized.form.POSTQueryTrigger");
    data.put(
        "form::PREInsertTrigger",
        "org.tura.model.designer.repository.serialized.form.PREInsertTrigger");
    data.put(
        "PREInsertTrigger", "org.tura.model.designer.repository.serialized.form.PREInsertTrigger");
    data.put(
        "form::PREDeleteTrigger",
        "org.tura.model.designer.repository.serialized.form.PREDeleteTrigger");
    data.put(
        "PREDeleteTrigger", "org.tura.model.designer.repository.serialized.form.PREDeleteTrigger");
    data.put(
        "form::POSTCreateTrigger",
        "org.tura.model.designer.repository.serialized.form.POSTCreateTrigger");
    data.put(
        "POSTCreateTrigger",
        "org.tura.model.designer.repository.serialized.form.POSTCreateTrigger");
    data.put(
        "form::PREUpdateTrigger",
        "org.tura.model.designer.repository.serialized.form.PREUpdateTrigger");
    data.put(
        "PREUpdateTrigger", "org.tura.model.designer.repository.serialized.form.PREUpdateTrigger");
    data.put(
        "form::CreateTrigger", "org.tura.model.designer.repository.serialized.form.CreateTrigger");
    data.put("CreateTrigger", "org.tura.model.designer.repository.serialized.form.CreateTrigger");
    data.put(
        "form::SearchTrigger", "org.tura.model.designer.repository.serialized.form.SearchTrigger");
    data.put("SearchTrigger", "org.tura.model.designer.repository.serialized.form.SearchTrigger");
    data.put(
        "form::ArtificialField",
        "org.tura.model.designer.repository.serialized.form.ArtificialField");
    data.put(
        "ArtificialField", "org.tura.model.designer.repository.serialized.form.ArtificialField");
    data.put(
        "objectmapper::CalculatedField",
        "org.tura.model.designer.repository.serialized.objectmapper.CalculatedField");
    data.put(
        "CalculatedField",
        "org.tura.model.designer.repository.serialized.objectmapper.CalculatedField");
    data.put(
        "objectmapper::Aggregation",
        "org.tura.model.designer.repository.serialized.objectmapper.Aggregation");
    data.put(
        "Aggregation", "org.tura.model.designer.repository.serialized.objectmapper.Aggregation");
    data.put(
        "objectmapper::ProcessingStage",
        "org.tura.model.designer.repository.serialized.objectmapper.ProcessingStage");
    data.put(
        "ProcessingStage",
        "org.tura.model.designer.repository.serialized.objectmapper.ProcessingStage");
    data.put(
        "objectmapper::Variable",
        "org.tura.model.designer.repository.serialized.objectmapper.Variable");
    data.put("Variable", "org.tura.model.designer.repository.serialized.objectmapper.Variable");
    data.put(
        "domain::DomainMapper",
        "org.tura.model.designer.repository.serialized.domain.DomainMapper");
    data.put("DomainMapper", "org.tura.model.designer.repository.serialized.domain.DomainMapper");
    data.put(
        "domain::DomainMappers",
        "org.tura.model.designer.repository.serialized.domain.DomainMappers");
    data.put("DomainMappers", "org.tura.model.designer.repository.serialized.domain.DomainMappers");
    data.put("recipe::Query", "org.tura.model.designer.repository.serialized.recipe.Query");
    data.put("Query", "org.tura.model.designer.repository.serialized.recipe.Query");
    data.put(
        "recipe::QueryVariable",
        "org.tura.model.designer.repository.serialized.recipe.QueryVariable");
    data.put("QueryVariable", "org.tura.model.designer.repository.serialized.recipe.QueryVariable");
    data.put(
        "artifact::QueryParameter",
        "org.tura.model.designer.repository.serialized.artifact.QueryParameter");
    data.put(
        "QueryParameter", "org.tura.model.designer.repository.serialized.artifact.QueryParameter");
    data.put(
        "artifact::ModelQuery",
        "org.tura.model.designer.repository.serialized.artifact.ModelQuery");
    data.put("ModelQuery", "org.tura.model.designer.repository.serialized.artifact.ModelQuery");
    data.put(
        "recipe::ArtifactRef", "org.tura.model.designer.repository.serialized.recipe.ArtifactRef");
    data.put("ArtifactRef", "org.tura.model.designer.repository.serialized.recipe.ArtifactRef");
    data.put(
        "recipe::Recipe2Infrastructure",
        "org.tura.model.designer.repository.serialized.recipe.Recipe2Infrastructure");
    data.put(
        "Recipe2Infrastructure",
        "org.tura.model.designer.repository.serialized.recipe.Recipe2Infrastructure");
    data.put(
        "recipe::Infrastructure",
        "org.tura.model.designer.repository.serialized.recipe.Infrastructure");
    data.put(
        "Infrastructure", "org.tura.model.designer.repository.serialized.recipe.Infrastructure");
    data.put(
        "recipe::Infrastructure2Configuration",
        "org.tura.model.designer.repository.serialized.recipe.Infrastructure2Configuration");
    data.put(
        "Infrastructure2Configuration",
        "org.tura.model.designer.repository.serialized.recipe.Infrastructure2Configuration");
    data.put("type::References", "org.tura.model.designer.repository.serialized.type.References");
    data.put("References", "org.tura.model.designer.repository.serialized.type.References");
    data.put(
        "type::Generalization",
        "org.tura.model.designer.repository.serialized.type.Generalization");
    data.put("Generalization", "org.tura.model.designer.repository.serialized.type.Generalization");
    data.put(
        "type::TypeReference", "org.tura.model.designer.repository.serialized.type.TypeReference");
    data.put("TypeReference", "org.tura.model.designer.repository.serialized.type.TypeReference");
    data.put("type::Enumerator", "org.tura.model.designer.repository.serialized.type.Enumerator");
    data.put("Enumerator", "org.tura.model.designer.repository.serialized.type.Enumerator");
    data.put(
        "type::EnumAttribute", "org.tura.model.designer.repository.serialized.type.EnumAttribute");
    data.put("EnumAttribute", "org.tura.model.designer.repository.serialized.type.EnumAttribute");
    data.put(
        "infrastructure::Server", "org.tura.model.designer.repository.serialized.infra.Server");
    data.put("Server", "org.tura.model.designer.repository.serialized.infra.Server");
    data.put(
        "infrastructure::ServerClaster",
        "org.tura.model.designer.repository.serialized.infra.ServerClaster");
    data.put("ServerClaster", "org.tura.model.designer.repository.serialized.infra.ServerClaster");
    data.put(
        "infrastructure::Router", "org.tura.model.designer.repository.serialized.infra.Router");
    data.put("Router", "org.tura.model.designer.repository.serialized.infra.Router");
    data.put("infrastructure::Hub", "org.tura.model.designer.repository.serialized.infra.Hub");
    data.put("Hub", "org.tura.model.designer.repository.serialized.infra.Hub");
    data.put(
        "infrastructure::Storage", "org.tura.model.designer.repository.serialized.infra.Storage");
    data.put("Storage", "org.tura.model.designer.repository.serialized.infra.Storage");
    data.put("form::PopupCanvas", "org.tura.model.designer.repository.serialized.form.PopupCanvas");
    data.put("PopupCanvas", "org.tura.model.designer.repository.serialized.form.PopupCanvas");
    data.put("form::Canvas", "org.tura.model.designer.repository.serialized.form.Canvas");
    data.put("Canvas", "org.tura.model.designer.repository.serialized.form.Canvas");
    data.put("form::Window", "org.tura.model.designer.repository.serialized.form.Window");
    data.put("Window", "org.tura.model.designer.repository.serialized.form.Window");
    data.put("form::InputText", "org.tura.model.designer.repository.serialized.form.InputText");
    data.put("InputText", "org.tura.model.designer.repository.serialized.form.InputText");
    data.put("form::Formatable", "org.tura.model.designer.repository.serialized.form.Formatable");
    data.put("Formatable", "org.tura.model.designer.repository.serialized.form.Formatable");
    data.put("form::Password", "org.tura.model.designer.repository.serialized.form.Password");
    data.put("Password", "org.tura.model.designer.repository.serialized.form.Password");
    data.put("form::OutputText", "org.tura.model.designer.repository.serialized.form.OutputText");
    data.put("OutputText", "org.tura.model.designer.repository.serialized.form.OutputText");
    data.put("form::CheckBox", "org.tura.model.designer.repository.serialized.form.CheckBox");
    data.put("CheckBox", "org.tura.model.designer.repository.serialized.form.CheckBox");
    data.put(
        "form::DropDownSelection",
        "org.tura.model.designer.repository.serialized.form.DropDownSelection");
    data.put(
        "DropDownSelection",
        "org.tura.model.designer.repository.serialized.form.DropDownSelection");
    data.put(
        "form::SelectManyMenu",
        "org.tura.model.designer.repository.serialized.form.SelectManyMenu");
    data.put("SelectManyMenu", "org.tura.model.designer.repository.serialized.form.SelectManyMenu");
    data.put(
        "form::RadioSelection",
        "org.tura.model.designer.repository.serialized.form.RadioSelection");
    data.put("RadioSelection", "org.tura.model.designer.repository.serialized.form.RadioSelection");
    data.put("form::Image", "org.tura.model.designer.repository.serialized.form.Image");
    data.put("Image", "org.tura.model.designer.repository.serialized.form.Image");
    data.put("form::Date", "org.tura.model.designer.repository.serialized.form.Date");
    data.put("Date", "org.tura.model.designer.repository.serialized.form.Date");
    data.put("form::Button", "org.tura.model.designer.repository.serialized.form.Button");
    data.put("Button", "org.tura.model.designer.repository.serialized.form.Button");
    data.put("form::Menu", "org.tura.model.designer.repository.serialized.form.Menu");
    data.put("Menu", "org.tura.model.designer.repository.serialized.form.Menu");
    data.put("form::BlockUI", "org.tura.model.designer.repository.serialized.form.BlockUI");
    data.put("BlockUI", "org.tura.model.designer.repository.serialized.form.BlockUI");
    data.put("form::FileUpload", "org.tura.model.designer.repository.serialized.form.FileUpload");
    data.put("FileUpload", "org.tura.model.designer.repository.serialized.form.FileUpload");
    data.put(
        "form::FileDownload", "org.tura.model.designer.repository.serialized.form.FileDownload");
    data.put("FileDownload", "org.tura.model.designer.repository.serialized.form.FileDownload");
    data.put(
        "form::DataScroller", "org.tura.model.designer.repository.serialized.form.DataScroller");
    data.put("DataScroller", "org.tura.model.designer.repository.serialized.form.DataScroller");
    data.put("form::TimeLine", "org.tura.model.designer.repository.serialized.form.TimeLine");
    data.put("TimeLine", "org.tura.model.designer.repository.serialized.form.TimeLine");
    data.put(
        "form::FullCalendar", "org.tura.model.designer.repository.serialized.form.FullCalendar");
    data.put("FullCalendar", "org.tura.model.designer.repository.serialized.form.FullCalendar");
    data.put("form::Poll", "org.tura.model.designer.repository.serialized.form.Poll");
    data.put("Poll", "org.tura.model.designer.repository.serialized.form.Poll");
    data.put(
        "form::DataTemplate", "org.tura.model.designer.repository.serialized.form.DataTemplate");
    data.put("DataTemplate", "org.tura.model.designer.repository.serialized.form.DataTemplate");
    data.put("form::WindowRef", "org.tura.model.designer.repository.serialized.form.WindowRef");
    data.put("WindowRef", "org.tura.model.designer.repository.serialized.form.WindowRef");
    data.put(
        "form::MenuExtensionPoint",
        "org.tura.model.designer.repository.serialized.form.MenuExtensionPoint");
    data.put(
        "MenuExtensionPoint",
        "org.tura.model.designer.repository.serialized.form.MenuExtensionPoint");
    data.put(
        "form::MenuSeparator", "org.tura.model.designer.repository.serialized.form.MenuSeparator");
    data.put("MenuSeparator", "org.tura.model.designer.repository.serialized.form.MenuSeparator");
    data.put(
        "form::InsertTrigger", "org.tura.model.designer.repository.serialized.form.InsertTrigger");
    data.put("InsertTrigger", "org.tura.model.designer.repository.serialized.form.InsertTrigger");
    data.put(
        "form::UpdateTrigger", "org.tura.model.designer.repository.serialized.form.UpdateTrigger");
    data.put("UpdateTrigger", "org.tura.model.designer.repository.serialized.form.UpdateTrigger");
    data.put(
        "form::DeleteTrigger", "org.tura.model.designer.repository.serialized.form.DeleteTrigger");
    data.put("DeleteTrigger", "org.tura.model.designer.repository.serialized.form.DeleteTrigger");
    data.put(
        "mapper::JavaMapper", "org.tura.model.designer.repository.serialized.mapper.JavaMapper");
    data.put("JavaMapper", "org.tura.model.designer.repository.serialized.mapper.JavaMapper");
    data.put(
        "mapper::TypeMapper", "org.tura.model.designer.repository.serialized.mapper.TypeMapper");
    data.put("TypeMapper", "org.tura.model.designer.repository.serialized.mapper.TypeMapper");
    data.put(
        "mapper::JavaPackageMapper",
        "org.tura.model.designer.repository.serialized.mapper.JavaPackageMapper");
    data.put(
        "JavaPackageMapper",
        "org.tura.model.designer.repository.serialized.mapper.JavaPackageMapper");
    data.put(
        "mapper::PackageMapper",
        "org.tura.model.designer.repository.serialized.mapper.PackageMapper");
    data.put("PackageMapper", "org.tura.model.designer.repository.serialized.mapper.PackageMapper");
    data.put(
        "mapper::JavaScriptMapper",
        "org.tura.model.designer.repository.serialized.mapper.JavaScriptMapper");
    data.put(
        "JavaScriptMapper",
        "org.tura.model.designer.repository.serialized.mapper.JavaScriptMapper");
    data.put("mapper::CSSMapper", "org.tura.model.designer.repository.serialized.mapper.CSSMapper");
    data.put("CSSMapper", "org.tura.model.designer.repository.serialized.mapper.CSSMapper");
    data.put(
        "mapper::RoleMapper", "org.tura.model.designer.repository.serialized.mapper.RoleMapper");
    data.put("RoleMapper", "org.tura.model.designer.repository.serialized.mapper.RoleMapper");
    data.put(
        "mapper::XMLPackageMapper",
        "org.tura.model.designer.repository.serialized.mapper.XMLPackageMapper");
    data.put(
        "XMLPackageMapper",
        "org.tura.model.designer.repository.serialized.mapper.XMLPackageMapper");
    data.put(
        "mapper::XMLTypeMapper",
        "org.tura.model.designer.repository.serialized.mapper.XMLTypeMapper");
    data.put("XMLTypeMapper", "org.tura.model.designer.repository.serialized.mapper.XMLTypeMapper");
    data.put(
        "mapper::MetamodelPackageMapper",
        "org.tura.model.designer.repository.serialized.mapper.MetamodelPackageMapper");
    data.put(
        "MetamodelPackageMapper",
        "org.tura.model.designer.repository.serialized.mapper.MetamodelPackageMapper");
    data.put(
        "dictionary::ListOfLanguages",
        "org.tura.model.designer.repository.serialized.dictionary.ListOfLanguages");
    data.put(
        "ListOfLanguages",
        "org.tura.model.designer.repository.serialized.dictionary.ListOfLanguages");
    data.put(
        "dictionary::ConfigHashAggregator",
        "org.tura.model.designer.repository.serialized.dictionary.ConfigHashAggregator");
    data.put(
        "ConfigHashAggregator",
        "org.tura.model.designer.repository.serialized.dictionary.ConfigHashAggregator");
    data.put(
        "dictionary::ConfigVariableAggregator",
        "org.tura.model.designer.repository.serialized.dictionary.ConfigVariableAggregator");
    data.put(
        "ConfigVariableAggregator",
        "org.tura.model.designer.repository.serialized.dictionary.ConfigVariableAggregator");
    data.put(
        "dictionary::GenerationHintAggregator",
        "org.tura.model.designer.repository.serialized.dictionary.GenerationHintAggregator");
    data.put(
        "GenerationHintAggregator",
        "org.tura.model.designer.repository.serialized.dictionary.GenerationHintAggregator");
    data.put(
        "dictionary::RootST", "org.tura.model.designer.repository.serialized.dictionary.RootST");
    data.put("RootST", "org.tura.model.designer.repository.serialized.dictionary.RootST");
    data.put(
        "dictionary::TypesAggregator",
        "org.tura.model.designer.repository.serialized.dictionary.TypesAggregator");
    data.put(
        "TypesAggregator",
        "org.tura.model.designer.repository.serialized.dictionary.TypesAggregator");
    data.put(
        "dictionary::OptionsSet",
        "org.tura.model.designer.repository.serialized.dictionary.OptionsSet");
    data.put("OptionsSet", "org.tura.model.designer.repository.serialized.dictionary.OptionsSet");
    data.put(
        "type::RelationType", "org.tura.model.designer.repository.serialized.type.RelationType");
    data.put("RelationType", "org.tura.model.designer.repository.serialized.type.RelationType");
    data.put("type::Containment", "org.tura.model.designer.repository.serialized.type.Containment");
    data.put("Containment", "org.tura.model.designer.repository.serialized.type.Containment");
    data.put(
        "objectmapper::OperationType",
        "org.tura.model.designer.repository.serialized.objectmapper.OperationType");
    data.put(
        "OperationType",
        "org.tura.model.designer.repository.serialized.objectmapper.OperationType");
    data.put("form::Comparator", "org.tura.model.designer.repository.serialized.form.Comparator");
    data.put("Comparator", "org.tura.model.designer.repository.serialized.form.Comparator");
    data.put("form::Order", "org.tura.model.designer.repository.serialized.form.Order");
    data.put("Order", "org.tura.model.designer.repository.serialized.form.Order");
    data.put("form::Orientation", "org.tura.model.designer.repository.serialized.form.Orientation");
    data.put("Orientation", "org.tura.model.designer.repository.serialized.form.Orientation");
    data.put("form::RadioLayout", "org.tura.model.designer.repository.serialized.form.RadioLayout");
    data.put("RadioLayout", "org.tura.model.designer.repository.serialized.form.RadioLayout");
    data.put(
        "form::DataExporterType",
        "org.tura.model.designer.repository.serialized.form.DataExporterType");
    data.put(
        "DataExporterType", "org.tura.model.designer.repository.serialized.form.DataExporterType");
    data.put("form::Sortable", "org.tura.model.designer.repository.serialized.form.Sortable");
    data.put("Sortable", "org.tura.model.designer.repository.serialized.form.Sortable");
    data.put(
        "form::SelectionMode", "org.tura.model.designer.repository.serialized.form.SelectionMode");
    data.put("SelectionMode", "org.tura.model.designer.repository.serialized.form.SelectionMode");
    data.put(
        "form::TimeLineLayout",
        "org.tura.model.designer.repository.serialized.form.TimeLineLayout");
    data.put("TimeLineLayout", "org.tura.model.designer.repository.serialized.form.TimeLineLayout");
    data.put(
        "form::TimeLineAlign", "org.tura.model.designer.repository.serialized.form.TimeLineAlign");
    data.put("TimeLineAlign", "org.tura.model.designer.repository.serialized.form.TimeLineAlign");
    data.put(
        "mapper::ArtifactType",
        "org.tura.model.designer.repository.serialized.mapper.ArtifactType");
    data.put("ArtifactType", "org.tura.model.designer.repository.serialized.mapper.ArtifactType");
    data.put(
        "mapper::JavaLibScope",
        "org.tura.model.designer.repository.serialized.mapper.JavaLibScope");
    data.put("JavaLibScope", "org.tura.model.designer.repository.serialized.mapper.JavaLibScope");
  }

  public Map<String, String> getData() {
    return data;
  }
}
