package org.elsoft.platform.hr.objects.jpa.simple.model;

import org.tura.platform.object.persistence.PersistenceObject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "DepartmentJPA")
@Table(name = "DEPARTMENTJPA")
public class DepartmentJPA extends PersistenceObject {
    @Column(name = "DEPARTMENTID")
    private Long departmentId;
    @Column(name = "DEPARTMENTNAME")
    private String departmentName;
    @Column(name = "MANAGERID")
    private Long managerId;
    @Column(name = "LOCATIONID")
    private Long locationId;
    @Column(name = "DESCRIPTION")
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
