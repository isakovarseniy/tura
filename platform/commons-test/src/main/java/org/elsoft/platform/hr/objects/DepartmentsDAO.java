package org.elsoft.platform.hr.objects;

import org.tura.platform.persistence.TuraObject;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "DepartmentsDAO")
@Table(name = "DEPARTMENTSDAO")
public class DepartmentsDAO extends TuraObject implements Serializable {
    private static final long serialVersionUID = -1L;
    @Column(name = "DEPARTMENTID")
    private Long departmentId;
    @Column(name = "DEPARTMENTNAME")
    private String departmentName;
    @Column(name = "MANAGERID")
    private Long managerId;
    @Column(name = "LOCATIONID")
    private Long locationId;

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
}
