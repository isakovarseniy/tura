package org.elsoft.platform.hr.objects.simple.model;

import org.elsoft.platform.hr.objects.Department2EntityDAO;

import org.tura.platform.object.model.DomainObject;

public class Dep2Entity extends DomainObject implements Department2EntityDAO {
    private Long departmentRef;
    private Long entityRef;
    private Boolean boolVal;
    private String image;

    public void setDepartmentRef(Long departmentRef) {
        this.departmentRef = departmentRef;
    }

    public Long getDepartmentRef() {
        return departmentRef;
    }

    public void setEntityRef(Long entityRef) {
        this.entityRef = entityRef;
    }

    public Long getEntityRef() {
        return entityRef;
    }

    public void setBoolVal(Boolean boolVal) {
        this.boolVal = boolVal;
    }

    public Boolean getBoolVal() {
        return boolVal;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getImage() {
        return image;
    }
}
