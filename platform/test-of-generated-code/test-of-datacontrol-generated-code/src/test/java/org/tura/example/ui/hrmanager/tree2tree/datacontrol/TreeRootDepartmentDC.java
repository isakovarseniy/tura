package org.tura.example.ui.hrmanager.tree2tree.datacontrol;

import org.elsoft.platform.hr.objects.StreetDAO;

import org.tura.platform.datacontrol.ChangeRecordListener;
import org.tura.platform.datacontrol.IDataControl;
import org.tura.platform.datacontrol.TreeDataControl;
import org.tura.platform.datacontrol.annotations.Dependencies;
import org.tura.platform.datacontrol.metainfo.DependecyProperty;

import java.io.Serializable;

import java.util.List;

import javax.inject.Inject;

public class TreeRootDepartmentDC extends TreeDataControl
    implements Serializable, ChangeRecordListener {
    private static final long serialVersionUID = 1L;

    @Override
    public void handleChangeRecord(IDataControl dc, Object newCurrentObject)
        throws org.tura.platform.datacontrol.commons.TuraException {
        if (newCurrentObject instanceof StreetDAO) {
            this.handleChangeMusterCurrentRecordNotification(newCurrentObject);
            return;
        }

        this.handleChangeMusterCurrentRecordNotification(null);
    }

    @Inject
    public void setRoot(DepartmentDC root) {
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
