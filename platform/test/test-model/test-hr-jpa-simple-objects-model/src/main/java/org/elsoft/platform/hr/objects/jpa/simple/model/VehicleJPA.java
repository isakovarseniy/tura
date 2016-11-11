package org.elsoft.platform.hr.objects.jpa.simple.model;

import org.tura.platform.object.persistence.PersistenceObject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "VehicleJPA")
@Table(name = "VEHICLEJPA")
public class VehicleJPA extends PersistenceObject {
    @Column(name = "VEHICLEMAKER")
    private String vehicleMaker;
    @Column(name = "PLATENUMBER")
    private String plateNumber;

    public void setVehicleMaker(String vehicleMaker) {
        this.vehicleMaker = vehicleMaker;
    }

    public String getVehicleMaker() {
        return vehicleMaker;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getPlateNumber() {
        return plateNumber;
    }
}
