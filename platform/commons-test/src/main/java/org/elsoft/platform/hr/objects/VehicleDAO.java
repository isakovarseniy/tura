package org.elsoft.platform.hr.objects;

import org.tura.platform.persistence.TuraObject;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "VehicleDAO")
@Table(name = "VEHICLEDAO")
public class VehicleDAO extends TuraObject implements Serializable {
    private static final long serialVersionUID = -1L;
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
