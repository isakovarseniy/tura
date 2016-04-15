package org.elsoft.platform.hr.objects.simple.model;

import org.elsoft.platform.hr.objects.VehicleDAO;

import org.tura.platform.object.model.DomainObject;

public class Vehicle extends DomainObject implements VehicleDAO {
    private String vehicleMaker;
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
