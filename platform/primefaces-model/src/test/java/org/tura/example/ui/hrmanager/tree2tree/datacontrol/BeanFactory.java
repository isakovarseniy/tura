/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2015, Arseniy Isakov
 *
 * This project includes software developed by Arseniy Isakov
 * http://sourceforge.net/p/tura/wiki/Home/
 *
 * Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.tura.example.ui.hrmanager.tree2tree.datacontrol;

import org.tura.platform.datacontrol.annotations.Selector;
import org.tura.platform.datacontrol.command.FactoryInitializeTrigger;
import org.tura.platform.datacontrol.commons.TuraException;

import java.io.Serializable;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Instance;

import javax.inject.Inject;
import javax.inject.Named;

@Named("beanFactoryHrManagerTree2tree")
@ApplicationScoped
public class BeanFactory implements IBeanFactory, Serializable {
    private static final long serialVersionUID = 1L;
    @Inject
    private transient Logger logger;
    @Inject
    @Selector("hrmanager.tree2tree")
    private Instance<FactoryInitializeTrigger> factoryInitializeTrigger;
    @javax.inject.Inject
    private Instance<TreeRootCompanyDC> treeRootCompanyproducer;
    private TreeRootCompanyDC treeRootCompany;
    @javax.inject.Inject
    private Instance<TreeRootDepartmentDC> treeRootDepartmentproducer;
    private TreeRootDepartmentDC treeRootDepartment;

    @PostConstruct
    public void init() {
        try {
            FactoryInitializeTrigger trigger = factoryInitializeTrigger.get();
            if (trigger != null) {
                trigger.execute(this);
            }
        } catch (TuraException e) {
            logger.fine(e.getMessage());
        }
    }

    public TreeRootCompanyDC getTreeRootCompany() {
        if (treeRootCompany == null) {
            treeRootCompany = treeRootCompanyproducer.get();
        }
        return treeRootCompany;
    }

    public TreeRootDepartmentDC getTreeRootDepartment() {
        try {
            if (treeRootDepartment == null) {
                getTreeRootCompany().getCurrentObject();
                treeRootDepartment = treeRootDepartmentproducer.get();
            }
            return treeRootDepartment;
        } catch (org.tura.platform.datacontrol.commons.TuraException e) {
            logger.fine(e.getMessage());
            return null;
        }
    }
}
