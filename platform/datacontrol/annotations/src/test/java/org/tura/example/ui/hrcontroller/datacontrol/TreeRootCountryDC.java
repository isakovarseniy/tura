package org.tura.example.ui.hrcontroller.datacontrol;

import org.tura.platform.datacontrol.TreeDataControl;
import org.tura.platform.datacontrol.annotations.Dependencies;
import org.tura.platform.datacontrol.annotations.Dependency;
import org.tura.platform.datacontrol.metainfo.DependecyProperty;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import javax.inject.Inject;

@ApplicationScoped
public class TreeRootCountryDC extends TreeDataControl {
    @Inject
    public void setRoot(CountryDC root) {
        super.setRoot(root);
        root.setTreeContext(this);
    }

    @Override
    @Inject
    public void setDependency(
        @Dependencies(dependency =  {
        @Dependency(expression = "beanFactory.department")

    }
    )
    List<DependecyProperty> dependency) {
        this.dependency = dependency;
    }
}
