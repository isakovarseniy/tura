package org.tura.example.ui.hrcontroller.datacontrol;

import org.tura.platform.datacontrol.TreeDataControl;
import org.tura.platform.datacontrol.annotations.Dependencies;
import org.tura.platform.datacontrol.metainfo.DependecyProperty;

import java.io.Serializable;

import java.util.List;

import javax.inject.Inject;

public class TreeRootFilesDC extends TreeDataControl implements Serializable {
    private static final long serialVersionUID = 1L;

    @Inject
    public void setRoot(FilesDC root) {
        super.setRoot(root);
        root.setTreeContext(this);
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
