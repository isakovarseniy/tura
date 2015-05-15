package org.tura.example.ui.hrmanager.tree2tree.datacontrol;

import org.tura.platform.datacontrol.IDataControl;

public interface IBeanFactory {
    public IDataControl getTreeRootCompany();

    public IDataControl getTreeRootDepartment();
}
