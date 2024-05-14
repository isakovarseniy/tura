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

package org.tura.test;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import org.junit.Ignore;
import org.junit.Test;


import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.hibernate.tool.schema.TargetType;

public class GenerateSchemaTest {

    @Test
    @Ignore
    public  void schemaGeneration() {
        Map<String, String> settings = new HashMap<>();
        settings.put("connection.driver_class", "org.postgresql.Driver");
        settings.put("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
        settings.put("hibernate.connection.url", "jdbc:postgresql://mm-pg:5001/postgres"); //jdbc:postgresql://localhost:5432/postgres
        settings.put("hibernate.connection.username", "postgres");
        settings.put("hibernate.connection.password", "postgres");
        settings.put("hibernate.default_schema", "tura");
        settings.put("show_sql", "true");
 
        MetadataSources metadata = new MetadataSources(
                new StandardServiceRegistryBuilder()
                        .applySettings(settings)
                        .build());
        
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.metabase.MetaObject.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.domain.Domain.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.domain.DomainArtifacts.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.domain.DomainArtifact.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.domain.DomainTypes.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.domain.DomainTypesRepository.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.domain.DomainApplications.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.domain.DomainApplication.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.domain.DomainMappers.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.domain.DomainMapper.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.artifact.ArtifactGroup.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.artifact.TechLeaf.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.artifact.Artifact.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.artifact.GenerationHintWithNickName.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.artifact.ConfigVariableWithNickName.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.artifact.ConfigHashWithNickName.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.artifact.GenerationHint.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.artifact.ConfigVariable.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.artifact.ConfigHash.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.artifact.ModelQuery.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.artifact.QueryParameter.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.artifact.Technology.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.artifact.Option.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.artifact.Categorized.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.artifact.Classifier.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.type.TypeGroup.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.type.PrimitivesGroup.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.type.TypeElement.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.type.Relationship.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.type.References.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.type.Generalization.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.type.TypePointer.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.type.TypePointerObj.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.type.PackagePointer.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.type.Assosiation.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.type.Link.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.type.Attribute.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.type.Operation.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.type.Primitive.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.type.Type.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.type.TypeReference.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.type.Parameter.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.type.ReturnValue.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.type.Enumerator.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.type.EnumAttribute.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.type.MethodPointer.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.type.AttributePointer.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.application.ApplicationGroup.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.application.Application.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.application.ApplicationInfrastructureLayers.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.application.ApplicationInfrastructureLayer.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.application.ApplicationMessageLibraries.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.application.ApplicationLanguages.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.application.ApplicationMessageLibrary.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.application.ApplicationRealms.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.application.ApplicationRealm.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.application.ApplicationStyleLibraries.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.application.ApplicationStyle.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.application.ApplicationUILayer.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.application.ApplicationUIPackage.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.application.ApplicationRecipes.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.application.ApplicationRecipe.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.application.ApplicationMappers.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.application.ApplicationMapper.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.objectmapper.ProcessingStage.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.objectmapper.ObjectMapperGroup.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.objectmapper.ObjectMapper.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.objectmapper.Variable.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.objectmapper.Aggregation.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.objectmapper.OmRelation.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.objectmapper.OperationConnectorRef.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.objectmapper.AttributeConnector.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.objectmapper.OperationConnector.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.objectmapper.CalculatedField.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.permission.Roles.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.permission.SecurityEntity.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.permission.Role.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.permission.Group.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.permission.Group2Group.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.permission.Group2Role.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.permission.Secured.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.permission.GrantAccess.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.permission.SecurityEntityPointer.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.message.MessageLibrary.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.message.Message.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.message.Translation.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.message.Language.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.infra.EnterpriseInfrastructure.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.infra.Datacenter.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.infra.Subsystem.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.infra.InfrastructureLayer.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.infra.InfrastructureConnection.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.infra.InfrastructureComponent.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.infra.Server.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.infra.Router.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.infra.Hub.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.infra.Storage.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.infra.ServerClaster.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.Form.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.FormParameter.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.Views.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.MultiLangLabel.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.CanvasFrame.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.ViewPortHolder.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.DefaultCavas.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.ViewElement.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.PopupCanvas.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.OverlayCanvas.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.Canvas.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.Window.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.MenuDefinition.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.TabCanvas.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.TabPage.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.ViewPort.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.ViewArea.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.ViewPortTrigger.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.ViewInheritance.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.TabPagesInheritance.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.LinkToMessage.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.LinkToLabel.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.ChildrenHolder.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.ContextParameter.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.ContextValue.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.ExpressionPart.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.ContextParameters.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.Context.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.StyleElement.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.NickNamed.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.FlexFields.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.FlexField.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.EnabledUIItem.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.Uielement.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.ItemIcon.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.AreaRef.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.Formatable.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.ControlPointer.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.SourcesPointer.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.InputElement.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.Selection.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.Blockable.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.LayerHolder.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.InputText.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.Password.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.Label.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.MessageElement.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.OutputText.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.CheckBox.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.OptionSelection.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.DropDownSelection.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.SelectManyMenu.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.RadioSelection.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.Image.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.Date.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.Button.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.DataExporter.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.Column.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.Table.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.Menu.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.BlockUI.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.FileUpload.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.FileDownload.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.DataScroller.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.TimeLine.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.FullCalendar.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.Poll.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.DataTemplate.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.WindowRef.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.MenuHolder.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.MenuExtensionRef.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.MenuElement.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.MenuFolder.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.MenuItem.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.MenuExtensionPoint.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.SubMenu.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.ToSubmenu.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.MenuSeparator.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.Tree.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.Controls.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.Trigger.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.PREFormTrigger.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.PREQueryTrigger.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.POSTQueryTrigger.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.PREInsertTrigger.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.PREDeleteTrigger.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.POSTCreateTrigger.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.PREUpdateTrigger.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.CreateTrigger.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.InsertTrigger.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.UpdateTrigger.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.DeleteTrigger.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.SearchTrigger.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.Root.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.FormVariable.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.DataControl.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.ContextParametersObj.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.RelationMapper.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.Orders.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.OrderBy.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.Relation.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.InternalRelation.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.Dependency.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.form.ArtificialField.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.recipe.Recipes.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.recipe.Recipe.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.recipe.ConfigExtension.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.recipe.Recipe2Infrastructure.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.recipe.Infrastructure2Configuration.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.recipe.DeploymentComponent.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.recipe.DeploymentStarStep.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.recipe.UsingMappers.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.recipe.Ingredient.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.recipe.Component.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.recipe.JavaComponent.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.recipe.JavaScriptComponent.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.recipe.Infrastructure.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.recipe.Configuration.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.recipe.ModelMapper.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.recipe.Property.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.recipe.HashProperty.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.recipe.KeyValuePair.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.recipe.MappingTecnologiy.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.recipe.Query.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.recipe.QueryVariable.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.recipe.ArtifactRef.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.mapper.Mappers.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.mapper.Mapper.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.mapper.Version.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.mapper.VersionRef.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.mapper.MappingLayer.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.mapper.TypeMapper.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.mapper.PackageMapper.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.mapper.JavaMapper.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.mapper.JavaPackageMapper.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.mapper.JavaScriptMapper.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.mapper.CSSMapper.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.mapper.RoleMapper.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.mapper.XMLPackageMapper.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.mapper.XMLTypeMapper.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.mapper.MetamodelPackageMapper.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.style.StyleLibrary.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.style.StyleSet.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.style.StylePointer.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.common.HTMLLayerHolder.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.common.Orderable.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.dictionary.ListOfLanguages.class);
        metadata.addAnnotatedClass(org.tura.model.designer.repository.jpa.dictionary.OptionsSet.class);
           
        
        SchemaExport schemaExport = new SchemaExport( );
        schemaExport.setHaltOnError(true);
        schemaExport.setFormat(true);
        schemaExport.setDelimiter(";");
        schemaExport.setOutputFile("db-schema.sql");
        schemaExport.create(EnumSet.of( TargetType.SCRIPT ), metadata.buildMetadata());
        
        
    }

    
}