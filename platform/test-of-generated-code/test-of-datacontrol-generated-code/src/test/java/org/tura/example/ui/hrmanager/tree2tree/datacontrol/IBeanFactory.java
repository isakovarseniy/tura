package org.tura.example.ui.hrmanager.tree2tree.datacontrol;

import org.tura.platform.datacontrol.IDataControl;

public interface IBeanFactory {
    public String TREE2 = "tura5a983cdf_6679_42f2_b259_11e9803af1cd";

    public IDataControl getTreeRootCompany()
        throws org.tura.platform.datacontrol.commons.TuraException;

    public IDataControl getTreeRootDepartment()
        throws org.tura.platform.datacontrol.commons.TuraException;
}
