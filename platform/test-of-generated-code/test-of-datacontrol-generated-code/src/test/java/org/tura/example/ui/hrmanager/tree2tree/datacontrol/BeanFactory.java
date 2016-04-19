package org.tura.example.ui.hrmanager.tree2tree.datacontrol;

import org.tura.platform.datacontrol.annotations.Selector;
import org.tura.platform.datacontrol.command.base.FactoryInitializeTrigger;
import org.tura.platform.datacontrol.commons.TuraException;

import java.io.Serializable;

import java.util.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Instance;

import javax.inject.Inject;
import javax.inject.Named;

@Named("beanFactoryHrManagerTree2tree")
@ApplicationScoped
public class BeanFactory implements IBeanFactory, Serializable {
    private static final long serialVersionUID = 1L;
    private int section;
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

    public void init() {
        if (section > 0) {
            return;
        }
        section++;
        try {
            FactoryInitializeTrigger trigger = factoryInitializeTrigger.get();
            if (trigger != null) {
                trigger.execute(this);
            }
        } catch (TuraException e) {
            logger.info(e.getMessage());
        }
    }

    public TreeRootCompanyDC getTreeRootCompany() {
        init();
        if (treeRootCompany == null) {
            treeRootCompany = treeRootCompanyproducer.get();
        }
        return treeRootCompany;
    }

    public TreeRootDepartmentDC getTreeRootDepartment()
        throws org.tura.platform.datacontrol.commons.TuraException {
        init();

        try {
            if (treeRootDepartment == null) {
                getTreeRootCompany().getCurrentObject();
                treeRootDepartment = treeRootDepartmentproducer.get();
            }
            return treeRootDepartment;
        } catch (org.tura.platform.datacontrol.commons.TuraException e) {
            logger.info(e.getMessage());
            throw e;
        }
    }
}
