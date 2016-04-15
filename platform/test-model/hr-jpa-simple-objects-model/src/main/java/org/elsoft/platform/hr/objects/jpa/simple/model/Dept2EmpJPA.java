package org.elsoft.platform.hr.objects.jpa.simple.model;

import org.tura.platform.object.persistence.PersistenceObject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "Dept2EmpJPA")
@Table(name = "DEPT2EMPJPA")
public class Dept2EmpJPA extends PersistenceObject {
    @Column(name = "DEPARTMENTREF")
    private Long departmentRef;
    @Column(name = "ENTITYREF")
    private Long entityRef;
    @Column(name = "BOOLVAL")
    private Boolean boolVal;
    @Column(name = "IMAGE")
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
