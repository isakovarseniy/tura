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
        CompanyDC master = getCompanyDC();
        return (TreeRootCountryDC) master.getCompany2Country();

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
        DepartmentDC master = getDepartmentDC();
        return (EmployeeDC) master.getDepartment2Employee();

    }

    public VehicleDC getVehicleDC() {
        DepartmentDC master = getDepartmentDC();
        return (VehicleDC) master.getDepartment2Vehicle();

    }

    public TreeRootFilesDC getTreeRootFilesDC() {
        EmployeeDC master = getEmployeeDC();
        return (TreeRootFilesDC) master.getEmployee2Files();

    }
}
