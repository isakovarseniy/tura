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

    public CompanyDC getCompany() {
        return (CompanyDC) elResolver.getValue("company");
    }

    public TreeRootCountryDC getTreeRootCountry() {
        try {
            CompanyDC master = getCompany();
            return (TreeRootCountryDC) master.getCompany2Country();
        } catch (TuraException e) {
            return null;
        }
    }

    public DepartmentDC getDepartment() {
        try {
            getTreeRootCountry().getCurrentObject();
            return (DepartmentDC) elResolver.getValue("department");
        } catch (TuraException e) {
            return null;
        }
    }

    public EmployeeDC getEmployee() {
        try {
            DepartmentDC master = getDepartment();
            return (EmployeeDC) master.getDepartment2Employee();
        } catch (TuraException e) {
            return null;
        }
    }

    public VehicleDC getVehicle() {
        try {
            DepartmentDC master = getDepartment();
            return (VehicleDC) master.getDepartment2Vehicle();
        } catch (TuraException e) {
            return null;
        }
    }

    public TreeRootFilesDC getTreeRootFiles() {
        try {
            EmployeeDC master = getEmployee();
            return (TreeRootFilesDC) master.getEmployee2Files();
        } catch (TuraException e) {
            return null;
        }
    }
}
