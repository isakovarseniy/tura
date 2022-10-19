/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2022 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.tura.sirius.diagram.producer.tura;

import org.eclipse.sirius.tree.description.TreeItemMapping;
import org.tura.sirius.diagram.producer.tura.config.items.DiagramConfigProvider;
import org.tura.sirius.diagram.producer.tura.config.items.Table_Message_LanguageConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.artifact.ConfigHashConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.artifact.ConfigHashsConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.artifact.ConfigVariableCongigurator;
import org.tura.sirius.diagram.producer.tura.config.items.artifact.ConfigurationVariablesConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.artifact.GenerationHintConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.artifact.GenerationHintsConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.artifact.TechLeafConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.artifact.TecnologiesTreeConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.domain.DomainApplicationConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.domain.DomainApplicationsConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.domain.DomainArtifactConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.domain.DomainArtifactsConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.domain.DomainMapperConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.domain.DomainMappersConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.domain.DomainTypesConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.domain.DomainTypesRepositoryConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.domain.ObjectMapperGroupConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.message.MessageConfiguration;
import org.tura.sirius.diagram.producer.tura.config.items.message.TranclationConfiguration;
import org.tura.sirius.diagram.producer.tura.config.items.style.StyleLibraryConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.style.StyleSetConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.type.PrimitiveConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.type.PrimitivesGroupConfigurator;
import org.tura.sirius.diagram.producer.tura.config.mappers.CSSMapperConfigurator;
import org.tura.sirius.diagram.producer.tura.config.mappers.CSSMappersConfigurator;
import org.tura.sirius.diagram.producer.tura.config.mappers.JavaPackageMapperConfigurator;
import org.tura.sirius.diagram.producer.tura.config.mappers.JavaPackageMappersConfigurator;
import org.tura.sirius.diagram.producer.tura.config.mappers.JavaScriptMapperConfigurator;
import org.tura.sirius.diagram.producer.tura.config.mappers.JavaScriptMappersConfigurator;
import org.tura.sirius.diagram.producer.tura.config.mappers.JavaTypeMapperConfigurator;
import org.tura.sirius.diagram.producer.tura.config.mappers.JavaTypeMappersConfigurator;
import org.tura.sirius.diagram.producer.tura.config.mappers.RoleMapperConfigurator;
import org.tura.sirius.diagram.producer.tura.config.mappers.RoleMappersConfigurator;
import org.tura.sirius.diagram.producer.tura.config.mappers.XMLPackageMapperConfigurator;
import org.tura.sirius.diagram.producer.tura.config.mappers.XMLPackageMappersConfigurator;
import org.tura.sirius.diagram.producer.tura.config.mappers.XMLTypeMapperConfigurator;
import org.tura.sirius.diagram.producer.tura.config.mappers.XMLTypeMappersConfigurator;
import org.tura.sirius.diagram.producer.tura.config.tool.MessageTableTool;
import org.tura.sirius.diagram.producer.tura.validation.CanvasValidation;
import org.tura.sirius.diagram.producer.tura.validation.DataControlValidation;
import org.tura.sirius.diagram.producer.tura.validation.RecipeValidatioin;
import org.tura.sirius.diagram.producer.tura.validation.TypeValidation;
import org.tura.sirius.diagram.producer.tura.validation.ViewValidation;
import org.tura.sirius.dsl.config.ConfigProvider;
import org.tura.sirius.dsl.config.ObjectWrapper;
import org.tura.sirius.dsl.diagram.tContainer;
import org.tura.sirius.dsl.diagram.tDiagram;
import org.tura.sirius.dsl.diagram.tNode;
import org.tura.sirius.dsl.table.tTableDiagram;
import org.tura.sirius.dsl.treediagram.tTreeDiagram;
import org.tura.sirius.dsl.treediagram.tTreeItem;
import org.tura.sirius.dsl.viewpoint.tRoot;
import org.tura.sirius.dsl.viewpoint.tViewPoint;

public class TuraDiagram {
    public static void main(String[] args) {
        tTableDiagram messageTableDiagram = null;
        tTreeDiagram treeNavigatorDiagram = null;
        tRoot root = new tRoot("tura", (ConfigProvider)new DiagramConfigProvider());
        tViewPoint viewPoint = root.addViewPoint("Domain tree", "domain");
        viewPoint.addValidationRules(TypeValidation.getRules());
        viewPoint.addValidationRules(DataControlValidation.getRules());
        viewPoint.addValidationRules(ViewValidation.getRules());
        viewPoint.addValidationRules(CanvasValidation.getRules());
        viewPoint.addValidationRules(RecipeValidatioin.getRules());
        messageTableDiagram = viewPoint.addTableDiagram("Message Library", "message.MessageLibrary");
        messageTableDiagram.addChild(MessageConfiguration.create().addChild(Table_Message_LanguageConfigurator.create()));
        messageTableDiagram.addChild(TranclationConfiguration.create());
        messageTableDiagram.addCreationTool(MessageTableTool.getCreateTools());
        viewPoint.addDiagram("Type package", "type.TypeGroup").addDefaultLayer().addChildren(new TypeDiagram().getChildrens());
        viewPoint.addDiagram("Artifact package", "artifact.ArtifactGroup").addDefaultLayer().addChildren(new ArtifactDiagram().getChildrens());
        viewPoint.addDiagram("Security rules set", "application.ApplicationRealm").addDefaultLayer().addChildren(new PermissionsDiagram().getChildrens());
        viewPoint.addDiagram("Infrastructure diagram", "infrastructure.EnterpriseInfrastructure").addDefaultLayer().addChildren(new InfrastructureDiagram().getChildrens());
        tDiagram recipeDiag = viewPoint.addDiagram("Recipe diagram", "recipe.Recipes");
        recipeDiag.addDefaultLayer().addChildren(new RecipeDiagram().getChildrens());
        viewPoint.addTreeDiagram("Style library", "application.ApplicationStyle").addChild(StyleLibraryConfigurator.create().addChild(StyleSetConfigurator.create()));
        viewPoint.addDiagram("Data Control", "form.Controls").addDefaultLayer().addChildren(new DataControlDiagram().getChildrens());
        viewPoint.addDiagram("Menu Definition", "form.MenuDefinition").addDefaultLayer().addChildren(new MenuDiagram().getChildrens());
        viewPoint.addDiagram("Deployment sequence", "recipe.Recipe").addDefaultLayer().addChildren(new DeploymentDiagram().getChildrens());
        tTreeDiagram treeDiagram = viewPoint.addTreeDiagram("Mapping diagram", "application.ApplicationMapper");
        treeDiagram.addChild(JavaTypeMappersConfigurator.create().addChild(JavaTypeMapperConfigurator.create()));
        treeDiagram.addChild(JavaPackageMappersConfigurator.create().addChild(JavaPackageMapperConfigurator.create()));
        treeDiagram.addChild(JavaScriptMappersConfigurator.create().addChild(JavaScriptMapperConfigurator.create()));
        treeDiagram.addChild(CSSMappersConfigurator.create().addChild(CSSMapperConfigurator.create()));
        treeDiagram.addChild(RoleMappersConfigurator.create().addChild(RoleMapperConfigurator.create()));
        treeDiagram.addChild(XMLPackageMappersConfigurator.create().addChild(XMLPackageMapperConfigurator.create()));
        treeDiagram.addChild(XMLTypeMappersConfigurator.create().addChild(XMLTypeMapperConfigurator.create()));
        treeDiagram = viewPoint.addTreeDiagram("Technologies diagram", "domain.DomainArtifacts");
        treeDiagram.addChild(TecnologiesTreeConfigurator.create().addChild(TechLeafConfigurator.create().addChild(GenerationHintsConfigurator.create().addChild(GenerationHintConfigurator.create())).addChild(ConfigurationVariablesConfigurator.create().addChild(ConfigVariableCongigurator.create())).addChild(ConfigHashsConfigurator.create().addChild(ConfigHashConfigurator.create()))));
        ObjectWrapper wrapper = (ObjectWrapper)tRoot.context.get("Technology" + tTreeItem.class.getName());
        TreeItemMapping mapper = (TreeItemMapping)wrapper.getWrapedObject();
        if (mapper == null) {
            throw new RuntimeException("Tool mapping is null");
        }
        mapper.getReusedTreeItemMappings().add(mapper);
        tDiagram tdiagram = viewPoint.addDiagram("Views diagram", "form.Views");
        tdiagram.addDefaultLayer().addChildren(new ViewsDiagram().getChildrens());
        viewPoint.addDiagram("Canvas diagram", "form.ViewArea").addDefaultLayer().addChildren(new CanvasDiagram().getChildrens());
        tdiagram.addCreationDiagramNavigation("Canvas diagram", new String[]{"ViewArea0" + tNode.class.getName(), "ViewArea1" + tNode.class.getName(), "ViewArea2" + tNode.class.getName(), "ViewArea3" + tNode.class.getName(),"ViewArea4" + tNode.class.getName()}, "Default");
        tdiagram.addCreationDiagramNavigation("Menu Definition", new String[]{"MenuDefinition" + tNode.class.getName()}, "Default");
        recipeDiag.addCreationDiagramNavigation("Deployment sequence", new String[]{"Recipe" + tContainer.class.getName()}, "Default");
        treeNavigatorDiagram = viewPoint.addJavaExtension("org.tura.metamodel.sirius.diagram.designer.service.DiagramService").addTreeDiagram("Domain tree", "domain.Domain");
        treeNavigatorDiagram.addChild(DomainArtifactsConfigurator.create().addCreationTreeNavigation("Technologies diagram", "Domain tree").addChild(DomainArtifactConfigurator.create().addChildren(() -> new TuraArtifact().getConfig())));
        treeNavigatorDiagram.addChild(DomainApplicationsConfigurator.create().addChild(DomainApplicationConfigurator.create().addChildren(() -> new TuraApplicaton().getConfig())));
        viewPoint.addDiagram("ObjectMapper diagram", "objectmapper.ObjectMapperGroup").addDefaultLayer().addChildren(new ObjectMapperDiagram().getChildrens());
        treeNavigatorDiagram.addChild(DomainMappersConfigurator.create().addChild(DomainMapperConfigurator.create().addChild(ObjectMapperGroupConfigurator.create().addCreationDiagramNavigation("ObjectMapper diagram",
				"Domain tree"))));
        treeNavigatorDiagram.addChild(DomainTypesConfigurator.create().addChild(DomainTypesRepositoryConfigurator.create().addChildren(() -> new TuraTypeRepository().getConfig())).addChild(PrimitivesGroupConfigurator.create().addChild(PrimitiveConfigurator.create())));
        root.save("tura");
    }
}
