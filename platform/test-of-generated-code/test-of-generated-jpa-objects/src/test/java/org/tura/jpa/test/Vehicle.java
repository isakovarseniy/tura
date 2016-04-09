package org.tura.jpa.test;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "Vehicle")
@Table(name = "VEHICLE")
public class Vehicle {
    @Id
    @Column(name = "OBJID")
    private Long objId;
    @Column(name = "MODEL")
    private String model;
    @Column(name = "PLATE")
    private String plate;

    public void setObjId(Long objId) {
        this.objId = objId;
    }

    public Long getObjId() {
        return objId;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getPlate() {
        return plate;
    }
}
