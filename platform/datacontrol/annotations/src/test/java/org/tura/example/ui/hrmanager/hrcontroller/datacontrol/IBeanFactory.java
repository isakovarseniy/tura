package org.tura.example.ui.hrmanager.hrcontroller.datacontrol;

import org.tura.platform.datacontrol.IDataControl;

public interface IBeanFactory {
    public Long getCmpId();

    public void setCmpId(Long cmpId);

    public String getVar1();

    public void setVar1(String var1);

    public IDataControl getCompany();

    public IDataControl getPopupCompanyDCProvider();

    public IDataControl getTreeRootCountry();

    public IDataControl getDepartment();

    public IDataControl getEmployee();

    public IDataControl getVehicle();

    public IDataControl getTreeRootFiles();
}
