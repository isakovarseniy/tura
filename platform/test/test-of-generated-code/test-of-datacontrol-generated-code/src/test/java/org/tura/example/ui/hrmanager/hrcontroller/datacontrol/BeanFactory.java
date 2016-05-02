/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2015, Arseniy Isakov
 *
 * This project includes software developed by Arseniy Isakov
 * http://sourceforge.net/p/tura/wiki/Home/
 *
 * Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.tura.example.ui.hrmanager.hrcontroller.datacontrol;

import org.tura.platform.datacontrol.annotations.Selector;
import org.tura.platform.datacontrol.command.base.FactoryInitializeTrigger;
import org.tura.platform.datacontrol.commons.TuraException;

import java.io.Serializable;

import java.util.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Instance;

import javax.inject.Inject;
import javax.inject.Named;

@Named("beanFactoryHrManagerHRController")
@ApplicationScoped
public class BeanFactory implements IBeanFactory, Serializable {
    private static final long serialVersionUID = 1L;
    private int section;
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
    private Instance<UserDC> userproducer;
    private UserDC user;
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

    public void init() {
        if (section > 0) {
            return;
        }
        section++;
        try {
            FactoryInitializeTrigger trigger = factoryInitializeTrigger.get();
            if (trigger != null) {
                trigger.execute(this);
            }
        } catch (TuraException e) {
            logger.info(e.getMessage());
        }
    }

    public CompanyDC getCompany() {
        init();
        if (company == null) {
            company = companyproducer.get();
        }
        return company;
    }

    public PopupCompanyDCProviderDC getPopupCompanyDCProvider() {
        init();
        if (popupCompanyDCProvider == null) {
            popupCompanyDCProvider = popupCompanyDCProviderproducer.get();
        }
        return popupCompanyDCProvider;
    }

    public UserDC getUser() {
        init();
        if (user == null) {
            user = userproducer.get();
        }
        return user;
    }

    public TreeRootCountryDC getTreeRootCountry()
        throws org.tura.platform.datacontrol.commons.TuraException {
        init();

        try {
            CompanyDC master = getCompany();
            return (TreeRootCountryDC) master.getCompany2Country();
        } catch (org.tura.platform.datacontrol.commons.TuraException e) {
            logger.info(e.getMessage());
            throw e;
        }
    }

    public DepartmentDC getDepartment()
        throws org.tura.platform.datacontrol.commons.TuraException {
        init();

        try {
            if (department == null) {
                getTreeRootCountry().getCurrentObject();
                department = departmentproducer.get();
            }
            return department;
        } catch (org.tura.platform.datacontrol.commons.TuraException e) {
            logger.info(e.getMessage());
            throw e;
        }
    }

    public EmployeeDC getEmployee()
        throws org.tura.platform.datacontrol.commons.TuraException {
        init();

        try {
            DepartmentDC master = getDepartment();
            return (EmployeeDC) master.getDepartment2Employee();
        } catch (org.tura.platform.datacontrol.commons.TuraException e) {
            logger.info(e.getMessage());
            throw e;
        }
    }

    public VehicleDC getVehicle()
        throws org.tura.platform.datacontrol.commons.TuraException {
        init();

        try {
            DepartmentDC master = getDepartment();
            return (VehicleDC) master.getDepartment2Vehicle();
        } catch (org.tura.platform.datacontrol.commons.TuraException e) {
            logger.info(e.getMessage());
            throw e;
        }
    }

    public TreeRootFilesDC getTreeRootFiles()
        throws org.tura.platform.datacontrol.commons.TuraException {
        init();

        try {
            EmployeeDC master = getEmployee();
            return (TreeRootFilesDC) master.getEmployee2Files();
        } catch (org.tura.platform.datacontrol.commons.TuraException e) {
            logger.info(e.getMessage());
            throw e;
        }
    }
}
