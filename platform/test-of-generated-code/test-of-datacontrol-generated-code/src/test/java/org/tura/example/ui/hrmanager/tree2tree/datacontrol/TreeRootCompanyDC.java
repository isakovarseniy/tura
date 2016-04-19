package org.tura.example.ui.hrmanager.tree2tree.datacontrol;

import org.tura.platform.datacontrol.TreeDataControl;
import org.tura.platform.datacontrol.annotations.Dependencies;
import org.tura.platform.datacontrol.annotations.Dependency;
import org.tura.platform.datacontrol.metainfo.DependecyProperty;

import java.io.Serializable;

import java.util.List;

import javax.inject.Inject;

public class TreeRootCompanyDC extends TreeDataControl implements Serializable {
    private static final long serialVersionUID = 1L;

    @Inject
    public void setRoot(CompanyDC root) {
        super.setRoot(root);
        root.setTreeContext(this);
    }

    @Override
    @Inject
    public void setDependency(
        @Dependencies(dependency =  {
        @Dependency(expression = "#{beanFactoryHrManagerTree2tree.treeRootDepartment}")

    }
    )
    List<DependecyProperty> dependency) {
        this.dependency = dependency;
    }
}
