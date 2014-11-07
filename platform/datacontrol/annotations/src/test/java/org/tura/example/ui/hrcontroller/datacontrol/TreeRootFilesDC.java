package org.tura.example.ui.hrcontroller.datacontrol;

import org.tura.platform.datacontrol.TreeDataControl;
import org.tura.platform.datacontrol.annotations.Dependencies;
import org.tura.platform.datacontrol.metainfo.DependecyProperty;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

@Named("treeRootfiles")
public class TreeRootFilesDC extends TreeDataControl {
    @Inject
    public void setRoot(FilesDC root) {
        super.setRoot(root);
    }

    @Override
    @Inject
    public void setDependency(
        @Dependencies(dependency =  {
    }
    )
    List<DependecyProperty> dependency) {
        this.dependency = dependency;
    }
}
