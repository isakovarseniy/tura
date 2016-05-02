package org.elsoft.platform.hr.objects.simple.model;

import org.elsoft.platform.hr.objects.DepartmentsDAO;

import org.tura.platform.object.model.DomainObject;

public class Department extends DomainObject implements DepartmentsDAO {
    private Long departmentId;
    private String departmentName;
    private Long managerId;
    private Long locationId;
    private String description;

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setManagerId(Long managerId) {
        this.managerId = managerId;
    }

    public Long getManagerId() {
        return managerId;
    }

    public void setLocationId(Long locationId) {
        this.locationId = locationId;
    }

    public Long getLocationId() {
        return locationId;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
