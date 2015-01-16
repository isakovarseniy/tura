package org.tura.example.ui.hrcontroller.datacontrol;

import org.tura.platform.datacontrol.commons.TuraException;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Instance;

import javax.inject.Inject;
import javax.inject.Named;

@Named("beanFactory")
@ApplicationScoped
public class BeanFactory implements Serializable {
    private static final long serialVersionUID = 1L;
    @Inject
    private Instance<CompanyDC> companyproducer;
    private CompanyDC company;
    @Inject
    private Instance<DepartmentDC> departmentproducer;
    private DepartmentDC department;

    public CompanyDC getCompany() {
        if (company == null) {
            company = companyproducer.get();
        }
        return company;
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
            if (department == null) {
                getTreeRootCountry().getCurrentObject();
                department = departmentproducer.get();
            }
            return department;
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
