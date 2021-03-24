/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   http://sourceforge.net/p/tura/wiki/Home/
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.tura.sirius.diagram.producer.tura;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.sirius.diagram.description.ContainerMapping;
import org.tura.sirius.diagram.producer.tura.config.items.form.BlockUIConfiguration;
import org.tura.sirius.diagram.producer.tura.config.items.form.ButtonConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.form.CheckBoxConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.form.ColumnConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.form.ColumnElementConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.form.DataExporterConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.form.DataScrollerConfiguration;
import org.tura.sirius.diagram.producer.tura.config.items.form.DataTemplateConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.form.DateConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.form.DropDownSelectionConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.form.FileDownloadConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.form.FileUploadConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.form.FullCalendarConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.form.ImageConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.form.InputTextConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.form.LabelConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.form.LayerHolderConfiguration;
import org.tura.sirius.diagram.producer.tura.config.items.form.LayerHolderinDataScroller;
import org.tura.sirius.diagram.producer.tura.config.items.form.LayerHolderinTableColumn;
import org.tura.sirius.diagram.producer.tura.config.items.form.LayerHolderinTimeLine;
import org.tura.sirius.diagram.producer.tura.config.items.form.LayerHolderinTreeColumn;
import org.tura.sirius.diagram.producer.tura.config.items.form.LinkToLabelConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.form.LinkToMessageConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.form.MenuConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.form.MessageElementConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.form.OutputTextConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.form.PasswordConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.form.PollConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.form.RadioSelectionConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.form.SelectManyMenuConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.form.TableColumnsConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.form.TableConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.form.TimeLineConfiguration;
import org.tura.sirius.diagram.producer.tura.config.items.form.TreeColumnsConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.form.TreeConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.form.WindowRefConfigurator;
import org.tura.sirius.dsl.config.ObjectWrapper;
import org.tura.sirius.dsl.diagram.tContainer;
import org.tura.sirius.dsl.diagram.tToolSection;
import org.tura.sirius.dsl.viewpoint.tRoot;

public class CanvasDiagram {
    public static int SUFFIX_LIMIT = 8;
    
    public List<Object> getChildrens() {
        ArrayList<Object> list = new ArrayList<Object>();

        tContainer cnt = LayerHolderConfiguration.create()
                .addChild(ButtonConfigurator.create("0"))
                .addChild(CheckBoxConfigurator.create("0"))
                .addChild(DateConfigurator.create("0"))
                .addChild(DropDownSelectionConfigurator.create("0"))
                .addChild(ImageConfigurator.create("0"))
                .addChild(InputTextConfigurator.create("0"))
                .addChild(OutputTextConfigurator.create("0"))
                .addChild(PasswordConfigurator.create("0"))
                .addChild(LabelConfigurator.create("0"))
                .addChild(FileUploadConfigurator.create("0"))
                .addChild(FileDownloadConfigurator.create("0"))
                .addChild(WindowRefConfigurator.create("0"))
                .addChild(RadioSelectionConfigurator.create("0"))
                .addChild(DataExporterConfigurator.create("0"))
                .addChild(SelectManyMenuConfigurator.create("0"))
                .addChild(DataTemplateConfigurator.create("0"))
                
                .addChild(
                        TableConfigurator.create()
                                .addChild(
                                        TableColumnsConfigurator.create()
                                                .addChild(ColumnConfigurator.create("Table")
                                                        .addChild(ColumnElementConfigurator.create()
                                                                .addChild(LayerHolderinTableColumn.create()
                                                                        .addChild(ButtonConfigurator.create("1"))
                                                                        .addChild(CheckBoxConfigurator.create("1"))
                                                                        .addChild(DateConfigurator.create("1"))
                                                                        .addChild(DropDownSelectionConfigurator
                                                                                .create("1"))
                                                                        .addChild(ImageConfigurator.create("1"))
                                                                        .addChild(InputTextConfigurator.create("1"))
                                                                        .addChild(OutputTextConfigurator.create("1"))
                                                                        .addChild(PasswordConfigurator.create("1"))
                                                                        .addChild(LabelConfigurator.create("1"))
                                                                        .addChild(FileUploadConfigurator.create("1"))
                                                                        .addChild(FileDownloadConfigurator.create("1"))
                                                                        .addChild(WindowRefConfigurator.create("1"))
                                                                        .addChild(RadioSelectionConfigurator.create("1"))
                                                                        .addChild(DataExporterConfigurator.create("1"))
                                                                        .addChild(SelectManyMenuConfigurator.create("1"))
                                                                        .addChild(DataTemplateConfigurator.create("1"))
                                                                        
                                                                        )

                                                                .addChild(ButtonConfigurator.create("2","feature:element"))
                                                                .addChild(CheckBoxConfigurator.create("2","feature:element"))
                                                                .addChild(DateConfigurator.create("2", "feature:element"))
                                                                .addChild(DropDownSelectionConfigurator.create("2","feature:element"))
                                                                .addChild(ImageConfigurator.create("2","feature:element"))
                                                                .addChild(InputTextConfigurator.create("2","feature:element"))
                                                                .addChild(OutputTextConfigurator.create("2","feature:element"))
                                                                .addChild(PasswordConfigurator.create("2","feature:element"))
                                                                .addChild(LabelConfigurator.create("2","feature:element"))
                                                                .addChild(FileUploadConfigurator.create("2","feature:element"))
                                                                .addChild(FileDownloadConfigurator.create("2","feature:element"))
                                                                .addChild(WindowRefConfigurator.create("2","feature:element"))
                                                                .addChild(RadioSelectionConfigurator.create("2","feature:element"))
                                                                .addChild(DataExporterConfigurator.create("2","feature:element"))
                                                                .addChild(SelectManyMenuConfigurator.create("2","feature:element"))
                                                                .addChild(DataTemplateConfigurator.create("2","feature:element"))
                                                                

                                                                ))))

                .addChild(
                        TreeConfigurator.create()
                                .addChild(
                                        TreeColumnsConfigurator.create()
                                                .addChild(ColumnConfigurator.create("Tree")
                                                        .addChild(ColumnElementConfigurator.create()
                                                                .addChild(LayerHolderinTreeColumn.create()
                                                                        .addChild(ButtonConfigurator.create("3"))
                                                                        .addChild(CheckBoxConfigurator.create("3"))
                                                                        .addChild(DateConfigurator.create("3"))
                                                                        .addChild(DropDownSelectionConfigurator.create("3"))
                                                                        .addChild(ImageConfigurator.create("3"))
                                                                        .addChild(InputTextConfigurator.create("3"))
                                                                        .addChild(OutputTextConfigurator.create("3"))
                                                                        .addChild(PasswordConfigurator.create("3"))
                                                                        .addChild(LabelConfigurator.create("3"))
                                                                        .addChild(FileUploadConfigurator.create("3"))
                                                                        .addChild(FileDownloadConfigurator.create("3"))
                                                                        .addChild(WindowRefConfigurator.create("3"))
                                                                        .addChild(RadioSelectionConfigurator.create("3"))
                                                                        .addChild(DataExporterConfigurator.create("3"))
                                                                        .addChild(SelectManyMenuConfigurator.create("3"))
                                                                        .addChild(DataTemplateConfigurator.create("3"))
                                                                        
                                                                        )

                                                                .addChild(ButtonConfigurator.create("4","feature:element"))
                                                                .addChild(CheckBoxConfigurator.create("4","feature:element"))
                                                                .addChild(DateConfigurator.create("4", "feature:element"))
                                                                .addChild(DropDownSelectionConfigurator.create("4","feature:element"))
                                                                .addChild(ImageConfigurator.create("4","feature:element"))
                                                                .addChild(InputTextConfigurator.create("4","feature:element"))
                                                                .addChild(OutputTextConfigurator.create("4","feature:element"))
                                                                .addChild(PasswordConfigurator.create("4","feature:element"))
                                                                .addChild(LabelConfigurator.create("4","feature:element"))
                                                                .addChild(FileUploadConfigurator.create("4","feature:element"))
                                                                .addChild(FileDownloadConfigurator.create("4","feature:element"))
                                                                .addChild(WindowRefConfigurator.create("4","feature:element"))
                                                                .addChild(RadioSelectionConfigurator.create("4","feature:element"))
                                                                .addChild(DataExporterConfigurator.create("4","feature:element"))
                                                                .addChild(SelectManyMenuConfigurator.create("4","feature:element"))
                                                                .addChild(DataTemplateConfigurator.create("4","feature:element"))
                                                                
                                                                ))))

                .addChild(MenuConfigurator.create()).addChild(MessageElementConfigurator.create())
                .addChild(PollConfigurator.create())
                .addChild(FullCalendarConfigurator.create())
                .addChild(DataScrollerConfiguration.create()
                        .addChild(ButtonConfigurator.create("5"))
                        .addChild(CheckBoxConfigurator.create("5"))
                        .addChild(DateConfigurator.create("5"))
                        .addChild(DropDownSelectionConfigurator.create("5"))
                        .addChild(ImageConfigurator.create("5"))
                        .addChild(InputTextConfigurator.create("5"))
                        .addChild(OutputTextConfigurator.create("5"))
                        .addChild(PasswordConfigurator.create("5"))
                        .addChild(LabelConfigurator.create("5"))
                        .addChild(FileUploadConfigurator.create("5"))
                        .addChild(FileDownloadConfigurator.create("5"))
                        .addChild(WindowRefConfigurator.create("5"))
                        .addChild(RadioSelectionConfigurator.create("5"))
                        .addChild(DataExporterConfigurator.create("5"))
                        .addChild(SelectManyMenuConfigurator.create("5"))
                        .addChild(DataTemplateConfigurator.create("5"))
                        
                        .addChild(LayerHolderinDataScroller.create()
                            .addChild(ButtonConfigurator.create("6"))
                            .addChild(CheckBoxConfigurator.create("6"))
                            .addChild(DateConfigurator.create("6"))
                            .addChild(DropDownSelectionConfigurator.create("6"))
                            .addChild(ImageConfigurator.create("6"))
                            .addChild(InputTextConfigurator.create("6"))
                            .addChild(OutputTextConfigurator.create("6"))
                            .addChild(PasswordConfigurator.create("6"))
                            .addChild(LabelConfigurator.create("6"))
                            .addChild(FileUploadConfigurator.create("6"))
                            .addChild(FileDownloadConfigurator.create("6"))
                            .addChild(WindowRefConfigurator.create("6"))
                            .addChild(RadioSelectionConfigurator.create("6"))
                            .addChild(DataExporterConfigurator.create("6"))
                            .addChild(SelectManyMenuConfigurator.create("6"))
                            .addChild(DataTemplateConfigurator.create("6"))
                            
                          )
                        )
                
                .addChild(TimeLineConfiguration.create()
                        .addChild(LayerHolderinTimeLine.create()
                            .addChild(ButtonConfigurator.create("7"))
                            .addChild(CheckBoxConfigurator.create("7"))
                            .addChild(DateConfigurator.create("7"))
                            .addChild(DropDownSelectionConfigurator.create("7"))
                            .addChild(ImageConfigurator.create("7"))
                            .addChild(InputTextConfigurator.create("7"))
                            .addChild(OutputTextConfigurator.create("7"))
                            .addChild(PasswordConfigurator.create("7"))
                            .addChild(LabelConfigurator.create("7"))
                            .addChild(FileUploadConfigurator.create("7"))
                            .addChild(FileDownloadConfigurator.create("7"))
                            .addChild(WindowRefConfigurator.create("7"))
                            .addChild(RadioSelectionConfigurator.create("7"))
                            .addChild(DataExporterConfigurator.create("7"))
                            .addChild(SelectManyMenuConfigurator.create("7"))
                            .addChild(DataTemplateConfigurator.create("7"))
                            
                          )
                        )                
                .addChild(BlockUIConfiguration.create()
                        .addChild(ImageConfigurator.create("8"))
                        );

        list.add(cnt);

        list.add(LinkToLabelConfigurator.create());
        list.add(LinkToMessageConfigurator.create());

        tToolSection nodeToolSection = new tToolSection("Nodes");
        list.add(nodeToolSection);
        nodeToolSection.addChildrens(LayerHolderConfiguration.getTools());
        nodeToolSection.addChildrens(ButtonConfigurator.getTools());
        nodeToolSection.addChildrens(CheckBoxConfigurator.getTools());
        nodeToolSection.addChildrens(DateConfigurator.getTools());
        nodeToolSection.addChildrens(DropDownSelectionConfigurator.getTools());
        nodeToolSection.addChildrens(ImageConfigurator.getTools());
        nodeToolSection.addChildrens(InputTextConfigurator.getTools());
        nodeToolSection.addChildrens(OutputTextConfigurator.getTools());
        nodeToolSection.addChildrens(PasswordConfigurator.getTools());
        nodeToolSection.addChildrens(LabelConfigurator.getTools());
        nodeToolSection.addChildrens(TableConfigurator.getTools());
        nodeToolSection.addChildrens(ColumnConfigurator.getTools());
        nodeToolSection.addChildrens(TreeConfigurator.getTools());
        nodeToolSection.addChildrens(MenuConfigurator.getTools());
        nodeToolSection.addChildrens(FullCalendarConfigurator.getTools());
        nodeToolSection.addChildrens(MessageElementConfigurator.getTools());
        nodeToolSection.addChildrens(PollConfigurator.getTools());
        nodeToolSection.addChildrens(BlockUIConfiguration.getTools());
        nodeToolSection.addChildrens(FileUploadConfigurator.getTools());
        nodeToolSection.addChildrens(FileDownloadConfigurator.getTools());
        nodeToolSection.addChildrens(WindowRefConfigurator.getTools());
        nodeToolSection.addChildrens(DataScrollerConfiguration.getTools());
        nodeToolSection.addChildrens(TimeLineConfiguration.getTools());
        nodeToolSection.addChildrens(RadioSelectionConfigurator.getTools());
        nodeToolSection.addChildrens(DataExporterConfigurator.getTools());
        nodeToolSection.addChildrens(SelectManyMenuConfigurator.getTools());
        nodeToolSection.addChildrens(DataTemplateConfigurator.getTools());
        
        tToolSection edgeToolSection = new tToolSection("Connections");
        list.add(edgeToolSection);

        edgeToolSection.addChildrens(LinkToLabelConfigurator.getTools());
        edgeToolSection.addChildrens(LinkToMessageConfigurator.getTools());

        ObjectWrapper wrapper = (ObjectWrapper) tRoot.context.get("LayerHolder" + tContainer.class.getName());

        ContainerMapping mapper = (ContainerMapping) wrapper.getWrapedObject();
        if (mapper == null) {
            throw new RuntimeException("Tool mapping is null");
        }
        mapper.getReusedContainerMappings().add(mapper);

        wrapper = (ObjectWrapper) tRoot.context.get("LayerHolderinTableColumn" + tContainer.class.getName());

        mapper = (ContainerMapping) wrapper.getWrapedObject();
        if (mapper == null) {
            throw new RuntimeException("Tool mapping is null");
        }
        mapper.getReusedContainerMappings().add(mapper);

        wrapper = (ObjectWrapper) tRoot.context.get("LayerHolderinTreeColumn" + tContainer.class.getName());

        mapper = (ContainerMapping) wrapper.getWrapedObject();
        if (mapper == null) {
            throw new RuntimeException("Tool mapping is null");
        }
        mapper.getReusedContainerMappings().add(mapper);

        
        wrapper = (ObjectWrapper) tRoot.context.get("LayerHolderinDataScroller" + tContainer.class.getName());

        mapper = (ContainerMapping) wrapper.getWrapedObject();
        if (mapper == null) {
            throw new RuntimeException("Tool mapping is null");
        }
        mapper.getReusedContainerMappings().add(mapper);

        
        return list;
    }
}