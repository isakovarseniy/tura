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

package org.tura.model.designer.repository.serialized.metabase;

import org.tura.model.designer.repository.serialized.objectmapper.AttributeConnector;
import java.util.List;
import org.tura.model.designer.repository.serialized.form.ContextParameter;
import org.tura.model.designer.repository.serialized.form.ExpressionPart;
import org.tura.model.designer.repository.serialized.form.ControlPointer;
import org.tura.model.designer.repository.serialized.form.Selection;
import org.tura.model.designer.repository.serialized.form.OrderBy;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonSubTypes;

@JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "@class")
@JsonSubTypes({
  @Type(value = org.tura.model.designer.repository.serialized.domain.Domain.class, name = "Domain"),
  @Type(
      value = org.tura.model.designer.repository.serialized.domain.DomainArtifacts.class,
      name = "DomainArtifacts"),
  @Type(
      value = org.tura.model.designer.repository.serialized.domain.DomainArtifact.class,
      name = "DomainArtifact"),
  @Type(
      value = org.tura.model.designer.repository.serialized.domain.DomainTypes.class,
      name = "DomainTypes"),
  @Type(
      value = org.tura.model.designer.repository.serialized.domain.DomainTypesRepository.class,
      name = "DomainTypesRepository"),
  @Type(
      value = org.tura.model.designer.repository.serialized.domain.DomainApplications.class,
      name = "DomainApplications"),
  @Type(
      value = org.tura.model.designer.repository.serialized.domain.DomainApplication.class,
      name = "DomainApplication"),
  @Type(
      value = org.tura.model.designer.repository.serialized.domain.DomainMappers.class,
      name = "DomainMappers"),
  @Type(
      value = org.tura.model.designer.repository.serialized.domain.DomainMapper.class,
      name = "DomainMapper"),
  @Type(
      value = org.tura.model.designer.repository.serialized.artifact.ArtifactGroup.class,
      name = "ArtifactGroup"),
  @Type(
      value = org.tura.model.designer.repository.serialized.artifact.TechLeaf.class,
      name = "TechLeaf"),
  @Type(
      value = org.tura.model.designer.repository.serialized.artifact.Artifact.class,
      name = "Artifact"),
  @Type(
      value =
          org.tura.model.designer.repository.serialized.artifact.GenerationHintWithNickName.class,
      name = "GenerationHintWithNickName"),
  @Type(
      value =
          org.tura.model.designer.repository.serialized.artifact.ConfigVariableWithNickName.class,
      name = "ConfigVariableWithNickName"),
  @Type(
      value = org.tura.model.designer.repository.serialized.artifact.ConfigHashWithNickName.class,
      name = "ConfigHashWithNickName"),
  @Type(
      value = org.tura.model.designer.repository.serialized.artifact.GenerationHint.class,
      name = "GenerationHint"),
  @Type(
      value = org.tura.model.designer.repository.serialized.artifact.ConfigVariable.class,
      name = "ConfigVariable"),
  @Type(
      value = org.tura.model.designer.repository.serialized.artifact.ConfigHash.class,
      name = "ConfigHash"),
  @Type(
      value = org.tura.model.designer.repository.serialized.artifact.ModelQuery.class,
      name = "ModelQuery"),
  @Type(
      value = org.tura.model.designer.repository.serialized.artifact.QueryParameter.class,
      name = "QueryParameter"),
  @Type(
      value = org.tura.model.designer.repository.serialized.artifact.Technology.class,
      name = "Technology"),
  @Type(
      value = org.tura.model.designer.repository.serialized.artifact.Option.class,
      name = "Option"),
  @Type(
      value = org.tura.model.designer.repository.serialized.artifact.Classifier.class,
      name = "Classifier"),
  @Type(
      value = org.tura.model.designer.repository.serialized.type.TypeGroup.class,
      name = "TypeGroup"),
  @Type(
      value = org.tura.model.designer.repository.serialized.type.PrimitivesGroup.class,
      name = "PrimitivesGroup"),
  @Type(
      value = org.tura.model.designer.repository.serialized.type.References.class,
      name = "References"),
  @Type(
      value = org.tura.model.designer.repository.serialized.type.Generalization.class,
      name = "Generalization"),
  @Type(
      value = org.tura.model.designer.repository.serialized.type.TypePointerObj.class,
      name = "TypePointerObj"),
  @Type(
      value = org.tura.model.designer.repository.serialized.type.Assosiation.class,
      name = "Assosiation"),
  @Type(value = org.tura.model.designer.repository.serialized.type.Link.class, name = "Link"),
  @Type(
      value = org.tura.model.designer.repository.serialized.type.Attribute.class,
      name = "Attribute"),
  @Type(
      value = org.tura.model.designer.repository.serialized.type.Operation.class,
      name = "Operation"),
  @Type(
      value = org.tura.model.designer.repository.serialized.type.Primitive.class,
      name = "Primitive"),
  @Type(value = org.tura.model.designer.repository.serialized.type.Type.class, name = "Type"),
  @Type(
      value = org.tura.model.designer.repository.serialized.type.TypeReference.class,
      name = "TypeReference"),
  @Type(
      value = org.tura.model.designer.repository.serialized.type.Parameter.class,
      name = "Parameter"),
  @Type(
      value = org.tura.model.designer.repository.serialized.type.ReturnValue.class,
      name = "ReturnValue"),
  @Type(
      value = org.tura.model.designer.repository.serialized.type.Enumerator.class,
      name = "Enumerator"),
  @Type(
      value = org.tura.model.designer.repository.serialized.type.EnumAttribute.class,
      name = "EnumAttribute"),
  @Type(
      value = org.tura.model.designer.repository.serialized.type.AttributePointer.class,
      name = "AttributePointer"),
  @Type(
      value = org.tura.model.designer.repository.serialized.application.ApplicationGroup.class,
      name = "ApplicationGroup"),
  @Type(
      value = org.tura.model.designer.repository.serialized.application.Application.class,
      name = "Application"),
  @Type(
      value =
          org.tura.model.designer.repository.serialized.application.ApplicationInfrastructureLayers
              .class,
      name = "ApplicationInfrastructureLayers"),
  @Type(
      value =
          org.tura.model.designer.repository.serialized.application.ApplicationInfrastructureLayer
              .class,
      name = "ApplicationInfrastructureLayer"),
  @Type(
      value =
          org.tura.model.designer.repository.serialized.application.ApplicationMessageLibraries
              .class,
      name = "ApplicationMessageLibraries"),
  @Type(
      value = org.tura.model.designer.repository.serialized.application.ApplicationLanguages.class,
      name = "ApplicationLanguages"),
  @Type(
      value =
          org.tura.model.designer.repository.serialized.application.ApplicationMessageLibrary.class,
      name = "ApplicationMessageLibrary"),
  @Type(
      value = org.tura.model.designer.repository.serialized.application.ApplicationRealms.class,
      name = "ApplicationRealms"),
  @Type(
      value = org.tura.model.designer.repository.serialized.application.ApplicationRealm.class,
      name = "ApplicationRealm"),
  @Type(
      value =
          org.tura.model.designer.repository.serialized.application.ApplicationStyleLibraries.class,
      name = "ApplicationStyleLibraries"),
  @Type(
      value = org.tura.model.designer.repository.serialized.application.ApplicationStyle.class,
      name = "ApplicationStyle"),
  @Type(
      value = org.tura.model.designer.repository.serialized.application.ApplicationUILayer.class,
      name = "ApplicationUILayer"),
  @Type(
      value = org.tura.model.designer.repository.serialized.application.ApplicationUIPackage.class,
      name = "ApplicationUIPackage"),
  @Type(
      value = org.tura.model.designer.repository.serialized.application.ApplicationRecipes.class,
      name = "ApplicationRecipes"),
  @Type(
      value = org.tura.model.designer.repository.serialized.application.ApplicationRecipe.class,
      name = "ApplicationRecipe"),
  @Type(
      value = org.tura.model.designer.repository.serialized.application.ApplicationMappers.class,
      name = "ApplicationMappers"),
  @Type(
      value = org.tura.model.designer.repository.serialized.application.ApplicationMapper.class,
      name = "ApplicationMapper"),
  @Type(
      value = org.tura.model.designer.repository.serialized.objectmapper.ProcessingStage.class,
      name = "ProcessingStage"),
  @Type(
      value = org.tura.model.designer.repository.serialized.objectmapper.ObjectMapperGroup.class,
      name = "ObjectMapperGroup"),
  @Type(
      value = org.tura.model.designer.repository.serialized.objectmapper.ObjectMapper.class,
      name = "ObjectMapper"),
  @Type(
      value = org.tura.model.designer.repository.serialized.objectmapper.Variable.class,
      name = "Variable"),
  @Type(
      value = org.tura.model.designer.repository.serialized.objectmapper.Aggregation.class,
      name = "Aggregation"),
  @Type(
      value = org.tura.model.designer.repository.serialized.objectmapper.OmRelation.class,
      name = "OmRelation"),
  @Type(
      value = org.tura.model.designer.repository.serialized.objectmapper.AttributeConnector.class,
      name = "AttributeConnector"),
  @Type(
      value = org.tura.model.designer.repository.serialized.objectmapper.OperationConnector.class,
      name = "OperationConnector"),
  @Type(
      value = org.tura.model.designer.repository.serialized.permission.Roles.class,
      name = "Roles"),
  @Type(value = org.tura.model.designer.repository.serialized.permission.Role.class, name = "Role"),
  @Type(
      value = org.tura.model.designer.repository.serialized.permission.Group.class,
      name = "Group"),
  @Type(
      value = org.tura.model.designer.repository.serialized.permission.Group2Group.class,
      name = "Group2Group"),
  @Type(
      value = org.tura.model.designer.repository.serialized.permission.Group2Role.class,
      name = "Group2Role"),
  @Type(
      value = org.tura.model.designer.repository.serialized.permission.GrantAccess.class,
      name = "GrantAccess"),
  @Type(
      value = org.tura.model.designer.repository.serialized.message.MessageLibrary.class,
      name = "MessageLibrary"),
  @Type(
      value = org.tura.model.designer.repository.serialized.message.Message.class,
      name = "Message"),
  @Type(
      value = org.tura.model.designer.repository.serialized.message.Translation.class,
      name = "Translation"),
  @Type(
      value = org.tura.model.designer.repository.serialized.message.Language.class,
      name = "Language"),
  @Type(
      value = org.tura.model.designer.repository.serialized.infra.EnterpriseInfrastructure.class,
      name = "EnterpriseInfrastructure"),
  @Type(
      value = org.tura.model.designer.repository.serialized.infra.Datacenter.class,
      name = "Datacenter"),
  @Type(
      value = org.tura.model.designer.repository.serialized.infra.Subsystem.class,
      name = "Subsystem"),
  @Type(
      value = org.tura.model.designer.repository.serialized.infra.InfrastructureLayer.class,
      name = "InfrastructureLayer"),
  @Type(
      value = org.tura.model.designer.repository.serialized.infra.InfrastructureConnection.class,
      name = "InfrastructureConnection"),
  @Type(value = org.tura.model.designer.repository.serialized.infra.Server.class, name = "Server"),
  @Type(value = org.tura.model.designer.repository.serialized.infra.Router.class, name = "Router"),
  @Type(value = org.tura.model.designer.repository.serialized.infra.Hub.class, name = "Hub"),
  @Type(
      value = org.tura.model.designer.repository.serialized.infra.Storage.class,
      name = "Storage"),
  @Type(
      value = org.tura.model.designer.repository.serialized.infra.ServerClaster.class,
      name = "ServerClaster"),
  @Type(value = org.tura.model.designer.repository.serialized.form.Form.class, name = "Form"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.FormParameter.class,
      name = "FormParameter"),
  @Type(value = org.tura.model.designer.repository.serialized.form.Views.class, name = "Views"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.PopupCanvas.class,
      name = "PopupCanvas"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.OverlayCanvas.class,
      name = "OverlayCanvas"),
  @Type(value = org.tura.model.designer.repository.serialized.form.Canvas.class, name = "Canvas"),
  @Type(value = org.tura.model.designer.repository.serialized.form.Window.class, name = "Window"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.MenuDefinition.class,
      name = "MenuDefinition"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.TabCanvas.class,
      name = "TabCanvas"),
  @Type(value = org.tura.model.designer.repository.serialized.form.TabPage.class, name = "TabPage"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.ViewPort.class,
      name = "ViewPort"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.ViewArea.class,
      name = "ViewArea"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.ViewPortTrigger.class,
      name = "ViewPortTrigger"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.ViewInheritance.class,
      name = "ViewInheritance"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.TabPagesInheritance.class,
      name = "TabPagesInheritance"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.LinkToMessage.class,
      name = "LinkToMessage"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.LinkToLabel.class,
      name = "LinkToLabel"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.ContextParameter.class,
      name = "ContextParameter"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.ExpressionPart.class,
      name = "ExpressionPart"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.FlexField.class,
      name = "FlexField"),
  @Type(value = org.tura.model.designer.repository.serialized.form.AreaRef.class, name = "AreaRef"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.Selection.class,
      name = "Selection"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.LayerHolder.class,
      name = "LayerHolder"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.InputText.class,
      name = "InputText"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.Password.class,
      name = "Password"),
  @Type(value = org.tura.model.designer.repository.serialized.form.Label.class, name = "Label"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.MessageElement.class,
      name = "MessageElement"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.OutputText.class,
      name = "OutputText"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.CheckBox.class,
      name = "CheckBox"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.DropDownSelection.class,
      name = "DropDownSelection"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.SelectManyMenu.class,
      name = "SelectManyMenu"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.RadioSelection.class,
      name = "RadioSelection"),
  @Type(value = org.tura.model.designer.repository.serialized.form.Image.class, name = "Image"),
  @Type(value = org.tura.model.designer.repository.serialized.form.Date.class, name = "Date"),
  @Type(value = org.tura.model.designer.repository.serialized.form.Button.class, name = "Button"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.DataExporter.class,
      name = "DataExporter"),
  @Type(value = org.tura.model.designer.repository.serialized.form.Column.class, name = "Column"),
  @Type(value = org.tura.model.designer.repository.serialized.form.Table.class, name = "Table"),
  @Type(value = org.tura.model.designer.repository.serialized.form.Menu.class, name = "Menu"),
  @Type(value = org.tura.model.designer.repository.serialized.form.BlockUI.class, name = "BlockUI"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.FileUpload.class,
      name = "FileUpload"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.FileDownload.class,
      name = "FileDownload"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.DataScroller.class,
      name = "DataScroller"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.TimeLine.class,
      name = "TimeLine"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.FullCalendar.class,
      name = "FullCalendar"),
  @Type(value = org.tura.model.designer.repository.serialized.form.Poll.class, name = "Poll"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.DataTemplate.class,
      name = "DataTemplate"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.WindowRef.class,
      name = "WindowRef"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.MenuFolder.class,
      name = "MenuFolder"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.MenuItem.class,
      name = "MenuItem"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.MenuExtensionPoint.class,
      name = "MenuExtensionPoint"),
  @Type(value = org.tura.model.designer.repository.serialized.form.SubMenu.class, name = "SubMenu"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.ToSubmenu.class,
      name = "ToSubmenu"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.MenuSeparator.class,
      name = "MenuSeparator"),
  @Type(value = org.tura.model.designer.repository.serialized.form.Tree.class, name = "Tree"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.Controls.class,
      name = "Controls"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.PREFormTrigger.class,
      name = "PREFormTrigger"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.PREQueryTrigger.class,
      name = "PREQueryTrigger"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.POSTQueryTrigger.class,
      name = "POSTQueryTrigger"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.PREInsertTrigger.class,
      name = "PREInsertTrigger"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.PREDeleteTrigger.class,
      name = "PREDeleteTrigger"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.POSTCreateTrigger.class,
      name = "POSTCreateTrigger"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.PREUpdateTrigger.class,
      name = "PREUpdateTrigger"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.CreateTrigger.class,
      name = "CreateTrigger"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.InsertTrigger.class,
      name = "InsertTrigger"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.UpdateTrigger.class,
      name = "UpdateTrigger"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.DeleteTrigger.class,
      name = "DeleteTrigger"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.SearchTrigger.class,
      name = "SearchTrigger"),
  @Type(value = org.tura.model.designer.repository.serialized.form.Root.class, name = "Root"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.FormVariable.class,
      name = "FormVariable"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.DataControl.class,
      name = "DataControl"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.ContextParametersObj.class,
      name = "ContextParametersObj"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.RelationMapper.class,
      name = "RelationMapper"),
  @Type(value = org.tura.model.designer.repository.serialized.form.Orders.class, name = "Orders"),
  @Type(value = org.tura.model.designer.repository.serialized.form.OrderBy.class, name = "OrderBy"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.InternalRelation.class,
      name = "InternalRelation"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.Dependency.class,
      name = "Dependency"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.ArtificialField.class,
      name = "ArtificialField"),
  @Type(
      value = org.tura.model.designer.repository.serialized.recipe.Recipes.class,
      name = "Recipes"),
  @Type(value = org.tura.model.designer.repository.serialized.recipe.Recipe.class, name = "Recipe"),
  @Type(
      value = org.tura.model.designer.repository.serialized.recipe.ConfigExtension.class,
      name = "ConfigExtension"),
  @Type(
      value = org.tura.model.designer.repository.serialized.recipe.Recipe2Infrastructure.class,
      name = "Recipe2Infrastructure"),
  @Type(
      value =
          org.tura.model.designer.repository.serialized.recipe.Infrastructure2Configuration.class,
      name = "Infrastructure2Configuration"),
  @Type(
      value = org.tura.model.designer.repository.serialized.recipe.DeploymentComponent.class,
      name = "DeploymentComponent"),
  @Type(
      value = org.tura.model.designer.repository.serialized.recipe.DeploymentStarStep.class,
      name = "DeploymentStarStep"),
  @Type(
      value = org.tura.model.designer.repository.serialized.recipe.Ingredient.class,
      name = "Ingredient"),
  @Type(
      value = org.tura.model.designer.repository.serialized.recipe.JavaComponent.class,
      name = "JavaComponent"),
  @Type(
      value = org.tura.model.designer.repository.serialized.recipe.JavaScriptComponent.class,
      name = "JavaScriptComponent"),
  @Type(
      value = org.tura.model.designer.repository.serialized.recipe.Infrastructure.class,
      name = "Infrastructure"),
  @Type(
      value = org.tura.model.designer.repository.serialized.recipe.Configuration.class,
      name = "Configuration"),
  @Type(
      value = org.tura.model.designer.repository.serialized.recipe.ModelMapper.class,
      name = "ModelMapper"),
  @Type(
      value = org.tura.model.designer.repository.serialized.recipe.Property.class,
      name = "Property"),
  @Type(
      value = org.tura.model.designer.repository.serialized.recipe.HashProperty.class,
      name = "HashProperty"),
  @Type(
      value = org.tura.model.designer.repository.serialized.recipe.KeyValuePair.class,
      name = "KeyValuePair"),
  @Type(
      value = org.tura.model.designer.repository.serialized.recipe.MappingTecnologiy.class,
      name = "MappingTecnologiy"),
  @Type(value = org.tura.model.designer.repository.serialized.recipe.Query.class, name = "Query"),
  @Type(
      value = org.tura.model.designer.repository.serialized.recipe.QueryVariable.class,
      name = "QueryVariable"),
  @Type(
      value = org.tura.model.designer.repository.serialized.mapper.Mappers.class,
      name = "Mappers"),
  @Type(
      value = org.tura.model.designer.repository.serialized.mapper.Version.class,
      name = "Version"),
  @Type(
      value = org.tura.model.designer.repository.serialized.mapper.MappingLayer.class,
      name = "MappingLayer"),
  @Type(
      value = org.tura.model.designer.repository.serialized.mapper.JavaMapper.class,
      name = "JavaMapper"),
  @Type(
      value = org.tura.model.designer.repository.serialized.mapper.JavaPackageMapper.class,
      name = "JavaPackageMapper"),
  @Type(
      value = org.tura.model.designer.repository.serialized.mapper.JavaScriptMapper.class,
      name = "JavaScriptMapper"),
  @Type(
      value = org.tura.model.designer.repository.serialized.mapper.CSSMapper.class,
      name = "CSSMapper"),
  @Type(
      value = org.tura.model.designer.repository.serialized.mapper.RoleMapper.class,
      name = "RoleMapper"),
  @Type(
      value = org.tura.model.designer.repository.serialized.mapper.XMLPackageMapper.class,
      name = "XMLPackageMapper"),
  @Type(
      value = org.tura.model.designer.repository.serialized.mapper.XMLTypeMapper.class,
      name = "XMLTypeMapper"),
  @Type(
      value = org.tura.model.designer.repository.serialized.mapper.MetamodelPackageMapper.class,
      name = "MetamodelPackageMapper"),
  @Type(
      value = org.tura.model.designer.repository.serialized.style.StyleLibrary.class,
      name = "StyleLibrary"),
  @Type(
      value = org.tura.model.designer.repository.serialized.style.StyleSet.class,
      name = "StyleSet")
})
public interface MetaObject {

  public Boolean getAttached();

  public void setAttached(Boolean value);

  public String getSuidMetaObject();

  public void setSuidMetaObject(java.lang.String suidMetaObject);

  public List<AttributeConnector> getOpSourceAttributeConnector();

  public void setOpSourceAttributeConnector(
      java.util.List<AttributeConnector> opSourceAttributeConnector);

  public List<AttributeConnector> getOpTargetAttributeConnector();

  public void setOpTargetAttributeConnector(
      java.util.List<AttributeConnector> opTargetAttributeConnector);

  public List<ContextParameter> getOpRefObjContextParameter();

  public void setOpRefObjContextParameter(
      java.util.List<ContextParameter> opRefObjContextParameter);

  public List<ExpressionPart> getOpObjRefExpressionPart();

  public void setOpObjRefExpressionPart(java.util.List<ExpressionPart> opObjRefExpressionPart);

  public List<ControlPointer> getOpValuePointerControlPointer();

  public void setOpValuePointerControlPointer(
      java.util.List<ControlPointer> opValuePointerControlPointer);

  public List<Selection> getOpDisplayOptionPointerSelection();

  public void setOpDisplayOptionPointerSelection(
      java.util.List<Selection> opDisplayOptionPointerSelection);

  public List<Selection> getOpValueOptionPointerSelection();

  public void setOpValueOptionPointerSelection(
      java.util.List<Selection> opValueOptionPointerSelection);

  public List<OrderBy> getOpRefObjOrderBy();

  public void setOpRefObjOrderBy(java.util.List<OrderBy> opRefObjOrderBy);
}
