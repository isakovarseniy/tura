package org.tura.example.ui.hrcontroller.datacontrol;

import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.datacontrol.commons.TuraException;

import javax.enterprise.context.ApplicationScoped;

import javax.inject.Inject;
import javax.inject.Named;

@Named("beanFactory")
@ApplicationScoped
public class BeanFactory {
    @Inject
    ELResolver elResolver;

    public CompanyDC getCompanyDC() {
        return (CompanyDC) elResolver.getValue("company");
    }

    public TreeRootCountryDC getTreeRootCountryDC() {
        try {
            CompanyDC master = getCompanyDC();
            return (TreeRootCountryDC) master.getCompany2Country();
        } catch (TuraException e) {
            return null;
        }
    }

    public DepartmentDC getDepartmentDC() {
        try {
            getTreeRootCountryDC().getCurrentObject();
            return (DepartmentDC) elResolver.getValue("department");
        } catch (TuraException e) {
            return null;
        }
    }

    public EmployeeDC getEmployeeDC() {
        try {
            DepartmentDC master = getDepartmentDC();
            return (EmployeeDC) master.getDepartment2Employee();
        } catch (TuraException e) {
            return null;
        }
    }

    public VehicleDC getVehicleDC() {
        try {
            DepartmentDC master = getDepartmentDC();
            return (VehicleDC) master.getDepartment2Vehicle();
        } catch (TuraException e) {
            return null;
        }
    }

    public TreeRootFilesDC getTreeRootFilesDC() {
        try {
            EmployeeDC master = getEmployeeDC();
            return (TreeRootFilesDC) master.getEmployee2Files();
        } catch (TuraException e) {
            return null;
        }
    }
}
