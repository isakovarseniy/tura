package org.tura.example.ui.hrmanager.hrcontroller.datacontrol;

import org.tura.platform.datacontrol.annotations.Selector;
import org.tura.platform.datacontrol.command.FactoryInitializeTrigger;
import org.tura.platform.datacontrol.commons.TuraException;

import java.io.Serializable;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Instance;

import javax.inject.Inject;
import javax.inject.Named;

@Named("beanFactoryHrManagerHRController")
@ApplicationScoped
public class BeanFactory implements IBeanFactory, Serializable {
    private static final long serialVersionUID = 1L;
    @Inject
    private transient Logger logger;
    private Long cmpId;
    private String var1;
    @Inject
    @Selector("hrmanager.hrcontroller")
    private Instance<FactoryInitializeTrigger> factoryInitializeTrigger;
    @javax.inject.Inject
    private Instance<CompanyDC> companyproducer;
    private CompanyDC company;
    @javax.inject.Inject
    private Instance<PopupCompanyDCProviderDC> popupCompanyDCProviderproducer;
    private PopupCompanyDCProviderDC popupCompanyDCProvider;
    @javax.inject.Inject
    private Instance<DepartmentDC> departmentproducer;
    private DepartmentDC department;

    public Long getCmpId() {
        return this.cmpId;
    }

    public void setCmpId(Long cmpId) {
        this.cmpId = cmpId;
    }

    public String getVar1() {
        return this.var1;
    }

    public void setVar1(String var1) {
        this.var1 = var1;
    }

    @PostConstruct
    public void init() {
        try {
            FactoryInitializeTrigger trigger = factoryInitializeTrigger.get();
            if (trigger != null) {
                trigger.execute(this);
            }
        } catch (TuraException e) {
            logger.fine(e.getMessage());
        }
    }

    public CompanyDC getCompany() {
        if (company == null) {
            company = companyproducer.get();
        }
        return company;
    }

    public PopupCompanyDCProviderDC getPopupCompanyDCProvider() {
        if (popupCompanyDCProvider == null) {
            popupCompanyDCProvider = popupCompanyDCProviderproducer.get();
        }
        return popupCompanyDCProvider;
    }

    public TreeRootCountryDC getTreeRootCountry() {
        try {
            CompanyDC master = getCompany();
            return (TreeRootCountryDC) master.getCompany2Country();
        } catch (org.tura.platform.datacontrol.commons.TuraException e) {
            logger.fine(e.getMessage());
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
        } catch (org.tura.platform.datacontrol.commons.TuraException e) {
            logger.fine(e.getMessage());
            return null;
        }
    }

    public EmployeeDC getEmployee() {
        try {
            DepartmentDC master = getDepartment();
            return (EmployeeDC) master.getDepartment2Employee();
        } catch (org.tura.platform.datacontrol.commons.TuraException e) {
            logger.fine(e.getMessage());
            return null;
        }
    }

    public VehicleDC getVehicle() {
        try {
            DepartmentDC master = getDepartment();
            return (VehicleDC) master.getDepartment2Vehicle();
        } catch (org.tura.platform.datacontrol.commons.TuraException e) {
            logger.fine(e.getMessage());
            return null;
        }
    }

    public TreeRootFilesDC getTreeRootFiles() {
        try {
            EmployeeDC master = getEmployee();
            return (TreeRootFilesDC) master.getEmployee2Files();
        } catch (org.tura.platform.datacontrol.commons.TuraException e) {
            logger.fine(e.getMessage());
            return null;
        }
    }
}
