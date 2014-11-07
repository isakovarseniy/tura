package org.tura.example.ui.hrcontroller.datacontrol;

import org.tura.platform.datacontrol.TreeDataControl;
import org.tura.platform.datacontrol.annotations.Dependencies;
import org.tura.platform.datacontrol.annotations.Dependency;
import org.tura.platform.datacontrol.metainfo.DependecyProperty;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

@Named("treeRootcountry")
public class TreeRootCountryDC extends TreeDataControl {
    @Inject
    public void setRoot(CountryDC root) {
        super.setRoot(root);
    }

    @Override
    @Inject
    public void setDependency(
        @Dependencies(dependency =  {
        @Dependency(expression = "department")

    }
    )
    List<DependecyProperty> dependency) {
        this.dependency = dependency;
    }
}
